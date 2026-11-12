package com.xiaomi.ai.api.intent.domain;

import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class PlayIntent<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<AudioSourceType>> audio_source_type = Optional.a();
    private Optional<Slot<Boolean>> __continue = Optional.a();

    public enum AudioSourceType {
        UNKNOWN(1, DeviceTypes.UNKNOWN),
        LOCAL(2, "LOCAL"),
        NETWORK(3, "NETWORK"),
        BLUETOOTH(4, "BLUETOOTH"),
        USB(5, "USB");

        private int id;
        private String name;

        AudioSourceType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static AudioSourceType find(String str) {
            for (AudioSourceType audioSourceType : values()) {
                if (audioSourceType.name.equals(str)) {
                    return audioSourceType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static AudioSourceType read(String str) {
            return find(str);
        }

        public static String write(AudioSourceType audioSourceType) {
            return audioSourceType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static PlayIntent read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PlayIntent playIntent = new PlayIntent();
        if (zsdVar.z("audio_source_type")) {
            playIntent.setAudioSourceType(IntentUtils.readSlot(zsdVar.w("audio_source_type"), AudioSourceType.class));
        }
        if (zsdVar.z("continue")) {
            playIntent.setContinue(IntentUtils.readSlot(zsdVar.w("continue"), Boolean.class));
        }
        return playIntent;
    }

    public static zsd write(PlayIntent playIntent) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (playIntent.audio_source_type.c()) {
            c4hVarCreateObjectNode.f0("audio_source_type", IntentUtils.writeSlot(playIntent.audio_source_type.b()));
        }
        if (playIntent.__continue.c()) {
            c4hVarCreateObjectNode.f0("continue", IntentUtils.writeSlot(playIntent.__continue.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<AudioSourceType>> getAudioSourceType() {
        return this.audio_source_type;
    }

    public Optional<Slot<Boolean>> getContinue() {
        return this.__continue;
    }

    public PlayIntent setAudioSourceType(Slot<AudioSourceType> slot) {
        this.audio_source_type = Optional.e(slot);
        return this;
    }

    public PlayIntent setContinue(Slot<Boolean> slot) {
        this.__continue = Optional.e(slot);
        return this;
    }
}
