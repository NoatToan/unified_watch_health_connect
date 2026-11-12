package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwonesdk.datastructure.request.DataType;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nrc extends nqu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("dataSourceId")
    private String f43508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("dataType")
    private DataType f43509c;

    @SerializedName("fields")
    private Map<String, Object> e;

    public DataType o() {
        return this.f43509c;
    }

    public String l() {
        return this.f43508b;
    }

    public Map<String, Object> n() {
        return this.e;
    }

    @Override // defpackage.nqu, defpackage.nqp
    public String toString() {
        return super.toString() + "SampleStatReadRequest{mType=" + this.f43509c + "mDataSourceId=" + this.f43508b + ", mFields=" + this.e + '}';
    }
}
