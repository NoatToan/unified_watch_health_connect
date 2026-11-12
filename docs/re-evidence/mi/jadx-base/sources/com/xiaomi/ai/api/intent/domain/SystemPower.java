package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
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
public class SystemPower<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
    private Optional<Slot<Miai.Duration>> duration = Optional.a();

    @Required
    private T entity_type;

    public static class batterySaver implements EntityType {
        public static batterySaver read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new batterySaver();
        }

        public static c4h write(batterySaver batterysaver) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class boot implements EntityType {
        public static boot read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new boot();
        }

        public static c4h write(boot bootVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class left implements EntityType {
        public static left read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new left();
        }

        public static c4h write(left leftVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class reboot implements EntityType {

        @Required
        private Slot<Miai.Datetime> datetime;

        public reboot() {
        }

        public reboot(Slot<Miai.Datetime> slot) {
            this.datetime = slot;
        }

        public static reboot read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            reboot rebootVar = new reboot();
            rebootVar.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            return rebootVar;
        }

        public static c4h write(reboot rebootVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(rebootVar.datetime));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Datetime> getDatetime() {
            return this.datetime;
        }

        @Required
        public reboot setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = slot;
            return this;
        }
    }

    public static class rebootNow implements EntityType {
        public static rebootNow read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new rebootNow();
        }

        public static c4h write(rebootNow rebootnow) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class shutdown implements EntityType {
        private Optional<Slot<Miai.Duration>> duration = Optional.a();

        public static shutdown read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            shutdown shutdownVar = new shutdown();
            if (zsdVar.z("duration")) {
                shutdownVar.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
            }
            return shutdownVar;
        }

        public static c4h write(shutdown shutdownVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (shutdownVar.duration.c()) {
                c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(shutdownVar.duration.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Duration>> getDuration() {
            return this.duration;
        }

        public shutdown setDuration(Slot<Miai.Duration> slot) {
            this.duration = Optional.e(slot);
            return this;
        }
    }

    public static class shutdownNow implements EntityType {
        public static shutdownNow read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new shutdownNow();
        }

        public static c4h write(shutdownNow shutdownnow) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class sleep implements EntityType {
        private Optional<Slot<Miai.Duration>> duration = Optional.a();

        public static sleep read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            sleep sleepVar = new sleep();
            if (zsdVar.z("duration")) {
                sleepVar.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
            }
            return sleepVar;
        }

        public static c4h write(sleep sleepVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (sleepVar.duration.c()) {
                c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(sleepVar.duration.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Duration>> getDuration() {
            return this.duration;
        }

        public sleep setDuration(Slot<Miai.Duration> slot) {
            this.duration = Optional.e(slot);
            return this;
        }
    }

    public static class ultraBatterySaver implements EntityType {
        public static ultraBatterySaver read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new ultraBatterySaver();
        }

        public static c4h write(ultraBatterySaver ultrabatterysaver) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public SystemPower() {
    }

    public static SystemPower read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        SystemPower systemPower = new SystemPower(IntentUtils.readEntityType(zsdVar, AIApiConstants.SystemPower.NAME, optional));
        if (zsdVar.z("datetime")) {
            systemPower.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
        }
        if (zsdVar.z("duration")) {
            systemPower.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
        }
        return systemPower;
    }

    public static zsd write(SystemPower systemPower) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(systemPower.entity_type);
        if (systemPower.datetime.c()) {
            c4hVar.f0("datetime", IntentUtils.writeSlot(systemPower.datetime.b()));
        }
        if (systemPower.duration.c()) {
            c4hVar.f0("duration", IntentUtils.writeSlot(systemPower.duration.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.Datetime>> getDatetime() {
        return this.datetime;
    }

    public Optional<Slot<Miai.Duration>> getDuration() {
        return this.duration;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public SystemPower setDatetime(Slot<Miai.Datetime> slot) {
        this.datetime = Optional.e(slot);
        return this;
    }

    public SystemPower setDuration(Slot<Miai.Duration> slot) {
        this.duration = Optional.e(slot);
        return this;
    }

    @Required
    public SystemPower setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public SystemPower(T t) {
        this.entity_type = t;
    }
}
