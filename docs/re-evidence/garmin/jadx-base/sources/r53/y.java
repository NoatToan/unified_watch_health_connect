package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class y<T> implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j<T> f150942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<Throwable> f150943b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {154}, m = "emit")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y f150944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f150945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y<T> f150946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f150947d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(y<? super T> yVar, t13.d<? super a> dVar) {
            super(dVar);
            this.f150946c = yVar;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150945b = obj;
            this.f150947d |= Integer.MIN_VALUE;
            return this.f150946c.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(j<? super T> jVar, p005kotlin.jvm.internal.r0<Throwable> r0Var) {
        this.f150942a = jVar;
        this.f150943b = r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // r53.j
    public final Object emit(T t7, t13.d<? super Unit> dVar) throws Throwable {
        a aVar;
        y<T> yVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150947d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150947d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f150945b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150947d;
        if (i15 != 0) {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yVar = aVar.f150944a;
            try {
                o13.r.b(obj);
                return Unit.INSTANCE;
            } catch (Throwable 
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                */
            /*
                this = this;
                boolean r0 = r6 instanceof r53.y.a
                if (r0 == 0) goto L13
                r0 = r6
                r53.y$a r0 = (r53.y.a) r0
                int r1 = r0.f150947d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f150947d = r1
                goto L18
            L13:
                r53.y$a r0 = new r53.y$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f150945b
                u13.a r1 = u13.a.COROUTINE_SUSPENDED
                int r2 = r0.f150947d
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2b
                r53.y r5 = r0.f150944a
                o13.r.b(r6)     // Catch: java.lang.Throwable -> L29
                goto L42
            L29:
                r6 = move-exception
                goto L47
            L2b:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r5)
                r5 = 0
                return r5
            L32:
                o13.r.b(r6)
                r53.j<T> r6 = r4.f150942a     // Catch: java.lang.Throwable -> L45
                r0.f150944a = r4     // Catch: java.lang.Throwable -> L45
                r0.f150947d = r3     // Catch: java.lang.Throwable -> L45
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L45
                if (r5 != r1) goto L42
                return r1
            L42:
                kotlin.Unit r5 = p005kotlin.Unit.INSTANCE
                return r5
            L45:
                r6 = move-exception
                r5 = r4
            L47:
                kotlin.jvm.internal.r0<java.lang.Throwable> r5 = r5.f150943b
                r5.f105810a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: r53.y.emit(java.lang.Object, t13.d):java.lang.Object");
        }
    }
