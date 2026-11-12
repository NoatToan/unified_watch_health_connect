package u7;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lu7/j;", "T", "", "<init>", "()V", "a", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f169169a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu7/j$a;", "", "<init>", "()V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:27:0x006a  */
        /* JADX WARN: Code duplicated, block: B:37:0x0090  */
        /* JADX WARN: Code duplicated, block: B:39:0x0093  */
        /* JADX WARN: Code duplicated, block: B:43:0x0092 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0064->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0081 -> B:25:0x0064). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0084 -> B:25:0x0064). Please report as a decompilation issue!!! */
        public static final Object a(a aVar, List list, s0 s0Var, v13.c cVar) throws Throwable {
            h hVar;
            List list2;
            Iterator<T> it;
            p005kotlin.jvm.internal.r0 r0Var;
            Throwable th3;
            e23.l lVar;
            aVar.getClass();
            if (cVar instanceof h) {
                hVar = (h) cVar;
                int i14 = hVar.f169148e;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    hVar.f169148e = i14 - Integer.MIN_VALUE;
                } else {
                    hVar = new h(aVar, cVar);
                }
            } else {
                hVar = new h(aVar, cVar);
            }
            Object obj = hVar.f169146c;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = hVar.f169148e;
            if (i15 != 0) {
                if (i15 == 1) {
                    list2 = (List) hVar.f169144a;
                    o13.r.b(obj);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = hVar.f169145b;
                    r0Var = (p005kotlin.jvm.internal.r0) hVar.f169144a;
                    try {
                        o13.r.b(obj);
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
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:320)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:297)
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
                        r5.getClass()
                        boolean r0 = r8 instanceof u7.h
                        if (r0 == 0) goto L16
                        r0 = r8
                        u7.h r0 = (u7.h) r0
                        int r1 = r0.f169148e
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L16
                        int r1 = r1 - r2
                        r0.f169148e = r1
                        goto L1b
                    L16:
                        u7.h r0 = new u7.h
                        r0.<init>(r5, r8)
                    L1b:
                        java.lang.Object r5 = r0.f169146c
                        u13.a r8 = u13.a.COROUTINE_SUSPENDED
                        int r1 = r0.f169148e
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L44
                        if (r1 == r3) goto L3c
                        if (r1 != r2) goto L35
                        java.util.Iterator r6 = r0.f169145b
                        java.io.Serializable r7 = r0.f169144a
                        kotlin.jvm.internal.r0 r7 = (p005kotlin.jvm.internal.r0) r7
                        o13.r.b(r5)     // Catch: java.lang.Throwable -> L33
                        goto L64
                    L33:
                        r5 = move-exception
                        goto L7d
                    L35:
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        vb.h.z(r5)
                        r5 = 0
                        return r5
                    L3c:
                        java.io.Serializable r6 = r0.f169144a
                        java.util.List r6 = (java.util.List) r6
                        o13.r.b(r5)
                        goto L5a
                    L44:
                        java.util.ArrayList r5 = v.h.x(r5)
                        u7.i r1 = new u7.i
                        r4 = 0
                        r1.<init>(r6, r5, r4)
                        r0.f169144a = r5
                        r0.f169148e = r3
                        java.lang.Object r6 = r7.a(r1, r0)
                        if (r6 != r8) goto L59
                        goto L92
                    L59:
                        r6 = r5
                    L5a:
                        kotlin.jvm.internal.r0 r5 = new kotlin.jvm.internal.r0
                        r5.<init>()
                        java.util.Iterator r6 = r6.iterator()
                        r7 = r5
                    L64:
                        boolean r5 = r6.hasNext()
                        if (r5 == 0) goto L8a
                        java.lang.Object r5 = r6.next()
                        e23.l r5 = (e23.l) r5
                        r0.f169144a = r7     // Catch: java.lang.Throwable -> L33
                        r0.f169145b = r6     // Catch: java.lang.Throwable -> L33
                        r0.f169148e = r2     // Catch: java.lang.Throwable -> L33
                        java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L33
                        if (r5 != r8) goto L64
                        goto L92
                    L7d:
                        T r1 = r7.f105810a
                        if (r1 != 0) goto L84
                        r7.f105810a = r5
                        goto L64
                    L84:
                        java.lang.Throwable r1 = (java.lang.Throwable) r1
                        o13.g.a(r1, r5)
                        goto L64
                    L8a:
                        T r5 = r7.f105810a
                        java.lang.Throwable r5 = (java.lang.Throwable) r5
                        if (r5 != 0) goto L93
                        kotlin.Unit r8 = p005kotlin.Unit.INSTANCE
                    L92:
                        return r8
                    L93:
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: u7.j.a.a(u7.j$a, java.util.List, u7.s0, v13.c):java.lang.Object");
                }

                private a() {
                }
            }
        }
