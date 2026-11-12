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
public class PersonEntity<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<Integer> more;

    @Required
    private Slot<Miai.Artist> name;
    private Optional<Slot<Knowledge.Lexicon>> lexicon = Optional.a();
    private Optional<Slot<Knowledge.Individual>> individual = Optional.a();
    private Optional<Slot<Knowledge.InfoBox>> info_box = Optional.a();
    private Optional<Slot<String>> modifiers = Optional.a();
    private Optional<Slot<Knowledge.SemanticInfo>> semantic_info = Optional.a();

    public static class direct implements EntityType {
        public static direct read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new direct();
        }

        public static c4h write(direct directVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class governmentOfficials implements EntityType {
        public static governmentOfficials read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new governmentOfficials();
        }

        public static c4h write(governmentOfficials governmentofficials) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class hop1 implements EntityType {
        public static hop1 read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new hop1();
        }

        public static c4h write(hop1 hop1Var) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class specified implements EntityType {
        public static specified read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new specified();
        }

        public static c4h write(specified specifiedVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class weibo implements EntityType {
        public static weibo read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new weibo();
        }

        public static c4h write(weibo weiboVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public PersonEntity() {
    }

    public static PersonEntity read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PersonEntity personEntity = new PersonEntity(IntentUtils.readEntityType(zsdVar, AIApiConstants.PersonEntity.NAME, optional));
        personEntity.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.Artist.class));
        if (zsdVar.z("lexicon")) {
            personEntity.setLexicon(IntentUtils.readSlot(zsdVar.w("lexicon"), Knowledge.Lexicon.class));
        }
        personEntity.setMore(IntentUtils.readSlot(zsdVar.w("more"), Integer.class));
        if (zsdVar.z("individual")) {
            personEntity.setIndividual(IntentUtils.readSlot(zsdVar.w("individual"), Knowledge.Individual.class));
        }
        if (zsdVar.z("info_box")) {
            personEntity.setInfoBox(IntentUtils.readSlot(zsdVar.w("info_box"), Knowledge.InfoBox.class));
        }
        if (zsdVar.z("modifiers")) {
            personEntity.setModifiers(IntentUtils.readSlot(zsdVar.w("modifiers"), String.class));
        }
        if (zsdVar.z("semantic_info")) {
            personEntity.setSemanticInfo(IntentUtils.readSlot(zsdVar.w("semantic_info"), Knowledge.SemanticInfo.class));
        }
        return personEntity;
    }

    public static zsd write(PersonEntity personEntity) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(personEntity.entity_type);
        c4hVar.f0("name", IntentUtils.writeSlot(personEntity.name));
        if (personEntity.lexicon.c()) {
            c4hVar.f0("lexicon", IntentUtils.writeSlot(personEntity.lexicon.b()));
        }
        c4hVar.f0("more", IntentUtils.writeSlot(personEntity.more));
        if (personEntity.individual.c()) {
            c4hVar.f0("individual", IntentUtils.writeSlot(personEntity.individual.b()));
        }
        if (personEntity.info_box.c()) {
            c4hVar.f0("info_box", IntentUtils.writeSlot(personEntity.info_box.b()));
        }
        if (personEntity.modifiers.c()) {
            c4hVar.f0("modifiers", IntentUtils.writeSlot(personEntity.modifiers.b()));
        }
        if (personEntity.semantic_info.c()) {
            c4hVar.f0("semantic_info", IntentUtils.writeSlot(personEntity.semantic_info.b()));
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

    public Optional<Slot<Knowledge.Individual>> getIndividual() {
        return this.individual;
    }

    public Optional<Slot<Knowledge.InfoBox>> getInfoBox() {
        return this.info_box;
    }

    public Optional<Slot<Knowledge.Lexicon>> getLexicon() {
        return this.lexicon;
    }

    public Optional<Slot<String>> getModifiers() {
        return this.modifiers;
    }

    @Required
    public Slot<Integer> getMore() {
        return this.more;
    }

    @Required
    public Slot<Miai.Artist> getName() {
        return this.name;
    }

    public Optional<Slot<Knowledge.SemanticInfo>> getSemanticInfo() {
        return this.semantic_info;
    }

    @Required
    public PersonEntity setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public PersonEntity setIndividual(Slot<Knowledge.Individual> slot) {
        this.individual = Optional.e(slot);
        return this;
    }

    public PersonEntity setInfoBox(Slot<Knowledge.InfoBox> slot) {
        this.info_box = Optional.e(slot);
        return this;
    }

    public PersonEntity setLexicon(Slot<Knowledge.Lexicon> slot) {
        this.lexicon = Optional.e(slot);
        return this;
    }

    public PersonEntity setModifiers(Slot<String> slot) {
        this.modifiers = Optional.e(slot);
        return this;
    }

    @Required
    public PersonEntity setMore(Slot<Integer> slot) {
        this.more = slot;
        return this;
    }

    @Required
    public PersonEntity setName(Slot<Miai.Artist> slot) {
        this.name = slot;
        return this;
    }

    public PersonEntity setSemanticInfo(Slot<Knowledge.SemanticInfo> slot) {
        this.semantic_info = Optional.e(slot);
        return this;
    }

    public PersonEntity(T t) {
        this.entity_type = t;
    }

    public PersonEntity(T t, Slot<Miai.Artist> slot, Slot<Integer> slot2) {
        this.entity_type = t;
        this.name = slot;
        this.more = slot2;
    }
}
