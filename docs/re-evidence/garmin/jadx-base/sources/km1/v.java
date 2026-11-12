package km1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.courses.biz.gson.DoubleTypeAdapter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b\u0091\u0001\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;B\u0089\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010#\u001a\u00020\n\u0012\b\b\u0002\u0010$\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000100\u0012\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010<\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010E\u001a\u0004\bZ\u0010G\"\u0004\b[\u0010IR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u0010<\u001a\u0004\b]\u0010>\"\u0004\b^\u0010@R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010<\u001a\u0004\b`\u0010>\"\u0004\ba\u0010@R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bb\u0010<\u001a\u0004\bc\u0010>\"\u0004\bd\u0010@R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\be\u0010<\u001a\u0004\bT\u0010>\"\u0004\bf\u0010@R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bS\u0010i\"\u0004\bj\u0010kR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bl\u0010h\u001a\u0004\bJ\u0010i\"\u0004\bm\u0010kR$\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bn\u0010E\u001a\u0004\bo\u0010G\"\u0004\bp\u0010IR$\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bq\u0010E\u001a\u0004\br\u0010G\"\u0004\bs\u0010IR\"\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bt\u0010K\u001a\u0004\bu\u0010M\"\u0004\bv\u0010OR\"\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010K\u001a\u0004\bw\u0010M\"\u0004\bx\u0010OR\"\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\by\u0010K\u001a\u0004\bz\u0010M\"\u0004\b{\u0010OR\"\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b|\u0010K\u001a\u0004\b}\u0010M\"\u0004\b~\u0010OR#\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\b\u007f\u0010K\u001a\u0004\bl\u0010M\"\u0005\b\u0080\u0001\u0010OR)\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\be\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R)\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\bb\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R)\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u0082\u0001\u001a\u0005\b\\\u0010\u0083\u0001\"\u0006\b\u008c\u0001\u0010\u0085\u0001R*\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u0082\u0001\u001a\u0006\b\u008e\u0001\u0010\u0083\u0001\"\u0006\b\u008f\u0001\u0010\u0085\u0001R)\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\b=\u0010\u0082\u0001\u001a\u0006\b\u0090\u0001\u0010\u0083\u0001\"\u0006\b\u0091\u0001\u0010\u0085\u0001R*\u0010 \u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0082\u0001\u001a\u0006\b\u0093\u0001\u0010\u0083\u0001\"\u0006\b\u0094\u0001\u0010\u0085\u0001R\u001e\u0010!\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bz\u0010\u0087\u0001\u001a\u0005\b_\u0010\u0088\u0001R*\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0082\u0001\u001a\u0006\b\u0096\u0001\u0010\u0083\u0001\"\u0006\b\u0097\u0001\u0010\u0085\u0001R%\u0010#\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010T\u001a\u0005\b\u008b\u0001\u0010V\"\u0005\b\u0099\u0001\u0010XR%\u0010$\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010T\u001a\u0005\b\u009a\u0001\u0010V\"\u0005\b\u009b\u0001\u0010XR)\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\bK\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R'\u0010'\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b¡\u0001\u0010E\u001a\u0005\b¢\u0001\u0010G\"\u0005\b£\u0001\u0010IR'\u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b¤\u0001\u0010E\u001a\u0005\b¥\u0001\u0010G\"\u0005\b¦\u0001\u0010IR'\u0010)\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b§\u0001\u0010E\u001a\u0005\b¨\u0001\u0010G\"\u0005\b©\u0001\u0010IR*\u0010*\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\bª\u0001\u0010\u0082\u0001\u001a\u0006\b«\u0001\u0010\u0083\u0001\"\u0006\b¬\u0001\u0010\u0085\u0001R&\u0010+\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bT\u0010E\u001a\u0005\b\u00ad\u0001\u0010G\"\u0005\b®\u0001\u0010IR*\u0010,\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R)\u0010-\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0006\bµ\u0001\u0010\u0087\u0001\u001a\u0005\bY\u0010\u0088\u0001\"\u0006\b¶\u0001\u0010\u008a\u0001R*\u0010.\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010\u0087\u0001\u001a\u0006\b\u0095\u0001\u0010\u0088\u0001\"\u0006\b¸\u0001\u0010\u008a\u0001R*\u0010/\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010\u0087\u0001\u001a\u0006\b\u008d\u0001\u0010\u0088\u0001\"\u0006\bº\u0001\u0010\u008a\u0001R \u00101\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R \u00102\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¿\u0001\u0010¼\u0001\u001a\u0006\bÀ\u0001\u0010¾\u0001R%\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0005\b|\u0010Ã\u0001R\u001d\u00106\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\r\n\u0005\bÄ\u0001\u0010E\u001a\u0004\bq\u0010GR\u001f\u00108\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0005\bK\u0010Ç\u0001¨\u0006È\u0001"}, d2 = {"Lkm1/v;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "userProfilePK", "", "calendarDate", "", "sleepTimeSeconds", "napTimeSeconds", "", "sleepWindowConfirmed", "sleepWindowConfirmedType", "sleepStartTimestampGMT", "sleepEndTimestampGMT", "sleepStartTimestampLocal", "sleepEndTimestampLocal", "autoSleepStartTimestampGMT", "autoSleepEndTimestampGMT", "sleepQualityTypePk", "sleepResultTypePK", "unmeasurableSleepSeconds", "deepSleepSeconds", "lightSleepSeconds", "remSleepSeconds", "awakeSleepSeconds", "awakeCount", "", "avgSleepStress", "averageSpO2Value", "lowestSpO2Value", "highestSpO2Value", "averageSpO2HRSleep", "avgHeartRate", "spo2Threshold", "deviceRemCapable", "sleepFromDevice", "Ljm1/c;", "sleepScores", "sleepScoreFeedback", "sleepScoreInsight", "sleepScorePersonalizedInsight", "sleepVersion", "userNote", "retro", "averageRespirationValue", "lowestRespirationValue", "highestRespirationValue", "Lkm1/a0;", "sleepNeed", "nextSleepNeed", "", "Lkm1/b;", "dailyNapDTOS", "breathingDisruptionSeverity", "Lkm1/p;", "sleepAlignment", "<init>", "(JJLjava/lang/String;IIZLjava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;ZZLjm1/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkm1/a0;Lkm1/a0;Ljava/util/List;Ljava/lang/String;Lkm1/p;)V", "a", "J", "A", "()J", "setId", "(J)V", "b", "x0", "setUserProfilePK", "c", "Ljava/lang/String;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Ljava/lang/String;", "setCalendarDate", "(Ljava/lang/String;)V", "d", "I", "j0", "()I", "setSleepTimeSeconds", "(I)V", JWKParameterNames.RSA_EXPONENT, "getNapTimeSeconds", "setNapTimeSeconds", "f", "Z", "o0", "()Z", "setSleepWindowConfirmed", "(Z)V", "g", "p0", "setSleepWindowConfirmedType", "h", "h0", "setSleepStartTimestampGMT", IntegerTokenConverter.CONVERTER_KEY, "M", "setSleepEndTimestampGMT", "j", "i0", "setSleepStartTimestampLocal", JWKParameterNames.OCT_KEY_VALUE, "setSleepEndTimestampLocal", "l", "Ljava/lang/Long;", "()Ljava/lang/Long;", "setAutoSleepStartTimestampGMT", "(Ljava/lang/Long;)V", "m", "setAutoSleepEndTimestampGMT", JWKParameterNames.RSA_MODULUS, "getSleepQualityTypePk", "setSleepQualityTypePk", "o", "getSleepResultTypePK", "setSleepResultTypePK", "p", "q0", "setUnmeasurableSleepSeconds", "u", "setDeepSleepSeconds", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "C", "setLightSleepSeconds", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "H", "setRemSleepSeconds", "v", "setAwakeSleepSeconds", "w", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setAwakeCount", "(Ljava/lang/Integer;)V", "x", "Ljava/lang/Double;", "()Ljava/lang/Double;", "setAvgSleepStress", "(Ljava/lang/Double;)V", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "setAverageSpO2Value", "z", "F", "setLowestSpO2Value", "getHighestSpO2Value", "setHighestSpO2Value", "B", "getAverageSpO2HRSleep", "setAverageSpO2HRSleep", "D", "getSpo2Threshold", "setSpo2Threshold", "E", "setDeviceRemCapable", "a0", "setSleepFromDevice", "Ljm1/c;", "g0", "()Ljm1/c;", "setSleepScores", "(Ljm1/c;)V", "P", "e0", "setSleepScoreFeedback", "T", "getSleepScoreInsight", "setSleepScoreInsight", "X", "f0", "setSleepScorePersonalizedInsight", "Y", "n0", "setSleepVersion", "w0", "setUserNote", "k0", "Ljava/lang/Boolean;", "getRetro", "()Ljava/lang/Boolean;", "setRetro", "(Ljava/lang/Boolean;)V", "H0", "setAverageRespirationValue", "I0", "setLowestRespirationValue", "J0", "setHighestRespirationValue", "K0", "Lkm1/a0;", "c0", "()Lkm1/a0;", "L0", "G", "M0", "Ljava/util/List;", "()Ljava/util/List;", "N0", "O0", "Lkm1/p;", "()Lkm1/p;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR;
    public static final int P0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("highestSpO2Value")
    private Integer highestSpO2Value;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("averageSpO2HRSleep")
    private Integer averageSpO2HRSleep;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("avgHeartRate")
    private final Double avgHeartRate;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("spo2Threshold")
    private Integer spo2Threshold;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("deviceRemCapable")
    private boolean deviceRemCapable;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("sleepFromDevice")
    private boolean sleepFromDevice;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @SerializedName("averageRespirationValue")
    private Double averageRespirationValue;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("sleepScores")
    private jm1.c sleepScores;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @SerializedName("lowestRespirationValue")
    @JsonAdapter(DoubleTypeAdapter.class)
    private Double lowestRespirationValue;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @SerializedName("highestRespirationValue")
    @JsonAdapter(DoubleTypeAdapter.class)
    private Double highestRespirationValue;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @SerializedName("sleepNeed")
    private final a0 sleepNeed;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @SerializedName("nextSleepNeed")
    private final a0 nextSleepNeed;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @SerializedName("dailyNapDTOS")
    private final List<km1.b> dailyNapDTOS;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @SerializedName("breathingDisruptionSeverity")
    private final String breathingDisruptionSeverity;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @SerializedName("sleepAlignment")
    private final p sleepAlignment;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("sleepScoreFeedback")
    private String sleepScoreFeedback;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("sleepScoreInsight")
    private String sleepScoreInsight;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("sleepScorePersonalizedInsight")
    private String sleepScorePersonalizedInsight;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @SerializedName("sleepVersion")
    private Integer sleepVersion;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @SerializedName("userNote")
    private String userNote;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private long userProfilePK;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private String calendarDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepTimeSeconds")
    private int sleepTimeSeconds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("napTimeSeconds")
    private int napTimeSeconds;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepWindowConfirmed")
    private boolean sleepWindowConfirmed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepWindowConfirmationType")
    private String sleepWindowConfirmedType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepStartTimestampGMT")
    private long sleepStartTimestampGMT;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepEndTimestampGMT")
    private long sleepEndTimestampGMT;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepStartTimestampLocal")
    private long sleepStartTimestampLocal;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepEndTimestampLocal")
    private long sleepEndTimestampLocal;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("retro")
    private Boolean retro;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("autoSleepStartTimestampGMT")
    private Long autoSleepStartTimestampGMT;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("autoSleepEndTimestampGMT")
    private Long autoSleepEndTimestampGMT;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepQualityTypePK")
    private String sleepQualityTypePk;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepResultTypePK")
    private String sleepResultTypePK;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unmeasurableSleepSeconds")
    private int unmeasurableSleepSeconds;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deepSleepSeconds")
    private int deepSleepSeconds;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lightSleepSeconds")
    private int lightSleepSeconds;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("remSleepSeconds")
    private int remSleepSeconds;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("awakeSleepSeconds")
    private int awakeSleepSeconds;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("awakeCount")
    private Integer awakeCount;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgSleepStress")
    private Double avgSleepStress;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSpO2Value")
    private Integer averageSpO2Value;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowestSpO2Value")
    private Integer lowestSpO2Value;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<v> {
        @Override // android.os.Parcelable.Creator
        public final v createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            Boolean boolValueOf;
            ArrayList arrayList;
            parcel.getClass();
            long j8 = parcel.readLong();
            long j14 = parcel.readLong();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z15 = false;
                z14 = true;
            } else {
                z14 = false;
                z15 = false;
            }
            String string2 = parcel.readString();
            long j15 = parcel.readLong();
            long j16 = parcel.readLong();
            long j17 = parcel.readLong();
            long j18 = parcel.readLong();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long l14 = lValueOf;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Long l15 = lValueOf2;
            int i16 = parcel.readInt();
            int i17 = parcel.readInt();
            int i18 = parcel.readInt();
            int i19 = parcel.readInt();
            int i24 = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z16 = parcel.readInt() != 0 ? true : z15;
            boolean z17 = parcel.readInt() != 0 ? true : z15;
            jm1.c cVarCreateFromParcel = parcel.readInt() == 0 ? null : jm1.c.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Integer numValueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            a0 a0VarCreateFromParcel = parcel.readInt() == 0 ? null : a0.CREATOR.createFromParcel(parcel);
            a0 a0VarCreateFromParcel2 = parcel.readInt() == 0 ? null : a0.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i25 = parcel.readInt();
                arrayList = new ArrayList(i25);
                int iD = 0;
                while (iD != i25) {
                    iD = u0.d(v.class, parcel, arrayList, iD, 1);
                    i25 = i25;
                }
            }
            return new v(j8, j14, string, i14, i15, z14, string2, j15, j16, j17, j18, l14, l15, string3, string4, i16, i17, i18, i19, i24, numValueOf, dValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, dValueOf2, numValueOf6, z16, z17, cVarCreateFromParcel, string5, string6, string7, numValueOf7, string8, boolValueOf, dValueOf3, dValueOf4, dValueOf5, a0VarCreateFromParcel, a0VarCreateFromParcel2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : p.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final v[] newArray(int i14) {
            return new v[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
        P0 = 8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ v(long j8, long j14, String str, int i14, int i15, boolean z14, String str2, long j15, long j16, long j17, long j18, Long l14, Long l15, String str3, String str4, int i16, int i17, int i18, int i19, int i24, Integer num, Double d14, Integer num2, Integer num3, Integer num4, Integer num5, Double d15, Integer num6, boolean z15, boolean z16, jm1.c cVar, String str5, String str6, String str7, Integer num7, String str8, Boolean bool, Double d16, Double d17, Double d18, a0 a0Var, a0 a0Var2, List list, String str9, p pVar, int i25, int i26, p005kotlin.jvm.internal.j jVar) {
        long j19 = (i25 & 1) != 0 ? -1L : j8;
        this(j19, (i25 & 2) != 0 ? 0L : j14, (i25 & 4) != 0 ? null : str, (i25 & 8) != 0 ? 0 : i14, (i25 & 16) != 0 ? 0 : i15, (i25 & 32) != 0 ? false : z14, (i25 & 64) != 0 ? null : str2, (i25 & 128) != 0 ? 0L : j15, (i25 & 256) != 0 ? 0L : j16, (i25 & 512) != 0 ? 0L : j17, (i25 & 1024) != 0 ? 0L : j18, (i25 & 2048) != 0 ? null : l14, (i25 & 4096) != 0 ? null : l15, (i25 & 8192) != 0 ? "excellent" : str3, (i25 & 16384) != 0 ? "great" : str4, (i25 & 32768) != 0 ? 0 : i16, (i25 & 65536) != 0 ? 0 : i17, (i25 & 131072) != 0 ? 0 : i18, (i25 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? 0 : i19, (i25 & 524288) != 0 ? 0 : i24, (i25 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num, (i25 & 2097152) != 0 ? null : d14, (i25 & 4194304) != 0 ? null : num2, (i25 & 8388608) != 0 ? null : num3, (i25 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : num4, (i25 & 33554432) != 0 ? null : num5, (i25 & 67108864) != 0 ? null : d15, (i25 & 134217728) != 0 ? null : num6, (i25 & 268435456) != 0 ? false : z15, (i25 & 536870912) != 0 ? false : z16, (i25 & 1073741824) != 0 ? null : cVar, (i25 & Integer.MIN_VALUE) != 0 ? null : str5, (i26 & 1) != 0 ? null : str6, (i26 & 2) != 0 ? null : str7, (i26 & 4) != 0 ? null : num7, (i26 & 8) != 0 ? null : str8, (i26 & 16) != 0 ? null : bool, (i26 & 32) != 0 ? null : d16, (i26 & 64) != 0 ? null : d17, (i26 & 128) != 0 ? null : d18, (i26 & 256) != 0 ? null : a0Var, (i26 & 512) != 0 ? null : a0Var2, (i26 & 1024) != 0 ? null : list, (i26 & 2048) != 0 ? null : str9, (i26 & 4096) != 0 ? null : pVar);
    }

    public static v b(v vVar, long j8, String str, int i14, long j14, long j15, List list, int i15, int i16) {
        return new v(vVar.id, (i15 & 2) != 0 ? vVar.userProfilePK : j8, (i15 & 4) != 0 ? vVar.calendarDate : str, (i15 & 8) != 0 ? vVar.sleepTimeSeconds : i14, vVar.napTimeSeconds, (i15 & 32) != 0 ? vVar.sleepWindowConfirmed : true, vVar.sleepWindowConfirmedType, (i15 & 128) != 0 ? vVar.sleepStartTimestampGMT : j14, (i15 & 256) != 0 ? vVar.sleepEndTimestampGMT : j15, vVar.sleepStartTimestampLocal, vVar.sleepEndTimestampLocal, vVar.autoSleepStartTimestampGMT, vVar.autoSleepEndTimestampGMT, vVar.sleepQualityTypePk, vVar.sleepResultTypePK, vVar.unmeasurableSleepSeconds, vVar.deepSleepSeconds, vVar.lightSleepSeconds, vVar.remSleepSeconds, vVar.awakeSleepSeconds, vVar.awakeCount, vVar.avgSleepStress, vVar.averageSpO2Value, vVar.lowestSpO2Value, vVar.highestSpO2Value, vVar.averageSpO2HRSleep, vVar.avgHeartRate, vVar.spo2Threshold, vVar.deviceRemCapable, vVar.sleepFromDevice, vVar.sleepScores, vVar.sleepScoreFeedback, vVar.sleepScoreInsight, vVar.sleepScorePersonalizedInsight, vVar.sleepVersion, vVar.userNote, vVar.retro, vVar.averageRespirationValue, vVar.lowestRespirationValue, vVar.highestRespirationValue, vVar.sleepNeed, vVar.nextSleepNeed, (i16 & 1024) != 0 ? vVar.dailyNapDTOS : list, vVar.breathingDisruptionSeverity, vVar.sleepAlignment);
    }

    public static DateTime r(v vVar) {
        String str = vVar.calendarDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final int getLightSleepSeconds() {
        return this.lightSleepSeconds;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Double getLowestRespirationValue() {
        return this.lowestRespirationValue;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Integer getLowestSpO2Value() {
        return this.lowestSpO2Value;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final a0 getNextSleepNeed() {
        return this.nextSleepNeed;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final int getRemSleepSeconds() {
        return this.remSleepSeconds;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final p getSleepAlignment() {
        return this.sleepAlignment;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final long getSleepEndTimestampGMT() {
        return this.sleepEndTimestampGMT;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final long getSleepEndTimestampLocal() {
        return this.sleepEndTimestampLocal;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final boolean getSleepFromDevice() {
        return this.sleepFromDevice;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final a0 getSleepNeed() {
        return this.sleepNeed;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getAutoSleepEndTimestampGMT() {
        return this.autoSleepEndTimestampGMT;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final String getSleepScoreFeedback() {
        return this.sleepScoreFeedback;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.id == vVar.id && this.userProfilePK == vVar.userProfilePK && p005kotlin.jvm.internal.s.g(this.calendarDate, vVar.calendarDate) && this.sleepTimeSeconds == vVar.sleepTimeSeconds && this.napTimeSeconds == vVar.napTimeSeconds && this.sleepWindowConfirmed == vVar.sleepWindowConfirmed && p005kotlin.jvm.internal.s.g(this.sleepWindowConfirmedType, vVar.sleepWindowConfirmedType) && this.sleepStartTimestampGMT == vVar.sleepStartTimestampGMT && this.sleepEndTimestampGMT == vVar.sleepEndTimestampGMT && this.sleepStartTimestampLocal == vVar.sleepStartTimestampLocal && this.sleepEndTimestampLocal == vVar.sleepEndTimestampLocal && p005kotlin.jvm.internal.s.g(this.autoSleepStartTimestampGMT, vVar.autoSleepStartTimestampGMT) && p005kotlin.jvm.internal.s.g(this.autoSleepEndTimestampGMT, vVar.autoSleepEndTimestampGMT) && p005kotlin.jvm.internal.s.g(this.sleepQualityTypePk, vVar.sleepQualityTypePk) && p005kotlin.jvm.internal.s.g(this.sleepResultTypePK, vVar.sleepResultTypePK) && this.unmeasurableSleepSeconds == vVar.unmeasurableSleepSeconds && this.deepSleepSeconds == vVar.deepSleepSeconds && this.lightSleepSeconds == vVar.lightSleepSeconds && this.remSleepSeconds == vVar.remSleepSeconds && this.awakeSleepSeconds == vVar.awakeSleepSeconds && p005kotlin.jvm.internal.s.g(this.awakeCount, vVar.awakeCount) && p005kotlin.jvm.internal.s.g(this.avgSleepStress, vVar.avgSleepStress) && p005kotlin.jvm.internal.s.g(this.averageSpO2Value, vVar.averageSpO2Value) && p005kotlin.jvm.internal.s.g(this.lowestSpO2Value, vVar.lowestSpO2Value) && p005kotlin.jvm.internal.s.g(this.highestSpO2Value, vVar.highestSpO2Value) && p005kotlin.jvm.internal.s.g(this.averageSpO2HRSleep, vVar.averageSpO2HRSleep) && p005kotlin.jvm.internal.s.g(this.avgHeartRate, vVar.avgHeartRate) && p005kotlin.jvm.internal.s.g(this.spo2Threshold, vVar.spo2Threshold) && this.deviceRemCapable == vVar.deviceRemCapable && this.sleepFromDevice == vVar.sleepFromDevice && p005kotlin.jvm.internal.s.g(this.sleepScores, vVar.sleepScores) && p005kotlin.jvm.internal.s.g(this.sleepScoreFeedback, vVar.sleepScoreFeedback) && p005kotlin.jvm.internal.s.g(this.sleepScoreInsight, vVar.sleepScoreInsight) && p005kotlin.jvm.internal.s.g(this.sleepScorePersonalizedInsight, vVar.sleepScorePersonalizedInsight) && p005kotlin.jvm.internal.s.g(this.sleepVersion, vVar.sleepVersion) && p005kotlin.jvm.internal.s.g(this.userNote, vVar.userNote) && p005kotlin.jvm.internal.s.g(this.retro, vVar.retro) && p005kotlin.jvm.internal.s.g(this.averageRespirationValue, vVar.averageRespirationValue) && p005kotlin.jvm.internal.s.g(this.lowestRespirationValue, vVar.lowestRespirationValue) && p005kotlin.jvm.internal.s.g(this.highestRespirationValue, vVar.highestRespirationValue) && p005kotlin.jvm.internal.s.g(this.sleepNeed, vVar.sleepNeed) && p005kotlin.jvm.internal.s.g(this.nextSleepNeed, vVar.nextSleepNeed) && p005kotlin.jvm.internal.s.g(this.dailyNapDTOS, vVar.dailyNapDTOS) && p005kotlin.jvm.internal.s.g(this.breathingDisruptionSeverity, vVar.breathingDisruptionSeverity) && p005kotlin.jvm.internal.s.g(this.sleepAlignment, vVar.sleepAlignment);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getAutoSleepStartTimestampGMT() {
        return this.autoSleepStartTimestampGMT;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final String getSleepScorePersonalizedInsight() {
        return this.sleepScorePersonalizedInsight;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getAverageRespirationValue() {
        return this.averageRespirationValue;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final jm1.c getSleepScores() {
        return this.sleepScores;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getAverageSpO2Value() {
        return this.averageSpO2Value;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final long getSleepStartTimestampGMT() {
        return this.sleepStartTimestampGMT;
    }

    public final int hashCode() {
        int iE = q6.f.e(Long.hashCode(this.id) * 31, 31, this.userProfilePK);
        String str = this.calendarDate;
        int iG = q6.f.g(q2.d(this.napTimeSeconds, q2.d(this.sleepTimeSeconds, (iE + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.sleepWindowConfirmed);
        String str2 = this.sleepWindowConfirmedType;
        int iE2 = q6.f.e(q6.f.e(q6.f.e(q6.f.e((iG + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.sleepStartTimestampGMT), 31, this.sleepEndTimestampGMT), 31, this.sleepStartTimestampLocal), 31, this.sleepEndTimestampLocal);
        Long l14 = this.autoSleepStartTimestampGMT;
        int iHashCode = (iE2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.autoSleepEndTimestampGMT;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str3 = this.sleepQualityTypePk;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sleepResultTypePK;
        int iD = q2.d(this.awakeSleepSeconds, q2.d(this.remSleepSeconds, q2.d(this.lightSleepSeconds, q2.d(this.deepSleepSeconds, q2.d(this.unmeasurableSleepSeconds, (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31), 31), 31);
        Integer num = this.awakeCount;
        int iHashCode4 = (iD + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.avgSleepStress;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Integer num2 = this.averageSpO2Value;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.lowestSpO2Value;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.highestSpO2Value;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.averageSpO2HRSleep;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Double d15 = this.avgHeartRate;
        int iHashCode10 = (iHashCode9 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num6 = this.spo2Threshold;
        int iG2 = q6.f.g(q6.f.g((iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31, 31, this.deviceRemCapable), 31, this.sleepFromDevice);
        jm1.c cVar = this.sleepScores;
        int iHashCode11 = (iG2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str5 = this.sleepScoreFeedback;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sleepScoreInsight;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sleepScorePersonalizedInsight;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num7 = this.sleepVersion;
        int iHashCode15 = (iHashCode14 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str8 = this.userNote;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.retro;
        int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d16 = this.averageRespirationValue;
        int iHashCode18 = (iHashCode17 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.lowestRespirationValue;
        int iHashCode19 = (iHashCode18 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.highestRespirationValue;
        int iHashCode20 = (iHashCode19 + (d18 == null ? 0 : d18.hashCode())) * 31;
        a0 a0Var = this.sleepNeed;
        int iHashCode21 = (iHashCode20 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        a0 a0Var2 = this.nextSleepNeed;
        int iHashCode22 = (iHashCode21 + (a0Var2 == null ? 0 : a0Var2.hashCode())) * 31;
        List<km1.b> list = this.dailyNapDTOS;
        int iHashCode23 = (iHashCode22 + (list == null ? 0 : list.hashCode())) * 31;
        String str9 = this.breathingDisruptionSeverity;
        int iHashCode24 = (iHashCode23 + (str9 == null ? 0 : str9.hashCode())) * 31;
        p pVar = this.sleepAlignment;
        return iHashCode24 + (pVar != null ? pVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getAvgHeartRate() {
        return this.avgHeartRate;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final long getSleepStartTimestampLocal() {
        return this.sleepStartTimestampLocal;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getAvgSleepStress() {
        return this.avgSleepStress;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final int getSleepTimeSeconds() {
        return this.sleepTimeSeconds;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getAwakeCount() {
        return this.awakeCount;
    }

    public final int k0() {
        Integer num = this.sleepVersion;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getAwakeSleepSeconds() {
        return this.awakeSleepSeconds;
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final Integer getSleepVersion() {
        return this.sleepVersion;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getBreathingDisruptionSeverity() {
        return this.breathingDisruptionSeverity;
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final boolean getSleepWindowConfirmed() {
        return this.sleepWindowConfirmed;
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final String getSleepWindowConfirmedType() {
        return this.sleepWindowConfirmedType;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getCalendarDate() {
        return this.calendarDate;
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final int getUnmeasurableSleepSeconds() {
        return this.unmeasurableSleepSeconds;
    }

    public final LocalDate s() {
        String str = this.calendarDate;
        if (str != null) {
            return g22.k.v(str, "yyyy-MM-dd");
        }
        return null;
    }

    public final List<km1.b> t() {
        return this.dailyNapDTOS;
    }

    public final String toString() {
        long j8 = this.id;
        long j14 = this.userProfilePK;
        String str = this.calendarDate;
        int i14 = this.sleepTimeSeconds;
        int i15 = this.napTimeSeconds;
        boolean z14 = this.sleepWindowConfirmed;
        String str2 = this.sleepWindowConfirmedType;
        long j15 = this.sleepStartTimestampGMT;
        long j16 = this.sleepEndTimestampGMT;
        long j17 = this.sleepStartTimestampLocal;
        long j18 = this.sleepEndTimestampLocal;
        Long l14 = this.autoSleepStartTimestampGMT;
        Long l15 = this.autoSleepEndTimestampGMT;
        String str3 = this.sleepQualityTypePk;
        String str4 = this.sleepResultTypePK;
        int i16 = this.unmeasurableSleepSeconds;
        int i17 = this.deepSleepSeconds;
        int i18 = this.lightSleepSeconds;
        int i19 = this.remSleepSeconds;
        int i24 = this.awakeSleepSeconds;
        Integer num = this.awakeCount;
        Double d14 = this.avgSleepStress;
        Integer num2 = this.averageSpO2Value;
        Integer num3 = this.lowestSpO2Value;
        Integer num4 = this.highestSpO2Value;
        Integer num5 = this.averageSpO2HRSleep;
        Double d15 = this.avgHeartRate;
        Integer num6 = this.spo2Threshold;
        boolean z15 = this.deviceRemCapable;
        boolean z16 = this.sleepFromDevice;
        jm1.c cVar = this.sleepScores;
        String str5 = this.sleepScoreFeedback;
        String str6 = this.sleepScoreInsight;
        String str7 = this.sleepScorePersonalizedInsight;
        Integer num7 = this.sleepVersion;
        String str8 = this.userNote;
        Boolean bool = this.retro;
        Double d16 = this.averageRespirationValue;
        Double d17 = this.lowestRespirationValue;
        Double d18 = this.highestRespirationValue;
        a0 a0Var = this.sleepNeed;
        a0 a0Var2 = this.nextSleepNeed;
        List<km1.b> list = this.dailyNapDTOS;
        String str9 = this.breathingDisruptionSeverity;
        p pVar = this.sleepAlignment;
        StringBuilder sbK = ds.e0.k(j8, "SleepDTO(id=", ", userProfilePK=");
        p6.b.k(j14, ", calendarDate=", str, sbK);
        androidx.core.view.j.m(i14, i15, ", sleepTimeSeconds=", ", napTimeSeconds=", sbK);
        sbK.append(", sleepWindowConfirmed=");
        sbK.append(z14);
        sbK.append(", sleepWindowConfirmedType=");
        sbK.append(str2);
        j20.x.j(j15, ", sleepStartTimestampGMT=", ", sleepEndTimestampGMT=", sbK);
        sbK.append(j16);
        j20.x.j(j17, ", sleepStartTimestampLocal=", ", sleepEndTimestampLocal=", sbK);
        sbK.append(j18);
        sbK.append(", autoSleepStartTimestampGMT=");
        sbK.append(l14);
        sbK.append(", autoSleepEndTimestampGMT=");
        sbK.append(l15);
        sbK.append(", sleepQualityTypePk=");
        sbK.append(str3);
        sbK.append(", sleepResultTypePK=");
        sbK.append(str4);
        sbK.append(", unmeasurableSleepSeconds=");
        sbK.append(i16);
        androidx.core.view.j.m(i17, i18, ", deepSleepSeconds=", ", lightSleepSeconds=", sbK);
        androidx.core.view.j.m(i19, i24, ", remSleepSeconds=", ", awakeSleepSeconds=", sbK);
        sbK.append(", awakeCount=");
        sbK.append(num);
        sbK.append(", avgSleepStress=");
        sbK.append(d14);
        sbK.append(", averageSpO2Value=");
        sbK.append(num2);
        sbK.append(", lowestSpO2Value=");
        sbK.append(num3);
        sbK.append(", highestSpO2Value=");
        sbK.append(num4);
        sbK.append(", averageSpO2HRSleep=");
        sbK.append(num5);
        sbK.append(", avgHeartRate=");
        sbK.append(d15);
        sbK.append(", spo2Threshold=");
        sbK.append(num6);
        com.airbnb.lottie.animation.keyframe.a.v(", deviceRemCapable=", ", sleepFromDevice=", sbK, z15, z16);
        sbK.append(", sleepScores=");
        sbK.append(cVar);
        sbK.append(", sleepScoreFeedback=");
        sbK.append(str5);
        sn.a.t(sbK, ", sleepScoreInsight=", str6, ", sleepScorePersonalizedInsight=", str7);
        sbK.append(", sleepVersion=");
        sbK.append(num7);
        sbK.append(", userNote=");
        sbK.append(str8);
        sbK.append(", retro=");
        sbK.append(bool);
        sbK.append(", averageRespirationValue=");
        sbK.append(d16);
        sn.a.p(d17, d18, ", lowestRespirationValue=", ", highestRespirationValue=", sbK);
        sbK.append(", sleepNeed=");
        sbK.append(a0Var);
        sbK.append(", nextSleepNeed=");
        sbK.append(a0Var2);
        sbK.append(", dailyNapDTOS=");
        sbK.append(list);
        sbK.append(", breathingDisruptionSeverity=");
        sbK.append(str9);
        sbK.append(", sleepAlignment=");
        sbK.append(pVar);
        sbK.append(")");
        return sbK.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getDeepSleepSeconds() {
        return this.deepSleepSeconds;
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final String getUserNote() {
        return this.userNote;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.id);
        parcel.writeLong(this.userProfilePK);
        parcel.writeString(this.calendarDate);
        parcel.writeInt(this.sleepTimeSeconds);
        parcel.writeInt(this.napTimeSeconds);
        parcel.writeInt(this.sleepWindowConfirmed ? 1 : 0);
        parcel.writeString(this.sleepWindowConfirmedType);
        parcel.writeLong(this.sleepStartTimestampGMT);
        parcel.writeLong(this.sleepEndTimestampGMT);
        parcel.writeLong(this.sleepStartTimestampLocal);
        parcel.writeLong(this.sleepEndTimestampLocal);
        Long l14 = this.autoSleepStartTimestampGMT;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.autoSleepEndTimestampGMT;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.sleepQualityTypePk);
        parcel.writeString(this.sleepResultTypePK);
        parcel.writeInt(this.unmeasurableSleepSeconds);
        parcel.writeInt(this.deepSleepSeconds);
        parcel.writeInt(this.lightSleepSeconds);
        parcel.writeInt(this.remSleepSeconds);
        parcel.writeInt(this.awakeSleepSeconds);
        Integer num = this.awakeCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d14 = this.avgSleepStress;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Integer num2 = this.averageSpO2Value;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.lowestSpO2Value;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.highestSpO2Value;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Integer num5 = this.averageSpO2HRSleep;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        Double d15 = this.avgHeartRate;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Integer num6 = this.spo2Threshold;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num6);
        }
        parcel.writeInt(this.deviceRemCapable ? 1 : 0);
        parcel.writeInt(this.sleepFromDevice ? 1 : 0);
        jm1.c cVar = this.sleepScores;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.sleepScoreFeedback);
        parcel.writeString(this.sleepScoreInsight);
        parcel.writeString(this.sleepScorePersonalizedInsight);
        Integer num7 = this.sleepVersion;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num7);
        }
        parcel.writeString(this.userNote);
        Boolean bool = this.retro;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Double d16 = this.averageRespirationValue;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.lowestRespirationValue;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.highestRespirationValue;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        a0 a0Var = this.sleepNeed;
        if (a0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            a0Var.writeToParcel(parcel, i14);
        }
        a0 a0Var2 = this.nextSleepNeed;
        if (a0Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            a0Var2.writeToParcel(parcel, i14);
        }
        List<km1.b> list = this.dailyNapDTOS;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        parcel.writeString(this.breathingDisruptionSeverity);
        p pVar = this.sleepAlignment;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar.writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: x0, reason: from getter */
    public final long getUserProfilePK() {
        return this.userProfilePK;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getDeviceRemCapable() {
        return this.deviceRemCapable;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Double getHighestRespirationValue() {
        return this.highestRespirationValue;
    }

    public final boolean z0() {
        return this.sleepEndTimestampGMT - this.sleepStartTimestampGMT > 0;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\nR\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\nR\u0014\u0010#\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\nR\u0014\u0010$\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\nR\u0014\u0010%\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\n¨\u0006&"}, d2 = {"Lkm1/v$a;", "", "<init>", "()V", "", "DEFAULT_SLEEP_SCORE_VERSION", "I", "SLEEP_SCORE_VERSION_2", "", "SLEEP_QUALITY_PK_EXCELENT", "Ljava/lang/String;", "SLEEP_QUALITY_PK_GOOD", "SLEEP_QUALITY_PK_AVERAGE", "SLEEP_QUALITY_PK_POOR", "SLEEP_RESULT_PK_GREAT", "SLEEP_RESULT_PK_OK", "SLEEP_RESULT_PK_BAD", "", "DEFAULT_ID", "J", "DEFAULT_SLEEP_QUALITY_PK", "DEFAULT_SLEEP_RESULT_PK", "DATE_FORMAT", "ID", "USER_PROFILE_PK", "CALENDAR_DATE", "SLEEP_TIME_SECONDS", "NAP_TIME_SECONDS", "SLEEP_WINDOW_CONFIRMED", "SLEEP_WINDOW_CONFIRMED_TYPE", "SLEEP_START_TIMESTAMP_GMT", "SLEEP_END_TIMESTAMP_GMT", "SLEEP_START_TIMESTAMP_LOCAL", "SLEEP_END_TIMESTAMP_LOCAL", "AUTO_SLEEP_START_TIMESTAMP_GMT", "AUTO_SLEEP_END_TIMESTAMP_GMT", "SLEEP_QUALITY_TYPE_PK", "SLEEP_RESULT_TYPE_PK", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public v(long j8, long j14, String str, int i14, int i15, boolean z14, String str2, long j15, long j16, long j17, long j18, Long l14, Long l15, String str3, String str4, int i16, int i17, int i18, int i19, int i24, Integer num, Double d14, Integer num2, Integer num3, Integer num4, Integer num5, Double d15, Integer num6, boolean z15, boolean z16, jm1.c cVar, String str5, String str6, String str7, Integer num7, String str8, Boolean bool, Double d16, Double d17, Double d18, a0 a0Var, a0 a0Var2, List<km1.b> list, String str9, p pVar) {
        this.id = j8;
        this.userProfilePK = j14;
        this.calendarDate = str;
        this.sleepTimeSeconds = i14;
        this.napTimeSeconds = i15;
        this.sleepWindowConfirmed = z14;
        this.sleepWindowConfirmedType = str2;
        this.sleepStartTimestampGMT = j15;
        this.sleepEndTimestampGMT = j16;
        this.sleepStartTimestampLocal = j17;
        this.sleepEndTimestampLocal = j18;
        this.autoSleepStartTimestampGMT = l14;
        this.autoSleepEndTimestampGMT = l15;
        this.sleepQualityTypePk = str3;
        this.sleepResultTypePK = str4;
        this.unmeasurableSleepSeconds = i16;
        this.deepSleepSeconds = i17;
        this.lightSleepSeconds = i18;
        this.remSleepSeconds = i19;
        this.awakeSleepSeconds = i24;
        this.awakeCount = num;
        this.avgSleepStress = d14;
        this.averageSpO2Value = num2;
        this.lowestSpO2Value = num3;
        this.highestSpO2Value = num4;
        this.averageSpO2HRSleep = num5;
        this.avgHeartRate = d15;
        this.spo2Threshold = num6;
        this.deviceRemCapable = z15;
        this.sleepFromDevice = z16;
        this.sleepScores = cVar;
        this.sleepScoreFeedback = str5;
        this.sleepScoreInsight = str6;
        this.sleepScorePersonalizedInsight = str7;
        this.sleepVersion = num7;
        this.userNote = str8;
        this.retro = bool;
        this.averageRespirationValue = d16;
        this.lowestRespirationValue = d17;
        this.highestRespirationValue = d18;
        this.sleepNeed = a0Var;
        this.nextSleepNeed = a0Var2;
        this.dailyNapDTOS = list;
        this.breathingDisruptionSeverity = str9;
        this.sleepAlignment = pVar;
    }

    public v() {
        this(0L, 0L, null, 0, 0, false, null, 0L, 0L, 0L, 0L, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8191, null);
    }
}
