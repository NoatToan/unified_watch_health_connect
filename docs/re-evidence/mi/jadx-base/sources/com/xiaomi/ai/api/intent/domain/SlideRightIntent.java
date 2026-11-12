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
public class SlideRightIntent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> page_name = Optional.a();
    private Optional<Slot<String>> relative = Optional.a();
    private Optional<Slot<Integer>> ordinal = Optional.a();

    public static SlideRightIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        SlideRightIntent slideRightIntent = new SlideRightIntent();
        if (zsdVar.z(FaceDetailFragment.PAGE_NAME)) {
            slideRightIntent.setPageName(IntentUtils.readSlot(zsdVar.w(FaceDetailFragment.PAGE_NAME), String.class));
        }
        if (zsdVar.z("relative")) {
            slideRightIntent.setRelative(IntentUtils.readSlot(zsdVar.w("relative"), String.class));
        }
        if (zsdVar.z("ordinal")) {
            slideRightIntent.setOrdinal(IntentUtils.readSlot(zsdVar.w("ordinal"), Integer.class));
        }
        return slideRightIntent;
    }

    public static zsd write(SlideRightIntent slideRightIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (slideRightIntent.page_name.c()) {
            c4hVarCreateObjectNode.f0(FaceDetailFragment.PAGE_NAME, IntentUtils.writeSlot(slideRightIntent.page_name.b()));
        }
        if (slideRightIntent.relative.c()) {
            c4hVarCreateObjectNode.f0("relative", IntentUtils.writeSlot(slideRightIntent.relative.b()));
        }
        if (slideRightIntent.ordinal.c()) {
            c4hVarCreateObjectNode.f0("ordinal", IntentUtils.writeSlot(slideRightIntent.ordinal.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<Integer>> getOrdinal() {
        return this.ordinal;
    }

    public Optional<Slot<String>> getPageName() {
        return this.page_name;
    }

    public Optional<Slot<String>> getRelative() {
        return this.relative;
    }

    public SlideRightIntent setOrdinal(Slot<Integer> slot) {
        this.ordinal = Optional.e(slot);
        return this;
    }

    public SlideRightIntent setPageName(Slot<String> slot) {
        this.page_name = Optional.e(slot);
        return this;
    }

    public SlideRightIntent setRelative(Slot<String> slot) {
        this.relative = Optional.e(slot);
        return this;
    }
}
