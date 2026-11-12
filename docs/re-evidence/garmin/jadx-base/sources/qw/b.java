package qw;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import e23.r;
import gl1.y;
import lc.m0;
import lc.v;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f148182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f148183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f148184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f148185e;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f148181a = i14;
        this.f148182b = obj;
        this.f148183c = obj2;
        this.f148184d = obj3;
        this.f148185e = obj4;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        yk1.i iVar = (yk1.i) this.f148182b;
        StrideLengthSettingsActivity strideLengthSettingsActivity = (StrideLengthSettingsActivity) this.f148183c;
        e23.a aVar = (e23.a) this.f148184d;
        m0 m0Var = (m0) this.f148185e;
        m mVar = (m) obj3;
        ((Integer) obj4).getClass();
        StrideLengthSettingsActivity.a aVar2 = StrideLengthSettingsActivity.f44198b;
        ((r1.l) obj).getClass();
        ((v) obj2).getClass();
        x1 x1Var = n.f135158a;
        strideLengthSettingsActivity.fa(y.Q(mVar, iVar.C4() ? R.string.lbl_custom_stroke_length : R.string.user_setting_custom_stride_length), aVar, z3.f.c(1706047125, new xk1.e(strideLengthSettingsActivity, 14, iVar, m0Var), mVar), mVar, 384);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0375  */
    /* JADX WARN: Code duplicated, block: B:109:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:116:0x043b  */
    /* JADX WARN: Code duplicated, block: B:128:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:159:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:160:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:166:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:168:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:169:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:176:0x062c  */
    /* JADX WARN: Code duplicated, block: B:250:0x0904  */
    /* JADX WARN: Code duplicated, block: B:262:0x0945  */
    /* JADX WARN: Code duplicated, block: B:274:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:279:0x09e4  */
    /* JADX WARN: Code duplicated, block: B:284:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:306:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:328:0x0b90  */
    /* JADX WARN: Code duplicated, block: B:67:0x022f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0251  */
    /* JADX WARN: Code duplicated, block: B:77:0x0271  */
    /* JADX WARN: Code duplicated, block: B:82:0x0291  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:94:0x0314  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v66 java.lang.Object, still in use, count: 2, list:
          (r4v66 java.lang.Object) from 0x05b6: PHI (r4 I:??) = (r4v63 java.lang.Object), (r4v66 java.lang.Object) binds: [B:156:0x05b5, B:370:0x05b6] A[DONT_GENERATE, DONT_INLINE]
          (r4v66 java.lang.Object) from 0x05aa: CHECK_CAST (ty0.b) (r4v66 java.lang.Object)
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
    @Override // e23.r
    public final java.lang.Object invoke(java.lang.Object r32, java.lang.Object r33, java.lang.Object r34, java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 3340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qw.b.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, boolean z14, Object obj4, int i14) {
        this.f148181a = i14;
        this.f148182b = obj;
        this.f148183c = obj2;
        this.f148185e = obj3;
        this.f148184d = obj4;
    }
}
