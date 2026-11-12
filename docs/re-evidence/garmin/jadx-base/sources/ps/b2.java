package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B¯\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R$\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001f\u001a\u0004\b7\u0010!\"\u0004\b8\u0010#R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010\u0019\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u0010\u001dR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010\u001f\u001a\u0004\bI\u0010!\"\u0004\bJ\u0010#R$\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010(\u001a\u0004\bL\u0010*\"\u0004\bM\u0010,R$\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010\u001f\u001a\u0004\bO\u0010!\"\u0004\bP\u0010#¨\u0006Q"}, d2 = {"Lps/b2;", "Landroid/os/Parcelable;", "Lcom/garmin/android/apps/connectmobile/s1;", "", "activityId", "", "apparentTemp", "dewPoint", "", "issueDate", "latitude", "longitude", "relativeHumidity", "temp", "Lps/c2;", "weatherStation", "weatherPk", "Lps/d2;", "weatherType", "windDirection", "windDirectionCompassPoint", "windSpeed", "<init>", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lps/c2;Ljava/lang/Long;Lps/d2;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)V", "a", "Ljava/lang/Long;", "getActivityId", "()Ljava/lang/Long;", "setActivityId", "(Ljava/lang/Long;)V", "b", "Ljava/lang/Double;", "getApparentTemp", "()Ljava/lang/Double;", "setApparentTemp", "(Ljava/lang/Double;)V", "c", "getDewPoint", "setDewPoint", "d", "Ljava/lang/String;", "getIssueDate", "()Ljava/lang/String;", "setIssueDate", "(Ljava/lang/String;)V", JWKParameterNames.RSA_EXPONENT, "getLatitude", "setLatitude", "f", "getLongitude", "setLongitude", "g", "C", "setRelativeHumidity", "h", "D", "setTemp", IntegerTokenConverter.CONVERTER_KEY, "Lps/c2;", "getWeatherStation", "()Lps/c2;", "setWeatherStation", "(Lps/c2;)V", "j", "getWeatherPk", "setWeatherPk", JWKParameterNames.OCT_KEY_VALUE, "Lps/d2;", "F", "()Lps/d2;", "setWeatherType", "(Lps/d2;)V", "l", "G", "setWindDirection", "m", "H", "setWindDirectionCompassPoint", JWKParameterNames.RSA_MODULUS, "I", "setWindSpeed", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b2 extends com.garmin.android.apps.connectmobile.s1 implements Parcelable {
    public static final Parcelable.Creator<b2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private Long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apparentTemp")
    private Double apparentTemp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dewPoint")
    private Double dewPoint;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("issueDate")
    private String issueDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latitude")
    private Double latitude;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longitude")
    private Double longitude;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("relativeHumidity")
    private Double relativeHumidity;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("temp")
    private Double temp;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weatherStationDTO")
    private c2 weatherStation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weatherPk")
    private Long weatherPk;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weatherTypeDTO")
    private d2 weatherType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("windDirection")
    private Double windDirection;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("windDirectionCompassPoint")
    private String windDirectionCompassPoint;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("windSpeed")
    private Double windSpeed;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b2> {
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
              (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x00ed: RETURN (r1v0 ?? I:??[OBJECT, ARRAY])
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
        public final ps.b2 createFromParcel(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
              (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x00ed: RETURN (r1v0 ?? I:??[OBJECT, ARRAY])
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
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
        public final b2[] newArray(int i14) {
            return new b2[i14];
        }
    }

    public /* synthetic */ b2(Long l14, Double d14, Double d15, String str, Double d16, Double d17, Double d18, Double d19, c2 c2Var, Long l15, d2 d2Var, Double d24, String str2, Double d25, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : d16, (i14 & 32) != 0 ? null : d17, (i14 & 64) != 0 ? null : d18, (i14 & 128) != 0 ? null : d19, (i14 & 256) != 0 ? null : c2Var, (i14 & 512) != 0 ? null : l15, (i14 & 1024) != 0 ? null : d2Var, (i14 & 2048) != 0 ? null : d24, (i14 & 4096) != 0 ? null : str2, (i14 & 8192) != 0 ? null : d25);
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Double getRelativeHumidity() {
        return this.relativeHumidity;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Double getTemp() {
        return this.temp;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final d2 getWeatherType() {
        return this.weatherType;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Double getWindDirection() {
        return this.windDirection;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getWindDirectionCompassPoint() {
        return this.windDirectionCompassPoint;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final Double getWindSpeed() {
        return this.windSpeed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return p005kotlin.jvm.internal.s.g(this.activityId, b2Var.activityId) && p005kotlin.jvm.internal.s.g(this.apparentTemp, b2Var.apparentTemp) && p005kotlin.jvm.internal.s.g(this.dewPoint, b2Var.dewPoint) && p005kotlin.jvm.internal.s.g(this.issueDate, b2Var.issueDate) && p005kotlin.jvm.internal.s.g(this.latitude, b2Var.latitude) && p005kotlin.jvm.internal.s.g(this.longitude, b2Var.longitude) && p005kotlin.jvm.internal.s.g(this.relativeHumidity, b2Var.relativeHumidity) && p005kotlin.jvm.internal.s.g(this.temp, b2Var.temp) && p005kotlin.jvm.internal.s.g(this.weatherStation, b2Var.weatherStation) && p005kotlin.jvm.internal.s.g(this.weatherPk, b2Var.weatherPk) && p005kotlin.jvm.internal.s.g(this.weatherType, b2Var.weatherType) && p005kotlin.jvm.internal.s.g(this.windDirection, b2Var.windDirection) && p005kotlin.jvm.internal.s.g(this.windDirectionCompassPoint, b2Var.windDirectionCompassPoint) && p005kotlin.jvm.internal.s.g(this.windSpeed, b2Var.windSpeed);
    }

    public final int hashCode() {
        Long l14 = this.activityId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Double d14 = this.apparentTemp;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.dewPoint;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        String str = this.issueDate;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d16 = this.latitude;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.longitude;
        int iHashCode6 = (iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.relativeHumidity;
        int iHashCode7 = (iHashCode6 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.temp;
        int iHashCode8 = (iHashCode7 + (d19 == null ? 0 : d19.hashCode())) * 31;
        c2 c2Var = this.weatherStation;
        int iHashCode9 = (iHashCode8 + (c2Var == null ? 0 : c2Var.hashCode())) * 31;
        Long l15 = this.weatherPk;
        int iHashCode10 = (iHashCode9 + (l15 == null ? 0 : l15.hashCode())) * 31;
        d2 d2Var = this.weatherType;
        int iHashCode11 = (iHashCode10 + (d2Var == null ? 0 : d2Var.hashCode())) * 31;
        Double d24 = this.windDirection;
        int iHashCode12 = (iHashCode11 + (d24 == null ? 0 : d24.hashCode())) * 31;
        String str2 = this.windDirectionCompassPoint;
        int iHashCode13 = (iHashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d25 = this.windSpeed;
        return iHashCode13 + (d25 != null ? d25.hashCode() : 0);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        b2 b2Var = (b2) GsonUtil.f47253b.fromJson(String.valueOf(jSONObject), b2.class);
        this.activityId = b2Var.activityId;
        this.apparentTemp = b2Var.apparentTemp;
        this.dewPoint = b2Var.dewPoint;
        this.issueDate = b2Var.issueDate;
        this.latitude = b2Var.latitude;
        this.longitude = b2Var.longitude;
        this.relativeHumidity = b2Var.relativeHumidity;
        this.temp = b2Var.temp;
        this.weatherStation = b2Var.weatherStation;
        this.weatherPk = b2Var.weatherPk;
        this.weatherType = b2Var.weatherType;
        this.windDirection = b2Var.windDirection;
        this.windDirectionCompassPoint = b2Var.windDirectionCompassPoint;
        this.windSpeed = b2Var.windSpeed;
    }

    public final String toString() {
        Long l14 = this.activityId;
        Double d14 = this.apparentTemp;
        Double d15 = this.dewPoint;
        String str = this.issueDate;
        Double d16 = this.latitude;
        Double d17 = this.longitude;
        Double d18 = this.relativeHumidity;
        Double d19 = this.temp;
        c2 c2Var = this.weatherStation;
        Long l15 = this.weatherPk;
        d2 d2Var = this.weatherType;
        Double d24 = this.windDirection;
        String str2 = this.windDirectionCompassPoint;
        Double d25 = this.windSpeed;
        StringBuilder sb3 = new StringBuilder("WeatherDTO(activityId=");
        sb3.append(l14);
        sb3.append(", apparentTemp=");
        sb3.append(d14);
        sb3.append(", dewPoint=");
        b71.i.u(sb3, d15, ", issueDate=", str, ", latitude=");
        b71.i.p(d16, d17, ", longitude=", ", relativeHumidity=", sb3);
        b71.i.p(d18, d19, ", temp=", ", weatherStation=", sb3);
        sb3.append(c2Var);
        sb3.append(", weatherPk=");
        sb3.append(l15);
        sb3.append(", weatherType=");
        sb3.append(d2Var);
        sb3.append(", windDirection=");
        sb3.append(d24);
        sb3.append(", windDirectionCompassPoint=");
        sb3.append(str2);
        sb3.append(", windSpeed=");
        sb3.append(d25);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.activityId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Double d14 = this.apparentTemp;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.dewPoint;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeString(this.issueDate);
        Double d16 = this.latitude;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.longitude;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.relativeHumidity;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.temp;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        c2 c2Var = this.weatherStation;
        if (c2Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            c2Var.writeToParcel(parcel, i14);
        }
        Long l15 = this.weatherPk;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        d2 d2Var = this.weatherType;
        if (d2Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            d2Var.writeToParcel(parcel, i14);
        }
        Double d24 = this.windDirection;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        parcel.writeString(this.windDirectionCompassPoint);
        Double d25 = this.windSpeed;
        if (d25 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d25);
        }
    }

    public b2(Long l14, Double d14, Double d15, String str, Double d16, Double d17, Double d18, Double d19, c2 c2Var, Long l15, d2 d2Var, Double d24, String str2, Double d25) {
        this.activityId = l14;
        this.apparentTemp = d14;
        this.dewPoint = d15;
        this.issueDate = str;
        this.latitude = d16;
        this.longitude = d17;
        this.relativeHumidity = d18;
        this.temp = d19;
        this.weatherStation = c2Var;
        this.weatherPk = l15;
        this.weatherType = d2Var;
        this.windDirection = d24;
        this.windDirectionCompassPoint = str2;
        this.windSpeed = d25;
    }

    public b2() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
