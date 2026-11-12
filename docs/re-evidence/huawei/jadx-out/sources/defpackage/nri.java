package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nri extends nrm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("type")
    private int f43531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("valueHolder")
    private Map<String, Object> f43532c = new HashMap();

    @SerializedName("subType")
    private int e;

    public nri(HiHealthData hiHealthData) {
        c(hiHealthData.getStartTime());
        b(hiHealthData.getEndTime());
        a(DateFormatUtil.e(hiHealthData.getStartTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_MDY));
    }

    public void c(int i) {
        this.f43531b = i;
    }

    public void a(String str) {
        this.f43532c.put("localDate", str);
    }

    public void e(int i) {
        this.e = i;
    }

    public void d(Map<String, Object> map) {
        this.f43532c = map;
    }

    public void d(String str, Object obj) {
        this.f43532c.put(str, obj);
    }
}
