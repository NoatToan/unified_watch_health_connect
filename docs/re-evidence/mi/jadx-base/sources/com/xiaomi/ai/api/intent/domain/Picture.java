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
public class Picture<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> tag = Optional.a();

    public static class __static implements EntityType {
        public static __static read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new __static();
        }

        public static c4h write(__static __staticVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dynamic implements EntityType {
        public static dynamic read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new dynamic();
        }

        public static c4h write(dynamic dynamicVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class emoticon implements EntityType {
        public static emoticon read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new emoticon();
        }

        public static c4h write(emoticon emoticonVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class handCopy implements EntityType {
        public static handCopy read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new handCopy();
        }

        public static c4h write(handCopy handcopy) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class map implements EntityType {
        public static map read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new map();
        }

        public static c4h write(map mapVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class stickFigure implements EntityType {
        public static stickFigure read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new stickFigure();
        }

        public static c4h write(stickFigure stickfigure) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class wallpaper implements EntityType {
        public static wallpaper read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new wallpaper();
        }

        public static c4h write(wallpaper wallpaperVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Picture() {
    }

    public static Picture read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Picture picture = new Picture(IntentUtils.readEntityType(zsdVar, AIApiConstants.Picture.NAME, optional));
        if (zsdVar.z("tag")) {
            picture.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
        }
        return picture;
    }

    public static zsd write(Picture picture) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(picture.entity_type);
        if (picture.tag.c()) {
            c4hVar.f0("tag", IntentUtils.writeSlot(picture.tag.b()));
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

    public Optional<Slot<String>> getTag() {
        return this.tag;
    }

    @Required
    public Picture setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Picture setTag(Slot<String> slot) {
        this.tag = Optional.e(slot);
        return this;
    }

    public Picture(T t) {
        this.entity_type = t;
    }
}
