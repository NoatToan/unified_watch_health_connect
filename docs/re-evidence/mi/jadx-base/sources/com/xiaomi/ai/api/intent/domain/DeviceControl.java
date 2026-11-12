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
public class DeviceControl<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class mistakeWakeUp implements EntityType {
        public static mistakeWakeUp read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new mistakeWakeUp();
        }

        public static c4h write(mistakeWakeUp mistakewakeup) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class notSupported implements EntityType {

        @Required
        private Slot<String> name;

        public notSupported() {
        }

        public notSupported(Slot<String> slot) {
            this.name = slot;
        }

        public static notSupported read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            notSupported notsupported = new notSupported();
            notsupported.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return notsupported;
        }

        public static c4h write(notSupported notsupported) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(notsupported.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public notSupported setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class pureNumber implements EntityType {
        public static pureNumber read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new pureNumber();
        }

        public static c4h write(pureNumber purenumber) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public DeviceControl() {
    }

    public static DeviceControl read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new DeviceControl(IntentUtils.readEntityType(zsdVar, AIApiConstants.DeviceControl.NAME, optional));
    }

    public static zsd write(DeviceControl deviceControl) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(deviceControl.entity_type);
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public DeviceControl setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public DeviceControl(T t) {
        this.entity_type = t;
    }
}
