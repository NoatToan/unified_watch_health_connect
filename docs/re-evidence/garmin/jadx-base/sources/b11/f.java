package b11;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.proto.generated.GDIInReachMessaging;
import g21.f0;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lb11/f;", "Landroid/os/Parcelable;", "", "calories", "", "carbs", "protein", "fat", "fiber", "sugar", "addedSugars", "saturatedFat", "monounsaturatedFat", "polyunsaturatedFat", "transFat", "cholesterol", "sodium", "potassium", "vitaminA", "vitaminC", "vitaminD", "calcium", "iron", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f14266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f14267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f14268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f14269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f14270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f14271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f14272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f14273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Double f14274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f14275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Double f14276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f14277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Double f14278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f14279n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Double f14280o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Double f14281p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Double f14282q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Double f14283r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Double f14284t;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(Integer num, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : d16, (i14 & 16) != 0 ? null : d17, (i14 & 32) != 0 ? null : d18, (i14 & 64) != 0 ? null : d19, (i14 & 128) != 0 ? null : d24, (i14 & 256) != 0 ? null : d25, (i14 & 512) != 0 ? null : d26, (i14 & 1024) != 0 ? null : d27, (i14 & 2048) != 0 ? null : d28, (i14 & 4096) != 0 ? null : d29, (i14 & 8192) != 0 ? null : d34, (i14 & 16384) != 0 ? null : d35, (i14 & 32768) != 0 ? null : d36, (i14 & 65536) != 0 ? null : d37, (i14 & 131072) != 0 ? null : d38, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : d39);
    }

    public static f b(f fVar, Integer num, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, int i14) {
        Integer num2 = (i14 & 1) != 0 ? fVar.f14266a : num;
        Double d44 = (i14 & 2) != 0 ? fVar.f14267b : d14;
        Double d45 = (i14 & 4) != 0 ? fVar.f14268c : d15;
        Double d46 = (i14 & 8) != 0 ? fVar.f14269d : d16;
        Double d47 = (i14 & 16) != 0 ? fVar.f14270e : d17;
        Double d48 = (i14 & 32) != 0 ? fVar.f14271f : d18;
        Double d49 = (i14 & 64) != 0 ? fVar.f14272g : d19;
        Double d54 = (i14 & 128) != 0 ? fVar.f14273h : d24;
        Double d55 = (i14 & 256) != 0 ? fVar.f14274i : d25;
        Double d56 = (i14 & 512) != 0 ? fVar.f14275j : d26;
        Double d57 = (i14 & 1024) != 0 ? fVar.f14276k : d27;
        Double d58 = (i14 & 2048) != 0 ? fVar.f14277l : d28;
        Double d59 = (i14 & 4096) != 0 ? fVar.f14278m : d29;
        Double d64 = (i14 & 8192) != 0 ? fVar.f14279n : d34;
        Integer num3 = num2;
        Double d65 = (i14 & 16384) != 0 ? fVar.f14280o : d35;
        Double d66 = (i14 & 32768) != 0 ? fVar.f14281p : d36;
        Double d67 = (i14 & 65536) != 0 ? fVar.f14282q : d37;
        Double d68 = (i14 & 131072) != 0 ? fVar.f14283r : d38;
        Double d69 = (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? fVar.f14284t : d39;
        fVar.getClass();
        return new f(num3, d44, d45, d46, d47, d48, d49, d54, d55, d56, d57, d58, d59, d64, d65, d66, d67, d68, d69);
    }

    public final f d(f fVar) {
        return new f(dh.b.K(this.f14266a, fVar.f14266a), zf.b.F(this.f14267b, fVar.f14267b), zf.b.F(this.f14268c, fVar.f14268c), zf.b.F(this.f14269d, fVar.f14269d), zf.b.F(this.f14270e, fVar.f14270e), zf.b.F(this.f14271f, fVar.f14271f), zf.b.F(this.f14272g, fVar.f14272g), zf.b.F(this.f14273h, fVar.f14273h), zf.b.F(this.f14274i, fVar.f14274i), zf.b.F(this.f14275j, fVar.f14275j), zf.b.F(this.f14276k, fVar.f14276k), zf.b.F(this.f14277l, fVar.f14277l), zf.b.F(this.f14278m, fVar.f14278m), zf.b.F(this.f14279n, fVar.f14279n), zf.b.F(this.f14280o, fVar.f14280o), zf.b.F(this.f14281p, fVar.f14281p), zf.b.F(this.f14282q, fVar.f14282q), zf.b.F(this.f14283r, fVar.f14283r), zf.b.F(this.f14284t, fVar.f14284t));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.f14266a, fVar.f14266a) && p005kotlin.jvm.internal.s.g(this.f14267b, fVar.f14267b) && p005kotlin.jvm.internal.s.g(this.f14268c, fVar.f14268c) && p005kotlin.jvm.internal.s.g(this.f14269d, fVar.f14269d) && p005kotlin.jvm.internal.s.g(this.f14270e, fVar.f14270e) && p005kotlin.jvm.internal.s.g(this.f14271f, fVar.f14271f) && p005kotlin.jvm.internal.s.g(this.f14272g, fVar.f14272g) && p005kotlin.jvm.internal.s.g(this.f14273h, fVar.f14273h) && p005kotlin.jvm.internal.s.g(this.f14274i, fVar.f14274i) && p005kotlin.jvm.internal.s.g(this.f14275j, fVar.f14275j) && p005kotlin.jvm.internal.s.g(this.f14276k, fVar.f14276k) && p005kotlin.jvm.internal.s.g(this.f14277l, fVar.f14277l) && p005kotlin.jvm.internal.s.g(this.f14278m, fVar.f14278m) && p005kotlin.jvm.internal.s.g(this.f14279n, fVar.f14279n) && p005kotlin.jvm.internal.s.g(this.f14280o, fVar.f14280o) && p005kotlin.jvm.internal.s.g(this.f14281p, fVar.f14281p) && p005kotlin.jvm.internal.s.g(this.f14282q, fVar.f14282q) && p005kotlin.jvm.internal.s.g(this.f14283r, fVar.f14283r) && p005kotlin.jvm.internal.s.g(this.f14284t, fVar.f14284t);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 ??, still in use, count: 1, list:
          (r3v0 ?? I:??[OBJECT, ARRAY]) from 0x011f: RETURN (r3v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final b11.f f(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 ??, still in use, count: 1, list:
          (r3v0 ?? I:??[OBJECT, ARRAY]) from 0x011f: RETURN (r3v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
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

    public final f0 g() {
        return new f0(this.f14266a, this.f14267b, this.f14269d, this.f14268c);
    }

    public final int hashCode() {
        Integer num = this.f14266a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d14 = this.f14267b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f14268c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f14269d;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f14270e;
        int iHashCode5 = (iHashCode4 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f14271f;
        int iHashCode6 = (iHashCode5 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f14272g;
        int iHashCode7 = (iHashCode6 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.f14273h;
        int iHashCode8 = (iHashCode7 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.f14274i;
        int iHashCode9 = (iHashCode8 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.f14275j;
        int iHashCode10 = (iHashCode9 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.f14276k;
        int iHashCode11 = (iHashCode10 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.f14277l;
        int iHashCode12 = (iHashCode11 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.f14278m;
        int iHashCode13 = (iHashCode12 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Double d34 = this.f14279n;
        int iHashCode14 = (iHashCode13 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.f14280o;
        int iHashCode15 = (iHashCode14 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Double d36 = this.f14281p;
        int iHashCode16 = (iHashCode15 + (d36 == null ? 0 : d36.hashCode())) * 31;
        Double d37 = this.f14282q;
        int iHashCode17 = (iHashCode16 + (d37 == null ? 0 : d37.hashCode())) * 31;
        Double d38 = this.f14283r;
        int iHashCode18 = (iHashCode17 + (d38 == null ? 0 : d38.hashCode())) * 31;
        Double d39 = this.f14284t;
        return iHashCode18 + (d39 != null ? d39.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = u0.m("FullNutritionContent(calories=", this.f14266a, ", carbs=", this.f14267b, ", protein=");
        b71.i.p(this.f14268c, this.f14269d, ", fat=", ", fiber=", sbM);
        b71.i.p(this.f14270e, this.f14271f, ", sugar=", ", addedSugars=", sbM);
        b71.i.p(this.f14272g, this.f14273h, ", saturatedFat=", ", monounsaturatedFat=", sbM);
        b71.i.p(this.f14274i, this.f14275j, ", polyunsaturatedFat=", ", transFat=", sbM);
        b71.i.p(this.f14276k, this.f14277l, ", cholesterol=", ", sodium=", sbM);
        b71.i.p(this.f14278m, this.f14279n, ", potassium=", ", vitaminA=", sbM);
        b71.i.p(this.f14280o, this.f14281p, ", vitaminC=", ", vitaminD=", sbM);
        b71.i.p(this.f14282q, this.f14283r, ", calcium=", ", iron=", sbM);
        return b71.i.g(sbM, this.f14284t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.f14266a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d14 = this.f14267b;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f14268c;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.f14269d;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.f14270e;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.f14271f;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.f14272g;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        Double d24 = this.f14273h;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        Double d25 = this.f14274i;
        if (d25 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d25);
        }
        Double d26 = this.f14275j;
        if (d26 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d26);
        }
        Double d27 = this.f14276k;
        if (d27 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d27);
        }
        Double d28 = this.f14277l;
        if (d28 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d28);
        }
        Double d29 = this.f14278m;
        if (d29 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d29);
        }
        Double d34 = this.f14279n;
        if (d34 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d34);
        }
        Double d35 = this.f14280o;
        if (d35 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d35);
        }
        Double d36 = this.f14281p;
        if (d36 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d36);
        }
        Double d37 = this.f14282q;
        if (d37 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d37);
        }
        Double d38 = this.f14283r;
        if (d38 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d38);
        }
        Double d39 = this.f14284t;
        if (d39 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d39);
        }
    }

    public f(Integer num, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39) {
        this.f14266a = num;
        this.f14267b = d14;
        this.f14268c = d15;
        this.f14269d = d16;
        this.f14270e = d17;
        this.f14271f = d18;
        this.f14272g = d19;
        this.f14273h = d24;
        this.f14274i = d25;
        this.f14275j = d26;
        this.f14276k = d27;
        this.f14277l = d28;
        this.f14278m = d29;
        this.f14279n = d34;
        this.f14280o = d35;
        this.f14281p = d36;
        this.f14282q = d37;
        this.f14283r = d38;
        this.f14284t = d39;
    }

    public f() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }
}
