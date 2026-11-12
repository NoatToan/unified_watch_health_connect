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
public class AlarmReminder<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<AlarmCircle> circle;

    @Required
    private T entity_type;

    @Required
    private Slot<AlarmKeywordType> keyword_type;

    @Required
    private Slot<Long> relative_timestamp;

    @Required
    private Slot<Miai.Timezone> timezone;
    private Optional<Slot<String>> circle_extra = Optional.a();
    private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
    private Optional<Slot<Miai.Duration>> duration = Optional.a();
    private Optional<Slot<Boolean>> repeat_ringing = Optional.a();
    private Optional<Slot<String>> event = Optional.a();
    private Optional<Slot<AlarmAnswer.AnswerType>> answer_type = Optional.a();
    private Optional<Slot<AlarmAnswer.QuestionType>> question_type = Optional.a();
    private Optional<Slot<AlarmAnswer.QuestionType>> prev_question_type = Optional.a();
    private Optional<Slot<Boolean>> time_is_lunar = Optional.a();
    private Optional<Slot<String>> relationship = Optional.a();
    private Optional<Slot<String>> nick_name = Optional.a();

    public static class leftTime implements EntityType {

        @Required
        private Slot<Boolean> all;

        @Required
        private Slot<AlarmStatus> status;

        public leftTime() {
        }

        public leftTime(Slot<AlarmStatus> slot, Slot<Boolean> slot2) {
            this.status = slot;
            this.all = slot2;
        }

        public static leftTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            leftTime lefttime = new leftTime();
            lefttime.setStatus(IntentUtils.readSlot(zsdVar.w("status"), AlarmStatus.class));
            lefttime.setAll(IntentUtils.readSlot(zsdVar.w("all"), Boolean.class));
            return lefttime;
        }

        public static c4h write(leftTime lefttime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("status", IntentUtils.writeSlot(lefttime.status));
            c4hVarCreateObjectNode.f0("all", IntentUtils.writeSlot(lefttime.all));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Boolean> getAll() {
            return this.all;
        }

        @Required
        public Slot<AlarmStatus> getStatus() {
            return this.status;
        }

        @Required
        public leftTime setAll(Slot<Boolean> slot) {
            this.all = slot;
            return this;
        }

        @Required
        public leftTime setStatus(Slot<AlarmStatus> slot) {
            this.status = slot;
            return this;
        }
    }

    public static class specific implements EntityType {

        @Required
        private Slot<Boolean> all;

        @Required
        private Slot<AlarmStatus> status;

        public specific() {
        }

        public specific(Slot<AlarmStatus> slot, Slot<Boolean> slot2) {
            this.status = slot;
            this.all = slot2;
        }

        public static specific read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            specific specificVar = new specific();
            specificVar.setStatus(IntentUtils.readSlot(zsdVar.w("status"), AlarmStatus.class));
            specificVar.setAll(IntentUtils.readSlot(zsdVar.w("all"), Boolean.class));
            return specificVar;
        }

        public static c4h write(specific specificVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("status", IntentUtils.writeSlot(specificVar.status));
            c4hVarCreateObjectNode.f0("all", IntentUtils.writeSlot(specificVar.all));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Boolean> getAll() {
            return this.all;
        }

        @Required
        public Slot<AlarmStatus> getStatus() {
            return this.status;
        }

        @Required
        public specific setAll(Slot<Boolean> slot) {
            this.all = slot;
            return this;
        }

        @Required
        public specific setStatus(Slot<AlarmStatus> slot) {
            this.status = slot;
            return this;
        }
    }

    public AlarmReminder() {
    }

    public static AlarmReminder read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        AlarmReminder alarmReminder = new AlarmReminder(IntentUtils.readEntityType(zsdVar, AIApiConstants.AlarmReminder.NAME, optional));
        alarmReminder.setRelativeTimestamp(IntentUtils.readSlot(zsdVar.w("relative_timestamp"), Long.class));
        alarmReminder.setTimezone(IntentUtils.readSlot(zsdVar.w("timezone"), Miai.Timezone.class));
        alarmReminder.setKeywordType(IntentUtils.readSlot(zsdVar.w("keyword_type"), AlarmKeywordType.class));
        alarmReminder.setCircle(IntentUtils.readSlot(zsdVar.w("circle"), AlarmCircle.class));
        if (zsdVar.z("circle_extra")) {
            alarmReminder.setCircleExtra(IntentUtils.readSlot(zsdVar.w("circle_extra"), String.class));
        }
        if (zsdVar.z("datetime")) {
            alarmReminder.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
        }
        if (zsdVar.z("duration")) {
            alarmReminder.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
        }
        if (zsdVar.z("repeat_ringing")) {
            alarmReminder.setRepeatRinging(IntentUtils.readSlot(zsdVar.w("repeat_ringing"), Boolean.class));
        }
        if (zsdVar.z("event")) {
            alarmReminder.setEvent(IntentUtils.readSlot(zsdVar.w("event"), String.class));
        }
        if (zsdVar.z("answer_type")) {
            alarmReminder.setAnswerType(IntentUtils.readSlot(zsdVar.w("answer_type"), AlarmAnswer.AnswerType.class));
        }
        if (zsdVar.z("question_type")) {
            alarmReminder.setQuestionType(IntentUtils.readSlot(zsdVar.w("question_type"), AlarmAnswer.QuestionType.class));
        }
        if (zsdVar.z("prev_question_type")) {
            alarmReminder.setPrevQuestionType(IntentUtils.readSlot(zsdVar.w("prev_question_type"), AlarmAnswer.QuestionType.class));
        }
        if (zsdVar.z("time_is_lunar")) {
            alarmReminder.setTimeIsLunar(IntentUtils.readSlot(zsdVar.w("time_is_lunar"), Boolean.class));
        }
        if (zsdVar.z("relationship")) {
            alarmReminder.setRelationship(IntentUtils.readSlot(zsdVar.w("relationship"), String.class));
        }
        if (zsdVar.z("nick_name")) {
            alarmReminder.setNickName(IntentUtils.readSlot(zsdVar.w("nick_name"), String.class));
        }
        return alarmReminder;
    }

    public static zsd write(AlarmReminder alarmReminder) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(alarmReminder.entity_type);
        c4hVar.f0("relative_timestamp", IntentUtils.writeSlot(alarmReminder.relative_timestamp));
        c4hVar.f0("timezone", IntentUtils.writeSlot(alarmReminder.timezone));
        c4hVar.f0("keyword_type", IntentUtils.writeSlot(alarmReminder.keyword_type));
        c4hVar.f0("circle", IntentUtils.writeSlot(alarmReminder.circle));
        if (alarmReminder.circle_extra.c()) {
            c4hVar.f0("circle_extra", IntentUtils.writeSlot(alarmReminder.circle_extra.b()));
        }
        if (alarmReminder.datetime.c()) {
            c4hVar.f0("datetime", IntentUtils.writeSlot(alarmReminder.datetime.b()));
        }
        if (alarmReminder.duration.c()) {
            c4hVar.f0("duration", IntentUtils.writeSlot(alarmReminder.duration.b()));
        }
        if (alarmReminder.repeat_ringing.c()) {
            c4hVar.f0("repeat_ringing", IntentUtils.writeSlot(alarmReminder.repeat_ringing.b()));
        }
        if (alarmReminder.event.c()) {
            c4hVar.f0("event", IntentUtils.writeSlot(alarmReminder.event.b()));
        }
        if (alarmReminder.answer_type.c()) {
            c4hVar.f0("answer_type", IntentUtils.writeSlot(alarmReminder.answer_type.b()));
        }
        if (alarmReminder.question_type.c()) {
            c4hVar.f0("question_type", IntentUtils.writeSlot(alarmReminder.question_type.b()));
        }
        if (alarmReminder.prev_question_type.c()) {
            c4hVar.f0("prev_question_type", IntentUtils.writeSlot(alarmReminder.prev_question_type.b()));
        }
        if (alarmReminder.time_is_lunar.c()) {
            c4hVar.f0("time_is_lunar", IntentUtils.writeSlot(alarmReminder.time_is_lunar.b()));
        }
        if (alarmReminder.relationship.c()) {
            c4hVar.f0("relationship", IntentUtils.writeSlot(alarmReminder.relationship.b()));
        }
        if (alarmReminder.nick_name.c()) {
            c4hVar.f0("nick_name", IntentUtils.writeSlot(alarmReminder.nick_name.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<AlarmAnswer.AnswerType>> getAnswerType() {
        return this.answer_type;
    }

    @Required
    public Slot<AlarmCircle> getCircle() {
        return this.circle;
    }

    public Optional<Slot<String>> getCircleExtra() {
        return this.circle_extra;
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

    public Optional<Slot<String>> getEvent() {
        return this.event;
    }

    @Required
    public Slot<AlarmKeywordType> getKeywordType() {
        return this.keyword_type;
    }

    public Optional<Slot<String>> getNickName() {
        return this.nick_name;
    }

    public Optional<Slot<AlarmAnswer.QuestionType>> getPrevQuestionType() {
        return this.prev_question_type;
    }

    public Optional<Slot<AlarmAnswer.QuestionType>> getQuestionType() {
        return this.question_type;
    }

    public Optional<Slot<String>> getRelationship() {
        return this.relationship;
    }

    @Required
    public Slot<Long> getRelativeTimestamp() {
        return this.relative_timestamp;
    }

    public Optional<Slot<Boolean>> getRepeatRinging() {
        return this.repeat_ringing;
    }

    public Optional<Slot<Boolean>> getTimeIsLunar() {
        return this.time_is_lunar;
    }

    @Required
    public Slot<Miai.Timezone> getTimezone() {
        return this.timezone;
    }

    public AlarmReminder setAnswerType(Slot<AlarmAnswer.AnswerType> slot) {
        this.answer_type = Optional.e(slot);
        return this;
    }

    @Required
    public AlarmReminder setCircle(Slot<AlarmCircle> slot) {
        this.circle = slot;
        return this;
    }

    public AlarmReminder setCircleExtra(Slot<String> slot) {
        this.circle_extra = Optional.e(slot);
        return this;
    }

    public AlarmReminder setDatetime(Slot<Miai.Datetime> slot) {
        this.datetime = Optional.e(slot);
        return this;
    }

    public AlarmReminder setDuration(Slot<Miai.Duration> slot) {
        this.duration = Optional.e(slot);
        return this;
    }

    @Required
    public AlarmReminder setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public AlarmReminder setEvent(Slot<String> slot) {
        this.event = Optional.e(slot);
        return this;
    }

    @Required
    public AlarmReminder setKeywordType(Slot<AlarmKeywordType> slot) {
        this.keyword_type = slot;
        return this;
    }

    public AlarmReminder setNickName(Slot<String> slot) {
        this.nick_name = Optional.e(slot);
        return this;
    }

    public AlarmReminder setPrevQuestionType(Slot<AlarmAnswer.QuestionType> slot) {
        this.prev_question_type = Optional.e(slot);
        return this;
    }

    public AlarmReminder setQuestionType(Slot<AlarmAnswer.QuestionType> slot) {
        this.question_type = Optional.e(slot);
        return this;
    }

    public AlarmReminder setRelationship(Slot<String> slot) {
        this.relationship = Optional.e(slot);
        return this;
    }

    @Required
    public AlarmReminder setRelativeTimestamp(Slot<Long> slot) {
        this.relative_timestamp = slot;
        return this;
    }

    public AlarmReminder setRepeatRinging(Slot<Boolean> slot) {
        this.repeat_ringing = Optional.e(slot);
        return this;
    }

    public AlarmReminder setTimeIsLunar(Slot<Boolean> slot) {
        this.time_is_lunar = Optional.e(slot);
        return this;
    }

    @Required
    public AlarmReminder setTimezone(Slot<Miai.Timezone> slot) {
        this.timezone = slot;
        return this;
    }

    public static class ringtone implements EntityType {

        @Required
        private Slot<String> name;
        private Optional<Slot<String>> type = Optional.a();

        public ringtone() {
        }

        public static ringtone read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            ringtone ringtoneVar = new ringtone();
            ringtoneVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            if (zsdVar.z("type")) {
                ringtoneVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            return ringtoneVar;
        }

        public static c4h write(ringtone ringtoneVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(ringtoneVar.name));
            if (ringtoneVar.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(ringtoneVar.type.b()));
            }
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        @Required
        public ringtone setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }

        public ringtone setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }

        public ringtone(Slot<String> slot) {
            this.name = slot;
        }
    }

    public AlarmReminder(T t) {
        this.entity_type = t;
    }

    public AlarmReminder(T t, Slot<Long> slot, Slot<Miai.Timezone> slot2, Slot<AlarmKeywordType> slot3, Slot<AlarmCircle> slot4) {
        this.entity_type = t;
        this.relative_timestamp = slot;
        this.timezone = slot2;
        this.keyword_type = slot3;
        this.circle = slot4;
    }
}
