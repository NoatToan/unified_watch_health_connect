package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes42.dex */
public class pmy implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    private String f45697a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("title")
    private String f45698c;

    @SerializedName("detailItemType")
    private String e;

    public pmy(String str, String str2, String str3) {
        this.f45697a = str;
        this.e = str2;
        this.f45698c = str3;
    }

    public String d() {
        return this.e;
    }
}
