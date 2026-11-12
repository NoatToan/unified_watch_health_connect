package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes11.dex */
public class neb {
    private boolean j = false;
    private boolean m = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42974a = false;
    private boolean f = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42975b = false;
    private boolean h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42976c = false;
    private boolean e = false;
    private boolean g = false;
    private boolean i = false;
    private boolean d = false;
    private boolean k = false;
    private boolean l = false;

    public boolean o() {
        return this.k;
    }

    public void a(boolean z) {
        this.k = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
    }

    public boolean c() {
        return this.d;
    }

    public void b(boolean z) {
        this.d = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
    }

    public boolean f() {
        return this.i;
    }

    public boolean g() {
        return this.h;
    }

    public boolean b() {
        return this.e;
    }

    public boolean j() {
        return this.g;
    }

    public boolean m() {
        return ((Boolean) lst.d(Boolean.valueOf(this.j))).booleanValue();
    }

    public boolean k() {
        return ((Boolean) lst.d(Boolean.valueOf(this.m))).booleanValue();
    }

    public boolean i() {
        return this.f42974a;
    }

    public boolean h() {
        return ((Boolean) lst.d(Boolean.valueOf(this.f))).booleanValue();
    }

    public boolean a() {
        return ((Boolean) lst.d(Boolean.valueOf(this.f42976c))).booleanValue();
    }

    public boolean e() {
        return ((Boolean) lst.d(Boolean.valueOf(this.f42975b))).booleanValue();
    }

    public boolean d() {
        return this.l;
    }

    public void c(boolean z) {
        this.l = z;
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.j = ((Boolean) lst.d(Boolean.valueOf(bundle.getBoolean("weather_support", false)))).booleanValue();
        this.m = ((Boolean) lst.d(Boolean.valueOf(bundle.getBoolean("wind_support", false)))).booleanValue();
        this.f42974a = ((Boolean) lst.d(Boolean.valueOf(bundle.getBoolean("pm2_5_support", false)))).booleanValue();
        this.f = ((Boolean) lst.d((Boolean) lst.d(Boolean.valueOf(bundle.getBoolean("temperature_support", false))))).booleanValue();
        this.f42976c = ((Boolean) lst.d(Boolean.valueOf(bundle.getBoolean("location_name_support", false)))).booleanValue();
        this.f42975b = ((Boolean) lst.d(Boolean.valueOf(bundle.getBoolean("temperature_current_support", false)))).booleanValue();
        this.h = ((Boolean) lst.d(Boolean.valueOf(bundle.getBoolean("unit_support", false)))).booleanValue();
        this.e = ((Boolean) lst.d(Boolean.valueOf(bundle.getBoolean("aqi_support", false)))).booleanValue();
        this.g = ((Boolean) lst.d(Boolean.valueOf(bundle.getBoolean("time_support", false)))).booleanValue();
        this.i = ((Boolean) lst.d(Boolean.valueOf(bundle.getBoolean("source_support", false)))).booleanValue();
        this.d = ((Boolean) lst.d(Boolean.valueOf(bundle.getBoolean("cn_weather_icon_support", false)))).booleanValue();
        this.k = ((Boolean) lst.d(Boolean.valueOf(bundle.getBoolean("weather_icon_expand_support", false)))).booleanValue();
    }
}
