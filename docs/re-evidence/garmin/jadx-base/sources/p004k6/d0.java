package p004k6;

import android.os.IBinder;
import com.garmin.proto.generated.GDIInReachMessaging;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p3.j0;
import q6.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB;\b\u0016\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0011BO\b\u0017\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0014BC\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0015B1\b\u0017\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0016BE\b\u0016\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0017Be\b\u0016\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u0018¨\u0006\u0019"}, d2 = {"Lk6/d0;", "", "", "flags", "", "inheritSecurePolicy", "dismissOnBackPress", "dismissOnClickOutside", "excludeFromSystemGesture", "usePlatformDefaultWidth", "windowType", "Landroid/os/IBinder;", "windowToken", "<init>", "(IZZZZZILandroid/os/IBinder;)V", "focusable", "clippingEnabled", "(ZZZZZ)V", "Lk6/e0;", "securePolicy", "(ZZZLk6/e0;ZZZ)V", "(IZZZZZ)V", "(ZZZZ)V", "(ZZZLk6/e0;ZZ)V", "(ZZZLk6/e0;ZZZILandroid/os/IBinder;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f103020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f103021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f103022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f103023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f103024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f103025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f103026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IBinder f103027h;

    public /* synthetic */ d0(boolean z14, boolean z15, boolean z16, e0 e0Var, boolean z17, boolean z18, boolean z19, int i14, IBinder iBinder, int i15, j jVar) {
        this((i15 & 1) != 0 ? false : z14, (i15 & 2) != 0 ? true : z15, (i15 & 4) != 0 ? true : z16, (i15 & 8) != 0 ? e0.Inherit : e0Var, (i15 & 16) != 0 ? true : z17, (i15 & 32) != 0 ? true : z18, (i15 & 64) != 0 ? false : z19, (i15 & 128) != 0 ? 1002 : i14, (i15 & 256) != 0 ? null : iBinder);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f103020a == d0Var.f103020a && this.f103021b == d0Var.f103021b && this.f103022c == d0Var.f103022c && this.f103023d == d0Var.f103023d && this.f103024e == d0Var.f103024e && this.f103025f == d0Var.f103025f && this.f103026g == d0Var.f103026g && s.g(this.f103027h, d0Var.f103027h);
    }

    public final int hashCode() {
        int iG = (f.g(f.g(f.g(f.g(f.g(this.f103020a * 31, 31, this.f103021b), 31, this.f103022c), 31, this.f103023d), 31, this.f103024e), 31, this.f103025f) + this.f103026g) * 31;
        IBinder iBinder = this.f103027h;
        return iG + (iBinder != null ? iBinder.hashCode() : 0);
    }

    public /* synthetic */ d0(int i14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i15, IBinder iBinder, int i16, j jVar) {
        this(i14, (i16 & 2) != 0 ? true : z14, (i16 & 4) != 0 ? true : z15, (i16 & 8) != 0 ? true : z16, (i16 & 16) != 0 ? true : z17, (i16 & 32) != 0 ? false : z18, (i16 & 64) != 0 ? 1002 : i15, (i16 & 128) != 0 ? null : iBinder);
    }

    public /* synthetic */ d0(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? true : z15, (i14 & 4) != 0 ? true : z16, (i14 & 8) != 0 ? true : z17, (i14 & 16) != 0 ? false : z18);
    }

    public d0(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this(z14, z15, z16, e0.Inherit, true, z17, z18, 1002, (IBinder) null);
    }

    public /* synthetic */ d0(boolean z14, boolean z15, boolean z16, e0 e0Var, boolean z17, boolean z18, boolean z19, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? true : z15, (i14 & 4) != 0 ? true : z16, (i14 & 8) != 0 ? e0.Inherit : e0Var, (i14 & 16) != 0 ? true : z17, (i14 & 32) != 0 ? true : z18, (i14 & 64) != 0 ? false : z19);
    }

    @e
    public /* synthetic */ d0(boolean z14, boolean z15, boolean z16, e0 e0Var, boolean z17, boolean z18, boolean z19) {
        this(z14, z15, z16, e0Var, z17, z18, z19, 1002, (IBinder) null);
    }

    public /* synthetic */ d0(int i14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i15, j jVar) {
        this(i14, (i15 & 2) != 0 ? true : z14, (i15 & 4) != 0 ? true : z15, (i15 & 8) != 0 ? true : z16, (i15 & 16) != 0 ? true : z17, (i15 & 32) != 0 ? false : z18);
    }

    @e
    public /* synthetic */ d0(int i14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this(i14, z14, z15, z16, z17, z18, 1002, (IBinder) null);
    }

    public /* synthetic */ d0(boolean z14, boolean z15, boolean z16, boolean z17, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? true : z15, (i14 & 4) != 0 ? true : z16, (i14 & 8) != 0 ? true : z17);
    }

    @e
    public /* synthetic */ d0(boolean z14, boolean z15, boolean z16, boolean z17) {
        this(z14, z15, z16, e0.Inherit, true, z17);
    }

    public /* synthetic */ d0(boolean z14, boolean z15, boolean z16, e0 e0Var, boolean z17, boolean z18, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? true : z15, (i14 & 4) != 0 ? true : z16, (i14 & 8) != 0 ? e0.Inherit : e0Var, (i14 & 16) != 0 ? true : z17, (i14 & 32) != 0 ? true : z18);
    }

    public d0(boolean z14, boolean z15, boolean z16, e0 e0Var, boolean z17, boolean z18) {
        this(z14, z15, z16, e0Var, z17, z18, false, 0, null, 384, null);
    }

    public d0(int i14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i15, IBinder iBinder) {
        this.f103020a = i14;
        this.f103021b = z14;
        this.f103022c = z15;
        this.f103023d = z16;
        this.f103024e = z17;
        this.f103025f = z18;
        this.f103026g = i15;
        this.f103027h = iBinder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d0(boolean z14, boolean z15, boolean z16, e0 e0Var, boolean z17, boolean z18, boolean z19, int i14, IBinder iBinder) {
        j0 j0Var = g.f103039a;
        int i15 = !z14 ? 262152 : GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
        i15 = e0Var == e0.SecureOn ? i15 | 8192 : i15;
        this(z18 ? i15 : i15 | 512, e0Var == e0.Inherit, z15, z16, z17, z19, i14, iBinder);
    }
}
