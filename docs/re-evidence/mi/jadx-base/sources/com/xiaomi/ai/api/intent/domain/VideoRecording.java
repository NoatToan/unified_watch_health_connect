package com.xiaomi.ai.api.intent.domain;

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
public class VideoRecording<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<VideoMode>> mode = Optional.a();

    public enum VideoMode {
        SlowMotion(1, "SlowMotion"),
        QuickMotion(2, "QuickMotion"),
        FrontRecord(3, "FrontRecord"),
        BackRecord(4, "BackRecord"),
        SmallVideo(5, "SmallVideo"),
        FrontSmallVideo(6, "FrontSmallVideo"),
        BackSmallVideo(7, "BackSmallVideo");

        private int id;
        private String name;

        VideoMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static VideoMode find(String str) {
            for (VideoMode videoMode : values()) {
                if (videoMode.name.equals(str)) {
                    return videoMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static VideoMode read(String str) {
            return find(str);
        }

        public static String write(VideoMode videoMode) {
            return videoMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static VideoRecording read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        VideoRecording videoRecording = new VideoRecording();
        if (zsdVar.z("mode")) {
            videoRecording.setMode(IntentUtils.readSlot(zsdVar.w("mode"), VideoMode.class));
        }
        return videoRecording;
    }

    public static zsd write(VideoRecording videoRecording) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (videoRecording.mode.c()) {
            c4hVarCreateObjectNode.f0("mode", IntentUtils.writeSlot(videoRecording.mode.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<VideoMode>> getMode() {
        return this.mode;
    }

    public VideoRecording setMode(Slot<VideoMode> slot) {
        this.mode = Optional.e(slot);
        return this;
    }
}
