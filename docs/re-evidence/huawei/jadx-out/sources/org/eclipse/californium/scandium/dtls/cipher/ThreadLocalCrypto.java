package org.eclipse.californium.scandium.dtls.cipher;

import defpackage.zzm;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes20.dex */
public class ThreadLocalCrypto<CryptoFunction> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GeneralSecurityException f44577a;
    private final Factory<CryptoFunction> d;
    private final ThreadLocal<CryptoFunction> e;

    public interface Factory<CryptoFunction> {
        CryptoFunction getInstance() throws GeneralSecurityException;
    }

    static {
        zzm.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadLocalCrypto(Factory<CryptoFunction> factory) {
        GeneralSecurityException e;
        ThreadLocal<CryptoFunction> threadLocal = null;
        try {
            CryptoFunction factory2 = factory.getInstance();
            if (factory2 != null) {
                try {
                    ThreadLocal<CryptoFunction> threadLocal2 = new ThreadLocal<>();
                    try {
                        threadLocal2.set(factory2);
                    } catch (GeneralSecurityException 
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                        	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:331)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
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
                        r3.<init>()
                        r0 = 0
                        java.lang.Object r1 = r4.getInstance()     // Catch: java.security.GeneralSecurityException -> L38
                        if (r1 == 0) goto L19
                        java.lang.ThreadLocal r2 = new java.lang.ThreadLocal     // Catch: java.security.GeneralSecurityException -> L17
                        r2.<init>()     // Catch: java.security.GeneralSecurityException -> L17
                        r2.set(r1)     // Catch: java.security.GeneralSecurityException -> L15
                    L12:
                        r1 = r0
                        r0 = r2
                        goto L3b
                    L15:
                        r0 = move-exception
                        goto L12
                    L17:
                        r1 = move-exception
                        goto L3b
                    L19:
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.security.GeneralSecurityException -> L38
                        r1.<init>()     // Catch: java.security.GeneralSecurityException -> L38
                        java.lang.Class r4 = r4.getClass()     // Catch: java.security.GeneralSecurityException -> L38
                        java.lang.String r4 = r4.getSimpleName()     // Catch: java.security.GeneralSecurityException -> L38
                        r1.append(r4)     // Catch: java.security.GeneralSecurityException -> L38
                        java.lang.String r4 = " not supported!"
                        r1.append(r4)     // Catch: java.security.GeneralSecurityException -> L38
                        java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.security.GeneralSecurityException -> L38
                        java.lang.String r1 = r1.toString()     // Catch: java.security.GeneralSecurityException -> L38
                        r4.<init>(r1)     // Catch: java.security.GeneralSecurityException -> L38
                        goto L39
                    L38:
                        r4 = move-exception
                    L39:
                        r1 = r4
                        r4 = r0
                    L3b:
                        r3.e = r0
                        r3.d = r4
                        r3.f44577a = r1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto.<init>(org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto$Factory):void");
                }

                public CryptoFunction c() {
                    if (!a()) {
                        return null;
                    }
                    CryptoFunction factory = this.e.get();
                    if (factory != null) {
                        return factory;
                    }
                    try {
                        factory = this.d.getInstance();
                        this.e.set(factory);
                        return factory;
                    } catch (GeneralSecurityException unused) {
                        return factory;
                    }
                }

                public CryptoFunction d() throws GeneralSecurityException {
                    GeneralSecurityException generalSecurityException = this.f44577a;
                    if (generalSecurityException != null) {
                        throw generalSecurityException;
                    }
                    return c();
                }

                public final boolean a() {
                    return this.f44577a == null;
                }
            }
