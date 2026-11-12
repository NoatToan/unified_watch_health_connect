package com.xiaomi.ai.api;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes18.dex */
public class Speaker {

    @NamespaceName(name = AVSAPIConstants.Speaker.Directives.AdjustVolume.NAME, namespace = "Speaker")
    public static class AdjustVolume implements InstructionPayload {

        @Required
        private VolumeType type;

        @Required
        private UnitDef unit;

        @Required
        private int volume_delta;

        public AdjustVolume() {
        }

        public AdjustVolume(int i, VolumeType volumeType, UnitDef unitDef) {
            this.volume_delta = i;
            this.type = volumeType;
            this.unit = unitDef;
        }

        @Required
        public VolumeType getType() {
            return this.type;
        }

        @Required
        public UnitDef getUnit() {
            return this.unit;
        }

        @Required
        public int getVolumeDelta() {
            return this.volume_delta;
        }

        @Required
        public AdjustVolume setType(VolumeType volumeType) {
            this.type = volumeType;
            return this;
        }

        @Required
        public AdjustVolume setUnit(UnitDef unitDef) {
            this.unit = unitDef;
            return this;
        }

        @Required
        public AdjustVolume setVolumeDelta(int i) {
            this.volume_delta = i;
            return this;
        }
    }

    @NamespaceName(name = "SetAIVolume", namespace = "Speaker")
    public static class SetAIVolume implements InstructionPayload {

        @Required
        private String status;

        public SetAIVolume() {
        }

        public SetAIVolume(String str) {
            this.status = str;
        }

        @Required
        public String getStatus() {
            return this.status;
        }

        @Required
        public SetAIVolume setStatus(String str) {
            this.status = str;
            return this;
        }
    }

    @NamespaceName(name = "SetMute", namespace = "Speaker")
    public static class SetMute implements InstructionPayload {

        @Required
        private boolean mute;

        public SetMute() {
        }

        public SetMute(boolean z) {
            this.mute = z;
        }

        @Required
        public boolean isMute() {
            return this.mute;
        }

        @Required
        public SetMute setMute(boolean z) {
            this.mute = z;
            return this;
        }
    }

    @NamespaceName(name = "SetVolume", namespace = "Speaker")
    public static class SetVolume implements InstructionPayload {
        private Optional<Boolean> once = Optional.empty();

        @Required
        private VolumeType type;

        @Required
        private UnitDef unit;

        @Required
        private int volume;

        public SetVolume() {
        }

        public SetVolume(int i, VolumeType volumeType, UnitDef unitDef) {
            this.volume = i;
            this.type = volumeType;
            this.unit = unitDef;
        }

        @Required
        public VolumeType getType() {
            return this.type;
        }

        @Required
        public UnitDef getUnit() {
            return this.unit;
        }

        @Required
        public int getVolume() {
            return this.volume;
        }

        public Optional<Boolean> isOnce() {
            return this.once;
        }

        public SetVolume setOnce(boolean z) {
            this.once = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        @Required
        public SetVolume setType(VolumeType volumeType) {
            this.type = volumeType;
            return this;
        }

        @Required
        public SetVolume setUnit(UnitDef unitDef) {
            this.unit = unitDef;
            return this;
        }

        @Required
        public SetVolume setVolume(int i) {
            this.volume = i;
            return this;
        }
    }

    public enum UnitDef {
        UNKNOWN(-1),
        PERCENT(0),
        ABSOLUTE(1);

        private int id;

        UnitDef(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum VolumeType {
        UNKNOWN(-1),
        MEDIA(0),
        RING(1),
        NOTIFICATION(2),
        XIAOAI_VOICE_ASSISTANT(3),
        ALARM(4),
        TV_KARAOKE_MICROPHONE(5);

        private int id;

        VolumeType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }
}
