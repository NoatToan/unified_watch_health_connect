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
public class CustomerService<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> entity = Optional.a();

    @Required
    private T entity_type;

    public static class chehejiaUsage implements EntityType {
        public static chehejiaUsage read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new chehejiaUsage();
        }

        public static c4h write(chehejiaUsage chehejiausage) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class comparison implements EntityType {
        public static comparison read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new comparison();
        }

        public static c4h write(comparison comparisonVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class faultSolution implements EntityType {
        public static faultSolution read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new faultSolution();
        }

        public static c4h write(faultSolution faultsolution) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class instruction implements EntityType {
        public static instruction read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new instruction();
        }

        public static c4h write(instruction instructionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class miui implements EntityType {
        public static miui read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new miui();
        }

        public static c4h write(miui miuiVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class policy implements EntityType {
        public static policy read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new policy();
        }

        public static c4h write(policy policyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class specificDevice implements EntityType {
        public static specificDevice read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new specificDevice();
        }

        public static c4h write(specificDevice specificdevice) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class upKeep implements EntityType {
        public static upKeep read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new upKeep();
        }

        public static c4h write(upKeep upkeep) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class virtualItems implements EntityType {
        public static virtualItems read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new virtualItems();
        }

        public static c4h write(virtualItems virtualitems) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class wuhanUniversity implements EntityType {
        public static wuhanUniversity read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new wuhanUniversity();
        }

        public static c4h write(wuhanUniversity wuhanuniversity) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public CustomerService() {
    }

    public static CustomerService read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        CustomerService customerService = new CustomerService(IntentUtils.readEntityType(zsdVar, AIApiConstants.CustomerService.NAME, optional));
        if (zsdVar.z("entity")) {
            customerService.setEntity(IntentUtils.readSlot(zsdVar.w("entity"), String.class));
        }
        return customerService;
    }

    public static zsd write(CustomerService customerService) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(customerService.entity_type);
        if (customerService.entity.c()) {
            c4hVar.f0("entity", IntentUtils.writeSlot(customerService.entity.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getEntity() {
        return this.entity;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public CustomerService setEntity(Slot<String> slot) {
        this.entity = Optional.e(slot);
        return this;
    }

    @Required
    public CustomerService setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public CustomerService(T t) {
        this.entity_type = t;
    }
}
