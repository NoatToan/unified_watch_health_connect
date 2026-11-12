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
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Calendar<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<CalendarType> type;
    private Optional<Slot<Miai.Datetime>> start_time = Optional.a();
    private Optional<Slot<TimeType>> start_time_type = Optional.a();
    private Optional<Slot<Boolean>> is_start_time_festival = Optional.a();
    private Optional<Slot<Miai.Datetime>> end_time = Optional.a();
    private Optional<Slot<TimeType>> end_time_type = Optional.a();
    private Optional<Slot<Boolean>> is_end_time_festival = Optional.a();
    private Optional<Slot<Miai.Timezone>> timezone = Optional.a();
    private Optional<Slot<String>> target = Optional.a();
    private Optional<Slot<Integer>> day_index = Optional.a();
    private Optional<Slot<String>> season = Optional.a();
    private Optional<Slot<String>> festival_tag = Optional.a();
    private Optional<Slot<String>> unit = Optional.a();
    private Optional<Slot<Boolean>> remains = Optional.a();

    public enum CalendarType {
        Lunar(1, "lunar"),
        Solar(2, "solar"),
        Factoid_lunar(3, "factoid_lunar");

        private int id;
        private String name;

        CalendarType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static CalendarType find(String str) {
            for (CalendarType calendarType : values()) {
                if (calendarType.name.equals(str)) {
                    return calendarType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static CalendarType read(String str) {
            return find(str);
        }

        public static String write(CalendarType calendarType) {
            return calendarType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum TimeType {
        Date(1, DialWidgetType.DATE),
        Duration(2, "duration"),
        LunarDate(3, "LunarDate");

        private int id;
        private String name;

        TimeType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static TimeType find(String str) {
            for (TimeType timeType : values()) {
                if (timeType.name.equals(str)) {
                    return timeType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static TimeType read(String str) {
            return find(str);
        }

        public static String write(TimeType timeType) {
            return timeType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class abroadWeekDay implements EntityType {
        public static abroadWeekDay read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new abroadWeekDay();
        }

        public static c4h write(abroadWeekDay abroadweekday) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class age implements EntityType {
        public static age read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new age();
        }

        public static c4h write(age ageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class birthday implements EntityType {
        private Optional<Slot<Integer>> age = Optional.a();

        public static birthday read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            birthday birthdayVar = new birthday();
            if (zsdVar.z("age")) {
                birthdayVar.setAge(IntentUtils.readSlot(zsdVar.w("age"), Integer.class));
            }
            return birthdayVar;
        }

        public static c4h write(birthday birthdayVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (birthdayVar.age.c()) {
                c4hVarCreateObjectNode.f0("age", IntentUtils.writeSlot(birthdayVar.age.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Integer>> getAge() {
            return this.age;
        }

        public birthday setAge(Slot<Integer> slot) {
            this.age = Optional.e(slot);
            return this;
        }
    }

    public static class dateExist implements EntityType {
        public static dateExist read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new dateExist();
        }

        public static c4h write(dateExist dateexist) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class festivalDate implements EntityType {
        public static festivalDate read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new festivalDate();
        }

        public static c4h write(festivalDate festivaldate) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class festivalTime implements EntityType {
        public static festivalTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new festivalTime();
        }

        public static c4h write(festivalTime festivaltime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class holidayArrangements implements EntityType {
        public static holidayArrangements read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new holidayArrangements();
        }

        public static c4h write(holidayArrangements holidayarrangements) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class interval implements EntityType {
        public static interval read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new interval();
        }

        public static c4h write(interval intervalVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class intervalToFutureDate implements EntityType {
        public static intervalToFutureDate read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new intervalToFutureDate();
        }

        public static c4h write(intervalToFutureDate intervaltofuturedate) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class intervalToFutureFestival implements EntityType {
        public static intervalToFutureFestival read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new intervalToFutureFestival();
        }

        public static c4h write(intervalToFutureFestival intervaltofuturefestival) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class intervalToFutureTime implements EntityType {
        public static intervalToFutureTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new intervalToFutureTime();
        }

        public static c4h write(intervalToFutureTime intervaltofuturetime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class intervalToPastDate implements EntityType {
        public static intervalToPastDate read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new intervalToPastDate();
        }

        public static c4h write(intervalToPastDate intervaltopastdate) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class intervalToPastFestival implements EntityType {
        public static intervalToPastFestival read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new intervalToPastFestival();
        }

        public static c4h write(intervalToPastFestival intervaltopastfestival) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class intervalToPastTime implements EntityType {
        public static intervalToPastTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new intervalToPastTime();
        }

        public static c4h write(intervalToPastTime intervaltopasttime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class leapMonth implements EntityType {
        public static leapMonth read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new leapMonth();
        }

        public static c4h write(leapMonth leapmonth) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class leapYear implements EntityType {
        public static leapYear read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new leapYear();
        }

        public static c4h write(leapYear leapyear) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class localDate implements EntityType {
        public static localDate read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new localDate();
        }

        public static c4h write(localDate localdate) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class localTime implements EntityType {
        public static localTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new localTime();
        }

        public static c4h write(localTime localtime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class localWeekDay implements EntityType {
        public static localWeekDay read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new localWeekDay();
        }

        public static c4h write(localWeekDay localweekday) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class nearestFestival implements EntityType {
        public static nearestFestival read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new nearestFestival();
        }

        public static c4h write(nearestFestival nearestfestival) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class shujiu implements EntityType {
        private Optional<Slot<Integer>> index = Optional.a();

        public static shujiu read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            shujiu shujiuVar = new shujiu();
            if (zsdVar.z("index")) {
                shujiuVar.setIndex(IntentUtils.readSlot(zsdVar.w("index"), Integer.class));
            }
            return shujiuVar;
        }

        public static c4h write(shujiu shujiuVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (shujiuVar.index.c()) {
                c4hVarCreateObjectNode.f0("index", IntentUtils.writeSlot(shujiuVar.index.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Integer>> getIndex() {
            return this.index;
        }

        public shujiu setIndex(Slot<Integer> slot) {
            this.index = Optional.e(slot);
            return this;
        }
    }

    public static class solarLunarConversion implements EntityType {
        public static solarLunarConversion read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new solarLunarConversion();
        }

        public static c4h write(solarLunarConversion solarlunarconversion) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class tgdz implements EntityType {
        public static tgdz read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new tgdz();
        }

        public static c4h write(tgdz tgdzVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class weekOfDuration implements EntityType {
        public static weekOfDuration read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new weekOfDuration();
        }

        public static c4h write(weekOfDuration weekofduration) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class workday implements EntityType {
        public static workday read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new workday();
        }

        public static c4h write(workday workdayVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class worldDate implements EntityType {
        public static worldDate read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new worldDate();
        }

        public static c4h write(worldDate worlddate) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class worldTime implements EntityType {
        public static worldTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new worldTime();
        }

        public static c4h write(worldTime worldtime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Calendar() {
    }

    public static Calendar read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Calendar calendar = new Calendar(IntentUtils.readEntityType(zsdVar, AIApiConstants.Calendar.NAME, optional));
        calendar.setType(IntentUtils.readSlot(zsdVar.w("type"), CalendarType.class));
        if (zsdVar.z(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)) {
            calendar.setStartTime(IntentUtils.readSlot(zsdVar.w(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME), Miai.Datetime.class));
        }
        if (zsdVar.z("start_time_type")) {
            calendar.setStartTimeType(IntentUtils.readSlot(zsdVar.w("start_time_type"), TimeType.class));
        }
        if (zsdVar.z("is_start_time_festival")) {
            calendar.setIsStartTimeFestival(IntentUtils.readSlot(zsdVar.w("is_start_time_festival"), Boolean.class));
        }
        if (zsdVar.z(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)) {
            calendar.setEndTime(IntentUtils.readSlot(zsdVar.w(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME), Miai.Datetime.class));
        }
        if (zsdVar.z("end_time_type")) {
            calendar.setEndTimeType(IntentUtils.readSlot(zsdVar.w("end_time_type"), TimeType.class));
        }
        if (zsdVar.z("is_end_time_festival")) {
            calendar.setIsEndTimeFestival(IntentUtils.readSlot(zsdVar.w("is_end_time_festival"), Boolean.class));
        }
        if (zsdVar.z("timezone")) {
            calendar.setTimezone(IntentUtils.readSlot(zsdVar.w("timezone"), Miai.Timezone.class));
        }
        if (zsdVar.z("target")) {
            calendar.setTarget(IntentUtils.readSlot(zsdVar.w("target"), String.class));
        }
        if (zsdVar.z("day_index")) {
            calendar.setDayIndex(IntentUtils.readSlot(zsdVar.w("day_index"), Integer.class));
        }
        if (zsdVar.z("season")) {
            calendar.setSeason(IntentUtils.readSlot(zsdVar.w("season"), String.class));
        }
        if (zsdVar.z("festival_tag")) {
            calendar.setFestivalTag(IntentUtils.readSlot(zsdVar.w("festival_tag"), String.class));
        }
        if (zsdVar.z("unit")) {
            calendar.setUnit(IntentUtils.readSlot(zsdVar.w("unit"), String.class));
        }
        if (zsdVar.z("remains")) {
            calendar.setRemains(IntentUtils.readSlot(zsdVar.w("remains"), Boolean.class));
        }
        return calendar;
    }

    public static zsd write(Calendar calendar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(calendar.entity_type);
        c4hVar.f0("type", IntentUtils.writeSlot(calendar.type));
        if (calendar.start_time.c()) {
            c4hVar.f0(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, IntentUtils.writeSlot(calendar.start_time.b()));
        }
        if (calendar.start_time_type.c()) {
            c4hVar.f0("start_time_type", IntentUtils.writeSlot(calendar.start_time_type.b()));
        }
        if (calendar.is_start_time_festival.c()) {
            c4hVar.f0("is_start_time_festival", IntentUtils.writeSlot(calendar.is_start_time_festival.b()));
        }
        if (calendar.end_time.c()) {
            c4hVar.f0(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, IntentUtils.writeSlot(calendar.end_time.b()));
        }
        if (calendar.end_time_type.c()) {
            c4hVar.f0("end_time_type", IntentUtils.writeSlot(calendar.end_time_type.b()));
        }
        if (calendar.is_end_time_festival.c()) {
            c4hVar.f0("is_end_time_festival", IntentUtils.writeSlot(calendar.is_end_time_festival.b()));
        }
        if (calendar.timezone.c()) {
            c4hVar.f0("timezone", IntentUtils.writeSlot(calendar.timezone.b()));
        }
        if (calendar.target.c()) {
            c4hVar.f0("target", IntentUtils.writeSlot(calendar.target.b()));
        }
        if (calendar.day_index.c()) {
            c4hVar.f0("day_index", IntentUtils.writeSlot(calendar.day_index.b()));
        }
        if (calendar.season.c()) {
            c4hVar.f0("season", IntentUtils.writeSlot(calendar.season.b()));
        }
        if (calendar.festival_tag.c()) {
            c4hVar.f0("festival_tag", IntentUtils.writeSlot(calendar.festival_tag.b()));
        }
        if (calendar.unit.c()) {
            c4hVar.f0("unit", IntentUtils.writeSlot(calendar.unit.b()));
        }
        if (calendar.remains.c()) {
            c4hVar.f0("remains", IntentUtils.writeSlot(calendar.remains.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Integer>> getDayIndex() {
        return this.day_index;
    }

    public Optional<Slot<Miai.Datetime>> getEndTime() {
        return this.end_time;
    }

    public Optional<Slot<TimeType>> getEndTimeType() {
        return this.end_time_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getFestivalTag() {
        return this.festival_tag;
    }

    public Optional<Slot<Boolean>> getIsEndTimeFestival() {
        return this.is_end_time_festival;
    }

    public Optional<Slot<Boolean>> getIsStartTimeFestival() {
        return this.is_start_time_festival;
    }

    public Optional<Slot<Boolean>> getRemains() {
        return this.remains;
    }

    public Optional<Slot<String>> getSeason() {
        return this.season;
    }

    public Optional<Slot<Miai.Datetime>> getStartTime() {
        return this.start_time;
    }

    public Optional<Slot<TimeType>> getStartTimeType() {
        return this.start_time_type;
    }

    public Optional<Slot<String>> getTarget() {
        return this.target;
    }

    public Optional<Slot<Miai.Timezone>> getTimezone() {
        return this.timezone;
    }

    @Required
    public Slot<CalendarType> getType() {
        return this.type;
    }

    public Optional<Slot<String>> getUnit() {
        return this.unit;
    }

    public Calendar setDayIndex(Slot<Integer> slot) {
        this.day_index = Optional.e(slot);
        return this;
    }

    public Calendar setEndTime(Slot<Miai.Datetime> slot) {
        this.end_time = Optional.e(slot);
        return this;
    }

    public Calendar setEndTimeType(Slot<TimeType> slot) {
        this.end_time_type = Optional.e(slot);
        return this;
    }

    @Required
    public Calendar setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Calendar setFestivalTag(Slot<String> slot) {
        this.festival_tag = Optional.e(slot);
        return this;
    }

    public Calendar setIsEndTimeFestival(Slot<Boolean> slot) {
        this.is_end_time_festival = Optional.e(slot);
        return this;
    }

    public Calendar setIsStartTimeFestival(Slot<Boolean> slot) {
        this.is_start_time_festival = Optional.e(slot);
        return this;
    }

    public Calendar setRemains(Slot<Boolean> slot) {
        this.remains = Optional.e(slot);
        return this;
    }

    public Calendar setSeason(Slot<String> slot) {
        this.season = Optional.e(slot);
        return this;
    }

    public Calendar setStartTime(Slot<Miai.Datetime> slot) {
        this.start_time = Optional.e(slot);
        return this;
    }

    public Calendar setStartTimeType(Slot<TimeType> slot) {
        this.start_time_type = Optional.e(slot);
        return this;
    }

    public Calendar setTarget(Slot<String> slot) {
        this.target = Optional.e(slot);
        return this;
    }

    public Calendar setTimezone(Slot<Miai.Timezone> slot) {
        this.timezone = Optional.e(slot);
        return this;
    }

    @Required
    public Calendar setType(Slot<CalendarType> slot) {
        this.type = slot;
        return this;
    }

    public Calendar setUnit(Slot<String> slot) {
        this.unit = Optional.e(slot);
        return this;
    }

    public Calendar(T t) {
        this.entity_type = t;
    }

    public Calendar(T t, Slot<CalendarType> slot) {
        this.entity_type = t;
        this.type = slot;
    }
}
