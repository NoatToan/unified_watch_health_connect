package bs2;

import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class rc extends sc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f20456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f20457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<vc> f20459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList<pw> f20460i;

    public rc(rc rcVar) {
        super(rcVar);
        if (rcVar != null) {
            this.f20453b = rcVar.f20453b;
            this.f20454c = rcVar.f20454c;
            this.f20455d = rcVar.f20455d;
            this.f20456e = rcVar.f20456e;
            this.f20457f = rcVar.f20457f;
            this.f20458g = rcVar.f20458g;
            this.f20459h = rcVar.f20459h;
            this.f20460i = rcVar.f20460i;
            return;
        }
        this.f20453b = PrivacyUpdateRequestError.UNKNOWN;
        this.f20454c = 255;
        this.f20455d = 0;
        zn znVar = zn.ENUM;
        this.f20456e = 1.0d;
        this.f20457f = 0.0d;
        this.f20458g = false;
        this.f20480a = new ArrayList<>();
        this.f20459h = new ArrayList<>();
        this.f20460i = new ArrayList<>();
    }

    @Override // bs2.sc
    public final String c() {
        return this.f20453b;
    }

    @Override // bs2.sc
    public final double e() {
        return this.f20457f;
    }

    @Override // bs2.sc
    public final double f() {
        return this.f20456e;
    }

    @Override // bs2.sc
    public final pw h(int i14) {
        if (i14 < 0) {
            return null;
        }
        ArrayList<pw> arrayList = this.f20460i;
        if (i14 < arrayList.size()) {
            return arrayList.get(i14);
        }
        return null;
    }

    @Override // bs2.sc
    public final int i() {
        return this.f20455d;
    }

    public rc(String str, int i14, int i15, double d14, double d15, String str2, boolean z14, zn znVar) {
        this.f20453b = str;
        this.f20454c = i14;
        this.f20455d = i15;
        this.f20456e = d14;
        this.f20457f = d15;
        this.f20458g = z14;
        this.f20459h = new ArrayList<>();
        this.f20460i = new ArrayList<>();
    }
}
