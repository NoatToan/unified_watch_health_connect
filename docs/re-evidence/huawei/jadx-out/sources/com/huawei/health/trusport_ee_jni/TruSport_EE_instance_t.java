package com.huawei.health.trusport_ee_jni;

/* JADX INFO: loaded from: classes32.dex */
public class TruSport_EE_instance_t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient long f10301b;
    protected transient boolean e;

    protected TruSport_EE_instance_t(long j, boolean z) {
        this.e = z;
        this.f10301b = j;
    }

    public static long c(TruSport_EE_instance_t truSport_EE_instance_t) {
        if (truSport_EE_instance_t == null) {
            return 0L;
        }
        return truSport_EE_instance_t.f10301b;
    }

    protected void finalize() {
        d();
    }

    public void d() {
        synchronized (this) {
            long j = this.f10301b;
            if (j != 0) {
                if (this.e) {
                    this.e = false;
                    trusport_eeJNI.delete_TruSport_EE_instance_t(j);
                }
                this.f10301b = 0L;
            }
        }
    }

    public TruSport_EE_instance_t() {
        this(trusport_eeJNI.new_TruSport_EE_instance_t(), true);
    }
}
