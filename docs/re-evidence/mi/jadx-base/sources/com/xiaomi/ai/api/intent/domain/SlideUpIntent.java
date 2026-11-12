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
public class SlideUpIntent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> page_name = Optional.a();
    private Optional<Slot<String>> relative = Optional.a();
    private Optional<Slot<String>> target = Optional.a();
    private Optional<Slot<String>> app = Optional.a();

    public static SlideUpIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        SlideUpIntent slideUpIntent = new SlideUpIntent();
        if (zsdVar.z(FaceDetailFragment.PAGE_NAME)) {
            slideUpIntent.setPageName(IntentUtils.readSlot(zsdVar.w(FaceDetailFragment.PAGE_NAME), String.class));
        }
        if (zsdVar.z("relative")) {
            slideUpIntent.setRelative(IntentUtils.readSlot(zsdVar.w("relative"), String.class));
        }
        if (zsdVar.z("target")) {
            slideUpIntent.setTarget(IntentUtils.readSlot(zsdVar.w("target"), String.class));
        }
        if (zsdVar.z("app")) {
            slideUpIntent.setApp(IntentUtils.readSlot(zsdVar.w("app"), String.class));
        }
        return slideUpIntent;
    }

    public static zsd write(SlideUpIntent slideUpIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (slideUpIntent.page_name.c()) {
            c4hVarCreateObjectNode.f0(FaceDetailFragment.PAGE_NAME, IntentUtils.writeSlot(slideUpIntent.page_name.b()));
        }
        if (slideUpIntent.relative.c()) {
            c4hVarCreateObjectNode.f0("relative", IntentUtils.writeSlot(slideUpIntent.relative.b()));
        }
        if (slideUpIntent.target.c()) {
            c4hVarCreateObjectNode.f0("target", IntentUtils.writeSlot(slideUpIntent.target.b()));
        }
        if (slideUpIntent.app.c()) {
            c4hVarCreateObjectNode.f0("app", IntentUtils.writeSlot(slideUpIntent.app.b()));
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

    public SlideUpIntent setApp(Slot<String> slot) {
        this.app = Optional.e(slot);
        return this;
    }

    public SlideUpIntent setPageName(Slot<String> slot) {
        this.page_name = Optional.e(slot);
        return this;
    }

    public SlideUpIntent setRelative(Slot<String> slot) {
        this.relative = Optional.e(slot);
        return this;
    }

    public SlideUpIntent setTarget(Slot<String> slot) {
        this.target = Optional.e(slot);
        return this;
    }
}
