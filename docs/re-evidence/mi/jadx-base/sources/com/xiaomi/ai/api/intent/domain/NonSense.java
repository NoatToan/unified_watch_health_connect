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
public class NonSense<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public static class indistinctAudio implements EntityType {
        public static indistinctAudio read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new indistinctAudio();
        }

        public static c4h write(indistinctAudio indistinctaudio) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class meaningless implements EntityType {

        @Required
        private Slot<String> sub_type;

        public meaningless() {
        }

        public meaningless(Slot<String> slot) {
            this.sub_type = slot;
        }

        public static meaningless read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            meaningless meaninglessVar = new meaningless();
            meaninglessVar.setSubType(IntentUtils.readSlot(zsdVar.w("sub_type"), String.class));
            return meaninglessVar;
        }

        public static c4h write(meaningless meaninglessVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("sub_type", IntentUtils.writeSlot(meaninglessVar.sub_type));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getSubType() {
            return this.sub_type;
        }

        @Required
        public meaningless setSubType(Slot<String> slot) {
            this.sub_type = slot;
            return this;
        }
    }

    public static class nonComplete implements EntityType {

        @Required
        private Slot<String> sub_type;

        public nonComplete() {
        }

        public nonComplete(Slot<String> slot) {
            this.sub_type = slot;
        }

        public static nonComplete read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            nonComplete noncomplete = new nonComplete();
            noncomplete.setSubType(IntentUtils.readSlot(zsdVar.w("sub_type"), String.class));
            return noncomplete;
        }

        public static c4h write(nonComplete noncomplete) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("sub_type", IntentUtils.writeSlot(noncomplete.sub_type));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getSubType() {
            return this.sub_type;
        }

        @Required
        public nonComplete setSubType(Slot<String> slot) {
            this.sub_type = slot;
            return this;
        }
    }

    public static class nonHuman implements EntityType {
        public static nonHuman read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new nonHuman();
        }

        public static c4h write(nonHuman nonhuman) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class outOfDomain implements EntityType {

        @Required
        private Slot<String> domain;

        public outOfDomain() {
        }

        public outOfDomain(Slot<String> slot) {
            this.domain = slot;
        }

        public static outOfDomain read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            outOfDomain outofdomain = new outOfDomain();
            outofdomain.setDomain(IntentUtils.readSlot(zsdVar.w("domain"), String.class));
            return outofdomain;
        }

        public static c4h write(outOfDomain outofdomain) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("domain", IntentUtils.writeSlot(outofdomain.domain));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getDomain() {
            return this.domain;
        }

        @Required
        public outOfDomain setDomain(Slot<String> slot) {
            this.domain = slot;
            return this;
        }
    }

    public static class uncertain implements EntityType {

        @Required
        private Slot<String> sub_type;

        public uncertain() {
        }

        public uncertain(Slot<String> slot) {
            this.sub_type = slot;
        }

        public static uncertain read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            uncertain uncertainVar = new uncertain();
            uncertainVar.setSubType(IntentUtils.readSlot(zsdVar.w("sub_type"), String.class));
            return uncertainVar;
        }

        public static c4h write(uncertain uncertainVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("sub_type", IntentUtils.writeSlot(uncertainVar.sub_type));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getSubType() {
            return this.sub_type;
        }

        @Required
        public uncertain setSubType(Slot<String> slot) {
            this.sub_type = slot;
            return this;
        }
    }

    public NonSense() {
    }

    public static NonSense read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new NonSense(IntentUtils.readEntityType(zsdVar, AIApiConstants.NonSense.NAME, optional));
    }

    public static zsd write(NonSense nonSense) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(nonSense.entity_type);
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public NonSense setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public NonSense(T t) {
        this.entity_type = t;
    }
}
