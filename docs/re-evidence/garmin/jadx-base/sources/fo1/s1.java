package fo1;

import android.os.Parcelable;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001Ba\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfo1/s1;", "Landroidx/lifecycle/x1$c;", "Lam/c2;", "resourceType", "", "resourceId", "commentUuid", "Landroid/os/Parcelable;", "headerItem", "", "isMyActivity", "overrideShouldGoToLastComment", "openKeyboard", "allowNavigationToActivityDetails", "<init>", "(Lam/c2;Ljava/lang/String;Ljava/lang/String;Landroid/os/Parcelable;ZZZZ)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s1 implements androidx.lifecycle.x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final am.c2 f72760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Parcelable f72763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f72764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f72765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f72766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f72767h;

    public /* synthetic */ s1(am.c2 c2Var, String str, String str2, Parcelable parcelable, boolean z14, boolean z15, boolean z16, boolean z17, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : c2Var, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : parcelable, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? false : z15, (i14 & 64) != 0 ? false : z16, (i14 & 128) != 0 ? true : z17);
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends androidx.lifecycle.u1> T create(Class<T> cls) {
        cls.getClass();
        if (!cls.equals(o0.class)) {
            vb.h.s("Failed requirement.");
            return null;
        }
        return new o0(this.f72760a, this.f72761b, this.f72762c, this.f72763d, this.f72764e, this.f72765f, this.f72766g, this.f72767h);
    }

    public s1(am.c2 c2Var) {
        this(c2Var, null, null, null, false, false, false, false, 254, null);
    }

    public s1(am.c2 c2Var, String str) {
        this(c2Var, str, null, null, false, false, false, false, 252, null);
    }

    public s1(am.c2 c2Var, String str, String str2) {
        this(c2Var, str, str2, null, false, false, false, false, 248, null);
    }

    public s1(am.c2 c2Var, String str, String str2, Parcelable parcelable) {
        this(c2Var, str, str2, parcelable, false, false, false, false, PsExtractor.VIDEO_STREAM_MASK, null);
    }

    public s1(am.c2 c2Var, String str, String str2, Parcelable parcelable, boolean z14) {
        this(c2Var, str, str2, parcelable, z14, false, false, false, 224, null);
    }

    public s1(am.c2 c2Var, String str, String str2, Parcelable parcelable, boolean z14, boolean z15) {
        this(c2Var, str, str2, parcelable, z14, z15, false, false, 192, null);
    }

    public s1(am.c2 c2Var, String str, String str2, Parcelable parcelable, boolean z14, boolean z15, boolean z16) {
        this(c2Var, str, str2, parcelable, z14, z15, z16, false, 128, null);
    }

    public s1(am.c2 c2Var, String str, String str2, Parcelable parcelable, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f72760a = c2Var;
        this.f72761b = str;
        this.f72762c = str2;
        this.f72763d = parcelable;
        this.f72764e = z14;
        this.f72765f = z15;
        this.f72766g = z16;
        this.f72767h = z17;
    }

    public s1() {
        this(null, null, null, null, false, false, false, false, 255, null);
    }
}
