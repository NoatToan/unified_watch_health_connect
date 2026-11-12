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
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class PlaybackSource<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> app_name = Optional.a();
    private Optional<Slot<String>> package_name = Optional.a();

    public static class music implements EntityType {
        public static music read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new music();
        }

        public static c4h write(music musicVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public PlaybackSource() {
    }

    public static PlaybackSource read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PlaybackSource playbackSource = new PlaybackSource(IntentUtils.readEntityType(zsdVar, AIApiConstants.PlaybackSource.NAME, optional));
        if (zsdVar.z(FeedbackConstants.KEY_APP_NAME)) {
            playbackSource.setAppName(IntentUtils.readSlot(zsdVar.w(FeedbackConstants.KEY_APP_NAME), String.class));
        }
        if (zsdVar.z("package_name")) {
            playbackSource.setPackageName(IntentUtils.readSlot(zsdVar.w("package_name"), String.class));
        }
        return playbackSource;
    }

    public static zsd write(PlaybackSource playbackSource) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(playbackSource.entity_type);
        if (playbackSource.app_name.c()) {
            c4hVar.f0(FeedbackConstants.KEY_APP_NAME, IntentUtils.writeSlot(playbackSource.app_name.b()));
        }
        if (playbackSource.package_name.c()) {
            c4hVar.f0("package_name", IntentUtils.writeSlot(playbackSource.package_name.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getAppName() {
        return this.app_name;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getPackageName() {
        return this.package_name;
    }

    public PlaybackSource setAppName(Slot<String> slot) {
        this.app_name = Optional.e(slot);
        return this;
    }

    @Required
    public PlaybackSource setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public PlaybackSource setPackageName(Slot<String> slot) {
        this.package_name = Optional.e(slot);
        return this;
    }

    public PlaybackSource(T t) {
        this.entity_type = t;
    }
}
