package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
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
public class PersonInfo<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<Integer> more;

    @Required
    private Slot<Miai.Artist> name;
    private Optional<Slot<Knowledge.Lexicon>> lexicon = Optional.a();
    private Optional<Slot<Knowledge.Individual>> individual = Optional.a();
    private Optional<Slot<Knowledge.InfoBox>> info_box = Optional.a();

    public PersonInfo() {
    }

    public static PersonInfo read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PersonInfo personInfo = new PersonInfo();
        personInfo.setName(IntentUtils.readSlot(zsdVar.w("name"), Miai.Artist.class));
        if (zsdVar.z("lexicon")) {
            personInfo.setLexicon(IntentUtils.readSlot(zsdVar.w("lexicon"), Knowledge.Lexicon.class));
        }
        personInfo.setMore(IntentUtils.readSlot(zsdVar.w("more"), Integer.class));
        if (zsdVar.z("individual")) {
            personInfo.setIndividual(IntentUtils.readSlot(zsdVar.w("individual"), Knowledge.Individual.class));
        }
        if (zsdVar.z("info_box")) {
            personInfo.setInfoBox(IntentUtils.readSlot(zsdVar.w("info_box"), Knowledge.InfoBox.class));
        }
        return personInfo;
    }

    public static zsd write(PersonInfo personInfo) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(personInfo.name));
        if (personInfo.lexicon.c()) {
            c4hVarCreateObjectNode.f0("lexicon", IntentUtils.writeSlot(personInfo.lexicon.b()));
        }
        c4hVarCreateObjectNode.f0("more", IntentUtils.writeSlot(personInfo.more));
        if (personInfo.individual.c()) {
            c4hVarCreateObjectNode.f0("individual", IntentUtils.writeSlot(personInfo.individual.b()));
        }
        if (personInfo.info_box.c()) {
            c4hVarCreateObjectNode.f0("info_box", IntentUtils.writeSlot(personInfo.info_box.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
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

    @Required
    public Slot<Integer> getMore() {
        return this.more;
    }

    @Required
    public Slot<Miai.Artist> getName() {
        return this.name;
    }

    public PersonInfo setIndividual(Slot<Knowledge.Individual> slot) {
        this.individual = Optional.e(slot);
        return this;
    }

    public PersonInfo setInfoBox(Slot<Knowledge.InfoBox> slot) {
        this.info_box = Optional.e(slot);
        return this;
    }

    public PersonInfo setLexicon(Slot<Knowledge.Lexicon> slot) {
        this.lexicon = Optional.e(slot);
        return this;
    }

    @Required
    public PersonInfo setMore(Slot<Integer> slot) {
        this.more = slot;
        return this;
    }

    @Required
    public PersonInfo setName(Slot<Miai.Artist> slot) {
        this.name = slot;
        return this;
    }

    public PersonInfo(Slot<Miai.Artist> slot, Slot<Integer> slot2) {
        this.name = slot;
        this.more = slot2;
    }
}
