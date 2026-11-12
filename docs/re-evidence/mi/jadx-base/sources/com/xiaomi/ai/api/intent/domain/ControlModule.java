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
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class ControlModule<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> attribute;

    @Required
    private T entity_type;
    private Optional<Slot<String>> attribute_type = Optional.a();
    private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
    private Optional<Slot<Miai.Duration>> duration = Optional.a();
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Miai.Date>> date = Optional.a();
    private Optional<Slot<Miai.TimeInterval>> interval = Optional.a();
    private Optional<Slot<ControlCircle>> circle = Optional.a();
    private Optional<Slot<SoundVolume.SoundVolumeType>> target = Optional.a();
    private Optional<Slot<String>> app = Optional.a();
    private Optional<Slot<Integer>> ordinal = Optional.a();
    private Optional<Slot<String>> target_window = Optional.a();
    private Optional<Slot<String>> target_brightness = Optional.a();

    public static class adjustment implements EntityType {
        private Optional<Slot<String>> name = Optional.a();
        private Optional<Slot<Miai.Number>> number = Optional.a();
        private Optional<Slot<Miai.Fraction>> percent = Optional.a();
        private Optional<Slot<Miai.Multiple>> multiple = Optional.a();
        private Optional<Slot<SoundVolume.SoundVolumeType>> target = Optional.a();
        private Optional<Slot<String>> description = Optional.a();

        public static adjustment read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            adjustment adjustmentVar = new adjustment();
            if (zsdVar.z("name")) {
                adjustmentVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                adjustmentVar.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            if (zsdVar.z("percent")) {
                adjustmentVar.setPercent(IntentUtils.readSlot(zsdVar.w("percent"), Miai.Fraction.class));
            }
            if (zsdVar.z("multiple")) {
                adjustmentVar.setMultiple(IntentUtils.readSlot(zsdVar.w("multiple"), Miai.Multiple.class));
            }
            if (zsdVar.z("target")) {
                adjustmentVar.setTarget(IntentUtils.readSlot(zsdVar.w("target"), SoundVolume.SoundVolumeType.class));
            }
            if (zsdVar.z("description")) {
                adjustmentVar.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
            }
            return adjustmentVar;
        }

        public static c4h write(adjustment adjustmentVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (adjustmentVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(adjustmentVar.name.b()));
            }
            if (adjustmentVar.number.c()) {
                c4hVarCreateObjectNode.f0(RealNameWebViewActivity.NUMBER, IntentUtils.writeSlot(adjustmentVar.number.b()));
            }
            if (adjustmentVar.percent.c()) {
                c4hVarCreateObjectNode.f0("percent", IntentUtils.writeSlot(adjustmentVar.percent.b()));
            }
            if (adjustmentVar.multiple.c()) {
                c4hVarCreateObjectNode.f0("multiple", IntentUtils.writeSlot(adjustmentVar.multiple.b()));
            }
            if (adjustmentVar.target.c()) {
                c4hVarCreateObjectNode.f0("target", IntentUtils.writeSlot(adjustmentVar.target.b()));
            }
            if (adjustmentVar.description.c()) {
                c4hVarCreateObjectNode.f0("description", IntentUtils.writeSlot(adjustmentVar.description.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getDescription() {
            return this.description;
        }

        public Optional<Slot<Miai.Multiple>> getMultiple() {
            return this.multiple;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public Optional<Slot<Miai.Fraction>> getPercent() {
            return this.percent;
        }

        public Optional<Slot<SoundVolume.SoundVolumeType>> getTarget() {
            return this.target;
        }

        public adjustment setDescription(Slot<String> slot) {
            this.description = Optional.e(slot);
            return this;
        }

        public adjustment setMultiple(Slot<Miai.Multiple> slot) {
            this.multiple = Optional.e(slot);
            return this;
        }

        public adjustment setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public adjustment setNumber(Slot<Miai.Number> slot) {
            this.number = Optional.e(slot);
            return this;
        }

        public adjustment setPercent(Slot<Miai.Fraction> slot) {
            this.percent = Optional.e(slot);
            return this;
        }

        public adjustment setTarget(Slot<SoundVolume.SoundVolumeType> slot) {
            this.target = Optional.e(slot);
            return this;
        }
    }

    public static class status implements EntityType {
        private Optional<Slot<String>> sub_type = Optional.a();

        public static status read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            status statusVar = new status();
            if (zsdVar.z("sub_type")) {
                statusVar.setSubType(IntentUtils.readSlot(zsdVar.w("sub_type"), String.class));
            }
            return statusVar;
        }

        public static c4h write(status statusVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (statusVar.sub_type.c()) {
                c4hVarCreateObjectNode.f0("sub_type", IntentUtils.writeSlot(statusVar.sub_type.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getSubType() {
            return this.sub_type;
        }

        public status setSubType(Slot<String> slot) {
            this.sub_type = Optional.e(slot);
            return this;
        }
    }

    public ControlModule() {
    }

    public static ControlModule read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        ControlModule controlModule = new ControlModule(IntentUtils.readEntityType(zsdVar, AIApiConstants.ControlModule.NAME, optional));
        controlModule.setAttribute(IntentUtils.readSlot(zsdVar.w("attribute"), String.class));
        if (zsdVar.z("attribute_type")) {
            controlModule.setAttributeType(IntentUtils.readSlot(zsdVar.w("attribute_type"), String.class));
        }
        if (zsdVar.z("datetime")) {
            controlModule.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
        }
        if (zsdVar.z("duration")) {
            controlModule.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
        }
        if (zsdVar.z("device")) {
            controlModule.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            controlModule.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z(DialWidgetType.DATE)) {
            controlModule.setDate(IntentUtils.readSlot(zsdVar.w(DialWidgetType.DATE), Miai.Date.class));
        }
        if (zsdVar.z("interval")) {
            controlModule.setInterval(IntentUtils.readSlot(zsdVar.w("interval"), Miai.TimeInterval.class));
        }
        if (zsdVar.z("circle")) {
            controlModule.setCircle(IntentUtils.readSlot(zsdVar.w("circle"), ControlCircle.class));
        }
        if (zsdVar.z("target")) {
            controlModule.setTarget(IntentUtils.readSlot(zsdVar.w("target"), SoundVolume.SoundVolumeType.class));
        }
        if (zsdVar.z("app")) {
            controlModule.setApp(IntentUtils.readSlot(zsdVar.w("app"), String.class));
        }
        if (zsdVar.z("ordinal")) {
            controlModule.setOrdinal(IntentUtils.readSlot(zsdVar.w("ordinal"), Integer.class));
        }
        if (zsdVar.z("target_window")) {
            controlModule.setTargetWindow(IntentUtils.readSlot(zsdVar.w("target_window"), String.class));
        }
        if (zsdVar.z("target_brightness")) {
            controlModule.setTargetBrightness(IntentUtils.readSlot(zsdVar.w("target_brightness"), String.class));
        }
        return controlModule;
    }

    public static zsd write(ControlModule controlModule) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(controlModule.entity_type);
        c4hVar.f0("attribute", IntentUtils.writeSlot(controlModule.attribute));
        if (controlModule.attribute_type.c()) {
            c4hVar.f0("attribute_type", IntentUtils.writeSlot(controlModule.attribute_type.b()));
        }
        if (controlModule.datetime.c()) {
            c4hVar.f0("datetime", IntentUtils.writeSlot(controlModule.datetime.b()));
        }
        if (controlModule.duration.c()) {
            c4hVar.f0("duration", IntentUtils.writeSlot(controlModule.duration.b()));
        }
        if (controlModule.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(controlModule.device.b()));
        }
        if (controlModule.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(controlModule.room.b()));
        }
        if (controlModule.date.c()) {
            c4hVar.f0(DialWidgetType.DATE, IntentUtils.writeSlot(controlModule.date.b()));
        }
        if (controlModule.interval.c()) {
            c4hVar.f0("interval", IntentUtils.writeSlot(controlModule.interval.b()));
        }
        if (controlModule.circle.c()) {
            c4hVar.f0("circle", IntentUtils.writeSlot(controlModule.circle.b()));
        }
        if (controlModule.target.c()) {
            c4hVar.f0("target", IntentUtils.writeSlot(controlModule.target.b()));
        }
        if (controlModule.app.c()) {
            c4hVar.f0("app", IntentUtils.writeSlot(controlModule.app.b()));
        }
        if (controlModule.ordinal.c()) {
            c4hVar.f0("ordinal", IntentUtils.writeSlot(controlModule.ordinal.b()));
        }
        if (controlModule.target_window.c()) {
            c4hVar.f0("target_window", IntentUtils.writeSlot(controlModule.target_window.b()));
        }
        if (controlModule.target_brightness.c()) {
            c4hVar.f0("target_brightness", IntentUtils.writeSlot(controlModule.target_brightness.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getApp() {
        return this.app;
    }

    @Required
    public Slot<String> getAttribute() {
        return this.attribute;
    }

    public Optional<Slot<String>> getAttributeType() {
        return this.attribute_type;
    }

    public Optional<Slot<ControlCircle>> getCircle() {
        return this.circle;
    }

    public Optional<Slot<Miai.Date>> getDate() {
        return this.date;
    }

    public Optional<Slot<Miai.Datetime>> getDatetime() {
        return this.datetime;
    }

    public Optional<Slot<String>> getDevice() {
        return this.device;
    }

    public Optional<Slot<Miai.Duration>> getDuration() {
        return this.duration;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.TimeInterval>> getInterval() {
        return this.interval;
    }

    public Optional<Slot<Integer>> getOrdinal() {
        return this.ordinal;
    }

    public Optional<Slot<String>> getRoom() {
        return this.room;
    }

    public Optional<Slot<SoundVolume.SoundVolumeType>> getTarget() {
        return this.target;
    }

    public Optional<Slot<String>> getTargetBrightness() {
        return this.target_brightness;
    }

    public Optional<Slot<String>> getTargetWindow() {
        return this.target_window;
    }

    public ControlModule setApp(Slot<String> slot) {
        this.app = Optional.e(slot);
        return this;
    }

    @Required
    public ControlModule setAttribute(Slot<String> slot) {
        this.attribute = slot;
        return this;
    }

    public ControlModule setAttributeType(Slot<String> slot) {
        this.attribute_type = Optional.e(slot);
        return this;
    }

    public ControlModule setCircle(Slot<ControlCircle> slot) {
        this.circle = Optional.e(slot);
        return this;
    }

    public ControlModule setDate(Slot<Miai.Date> slot) {
        this.date = Optional.e(slot);
        return this;
    }

    public ControlModule setDatetime(Slot<Miai.Datetime> slot) {
        this.datetime = Optional.e(slot);
        return this;
    }

    public ControlModule setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    public ControlModule setDuration(Slot<Miai.Duration> slot) {
        this.duration = Optional.e(slot);
        return this;
    }

    @Required
    public ControlModule setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public ControlModule setInterval(Slot<Miai.TimeInterval> slot) {
        this.interval = Optional.e(slot);
        return this;
    }

    public ControlModule setOrdinal(Slot<Integer> slot) {
        this.ordinal = Optional.e(slot);
        return this;
    }

    public ControlModule setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public ControlModule setTarget(Slot<SoundVolume.SoundVolumeType> slot) {
        this.target = Optional.e(slot);
        return this;
    }

    public ControlModule setTargetBrightness(Slot<String> slot) {
        this.target_brightness = Optional.e(slot);
        return this;
    }

    public ControlModule setTargetWindow(Slot<String> slot) {
        this.target_window = Optional.e(slot);
        return this;
    }

    public ControlModule(T t) {
        this.entity_type = t;
    }

    public ControlModule(T t, Slot<String> slot) {
        this.entity_type = t;
        this.attribute = slot;
    }
}
