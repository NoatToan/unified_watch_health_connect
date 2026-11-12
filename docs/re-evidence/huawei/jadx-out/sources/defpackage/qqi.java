package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.tencent.open.SocialOperation;

/* JADX INFO: loaded from: classes16.dex */
public class qqi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(RecommendConstants.DOWNLOAD_URL)
    private String f46667a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(SocialOperation.GAME_SIGNATURE)
    private String f46668c;

    @SerializedName(RecommendConstants.VER)
    private String d;

    @SerializedName(RecommendConstants.FILE_ID)
    private String e;

    public String c() {
        return this.f46667a;
    }

    public String d() {
        return this.d;
    }

    public String a() {
        return this.e;
    }
}
