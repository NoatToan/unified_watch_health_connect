package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class SlideDownIntent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> page_name = Optional.a();
    private Optional<Slot<String>> relative = Optional.a();
    private Optional<Slot<String>> target = Optional.a();
    private Optional<Slot<String>> app = Optional.a();

    public static SlideDownIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        SlideDownIntent slideDownIntent = new SlideDownIntent();
        if (zsdVar.z(FaceDetailFragment.PAGE_NAME)) {
            slideDownIntent.setPageName(IntentUtils.readSlot(zsdVar.w(FaceDetailFragment.PAGE_NAME), String.class));
        }
        if (zsdVar.z("relative")) {
            slideDownIntent.setRelative(IntentUtils.readSlot(zsdVar.w("relative"), String.class));
        }
        if (zsdVar.z("target")) {
            slideDownIntent.setTarget(IntentUtils.readSlot(zsdVar.w("target"), String.class));
        }
        if (zsdVar.z("app")) {
            slideDownIntent.setApp(IntentUtils.readSlot(zsdVar.w("app"), String.class));
        }
        return slideDownIntent;
    }

    public static zsd write(SlideDownIntent slideDownIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (slideDownIntent.page_name.c()) {
            c4hVarCreateObjectNode.f0(FaceDetailFragment.PAGE_NAME, IntentUtils.writeSlot(slideDownIntent.page_name.b()));
        }
        if (slideDownIntent.relative.c()) {
            c4hVarCreateObjectNode.f0("relative", IntentUtils.writeSlot(slideDownIntent.relative.b()));
        }
        if (slideDownIntent.target.c()) {
            c4hVarCreateObjectNode.f0("target", IntentUtils.writeSlot(slideDownIntent.target.b()));
        }
        if (slideDownIntent.app.c()) {
            c4hVarCreateObjectNode.f0("app", IntentUtils.writeSlot(slideDownIntent.app.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getApp() {
        return this.app;
    }

    public Optional<Slot<String>> getPageName() {
        return this.page_name;
    }

    public Optional<Slot<String>> getRelative() {
        return this.relative;
    }

    public Optional<Slot<String>> getTarget() {
        return this.target;
    }

    public SlideDownIntent setApp(Slot<String> slot) {
        this.app = Optional.e(slot);
        return this;
    }

    public SlideDownIntent setPageName(Slot<String> slot) {
        this.page_name = Optional.e(slot);
        return this;
    }

    public SlideDownIntent setRelative(Slot<String> slot) {
        this.relative = Optional.e(slot);
        return this;
    }

    public SlideDownIntent setTarget(Slot<String> slot) {
        this.target = Optional.e(slot);
        return this;
    }
}
