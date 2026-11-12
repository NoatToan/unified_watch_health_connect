package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class hbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("moduleName")
    private String f36354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("timbre")
    private String f36355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("version")
    private List<Integer> f36356c;

    @SerializedName("language")
    private String e;

    public void d(List<Integer> list) {
        this.f36356c = list;
    }

    public void d(String str) {
        this.e = str;
    }
}
