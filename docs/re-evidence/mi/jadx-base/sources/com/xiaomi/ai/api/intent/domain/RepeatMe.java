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
public class RepeatMe<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<Integer>> repetition = Optional.a();

    @Required
    private Slot<String> text;

    public static class comfort implements EntityType {
        public static comfort read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new comfort();
        }

        public static c4h write(comfort comfortVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class command implements EntityType {
        public static command read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new command();
        }

        public static c4h write(command commandVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dialogueRepeat implements EntityType {
        public static dialogueRepeat read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new dialogueRepeat();
        }

        public static c4h write(dialogueRepeat dialoguerepeat) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class name implements EntityType {
        public static name read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new name();
        }

        public static c4h write(name nameVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class sayAnswer implements EntityType {

        @Required
        private Slot<c4h> session_attribute;

        public sayAnswer() {
        }

        public sayAnswer(Slot<c4h> slot) {
            this.session_attribute = slot;
        }

        public static sayAnswer read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            sayAnswer sayanswer = new sayAnswer();
            sayanswer.setSessionAttribute(IntentUtils.readSlot(zsdVar.w("session_attribute"), c4h.class));
            return sayanswer;
        }

        public static c4h write(sayAnswer sayanswer) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("session_attribute", IntentUtils.writeSlot(sayanswer.session_attribute));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<c4h> getSessionAttribute() {
            return this.session_attribute;
        }

        @Required
        public sayAnswer setSessionAttribute(Slot<c4h> slot) {
            this.session_attribute = slot;
            return this;
        }
    }

    public RepeatMe() {
    }

    public static RepeatMe read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        RepeatMe repeatMe = new RepeatMe(IntentUtils.readEntityType(zsdVar, AIApiConstants.RepeatMe.NAME, optional));
        repeatMe.setText(IntentUtils.readSlot(zsdVar.w("text"), String.class));
        if (zsdVar.z("repetition")) {
            repeatMe.setRepetition(IntentUtils.readSlot(zsdVar.w("repetition"), Integer.class));
        }
        return repeatMe;
    }

    public static zsd write(RepeatMe repeatMe) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(repeatMe.entity_type);
        c4hVar.f0("text", IntentUtils.writeSlot(repeatMe.text));
        if (repeatMe.repetition.c()) {
            c4hVar.f0("repetition", IntentUtils.writeSlot(repeatMe.repetition.b()));
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

    public Optional<Slot<Integer>> getRepetition() {
        return this.repetition;
    }

    @Required
    public Slot<String> getText() {
        return this.text;
    }

    @Required
    public RepeatMe setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public RepeatMe setRepetition(Slot<Integer> slot) {
        this.repetition = Optional.e(slot);
        return this;
    }

    @Required
    public RepeatMe setText(Slot<String> slot) {
        this.text = slot;
        return this;
    }

    public RepeatMe(T t) {
        this.entity_type = t;
    }

    public RepeatMe(T t, Slot<String> slot) {
        this.entity_type = t;
        this.text = slot;
    }
}
