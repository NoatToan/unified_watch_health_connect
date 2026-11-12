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
public class WallpaperApp<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> package_name;

    public static class font implements EntityType {
        public static font read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new font();
        }

        public static c4h write(font fontVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
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

    public static class ring implements EntityType {
        public static ring read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new ring();
        }

        public static c4h write(ring ringVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class transparent implements EntityType {
        public static transparent read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new transparent();
        }

        public static c4h write(transparent transparentVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public WallpaperApp() {
    }

    public static WallpaperApp read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        WallpaperApp wallpaperApp = new WallpaperApp(IntentUtils.readEntityType(zsdVar, AIApiConstants.WallpaperApp.NAME, optional));
        wallpaperApp.setPackageName(IntentUtils.readSlot(zsdVar.w("package_name"), String.class));
        return wallpaperApp;
    }

    public static zsd write(WallpaperApp wallpaperApp) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(wallpaperApp.entity_type);
        c4hVar.f0("package_name", IntentUtils.writeSlot(wallpaperApp.package_name));
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
    public WallpaperApp setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public WallpaperApp setPackageName(Slot<String> slot) {
        this.package_name = slot;
        return this;
    }

    public WallpaperApp(T t) {
        this.entity_type = t;
    }

    public WallpaperApp(T t, Slot<String> slot) {
        this.entity_type = t;
        this.package_name = slot;
    }
}
