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
public class TimeMode<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Mode>> name = Optional.a();

    public enum Mode {
        _24hour(1, "24-hour"),
        _12hour(2, "12-hour");

        private int id;
        private String name;

        Mode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static Mode find(String str) {
            for (Mode mode : values()) {
                if (mode.name.equals(str)) {
                    return mode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static Mode read(String str) {
            return find(str);
        }

        public static String write(Mode mode) {
            return mode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static TimeMode read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        TimeMode timeMode = new TimeMode();
        if (zsdVar.z("name")) {
            timeMode.setName(IntentUtils.readSlot(zsdVar.w("name"), Mode.class));
        }
        return timeMode;
    }

    public static zsd write(TimeMode timeMode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (timeMode.name.c()) {
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(timeMode.name.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<Mode>> getName() {
        return this.name;
    }

    public TimeMode setName(Slot<Mode> slot) {
        this.name = Optional.e(slot);
        return this;
    }
}
