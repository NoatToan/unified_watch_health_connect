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
public class MusicPlaylist<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<MusicPlayer>> media_player = Optional.a();
    private Optional<Slot<Boolean>> self_build = Optional.a();

    public static class collect implements EntityType {
        public static collect read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new collect();
        }

        public static c4h write(collect collectVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public MusicPlaylist() {
    }

    public static MusicPlaylist read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        MusicPlaylist musicPlaylist = new MusicPlaylist(IntentUtils.readEntityType(zsdVar, AIApiConstants.MusicPlaylist.NAME, optional));
        if (zsdVar.z("name")) {
            musicPlaylist.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("media_player")) {
            musicPlaylist.setMediaPlayer(IntentUtils.readSlot(zsdVar.w("media_player"), MusicPlayer.class));
        }
        if (zsdVar.z("self_build")) {
            musicPlaylist.setSelfBuild(IntentUtils.readSlot(zsdVar.w("self_build"), Boolean.class));
        }
        return musicPlaylist;
    }

    public static zsd write(MusicPlaylist musicPlaylist) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(musicPlaylist.entity_type);
        if (musicPlaylist.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(musicPlaylist.name.b()));
        }
        if (musicPlaylist.media_player.c()) {
            c4hVar.f0("media_player", IntentUtils.writeSlot(musicPlaylist.media_player.b()));
        }
        if (musicPlaylist.self_build.c()) {
            c4hVar.f0("self_build", IntentUtils.writeSlot(musicPlaylist.self_build.b()));
        }
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

    public Optional<Slot<MusicPlayer>> getMediaPlayer() {
        return this.media_player;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<Boolean>> getSelfBuild() {
        return this.self_build;
    }

    @Required
    public MusicPlaylist setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public MusicPlaylist setMediaPlayer(Slot<MusicPlayer> slot) {
        this.media_player = Optional.e(slot);
        return this;
    }

    public MusicPlaylist setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public MusicPlaylist setSelfBuild(Slot<Boolean> slot) {
        this.self_build = Optional.e(slot);
        return this;
    }

    public MusicPlaylist(T t) {
        this.entity_type = t;
    }
}
