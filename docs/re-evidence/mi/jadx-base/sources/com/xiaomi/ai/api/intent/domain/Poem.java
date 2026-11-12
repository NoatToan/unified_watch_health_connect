package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
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
public class Poem<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> poet = Optional.a();
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<String>> dynasty = Optional.a();
    private Optional<Slot<String>> type = Optional.a();
    private Optional<Slot<String>> tag = Optional.a();
    private Optional<Slot<String>> verse = Optional.a();
    private Optional<Slot<String>> property = Optional.a();

    public static Poem read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Poem poem = new Poem();
        if (zsdVar.z("poet")) {
            poem.setPoet(IntentUtils.readSlot(zsdVar.w("poet"), String.class));
        }
        if (zsdVar.z("name")) {
            poem.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("dynasty")) {
            poem.setDynasty(IntentUtils.readSlot(zsdVar.w("dynasty"), String.class));
        }
        if (zsdVar.z("type")) {
            poem.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
        }
        if (zsdVar.z("tag")) {
            poem.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
        }
        if (zsdVar.z("verse")) {
            poem.setVerse(IntentUtils.readSlot(zsdVar.w("verse"), String.class));
        }
        if (zsdVar.z("property")) {
            poem.setProperty(IntentUtils.readSlot(zsdVar.w("property"), String.class));
        }
        return poem;
    }

    public static zsd write(Poem poem) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (poem.poet.c()) {
            c4hVarCreateObjectNode.f0("poet", IntentUtils.writeSlot(poem.poet.b()));
        }
        if (poem.name.c()) {
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(poem.name.b()));
        }
        if (poem.dynasty.c()) {
            c4hVarCreateObjectNode.f0("dynasty", IntentUtils.writeSlot(poem.dynasty.b()));
        }
        if (poem.type.c()) {
            c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(poem.type.b()));
        }
        if (poem.tag.c()) {
            c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(poem.tag.b()));
        }
        if (poem.verse.c()) {
            c4hVarCreateObjectNode.f0("verse", IntentUtils.writeSlot(poem.verse.b()));
        }
        if (poem.property.c()) {
            c4hVarCreateObjectNode.f0("property", IntentUtils.writeSlot(poem.property.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getDynasty() {
        return this.dynasty;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getPoet() {
        return this.poet;
    }

    public Optional<Slot<String>> getProperty() {
        return this.property;
    }

    public Optional<Slot<String>> getTag() {
        return this.tag;
    }

    public Optional<Slot<String>> getType() {
        return this.type;
    }

    public Optional<Slot<String>> getVerse() {
        return this.verse;
    }

    public Poem setDynasty(Slot<String> slot) {
        this.dynasty = Optional.e(slot);
        return this;
    }

    public Poem setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public Poem setPoet(Slot<String> slot) {
        this.poet = Optional.e(slot);
        return this;
    }

    public Poem setProperty(Slot<String> slot) {
        this.property = Optional.e(slot);
        return this;
    }

    public Poem setTag(Slot<String> slot) {
        this.tag = Optional.e(slot);
        return this;
    }

    public Poem setType(Slot<String> slot) {
        this.type = Optional.e(slot);
        return this;
    }

    public Poem setVerse(Slot<String> slot) {
        this.verse = Optional.e(slot);
        return this;
    }
}
