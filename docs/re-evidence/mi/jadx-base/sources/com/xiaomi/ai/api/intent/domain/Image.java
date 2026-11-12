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
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Image<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<Tag>> tag = Optional.a();
    private Optional<Slot<String>> content = Optional.a();

    public enum Season {
        Spring(0, "Spring"),
        Summer(1, "Summer"),
        Autumn(2, "Autumn"),
        Winter(3, "Winter");

        private int id;
        private String name;

        Season(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static Season find(String str) {
            for (Season season : values()) {
                if (season.name.equals(str)) {
                    return season;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static Season read(String str) {
            return find(str);
        }

        public static String write(Season season) {
            return season.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum Tag {
        MiCar(0, "MiCar");

        private int id;
        private String name;

        Tag(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static Tag find(String str) {
            for (Tag tag : values()) {
                if (tag.name.equals(str)) {
                    return tag;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static Tag read(String str) {
            return find(str);
        }

        public static String write(Tag tag) {
            return tag.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class changeBackground implements EntityType {
        public static changeBackground read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new changeBackground();
        }

        public static c4h write(changeBackground changebackground) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class changeSeason implements EntityType {
        private Optional<Slot<Season>> season = Optional.a();
        private Optional<Slot<Boolean>> use_original = Optional.a();

        public static changeSeason read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            changeSeason changeseason = new changeSeason();
            if (zsdVar.z("season")) {
                changeseason.setSeason(IntentUtils.readSlot(zsdVar.w("season"), Season.class));
            }
            if (zsdVar.z("use_original")) {
                changeseason.setUseOriginal(IntentUtils.readSlot(zsdVar.w("use_original"), Boolean.class));
            }
            return changeseason;
        }

        public static c4h write(changeSeason changeseason) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (changeseason.season.c()) {
                c4hVarCreateObjectNode.f0("season", IntentUtils.writeSlot(changeseason.season.b()));
            }
            if (changeseason.use_original.c()) {
                c4hVarCreateObjectNode.f0("use_original", IntentUtils.writeSlot(changeseason.use_original.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Season>> getSeason() {
            return this.season;
        }

        public Optional<Slot<Boolean>> getUseOriginal() {
            return this.use_original;
        }

        public changeSeason setSeason(Slot<Season> slot) {
            this.season = Optional.e(slot);
            return this;
        }

        public changeSeason setUseOriginal(Slot<Boolean> slot) {
            this.use_original = Optional.e(slot);
            return this;
        }
    }

    public static class changeStyle implements EntityType {
        private Optional<Slot<String>> imageStyle = Optional.a();

        public static changeStyle read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            changeStyle changestyle = new changeStyle();
            if (zsdVar.z("imageStyle")) {
                changestyle.setImageStyle(IntentUtils.readSlot(zsdVar.w("imageStyle"), String.class));
            }
            return changestyle;
        }

        public static c4h write(changeStyle changestyle) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (changestyle.imageStyle.c()) {
                c4hVarCreateObjectNode.f0("imageStyle", IntentUtils.writeSlot(changestyle.imageStyle.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getImageStyle() {
            return this.imageStyle;
        }

        public changeStyle setImageStyle(Slot<String> slot) {
            this.imageStyle = Optional.e(slot);
            return this;
        }
    }

    public static class expansion implements EntityType {
        private Optional<Slot<Double>> times = Optional.a();
        private Optional<Slot<Boolean>> use_original = Optional.a();

        public static expansion read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            expansion expansionVar = new expansion();
            if (zsdVar.z("times")) {
                expansionVar.setTimes(IntentUtils.readSlot(zsdVar.w("times"), Double.class));
            }
            if (zsdVar.z("use_original")) {
                expansionVar.setUseOriginal(IntentUtils.readSlot(zsdVar.w("use_original"), Boolean.class));
            }
            return expansionVar;
        }

        public static c4h write(expansion expansionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (expansionVar.times.c()) {
                c4hVarCreateObjectNode.f0("times", IntentUtils.writeSlot(expansionVar.times.b()));
            }
            if (expansionVar.use_original.c()) {
                c4hVarCreateObjectNode.f0("use_original", IntentUtils.writeSlot(expansionVar.use_original.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Double>> getTimes() {
            return this.times;
        }

        public Optional<Slot<Boolean>> getUseOriginal() {
            return this.use_original;
        }

        public expansion setTimes(Slot<Double> slot) {
            this.times = Optional.e(slot);
            return this;
        }

        public expansion setUseOriginal(Slot<Boolean> slot) {
            this.use_original = Optional.e(slot);
            return this;
        }
    }

    public static class guide implements EntityType {
        public static guide read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new guide();
        }

        public static c4h write(guide guideVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class regenerate implements EntityType {
        public static regenerate read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new regenerate();
        }

        public static c4h write(regenerate regenerateVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class removePedestrian implements EntityType {
        private Optional<Slot<String>> region = Optional.a();
        private Optional<Slot<Boolean>> use_original = Optional.a();

        public static removePedestrian read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            removePedestrian removepedestrian = new removePedestrian();
            if (zsdVar.z("region")) {
                removepedestrian.setRegion(IntentUtils.readSlot(zsdVar.w("region"), String.class));
            }
            if (zsdVar.z("use_original")) {
                removepedestrian.setUseOriginal(IntentUtils.readSlot(zsdVar.w("use_original"), Boolean.class));
            }
            return removepedestrian;
        }

        public static c4h write(removePedestrian removepedestrian) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (removepedestrian.region.c()) {
                c4hVarCreateObjectNode.f0("region", IntentUtils.writeSlot(removepedestrian.region.b()));
            }
            if (removepedestrian.use_original.c()) {
                c4hVarCreateObjectNode.f0("use_original", IntentUtils.writeSlot(removepedestrian.use_original.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getRegion() {
            return this.region;
        }

        public Optional<Slot<Boolean>> getUseOriginal() {
            return this.use_original;
        }

        public removePedestrian setRegion(Slot<String> slot) {
            this.region = Optional.e(slot);
            return this;
        }

        public removePedestrian setUseOriginal(Slot<Boolean> slot) {
            this.use_original = Optional.e(slot);
            return this;
        }
    }

    public static class todoFeature implements EntityType {
        public static todoFeature read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new todoFeature();
        }

        public static c4h write(todoFeature todofeature) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Image() {
    }

    public static Image read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Image image = new Image(IntentUtils.readEntityType(zsdVar, AIApiConstants.Image.NAME, optional));
        if (zsdVar.z("tag")) {
            image.setTag(IntentUtils.readSlot(zsdVar.w("tag"), Tag.class));
        }
        if (zsdVar.z(MiuiCursorConstants.CONTENT)) {
            image.setContent(IntentUtils.readSlot(zsdVar.w(MiuiCursorConstants.CONTENT), String.class));
        }
        return image;
    }

    public static zsd write(Image image) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(image.entity_type);
        if (image.tag.c()) {
            c4hVar.f0("tag", IntentUtils.writeSlot(image.tag.b()));
        }
        if (image.content.c()) {
            c4hVar.f0(MiuiCursorConstants.CONTENT, IntentUtils.writeSlot(image.content.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getContent() {
        return this.content;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Tag>> getTag() {
        return this.tag;
    }

    public Image setContent(Slot<String> slot) {
        this.content = Optional.e(slot);
        return this;
    }

    @Required
    public Image setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Image setTag(Slot<Tag> slot) {
        this.tag = Optional.e(slot);
        return this;
    }

    public Image(T t) {
        this.entity_type = t;
    }
}
