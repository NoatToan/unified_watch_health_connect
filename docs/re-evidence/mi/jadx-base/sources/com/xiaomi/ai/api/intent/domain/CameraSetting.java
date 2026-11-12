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
public class CameraSetting<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<CameraMode>> mode = Optional.a();

    public enum CameraMode {
        Beauty(1, "Beauty"),
        FrontBeauty(2, "FrontBeauty"),
        BackBeauty(3, "BackBeauty"),
        Back(4, "Back"),
        Front(5, "Front");

        private int id;
        private String name;

        CameraMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static CameraMode find(String str) {
            for (CameraMode cameraMode : values()) {
                if (cameraMode.name.equals(str)) {
                    return cameraMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static CameraMode read(String str) {
            return find(str);
        }

        public static String write(CameraMode cameraMode) {
            return cameraMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class focus implements EntityType {
        public static focus read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new focus();
        }

        public static c4h write(focus focusVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public CameraSetting() {
    }

    public static CameraSetting read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        CameraSetting cameraSetting = new CameraSetting(IntentUtils.readEntityType(zsdVar, AIApiConstants.CameraSetting.NAME, optional));
        if (zsdVar.z("mode")) {
            cameraSetting.setMode(IntentUtils.readSlot(zsdVar.w("mode"), CameraMode.class));
        }
        return cameraSetting;
    }

    public static zsd write(CameraSetting cameraSetting) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(cameraSetting.entity_type);
        if (cameraSetting.mode.c()) {
            c4hVar.f0("mode", IntentUtils.writeSlot(cameraSetting.mode.b()));
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

    public Optional<Slot<CameraMode>> getMode() {
        return this.mode;
    }

    @Required
    public CameraSetting setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public CameraSetting setMode(Slot<CameraMode> slot) {
        this.mode = Optional.e(slot);
        return this;
    }

    public CameraSetting(T t) {
        this.entity_type = t;
    }
}
