package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bw\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0005\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010)\u001a\u00020\u000b\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u0002\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010=\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u0002\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bA\u0010BR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010N\u001a\u0004\bS\u0010P\"\u0004\bT\u0010RR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010N\u001a\u0004\bV\u0010PR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010W\u001a\u0004\bX\u0010YR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010D\u001a\u0004\bZ\u0010FR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010D\u001a\u0004\b[\u0010FR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010J\u001a\u0004\b\\\u0010LR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b]\u0010_R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010d\u001a\u0004\bg\u0010fR\u001a\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010d\u001a\u0004\bi\u0010fR\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010D\u001a\u0004\bk\u0010FR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010W\u001a\u0004\bm\u0010YR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010n\u001a\u0004\bo\u0010pR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010W\u001a\u0004\bq\u0010YR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010W\u001a\u0004\br\u0010YR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010W\u001a\u0004\bd\u0010YR\u001c\u0010 \u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bt\u0010W\u001a\u0004\bu\u0010YR\u001c\u0010!\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010W\u001a\u0004\bw\u0010YR\u001c\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\be\u0010W\u001a\u0004\bx\u0010YR\u001c\u0010#\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010W\u001a\u0004\by\u0010YR\u001c\u0010$\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010W\u001a\u0004\bz\u0010YR\u001c\u0010%\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010W\u001a\u0004\b|\u0010YR\u001c\u0010&\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010W\u001a\u0004\b~\u0010YR\u001c\u0010'\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\br\u0010W\u001a\u0004\b\u007f\u0010YR\u001e\u0010(\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010W\u001a\u0005\b\u0081\u0001\u0010YR'\u0010)\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\b\u0082\u0001\u0010u\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001d\u0010*\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\r\n\u0004\bd\u0010W\u001a\u0005\b\u0087\u0001\u0010YR\u001d\u0010+\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0088\u0001\u0010W\u001a\u0004\b+\u0010YR(\u0010,\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b\u0089\u0001\u0010J\u001a\u0005\b\u008a\u0001\u0010L\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010-\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010N\u001a\u0005\b\u008e\u0001\u0010PR\u001e\u0010.\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010N\u001a\u0005\b\u0090\u0001\u0010PR\u001e\u0010/\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bu\u0010\u0091\u0001\u001a\u0005\bj\u0010\u0092\u0001R \u00100\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0091\u0001\u001a\u0006\b\u0094\u0001\u0010\u0092\u0001R\u001e\u00101\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010W\u001a\u0005\b\u0093\u0001\u0010YR$\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010D\u001a\u0005\b\u0097\u0001\u0010FR \u00105\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001e\u00106\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010N\u001a\u0005\b\u009c\u0001\u0010PR\u001d\u00107\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u009d\u0001\u0010N\u001a\u0004\b}\u0010PR\u0016\u00108\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010NR\u001e\u00109\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010W\u001a\u0005\b\u009d\u0001\u0010YR\u001e\u0010:\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010W\u001a\u0005\b \u0001\u0010YR\u001d\u0010;\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\r\n\u0004\bQ\u0010W\u001a\u0005\b¡\u0001\u0010YR'\u0010<\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0004\bT\u0010W\u001a\u0005\b\u0082\u0001\u0010Y\"\u0006\b¢\u0001\u0010£\u0001R-\u0010=\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b¤\u0001\u0010D\u001a\u0005\b¥\u0001\u0010F\"\u0005\b¤\u0001\u0010HR\u001e\u0010>\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¢\u0001\u0010N\u001a\u0005\b¦\u0001\u0010PR$\u0010?\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b§\u0001\u0010D\u001a\u0005\b¨\u0001\u0010FR\u001e\u0010@\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b©\u0001\u0010W\u001a\u0005\bª\u0001\u0010Y¨\u0006«\u0001"}, d2 = {"Lps/a1;", "Landroid/os/Parcelable;", "", "Lps/j;", "activityImages", "", "agentApplicationInstallationId", "", "agentString", "associatedCourseId", "associatedWorkoutId", "", "autoCalcCalories", "", "childIds", "childActivityTypes", "deviceApplicationInstallationId", "Lps/x;", "calendarEventInfo", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/q;", "deviceMetadataDTO", "eBikeBatteryUsage", "eBikeBatteryRemaining", "eBikeMaxAssistModes", "Lps/n0;", "eBikeAssistModeInfoDTOList", "elevationCorrected", "Lps/t0;", "fileFormat", "gcj02", "hasChartData", "hasIntensityIntervals", "hasPolyline", "hasHeatmap", "hasPowerTimeInZones", "hasStaminaSpeedTimeInZones", "hasStaminaPowerTimeInZones", "hasRunPowerWindData", "hasSplits", "isActivityTrimmed", "isAtpActivity", "isFavorite", "isManualActivity", "isRunPowerWindEnabled", "lapCount", "lastUpdateDate", "manufacturer", "curatedCourseId", "matchedCuratedCourseId", "personalRecord", "Lps/m1;", "sensors", "Lps/a2;", "userInfoDto", "videoUrl", "groupRideUUID", "cloudPositioningStatusString", "isWheelchair", "hasHighResolutionLocationData", "hasTimeInGearData", "hasDog", "dogProfileIds", "sessionResultType", "thirdPartyGymEquipment", "hasMultiDayActivities", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lps/x;Lcom/garmin/android/apps/connectmobile/activities/newmodel/q;IIILjava/util/List;Ljava/lang/Boolean;Lps/t0;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Lps/a2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "M0", "(Ljava/util/List;)V", "b", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "c", "Ljava/lang/String;", "getAgentString", "()Ljava/lang/String;", "P0", "(Ljava/lang/String;)V", "g", "Q0", JWKParameterNames.RSA_EXPONENT, "h", "Ljava/lang/Boolean;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Boolean;", "m", JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "j", "Lps/x;", "()Lps/x;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/q;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Lcom/garmin/android/apps/connectmobile/activities/newmodel/q;", "l", "I", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "()I", "u", JWKParameterNames.RSA_MODULUS, "z", "o", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "p", "getElevationCorrected", "Lps/t0;", "A", "()Lps/t0;", "getGcj02", "D", "v", "w", "Z", "x", "G", "a0", "f0", "e0", "B", "getHasRunPowerWindData", "C", "c0", "z0", "E", "A0", "F", "q1", "()Z", "setFavorite", "(Z)V", "J0", "P", "T", "h0", "V0", "(Ljava/lang/Integer;)V", "X", "getLastUpdateDate", "Y", "i0", "Ljava/lang/Long;", "()Ljava/lang/Long;", "k0", "j0", "H0", "I0", "n0", "Lps/a2;", "q0", "()Lps/a2;", "K0", "w0", "L0", "N0", "O0", "H", "g0", "S0", "(Ljava/lang/Boolean;)V", "R0", "s", "o0", "T0", "p0", "U0", "M", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a1 implements Parcelable {
    public static final Parcelable.Creator<a1> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("hasStaminaPowerTimeInZones")
    private final Boolean hasStaminaPowerTimeInZones;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("hasRunPowerWindData")
    private final Boolean hasRunPowerWindData;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("hasSplits")
    private final Boolean hasSplits;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("trimmed")
    private final Boolean isActivityTrimmed;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("isAtpActivity")
    private final Boolean isAtpActivity;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("favorite")
    private boolean isFavorite;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @SerializedName("personalRecord")
    private final Boolean personalRecord;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("manualActivity")
    private final Boolean isManualActivity;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @SerializedName("sensors")
    private final List<m1> sensors;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @SerializedName("userInfoDto")
    private final a2 userInfoDto;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @SerializedName("videoUrl")
    private final String videoUrl;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @SerializedName("groupRideUUID")
    private final String groupRideUUID;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @SerializedName("cloudPositioningStatus")
    private final String cloudPositioningStatusString;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @SerializedName("isWheelchair")
    private final Boolean isWheelchair;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @SerializedName("hasHighResolutionLocationData")
    private final Boolean hasHighResolutionLocationData;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("runPowerWindDataEnabled")
    private final Boolean isRunPowerWindEnabled;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @SerializedName("hasTimeInGearData")
    private final Boolean hasTimeInGearData;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @SerializedName("hasDog")
    private Boolean hasDog;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @SerializedName("dogProfileIds")
    private List<Long> dogProfileIds;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @SerializedName("sessionResultType")
    private final String sessionResultType;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("lapCount")
    private Integer lapCount;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @SerializedName("thirdPartyGymEquipment")
    private final List<m1> thirdPartyGymEquipment;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @SerializedName("hasMultiDayActivities")
    private final Boolean hasMultiDayActivities;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("lastUpdateDate")
    private final String lastUpdateDate;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @SerializedName("manufacturer")
    private final String manufacturer;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @SerializedName("curatedCourseId")
    private final Long curatedCourseId;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityImages")
    private List<j> activityImages;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("agentApplicationInstallationId")
    private final Integer agentApplicationInstallationId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("agentString")
    private String agentString;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("associatedCourseId")
    private String associatedCourseId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("associatedWorkoutId")
    private final String associatedWorkoutId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("autoCalcCalories")
    private final Boolean autoCalcCalories;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("childIds")
    private final List<Long> childIds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("childActivityTypes")
    private final List<String> childActivityTypes;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceApplicationInstallationId")
    private final Integer deviceApplicationInstallationId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarEventInfo")
    private final x calendarEventInfo;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceMetaDataDTO")
    private final com.garmin.android.apps.connectmobile.activities.newmodel.q deviceMetadataDTO;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("matchedCuratedCourseId")
    private final Long matchedCuratedCourseId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eBikeBatteryUsage")
    private final int eBikeBatteryUsage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eBikeBatteryRemaining")
    private final int eBikeBatteryRemaining;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eBikeMaxAssistModes")
    private final int eBikeMaxAssistModes;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eBikeAssistModeInfoDTOList")
    private final List<n0> eBikeAssistModeInfoDTOList;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationCorrected")
    private final Boolean elevationCorrected;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fileFormat")
    private final t0 fileFormat;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gcj02")
    private final Boolean gcj02;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasChartData")
    private final Boolean hasChartData;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasIntensityIntervals")
    private final Boolean hasIntensityIntervals;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasPolyline")
    private final Boolean hasPolyline;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasHeatMap")
    private final Boolean hasHeatmap;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasPowerTimeInZones")
    private final Boolean hasPowerTimeInZones;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasStaminaSpeedTimeInZones")
    private final Boolean hasStaminaSpeedTimeInZones;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<a1> {
        @Override // android.os.Parcelable.Creator
        public final a1 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(j.CREATOR, parcel, arrayList7, iA, 1);
                }
                arrayList = arrayList7;
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList8.add(Long.valueOf(parcel.readLong()));
                }
                arrayList2 = arrayList8;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            x xVarCreateFromParcel = parcel.readInt() == 0 ? null : x.CREATOR.createFromParcel(parcel);
            com.garmin.android.apps.connectmobile.activities.newmodel.q qVarCreateFromParcel = parcel.readInt() == 0 ? null : com.garmin.android.apps.connectmobile.activities.newmodel.q.CREATOR.createFromParcel(parcel);
            int i17 = parcel.readInt();
            int i18 = parcel.readInt();
            int i19 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i24 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i24);
                int iA2 = 0;
                while (iA2 != i24) {
                    iA2 = kg.f.a(n0.CREATOR, parcel, arrayList9, iA2, 1);
                }
                arrayList3 = arrayList9;
            }
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            t0 t0VarCreateFromParcel = parcel.readInt() == 0 ? null : t0.CREATOR.createFromParcel(parcel);
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf5 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf6 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf7 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf8 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf9 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf10 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf11 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf12 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf13 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf14 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            boolean z14 = parcel.readInt() != 0;
            Boolean boolValueOf15 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf16 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Boolean boolValueOf17 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i25 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i25);
                int iA3 = 0;
                while (iA3 != i25) {
                    iA3 = kg.f.a(m1.CREATOR, parcel, arrayList10, iA3, 1);
                }
                arrayList4 = arrayList10;
            }
            a2 a2Var = (a2) parcel.readParcelable(a1.class.getClassLoader());
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            Boolean boolValueOf18 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf19 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf20 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf21 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i26 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(i26);
                for (int i27 = 0; i27 != i26; i27++) {
                    arrayList11.add(Long.valueOf(parcel.readLong()));
                }
                arrayList5 = arrayList11;
            }
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int i28 = parcel.readInt();
                ArrayList arrayList12 = new ArrayList(i28);
                int iA4 = 0;
                while (iA4 != i28) {
                    iA4 = kg.f.a(m1.CREATOR, parcel, arrayList12, iA4, 1);
                }
                arrayList6 = arrayList12;
            }
            return new a1(arrayList, numValueOf, string, string2, string3, boolValueOf, arrayList2, arrayListCreateStringArrayList, numValueOf2, xVarCreateFromParcel, qVarCreateFromParcel, i17, i18, i19, arrayList3, boolValueOf2, t0VarCreateFromParcel, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, boolValueOf9, boolValueOf10, boolValueOf11, boolValueOf12, boolValueOf13, boolValueOf14, z14, boolValueOf15, boolValueOf16, numValueOf3, string4, string5, lValueOf, lValueOf2, boolValueOf17, arrayList4, a2Var, string6, string7, string8, boolValueOf18, boolValueOf19, boolValueOf20, boolValueOf21, arrayList5, string9, arrayList6, parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final a1[] newArray(int i14) {
            return new a1[i14];
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139678a;

        static {
            int[] iArr = new int[z.values().length];
            try {
                iArr[z.PROCESSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f139678a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a1(List list, Integer num, String str, String str2, String str3, Boolean bool, List list2, List list3, Integer num2, x xVar, com.garmin.android.apps.connectmobile.activities.newmodel.q qVar, int i14, int i15, int i16, List list4, Boolean bool2, t0 t0Var, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, boolean z14, Boolean bool15, Boolean bool16, Integer num3, String str4, String str5, Long l14, Long l15, Boolean bool17, List list5, a2 a2Var, String str6, String str7, String str8, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, List list6, String str9, List list7, Boolean bool22, int i17, int i18, p005kotlin.jvm.internal.j jVar) {
        List list8 = (i17 & 1) != 0 ? null : list;
        this(list8, (i17 & 2) != 0 ? null : num, (i17 & 4) != 0 ? null : str, (i17 & 8) != 0 ? null : str2, (i17 & 16) != 0 ? null : str3, (i17 & 32) != 0 ? null : bool, (i17 & 64) != 0 ? null : list2, (i17 & 128) != 0 ? null : list3, (i17 & 256) != 0 ? null : num2, (i17 & 512) != 0 ? null : xVar, (i17 & 1024) != 0 ? null : qVar, (i17 & 2048) != 0 ? -1 : i14, (i17 & 4096) != 0 ? -1 : i15, (i17 & 8192) != 0 ? -1 : i16, (i17 & 16384) != 0 ? null : list4, (i17 & 32768) != 0 ? null : bool2, (i17 & 65536) != 0 ? null : t0Var, (i17 & 131072) != 0 ? null : bool3, (i17 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : bool4, (i17 & 524288) != 0 ? null : bool5, (i17 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool6, (i17 & 2097152) != 0 ? null : bool7, (i17 & 4194304) != 0 ? null : bool8, (i17 & 8388608) != 0 ? null : bool9, (i17 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bool10, (i17 & 33554432) != 0 ? null : bool11, (i17 & 67108864) != 0 ? null : bool12, (i17 & 134217728) != 0 ? null : bool13, (i17 & 268435456) != 0 ? null : bool14, (i17 & 536870912) != 0 ? false : z14, (i17 & 1073741824) != 0 ? null : bool15, (i17 & Integer.MIN_VALUE) != 0 ? null : bool16, (i18 & 1) != 0 ? null : num3, (i18 & 2) != 0 ? null : str4, (i18 & 4) != 0 ? null : str5, (i18 & 8) != 0 ? null : l14, (i18 & 16) != 0 ? null : l15, (i18 & 32) != 0 ? null : bool17, (i18 & 64) != 0 ? null : list5, (i18 & 128) != 0 ? null : a2Var, (i18 & 256) != 0 ? null : str6, (i18 & 512) != 0 ? null : str7, (i18 & 1024) != 0 ? null : str8, (i18 & 2048) != 0 ? null : bool18, (i18 & 4096) != 0 ? null : bool19, (i18 & 8192) != 0 ? null : bool20, (i18 & 16384) != 0 ? null : bool21, (i18 & 32768) != 0 ? null : list6, (i18 & 65536) != 0 ? null : str9, (i18 & 131072) != 0 ? null : list7, (i18 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? Boolean.FALSE : bool22);
    }

    public static a1 b(a1 a1Var, List list, String str, Boolean bool, boolean z14, Integer num, Long l14, Boolean bool2, String str2, int i14, int i15) {
        List list2 = (i14 & 1) != 0 ? a1Var.activityImages : list;
        Integer num2 = a1Var.agentApplicationInstallationId;
        String str3 = a1Var.agentString;
        String str4 = (i14 & 8) != 0 ? a1Var.associatedCourseId : str;
        String str5 = a1Var.associatedWorkoutId;
        Boolean bool3 = (i14 & 32) != 0 ? a1Var.autoCalcCalories : bool;
        List<Long> list3 = a1Var.childIds;
        List<String> list4 = a1Var.childActivityTypes;
        Integer num3 = a1Var.deviceApplicationInstallationId;
        x xVar = a1Var.calendarEventInfo;
        com.garmin.android.apps.connectmobile.activities.newmodel.q qVar = a1Var.deviceMetadataDTO;
        int i16 = a1Var.eBikeBatteryUsage;
        int i17 = a1Var.eBikeBatteryRemaining;
        int i18 = a1Var.eBikeMaxAssistModes;
        List<n0> list5 = a1Var.eBikeAssistModeInfoDTOList;
        Boolean bool4 = a1Var.elevationCorrected;
        t0 t0Var = a1Var.fileFormat;
        Boolean bool5 = a1Var.gcj02;
        Boolean bool6 = a1Var.hasChartData;
        Boolean bool7 = a1Var.hasIntensityIntervals;
        Boolean bool8 = a1Var.hasPolyline;
        Boolean bool9 = a1Var.hasHeatmap;
        Boolean bool10 = a1Var.hasPowerTimeInZones;
        Boolean bool11 = a1Var.hasStaminaSpeedTimeInZones;
        Boolean bool12 = a1Var.hasStaminaPowerTimeInZones;
        Boolean bool13 = a1Var.hasRunPowerWindData;
        Boolean bool14 = a1Var.hasSplits;
        Boolean bool15 = a1Var.isActivityTrimmed;
        Boolean bool16 = a1Var.isAtpActivity;
        boolean z15 = (i14 & 536870912) != 0 ? a1Var.isFavorite : z14;
        Boolean bool17 = a1Var.isManualActivity;
        Boolean bool18 = a1Var.isRunPowerWindEnabled;
        Integer num4 = (i15 & 1) != 0 ? a1Var.lapCount : num;
        String str6 = a1Var.lastUpdateDate;
        String str7 = a1Var.manufacturer;
        Long l15 = a1Var.curatedCourseId;
        Long l16 = (i15 & 16) != 0 ? a1Var.matchedCuratedCourseId : l14;
        Boolean bool19 = a1Var.personalRecord;
        List<m1> list6 = a1Var.sensors;
        a2 a2Var = a1Var.userInfoDto;
        String str8 = (i15 & 256) != 0 ? a1Var.videoUrl : null;
        String str9 = a1Var.groupRideUUID;
        String str10 = a1Var.cloudPositioningStatusString;
        Boolean bool20 = (i15 & 2048) != 0 ? a1Var.isWheelchair : bool2;
        Boolean bool21 = a1Var.hasHighResolutionLocationData;
        Boolean bool22 = a1Var.hasTimeInGearData;
        Boolean bool23 = a1Var.hasDog;
        List<Long> list7 = a1Var.dogProfileIds;
        String str11 = (i15 & 65536) != 0 ? a1Var.sessionResultType : str2;
        List<m1> list8 = a1Var.thirdPartyGymEquipment;
        Boolean bool24 = a1Var.hasMultiDayActivities;
        a1Var.getClass();
        return new a1(list2, num2, str3, str4, str5, bool3, list3, list4, num3, xVar, qVar, i16, i17, i18, list5, bool4, t0Var, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, z15, bool17, bool18, num4, str6, str7, l15, l16, bool19, list6, a2Var, str8, str9, str10, bool20, bool21, bool22, bool23, list7, str11, list8, bool24);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final t0 getFileFormat() {
        return this.fileFormat;
    }

    /* JADX INFO: renamed from: A0, reason: from getter */
    public final Boolean getIsAtpActivity() {
        return this.isAtpActivity;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getGroupRideUUID() {
        return this.groupRideUUID;
    }

    public final boolean C0() {
        z.a aVar = z.f140416b;
        String str = this.cloudPositioningStatusString;
        aVar.getClass();
        z zVarA = z.a.a(str);
        return (zVarA == null ? -1 : b.f139678a[zVarA.ordinal()]) == 1;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Boolean getHasChartData() {
        return this.hasChartData;
    }

    public final boolean E0() {
        n1 n1VarA;
        String str = this.sessionResultType;
        if (str != null) {
            n1.f139945b.getClass();
            n1VarA = n1.a.a(str);
        } else {
            n1VarA = null;
        }
        if (p005kotlin.jvm.internal.s.g(this.isManualActivity, Boolean.TRUE)) {
            return false;
        }
        return n1VarA == n1.SIMULATED || n1VarA == n1.ESTIMATED;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Boolean getHasDog() {
        return this.hasDog;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Boolean getHasHeatmap() {
        return this.hasHeatmap;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Boolean getHasHighResolutionLocationData() {
        return this.hasHighResolutionLocationData;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final Boolean getHasIntensityIntervals() {
        return this.hasIntensityIntervals;
    }

    /* JADX INFO: renamed from: J0, reason: from getter */
    public final Boolean getIsManualActivity() {
        return this.isManualActivity;
    }

    /* JADX INFO: renamed from: L0, reason: from getter */
    public final Boolean getIsWheelchair() {
        return this.isWheelchair;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final Boolean getHasMultiDayActivities() {
        return this.hasMultiDayActivities;
    }

    public final void M0(List<j> list) {
        this.activityImages = list;
    }

    public final void P0(String str) {
        this.agentString = str;
    }

    public final void Q0(String str) {
        this.associatedCourseId = str;
    }

    public final void R0(List<Long> list) {
        this.dogProfileIds = list;
    }

    public final void S0(Boolean bool) {
        this.hasDog = bool;
    }

    public final void V0(Integer num) {
        this.lapCount = num;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final Boolean getHasPolyline() {
        return this.hasPolyline;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final Boolean getHasPowerTimeInZones() {
        return this.hasPowerTimeInZones;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final Boolean getHasSplits() {
        return this.hasSplits;
    }

    public final List<j> d() {
        return this.activityImages;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final Boolean getHasStaminaPowerTimeInZones() {
        return this.hasStaminaPowerTimeInZones;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return p005kotlin.jvm.internal.s.g(this.activityImages, a1Var.activityImages) && p005kotlin.jvm.internal.s.g(this.agentApplicationInstallationId, a1Var.agentApplicationInstallationId) && p005kotlin.jvm.internal.s.g(this.agentString, a1Var.agentString) && p005kotlin.jvm.internal.s.g(this.associatedCourseId, a1Var.associatedCourseId) && p005kotlin.jvm.internal.s.g(this.associatedWorkoutId, a1Var.associatedWorkoutId) && p005kotlin.jvm.internal.s.g(this.autoCalcCalories, a1Var.autoCalcCalories) && p005kotlin.jvm.internal.s.g(this.childIds, a1Var.childIds) && p005kotlin.jvm.internal.s.g(this.childActivityTypes, a1Var.childActivityTypes) && p005kotlin.jvm.internal.s.g(this.deviceApplicationInstallationId, a1Var.deviceApplicationInstallationId) && p005kotlin.jvm.internal.s.g(this.calendarEventInfo, a1Var.calendarEventInfo) && p005kotlin.jvm.internal.s.g(this.deviceMetadataDTO, a1Var.deviceMetadataDTO) && this.eBikeBatteryUsage == a1Var.eBikeBatteryUsage && this.eBikeBatteryRemaining == a1Var.eBikeBatteryRemaining && this.eBikeMaxAssistModes == a1Var.eBikeMaxAssistModes && p005kotlin.jvm.internal.s.g(this.eBikeAssistModeInfoDTOList, a1Var.eBikeAssistModeInfoDTOList) && p005kotlin.jvm.internal.s.g(this.elevationCorrected, a1Var.elevationCorrected) && p005kotlin.jvm.internal.s.g(this.fileFormat, a1Var.fileFormat) && p005kotlin.jvm.internal.s.g(this.gcj02, a1Var.gcj02) && p005kotlin.jvm.internal.s.g(this.hasChartData, a1Var.hasChartData) && p005kotlin.jvm.internal.s.g(this.hasIntensityIntervals, a1Var.hasIntensityIntervals) && p005kotlin.jvm.internal.s.g(this.hasPolyline, a1Var.hasPolyline) && p005kotlin.jvm.internal.s.g(this.hasHeatmap, a1Var.hasHeatmap) && p005kotlin.jvm.internal.s.g(this.hasPowerTimeInZones, a1Var.hasPowerTimeInZones) && p005kotlin.jvm.internal.s.g(this.hasStaminaSpeedTimeInZones, a1Var.hasStaminaSpeedTimeInZones) && p005kotlin.jvm.internal.s.g(this.hasStaminaPowerTimeInZones, a1Var.hasStaminaPowerTimeInZones) && p005kotlin.jvm.internal.s.g(this.hasRunPowerWindData, a1Var.hasRunPowerWindData) && p005kotlin.jvm.internal.s.g(this.hasSplits, a1Var.hasSplits) && p005kotlin.jvm.internal.s.g(this.isActivityTrimmed, a1Var.isActivityTrimmed) && p005kotlin.jvm.internal.s.g(this.isAtpActivity, a1Var.isAtpActivity) && this.isFavorite == a1Var.isFavorite && p005kotlin.jvm.internal.s.g(this.isManualActivity, a1Var.isManualActivity) && p005kotlin.jvm.internal.s.g(this.isRunPowerWindEnabled, a1Var.isRunPowerWindEnabled) && p005kotlin.jvm.internal.s.g(this.lapCount, a1Var.lapCount) && p005kotlin.jvm.internal.s.g(this.lastUpdateDate, a1Var.lastUpdateDate) && p005kotlin.jvm.internal.s.g(this.manufacturer, a1Var.manufacturer) && p005kotlin.jvm.internal.s.g(this.curatedCourseId, a1Var.curatedCourseId) && p005kotlin.jvm.internal.s.g(this.matchedCuratedCourseId, a1Var.matchedCuratedCourseId) && p005kotlin.jvm.internal.s.g(this.personalRecord, a1Var.personalRecord) && p005kotlin.jvm.internal.s.g(this.sensors, a1Var.sensors) && p005kotlin.jvm.internal.s.g(this.userInfoDto, a1Var.userInfoDto) && p005kotlin.jvm.internal.s.g(this.videoUrl, a1Var.videoUrl) && p005kotlin.jvm.internal.s.g(this.groupRideUUID, a1Var.groupRideUUID) && p005kotlin.jvm.internal.s.g(this.cloudPositioningStatusString, a1Var.cloudPositioningStatusString) && p005kotlin.jvm.internal.s.g(this.isWheelchair, a1Var.isWheelchair) && p005kotlin.jvm.internal.s.g(this.hasHighResolutionLocationData, a1Var.hasHighResolutionLocationData) && p005kotlin.jvm.internal.s.g(this.hasTimeInGearData, a1Var.hasTimeInGearData) && p005kotlin.jvm.internal.s.g(this.hasDog, a1Var.hasDog) && p005kotlin.jvm.internal.s.g(this.dogProfileIds, a1Var.dogProfileIds) && p005kotlin.jvm.internal.s.g(this.sessionResultType, a1Var.sessionResultType) && p005kotlin.jvm.internal.s.g(this.thirdPartyGymEquipment, a1Var.thirdPartyGymEquipment) && p005kotlin.jvm.internal.s.g(this.hasMultiDayActivities, a1Var.hasMultiDayActivities);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getAgentApplicationInstallationId() {
        return this.agentApplicationInstallationId;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final Boolean getHasStaminaSpeedTimeInZones() {
        return this.hasStaminaSpeedTimeInZones;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getAssociatedCourseId() {
        return this.associatedCourseId;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final Boolean getHasTimeInGearData() {
        return this.hasTimeInGearData;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getAssociatedWorkoutId() {
        return this.associatedWorkoutId;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final Integer getLapCount() {
        return this.lapCount;
    }

    public final int hashCode() {
        List<j> list = this.activityImages;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.agentApplicationInstallationId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.agentString;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.associatedCourseId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.associatedWorkoutId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.autoCalcCalories;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Long> list2 = this.childIds;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.childActivityTypes;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num2 = this.deviceApplicationInstallationId;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        x xVar = this.calendarEventInfo;
        int iHashCode10 = (iHashCode9 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.activities.newmodel.q qVar = this.deviceMetadataDTO;
        int iD = q2.d(this.eBikeMaxAssistModes, q2.d(this.eBikeBatteryRemaining, q2.d(this.eBikeBatteryUsage, (iHashCode10 + (qVar == null ? 0 : qVar.hashCode())) * 31, 31), 31), 31);
        List<n0> list4 = this.eBikeAssistModeInfoDTOList;
        int iHashCode11 = (iD + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool2 = this.elevationCorrected;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        t0 t0Var = this.fileFormat;
        int iHashCode13 = (iHashCode12 + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        Boolean bool3 = this.gcj02;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasChartData;
        int iHashCode15 = (iHashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.hasIntensityIntervals;
        int iHashCode16 = (iHashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.hasPolyline;
        int iHashCode17 = (iHashCode16 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.hasHeatmap;
        int iHashCode18 = (iHashCode17 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.hasPowerTimeInZones;
        int iHashCode19 = (iHashCode18 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.hasStaminaSpeedTimeInZones;
        int iHashCode20 = (iHashCode19 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.hasStaminaPowerTimeInZones;
        int iHashCode21 = (iHashCode20 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.hasRunPowerWindData;
        int iHashCode22 = (iHashCode21 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.hasSplits;
        int iHashCode23 = (iHashCode22 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.isActivityTrimmed;
        int iHashCode24 = (iHashCode23 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.isAtpActivity;
        int iG = q6.f.g((iHashCode24 + (bool14 == null ? 0 : bool14.hashCode())) * 31, 31, this.isFavorite);
        Boolean bool15 = this.isManualActivity;
        int iHashCode25 = (iG + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.isRunPowerWindEnabled;
        int iHashCode26 = (iHashCode25 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Integer num3 = this.lapCount;
        int iHashCode27 = (iHashCode26 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.lastUpdateDate;
        int iHashCode28 = (iHashCode27 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.manufacturer;
        int iHashCode29 = (iHashCode28 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l14 = this.curatedCourseId;
        int iHashCode30 = (iHashCode29 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.matchedCuratedCourseId;
        int iHashCode31 = (iHashCode30 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Boolean bool17 = this.personalRecord;
        int iHashCode32 = (iHashCode31 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        List<m1> list5 = this.sensors;
        int iHashCode33 = (iHashCode32 + (list5 == null ? 0 : list5.hashCode())) * 31;
        a2 a2Var = this.userInfoDto;
        int iHashCode34 = (iHashCode33 + (a2Var == null ? 0 : a2Var.hashCode())) * 31;
        String str6 = this.videoUrl;
        int iHashCode35 = (iHashCode34 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.groupRideUUID;
        int iHashCode36 = (iHashCode35 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cloudPositioningStatusString;
        int iHashCode37 = (iHashCode36 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool18 = this.isWheelchair;
        int iHashCode38 = (iHashCode37 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.hasHighResolutionLocationData;
        int iHashCode39 = (iHashCode38 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.hasTimeInGearData;
        int iHashCode40 = (iHashCode39 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.hasDog;
        int iHashCode41 = (iHashCode40 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        List<Long> list6 = this.dogProfileIds;
        int iHashCode42 = (iHashCode41 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str9 = this.sessionResultType;
        int iHashCode43 = (iHashCode42 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<m1> list7 = this.thirdPartyGymEquipment;
        int iHashCode44 = (iHashCode43 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Boolean bool22 = this.hasMultiDayActivities;
        return iHashCode44 + (bool22 != null ? bool22.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getAutoCalcCalories() {
        return this.autoCalcCalories;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final x getCalendarEventInfo() {
        return this.calendarEventInfo;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final Long getMatchedCuratedCourseId() {
        return this.matchedCuratedCourseId;
    }

    public final List<String> k() {
        return this.childActivityTypes;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final Boolean getPersonalRecord() {
        return this.personalRecord;
    }

    public final List<Long> m() {
        return this.childIds;
    }

    public final List<m1> n0() {
        return this.sensors;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Long getCuratedCourseId() {
        return this.curatedCourseId;
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final String getSessionResultType() {
        return this.sessionResultType;
    }

    public final List<m1> p0() {
        return this.thirdPartyGymEquipment;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getDeviceApplicationInstallationId() {
        return this.deviceApplicationInstallationId;
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final a2 getUserInfoDto() {
        return this.userInfoDto;
    }

    /* JADX INFO: renamed from: q1, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final com.garmin.android.apps.connectmobile.activities.newmodel.q getDeviceMetadataDTO() {
        return this.deviceMetadataDTO;
    }

    public final List<Long> s() {
        return this.dogProfileIds;
    }

    public final List<n0> t() {
        return this.eBikeAssistModeInfoDTOList;
    }

    public final String toString() {
        List<j> list = this.activityImages;
        Integer num = this.agentApplicationInstallationId;
        String str = this.agentString;
        String str2 = this.associatedCourseId;
        String str3 = this.associatedWorkoutId;
        Boolean bool = this.autoCalcCalories;
        List<Long> list2 = this.childIds;
        List<String> list3 = this.childActivityTypes;
        Integer num2 = this.deviceApplicationInstallationId;
        x xVar = this.calendarEventInfo;
        com.garmin.android.apps.connectmobile.activities.newmodel.q qVar = this.deviceMetadataDTO;
        int i14 = this.eBikeBatteryUsage;
        int i15 = this.eBikeBatteryRemaining;
        int i16 = this.eBikeMaxAssistModes;
        List<n0> list4 = this.eBikeAssistModeInfoDTOList;
        Boolean bool2 = this.elevationCorrected;
        t0 t0Var = this.fileFormat;
        Boolean bool3 = this.gcj02;
        Boolean bool4 = this.hasChartData;
        Boolean bool5 = this.hasIntensityIntervals;
        Boolean bool6 = this.hasPolyline;
        Boolean bool7 = this.hasHeatmap;
        Boolean bool8 = this.hasPowerTimeInZones;
        Boolean bool9 = this.hasStaminaSpeedTimeInZones;
        Boolean bool10 = this.hasStaminaPowerTimeInZones;
        Boolean bool11 = this.hasRunPowerWindData;
        Boolean bool12 = this.hasSplits;
        Boolean bool13 = this.isActivityTrimmed;
        Boolean bool14 = this.isAtpActivity;
        boolean z14 = this.isFavorite;
        Boolean bool15 = this.isManualActivity;
        Boolean bool16 = this.isRunPowerWindEnabled;
        Integer num3 = this.lapCount;
        String str4 = this.lastUpdateDate;
        String str5 = this.manufacturer;
        Long l14 = this.curatedCourseId;
        Long l15 = this.matchedCuratedCourseId;
        Boolean bool17 = this.personalRecord;
        List<m1> list5 = this.sensors;
        a2 a2Var = this.userInfoDto;
        String str6 = this.videoUrl;
        String str7 = this.groupRideUUID;
        String str8 = this.cloudPositioningStatusString;
        Boolean bool18 = this.isWheelchair;
        Boolean bool19 = this.hasHighResolutionLocationData;
        Boolean bool20 = this.hasTimeInGearData;
        Boolean bool21 = this.hasDog;
        List<Long> list6 = this.dogProfileIds;
        String str9 = this.sessionResultType;
        List<m1> list7 = this.thirdPartyGymEquipment;
        Boolean bool22 = this.hasMultiDayActivities;
        StringBuilder sb3 = new StringBuilder("MetadataDTO(activityImages=");
        sb3.append(list);
        sb3.append(", agentApplicationInstallationId=");
        sb3.append(num);
        sb3.append(", agentString=");
        sn.a.t(sb3, str, ", associatedCourseId=", str2, ", associatedWorkoutId=");
        b71.i.w(sb3, str3, ", autoCalcCalories=", bool, ", childIds=");
        n23.j.z(sb3, list2, ", childActivityTypes=", list3, ", deviceApplicationInstallationId=");
        sb3.append(num2);
        sb3.append(", calendarEventInfo=");
        sb3.append(xVar);
        sb3.append(", deviceMetadataDTO=");
        sb3.append(qVar);
        sb3.append(", eBikeBatteryUsage=");
        sb3.append(i14);
        sb3.append(", eBikeBatteryRemaining=");
        ds.e0.m(i15, i16, ", eBikeMaxAssistModes=", ", eBikeAssistModeInfoDTOList=", sb3);
        sb3.append(list4);
        sb3.append(", elevationCorrected=");
        sb3.append(bool2);
        sb3.append(", fileFormat=");
        sb3.append(t0Var);
        sb3.append(", gcj02=");
        sb3.append(bool3);
        sb3.append(", hasChartData=");
        b71.i.o(bool4, bool5, ", hasIntensityIntervals=", ", hasPolyline=", sb3);
        b71.i.o(bool6, bool7, ", hasHeatmap=", ", hasPowerTimeInZones=", sb3);
        b71.i.o(bool8, bool9, ", hasStaminaSpeedTimeInZones=", ", hasStaminaPowerTimeInZones=", sb3);
        b71.i.o(bool10, bool11, ", hasRunPowerWindData=", ", hasSplits=", sb3);
        b71.i.o(bool12, bool13, ", isActivityTrimmed=", ", isAtpActivity=", sb3);
        sb3.append(bool14);
        sb3.append(", isFavorite=");
        sb3.append(z14);
        sb3.append(", isManualActivity=");
        b71.i.o(bool15, bool16, ", isRunPowerWindEnabled=", ", lapCount=", sb3);
        p6.b.l(num3, ", lastUpdateDate=", str4, ", manufacturer=", sb3);
        n23.j.q(l14, str5, ", curatedCourseId=", ", matchedCuratedCourseId=", sb3);
        sb3.append(l15);
        sb3.append(", personalRecord=");
        sb3.append(bool17);
        sb3.append(", sensors=");
        sb3.append(list5);
        sb3.append(", userInfoDto=");
        sb3.append(a2Var);
        sb3.append(", videoUrl=");
        sn.a.t(sb3, str6, ", groupRideUUID=", str7, ", cloudPositioningStatusString=");
        b71.i.w(sb3, str8, ", isWheelchair=", bool18, ", hasHighResolutionLocationData=");
        b71.i.o(bool19, bool20, ", hasTimeInGearData=", ", hasDog=", sb3);
        sb3.append(bool21);
        sb3.append(", dogProfileIds=");
        sb3.append(list6);
        sb3.append(", sessionResultType=");
        v.e0.o(str9, ", thirdPartyGymEquipment=", ", hasMultiDayActivities=", sb3, list7);
        return p6.b.f(sb3, bool22, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getEBikeBatteryRemaining() {
        return this.eBikeBatteryRemaining;
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<j> list = this.activityImages;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = lc.u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((j) itO.next()).writeToParcel(parcel, i14);
            }
        }
        Integer num = this.agentApplicationInstallationId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.agentString);
        parcel.writeString(this.associatedCourseId);
        parcel.writeString(this.associatedWorkoutId);
        Boolean bool = this.autoCalcCalories;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        List<Long> list2 = this.childIds;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = lc.u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                parcel.writeLong(((Number) itO2.next()).longValue());
            }
        }
        parcel.writeStringList(this.childActivityTypes);
        Integer num2 = this.deviceApplicationInstallationId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        x xVar = this.calendarEventInfo;
        if (xVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xVar.writeToParcel(parcel, i14);
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.q qVar = this.deviceMetadataDTO;
        if (qVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qVar.writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.eBikeBatteryUsage);
        parcel.writeInt(this.eBikeBatteryRemaining);
        parcel.writeInt(this.eBikeMaxAssistModes);
        List<n0> list3 = this.eBikeAssistModeInfoDTOList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = lc.u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                ((n0) itO3.next()).writeToParcel(parcel, i14);
            }
        }
        Boolean bool2 = this.elevationCorrected;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        t0 t0Var = this.fileFormat;
        if (t0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            t0Var.writeToParcel(parcel, i14);
        }
        Boolean bool3 = this.gcj02;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Boolean bool4 = this.hasChartData;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
        Boolean bool5 = this.hasIntensityIntervals;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool5);
        }
        Boolean bool6 = this.hasPolyline;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool6);
        }
        Boolean bool7 = this.hasHeatmap;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool7);
        }
        Boolean bool8 = this.hasPowerTimeInZones;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool8);
        }
        Boolean bool9 = this.hasStaminaSpeedTimeInZones;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool9);
        }
        Boolean bool10 = this.hasStaminaPowerTimeInZones;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool10);
        }
        Boolean bool11 = this.hasRunPowerWindData;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool11);
        }
        Boolean bool12 = this.hasSplits;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool12);
        }
        Boolean bool13 = this.isActivityTrimmed;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool13);
        }
        Boolean bool14 = this.isAtpActivity;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool14);
        }
        parcel.writeInt(this.isFavorite ? 1 : 0);
        Boolean bool15 = this.isManualActivity;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool15);
        }
        Boolean bool16 = this.isRunPowerWindEnabled;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool16);
        }
        Integer num3 = this.lapCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        parcel.writeString(this.lastUpdateDate);
        parcel.writeString(this.manufacturer);
        Long l14 = this.curatedCourseId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.matchedCuratedCourseId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Boolean bool17 = this.personalRecord;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool17);
        }
        List<m1> list4 = this.sensors;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO4 = lc.u0.o(parcel, list4, 1);
            while (itO4.hasNext()) {
                ((m1) itO4.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeParcelable(this.userInfoDto, i14);
        parcel.writeString(this.videoUrl);
        parcel.writeString(this.groupRideUUID);
        parcel.writeString(this.cloudPositioningStatusString);
        Boolean bool18 = this.isWheelchair;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool18);
        }
        Boolean bool19 = this.hasHighResolutionLocationData;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool19);
        }
        Boolean bool20 = this.hasTimeInGearData;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool20);
        }
        Boolean bool21 = this.hasDog;
        if (bool21 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool21);
        }
        List<Long> list5 = this.dogProfileIds;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO5 = lc.u0.o(parcel, list5, 1);
            while (itO5.hasNext()) {
                parcel.writeLong(((Number) itO5.next()).longValue());
            }
        }
        parcel.writeString(this.sessionResultType);
        List<m1> list6 = this.thirdPartyGymEquipment;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO6 = lc.u0.o(parcel, list6, 1);
            while (itO6.hasNext()) {
                ((m1) itO6.next()).writeToParcel(parcel, i14);
            }
        }
        Boolean bool22 = this.hasMultiDayActivities;
        if (bool22 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool22);
        }
    }

    public final e2 x0() {
        Boolean bool = this.isRunPowerWindEnabled;
        Boolean bool2 = Boolean.TRUE;
        if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
            return p005kotlin.jvm.internal.s.g(this.hasRunPowerWindData, bool2) ? e2.ENABLE : e2.UNAVAILABLE;
        }
        return p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE) ? e2.DISABLE : e2.NONE;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getEBikeBatteryUsage() {
        return this.eBikeBatteryUsage;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final int getEBikeMaxAssistModes() {
        return this.eBikeMaxAssistModes;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final Boolean getIsActivityTrimmed() {
        return this.isActivityTrimmed;
    }

    public a1(List<j> list, Integer num, String str, String str2, String str3, Boolean bool, List<Long> list2, List<String> list3, Integer num2, x xVar, com.garmin.android.apps.connectmobile.activities.newmodel.q qVar, int i14, int i15, int i16, List<n0> list4, Boolean bool2, t0 t0Var, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, boolean z14, Boolean bool15, Boolean bool16, Integer num3, String str4, String str5, Long l14, Long l15, Boolean bool17, List<m1> list5, a2 a2Var, String str6, String str7, String str8, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, List<Long> list6, String str9, List<m1> list7, Boolean bool22) {
        this.activityImages = list;
        this.agentApplicationInstallationId = num;
        this.agentString = str;
        this.associatedCourseId = str2;
        this.associatedWorkoutId = str3;
        this.autoCalcCalories = bool;
        this.childIds = list2;
        this.childActivityTypes = list3;
        this.deviceApplicationInstallationId = num2;
        this.calendarEventInfo = xVar;
        this.deviceMetadataDTO = qVar;
        this.eBikeBatteryUsage = i14;
        this.eBikeBatteryRemaining = i15;
        this.eBikeMaxAssistModes = i16;
        this.eBikeAssistModeInfoDTOList = list4;
        this.elevationCorrected = bool2;
        this.fileFormat = t0Var;
        this.gcj02 = bool3;
        this.hasChartData = bool4;
        this.hasIntensityIntervals = bool5;
        this.hasPolyline = bool6;
        this.hasHeatmap = bool7;
        this.hasPowerTimeInZones = bool8;
        this.hasStaminaSpeedTimeInZones = bool9;
        this.hasStaminaPowerTimeInZones = bool10;
        this.hasRunPowerWindData = bool11;
        this.hasSplits = bool12;
        this.isActivityTrimmed = bool13;
        this.isAtpActivity = bool14;
        this.isFavorite = z14;
        this.isManualActivity = bool15;
        this.isRunPowerWindEnabled = bool16;
        this.lapCount = num3;
        this.lastUpdateDate = str4;
        this.manufacturer = str5;
        this.curatedCourseId = l14;
        this.matchedCuratedCourseId = l15;
        this.personalRecord = bool17;
        this.sensors = list5;
        this.userInfoDto = a2Var;
        this.videoUrl = str6;
        this.groupRideUUID = str7;
        this.cloudPositioningStatusString = str8;
        this.isWheelchair = bool18;
        this.hasHighResolutionLocationData = bool19;
        this.hasTimeInGearData = bool20;
        this.hasDog = bool21;
        this.dogProfileIds = list6;
        this.sessionResultType = str9;
        this.thirdPartyGymEquipment = list7;
        this.hasMultiDayActivities = bool22;
    }

    public a1() {
        this(null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 524287, null);
    }
}
