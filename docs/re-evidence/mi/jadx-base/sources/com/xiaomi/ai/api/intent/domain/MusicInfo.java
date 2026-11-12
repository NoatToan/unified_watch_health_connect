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
public class MusicInfo<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class album implements EntityType {
        public static album read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new album();
        }

        public static c4h write(album albumVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class artist implements EntityType {
        public static artist read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new artist();
        }

        public static c4h write(artist artistVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class composer implements EntityType {
        public static composer read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new composer();
        }

        public static c4h write(composer composerVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class lyric implements EntityType {

        @Required
        private Slot<Miai.Song> song;

        public lyric() {
        }

        public lyric(Slot<Miai.Song> slot) {
            this.song = slot;
        }

        public static lyric read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            lyric lyricVar = new lyric();
            lyricVar.setSong(IntentUtils.readSlot(zsdVar.w("song"), Miai.Song.class));
            return lyricVar;
        }

        public static c4h write(lyric lyricVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("song", IntentUtils.writeSlot(lyricVar.song));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Song> getSong() {
            return this.song;
        }

        @Required
        public lyric setSong(Slot<Miai.Song> slot) {
            this.song = slot;
            return this;
        }
    }

    public static class lyricist implements EntityType {
        public static lyricist read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new lyricist();
        }

        public static c4h write(lyricist lyricistVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class song implements EntityType {

        @Required
        private Slot<Miai.Song> name;

        public song() {
        }

        public song(Slot<Miai.Song> slot) {
            this.name = slot;
        }

        public static song read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            song songVar = new song();
            songVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.Song.class));
            return songVar;
        }

        public static c4h write(song songVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(songVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Song> getName() {
            return this.name;
        }

        @Required
        public song setName(Slot<Miai.Song> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class songwriter implements EntityType {
        public static songwriter read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new songwriter();
        }

        public static c4h write(songwriter songwriterVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public MusicInfo() {
    }

    public static MusicInfo read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new MusicInfo(IntentUtils.readEntityType(zsdVar, AIApiConstants.MusicInfo.NAME, optional));
    }

    public static zsd write(MusicInfo musicInfo) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(musicInfo.entity_type);
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public MusicInfo setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public MusicInfo(T t) {
        this.entity_type = t;
    }
}
