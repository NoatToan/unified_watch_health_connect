package uz0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.w;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bf\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b5\u00106R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u00108\u001a\u0004\b@\u0010:R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\bA\u0010:R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010:R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010D\u001a\u0004\b;\u0010ER\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u00108\u001a\u0004\bG\u0010:R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u00108\u001a\u0004\bF\u0010:R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u00108\u001a\u0004\bH\u0010:R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00108\u001a\u0004\bK\u0010:R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u00108\u001a\u0004\bL\u0010:R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u00108\u001a\u0004\bN\u0010:R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u00108\u001a\u0004\bO\u0010:R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u00108\u001a\u0004\bQ\u0010:R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u00108\u001a\u0004\bR\u0010:R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u00108\u001a\u0004\bT\u0010:R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u00108\u001a\u0004\bU\u0010:R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u00108\u001a\u0004\bI\u0010:R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u00108\u001a\u0004\bJ\u0010:R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u00108\u001a\u0004\b]\u0010:R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010<\u001a\u0004\b_\u0010>R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u00108\u001a\u0004\b`\u0010:R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u00108\u001a\u0004\bb\u0010:R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u00108\u001a\u0004\bc\u0010:R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u00108\u001a\u0004\be\u0010:R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bf\u00108\u001a\u0004\bg\u0010:R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u00108\u001a\u0004\bh\u0010:R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010<\u001a\u0004\bj\u0010>R\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010k\u001a\u0004\bl\u0010mR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u00108\u001a\u0004\bn\u0010:R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u00108\u001a\u0004\bp\u0010:R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bq\u00108\u001a\u0004\ba\u0010:R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\br\u00108\u001a\u0004\bf\u0010:R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bs\u00108\u001a\u0004\bt\u0010:R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bu\u00108\u001a\u0004\bv\u0010:R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u00108\u001a\u0004\bw\u0010:R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bx\u00108\u001a\u0004\by\u0010:R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bz\u00108\u001a\u0004\b{\u0010:R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b|\u00108\u001a\u0004\b}\u0010:R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b~\u00108\u001a\u0004\b\u007f\u0010:R\u001e\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0080\u0001\u00108\u001a\u0005\b\u0081\u0001\u0010:R\u001e\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u00108\u001a\u0005\b\u0083\u0001\u0010:R\u001d\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0084\u0001\u00108\u001a\u0004\bu\u0010:R\u001e\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u00108\u001a\u0005\b\u0086\u0001\u0010:R\u001e\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0087\u0001\u00108\u001a\u0005\b\u0088\u0001\u0010:¨\u0006\u0089\u0001"}, d2 = {"Luz0/j;", "Landroid/os/Parcelable;", "", "activityName", "", "activityId", "commentText", "commentUuid", "displayName", "Lorg/joda/time/DateTime;", "activityCreatedTime", "privacySetting", "activityType0", "activityType1", "activityType2", "activityType3", "activityType4", "activityType5", "activityType6", "activityType7", "activityType8", "activityType9", "activityType10", "activityType11", "", "activityTypes", "groupName", "groupId", "newsPostId", "newsPostText", "announcementText", "shareableEventUuid", "eventName", "modifiedNames", "trainingPLanId", "Luz0/l;", "trainingType", "trainingPlanCategory", "consentType", "adminName", "childName", "gearUUID", "gearName", "gearType", "gearUsageType", "gearMaxDistance", "gearMaxDate", "gearMaxDuration", "exclusiveOfferId", "exclusiveOfferProductName", "exclusiveOfferOffer", "contactFirstName", "contactLastName", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Luz0/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "c", "D", "F", JWKParameterNames.RSA_EXPONENT, "getDisplayName", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "g", "q0", "h", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "m", "l", "o", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_MODULUS, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "s", "p", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "u", "v", "Ljava/util/List;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "()Ljava/util/List;", "C0", "(Ljava/util/List;)V", "w", "k0", "x", "j0", "o0", "z", "p0", "A", "B", "w0", "C", "I", "n0", "E", "x0", "Luz0/l;", "A0", "()Luz0/l;", "z0", "P", "G", "T", "X", "Y", "h0", "Z", "f0", "g0", "H0", "i0", "I0", "c0", "J0", "a0", "K0", "e0", "L0", "M", "M0", "getExclusiveOfferProductName", "N0", "O0", "getContactFirstName", "P0", "getContactLastName", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("announcement_text")
    private final String announcementText;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("shareable_event_uuid")
    private final String shareableEventUuid;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("event_name")
    private final String eventName;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("modified_fields")
    private final String modifiedNames;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("training-plan-id")
    private final Long trainingPLanId;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("training-type")
    private final l trainingType;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @SerializedName("gear_usage_type")
    private final String gearUsageType;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("training-plan-category")
    private final String trainingPlanCategory;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @SerializedName("gear_max_distance")
    private final String gearMaxDistance;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @SerializedName("gear_max_date")
    private final String gearMaxDate;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @SerializedName("gear_max_duration")
    private final String gearMaxDuration;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.PROMOTION_ID)
    private final String exclusiveOfferId;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @SerializedName("product_name")
    private final String exclusiveOfferProductName;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @SerializedName("offer")
    private final String exclusiveOfferOffer;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @SerializedName("contact-first-name")
    private final String contactFirstName;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("consentType")
    private final String consentType;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @SerializedName("contact-last-name")
    private final String contactLastName;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("adminName")
    private final String adminName;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("childName")
    private final String childName;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @SerializedName("gear")
    private final String gearUUID;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @SerializedName("gear_name")
    private final String gearName;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("act_name")
    private final String activityName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activity")
    private final Long activityId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("comment_text")
    private final String commentText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("comment_uuid")
    private final String commentUuid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("display_name")
    private final String displayName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("act_start_time_gmt")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private final DateTime activityCreatedTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("privacy_setting")
    private final String privacySetting;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activity_type_0")
    private final String activityType0;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activity_type_1")
    private final String activityType1;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activity_type_2")
    private final String activityType2;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activity_type_3")
    private final String activityType3;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gear_type")
    private final String gearType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activity_type_4")
    private final String activityType4;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activity_type_5")
    private final String activityType5;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activity_type_6")
    private final String activityType6;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activity_type_7")
    private final String activityType7;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activity_type_8")
    private final String activityType8;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activity_type_9")
    private final String activityType9;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activity_type_10")
    private final String activityType10;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activity_type_11")
    private final String activityType11;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activity_types")
    private List<String> activityTypes;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("group_name")
    private final String groupName;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("group")
    private final Long groupId;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("newspost")
    private final String newsPostId;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("newspost_text")
    private final String newsPostText;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long l14;
            parcel.getClass();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                l14 = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                l14 = null;
            }
            String string2 = parcel.readString();
            Long l15 = l14;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string18 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? l15 : Long.valueOf(parcel.readLong());
            String string19 = parcel.readString();
            Long l16 = lValueOf2;
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            Object objValueOf = l15;
            String string24 = parcel.readString();
            Object objValueOf2 = parcel.readInt() == 0 ? objValueOf : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                objValueOf = l.valueOf(parcel.readString());
            }
            return new j(string, lValueOf, string2, string3, string4, dateTime, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, arrayListCreateStringArrayList, string18, l16, string19, string20, string21, string22, string23, string24, objValueOf2, objValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ j(String str, Long l14, String str2, String str3, String str4, DateTime dateTime, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List list, String str18, Long l15, String str19, String str20, String str21, String str22, String str23, String str24, Long l16, l lVar, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        String str41 = (i14 & 1) != 0 ? null : str;
        this(str41, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : dateTime, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? null : str6, (i14 & 256) != 0 ? null : str7, (i14 & 512) != 0 ? null : str8, (i14 & 1024) != 0 ? null : str9, (i14 & 2048) != 0 ? null : str10, (i14 & 4096) != 0 ? null : str11, (i14 & 8192) != 0 ? null : str12, (i14 & 16384) != 0 ? null : str13, (i14 & 32768) != 0 ? null : str14, (i14 & 65536) != 0 ? null : str15, (i14 & 131072) != 0 ? null : str16, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : str17, (i14 & 524288) != 0 ? null : list, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str18, (i14 & 2097152) != 0 ? null : l15, (i14 & 4194304) != 0 ? null : str19, (i14 & 8388608) != 0 ? null : str20, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str21, (i14 & 33554432) != 0 ? null : str22, (i14 & 67108864) != 0 ? null : str23, (i14 & 134217728) != 0 ? null : str24, (i14 & 268435456) != 0 ? null : l16, (i14 & 536870912) != 0 ? null : lVar, (i14 & 1073741824) != 0 ? null : str25, (i14 & Integer.MIN_VALUE) != 0 ? null : str26, (i15 & 1) != 0 ? null : str27, (i15 & 2) != 0 ? null : str28, (i15 & 4) != 0 ? null : str29, (i15 & 8) != 0 ? null : str30, (i15 & 16) != 0 ? null : str31, (i15 & 32) != 0 ? null : str32, (i15 & 64) != 0 ? null : str33, (i15 & 128) != 0 ? null : str34, (i15 & 256) != 0 ? null : str35, (i15 & 512) != 0 ? null : str36, (i15 & 1024) != 0 ? null : str37, (i15 & 2048) != 0 ? null : str38, (i15 & 4096) != 0 ? null : str39, (i15 & 8192) != 0 ? null : str40);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getAnnouncementText() {
        return this.announcementText;
    }

    /* JADX INFO: renamed from: A0, reason: from getter */
    public final l getTrainingType() {
        return this.trainingType;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getChildName() {
        return this.childName;
    }

    public final void C0(ArrayList arrayList) {
        this.activityTypes = arrayList;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getCommentText() {
        return this.commentText;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getCommentUuid() {
        return this.commentUuid;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final String getConsentType() {
        return this.consentType;
    }

    public final String H() {
        String str = this.contactFirstName;
        if (str == null) {
            str = "";
        }
        String str2 = this.contactLastName;
        return w.i0(str + StringUtils.SPACE + (str2 != null ? str2 : "")).toString();
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getExclusiveOfferId() {
        return this.exclusiveOfferId;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final String getExclusiveOfferOffer() {
        return this.exclusiveOfferOffer;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final String getGearMaxDate() {
        return this.gearMaxDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getActivityCreatedTime() {
        return this.activityCreatedTime;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final String getGearMaxDistance() {
        return this.gearMaxDistance;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final String getGearMaxDuration() {
        return this.gearMaxDuration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.activityName, jVar.activityName) && s.g(this.activityId, jVar.activityId) && s.g(this.commentText, jVar.commentText) && s.g(this.commentUuid, jVar.commentUuid) && s.g(this.displayName, jVar.displayName) && s.g(this.activityCreatedTime, jVar.activityCreatedTime) && s.g(this.privacySetting, jVar.privacySetting) && s.g(this.activityType0, jVar.activityType0) && s.g(this.activityType1, jVar.activityType1) && s.g(this.activityType2, jVar.activityType2) && s.g(this.activityType3, jVar.activityType3) && s.g(this.activityType4, jVar.activityType4) && s.g(this.activityType5, jVar.activityType5) && s.g(this.activityType6, jVar.activityType6) && s.g(this.activityType7, jVar.activityType7) && s.g(this.activityType8, jVar.activityType8) && s.g(this.activityType9, jVar.activityType9) && s.g(this.activityType10, jVar.activityType10) && s.g(this.activityType11, jVar.activityType11) && s.g(this.activityTypes, jVar.activityTypes) && s.g(this.groupName, jVar.groupName) && s.g(this.groupId, jVar.groupId) && s.g(this.newsPostId, jVar.newsPostId) && s.g(this.newsPostText, jVar.newsPostText) && s.g(this.announcementText, jVar.announcementText) && s.g(this.shareableEventUuid, jVar.shareableEventUuid) && s.g(this.eventName, jVar.eventName) && s.g(this.modifiedNames, jVar.modifiedNames) && s.g(this.trainingPLanId, jVar.trainingPLanId) && this.trainingType == jVar.trainingType && s.g(this.trainingPlanCategory, jVar.trainingPlanCategory) && s.g(this.consentType, jVar.consentType) && s.g(this.adminName, jVar.adminName) && s.g(this.childName, jVar.childName) && s.g(this.gearUUID, jVar.gearUUID) && s.g(this.gearName, jVar.gearName) && s.g(this.gearType, jVar.gearType) && s.g(this.gearUsageType, jVar.gearUsageType) && s.g(this.gearMaxDistance, jVar.gearMaxDistance) && s.g(this.gearMaxDate, jVar.gearMaxDate) && s.g(this.gearMaxDuration, jVar.gearMaxDuration) && s.g(this.exclusiveOfferId, jVar.exclusiveOfferId) && s.g(this.exclusiveOfferProductName, jVar.exclusiveOfferProductName) && s.g(this.exclusiveOfferOffer, jVar.exclusiveOfferOffer) && s.g(this.contactFirstName, jVar.contactFirstName) && s.g(this.contactLastName, jVar.contactLastName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final String getGearName() {
        return this.gearName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getActivityType0() {
        return this.activityType0;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final String getGearType() {
        return this.gearType;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getActivityType1() {
        return this.activityType1;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final String getGearUUID() {
        return this.gearUUID;
    }

    public final int hashCode() {
        String str = this.activityName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l14 = this.activityId;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.commentText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.commentUuid;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DateTime dateTime = this.activityCreatedTime;
        int iHashCode6 = (iHashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        String str5 = this.privacySetting;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.activityType0;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.activityType1;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.activityType2;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.activityType3;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.activityType4;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.activityType5;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.activityType6;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.activityType7;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.activityType8;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.activityType9;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.activityType10;
        int iHashCode18 = (iHashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.activityType11;
        int iHashCode19 = (iHashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        List<String> list = this.activityTypes;
        int iHashCode20 = (iHashCode19 + (list == null ? 0 : list.hashCode())) * 31;
        String str18 = this.groupName;
        int iHashCode21 = (iHashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Long l15 = this.groupId;
        int iHashCode22 = (iHashCode21 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str19 = this.newsPostId;
        int iHashCode23 = (iHashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.newsPostText;
        int iHashCode24 = (iHashCode23 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.announcementText;
        int iHashCode25 = (iHashCode24 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.shareableEventUuid;
        int iHashCode26 = (iHashCode25 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.eventName;
        int iHashCode27 = (iHashCode26 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.modifiedNames;
        int iHashCode28 = (iHashCode27 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Long l16 = this.trainingPLanId;
        int iHashCode29 = (iHashCode28 + (l16 == null ? 0 : l16.hashCode())) * 31;
        l lVar = this.trainingType;
        int iHashCode30 = (iHashCode29 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str25 = this.trainingPlanCategory;
        int iHashCode31 = (iHashCode30 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.consentType;
        int iHashCode32 = (iHashCode31 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.adminName;
        int iHashCode33 = (iHashCode32 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.childName;
        int iHashCode34 = (iHashCode33 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.gearUUID;
        int iHashCode35 = (iHashCode34 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.gearName;
        int iHashCode36 = (iHashCode35 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.gearType;
        int iHashCode37 = (iHashCode36 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.gearUsageType;
        int iHashCode38 = (iHashCode37 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.gearMaxDistance;
        int iHashCode39 = (iHashCode38 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.gearMaxDate;
        int iHashCode40 = (iHashCode39 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.gearMaxDuration;
        int iHashCode41 = (iHashCode40 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.exclusiveOfferId;
        int iHashCode42 = (iHashCode41 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.exclusiveOfferProductName;
        int iHashCode43 = (iHashCode42 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.exclusiveOfferOffer;
        int iHashCode44 = (iHashCode43 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.contactFirstName;
        int iHashCode45 = (iHashCode44 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.contactLastName;
        return iHashCode45 + (str40 != null ? str40.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getActivityType10() {
        return this.activityType10;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final String getGearUsageType() {
        return this.gearUsageType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getActivityType11() {
        return this.activityType11;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final Long getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getActivityType2() {
        return this.activityType2;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getActivityType3() {
        return this.activityType3;
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final String getModifiedNames() {
        return this.modifiedNames;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getActivityType4() {
        return this.activityType4;
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final String getNewsPostId() {
        return this.newsPostId;
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final String getNewsPostText() {
        return this.newsPostText;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getActivityType5() {
        return this.activityType5;
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final String getPrivacySetting() {
        return this.privacySetting;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getActivityType6() {
        return this.activityType6;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getActivityType7() {
        return this.activityType7;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getActivityType8() {
        return this.activityType8;
    }

    public final String toString() {
        String str = this.activityName;
        Long l14 = this.activityId;
        String str2 = this.commentText;
        String str3 = this.commentUuid;
        String str4 = this.displayName;
        DateTime dateTime = this.activityCreatedTime;
        String str5 = this.privacySetting;
        String str6 = this.activityType0;
        String str7 = this.activityType1;
        String str8 = this.activityType2;
        String str9 = this.activityType3;
        String str10 = this.activityType4;
        String str11 = this.activityType5;
        String str12 = this.activityType6;
        String str13 = this.activityType7;
        String str14 = this.activityType8;
        String str15 = this.activityType9;
        String str16 = this.activityType10;
        String str17 = this.activityType11;
        List<String> list = this.activityTypes;
        String str18 = this.groupName;
        Long l15 = this.groupId;
        String str19 = this.newsPostId;
        String str20 = this.newsPostText;
        String str21 = this.announcementText;
        String str22 = this.shareableEventUuid;
        String str23 = this.eventName;
        String str24 = this.modifiedNames;
        Long l16 = this.trainingPLanId;
        l lVar = this.trainingType;
        String str25 = this.trainingPlanCategory;
        String str26 = this.consentType;
        String str27 = this.adminName;
        String str28 = this.childName;
        String str29 = this.gearUUID;
        String str30 = this.gearName;
        String str31 = this.gearType;
        String str32 = this.gearUsageType;
        String str33 = this.gearMaxDistance;
        String str34 = this.gearMaxDate;
        String str35 = this.gearMaxDuration;
        String str36 = this.exclusiveOfferId;
        String str37 = this.exclusiveOfferProductName;
        String str38 = this.exclusiveOfferOffer;
        String str39 = this.contactFirstName;
        String str40 = this.contactLastName;
        StringBuilder sb3 = new StringBuilder("NotificationRelativeNameValueDTO(activityName=");
        sb3.append(str);
        sb3.append(", activityId=");
        sb3.append(l14);
        sb3.append(", commentText=");
        sn.a.t(sb3, str2, ", commentUuid=", str3, ", displayName=");
        sb3.append(str4);
        sb3.append(", activityCreatedTime=");
        sb3.append(dateTime);
        sb3.append(", privacySetting=");
        sn.a.t(sb3, str5, ", activityType0=", str6, ", activityType1=");
        sn.a.t(sb3, str7, ", activityType2=", str8, ", activityType3=");
        sn.a.t(sb3, str9, ", activityType4=", str10, ", activityType5=");
        sn.a.t(sb3, str11, ", activityType6=", str12, ", activityType7=");
        sn.a.t(sb3, str13, ", activityType8=", str14, ", activityType9=");
        sn.a.t(sb3, str15, ", activityType10=", str16, ", activityType11=");
        e0.o(str17, ", activityTypes=", ", groupName=", sb3, list);
        n23.j.q(l15, str18, ", groupId=", ", newsPostId=", sb3);
        sn.a.t(sb3, str19, ", newsPostText=", str20, ", announcementText=");
        sn.a.t(sb3, str21, ", shareableEventUuid=", str22, ", eventName=");
        sn.a.t(sb3, str23, ", modifiedNames=", str24, ", trainingPLanId=");
        sb3.append(l16);
        sb3.append(", trainingType=");
        sb3.append(lVar);
        sb3.append(", trainingPlanCategory=");
        sn.a.t(sb3, str25, ", consentType=", str26, ", adminName=");
        sn.a.t(sb3, str27, ", childName=", str28, ", gearUUID=");
        sn.a.t(sb3, str29, ", gearName=", str30, ", gearType=");
        sn.a.t(sb3, str31, ", gearUsageType=", str32, ", gearMaxDistance=");
        sn.a.t(sb3, str33, ", gearMaxDate=", str34, ", gearMaxDuration=");
        sn.a.t(sb3, str35, ", exclusiveOfferId=", str36, ", exclusiveOfferProductName=");
        sn.a.t(sb3, str37, ", exclusiveOfferOffer=", str38, ", contactFirstName=");
        return e5.h(sb3, str39, ", contactLastName=", str40, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getActivityType9() {
        return this.activityType9;
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final String getShareableEventUuid() {
        return this.shareableEventUuid;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.activityName);
        Long l14 = this.activityId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.commentText);
        parcel.writeString(this.commentUuid);
        parcel.writeString(this.displayName);
        parcel.writeSerializable(this.activityCreatedTime);
        parcel.writeString(this.privacySetting);
        parcel.writeString(this.activityType0);
        parcel.writeString(this.activityType1);
        parcel.writeString(this.activityType2);
        parcel.writeString(this.activityType3);
        parcel.writeString(this.activityType4);
        parcel.writeString(this.activityType5);
        parcel.writeString(this.activityType6);
        parcel.writeString(this.activityType7);
        parcel.writeString(this.activityType8);
        parcel.writeString(this.activityType9);
        parcel.writeString(this.activityType10);
        parcel.writeString(this.activityType11);
        parcel.writeStringList(this.activityTypes);
        parcel.writeString(this.groupName);
        Long l15 = this.groupId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.newsPostId);
        parcel.writeString(this.newsPostText);
        parcel.writeString(this.announcementText);
        parcel.writeString(this.shareableEventUuid);
        parcel.writeString(this.eventName);
        parcel.writeString(this.modifiedNames);
        Long l16 = this.trainingPLanId;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        l lVar = this.trainingType;
        if (lVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(lVar.name());
        }
        parcel.writeString(this.trainingPlanCategory);
        parcel.writeString(this.consentType);
        parcel.writeString(this.adminName);
        parcel.writeString(this.childName);
        parcel.writeString(this.gearUUID);
        parcel.writeString(this.gearName);
        parcel.writeString(this.gearType);
        parcel.writeString(this.gearUsageType);
        parcel.writeString(this.gearMaxDistance);
        parcel.writeString(this.gearMaxDate);
        parcel.writeString(this.gearMaxDuration);
        parcel.writeString(this.exclusiveOfferId);
        parcel.writeString(this.exclusiveOfferProductName);
        parcel.writeString(this.exclusiveOfferOffer);
        parcel.writeString(this.contactFirstName);
        parcel.writeString(this.contactLastName);
    }

    /* JADX INFO: renamed from: x0, reason: from getter */
    public final Long getTrainingPLanId() {
        return this.trainingPLanId;
    }

    public final List<String> y() {
        return this.activityTypes;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getAdminName() {
        return this.adminName;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final String getTrainingPlanCategory() {
        return this.trainingPlanCategory;
    }

    public j(String str, Long l14, String str2, String str3, String str4, DateTime dateTime, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List<String> list, String str18, Long l15, String str19, String str20, String str21, String str22, String str23, String str24, Long l16, l lVar, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40) {
        this.activityName = str;
        this.activityId = l14;
        this.commentText = str2;
        this.commentUuid = str3;
        this.displayName = str4;
        this.activityCreatedTime = dateTime;
        this.privacySetting = str5;
        this.activityType0 = str6;
        this.activityType1 = str7;
        this.activityType2 = str8;
        this.activityType3 = str9;
        this.activityType4 = str10;
        this.activityType5 = str11;
        this.activityType6 = str12;
        this.activityType7 = str13;
        this.activityType8 = str14;
        this.activityType9 = str15;
        this.activityType10 = str16;
        this.activityType11 = str17;
        this.activityTypes = list;
        this.groupName = str18;
        this.groupId = l15;
        this.newsPostId = str19;
        this.newsPostText = str20;
        this.announcementText = str21;
        this.shareableEventUuid = str22;
        this.eventName = str23;
        this.modifiedNames = str24;
        this.trainingPLanId = l16;
        this.trainingType = lVar;
        this.trainingPlanCategory = str25;
        this.consentType = str26;
        this.adminName = str27;
        this.childName = str28;
        this.gearUUID = str29;
        this.gearName = str30;
        this.gearType = str31;
        this.gearUsageType = str32;
        this.gearMaxDistance = str33;
        this.gearMaxDate = str34;
        this.gearMaxDuration = str35;
        this.exclusiveOfferId = str36;
        this.exclusiveOfferProductName = str37;
        this.exclusiveOfferOffer = str38;
        this.contactFirstName = str39;
        this.contactLastName = str40;
    }

    public j() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 16383, null);
    }
}
