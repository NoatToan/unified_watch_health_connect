package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bO\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/B\u009d\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00102R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010DR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u00100\u001a\u0004\bH\u00102R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u00100\u001a\u0004\bJ\u00102R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u00100\u001a\u0004\bL\u00102R\u001a\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bN\u0010OR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u00108\u001a\u0004\bQ\u0010RR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\b?\u0010YR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u00100\u001a\u0004\bA\u00102R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010X\u001a\u0004\b[\u0010YR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u00108\u001a\u0004\bP\u0010RR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u00100\u001a\u0004\bW\u00102R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\bK\u0010`R\u001c\u0010 \u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010_\u001a\u0004\bG\u0010`R\u001c\u0010!\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010<\u001a\u0004\b;\u0010>R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010T\u001a\u0004\bb\u0010VR\u001c\u0010#\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010T\u001a\u0004\ba\u0010VR\u001c\u0010$\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u00108\u001a\u0004\be\u0010RR\u001c\u0010%\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010T\u001a\u0004\bg\u0010VR\u001c\u0010&\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u00108\u001a\u0004\bi\u0010RR\u001c\u0010'\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u00108\u001a\u0004\bj\u0010RR$\u0010(\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010T\u001a\u0004\bk\u0010V\"\u0004\bl\u0010mR$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010y¨\u0006z"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "Landroid/os/Parcelable;", "", "uuid", "challengeId", "name", "", "typeId", "activityTypeId", "statusId", "Lorg/joda/time/DateTime;", "startDate", "endDate", "", "teamList", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/b0;", "playerList", "winnerProfileImageSmall", "winnerProfileUserId", "inviteId", "winnerAvatarId", "currentPlayerType", "", "allFamilyMembersAccepted", "", "badgeId", "badgeKey", "badgePoints", "badgeUnitId", "badgeUuid", "", "badgeTargetValue", "badgeProgressValue", "badgeEarnedDate", "userJoined", "joinable", "challengeCategoryId", "premium", "multiplier", "earnedMultiplier", "isAutoChallengeLink", "Lcom/garmin/android/apps/connectmobile/badges/service/model/g;", "badgeTranslation", "Lcom/garmin/android/apps/connectmobile/badges/service/model/o;", "expeditionTranslation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/garmin/android/apps/connectmobile/badges/service/model/g;Lcom/garmin/android/apps/connectmobile/badges/service/model/o;)V", "a", "Ljava/lang/String;", "H", "()Ljava/lang/String;", "b", "getChallengeId", "c", "z", "d", "Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "f", "g", "Lorg/joda/time/DateTime;", "getStartDate", "()Lorg/joda/time/DateTime;", "h", "s", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "F", "()Ljava/util/List;", "j", "A", JWKParameterNames.OCT_KEY_VALUE, "M", "l", "Z", "m", "u", JWKParameterNames.RSA_MODULUS, "I", "()I", "o", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Ljava/lang/Integer;", "p", "Ljava/lang/Boolean;", "getAllFamilyMembersAccepted", "()Ljava/lang/Boolean;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Ljava/lang/Long;", "()Ljava/lang/Long;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getBadgePoints", "v", "w", "x", "Ljava/lang/Double;", "()Ljava/lang/Double;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "getUserJoined", "B", "C", "getChallengeCategoryId", "D", "getPremium", "E", "getMultiplier", "getEarnedMultiplier", "c0", "setAutoChallengeLink", "(Ljava/lang/Boolean;)V", "P", "Lcom/garmin/android/apps/connectmobile/badges/service/model/g;", "getBadgeTranslation", "()Lcom/garmin/android/apps/connectmobile/badges/service/model/g;", "k0", "(Lcom/garmin/android/apps/connectmobile/badges/service/model/g;)V", "T", "Lcom/garmin/android/apps/connectmobile/badges/service/model/o;", "getExpeditionTranslation", "()Lcom/garmin/android/apps/connectmobile/badges/service/model/o;", "n0", "(Lcom/garmin/android/apps/connectmobile/badges/service/model/o;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 implements Parcelable {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("userJoined")
    private final Boolean userJoined;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("joinable")
    private final Boolean joinable;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("challengeCategoryId")
    private final Integer challengeCategoryId;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("premium")
    private final Boolean premium;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("multiplier")
    private final Integer multiplier;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("earnedMultiplier")
    private final Integer earnedMultiplier;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("autoChallengeLink")
    private Boolean isAutoChallengeLink;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private com.garmin.android.apps.connectmobile.badges.service.model.g badgeTranslation;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private com.garmin.android.apps.connectmobile.badges.service.model.o expeditionTranslation;
    public b12.b X;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uuid")
    private final String uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("challengeId")
    private final String challengeId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final Integer typeId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    private final Integer activityTypeId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private final Integer statusId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private final DateTime startDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private final DateTime endDate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("teamList")
    private final List<String> teamList;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("playerList")
    private final List<b0> playerList;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("winnerProfileImageSmall")
    private final String winnerProfileImageSmall;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("winnerProfileUserId")
    private final String winnerProfileUserId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inviteId")
    private final String inviteId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("winnerAvatarId")
    private final int winnerAvatarId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currentPlayerType")
    private final Integer currentPlayerType;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("allFamilyMembersAccepted")
    private final Boolean allFamilyMembersAccepted;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeId")
    private final Long badgeId;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeKey")
    private final String badgeKey;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgePoints")
    private final Long badgePoints;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeUnitId")
    private final Integer badgeUnitId;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeUuid")
    private final String badgeUuid;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeTargetValue")
    private final Double badgeTargetValue;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeProgressValue")
    private final Double badgeProgressValue;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeEarnedDate")
    @JsonAdapter(GsonUtil.LocalDateTimeTypeAdapter.class)
    private final DateTime badgeEarnedDate;
    public static final a Y = new a(null);
    public static final Parcelable.Creator<a0> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        public final a0 createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            ArrayList arrayList = null;
            Integer num = numValueOf2;
            Integer num2 = numValueOf3;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(b0.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z14 = true;
            int i15 = parcel.readInt();
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer num3 = numValueOf4;
            String string7 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string8 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z14 = false;
                }
                boolValueOf5 = Boolean.valueOf(z14);
            }
            return new a0(string, string2, string3, numValueOf, num, num2, dateTime, dateTime2, arrayListCreateStringArrayList, arrayList, string4, string5, string6, i15, num3, boolValueOf, lValueOf, string7, lValueOf2, numValueOf5, string8, dValueOf, dValueOf2, dateTime3, boolValueOf2, boolValueOf3, numValueOf6, boolValueOf4, numValueOf7, numValueOf8, boolValueOf5, (com.garmin.android.apps.connectmobile.badges.service.model.g) parcel.readParcelable(a0.class.getClassLoader()), (com.garmin.android.apps.connectmobile.badges.service.model.o) parcel.readParcelable(a0.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a0[] newArray(int i14) {
            return new a0[i14];
        }
    }

    public /* synthetic */ a0(String str, String str2, String str3, Integer num, Integer num2, Integer num3, DateTime dateTime, DateTime dateTime2, List list, List list2, String str4, String str5, String str6, int i14, Integer num4, Boolean bool, Long l14, String str7, Long l15, Integer num5, String str8, Double d14, Double d15, DateTime dateTime3, Boolean bool2, Boolean bool3, Integer num6, Boolean bool4, Integer num7, Integer num8, Boolean bool5, com.garmin.android.apps.connectmobile.badges.service.model.g gVar, com.garmin.android.apps.connectmobile.badges.service.model.o oVar, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : num, (i15 & 16) != 0 ? null : num2, (i15 & 32) != 0 ? null : num3, (i15 & 64) != 0 ? null : dateTime, (i15 & 128) != 0 ? null : dateTime2, (i15 & 256) != 0 ? null : list, (i15 & 512) != 0 ? null : list2, (i15 & 1024) != 0 ? null : str4, (i15 & 2048) != 0 ? null : str5, (i15 & 4096) != 0 ? null : str6, (i15 & 8192) != 0 ? -1 : i14, (i15 & 16384) != 0 ? null : num4, (i15 & 32768) != 0 ? null : bool, (i15 & 65536) != 0 ? null : l14, (i15 & 131072) != 0 ? null : str7, (i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : l15, (i15 & 524288) != 0 ? null : num5, (i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str8, (i15 & 2097152) != 0 ? null : d14, (i15 & 4194304) != 0 ? null : d15, (i15 & 8388608) != 0 ? null : dateTime3, (i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bool2, (i15 & 33554432) != 0 ? null : bool3, (i15 & 67108864) != 0 ? null : num6, (i15 & 134217728) != 0 ? null : bool4, (i15 & 268435456) != 0 ? null : num7, (i15 & 536870912) != 0 ? null : num8, (i15 & 1073741824) != 0 ? null : bool5, (i15 & Integer.MIN_VALUE) != 0 ? null : gVar, (i16 & 1) != 0 ? null : oVar);
    }

    public static a0 b(a0 a0Var, Boolean bool) {
        String str = a0Var.uuid;
        String str2 = a0Var.challengeId;
        String str3 = a0Var.name;
        Integer num = a0Var.typeId;
        Integer num2 = a0Var.activityTypeId;
        Integer num3 = a0Var.statusId;
        DateTime dateTime = a0Var.startDate;
        DateTime dateTime2 = a0Var.endDate;
        List<String> list = a0Var.teamList;
        List<b0> list2 = a0Var.playerList;
        String str4 = a0Var.winnerProfileImageSmall;
        String str5 = a0Var.winnerProfileUserId;
        String str6 = a0Var.inviteId;
        int i14 = a0Var.winnerAvatarId;
        Integer num4 = a0Var.currentPlayerType;
        Boolean bool2 = a0Var.allFamilyMembersAccepted;
        Long l14 = a0Var.badgeId;
        String str7 = a0Var.badgeKey;
        Long l15 = a0Var.badgePoints;
        Integer num5 = a0Var.badgeUnitId;
        String str8 = a0Var.badgeUuid;
        Double d14 = a0Var.badgeTargetValue;
        Double d15 = a0Var.badgeProgressValue;
        DateTime dateTime3 = a0Var.badgeEarnedDate;
        Boolean bool3 = a0Var.userJoined;
        Integer num6 = a0Var.challengeCategoryId;
        Boolean bool4 = a0Var.premium;
        Integer num7 = a0Var.multiplier;
        Integer num8 = a0Var.earnedMultiplier;
        Boolean bool5 = a0Var.isAutoChallengeLink;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = a0Var.badgeTranslation;
        com.garmin.android.apps.connectmobile.badges.service.model.o oVar = a0Var.expeditionTranslation;
        a0Var.getClass();
        return new a0(str, str2, str3, num, num2, num3, dateTime, dateTime2, list, list2, str4, str5, str6, i14, num4, bool2, l14, str7, l15, num5, str8, d14, d15, dateTime3, bool3, bool, num6, bool4, num7, num8, bool5, gVar, oVar);
    }

    public final List<b0> A() {
        return this.playerList;
    }

    public final String C() {
        Long l14 = this.badgeId;
        return uu.i0.b((int) (l14 != null ? l14.longValue() : 0L), this.badgeUuid);
    }

    public final v D() {
        v.a aVar = v.f38356b;
        Integer num = this.statusId;
        aVar.getClass();
        return v.a.a(num);
    }

    public final List<String> F() {
        return this.teamList;
    }

    public final w G() {
        w.a aVar = w.f38366b;
        Integer num = this.typeId;
        aVar.getClass();
        for (w wVar : w.values()) {
            int i14 = wVar.f38375a;
            if (num != null && i14 == num.intValue()) {
                return wVar;
            }
        }
        return w.UNKNOWN;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final int getWinnerAvatarId() {
        return this.winnerAvatarId;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getWinnerProfileImageSmall() {
        return this.winnerProfileImageSmall;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final String getWinnerProfileUserId() {
        return this.winnerProfileUserId;
    }

    public final boolean a0() {
        o.a aVar = o.f38245b;
        Integer num = this.challengeCategoryId;
        aVar.getClass();
        o oVarA = o.a.a(num);
        if (oVarA != null) {
            return oVarA == o.VIRTUAL_HIKE || oVarA == o.VIRTUAL_CLIMB;
        }
        return false;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final Boolean getIsAutoChallengeLink() {
        return this.isAutoChallengeLink;
    }

    public final s d() {
        Integer num = this.activityTypeId;
        if (num != null) {
            return s.b(num.intValue());
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e0() {
        return this.badgeEarnedDate != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return p005kotlin.jvm.internal.s.g(this.uuid, a0Var.uuid) && p005kotlin.jvm.internal.s.g(this.challengeId, a0Var.challengeId) && p005kotlin.jvm.internal.s.g(this.name, a0Var.name) && p005kotlin.jvm.internal.s.g(this.typeId, a0Var.typeId) && p005kotlin.jvm.internal.s.g(this.activityTypeId, a0Var.activityTypeId) && p005kotlin.jvm.internal.s.g(this.statusId, a0Var.statusId) && p005kotlin.jvm.internal.s.g(this.startDate, a0Var.startDate) && p005kotlin.jvm.internal.s.g(this.endDate, a0Var.endDate) && p005kotlin.jvm.internal.s.g(this.teamList, a0Var.teamList) && p005kotlin.jvm.internal.s.g(this.playerList, a0Var.playerList) && p005kotlin.jvm.internal.s.g(this.winnerProfileImageSmall, a0Var.winnerProfileImageSmall) && p005kotlin.jvm.internal.s.g(this.winnerProfileUserId, a0Var.winnerProfileUserId) && p005kotlin.jvm.internal.s.g(this.inviteId, a0Var.inviteId) && this.winnerAvatarId == a0Var.winnerAvatarId && p005kotlin.jvm.internal.s.g(this.currentPlayerType, a0Var.currentPlayerType) && p005kotlin.jvm.internal.s.g(this.allFamilyMembersAccepted, a0Var.allFamilyMembersAccepted) && p005kotlin.jvm.internal.s.g(this.badgeId, a0Var.badgeId) && p005kotlin.jvm.internal.s.g(this.badgeKey, a0Var.badgeKey) && p005kotlin.jvm.internal.s.g(this.badgePoints, a0Var.badgePoints) && p005kotlin.jvm.internal.s.g(this.badgeUnitId, a0Var.badgeUnitId) && p005kotlin.jvm.internal.s.g(this.badgeUuid, a0Var.badgeUuid) && p005kotlin.jvm.internal.s.g(this.badgeTargetValue, a0Var.badgeTargetValue) && p005kotlin.jvm.internal.s.g(this.badgeProgressValue, a0Var.badgeProgressValue) && p005kotlin.jvm.internal.s.g(this.badgeEarnedDate, a0Var.badgeEarnedDate) && p005kotlin.jvm.internal.s.g(this.userJoined, a0Var.userJoined) && p005kotlin.jvm.internal.s.g(this.joinable, a0Var.joinable) && p005kotlin.jvm.internal.s.g(this.challengeCategoryId, a0Var.challengeCategoryId) && p005kotlin.jvm.internal.s.g(this.premium, a0Var.premium) && p005kotlin.jvm.internal.s.g(this.multiplier, a0Var.multiplier) && p005kotlin.jvm.internal.s.g(this.earnedMultiplier, a0Var.earnedMultiplier) && p005kotlin.jvm.internal.s.g(this.isAutoChallengeLink, a0Var.isAutoChallengeLink) && p005kotlin.jvm.internal.s.g(this.badgeTranslation, a0Var.badgeTranslation) && p005kotlin.jvm.internal.s.g(this.expeditionTranslation, a0Var.expeditionTranslation);
    }

    public final r f() {
        r.a aVar = r.f38301b;
        Integer num = this.statusId;
        aVar.getClass();
        return r.a.a(num);
    }

    public final boolean f0() {
        Double d14 = this.badgeTargetValue;
        if ((d14 != null ? d14.doubleValue() : 0.0d) <= 0.0d) {
            return this.badgeEarnedDate != null;
        }
        Double d15 = this.badgeProgressValue;
        double dDoubleValue = d15 != null ? d15.doubleValue() : 0.0d;
        Double d16 = this.badgeTargetValue;
        return dDoubleValue >= (d16 != null ? d16.doubleValue() : 0.0d) || this.badgeEarnedDate != null;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DateTime getBadgeEarnedDate() {
        return this.badgeEarnedDate;
    }

    public final boolean g0() {
        g0 g0Var = g0.GUARDIAN;
        Integer num = this.currentPlayerType;
        g0Var.getClass();
        g0.f38162b.getClass();
        return g0Var == g0.a.a(num);
    }

    public final DateTime getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getBadgeId() {
        return this.badgeId;
    }

    public final boolean h0() {
        return g22.n.d(this.inviteId);
    }

    public final int hashCode() {
        String str = this.uuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.challengeId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.typeId;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.activityTypeId;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.statusId;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        DateTime dateTime = this.startDate;
        int iHashCode7 = (iHashCode6 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.endDate;
        int iHashCode8 = (iHashCode7 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        List<String> list = this.teamList;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<b0> list2 = this.playerList;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.winnerProfileImageSmall;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.winnerProfileUserId;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.inviteId;
        int iD = q2.d(this.winnerAvatarId, (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        Integer num4 = this.currentPlayerType;
        int iHashCode13 = (iD + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.allFamilyMembersAccepted;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l14 = this.badgeId;
        int iHashCode15 = (iHashCode14 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str7 = this.badgeKey;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l15 = this.badgePoints;
        int iHashCode17 = (iHashCode16 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num5 = this.badgeUnitId;
        int iHashCode18 = (iHashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str8 = this.badgeUuid;
        int iHashCode19 = (iHashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d14 = this.badgeTargetValue;
        int iHashCode20 = (iHashCode19 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.badgeProgressValue;
        int iHashCode21 = (iHashCode20 + (d15 == null ? 0 : d15.hashCode())) * 31;
        DateTime dateTime3 = this.badgeEarnedDate;
        int iHashCode22 = (iHashCode21 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        Boolean bool2 = this.userJoined;
        int iHashCode23 = (iHashCode22 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.joinable;
        int iHashCode24 = (iHashCode23 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num6 = this.challengeCategoryId;
        int iHashCode25 = (iHashCode24 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool4 = this.premium;
        int iHashCode26 = (iHashCode25 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num7 = this.multiplier;
        int iHashCode27 = (iHashCode26 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.earnedMultiplier;
        int iHashCode28 = (iHashCode27 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Boolean bool5 = this.isAutoChallengeLink;
        int iHashCode29 = (iHashCode28 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        int iHashCode30 = (iHashCode29 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.badges.service.model.o oVar = this.expeditionTranslation;
        return iHashCode30 + (oVar != null ? oVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getBadgeKey() {
        return this.badgeKey;
    }

    public final boolean i0() {
        return g22.n.d(this.inviteId) || p005kotlin.jvm.internal.s.g(this.allFamilyMembersAccepted, Boolean.FALSE);
    }

    public final String j() {
        String str;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        return (gVar == null || (str = gVar.f30568a) == null) ? fb1.c.n("badgeName_", this.badgeKey) : str;
    }

    public final boolean j0() {
        return p005kotlin.jvm.internal.s.g(this.premium, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Double getBadgeProgressValue() {
        return this.badgeProgressValue;
    }

    public final void k0(com.garmin.android.apps.connectmobile.badges.service.model.g gVar) {
        this.badgeTranslation = gVar;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getBadgeTargetValue() {
        return this.badgeTargetValue;
    }

    public final void n0(com.garmin.android.apps.connectmobile.badges.service.model.o oVar) {
        this.expeditionTranslation = oVar;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getBadgeUnitId() {
        return this.badgeUnitId;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getBadgeUuid() {
        return this.badgeUuid;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Integer getCurrentPlayerType() {
        return this.currentPlayerType;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final DateTime getEndDate() {
        return this.endDate;
    }

    public final boolean t() {
        if (j0()) {
            return false;
        }
        Boolean bool = this.userJoined;
        Boolean bool2 = Boolean.TRUE;
        if (p005kotlin.jvm.internal.s.g(bool, bool2) || this.multiplier == null) {
            return p005kotlin.jvm.internal.s.g(this.userJoined, bool2) && this.earnedMultiplier != null;
        }
        return true;
    }

    public final String toString() {
        String str = this.uuid;
        String str2 = this.challengeId;
        String str3 = this.name;
        Integer num = this.typeId;
        Integer num2 = this.activityTypeId;
        Integer num3 = this.statusId;
        DateTime dateTime = this.startDate;
        DateTime dateTime2 = this.endDate;
        List<String> list = this.teamList;
        List<b0> list2 = this.playerList;
        String str4 = this.winnerProfileImageSmall;
        String str5 = this.winnerProfileUserId;
        String str6 = this.inviteId;
        int i14 = this.winnerAvatarId;
        Integer num4 = this.currentPlayerType;
        Boolean bool = this.allFamilyMembersAccepted;
        Long l14 = this.badgeId;
        String str7 = this.badgeKey;
        Long l15 = this.badgePoints;
        Integer num5 = this.badgeUnitId;
        String str8 = this.badgeUuid;
        Double d14 = this.badgeTargetValue;
        Double d15 = this.badgeProgressValue;
        DateTime dateTime3 = this.badgeEarnedDate;
        Boolean bool2 = this.userJoined;
        Boolean bool3 = this.joinable;
        Integer num6 = this.challengeCategoryId;
        Boolean bool4 = this.premium;
        Integer num7 = this.multiplier;
        Integer num8 = this.earnedMultiplier;
        Boolean bool5 = this.isAutoChallengeLink;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVar = this.badgeTranslation;
        com.garmin.android.apps.connectmobile.badges.service.model.o oVar = this.expeditionTranslation;
        StringBuilder sbI = p6.b.i("LeaderboardChallengeDTO(uuid=", str, ", challengeId=", str2, ", name=");
        fb1.c.u(num, str3, ", typeId=", ", activityTypeId=", sbI);
        j20.x.m(sbI, num2, ", statusId=", num3, ", startDate=");
        sbI.append(dateTime);
        sbI.append(", endDate=");
        sbI.append(dateTime2);
        sbI.append(", teamList=");
        n23.j.z(sbI, list, ", playerList=", list2, ", winnerProfileImageSmall=");
        sn.a.t(sbI, str4, ", winnerProfileUserId=", str5, ", inviteId=");
        q6.f.q(i14, str6, ", winnerAvatarId=", ", currentPlayerType=", sbI);
        kg.f.r(sbI, num4, ", allFamilyMembersAccepted=", bool, ", badgeId=");
        b71.i.q(l14, ", badgeKey=", str7, ", badgePoints=", sbI);
        sbI.append(l15);
        sbI.append(", badgeUnitId=");
        sbI.append(num5);
        sbI.append(", badgeUuid=");
        b71.i.x(sbI, str8, ", badgeTargetValue=", d14, ", badgeProgressValue=");
        sbI.append(d15);
        sbI.append(", badgeEarnedDate=");
        sbI.append(dateTime3);
        sbI.append(", userJoined=");
        b71.i.o(bool2, bool3, ", joinable=", ", challengeCategoryId=", sbI);
        kg.f.r(sbI, num6, ", premium=", bool4, ", multiplier=");
        j20.x.m(sbI, num7, ", earnedMultiplier=", num8, ", isAutoChallengeLink=");
        sbI.append(bool5);
        sbI.append(", badgeTranslation=");
        sbI.append(gVar);
        sbI.append(", expeditionTranslation=");
        sbI.append(oVar);
        sbI.append(")");
        return sbI.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getInviteId() {
        return this.inviteId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.uuid);
        parcel.writeString(this.challengeId);
        parcel.writeString(this.name);
        Integer num = this.typeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.activityTypeId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.statusId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        parcel.writeSerializable(this.startDate);
        parcel.writeSerializable(this.endDate);
        parcel.writeStringList(this.teamList);
        List<b0> list = this.playerList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((b0) itO.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.winnerProfileImageSmall);
        parcel.writeString(this.winnerProfileUserId);
        parcel.writeString(this.inviteId);
        parcel.writeInt(this.winnerAvatarId);
        Integer num4 = this.currentPlayerType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Boolean bool = this.allFamilyMembersAccepted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Long l14 = this.badgeId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.badgeKey);
        Long l15 = this.badgePoints;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Integer num5 = this.badgeUnitId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        parcel.writeString(this.badgeUuid);
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
        Boolean bool2 = this.userJoined;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.joinable;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Integer num6 = this.challengeCategoryId;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num6);
        }
        Boolean bool4 = this.premium;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
        Integer num7 = this.multiplier;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num7);
        }
        Integer num8 = this.earnedMultiplier;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num8);
        }
        Boolean bool5 = this.isAutoChallengeLink;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool5);
        }
        parcel.writeParcelable(this.badgeTranslation, i14);
        parcel.writeParcelable(this.expeditionTranslation, i14);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Boolean getJoinable() {
        return this.joinable;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public a0(String str, String str2, String str3, Integer num, Integer num2, Integer num3, DateTime dateTime, DateTime dateTime2, List<String> list, List<b0> list2, String str4, String str5, String str6, int i14, Integer num4, Boolean bool, Long l14, String str7, Long l15, Integer num5, String str8, Double d14, Double d15, DateTime dateTime3, Boolean bool2, Boolean bool3, Integer num6, Boolean bool4, Integer num7, Integer num8, Boolean bool5, com.garmin.android.apps.connectmobile.badges.service.model.g gVar, com.garmin.android.apps.connectmobile.badges.service.model.o oVar) {
        this.uuid = str;
        this.challengeId = str2;
        this.name = str3;
        this.typeId = num;
        this.activityTypeId = num2;
        this.statusId = num3;
        this.startDate = dateTime;
        this.endDate = dateTime2;
        this.teamList = list;
        this.playerList = list2;
        this.winnerProfileImageSmall = str4;
        this.winnerProfileUserId = str5;
        this.inviteId = str6;
        this.winnerAvatarId = i14;
        this.currentPlayerType = num4;
        this.allFamilyMembersAccepted = bool;
        this.badgeId = l14;
        this.badgeKey = str7;
        this.badgePoints = l15;
        this.badgeUnitId = num5;
        this.badgeUuid = str8;
        this.badgeTargetValue = d14;
        this.badgeProgressValue = d15;
        this.badgeEarnedDate = dateTime3;
        this.userJoined = bool2;
        this.joinable = bool3;
        this.challengeCategoryId = num6;
        this.premium = bool4;
        this.multiplier = num7;
        this.earnedMultiplier = num8;
        this.isAutoChallengeLink = bool5;
        this.badgeTranslation = gVar;
        this.expeditionTranslation = oVar;
        this.X = b12.b.f14386g;
    }

    public a0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
    }
}
