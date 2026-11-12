package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes11.dex */
public class msz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("rawContactId")
    private int f42366a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("rawContactFeature")
    private String f42367c;

    @SerializedName("sortLetter")
    private String d;

    @SerializedName("rawContactUid")
    private String e;

    public msz(int i, String str, String str2, String str3) {
        this.f42366a = i;
        this.e = str;
        this.f42367c = str2;
        this.d = str3;
    }

    public String a() {
        return this.e;
    }

    public String e() {
        return this.f42367c;
    }

    public int b() {
        return this.f42366a;
    }

    public String toString() {
        return "SimpleContactBean{rawContactId=" + this.f42366a + ", rawContactUid='" + this.e + "', rawContactFeature='" + this.f42367c + "'}";
    }

    public String c() {
        return this.d;
    }
}
