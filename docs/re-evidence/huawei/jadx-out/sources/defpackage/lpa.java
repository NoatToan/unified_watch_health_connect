package defpackage;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;

/* JADX INFO: loaded from: classes37.dex */
public class lpa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(ContentResource.FILE_NAME)
    private String f40583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("uploadUrl")
    private String f40584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("uploadHeaders")
    private JsonObject f40585c;

    @SerializedName(RecommendConstants.FILE_ID)
    private String d;

    @SerializedName("uploadMethod")
    private String e;

    public String c() {
        return this.f40583a;
    }

    public String b() {
        return this.d;
    }

    public String a() {
        return this.f40584b;
    }

    public String d() {
        return this.e;
    }

    public JsonObject e() {
        return this.f40585c;
    }
}
