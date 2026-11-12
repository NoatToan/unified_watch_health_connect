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
public class NextPageIntent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> page_name = Optional.a();
    private Optional<Slot<Integer>> ordinal = Optional.a();

    public static NextPageIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        NextPageIntent nextPageIntent = new NextPageIntent();
        if (zsdVar.z(FaceDetailFragment.PAGE_NAME)) {
            nextPageIntent.setPageName(IntentUtils.readSlot(zsdVar.w(FaceDetailFragment.PAGE_NAME), String.class));
        }
        if (zsdVar.z("ordinal")) {
            nextPageIntent.setOrdinal(IntentUtils.readSlot(zsdVar.w("ordinal"), Integer.class));
        }
        return nextPageIntent;
    }

    public static zsd write(NextPageIntent nextPageIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (nextPageIntent.page_name.c()) {
            c4hVarCreateObjectNode.f0(FaceDetailFragment.PAGE_NAME, IntentUtils.writeSlot(nextPageIntent.page_name.b()));
        }
        if (nextPageIntent.ordinal.c()) {
            c4hVarCreateObjectNode.f0("ordinal", IntentUtils.writeSlot(nextPageIntent.ordinal.b()));
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

    public NextPageIntent setOrdinal(Slot<Integer> slot) {
        this.ordinal = Optional.e(slot);
        return this;
    }

    public NextPageIntent setPageName(Slot<String> slot) {
        this.page_name = Optional.e(slot);
        return this;
    }
}
