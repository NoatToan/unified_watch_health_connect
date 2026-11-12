package jw;

import am.x0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B7\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB/\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Ljw/j;", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "Lru1/a;", "exerciseListAPI", "Lam/x0;", "activityType", "", "isWheelchairEnabled", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "Ljw/j$a;", "mCallback", "<init>", "(Lru1/a;Lam/x0;ZLcom/garmin/android/library/backgroundtaskmanagement/b;Ljw/j$a;)V", "callback", "(Lam/x0;ZLcom/garmin/android/library/backgroundtaskmanagement/b;Ljw/j$a;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ru1.a f101265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x0 f101266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f101267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f101268l;

    public interface a {
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101269a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.f4326r2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.f4329s2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.f4322q2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.C2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.f4309n1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f101269a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(x0 x0Var, boolean z14, com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, a aVar) {
        this((ru1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC_WEB_URL, ru1.a.class, new c83.h.a[0], null, null, null, 120), x0Var, z14, bVar, aVar);
        bVar.getClass();
        aVar.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar;
        c83.a0 a0VarE;
        String str;
        try {
            x0 x0Var = this.f101266j;
            boolean z14 = this.f101267k;
            ru1.a aVar = this.f101265i;
            if (x0Var != null) {
                int i14 = b.f101269a[x0Var.ordinal()];
                if (i14 == 1) {
                    a0VarE = o72.t.K(aVar, z14);
                } else if (i14 == 2) {
                    a0VarE = o72.t.J(aVar, z14);
                } else if (i14 != 3) {
                    a0VarE = (i14 == 4 || i14 != 5) ? o72.t.E(aVar, z14) : o72.t.E(aVar, z14);
                } else {
                    a0VarE = o72.t.O(aVar, z14);
                }
            } else {
                a0VarE = o72.t.E(aVar, z14);
            }
            if (!a0VarE.f25745a.isSuccessful() || (str = (String) a0VarE.f25746b) == null || str.length() == 0) {
                cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA;
            } else {
                ((com.google.android.exoplayer2.analytics.q) this.f101268l).f(str);
                cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            }
        } catch (Exception unused) {
            cVar = com.garmin.android.library.backgroundtaskmanagement.b.c.RECOVERABLE;
        }
        c(cVar);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ru1.a aVar, x0 x0Var, boolean z14, com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, a aVar2) {
        super(bVar);
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        this.f101265i = aVar;
        this.f101266j = x0Var;
        this.f101267k = z14;
        this.f101268l = aVar2;
    }
}
