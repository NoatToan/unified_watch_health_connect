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
public class PoemInfo<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> name;
    private Optional<Slot<String>> poet = Optional.a();
    private Optional<Slot<String>> dynasty = Optional.a();
    private Optional<Slot<String>> verse = Optional.a();
    private Optional<Slot<String>> type = Optional.a();
    private Optional<Slot<String>> property = Optional.a();

    public static class appreciation implements EntityType {
        public static appreciation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new appreciation();
        }

        public static c4h write(appreciation appreciationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dynasty implements EntityType {
        public static dynasty read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new dynasty();
        }

        public static c4h write(dynasty dynastyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class meaning implements EntityType {
        public static meaning read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new meaning();
        }

        public static c4h write(meaning meaningVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class poet implements EntityType {
        public static poet read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new poet();
        }

        public static c4h write(poet poetVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public PoemInfo() {
    }

    public static PoemInfo read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PoemInfo poemInfo = new PoemInfo(IntentUtils.readEntityType(zsdVar, AIApiConstants.PoemInfo.NAME, optional));
        poemInfo.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        if (zsdVar.z("poet")) {
            poemInfo.setPoet(IntentUtils.readSlot(zsdVar.w("poet"), String.class));
        }
        if (zsdVar.z("dynasty")) {
            poemInfo.setDynasty(IntentUtils.readSlot(zsdVar.w("dynasty"), String.class));
        }
        if (zsdVar.z("verse")) {
            poemInfo.setVerse(IntentUtils.readSlot(zsdVar.w("verse"), String.class));
        }
        if (zsdVar.z("type")) {
            poemInfo.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
        }
        if (zsdVar.z("property")) {
            poemInfo.setProperty(IntentUtils.readSlot(zsdVar.w("property"), String.class));
        }
        return poemInfo;
    }

    public static zsd write(PoemInfo poemInfo) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(poemInfo.entity_type);
        c4hVar.f0("name", IntentUtils.writeSlot(poemInfo.name));
        if (poemInfo.poet.c()) {
            c4hVar.f0("poet", IntentUtils.writeSlot(poemInfo.poet.b()));
        }
        if (poemInfo.dynasty.c()) {
            c4hVar.f0("dynasty", IntentUtils.writeSlot(poemInfo.dynasty.b()));
        }
        if (poemInfo.verse.c()) {
            c4hVar.f0("verse", IntentUtils.writeSlot(poemInfo.verse.b()));
        }
        if (poemInfo.type.c()) {
            c4hVar.f0("type", IntentUtils.writeSlot(poemInfo.type.b()));
        }
        if (poemInfo.property.c()) {
            c4hVar.f0("property", IntentUtils.writeSlot(poemInfo.property.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getDynasty() {
        return this.dynasty;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public Slot<String> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getPoet() {
        return this.poet;
    }

    public Optional<Slot<String>> getProperty() {
        return this.property;
    }

    public Optional<Slot<String>> getType() {
        return this.type;
    }

    public Optional<Slot<String>> getVerse() {
        return this.verse;
    }

    public PoemInfo setDynasty(Slot<String> slot) {
        this.dynasty = Optional.e(slot);
        return this;
    }

    @Required
    public PoemInfo setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public PoemInfo setName(Slot<String> slot) {
        this.name = slot;
        return this;
    }

    public PoemInfo setPoet(Slot<String> slot) {
        this.poet = Optional.e(slot);
        return this;
    }

    public PoemInfo setProperty(Slot<String> slot) {
        this.property = Optional.e(slot);
        return this;
    }

    public PoemInfo setType(Slot<String> slot) {
        this.type = Optional.e(slot);
        return this;
    }

    public PoemInfo setVerse(Slot<String> slot) {
        this.verse = Optional.e(slot);
        return this;
    }

    public PoemInfo(T t) {
        this.entity_type = t;
    }

    public PoemInfo(T t, Slot<String> slot) {
        this.entity_type = t;
        this.name = slot;
    }
}
