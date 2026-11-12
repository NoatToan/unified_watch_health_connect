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
public class PhoneBill<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> value = Optional.a();
    private Optional<Slot<String>> recharge_name = Optional.a();
    private Optional<Slot<String>> recharge_code = Optional.a();
    private Optional<Slot<String>> multi_person = Optional.a();

    public static PhoneBill read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PhoneBill phoneBill = new PhoneBill();
        if (zsdVar.z("value")) {
            phoneBill.setValue(IntentUtils.readSlot(zsdVar.w("value"), String.class));
        }
        if (zsdVar.z("recharge_name")) {
            phoneBill.setRechargeName(IntentUtils.readSlot(zsdVar.w("recharge_name"), String.class));
        }
        if (zsdVar.z("recharge_code")) {
            phoneBill.setRechargeCode(IntentUtils.readSlot(zsdVar.w("recharge_code"), String.class));
        }
        if (zsdVar.z("multi_person")) {
            phoneBill.setMultiPerson(IntentUtils.readSlot(zsdVar.w("multi_person"), String.class));
        }
        return phoneBill;
    }

    public static zsd write(PhoneBill phoneBill) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (phoneBill.value.c()) {
            c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(phoneBill.value.b()));
        }
        if (phoneBill.recharge_name.c()) {
            c4hVarCreateObjectNode.f0("recharge_name", IntentUtils.writeSlot(phoneBill.recharge_name.b()));
        }
        if (phoneBill.recharge_code.c()) {
            c4hVarCreateObjectNode.f0("recharge_code", IntentUtils.writeSlot(phoneBill.recharge_code.b()));
        }
        if (phoneBill.multi_person.c()) {
            c4hVarCreateObjectNode.f0("multi_person", IntentUtils.writeSlot(phoneBill.multi_person.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getMultiPerson() {
        return this.multi_person;
    }

    public Optional<Slot<String>> getRechargeCode() {
        return this.recharge_code;
    }

    public Optional<Slot<String>> getRechargeName() {
        return this.recharge_name;
    }

    public Optional<Slot<String>> getValue() {
        return this.value;
    }

    public PhoneBill setMultiPerson(Slot<String> slot) {
        this.multi_person = Optional.e(slot);
        return this;
    }

    public PhoneBill setRechargeCode(Slot<String> slot) {
        this.recharge_code = Optional.e(slot);
        return this;
    }

    public PhoneBill setRechargeName(Slot<String> slot) {
        this.recharge_name = Optional.e(slot);
        return this;
    }

    public PhoneBill setValue(Slot<String> slot) {
        this.value = Optional.e(slot);
        return this;
    }
}
