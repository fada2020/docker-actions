. ./000_SET_ENV

docker run -d --name ${DOCKER_DB} \
    --network ${APP_NETWORK} \
    -e MARIADB_DATABASE=${MARIADB_DATABASE} \
    -e MARIADB_USER=${MARIADB_USER} \
    -e MARIADB_PASSWORD=${MARIADB_PASSWORD} \
    -e MARIADB_ROOT_PASSWORD=${MARIADB_ROOT_PASSWORD} \
    -v ${LOCAL_DB_PATH}:/var/lib/mariadb \
    mariadb

echo "===================="
echo "db schema script"
echo "docker exec -it " ${DOCKER_DB} " bash"
echo "grant all privileges on "${MARIADB_DATABASE}.* to" 'fada2020'@'%';"
echo "grant all privileges on "${MARIADB_DATABASE}.* to" 'fada2020'@'localhost';"
echo "flush privileges;"
echo "===================="

