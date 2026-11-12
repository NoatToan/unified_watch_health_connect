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
public class SoundVolume<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Deprecated
    private Optional<Slot<Miai.Number>> value = Optional.a();
    private Optional<Slot<Miai.Number>> numeric = Optional.a();
    private Optional<Slot<Miai.Fraction>> percent = Optional.a();
    private Optional<Slot<Miai.Multiple>> multiple = Optional.a();
    private Optional<Slot<SoundVolumeType>> target = Optional.a();

    public enum SoundVolumeType {
        Assistant(1, AIApiConstants.Assistant.NAME),
        Alarm(2, AIApiConstants.Alarm.NAME),
        Ring(3, "Ring"),
        MediaPlayer(4, AIApiConstants.MediaPlayer.NAME),
        Microphone(5, "Microphone"),
        Navigation(6, AIApiConstants.Navigation.NAME),
        Call(7, "Call");

        private int id;
        private String name;

        SoundVolumeType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SoundVolumeType find(String str) {
            for (SoundVolumeType soundVolumeType : values()) {
                if (soundVolumeType.name.equals(str)) {
                    return soundVolumeType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SoundVolumeType read(String str) {
            return find(str);
        }

        public static String write(SoundVolumeType soundVolumeType) {
            return soundVolumeType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class autoAdjustment implements EntityType {
        public static autoAdjustment read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new autoAdjustment();
        }

        public static c4h write(autoAdjustment autoadjustment) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mute implements EntityType {
        private Optional<Slot<Miai.Duration>> delay = Optional.a();

        public static mute read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mute muteVar = new mute();
            if (zsdVar.z("delay")) {
                muteVar.setDelay(IntentUtils.readSlot(zsdVar.w("delay"), Miai.Duration.class));
            }
            return muteVar;
        }

        public static c4h write(mute muteVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (muteVar.delay.c()) {
                c4hVarCreateObjectNode.f0("delay", IntentUtils.writeSlot(muteVar.delay.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Duration>> getDelay() {
            return this.delay;
        }

        public mute setDelay(Slot<Miai.Duration> slot) {
            this.delay = Optional.e(slot);
            return this;
        }
    }

    public SoundVolume() {
    }

    public static SoundVolume read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        SoundVolume soundVolume = new SoundVolume(IntentUtils.readEntityType(zsdVar, AIApiConstants.SoundVolume.NAME, optional));
        if (zsdVar.z("value")) {
            soundVolume.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
        }
        if (zsdVar.z("numeric")) {
            soundVolume.setNumeric(IntentUtils.readSlot(zsdVar.w("numeric"), Miai.Number.class));
        }
        if (zsdVar.z("percent")) {
            soundVolume.setPercent(IntentUtils.readSlot(zsdVar.w("percent"), Miai.Fraction.class));
        }
        if (zsdVar.z("multiple")) {
            soundVolume.setMultiple(IntentUtils.readSlot(zsdVar.w("multiple"), Miai.Multiple.class));
        }
        if (zsdVar.z("target")) {
            soundVolume.setTarget(IntentUtils.readSlot(zsdVar.w("target"), SoundVolumeType.class));
        }
        return soundVolume;
    }

    public static zsd write(SoundVolume soundVolume) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(soundVolume.entity_type);
        if (soundVolume.value.c()) {
            c4hVar.f0("value", IntentUtils.writeSlot(soundVolume.value.b()));
        }
        if (soundVolume.numeric.c()) {
            c4hVar.f0("numeric", IntentUtils.writeSlot(soundVolume.numeric.b()));
        }
        if (soundVolume.percent.c()) {
            c4hVar.f0("percent", IntentUtils.writeSlot(soundVolume.percent.b()));
        }
        if (soundVolume.multiple.c()) {
            c4hVar.f0("multiple", IntentUtils.writeSlot(soundVolume.multiple.b()));
        }
        if (soundVolume.target.c()) {
            c4hVar.f0("target", IntentUtils.writeSlot(soundVolume.target.b()));
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

    public Optional<Slot<Miai.Multiple>> getMultiple() {
        return this.multiple;
    }

    public Optional<Slot<Miai.Number>> getNumeric() {
        return this.numeric;
    }

    public Optional<Slot<Miai.Fraction>> getPercent() {
        return this.percent;
    }

    public Optional<Slot<SoundVolumeType>> getTarget() {
        return this.target;
    }

    @Deprecated
    public Optional<Slot<Miai.Number>> getValue() {
        return this.value;
    }

    @Required
    public SoundVolume setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public SoundVolume setMultiple(Slot<Miai.Multiple> slot) {
        this.multiple = Optional.e(slot);
        return this;
    }

    public SoundVolume setNumeric(Slot<Miai.Number> slot) {
        this.numeric = Optional.e(slot);
        return this;
    }

    public SoundVolume setPercent(Slot<Miai.Fraction> slot) {
        this.percent = Optional.e(slot);
        return this;
    }

    public SoundVolume setTarget(Slot<SoundVolumeType> slot) {
        this.target = Optional.e(slot);
        return this;
    }

    @Deprecated
    public SoundVolume setValue(Slot<Miai.Number> slot) {
        this.value = Optional.e(slot);
        return this;
    }

    public SoundVolume(T t) {
        this.entity_type = t;
    }
}
