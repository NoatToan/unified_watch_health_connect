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
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Joke<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<AudienceType>> audience = Optional.a();
    private Optional<Slot<String>> tag = Optional.a();
    private Optional<Slot<String>> keyword = Optional.a();
    private Optional<Slot<Boolean>> contains = Optional.a();

    public enum AudienceType {
        Children(1, "Children"),
        Public(2, "Public"),
        Adult(3, "Adult");

        private int id;
        private String name;

        AudienceType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static AudienceType find(String str) {
            for (AudienceType audienceType : values()) {
                if (audienceType.name.equals(str)) {
                    return audienceType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static AudienceType read(String str) {
            return find(str);
        }

        public static String write(AudienceType audienceType) {
            return audienceType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class poisonSoup implements EntityType {
        public static poisonSoup read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new poisonSoup();
        }

        public static c4h write(poisonSoup poisonsoup) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class tongueTwister implements EntityType {
        public static tongueTwister read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new tongueTwister();
        }

        public static c4h write(tongueTwister tonguetwister) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Joke() {
    }

    public static Joke read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Joke joke = new Joke(IntentUtils.readEntityType(zsdVar, AIApiConstants.Joke.NAME, optional));
        if (zsdVar.z("audience")) {
            joke.setAudience(IntentUtils.readSlot(zsdVar.w("audience"), AudienceType.class));
        }
        if (zsdVar.z("tag")) {
            joke.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
        }
        if (zsdVar.z(TSMAuthContants.PARAM_KEYWORD)) {
            joke.setKeyword(IntentUtils.readSlot(zsdVar.w(TSMAuthContants.PARAM_KEYWORD), String.class));
        }
        if (zsdVar.z("contains")) {
            joke.setContains(IntentUtils.readSlot(zsdVar.w("contains"), Boolean.class));
        }
        return joke;
    }

    public static zsd write(Joke joke) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(joke.entity_type);
        if (joke.audience.c()) {
            c4hVar.f0("audience", IntentUtils.writeSlot(joke.audience.b()));
        }
        if (joke.tag.c()) {
            c4hVar.f0("tag", IntentUtils.writeSlot(joke.tag.b()));
        }
        if (joke.keyword.c()) {
            c4hVar.f0(TSMAuthContants.PARAM_KEYWORD, IntentUtils.writeSlot(joke.keyword.b()));
        }
        if (joke.contains.c()) {
            c4hVar.f0("contains", IntentUtils.writeSlot(joke.contains.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<AudienceType>> getAudience() {
        return this.audience;
    }

    public Optional<Slot<Boolean>> getContains() {
        return this.contains;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getKeyword() {
        return this.keyword;
    }

    public Optional<Slot<String>> getTag() {
        return this.tag;
    }

    public Joke setAudience(Slot<AudienceType> slot) {
        this.audience = Optional.e(slot);
        return this;
    }

    public Joke setContains(Slot<Boolean> slot) {
        this.contains = Optional.e(slot);
        return this;
    }

    @Required
    public Joke setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Joke setKeyword(Slot<String> slot) {
        this.keyword = Optional.e(slot);
        return this;
    }

    public Joke setTag(Slot<String> slot) {
        this.tag = Optional.e(slot);
        return this;
    }

    public Joke(T t) {
        this.entity_type = t;
    }
}
