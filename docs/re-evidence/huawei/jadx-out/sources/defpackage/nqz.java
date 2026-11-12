package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwonesdk.datastructure.request.SubDataType;
import com.huawei.operation.jsoperation.JsUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nqz extends nrj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(JsUtil.SUMMARIES_KEY)
    private nra f43495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("dataSourceId")
    private String f43496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("subDataType")
    private SubDataType f43497c;

    @SerializedName("localDate")
    private String d;

    public SubDataType d() {
        return this.f43497c;
    }

    public nra b() {
        return this.f43495a;
    }

    @Override // defpackage.nrj
    public String toString() {
        return "SampleSequenceSaveDataRequest{dataSourceId='" + this.f43496b + "', subDataType=" + this.f43497c + ", localDate='" + this.d + "', summaries=" + this.f43495a + '}';
    }
}
