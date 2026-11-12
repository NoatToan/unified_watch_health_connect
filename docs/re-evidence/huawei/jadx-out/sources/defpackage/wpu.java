package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;

/* JADX INFO: loaded from: classes19.dex */
public class wpu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("bg_img")
    @Expose
    private String f52332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(SocialConstants.PARAM_APP_DESC)
    @Expose
    private String f52333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("has_device_no_data_desc")
    @Expose
    private String f52334c;

    @SerializedName("id")
    @Expose
    private String d;

    @SerializedName("has_device_no_data_img")
    @Expose
    private String e;

    @SerializedName("name")
    @Expose
    private String g;

    @SerializedName("res_package")
    @Expose
    private String i;

    public String b() {
        return this.g;
    }

    public String c() {
        return this.f52333b;
    }

    public String d() {
        return this.f52332a;
    }

    public String e() {
        return this.e;
    }

    public String a() {
        return this.f52334c;
    }
}
