package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
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
public class ScreenShot<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Boolean>> full_screen = Optional.a();
    private Optional<Slot<String>> app_name = Optional.a();
    private Optional<Slot<String>> package_name = Optional.a();

    public static ScreenShot read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        ScreenShot screenShot = new ScreenShot();
        if (zsdVar.z("full_screen")) {
            screenShot.setFullScreen(IntentUtils.readSlot(zsdVar.w("full_screen"), Boolean.class));
        }
        if (zsdVar.z(FeedbackConstants.KEY_APP_NAME)) {
            screenShot.setAppName(IntentUtils.readSlot(zsdVar.w(FeedbackConstants.KEY_APP_NAME), String.class));
        }
        if (zsdVar.z("package_name")) {
            screenShot.setPackageName(IntentUtils.readSlot(zsdVar.w("package_name"), String.class));
        }
        return screenShot;
    }

    public static zsd write(ScreenShot screenShot) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (screenShot.full_screen.c()) {
            c4hVarCreateObjectNode.f0("full_screen", IntentUtils.writeSlot(screenShot.full_screen.b()));
        }
        if (screenShot.app_name.c()) {
            c4hVarCreateObjectNode.f0(FeedbackConstants.KEY_APP_NAME, IntentUtils.writeSlot(screenShot.app_name.b()));
        }
        if (screenShot.package_name.c()) {
            c4hVarCreateObjectNode.f0("package_name", IntentUtils.writeSlot(screenShot.package_name.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getAppName() {
        return this.app_name;
    }

    public Optional<Slot<Boolean>> getFullScreen() {
        return this.full_screen;
    }

    public Optional<Slot<String>> getPackageName() {
        return this.package_name;
    }

    public ScreenShot setAppName(Slot<String> slot) {
        this.app_name = Optional.e(slot);
        return this;
    }

    public ScreenShot setFullScreen(Slot<Boolean> slot) {
        this.full_screen = Optional.e(slot);
        return this;
    }

    public ScreenShot setPackageName(Slot<String> slot) {
        this.package_name = Optional.e(slot);
        return this;
    }
}
