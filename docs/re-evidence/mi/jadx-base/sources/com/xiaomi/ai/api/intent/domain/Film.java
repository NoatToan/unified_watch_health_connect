package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Film<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<Miai.Artist>> artist = Optional.a();
    private Optional<Slot<Miai.Datetime>> playtime = Optional.a();

    public static class boxOffice implements EntityType {
        public static boxOffice read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new boxOffice();
        }

        public static c4h write(boxOffice boxoffice) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class duration implements EntityType {
        public static duration read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new duration();
        }

        public static c4h write(duration durationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class onShow implements EntityType {
        public static onShow read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new onShow();
        }

        public static c4h write(onShow onshow) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class rating implements EntityType {
        public static rating read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new rating();
        }

        public static c4h write(rating ratingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class review implements EntityType {
        public static review read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new review();
        }

        public static c4h write(review reviewVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class showtime implements EntityType {
        public static showtime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new showtime();
        }

        public static c4h write(showtime showtimeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class upcoming implements EntityType {
        public static upcoming read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new upcoming();
        }

        public static c4h write(upcoming upcomingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Film() {
    }

    public static Film read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Film film = new Film(IntentUtils.readEntityType(zsdVar, AIApiConstants.Film.NAME, optional));
        if (zsdVar.z("name")) {
            film.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("artist")) {
            film.setArtist(IntentUtils.readSlot(zsdVar.w("artist"), Miai.Artist.class));
        }
        if (zsdVar.z("playtime")) {
            film.setPlaytime(IntentUtils.readSlot(zsdVar.w("playtime"), Miai.Datetime.class));
        }
        return film;
    }

    public static zsd write(Film film) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(film.entity_type);
        if (film.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(film.name.b()));
        }
        if (film.artist.c()) {
            c4hVar.f0("artist", IntentUtils.writeSlot(film.artist.b()));
        }
        if (film.playtime.c()) {
            c4hVar.f0("playtime", IntentUtils.writeSlot(film.playtime.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.Artist>> getArtist() {
        return this.artist;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<Miai.Datetime>> getPlaytime() {
        return this.playtime;
    }

    public Film setArtist(Slot<Miai.Artist> slot) {
        this.artist = Optional.e(slot);
        return this;
    }

    @Required
    public Film setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Film setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public Film setPlaytime(Slot<Miai.Datetime> slot) {
        this.playtime = Optional.e(slot);
        return this;
    }

    public Film(T t) {
        this.entity_type = t;
    }
}
