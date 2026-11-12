package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lr53/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1", f = "SnapshotFlow.kt", l = {476, 479, 484}, m = "invokeSuspend", v = 1)
public final class w3 extends v13.i implements e23.p<r53.j<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i3 f135373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q53.i f135374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f135375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f135376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f135377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i3 f135378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a<Object> f135379g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(i3 i3Var, e23.a<Object> aVar, t13.d<? super w3> dVar) {
        super(2, dVar);
        this.f135378f = i3Var;
        this.f135379g = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w3 w3Var = new w3(this.f135378f, this.f135379g, dVar);
        w3Var.f135377e = obj;
        return w3Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<Object> jVar, t13.d<? super Unit> dVar) {
        return ((w3) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078 A[Catch: all -> 0x0022, PHI: r1 r6 r8 r9
      0x0078: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v8 java.lang.Object) binds: [B:27:0x0075, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0078: PHI (r6v7 ??) = (r6v10 ??), (r6v11 ??) binds: [B:27:0x0075, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0078: PHI (r8v6 ??) = (r8v9 ??), (r8v10 ??) binds: [B:27:0x0075, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0078: PHI (r9v3 r53.j) = (r9v2 r53.j), (r9v7 r53.j) binds: [B:27:0x0075, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0022, blocks: (B:15:0x0036, B:29:0x0078, B:26:0x0067, B:31:0x0082, B:8:0x001e), top: B:47:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0082 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:15:0x0036, B:29:0x0078, B:26:0x0067, B:31:0x0082, B:8:0x001e), top: B:47:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [p3.j3] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2, types: [q53.i] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [q53.i, q53.v] */
    /* JADX WARN: Type inference failed for: r6v7, types: [q53.i] */
    /* JADX WARN: Type inference failed for: r8v1, types: [p3.i3] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [p3.i3] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [p3.i3] */
    /* JADX WARN: Type inference failed for: r8v6, types: [p3.i3] */
    /* JADX WARN: Type inference failed for: r8v9 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0080 -> B:26:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0093 -> B:26:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r11.f135376d
            e23.a<java.lang.Object> r2 = r11.f135379g
            p3.i3 r3 = r11.f135378f
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L3a
            if (r1 == r6) goto L14
            if (r1 == r5) goto L2c
            if (r1 != r4) goto L25
        L14:
            java.lang.Object r1 = r11.f135375c
            q53.i r6 = r11.f135374b
            p3.i3 r8 = r11.f135373a
            java.lang.Object r9 = r11.f135377e
            r53.j r9 = (r53.j) r9
            o13.r.b(r12)     // Catch: java.lang.Throwable -> L22
            goto L67
        L22:
            r12 = move-exception
            goto L98
        L25:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r12)
            r12 = 0
            return r12
        L2c:
            java.lang.Object r1 = r11.f135375c
            q53.i r6 = r11.f135374b
            p3.i3 r8 = r11.f135373a
            java.lang.Object r9 = r11.f135377e
            r53.j r9 = (r53.j) r9
            o13.r.b(r12)     // Catch: java.lang.Throwable -> L22
            goto L78
        L3a:
            o13.r.b(r12)
            java.lang.Object r12 = r11.f135377e
            r9 = r12
            r53.j r9 = (r53.j) r9
            if (r3 != 0) goto L4b
            p3.i3 r12 = new p3.i3
            r12.<init>()
            r8 = r12
            goto L4c
        L4b:
            r8 = r3
        L4c:
            r12 = 6
            q53.b r12 = q53.l.a(r6, r12, r7)
            java.lang.Object r1 = r8.a(r12, r2)     // Catch: java.lang.Throwable -> L95
            r11.f135377e = r9     // Catch: java.lang.Throwable -> L95
            r11.f135373a = r8     // Catch: java.lang.Throwable -> L95
            r11.f135374b = r12     // Catch: java.lang.Throwable -> L95
            r11.f135375c = r1     // Catch: java.lang.Throwable -> L95
            r11.f135376d = r6     // Catch: java.lang.Throwable -> L95
            java.lang.Object r6 = r9.emit(r1, r11)     // Catch: java.lang.Throwable -> L95
            if (r6 != r0) goto L66
            goto L92
        L66:
            r6 = r12
        L67:
            r11.f135377e = r9     // Catch: java.lang.Throwable -> L22
            r11.f135373a = r8     // Catch: java.lang.Throwable -> L22
            r11.f135374b = r6     // Catch: java.lang.Throwable -> L22
            r11.f135375c = r1     // Catch: java.lang.Throwable -> L22
            r11.f135376d = r5     // Catch: java.lang.Throwable -> L22
            java.lang.Object r12 = r6.g(r11)     // Catch: java.lang.Throwable -> L22
            if (r12 != r0) goto L78
            goto L92
        L78:
            java.lang.Object r12 = r8.a(r6, r2)     // Catch: java.lang.Throwable -> L22
            boolean r10 = p005kotlin.jvm.internal.s.g(r12, r1)     // Catch: java.lang.Throwable -> L22
            if (r10 != 0) goto L67
            r11.f135377e = r9     // Catch: java.lang.Throwable -> L22
            r11.f135373a = r8     // Catch: java.lang.Throwable -> L22
            r11.f135374b = r6     // Catch: java.lang.Throwable -> L22
            r11.f135375c = r12     // Catch: java.lang.Throwable -> L22
            r11.f135376d = r4     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r9.emit(r12, r11)     // Catch: java.lang.Throwable -> L22
            if (r1 != r0) goto L93
        L92:
            return r0
        L93:
            r1 = r12
            goto L67
        L95:
            r0 = move-exception
            r6 = r12
            r12 = r0
        L98:
            p3.j3 r0 = r8.f135115a
            if (r0 == 0) goto L9f
            r0.e(r6)
        L9f:
            if (r3 != 0) goto Lb0
            p3.j3 r0 = r8.f135115a
            if (r0 == 0) goto La6
            goto Lab
        La6:
            java.lang.String r1 = "Called dispose on a manager that has been disposed of"
            p3.j2.b(r1)
        Lab:
            r0.c()
            r8.f135115a = r7
        Lb0:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.w3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
