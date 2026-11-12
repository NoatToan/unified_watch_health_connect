package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class nju implements Serializable, TimeSequence {
    private static final long serialVersionUID = -1245764951606553008L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mTime")
    private long f43104c;

    @SerializedName("mSpo2")
    private int e;

    public nju(long j, int i) {
        this.f43104c = j;
        this.e = i;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.f43104c;
    }

    public int b() {
        return this.e;
    }
}
