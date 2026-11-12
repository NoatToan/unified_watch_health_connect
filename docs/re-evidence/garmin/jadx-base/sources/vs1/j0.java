package vs1;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.UserReviewsUseCase$generateShareUserReviewLink$1", f = "UserReviewsUseCase.kt", l = {75, 76, 88, 91, 92, 96}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pt1.x f179833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0 f179834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f179835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f179836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f179837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f179838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h0 f179839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f179840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f179841i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(h0 h0Var, Context context, long j8, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f179839g = h0Var;
        this.f179840h = context;
        this.f179841i = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j0(this.f179839g, this.f179840h, this.f179841i, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e1 A[PHI: r2 r5 r7 r8 r9
      0x00e1: PHI (r2v12 int) = (r2v10 int), (r2v15 int) binds: [B:26:0x00dd, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r5v10 long) = (r5v8 long), (r5v14 long) binds: [B:26:0x00dd, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r7v4 android.content.Context) = (r7v2 android.content.Context), (r7v9 android.content.Context) binds: [B:26:0x00dd, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r8v4 vs1.h0) = (r8v2 vs1.h0), (r8v5 vs1.h0) binds: [B:26:0x00dd, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r9v11 java.lang.Object) = (r9v9 java.lang.Object), (r9v16 java.lang.Object) binds: [B:26:0x00dd, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:38:0x010e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0111  */
    /* JADX WARN: Code duplicated, block: B:46:0x014e  */
    /* JADX WARN: Code duplicated, block: B:49:0x016f  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a1  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v7 pt1.x, still in use, count: 2, list:
          (r5v7 pt1.x) from 0x0087: PHI (r5 I:??) = (r5v1 pt1.x), (r5v7 pt1.x) binds: [B:18:0x0086, B:60:0x0087] A[DONT_GENERATE, DONT_INLINE]
          (r5v7 pt1.x) from 0x007f: IGET (r5v7 pt1.x) A[WRAPPED] pt1.x.a long
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
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vs1.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
