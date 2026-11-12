package com.xiaomi.ai.domain.phonecall.util;

import com.xiaomi.fitness.watch.face.FaceTabListFragment;

/* JADX INFO: loaded from: classes7.dex */
public enum ABTestGroupType {
    ENABLE_OFFLINE_ASR("enable_offline_asr"),
    DISABLE_OFFLINE_ASR("disable_offline_asr"),
    ENABLE_NAME_MODEL_MATCHER("enable_name_model_matcher"),
    DISABLE_NAME_MODEL_MATCHER("disable_name_model_matcher"),
    WHITE_LIST(FaceTabListFragment.WHITE_LIST),
    DEFAULT("default");

    private String text;

    ABTestGroupType(String str) {
        this.text = str;
    }

    public static ABTestGroupType fromString(String str) {
        for (ABTestGroupType aBTestGroupType : values()) {
            if (aBTestGroupType.getText().equals(str)) {
                return aBTestGroupType;
            }
        }
        return DEFAULT;
    }

    public String getText() {
        return this.text;
    }
}
