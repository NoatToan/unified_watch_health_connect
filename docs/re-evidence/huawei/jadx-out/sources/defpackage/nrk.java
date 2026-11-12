package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwonesdk.datastructure.request.DataType;
import com.huawei.operation.jsoperation.JsUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nrk extends nrj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("configDescription")
    private String f43536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("configData")
    private String f43537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("configSubType")
    private DataType f43538c;

    @SerializedName("details")
    private String d;

    @SerializedName("fields")
    private Map<String, Object> e;

    @SerializedName("scopeApp")
    private String f;

    @SerializedName("recordId")
    private String g;

    @SerializedName("scopeDeviceType")
    private String h;

    @SerializedName("subDataType")
    private DataType i;

    @SerializedName(JsUtil.SUMMARIES_KEY)
    private Map<String, Object> j;

    @Override // defpackage.nrj
    public String toString() {
        return "SampleData{fields=" + this.e + ", configSubtype=" + this.f43538c + ", configData='" + this.f43537b + "', scopeApp='" + this.f + "', scopeDeviceType='" + this.h + "', configDescription='" + this.f43536a + "', subDataType=" + this.i + ", summaries=" + this.j + ", details='" + this.d + "', recordId='" + this.g + "'}";
    }
}
