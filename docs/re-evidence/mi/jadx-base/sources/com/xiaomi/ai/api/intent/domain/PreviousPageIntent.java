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
public class PreviousPageIntent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> page_name = Optional.a();
    private Optional<Slot<Integer>> ordinal = Optional.a();

    public static PreviousPageIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PreviousPageIntent previousPageIntent = new PreviousPageIntent();
        if (zsdVar.z(FaceDetailFragment.PAGE_NAME)) {
            previousPageIntent.setPageName(IntentUtils.readSlot(zsdVar.w(FaceDetailFragment.PAGE_NAME), String.class));
        }
        if (zsdVar.z("ordinal")) {
            previousPageIntent.setOrdinal(IntentUtils.readSlot(zsdVar.w("ordinal"), Integer.class));
        }
        return previousPageIntent;
    }

    public static zsd write(PreviousPageIntent previousPageIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (previousPageIntent.page_name.c()) {
            c4hVarCreateObjectNode.f0(FaceDetailFragment.PAGE_NAME, IntentUtils.writeSlot(previousPageIntent.page_name.b()));
        }
        if (previousPageIntent.ordinal.c()) {
            c4hVarCreateObjectNode.f0("ordinal", IntentUtils.writeSlot(previousPageIntent.ordinal.b()));
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

    public PreviousPageIntent setOrdinal(Slot<Integer> slot) {
        this.ordinal = Optional.e(slot);
        return this;
    }

    public PreviousPageIntent setPageName(Slot<String> slot) {
        this.page_name = Optional.e(slot);
        return this;
    }
}
