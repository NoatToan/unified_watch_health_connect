package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.intent.AIApiConstants;
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
public class TakePhotograph<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<PhotoMode>> mode = Optional.a();
    private Optional<Slot<PhotoSetting>> setting = Optional.a();

    public enum PhotoMode {
        Portrait(1, "Portrait"),
        Square(2, "Square"),
        Panoramic(3, "Panoramic"),
        Night(4, "Night"),
        Manual(5, "Manual"),
        Selfie(6, "Selfie"),
        Back(7, "Back"),
        Document(8, "Document"),
        Professional(9, "Professional"),
        Film(10, AIApiConstants.Film.NAME),
        Street(11, "Street");

        private int id;
        private String name;

        PhotoMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static PhotoMode find(String str) {
            for (PhotoMode photoMode : values()) {
                if (photoMode.name.equals(str)) {
                    return photoMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static PhotoMode read(String str) {
            return find(str);
        }

        public static String write(PhotoMode photoMode) {
            return photoMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum PhotoSetting {
        RightNow(1, "RightNow"),
        CountDown3s(2, "CountDown3s"),
        CountDown5s(3, "CountDown5s"),
        BackPhoto(4, "BackPhoto"),
        FrontPhoto(5, "FrontPhoto"),
        InSideCountDown5s(6, "InSideCountDown5s"),
        OutSideCountDown5s(7, "OutSideCountDown5s"),
        InSideRightNow(8, "InSideRightNow"),
        OutSideRightNow(9, "OutSideRightNow"),
        FrontOutSideRightNow(10, "FrontOutSideRightNow"),
        BackOutSideCountDown3s(11, "BackOutSideCountDown3s"),
        FrontOutSideCountDown3s(12, "FrontOutSideCountDown3s"),
        FrontPhotoRightNow(13, "FrontPhotoRightNow"),
        FrontCountDown3s(14, "FrontCountDown3s"),
        FrontCountDown5s(15, "FrontCountDown5s");

        private int id;
        private String name;

        PhotoSetting(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static PhotoSetting find(String str) {
            for (PhotoSetting photoSetting : values()) {
                if (photoSetting.name.equals(str)) {
                    return photoSetting;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static PhotoSetting read(String str) {
            return find(str);
        }

        public static String write(PhotoSetting photoSetting) {
            return photoSetting.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static TakePhotograph read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        TakePhotograph takePhotograph = new TakePhotograph();
        if (zsdVar.z("mode")) {
            takePhotograph.setMode(IntentUtils.readSlot(zsdVar.w("mode"), PhotoMode.class));
        }
        if (zsdVar.z("setting")) {
            takePhotograph.setSetting(IntentUtils.readSlot(zsdVar.w("setting"), PhotoSetting.class));
        }
        return takePhotograph;
    }

    public static zsd write(TakePhotograph takePhotograph) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (takePhotograph.mode.c()) {
            c4hVarCreateObjectNode.f0("mode", IntentUtils.writeSlot(takePhotograph.mode.b()));
        }
        if (takePhotograph.setting.c()) {
            c4hVarCreateObjectNode.f0("setting", IntentUtils.writeSlot(takePhotograph.setting.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<PhotoMode>> getMode() {
        return this.mode;
    }

    public Optional<Slot<PhotoSetting>> getSetting() {
        return this.setting;
    }

    public TakePhotograph setMode(Slot<PhotoMode> slot) {
        this.mode = Optional.e(slot);
        return this;
    }

    public TakePhotograph setSetting(Slot<PhotoSetting> slot) {
        this.setting = Optional.e(slot);
        return this;
    }
}
