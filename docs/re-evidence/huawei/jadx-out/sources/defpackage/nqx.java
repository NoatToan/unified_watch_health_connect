package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwonesdk.datastructure.request.DataType;
import com.huawei.hwonesdk.datastructure.request.SubDataType;

/* JADX INFO: loaded from: classes11.dex */
public class nqx extends nqu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("subDataType")
    private SubDataType f43494a;

    @SerializedName("sampleConfigDataType")
    private DataType d;

    public DataType l() {
        return this.d;
    }

    public SubDataType k() {
        return this.f43494a;
    }

    @Override // defpackage.nqu, defpackage.nqp
    public String toString() {
        return "SampleConfigReadRequest{sampleConfigDataType=" + l() + ", subDataType=" + k() + '}';
    }
}
