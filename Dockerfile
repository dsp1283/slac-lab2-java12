FROM openjdk:12-alpine

WORKDIR /app

COPY Sample12.java .

RUN javac --release 12 --enable-preview ./Sample12.java

CMD java --enable-preview Sample12
