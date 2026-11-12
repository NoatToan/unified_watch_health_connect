package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class rbi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("startVersion")
    private String f47086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("modelId")
    private String f47087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("featureId")
    private String f47088c;

    @SerializedName("endVersion")
    private String d;

    @SerializedName(FaqConstants.FAQ_MODELTYPE)
    private String e;

    @SerializedName("versionMap")
    private List<rbk> g;

    public String d() {
        return this.f47088c;
    }

    public String b() {
        return this.f47086a;
    }

    public String c() {
        return this.d;
    }

    public List<rbk> a() {
        return this.g;
    }
}
