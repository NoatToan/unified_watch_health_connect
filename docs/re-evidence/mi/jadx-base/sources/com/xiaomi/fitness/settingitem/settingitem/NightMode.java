package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class NightMode {

    @SerializedName("endMinute")
    @Expose
    private int endMinute;

    @SerializedName("nightMode")
    @Expose
    private int nightMode;

    @SerializedName("startMinute")
    @Expose
    private int startMinute;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NightMode)) {
            return false;
        }
        NightMode nightMode = (NightMode) obj;
        return this.startMinute == nightMode.startMinute && this.nightMode == nightMode.nightMode && this.endMinute == nightMode.endMinute;
    }

    public int getEndMinute() {
        return this.endMinute;
    }

    public int getNightMode() {
        return this.nightMode;
    }

    public int getStartMinute() {
        return this.startMinute;
    }

    public int hashCode() {
        return ((((this.startMinute + 31) * 31) + this.nightMode) * 31) + this.endMinute;
    }

    public void setEndMinute(int i) {
        this.endMinute = i;
    }

    public void setNightMode(int i) {
        this.nightMode = i;
    }

    public void setStartMinute(int i) {
        this.startMinute = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NightMode.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("nightMode");
        sb.append('=');
        sb.append(this.nightMode);
        sb.append(',');
        sb.append("startMinute");
        sb.append('=');
        sb.append(this.startMinute);
        sb.append(',');
        sb.append("endMinute");
        sb.append('=');
        sb.append(this.endMinute);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
