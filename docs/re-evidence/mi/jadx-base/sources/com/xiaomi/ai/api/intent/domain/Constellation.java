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
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Constellation<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> name = Optional.a();

    public enum AttributeType {
        Character(1, "Character"),
        Advantage(3, "Advantage"),
        DisAdvantage(4, "DisAdvantage"),
        MeritsFaults(5, "MeritsFaults"),
        Duration(6, "Duration"),
        EnglishName(7, "EnglishName"),
        Ruler(8, "Ruler"),
        Numen(9, "Numen"),
        Element(10, "Element"),
        Symbol(11, "Symbol"),
        Ranking(12, "Ranking"),
        Prophecy(13, "Prophecy"),
        Pairing(14, "Pairing"),
        Social(15, "Social");

        private int id;
        private String name;

        AttributeType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static AttributeType find(String str) {
            for (AttributeType attributeType : values()) {
                if (attributeType.name.equals(str)) {
                    return attributeType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static AttributeType read(String str) {
            return find(str);
        }

        public static String write(AttributeType attributeType) {
            return attributeType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum FortuneType {
        Love(1, "Love"),
        Career(2, "Career"),
        Wealth(3, "Wealth"),
        AllFortune(4, "AllFortune");

        private int id;
        private String name;

        FortuneType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static FortuneType find(String str) {
            for (FortuneType fortuneType : values()) {
                if (fortuneType.name.equals(str)) {
                    return fortuneType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static FortuneType read(String str) {
            return find(str);
        }

        public static String write(FortuneType fortuneType) {
            return fortuneType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum LuckyType {
        Number(1, "Number"),
        Color(2, "Color"),
        Direction(3, "Direction"),
        Time(4, "Time");

        private int id;
        private String name;

        LuckyType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static LuckyType find(String str) {
            for (LuckyType luckyType : values()) {
                if (luckyType.name.equals(str)) {
                    return luckyType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static LuckyType read(String str) {
            return find(str);
        }

        public static String write(LuckyType luckyType) {
            return luckyType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum TimeUnit {
        Day(1, "Day"),
        Week(2, "Week"),
        Month(3, "Month"),
        Year(4, "Year");

        private int id;
        private String name;

        TimeUnit(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static TimeUnit find(String str) {
            for (TimeUnit timeUnit : values()) {
                if (timeUnit.name.equals(str)) {
                    return timeUnit;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static TimeUnit read(String str) {
            return find(str);
        }

        public static String write(TimeUnit timeUnit) {
            return timeUnit.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class attribute implements EntityType {

        @Required
        private Slot<AttributeType> type;

        public attribute() {
        }

        public attribute(Slot<AttributeType> slot) {
            this.type = slot;
        }

        public static attribute read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            attribute attributeVar = new attribute();
            attributeVar.setType(IntentUtils.readSlot(zsdVar.w("type"), AttributeType.class));
            return attributeVar;
        }

        public static c4h write(attribute attributeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(attributeVar.type));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<AttributeType> getType() {
            return this.type;
        }

        @Required
        public attribute setType(Slot<AttributeType> slot) {
            this.type = slot;
            return this;
        }
    }

    public static class byDesc implements EntityType {

        @Required
        private Slot<String> name;

        public byDesc() {
        }

        public byDesc(Slot<String> slot) {
            this.name = slot;
        }

        public static byDesc read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            byDesc bydesc = new byDesc();
            bydesc.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return bydesc;
        }

        public static c4h write(byDesc bydesc) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(bydesc.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public byDesc setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class matching implements EntityType {
        public static matching read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new matching();
        }

        public static c4h write(matching matchingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Constellation() {
    }

    public static Constellation read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Constellation constellation = new Constellation(IntentUtils.readEntityType(zsdVar, AIApiConstants.Constellation.NAME, optional));
        if (zsdVar.z("name")) {
            constellation.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        return constellation;
    }

    public static zsd write(Constellation constellation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(constellation.entity_type);
        if (constellation.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(constellation.name.b()));
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

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    @Required
    public Constellation setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Constellation setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public static class fortune implements EntityType {
        private Optional<Slot<Miai.Date>> date = Optional.a();

        @Required
        private Slot<TimeUnit> time_unit;

        @Required
        private Slot<FortuneType> type;

        public fortune() {
        }

        public static fortune read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            fortune fortuneVar = new fortune();
            fortuneVar.setType(IntentUtils.readSlot(zsdVar.w("type"), FortuneType.class));
            fortuneVar.setTimeUnit(IntentUtils.readSlot(zsdVar.w("time_unit"), TimeUnit.class));
            if (zsdVar.z(DialWidgetType.DATE)) {
                fortuneVar.setDate(IntentUtils.readSlot(zsdVar.w(DialWidgetType.DATE), Miai.Date.class));
            }
            return fortuneVar;
        }

        public static c4h write(fortune fortuneVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(fortuneVar.type));
            c4hVarCreateObjectNode.f0("time_unit", IntentUtils.writeSlot(fortuneVar.time_unit));
            if (fortuneVar.date.c()) {
                c4hVarCreateObjectNode.f0(DialWidgetType.DATE, IntentUtils.writeSlot(fortuneVar.date.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Date>> getDate() {
            return this.date;
        }

        @Required
        public Slot<TimeUnit> getTimeUnit() {
            return this.time_unit;
        }

        @Required
        public Slot<FortuneType> getType() {
            return this.type;
        }

        public fortune setDate(Slot<Miai.Date> slot) {
            this.date = Optional.e(slot);
            return this;
        }

        @Required
        public fortune setTimeUnit(Slot<TimeUnit> slot) {
            this.time_unit = slot;
            return this;
        }

        @Required
        public fortune setType(Slot<FortuneType> slot) {
            this.type = slot;
            return this;
        }

        public fortune(Slot<FortuneType> slot, Slot<TimeUnit> slot2) {
            this.type = slot;
            this.time_unit = slot2;
        }
    }

    public static class luckyThing implements EntityType {
        private Optional<Slot<Miai.Date>> date = Optional.a();

        @Required
        private Slot<LuckyType> type;

        public luckyThing() {
        }

        public static luckyThing read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            luckyThing luckything = new luckyThing();
            luckything.setType(IntentUtils.readSlot(zsdVar.w("type"), LuckyType.class));
            if (zsdVar.z(DialWidgetType.DATE)) {
                luckything.setDate(IntentUtils.readSlot(zsdVar.w(DialWidgetType.DATE), Miai.Date.class));
            }
            return luckything;
        }

        public static c4h write(luckyThing luckything) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(luckything.type));
            if (luckything.date.c()) {
                c4hVarCreateObjectNode.f0(DialWidgetType.DATE, IntentUtils.writeSlot(luckything.date.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Date>> getDate() {
            return this.date;
        }

        @Required
        public Slot<LuckyType> getType() {
            return this.type;
        }

        public luckyThing setDate(Slot<Miai.Date> slot) {
            this.date = Optional.e(slot);
            return this;
        }

        @Required
        public luckyThing setType(Slot<LuckyType> slot) {
            this.type = slot;
            return this;
        }

        public luckyThing(Slot<LuckyType> slot) {
            this.type = slot;
        }
    }

    public Constellation(T t) {
        this.entity_type = t;
    }
}
