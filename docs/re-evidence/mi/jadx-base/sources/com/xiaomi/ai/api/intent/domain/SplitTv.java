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
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class SplitTv<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum SplitTvMode {
        Silent(1, "Silent");

        private int id;
        private String name;

        SplitTvMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SplitTvMode find(String str) {
            for (SplitTvMode splitTvMode : values()) {
                if (splitTvMode.name.equals(str)) {
                    return splitTvMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SplitTvMode read(String str) {
            return find(str);
        }

        public static String write(SplitTvMode splitTvMode) {
            return splitTvMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
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

    public static class mode implements EntityType {
        private Optional<Slot<SplitTvMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), SplitTvMode.class));
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

        public Optional<Slot<SplitTvMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<SplitTvMode> slot) {
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

    public SplitTv() {
    }

    public static SplitTv read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        SplitTv splitTv = new SplitTv(IntentUtils.readEntityType(zsdVar, AIApiConstants.SplitTv.NAME, optional));
        if (zsdVar.z("device")) {
            splitTv.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            splitTv.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            splitTv.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            splitTv.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            splitTv.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            splitTv.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            splitTv.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return splitTv;
    }

    public static zsd write(SplitTv splitTv) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(splitTv.entity_type);
        if (splitTv.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(splitTv.device.b()));
        }
        if (splitTv.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(splitTv.room.b()));
        }
        if (splitTv.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(splitTv.is_all_to_operate.b()));
        }
        if (splitTv.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(splitTv.sub_category.b()));
        }
        if (splitTv.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(splitTv.service_entity.b()));
        }
        if (splitTv.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(splitTv.description.b()));
        }
        if (splitTv.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(splitTv.timing.b()));
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

    public SplitTv setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public SplitTv setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public SplitTv setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public SplitTv setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public SplitTv setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public SplitTv setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public SplitTv setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public SplitTv setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public SplitTv(T t) {
        this.entity_type = t;
    }
}
