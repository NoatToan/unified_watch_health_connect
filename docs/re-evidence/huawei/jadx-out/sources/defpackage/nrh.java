package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwonesdk.datastructure.request.DataType;
import com.huawei.hwonesdk.datastructure.request.SubDataType;
import com.huawei.operation.jsoperation.JsUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nrh extends nrm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("dataType")
    private DataType f43527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("dataSource")
    private b f43528c;

    @SerializedName("dataSourceId")
    private String d;

    @SerializedName("details")
    private String e;

    @SerializedName("modifiedTime")
    private long f;

    @SerializedName("subUser")
    private String g;

    @SerializedName("localDate")
    private String h;

    @SerializedName("subDataType")
    private SubDataType j;

    @SerializedName("timeZone")
    private String m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("fields")
    private Map<String, Object> f43526a = new HashMap();

    @SerializedName(JsUtil.SUMMARIES_KEY)
    private Map<String, Object> i = new HashMap();

    public nrh(HiHealthData hiHealthData) {
        c(hiHealthData.getStartTime());
        b(hiHealthData.getEndTime());
        d(hiHealthData.getModifiedTime());
        j(hiHealthData.getTimeZone());
        e(hiHealthData.getString("device_uniquecode"));
        c(DateFormatUtil.e(hiHealthData.getStartTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_MDY));
        b(hiHealthData.getSequenceData());
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("productId")
        private String f43530a;

        public c() {
        }

        public void d(String str) {
            this.f43530a = str;
        }
    }

    public class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("deviceInfo")
        private c f43529b;

        public b() {
        }

        public void a(c cVar) {
            this.f43529b = cVar;
        }
    }

    public DataType d() {
        return this.f43527b;
    }

    public void d(DataType dataType) {
        this.f43527b = dataType;
    }

    public void c(SubDataType subDataType) {
        this.j = subDataType;
    }

    public void d(long j) {
        this.f = j;
    }

    public String b() {
        return this.h;
    }

    public void c(String str) {
        this.h = str;
    }

    public void j(String str) {
        this.m = str;
    }

    public Map<String, Object> c() {
        return this.f43526a;
    }

    public void c(Map<String, Object> map) {
        this.f43526a.putAll(map);
    }

    public String a() {
        return this.d;
    }

    public void e(String str) {
        this.d = str;
    }

    public void b(String str) {
        this.e = str;
    }

    public void c(b bVar) {
        this.f43528c = bVar;
    }

    public nrg d(String str) {
        if (this.f43526a.containsKey(str) || (this.f43526a.get(str) instanceof nrg)) {
            return (nrg) this.f43526a.get(str);
        }
        return new nrg();
    }

    public void c(String str, Object obj) {
        this.f43526a.put(str, obj);
    }

    public void d(String str, Object obj) {
        this.i.put(str, obj);
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        this.i = map;
    }

    public void e() {
        this.f43526a.clear();
    }

    public void a(String str) {
        c cVar = new c();
        cVar.d(str);
        b bVar = new b();
        bVar.a(cVar);
        c(bVar);
    }
}
