package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
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
public class Sound<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> type;
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<Boolean>> single_loop = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<String>> last_name = Optional.a();
    private Optional<Slot<String>> last_text = Optional.a();
    private Optional<Slot<String>> subject = Optional.a();
    private Optional<Slot<Integer>> play_times = Optional.a();
    private Optional<Slot<Integer>> offset = Optional.a();

    public Sound() {
    }

    public static Sound read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Sound sound = new Sound();
        sound.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
        if (zsdVar.z("name")) {
            sound.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("single_loop")) {
            sound.setSingleLoop(IntentUtils.readSlot(zsdVar.w("single_loop"), Boolean.class));
        }
        if (zsdVar.z("description")) {
            sound.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("last_name")) {
            sound.setLastName(IntentUtils.readSlot(zsdVar.w("last_name"), String.class));
        }
        if (zsdVar.z("last_text")) {
            sound.setLastText(IntentUtils.readSlot(zsdVar.w("last_text"), String.class));
        }
        if (zsdVar.z("subject")) {
            sound.setSubject(IntentUtils.readSlot(zsdVar.w("subject"), String.class));
        }
        if (zsdVar.z("play_times")) {
            sound.setPlayTimes(IntentUtils.readSlot(zsdVar.w("play_times"), Integer.class));
        }
        if (zsdVar.z("offset")) {
            sound.setOffset(IntentUtils.readSlot(zsdVar.w("offset"), Integer.class));
        }
        return sound;
    }

    public static zsd write(Sound sound) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(sound.type));
        if (sound.name.c()) {
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(sound.name.b()));
        }
        if (sound.single_loop.c()) {
            c4hVarCreateObjectNode.f0("single_loop", IntentUtils.writeSlot(sound.single_loop.b()));
        }
        if (sound.description.c()) {
            c4hVarCreateObjectNode.f0("description", IntentUtils.writeSlot(sound.description.b()));
        }
        if (sound.last_name.c()) {
            c4hVarCreateObjectNode.f0("last_name", IntentUtils.writeSlot(sound.last_name.b()));
        }
        if (sound.last_text.c()) {
            c4hVarCreateObjectNode.f0("last_text", IntentUtils.writeSlot(sound.last_text.b()));
        }
        if (sound.subject.c()) {
            c4hVarCreateObjectNode.f0("subject", IntentUtils.writeSlot(sound.subject.b()));
        }
        if (sound.play_times.c()) {
            c4hVarCreateObjectNode.f0("play_times", IntentUtils.writeSlot(sound.play_times.b()));
        }
        if (sound.offset.c()) {
            c4hVarCreateObjectNode.f0("offset", IntentUtils.writeSlot(sound.offset.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getDescription() {
        return this.description;
    }

    public Optional<Slot<String>> getLastName() {
        return this.last_name;
    }

    public Optional<Slot<String>> getLastText() {
        return this.last_text;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<Integer>> getOffset() {
        return this.offset;
    }

    public Optional<Slot<Integer>> getPlayTimes() {
        return this.play_times;
    }

    public Optional<Slot<Boolean>> getSingleLoop() {
        return this.single_loop;
    }

    public Optional<Slot<String>> getSubject() {
        return this.subject;
    }

    @Required
    public Slot<String> getType() {
        return this.type;
    }

    public Sound setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public Sound setLastName(Slot<String> slot) {
        this.last_name = Optional.e(slot);
        return this;
    }

    public Sound setLastText(Slot<String> slot) {
        this.last_text = Optional.e(slot);
        return this;
    }

    public Sound setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public Sound setOffset(Slot<Integer> slot) {
        this.offset = Optional.e(slot);
        return this;
    }

    public Sound setPlayTimes(Slot<Integer> slot) {
        this.play_times = Optional.e(slot);
        return this;
    }

    public Sound setSingleLoop(Slot<Boolean> slot) {
        this.single_loop = Optional.e(slot);
        return this;
    }

    public Sound setSubject(Slot<String> slot) {
        this.subject = Optional.e(slot);
        return this;
    }

    @Required
    public Sound setType(Slot<String> slot) {
        this.type = slot;
        return this;
    }

    public Sound(Slot<String> slot) {
        this.type = slot;
    }
}
