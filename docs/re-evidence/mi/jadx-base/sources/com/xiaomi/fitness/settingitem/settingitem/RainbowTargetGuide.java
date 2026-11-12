package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class RainbowTargetGuide {

    @SerializedName("rainbow_target_guide")
    @Expose
    private boolean rainbowTargetGuide;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof RainbowTargetGuide) && this.rainbowTargetGuide == ((RainbowTargetGuide) obj).rainbowTargetGuide;
    }

    public int hashCode() {
        return 31 + (this.rainbowTargetGuide ? 1 : 0);
    }

    public boolean isRainbowTargetGuide() {
        return this.rainbowTargetGuide;
    }

    public void setRainbowTargetGuide(boolean z) {
        this.rainbowTargetGuide = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RainbowTargetGuide.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(DeviceSettingConfigKey.KEY_RAINBOW_TARGET_GUIDE);
        sb.append('=');
        sb.append(this.rainbowTargetGuide);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
