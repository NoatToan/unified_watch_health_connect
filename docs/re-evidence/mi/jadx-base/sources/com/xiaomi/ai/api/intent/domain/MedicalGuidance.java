package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
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
public class MedicalGuidance<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> crowd;

    @Required
    private Slot<String> disease_symptom;

    public MedicalGuidance() {
    }

    public static MedicalGuidance read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        MedicalGuidance medicalGuidance = new MedicalGuidance();
        medicalGuidance.setCrowd(IntentUtils.readSlot(zsdVar.w("crowd"), String.class));
        medicalGuidance.setDiseaseSymptom(IntentUtils.readSlot(zsdVar.w("disease_symptom"), String.class));
        return medicalGuidance;
    }

    public static zsd write(MedicalGuidance medicalGuidance) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("crowd", IntentUtils.writeSlot(medicalGuidance.crowd));
        c4hVarCreateObjectNode.f0("disease_symptom", IntentUtils.writeSlot(medicalGuidance.disease_symptom));
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    @Required
    public Slot<String> getCrowd() {
        return this.crowd;
    }

    @Required
    public Slot<String> getDiseaseSymptom() {
        return this.disease_symptom;
    }

    @Required
    public MedicalGuidance setCrowd(Slot<String> slot) {
        this.crowd = slot;
        return this;
    }

    @Required
    public MedicalGuidance setDiseaseSymptom(Slot<String> slot) {
        this.disease_symptom = slot;
        return this;
    }

    public MedicalGuidance(Slot<String> slot, Slot<String> slot2) {
        this.crowd = slot;
        this.disease_symptom = slot2;
    }
}
