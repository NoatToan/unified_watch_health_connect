package fg0;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.events.model.adapters.EventEnumTypeAdapter$EventTypeAdapter;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.util.adapters.LocalDateAdapter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0003\b\u0086\u0001\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B©\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\u0012\b\u0002\u0010&\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010\u0015\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\u0012\b\u0002\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0015\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010A\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bR\u0010A\u001a\u0004\bS\u0010C\"\u0004\bT\u0010ER$\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bU\u00108\u001a\u0004\bV\u0010:\"\u0004\bW\u0010<R$\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bX\u0010A\u001a\u0004\bY\u0010C\"\u0004\bZ\u0010ER$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010`\u001a\u0004\bX\u0010a\"\u0004\bb\u0010cR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bR\u0010f\"\u0004\bg\u0010hR*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u0010i\u001a\u0004\bU\u0010j\"\u0004\bk\u0010lR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR$\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010A\u001a\u0004\bs\u0010C\"\u0004\bt\u0010ER$\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bu\u00108\u001a\u0004\bv\u0010:\"\u0004\bw\u0010<R$\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bx\u0010A\u001a\u0004\by\u0010C\"\u0004\bz\u0010ER$\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b{\u0010A\u001a\u0004\b|\u0010C\"\u0004\b}\u0010ER$\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b|\u0010A\u001a\u0004\b~\u0010C\"\u0004\b\u007f\u0010ER*\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R*\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R/\u0010&\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010i\u001a\u0005\b\u0093\u0001\u0010j\"\u0005\b\u0094\u0001\u0010lR'\u0010'\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010A\u001a\u0005\b\u0095\u0001\u0010C\"\u0005\b\u0096\u0001\u0010ER(\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\bo\u0010\u0097\u0001\u001a\u0005\bx\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R*\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u0092\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010,\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u009c\u0001\u001a\u0006\b \u0001\u0010\u009d\u0001\"\u0006\b¡\u0001\u0010\u009f\u0001R*\u0010-\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010\u009c\u0001\u001a\u0006\b£\u0001\u0010\u009d\u0001\"\u0006\b¤\u0001\u0010\u009f\u0001R'\u0010.\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b¥\u0001\u0010A\u001a\u0005\b¦\u0001\u0010C\"\u0005\b§\u0001\u0010ER'\u0010/\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b¨\u0001\u0010A\u001a\u0005\b©\u0001\u0010C\"\u0005\bª\u0001\u0010ER*\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R/\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b°\u0001\u0010i\u001a\u0005\b±\u0001\u0010j\"\u0005\b²\u0001\u0010lR*\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001¨\u0006¹\u0001"}, d2 = {"Lfg0/k;", "Landroid/os/Parcelable;", "", "", TtmlNode.ATTR_ID, "groupId", "", "eventName", "nativeEventName", "nativeEventNameLang", "Lorg/joda/time/LocalDate;", "date", "url", "courseId", "courseName", "Lj61/f;", "courseProfileDTO", "Lj61/d;", "courseDemandsDTO", "Lfg0/d;", "completionTarget", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/k;", "completionTargetLegs", "Lfg0/r;", "eventTimeLocal", "note", "workoutId", "workoutName", "eventImageUUID", FirebaseAnalytics.Param.LOCATION, "Lfg0/y;", "locationStartPoint", "Lgg0/f;", "eventType", "Lfg0/c;", "eventPrivacy", "Lfg0/a0;", "eventImageURLs", "shareableEventUuid", "Lfg0/j;", "eventCustomization", "", "eventOrganizer", "race", "subscribed", "provider", "registrationUrl", "Landroid/net/Uri;", "selectedImageUrlPath", "statuses", "", "subscribersCount", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDate;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lj61/f;Lj61/d;Lfg0/d;Ljava/util/List;Lfg0/r;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg0/y;Lgg0/f;Lfg0/c;Ljava/util/List;Ljava/lang/String;Lfg0/j;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/util/List;Ljava/lang/Integer;)V", "a", "Ljava/lang/Long;", "G", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "b", "getGroupId", "setGroupId", "c", "Ljava/lang/String;", "u", "()Ljava/lang/String;", "L0", "(Ljava/lang/String;)V", "d", "getNativeEventName", "setNativeEventName", JWKParameterNames.RSA_EXPONENT, "getNativeEventNameLang", "setNativeEventNameLang", "f", "Lorg/joda/time/LocalDate;", "o", "()Lorg/joda/time/LocalDate;", "C0", "(Lorg/joda/time/LocalDate;)V", "g", "j0", "s1", "h", "j", "z0", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.OCT_KEY_VALUE, "A0", "Lj61/f;", "m", "()Lj61/f;", "setCourseProfileDTO", "(Lj61/f;)V", "Lj61/d;", "()Lj61/d;", "setCourseDemandsDTO", "(Lj61/d;)V", "l", "Lfg0/d;", "()Lfg0/d;", "w0", "(Lfg0/d;)V", "Ljava/util/List;", "()Ljava/util/List;", "x0", "(Ljava/util/List;)V", JWKParameterNames.RSA_MODULUS, "Lfg0/r;", "A", "()Lfg0/r;", "Q0", "(Lfg0/r;)V", "M", "Z0", "p", "getWorkoutId", "setWorkoutId", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getWorkoutName", "setWorkoutName", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "setEventImageUUID", "H", "S0", "v", "Lfg0/y;", "I", "()Lfg0/y;", "V0", "(Lfg0/y;)V", "w", "Lgg0/f;", "C", "()Lgg0/f;", "R0", "(Lgg0/f;)V", "x", "Lfg0/c;", "z", "()Lfg0/c;", "P0", "(Lfg0/c;)V", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "s", "J0", "f0", "h1", "Lfg0/j;", "()Lfg0/j;", "E0", "(Lfg0/j;)V", "B", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "M0", "(Ljava/lang/Boolean;)V", "a0", "c1", "D", "h0", "j1", "E", "Z", "setProvider", "F", "c0", "setRegistrationUrl", "Landroid/net/Uri;", "e0", "()Landroid/net/Uri;", "e1", "(Landroid/net/Uri;)V", "P", "g0", "setStatuses", "T", "Ljava/lang/Integer;", "i0", "()Ljava/lang/Integer;", "setSubscribersCount", "(Ljava/lang/Integer;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable, Cloneable {
    public static final Parcelable.Creator<k> CREATOR = new a();
    public static final int X = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("eventCustomization")
    private j eventCustomization;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("eventOrganizer")
    private Boolean eventOrganizer;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("race")
    private Boolean race;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("subscribed")
    private Boolean subscribed;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("provider")
    private String provider;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("registrationUrl")
    private String registrationUrl;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private Uri selectedImageUrlPath;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("statuses")
    private List<String> statuses;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("subscribersCount")
    private Integer subscribersCount;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private Long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupId")
    private Long groupId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventName")
    private String eventName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nativeEventName")
    private String nativeEventName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nativeEventNameLang")
    private String nativeEventNameLang;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("date")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate date;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("url")
    private String url;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseId")
    private Long courseId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseName")
    private String courseName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseDetailsDTO")
    private j61.f courseProfileDTO;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseDemandsDTO")
    private j61.d courseDemandsDTO;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("completionTarget")
    private d completionTarget;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("completionTargetLegs")
    private List<com.garmin.android.apps.connectmobile.workouts.data.model.k> completionTargetLegs;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventTimeLocal")
    private r eventTimeLocal;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("note")
    private String note;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutId")
    private Long workoutId;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutName")
    private String workoutName;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventImageUUID")
    private String eventImageUUID;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private String location;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locationStartPoint")
    private y locationStartPoint;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventType")
    @JsonAdapter(EventEnumTypeAdapter$EventTypeAdapter.class)
    private gg0.f eventType;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventPrivacy")
    private c eventPrivacy;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventImageURLs")
    private List<a0> eventImageURLs;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shareableEventUuid")
    private String shareableEventUuid;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            String string4 = parcel.readString();
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            j61.f fVarCreateFromParcel = parcel.readInt() == 0 ? null : j61.f.CREATOR.createFromParcel(parcel);
            j61.d dVarCreateFromParcel = parcel.readInt() == 0 ? null : j61.d.CREATOR.createFromParcel(parcel);
            d dVarCreateFromParcel2 = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            boolean z14 = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(com.garmin.android.apps.connectmobile.workouts.data.model.k.CREATOR, parcel, arrayList, iA, 1);
                    i14 = i14;
                    lValueOf = lValueOf;
                }
            }
            Long l14 = lValueOf;
            r rVarCreateFromParcel = parcel.readInt() == 0 ? null : r.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            y yVarCreateFromParcel = parcel.readInt() == 0 ? null : y.CREATOR.createFromParcel(parcel);
            gg0.f fVarValueOf = parcel.readInt() == 0 ? null : gg0.f.valueOf(parcel.readString());
            c cVarCreateFromParcel = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList;
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList4 = arrayList;
                arrayList2 = new ArrayList(i15);
                int i16 = 0;
                while (i16 != i15) {
                    arrayList2.add(parcel.readInt() == 0 ? null : a0.CREATOR.createFromParcel(parcel));
                    i16++;
                    i15 = i15;
                }
                arrayList3 = arrayList4;
            }
            String string10 = parcel.readString();
            j jVarCreateFromParcel = parcel.readInt() == 0 ? null : j.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z14);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? true : z14);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new k(l14, lValueOf2, string, string2, string3, localDate, string4, lValueOf3, string5, fVarCreateFromParcel, dVarCreateFromParcel, dVarCreateFromParcel2, arrayList3, rVarCreateFromParcel, string6, lValueOf4, string7, string8, string9, yVarCreateFromParcel, fVarValueOf, cVarCreateFromParcel, arrayList2, string10, jVarCreateFromParcel, boolValueOf, boolValueOf2, boolValueOf3, parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(k.class.getClassLoader()), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public k(Long l14, Long l15, String str, String str2, String str3, LocalDate localDate, String str4, Long l16, String str5, j61.f fVar, j61.d dVar, d dVar2, List list, r rVar, String str6, Long l17, String str7, String str8, String str9, y yVar, gg0.f fVar2, c cVar, List list2, String str10, j jVar, Boolean bool, Boolean bool2, Boolean bool3, String str11, String str12, Uri uri, List list3, Integer num, int i14, int i15, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : localDate, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : l16, (i14 & 256) != 0 ? null : str5, (i14 & 512) != 0 ? null : fVar, (i14 & 1024) != 0 ? null : dVar, (i14 & 2048) != 0 ? null : dVar2, (i14 & 4096) != 0 ? j0.f134944a : list, (i14 & 8192) != 0 ? null : rVar, (i14 & 16384) != 0 ? null : str6, (i14 & 32768) != 0 ? null : l17, (i14 & 65536) != 0 ? null : str7, (i14 & 131072) != 0 ? null : str8, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : str9, (i14 & 524288) != 0 ? null : yVar, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : fVar2, (i14 & 2097152) != 0 ? null : cVar, (i14 & 4194304) != 0 ? new ArrayList() : list2, (i14 & 8388608) != 0 ? null : str10, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : jVar, (i14 & 33554432) != 0 ? null : bool, (i14 & 67108864) != 0 ? null : bool2, (i14 & 134217728) != 0 ? null : bool3, (i14 & 268435456) != 0 ? null : str11, (i14 & 536870912) != 0 ? null : str12, (i14 & 1073741824) != 0 ? null : uri, (i14 & Integer.MIN_VALUE) != 0 ? null : list3, (i15 & 1) != 0 ? null : num);
    }

    public static k d(k kVar, Long l14, LocalDate localDate, j61.f fVar, String str, List list, String str2, j jVar, int i14) {
        Long l15 = (i14 & 1) != 0 ? kVar.id : l14;
        Long l16 = kVar.groupId;
        String str3 = kVar.eventName;
        String str4 = kVar.nativeEventName;
        String str5 = kVar.nativeEventNameLang;
        LocalDate localDate2 = (i14 & 32) != 0 ? kVar.date : localDate;
        String str6 = kVar.url;
        Long l17 = kVar.courseId;
        String str7 = kVar.courseName;
        j61.f fVar2 = (i14 & 512) != 0 ? kVar.courseProfileDTO : fVar;
        j61.d dVar = kVar.courseDemandsDTO;
        d dVar2 = kVar.completionTarget;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list2 = kVar.completionTargetLegs;
        r rVar = kVar.eventTimeLocal;
        String str8 = kVar.note;
        Long l18 = kVar.workoutId;
        String str9 = kVar.workoutName;
        String str10 = (i14 & 131072) != 0 ? kVar.eventImageUUID : str;
        String str11 = kVar.location;
        y yVar = kVar.locationStartPoint;
        gg0.f fVar3 = kVar.eventType;
        c cVar = kVar.eventPrivacy;
        List list3 = (i14 & 4194304) != 0 ? kVar.eventImageURLs : list;
        String str12 = (i14 & 8388608) != 0 ? kVar.shareableEventUuid : str2;
        j jVar2 = (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? kVar.eventCustomization : jVar;
        Boolean bool = kVar.eventOrganizer;
        Boolean bool2 = kVar.race;
        Boolean bool3 = kVar.subscribed;
        String str13 = kVar.provider;
        String str14 = kVar.registrationUrl;
        Uri uri = kVar.selectedImageUrlPath;
        List<String> list4 = kVar.statuses;
        Integer num = kVar.subscribersCount;
        kVar.getClass();
        return new k(l15, l16, str3, str4, str5, localDate2, str6, l17, str7, fVar2, dVar, dVar2, list2, rVar, str8, l18, str9, str10, str11, yVar, fVar3, cVar, list3, str12, jVar2, bool, bool2, bool3, str13, str14, uri, list4, num);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final r getEventTimeLocal() {
        return this.eventTimeLocal;
    }

    public final void A0(String str) {
        this.courseName = str;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final gg0.f getEventType() {
        return this.eventType;
    }

    public final void C0(LocalDate localDate) {
        this.date = localDate;
    }

    public final String D() {
        return c22.j0.b(c22.j0.K(String.valueOf(this.date), "yyyy-MM-dd"), "MMM dd", null);
    }

    public final void E0(j jVar) {
        this.eventCustomization = jVar;
    }

    public final String F() {
        String strB = c22.j0.b(c22.j0.K(String.valueOf(this.date), "yyyy-MM-dd"), "EEEE, MMM d", null);
        if (g22.n.d(strB) && !n0()) {
            return e5.g(r(false), " - ", strB);
        }
        String strR = r(false);
        return strR == null ? "" : strR;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final y getLocationStartPoint() {
        return this.locationStartPoint;
    }

    public final void J0(List<a0> list) {
        this.eventImageURLs = list;
    }

    public final void L0(String str) {
        this.eventName = str;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    public final void M0() {
        this.eventOrganizer = Boolean.TRUE;
    }

    public final void P0(c cVar) {
        this.eventPrivacy = cVar;
    }

    public final void Q0(r rVar) {
        this.eventTimeLocal = rVar;
    }

    public final void R0(gg0.f fVar) {
        this.eventType = fVar;
    }

    public final void S0(String str) {
        this.location = str;
    }

    public final void V0(y yVar) {
        this.locationStartPoint = yVar;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    public final void Z0(String str) {
        this.note = str;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final Boolean getRace() {
        return this.race;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k clone() {
        Object objFromJson = new Gson().fromJson(new Gson().toJson(this, k.class), (Class<Object>) k.class);
        objFromJson.getClass();
        return (k) objFromJson;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final String getRegistrationUrl() {
        return this.registrationUrl;
    }

    public final void c1(Boolean bool) {
        this.race = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final Uri getSelectedImageUrlPath() {
        return this.selectedImageUrlPath;
    }

    public final void e1(Uri uri) {
        this.selectedImageUrlPath = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!p005kotlin.jvm.internal.s.g(this.id, kVar.id) || !p005kotlin.jvm.internal.s.g(this.groupId, kVar.groupId) || !p005kotlin.jvm.internal.s.g(this.eventName, kVar.eventName) || !p005kotlin.jvm.internal.s.g(this.date, kVar.date) || !p005kotlin.jvm.internal.s.g(this.url, kVar.url) || !p005kotlin.jvm.internal.s.g(this.courseId, kVar.courseId) || !p005kotlin.jvm.internal.s.g(this.courseName, kVar.courseName) || !p005kotlin.jvm.internal.s.g(this.courseProfileDTO, kVar.courseProfileDTO) || !p005kotlin.jvm.internal.s.g(this.courseDemandsDTO, kVar.courseDemandsDTO) || !p005kotlin.jvm.internal.s.g(this.completionTarget, kVar.completionTarget) || !p005kotlin.jvm.internal.s.g(this.completionTargetLegs, kVar.completionTargetLegs) || !p005kotlin.jvm.internal.s.g(this.eventTimeLocal, kVar.eventTimeLocal) || !p005kotlin.jvm.internal.s.g(this.note, kVar.note) || !p005kotlin.jvm.internal.s.g(this.workoutId, kVar.workoutId) || !p005kotlin.jvm.internal.s.g(this.workoutName, kVar.workoutName) || !p005kotlin.jvm.internal.s.g(this.eventImageUUID, kVar.eventImageUUID) || !p005kotlin.jvm.internal.s.g(this.location, kVar.location) || !p005kotlin.jvm.internal.s.g(this.locationStartPoint, kVar.locationStartPoint) || this.eventType != kVar.eventType || !p005kotlin.jvm.internal.s.g(this.eventPrivacy, kVar.eventPrivacy)) {
            return false;
        }
        List<a0> list = this.eventImageURLs;
        boolean z14 = list == null || list.isEmpty();
        List<a0> list2 = kVar.eventImageURLs;
        return (z14 == (list2 == null || list2.isEmpty()) || p005kotlin.jvm.internal.s.g(this.eventImageURLs, kVar.eventImageURLs)) && p005kotlin.jvm.internal.s.g(this.shareableEventUuid, kVar.shareableEventUuid) && p005kotlin.jvm.internal.s.g(this.eventCustomization, kVar.eventCustomization) && p005kotlin.jvm.internal.s.g(this.eventOrganizer, kVar.eventOrganizer) && p005kotlin.jvm.internal.s.g(this.race, kVar.race) && p005kotlin.jvm.internal.s.g(this.subscribed, kVar.subscribed) && p005kotlin.jvm.internal.s.g(this.provider, kVar.provider) && p005kotlin.jvm.internal.s.g(this.registrationUrl, kVar.registrationUrl) && p005kotlin.jvm.internal.s.g(this.statuses, kVar.statuses) && p005kotlin.jvm.internal.s.g(this.subscribersCount, kVar.subscribersCount);
    }

    public final Long f() {
        j jVar = this.eventCustomization;
        if (jVar != null) {
            return jVar.getAssociatedWithActivityId();
        }
        return null;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final String getShareableEventUuid() {
        return this.shareableEventUuid;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d getCompletionTarget() {
        return this.completionTarget;
    }

    public final List<String> g0() {
        return this.statuses;
    }

    public final List<com.garmin.android.apps.connectmobile.workouts.data.model.k> h() {
        return this.completionTargetLegs;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final Boolean getSubscribed() {
        return this.subscribed;
    }

    public final void h1() {
        this.shareableEventUuid = null;
    }

    public final int hashCode() {
        Long l14 = this.id;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.groupId;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.eventName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nativeEventName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nativeEventNameLang;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LocalDate localDate = this.date;
        int iHashCode6 = (iHashCode5 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str4 = this.url;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l16 = this.courseId;
        int iHashCode8 = (iHashCode7 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str5 = this.courseName;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        j61.f fVar = this.courseProfileDTO;
        int iHashCode10 = (iHashCode9 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        j61.d dVar = this.courseDemandsDTO;
        int iHashCode11 = (iHashCode10 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.completionTarget;
        int iHashCode12 = (iHashCode11 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list = this.completionTargetLegs;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        r rVar = this.eventTimeLocal;
        int iHashCode14 = (iHashCode13 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        String str6 = this.note;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l17 = this.workoutId;
        int iHashCode16 = (iHashCode15 + (l17 == null ? 0 : l17.hashCode())) * 31;
        String str7 = this.workoutName;
        int iHashCode17 = (iHashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.eventImageUUID;
        int iHashCode18 = (iHashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.location;
        int iHashCode19 = (iHashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        y yVar = this.locationStartPoint;
        int iHashCode20 = (iHashCode19 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        gg0.f fVar2 = this.eventType;
        int iHashCode21 = (iHashCode20 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        c cVar = this.eventPrivacy;
        int iHashCode22 = (iHashCode21 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        List<a0> list2 = this.eventImageURLs;
        int iHashCode23 = (iHashCode22 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str10 = this.shareableEventUuid;
        int iHashCode24 = (iHashCode23 + (str10 == null ? 0 : str10.hashCode())) * 31;
        j jVar = this.eventCustomization;
        int iHashCode25 = (iHashCode24 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Boolean bool = this.eventOrganizer;
        int iHashCode26 = (iHashCode25 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.race;
        int iHashCode27 = (iHashCode26 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.subscribed;
        int iHashCode28 = (iHashCode27 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str11 = this.provider;
        int iHashCode29 = (iHashCode28 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.registrationUrl;
        int iHashCode30 = (iHashCode29 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Uri uri = this.selectedImageUrlPath;
        int iHashCode31 = (iHashCode30 + (uri == null ? 0 : uri.hashCode())) * 31;
        List<String> list3 = this.statuses;
        int iHashCode32 = (iHashCode31 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.subscribersCount;
        return iHashCode32 + (num != null ? num.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final j61.d getCourseDemandsDTO() {
        return this.courseDemandsDTO;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final Integer getSubscribersCount() {
        return this.subscribersCount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final void j1() {
        this.subscribed = Boolean.TRUE;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getCourseName() {
        return this.courseName;
    }

    public final boolean k0() {
        j jVar = this.eventCustomization;
        return (jVar != null ? jVar.getPredictedRaceTimeDuration() : null) != null;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final j61.f getCourseProfileDTO() {
        return this.courseProfileDTO;
    }

    public final boolean n0() {
        return p005kotlin.jvm.internal.s.g(this.eventOrganizer, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    public final boolean o0() {
        return g22.n.d(this.shareableEventUuid) && !n0();
    }

    public final boolean p0() {
        return p005kotlin.jvm.internal.s.g(this.subscribed, Boolean.TRUE) && o0();
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final j getEventCustomization() {
        return this.eventCustomization;
    }

    public final String r(boolean z14) {
        og0.a aVar = og0.a.f131967a;
        String str = this.eventName;
        String str2 = this.nativeEventName;
        String str3 = this.nativeEventNameLang;
        aVar.getClass();
        return og0.a.C(str, str2, str3, z14);
    }

    public final List<a0> s() {
        return this.eventImageURLs;
    }

    public final void s1(String str) {
        this.url = str;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getEventImageUUID() {
        return this.eventImageUUID;
    }

    public final xw1.k t1() {
        return new xw1.k(String.valueOf(this.date), this.registrationUrl, r(false), n0() ? this.id : null, p0() ? this.shareableEventUuid : null);
    }

    public final String toString() {
        Long l14 = this.id;
        Long l15 = this.groupId;
        String str = this.eventName;
        String str2 = this.nativeEventName;
        String str3 = this.nativeEventNameLang;
        LocalDate localDate = this.date;
        String str4 = this.url;
        Long l16 = this.courseId;
        String str5 = this.courseName;
        j61.f fVar = this.courseProfileDTO;
        j61.d dVar = this.courseDemandsDTO;
        d dVar2 = this.completionTarget;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list = this.completionTargetLegs;
        r rVar = this.eventTimeLocal;
        String str6 = this.note;
        Long l17 = this.workoutId;
        String str7 = this.workoutName;
        String str8 = this.eventImageUUID;
        String str9 = this.location;
        y yVar = this.locationStartPoint;
        gg0.f fVar2 = this.eventType;
        c cVar = this.eventPrivacy;
        List<a0> list2 = this.eventImageURLs;
        String str10 = this.shareableEventUuid;
        j jVar = this.eventCustomization;
        Boolean bool = this.eventOrganizer;
        Boolean bool2 = this.race;
        Boolean bool3 = this.subscribed;
        String str11 = this.provider;
        String str12 = this.registrationUrl;
        Uri uri = this.selectedImageUrlPath;
        List<String> list3 = this.statuses;
        Integer num = this.subscribersCount;
        StringBuilder sbJ = f3.j(l14, l15, "EventDTO(id=", ", groupId=", ", eventName=");
        sn.a.t(sbJ, str, ", nativeEventName=", str2, ", nativeEventNameLang=");
        sbJ.append(str3);
        sbJ.append(", date=");
        sbJ.append(localDate);
        sbJ.append(", url=");
        n23.j.q(l16, str4, ", courseId=", ", courseName=", sbJ);
        sbJ.append(str5);
        sbJ.append(", courseProfileDTO=");
        sbJ.append(fVar);
        sbJ.append(", courseDemandsDTO=");
        sbJ.append(dVar);
        sbJ.append(", completionTarget=");
        sbJ.append(dVar2);
        sbJ.append(", completionTargetLegs=");
        sbJ.append(list);
        sbJ.append(", eventTimeLocal=");
        sbJ.append(rVar);
        sbJ.append(", note=");
        n23.j.q(l17, str6, ", workoutId=", ", workoutName=", sbJ);
        sn.a.t(sbJ, str7, ", eventImageUUID=", str8, ", location=");
        sbJ.append(str9);
        sbJ.append(", locationStartPoint=");
        sbJ.append(yVar);
        sbJ.append(", eventType=");
        sbJ.append(fVar2);
        sbJ.append(", eventPrivacy=");
        sbJ.append(cVar);
        sbJ.append(", eventImageURLs=");
        o2.c.n(", shareableEventUuid=", str10, ", eventCustomization=", sbJ, list2);
        sbJ.append(jVar);
        sbJ.append(", eventOrganizer=");
        sbJ.append(bool);
        sbJ.append(", race=");
        b71.i.o(bool2, bool3, ", subscribed=", ", provider=", sbJ);
        sn.a.t(sbJ, str11, ", registrationUrl=", str12, ", selectedImageUrlPath=");
        sbJ.append(uri);
        sbJ.append(", statuses=");
        sbJ.append(list3);
        sbJ.append(", subscribersCount=");
        return f3.i(sbJ, num, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    public final vt1.n v1() {
        d dVar = this.completionTarget;
        Double dB = dVar != null ? dVar.b() : null;
        d dVar2 = this.completionTarget;
        if (dVar2 == null || !dVar2.m() || dB == null) {
            return vt1.n.OTHER;
        }
        og0.a aVar = og0.a.f131967a;
        double dDoubleValue = dB.doubleValue();
        aVar.getClass();
        return og0.a.h(dDoubleValue);
    }

    public final void w0(d dVar) {
        this.completionTarget = dVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.id;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.groupId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.eventName);
        parcel.writeString(this.nativeEventName);
        parcel.writeString(this.nativeEventNameLang);
        parcel.writeSerializable(this.date);
        parcel.writeString(this.url);
        Long l16 = this.courseId;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        parcel.writeString(this.courseName);
        j61.f fVar = this.courseProfileDTO;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        j61.d dVar = this.courseDemandsDTO;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        d dVar2 = this.completionTarget;
        if (dVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar2.writeToParcel(parcel, i14);
        }
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list = this.completionTargetLegs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((com.garmin.android.apps.connectmobile.workouts.data.model.k) itO.next()).writeToParcel(parcel, i14);
            }
        }
        r rVar = this.eventTimeLocal;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.note);
        Long l17 = this.workoutId;
        if (l17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l17);
        }
        parcel.writeString(this.workoutName);
        parcel.writeString(this.eventImageUUID);
        parcel.writeString(this.location);
        y yVar = this.locationStartPoint;
        if (yVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yVar.writeToParcel(parcel, i14);
        }
        gg0.f fVar2 = this.eventType;
        if (fVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(fVar2.name());
        }
        c cVar = this.eventPrivacy;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
        List<a0> list2 = this.eventImageURLs;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                a0 a0Var = (a0) itO2.next();
                if (a0Var == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    a0Var.writeToParcel(parcel, i14);
                }
            }
        }
        parcel.writeString(this.shareableEventUuid);
        j jVar = this.eventCustomization;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jVar.writeToParcel(parcel, i14);
        }
        Boolean bool = this.eventOrganizer;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.race;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.subscribed;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        parcel.writeString(this.provider);
        parcel.writeString(this.registrationUrl);
        parcel.writeParcelable(this.selectedImageUrlPath, i14);
        parcel.writeStringList(this.statuses);
        Integer num = this.subscribersCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public final void x0(List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list) {
        this.completionTargetLegs = list;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Boolean getEventOrganizer() {
        return this.eventOrganizer;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final c getEventPrivacy() {
        return this.eventPrivacy;
    }

    public final void z0(Long l14) {
        this.courseId = l14;
    }

    public k(Long l14, Long l15, String str, String str2, String str3, LocalDate localDate, String str4, Long l16, String str5, j61.f fVar, j61.d dVar, d dVar2, List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list, r rVar, String str6, Long l17, String str7, String str8, String str9, y yVar, gg0.f fVar2, c cVar, List<a0> list2, String str10, j jVar, Boolean bool, Boolean bool2, Boolean bool3, String str11, String str12, Uri uri, List<String> list3, Integer num) {
        this.id = l14;
        this.groupId = l15;
        this.eventName = str;
        this.nativeEventName = str2;
        this.nativeEventNameLang = str3;
        this.date = localDate;
        this.url = str4;
        this.courseId = l16;
        this.courseName = str5;
        this.courseProfileDTO = fVar;
        this.courseDemandsDTO = dVar;
        this.completionTarget = dVar2;
        this.completionTargetLegs = list;
        this.eventTimeLocal = rVar;
        this.note = str6;
        this.workoutId = l17;
        this.workoutName = str7;
        this.eventImageUUID = str8;
        this.location = str9;
        this.locationStartPoint = yVar;
        this.eventType = fVar2;
        this.eventPrivacy = cVar;
        this.eventImageURLs = list2;
        this.shareableEventUuid = str10;
        this.eventCustomization = jVar;
        this.eventOrganizer = bool;
        this.race = bool2;
        this.subscribed = bool3;
        this.provider = str11;
        this.registrationUrl = str12;
        this.selectedImageUrlPath = uri;
        this.statuses = list3;
        this.subscribersCount = num;
    }

    public k() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
    }
}
