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
public class VideoGame<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> name = Optional.a();

    public static class category implements EntityType {

        @Required
        private Slot<String> name;

        public category() {
        }

        public category(Slot<String> slot) {
            this.name = slot;
        }

        public static category read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            category categoryVar = new category();
            categoryVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return categoryVar;
        }

        public static c4h write(category categoryVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(categoryVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public category setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class strategy implements EntityType {
        public static strategy read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new strategy();
        }

        public static c4h write(strategy strategyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public VideoGame() {
    }

    public static VideoGame read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        VideoGame videoGame = new VideoGame(IntentUtils.readEntityType(zsdVar, AIApiConstants.VideoGame.NAME, optional));
        if (zsdVar.z("name")) {
            videoGame.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        return videoGame;
    }

    public static zsd write(VideoGame videoGame) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(videoGame.entity_type);
        if (videoGame.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(videoGame.name.b()));
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

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    @Required
    public VideoGame setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public VideoGame setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public VideoGame(T t) {
        this.entity_type = t;
    }
}
