package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lc.u0;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bf\b\u0087\b\u0018\u00002\u00020\u0001B«\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\"\u001a\u00020\u001e\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b.\u0010/R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u00101\u001a\u0004\b5\u00103\"\u0004\b6\u00107R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\bG\u0010AR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bD\u0010JR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u00101\u001a\u0004\bH\u00103R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u00101\u001a\u0004\bM\u00103R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bO\u0010JR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u00109\u001a\u0004\bQ\u0010;R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u00101\u001a\u0004\bS\u00103R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u00101\u001a\u0004\bU\u00103R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u00101\u001a\u0004\bT\u00103R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010I\u001a\u0004\bX\u0010JR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010?\u001a\u0004\bZ\u0010AR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010[\u001a\u0004\bY\u0010\\R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010[\u001a\u0004\bP\u0010\\R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010?\u001a\u0004\bB\u0010AR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001a\u0010 \u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010d\u001a\u0004\bh\u0010fR\u001c\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u00109\u001a\u0004\bj\u0010;R\u001a\u0010\"\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010d\u001a\u0004\bl\u0010fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bm\u00109\u001a\u0004\b<\u0010;R$\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001c\u0010%\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010?\u001a\u0004\bt\u0010AR$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR%\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R'\u0010*\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010n\u001a\u0005\b\u0082\u0001\u0010p\"\u0005\b\u0083\u0001\u0010rR'\u0010+\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010n\u001a\u0005\b\u0085\u0001\u0010p\"\u0005\b\u0086\u0001\u0010rR(\u0010,\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b\u0087\u0001\u00109\u001a\u0005\b\u0088\u0001\u0010;\"\u0006\b\u0089\u0001\u0010\u008a\u0001R(\u0010-\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b\u008b\u0001\u00109\u001a\u0005\b\u008c\u0001\u0010;\"\u0006\b\u008d\u0001\u0010\u008a\u0001¨\u0006\u008e\u0001"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/p;", "Landroid/os/Parcelable;", "", "uuid", "badgeChallengeName", "", "challengeCategoryId", "badgeChallengeStatusId", "Lorg/joda/time/DateTime;", "startDate", "endDate", "createDate", "updateDate", "", "badgeId", "badgeKey", "badgeUuid", "badgePoints", "badgeUnitId", "partnerName", "partnerRewardUrl", "badgePromotionCode", "badgePromotionCodeTypePk", "codeExpirationDate", "", "badgeTargetValue", "badgeProgressValue", "badgeEarnedDate", "", "badgeTypeIds", "", "userJoined", "urlEmbeddedSupported", "challengeCategoryImageId", "limitedCapacity", "approximateValue", "joinable", "joinDateLocal", "Lcom/garmin/android/apps/connectmobile/badges/service/model/g;", "badgeTranslation", "Lcom/garmin/android/apps/connectmobile/badges/service/model/o;", "expeditionTranslationDTO", "premium", "isAutoChallengeLink", "multiplier", "earnedMultiplier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/Double;Lorg/joda/time/DateTime;Ljava/util/List;ZZLjava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Boolean;Lorg/joda/time/DateTime;Lcom/garmin/android/apps/connectmobile/badges/service/model/g;Lcom/garmin/android/apps/connectmobile/badges/service/model/o;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "E0", "()Ljava/lang/String;", "b", "getBadgeChallengeName", "setBadgeChallengeName", "(Ljava/lang/String;)V", "c", "Ljava/lang/Integer;", "D", "()Ljava/lang/Integer;", "d", "getBadgeChallengeStatusId", JWKParameterNames.RSA_EXPONENT, "Lorg/joda/time/DateTime;", "getStartDate", "()Lorg/joda/time/DateTime;", "f", "g0", "g", "f0", "h", "getUpdateDate", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "()Ljava/lang/Long;", "j", JWKParameterNames.OCT_KEY_VALUE, "u", "l", "getBadgePoints", "m", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, JWKParameterNames.RSA_MODULUS, "w0", "o", "x0", "p", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getBadgePromotionCodeTypePk", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "e0", "Ljava/lang/Double;", "()Ljava/lang/Double;", "v", "w", "x", "Ljava/util/List;", "getBadgeTypeIds", "()Ljava/util/List;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "Z", "C0", "()Z", "z", "A0", "A", "getChallengeCategoryImageId", "B", "q0", "C", "Ljava/lang/Boolean;", "p0", "()Ljava/lang/Boolean;", "setJoinable", "(Ljava/lang/Boolean;)V", "E", "o0", "F", "Lcom/garmin/android/apps/connectmobile/badges/service/model/g;", "s", "()Lcom/garmin/android/apps/connectmobile/badges/service/model/g;", "e1", "(Lcom/garmin/android/apps/connectmobile/badges/service/model/g;)V", "I", "Lcom/garmin/android/apps/connectmobile/badges/service/model/o;", "getExpeditionTranslationDTO", "()Lcom/garmin/android/apps/connectmobile/badges/service/model/o;", "h1", "(Lcom/garmin/android/apps/connectmobile/badges/service/model/o;)V", "P", "getPremium", "setPremium", "T", "M0", "setAutoChallengeLink", "X", "getMultiplier", "setMultiplier", "(Ljava/lang/Integer;)V", "Y", "getEarnedMultiplier", "setEarnedMultiplier", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("challengeCategoryImageId")
    private final Integer challengeCategoryImageId;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("limitedCapacity")
    private final boolean limitedCapacity;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("approximateValue")
    private final Integer approximateValue;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("joinable")
    private Boolean joinable;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("joinDateLocal")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private final DateTime joinDateLocal;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private com.garmin.android.apps.connectmobile.badges.service.model.g badgeTranslation;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private com.garmin.android.apps.connectmobile.badges.service.model.o expeditionTranslationDTO;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("premium")
    private Boolean premium;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("autoChallengeLink")
    private Boolean isAutoChallengeLink;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("multiplier")
    private Integer multiplier;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @SerializedName("earnedMultiplier")
    private Integer earnedMultiplier;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uuid")
    private final String uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeChallengeName")
    private String badgeChallengeName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("challengeCategoryId")
    private final Integer challengeCategoryId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeChallengeStatusId")
    private final Integer badgeChallengeStatusId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private final DateTime startDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private final DateTime endDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createDate")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private final DateTime createDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updateDate")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private final DateTime updateDate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeId")
    private final Long badgeId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeKey")
    private final String badgeKey;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeUuid")
    private final String badgeUuid;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgePoints")
    private final Long badgePoints;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeUnitId")
    private final Integer badgeUnitId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("partnerName")
    private final String partnerName;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("partnerRewardUrl")
    private final String partnerRewardUrl;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgePromotionCode")
    private final String badgePromotionCode;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgePromotionCodeTypePk")
    private final Long badgePromotionCodeTypePk;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("codeExpirationDate")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private final DateTime codeExpirationDate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeTargetValue")
    private final Double badgeTargetValue;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeProgressValue")
    private final Double badgeProgressValue;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeEarnedDate")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private final DateTime badgeEarnedDate;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeTypeIds")
    private final List<Integer> badgeTypeIds;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userJoined")
    private final boolean userJoined;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("urlEmbeddedSupported")
    private final boolean urlEmbeddedSupported;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z14;
            boolean z15;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            DateTime dateTime4 = (DateTime) parcel.readSerializable();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            Integer num = numValueOf2;
            Long l14 = lValueOf;
            String string4 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string5 = parcel.readString();
            Long l15 = lValueOf2;
            Integer num2 = numValueOf3;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            DateTime dateTime5 = (DateTime) parcel.readSerializable();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            DateTime dateTime6 = (DateTime) parcel.readSerializable();
            boolean z16 = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int i15 = 0;
                while (i15 != i14) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                    i15++;
                    i14 = i14;
                }
            }
            boolean z17 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z16 = true;
            }
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                z14 = true;
                z15 = true;
            } else {
                z14 = true;
                z15 = z16;
            }
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z14 : z16);
            }
            DateTime dateTime7 = (DateTime) parcel.readSerializable();
            com.garmin.android.apps.connectmobile.badges.service.model.g gVar = (com.garmin.android.apps.connectmobile.badges.service.model.g) parcel.readParcelable(p.class.getClassLoader());
            com.garmin.android.apps.connectmobile.badges.service.model.o oVar = (com.garmin.android.apps.connectmobile.badges.service.model.o) parcel.readParcelable(p.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z14 : z16);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0 ? z14 : false);
            }
            return new p(string, string2, numValueOf, num, dateTime, dateTime2, dateTime3, dateTime4, l14, string3, string4, l15, num2, string5, string6, string7, lValueOf3, dateTime5, dValueOf, dValueOf2, dateTime6, arrayList, z17, z16, numValueOf4, z15, numValueOf5, boolValueOf, dateTime7, gVar, oVar, boolValueOf2, boolValueOf3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i14) {
            return new p[i14];
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38288a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.VIRTUAL_HIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.VIRTUAL_CLIMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38288a = iArr;
        }
    }

    public /* synthetic */ p(String str, String str2, Integer num, Integer num2, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, Long l14, String str3, String str4, Long l15, Integer num3, String str5, String str6, String str7, Long l16, DateTime dateTime5, Double d14, Double d15, DateTime dateTime6, List list, boolean z14, boolean z15, Integer num4, boolean z16, Integer num5, Boolean bool, DateTime dateTime7, com.garmin.android.apps.connectmobile.badges.service.model.g gVar, com.garmin.android.apps.connectmobile.badges.service.model.o oVar, Boolean bool2, Boolean bool3, Integer num6, Integer num7, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : num2, (i14 & 16) != 0 ? null : dateTime, (i14 & 32) != 0 ? null : dateTime2, (i14 & 64) != 0 ? null : dateTime3, (i14 & 128) != 0 ? null : dateTime4, (i14 & 256) != 0 ? null : l14, (i14 & 512) != 0 ? null : str3, (i14 & 1024) != 0 ? null : str4, (i14 & 2048) != 0 ? null : l15, (i14 & 4096) != 0 ? null : num3, (i14 & 8192) != 0 ? null : str5, (i14 & 16384) != 0 ? null : str6, (i14 & 32768) != 0 ? null : str7, (i14 & 65536) != 0 ? null : l16, (i14 & 131072) != 0 ? null : dateTime5, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : d14, (i14 & 524288) != 0 ? null : d15, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : dateTime6, (i14 & 2097152) != 0 ? null : list, (i14 & 4194304) != 0 ? false : z14, (i14 & 8388608) != 0 ? false : z15, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : num4, (i14 & 33554432) == 0 ? z16 : false, (i14 & 67108864) != 0 ? null : num5, (i14 & 134217728) != 0 ? Boolean.TRUE : bool, (i14 & 268435456) != 0 ? null : dateTime7, (i14 & 536870912) != 0 ? null : gVar, (i14 & 1073741824) != 0 ? null : oVar, (i14 & Integer.MIN_VALUE) != 0 ? null : bool2, (i15 & 1) != 0 ? null : bool3, (i15 & 2) != 0 ? null : num6, (i15 & 4) != 0 ? null : num7);
    }

    public static p b(p pVar, Boolean bool, int i14) {
        String str = pVar.uuid;
        String str2 = pVar.badgeChallengeName;
        Integer num = pVar.challengeCategoryId;
        Integer num2 = pVar.badgeChallengeStatusId;
        DateTime dateTime = pVar.startDate;
        DateTime dateTime2 = pVar.endDate;
        DateTime dateTime3 = pVar.createDate;
        DateTime dateTime4 = pVar.updateDate;
        Long l14 = pVar.badgeId;
        String str3 = pVar.badgeKey;
        String str4 = pVar.badgeUuid;
        Long l15 = pVar.badgePoints;
        Integer num3 = pVar.badgeUnitId;
        String str5 = pVar.partnerName;
        String str6 = pVar.partnerRewardUrl;
        String str7 = pVar.badgePromotionCode;
        Long l16 = pVar.badgePromotionCodeTypePk;
        DateTime dateTime5 = pVar.codeExpirationDate;
        Double d14 = pVar.badgeTargetValue;
        Double d15 = pVar.badgeProgressValue;
        DateTime dateTime6 = pVar.badgeEarnedDate;
        List<Integer> list = pVar.badgeTypeIds;
        boolean z14 = pVar.userJoined;
        boolean z15 = pVar.urlEmbeddedSupported;
        Integer num4 = pVar.challengeCategoryImageId;
        boolean z16 = pVar.limitedCapacity;
        Integer num5 = pVar.approximateValue;
        if ((i14 & 134217728) != 0) {
            bool = pVar.joinable;
        }
        DateTime dateTime7 = pVar.joinDateLocal;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = pVar.badgeTranslation;
        com.garmin.android.apps.connectmobile.badges.service.model.o oVar = pVar.expeditionTranslationDTO;
        Boolean bool2 = pVar.premium;
        Boolean bool3 = pVar.isAutoChallengeLink;
        Integer num6 = pVar.multiplier;
        Integer num7 = pVar.earnedMultiplier;
        pVar.getClass();
        return new p(str, str2, num, num2, dateTime, dateTime2, dateTime3, dateTime4, l14, str3, str4, l15, num3, str5, str6, str7, l16, dateTime5, d14, d15, dateTime6, list, z14, z15, num4, z16, num5, bool, dateTime7, gVar, oVar, bool2, bool3, num6, num7);
    }

    public final String A() {
        return uu.i0.a(this.challengeCategoryId, this.challengeCategoryImageId, this.badgeId);
    }

    /* JADX INFO: renamed from: A0, reason: from getter */
    public final boolean getUrlEmbeddedSupported() {
        return this.urlEmbeddedSupported;
    }

    public final o C() {
        o.a aVar = o.f38245b;
        Integer num = this.challengeCategoryId;
        aVar.getClass();
        return o.a.a(num);
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final boolean getUserJoined() {
        return this.userJoined;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Integer getChallengeCategoryId() {
        return this.challengeCategoryId;
    }

    /* JADX INFO: renamed from: E0, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final String F() {
        Integer num = this.challengeCategoryId;
        Integer num2 = this.challengeCategoryImageId;
        Long l14 = this.badgeId;
        String strG = uu.i0.g();
        String strI = ((bv.d) KoinJavaComponent.get(bv.d.class)).i();
        String strF = uu.i0.f();
        ((c22.o) KoinJavaComponent.get(c22.o.class)).getClass();
        String strValueOf = String.valueOf(11657);
        if (num2 != null && num != null) {
            return String.format(Locale.US, "%s/%simages/badges/%s/art_badge_challenge_category_joined_%d_%d.png?appVer=".concat(strValueOf), strI, strF, strG, num, num2);
        }
        if (l14 != null) {
            return String.format(Locale.US, "%s/%simages/badges/%s/art_badge_challenge_joined_%d.png?appVer=".concat(strValueOf), strI, strF, strG, l14);
        }
        return null;
    }

    public final String G() {
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        if (gVar != null) {
            return gVar.f30575h;
        }
        return null;
    }

    public final String H() {
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        if (gVar != null) {
            return gVar.f30576i;
        }
        return null;
    }

    public final String I() {
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        if (gVar != null) {
            return gVar.f30572e;
        }
        return null;
    }

    public final boolean J0() {
        return P0() && g22.n.d(this.partnerRewardUrl);
    }

    public final boolean L0() {
        o oVarC = C();
        if (oVarC != null) {
            return oVarC == o.VIRTUAL_HIKE || oVarC == o.VIRTUAL_CLIMB;
        }
        return false;
    }

    public final String M() {
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        if (gVar != null) {
            return gVar.f30574g;
        }
        return null;
    }

    /* JADX INFO: renamed from: M0, reason: from getter */
    public final Boolean getIsAutoChallengeLink() {
        return this.isAutoChallengeLink;
    }

    public final boolean P0() {
        return this.badgeEarnedDate != null;
    }

    public final boolean Q0() {
        return J0() || p005kotlin.jvm.internal.s.g(this.joinable, Boolean.TRUE);
    }

    public final boolean R0() {
        return p005kotlin.jvm.internal.s.d(this.badgeProgressValue, this.badgeTargetValue);
    }

    public final boolean S0() {
        com.garmin.android.apps.connectmobile.badges.service.model.j jVar = com.garmin.android.apps.connectmobile.badges.service.model.j.CUMULATIVE;
        List<Integer> list = this.badgeTypeIds;
        if (list != null) {
            return list.contains(Integer.valueOf(jVar.f30596a));
        }
        return false;
    }

    public final boolean V0() {
        r.a aVar = r.f38301b;
        Integer num = this.badgeChallengeStatusId;
        aVar.getClass();
        return r.a.a(num) == r.FULL;
    }

    public final String Z() {
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        if (gVar != null) {
            return gVar.f30573f;
        }
        return null;
    }

    public final boolean Z0() {
        return p005kotlin.jvm.internal.s.g(this.premium, Boolean.TRUE);
    }

    public final String a0() {
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        if (gVar != null) {
            return gVar.f30580m;
        }
        return null;
    }

    public final boolean b1() {
        DateTime dateTime = this.codeExpirationDate;
        return dateTime != null && dateTime.isBeforeNow();
    }

    public final String c0() {
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        if (gVar != null) {
            return gVar.f30579l;
        }
        return null;
    }

    public final boolean c1() {
        if (!this.userJoined || P0()) {
            return false;
        }
        r.a aVar = r.f38301b;
        Integer num = this.badgeChallengeStatusId;
        aVar.getClass();
        if (r.a.a(num) == r.STOP) {
            return false;
        }
        Integer num2 = this.badgeChallengeStatusId;
        aVar.getClass();
        return r.a.a(num2) != r.END;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getApproximateValue() {
        return this.approximateValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final DateTime getCodeExpirationDate() {
        return this.codeExpirationDate;
    }

    public final void e1(com.garmin.android.apps.connectmobile.badges.service.model.g gVar) {
        this.badgeTranslation = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.uuid, pVar.uuid) && p005kotlin.jvm.internal.s.g(this.badgeChallengeName, pVar.badgeChallengeName) && p005kotlin.jvm.internal.s.g(this.challengeCategoryId, pVar.challengeCategoryId) && p005kotlin.jvm.internal.s.g(this.badgeChallengeStatusId, pVar.badgeChallengeStatusId) && p005kotlin.jvm.internal.s.g(this.startDate, pVar.startDate) && p005kotlin.jvm.internal.s.g(this.endDate, pVar.endDate) && p005kotlin.jvm.internal.s.g(this.createDate, pVar.createDate) && p005kotlin.jvm.internal.s.g(this.updateDate, pVar.updateDate) && p005kotlin.jvm.internal.s.g(this.badgeId, pVar.badgeId) && p005kotlin.jvm.internal.s.g(this.badgeKey, pVar.badgeKey) && p005kotlin.jvm.internal.s.g(this.badgeUuid, pVar.badgeUuid) && p005kotlin.jvm.internal.s.g(this.badgePoints, pVar.badgePoints) && p005kotlin.jvm.internal.s.g(this.badgeUnitId, pVar.badgeUnitId) && p005kotlin.jvm.internal.s.g(this.partnerName, pVar.partnerName) && p005kotlin.jvm.internal.s.g(this.partnerRewardUrl, pVar.partnerRewardUrl) && p005kotlin.jvm.internal.s.g(this.badgePromotionCode, pVar.badgePromotionCode) && p005kotlin.jvm.internal.s.g(this.badgePromotionCodeTypePk, pVar.badgePromotionCodeTypePk) && p005kotlin.jvm.internal.s.g(this.codeExpirationDate, pVar.codeExpirationDate) && p005kotlin.jvm.internal.s.g(this.badgeTargetValue, pVar.badgeTargetValue) && p005kotlin.jvm.internal.s.g(this.badgeProgressValue, pVar.badgeProgressValue) && p005kotlin.jvm.internal.s.g(this.badgeEarnedDate, pVar.badgeEarnedDate) && p005kotlin.jvm.internal.s.g(this.badgeTypeIds, pVar.badgeTypeIds) && this.userJoined == pVar.userJoined && this.urlEmbeddedSupported == pVar.urlEmbeddedSupported && p005kotlin.jvm.internal.s.g(this.challengeCategoryImageId, pVar.challengeCategoryImageId) && this.limitedCapacity == pVar.limitedCapacity && p005kotlin.jvm.internal.s.g(this.approximateValue, pVar.approximateValue) && p005kotlin.jvm.internal.s.g(this.joinable, pVar.joinable) && p005kotlin.jvm.internal.s.g(this.joinDateLocal, pVar.joinDateLocal) && p005kotlin.jvm.internal.s.g(this.badgeTranslation, pVar.badgeTranslation) && p005kotlin.jvm.internal.s.g(this.expeditionTranslationDTO, pVar.expeditionTranslationDTO) && p005kotlin.jvm.internal.s.g(this.premium, pVar.premium) && p005kotlin.jvm.internal.s.g(this.isAutoChallengeLink, pVar.isAutoChallengeLink) && p005kotlin.jvm.internal.s.g(this.multiplier, pVar.multiplier) && p005kotlin.jvm.internal.s.g(this.earnedMultiplier, pVar.earnedMultiplier);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final DateTime getBadgeEarnedDate() {
        return this.badgeEarnedDate;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final DateTime getCreateDate() {
        return this.createDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getBadgeId() {
        return this.badgeId;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final DateTime getEndDate() {
        return this.endDate;
    }

    public final DateTime getStartDate() {
        return this.startDate;
    }

    public final String h() {
        Long l14 = this.badgeId;
        if (l14 != null) {
            return uu.i0.b((int) l14.longValue(), this.badgeUuid);
        }
        return null;
    }

    public final String h0() {
        com.garmin.android.apps.connectmobile.badges.service.model.o oVar;
        o oVarC = C();
        int i14 = oVarC == null ? -1 : b.f38288a[oVarC.ordinal()];
        if (i14 != 1) {
            if (i14 == 2 && (oVar = this.expeditionTranslationDTO) != null) {
                return oVar.f30642b;
            }
            return null;
        }
        com.garmin.android.apps.connectmobile.badges.service.model.o oVar2 = this.expeditionTranslationDTO;
        if (oVar2 != null) {
            return oVar2.f30641a;
        }
        return null;
    }

    public final void h1(com.garmin.android.apps.connectmobile.badges.service.model.o oVar) {
        this.expeditionTranslationDTO = oVar;
    }

    public final int hashCode() {
        String str = this.uuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.badgeChallengeName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.challengeCategoryId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.badgeChallengeStatusId;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        DateTime dateTime = this.startDate;
        int iHashCode5 = (iHashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.endDate;
        int iHashCode6 = (iHashCode5 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.createDate;
        int iHashCode7 = (iHashCode6 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        DateTime dateTime4 = this.updateDate;
        int iHashCode8 = (iHashCode7 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31;
        Long l14 = this.badgeId;
        int iHashCode9 = (iHashCode8 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str3 = this.badgeKey;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.badgeUuid;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l15 = this.badgePoints;
        int iHashCode12 = (iHashCode11 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num3 = this.badgeUnitId;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.partnerName;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.partnerRewardUrl;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.badgePromotionCode;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l16 = this.badgePromotionCodeTypePk;
        int iHashCode17 = (iHashCode16 + (l16 == null ? 0 : l16.hashCode())) * 31;
        DateTime dateTime5 = this.codeExpirationDate;
        int iHashCode18 = (iHashCode17 + (dateTime5 == null ? 0 : dateTime5.hashCode())) * 31;
        Double d14 = this.badgeTargetValue;
        int iHashCode19 = (iHashCode18 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.badgeProgressValue;
        int iHashCode20 = (iHashCode19 + (d15 == null ? 0 : d15.hashCode())) * 31;
        DateTime dateTime6 = this.badgeEarnedDate;
        int iHashCode21 = (iHashCode20 + (dateTime6 == null ? 0 : dateTime6.hashCode())) * 31;
        List<Integer> list = this.badgeTypeIds;
        int iG = q6.f.g(q6.f.g((iHashCode21 + (list == null ? 0 : list.hashCode())) * 31, 31, this.userJoined), 31, this.urlEmbeddedSupported);
        Integer num4 = this.challengeCategoryImageId;
        int iG2 = q6.f.g((iG + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.limitedCapacity);
        Integer num5 = this.approximateValue;
        int iHashCode22 = (iG2 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.joinable;
        int iHashCode23 = (iHashCode22 + (bool == null ? 0 : bool.hashCode())) * 31;
        DateTime dateTime7 = this.joinDateLocal;
        int iHashCode24 = (iHashCode23 + (dateTime7 == null ? 0 : dateTime7.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        int iHashCode25 = (iHashCode24 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.badges.service.model.o oVar = this.expeditionTranslationDTO;
        int iHashCode26 = (iHashCode25 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Boolean bool2 = this.premium;
        int iHashCode27 = (iHashCode26 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isAutoChallengeLink;
        int iHashCode28 = (iHashCode27 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num6 = this.multiplier;
        int iHashCode29 = (iHashCode28 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.earnedMultiplier;
        return iHashCode29 + (num7 != null ? num7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getBadgeKey() {
        return this.badgeKey;
    }

    public final String i0() {
        com.garmin.android.apps.connectmobile.badges.service.model.o oVar = this.expeditionTranslationDTO;
        if (oVar != null) {
            return oVar.f30643c;
        }
        return null;
    }

    public final String j() {
        String str;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        return (gVar == null || (str = gVar.f30569b) == null) ? fb1.c.n("badgeLocation_", this.badgeKey) : str;
    }

    public final String j0() {
        com.garmin.android.apps.connectmobile.badges.service.model.o oVar = this.expeditionTranslationDTO;
        if (oVar != null) {
            return oVar.f30644d;
        }
        return null;
    }

    public final String k() {
        String str;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        return (gVar == null || (str = gVar.f30568a) == null) ? fb1.c.n("badgeName_", this.badgeKey) : str;
    }

    public final boolean k0() {
        if (Z0()) {
            return false;
        }
        boolean z14 = this.userJoined;
        return !(z14 || this.multiplier == null) || (z14 && this.earnedMultiplier != null);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getBadgeProgressValue() {
        return this.badgeProgressValue;
    }

    public final Integer n0() {
        if (!Z0() && !this.userJoined) {
            return this.multiplier;
        }
        if (Z0() || !this.userJoined) {
            return null;
        }
        return this.earnedMultiplier;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getBadgePromotionCode() {
        return this.badgePromotionCode;
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final DateTime getJoinDateLocal() {
        return this.joinDateLocal;
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final Boolean getJoinable() {
        return this.joinable;
    }

    public final String q() {
        String str;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        return (gVar == null || (str = gVar.f30570c) == null) ? fb1.c.n("badgeRange_", this.badgeKey) : str;
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final boolean getLimitedCapacity() {
        return this.limitedCapacity;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Double getBadgeTargetValue() {
        return this.badgeTargetValue;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final com.garmin.android.apps.connectmobile.badges.service.model.g getBadgeTranslation() {
        return this.badgeTranslation;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Integer getBadgeUnitId() {
        return this.badgeUnitId;
    }

    public final String toString() {
        String str = this.uuid;
        String str2 = this.badgeChallengeName;
        Integer num = this.challengeCategoryId;
        Integer num2 = this.badgeChallengeStatusId;
        DateTime dateTime = this.startDate;
        DateTime dateTime2 = this.endDate;
        DateTime dateTime3 = this.createDate;
        DateTime dateTime4 = this.updateDate;
        Long l14 = this.badgeId;
        String str3 = this.badgeKey;
        String str4 = this.badgeUuid;
        Long l15 = this.badgePoints;
        Integer num3 = this.badgeUnitId;
        String str5 = this.partnerName;
        String str6 = this.partnerRewardUrl;
        String str7 = this.badgePromotionCode;
        Long l16 = this.badgePromotionCodeTypePk;
        DateTime dateTime5 = this.codeExpirationDate;
        Double d14 = this.badgeTargetValue;
        Double d15 = this.badgeProgressValue;
        DateTime dateTime6 = this.badgeEarnedDate;
        List<Integer> list = this.badgeTypeIds;
        boolean z14 = this.userJoined;
        boolean z15 = this.urlEmbeddedSupported;
        Integer num4 = this.challengeCategoryImageId;
        boolean z16 = this.limitedCapacity;
        Integer num5 = this.approximateValue;
        Boolean bool = this.joinable;
        DateTime dateTime7 = this.joinDateLocal;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        com.garmin.android.apps.connectmobile.badges.service.model.o oVar = this.expeditionTranslationDTO;
        Boolean bool2 = this.premium;
        Boolean bool3 = this.isAutoChallengeLink;
        Integer num6 = this.multiplier;
        Integer num7 = this.earnedMultiplier;
        StringBuilder sbI = p6.b.i("BadgeChallengeDTO(uuid=", str, ", badgeChallengeName=", str2, ", challengeCategoryId=");
        j20.x.m(sbI, num, ", badgeChallengeStatusId=", num2, ", startDate=");
        sbI.append(dateTime);
        sbI.append(", endDate=");
        sbI.append(dateTime2);
        sbI.append(", createDate=");
        sbI.append(dateTime3);
        sbI.append(", updateDate=");
        sbI.append(dateTime4);
        sbI.append(", badgeId=");
        b71.i.q(l14, ", badgeKey=", str3, ", badgeUuid=", sbI);
        n23.j.q(l15, str4, ", badgePoints=", ", badgeUnitId=", sbI);
        p6.b.l(num3, ", partnerName=", str5, ", partnerRewardUrl=", sbI);
        sn.a.t(sbI, str6, ", badgePromotionCode=", str7, ", badgePromotionCodeTypePk=");
        sbI.append(l16);
        sbI.append(", codeExpirationDate=");
        sbI.append(dateTime5);
        sbI.append(", badgeTargetValue=");
        b71.i.p(d14, d15, ", badgeProgressValue=", ", badgeEarnedDate=", sbI);
        sbI.append(dateTime6);
        sbI.append(", badgeTypeIds=");
        sbI.append(list);
        sbI.append(", userJoined=");
        kg.f.q(", urlEmbeddedSupported=", ", challengeCategoryImageId=", sbI, z14, z15);
        sbI.append(num4);
        sbI.append(", limitedCapacity=");
        sbI.append(z16);
        sbI.append(", approximateValue=");
        kg.f.r(sbI, num5, ", joinable=", bool, ", joinDateLocal=");
        sbI.append(dateTime7);
        sbI.append(", badgeTranslation=");
        sbI.append(gVar);
        sbI.append(", expeditionTranslationDTO=");
        sbI.append(oVar);
        sbI.append(", premium=");
        sbI.append(bool2);
        sbI.append(", isAutoChallengeLink=");
        sbI.append(bool3);
        sbI.append(", multiplier=");
        sbI.append(num6);
        sbI.append(", earnedMultiplier=");
        return f3.i(sbI, num7, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getBadgeUuid() {
        return this.badgeUuid;
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final String getPartnerName() {
        return this.partnerName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.uuid);
        parcel.writeString(this.badgeChallengeName);
        Integer num = this.challengeCategoryId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.badgeChallengeStatusId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeSerializable(this.startDate);
        parcel.writeSerializable(this.endDate);
        parcel.writeSerializable(this.createDate);
        parcel.writeSerializable(this.updateDate);
        Long l14 = this.badgeId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.badgeKey);
        parcel.writeString(this.badgeUuid);
        Long l15 = this.badgePoints;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Integer num3 = this.badgeUnitId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        parcel.writeString(this.partnerName);
        parcel.writeString(this.partnerRewardUrl);
        parcel.writeString(this.badgePromotionCode);
        Long l16 = this.badgePromotionCodeTypePk;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        parcel.writeSerializable(this.codeExpirationDate);
        Double d14 = this.badgeTargetValue;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.badgeProgressValue;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeSerializable(this.badgeEarnedDate);
        List<Integer> list = this.badgeTypeIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeInt(((Number) itO.next()).intValue());
            }
        }
        parcel.writeInt(this.userJoined ? 1 : 0);
        parcel.writeInt(this.urlEmbeddedSupported ? 1 : 0);
        Integer num4 = this.challengeCategoryImageId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        parcel.writeInt(this.limitedCapacity ? 1 : 0);
        Integer num5 = this.approximateValue;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        Boolean bool = this.joinable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeSerializable(this.joinDateLocal);
        parcel.writeParcelable(this.badgeTranslation, i14);
        parcel.writeParcelable(this.expeditionTranslationDTO, i14);
        Boolean bool2 = this.premium;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.isAutoChallengeLink;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Integer num6 = this.multiplier;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num6);
        }
        Integer num7 = this.earnedMultiplier;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num7);
        }
    }

    /* JADX INFO: renamed from: x0, reason: from getter */
    public final String getPartnerRewardUrl() {
        return this.partnerRewardUrl;
    }

    public final String y() {
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        if (gVar != null) {
            return gVar.f30577j;
        }
        return null;
    }

    public final String z() {
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        if (gVar != null) {
            return gVar.f30578k;
        }
        return null;
    }

    public final String z0() {
        Long l14 = this.badgeId;
        return uu.i0.b((int) (l14 != null ? l14.longValue() : 0L), this.badgeUuid);
    }

    public p(String str, String str2, Integer num, Integer num2, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, Long l14, String str3, String str4, Long l15, Integer num3, String str5, String str6, String str7, Long l16, DateTime dateTime5, Double d14, Double d15, DateTime dateTime6, List<Integer> list, boolean z14, boolean z15, Integer num4, boolean z16, Integer num5, Boolean bool, DateTime dateTime7, com.garmin.android.apps.connectmobile.badges.service.model.g gVar, com.garmin.android.apps.connectmobile.badges.service.model.o oVar, Boolean bool2, Boolean bool3, Integer num6, Integer num7) {
        this.uuid = str;
        this.badgeChallengeName = str2;
        this.challengeCategoryId = num;
        this.badgeChallengeStatusId = num2;
        this.startDate = dateTime;
        this.endDate = dateTime2;
        this.createDate = dateTime3;
        this.updateDate = dateTime4;
        this.badgeId = l14;
        this.badgeKey = str3;
        this.badgeUuid = str4;
        this.badgePoints = l15;
        this.badgeUnitId = num3;
        this.partnerName = str5;
        this.partnerRewardUrl = str6;
        this.badgePromotionCode = str7;
        this.badgePromotionCodeTypePk = l16;
        this.codeExpirationDate = dateTime5;
        this.badgeTargetValue = d14;
        this.badgeProgressValue = d15;
        this.badgeEarnedDate = dateTime6;
        this.badgeTypeIds = list;
        this.userJoined = z14;
        this.urlEmbeddedSupported = z15;
        this.challengeCategoryImageId = num4;
        this.limitedCapacity = z16;
        this.approximateValue = num5;
        this.joinable = bool;
        this.joinDateLocal = dateTime7;
        this.badgeTranslation = gVar;
        this.expeditionTranslationDTO = oVar;
        this.premium = bool2;
        this.isAutoChallengeLink = bool3;
        this.multiplier = num6;
        this.earnedMultiplier = num7;
    }

    public p() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, -1, 7, null);
    }
}
