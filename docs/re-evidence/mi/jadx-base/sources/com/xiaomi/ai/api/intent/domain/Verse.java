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
public class Verse<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> poet = Optional.a();
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<String>> dynasty = Optional.a();
    private Optional<Slot<String>> type = Optional.a();
    private Optional<Slot<String>> tag = Optional.a();
    private Optional<Slot<String>> property = Optional.a();

    public static Verse read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Verse verse = new Verse();
        if (zsdVar.z("poet")) {
            verse.setPoet(IntentUtils.readSlot(zsdVar.w("poet"), String.class));
        }
        if (zsdVar.z("name")) {
            verse.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("dynasty")) {
            verse.setDynasty(IntentUtils.readSlot(zsdVar.w("dynasty"), String.class));
        }
        if (zsdVar.z("type")) {
            verse.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
        }
        if (zsdVar.z("tag")) {
            verse.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
        }
        if (zsdVar.z("property")) {
            verse.setProperty(IntentUtils.readSlot(zsdVar.w("property"), String.class));
        }
        return verse;
    }

    public static zsd write(Verse verse) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (verse.poet.c()) {
            c4hVarCreateObjectNode.f0("poet", IntentUtils.writeSlot(verse.poet.b()));
        }
        if (verse.name.c()) {
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(verse.name.b()));
        }
        if (verse.dynasty.c()) {
            c4hVarCreateObjectNode.f0("dynasty", IntentUtils.writeSlot(verse.dynasty.b()));
        }
        if (verse.type.c()) {
            c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(verse.type.b()));
        }
        if (verse.tag.c()) {
            c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(verse.tag.b()));
        }
        if (verse.property.c()) {
            c4hVarCreateObjectNode.f0("property", IntentUtils.writeSlot(verse.property.b()));
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

    public Verse setDynasty(Slot<String> slot) {
        this.dynasty = Optional.e(slot);
        return this;
    }

    public Verse setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public Verse setPoet(Slot<String> slot) {
        this.poet = Optional.e(slot);
        return this;
    }

    public Verse setProperty(Slot<String> slot) {
        this.property = Optional.e(slot);
        return this;
    }

    public Verse setTag(Slot<String> slot) {
        this.tag = Optional.e(slot);
        return this;
    }

    public Verse setType(Slot<String> slot) {
        this.type = Optional.e(slot);
        return this;
    }
}
