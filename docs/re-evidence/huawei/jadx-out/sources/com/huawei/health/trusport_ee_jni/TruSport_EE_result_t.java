package com.huawei.health.trusport_ee_jni;

/* JADX INFO: loaded from: classes32.dex */
public class TruSport_EE_result_t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient long f10303c;
    protected transient boolean d;

    protected TruSport_EE_result_t(long j, boolean z) {
        this.d = z;
        this.f10303c = j;
    }

    public static long b(TruSport_EE_result_t truSport_EE_result_t) {
        if (truSport_EE_result_t == null) {
            return 0L;
        }
        return truSport_EE_result_t.f10303c;
    }

    protected void finalize() {
        c();
    }

    public void c() {
        synchronized (this) {
            long j = this.f10303c;
            if (j != 0) {
                if (this.d) {
                    this.d = false;
                    trusport_eeJNI.delete_TruSport_EE_result_t(j);
                }
                this.f10303c = 0L;
            }
        }
    }

    public float a() {
        return trusport_eeJNI.TruSport_EE_result_t_total_get(this.f10303c, this);
    }

    public float b() {
        return trusport_eeJNI.TruSport_EE_result_t_active_get(this.f10303c, this);
    }

    public float e() {
        return trusport_eeJNI.TruSport_EE_result_t_resting_get(this.f10303c, this);
    }

    public TruSport_EE_result_t() {
        this(trusport_eeJNI.new_TruSport_EE_result_t(), true);
    }
}
