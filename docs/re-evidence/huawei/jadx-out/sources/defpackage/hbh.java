package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes8.dex */
public class hbh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("fileSize")
    private int f36350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("langId")
    private String f36351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("description")
    private String f36352c;

    @SerializedName("langName")
    private String d;

    @SerializedName("jsonUrl")
    private String e;

    @SerializedName("language")
    private String f;

    @SerializedName("langUrl")
    private String g;

    @SerializedName("version")
    private String h;

    @SerializedName("timbre")
    private String i;

    @SerializedName("moduleName")
    private String j;

    public int c() {
        return this.f36350a;
    }

    public String e() {
        return this.j;
    }

    public String d() {
        return this.e;
    }

    public String a() {
        return this.g;
    }

    public String g() {
        return this.h;
    }

    public String b() {
        return this.f;
    }

    public String i() {
        return this.i;
    }

    public String toString() {
        return "VoiceBroadcastInfo{mLangName='" + this.d + "', mDescription='" + this.f36352c + "', mLangId='" + this.f36351b + "', mVersion='" + this.h + "', mLanguage='" + this.f + "', mTimbre='" + this.i + "', mModuleName='" + this.j + "', mJsonUrl='" + this.e + "', mFileSize=" + this.f36350a + '}';
    }
}
