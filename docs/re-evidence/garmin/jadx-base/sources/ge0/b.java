package ge0;

import c80.d0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z70.t;
import zd0.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lge0/b;", "Lzd0/j0;", "Lc80/d0;", "target", "<init>", "(Lc80/d0;)V", "a", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f76988a;

    /* JADX INFO: renamed from: ge0.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1554b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f76990b;

        static {
            int[] iArr = new int[d0.b.values().length];
            try {
                iArr[d0.b.GC_PLUS_PAYWALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d0.b.GC_PLUS_EDUCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d0.b.FEEDBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d0.b.ANNUAL_REPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d0.b.LATEST_3D_ACTIVITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d0.b.NUTRITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d0.b.EDIT_BOTTOM_BAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d0.b.INDEX_S1_TO_S2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d0.b.NEWSFEED_DEVICE_IMAGE_SETTING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[d0.b.NATURAL_CYCLES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[d0.b.PERFORMANCE_DASHBOARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[d0.b.TRY_ESSENTIALS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[d0.b.EXCLUSIVE_OFFERS_LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[d0.b.SAFETY_FEATURES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[d0.b.CONNECT_IQ.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[d0.b.COURSES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[d0.b.GROUP_RIDE_AWARDS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[d0.b.ALL_DOGS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f76989a = iArr;
            int[] iArr2 = new int[t.values().length];
            try {
                iArr2[t.GC_PLUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            f76990b = iArr2;
        }
    }

    static {
        new a(null);
        d0.a aVar = d0.f25323d;
    }

    public b(d0 d0Var) {
        d0Var.getClass();
        this.f76988a = d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x027d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0288  */
    /* JADX WARN: Code duplicated, block: B:62:0x0296  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v13 java.lang.Object, still in use, count: 2, list:
          (r4v13 java.lang.Object) from 0x0278: PHI (r4 I:??) = (r4v10 java.lang.Object), (r4v13 java.lang.Object) binds: [B:53:0x0277, B:79:0x0278] A[DONT_GENERATE, DONT_INLINE]
          (r4v13 java.lang.Object) from 0x026c: CHECK_CAST (z70.t) (r4v13 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // zd0.j0
    public final void a(android.content.Context r11) {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ge0.b.a(android.content.Context):void");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lge0/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
