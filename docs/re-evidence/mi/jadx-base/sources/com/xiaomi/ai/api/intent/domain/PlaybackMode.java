package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
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
public class PlaybackMode<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<PlayMode> name;

    public enum PlayMode {
        Normal(0, "Normal"),
        RepeatAll(1, "RepeatAll"),
        RepeatShuffle(2, "RepeatShuffle"),
        RepeatOne(3, "RepeatOne");

        private int id;
        private String name;

        PlayMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static PlayMode find(String str) {
            for (PlayMode playMode : values()) {
                if (playMode.name.equals(str)) {
                    return playMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static PlayMode read(String str) {
            return find(str);
        }

        public static String write(PlayMode playMode) {
            return playMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public PlaybackMode() {
    }

    public static PlaybackMode read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PlaybackMode playbackMode = new PlaybackMode();
        playbackMode.setName(IntentUtils.readSlot(zsdVar.w("name"), PlayMode.class));
        return playbackMode;
    }

    public static zsd write(PlaybackMode playbackMode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(playbackMode.name));
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    @Required
    public Slot<PlayMode> getName() {
        return this.name;
    }

    @Required
    public PlaybackMode setName(Slot<PlayMode> slot) {
        this.name = slot;
        return this;
    }

    public PlaybackMode(Slot<PlayMode> slot) {
        this.name = slot;
    }
}
