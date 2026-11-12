package ju0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b*\u0010\"\"\u0004\b+\u0010$R$\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R$\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010%\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)¨\u00060"}, d2 = {"Lju0/q;", "", "", "liveEventSharingEnabled", "liveTrackEnabled", "", "liveEventSharingEndTimestamp", "", "Lju0/b;", "liveEventSharingMsgContents", "", "liveEventSharingTargetDistance", "Lju0/c;", "liveEventSharingMsgTriggers", "liveEventSharingTriggerDistance", "liveEventSharingTriggerTime", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "m", "(Ljava/lang/Boolean;)V", "b", "j", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", JWKParameterNames.RSA_MODULUS, "(Ljava/lang/Long;)V", "Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, "()Ljava/util/List;", "o", "(Ljava/util/List;)V", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(Ljava/lang/Integer;)V", "f", "p", "h", "setLiveEventSharingTriggerDistance", IntegerTokenConverter.CONVERTER_KEY, "setLiveEventSharingTriggerTime", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("liveEventSharingEnabled")
    private Boolean liveEventSharingEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("liveTrackEnabled")
    private Boolean liveTrackEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("liveEventSharingEndTimestamp")
    private Long liveEventSharingEndTimestamp;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("liveEventSharingMsgContents")
    private List<b> liveEventSharingMsgContents;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("liveEventSharingTargetDistance")
    private Integer liveEventSharingTargetDistance;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("liveEventSharingMsgTriggers")
    private List<c> liveEventSharingMsgTriggers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("liveEventSharingTriggerDistance")
    private Integer liveEventSharingTriggerDistance;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("liveEventSharingTriggerTime")
    private Integer liveEventSharingTriggerTime;

    public /* synthetic */ q(Boolean bool, Boolean bool2, Long l14, List list, Integer num, List list2, Integer num2, Integer num3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : bool2, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? null : list2, (i14 & 64) != 0 ? null : num2, (i14 & 128) != 0 ? null : num3);
    }

    public static q a(q qVar, Boolean bool, Boolean bool2, Long l14, int i14) {
        if ((i14 & 1) != 0) {
            bool = qVar.liveEventSharingEnabled;
        }
        Boolean bool3 = bool;
        if ((i14 & 2) != 0) {
            bool2 = qVar.liveTrackEnabled;
        }
        Boolean bool4 = bool2;
        if ((i14 & 4) != 0) {
            l14 = qVar.liveEventSharingEndTimestamp;
        }
        List<b> list = qVar.liveEventSharingMsgContents;
        Integer num = qVar.liveEventSharingTargetDistance;
        List<c> list2 = qVar.liveEventSharingMsgTriggers;
        Integer num2 = qVar.liveEventSharingTriggerDistance;
        Integer num3 = qVar.liveEventSharingTriggerTime;
        qVar.getClass();
        return new q(bool3, bool4, l14, list, num, list2, num2, num3);
    }

    public final int b() {
        Integer num = this.liveEventSharingTriggerDistance;
        if (num != null) {
            return num.intValue();
        }
        if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()) {
            this.liveEventSharingTriggerDistance = 100000;
            return 100000;
        }
        this.liveEventSharingTriggerDistance = 160934;
        return 160934;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getLiveEventSharingEnabled() {
        return this.liveEventSharingEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getLiveEventSharingEndTimestamp() {
        return this.liveEventSharingEndTimestamp;
    }

    public final List<b> e() {
        return this.liveEventSharingMsgContents;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return s.g(this.liveEventSharingEnabled, qVar.liveEventSharingEnabled) && s.g(this.liveTrackEnabled, qVar.liveTrackEnabled) && s.g(this.liveEventSharingEndTimestamp, qVar.liveEventSharingEndTimestamp) && s.g(this.liveEventSharingMsgContents, qVar.liveEventSharingMsgContents) && s.g(this.liveEventSharingTargetDistance, qVar.liveEventSharingTargetDistance) && s.g(this.liveEventSharingMsgTriggers, qVar.liveEventSharingMsgTriggers) && s.g(this.liveEventSharingTriggerDistance, qVar.liveEventSharingTriggerDistance) && s.g(this.liveEventSharingTriggerTime, qVar.liveEventSharingTriggerTime);
    }

    public final List<c> f() {
        return this.liveEventSharingMsgTriggers;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getLiveEventSharingTargetDistance() {
        return this.liveEventSharingTargetDistance;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getLiveEventSharingTriggerDistance() {
        return this.liveEventSharingTriggerDistance;
    }

    public final int hashCode() {
        Boolean bool = this.liveEventSharingEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.liveTrackEnabled;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l14 = this.liveEventSharingEndTimestamp;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        List<b> list = this.liveEventSharingMsgContents;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.liveEventSharingTargetDistance;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<c> list2 = this.liveEventSharingMsgTriggers;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.liveEventSharingTriggerDistance;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.liveEventSharingTriggerTime;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getLiveEventSharingTriggerTime() {
        return this.liveEventSharingTriggerTime;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getLiveTrackEnabled() {
        return this.liveTrackEnabled;
    }

    public final int k() {
        Integer num = this.liveEventSharingTriggerTime;
        return num != null ? num.intValue() : (int) 1200;
    }

    public final void l(int i14) {
        this.liveEventSharingTriggerDistance = Integer.valueOf(i14);
    }

    public final void m(Boolean bool) {
        this.liveEventSharingEnabled = bool;
    }

    public final void n(Long l14) {
        this.liveEventSharingEndTimestamp = l14;
    }

    public final void o(ArrayList arrayList) {
        this.liveEventSharingMsgContents = arrayList;
    }

    public final void p(ArrayList arrayList) {
        this.liveEventSharingMsgTriggers = arrayList;
    }

    public final void q(Integer num) {
        this.liveEventSharingTargetDistance = num;
    }

    public final void r(Boolean bool) {
        this.liveTrackEnabled = bool;
    }

    public final void s(int i14) {
        this.liveEventSharingTriggerTime = Integer.valueOf(i14);
    }

    public final String toString() {
        Boolean bool = this.liveEventSharingEnabled;
        Boolean bool2 = this.liveTrackEnabled;
        Long l14 = this.liveEventSharingEndTimestamp;
        List<b> list = this.liveEventSharingMsgContents;
        Integer num = this.liveEventSharingTargetDistance;
        List<c> list2 = this.liveEventSharingMsgTriggers;
        Integer num2 = this.liveEventSharingTriggerDistance;
        Integer num3 = this.liveEventSharingTriggerTime;
        StringBuilder sb3 = new StringBuilder("LiveEventSharingSettingsDTO(liveEventSharingEnabled=");
        sb3.append(bool);
        sb3.append(", liveTrackEnabled=");
        sb3.append(bool2);
        sb3.append(", liveEventSharingEndTimestamp=");
        sb3.append(l14);
        sb3.append(", liveEventSharingMsgContents=");
        sb3.append(list);
        sb3.append(", liveEventSharingTargetDistance=");
        sb3.append(num);
        sb3.append(", liveEventSharingMsgTriggers=");
        sb3.append(list2);
        sb3.append(", liveEventSharingTriggerDistance=");
        return b71.i.h(sb3, num2, ", liveEventSharingTriggerTime=", num3, ")");
    }

    public q(Boolean bool, Boolean bool2, Long l14, List<b> list, Integer num, List<c> list2, Integer num2, Integer num3) {
        this.liveEventSharingEnabled = bool;
        this.liveTrackEnabled = bool2;
        this.liveEventSharingEndTimestamp = l14;
        this.liveEventSharingMsgContents = list;
        this.liveEventSharingTargetDistance = num;
        this.liveEventSharingMsgTriggers = list2;
        this.liveEventSharingTriggerDistance = num2;
        this.liveEventSharingTriggerTime = num3;
    }

    public q() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
