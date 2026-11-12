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
public class MediaPlayer<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public enum PlayerResolution {
        Default(0, "Default"),
        StandardDefinition(1, "StandardDefinition"),
        HighDefinition(2, "HighDefinition"),
        UltraHighDefinition(3, "UltraHighDefinition"),
        BlueRay(4, "BlueRay"),
        _720P(5, "720P"),
        _1080P(6, "1080P"),
        _4K(7, "4K");

        private int id;
        private String name;

        PlayerResolution(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static PlayerResolution find(String str) {
            for (PlayerResolution playerResolution : values()) {
                if (playerResolution.name.equals(str)) {
                    return playerResolution;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static PlayerResolution read(String str) {
            return find(str);
        }

        public static String write(PlayerResolution playerResolution) {
            return playerResolution.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class ads implements EntityType {
        public static ads read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new ads();
        }

        public static c4h write(ads adsVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class clearHistory implements EntityType {
        public static clearHistory read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new clearHistory();
        }

        public static c4h write(clearHistory clearhistory) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class fastForward implements EntityType {
        private Optional<Slot<Miai.Number>> speed = Optional.a();
        private Optional<Slot<Miai.Duration>> duration = Optional.a();
        private Optional<Slot<Miai.Fraction>> scale = Optional.a();

        public static fastForward read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            fastForward fastforward = new fastForward();
            if (zsdVar.z("speed")) {
                fastforward.setSpeed(IntentUtils.readSlot(zsdVar.w("speed"), Miai.Number.class));
            }
            if (zsdVar.z("duration")) {
                fastforward.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
            }
            if (zsdVar.z("scale")) {
                fastforward.setScale(IntentUtils.readSlot(zsdVar.w("scale"), Miai.Fraction.class));
            }
            return fastforward;
        }

        public static c4h write(fastForward fastforward) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (fastforward.speed.c()) {
                c4hVarCreateObjectNode.f0("speed", IntentUtils.writeSlot(fastforward.speed.b()));
            }
            if (fastforward.duration.c()) {
                c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(fastforward.duration.b()));
            }
            if (fastforward.scale.c()) {
                c4hVarCreateObjectNode.f0("scale", IntentUtils.writeSlot(fastforward.scale.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Duration>> getDuration() {
            return this.duration;
        }

        public Optional<Slot<Miai.Fraction>> getScale() {
            return this.scale;
        }

        public Optional<Slot<Miai.Number>> getSpeed() {
            return this.speed;
        }

        public fastForward setDuration(Slot<Miai.Duration> slot) {
            this.duration = Optional.e(slot);
            return this;
        }

        public fastForward setScale(Slot<Miai.Fraction> slot) {
            this.scale = Optional.e(slot);
            return this;
        }

        public fastForward setSpeed(Slot<Miai.Number> slot) {
            this.speed = Optional.e(slot);
            return this;
        }
    }

    public static class fullScreen implements EntityType {
        public static fullScreen read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new fullScreen();
        }

        public static c4h write(fullScreen fullscreen) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class repeat implements EntityType {
        public static repeat read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new repeat();
        }

        public static c4h write(repeat repeatVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class resolution implements EntityType {
        private Optional<Slot<PlayerResolution>> name = Optional.a();

        public static resolution read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            resolution resolutionVar = new resolution();
            if (zsdVar.z("name")) {
                resolutionVar.setName(IntentUtils.readSlot(zsdVar.w("name"), PlayerResolution.class));
            }
            return resolutionVar;
        }

        public static c4h write(resolution resolutionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (resolutionVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(resolutionVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<PlayerResolution>> getName() {
            return this.name;
        }

        public resolution setName(Slot<PlayerResolution> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class rewind implements EntityType {
        private Optional<Slot<Miai.Number>> speed = Optional.a();
        private Optional<Slot<Miai.Duration>> duration = Optional.a();
        private Optional<Slot<Miai.Fraction>> scale = Optional.a();

        public static rewind read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            rewind rewindVar = new rewind();
            if (zsdVar.z("speed")) {
                rewindVar.setSpeed(IntentUtils.readSlot(zsdVar.w("speed"), Miai.Number.class));
            }
            if (zsdVar.z("duration")) {
                rewindVar.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
            }
            if (zsdVar.z("scale")) {
                rewindVar.setScale(IntentUtils.readSlot(zsdVar.w("scale"), Miai.Fraction.class));
            }
            return rewindVar;
        }

        public static c4h write(rewind rewindVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (rewindVar.speed.c()) {
                c4hVarCreateObjectNode.f0("speed", IntentUtils.writeSlot(rewindVar.speed.b()));
            }
            if (rewindVar.duration.c()) {
                c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(rewindVar.duration.b()));
            }
            if (rewindVar.scale.c()) {
                c4hVarCreateObjectNode.f0("scale", IntentUtils.writeSlot(rewindVar.scale.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Duration>> getDuration() {
            return this.duration;
        }

        public Optional<Slot<Miai.Fraction>> getScale() {
            return this.scale;
        }

        public Optional<Slot<Miai.Number>> getSpeed() {
            return this.speed;
        }

        public rewind setDuration(Slot<Miai.Duration> slot) {
            this.duration = Optional.e(slot);
            return this;
        }

        public rewind setScale(Slot<Miai.Fraction> slot) {
            this.scale = Optional.e(slot);
            return this;
        }

        public rewind setSpeed(Slot<Miai.Number> slot) {
            this.speed = Optional.e(slot);
            return this;
        }
    }

    public static class seek implements EntityType {
        private Optional<Slot<Miai.Duration>> duration = Optional.a();
        private Optional<Slot<Miai.Fraction>> scale = Optional.a();

        public static seek read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            seek seekVar = new seek();
            if (zsdVar.z("duration")) {
                seekVar.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
            }
            if (zsdVar.z("scale")) {
                seekVar.setScale(IntentUtils.readSlot(zsdVar.w("scale"), Miai.Fraction.class));
            }
            return seekVar;
        }

        public static c4h write(seek seekVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (seekVar.duration.c()) {
                c4hVarCreateObjectNode.f0("duration", IntentUtils.writeSlot(seekVar.duration.b()));
            }
            if (seekVar.scale.c()) {
                c4hVarCreateObjectNode.f0("scale", IntentUtils.writeSlot(seekVar.scale.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Duration>> getDuration() {
            return this.duration;
        }

        public Optional<Slot<Miai.Fraction>> getScale() {
            return this.scale;
        }

        public seek setDuration(Slot<Miai.Duration> slot) {
            this.duration = Optional.e(slot);
            return this;
        }

        public seek setScale(Slot<Miai.Fraction> slot) {
            this.scale = Optional.e(slot);
            return this;
        }
    }

    public static class skipEnd implements EntityType {
        public static skipEnd read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new skipEnd();
        }

        public static c4h write(skipEnd skipend) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class skipStart implements EntityType {
        public static skipStart read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new skipStart();
        }

        public static c4h write(skipStart skipstart) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public MediaPlayer() {
    }

    public static MediaPlayer read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new MediaPlayer(IntentUtils.readEntityType(zsdVar, AIApiConstants.MediaPlayer.NAME, optional));
    }

    public static zsd write(MediaPlayer mediaPlayer) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(mediaPlayer.entity_type);
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public MediaPlayer setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public MediaPlayer(T t) {
        this.entity_type = t;
    }
}
