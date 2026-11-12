package is;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lis/r;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f94896a = new r();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94897a;

        static {
            int[] iArr = new int[jr.n.values().length];
            try {
                iArr[jr.n.AEROBIC_EFFECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jr.n.ANAEROBIC_EFFECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jr.n.MOUNTAIN_BIKE_JUMPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94897a = iArr;
        }
    }

    private r() {
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01ce  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v11 java.lang.Object, still in use, count: 2, list:
          (r2v11 java.lang.Object) from 0x01ca: PHI (r2 I:??) = (r2v8 java.lang.Object), (r2v11 java.lang.Object) binds: [B:72:0x01c9, B:105:0x01ca] A[DONT_GENERATE, DONT_INLINE]
          (r2v11 java.lang.Object) from 0x01c0: CHECK_CAST (im.b) (r2v11 java.lang.Object)
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
    public static nr.w0 a(nr.j r10, jr.n r11) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: is.r.a(nr.j, jr.n):nr.w0");
    }
}
