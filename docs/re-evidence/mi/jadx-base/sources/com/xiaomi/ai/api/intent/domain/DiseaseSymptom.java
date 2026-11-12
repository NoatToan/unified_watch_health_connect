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
public class DiseaseSymptom<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> disease_name = Optional.a();
    private Optional<Slot<String>> symptom_name = Optional.a();

    public static class department implements EntityType {
        public static department read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new department();
        }

        public static c4h write(department departmentVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class diagnose implements EntityType {
        public static diagnose read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new diagnose();
        }

        public static c4h write(diagnose diagnoseVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class infectivity implements EntityType {
        public static infectivity read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new infectivity();
        }

        public static c4h write(infectivity infectivityVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class inspection implements EntityType {
        public static inspection read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new inspection();
        }

        public static c4h write(inspection inspectionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class multiplePopulation implements EntityType {
        public static multiplePopulation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new multiplePopulation();
        }

        public static c4h write(multiplePopulation multiplepopulation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class pathogen implements EntityType {
        public static pathogen read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new pathogen();
        }

        public static c4h write(pathogen pathogenVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class prevention implements EntityType {
        public static prevention read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new prevention();
        }

        public static c4h write(prevention preventionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class symptom implements EntityType {
        public static symptom read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new symptom();
        }

        public static c4h write(symptom symptomVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class transmission implements EntityType {
        public static transmission read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new transmission();
        }

        public static c4h write(transmission transmissionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class treatment implements EntityType {
        public static treatment read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new treatment();
        }

        public static c4h write(treatment treatmentVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public DiseaseSymptom() {
    }

    public static DiseaseSymptom read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        DiseaseSymptom diseaseSymptom = new DiseaseSymptom(IntentUtils.readEntityType(zsdVar, AIApiConstants.DiseaseSymptom.NAME, optional));
        if (zsdVar.z("disease_name")) {
            diseaseSymptom.setDiseaseName(IntentUtils.readSlot(zsdVar.w("disease_name"), String.class));
        }
        if (zsdVar.z("symptom_name")) {
            diseaseSymptom.setSymptomName(IntentUtils.readSlot(zsdVar.w("symptom_name"), String.class));
        }
        return diseaseSymptom;
    }

    public static zsd write(DiseaseSymptom diseaseSymptom) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(diseaseSymptom.entity_type);
        if (diseaseSymptom.disease_name.c()) {
            c4hVar.f0("disease_name", IntentUtils.writeSlot(diseaseSymptom.disease_name.b()));
        }
        if (diseaseSymptom.symptom_name.c()) {
            c4hVar.f0("symptom_name", IntentUtils.writeSlot(diseaseSymptom.symptom_name.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getDiseaseName() {
        return this.disease_name;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getSymptomName() {
        return this.symptom_name;
    }

    public DiseaseSymptom setDiseaseName(Slot<String> slot) {
        this.disease_name = Optional.e(slot);
        return this;
    }

    @Required
    public DiseaseSymptom setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public DiseaseSymptom setSymptomName(Slot<String> slot) {
        this.symptom_name = Optional.e(slot);
        return this;
    }

    public DiseaseSymptom(T t) {
        this.entity_type = t;
    }
}
