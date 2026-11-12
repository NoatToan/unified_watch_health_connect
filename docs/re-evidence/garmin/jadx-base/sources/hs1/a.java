package hs1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lhs1/a;", "", "", "minValue", "maxValue", "chargedValue", "drainedValue", "latestValue", "endOfDayValue", "", "featureVersion", "Lhs1/b;", "dynamicFeedbackEvent", "endOfDayDynamicFeedbackEvent", "", "activityEvents", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lhs1/b;Lhs1/b;Ljava/util/List;)V", "a", "Ljava/lang/Integer;", "getMinValue", "()Ljava/lang/Integer;", "b", "d", "c", JWKParameterNames.RSA_EXPONENT, "f", "getEndOfDayValue", "g", "Ljava/lang/String;", "getFeatureVersion", "()Ljava/lang/String;", "h", "Lhs1/b;", "getDynamicFeedbackEvent", "()Lhs1/b;", IntegerTokenConverter.CONVERTER_KEY, "getEndOfDayDynamicFeedbackEvent", "j", "Ljava/util/List;", "getActivityEvents", "()Ljava/util/List;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minValue")
    private final Integer minValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxValue")
    private final Integer maxValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("chargedValue")
    private final Integer chargedValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("drainedValue")
    private final Integer drainedValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latestValue")
    private final Integer latestValue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endOfDayValue")
    private final Integer endOfDayValue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("featureVersion")
    private final String featureVersion;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dynamicFeedbackEvent")
    private final b dynamicFeedbackEvent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endOfDayDynamicFeedbackEvent")
    private final b endOfDayDynamicFeedbackEvent;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityEvents")
    private final List<Object> activityEvents;

    public /* synthetic */ a(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, b bVar, b bVar2, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3, (i14 & 8) != 0 ? null : num4, (i14 & 16) != 0 ? null : num5, (i14 & 32) != 0 ? null : num6, (i14 & 64) != 0 ? null : str, (i14 & 128) != 0 ? null : bVar, (i14 & 256) != 0 ? null : bVar2, (i14 & 512) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getChargedValue() {
        return this.chargedValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getDrainedValue() {
        return this.drainedValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getLatestValue() {
        return this.latestValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getMaxValue() {
        return this.maxValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.minValue, aVar.minValue) && s.g(this.maxValue, aVar.maxValue) && s.g(this.chargedValue, aVar.chargedValue) && s.g(this.drainedValue, aVar.drainedValue) && s.g(this.latestValue, aVar.latestValue) && s.g(this.endOfDayValue, aVar.endOfDayValue) && s.g(this.featureVersion, aVar.featureVersion) && s.g(this.dynamicFeedbackEvent, aVar.dynamicFeedbackEvent) && s.g(this.endOfDayDynamicFeedbackEvent, aVar.endOfDayDynamicFeedbackEvent) && s.g(this.activityEvents, aVar.activityEvents);
    }

    public final int hashCode() {
        Integer num = this.minValue;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxValue;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.chargedValue;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.drainedValue;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.latestValue;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.endOfDayValue;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str = this.featureVersion;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.dynamicFeedbackEvent;
        int iHashCode8 = (iHashCode7 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.endOfDayDynamicFeedbackEvent;
        int iHashCode9 = (iHashCode8 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        List<Object> list = this.activityEvents;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.minValue;
        Integer num2 = this.maxValue;
        Integer num3 = this.chargedValue;
        Integer num4 = this.drainedValue;
        Integer num5 = this.latestValue;
        Integer num6 = this.endOfDayValue;
        String str = this.featureVersion;
        b bVar = this.dynamicFeedbackEvent;
        b bVar2 = this.endOfDayDynamicFeedbackEvent;
        List<Object> list = this.activityEvents;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "BodyBattery(minValue=", ", maxValue=", ", chargedValue=", num2);
        x.m(sbL, num3, ", drainedValue=", num4, ", latestValue=");
        x.m(sbL, num5, ", endOfDayValue=", num6, ", featureVersion=");
        sbL.append(str);
        sbL.append(", dynamicFeedbackEvent=");
        sbL.append(bVar);
        sbL.append(", endOfDayDynamicFeedbackEvent=");
        sbL.append(bVar2);
        sbL.append(", activityEvents=");
        sbL.append(list);
        sbL.append(")");
        return sbL.toString();
    }

    public a(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, b bVar, b bVar2, List<Object> list) {
        this.minValue = num;
        this.maxValue = num2;
        this.chargedValue = num3;
        this.drainedValue = num4;
        this.latestValue = num5;
        this.endOfDayValue = num6;
        this.featureVersion = str;
        this.dynamicFeedbackEvent = bVar;
        this.endOfDayDynamicFeedbackEvent = bVar2;
        this.activityEvents = list;
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
