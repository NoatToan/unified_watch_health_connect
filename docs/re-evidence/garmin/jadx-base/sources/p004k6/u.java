package p004k6;

import android.os.IBinder;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B'\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0011BE\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0012B;\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0013B'\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0014¨\u0006\u0015"}, d2 = {"Lk6/u;", "", "", "dismissOnBackPress", "dismissOnClickOutside", "Lk6/e0;", "securePolicy", "usePlatformDefaultWidth", "decorFitsSystemWindows", "", "windowTitle", "", "windowType", "Landroid/os/IBinder;", "windowToken", "<init>", "(ZZLk6/e0;ZZLjava/lang/String;ILandroid/os/IBinder;)V", "(ZZZ)V", "(ZZLk6/e0;ZZLjava/lang/String;)V", "(ZZLk6/e0;ZZ)V", "(ZZLk6/e0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f103107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f103108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f103109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f103110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f103111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f103112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f103113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IBinder f103114h;

    public /* synthetic */ u(boolean z14, boolean z15, e0 e0Var, boolean z16, boolean z17, String str, int i14, IBinder iBinder, int i15, j jVar) {
        this((i15 & 1) != 0 ? true : z14, (i15 & 2) != 0 ? true : z15, (i15 & 4) != 0 ? e0.Inherit : e0Var, (i15 & 8) != 0 ? true : z16, (i15 & 16) != 0 ? true : z17, (i15 & 32) != 0 ? "" : str, (i15 & 64) != 0 ? 2 : i14, (i15 & 128) != 0 ? null : iBinder);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f103107a == uVar.f103107a && this.f103108b == uVar.f103108b && this.f103109c == uVar.f103109c && this.f103110d == uVar.f103110d && this.f103111e == uVar.f103111e && this.f103113g == uVar.f103113g && s.g(this.f103114h, uVar.f103114h);
    }

    public final int hashCode() {
        int iG = (f.g(f.g((this.f103109c.hashCode() + f.g(Boolean.hashCode(this.f103107a) * 31, 31, this.f103108b)) * 31, 31, this.f103110d), 31, this.f103111e) + this.f103113g) * 31;
        IBinder iBinder = this.f103114h;
        return iG + (iBinder != null ? iBinder.hashCode() : 0);
    }

    public u(boolean z14, boolean z15, e0 e0Var, boolean z16, boolean z17, String str, int i14, IBinder iBinder) {
        this.f103107a = z14;
        this.f103108b = z15;
        this.f103109c = e0Var;
        this.f103110d = z16;
        this.f103111e = z17;
        this.f103112f = str;
        this.f103113g = i14;
        this.f103114h = iBinder;
    }

    public u() {
        this(false, false, null, false, false, null, 0, null, 255, null);
    }

    public /* synthetic */ u(boolean z14, boolean z15, boolean z16, int i14, j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? true : z15, (i14 & 4) != 0 ? true : z16);
    }

    public u(boolean z14, boolean z15, boolean z16) {
        this(z14, z15, e0.Inherit, z16, true, null, 0, null, 224, null);
    }

    public /* synthetic */ u(boolean z14, boolean z15, e0 e0Var, boolean z16, boolean z17, String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? true : z15, (i14 & 4) != 0 ? e0.Inherit : e0Var, (i14 & 8) != 0 ? true : z16, (i14 & 16) != 0 ? true : z17, (i14 & 32) != 0 ? "" : str);
    }

    @e
    public /* synthetic */ u(boolean z14, boolean z15, e0 e0Var, boolean z16, boolean z17, String str) {
        this(z14, z15, e0Var, z16, z17, str, 2, (IBinder) null);
    }

    public /* synthetic */ u(boolean z14, boolean z15, e0 e0Var, boolean z16, boolean z17, int i14, j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? true : z15, (i14 & 4) != 0 ? e0.Inherit : e0Var, (i14 & 8) != 0 ? true : z16, (i14 & 16) != 0 ? true : z17);
    }

    @e
    public /* synthetic */ u(boolean z14, boolean z15, e0 e0Var, boolean z16, boolean z17) {
        this(z14, z15, e0.Inherit, z16, true, "", 0, null, 192, null);
    }

    public /* synthetic */ u(boolean z14, boolean z15, e0 e0Var, int i14, j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? true : z15, (i14 & 4) != 0 ? e0.Inherit : e0Var);
    }

    @e
    public /* synthetic */ u(boolean z14, boolean z15, e0 e0Var) {
        this(z14, z15, e0Var, true, true, null, 0, null, 224, null);
    }
}
