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
public class CockpitInfo<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<AutoStatus>> status = Optional.a();

    public static class buttonLocation implements EntityType {
        private Optional<Slot<String>> car_version = Optional.a();
        private Optional<Slot<String>> control = Optional.a();
        private Optional<Slot<String>> type = Optional.a();
        private Optional<Slot<String>> mention = Optional.a();
        private Optional<Slot<String>> similar_query = Optional.a();
        private Optional<Slot<String>> similar_source = Optional.a();
        private Optional<Slot<Float>> similar_score = Optional.a();
        private Optional<Slot<Boolean>> fuzzy = Optional.a();

        public static buttonLocation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            buttonLocation buttonlocation = new buttonLocation();
            if (zsdVar.z("car_version")) {
                buttonlocation.setCarVersion(IntentUtils.readSlot(zsdVar.w("car_version"), String.class));
            }
            if (zsdVar.z("control")) {
                buttonlocation.setControl(IntentUtils.readSlot(zsdVar.w("control"), String.class));
            }
            if (zsdVar.z("type")) {
                buttonlocation.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            }
            if (zsdVar.z("mention")) {
                buttonlocation.setMention(IntentUtils.readSlot(zsdVar.w("mention"), String.class));
            }
            if (zsdVar.z("similar_query")) {
                buttonlocation.setSimilarQuery(IntentUtils.readSlot(zsdVar.w("similar_query"), String.class));
            }
            if (zsdVar.z("similar_source")) {
                buttonlocation.setSimilarSource(IntentUtils.readSlot(zsdVar.w("similar_source"), String.class));
            }
            if (zsdVar.z("similar_score")) {
                buttonlocation.setSimilarScore(IntentUtils.readSlot(zsdVar.w("similar_score"), Float.class));
            }
            if (zsdVar.z("fuzzy")) {
                buttonlocation.setFuzzy(IntentUtils.readSlot(zsdVar.w("fuzzy"), Boolean.class));
            }
            return buttonlocation;
        }

        public static c4h write(buttonLocation buttonlocation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (buttonlocation.car_version.c()) {
                c4hVarCreateObjectNode.f0("car_version", IntentUtils.writeSlot(buttonlocation.car_version.b()));
            }
            if (buttonlocation.control.c()) {
                c4hVarCreateObjectNode.f0("control", IntentUtils.writeSlot(buttonlocation.control.b()));
            }
            if (buttonlocation.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(buttonlocation.type.b()));
            }
            if (buttonlocation.mention.c()) {
                c4hVarCreateObjectNode.f0("mention", IntentUtils.writeSlot(buttonlocation.mention.b()));
            }
            if (buttonlocation.similar_query.c()) {
                c4hVarCreateObjectNode.f0("similar_query", IntentUtils.writeSlot(buttonlocation.similar_query.b()));
            }
            if (buttonlocation.similar_source.c()) {
                c4hVarCreateObjectNode.f0("similar_source", IntentUtils.writeSlot(buttonlocation.similar_source.b()));
            }
            if (buttonlocation.similar_score.c()) {
                c4hVarCreateObjectNode.f0("similar_score", IntentUtils.writeSlot(buttonlocation.similar_score.b()));
            }
            if (buttonlocation.fuzzy.c()) {
                c4hVarCreateObjectNode.f0("fuzzy", IntentUtils.writeSlot(buttonlocation.fuzzy.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getCarVersion() {
            return this.car_version;
        }

        public Optional<Slot<String>> getControl() {
            return this.control;
        }

        public Optional<Slot<Boolean>> getFuzzy() {
            return this.fuzzy;
        }

        public Optional<Slot<String>> getMention() {
            return this.mention;
        }

        public Optional<Slot<String>> getSimilarQuery() {
            return this.similar_query;
        }

        public Optional<Slot<Float>> getSimilarScore() {
            return this.similar_score;
        }

        public Optional<Slot<String>> getSimilarSource() {
            return this.similar_source;
        }

        public Optional<Slot<String>> getType() {
            return this.type;
        }

        public buttonLocation setCarVersion(Slot<String> slot) {
            this.car_version = Optional.e(slot);
            return this;
        }

        public buttonLocation setControl(Slot<String> slot) {
            this.control = Optional.e(slot);
            return this;
        }

        public buttonLocation setFuzzy(Slot<Boolean> slot) {
            this.fuzzy = Optional.e(slot);
            return this;
        }

        public buttonLocation setMention(Slot<String> slot) {
            this.mention = Optional.e(slot);
            return this;
        }

        public buttonLocation setSimilarQuery(Slot<String> slot) {
            this.similar_query = Optional.e(slot);
            return this;
        }

        public buttonLocation setSimilarScore(Slot<Float> slot) {
            this.similar_score = Optional.e(slot);
            return this;
        }

        public buttonLocation setSimilarSource(Slot<String> slot) {
            this.similar_source = Optional.e(slot);
            return this;
        }

        public buttonLocation setType(Slot<String> slot) {
            this.type = Optional.e(slot);
            return this;
        }
    }

    public static class buttonManipulate implements EntityType {
        private Optional<Slot<String>> car_version = Optional.a();
        private Optional<Slot<String>> control = Optional.a();
        private Optional<Slot<String>> mention = Optional.a();
        private Optional<Slot<String>> action = Optional.a();

        public static buttonManipulate read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            buttonManipulate buttonmanipulate = new buttonManipulate();
            if (zsdVar.z("car_version")) {
                buttonmanipulate.setCarVersion(IntentUtils.readSlot(zsdVar.w("car_version"), String.class));
            }
            if (zsdVar.z("control")) {
                buttonmanipulate.setControl(IntentUtils.readSlot(zsdVar.w("control"), String.class));
            }
            if (zsdVar.z("mention")) {
                buttonmanipulate.setMention(IntentUtils.readSlot(zsdVar.w("mention"), String.class));
            }
            if (zsdVar.z("action")) {
                buttonmanipulate.setAction(IntentUtils.readSlot(zsdVar.w("action"), String.class));
            }
            return buttonmanipulate;
        }

        public static c4h write(buttonManipulate buttonmanipulate) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (buttonmanipulate.car_version.c()) {
                c4hVarCreateObjectNode.f0("car_version", IntentUtils.writeSlot(buttonmanipulate.car_version.b()));
            }
            if (buttonmanipulate.control.c()) {
                c4hVarCreateObjectNode.f0("control", IntentUtils.writeSlot(buttonmanipulate.control.b()));
            }
            if (buttonmanipulate.mention.c()) {
                c4hVarCreateObjectNode.f0("mention", IntentUtils.writeSlot(buttonmanipulate.mention.b()));
            }
            if (buttonmanipulate.action.c()) {
                c4hVarCreateObjectNode.f0("action", IntentUtils.writeSlot(buttonmanipulate.action.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getAction() {
            return this.action;
        }

        public Optional<Slot<String>> getCarVersion() {
            return this.car_version;
        }

        public Optional<Slot<String>> getControl() {
            return this.control;
        }

        public Optional<Slot<String>> getMention() {
            return this.mention;
        }

        public buttonManipulate setAction(Slot<String> slot) {
            this.action = Optional.e(slot);
            return this;
        }

        public buttonManipulate setCarVersion(Slot<String> slot) {
            this.car_version = Optional.e(slot);
            return this;
        }

        public buttonManipulate setControl(Slot<String> slot) {
            this.control = Optional.e(slot);
            return this;
        }

        public buttonManipulate setMention(Slot<String> slot) {
            this.mention = Optional.e(slot);
            return this;
        }
    }

    public static class information implements EntityType {
        private Optional<Slot<String>> parameters = Optional.a();

        public static information read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            information informationVar = new information();
            if (zsdVar.z("parameters")) {
                informationVar.setParameters(IntentUtils.readSlot(zsdVar.w("parameters"), String.class));
            }
            return informationVar;
        }

        public static c4h write(information informationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (informationVar.parameters.c()) {
                c4hVarCreateObjectNode.f0("parameters", IntentUtils.writeSlot(informationVar.parameters.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getParameters() {
            return this.parameters;
        }

        public information setParameters(Slot<String> slot) {
            this.parameters = Optional.e(slot);
            return this;
        }
    }

    public static class telltale implements EntityType {
        private Optional<Slot<String>> ref = Optional.a();
        private Optional<Slot<Miai.Ordinal>> order = Optional.a();
        private Optional<Slot<String>> position = Optional.a();
        private Optional<Slot<Boolean>> reverse = Optional.a();
        private Optional<Slot<Miai.Color>> color = Optional.a();
        private Optional<Slot<String>> tags = Optional.a();
        private Optional<Slot<String>> signal = Optional.a();
        private Optional<Slot<Boolean>> use_client_signal = Optional.a();

        public static telltale read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            telltale telltaleVar = new telltale();
            if (zsdVar.z("ref")) {
                telltaleVar.setRef(IntentUtils.readSlot(zsdVar.w("ref"), String.class));
            }
            if (zsdVar.z("order")) {
                telltaleVar.setOrder(IntentUtils.readSlot(zsdVar.w("order"), Miai.Ordinal.class));
            }
            if (zsdVar.z("position")) {
                telltaleVar.setPosition(IntentUtils.readSlot(zsdVar.w("position"), String.class));
            }
            if (zsdVar.z("reverse")) {
                telltaleVar.setReverse(IntentUtils.readSlot(zsdVar.w("reverse"), Boolean.class));
            }
            if (zsdVar.z("color")) {
                telltaleVar.setColor(IntentUtils.readSlot(zsdVar.w("color"), Miai.Color.class));
            }
            if (zsdVar.z("tags")) {
                telltaleVar.setTags(IntentUtils.readSlot(zsdVar.w("tags"), String.class));
            }
            if (zsdVar.z("signal")) {
                telltaleVar.setSignal(IntentUtils.readSlot(zsdVar.w("signal"), String.class));
            }
            if (zsdVar.z("use_client_signal")) {
                telltaleVar.setUseClientSignal(IntentUtils.readSlot(zsdVar.w("use_client_signal"), Boolean.class));
            }
            return telltaleVar;
        }

        public static c4h write(telltale telltaleVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (telltaleVar.ref.c()) {
                c4hVarCreateObjectNode.f0("ref", IntentUtils.writeSlot(telltaleVar.ref.b()));
            }
            if (telltaleVar.order.c()) {
                c4hVarCreateObjectNode.f0("order", IntentUtils.writeSlot(telltaleVar.order.b()));
            }
            if (telltaleVar.position.c()) {
                c4hVarCreateObjectNode.f0("position", IntentUtils.writeSlot(telltaleVar.position.b()));
            }
            if (telltaleVar.reverse.c()) {
                c4hVarCreateObjectNode.f0("reverse", IntentUtils.writeSlot(telltaleVar.reverse.b()));
            }
            if (telltaleVar.color.c()) {
                c4hVarCreateObjectNode.f0("color", IntentUtils.writeSlot(telltaleVar.color.b()));
            }
            if (telltaleVar.tags.c()) {
                c4hVarCreateObjectNode.f0("tags", IntentUtils.writeSlot(telltaleVar.tags.b()));
            }
            if (telltaleVar.signal.c()) {
                c4hVarCreateObjectNode.f0("signal", IntentUtils.writeSlot(telltaleVar.signal.b()));
            }
            if (telltaleVar.use_client_signal.c()) {
                c4hVarCreateObjectNode.f0("use_client_signal", IntentUtils.writeSlot(telltaleVar.use_client_signal.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Color>> getColor() {
            return this.color;
        }

        public Optional<Slot<Miai.Ordinal>> getOrder() {
            return this.order;
        }

        public Optional<Slot<String>> getPosition() {
            return this.position;
        }

        public Optional<Slot<String>> getRef() {
            return this.ref;
        }

        public Optional<Slot<Boolean>> getReverse() {
            return this.reverse;
        }

        public Optional<Slot<String>> getSignal() {
            return this.signal;
        }

        public Optional<Slot<String>> getTags() {
            return this.tags;
        }

        public Optional<Slot<Boolean>> getUseClientSignal() {
            return this.use_client_signal;
        }

        public telltale setColor(Slot<Miai.Color> slot) {
            this.color = Optional.e(slot);
            return this;
        }

        public telltale setOrder(Slot<Miai.Ordinal> slot) {
            this.order = Optional.e(slot);
            return this;
        }

        public telltale setPosition(Slot<String> slot) {
            this.position = Optional.e(slot);
            return this;
        }

        public telltale setRef(Slot<String> slot) {
            this.ref = Optional.e(slot);
            return this;
        }

        public telltale setReverse(Slot<Boolean> slot) {
            this.reverse = Optional.e(slot);
            return this;
        }

        public telltale setSignal(Slot<String> slot) {
            this.signal = Optional.e(slot);
            return this;
        }

        public telltale setTags(Slot<String> slot) {
            this.tags = Optional.e(slot);
            return this;
        }

        public telltale setUseClientSignal(Slot<Boolean> slot) {
            this.use_client_signal = Optional.e(slot);
            return this;
        }
    }

    public CockpitInfo() {
    }

    public static CockpitInfo read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        CockpitInfo cockpitInfo = new CockpitInfo(IntentUtils.readEntityType(zsdVar, AIApiConstants.CockpitInfo.NAME, optional));
        if (zsdVar.z("status")) {
            cockpitInfo.setStatus(IntentUtils.readSlot(zsdVar.w("status"), AutoStatus.class));
        }
        return cockpitInfo;
    }

    public static zsd write(CockpitInfo cockpitInfo) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(cockpitInfo.entity_type);
        if (cockpitInfo.status.c()) {
            c4hVar.f0("status", IntentUtils.writeSlot(cockpitInfo.status.b()));
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

    public Optional<Slot<AutoStatus>> getStatus() {
        return this.status;
    }

    @Required
    public CockpitInfo setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public CockpitInfo setStatus(Slot<AutoStatus> slot) {
        this.status = Optional.e(slot);
        return this;
    }

    public CockpitInfo(T t) {
        this.entity_type = t;
    }
}
