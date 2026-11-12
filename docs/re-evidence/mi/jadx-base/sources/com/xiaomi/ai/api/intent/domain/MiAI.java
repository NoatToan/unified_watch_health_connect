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
public class MiAI<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public enum ToneGender {
        Child(1, "Child"),
        Male(2, "Male"),
        Female(3, "Female");

        private int id;
        private String name;

        ToneGender(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ToneGender find(String str) {
            for (ToneGender toneGender : values()) {
                if (toneGender.name.equals(str)) {
                    return toneGender;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ToneGender read(String str) {
            return find(str);
        }

        public static String write(ToneGender toneGender) {
            return toneGender.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum ToneSource {
        Official(1, "Official"),
        Customer(2, "Customer");

        private int id;
        private String name;

        ToneSource(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ToneSource find(String str) {
            for (ToneSource toneSource : values()) {
                if (toneSource.name.equals(str)) {
                    return toneSource;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ToneSource read(String str) {
            return find(str);
        }

        public static String write(ToneSource toneSource) {
            return toneSource.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class Wakeup implements EntityType {
        public static Wakeup read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new Wakeup();
        }

        public static c4h write(Wakeup wakeup) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dialect implements EntityType {
        private Optional<Slot<String>> name = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();

        public static dialect read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            dialect dialectVar = new dialect();
            if (zsdVar.z("name")) {
                dialectVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            if (zsdVar.z("tag")) {
                dialectVar.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
            }
            return dialectVar;
        }

        public static c4h write(dialect dialectVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (dialectVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(dialectVar.name.b()));
            }
            if (dialectVar.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(dialectVar.tag.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public dialect setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public dialect setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }
    }

    public static class page implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static page read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            page pageVar = new page();
            if (zsdVar.z("name")) {
                pageVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return pageVar;
        }

        public static c4h write(page pageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (pageVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(pageVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public page setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class timbre implements EntityType {
        private Optional<Slot<String>> name = Optional.a();
        private Optional<Slot<ToneGender>> tone_gender = Optional.a();
        private Optional<Slot<ToneSource>> tone_source = Optional.a();

        public static timbre read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            timbre timbreVar = new timbre();
            if (zsdVar.z("name")) {
                timbreVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            if (zsdVar.z("tone_gender")) {
                timbreVar.setToneGender(IntentUtils.readSlot(zsdVar.w("tone_gender"), ToneGender.class));
            }
            if (zsdVar.z("tone_source")) {
                timbreVar.setToneSource(IntentUtils.readSlot(zsdVar.w("tone_source"), ToneSource.class));
            }
            return timbreVar;
        }

        public static c4h write(timbre timbreVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (timbreVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(timbreVar.name.b()));
            }
            if (timbreVar.tone_gender.c()) {
                c4hVarCreateObjectNode.f0("tone_gender", IntentUtils.writeSlot(timbreVar.tone_gender.b()));
            }
            if (timbreVar.tone_source.c()) {
                c4hVarCreateObjectNode.f0("tone_source", IntentUtils.writeSlot(timbreVar.tone_source.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public Optional<Slot<ToneGender>> getToneGender() {
            return this.tone_gender;
        }

        public Optional<Slot<ToneSource>> getToneSource() {
            return this.tone_source;
        }

        public timbre setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public timbre setToneGender(Slot<ToneGender> slot) {
            this.tone_gender = Optional.e(slot);
            return this;
        }

        public timbre setToneSource(Slot<ToneSource> slot) {
            this.tone_source = Optional.e(slot);
            return this;
        }
    }

    public static class version implements EntityType {
        public static version read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new version();
        }

        public static c4h write(version versionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public MiAI() {
    }

    public static MiAI read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new MiAI(IntentUtils.readEntityType(zsdVar, AIApiConstants.MiAI.NAME, optional));
    }

    public static zsd write(MiAI miAI) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(miAI.entity_type);
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
    public MiAI setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public MiAI(T t) {
        this.entity_type = t;
    }
}
