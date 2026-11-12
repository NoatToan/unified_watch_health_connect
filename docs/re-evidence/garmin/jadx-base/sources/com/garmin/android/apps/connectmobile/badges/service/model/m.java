package com.garmin.android.apps.connectmobile.badges.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c22.j0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import r1.q2;
import uu.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b_\b\u0087\b\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u00020\u0004B\u0097\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\u0005\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0019\u0012\b\b\u0002\u0010&\u001a\u00020\u0005\u0012\b\b\u0002\u0010'\u001a\u00020\u0019\u0012\b\b\u0002\u0010(\u001a\u00020\u0005\u0012\u0012\b\u0002\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\r\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\r\u0012\b\b\u0002\u0010.\u001a\u00020\u0005\u0012\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\r\u0012\b\b\u0002\u00101\u001a\u00020\u0005\u0012\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\r\u0012\b\b\u0002\u00103\u001a\u00020\u0005\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b8\u00109R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010;\u001a\u0004\bG\u0010=R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010;\u001a\u0004\bI\u0010=R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010;\u001a\u0004\bS\u0010=R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010?\u001a\u0004\bU\u0010AR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010?\u001a\u0004\bW\u0010AR\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010;\u001a\u0004\bY\u0010=R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010?\u001a\u0004\b;\u0010AR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010?\u001a\u0004\b\\\u0010AR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010?\u001a\u0004\b^\u0010AR\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010;\u001a\u0004\b`\u0010=R\u001a\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010;\u001a\u0004\ba\u0010=R\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010;\u001a\u0004\bb\u0010=R\u001a\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001a\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010;\u001a\u0004\bh\u0010=R\"\u0010\u001c\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bi\u0010d\u001a\u0004\bj\u0010f\"\u0004\bk\u0010lR\u001a\u0010\u001e\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001a\u0010\u001f\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010n\u001a\u0004\bq\u0010pR\u001a\u0010 \u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010;\u001a\u0004\bn\u0010=R\u001a\u0010!\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\br\u0010;\u001a\u0004\bT\u0010=R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010?\u001a\u0004\bt\u0010AR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010?\u001a\u0004\bN\u0010AR\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010?\u001a\u0004\bR\u0010AR\u001a\u0010%\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010d\u001a\u0004\bv\u0010fR\u001a\u0010&\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010;\u001a\u0004\bw\u0010=R\u001a\u0010'\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010d\u001a\u0004\bx\u0010fR\u001a\u0010(\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\by\u0010;\u001a\u0004\bz\u0010=R$\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010O\u001a\u0004\b|\u0010QR\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010?\u001a\u0004\b~\u0010AR\u001d\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u007f\u0010?\u001a\u0005\b\u0080\u0001\u0010AR#\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\r\n\u0004\bd\u0010O\u001a\u0005\b\u0081\u0001\u0010QR\u001c\u0010.\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010;\u001a\u0005\b\u0082\u0001\u0010=R$\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010O\u001a\u0005\b\u0084\u0001\u0010QR\u001c\u00101\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010;\u001a\u0005\b\u0086\u0001\u0010=R$\u00102\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010O\u001a\u0005\b\u0088\u0001\u0010QR\u001b\u00103\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0089\u0001\u0010;\u001a\u0004\bd\u0010=R\u001e\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010?\u001a\u0005\b\u008b\u0001\u0010AR\u001e\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010?\u001a\u0005\b\u008d\u0001\u0010A¨\u0006\u008e\u0001"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/service/model/m;", "Le10/a;", "", "Lcom/garmin/android/apps/connectmobile/badges/service/model/g;", "Landroid/os/Parcelable;", "", "badgeId", "badgeKey", "name", "badgeUuid", "badgeCategoryId", "badgeDifficultyId", "badgePoints", "", "badgeTypes", "badgeSeriesId", "badgeStartDate", "badgeEndDate", "badgeOwnerId", "connectionFullName", "connectionDisplayName", "badgeEarnedDate", "badgeEarnedNumber", "multiplier", "earnedMultiplier", "", "isPremium", "badgeLimitCount", "isBadgeViewed", "", "badgeProgressValue", "badgeTargetValue", "badgeProgressUnitId", "assocTypeId", "badgeAssocType", "assocDataId", "assocDataName", "isBadgeEarned", "currentPlayerType", "isUserJoined", "badgeChallengeStatusId", "badgePromotionCodeTypeList", "promotionCodeStatus", "createDate", "Lcom/garmin/android/apps/connectmobile/badges/service/model/SimpleBadgeDTO;", "relatedBadges", "connectionNumber", "Lcom/garmin/android/apps/connectmobile/badges/service/model/p;", "connections", "followingNumber", "followings", "connectionUserLevel", "connectionProfileImageUrlSmall", "connectionProfileImageUrlMedium", "badgeTranslation", "description", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZIZDDIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIZILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;ILjava/util/List;ILjava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/badges/service/model/g;Ljava/lang/String;)V", "a", "I", "s", "()I", "b", "Ljava/lang/String;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "()Ljava/lang/String;", "c", "getName", "d", "getBadgeUuid", JWKParameterNames.RSA_EXPONENT, "getBadgeCategoryId", "f", "getBadgeDifficultyId", "g", "Ljava/lang/Integer;", "getBadgePoints", "()Ljava/lang/Integer;", "h", "Ljava/util/List;", "getBadgeTypes", "()Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "getBadgeSeriesId", "j", "getBadgeStartDate", JWKParameterNames.OCT_KEY_VALUE, "getBadgeEndDate", "l", "C", "m", JWKParameterNames.RSA_MODULUS, "H", "o", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "p", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getMultiplier", "c0", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Z", "x0", "()Z", "v", "z", "w", "q0", "A0", "(Z)V", "x", "D", "F", "()D", "G", "A", "B", "getBadgeAssocType", "E", "p0", "a0", "z0", "P", "getBadgeChallengeStatusId", "T", "getBadgePromotionCodeTypeList", "X", "getPromotionCodeStatus", "Y", "getCreateDate", "k0", "getConnectionNumber", "H0", "getConnections", "I0", "e0", "J0", "f0", "K0", "L0", "getConnectionProfileImageUrlSmall", "M0", "M", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements e10.a<String, g>, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("badgeAssocTypeId")
    private final int assocTypeId;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("badgeAssocType")
    private final String badgeAssocType;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("badgeAssocDataId")
    private final String assocDataId;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("badgeAssocDataName")
    private final String assocDataName;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("earnedByMe")
    private final boolean isBadgeEarned;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("currentPlayerType")
    private final int currentPlayerType;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @SerializedName("connections")
    private final List<p> connections;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("userJoined")
    private final boolean isUserJoined;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @SerializedName("followingNumber")
    private final int followingNumber;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @SerializedName("followings")
    private final List<p> followings;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @SerializedName("userLevel")
    private final int connectionUserLevel;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @SerializedName("profileImageUrlSmall")
    private final String connectionProfileImageUrlSmall;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @SerializedName("profileImageUrlMedium")
    private final String connectionProfileImageUrlMedium;
    public transient g N0;
    public final transient String O0;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("badgeChallengeStatusId")
    private final int badgeChallengeStatusId;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("badgePromotionCodeTypeList")
    private final List<Integer> badgePromotionCodeTypeList;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("promotionCodeStatus")
    private final String promotionCodeStatus;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @SerializedName("createDate")
    private final String createDate;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @SerializedName("relatedBadges")
    private final List<SimpleBadgeDTO> relatedBadges;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeId")
    private final int badgeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeKey")
    private final String badgeKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeName")
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeUuid")
    private final String badgeUuid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeCategoryId")
    private final int badgeCategoryId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeDifficultyId")
    private final int badgeDifficultyId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgePoints")
    private final Integer badgePoints;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeTypeIds")
    private final List<Integer> badgeTypes;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeSeriesId")
    private final int badgeSeriesId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeStartDate")
    private final String badgeStartDate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeEndDate")
    private final String badgeEndDate;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionNumber")
    private final int connectionNumber;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private final int badgeOwnerId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fullName")
    private final String connectionFullName;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String connectionDisplayName;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeEarnedDate")
    private final String badgeEarnedDate;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeEarnedNumber")
    private final int badgeEarnedNumber;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("multiplier")
    private final int multiplier;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("earnedMultiplier")
    private final int earnedMultiplier;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("premium")
    private final boolean isPremium;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeLimitCount")
    private final int badgeLimitCount;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeIsViewed")
    private boolean isBadgeViewed;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeProgressValue")
    private final double badgeProgressValue;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeTargetValue")
    private final double badgeTargetValue;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeUnitId")
    private final int badgeProgressUnitId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11, types: [int] */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [int] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v16, types: [int] */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v2, types: [int] */
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            String str;
            ArrayList arrayList5;
            parcel.getClass();
            int i14 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i17 = parcel.readInt();
                arrayList = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            int i19 = parcel.readInt();
            String string4 = parcel.readString();
            ArrayList arrayList6 = arrayList;
            String string5 = parcel.readString();
            int i24 = parcel.readInt();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i25 = parcel.readInt();
            int i26 = parcel.readInt();
            int i27 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z15 = false;
                z14 = true;
            } else {
                z14 = false;
                z15 = false;
            }
            int i28 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z17 = z15;
                z16 = true;
            } else {
                z16 = z15;
                z17 = z16;
            }
            double d14 = parcel.readDouble();
            double d15 = parcel.readDouble();
            boolean z24 = z17;
            int i29 = parcel.readInt();
            int i30 = parcel.readInt();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() != 0) {
                z19 = z24;
                z18 = true;
            } else {
                z18 = z24;
                z19 = z18;
            }
            int i34 = parcel.readInt();
            boolean z25 = parcel.readInt() != 0 ? true : z19;
            int i35 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i36 = parcel.readInt();
                arrayList2 = new ArrayList(i36);
                for (?? r14 = z19; r14 != i36; r14++) {
                    arrayList2.add(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                    i36 = i36;
                }
            }
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i37 = parcel.readInt();
                arrayList3 = new ArrayList(i37);
                ?? D = z19;
                while (D != i37) {
                    i37 = i37;
                    string3 = string3;
                    D = u0.d(m.class, parcel, arrayList3, D, 1);
                }
            }
            String str2 = string3;
            String str3 = string;
            int i38 = parcel.readInt();
            if (parcel.readInt() != 0) {
                int i39 = parcel.readInt();
                arrayList4 = new ArrayList(i39);
                ?? A = z19;
                while (true) {
                    str = str3;
                    if (A == i39) {
                        break;
                    }
                    str3 = str;
                    i39 = i39;
                    A = kg.f.a(p.CREATOR, parcel, arrayList4, A, 1);
                }
            } else {
                arrayList4 = null;
                str = str3;
            }
            int i44 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i45 = parcel.readInt();
                arrayList5 = new ArrayList(i45);
                ?? A2 = z19;
                while (A2 != i45) {
                    i45 = i45;
                    arrayList4 = arrayList4;
                    A2 = kg.f.a(p.CREATOR, parcel, arrayList5, A2, 1);
                }
            }
            return new m(i14, str, string2, str2, i15, i16, numValueOf, arrayList6, i19, string4, string5, i24, string6, string7, string8, i25, i26, i27, z14, i28, z16, d14, d15, i29, i30, string9, string10, string11, z18, i34, z25, i35, arrayList2, string12, string13, arrayList3, i38, arrayList4, i44, arrayList5, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30638a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.userprofile.model.k.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_PROFILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.PROFILE_FRIEND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_FRIEND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.PROFILE_THUMBNAIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_THUMBNAIL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f30638a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ m(int i14, String str, String str2, String str3, int i15, int i16, Integer num, List list, int i17, String str4, String str5, int i18, String str6, String str7, String str8, int i19, int i24, int i25, boolean z14, int i26, boolean z15, double d14, double d15, int i27, int i28, String str9, String str10, String str11, boolean z16, int i29, boolean z17, int i30, List list2, String str12, String str13, List list3, int i34, List list4, int i35, List list5, int i36, String str14, String str15, g gVar, String str16, int i37, int i38, p005kotlin.jvm.internal.j jVar) {
        int i39 = (i37 & 1) != 0 ? 0 : i14;
        this(i39, (i37 & 2) != 0 ? null : str, (i37 & 4) != 0 ? null : str2, (i37 & 8) != 0 ? null : str3, (i37 & 16) != 0 ? 0 : i15, (i37 & 32) != 0 ? 0 : i16, (i37 & 64) != 0 ? null : num, (i37 & 128) != 0 ? null : list, (i37 & 256) != 0 ? 0 : i17, (i37 & 512) != 0 ? null : str4, (i37 & 1024) != 0 ? null : str5, (i37 & 2048) != 0 ? 0 : i18, (i37 & 4096) != 0 ? null : str6, (i37 & 8192) != 0 ? null : str7, (i37 & 16384) != 0 ? null : str8, (i37 & 32768) != 0 ? 0 : i19, (i37 & 65536) != 0 ? 0 : i24, (i37 & 131072) != 0 ? 0 : i25, (i37 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? false : z14, (i37 & 524288) != 0 ? 0 : i26, (i37 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? false : z15, (i37 & 2097152) != 0 ? 0.0d : d14, (i37 & 4194304) == 0 ? d15 : 0.0d, (i37 & 8388608) != 0 ? 0 : i27, (i37 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? 0 : i28, (i37 & 33554432) != 0 ? null : str9, (i37 & 67108864) != 0 ? null : str10, (i37 & 134217728) != 0 ? null : str11, (i37 & 268435456) != 0 ? false : z16, (i37 & 536870912) != 0 ? 0 : i29, (i37 & 1073741824) != 0 ? false : z17, (i37 & Integer.MIN_VALUE) != 0 ? 0 : i30, (i38 & 1) != 0 ? null : list2, (i38 & 2) != 0 ? null : str12, (i38 & 4) != 0 ? null : str13, (i38 & 8) != 0 ? null : list3, (i38 & 16) != 0 ? 0 : i34, (i38 & 32) != 0 ? null : list4, (i38 & 64) != 0 ? 0 : i35, (i38 & 128) != 0 ? null : list5, (i38 & 256) != 0 ? 0 : i36, (i38 & 512) != 0 ? null : str14, (i38 & 1024) != 0 ? null : str15, (i38 & 2048) != 0 ? null : gVar, (i38 & 4096) != 0 ? null : str16);
    }

    public static m d(m mVar, ArrayList arrayList, String str, int i14) {
        int i15 = mVar.badgeId;
        String str2 = mVar.badgeKey;
        String str3 = mVar.name;
        String str4 = mVar.badgeUuid;
        int i16 = mVar.badgeCategoryId;
        int i17 = mVar.badgeDifficultyId;
        Integer num = mVar.badgePoints;
        List<Integer> list = mVar.badgeTypes;
        int i18 = mVar.badgeSeriesId;
        String str5 = mVar.badgeStartDate;
        String str6 = mVar.badgeEndDate;
        int i19 = mVar.badgeOwnerId;
        String str7 = mVar.connectionFullName;
        String str8 = mVar.connectionDisplayName;
        String str9 = mVar.badgeEarnedDate;
        int i24 = mVar.badgeEarnedNumber;
        int i25 = mVar.multiplier;
        int i26 = mVar.earnedMultiplier;
        boolean z14 = mVar.isPremium;
        int i27 = mVar.badgeLimitCount;
        boolean z15 = mVar.isBadgeViewed;
        double d14 = mVar.badgeProgressValue;
        double d15 = mVar.badgeTargetValue;
        int i28 = mVar.badgeProgressUnitId;
        int i29 = mVar.assocTypeId;
        String str10 = mVar.badgeAssocType;
        String str11 = mVar.assocDataId;
        String str12 = mVar.assocDataName;
        boolean z16 = mVar.isBadgeEarned;
        int i30 = mVar.currentPlayerType;
        boolean z17 = mVar.isUserJoined;
        int i34 = mVar.badgeChallengeStatusId;
        List<Integer> list2 = mVar.badgePromotionCodeTypeList;
        String str13 = mVar.promotionCodeStatus;
        String str14 = mVar.createDate;
        List<SimpleBadgeDTO> list3 = mVar.relatedBadges;
        int i35 = mVar.connectionNumber;
        List<p> list4 = mVar.connections;
        int i36 = mVar.followingNumber;
        List<p> list5 = arrayList;
        if ((i14 & 128) != 0) {
            list5 = mVar.followings;
        }
        int i37 = mVar.connectionUserLevel;
        String str15 = (i14 & 512) != 0 ? mVar.connectionProfileImageUrlSmall : str;
        String str16 = mVar.connectionProfileImageUrlMedium;
        g gVar = mVar.N0;
        String str17 = mVar.O0;
        mVar.getClass();
        return new m(i15, str2, str3, str4, i16, i17, num, list, i18, str5, str6, i19, str7, str8, str9, i24, i25, i26, z14, i27, z15, d14, d15, i28, i29, str10, str11, str12, z16, i30, z17, i34, list2, str13, str14, list3, i35, list4, i36, list5, i37, str15, str16, gVar, str17);
    }

    public final String A() {
        g gVar = this.N0;
        String str = null;
        if (gVar != null && gVar != null) {
            str = gVar.f30568a;
        }
        if (TextUtils.isEmpty(str)) {
            return !TextUtils.isEmpty(this.name) ? this.name : fb1.c.n("name_", this.badgeKey);
        }
        return str;
    }

    public final void A0() {
        this.isBadgeViewed = true;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final int getBadgeOwnerId() {
        return this.badgeOwnerId;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final int getBadgeProgressUnitId() {
        return this.badgeProgressUnitId;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final double getBadgeProgressValue() {
        return this.badgeProgressValue;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final double getBadgeTargetValue() {
        return this.badgeTargetValue;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getConnectionDisplayName() {
        return this.connectionDisplayName;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getConnectionFullName() {
        return this.connectionFullName;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getConnectionProfileImageUrlMedium() {
        return this.connectionProfileImageUrlMedium;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final int getConnectionUserLevel() {
        return this.connectionUserLevel;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final int getCurrentPlayerType() {
        return this.currentPlayerType;
    }

    public final boolean b(j jVar) {
        j jVar2;
        List<Integer> list = this.badgeTypes;
        if (jVar != null && list != null) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                j[] jVarArrValues = j.values();
                int length = jVarArrValues.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        jVar2 = null;
                        break;
                    }
                    jVar2 = jVarArrValues[i14];
                    if (jVar2.f30596a == iIntValue) {
                        break;
                    }
                    i14++;
                }
                if (jVar == jVar2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final int getEarnedMultiplier() {
        return this.earnedMultiplier;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final int getFollowingNumber() {
        return this.followingNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.badgeId == mVar.badgeId && p005kotlin.jvm.internal.s.g(this.badgeKey, mVar.badgeKey) && p005kotlin.jvm.internal.s.g(this.name, mVar.name) && p005kotlin.jvm.internal.s.g(this.badgeUuid, mVar.badgeUuid) && this.badgeCategoryId == mVar.badgeCategoryId && this.badgeDifficultyId == mVar.badgeDifficultyId && p005kotlin.jvm.internal.s.g(this.badgePoints, mVar.badgePoints) && p005kotlin.jvm.internal.s.g(this.badgeTypes, mVar.badgeTypes) && this.badgeSeriesId == mVar.badgeSeriesId && p005kotlin.jvm.internal.s.g(this.badgeStartDate, mVar.badgeStartDate) && p005kotlin.jvm.internal.s.g(this.badgeEndDate, mVar.badgeEndDate) && this.badgeOwnerId == mVar.badgeOwnerId && p005kotlin.jvm.internal.s.g(this.connectionFullName, mVar.connectionFullName) && p005kotlin.jvm.internal.s.g(this.connectionDisplayName, mVar.connectionDisplayName) && p005kotlin.jvm.internal.s.g(this.badgeEarnedDate, mVar.badgeEarnedDate) && this.badgeEarnedNumber == mVar.badgeEarnedNumber && this.multiplier == mVar.multiplier && this.earnedMultiplier == mVar.earnedMultiplier && this.isPremium == mVar.isPremium && this.badgeLimitCount == mVar.badgeLimitCount && this.isBadgeViewed == mVar.isBadgeViewed && Double.compare(this.badgeProgressValue, mVar.badgeProgressValue) == 0 && Double.compare(this.badgeTargetValue, mVar.badgeTargetValue) == 0 && this.badgeProgressUnitId == mVar.badgeProgressUnitId && this.assocTypeId == mVar.assocTypeId && p005kotlin.jvm.internal.s.g(this.badgeAssocType, mVar.badgeAssocType) && p005kotlin.jvm.internal.s.g(this.assocDataId, mVar.assocDataId) && p005kotlin.jvm.internal.s.g(this.assocDataName, mVar.assocDataName) && this.isBadgeEarned == mVar.isBadgeEarned && this.currentPlayerType == mVar.currentPlayerType && this.isUserJoined == mVar.isUserJoined && this.badgeChallengeStatusId == mVar.badgeChallengeStatusId && p005kotlin.jvm.internal.s.g(this.badgePromotionCodeTypeList, mVar.badgePromotionCodeTypeList) && p005kotlin.jvm.internal.s.g(this.promotionCodeStatus, mVar.promotionCodeStatus) && p005kotlin.jvm.internal.s.g(this.createDate, mVar.createDate) && p005kotlin.jvm.internal.s.g(this.relatedBadges, mVar.relatedBadges) && this.connectionNumber == mVar.connectionNumber && p005kotlin.jvm.internal.s.g(this.connections, mVar.connections) && this.followingNumber == mVar.followingNumber && p005kotlin.jvm.internal.s.g(this.followings, mVar.followings) && this.connectionUserLevel == mVar.connectionUserLevel && p005kotlin.jvm.internal.s.g(this.connectionProfileImageUrlSmall, mVar.connectionProfileImageUrlSmall) && p005kotlin.jvm.internal.s.g(this.connectionProfileImageUrlMedium, mVar.connectionProfileImageUrlMedium) && p005kotlin.jvm.internal.s.g(this.N0, mVar.N0) && p005kotlin.jvm.internal.s.g(this.O0, mVar.O0);
    }

    @Override // e10.a
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getBadgeKey() {
        return this.badgeKey;
    }

    public final List<p> f0() {
        return this.followings;
    }

    @Override // e10.a
    public final void g(g gVar) {
        this.N0 = gVar;
    }

    public final int g0() {
        if (this.isPremium) {
            return 1;
        }
        return this.isUserJoined ? this.earnedMultiplier : this.multiplier;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getAssocDataId() {
        return this.assocDataId;
    }

    public final DateTime h0() {
        return j0.N(this.badgeEarnedDate, true);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.badgeId) * 31;
        String str = this.badgeKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.badgeUuid;
        int iD = q2.d(this.badgeDifficultyId, q2.d(this.badgeCategoryId, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        Integer num = this.badgePoints;
        int iHashCode4 = (iD + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.badgeTypes;
        int iD2 = q2.d(this.badgeSeriesId, (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31, 31);
        String str4 = this.badgeStartDate;
        int iHashCode5 = (iD2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.badgeEndDate;
        int iD3 = q2.d(this.badgeOwnerId, (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.connectionFullName;
        int iHashCode6 = (iD3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.connectionDisplayName;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.badgeEarnedDate;
        int iD4 = q2.d(this.assocTypeId, q2.d(this.badgeProgressUnitId, org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(q6.f.g(q2.d(this.badgeLimitCount, q6.f.g(q2.d(this.earnedMultiplier, q2.d(this.multiplier, q2.d(this.badgeEarnedNumber, (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31, 31), 31), 31), 31, this.isPremium), 31), 31, this.isBadgeViewed), 31, this.badgeProgressValue), 31, this.badgeTargetValue), 31), 31);
        String str9 = this.badgeAssocType;
        int iHashCode8 = (iD4 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.assocDataId;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.assocDataName;
        int iD5 = q2.d(this.badgeChallengeStatusId, q6.f.g(q2.d(this.currentPlayerType, q6.f.g((iHashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31, 31, this.isBadgeEarned), 31), 31, this.isUserJoined), 31);
        List<Integer> list2 = this.badgePromotionCodeTypeList;
        int iHashCode10 = (iD5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str12 = this.promotionCodeStatus;
        int iHashCode11 = (iHashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.createDate;
        int iHashCode12 = (iHashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List<SimpleBadgeDTO> list3 = this.relatedBadges;
        int iD6 = q2.d(this.connectionNumber, (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31, 31);
        List<p> list4 = this.connections;
        int iD7 = q2.d(this.followingNumber, (iD6 + (list4 == null ? 0 : list4.hashCode())) * 31, 31);
        List<p> list5 = this.followings;
        int iD8 = q2.d(this.connectionUserLevel, (iD7 + (list5 == null ? 0 : list5.hashCode())) * 31, 31);
        String str14 = this.connectionProfileImageUrlSmall;
        int iHashCode13 = (iD8 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.connectionProfileImageUrlMedium;
        int iHashCode14 = (iHashCode13 + (str15 == null ? 0 : str15.hashCode())) * 31;
        g gVar = this.N0;
        int iHashCode15 = (iHashCode14 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str16 = this.O0;
        return iHashCode15 + (str16 != null ? str16.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getAssocDataName() {
        return this.assocDataName;
    }

    public final DateTime i0() {
        return j0.N(this.badgeEndDate, true);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getAssocTypeId() {
        return this.assocTypeId;
    }

    public final DateTime j0() {
        return j0.N(this.badgeStartDate, true);
    }

    public final com.garmin.android.apps.connectmobile.leaderboard.model.r k() {
        com.garmin.android.apps.connectmobile.leaderboard.model.r.a aVar = com.garmin.android.apps.connectmobile.leaderboard.model.r.f38301b;
        Integer numValueOf = Integer.valueOf(this.badgeChallengeStatusId);
        aVar.getClass();
        return com.garmin.android.apps.connectmobile.leaderboard.model.r.a.a(numValueOf);
    }

    public final List<SimpleBadgeDTO> k0() {
        return this.relatedBadges;
    }

    public final String m() {
        g gVar = this.N0;
        String str = null;
        if (gVar != null && gVar != null) {
            str = gVar.f30571d;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = this.O0;
        return !TextUtils.isEmpty(str2) ? str2 : fb1.c.n("description_", this.badgeKey);
    }

    public final b12.b n0(com.garmin.android.apps.connectmobile.userprofile.model.k kVar, int i14) {
        String str;
        kVar.getClass();
        f12.u uVarA = f12.u.a(i14);
        switch (b.f30638a[kVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                str = this.connectionProfileImageUrlMedium;
                break;
            case 4:
            case 5:
            case 6:
                str = this.connectionProfileImageUrlMedium;
                break;
            case 7:
            case 8:
            case 9:
                str = this.connectionProfileImageUrlSmall;
                break;
            default:
                str = this.connectionProfileImageUrlMedium;
                break;
        }
        return new b12.b(str, null, uVarA, null, null, 24, null);
    }

    public final d o() {
        d dVarA = d.a(this.badgeDifficultyId);
        dVarA.getClass();
        return dVarA;
    }

    public final boolean o0() {
        boolean zW0;
        if (!this.isPremium) {
            if (this.isUserJoined) {
                zW0 = w0();
            } else {
                zW0 = this.multiplier > 1;
            }
            if (zW0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final boolean getIsBadgeEarned() {
        return this.isBadgeEarned;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getBadgeEarnedDate() {
        return this.badgeEarnedDate;
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final boolean getIsBadgeViewed() {
        return this.isBadgeViewed;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getBadgeEarnedNumber() {
        return this.badgeEarnedNumber;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getBadgeId() {
        return this.badgeId;
    }

    public final String t() {
        return i0.b(this.badgeId, this.badgeUuid);
    }

    public final String toString() {
        int i14 = this.badgeId;
        String str = this.badgeKey;
        String str2 = this.name;
        String str3 = this.badgeUuid;
        int i15 = this.badgeCategoryId;
        int i16 = this.badgeDifficultyId;
        Integer num = this.badgePoints;
        List<Integer> list = this.badgeTypes;
        int i17 = this.badgeSeriesId;
        String str4 = this.badgeStartDate;
        String str5 = this.badgeEndDate;
        int i18 = this.badgeOwnerId;
        String str6 = this.connectionFullName;
        String str7 = this.connectionDisplayName;
        String str8 = this.badgeEarnedDate;
        int i19 = this.badgeEarnedNumber;
        int i24 = this.multiplier;
        int i25 = this.earnedMultiplier;
        boolean z14 = this.isPremium;
        int i26 = this.badgeLimitCount;
        boolean z15 = this.isBadgeViewed;
        double d14 = this.badgeProgressValue;
        double d15 = this.badgeTargetValue;
        int i27 = this.badgeProgressUnitId;
        int i28 = this.assocTypeId;
        String str9 = this.badgeAssocType;
        String str10 = this.assocDataId;
        String str11 = this.assocDataName;
        boolean z16 = this.isBadgeEarned;
        int i29 = this.currentPlayerType;
        boolean z17 = this.isUserJoined;
        int i30 = this.badgeChallengeStatusId;
        List<Integer> list2 = this.badgePromotionCodeTypeList;
        String str12 = this.promotionCodeStatus;
        String str13 = this.createDate;
        List<SimpleBadgeDTO> list3 = this.relatedBadges;
        int i34 = this.connectionNumber;
        List<p> list4 = this.connections;
        int i35 = this.followingNumber;
        List<p> list5 = this.followings;
        int i36 = this.connectionUserLevel;
        String str14 = this.connectionProfileImageUrlSmall;
        String str15 = this.connectionProfileImageUrlMedium;
        g gVar = this.N0;
        StringBuilder sbR = wr.g.r(i14, "DetailedBadgeDTO(badgeId=", ", badgeKey=", str, ", name=");
        sn.a.t(sbR, str2, ", badgeUuid=", str3, ", badgeCategoryId=");
        e0.m(i15, i16, ", badgeDifficultyId=", ", badgePoints=", sbR);
        sbR.append(num);
        sbR.append(", badgeTypes=");
        sbR.append(list);
        sbR.append(", badgeSeriesId=");
        wr.g.t(i17, ", badgeStartDate=", str4, ", badgeEndDate=", sbR);
        q6.f.q(i18, str5, ", badgeOwnerId=", ", connectionFullName=", sbR);
        sn.a.t(sbR, str6, ", connectionDisplayName=", str7, ", badgeEarnedDate=");
        q6.f.q(i19, str8, ", badgeEarnedNumber=", ", multiplier=", sbR);
        e0.m(i24, i25, ", earnedMultiplier=", ", isPremium=", sbR);
        sbR.append(z14);
        sbR.append(", badgeLimitCount=");
        sbR.append(i26);
        sbR.append(", isBadgeViewed=");
        sbR.append(z15);
        sbR.append(", badgeProgressValue=");
        sbR.append(d14);
        am.j.x(sbR, ", badgeTargetValue=", d15, ", badgeProgressUnitId=");
        e0.m(i27, i28, ", assocTypeId=", ", badgeAssocType=", sbR);
        sn.a.t(sbR, str9, ", assocDataId=", str10, ", assocDataName=");
        v.h.C(str11, ", isBadgeEarned=", ", currentPlayerType=", sbR, z16);
        fb1.c.x(sbR, i29, ", isUserJoined=", z17, ", badgeChallengeStatusId=");
        sbR.append(i30);
        sbR.append(", badgePromotionCodeTypeList=");
        sbR.append(list2);
        sbR.append(", promotionCodeStatus=");
        sn.a.t(sbR, str12, ", createDate=", str13, ", relatedBadges=");
        sbR.append(list3);
        sbR.append(", connectionNumber=");
        sbR.append(i34);
        sbR.append(", connections=");
        sbR.append(list4);
        sbR.append(", followingNumber=");
        sbR.append(i35);
        sbR.append(", followings=");
        sbR.append(list5);
        sbR.append(", connectionUserLevel=");
        sbR.append(i36);
        sbR.append(", connectionProfileImageUrlSmall=");
        sn.a.t(sbR, str14, ", connectionProfileImageUrlMedium=", str15, ", badgeTranslation=");
        sbR.append(gVar);
        sbR.append(", description=");
        sbR.append(this.O0);
        sbR.append(")");
        return sbR.toString();
    }

    public final String u() {
        return i0.c(this.badgeId, this.badgeUuid, i0.g(), false);
    }

    public final boolean w0() {
        return this.earnedMultiplier > 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.badgeId);
        parcel.writeString(this.badgeKey);
        parcel.writeString(this.name);
        parcel.writeString(this.badgeUuid);
        parcel.writeInt(this.badgeCategoryId);
        parcel.writeInt(this.badgeDifficultyId);
        Integer num = this.badgePoints;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        List<Integer> list = this.badgeTypes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeInt(((Number) itO.next()).intValue());
            }
        }
        parcel.writeInt(this.badgeSeriesId);
        parcel.writeString(this.badgeStartDate);
        parcel.writeString(this.badgeEndDate);
        parcel.writeInt(this.badgeOwnerId);
        parcel.writeString(this.connectionFullName);
        parcel.writeString(this.connectionDisplayName);
        parcel.writeString(this.badgeEarnedDate);
        parcel.writeInt(this.badgeEarnedNumber);
        parcel.writeInt(this.multiplier);
        parcel.writeInt(this.earnedMultiplier);
        parcel.writeInt(this.isPremium ? 1 : 0);
        parcel.writeInt(this.badgeLimitCount);
        parcel.writeInt(this.isBadgeViewed ? 1 : 0);
        parcel.writeDouble(this.badgeProgressValue);
        parcel.writeDouble(this.badgeTargetValue);
        parcel.writeInt(this.badgeProgressUnitId);
        parcel.writeInt(this.assocTypeId);
        parcel.writeString(this.badgeAssocType);
        parcel.writeString(this.assocDataId);
        parcel.writeString(this.assocDataName);
        parcel.writeInt(this.isBadgeEarned ? 1 : 0);
        parcel.writeInt(this.currentPlayerType);
        parcel.writeInt(this.isUserJoined ? 1 : 0);
        parcel.writeInt(this.badgeChallengeStatusId);
        List<Integer> list2 = this.badgePromotionCodeTypeList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                Integer num2 = (Integer) itO2.next();
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    kg.f.k(parcel, 1, num2);
                }
            }
        }
        parcel.writeString(this.promotionCodeStatus);
        parcel.writeString(this.createDate);
        List<SimpleBadgeDTO> list3 = this.relatedBadges;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                parcel.writeParcelable((Parcelable) itO3.next(), i14);
            }
        }
        parcel.writeInt(this.connectionNumber);
        List<p> list4 = this.connections;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO4 = u0.o(parcel, list4, 1);
            while (itO4.hasNext()) {
                ((p) itO4.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeInt(this.followingNumber);
        List<p> list5 = this.followings;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO5 = u0.o(parcel, list5, 1);
            while (itO5.hasNext()) {
                ((p) itO5.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeInt(this.connectionUserLevel);
        parcel.writeString(this.connectionProfileImageUrlSmall);
        parcel.writeString(this.connectionProfileImageUrlMedium);
        g gVar = this.N0;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.O0);
    }

    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getIsPremium() {
        return this.isPremium;
    }

    public final String y() {
        return this.badgeKey;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final int getBadgeLimitCount() {
        return this.badgeLimitCount;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final boolean getIsUserJoined() {
        return this.isUserJoined;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(int i14, String str, String str2, String str3, int i15, int i16, Integer num, List<Integer> list, int i17, String str4, String str5, int i18, String str6, String str7, String str8, int i19, int i24, int i25, boolean z14, int i26, boolean z15, double d14, double d15, int i27, int i28, String str9, String str10, String str11, boolean z16, int i29, boolean z17, int i30, List<Integer> list2, String str12, String str13, List<? extends SimpleBadgeDTO> list3, int i34, List<p> list4, int i35, List<p> list5, int i36, String str14, String str15, g gVar, String str16) {
        this.badgeId = i14;
        this.badgeKey = str;
        this.name = str2;
        this.badgeUuid = str3;
        this.badgeCategoryId = i15;
        this.badgeDifficultyId = i16;
        this.badgePoints = num;
        this.badgeTypes = list;
        this.badgeSeriesId = i17;
        this.badgeStartDate = str4;
        this.badgeEndDate = str5;
        this.badgeOwnerId = i18;
        this.connectionFullName = str6;
        this.connectionDisplayName = str7;
        this.badgeEarnedDate = str8;
        this.badgeEarnedNumber = i19;
        this.multiplier = i24;
        this.earnedMultiplier = i25;
        this.isPremium = z14;
        this.badgeLimitCount = i26;
        this.isBadgeViewed = z15;
        this.badgeProgressValue = d14;
        this.badgeTargetValue = d15;
        this.badgeProgressUnitId = i27;
        this.assocTypeId = i28;
        this.badgeAssocType = str9;
        this.assocDataId = str10;
        this.assocDataName = str11;
        this.isBadgeEarned = z16;
        this.currentPlayerType = i29;
        this.isUserJoined = z17;
        this.badgeChallengeStatusId = i30;
        this.badgePromotionCodeTypeList = list2;
        this.promotionCodeStatus = str12;
        this.createDate = str13;
        this.relatedBadges = list3;
        this.connectionNumber = i34;
        this.connections = list4;
        this.followingNumber = i35;
        this.followings = list5;
        this.connectionUserLevel = i36;
        this.connectionProfileImageUrlSmall = str14;
        this.connectionProfileImageUrlMedium = str15;
        this.N0 = gVar;
        this.O0 = str16;
    }

    public m() {
        this(0, null, null, null, 0, 0, null, null, 0, null, null, 0, null, null, null, 0, 0, 0, false, 0, false, 0.0d, 0.0d, 0, 0, null, null, null, false, 0, false, 0, null, null, null, null, 0, null, 0, null, 0, null, null, null, null, -1, 8191, null);
    }
}
