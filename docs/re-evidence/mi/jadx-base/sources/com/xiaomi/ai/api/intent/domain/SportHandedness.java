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
public class SportHandedness<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Handedness>> handedness = Optional.a();

    public enum Handedness {
        Left(1, "Left"),
        Right(2, "Right");

        private int id;
        private String name;

        Handedness(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static Handedness find(String str) {
            for (Handedness handedness : values()) {
                if (handedness.name.equals(str)) {
                    return handedness;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static Handedness read(String str) {
            return find(str);
        }

        public static String write(Handedness handedness) {
            return handedness.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static SportHandedness read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        SportHandedness sportHandedness = new SportHandedness();
        if (zsdVar.z("handedness")) {
            sportHandedness.setHandedness(IntentUtils.readSlot(zsdVar.w("handedness"), Handedness.class));
        }
        return sportHandedness;
    }

    public static zsd write(SportHandedness sportHandedness) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (sportHandedness.handedness.c()) {
            c4hVarCreateObjectNode.f0("handedness", IntentUtils.writeSlot(sportHandedness.handedness.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<Handedness>> getHandedness() {
        return this.handedness;
    }

    public SportHandedness setHandedness(Slot<Handedness> slot) {
        this.handedness = Optional.e(slot);
        return this;
    }
}
