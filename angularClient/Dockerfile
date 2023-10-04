# base image
FROM node:18.18.0

# set working directory
WORKDIR /usr/src/app

# add `/usr/src/app/node_modules/.bin` to $PATH
ENV PATH /usr/src/app/node_modules/.bin:$PATH

# install and cache app dependencies
COPY package.json /usr/src/app/package.json
RUN npm install -g npm@latest


# add app
COPY . /usr/src/app

EXPOSE 4200

# start app
CMD ng serve --host 0.0.0.0 --port 4200
