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
public class Timer<T extends EntityType> extends IntentionEntity<T, general> {

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
    private Optional<Slot<String>> event = Optional.a();
    private Optional<Slot<AlarmAnswer.AnswerType>> answer_type = Optional.a();
    private Optional<Slot<AlarmAnswer.QuestionType>> question_type = Optional.a();
    private Optional<Slot<AlarmAnswer.QuestionType>> prev_question_type = Optional.a();

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

    public Timer() {
    }

    public static Timer read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Timer timer = new Timer(IntentUtils.readEntityType(zsdVar, AIApiConstants.Timer.NAME, optional));
        timer.setRelativeTimestamp(IntentUtils.readSlot(zsdVar.w("relative_timestamp"), Long.class));
        timer.setTimezone(IntentUtils.readSlot(zsdVar.w("timezone"), Miai.Timezone.class));
        timer.setKeywordType(IntentUtils.readSlot(zsdVar.w("keyword_type"), AlarmKeywordType.class));
        timer.setCircle(IntentUtils.readSlot(zsdVar.w("circle"), AlarmCircle.class));
        if (zsdVar.z("circle_extra")) {
            timer.setCircleExtra(IntentUtils.readSlot(zsdVar.w("circle_extra"), String.class));
        }
        if (zsdVar.z("datetime")) {
            timer.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
        }
        if (zsdVar.z("duration")) {
            timer.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
        }
        if (zsdVar.z("event")) {
            timer.setEvent(IntentUtils.readSlot(zsdVar.w("event"), String.class));
        }
        if (zsdVar.z("answer_type")) {
            timer.setAnswerType(IntentUtils.readSlot(zsdVar.w("answer_type"), AlarmAnswer.AnswerType.class));
        }
        if (zsdVar.z("question_type")) {
            timer.setQuestionType(IntentUtils.readSlot(zsdVar.w("question_type"), AlarmAnswer.QuestionType.class));
        }
        if (zsdVar.z("prev_question_type")) {
            timer.setPrevQuestionType(IntentUtils.readSlot(zsdVar.w("prev_question_type"), AlarmAnswer.QuestionType.class));
        }
        return timer;
    }

    public static zsd write(Timer timer) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(timer.entity_type);
        c4hVar.f0("relative_timestamp", IntentUtils.writeSlot(timer.relative_timestamp));
        c4hVar.f0("timezone", IntentUtils.writeSlot(timer.timezone));
        c4hVar.f0("keyword_type", IntentUtils.writeSlot(timer.keyword_type));
        c4hVar.f0("circle", IntentUtils.writeSlot(timer.circle));
        if (timer.circle_extra.c()) {
            c4hVar.f0("circle_extra", IntentUtils.writeSlot(timer.circle_extra.b()));
        }
        if (timer.datetime.c()) {
            c4hVar.f0("datetime", IntentUtils.writeSlot(timer.datetime.b()));
        }
        if (timer.duration.c()) {
            c4hVar.f0("duration", IntentUtils.writeSlot(timer.duration.b()));
        }
        if (timer.event.c()) {
            c4hVar.f0("event", IntentUtils.writeSlot(timer.event.b()));
        }
        if (timer.answer_type.c()) {
            c4hVar.f0("answer_type", IntentUtils.writeSlot(timer.answer_type.b()));
        }
        if (timer.question_type.c()) {
            c4hVar.f0("question_type", IntentUtils.writeSlot(timer.question_type.b()));
        }
        if (timer.prev_question_type.c()) {
            c4hVar.f0("prev_question_type", IntentUtils.writeSlot(timer.prev_question_type.b()));
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

    public Optional<Slot<AlarmAnswer.QuestionType>> getPrevQuestionType() {
        return this.prev_question_type;
    }

    public Optional<Slot<AlarmAnswer.QuestionType>> getQuestionType() {
        return this.question_type;
    }

    @Required
    public Slot<Long> getRelativeTimestamp() {
        return this.relative_timestamp;
    }

    @Required
    public Slot<Miai.Timezone> getTimezone() {
        return this.timezone;
    }

    public Timer setAnswerType(Slot<AlarmAnswer.AnswerType> slot) {
        this.answer_type = Optional.e(slot);
        return this;
    }

    @Required
    public Timer setCircle(Slot<AlarmCircle> slot) {
        this.circle = slot;
        return this;
    }

    public Timer setCircleExtra(Slot<String> slot) {
        this.circle_extra = Optional.e(slot);
        return this;
    }

    public Timer setDatetime(Slot<Miai.Datetime> slot) {
        this.datetime = Optional.e(slot);
        return this;
    }

    public Timer setDuration(Slot<Miai.Duration> slot) {
        this.duration = Optional.e(slot);
        return this;
    }

    @Required
    public Timer setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Timer setEvent(Slot<String> slot) {
        this.event = Optional.e(slot);
        return this;
    }

    @Required
    public Timer setKeywordType(Slot<AlarmKeywordType> slot) {
        this.keyword_type = slot;
        return this;
    }

    public Timer setPrevQuestionType(Slot<AlarmAnswer.QuestionType> slot) {
        this.prev_question_type = Optional.e(slot);
        return this;
    }

    public Timer setQuestionType(Slot<AlarmAnswer.QuestionType> slot) {
        this.question_type = Optional.e(slot);
        return this;
    }

    @Required
    public Timer setRelativeTimestamp(Slot<Long> slot) {
        this.relative_timestamp = slot;
        return this;
    }

    @Required
    public Timer setTimezone(Slot<Miai.Timezone> slot) {
        this.timezone = slot;
        return this;
    }

    public Timer(T t) {
        this.entity_type = t;
    }

    public Timer(T t, Slot<Long> slot, Slot<Miai.Timezone> slot2, Slot<AlarmKeywordType> slot3, Slot<AlarmCircle> slot4) {
        this.entity_type = t;
        this.relative_timestamp = slot;
        this.timezone = slot2;
        this.keyword_type = slot3;
        this.circle = slot4;
    }
}
