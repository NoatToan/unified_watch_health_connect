package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Bluetooth<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Miai.Duration>> delay = Optional.a();

    @Required
    private T entity_type;

    public static class finding implements EntityType {
        public static finding read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new finding();
        }

        public static c4h write(finding findingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class notification implements EntityType {
        private Optional<Slot<Boolean>> disconnect = Optional.a();

        public static notification read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            notification notificationVar = new notification();
            if (zsdVar.z("disconnect")) {
                notificationVar.setDisconnect(IntentUtils.readSlot(zsdVar.w("disconnect"), Boolean.class));
            }
            return notificationVar;
        }

        public static c4h write(notification notificationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (notificationVar.disconnect.c()) {
                c4hVarCreateObjectNode.f0("disconnect", IntentUtils.writeSlot(notificationVar.disconnect.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Boolean>> getDisconnect() {
            return this.disconnect;
        }

        public notification setDisconnect(Slot<Boolean> slot) {
            this.disconnect = Optional.e(slot);
            return this;
        }
    }

    public static class setting implements EntityType {
        public static setting read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new setting();
        }

        public static c4h write(setting settingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class status implements EntityType {
        public static status read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new status();
        }

        public static c4h write(status statusVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Bluetooth() {
    }

    public static Bluetooth read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Bluetooth bluetooth = new Bluetooth(IntentUtils.readEntityType(zsdVar, "Bluetooth", optional));
        if (zsdVar.z("delay")) {
            bluetooth.setDelay(IntentUtils.readSlot(zsdVar.w("delay"), Miai.Duration.class));
        }
        return bluetooth;
    }

    public static zsd write(Bluetooth bluetooth) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(bluetooth.entity_type);
        if (bluetooth.delay.c()) {
            c4hVar.f0("delay", IntentUtils.writeSlot(bluetooth.delay.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.Duration>> getDelay() {
        return this.delay;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Bluetooth setDelay(Slot<Miai.Duration> slot) {
        this.delay = Optional.e(slot);
        return this;
    }

    @Required
    public Bluetooth setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Bluetooth(T t) {
        this.entity_type = t;
    }
}
