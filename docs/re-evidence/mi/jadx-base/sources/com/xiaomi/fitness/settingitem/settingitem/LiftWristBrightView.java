package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class LiftWristBrightView {

    @SerializedName("allday")
    @Expose
    private boolean allday;

    @SerializedName("enable")
    @Expose
    private boolean enable;

    @SerializedName("sensitivity")
    @Expose
    private int sensitivity;

    @SerializedName(StatConstants.PARAM_START)
    @Expose
    private int start;

    @SerializedName(BroadcastsKt.SILENT_PUSHING_STOP)
    @Expose
    private int stop;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiftWristBrightView)) {
            return false;
        }
        LiftWristBrightView liftWristBrightView = (LiftWristBrightView) obj;
        return this.start == liftWristBrightView.start && this.allday == liftWristBrightView.allday && this.sensitivity == liftWristBrightView.sensitivity && this.stop == liftWristBrightView.stop && this.enable == liftWristBrightView.enable;
    }

    public int getSensitivity() {
        return this.sensitivity;
    }

    public int getStart() {
        return this.start;
    }

    public int getStop() {
        return this.stop;
    }

    public int hashCode() {
        return ((((((((this.start + 31) * 31) + (this.allday ? 1 : 0)) * 31) + this.sensitivity) * 31) + this.stop) * 31) + (this.enable ? 1 : 0);
    }

    public boolean isAllday() {
        return this.allday;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setAllday(boolean z) {
        this.allday = z;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setSensitivity(int i) {
        this.sensitivity = i;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public void setStop(int i) {
        this.stop = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LiftWristBrightView.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("enable");
        sb.append('=');
        sb.append(this.enable);
        sb.append(',');
        sb.append(StatConstants.PARAM_START);
        sb.append('=');
        sb.append(this.start);
        sb.append(',');
        sb.append(BroadcastsKt.SILENT_PUSHING_STOP);
        sb.append('=');
        sb.append(this.stop);
        sb.append(',');
        sb.append("allday");
        sb.append('=');
        sb.append(this.allday);
        sb.append(',');
        sb.append("sensitivity");
        sb.append('=');
        sb.append(this.sensitivity);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
