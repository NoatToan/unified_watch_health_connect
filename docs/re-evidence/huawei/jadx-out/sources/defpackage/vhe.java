package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vhe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("needSync")
    private boolean f51092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("biMetaDataList")
    private List<vgy> f51093b;

    @SerializedName("version")
    private int e;

    public int b() {
        return this.e;
    }

    public boolean e() {
        return this.f51092a;
    }

    public List<vgy> a() {
        return this.f51093b;
    }

    public String toString() {
        return "FastingLiteDeviceMessage{mVersion=" + this.e + ", mNeedSync=" + this.f51092a + ", mBiMetaDataList=" + this.f51093b + '}';
    }
}
