package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes12.dex */
public class oeg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("activeType")
    private int f44229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("ciphertext")
    private String f44230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("carrierType")
    private String f44231c;

    @SerializedName("timestamp")
    private long d;

    @SerializedName("ciphertextSign")
    private String e;

    public String d() {
        return this.f44230b;
    }

    public String e() {
        return this.e;
    }
}
