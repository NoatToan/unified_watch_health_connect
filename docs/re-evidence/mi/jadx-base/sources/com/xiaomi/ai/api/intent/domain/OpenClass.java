package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class OpenClass<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<PaymentType>> payment_type = Optional.a();
    private Optional<Slot<String>> version = Optional.a();
    private Optional<Slot<Miai.Date>> date = Optional.a();
    private Optional<Slot<String>> volume = Optional.a();
    private Optional<Slot<Miai.Episode>> episode = Optional.a();
    private Optional<Slot<String>> keyword = Optional.a();
    private Optional<Slot<String>> keyword_tag = Optional.a();

    public enum PaymentType {
        Free(1, "Free"),
        Pay(2, "Pay");

        private int id;
        private String name;

        PaymentType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static PaymentType find(String str) {
            for (PaymentType paymentType : values()) {
                if (paymentType.name.equals(str)) {
                    return paymentType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static PaymentType read(String str) {
            return find(str);
        }

        public static String write(PaymentType paymentType) {
            return paymentType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class ReferResource implements DomainType {
        private Optional<String> mainName = Optional.a();
        private Optional<String> subName = Optional.a();

        public Optional<String> getMainName() {
            return this.mainName;
        }

        public Optional<String> getSubName() {
            return this.subName;
        }

        public ReferResource setMainName(String str) {
            this.mainName = Optional.e(str);
            return this;
        }

        public ReferResource setSubName(String str) {
            this.subName = Optional.e(str);
            return this;
        }
    }

    public static class combination implements EntityType {
        private Optional<Slot<String>> subject = Optional.a();
        private Optional<Slot<String>> grade = Optional.a();
        private Optional<Slot<String>> exam = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();
        private Optional<Slot<String>> name = Optional.a();
        private Optional<Slot<String>> textName = Optional.a();
        private Optional<Slot<ReferResource>> refer_resource = Optional.a();

        public static combination read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            combination combinationVar = new combination();
            if (zsdVar.z("subject")) {
                combinationVar.setSubject(IntentUtils.readSlot(zsdVar.w("subject"), String.class));
            }
            if (zsdVar.z("grade")) {
                combinationVar.setGrade(IntentUtils.readSlot(zsdVar.w("grade"), String.class));
            }
            if (zsdVar.z("exam")) {
                combinationVar.setExam(IntentUtils.readSlot(zsdVar.w("exam"), String.class));
            }
            if (zsdVar.z("tag")) {
                combinationVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            if (zsdVar.z("name")) {
                combinationVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            if (zsdVar.z("textName")) {
                combinationVar.setTextName(IntentUtils.readSlot(zsdVar.w("textName"), String.class));
            }
            if (zsdVar.z("refer_resource")) {
                combinationVar.setReferResource(IntentUtils.readSlot(zsdVar.w("refer_resource"), ReferResource.class));
            }
            return combinationVar;
        }

        public static c4h write(combination combinationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (combinationVar.subject.c()) {
                c4hVarCreateObjectNode.f0("subject", IntentUtils.writeSlot(combinationVar.subject.b()));
            }
            if (combinationVar.grade.c()) {
                c4hVarCreateObjectNode.f0("grade", IntentUtils.writeSlot(combinationVar.grade.b()));
            }
            if (combinationVar.exam.c()) {
                c4hVarCreateObjectNode.f0("exam", IntentUtils.writeSlot(combinationVar.exam.b()));
            }
            if (combinationVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(combinationVar.tag.b()));
            }
            if (combinationVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(combinationVar.name.b()));
            }
            if (combinationVar.textName.c()) {
                c4hVarCreateObjectNode.f0("textName", IntentUtils.writeSlot(combinationVar.textName.b()));
            }
            if (combinationVar.refer_resource.c()) {
                c4hVarCreateObjectNode.f0("refer_resource", IntentUtils.writeSlot(combinationVar.refer_resource.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getExam() {
            return this.exam;
        }

        public Optional<Slot<String>> getGrade() {
            return this.grade;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public Optional<Slot<ReferResource>> getReferResource() {
            return this.refer_resource;
        }

        public Optional<Slot<String>> getSubject() {
            return this.subject;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public Optional<Slot<String>> getTextName() {
            return this.textName;
        }

        public combination setExam(Slot<String> slot) {
            this.exam = Optional.e(slot);
            return this;
        }

        public combination setGrade(Slot<String> slot) {
            this.grade = Optional.e(slot);
            return this;
        }

        public combination setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public combination setReferResource(Slot<ReferResource> slot) {
            this.refer_resource = Optional.e(slot);
            return this;
        }

        public combination setSubject(Slot<String> slot) {
            this.subject = Optional.e(slot);
            return this;
        }

        public combination setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }

        public combination setTextName(Slot<String> slot) {
            this.textName = Optional.e(slot);
            return this;
        }
    }

    public static class exam implements EntityType {

        @Required
        private Slot<String> name;

        public exam() {
        }

        public exam(Slot<String> slot) {
            this.name = slot;
        }

        public static exam read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            exam examVar = new exam();
            examVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return examVar;
        }

        public static c4h write(exam examVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(examVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public exam setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class grade implements EntityType {

        @Required
        private Slot<String> name;

        public grade() {
        }

        public grade(Slot<String> slot) {
            this.name = slot;
        }

        public static grade read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            grade gradeVar = new grade();
            gradeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return gradeVar;
        }

        public static c4h write(grade gradeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(gradeVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public grade setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class name implements EntityType {

        @Required
        private Slot<String> name;

        @Required
        private Slot<ReferResource> refer_resource;

        public name() {
        }

        public name(Slot<String> slot, Slot<ReferResource> slot2) {
            this.name = slot;
            this.refer_resource = slot2;
        }

        public static name read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            name nameVar = new name();
            nameVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            nameVar.setReferResource(IntentUtils.readSlot(zsdVar.w("refer_resource"), ReferResource.class));
            return nameVar;
        }

        public static c4h write(name nameVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(nameVar.name));
            c4hVarCreateObjectNode.f0("refer_resource", IntentUtils.writeSlot(nameVar.refer_resource));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public Slot<ReferResource> getReferResource() {
            return this.refer_resource;
        }

        @Required
        public name setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }

        @Required
        public name setReferResource(Slot<ReferResource> slot) {
            this.refer_resource = slot;
            return this;
        }
    }

    public static class subject implements EntityType {

        @Required
        private Slot<String> name;

        public subject() {
        }

        public subject(Slot<String> slot) {
            this.name = slot;
        }

        public static subject read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            subject subjectVar = new subject();
            subjectVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return subjectVar;
        }

        public static c4h write(subject subjectVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(subjectVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public subject setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class tag implements EntityType {

        @Required
        private Slot<String> name;

        public tag() {
        }

        public tag(Slot<String> slot) {
            this.name = slot;
        }

        public static tag read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            tag tagVar = new tag();
            tagVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return tagVar;
        }

        public static c4h write(tag tagVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(tagVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public tag setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class textName implements EntityType {

        @Required
        private Slot<String> name;

        public textName() {
        }

        public textName(Slot<String> slot) {
            this.name = slot;
        }

        public static textName read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            textName textname = new textName();
            textname.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return textname;
        }

        public static c4h write(textName textname) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(textname.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public textName setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public OpenClass() {
    }

    public static OpenClass read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        OpenClass openClass = new OpenClass(IntentUtils.readEntityType(zsdVar, AIApiConstants.OpenClass.NAME, optional));
        if (zsdVar.z("payment_type")) {
            openClass.setPaymentType(IntentUtils.readSlot(zsdVar.w("payment_type"), PaymentType.class));
        }
        if (zsdVar.z("version")) {
            openClass.setVersion(IntentUtils.readSlot(zsdVar.w("version"), String.class));
        }
        if (zsdVar.z(DialWidgetType.DATE)) {
            openClass.setDate(IntentUtils.readSlot(zsdVar.w(DialWidgetType.DATE), Miai.Date.class));
        }
        if (zsdVar.z("volume")) {
            openClass.setVolume(IntentUtils.readSlot(zsdVar.w("volume"), String.class));
        }
        if (zsdVar.z("episode")) {
            openClass.setEpisode(IntentUtils.readSlot(zsdVar.w("episode"), Miai.Episode.class));
        }
        if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
            openClass.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
        }
        if (zsdVar.z("keyword_tag")) {
            openClass.setKeywordTag(IntentUtils.readSlot(zsdVar.w("keyword_tag"), String.class));
        }
        return openClass;
    }

    public static zsd write(OpenClass openClass) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(openClass.entity_type);
        if (openClass.payment_type.c()) {
            c4hVar.f0("payment_type", IntentUtils.writeSlot(openClass.payment_type.b()));
        }
        if (openClass.version.c()) {
            c4hVar.f0("version", IntentUtils.writeSlot(openClass.version.b()));
        }
        if (openClass.date.c()) {
            c4hVar.f0(DialWidgetType.DATE, IntentUtils.writeSlot(openClass.date.b()));
        }
        if (openClass.volume.c()) {
            c4hVar.f0("volume", IntentUtils.writeSlot(openClass.volume.b()));
        }
        if (openClass.episode.c()) {
            c4hVar.f0("episode", IntentUtils.writeSlot(openClass.episode.b()));
        }
        if (openClass.keyword.c()) {
            c4hVar.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(openClass.keyword.b()));
        }
        if (openClass.keyword_tag.c()) {
            c4hVar.f0("keyword_tag", IntentUtils.writeSlot(openClass.keyword_tag.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.Date>> getDate() {
        return this.date;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.Episode>> getEpisode() {
        return this.episode;
    }

    public Optional<Slot<String>> getKeyword() {
        return this.keyword;
    }

    public Optional<Slot<String>> getKeywordTag() {
        return this.keyword_tag;
    }

    public Optional<Slot<PaymentType>> getPaymentType() {
        return this.payment_type;
    }

    public Optional<Slot<String>> getVersion() {
        return this.version;
    }

    public Optional<Slot<String>> getVolume() {
        return this.volume;
    }

    public OpenClass setDate(Slot<Miai.Date> slot) {
        this.date = Optional.e(slot);
        return this;
    }

    @Required
    public OpenClass setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public OpenClass setEpisode(Slot<Miai.Episode> slot) {
        this.episode = Optional.e(slot);
        return this;
    }

    public OpenClass setKeyword(Slot<String> slot) {
        this.keyword = Optional.e(slot);
        return this;
    }

    public OpenClass setKeywordTag(Slot<String> slot) {
        this.keyword_tag = Optional.e(slot);
        return this;
    }

    public OpenClass setPaymentType(Slot<PaymentType> slot) {
        this.payment_type = Optional.e(slot);
        return this;
    }

    public OpenClass setVersion(Slot<String> slot) {
        this.version = Optional.e(slot);
        return this;
    }

    public OpenClass setVolume(Slot<String> slot) {
        this.volume = Optional.e(slot);
        return this;
    }

    public OpenClass(T t) {
        this.entity_type = t;
    }
}
