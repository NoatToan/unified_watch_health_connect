package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mi.health.course.activity.CourseCatalogActivityKt;
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
public class Course<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<String>> teacher = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Integer>> class_num = Optional.a();
    private Optional<Slot<Integer>> week = Optional.a();
    private Optional<Slot<Integer>> weekday = Optional.a();
    private Optional<Slot<DayTimeTag>> day_time = Optional.a();
    private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
    private Optional<Slot<String>> previous_class = Optional.a();
    private Optional<Slot<String>> next_class = Optional.a();
    private Optional<Slot<String>> course_type = Optional.a();

    public enum DayTimeTag {
        Morning(1, "Morning"),
        Noon(2, "Noon"),
        AfterNoon(3, "AfterNoon"),
        Night(4, "Night");

        private int id;
        private String name;

        DayTimeTag(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DayTimeTag find(String str) {
            for (DayTimeTag dayTimeTag : values()) {
                if (dayTimeTag.name.equals(str)) {
                    return dayTimeTag;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DayTimeTag read(String str) {
            return find(str);
        }

        public static String write(DayTimeTag dayTimeTag) {
            return dayTimeTag.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class camera implements EntityType {
        public static camera read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new camera();
        }

        public static c4h write(camera cameraVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class content implements EntityType {
        public static content read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new content();
        }

        public static c4h write(content contentVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class count implements EntityType {
        public static count read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new count();
        }

        public static c4h write(count countVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class input implements EntityType {
        public static input read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new input();
        }

        public static c4h write(input inputVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class location implements EntityType {
        public static location read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new location();
        }

        public static c4h write(location locationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class teacher implements EntityType {
        public static teacher read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new teacher();
        }

        public static c4h write(teacher teacherVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class time implements EntityType {
        public static time read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new time();
        }

        public static c4h write(time timeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Course() {
    }

    public static Course read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Course course = new Course(IntentUtils.readEntityType(zsdVar, AIApiConstants.Course.NAME, optional));
        if (zsdVar.z("name")) {
            course.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("teacher")) {
            course.setTeacher(IntentUtils.readSlot(zsdVar.w("teacher"), String.class));
        }
        if (zsdVar.z("room")) {
            course.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("class_num")) {
            course.setClassNum(IntentUtils.readSlot(zsdVar.w("class_num"), Integer.class));
        }
        if (zsdVar.z("week")) {
            course.setWeek(IntentUtils.readSlot(zsdVar.w("week"), Integer.class));
        }
        if (zsdVar.z("weekday")) {
            course.setWeekday(IntentUtils.readSlot(zsdVar.w("weekday"), Integer.class));
        }
        if (zsdVar.z("day_time")) {
            course.setDayTime(IntentUtils.readSlot(zsdVar.w("day_time"), DayTimeTag.class));
        }
        if (zsdVar.z("datetime")) {
            course.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
        }
        if (zsdVar.z("previous_class")) {
            course.setPreviousClass(IntentUtils.readSlot(zsdVar.w("previous_class"), String.class));
        }
        if (zsdVar.z("next_class")) {
            course.setNextClass(IntentUtils.readSlot(zsdVar.w("next_class"), String.class));
        }
        if (zsdVar.z(CourseCatalogActivityKt.KEY_COURSER_TYPE)) {
            course.setCourseType(IntentUtils.readSlot(zsdVar.w(CourseCatalogActivityKt.KEY_COURSER_TYPE), String.class));
        }
        return course;
    }

    public static zsd write(Course course) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(course.entity_type);
        if (course.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(course.name.b()));
        }
        if (course.teacher.c()) {
            c4hVar.f0("teacher", IntentUtils.writeSlot(course.teacher.b()));
        }
        if (course.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(course.room.b()));
        }
        if (course.class_num.c()) {
            c4hVar.f0("class_num", IntentUtils.writeSlot(course.class_num.b()));
        }
        if (course.week.c()) {
            c4hVar.f0("week", IntentUtils.writeSlot(course.week.b()));
        }
        if (course.weekday.c()) {
            c4hVar.f0("weekday", IntentUtils.writeSlot(course.weekday.b()));
        }
        if (course.day_time.c()) {
            c4hVar.f0("day_time", IntentUtils.writeSlot(course.day_time.b()));
        }
        if (course.datetime.c()) {
            c4hVar.f0("datetime", IntentUtils.writeSlot(course.datetime.b()));
        }
        if (course.previous_class.c()) {
            c4hVar.f0("previous_class", IntentUtils.writeSlot(course.previous_class.b()));
        }
        if (course.next_class.c()) {
            c4hVar.f0("next_class", IntentUtils.writeSlot(course.next_class.b()));
        }
        if (course.course_type.c()) {
            c4hVar.f0(CourseCatalogActivityKt.KEY_COURSER_TYPE, IntentUtils.writeSlot(course.course_type.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Integer>> getClassNum() {
        return this.class_num;
    }

    public Optional<Slot<String>> getCourseType() {
        return this.course_type;
    }

    public Optional<Slot<Miai.Datetime>> getDatetime() {
        return this.datetime;
    }

    public Optional<Slot<DayTimeTag>> getDayTime() {
        return this.day_time;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getNextClass() {
        return this.next_class;
    }

    public Optional<Slot<String>> getPreviousClass() {
        return this.previous_class;
    }

    public Optional<Slot<String>> getRoom() {
        return this.room;
    }

    public Optional<Slot<String>> getTeacher() {
        return this.teacher;
    }

    public Optional<Slot<Integer>> getWeek() {
        return this.week;
    }

    public Optional<Slot<Integer>> getWeekday() {
        return this.weekday;
    }

    public Course setClassNum(Slot<Integer> slot) {
        this.class_num = Optional.e(slot);
        return this;
    }

    public Course setCourseType(Slot<String> slot) {
        this.course_type = Optional.e(slot);
        return this;
    }

    public Course setDatetime(Slot<Miai.Datetime> slot) {
        this.datetime = Optional.e(slot);
        return this;
    }

    public Course setDayTime(Slot<DayTimeTag> slot) {
        this.day_time = Optional.e(slot);
        return this;
    }

    @Required
    public Course setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Course setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public Course setNextClass(Slot<String> slot) {
        this.next_class = Optional.e(slot);
        return this;
    }

    public Course setPreviousClass(Slot<String> slot) {
        this.previous_class = Optional.e(slot);
        return this;
    }

    public Course setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public Course setTeacher(Slot<String> slot) {
        this.teacher = Optional.e(slot);
        return this;
    }

    public Course setWeek(Slot<Integer> slot) {
        this.week = Optional.e(slot);
        return this;
    }

    public Course setWeekday(Slot<Integer> slot) {
        this.weekday = Optional.e(slot);
        return this;
    }

    public Course(T t) {
        this.entity_type = t;
    }
}
