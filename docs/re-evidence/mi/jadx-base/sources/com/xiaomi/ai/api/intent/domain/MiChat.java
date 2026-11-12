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
public class MiChat<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> emotion;

    @Required
    private T entity_type;

    @Required
    private Slot<String> parser_type;

    @Required
    private Slot<String> persona;

    @Required
    private Slot<String> reaction_emotion;

    @Required
    private Slot<String> source;

    @Required
    private Slot<String> sub_type;
    private Optional<Slot<String>> topic_name = Optional.a();
    private Optional<Slot<MichatAlarmKeywordType>> keyword_type = Optional.a();
    private Optional<Slot<Miai.Datetime>> date_time = Optional.a();
    private Optional<Slot<Miai.Duration>> duration = Optional.a();
    private Optional<Slot<String>> event = Optional.a();
    private Optional<Slot<String>> nick_name = Optional.a();
    private Optional<Slot<String>> relationship = Optional.a();
    private Optional<Slot<Boolean>> time_is_lunar = Optional.a();
    private Optional<Slot<String>> scene = Optional.a();

    public static class competitor implements EntityType {
        public static competitor read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new competitor();
        }

        public static c4h write(competitor competitorVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class emotionUser implements EntityType {
        public static emotionUser read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new emotionUser();
        }

        public static c4h write(emotionUser emotionuser) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class emotionUserToXiaoai implements EntityType {
        public static emotionUserToXiaoai read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new emotionUserToXiaoai();
        }

        public static c4h write(emotionUserToXiaoai emotionusertoxiaoai) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class interaction implements EntityType {
        public static interaction read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new interaction();
        }

        public static c4h write(interaction interactionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class memoryUserState implements EntityType {
        public static memoryUserState read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new memoryUserState();
        }

        public static c4h write(memoryUserState memoryuserstate) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class personaUser implements EntityType {
        public static personaUser read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new personaUser();
        }

        public static c4h write(personaUser personauser) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class personaXiaoai implements EntityType {
        public static personaXiaoai read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new personaXiaoai();
        }

        public static c4h write(personaXiaoai personaxiaoai) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public MiChat() {
    }

    public static MiChat read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        MiChat miChat = new MiChat(IntentUtils.readEntityType(zsdVar, AIApiConstants.MiChat.NAME, optional));
        miChat.setSubType(IntentUtils.readSlot(zsdVar.w("sub_type"), String.class));
        miChat.setParserType(IntentUtils.readSlot(zsdVar.w("parser_type"), String.class));
        miChat.setSource(IntentUtils.readSlot(zsdVar.w("source"), String.class));
        if (zsdVar.z("topic_name")) {
            miChat.setTopicName(IntentUtils.readSlot(zsdVar.w("topic_name"), String.class));
        }
        miChat.setEmotion(IntentUtils.readSlot(zsdVar.w("emotion"), String.class));
        miChat.setPersona(IntentUtils.readSlot(zsdVar.w("persona"), String.class));
        miChat.setReactionEmotion(IntentUtils.readSlot(zsdVar.w("reaction_emotion"), String.class));
        if (zsdVar.z("keyword_type")) {
            miChat.setKeywordType(IntentUtils.readSlot(zsdVar.w("keyword_type"), MichatAlarmKeywordType.class));
        }
        if (zsdVar.z("date_time")) {
            miChat.setDateTime(IntentUtils.readSlot(zsdVar.w("date_time"), Miai.Datetime.class));
        }
        if (zsdVar.z("duration")) {
            miChat.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
        }
        if (zsdVar.z("event")) {
            miChat.setEvent(IntentUtils.readSlot(zsdVar.w("event"), String.class));
        }
        if (zsdVar.z("nick_name")) {
            miChat.setNickName(IntentUtils.readSlot(zsdVar.w("nick_name"), String.class));
        }
        if (zsdVar.z("relationship")) {
            miChat.setRelationship(IntentUtils.readSlot(zsdVar.w("relationship"), String.class));
        }
        if (zsdVar.z("time_is_lunar")) {
            miChat.setTimeIsLunar(IntentUtils.readSlot(zsdVar.w("time_is_lunar"), Boolean.class));
        }
        if (zsdVar.z("scene")) {
            miChat.setScene(IntentUtils.readSlot(zsdVar.w("scene"), String.class));
        }
        return miChat;
    }

    public static zsd write(MiChat miChat) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(miChat.entity_type);
        c4hVar.f0("sub_type", IntentUtils.writeSlot(miChat.sub_type));
        c4hVar.f0("parser_type", IntentUtils.writeSlot(miChat.parser_type));
        c4hVar.f0("source", IntentUtils.writeSlot(miChat.source));
        if (miChat.topic_name.c()) {
            c4hVar.f0("topic_name", IntentUtils.writeSlot(miChat.topic_name.b()));
        }
        c4hVar.f0("emotion", IntentUtils.writeSlot(miChat.emotion));
        c4hVar.f0("persona", IntentUtils.writeSlot(miChat.persona));
        c4hVar.f0("reaction_emotion", IntentUtils.writeSlot(miChat.reaction_emotion));
        if (miChat.keyword_type.c()) {
            c4hVar.f0("keyword_type", IntentUtils.writeSlot(miChat.keyword_type.b()));
        }
        if (miChat.date_time.c()) {
            c4hVar.f0("date_time", IntentUtils.writeSlot(miChat.date_time.b()));
        }
        if (miChat.duration.c()) {
            c4hVar.f0("duration", IntentUtils.writeSlot(miChat.duration.b()));
        }
        if (miChat.event.c()) {
            c4hVar.f0("event", IntentUtils.writeSlot(miChat.event.b()));
        }
        if (miChat.nick_name.c()) {
            c4hVar.f0("nick_name", IntentUtils.writeSlot(miChat.nick_name.b()));
        }
        if (miChat.relationship.c()) {
            c4hVar.f0("relationship", IntentUtils.writeSlot(miChat.relationship.b()));
        }
        if (miChat.time_is_lunar.c()) {
            c4hVar.f0("time_is_lunar", IntentUtils.writeSlot(miChat.time_is_lunar.b()));
        }
        if (miChat.scene.c()) {
            c4hVar.f0("scene", IntentUtils.writeSlot(miChat.scene.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.Datetime>> getDateTime() {
        return this.date_time;
    }

    public Optional<Slot<Miai.Duration>> getDuration() {
        return this.duration;
    }

    @Required
    public Slot<String> getEmotion() {
        return this.emotion;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getEvent() {
        return this.event;
    }

    public Optional<Slot<MichatAlarmKeywordType>> getKeywordType() {
        return this.keyword_type;
    }

    public Optional<Slot<String>> getNickName() {
        return this.nick_name;
    }

    @Required
    public Slot<String> getParserType() {
        return this.parser_type;
    }

    @Required
    public Slot<String> getPersona() {
        return this.persona;
    }

    @Required
    public Slot<String> getReactionEmotion() {
        return this.reaction_emotion;
    }

    public Optional<Slot<String>> getRelationship() {
        return this.relationship;
    }

    public Optional<Slot<String>> getScene() {
        return this.scene;
    }

    @Required
    public Slot<String> getSource() {
        return this.source;
    }

    @Required
    public Slot<String> getSubType() {
        return this.sub_type;
    }

    public Optional<Slot<Boolean>> getTimeIsLunar() {
        return this.time_is_lunar;
    }

    public Optional<Slot<String>> getTopicName() {
        return this.topic_name;
    }

    public MiChat setDateTime(Slot<Miai.Datetime> slot) {
        this.date_time = Optional.e(slot);
        return this;
    }

    public MiChat setDuration(Slot<Miai.Duration> slot) {
        this.duration = Optional.e(slot);
        return this;
    }

    @Required
    public MiChat setEmotion(Slot<String> slot) {
        this.emotion = slot;
        return this;
    }

    @Required
    public MiChat setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public MiChat setEvent(Slot<String> slot) {
        this.event = Optional.e(slot);
        return this;
    }

    public MiChat setKeywordType(Slot<MichatAlarmKeywordType> slot) {
        this.keyword_type = Optional.e(slot);
        return this;
    }

    public MiChat setNickName(Slot<String> slot) {
        this.nick_name = Optional.e(slot);
        return this;
    }

    @Required
    public MiChat setParserType(Slot<String> slot) {
        this.parser_type = slot;
        return this;
    }

    @Required
    public MiChat setPersona(Slot<String> slot) {
        this.persona = slot;
        return this;
    }

    @Required
    public MiChat setReactionEmotion(Slot<String> slot) {
        this.reaction_emotion = slot;
        return this;
    }

    public MiChat setRelationship(Slot<String> slot) {
        this.relationship = Optional.e(slot);
        return this;
    }

    public MiChat setScene(Slot<String> slot) {
        this.scene = Optional.e(slot);
        return this;
    }

    @Required
    public MiChat setSource(Slot<String> slot) {
        this.source = slot;
        return this;
    }

    @Required
    public MiChat setSubType(Slot<String> slot) {
        this.sub_type = slot;
        return this;
    }

    public MiChat setTimeIsLunar(Slot<Boolean> slot) {
        this.time_is_lunar = Optional.e(slot);
        return this;
    }

    public MiChat setTopicName(Slot<String> slot) {
        this.topic_name = Optional.e(slot);
        return this;
    }

    public MiChat(T t) {
        this.entity_type = t;
    }

    public MiChat(T t, Slot<String> slot, Slot<String> slot2, Slot<String> slot3, Slot<String> slot4, Slot<String> slot5, Slot<String> slot6) {
        this.entity_type = t;
        this.sub_type = slot;
        this.parser_type = slot2;
        this.source = slot3;
        this.emotion = slot4;
        this.persona = slot5;
        this.reaction_emotion = slot6;
    }
}
