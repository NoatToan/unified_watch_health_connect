package r32;

import lc.u0;
import o70.t;
import p005kotlin.Metadata;
import p32.c;
import q71.e;
import r70.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lr32/a;", "Lr70/s;", "Lp32/c;", "getVO2MaxDataUseCase", "Lq71/e;", "vo2MaxType", "<init>", "(Lp32/c;Lq71/e;)V", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f150092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f150093b;

    /* JADX INFO: renamed from: r32.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2819a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f150094a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.ROWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f150094a = iArr;
        }
    }

    public a(c cVar, e eVar) {
        cVar.getClass();
        eVar.getClass();
        this.f150092a = cVar;
        this.f150093b = eVar;
    }

    @Override // r70.s
    public final String a() {
        int i14 = C2819a.f150094a[this.f150093b.ordinal()];
        if (i14 == 1) {
            return t.M0.a();
        }
        if (i14 == 2) {
            return t.N0.a();
        }
        if (i14 == 3) {
            return t.O0.a();
        }
        u0.r();
        return null;
    }
}
