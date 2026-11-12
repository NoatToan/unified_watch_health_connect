package aa2;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Laa2/t;", "", "Lca2/b;", "passcodeScreen", "", "currentPasscode", "newPasscode", "confirmedPasscode", "", "remainingAttempts", "", "passcodeMismatch", "passcodeMismatchDialog", "passcodeBlocked", "passcodeLocked", "loading", "complete", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "passcodeReset", "hasWalletSetUp", "<init>", "(Lca2/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZZZZZZZZ)V", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ca2.b f2374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2384k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f2386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2387n;

    public /* synthetic */ t(ca2.b bVar, String str, String str2, String str3, int i14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, int i15, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? "" : str2, (i15 & 8) == 0 ? str3 : "", (i15 & 16) != 0 ? 5 : i14, (i15 & 32) != 0 ? false : z14, (i15 & 64) != 0 ? false : z15, (i15 & 128) != 0 ? false : z16, (i15 & 256) != 0 ? false : z17, (i15 & 512) != 0 ? false : z18, (i15 & 1024) != 0 ? false : z19, (i15 & 2048) != 0 ? false : z24, (i15 & 4096) != 0 ? false : z25, (i15 & 8192) != 0 ? false : z26);
    }

    public static t a(t tVar, ca2.b bVar, String str, String str2, String str3, int i14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, int i15) {
        ca2.b bVar2 = (i15 & 1) != 0 ? tVar.f2374a : bVar;
        String str4 = (i15 & 2) != 0 ? tVar.f2375b : str;
        String str5 = (i15 & 4) != 0 ? tVar.f2376c : str2;
        String str6 = (i15 & 8) != 0 ? tVar.f2377d : str3;
        int i16 = (i15 & 16) != 0 ? tVar.f2378e : i14;
        boolean z25 = (i15 & 32) != 0 ? tVar.f2379f : z14;
        boolean z26 = (i15 & 64) != 0 ? tVar.f2380g : z15;
        boolean z27 = (i15 & 128) != 0 ? tVar.f2381h : z16;
        boolean z28 = (i15 & 256) != 0 ? tVar.f2382i : z17;
        boolean z29 = (i15 & 512) != 0 ? tVar.f2383j : z18;
        boolean z34 = (i15 & 1024) != 0 ? tVar.f2384k : true;
        boolean z35 = (i15 & 2048) != 0 ? tVar.f2385l : z19;
        boolean z36 = (i15 & 4096) != 0 ? tVar.f2386m : true;
        boolean z37 = (i15 & 8192) != 0 ? tVar.f2387n : z24;
        tVar.getClass();
        bVar2.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        return new t(bVar2, str4, str5, str6, i16, z25, z26, z27, z28, z29, z34, z35, z36, z37);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2374a == tVar.f2374a && p005kotlin.jvm.internal.s.g(this.f2375b, tVar.f2375b) && p005kotlin.jvm.internal.s.g(this.f2376c, tVar.f2376c) && p005kotlin.jvm.internal.s.g(this.f2377d, tVar.f2377d) && this.f2378e == tVar.f2378e && this.f2379f == tVar.f2379f && this.f2380g == tVar.f2380g && this.f2381h == tVar.f2381h && this.f2382i == tVar.f2382i && this.f2383j == tVar.f2383j && this.f2384k == tVar.f2384k && this.f2385l == tVar.f2385l && this.f2386m == tVar.f2386m && this.f2387n == tVar.f2387n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2387n) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q2.d(this.f2378e, wr.g.j(wr.g.j(wr.g.j(this.f2374a.hashCode() * 31, 31, this.f2375b), 31, this.f2376c), 31, this.f2377d), 31), 31, this.f2379f), 31, this.f2380g), 31, this.f2381h), 31, this.f2382i), 31, this.f2383j), 31, this.f2384k), 31, this.f2385l), 31, this.f2386m);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DevicePasscodeUIState(passcodeScreen=");
        sb3.append(this.f2374a);
        sb3.append(", currentPasscode=");
        sb3.append(this.f2375b);
        sb3.append(", newPasscode=");
        sn.a.t(sb3, this.f2376c, ", confirmedPasscode=", this.f2377d, ", remainingAttempts=");
        fb1.c.x(sb3, this.f2378e, ", passcodeMismatch=", this.f2379f, ", passcodeMismatchDialog=");
        kg.f.q(", passcodeBlocked=", ", passcodeLocked=", sb3, this.f2380g, this.f2381h);
        kg.f.q(", loading=", ", complete=", sb3, this.f2382i, this.f2383j);
        kg.f.q(", error=", ", passcodeReset=", sb3, this.f2384k, this.f2385l);
        return com.airbnb.lottie.animation.keyframe.a.f(", hasWalletSetUp=", ")", sb3, this.f2386m, this.f2387n);
    }

    public t(ca2.b bVar, String str, String str2, String str3, int i14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26) {
        bVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f2374a = bVar;
        this.f2375b = str;
        this.f2376c = str2;
        this.f2377d = str3;
        this.f2378e = i14;
        this.f2379f = z14;
        this.f2380g = z15;
        this.f2381h = z16;
        this.f2382i = z17;
        this.f2383j = z18;
        this.f2384k = z19;
        this.f2385l = z24;
        this.f2386m = z25;
        this.f2387n = z26;
    }
}
