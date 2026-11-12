package defpackage;

import com.duokan.airkan.common.aidl.ParcelService;

/* JADX INFO: loaded from: classes4.dex */
public class kyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24426b;
    public int c;
    public String[] d;
    public String e;
    public String f;
    public String g;

    public kyl() {
    }

    public boolean a(kyl kylVar) {
        return c() == kylVar.c();
    }

    public String b() {
        String[] strArr = this.d;
        if (strArr != null && strArr.length > 0) {
            return strArr[strArr.length - 1];
        }
        return null;
    }

    public int c() {
        return (String.valueOf(this.f24425a) + this.f24426b + this.c + b() + this.f).hashCode();
    }

    public kyl(ParcelService parcelService) {
        this.f24425a = parcelService.f7037a;
        this.f24426b = parcelService.f7038b;
        this.c = parcelService.c;
        String[] strArr = parcelService.d;
        if (strArr != null) {
            this.d = (String[]) strArr.clone();
        } else {
            this.d = null;
        }
        this.e = this.f24425a;
        this.f = parcelService.e;
    }

    public kyl(kyl kylVar) {
        this.f24425a = kylVar.f24425a;
        this.f24426b = kylVar.f24426b;
        this.c = kylVar.c;
        String[] strArr = kylVar.d;
        if (strArr != null) {
            this.d = (String[]) strArr.clone();
        }
        this.e = kylVar.e;
        this.g = kylVar.g;
        this.f = kylVar.f;
    }
}
