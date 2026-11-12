package com.huawei.health.trusport_ee_jni;

import defpackage.imo;

/* JADX INFO: loaded from: classes32.dex */
public class TruSport_EE_profile_t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected transient boolean f10302b;
    private transient long e;

    protected TruSport_EE_profile_t(long j, boolean z) {
        this.f10302b = z;
        this.e = j;
    }

    public static long b(TruSport_EE_profile_t truSport_EE_profile_t) {
        if (truSport_EE_profile_t == null) {
            return 0L;
        }
        return truSport_EE_profile_t.e;
    }

    protected void finalize() {
        a();
    }

    public void a() {
        synchronized (this) {
            long j = this.e;
            if (j != 0) {
                if (this.f10302b) {
                    this.f10302b = false;
                    trusport_eeJNI.delete_TruSport_EE_profile_t(j);
                }
                this.e = 0L;
            }
        }
    }

    public void c(short s) {
        trusport_eeJNI.TruSport_EE_profile_t_age_set(this.e, this, s);
    }

    public void b(float f) {
        trusport_eeJNI.TruSport_EE_profile_t_height_set(this.e, this, f);
    }

    public void e(float f) {
        trusport_eeJNI.TruSport_EE_profile_t_weight_set(this.e, this, f);
    }

    public void c(imo imoVar) {
        trusport_eeJNI.TruSport_EE_profile_t_sex_set(this.e, this, imoVar.d());
    }

    public TruSport_EE_profile_t() {
        this(trusport_eeJNI.new_TruSport_EE_profile_t(), true);
    }
}
