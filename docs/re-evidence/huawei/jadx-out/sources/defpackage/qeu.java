package defpackage;

import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;

/* JADX INFO: loaded from: classes43.dex */
public class qeu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("extraParam")
    private String f46077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("category")
    private int f46078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("endDay")
    private int f46079c;

    @SerializedName("enableEqPunch")
    private boolean d;

    @SerializedName(SocialConstants.PARAM_APP_DESC)
    private String e;

    @SerializedName("previewPlan")
    private boolean f;

    @SerializedName("subCategory")
    private int g;

    @SerializedName("name")
    private String h;

    @SerializedName("startDay")
    private int i;

    @SerializedName("templateId")
    private String j;

    @SerializedName("timeZone")
    private String l;

    public String a() {
        return this.h;
    }

    public int d() {
        return this.f46078b;
    }

    public int h() {
        return this.g;
    }

    public String f() {
        return this.j;
    }

    public String b() {
        return this.e;
    }

    public int e() {
        return this.i;
    }

    public int c() {
        return this.f46079c;
    }

    public String i() {
        return this.l;
    }

    public boolean g() {
        return this.d;
    }

    public String toString() {
        return "PlanInfo{name='" + this.h + ", category=" + this.f46078b + ", subCategory=" + this.g + ", templateId='" + this.j + ", desc='" + this.e + ", startDay=" + this.i + ", endDay=" + this.f46079c + ", timeZone='" + this.l + ", extraParam='" + this.f46077a + ", enableEqPunch=" + this.d + ", previewPlan=" + this.f + '}';
    }
}
