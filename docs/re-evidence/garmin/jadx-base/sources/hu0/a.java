package hu0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001e\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001e\u001a\u0004\b/\u0010 \"\u0004\b2\u0010\"R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001e\u001a\u0004\b&\u0010 \"\u0004\b3\u0010\"R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001e\u001a\u0004\b#\u0010 \"\u0004\b4\u0010\"R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u00105\u001a\u0004\b\u0018\u00106\"\u0004\b7\u00108R*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lhu0/a;", "", "", "startTime", "", "isMsgContentPaceSpeedOn", "isMsgContentCumulativeTimeOn", "isMsgContentLastLapTimeOn", "isMsgTriggerStartSelected", "isMsgTriggerEveryMileSelected", "isMsgTriggerEveryLapSelected", "isMsgTriggerEveryTransitionSelected", "isMsgTriggerEndSelected", "isLiveTrackON", "isEstimatedCompletionTimeOn", "", "estimatedCompletionDistance", "", "", "recipients", "", "transitionsCounter", "<init>", "(Ljava/lang/Long;ZZZZZZZZZZLjava/lang/Double;Ljava/util/List;I)V", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "setStartTime", "(Ljava/lang/Long;)V", "Z", "g", "()Z", "setMsgContentPaceSpeedOn", "(Z)V", "c", JWKParameterNames.RSA_EXPONENT, "setMsgContentCumulativeTimeOn", "d", "f", "setMsgContentLastLapTimeOn", "l", "setMsgTriggerStartSelected", "j", "setMsgTriggerEveryMileSelected", IntegerTokenConverter.CONVERTER_KEY, "setMsgTriggerEveryLapSelected", "h", JWKParameterNames.OCT_KEY_VALUE, "setMsgTriggerEveryTransitionSelected", "setMsgTriggerEndSelected", "setLiveTrackON", "setEstimatedCompletionTimeOn", "Ljava/lang/Double;", "()Ljava/lang/Double;", "setEstimatedCompletionDistance", "(Ljava/lang/Double;)V", "m", "Ljava/util/List;", "getRecipients", "()Ljava/util/List;", "setRecipients", "(Ljava/util/List;)V", JWKParameterNames.RSA_MODULUS, "I", "getTransitionsCounter", "()I", "setTransitionsCounter", "(I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTime")
    private Long startTime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isMsgContentPaceSpeedOn")
    private boolean isMsgContentPaceSpeedOn;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isMsgContentCumulativeTimeOn")
    private boolean isMsgContentCumulativeTimeOn;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isMsgContentLastLapTimeOn")
    private boolean isMsgContentLastLapTimeOn;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isMsgTriggerStartSelected")
    private boolean isMsgTriggerStartSelected;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isMsgTriggerEveryMileSelected")
    private boolean isMsgTriggerEveryMileSelected;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isMsgTriggerEveryLapSelected")
    private boolean isMsgTriggerEveryLapSelected;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isMsgTriggerEveryTransitionSelected")
    private boolean isMsgTriggerEveryTransitionSelected;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isMsgTriggerEndSelected")
    private boolean isMsgTriggerEndSelected;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isLiveTrackON")
    private boolean isLiveTrackON;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isEstimatedCompletionTimeOn")
    private boolean isEstimatedCompletionTimeOn;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("estimatedCompletionDistance")
    private Double estimatedCompletionDistance;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recipients")
    private List<String> recipients;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("transitionsCounter")
    private int transitionsCounter;

    public /* synthetic */ a(Long l14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, Double d14, List list, int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? null : l14, (i15 & 2) != 0 ? true : z14, (i15 & 4) != 0 ? true : z15, (i15 & 8) != 0 ? true : z16, (i15 & 16) != 0 ? true : z17, (i15 & 32) != 0 ? false : z18, (i15 & 64) != 0 ? true : z19, (i15 & 128) != 0 ? false : z24, (i15 & 256) == 0 ? z25 : true, (i15 & 512) != 0 ? false : z26, (i15 & 1024) != 0 ? false : z27, (i15 & 2048) != 0 ? null : d14, (i15 & 4096) == 0 ? list : null, (i15 & 8192) != 0 ? 0 : i14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getEstimatedCompletionDistance() {
        return this.estimatedCompletionDistance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsEstimatedCompletionTimeOn() {
        return this.isEstimatedCompletionTimeOn;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsLiveTrackON() {
        return this.isLiveTrackON;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsMsgContentCumulativeTimeOn() {
        return this.isMsgContentCumulativeTimeOn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.startTime, aVar.startTime) && this.isMsgContentPaceSpeedOn == aVar.isMsgContentPaceSpeedOn && this.isMsgContentCumulativeTimeOn == aVar.isMsgContentCumulativeTimeOn && this.isMsgContentLastLapTimeOn == aVar.isMsgContentLastLapTimeOn && this.isMsgTriggerStartSelected == aVar.isMsgTriggerStartSelected && this.isMsgTriggerEveryMileSelected == aVar.isMsgTriggerEveryMileSelected && this.isMsgTriggerEveryLapSelected == aVar.isMsgTriggerEveryLapSelected && this.isMsgTriggerEveryTransitionSelected == aVar.isMsgTriggerEveryTransitionSelected && this.isMsgTriggerEndSelected == aVar.isMsgTriggerEndSelected && this.isLiveTrackON == aVar.isLiveTrackON && this.isEstimatedCompletionTimeOn == aVar.isEstimatedCompletionTimeOn && s.g(this.estimatedCompletionDistance, aVar.estimatedCompletionDistance) && s.g(this.recipients, aVar.recipients) && this.transitionsCounter == aVar.transitionsCounter;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsMsgContentLastLapTimeOn() {
        return this.isMsgContentLastLapTimeOn;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsMsgContentPaceSpeedOn() {
        return this.isMsgContentPaceSpeedOn;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsMsgTriggerEndSelected() {
        return this.isMsgTriggerEndSelected;
    }

    public final int hashCode() {
        Long l14 = this.startTime;
        int iG = f.g(f.g(f.g(f.g(f.g(f.g(f.g(f.g(f.g(f.g((l14 == null ? 0 : l14.hashCode()) * 31, 31, this.isMsgContentPaceSpeedOn), 31, this.isMsgContentCumulativeTimeOn), 31, this.isMsgContentLastLapTimeOn), 31, this.isMsgTriggerStartSelected), 31, this.isMsgTriggerEveryMileSelected), 31, this.isMsgTriggerEveryLapSelected), 31, this.isMsgTriggerEveryTransitionSelected), 31, this.isMsgTriggerEndSelected), 31, this.isLiveTrackON), 31, this.isEstimatedCompletionTimeOn);
        Double d14 = this.estimatedCompletionDistance;
        int iHashCode = (iG + (d14 == null ? 0 : d14.hashCode())) * 31;
        List<String> list = this.recipients;
        return Integer.hashCode(this.transitionsCounter) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsMsgTriggerEveryLapSelected() {
        return this.isMsgTriggerEveryLapSelected;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsMsgTriggerEveryMileSelected() {
        return this.isMsgTriggerEveryMileSelected;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsMsgTriggerEveryTransitionSelected() {
        return this.isMsgTriggerEveryTransitionSelected;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsMsgTriggerStartSelected() {
        return this.isMsgTriggerStartSelected;
    }

    public final String toString() {
        Long l14 = this.startTime;
        boolean z14 = this.isMsgContentPaceSpeedOn;
        boolean z15 = this.isMsgContentCumulativeTimeOn;
        boolean z16 = this.isMsgContentLastLapTimeOn;
        boolean z17 = this.isMsgTriggerStartSelected;
        boolean z18 = this.isMsgTriggerEveryMileSelected;
        boolean z19 = this.isMsgTriggerEveryLapSelected;
        boolean z24 = this.isMsgTriggerEveryTransitionSelected;
        boolean z25 = this.isMsgTriggerEndSelected;
        boolean z26 = this.isLiveTrackON;
        boolean z27 = this.isEstimatedCompletionTimeOn;
        Double d14 = this.estimatedCompletionDistance;
        List<String> list = this.recipients;
        int i14 = this.transitionsCounter;
        StringBuilder sb3 = new StringBuilder("LiveEventSettingsModel(startTime=");
        sb3.append(l14);
        sb3.append(", isMsgContentPaceSpeedOn=");
        sb3.append(z14);
        sb3.append(", isMsgContentCumulativeTimeOn=");
        kg.f.q(", isMsgContentLastLapTimeOn=", ", isMsgTriggerStartSelected=", sb3, z15, z16);
        kg.f.q(", isMsgTriggerEveryMileSelected=", ", isMsgTriggerEveryLapSelected=", sb3, z17, z18);
        kg.f.q(", isMsgTriggerEveryTransitionSelected=", ", isMsgTriggerEndSelected=", sb3, z19, z24);
        kg.f.q(", isLiveTrackON=", ", isEstimatedCompletionTimeOn=", sb3, z25, z26);
        sb3.append(z27);
        sb3.append(", estimatedCompletionDistance=");
        sb3.append(d14);
        sb3.append(", recipients=");
        sb3.append(list);
        sb3.append(", transitionsCounter=");
        sb3.append(i14);
        sb3.append(")");
        return sb3.toString();
    }

    public a(Long l14, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, Double d14, List<String> list, int i14) {
        this.startTime = l14;
        this.isMsgContentPaceSpeedOn = z14;
        this.isMsgContentCumulativeTimeOn = z15;
        this.isMsgContentLastLapTimeOn = z16;
        this.isMsgTriggerStartSelected = z17;
        this.isMsgTriggerEveryMileSelected = z18;
        this.isMsgTriggerEveryLapSelected = z19;
        this.isMsgTriggerEveryTransitionSelected = z24;
        this.isMsgTriggerEndSelected = z25;
        this.isLiveTrackON = z26;
        this.isEstimatedCompletionTimeOn = z27;
        this.estimatedCompletionDistance = d14;
        this.recipients = list;
        this.transitionsCounter = i14;
    }

    public a() {
        this(null, false, false, false, false, false, false, false, false, false, false, null, null, 0, 16383, null);
    }
}
