package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fdn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("country")
    private String f33901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("name")
    protected String f33902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(RecommendConstants.VER)
    private int f33903c;

    @SerializedName("featureList")
    private List<fdi> e;

    public List<fdi> c() {
        return this.e;
    }

    public int b() {
        return this.f33903c;
    }
}
