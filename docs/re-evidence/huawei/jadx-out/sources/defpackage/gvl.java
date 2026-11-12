package defpackage;

import com.huawei.health.section.section.MeasureCardItemHolder;
import com.huawei.hihealth.HiHealthData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gvl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HiHealthData f36091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HiHealthData f36092c;
    private String f;
    private MeasureCardItemHolder.MeasureType i;
    private final List<gvh> h = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36090a = true;
    private boolean d = true;
    private String[] e = null;

    public gvl(MeasureCardItemHolder.MeasureType measureType) {
        this.i = measureType;
    }

    public void e() {
        synchronized (this) {
            this.f36091b = null;
            this.f36092c = null;
            this.h.clear();
            this.f = null;
            this.f36090a = true;
            this.d = true;
        }
    }

    public MeasureCardItemHolder.MeasureType d() {
        return this.i;
    }

    public gvl c(HiHealthData hiHealthData) {
        synchronized (this) {
            this.f36091b = hiHealthData;
        }
        return this;
    }

    public HiHealthData c() {
        HiHealthData hiHealthData;
        synchronized (this) {
            hiHealthData = this.f36092c;
        }
        return hiHealthData;
    }

    public gvl d(HiHealthData hiHealthData) {
        synchronized (this) {
            this.f36092c = hiHealthData;
        }
        return this;
    }

    public gvl c(List<gvh> list) {
        synchronized (this) {
            this.h.clear();
            if (list != null) {
                this.h.addAll(list);
            }
        }
        return this;
    }

    public HiHealthData a() {
        HiHealthData hiHealthData;
        synchronized (this) {
            hiHealthData = this.f36091b;
        }
        return hiHealthData;
    }

    public List<gvh> j() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.h);
        }
        return arrayList;
    }

    public String h() {
        String str;
        synchronized (this) {
            str = this.f;
        }
        return str;
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = this.e;
        if (strArr == null || strArr.length <= 0) {
            return sb.toString();
        }
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public gvl c(String str, String... strArr) {
        synchronized (this) {
            this.f = str;
            this.e = strArr;
        }
        return this;
    }

    public boolean f() {
        boolean z;
        synchronized (this) {
            z = this.f36090a;
        }
        return z;
    }

    public gvl c(boolean z) {
        synchronized (this) {
            this.f36090a = z;
        }
        return this;
    }

    public boolean g() {
        boolean z;
        synchronized (this) {
            z = this.d;
        }
        return z;
    }

    public gvl d(boolean z) {
        synchronized (this) {
            this.d = z;
        }
        return this;
    }
}
