package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwonesdk.datastructure.request.DataType;
import com.huawei.hwonesdk.datastructure.request.SubDataType;
import health.compact.a.CommonUtils;

/* JADX INFO: loaded from: classes11.dex */
public class nre extends nrm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("configSubDataType")
    private SubDataType f43511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("localDate")
    private String f43512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("configData")
    private String f43513c;

    @SerializedName("configDescription")
    private String d;

    @SerializedName("dataType")
    private DataType e;

    @SerializedName("scopeApp")
    private String f;

    @SerializedName("modifiedTime")
    private long g;

    @SerializedName("scopeDeviceType")
    private String h;

    @SerializedName("timeZone")
    private String i;

    public nre(HiSampleConfig hiSampleConfig) {
        c(hiSampleConfig.getModifiedTime());
        b(hiSampleConfig.getModifiedTime());
        a(new DataType(hiSampleConfig.getId(), ""));
        b(hiSampleConfig.getConfigData());
        b(new SubDataType(CommonUtils.j(hiSampleConfig.getConfigId())));
        a(hiSampleConfig.getScopeApp());
        e(hiSampleConfig.getScopeDeviceType());
        c(hiSampleConfig.getConfigDescription());
        a(hiSampleConfig.getModifiedTime());
        d(DateFormatUtil.e(hiSampleConfig.getModifiedTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_MDY));
    }

    public void a(long j) {
        this.g = j;
    }

    public void d(String str) {
        this.f43512b = str;
    }

    public void a(DataType dataType) {
        this.e = dataType;
    }

    public void b(SubDataType subDataType) {
        this.f43511a = subDataType;
    }

    public void b(String str) {
        this.f43513c = str;
    }

    public void a(String str) {
        this.f = str;
    }

    public void e(String str) {
        this.h = str;
    }

    public void c(String str) {
        this.d = str;
    }

    @Override // defpackage.nrm
    public String toString() {
        return "ArkUIConfigData{modifiedTime=" + this.g + ", localDate='" + this.f43512b + "', timeZone='" + this.i + "', dataType=" + this.e + ", configSubDataType=" + this.f43511a + ", configData='" + this.f43513c + "', scopeApp='" + this.f + "', scopeDeviceType='" + this.h + "', configDescription='" + this.d + "'}";
    }
}
