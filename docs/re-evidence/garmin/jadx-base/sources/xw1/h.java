package xw1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\bC\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010%\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\"\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u00102\u001a\u0004\b=\u00104\"\u0004\b>\u00106R\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u00102\u001a\u0004\b@\u00104\"\u0004\bA\u00106R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00102\u001a\u0004\bB\u00104\"\u0004\bC\u00106R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u00102\u001a\u0004\bE\u00104\"\u0004\bF\u00106R$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010%\u001a\u0004\bG\u0010'\"\u0004\bH\u0010)R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010%\u001a\u0004\bJ\u0010'\"\u0004\bK\u0010)R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010,\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010%\u001a\u0004\bV\u0010'\"\u0004\bW\u0010)R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006]"}, d2 = {"Lxw1/h;", "Landroid/os/Parcelable;", "Lxw1/f;", "coach", "", "coachFirstName", "coachLastName", "coachLocalizedCoachTag", "coachThumbnail", "", "futureWorkoutsToSchedule", "maxWeeksPerPlan", "maxWorkoutsPerWeek", "minWeeksPerPlan", "minWorkoutsPerWeek", "onChangeMaxWeeks", "onChangeMinWeeks", "onChangeRaceEndDate", "onChangeRaceStartDate", "", "requiresRaceChange", "Lxw1/i;", MimeTypes.BASE_TYPE_VIDEO, "Lxw1/o;", "coachVideo", "workoutPlanDescription", "", "workoutPlanId", "<init>", "(Lxw1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIILjava/lang/String;Ljava/lang/String;ZLxw1/i;Lxw1/o;Ljava/lang/String;Ljava/lang/Long;)V", "a", "Lxw1/f;", "d", "()Lxw1/f;", "setCoach", "(Lxw1/f;)V", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "M", "(Ljava/lang/String;)V", "c", "getCoachLastName", "Z", IntegerTokenConverter.CONVERTER_KEY, "a0", JWKParameterNames.RSA_EXPONENT, JWKParameterNames.OCT_KEY_VALUE, "c0", "I", "getFutureWorkoutsToSchedule", "()I", "setFutureWorkoutsToSchedule", "(I)V", "g", "m", "setMaxWeeksPerPlan", "h", "o", "setMaxWorkoutsPerWeek", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "setMinWeeksPerPlan", "j", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "setMinWorkoutsPerWeek", "s", "setOnChangeMaxWeeks", "l", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "setOnChangeMinWeeks", "u", "setOnChangeRaceEndDate", JWKParameterNames.RSA_MODULUS, "z", "setOnChangeRaceStartDate", "D", "()Z", "setRequiresRaceChange", "(Z)V", "p", "Lxw1/i;", "F", "()Lxw1/i;", "setVideo", "(Lxw1/i;)V", "getWorkoutPlanDescription", "setWorkoutPlanDescription", "Ljava/lang/Long;", "H", "()Ljava/lang/Long;", "setWorkoutPlanId", "(Ljava/lang/Long;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coach")
    private f coach;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coachFirstName")
    private String coachFirstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coachLastName")
    private String coachLastName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coachLocalizedCoachTag")
    private String coachLocalizedCoachTag;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coachThumbnail")
    private String coachThumbnail;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("futureWorkoutsToSchedule")
    private int futureWorkoutsToSchedule;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxWeeksPerPlan")
    private int maxWeeksPerPlan;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxWorkoutsPerWeek")
    private int maxWorkoutsPerWeek;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minWeeksPerPlan")
    private int minWeeksPerPlan;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minWorkoutsPerWeek")
    private int minWorkoutsPerWeek;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("onChangeMaxWeeks")
    private int onChangeMaxWeeks;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("onChangeMinWeeks")
    private int onChangeMinWeeks;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("onChangeRaceEndDate")
    private String onChangeRaceEndDate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("onChangeRaceStartDate")
    private String onChangeRaceStartDate;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requiresRaceChange")
    private boolean requiresRaceChange;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName(MimeTypes.BASE_TYPE_VIDEO)
    private i video;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public o f192397q;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutPlanDescription")
    private String workoutPlanDescription;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutPlanId")
    private Long workoutPlanId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
              (r1v0 ?? I:xw1.h) from 0x00bc: RETURN (r1v0 ?? I:xw1.h)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        @Override // android.os.Parcelable.Creator
        public final xw1.h createFromParcel(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
              (r1v0 ?? I:xw1.h) from 0x00bc: RETURN (r1v0 ?? I:xw1.h)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v0 ??
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

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public /* synthetic */ h(f fVar, String str, String str2, String str3, String str4, int i14, int i15, int i16, int i17, int i18, int i19, int i24, String str5, String str6, boolean z14, i iVar, o oVar, String str7, Long l14, int i25, p005kotlin.jvm.internal.j jVar) {
        this((i25 & 1) != 0 ? null : fVar, (i25 & 2) != 0 ? null : str, (i25 & 4) != 0 ? null : str2, (i25 & 8) != 0 ? null : str3, (i25 & 16) != 0 ? null : str4, (i25 & 32) != 0 ? 0 : i14, (i25 & 64) != 0 ? 0 : i15, (i25 & 128) != 0 ? 0 : i16, (i25 & 256) != 0 ? 0 : i17, (i25 & 512) != 0 ? 0 : i18, (i25 & 1024) != 0 ? 0 : i19, (i25 & 2048) != 0 ? 0 : i24, (i25 & 4096) != 0 ? null : str5, (i25 & 8192) != 0 ? null : str6, (i25 & 16384) != 0 ? false : z14, (i25 & 32768) != 0 ? null : iVar, (i25 & 65536) != 0 ? null : oVar, (i25 & 131072) != 0 ? null : str7, (i25 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : l14);
    }

    public static h b(h hVar, o oVar) {
        f fVar = hVar.coach;
        String str = hVar.coachFirstName;
        String str2 = hVar.coachLastName;
        String str3 = hVar.coachLocalizedCoachTag;
        String str4 = hVar.coachThumbnail;
        int i14 = hVar.futureWorkoutsToSchedule;
        int i15 = hVar.maxWeeksPerPlan;
        int i16 = hVar.maxWorkoutsPerWeek;
        int i17 = hVar.minWeeksPerPlan;
        int i18 = hVar.minWorkoutsPerWeek;
        int i19 = hVar.onChangeMaxWeeks;
        int i24 = hVar.onChangeMinWeeks;
        String str5 = hVar.onChangeRaceEndDate;
        String str6 = hVar.onChangeRaceStartDate;
        boolean z14 = hVar.requiresRaceChange;
        i iVar = hVar.video;
        String str7 = hVar.workoutPlanDescription;
        Long l14 = hVar.workoutPlanId;
        hVar.getClass();
        return new h(fVar, str, str2, str3, str4, i14, i15, i16, i17, i18, i19, i24, str5, str6, z14, iVar, oVar, str7, l14);
    }

    public final DateTime A() {
        String str = this.onChangeRaceStartDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd", null);
        }
        return null;
    }

    public final String C() {
        return androidx.core.view.j.d(this.minWeeksPerPlan, this.maxWeeksPerPlan, "-");
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getRequiresRaceChange() {
        return this.requiresRaceChange;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final i getVideo() {
        return this.video;
    }

    public final String G() {
        i iVar = this.video;
        if (iVar != null) {
            return iVar.getContentfulContentId();
        }
        return null;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Long getWorkoutPlanId() {
        return this.workoutPlanId;
    }

    public final String I() {
        int i14 = this.minWorkoutsPerWeek;
        int i15 = this.maxWorkoutsPerWeek;
        return i14 == i15 ? String.valueOf(i15) : androidx.core.view.j.d(i14, i15, "-");
    }

    public final void M(String str) {
        this.coachFirstName = str;
    }

    public final void Z(String str) {
        this.coachLastName = str;
    }

    public final void a0(String str) {
        this.coachLocalizedCoachTag = str;
    }

    public final void c0(String str) {
        this.coachThumbnail = str;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getCoach() {
        return this.coach;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e0(g gVar) {
        this.coachFirstName = gVar != null ? gVar.getFirstName() : null;
        this.coachLastName = gVar != null ? gVar.getLastName() : null;
        this.coachLocalizedCoachTag = gVar != null ? gVar.getTagLine() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.coach, hVar.coach) && s.g(this.coachFirstName, hVar.coachFirstName) && s.g(this.coachLastName, hVar.coachLastName) && s.g(this.coachLocalizedCoachTag, hVar.coachLocalizedCoachTag) && s.g(this.coachThumbnail, hVar.coachThumbnail) && this.futureWorkoutsToSchedule == hVar.futureWorkoutsToSchedule && this.maxWeeksPerPlan == hVar.maxWeeksPerPlan && this.maxWorkoutsPerWeek == hVar.maxWorkoutsPerWeek && this.minWeeksPerPlan == hVar.minWeeksPerPlan && this.minWorkoutsPerWeek == hVar.minWorkoutsPerWeek && this.onChangeMaxWeeks == hVar.onChangeMaxWeeks && this.onChangeMinWeeks == hVar.onChangeMinWeeks && s.g(this.onChangeRaceEndDate, hVar.onChangeRaceEndDate) && s.g(this.onChangeRaceStartDate, hVar.onChangeRaceStartDate) && this.requiresRaceChange == hVar.requiresRaceChange && s.g(this.video, hVar.video) && s.g(this.f192397q, hVar.f192397q) && s.g(this.workoutPlanDescription, hVar.workoutPlanDescription) && s.g(this.workoutPlanId, hVar.workoutPlanId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCoachFirstName() {
        return this.coachFirstName;
    }

    public final String g() {
        return e5.g(this.coachFirstName, StringUtils.SPACE, this.coachLastName);
    }

    public final String h() {
        i iVarD;
        f fVar = this.coach;
        if (fVar == null || (iVarD = fVar.getContentfulModel()) == null) {
            return null;
        }
        return iVarD.getContentfulContentId();
    }

    public final int hashCode() {
        f fVar = this.coach;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        String str = this.coachFirstName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coachLastName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.coachLocalizedCoachTag;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.coachThumbnail;
        int iD = q2.d(this.onChangeMinWeeks, q2.d(this.onChangeMaxWeeks, q2.d(this.minWorkoutsPerWeek, q2.d(this.minWeeksPerPlan, q2.d(this.maxWorkoutsPerWeek, q2.d(this.maxWeeksPerPlan, q2.d(this.futureWorkoutsToSchedule, (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31);
        String str5 = this.onChangeRaceEndDate;
        int iHashCode5 = (iD + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.onChangeRaceStartDate;
        int iG = q6.f.g((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.requiresRaceChange);
        i iVar = this.video;
        int iHashCode6 = (iG + (iVar == null ? 0 : iVar.hashCode())) * 31;
        o oVar = this.f192397q;
        int iHashCode7 = (iHashCode6 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str7 = this.workoutPlanDescription;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l14 = this.workoutPlanId;
        return iHashCode8 + (l14 != null ? l14.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getCoachLocalizedCoachTag() {
        return this.coachLocalizedCoachTag;
    }

    public final o13.p<LocalDate, LocalDate> j() {
        return new o13.p<>(LocalDate.now().plusWeeks(this.minWeeksPerPlan), LocalDate.now().plusWeeks(this.maxWeeksPerPlan));
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getCoachThumbnail() {
        return this.coachThumbnail;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getMaxWeeksPerPlan() {
        return this.maxWeeksPerPlan;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getMaxWorkoutsPerWeek() {
        return this.maxWorkoutsPerWeek;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getMinWeeksPerPlan() {
        return this.minWeeksPerPlan;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getMinWorkoutsPerWeek() {
        return this.minWorkoutsPerWeek;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getOnChangeMaxWeeks() {
        return this.onChangeMaxWeeks;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getOnChangeMinWeeks() {
        return this.onChangeMinWeeks;
    }

    public final String toString() {
        f fVar = this.coach;
        String str = this.coachFirstName;
        String str2 = this.coachLastName;
        String str3 = this.coachLocalizedCoachTag;
        String str4 = this.coachThumbnail;
        int i14 = this.futureWorkoutsToSchedule;
        int i15 = this.maxWeeksPerPlan;
        int i16 = this.maxWorkoutsPerWeek;
        int i17 = this.minWeeksPerPlan;
        int i18 = this.minWorkoutsPerWeek;
        int i19 = this.onChangeMaxWeeks;
        int i24 = this.onChangeMinWeeks;
        String str5 = this.onChangeRaceEndDate;
        String str6 = this.onChangeRaceStartDate;
        boolean z14 = this.requiresRaceChange;
        i iVar = this.video;
        o oVar = this.f192397q;
        String str7 = this.workoutPlanDescription;
        Long l14 = this.workoutPlanId;
        StringBuilder sb3 = new StringBuilder("CoachPlanDTO(coach=");
        sb3.append(fVar);
        sb3.append(", coachFirstName=");
        sb3.append(str);
        sb3.append(", coachLastName=");
        sn.a.t(sb3, str2, ", coachLocalizedCoachTag=", str3, ", coachThumbnail=");
        q6.f.q(i14, str4, ", futureWorkoutsToSchedule=", ", maxWeeksPerPlan=", sb3);
        e0.m(i15, i16, ", maxWorkoutsPerWeek=", ", minWeeksPerPlan=", sb3);
        e0.m(i17, i18, ", minWorkoutsPerWeek=", ", onChangeMaxWeeks=", sb3);
        e0.m(i19, i24, ", onChangeMinWeeks=", ", onChangeRaceEndDate=", sb3);
        sn.a.t(sb3, str5, ", onChangeRaceStartDate=", str6, ", requiresRaceChange=");
        sb3.append(z14);
        sb3.append(", video=");
        sb3.append(iVar);
        sb3.append(", coachVideo=");
        sb3.append(oVar);
        sb3.append(", workoutPlanDescription=");
        sb3.append(str7);
        sb3.append(", workoutPlanId=");
        return p6.b.g(sb3, l14, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getOnChangeRaceEndDate() {
        return this.onChangeRaceEndDate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        f fVar = this.coach;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.coachFirstName);
        parcel.writeString(this.coachLastName);
        parcel.writeString(this.coachLocalizedCoachTag);
        parcel.writeString(this.coachThumbnail);
        parcel.writeInt(this.futureWorkoutsToSchedule);
        parcel.writeInt(this.maxWeeksPerPlan);
        parcel.writeInt(this.maxWorkoutsPerWeek);
        parcel.writeInt(this.minWeeksPerPlan);
        parcel.writeInt(this.minWorkoutsPerWeek);
        parcel.writeInt(this.onChangeMaxWeeks);
        parcel.writeInt(this.onChangeMinWeeks);
        parcel.writeString(this.onChangeRaceEndDate);
        parcel.writeString(this.onChangeRaceStartDate);
        parcel.writeInt(this.requiresRaceChange ? 1 : 0);
        i iVar = this.video;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
        o oVar = this.f192397q;
        if (oVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.workoutPlanDescription);
        Long l14 = this.workoutPlanId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
    }

    public final DateTime y() {
        String str = this.onChangeRaceEndDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getOnChangeRaceStartDate() {
        return this.onChangeRaceStartDate;
    }

    public h(f fVar, String str, String str2, String str3, String str4, int i14, int i15, int i16, int i17, int i18, int i19, int i24, String str5, String str6, boolean z14, i iVar, o oVar, String str7, Long l14) {
        this.coach = fVar;
        this.coachFirstName = str;
        this.coachLastName = str2;
        this.coachLocalizedCoachTag = str3;
        this.coachThumbnail = str4;
        this.futureWorkoutsToSchedule = i14;
        this.maxWeeksPerPlan = i15;
        this.maxWorkoutsPerWeek = i16;
        this.minWeeksPerPlan = i17;
        this.minWorkoutsPerWeek = i18;
        this.onChangeMaxWeeks = i19;
        this.onChangeMinWeeks = i24;
        this.onChangeRaceEndDate = str5;
        this.onChangeRaceStartDate = str6;
        this.requiresRaceChange = z14;
        this.video = iVar;
        this.f192397q = oVar;
        this.workoutPlanDescription = str7;
        this.workoutPlanId = l14;
    }

    public h() {
        this(null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, null, null, false, null, null, null, null, 524287, null);
    }
}
