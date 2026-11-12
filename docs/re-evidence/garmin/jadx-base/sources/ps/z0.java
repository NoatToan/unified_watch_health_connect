package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\bq\b\u0087\b\u0018\u00002\u00020\u0001B×\u0005\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bB\u0010CR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010E\u001a\u0004\bM\u0010GR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bO\u0010KR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010E\u001a\u0004\bQ\u0010GR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010E\u001a\u0004\bH\u0010GR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010E\u001a\u0004\bR\u0010GR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010E\u001a\u0004\bN\u0010GR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010E\u001a\u0004\bV\u0010GR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010E\u001a\u0004\bX\u0010GR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010E\u001a\u0004\bS\u0010GR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010E\u001a\u0004\b[\u0010GR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010E\u001a\u0004\bT\u0010GR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010E\u001a\u0004\bU\u0010GR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010E\u001a\u0004\bW\u0010GR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010E\u001a\u0004\bY\u0010GR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010E\u001a\u0004\ba\u0010GR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010E\u001a\u0004\b\\\u0010GR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010E\u001a\u0004\b^\u0010GR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010E\u001a\u0004\b`\u0010GR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\be\u0010E\u001a\u0004\bb\u0010GR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010E\u001a\u0004\bg\u0010GR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010E\u001a\u0004\bi\u0010GR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010E\u001a\u0004\bk\u0010GR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010E\u001a\u0004\bm\u0010GR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010E\u001a\u0004\bo\u0010GR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bp\u0010E\u001a\u0004\bq\u0010GR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010E\u001a\u0004\bw\u0010GR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bx\u0010E\u001a\u0004\by\u0010GR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bz\u0010E\u001a\u0004\bc\u0010GR\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010E\u001a\u0004\b|\u0010GR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010E\u001a\u0004\b~\u0010GR\u001d\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u007f\u0010E\u001a\u0005\b\u0080\u0001\u0010GR\u001e\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010E\u001a\u0005\b\u0082\u0001\u0010GR\u001d\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0083\u0001\u0010E\u001a\u0004\bh\u0010GR\u001e\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010E\u001a\u0005\b\u0085\u0001\u0010GR\u001e\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010E\u001a\u0005\b\u0087\u0001\u0010GR\u001e\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010E\u001a\u0005\b\u0089\u0001\u0010GR\u001d\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u008a\u0001\u0010E\u001a\u0004\bj\u0010GR\u001d\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u008b\u0001\u0010E\u001a\u0004\bl\u0010GR\u001e\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010E\u001a\u0005\b\u008d\u0001\u0010GR\u001e\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010E\u001a\u0005\b\u008f\u0001\u0010GR\u001e\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010E\u001a\u0005\b\u0091\u0001\u0010GR\u001e\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010E\u001a\u0005\b\u0093\u0001\u0010GR\u001e\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010E\u001a\u0005\b\u0095\u0001\u0010GR\u001e\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010E\u001a\u0005\b\u0097\u0001\u0010GR\u001e\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010E\u001a\u0005\b\u0099\u0001\u0010GR\u001d\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u009a\u0001\u0010E\u001a\u0004\bp\u0010GR\u001d\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u009b\u0001\u0010E\u001a\u0004\br\u0010GR\u001d\u00107\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u009c\u0001\u0010I\u001a\u0004\bx\u0010KR\u001e\u00108\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010I\u001a\u0005\b\u009e\u0001\u0010KR\u001e\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010E\u001a\u0005\b \u0001\u0010GR\u001e\u0010:\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¡\u0001\u0010I\u001a\u0005\b¢\u0001\u0010KR\u001e\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b£\u0001\u0010E\u001a\u0005\b¤\u0001\u0010GR\u001d\u0010<\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b¥\u0001\u0010E\u001a\u0004\bz\u0010GR\u001e\u0010=\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¦\u0001\u0010I\u001a\u0005\b§\u0001\u0010KR\u001e\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¨\u0001\u0010E\u001a\u0005\b©\u0001\u0010GR \u0010@\u001a\u0004\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001e\u0010A\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b®\u0001\u0010E\u001a\u0005\b¯\u0001\u0010G¨\u0006°\u0001"}, d2 = {"Lps/z0;", "Landroid/os/Parcelable;", "", "aerobicTrainingEffect", "", "aerobicTrainingEffectMessage", "anaerobicTrainingEffect", "anaerobicTrainingEffectMessage", "averageBikeCadence", "averageHR", "averageSWOLF", "averageMovingSpeed", "averagePower", "averageRunCadence", "averageSpeed", "averageSwimCadence", "averageTemperature", "calories", "distance", "duration", "elapsedDuration", "elevationGain", "elevationLoss", "endLatitude", "endLongitude", "functionalThresholdPower", "groundContactTime", "intensityFactor", "leftBalance", "leftPedalSmoothness", "leftTorqueEffectiveness", "", "lengthIndex", "maxBikeCadence", "maxElevation", "maxHR", "maxPower", "maxPowerTwentyMinutes", "maxRunCadence", "maxSpeed", "maxTemperature", "minElevation", "minPower", "minSwimCadence", "minTemperature", "movingDuration", "normalizedPower", "numberOfActiveLengths", "poolLength", "restingCalories", "rightBalance", "rightPedalSmoothness", "rightTorqueEffectiveness", "startLatitude", "startLongitude", "startTimeGMT", "startTimeLocal", "strideLength", "swimStroke", "totalWork", "totalNumberOfStrokes", "trainingEffectLabel", "trainingStressScore", "Lps/z1;", "unitOfPoolLength", "verticalOscillation", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Lps/z1;Ljava/lang/Double;)V", "a", "Ljava/lang/Double;", "getAerobicTrainingEffect", "()Ljava/lang/Double;", "b", "Ljava/lang/String;", "getAerobicTrainingEffectMessage", "()Ljava/lang/String;", "c", "getAnaerobicTrainingEffect", "d", "getAnaerobicTrainingEffectMessage", JWKParameterNames.RSA_EXPONENT, "getAverageBikeCadence", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "getAveragePower", "j", "getAverageRunCadence", JWKParameterNames.OCT_KEY_VALUE, "l", "getAverageSwimCadence", "m", JWKParameterNames.RSA_MODULUS, "o", "p", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getElapsedDuration", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "v", "w", "x", "getFunctionalThresholdPower", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "getGroundContactTime", "z", "getIntensityFactor", "A", "getLeftBalance", "B", "getLeftPedalSmoothness", "C", "getLeftTorqueEffectiveness", "D", "Ljava/lang/Integer;", "s", "()Ljava/lang/Integer;", "E", "getMaxBikeCadence", "F", "getMaxElevation", "I", "P", "getMaxPower", "T", "getMaxPowerTwentyMinutes", "X", "getMaxRunCadence", "Y", "u", "Z", "k0", "getMinElevation", "H0", "getMinPower", "I0", "getMinSwimCadence", "J0", "K0", "L0", "getNormalizedPower", "M0", "getNumberOfActiveLengths", "N0", "getPoolLength", "O0", "getRestingCalories", "P0", "getRightBalance", "Q0", "getRightPedalSmoothness", "R0", "getRightTorqueEffectiveness", "S0", "T0", "U0", "V0", "getStartTimeLocal", "W0", "G", "X0", "H", "Y0", "getTotalWork", "Z0", "a1", "getTrainingEffectLabel", "b1", "getTrainingStressScore", "c1", "Lps/z1;", "getUnitOfPoolLength", "()Lps/z1;", "d1", "getVerticalOscillation", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z0 implements Parcelable {
    public static final Parcelable.Creator<z0> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("leftBalance")
    private final Double leftBalance;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("leftPedalSmoothness")
    private final Double leftPedalSmoothness;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("leftTorqueEffectiveness")
    private final Double leftTorqueEffectiveness;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("lengthIndex")
    private final Integer lengthIndex;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("maxBikeCadence")
    private final Double maxBikeCadence;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("maxElevation")
    private final Double maxElevation;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @SerializedName("minPower")
    private final Double minPower;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("maxHR")
    private final Double maxHR;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @SerializedName("minSwimCadence")
    private final Double minSwimCadence;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @SerializedName("minTemperature")
    private final Double minTemperature;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @SerializedName("movingDuration")
    private final Double movingDuration;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @SerializedName("normalizedPower")
    private final Double normalizedPower;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @SerializedName("numberOfActiveLengths")
    private final Double numberOfActiveLengths;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @SerializedName("poolLength")
    private final Double poolLength;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @SerializedName("bmrCalories")
    private final Double restingCalories;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("maxPower")
    private final Double maxPower;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @SerializedName("rightBalance")
    private final Double rightBalance;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @SerializedName("rightPedalSmoothness")
    private final Double rightPedalSmoothness;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @SerializedName("rightTorqueEffectiveness")
    private final Double rightTorqueEffectiveness;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @SerializedName("startLatitude")
    private final Double startLatitude;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("maxPowerTwentyMinutes")
    private final Double maxPowerTwentyMinutes;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @SerializedName("startLongitude")
    private final Double startLongitude;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @SerializedName("startTimeGMT")
    private final String startTimeGMT;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @SerializedName("startTimeLocal")
    private final String startTimeLocal;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    @SerializedName("strideLength")
    private final Double strideLength;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("maxRunCadence")
    private final Double maxRunCadence;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    @SerializedName("swimStroke")
    private final String swimStroke;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @SerializedName("maxSpeed")
    private final Double maxSpeed;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    @SerializedName("totalWork")
    private final Double totalWork;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @SerializedName("maxTemperature")
    private final Double maxTemperature;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    @SerializedName("totalNumberOfStrokes")
    private final Double totalNumberOfStrokes;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingEffect")
    private final Double aerobicTrainingEffect;

    /* JADX INFO: renamed from: a1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingEffectLabel")
    private final String trainingEffectLabel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("aerobicTrainingEffectMessage")
    private final String aerobicTrainingEffectMessage;

    /* JADX INFO: renamed from: b1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingStressScore")
    private final Double trainingStressScore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("anaerobicTrainingEffect")
    private final Double anaerobicTrainingEffect;

    /* JADX INFO: renamed from: c1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitOfPoolLength")
    private final z1 unitOfPoolLength;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("anaerobicTrainingEffectMessage")
    private final String anaerobicTrainingEffectMessage;

    /* JADX INFO: renamed from: d1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("verticalOscillation")
    private final Double verticalOscillation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageBikeCadence")
    private final Double averageBikeCadence;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageHR")
    private final Double averageHR;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSWOLF")
    private final Double averageSWOLF;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageMovingSpeed")
    private final Double averageMovingSpeed;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averagePower")
    private final Double averagePower;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageRunCadence")
    private final Double averageRunCadence;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSpeed")
    private final Double averageSpeed;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minElevation")
    private final Double minElevation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSwimCadence")
    private final Double averageSwimCadence;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageTemperature")
    private final Double averageTemperature;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calories")
    private final Double calories;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private final Double distance;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final Double duration;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elapsedDuration")
    private final Double elapsedDuration;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationGain")
    private final Double elevationGain;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationLoss")
    private final Double elevationLoss;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endLatitude")
    private final Double endLatitude;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endLongitude")
    private final Double endLongitude;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("functionalThresholdPower")
    private final Double functionalThresholdPower;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groundContactTime")
    private final Double groundContactTime;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("intensityFactor")
    private final Double intensityFactor;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<z0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final z0 createFromParcel(Parcel parcel) {
            Double dValueOf;
            Double d14;
            Double dValueOf2;
            Double d15;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                dValueOf = null;
                d14 = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
                d14 = null;
            }
            String string = parcel.readString();
            Double dValueOf3 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            String string2 = parcel.readString();
            Double dValueOf4 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf5 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf6 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf7 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf8 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf9 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf10 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf11 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf12 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf13 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf14 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf15 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf16 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf17 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf18 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf19 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf20 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf21 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf22 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf23 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf24 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf25 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf26 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Object objValueOf = parcel.readInt() == 0 ? d14 : Integer.valueOf(parcel.readInt());
            Double dValueOf27 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf28 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf29 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf30 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf31 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf32 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf33 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf34 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf35 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf36 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf37 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf38 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf39 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf40 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf41 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf42 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf43 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf44 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf45 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf46 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf47 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            Double dValueOf48 = parcel.readInt() == 0 ? d14 : Double.valueOf(parcel.readDouble());
            String string3 = parcel.readString();
            Double d16 = d14;
            Double d17 = dValueOf3;
            Double d18 = dValueOf4;
            Double d19 = dValueOf5;
            Double d24 = dValueOf6;
            Double d25 = dValueOf7;
            Double d26 = dValueOf8;
            Double d27 = dValueOf9;
            Double d28 = dValueOf10;
            Double d29 = dValueOf11;
            Double d34 = dValueOf12;
            Double d35 = dValueOf13;
            Double d36 = dValueOf14;
            Double d37 = dValueOf15;
            Double d38 = dValueOf16;
            Double d39 = dValueOf17;
            Double d44 = dValueOf18;
            Double d45 = dValueOf19;
            Double d46 = dValueOf20;
            Double d47 = dValueOf21;
            Double d48 = dValueOf22;
            Double d49 = dValueOf23;
            Double d54 = dValueOf24;
            Double d55 = dValueOf25;
            Double d56 = dValueOf26;
            Integer num = objValueOf;
            Double d57 = dValueOf27;
            Double d58 = dValueOf28;
            Double d59 = dValueOf29;
            Double d64 = dValueOf30;
            Double d65 = dValueOf31;
            Double d66 = dValueOf32;
            Double d67 = dValueOf33;
            Double d68 = dValueOf34;
            Double d69 = dValueOf35;
            Double d74 = dValueOf36;
            Double d75 = dValueOf37;
            Double d76 = dValueOf38;
            Double d77 = dValueOf39;
            Double d78 = dValueOf40;
            Double d79 = dValueOf41;
            Double d84 = dValueOf42;
            Double d85 = dValueOf43;
            Double d86 = dValueOf44;
            Double d87 = dValueOf45;
            Double d88 = dValueOf46;
            Double d89 = dValueOf47;
            Double d93 = dValueOf48;
            String string4 = parcel.readString();
            Double dValueOf49 = parcel.readInt() == 0 ? d16 : Double.valueOf(parcel.readDouble());
            String string5 = parcel.readString();
            Double dValueOf50 = parcel.readInt() == 0 ? d16 : Double.valueOf(parcel.readDouble());
            Double dValueOf51 = parcel.readInt() == 0 ? d16 : Double.valueOf(parcel.readDouble());
            String string6 = parcel.readString();
            Double dValueOf52 = parcel.readInt() == 0 ? d16 : Double.valueOf(parcel.readDouble());
            Double d94 = dValueOf;
            z1 z1Var = (z1) parcel.readParcelable(z0.class.getClassLoader());
            if (parcel.readInt() == 0) {
                d15 = d94;
                dValueOf2 = d16;
            } else {
                dValueOf2 = Double.valueOf(parcel.readDouble());
                d15 = d94;
            }
            return new z0(d15, string, d17, string2, d18, d19, d24, d25, d26, d27, d28, d29, d34, d35, d36, d37, d38, d39, d44, d45, d46, d47, d48, d49, d54, d55, d56, num, d57, d58, d59, d64, d65, d66, d67, d68, d69, d74, d75, d76, d77, d78, d79, d84, d85, d86, d87, d88, d89, d93, string3, string4, dValueOf49, string5, dValueOf50, dValueOf51, string6, dValueOf52, z1Var, dValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final z0[] newArray(int i14) {
            return new z0[i14];
        }
    }

    static {
        z1.Companion companion = z1.INSTANCE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ z0(Double d14, String str, Double d15, String str2, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44, Double d45, Double d46, Double d47, Double d48, Double d49, Double d54, Integer num, Double d55, Double d56, Double d57, Double d58, Double d59, Double d64, Double d65, Double d66, Double d67, Double d68, Double d69, Double d74, Double d75, Double d76, Double d77, Double d78, Double d79, Double d84, Double d85, Double d86, Double d87, Double d88, String str3, String str4, Double d89, String str5, Double d93, Double d94, String str6, Double d95, z1 z1Var, Double d96, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        Double d97 = (i14 & 1) != 0 ? null : d14;
        this(d97, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : d16, (i14 & 32) != 0 ? null : d17, (i14 & 64) != 0 ? null : d18, (i14 & 128) != 0 ? null : d19, (i14 & 256) != 0 ? null : d24, (i14 & 512) != 0 ? null : d25, (i14 & 1024) != 0 ? null : d26, (i14 & 2048) != 0 ? null : d27, (i14 & 4096) != 0 ? null : d28, (i14 & 8192) != 0 ? null : d29, (i14 & 16384) != 0 ? null : d34, (i14 & 32768) != 0 ? null : d35, (i14 & 65536) != 0 ? null : d36, (i14 & 131072) != 0 ? null : d37, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : d38, (i14 & 524288) != 0 ? null : d39, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : d44, (i14 & 2097152) != 0 ? null : d45, (i14 & 4194304) != 0 ? null : d46, (i14 & 8388608) != 0 ? null : d47, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : d48, (i14 & 33554432) != 0 ? null : d49, (i14 & 67108864) != 0 ? null : d54, (i14 & 134217728) != 0 ? null : num, (i14 & 268435456) != 0 ? null : d55, (i14 & 536870912) != 0 ? null : d56, (i14 & 1073741824) != 0 ? null : d57, (i14 & Integer.MIN_VALUE) != 0 ? null : d58, (i15 & 1) != 0 ? null : d59, (i15 & 2) != 0 ? null : d64, (i15 & 4) != 0 ? null : d65, (i15 & 8) != 0 ? null : d66, (i15 & 16) != 0 ? null : d67, (i15 & 32) != 0 ? null : d68, (i15 & 64) != 0 ? null : d69, (i15 & 128) != 0 ? null : d74, (i15 & 256) != 0 ? null : d75, (i15 & 512) != 0 ? null : d76, (i15 & 1024) != 0 ? null : d77, (i15 & 2048) != 0 ? null : d78, (i15 & 4096) != 0 ? null : d79, (i15 & 8192) != 0 ? null : d84, (i15 & 16384) != 0 ? null : d85, (i15 & 32768) != 0 ? null : d86, (i15 & 65536) != 0 ? null : d87, (i15 & 131072) != 0 ? null : d88, (i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : str3, (i15 & 524288) != 0 ? null : str4, (i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : d89, (i15 & 2097152) != 0 ? null : str5, (i15 & 4194304) != 0 ? null : d93, (i15 & 8388608) != 0 ? null : d94, (i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str6, (i15 & 33554432) != 0 ? null : d95, (i15 & 67108864) != 0 ? null : z1Var, (i15 & 134217728) != 0 ? null : d96);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Double getMovingDuration() {
        return this.movingDuration;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Double getStartLatitude() {
        return this.startLatitude;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Double getStartLongitude() {
        return this.startLongitude;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getStartTimeGMT() {
        return this.startTimeGMT;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Double getStrideLength() {
        return this.strideLength;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getSwimStroke() {
        return this.swimStroke;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final Double getTotalNumberOfStrokes() {
        return this.totalNumberOfStrokes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getAverageHR() {
        return this.averageHR;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getAverageMovingSpeed() {
        return this.averageMovingSpeed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return p005kotlin.jvm.internal.s.g(this.aerobicTrainingEffect, z0Var.aerobicTrainingEffect) && p005kotlin.jvm.internal.s.g(this.aerobicTrainingEffectMessage, z0Var.aerobicTrainingEffectMessage) && p005kotlin.jvm.internal.s.g(this.anaerobicTrainingEffect, z0Var.anaerobicTrainingEffect) && p005kotlin.jvm.internal.s.g(this.anaerobicTrainingEffectMessage, z0Var.anaerobicTrainingEffectMessage) && p005kotlin.jvm.internal.s.g(this.averageBikeCadence, z0Var.averageBikeCadence) && p005kotlin.jvm.internal.s.g(this.averageHR, z0Var.averageHR) && p005kotlin.jvm.internal.s.g(this.averageSWOLF, z0Var.averageSWOLF) && p005kotlin.jvm.internal.s.g(this.averageMovingSpeed, z0Var.averageMovingSpeed) && p005kotlin.jvm.internal.s.g(this.averagePower, z0Var.averagePower) && p005kotlin.jvm.internal.s.g(this.averageRunCadence, z0Var.averageRunCadence) && p005kotlin.jvm.internal.s.g(this.averageSpeed, z0Var.averageSpeed) && p005kotlin.jvm.internal.s.g(this.averageSwimCadence, z0Var.averageSwimCadence) && p005kotlin.jvm.internal.s.g(this.averageTemperature, z0Var.averageTemperature) && p005kotlin.jvm.internal.s.g(this.calories, z0Var.calories) && p005kotlin.jvm.internal.s.g(this.distance, z0Var.distance) && p005kotlin.jvm.internal.s.g(this.duration, z0Var.duration) && p005kotlin.jvm.internal.s.g(this.elapsedDuration, z0Var.elapsedDuration) && p005kotlin.jvm.internal.s.g(this.elevationGain, z0Var.elevationGain) && p005kotlin.jvm.internal.s.g(this.elevationLoss, z0Var.elevationLoss) && p005kotlin.jvm.internal.s.g(this.endLatitude, z0Var.endLatitude) && p005kotlin.jvm.internal.s.g(this.endLongitude, z0Var.endLongitude) && p005kotlin.jvm.internal.s.g(this.functionalThresholdPower, z0Var.functionalThresholdPower) && p005kotlin.jvm.internal.s.g(this.groundContactTime, z0Var.groundContactTime) && p005kotlin.jvm.internal.s.g(this.intensityFactor, z0Var.intensityFactor) && p005kotlin.jvm.internal.s.g(this.leftBalance, z0Var.leftBalance) && p005kotlin.jvm.internal.s.g(this.leftPedalSmoothness, z0Var.leftPedalSmoothness) && p005kotlin.jvm.internal.s.g(this.leftTorqueEffectiveness, z0Var.leftTorqueEffectiveness) && p005kotlin.jvm.internal.s.g(this.lengthIndex, z0Var.lengthIndex) && p005kotlin.jvm.internal.s.g(this.maxBikeCadence, z0Var.maxBikeCadence) && p005kotlin.jvm.internal.s.g(this.maxElevation, z0Var.maxElevation) && p005kotlin.jvm.internal.s.g(this.maxHR, z0Var.maxHR) && p005kotlin.jvm.internal.s.g(this.maxPower, z0Var.maxPower) && p005kotlin.jvm.internal.s.g(this.maxPowerTwentyMinutes, z0Var.maxPowerTwentyMinutes) && p005kotlin.jvm.internal.s.g(this.maxRunCadence, z0Var.maxRunCadence) && p005kotlin.jvm.internal.s.g(this.maxSpeed, z0Var.maxSpeed) && p005kotlin.jvm.internal.s.g(this.maxTemperature, z0Var.maxTemperature) && p005kotlin.jvm.internal.s.g(this.minElevation, z0Var.minElevation) && p005kotlin.jvm.internal.s.g(this.minPower, z0Var.minPower) && p005kotlin.jvm.internal.s.g(this.minSwimCadence, z0Var.minSwimCadence) && p005kotlin.jvm.internal.s.g(this.minTemperature, z0Var.minTemperature) && p005kotlin.jvm.internal.s.g(this.movingDuration, z0Var.movingDuration) && p005kotlin.jvm.internal.s.g(this.normalizedPower, z0Var.normalizedPower) && p005kotlin.jvm.internal.s.g(this.numberOfActiveLengths, z0Var.numberOfActiveLengths) && p005kotlin.jvm.internal.s.g(this.poolLength, z0Var.poolLength) && p005kotlin.jvm.internal.s.g(this.restingCalories, z0Var.restingCalories) && p005kotlin.jvm.internal.s.g(this.rightBalance, z0Var.rightBalance) && p005kotlin.jvm.internal.s.g(this.rightPedalSmoothness, z0Var.rightPedalSmoothness) && p005kotlin.jvm.internal.s.g(this.rightTorqueEffectiveness, z0Var.rightTorqueEffectiveness) && p005kotlin.jvm.internal.s.g(this.startLatitude, z0Var.startLatitude) && p005kotlin.jvm.internal.s.g(this.startLongitude, z0Var.startLongitude) && p005kotlin.jvm.internal.s.g(this.startTimeGMT, z0Var.startTimeGMT) && p005kotlin.jvm.internal.s.g(this.startTimeLocal, z0Var.startTimeLocal) && p005kotlin.jvm.internal.s.g(this.strideLength, z0Var.strideLength) && p005kotlin.jvm.internal.s.g(this.swimStroke, z0Var.swimStroke) && p005kotlin.jvm.internal.s.g(this.totalWork, z0Var.totalWork) && p005kotlin.jvm.internal.s.g(this.totalNumberOfStrokes, z0Var.totalNumberOfStrokes) && p005kotlin.jvm.internal.s.g(this.trainingEffectLabel, z0Var.trainingEffectLabel) && p005kotlin.jvm.internal.s.g(this.trainingStressScore, z0Var.trainingStressScore) && p005kotlin.jvm.internal.s.g(this.unitOfPoolLength, z0Var.unitOfPoolLength) && p005kotlin.jvm.internal.s.g(this.verticalOscillation, z0Var.verticalOscillation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getAverageSWOLF() {
        return this.averageSWOLF;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getAverageSpeed() {
        return this.averageSpeed;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getAverageTemperature() {
        return this.averageTemperature;
    }

    public final int hashCode() {
        Double d14 = this.aerobicTrainingEffect;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        String str = this.aerobicTrainingEffectMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d15 = this.anaerobicTrainingEffect;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        String str2 = this.anaerobicTrainingEffectMessage;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d16 = this.averageBikeCadence;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.averageHR;
        int iHashCode6 = (iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.averageSWOLF;
        int iHashCode7 = (iHashCode6 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.averageMovingSpeed;
        int iHashCode8 = (iHashCode7 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.averagePower;
        int iHashCode9 = (iHashCode8 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.averageRunCadence;
        int iHashCode10 = (iHashCode9 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.averageSpeed;
        int iHashCode11 = (iHashCode10 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.averageSwimCadence;
        int iHashCode12 = (iHashCode11 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.averageTemperature;
        int iHashCode13 = (iHashCode12 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.calories;
        int iHashCode14 = (iHashCode13 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Double d34 = this.distance;
        int iHashCode15 = (iHashCode14 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.duration;
        int iHashCode16 = (iHashCode15 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Double d36 = this.elapsedDuration;
        int iHashCode17 = (iHashCode16 + (d36 == null ? 0 : d36.hashCode())) * 31;
        Double d37 = this.elevationGain;
        int iHashCode18 = (iHashCode17 + (d37 == null ? 0 : d37.hashCode())) * 31;
        Double d38 = this.elevationLoss;
        int iHashCode19 = (iHashCode18 + (d38 == null ? 0 : d38.hashCode())) * 31;
        Double d39 = this.endLatitude;
        int iHashCode20 = (iHashCode19 + (d39 == null ? 0 : d39.hashCode())) * 31;
        Double d44 = this.endLongitude;
        int iHashCode21 = (iHashCode20 + (d44 == null ? 0 : d44.hashCode())) * 31;
        Double d45 = this.functionalThresholdPower;
        int iHashCode22 = (iHashCode21 + (d45 == null ? 0 : d45.hashCode())) * 31;
        Double d46 = this.groundContactTime;
        int iHashCode23 = (iHashCode22 + (d46 == null ? 0 : d46.hashCode())) * 31;
        Double d47 = this.intensityFactor;
        int iHashCode24 = (iHashCode23 + (d47 == null ? 0 : d47.hashCode())) * 31;
        Double d48 = this.leftBalance;
        int iHashCode25 = (iHashCode24 + (d48 == null ? 0 : d48.hashCode())) * 31;
        Double d49 = this.leftPedalSmoothness;
        int iHashCode26 = (iHashCode25 + (d49 == null ? 0 : d49.hashCode())) * 31;
        Double d54 = this.leftTorqueEffectiveness;
        int iHashCode27 = (iHashCode26 + (d54 == null ? 0 : d54.hashCode())) * 31;
        Integer num = this.lengthIndex;
        int iHashCode28 = (iHashCode27 + (num == null ? 0 : num.hashCode())) * 31;
        Double d55 = this.maxBikeCadence;
        int iHashCode29 = (iHashCode28 + (d55 == null ? 0 : d55.hashCode())) * 31;
        Double d56 = this.maxElevation;
        int iHashCode30 = (iHashCode29 + (d56 == null ? 0 : d56.hashCode())) * 31;
        Double d57 = this.maxHR;
        int iHashCode31 = (iHashCode30 + (d57 == null ? 0 : d57.hashCode())) * 31;
        Double d58 = this.maxPower;
        int iHashCode32 = (iHashCode31 + (d58 == null ? 0 : d58.hashCode())) * 31;
        Double d59 = this.maxPowerTwentyMinutes;
        int iHashCode33 = (iHashCode32 + (d59 == null ? 0 : d59.hashCode())) * 31;
        Double d64 = this.maxRunCadence;
        int iHashCode34 = (iHashCode33 + (d64 == null ? 0 : d64.hashCode())) * 31;
        Double d65 = this.maxSpeed;
        int iHashCode35 = (iHashCode34 + (d65 == null ? 0 : d65.hashCode())) * 31;
        Double d66 = this.maxTemperature;
        int iHashCode36 = (iHashCode35 + (d66 == null ? 0 : d66.hashCode())) * 31;
        Double d67 = this.minElevation;
        int iHashCode37 = (iHashCode36 + (d67 == null ? 0 : d67.hashCode())) * 31;
        Double d68 = this.minPower;
        int iHashCode38 = (iHashCode37 + (d68 == null ? 0 : d68.hashCode())) * 31;
        Double d69 = this.minSwimCadence;
        int iHashCode39 = (iHashCode38 + (d69 == null ? 0 : d69.hashCode())) * 31;
        Double d74 = this.minTemperature;
        int iHashCode40 = (iHashCode39 + (d74 == null ? 0 : d74.hashCode())) * 31;
        Double d75 = this.movingDuration;
        int iHashCode41 = (iHashCode40 + (d75 == null ? 0 : d75.hashCode())) * 31;
        Double d76 = this.normalizedPower;
        int iHashCode42 = (iHashCode41 + (d76 == null ? 0 : d76.hashCode())) * 31;
        Double d77 = this.numberOfActiveLengths;
        int iHashCode43 = (iHashCode42 + (d77 == null ? 0 : d77.hashCode())) * 31;
        Double d78 = this.poolLength;
        int iHashCode44 = (iHashCode43 + (d78 == null ? 0 : d78.hashCode())) * 31;
        Double d79 = this.restingCalories;
        int iHashCode45 = (iHashCode44 + (d79 == null ? 0 : d79.hashCode())) * 31;
        Double d84 = this.rightBalance;
        int iHashCode46 = (iHashCode45 + (d84 == null ? 0 : d84.hashCode())) * 31;
        Double d85 = this.rightPedalSmoothness;
        int iHashCode47 = (iHashCode46 + (d85 == null ? 0 : d85.hashCode())) * 31;
        Double d86 = this.rightTorqueEffectiveness;
        int iHashCode48 = (iHashCode47 + (d86 == null ? 0 : d86.hashCode())) * 31;
        Double d87 = this.startLatitude;
        int iHashCode49 = (iHashCode48 + (d87 == null ? 0 : d87.hashCode())) * 31;
        Double d88 = this.startLongitude;
        int iHashCode50 = (iHashCode49 + (d88 == null ? 0 : d88.hashCode())) * 31;
        String str3 = this.startTimeGMT;
        int iHashCode51 = (iHashCode50 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.startTimeLocal;
        int iHashCode52 = (iHashCode51 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d89 = this.strideLength;
        int iHashCode53 = (iHashCode52 + (d89 == null ? 0 : d89.hashCode())) * 31;
        String str5 = this.swimStroke;
        int iHashCode54 = (iHashCode53 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d93 = this.totalWork;
        int iHashCode55 = (iHashCode54 + (d93 == null ? 0 : d93.hashCode())) * 31;
        Double d94 = this.totalNumberOfStrokes;
        int iHashCode56 = (iHashCode55 + (d94 == null ? 0 : d94.hashCode())) * 31;
        String str6 = this.trainingEffectLabel;
        int iHashCode57 = (iHashCode56 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d95 = this.trainingStressScore;
        int iHashCode58 = (iHashCode57 + (d95 == null ? 0 : d95.hashCode())) * 31;
        z1 z1Var = this.unitOfPoolLength;
        int iHashCode59 = (iHashCode58 + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        Double d96 = this.verticalOscillation;
        return iHashCode59 + (d96 != null ? d96.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Double getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getElevationGain() {
        return this.elevationGain;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Double getElevationLoss() {
        return this.elevationLoss;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Double getEndLatitude() {
        return this.endLatitude;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Double getEndLongitude() {
        return this.endLongitude;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Integer getLengthIndex() {
        return this.lengthIndex;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Double getMaxHR() {
        return this.maxHR;
    }

    public final String toString() {
        Double d14 = this.aerobicTrainingEffect;
        String str = this.aerobicTrainingEffectMessage;
        Double d15 = this.anaerobicTrainingEffect;
        String str2 = this.anaerobicTrainingEffectMessage;
        Double d16 = this.averageBikeCadence;
        Double d17 = this.averageHR;
        Double d18 = this.averageSWOLF;
        Double d19 = this.averageMovingSpeed;
        Double d24 = this.averagePower;
        Double d25 = this.averageRunCadence;
        Double d26 = this.averageSpeed;
        Double d27 = this.averageSwimCadence;
        Double d28 = this.averageTemperature;
        Double d29 = this.calories;
        Double d34 = this.distance;
        Double d35 = this.duration;
        Double d36 = this.elapsedDuration;
        Double d37 = this.elevationGain;
        Double d38 = this.elevationLoss;
        Double d39 = this.endLatitude;
        Double d44 = this.endLongitude;
        Double d45 = this.functionalThresholdPower;
        Double d46 = this.groundContactTime;
        Double d47 = this.intensityFactor;
        Double d48 = this.leftBalance;
        Double d49 = this.leftPedalSmoothness;
        Double d54 = this.leftTorqueEffectiveness;
        Integer num = this.lengthIndex;
        Double d55 = this.maxBikeCadence;
        Double d56 = this.maxElevation;
        Double d57 = this.maxHR;
        Double d58 = this.maxPower;
        Double d59 = this.maxPowerTwentyMinutes;
        Double d64 = this.maxRunCadence;
        Double d65 = this.maxSpeed;
        Double d66 = this.maxTemperature;
        Double d67 = this.minElevation;
        Double d68 = this.minPower;
        Double d69 = this.minSwimCadence;
        Double d74 = this.minTemperature;
        Double d75 = this.movingDuration;
        Double d76 = this.normalizedPower;
        Double d77 = this.numberOfActiveLengths;
        Double d78 = this.poolLength;
        Double d79 = this.restingCalories;
        Double d84 = this.rightBalance;
        Double d85 = this.rightPedalSmoothness;
        Double d86 = this.rightTorqueEffectiveness;
        Double d87 = this.startLatitude;
        Double d88 = this.startLongitude;
        String str3 = this.startTimeGMT;
        String str4 = this.startTimeLocal;
        Double d89 = this.strideLength;
        String str5 = this.swimStroke;
        Double d93 = this.totalWork;
        Double d94 = this.totalNumberOfStrokes;
        String str6 = this.trainingEffectLabel;
        Double d95 = this.trainingStressScore;
        z1 z1Var = this.unitOfPoolLength;
        Double d96 = this.verticalOscillation;
        StringBuilder sb3 = new StringBuilder("LengthDTO(aerobicTrainingEffect=");
        sb3.append(d14);
        sb3.append(", aerobicTrainingEffectMessage=");
        sb3.append(str);
        sb3.append(", anaerobicTrainingEffect=");
        b71.i.u(sb3, d15, ", anaerobicTrainingEffectMessage=", str2, ", averageBikeCadence=");
        b71.i.p(d16, d17, ", averageHR=", ", averageSWOLF=", sb3);
        b71.i.p(d18, d19, ", averageMovingSpeed=", ", averagePower=", sb3);
        b71.i.p(d24, d25, ", averageRunCadence=", ", averageSpeed=", sb3);
        b71.i.p(d26, d27, ", averageSwimCadence=", ", averageTemperature=", sb3);
        b71.i.p(d28, d29, ", calories=", ", distance=", sb3);
        b71.i.p(d34, d35, ", duration=", ", elapsedDuration=", sb3);
        b71.i.p(d36, d37, ", elevationGain=", ", elevationLoss=", sb3);
        b71.i.p(d38, d39, ", endLatitude=", ", endLongitude=", sb3);
        b71.i.p(d44, d45, ", functionalThresholdPower=", ", groundContactTime=", sb3);
        b71.i.p(d46, d47, ", intensityFactor=", ", leftBalance=", sb3);
        b71.i.p(d48, d49, ", leftPedalSmoothness=", ", leftTorqueEffectiveness=", sb3);
        b71.i.t(sb3, d54, ", lengthIndex=", num, ", maxBikeCadence=");
        b71.i.p(d55, d56, ", maxElevation=", ", maxHR=", sb3);
        b71.i.p(d57, d58, ", maxPower=", ", maxPowerTwentyMinutes=", sb3);
        b71.i.p(d59, d64, ", maxRunCadence=", ", maxSpeed=", sb3);
        b71.i.p(d65, d66, ", maxTemperature=", ", minElevation=", sb3);
        b71.i.p(d67, d68, ", minPower=", ", minSwimCadence=", sb3);
        b71.i.p(d69, d74, ", minTemperature=", ", movingDuration=", sb3);
        b71.i.p(d75, d76, ", normalizedPower=", ", numberOfActiveLengths=", sb3);
        b71.i.p(d77, d78, ", poolLength=", ", restingCalories=", sb3);
        b71.i.p(d79, d84, ", rightBalance=", ", rightPedalSmoothness=", sb3);
        b71.i.p(d85, d86, ", rightTorqueEffectiveness=", ", startLatitude=", sb3);
        b71.i.p(d87, d88, ", startLongitude=", ", startTimeGMT=", sb3);
        sn.a.t(sb3, str3, ", startTimeLocal=", str4, ", strideLength=");
        b71.i.u(sb3, d89, ", swimStroke=", str5, ", totalWork=");
        b71.i.p(d93, d94, ", totalNumberOfStrokes=", ", trainingEffectLabel=", sb3);
        b71.i.x(sb3, str6, ", trainingStressScore=", d95, ", unitOfPoolLength=");
        sb3.append(z1Var);
        sb3.append(", verticalOscillation=");
        sb3.append(d96);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Double getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.aerobicTrainingEffect;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeString(this.aerobicTrainingEffectMessage);
        Double d15 = this.anaerobicTrainingEffect;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeString(this.anaerobicTrainingEffectMessage);
        Double d16 = this.averageBikeCadence;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.averageHR;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.averageSWOLF;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.averageMovingSpeed;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        Double d24 = this.averagePower;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        Double d25 = this.averageRunCadence;
        if (d25 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d25);
        }
        Double d26 = this.averageSpeed;
        if (d26 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d26);
        }
        Double d27 = this.averageSwimCadence;
        if (d27 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d27);
        }
        Double d28 = this.averageTemperature;
        if (d28 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d28);
        }
        Double d29 = this.calories;
        if (d29 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d29);
        }
        Double d34 = this.distance;
        if (d34 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d34);
        }
        Double d35 = this.duration;
        if (d35 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d35);
        }
        Double d36 = this.elapsedDuration;
        if (d36 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d36);
        }
        Double d37 = this.elevationGain;
        if (d37 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d37);
        }
        Double d38 = this.elevationLoss;
        if (d38 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d38);
        }
        Double d39 = this.endLatitude;
        if (d39 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d39);
        }
        Double d44 = this.endLongitude;
        if (d44 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d44);
        }
        Double d45 = this.functionalThresholdPower;
        if (d45 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d45);
        }
        Double d46 = this.groundContactTime;
        if (d46 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d46);
        }
        Double d47 = this.intensityFactor;
        if (d47 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d47);
        }
        Double d48 = this.leftBalance;
        if (d48 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d48);
        }
        Double d49 = this.leftPedalSmoothness;
        if (d49 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d49);
        }
        Double d54 = this.leftTorqueEffectiveness;
        if (d54 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d54);
        }
        Integer num = this.lengthIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d55 = this.maxBikeCadence;
        if (d55 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d55);
        }
        Double d56 = this.maxElevation;
        if (d56 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d56);
        }
        Double d57 = this.maxHR;
        if (d57 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d57);
        }
        Double d58 = this.maxPower;
        if (d58 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d58);
        }
        Double d59 = this.maxPowerTwentyMinutes;
        if (d59 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d59);
        }
        Double d64 = this.maxRunCadence;
        if (d64 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d64);
        }
        Double d65 = this.maxSpeed;
        if (d65 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d65);
        }
        Double d66 = this.maxTemperature;
        if (d66 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d66);
        }
        Double d67 = this.minElevation;
        if (d67 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d67);
        }
        Double d68 = this.minPower;
        if (d68 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d68);
        }
        Double d69 = this.minSwimCadence;
        if (d69 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d69);
        }
        Double d74 = this.minTemperature;
        if (d74 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d74);
        }
        Double d75 = this.movingDuration;
        if (d75 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d75);
        }
        Double d76 = this.normalizedPower;
        if (d76 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d76);
        }
        Double d77 = this.numberOfActiveLengths;
        if (d77 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d77);
        }
        Double d78 = this.poolLength;
        if (d78 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d78);
        }
        Double d79 = this.restingCalories;
        if (d79 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d79);
        }
        Double d84 = this.rightBalance;
        if (d84 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d84);
        }
        Double d85 = this.rightPedalSmoothness;
        if (d85 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d85);
        }
        Double d86 = this.rightTorqueEffectiveness;
        if (d86 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d86);
        }
        Double d87 = this.startLatitude;
        if (d87 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d87);
        }
        Double d88 = this.startLongitude;
        if (d88 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d88);
        }
        parcel.writeString(this.startTimeGMT);
        parcel.writeString(this.startTimeLocal);
        Double d89 = this.strideLength;
        if (d89 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d89);
        }
        parcel.writeString(this.swimStroke);
        Double d93 = this.totalWork;
        if (d93 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d93);
        }
        Double d94 = this.totalNumberOfStrokes;
        if (d94 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d94);
        }
        parcel.writeString(this.trainingEffectLabel);
        Double d95 = this.trainingStressScore;
        if (d95 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d95);
        }
        parcel.writeParcelable(this.unitOfPoolLength, i14);
        Double d96 = this.verticalOscillation;
        if (d96 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d96);
        }
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Double getMaxTemperature() {
        return this.maxTemperature;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Double getMinTemperature() {
        return this.minTemperature;
    }

    public z0(Double d14, String str, Double d15, String str2, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44, Double d45, Double d46, Double d47, Double d48, Double d49, Double d54, Integer num, Double d55, Double d56, Double d57, Double d58, Double d59, Double d64, Double d65, Double d66, Double d67, Double d68, Double d69, Double d74, Double d75, Double d76, Double d77, Double d78, Double d79, Double d84, Double d85, Double d86, Double d87, Double d88, String str3, String str4, Double d89, String str5, Double d93, Double d94, String str6, Double d95, z1 z1Var, Double d96) {
        this.aerobicTrainingEffect = d14;
        this.aerobicTrainingEffectMessage = str;
        this.anaerobicTrainingEffect = d15;
        this.anaerobicTrainingEffectMessage = str2;
        this.averageBikeCadence = d16;
        this.averageHR = d17;
        this.averageSWOLF = d18;
        this.averageMovingSpeed = d19;
        this.averagePower = d24;
        this.averageRunCadence = d25;
        this.averageSpeed = d26;
        this.averageSwimCadence = d27;
        this.averageTemperature = d28;
        this.calories = d29;
        this.distance = d34;
        this.duration = d35;
        this.elapsedDuration = d36;
        this.elevationGain = d37;
        this.elevationLoss = d38;
        this.endLatitude = d39;
        this.endLongitude = d44;
        this.functionalThresholdPower = d45;
        this.groundContactTime = d46;
        this.intensityFactor = d47;
        this.leftBalance = d48;
        this.leftPedalSmoothness = d49;
        this.leftTorqueEffectiveness = d54;
        this.lengthIndex = num;
        this.maxBikeCadence = d55;
        this.maxElevation = d56;
        this.maxHR = d57;
        this.maxPower = d58;
        this.maxPowerTwentyMinutes = d59;
        this.maxRunCadence = d64;
        this.maxSpeed = d65;
        this.maxTemperature = d66;
        this.minElevation = d67;
        this.minPower = d68;
        this.minSwimCadence = d69;
        this.minTemperature = d74;
        this.movingDuration = d75;
        this.normalizedPower = d76;
        this.numberOfActiveLengths = d77;
        this.poolLength = d78;
        this.restingCalories = d79;
        this.rightBalance = d84;
        this.rightPedalSmoothness = d85;
        this.rightTorqueEffectiveness = d86;
        this.startLatitude = d87;
        this.startLongitude = d88;
        this.startTimeGMT = str3;
        this.startTimeLocal = str4;
        this.strideLength = d89;
        this.swimStroke = str5;
        this.totalWork = d93;
        this.totalNumberOfStrokes = d94;
        this.trainingEffectLabel = str6;
        this.trainingStressScore = d95;
        this.unitOfPoolLength = z1Var;
        this.verticalOscillation = d96;
    }

    public z0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 268435455, null);
    }
}
