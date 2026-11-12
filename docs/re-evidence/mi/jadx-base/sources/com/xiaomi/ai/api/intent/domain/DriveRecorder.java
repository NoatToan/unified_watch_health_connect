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
public class DriveRecorder<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class directive implements EntityType {

        @Required
        private Slot<Vehicle.DRDirective> name;

        public directive() {
        }

        public directive(Slot<Vehicle.DRDirective> slot) {
            this.name = slot;
        }

        public static directive read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            directive directiveVar = new directive();
            directiveVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Vehicle.DRDirective.class));
            return directiveVar;
        }

        public static c4h write(directive directiveVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(directiveVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Vehicle.DRDirective> getName() {
            return this.name;
        }

        @Required
        public directive setName(Slot<Vehicle.DRDirective> slot) {
            this.name = slot;
            return this;
        }
    }

    public DriveRecorder() {
    }

    public static DriveRecorder read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new DriveRecorder(IntentUtils.readEntityType(zsdVar, AIApiConstants.DriveRecorder.NAME, optional));
    }

    public static zsd write(DriveRecorder driveRecorder) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(driveRecorder.entity_type);
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
    public DriveRecorder setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public DriveRecorder(T t) {
        this.entity_type = t;
    }
}
