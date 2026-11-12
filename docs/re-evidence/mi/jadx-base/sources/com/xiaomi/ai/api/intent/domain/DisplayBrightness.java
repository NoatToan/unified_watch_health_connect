package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
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
public class DisplayBrightness<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<Miai.Number>> value = Optional.a();
    private Optional<Slot<Miai.Duration>> delay = Optional.a();

    public enum DisplayBrightnessPage {
        LuminousScreen(1, "luminousScreen");

        private int id;
        private String name;

        DisplayBrightnessPage(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DisplayBrightnessPage find(String str) {
            for (DisplayBrightnessPage displayBrightnessPage : values()) {
                if (displayBrightnessPage.name.equals(str)) {
                    return displayBrightnessPage;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DisplayBrightnessPage read(String str) {
            return find(str);
        }

        public static String write(DisplayBrightnessPage displayBrightnessPage) {
            return displayBrightnessPage.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum DisplayParam {
        Contrast(1, "Contrast"),
        Saturation(2, "Saturation"),
        Clarity(3, "Clarity"),
        ColorTemp(4, "ColorTemp"),
        Hue(5, "Hue"),
        Backlight(6, "Backlight");

        private int id;
        private String name;

        DisplayParam(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DisplayParam find(String str) {
            for (DisplayParam displayParam : values()) {
                if (displayParam.name.equals(str)) {
                    return displayParam;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DisplayParam read(String str) {
            return find(str);
        }

        public static String write(DisplayParam displayParam) {
            return displayParam.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class antiFlickerMode implements EntityType {
        public static antiFlickerMode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new antiFlickerMode();
        }

        public static c4h write(antiFlickerMode antiflickermode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class automatic implements EntityType {

        @Deprecated
        private Optional<Slot<Miai.Duration>> delay = Optional.a();

        public static automatic read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            automatic automaticVar = new automatic();
            if (zsdVar.z("delay")) {
                automaticVar.setDelay(IntentUtils.readSlot(zsdVar.w("delay"), Miai.Duration.class));
            }
            return automaticVar;
        }

        public static c4h write(automatic automaticVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (automaticVar.delay.c()) {
                c4hVarCreateObjectNode.f0("delay", IntentUtils.writeSlot(automaticVar.delay.b()));
            }
            return c4hVarCreateObjectNode;
        }

        @Deprecated
        public Optional<Slot<Miai.Duration>> getDelay() {
            return this.delay;
        }

        @Deprecated
        public automatic setDelay(Slot<Miai.Duration> slot) {
            this.delay = Optional.e(slot);
            return this;
        }
    }

    public static class darkMode implements EntityType {
        public static darkMode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new darkMode();
        }

        public static c4h write(darkMode darkmode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class distanceProtection implements EntityType {
        public static distanceProtection read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new distanceProtection();
        }

        public static c4h write(distanceProtection distanceprotection) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class eyeProtection implements EntityType {
        public static eyeProtection read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new eyeProtection();
        }

        public static c4h write(eyeProtection eyeprotection) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class luminousScreen implements EntityType {
        public static luminousScreen read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new luminousScreen();
        }

        public static c4h write(luminousScreen luminousscreen) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class param implements EntityType {
        private Optional<Slot<DisplayParam>> name = Optional.a();

        public static param read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            param paramVar = new param();
            if (zsdVar.z("name")) {
                paramVar.setName(IntentUtils.readSlot(zsdVar.w("name"), DisplayParam.class));
            }
            return paramVar;
        }

        public static c4h write(param paramVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (paramVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(paramVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<DisplayParam>> getName() {
            return this.name;
        }

        public param setName(Slot<DisplayParam> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class screenBangs implements EntityType {
        public static screenBangs read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new screenBangs();
        }

        public static c4h write(screenBangs screenbangs) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class setting implements EntityType {
        public static setting read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new setting();
        }

        public static c4h write(setting settingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public DisplayBrightness() {
    }

    public static DisplayBrightness read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        DisplayBrightness displayBrightness = new DisplayBrightness(IntentUtils.readEntityType(zsdVar, AIApiConstants.DisplayBrightness.NAME, optional));
        if (zsdVar.z("value")) {
            displayBrightness.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
        }
        if (zsdVar.z("delay")) {
            displayBrightness.setDelay(IntentUtils.readSlot(zsdVar.w("delay"), Miai.Duration.class));
        }
        return displayBrightness;
    }

    public static zsd write(DisplayBrightness displayBrightness) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(displayBrightness.entity_type);
        if (displayBrightness.value.c()) {
            c4hVar.f0("value", IntentUtils.writeSlot(displayBrightness.value.b()));
        }
        if (displayBrightness.delay.c()) {
            c4hVar.f0("delay", IntentUtils.writeSlot(displayBrightness.delay.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.Duration>> getDelay() {
        return this.delay;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.Number>> getValue() {
        return this.value;
    }

    public DisplayBrightness setDelay(Slot<Miai.Duration> slot) {
        this.delay = Optional.e(slot);
        return this;
    }

    @Required
    public DisplayBrightness setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public DisplayBrightness setValue(Slot<Miai.Number> slot) {
        this.value = Optional.e(slot);
        return this;
    }

    public DisplayBrightness(T t) {
        this.entity_type = t;
    }
}
