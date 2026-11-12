package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes17.dex */
public class sng {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("audioId")
    private String f48411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("audioUrl")
    private String f48412c;

    @SerializedName("audioDuration")
    private long e;

    public String e() {
        return this.f48411b;
    }

    public String a() {
        return this.f48412c;
    }

    public long b() {
        return this.e;
    }

    public String toString() {
        return "AudioDaoBean{audioId='" + this.f48411b + "', audioUrl='" + this.f48412c + "', audioDuration=" + this.e + '}';
    }
}
