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
public class Youku<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> package_name;

    public static class channel implements EntityType {

        @Required
        private Slot<String> name;

        public channel() {
        }

        public channel(Slot<String> slot) {
            this.name = slot;
        }

        public static channel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            channel channelVar = new channel();
            channelVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return channelVar;
        }

        public static c4h write(channel channelVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(channelVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public channel setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class danmu implements EntityType {
        public static danmu read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new danmu();
        }

        public static c4h write(danmu danmuVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class fullScreen implements EntityType {
        public static fullScreen read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new fullScreen();
        }

        public static c4h write(fullScreen fullscreen) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
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

    public static class screenProjection implements EntityType {
        public static screenProjection read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new screenProjection();
        }

        public static c4h write(screenProjection screenprojection) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class videoName implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static videoName read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            videoName videoname = new videoName();
            if (zsdVar.z("name")) {
                videoname.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return videoname;
        }

        public static c4h write(videoName videoname) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (videoname.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(videoname.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public videoName setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public Youku() {
    }

    public static Youku read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Youku youku = new Youku(IntentUtils.readEntityType(zsdVar, AIApiConstants.Youku.NAME, optional));
        youku.setPackageName(IntentUtils.readSlot(zsdVar.w("package_name"), String.class));
        return youku;
    }

    public static zsd write(Youku youku) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(youku.entity_type);
        c4hVar.f0("package_name", IntentUtils.writeSlot(youku.package_name));
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
    public Slot<String> getPackageName() {
        return this.package_name;
    }

    @Required
    public Youku setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public Youku setPackageName(Slot<String> slot) {
        this.package_name = slot;
        return this;
    }

    public Youku(T t) {
        this.entity_type = t;
    }

    public Youku(T t, Slot<String> slot) {
        this.entity_type = t;
        this.package_name = slot;
    }
}
