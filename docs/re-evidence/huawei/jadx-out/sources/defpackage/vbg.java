package defpackage;

import android.text.SpannableStringBuilder;
import com.huawei.hihealth.HiHealthData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class vbg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f50895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50896b;
    private long g;
    private List<uwh> d = new ArrayList();
    private volatile Map<String, SpannableStringBuilder> h = new HashMap();
    private List<HiHealthData> e = new ArrayList();
    private List<HiHealthData> i = new ArrayList();
    private long j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f50897c = 0;
    private String f = "TEMPERATURE_MIN_MAX";

    public void a(String str) {
        this.f = str;
    }

    public String a() {
        return this.f;
    }

    public void b(boolean z) {
        this.f50896b = z;
    }

    public void d(long j) {
        this.g = j;
    }

    public long d() {
        return this.g;
    }

    public void c(long j) {
        this.f50895a = j;
    }

    public void a(long j, long j2, long j3) {
        this.d.clear();
        this.j = j;
        this.f50897c = j2;
        this.f50895a = j3;
    }

    public void d(Map<String, SpannableStringBuilder> map) {
        this.h = map;
    }

    public Map<String, SpannableStringBuilder> b() {
        return this.h;
    }

    public List<HiHealthData> c() {
        return this.i;
    }

    public void c(List<HiHealthData> list) {
        this.i = list;
    }

    public String toString() {
        return "TemperatureData{mHealthDataList=" + this.d + ", mJumpTime=" + this.g + '}';
    }
}
