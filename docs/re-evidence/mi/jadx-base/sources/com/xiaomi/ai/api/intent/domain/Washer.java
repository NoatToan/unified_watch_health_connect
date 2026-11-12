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
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Washer<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum WashDirtyLevel {
        Default(0, "Default"),
        Dirty(1, "Dirty"),
        NotDirty(2, "NotDirty");

        private int id;
        private String name;

        WashDirtyLevel(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static WashDirtyLevel find(String str) {
            for (WashDirtyLevel washDirtyLevel : values()) {
                if (washDirtyLevel.name.equals(str)) {
                    return washDirtyLevel;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static WashDirtyLevel read(String str) {
            return find(str);
        }

        public static String write(WashDirtyLevel washDirtyLevel) {
            return washDirtyLevel.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum WashMode {
        DailyWash(1, "DailyWash"),
        QuickWash(2, "QuickWash"),
        DelicateWash(3, "DelicateWash"),
        DownCoat(4, "DownCoat"),
        HeavyWash(5, "HeavyWash"),
        UserDefine(6, "UserDefine"),
        Rinse(7, "Rinse"),
        Spin(8, "Spin"),
        Cotton(9, "Cotton"),
        Synthetic(10, "Synthetic"),
        Shirt(11, "Shirt"),
        Boiling(12, "Boiling"),
        Wool(13, "Wool"),
        DrumClean(14, "DrumClean"),
        BabyCare(15, "BabyCare"),
        Intensive(16, "Intensive"),
        Jacket(17, "Jacket"),
        WashDry(18, "WashDry"),
        Underwear(19, "Underwear"),
        Dry(20, "Dry"),
        DryAirWash(21, "DryAirWash"),
        DryTiming(22, "DryTiming"),
        QuickWashDry(23, "QuickWashDry"),
        Silk(24, "Silk"),
        Soak(25, "Soak"),
        Sportswear(26, "Sportswear"),
        Mix(27, "Mix"),
        Sterilization(28, "Sterilization"),
        RinseSpin(29, "RinseSpin"),
        Smart(30, "Smart"),
        MiteRemoval(31, "MiteRemoval"),
        NewClothesWash(32, "NewClothesWash"),
        AromatherapyWash(33, "AromatherapyWash"),
        PleasedWashDry(34, "PleasedWashDry"),
        SteamIroning(35, "SteamIroning");

        private int id;
        private String name;

        WashMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static WashMode find(String str) {
            for (WashMode washMode : values()) {
                if (washMode.name.equals(str)) {
                    return washMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static WashMode read(String str) {
            return find(str);
        }

        public static String write(WashMode washMode) {
            return washMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum WashStainsType {
        UnKnown(0, "UnKnown"),
        Protein(1, "Protein"),
        NonProtein(2, "NonProtein");

        private int id;
        private String name;

        WashStainsType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static WashStainsType find(String str) {
            for (WashStainsType washStainsType : values()) {
                if (washStainsType.name.equals(str)) {
                    return washStainsType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static WashStainsType read(String str) {
            return find(str);
        }

        public static String write(WashStainsType washStainsType) {
            return washStainsType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class alarm implements EntityType {
        public static alarm read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new alarm();
        }

        public static c4h write(alarm alarmVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class childLock implements EntityType {
        public static childLock read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new childLock();
        }

        public static c4h write(childLock childlock) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class detergentLeftLevel implements EntityType {
        public static detergentLeftLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new detergentLeftLevel();
        }

        public static c4h write(detergentLeftLevel detergentleftlevel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dirtyLevel implements EntityType {
        private Optional<Slot<WashDirtyLevel>> name = Optional.a();

        public static dirtyLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            dirtyLevel dirtylevel = new dirtyLevel();
            if (zsdVar.z("name")) {
                dirtylevel.setName(IntentUtils.readSlot(zsdVar.w("name"), WashDirtyLevel.class));
            }
            return dirtylevel;
        }

        public static c4h write(dirtyLevel dirtylevel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (dirtylevel.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(dirtylevel.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<WashDirtyLevel>> getName() {
            return this.name;
        }

        public dirtyLevel setName(Slot<WashDirtyLevel> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class door implements EntityType {
        public static door read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new door();
        }

        public static c4h write(door doorVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dryingTime implements EntityType {
        private Optional<Slot<Miai.Number>> number = Optional.a();
        private Optional<Slot<Miai.Number>> level = Optional.a();

        public static dryingTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            dryingTime dryingtime = new dryingTime();
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                dryingtime.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            if (zsdVar.z("level")) {
                dryingtime.setLevel(IntentUtils.readSlot(zsdVar.w("level"), Miai.Number.class));
            }
            return dryingtime;
        }

        public static c4h write(dryingTime dryingtime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (dryingtime.number.c()) {
                c4hVarCreateObjectNode.f0(RealNameWebViewActivity.NUMBER, IntentUtils.writeSlot(dryingtime.number.b()));
            }
            if (dryingtime.level.c()) {
                c4hVarCreateObjectNode.f0("level", IntentUtils.writeSlot(dryingtime.level.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getLevel() {
            return this.level;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public dryingTime setLevel(Slot<Miai.Number> slot) {
            this.level = Optional.e(slot);
            return this;
        }

        public dryingTime setNumber(Slot<Miai.Number> slot) {
            this.number = Optional.e(slot);
            return this;
        }
    }

    public static class fabricSoftenerLeftLevel implements EntityType {
        public static fabricSoftenerLeftLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new fabricSoftenerLeftLevel();
        }

        public static c4h write(fabricSoftenerLeftLevel fabricsoftenerleftlevel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class leftTime implements EntityType {
        public static leftTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new leftTime();
        }

        public static c4h write(leftTime lefttime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<WashMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), WashMode.class));
            }
            return modeVar;
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (modeVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(modeVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<WashMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<WashMode> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class rinshTimes implements EntityType {
        private Optional<Slot<Miai.Number>> number = Optional.a();
        private Optional<Slot<Miai.Number>> lever = Optional.a();

        public static rinshTimes read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            rinshTimes rinshtimes = new rinshTimes();
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                rinshtimes.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            if (zsdVar.z("lever")) {
                rinshtimes.setLever(IntentUtils.readSlot(zsdVar.w("lever"), Miai.Number.class));
            }
            return rinshtimes;
        }

        public static c4h write(rinshTimes rinshtimes) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (rinshtimes.number.c()) {
                c4hVarCreateObjectNode.f0(RealNameWebViewActivity.NUMBER, IntentUtils.writeSlot(rinshtimes.number.b()));
            }
            if (rinshtimes.lever.c()) {
                c4hVarCreateObjectNode.f0("lever", IntentUtils.writeSlot(rinshtimes.lever.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getLever() {
            return this.lever;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public rinshTimes setLever(Slot<Miai.Number> slot) {
            this.lever = Optional.e(slot);
            return this;
        }

        public rinshTimes setNumber(Slot<Miai.Number> slot) {
            this.number = Optional.e(slot);
            return this;
        }
    }

    public static class runStatus implements EntityType {
        public static runStatus read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new runStatus();
        }

        public static c4h write(runStatus runstatus) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class selfDelivery implements EntityType {
        public static selfDelivery read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new selfDelivery();
        }

        public static c4h write(selfDelivery selfdelivery) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class soakTime implements EntityType {
        public static soakTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new soakTime();
        }

        public static c4h write(soakTime soaktime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class spinSpeed implements EntityType {
        private Optional<Slot<Miai.Number>> number = Optional.a();
        private Optional<Slot<Miai.Number>> lever = Optional.a();

        public static spinSpeed read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            spinSpeed spinspeed = new spinSpeed();
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                spinspeed.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            if (zsdVar.z("lever")) {
                spinspeed.setLever(IntentUtils.readSlot(zsdVar.w("lever"), Miai.Number.class));
            }
            return spinspeed;
        }

        public static c4h write(spinSpeed spinspeed) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (spinspeed.number.c()) {
                c4hVarCreateObjectNode.f0(RealNameWebViewActivity.NUMBER, IntentUtils.writeSlot(spinspeed.number.b()));
            }
            if (spinspeed.lever.c()) {
                c4hVarCreateObjectNode.f0("lever", IntentUtils.writeSlot(spinspeed.lever.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getLever() {
            return this.lever;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public spinSpeed setLever(Slot<Miai.Number> slot) {
            this.lever = Optional.e(slot);
            return this;
        }

        public spinSpeed setNumber(Slot<Miai.Number> slot) {
            this.number = Optional.e(slot);
            return this;
        }
    }

    public static class stainsType implements EntityType {
        private Optional<Slot<WashStainsType>> name = Optional.a();

        public static stainsType read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            stainsType stainstype = new stainsType();
            if (zsdVar.z("name")) {
                stainstype.setName(IntentUtils.readSlot(zsdVar.w("name"), WashStainsType.class));
            }
            return stainstype;
        }

        public static c4h write(stainsType stainstype) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (stainstype.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(stainstype.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<WashStainsType>> getName() {
            return this.name;
        }

        public stainsType setName(Slot<WashStainsType> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class temperature implements EntityType {
        private Optional<Slot<Miai.Number>> number = Optional.a();
        private Optional<Slot<Miai.Number>> level = Optional.a();

        public static temperature read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            temperature temperatureVar = new temperature();
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                temperatureVar.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            if (zsdVar.z("level")) {
                temperatureVar.setLevel(IntentUtils.readSlot(zsdVar.w("level"), Miai.Number.class));
            }
            return temperatureVar;
        }

        public static c4h write(temperature temperatureVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (temperatureVar.number.c()) {
                c4hVarCreateObjectNode.f0(RealNameWebViewActivity.NUMBER, IntentUtils.writeSlot(temperatureVar.number.b()));
            }
            if (temperatureVar.level.c()) {
                c4hVarCreateObjectNode.f0("level", IntentUtils.writeSlot(temperatureVar.level.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getLevel() {
            return this.level;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public temperature setLevel(Slot<Miai.Number> slot) {
            this.level = Optional.e(slot);
            return this;
        }

        public temperature setNumber(Slot<Miai.Number> slot) {
            this.number = Optional.e(slot);
            return this;
        }
    }

    public Washer() {
    }

    public static Washer read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Washer washer = new Washer(IntentUtils.readEntityType(zsdVar, AIApiConstants.Washer.NAME, optional));
        if (zsdVar.z("device")) {
            washer.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            washer.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            washer.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            washer.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            washer.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            washer.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            washer.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return washer;
    }

    public static zsd write(Washer washer) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(washer.entity_type);
        if (washer.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(washer.device.b()));
        }
        if (washer.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(washer.room.b()));
        }
        if (washer.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(washer.is_all_to_operate.b()));
        }
        if (washer.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(washer.sub_category.b()));
        }
        if (washer.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(washer.service_entity.b()));
        }
        if (washer.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(washer.description.b()));
        }
        if (washer.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(washer.timing.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getDescription() {
        return this.description;
    }

    public Optional<Slot<String>> getDevice() {
        return this.device;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Boolean>> getIsAllToOperate() {
        return this.is_all_to_operate;
    }

    public Optional<Slot<String>> getRoom() {
        return this.room;
    }

    public Optional<Slot<String>> getServiceEntity() {
        return this.service_entity;
    }

    public Optional<Slot<String>> getSubCategory() {
        return this.sub_category;
    }

    public Optional<Slot<Miai.Datetime>> getTiming() {
        return this.timing;
    }

    public Washer setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public Washer setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public Washer setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Washer setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public Washer setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public Washer setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public Washer setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public Washer setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public Washer(T t) {
        this.entity_type = t;
    }
}
