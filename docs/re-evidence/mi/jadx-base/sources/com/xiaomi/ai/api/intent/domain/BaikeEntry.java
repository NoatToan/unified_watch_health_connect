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
public class BaikeEntry<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<Boolean> fuzzy;

    @Required
    private Slot<IdentifyMode> identify;

    @Required
    private Slot<Integer> more;

    @Required
    private Slot<String> name;
    private Optional<Slot<String>> type = Optional.a();
    private Optional<Slot<Knowledge.Individual>> individual = Optional.a();
    private Optional<Slot<Knowledge.Lexicon>> lexicon = Optional.a();

    public enum IdentifyMode {
        NotBaike(0, "NotBaike"),
        IntentWeak(1, "IntentWeak"),
        IntentStrong(2, "IntentStrong");

        private int id;
        private String name;

        IdentifyMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static IdentifyMode find(String str) {
            for (IdentifyMode identifyMode : values()) {
                if (identifyMode.name.equals(str)) {
                    return identifyMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static IdentifyMode read(String str) {
            return find(str);
        }

        public static String write(IdentifyMode identifyMode) {
            return identifyMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class dinosaur implements EntityType {

        @Required
        private Slot<String> name;

        public dinosaur() {
        }

        public dinosaur(Slot<String> slot) {
            this.name = slot;
        }

        public static dinosaur read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            dinosaur dinosaurVar = new dinosaur();
            dinosaurVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return dinosaurVar;
        }

        public static c4h write(dinosaur dinosaurVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(dinosaurVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public dinosaur setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class history implements EntityType {
        public static history read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new history();
        }

        public static c4h write(history historyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class more implements EntityType {
        public static more read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new more();
        }

        public static c4h write(more moreVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public BaikeEntry() {
    }

    public static BaikeEntry read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        BaikeEntry baikeEntry = new BaikeEntry(IntentUtils.readEntityType(zsdVar, AIApiConstants.BaikeEntry.NAME, optional));
        baikeEntry.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        baikeEntry.setMore(IntentUtils.readSlot(zsdVar.w("more"), Integer.class));
        baikeEntry.setFuzzy(IntentUtils.readSlot(zsdVar.w("fuzzy"), Boolean.class));
        if (zsdVar.z("type")) {
            baikeEntry.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
        }
        if (zsdVar.z("individual")) {
            baikeEntry.setIndividual(IntentUtils.readSlot(zsdVar.w("individual"), Knowledge.Individual.class));
        }
        baikeEntry.setIdentify(IntentUtils.readSlot(zsdVar.w("identify"), IdentifyMode.class));
        if (zsdVar.z("lexicon")) {
            baikeEntry.setLexicon(IntentUtils.readSlot(zsdVar.w("lexicon"), Knowledge.Lexicon.class));
        }
        return baikeEntry;
    }

    public static zsd write(BaikeEntry baikeEntry) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(baikeEntry.entity_type);
        c4hVar.f0("name", IntentUtils.writeSlot(baikeEntry.name));
        c4hVar.f0("more", IntentUtils.writeSlot(baikeEntry.more));
        c4hVar.f0("fuzzy", IntentUtils.writeSlot(baikeEntry.fuzzy));
        if (baikeEntry.type.c()) {
            c4hVar.f0("type", IntentUtils.writeSlot(baikeEntry.type.b()));
        }
        if (baikeEntry.individual.c()) {
            c4hVar.f0("individual", IntentUtils.writeSlot(baikeEntry.individual.b()));
        }
        c4hVar.f0("identify", IntentUtils.writeSlot(baikeEntry.identify));
        if (baikeEntry.lexicon.c()) {
            c4hVar.f0("lexicon", IntentUtils.writeSlot(baikeEntry.lexicon.b()));
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

    @Required
    public Slot<Boolean> getFuzzy() {
        return this.fuzzy;
    }

    @Required
    public Slot<IdentifyMode> getIdentify() {
        return this.identify;
    }

    public Optional<Slot<Knowledge.Individual>> getIndividual() {
        return this.individual;
    }

    public Optional<Slot<Knowledge.Lexicon>> getLexicon() {
        return this.lexicon;
    }

    @Required
    public Slot<Integer> getMore() {
        return this.more;
    }

    @Required
    public Slot<String> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getType() {
        return this.type;
    }

    @Required
    public BaikeEntry setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public BaikeEntry setFuzzy(Slot<Boolean> slot) {
        this.fuzzy = slot;
        return this;
    }

    @Required
    public BaikeEntry setIdentify(Slot<IdentifyMode> slot) {
        this.identify = slot;
        return this;
    }

    public BaikeEntry setIndividual(Slot<Knowledge.Individual> slot) {
        this.individual = Optional.e(slot);
        return this;
    }

    public BaikeEntry setLexicon(Slot<Knowledge.Lexicon> slot) {
        this.lexicon = Optional.e(slot);
        return this;
    }

    @Required
    public BaikeEntry setMore(Slot<Integer> slot) {
        this.more = slot;
        return this;
    }

    @Required
    public BaikeEntry setName(Slot<String> slot) {
        this.name = slot;
        return this;
    }

    public BaikeEntry setType(Slot<String> slot) {
        this.type = Optional.e(slot);
        return this;
    }

    public BaikeEntry(T t) {
        this.entity_type = t;
    }

    public BaikeEntry(T t, Slot<String> slot, Slot<Integer> slot2, Slot<Boolean> slot3, Slot<IdentifyMode> slot4) {
        this.entity_type = t;
        this.name = slot;
        this.more = slot2;
        this.fuzzy = slot3;
        this.identify = slot4;
    }
}
