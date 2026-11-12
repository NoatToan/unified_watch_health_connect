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
public class LocateIntent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<LocateType>> locate_type = Optional.a();

    public enum LocateType {
        Here(1, "Here"),
        Origin(2, "Origin"),
        Destination(3, "Destination");

        private int id;
        private String name;

        LocateType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static LocateType find(String str) {
            for (LocateType locateType : values()) {
                if (locateType.name.equals(str)) {
                    return locateType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static LocateType read(String str) {
            return find(str);
        }

        public static String write(LocateType locateType) {
            return locateType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static LocateIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        LocateIntent locateIntent = new LocateIntent();
        if (zsdVar.z("locate_type")) {
            locateIntent.setLocateType(IntentUtils.readSlot(zsdVar.w("locate_type"), LocateType.class));
        }
        return locateIntent;
    }

    public static zsd write(LocateIntent locateIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (locateIntent.locate_type.c()) {
            c4hVarCreateObjectNode.f0("locate_type", IntentUtils.writeSlot(locateIntent.locate_type.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<LocateType>> getLocateType() {
        return this.locate_type;
    }

    public LocateIntent setLocateType(Slot<LocateType> slot) {
        this.locate_type = Optional.e(slot);
        return this;
    }
}
