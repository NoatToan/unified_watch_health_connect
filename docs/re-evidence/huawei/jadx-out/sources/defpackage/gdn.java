package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class gdn implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("hotPathAutoParticipatePushSwitch")
    private String f34939c;

    @SerializedName("hotPathAutoParticipateSwitch")
    private String d;

    public String c() {
        return this.d;
    }

    public void e(String str) {
        this.d = str;
    }

    public void b(boolean z) {
        this.d = z ? "1" : "0";
    }

    public String a() {
        return this.f34939c;
    }

    public void d(boolean z) {
        this.f34939c = z ? "1" : "0";
    }

    public String toString() {
        return "PathAutoSwitchInfo{mHotPathAutoParticipateSwitch='" + this.d + "', mHotPathAutoParticipatePushSwitch=" + this.f34939c + '}';
    }
}
