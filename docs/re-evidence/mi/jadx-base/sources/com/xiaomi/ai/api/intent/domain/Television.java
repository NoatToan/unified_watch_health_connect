package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Television<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum TelevisionMode {
        Silent(1, "Silent");

        private int id;
        private String name;

        TelevisionMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static TelevisionMode find(String str) {
            for (TelevisionMode televisionMode : values()) {
                if (televisionMode.name.equals(str)) {
                    return televisionMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static TelevisionMode read(String str) {
            return find(str);
        }

        public static String write(TelevisionMode televisionMode) {
            return televisionMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class camera implements EntityType {
        public static camera read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new camera();
        }

        public static c4h write(camera cameraVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class channel implements EntityType {
        private Optional<Slot<String>> name = Optional.a();
        private Optional<Slot<Miai.Number>> number = Optional.a();

        public static channel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            channel channelVar = new channel();
            if (zsdVar.z("name")) {
                channelVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                channelVar.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            return channelVar;
        }

        public static c4h write(channel channelVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (channelVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(channelVar.name.b()));
            }
            if (channelVar.number.c()) {
                c4hVarCreateObjectNode.f0(RealNameWebViewActivity.NUMBER, IntentUtils.writeSlot(channelVar.number.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public channel setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public channel setNumber(Slot<Miai.Number> slot) {
            this.number = Optional.e(slot);
            return this;
        }
    }

    public static class inputSource implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static inputSource read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            inputSource inputsource = new inputSource();
            if (zsdVar.z("name")) {
                inputsource.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return inputsource;
        }

        public static c4h write(inputSource inputsource) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (inputsource.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(inputsource.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public inputSource setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class keystoneEffect implements EntityType {
        public static keystoneEffect read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new keystoneEffect();
        }

        public static c4h write(keystoneEffect keystoneeffect) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<TelevisionMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), TelevisionMode.class));
            }
            return modeVar;
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (modeVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(modeVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<TelevisionMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<TelevisionMode> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class request implements EntityType {

        @Required
        private Slot<String> query;

        public request() {
        }

        public request(Slot<String> slot) {
            this.query = slot;
        }

        public static request read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            request requestVar = new request();
            requestVar.setQuery(IntentUtils.readSlot(zsdVar.w(SearchIntents.EXTRA_QUERY), String.class));
            return requestVar;
        }

        public static c4h write(request requestVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0(SearchIntents.EXTRA_QUERY, IntentUtils.writeSlot(requestVar.query));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getQuery() {
            return this.query;
        }

        @Required
        public request setQuery(Slot<String> slot) {
            this.query = slot;
            return this;
        }
    }

    public static class volume implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static volume read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            volume volumeVar = new volume();
            if (zsdVar.z("value")) {
                volumeVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return volumeVar;
        }

        public static c4h write(volume volumeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (volumeVar.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(volumeVar.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public volume setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public Television() {
    }

    public static Television read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Television television = new Television(IntentUtils.readEntityType(zsdVar, AIApiConstants.Television.NAME, optional));
        if (zsdVar.z("device")) {
            television.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            television.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            television.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            television.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            television.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            television.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            television.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return television;
    }

    public static zsd write(Television television) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(television.entity_type);
        if (television.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(television.device.b()));
        }
        if (television.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(television.room.b()));
        }
        if (television.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(television.is_all_to_operate.b()));
        }
        if (television.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(television.sub_category.b()));
        }
        if (television.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(television.service_entity.b()));
        }
        if (television.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(television.description.b()));
        }
        if (television.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(television.timing.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getDescription() {
        return this.description;
    }

    public Optional<Slot<String>> getDevice() {
        return this.device;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Boolean>> getIsAllToOperate() {
        return this.is_all_to_operate;
    }

    public Optional<Slot<String>> getRoom() {
        return this.room;
    }

    public Optional<Slot<String>> getServiceEntity() {
        return this.service_entity;
    }

    public Optional<Slot<String>> getSubCategory() {
        return this.sub_category;
    }

    public Optional<Slot<Miai.Datetime>> getTiming() {
        return this.timing;
    }

    public Television setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public Television setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public Television setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Television setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public Television setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public Television setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public Television setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public Television setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public Television(T t) {
        this.entity_type = t;
    }
}
