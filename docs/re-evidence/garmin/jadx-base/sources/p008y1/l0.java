package p008y1;

import b5.a0;
import b5.c;
import e23.a;
import e23.l;
import e23.p;
import e23.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q0;
import t13.d;
import v13.e;
import v13.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", f = "DragGestureDetector.kt", l = {248, 254, 1116, 1158, 279, 1197, 1240, 1252}, m = "invokeSuspend", v = 1)
public final class l0 extends h implements p<c, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f193388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f193389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q0 f193390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q0 f193391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v3 f193392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f193393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f193394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f193395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f193396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f193397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a<Boolean> f193398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q0 f193399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b2 f193400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q<a0, a0, n4.c, Unit> f193401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p<a0, n4.c, Unit> f193402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a<Unit> f193403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l<a0, Unit> f193404q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(a<Boolean> aVar, q0 q0Var, b2 b2Var, q<? super a0, ? super a0, ? super n4.c, Unit> qVar, p<? super a0, ? super n4.c, Unit> pVar, a<Unit> aVar2, l<? super a0, Unit> lVar, d<? super l0> dVar) {
        super(2, dVar);
        this.f193398k = aVar;
        this.f193399l = q0Var;
        this.f193400m = b2Var;
        this.f193401n = qVar;
        this.f193402o = pVar;
        this.f193403p = aVar2;
        this.f193404q = lVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        l0 l0Var = new l0(this.f193398k, this.f193399l, this.f193400m, this.f193401n, this.f193402o, this.f193403p, this.f193404q, dVar);
        l0Var.f193397j = obj;
        return l0Var;
    }

    @Override // e23.p
    public final Object invoke(c cVar, d<? super Unit> dVar) {
        return ((l0) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:163:0x044c A[LOOP:4: B:84:0x02b0->B:163:0x044c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:223:0x0452 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x015c  */
    /* JADX WARN: Code duplicated, block: B:85:0x02b2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [b5.a0] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [b5.a0] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v35, types: [b5.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0340 -> B:113:0x0343). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0346 -> B:115:0x035d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x0435 -> B:157:0x0436). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x0448 -> B:82:0x02a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x049d -> B:172:0x04a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0190 -> B:76:0x0290). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0193 -> B:32:0x01ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0284 -> B:73:0x0288). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x0300 -> B:88:0x02be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
