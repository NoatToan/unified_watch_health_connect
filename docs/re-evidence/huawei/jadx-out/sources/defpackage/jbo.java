package defpackage;

import android.content.Context;
import com.huawei.health.servicesapi.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.UnitUtil;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jbo implements Serializable {
    private static final long serialVersionUID = 6937177666241928825L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38346c = false;
    private float d;
    private int e;
    private int h;

    public jbo(int i, List<Integer> list) {
        this.f38345b = i;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (this.f38345b == list.get(i2).intValue()) {
                if (i2 == list.size() - 1) {
                    this.h = Integer.MAX_VALUE;
                } else {
                    this.h = list.get(i2 + 1).intValue();
                }
            }
        }
    }

    public int b() {
        return this.f38345b;
    }

    public void b(int i) {
        this.e = i;
    }

    public float c() {
        if (this.f38346c) {
            return Math.round(this.d);
        }
        return this.d;
    }

    public void e(float f) {
        this.d = f;
    }

    public void c(int i) {
        this.f38344a = i;
    }

    public String a() {
        Context context = BaseApplication.getContext();
        double d = UnitUtil.f() ? 1.609344d : 1.0d;
        String strD = hcc.d(BaseApplication.getContext(), (float) (((double) this.h) * d));
        String strD2 = hcc.d(BaseApplication.getContext(), (float) (((double) this.f38345b) * d));
        if (this.f38345b == 0) {
            return context.getString(R.string.IDS_less_than, strD);
        }
        if (this.h > 1000) {
            return context.getString(R.string.IDS_posture_range_more_than, strD2);
        }
        return context.getString(R.string.IDS_posture_range_normal, strD2, strD);
    }

    public String g() {
        return UnitUtil.e(this.e);
    }

    public String e() {
        if (this.e < 60 || this.d <= 0.0f) {
            return "--";
        }
        Context context = BaseApplication.getContext();
        int i = this.f38344a;
        if (i == -1) {
            return context.getString(R.string.IDS_posture_range_description_not_ideal);
        }
        if (i == 0) {
            return context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_normal);
        }
        if (i == 1) {
            return context.getString(R.string.IDS_posture_range_description_good);
        }
        if (i == 2) {
            return context.getString(R.string.IDS_posture_range_description_excellent);
        }
        return context.getString(R.string.IDS_posture_range_description_excellence);
    }

    public void c(boolean z) {
        this.f38346c = z;
    }

    public boolean d() {
        return this.f38346c;
    }
}
