package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes6.dex */
public class PlaybackController {

    public enum AudioSourceType {
        UNKNOWN(-1),
        LOCAL(0),
        NETWORK(1),
        BLUETOOTH(2);

        private int id;

        AudioSourceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "CancelStopAfter", namespace = AIApiConstants.PlaybackController.NAME)
    public static class CancelStopAfter implements InstructionPayload {
    }

    @NamespaceName(name = "ContinuePlaying", namespace = AIApiConstants.PlaybackController.NAME)
    public static class ContinuePlaying implements InstructionPayload {
        private Optional<SceneType> scene = Optional.a();

        public Optional<SceneType> getScene() {
            return this.scene;
        }

        public ContinuePlaying setScene(SceneType sceneType) {
            this.scene = Optional.e(sceneType);
            return this;
        }
    }

    public enum CountType {
        UNKNOWN(-1),
        EPISODE(0),
        LIST(1);

        private int id;

        CountType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "DeletePlayingHistory", namespace = AIApiConstants.PlaybackController.NAME)
    public static class DeletePlayingHistory implements InstructionPayload {
    }

    @NamespaceName(name = "FastForward", namespace = AIApiConstants.PlaybackController.NAME)
    public static class FastForward implements InstructionPayload {

        @Required
        private float speed;

        public FastForward() {
        }

        public FastForward(float f) {
            this.speed = f;
        }

        @Required
        public float getSpeed() {
            return this.speed;
        }

        @Required
        public FastForward setSpeed(float f) {
            this.speed = f;
            return this;
        }
    }

    @NamespaceName(name = "Next", namespace = AIApiConstants.PlaybackController.NAME)
    public static class Next implements InstructionPayload {
    }

    @NamespaceName(name = "Pause", namespace = AIApiConstants.PlaybackController.NAME)
    public static class Pause implements InstructionPayload {
    }

    @NamespaceName(name = "Play", namespace = AIApiConstants.PlaybackController.NAME)
    public static class Play implements InstructionPayload {
    }

    @NamespaceName(name = "Prev", namespace = AIApiConstants.PlaybackController.NAME)
    public static class Prev implements InstructionPayload {
    }

    public enum ReferenceDef {
        UNKNOWN(-1),
        START(0),
        CURRENT(1),
        END(2);

        private int id;

        ReferenceDef(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "Rewind", namespace = AIApiConstants.PlaybackController.NAME)
    public static class Rewind implements InstructionPayload {

        @Required
        private float speed;

        public Rewind() {
        }

        public Rewind(float f) {
            this.speed = f;
        }

        @Required
        public float getSpeed() {
            return this.speed;
        }

        @Required
        public Rewind setSpeed(float f) {
            this.speed = f;
            return this;
        }
    }

    public enum SceneType {
        UNKNOWN(-1),
        MUSIC(0);

        private int id;

        SceneType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "Seek", namespace = AIApiConstants.PlaybackController.NAME)
    public static class Seek implements InstructionPayload {

        @Required
        private int delta_in_ms;

        @Required
        private ReferenceDef reference;

        public Seek() {
        }

        public Seek(ReferenceDef referenceDef, int i) {
            this.reference = referenceDef;
            this.delta_in_ms = i;
        }

        @Required
        public int getDeltaInMs() {
            return this.delta_in_ms;
        }

        @Required
        public ReferenceDef getReference() {
            return this.reference;
        }

        @Required
        public Seek setDeltaInMs(int i) {
            this.delta_in_ms = i;
            return this;
        }

        @Required
        public Seek setReference(ReferenceDef referenceDef) {
            this.reference = referenceDef;
            return this;
        }
    }

    @NamespaceName(name = "SetAudioSource", namespace = AIApiConstants.PlaybackController.NAME)
    public static class SetAudioSource implements InstructionPayload {

        @Required
        private AudioSourceType type;

        public SetAudioSource() {
        }

        public SetAudioSource(AudioSourceType audioSourceType) {
            this.type = audioSourceType;
        }

        @Required
        public AudioSourceType getType() {
            return this.type;
        }

        @Required
        public SetAudioSource setType(AudioSourceType audioSourceType) {
            this.type = audioSourceType;
            return this;
        }
    }

    @NamespaceName(name = "SetProperty", namespace = AIApiConstants.PlaybackController.NAME)
    public static class SetProperty implements InstructionPayload {

        @Required
        private String name;

        @Required
        private String value;

        public SetProperty() {
        }

        public SetProperty(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getValue() {
            return this.value;
        }

        @Required
        public SetProperty setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public SetProperty setValue(String str) {
            this.value = str;
            return this;
        }
    }

    @NamespaceName(name = "SkipEnd", namespace = AIApiConstants.PlaybackController.NAME)
    public static class SkipEnd implements InstructionPayload {
    }

    @NamespaceName(name = "SkipStart", namespace = AIApiConstants.PlaybackController.NAME)
    public static class SkipStart implements InstructionPayload {
    }

    @NamespaceName(name = "StartOver", namespace = AIApiConstants.PlaybackController.NAME)
    public static class StartOver implements InstructionPayload {
    }

    @NamespaceName(name = "Stop", namespace = AIApiConstants.PlaybackController.NAME)
    public static class Stop implements InstructionPayload {
    }

    @NamespaceName(name = "StopAfter", namespace = AIApiConstants.PlaybackController.NAME)
    public static class StopAfter implements InstructionPayload {
        private Optional<CountType> count_type = Optional.a();
        private Optional<Integer> count = Optional.a();
        private Optional<Integer> timeout_in_ms = Optional.a();

        public Optional<Integer> getCount() {
            return this.count;
        }

        public Optional<CountType> getCountType() {
            return this.count_type;
        }

        public Optional<Integer> getTimeoutInMs() {
            return this.timeout_in_ms;
        }

        public StopAfter setCount(int i) {
            this.count = Optional.e(Integer.valueOf(i));
            return this;
        }

        public StopAfter setCountType(CountType countType) {
            this.count_type = Optional.e(countType);
            return this;
        }

        public StopAfter setTimeoutInMs(int i) {
            this.timeout_in_ms = Optional.e(Integer.valueOf(i));
            return this;
        }
    }
}
