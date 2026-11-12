package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;

/* JADX INFO: loaded from: classes15.dex */
public class plg extends gyc {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("isLoading")
    private boolean f45593c;

    @SerializedName("isDownload")
    private boolean d;

    @SerializedName(RecommendConstants.DOWNLOAD_URL)
    private String e;

    public void e(boolean z) {
        this.d = z;
    }

    public String c() {
        return this.e;
    }

    public void c(String str) {
        this.e = str;
    }

    public boolean a() {
        return this.f45593c;
    }

    public void a(boolean z) {
        this.f45593c = z;
    }
}
