package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class QQMusic<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> package_name;

    public static class openRecentMusic implements EntityType {
        public static openRecentMusic read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new openRecentMusic();
        }

        public static c4h write(openRecentMusic openrecentmusic) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class page implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static page read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            page pageVar = new page();
            if (zsdVar.z("name")) {
                pageVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return pageVar;
        }

        public static c4h write(page pageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (pageVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(pageVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public page setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class playCollection implements EntityType {
        public static playCollection read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new playCollection();
        }

        public static c4h write(playCollection playcollection) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class playLocalMusic implements EntityType {
        public static playLocalMusic read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new playLocalMusic();
        }

        public static c4h write(playLocalMusic playlocalmusic) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class playMode implements EntityType {
        private Optional<Slot<PlaybackMode.PlayMode>> mode = Optional.a();

        public static playMode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            playMode playmode = new playMode();
            if (zsdVar.z("mode")) {
                playmode.setMode(IntentUtils.readSlot(zsdVar.w("mode"), PlaybackMode.PlayMode.class));
            }
            return playmode;
        }

        public static c4h write(playMode playmode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (playmode.mode.c()) {
                c4hVarCreateObjectNode.f0("mode", IntentUtils.writeSlot(playmode.mode.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<PlaybackMode.PlayMode>> getMode() {
            return this.mode;
        }

        public playMode setMode(Slot<PlaybackMode.PlayMode> slot) {
            this.mode = Optional.e(slot);
            return this;
        }
    }

    public static class playSpecificMusic implements EntityType {
        private Optional<Slot<String>> song_name = Optional.a();

        public static playSpecificMusic read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            playSpecificMusic playspecificmusic = new playSpecificMusic();
            if (zsdVar.z("song_name")) {
                playspecificmusic.setSongName(IntentUtils.readSlot(zsdVar.w("song_name"), String.class));
            }
            return playspecificmusic;
        }

        public static c4h write(playSpecificMusic playspecificmusic) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (playspecificmusic.song_name.c()) {
                c4hVarCreateObjectNode.f0("song_name", IntentUtils.writeSlot(playspecificmusic.song_name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getSongName() {
            return this.song_name;
        }

        public playSpecificMusic setSongName(Slot<String> slot) {
            this.song_name = Optional.e(slot);
            return this;
        }
    }

    public static class radio implements EntityType {
        public static radio read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new radio();
        }

        public static c4h write(radio radioVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class searchMusic implements EntityType {
        private Optional<Slot<String>> song_name = Optional.a();

        public static searchMusic read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            searchMusic searchmusic = new searchMusic();
            if (zsdVar.z("song_name")) {
                searchmusic.setSongName(IntentUtils.readSlot(zsdVar.w("song_name"), String.class));
            }
            return searchmusic;
        }

        public static c4h write(searchMusic searchmusic) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (searchmusic.song_name.c()) {
                c4hVarCreateObjectNode.f0("song_name", IntentUtils.writeSlot(searchmusic.song_name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getSongName() {
            return this.song_name;
        }

        public searchMusic setSongName(Slot<String> slot) {
            this.song_name = Optional.e(slot);
            return this;
        }
    }

    public QQMusic() {
    }

    public static QQMusic read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        QQMusic qQMusic = new QQMusic(IntentUtils.readEntityType(zsdVar, AIApiConstants.QQMusic.NAME, optional));
        qQMusic.setPackageName(IntentUtils.readSlot(zsdVar.w("package_name"), String.class));
        return qQMusic;
    }

    public static zsd write(QQMusic qQMusic) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(qQMusic.entity_type);
        c4hVar.f0("package_name", IntentUtils.writeSlot(qQMusic.package_name));
        return c4hVar;
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
    public Slot<String> getPackageName() {
        return this.package_name;
    }

    @Required
    public QQMusic setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public QQMusic setPackageName(Slot<String> slot) {
        this.package_name = slot;
        return this;
    }

    public QQMusic(T t) {
        this.entity_type = t;
    }

    public QQMusic(T t, Slot<String> slot) {
        this.entity_type = t;
        this.package_name = slot;
    }
}
