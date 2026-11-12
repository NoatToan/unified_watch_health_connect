package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.miui.tsmclient.net.TSMAuthContants;
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
public class CloseIntent<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> keyword = Optional.a();

    public enum Event {
        Music(1, "Music"),
        Radio(2, "Radio"),
        Album(3, "Album"),
        Playlist(4, "Playlist"),
        Broadcast(5, "Broadcast");

        private int id;
        private String name;

        Event(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static Event find(String str) {
            for (Event event : values()) {
                if (event.name.equals(str)) {
                    return event;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static Event read(String str) {
            return find(str);
        }

        public static String write(Event event) {
            return event.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class afterEvent implements EntityType {
        private Optional<Slot<Event>> name = Optional.a();

        public static afterEvent read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            afterEvent afterevent = new afterEvent();
            if (zsdVar.z("name")) {
                afterevent.setName(IntentUtils.readSlot(zsdVar.w("name"), Event.class));
            }
            return afterevent;
        }

        public static c4h write(afterEvent afterevent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (afterevent.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(afterevent.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Event>> getName() {
            return this.name;
        }

        public afterEvent setName(Slot<Event> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class timer implements EntityType {
        private Optional<Slot<Miai.Duration>> duration = Optional.a();

        public static timer read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            timer timerVar = new timer();
            if (zsdVar.z("duration")) {
                timerVar.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
            }
            return timerVar;
        }

        public static c4h write(timer timerVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (timerVar.duration.c()) {
                c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(timerVar.duration.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Duration>> getDuration() {
            return this.duration;
        }

        public timer setDuration(Slot<Miai.Duration> slot) {
            this.duration = Optional.e(slot);
            return this;
        }
    }

    public CloseIntent() {
    }

    public static CloseIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        CloseIntent closeIntent = new CloseIntent(IntentUtils.readEntityType(zsdVar, AIApiConstants.CloseIntent.NAME, optional));
        if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
            closeIntent.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
        }
        return closeIntent;
    }

    public static zsd write(CloseIntent closeIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(closeIntent.entity_type);
        if (closeIntent.keyword.c()) {
            c4hVar.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(closeIntent.keyword.b()));
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

    public Optional<Slot<String>> getKeyword() {
        return this.keyword;
    }

    @Required
    public CloseIntent setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public CloseIntent setKeyword(Slot<String> slot) {
        this.keyword = Optional.e(slot);
        return this;
    }

    public CloseIntent(T t) {
        this.entity_type = t;
    }
}
