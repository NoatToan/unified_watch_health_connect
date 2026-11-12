package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
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
public class CastInfo<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> cast;

    @Required
    private Slot<Miai.MovieName> title;
    private Optional<Slot<Knowledge.Individual>> videos = Optional.a();
    private Optional<Slot<Miai.Artist>> character = Optional.a();
    private Optional<Slot<Knowledge.SemanticInfo>> semantic_info = Optional.a();

    public CastInfo() {
    }

    public static CastInfo read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        CastInfo castInfo = new CastInfo();
        castInfo.setTitle(IntentUtils.readSlot(zsdVar.w("title"), Miai.MovieName.class));
        castInfo.setCast(IntentUtils.readSlot(zsdVar.w("cast"), String.class));
        if (zsdVar.z("videos")) {
            castInfo.setVideos(IntentUtils.readSlot(zsdVar.w("videos"), Knowledge.Individual.class));
        }
        if (zsdVar.z("character")) {
            castInfo.setCharacter(IntentUtils.readSlot(zsdVar.w("character"), Miai.Artist.class));
        }
        if (zsdVar.z("semantic_info")) {
            castInfo.setSemanticInfo(IntentUtils.readSlot(zsdVar.w("semantic_info"), Knowledge.SemanticInfo.class));
        }
        return castInfo;
    }

    public static zsd write(CastInfo castInfo) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("title", IntentUtils.writeSlot(castInfo.title));
        c4hVarCreateObjectNode.f0("cast", IntentUtils.writeSlot(castInfo.cast));
        if (castInfo.videos.c()) {
            c4hVarCreateObjectNode.f0("videos", IntentUtils.writeSlot(castInfo.videos.b()));
        }
        if (castInfo.character.c()) {
            c4hVarCreateObjectNode.f0("character", IntentUtils.writeSlot(castInfo.character.b()));
        }
        if (castInfo.semantic_info.c()) {
            c4hVarCreateObjectNode.f0("semantic_info", IntentUtils.writeSlot(castInfo.semantic_info.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    @Required
    public Slot<String> getCast() {
        return this.cast;
    }

    public Optional<Slot<Miai.Artist>> getCharacter() {
        return this.character;
    }

    public Optional<Slot<Knowledge.SemanticInfo>> getSemanticInfo() {
        return this.semantic_info;
    }

    @Required
    public Slot<Miai.MovieName> getTitle() {
        return this.title;
    }

    public Optional<Slot<Knowledge.Individual>> getVideos() {
        return this.videos;
    }

    @Required
    public CastInfo setCast(Slot<String> slot) {
        this.cast = slot;
        return this;
    }

    public CastInfo setCharacter(Slot<Miai.Artist> slot) {
        this.character = Optional.e(slot);
        return this;
    }

    public CastInfo setSemanticInfo(Slot<Knowledge.SemanticInfo> slot) {
        this.semantic_info = Optional.e(slot);
        return this;
    }

    @Required
    public CastInfo setTitle(Slot<Miai.MovieName> slot) {
        this.title = slot;
        return this;
    }

    public CastInfo setVideos(Slot<Knowledge.Individual> slot) {
        this.videos = Optional.e(slot);
        return this;
    }

    public CastInfo(Slot<Miai.MovieName> slot, Slot<String> slot2) {
        this.title = slot;
        this.cast = slot2;
    }
}
