package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
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
public class LensSetting<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<LensMode>> mode = Optional.a();

    public enum LensMode {
        Front(1, "Front"),
        Back(2, "Back");

        private int id;
        private String name;

        LensMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static LensMode find(String str) {
            for (LensMode lensMode : values()) {
                if (lensMode.name.equals(str)) {
                    return lensMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static LensMode read(String str) {
            return find(str);
        }

        public static String write(LensMode lensMode) {
            return lensMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static LensSetting read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        LensSetting lensSetting = new LensSetting();
        if (zsdVar.z("mode")) {
            lensSetting.setMode(IntentUtils.readSlot(zsdVar.w("mode"), LensMode.class));
        }
        return lensSetting;
    }

    public static zsd write(LensSetting lensSetting) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (lensSetting.mode.c()) {
            c4hVarCreateObjectNode.f0("mode", IntentUtils.writeSlot(lensSetting.mode.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<LensMode>> getMode() {
        return this.mode;
    }

    public LensSetting setMode(Slot<LensMode> slot) {
        this.mode = Optional.e(slot);
        return this;
    }
}
