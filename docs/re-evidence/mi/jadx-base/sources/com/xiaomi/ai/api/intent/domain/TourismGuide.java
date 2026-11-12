package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class TourismGuide<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> name;
    private Optional<Slot<String>> location = Optional.a();
    private Optional<Slot<String>> guideline_tag = Optional.a();
    private Optional<Slot<TourConcept>> tour_concept = Optional.a();

    public static class TourConcept implements DomainType {

        @Required
        private String name;

        @Required
        private List<String> values;

        public TourConcept() {
        }

        public TourConcept(String str, List<String> list) {
            this.name = str;
            this.values = list;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public List<String> getValues() {
            return this.values;
        }

        @Required
        public TourConcept setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public TourConcept setValues(List<String> list) {
            this.values = list;
            return this;
        }
    }

    public static class duration implements EntityType {
        public static duration read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new duration();
        }

        public static c4h write(duration durationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class food implements EntityType {
        public static food read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new food();
        }

        public static c4h write(food foodVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class season implements EntityType {
        public static season read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new season();
        }

        public static c4h write(season seasonVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public TourismGuide() {
    }

    public static TourismGuide read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        TourismGuide tourismGuide = new TourismGuide(IntentUtils.readEntityType(zsdVar, AIApiConstants.TourismGuide.NAME, optional));
        tourismGuide.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        if (zsdVar.z("location")) {
            tourismGuide.setLocation(IntentUtils.readSlot(zsdVar.w("location"), String.class));
        }
        if (zsdVar.z("guideline_tag")) {
            tourismGuide.setGuidelineTag(IntentUtils.readSlot(zsdVar.w("guideline_tag"), String.class));
        }
        if (zsdVar.z("tour_concept")) {
            tourismGuide.setTourConcept(IntentUtils.readSlot(zsdVar.w("tour_concept"), TourConcept.class));
        }
        return tourismGuide;
    }

    public static zsd write(TourismGuide tourismGuide) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(tourismGuide.entity_type);
        c4hVar.f0("name", IntentUtils.writeSlot(tourismGuide.name));
        if (tourismGuide.location.c()) {
            c4hVar.f0("location", IntentUtils.writeSlot(tourismGuide.location.b()));
        }
        if (tourismGuide.guideline_tag.c()) {
            c4hVar.f0("guideline_tag", IntentUtils.writeSlot(tourismGuide.guideline_tag.b()));
        }
        if (tourismGuide.tour_concept.c()) {
            c4hVar.f0("tour_concept", IntentUtils.writeSlot(tourismGuide.tour_concept.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getGuidelineTag() {
        return this.guideline_tag;
    }

    public Optional<Slot<String>> getLocation() {
        return this.location;
    }

    @Required
    public Slot<String> getName() {
        return this.name;
    }

    public Optional<Slot<TourConcept>> getTourConcept() {
        return this.tour_concept;
    }

    @Required
    public TourismGuide setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public TourismGuide setGuidelineTag(Slot<String> slot) {
        this.guideline_tag = Optional.e(slot);
        return this;
    }

    public TourismGuide setLocation(Slot<String> slot) {
        this.location = Optional.e(slot);
        return this;
    }

    @Required
    public TourismGuide setName(Slot<String> slot) {
        this.name = slot;
        return this;
    }

    public TourismGuide setTourConcept(Slot<TourConcept> slot) {
        this.tour_concept = Optional.e(slot);
        return this;
    }

    public TourismGuide(T t) {
        this.entity_type = t;
    }

    public TourismGuide(T t, Slot<String> slot) {
        this.entity_type = t;
        this.name = slot;
    }
}
