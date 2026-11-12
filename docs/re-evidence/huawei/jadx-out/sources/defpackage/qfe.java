package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
public class qfe {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("startTime")
    private String f46101c;

    @SerializedName("endTime")
    private String e;

    public void d(String str) {
        this.f46101c = str;
    }

    public void b(String str) {
        this.e = str;
    }

    public String toString() {
        return "ObjectiveCondition{startTime='" + this.f46101c + ", endTime='" + this.e + '}';
    }
}
