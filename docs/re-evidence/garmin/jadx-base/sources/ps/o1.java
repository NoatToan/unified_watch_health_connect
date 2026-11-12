package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import okhttp3.internal.http2.Http2Connection;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b\u009b\u0001\b\u0087\b\u0018\u00002\u00020\u0001:\u0001KB«\u0006\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bI\u0010JR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010N\"\u0004\bS\u0010PR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010L\u001a\u0004\bU\u0010N\"\u0004\bV\u0010PR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010L\u001a\u0004\bX\u0010N\"\u0004\bY\u0010PR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u0010L\u001a\u0004\b[\u0010N\"\u0004\b\\\u0010PR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u0010L\u001a\u0004\b^\u0010N\"\u0004\b_\u0010PR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010L\u001a\u0004\ba\u0010N\"\u0004\bb\u0010PR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010L\u001a\u0004\bd\u0010NR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010L\u001a\u0004\b`\u0010NR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\be\u0010L\u001a\u0004\bf\u0010N\"\u0004\bg\u0010PR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010L\u001a\u0004\bi\u0010NR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010L\u001a\u0004\b]\u0010NR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010L\u001a\u0004\bl\u0010NR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010L\u001a\u0004\bn\u0010NR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010L\u001a\u0004\bp\u0010NR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010L\u001a\u0004\br\u0010NR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010L\u001a\u0004\bh\u0010NR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010L\u001a\u0004\bt\u0010NR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010L\u001a\u0004\bv\u0010NR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bw\u0010L\u001a\u0004\bx\u0010NR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\by\u0010L\u001a\u0004\bz\u0010NR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010L\u001a\u0004\b|\u0010NR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010L\u001a\u0004\bc\u0010NR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010L\u001a\u0004\b}\u0010NR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010L\u001a\u0004\bW\u0010NR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b~\u0010L\u001a\u0004\b\u007f\u0010NR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010L\u001a\u0004\be\u0010NR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010L\u001a\u0005\b\u0081\u0001\u0010NR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010L\u001a\u0005\b\u0083\u0001\u0010NR\u001e\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010L\u001a\u0005\b\u0085\u0001\u0010NR\u001d\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\bz\u0010L\u001a\u0005\b\u0086\u0001\u0010NR\u001e\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010L\u001a\u0005\b\u0088\u0001\u0010NR\u001e\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010L\u001a\u0005\b\u008a\u0001\u0010NR\u001e\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010L\u001a\u0005\b\u008c\u0001\u0010NR\u001e\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010L\u001a\u0005\b\u008e\u0001\u0010NR\u001e\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010L\u001a\u0005\b\u0090\u0001\u0010NR'\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010L\u001a\u0005\b\u0092\u0001\u0010N\"\u0005\b\u0093\u0001\u0010PR&\u0010(\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0005\b\u0094\u0001\u0010L\u001a\u0004\bk\u0010N\"\u0005\b\u0095\u0001\u0010PR*\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R)\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\br\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R \u0010-\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u0097\u0001\u001a\u0006\b¢\u0001\u0010\u0099\u0001R*\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R \u00100\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010\u0097\u0001\u001a\u0006\b£\u0001\u0010\u0099\u0001R*\u00101\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\bª\u0001\u0010\u0097\u0001\u001a\u0006\b«\u0001\u0010\u0099\u0001\"\u0006\b¬\u0001\u0010\u009b\u0001R \u00102\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u0097\u0001\u001a\u0006\b©\u0001\u0010\u0099\u0001R*\u00103\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010\u0097\u0001\u001a\u0006\b®\u0001\u0010\u0099\u0001\"\u0006\b¯\u0001\u0010\u009b\u0001R\u001e\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b®\u0001\u0010L\u001a\u0005\b°\u0001\u0010NR\u001d\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b|\u0010L\u001a\u0005\b±\u0001\u0010NR\u001e\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b²\u0001\u0010L\u001a\u0005\b³\u0001\u0010NR\u001e\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b´\u0001\u0010L\u001a\u0005\b\u008f\u0001\u0010NR\u001e\u00108\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bµ\u0001\u0010L\u001a\u0005\b¶\u0001\u0010NR\u001e\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¶\u0001\u0010L\u001a\u0005\b·\u0001\u0010NR\u001e\u0010:\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¸\u0001\u0010L\u001a\u0005\b²\u0001\u0010NR \u0010;\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¹\u0001\u0010\u009c\u0001\u001a\u0006\bº\u0001\u0010\u009e\u0001R\u001e\u0010<\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b»\u0001\u0010L\u001a\u0005\b¼\u0001\u0010NR\u001d\u0010=\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u009d\u0001\u0010L\u001a\u0004\bo\u0010NR\u001d\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\b½\u0001\u0010L\u001a\u0004\bu\u0010NR\u001e\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010L\u001a\u0005\b¾\u0001\u0010NR\u001e\u0010@\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010L\u001a\u0005\b¿\u0001\u0010NR\u001e\u0010A\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÀ\u0001\u0010L\u001a\u0005\bÁ\u0001\u0010NR\u001e\u0010B\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010L\u001a\u0005\bÂ\u0001\u0010NR \u0010C\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÃ\u0001\u0010\u0097\u0001\u001a\u0006\b\u0084\u0001\u0010\u0099\u0001R \u0010D\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÄ\u0001\u0010\u0097\u0001\u001a\u0006\bÅ\u0001\u0010\u0099\u0001R\u001e\u0010E\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b°\u0001\u0010L\u001a\u0005\b\u0080\u0001\u0010NR \u0010F\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÆ\u0001\u0010\u009c\u0001\u001a\u0006\bÇ\u0001\u0010\u009e\u0001R\u001e\u0010G\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010L\u001a\u0005\b\u0091\u0001\u0010NR\u001d\u0010H\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0005\bÈ\u0001\u0010L\u001a\u0004\bs\u0010N¨\u0006É\u0001"}, d2 = {"Lps/o1;", "Landroid/os/Parcelable;", "", "distance", "maxDistance", "duration", "movingDuration", "maxDuration", "elevationGain", "elevationLoss", "averageSpeed", "averageMovingSpeed", "maxSpeed", "calories", "averageHR", "maxHR", "avgPower", "maxPower", "normalizedPower", "avgBikeForce", "maxBikeForce", "normalizedForce", "avgPowerTarget", "leftBalance", "rightBalance", "averageRunCadence", "maxRunCadence", "averageBikeCadence", "maxBikeCadence", "averageTemperature", "maxTemperature", "minTemperature", "groundContactTime", "groundContactBalanceLeft", "stepSpeedLoss", "stepSpeedLossPercent", "strideLength", "verticalOscillation", "verticalRatio", "maxElevationGain", "avgElevationGain", "", "noOfSplits", "", "splitType", NotificationConstants.KEY_DATA_MIME_TYPE, "Lps/u0;", "maxGradeValue", "numClimbsAttempted", "numFalls", "numClimbsCompleted", "numSends", "targetAvgSpeed", "targetDistance", "targetDuration", "leftTorqueEffectiveness", "rightTorqueEffectiveness", "leftPedalSmoothness", "rightPedalSmoothness", "mode", "weightedMeanBestFiveMaxSpeedOverTenSeconds", "avgGradeAdjustedSpeed", "avgStress", "maxStress", "avgStressWin", "avgStressLoss", "avgStressDraw", "gamesWon", "gamesNotWon", "gamesAverageWon", "maxPisteDifficulty", "maxPackWeight", "avgPackWeight", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lps/u0;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/Double;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "()Ljava/lang/Double;", "x1", "(Ljava/lang/Double;)V", "b", "e0", "D1", "c", "z", "y1", "d", "A0", "J1", JWKParameterNames.RSA_EXPONENT, "f0", "setMaxDuration", "f", "A", "A1", "g", "C", "C1", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "q0", "I1", JWKParameterNames.OCT_KEY_VALUE, "u", "l", "m", "j0", JWKParameterNames.RSA_MODULUS, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "o", "o0", "p", "J0", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "c0", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "E0", "v", "s", "w", "I", "x", "R0", "p0", "B", "a0", "D", "w0", "E", "x0", "F", "H", "G", "P", "b1", "T", "c1", "X", "e1", "Y", "j1", "Z", "s1", "k0", "g0", "F1", "H0", "v1", "I0", "Ljava/lang/Integer;", "C0", "()Ljava/lang/Integer;", "M1", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "Z0", "()Ljava/lang/String;", "V1", "(Ljava/lang/String;)V", "K0", "getType", "L0", "Lps/u0;", "h0", "()Lps/u0;", "G1", "(Lps/u0;)V", "M0", "N0", "P0", "S1", "O0", "Q0", "U1", "h1", "getTargetDistance", "S0", "getTargetDuration", "T0", "U0", "V0", "M", "W0", "X0", "z0", "Y0", "t1", "a1", "getMaxStress", "getAvgStressWin", "d1", "getAvgStressLoss", "getAvgStressDraw", "f1", "g1", "getGamesNotWon", "i1", "n0", "k1", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o1 implements Parcelable {
    public static final Parcelable.Creator<o1> CREATOR;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("averageBikeCadence")
    private final Double averageBikeCadence;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("maxBikeCadence")
    private final Double maxBikeCadence;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("averageTemperature")
    private final Double averageTemperature;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("maxTemperature")
    private final Double maxTemperature;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("minTemperature")
    private final Double minTemperature;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("groundContactTime")
    private final Double groundContactTime;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @SerializedName("averageElevationGain")
    private Double avgElevationGain;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("groundContactBalanceLeft")
    private final Double groundContactBalanceLeft;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @SerializedName("noOfSplits")
    private Integer noOfSplits;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @SerializedName("splitType")
    private String splitType;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final Integer type;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @SerializedName("maxGradeValue")
    private u0 maxGradeValue;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @SerializedName("numClimbsAttempted")
    private final Integer numClimbsAttempted;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @SerializedName("numFalls")
    private Integer numFalls;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @SerializedName("numClimbsCompleted")
    private final Integer numClimbsCompleted;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("stepSpeedLoss")
    private final Double stepSpeedLoss;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @SerializedName("numClimbSends")
    private Integer numSends;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @SerializedName("targetAverageSpeed")
    private final Double targetAvgSpeed;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @SerializedName("targetDistance")
    private final Double targetDistance;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @SerializedName("targetDuration")
    private final Double targetDuration;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("stepSpeedLossPercent")
    private final Double stepSpeedLossPercent;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @SerializedName("leftTorqueEffectiveness")
    private final Double leftTorqueEffectiveness;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @SerializedName("rightTorqueEffectiveness")
    private final Double rightTorqueEffectiveness;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @SerializedName("leftPedalSmoothness")
    private final Double leftPedalSmoothness;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    @SerializedName("rightPedalSmoothness")
    private final Double rightPedalSmoothness;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("strideLength")
    private final Double strideLength;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    @SerializedName("mode")
    private final String mode;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @SerializedName("verticalOscillation")
    private final Double verticalOscillation;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    @SerializedName("weightedMeanBestFiveMaxSpeedOverTenSeconds")
    private final Double weightedMeanBestFiveMaxSpeedOverTenSeconds;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @SerializedName("verticalRatio")
    private final Double verticalRatio;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    @SerializedName("avgGradeAdjustedSpeed")
    private final Double avgGradeAdjustedSpeed;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private Double distance;

    /* JADX INFO: renamed from: a1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgStress")
    private final Double avgStress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(alternate = {"maxDistance"}, value = "maxDistanceWithPrecision")
    private Double maxDistance;

    /* JADX INFO: renamed from: b1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxStress")
    private final Double maxStress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private Double duration;

    /* JADX INFO: renamed from: c1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgStressWin")
    private final Double avgStressWin;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("movingDuration")
    private Double movingDuration;

    /* JADX INFO: renamed from: d1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgStressLoss")
    private final Double avgStressLoss;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxDuration")
    private Double maxDuration;

    /* JADX INFO: renamed from: e1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgStressDraw")
    private final Double avgStressDraw;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName(alternate = {"totalAscent"}, value = "elevationGain")
    private Double elevationGain;

    /* JADX INFO: renamed from: f1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gamesWon")
    private final Integer gamesWon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationLoss")
    private Double elevationLoss;

    /* JADX INFO: renamed from: g1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gamesNotWon")
    private final Integer gamesNotWon;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSpeed")
    private final Double averageSpeed;

    /* JADX INFO: renamed from: h1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gamesAverageWon")
    private final Double gamesAverageWon;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageMovingSpeed")
    private final Double averageMovingSpeed;

    /* JADX INFO: renamed from: i1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxPisteDifficulty")
    private final String maxPisteDifficulty;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxSpeed")
    private Double maxSpeed;

    /* JADX INFO: renamed from: j1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxPackWeight")
    private final Double maxPackWeight;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calories")
    private final Double calories;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxElevationGain")
    private Double maxElevationGain;

    /* JADX INFO: renamed from: k1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgPackWeight")
    private final Double avgPackWeight;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageHR")
    private final Double averageHR;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxHR")
    private final Double maxHR;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averagePower")
    private final Double avgPower;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxPower")
    private final Double maxPower;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("normalizedPower")
    private final Double normalizedPower;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgForce")
    private final Double avgBikeForce;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxForce")
    private final Double maxBikeForce;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("normalizedForce")
    private final Double normalizedForce;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averagePowerTarget")
    private final Double avgPowerTarget;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("leftBalance")
    private final Double leftBalance;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rightBalance")
    private final Double rightBalance;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageRunCadence")
    private final Double averageRunCadence;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxRunCadence")
    private final Double maxRunCadence;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<o1> {
        @Override // android.os.Parcelable.Creator
        public final o1 createFromParcel(Parcel parcel) {
            parcel.getClass();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf7 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf8 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf9 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf10 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf11 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf12 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf13 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf14 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf15 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf16 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf17 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf18 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf19 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf20 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf21 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf22 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf23 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf24 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf25 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf26 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf27 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf28 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf29 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf30 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf31 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf32 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf33 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf34 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf35 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf36 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf37 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf38 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            u0 u0Var = (u0) parcel.readParcelable(o1.class.getClassLoader());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double dValueOf39 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf40 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf41 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf42 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf43 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf44 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf45 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer num = numValueOf4;
            Integer num2 = numValueOf6;
            Double d14 = dValueOf40;
            Double d15 = dValueOf42;
            Double d16 = dValueOf44;
            String string2 = parcel.readString();
            Double dValueOf46 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf47 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf48 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf49 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf50 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf51 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf52 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            return new o1(dValueOf, dValueOf2, dValueOf3, dValueOf4, dValueOf5, dValueOf6, dValueOf7, dValueOf8, dValueOf9, dValueOf10, dValueOf11, dValueOf12, dValueOf13, dValueOf14, dValueOf15, dValueOf16, dValueOf17, dValueOf18, dValueOf19, dValueOf20, dValueOf21, dValueOf22, dValueOf23, dValueOf24, dValueOf25, dValueOf26, dValueOf27, dValueOf28, dValueOf29, dValueOf30, dValueOf31, dValueOf32, dValueOf33, dValueOf34, dValueOf35, dValueOf36, dValueOf37, dValueOf38, numValueOf, string, numValueOf2, u0Var, numValueOf3, num, numValueOf5, num2, dValueOf39, d14, dValueOf41, d15, dValueOf43, d16, dValueOf45, string2, dValueOf46, dValueOf47, dValueOf48, dValueOf49, dValueOf50, dValueOf51, dValueOf52, numValueOf7, numValueOf8, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final o1[] newArray(int i14) {
            return new o1[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o1(Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44, Double d45, Double d46, Double d47, Double d48, Double d49, Double d54, Double d55, Double d56, Double d57, Double d58, Double d59, Double d64, Double d65, Double d66, Double d67, Double d68, Double d69, Double d74, Double d75, Integer num, String str, Integer num2, u0 u0Var, Integer num3, Integer num4, Integer num5, Integer num6, Double d76, Double d77, Double d78, Double d79, Double d84, Double d85, Double d86, String str2, Double d87, Double d88, Double d89, Double d93, Double d94, Double d95, Double d96, Integer num7, Integer num8, Double d97, String str3, Double d98, Double d99, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        Double d100 = (i14 & 1) != 0 ? null : d14;
        this(d100, (i14 & 2) != 0 ? null : d15, (i14 & 4) != 0 ? null : d16, (i14 & 8) != 0 ? null : d17, (i14 & 16) != 0 ? null : d18, (i14 & 32) != 0 ? null : d19, (i14 & 64) != 0 ? null : d24, (i14 & 128) != 0 ? null : d25, (i14 & 256) != 0 ? null : d26, (i14 & 512) != 0 ? null : d27, (i14 & 1024) != 0 ? null : d28, (i14 & 2048) != 0 ? null : d29, (i14 & 4096) != 0 ? null : d34, (i14 & 8192) != 0 ? null : d35, (i14 & 16384) != 0 ? null : d36, (i14 & 32768) != 0 ? null : d37, (i14 & 65536) != 0 ? null : d38, (i14 & 131072) != 0 ? null : d39, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : d44, (i14 & 524288) != 0 ? null : d45, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : d46, (i14 & 2097152) != 0 ? null : d47, (i14 & 4194304) != 0 ? null : d48, (i14 & 8388608) != 0 ? null : d49, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : d54, (i14 & 33554432) != 0 ? null : d55, (i14 & 67108864) != 0 ? null : d56, (i14 & 134217728) != 0 ? null : d57, (i14 & 268435456) != 0 ? null : d58, (i14 & 536870912) != 0 ? null : d59, (i14 & 1073741824) != 0 ? null : d64, (i14 & Integer.MIN_VALUE) != 0 ? null : d65, (i15 & 1) != 0 ? null : d66, (i15 & 2) != 0 ? null : d67, (i15 & 4) != 0 ? null : d68, (i15 & 8) != 0 ? null : d69, (i15 & 16) != 0 ? null : d74, (i15 & 32) != 0 ? null : d75, (i15 & 64) != 0 ? null : num, (i15 & 128) != 0 ? null : str, (i15 & 256) != 0 ? null : num2, (i15 & 512) != 0 ? null : u0Var, (i15 & 1024) != 0 ? null : num3, (i15 & 2048) != 0 ? null : num4, (i15 & 4096) != 0 ? null : num5, (i15 & 8192) != 0 ? null : num6, (i15 & 16384) != 0 ? null : d76, (i15 & 32768) != 0 ? null : d77, (i15 & 65536) != 0 ? null : d78, (i15 & 131072) != 0 ? null : d79, (i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : d84, (i15 & 524288) != 0 ? null : d85, (i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : d86, (i15 & 2097152) != 0 ? null : str2, (i15 & 4194304) != 0 ? null : d87, (i15 & 8388608) != 0 ? null : d88, (i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : d89, (i15 & 33554432) != 0 ? null : d93, (i15 & 67108864) != 0 ? null : d94, (i15 & 134217728) != 0 ? null : d95, (i15 & 268435456) != 0 ? null : d96, (i15 & 536870912) != 0 ? null : num7, (i15 & 1073741824) != 0 ? null : num8, (i15 & Integer.MIN_VALUE) != 0 ? null : d97, (i16 & 1) != 0 ? null : str3, (i16 & 2) != 0 ? null : d98, (i16 & 4) != 0 ? null : d99);
    }

    public static o1 b(o1 o1Var, Double d14, Double d15, Double d16, int i14) {
        Double d17 = o1Var.distance;
        Double d18 = o1Var.maxDistance;
        Double d19 = (i14 & 8) != 0 ? o1Var.movingDuration : d15;
        Double d24 = o1Var.maxDuration;
        Double d25 = o1Var.elevationGain;
        Double d26 = o1Var.elevationLoss;
        Double d27 = o1Var.averageSpeed;
        Double d28 = o1Var.averageMovingSpeed;
        Double d29 = (i14 & 512) != 0 ? o1Var.maxSpeed : d16;
        Double d34 = o1Var.calories;
        Double d35 = o1Var.averageHR;
        Double d36 = o1Var.maxHR;
        Double d37 = o1Var.avgPower;
        Double d38 = o1Var.maxPower;
        Double d39 = o1Var.normalizedPower;
        Double d44 = o1Var.avgBikeForce;
        Double d45 = o1Var.maxBikeForce;
        Double d46 = o1Var.normalizedForce;
        Double d47 = o1Var.avgPowerTarget;
        Double d48 = o1Var.leftBalance;
        Double d49 = o1Var.rightBalance;
        Double d54 = o1Var.averageRunCadence;
        Double d55 = o1Var.maxRunCadence;
        Double d56 = o1Var.averageBikeCadence;
        Double d57 = o1Var.maxBikeCadence;
        Double d58 = o1Var.averageTemperature;
        Double d59 = o1Var.maxTemperature;
        Double d64 = o1Var.minTemperature;
        Double d65 = o1Var.groundContactTime;
        Double d66 = o1Var.groundContactBalanceLeft;
        Double d67 = o1Var.stepSpeedLoss;
        Double d68 = o1Var.stepSpeedLossPercent;
        Double d69 = o1Var.strideLength;
        Double d74 = o1Var.verticalOscillation;
        Double d75 = o1Var.verticalRatio;
        Double d76 = o1Var.maxElevationGain;
        Double d77 = o1Var.avgElevationGain;
        Integer num = o1Var.noOfSplits;
        String str = o1Var.splitType;
        Integer num2 = o1Var.type;
        u0 u0Var = o1Var.maxGradeValue;
        Integer num3 = o1Var.numClimbsAttempted;
        Integer num4 = o1Var.numFalls;
        Integer num5 = o1Var.numClimbsCompleted;
        Integer num6 = o1Var.numSends;
        Double d78 = o1Var.targetAvgSpeed;
        Double d79 = o1Var.targetDistance;
        Double d84 = o1Var.targetDuration;
        Double d85 = o1Var.leftTorqueEffectiveness;
        Double d86 = o1Var.rightTorqueEffectiveness;
        Double d87 = o1Var.leftPedalSmoothness;
        Double d88 = o1Var.rightPedalSmoothness;
        String str2 = o1Var.mode;
        Double d89 = o1Var.weightedMeanBestFiveMaxSpeedOverTenSeconds;
        Double d93 = o1Var.avgGradeAdjustedSpeed;
        Double d94 = o1Var.avgStress;
        Double d95 = o1Var.maxStress;
        Double d96 = o1Var.avgStressWin;
        Double d97 = o1Var.avgStressLoss;
        Double d98 = o1Var.avgStressDraw;
        Integer num7 = o1Var.gamesWon;
        Integer num8 = o1Var.gamesNotWon;
        Double d99 = o1Var.gamesAverageWon;
        String str3 = o1Var.maxPisteDifficulty;
        Double d100 = o1Var.maxPackWeight;
        Double d101 = o1Var.avgPackWeight;
        o1Var.getClass();
        return new o1(d17, d18, d14, d19, d24, d25, d26, d27, d28, d29, d34, d35, d36, d37, d38, d39, d44, d45, d46, d47, d48, d49, d54, d55, d56, d57, d58, d59, d64, d65, d66, d67, d68, d69, d74, d75, d76, d77, num, str, num2, u0Var, num3, num4, num5, num6, d78, d79, d84, d85, d86, d87, d88, str2, d89, d93, d94, d95, d96, d97, d98, num7, num8, d99, str3, d100, d101);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Double getElevationGain() {
        return this.elevationGain;
    }

    /* JADX INFO: renamed from: A0, reason: from getter */
    public final Double getMovingDuration() {
        return this.movingDuration;
    }

    public final void A1(Double d14) {
        this.elevationGain = d14;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Double getElevationLoss() {
        return this.elevationLoss;
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final Integer getNoOfSplits() {
        return this.noOfSplits;
    }

    public final void C1(Double d14) {
        this.elevationLoss = d14;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Double getGamesAverageWon() {
        return this.gamesAverageWon;
    }

    public final void D1(Double d14) {
        this.maxDistance = d14;
    }

    /* JADX INFO: renamed from: E0, reason: from getter */
    public final Double getNormalizedForce() {
        return this.normalizedForce;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Integer getGamesWon() {
        return this.gamesWon;
    }

    public final void F1(Double d14) {
        this.maxElevationGain = d14;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Double getGroundContactBalanceLeft() {
        return this.groundContactBalanceLeft;
    }

    public final void G1(u0 u0Var) {
        this.maxGradeValue = u0Var;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Double getGroundContactTime() {
        return this.groundContactTime;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final Double getLeftBalance() {
        return this.leftBalance;
    }

    public final void I1(Double d14) {
        this.maxSpeed = d14;
    }

    /* JADX INFO: renamed from: J0, reason: from getter */
    public final Double getNormalizedPower() {
        return this.normalizedPower;
    }

    public final void J1(Double d14) {
        this.movingDuration = d14;
    }

    /* JADX INFO: renamed from: L0, reason: from getter */
    public final Integer getNumClimbsAttempted() {
        return this.numClimbsAttempted;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final Double getLeftPedalSmoothness() {
        return this.leftPedalSmoothness;
    }

    /* JADX INFO: renamed from: M0, reason: from getter */
    public final Integer getNumClimbsCompleted() {
        return this.numClimbsCompleted;
    }

    public final void M1(Integer num) {
        this.noOfSplits = num;
    }

    /* JADX INFO: renamed from: P0, reason: from getter */
    public final Integer getNumFalls() {
        return this.numFalls;
    }

    /* JADX INFO: renamed from: Q0, reason: from getter */
    public final Integer getNumSends() {
        return this.numSends;
    }

    /* JADX INFO: renamed from: R0, reason: from getter */
    public final Double getRightBalance() {
        return this.rightBalance;
    }

    /* JADX INFO: renamed from: S0, reason: from getter */
    public final Double getRightPedalSmoothness() {
        return this.rightPedalSmoothness;
    }

    public final void S1(Integer num) {
        this.numFalls = num;
    }

    public final void U1(Integer num) {
        this.numSends = num;
    }

    /* JADX INFO: renamed from: V0, reason: from getter */
    public final Double getRightTorqueEffectiveness() {
        return this.rightTorqueEffectiveness;
    }

    public final void V1(String str) {
        this.splitType = str;
    }

    public final JSONObject Y1() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("distance", this.distance);
        jSONObject.put("maxDistanceWithPrecision", this.maxDistance);
        jSONObject.put("duration", this.duration);
        jSONObject.put("movingDuration", this.movingDuration);
        jSONObject.put("elevationGain", this.elevationGain);
        jSONObject.put("elevationLoss", this.elevationLoss);
        jSONObject.put("maxElevationGain", this.maxElevationGain);
        jSONObject.put("averageElevationGain", this.avgElevationGain);
        jSONObject.put("averageSpeed", this.averageSpeed);
        jSONObject.put("averageMovingSpeed", this.averageMovingSpeed);
        jSONObject.put("maxSpeed", this.maxSpeed);
        jSONObject.put("calories", this.calories);
        jSONObject.put("averageHR", this.averageHR);
        jSONObject.put("maxHR", this.maxHR);
        jSONObject.put("averagePower", this.avgPower);
        jSONObject.put("maxPower", this.maxPower);
        jSONObject.put("normalizedPower", this.normalizedPower);
        jSONObject.put("averagePowerTarget", this.avgPowerTarget);
        jSONObject.put("avgForce", this.avgBikeForce);
        jSONObject.put("maxForce", this.maxBikeForce);
        jSONObject.put("normalizedForce", this.normalizedForce);
        jSONObject.put("leftBalance", this.leftBalance);
        jSONObject.put("rightBalance", this.rightBalance);
        jSONObject.put("averageRunCadence", this.averageRunCadence);
        jSONObject.put("maxRunCadence", this.maxRunCadence);
        jSONObject.put("averageTemperature", this.averageTemperature);
        jSONObject.put("maxTemperature", this.maxTemperature);
        jSONObject.put("minTemperature", this.minTemperature);
        jSONObject.put("groundContactTime", this.groundContactTime);
        jSONObject.put("groundContactBalanceLeft", this.groundContactBalanceLeft);
        jSONObject.put("stepSpeedLoss", this.stepSpeedLoss);
        jSONObject.put("stepSpeedLossPercent", this.stepSpeedLossPercent);
        jSONObject.put("strideLength", this.strideLength);
        jSONObject.put("verticalOscillation", this.verticalOscillation);
        jSONObject.put("verticalRatio", this.verticalRatio);
        jSONObject.put("noOfSplits", this.noOfSplits);
        jSONObject.put("splitType", this.splitType);
        jSONObject.put(NotificationConstants.KEY_DATA_MIME_TYPE, this.type);
        u0 u0Var = this.maxGradeValue;
        jSONObject.put("maxGradeValue", u0Var != null ? u0Var.g() : null);
        jSONObject.put("numClimbsAttempted", this.numClimbsAttempted);
        jSONObject.put("numClimbsCompleted", this.numClimbsCompleted);
        jSONObject.put("numClimbSends", this.numSends);
        jSONObject.put("numFalls", this.numFalls);
        jSONObject.put("avgGradeAdjustedSpeed", this.avgGradeAdjustedSpeed);
        jSONObject.put("avgStress", this.avgStress);
        jSONObject.put("maxStress", this.maxStress);
        jSONObject.put("avgStressWin", this.avgStressWin);
        jSONObject.put("avgStressLoss", this.avgStressLoss);
        jSONObject.put("avgStressDraw", this.avgStressDraw);
        jSONObject.put("gamesWon", this.gamesWon);
        jSONObject.put("gamesNotWon", this.gamesNotWon);
        jSONObject.put("gamesAverageWon", this.gamesAverageWon);
        jSONObject.put("maxPisteDifficulty", this.maxPisteDifficulty);
        jSONObject.put("maxPackWeight", this.maxPackWeight);
        jSONObject.put("avgPackWeight", this.avgPackWeight);
        return jSONObject;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final Double getLeftTorqueEffectiveness() {
        return this.leftTorqueEffectiveness;
    }

    /* JADX INFO: renamed from: Z0, reason: from getter */
    public final String getSplitType() {
        return this.splitType;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final Double getMaxBikeCadence() {
        return this.maxBikeCadence;
    }

    /* JADX INFO: renamed from: b1, reason: from getter */
    public final Double getStepSpeedLoss() {
        return this.stepSpeedLoss;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final Double getMaxBikeForce() {
        return this.maxBikeForce;
    }

    /* JADX INFO: renamed from: c1, reason: from getter */
    public final Double getStepSpeedLossPercent() {
        return this.stepSpeedLossPercent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getAverageBikeCadence() {
        return this.averageBikeCadence;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final Double getMaxDistance() {
        return this.maxDistance;
    }

    /* JADX INFO: renamed from: e1, reason: from getter */
    public final Double getStrideLength() {
        return this.strideLength;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return p005kotlin.jvm.internal.s.g(this.distance, o1Var.distance) && p005kotlin.jvm.internal.s.g(this.maxDistance, o1Var.maxDistance) && p005kotlin.jvm.internal.s.g(this.duration, o1Var.duration) && p005kotlin.jvm.internal.s.g(this.movingDuration, o1Var.movingDuration) && p005kotlin.jvm.internal.s.g(this.maxDuration, o1Var.maxDuration) && p005kotlin.jvm.internal.s.g(this.elevationGain, o1Var.elevationGain) && p005kotlin.jvm.internal.s.g(this.elevationLoss, o1Var.elevationLoss) && p005kotlin.jvm.internal.s.g(this.averageSpeed, o1Var.averageSpeed) && p005kotlin.jvm.internal.s.g(this.averageMovingSpeed, o1Var.averageMovingSpeed) && p005kotlin.jvm.internal.s.g(this.maxSpeed, o1Var.maxSpeed) && p005kotlin.jvm.internal.s.g(this.calories, o1Var.calories) && p005kotlin.jvm.internal.s.g(this.averageHR, o1Var.averageHR) && p005kotlin.jvm.internal.s.g(this.maxHR, o1Var.maxHR) && p005kotlin.jvm.internal.s.g(this.avgPower, o1Var.avgPower) && p005kotlin.jvm.internal.s.g(this.maxPower, o1Var.maxPower) && p005kotlin.jvm.internal.s.g(this.normalizedPower, o1Var.normalizedPower) && p005kotlin.jvm.internal.s.g(this.avgBikeForce, o1Var.avgBikeForce) && p005kotlin.jvm.internal.s.g(this.maxBikeForce, o1Var.maxBikeForce) && p005kotlin.jvm.internal.s.g(this.normalizedForce, o1Var.normalizedForce) && p005kotlin.jvm.internal.s.g(this.avgPowerTarget, o1Var.avgPowerTarget) && p005kotlin.jvm.internal.s.g(this.leftBalance, o1Var.leftBalance) && p005kotlin.jvm.internal.s.g(this.rightBalance, o1Var.rightBalance) && p005kotlin.jvm.internal.s.g(this.averageRunCadence, o1Var.averageRunCadence) && p005kotlin.jvm.internal.s.g(this.maxRunCadence, o1Var.maxRunCadence) && p005kotlin.jvm.internal.s.g(this.averageBikeCadence, o1Var.averageBikeCadence) && p005kotlin.jvm.internal.s.g(this.maxBikeCadence, o1Var.maxBikeCadence) && p005kotlin.jvm.internal.s.g(this.averageTemperature, o1Var.averageTemperature) && p005kotlin.jvm.internal.s.g(this.maxTemperature, o1Var.maxTemperature) && p005kotlin.jvm.internal.s.g(this.minTemperature, o1Var.minTemperature) && p005kotlin.jvm.internal.s.g(this.groundContactTime, o1Var.groundContactTime) && p005kotlin.jvm.internal.s.g(this.groundContactBalanceLeft, o1Var.groundContactBalanceLeft) && p005kotlin.jvm.internal.s.g(this.stepSpeedLoss, o1Var.stepSpeedLoss) && p005kotlin.jvm.internal.s.g(this.stepSpeedLossPercent, o1Var.stepSpeedLossPercent) && p005kotlin.jvm.internal.s.g(this.strideLength, o1Var.strideLength) && p005kotlin.jvm.internal.s.g(this.verticalOscillation, o1Var.verticalOscillation) && p005kotlin.jvm.internal.s.g(this.verticalRatio, o1Var.verticalRatio) && p005kotlin.jvm.internal.s.g(this.maxElevationGain, o1Var.maxElevationGain) && p005kotlin.jvm.internal.s.g(this.avgElevationGain, o1Var.avgElevationGain) && p005kotlin.jvm.internal.s.g(this.noOfSplits, o1Var.noOfSplits) && p005kotlin.jvm.internal.s.g(this.splitType, o1Var.splitType) && p005kotlin.jvm.internal.s.g(this.type, o1Var.type) && p005kotlin.jvm.internal.s.g(this.maxGradeValue, o1Var.maxGradeValue) && p005kotlin.jvm.internal.s.g(this.numClimbsAttempted, o1Var.numClimbsAttempted) && p005kotlin.jvm.internal.s.g(this.numFalls, o1Var.numFalls) && p005kotlin.jvm.internal.s.g(this.numClimbsCompleted, o1Var.numClimbsCompleted) && p005kotlin.jvm.internal.s.g(this.numSends, o1Var.numSends) && p005kotlin.jvm.internal.s.g(this.targetAvgSpeed, o1Var.targetAvgSpeed) && p005kotlin.jvm.internal.s.g(this.targetDistance, o1Var.targetDistance) && p005kotlin.jvm.internal.s.g(this.targetDuration, o1Var.targetDuration) && p005kotlin.jvm.internal.s.g(this.leftTorqueEffectiveness, o1Var.leftTorqueEffectiveness) && p005kotlin.jvm.internal.s.g(this.rightTorqueEffectiveness, o1Var.rightTorqueEffectiveness) && p005kotlin.jvm.internal.s.g(this.leftPedalSmoothness, o1Var.leftPedalSmoothness) && p005kotlin.jvm.internal.s.g(this.rightPedalSmoothness, o1Var.rightPedalSmoothness) && p005kotlin.jvm.internal.s.g(this.mode, o1Var.mode) && p005kotlin.jvm.internal.s.g(this.weightedMeanBestFiveMaxSpeedOverTenSeconds, o1Var.weightedMeanBestFiveMaxSpeedOverTenSeconds) && p005kotlin.jvm.internal.s.g(this.avgGradeAdjustedSpeed, o1Var.avgGradeAdjustedSpeed) && p005kotlin.jvm.internal.s.g(this.avgStress, o1Var.avgStress) && p005kotlin.jvm.internal.s.g(this.maxStress, o1Var.maxStress) && p005kotlin.jvm.internal.s.g(this.avgStressWin, o1Var.avgStressWin) && p005kotlin.jvm.internal.s.g(this.avgStressLoss, o1Var.avgStressLoss) && p005kotlin.jvm.internal.s.g(this.avgStressDraw, o1Var.avgStressDraw) && p005kotlin.jvm.internal.s.g(this.gamesWon, o1Var.gamesWon) && p005kotlin.jvm.internal.s.g(this.gamesNotWon, o1Var.gamesNotWon) && p005kotlin.jvm.internal.s.g(this.gamesAverageWon, o1Var.gamesAverageWon) && p005kotlin.jvm.internal.s.g(this.maxPisteDifficulty, o1Var.maxPisteDifficulty) && p005kotlin.jvm.internal.s.g(this.maxPackWeight, o1Var.maxPackWeight) && p005kotlin.jvm.internal.s.g(this.avgPackWeight, o1Var.avgPackWeight);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getAverageHR() {
        return this.averageHR;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final Double getMaxDuration() {
        return this.maxDuration;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getAverageMovingSpeed() {
        return this.averageMovingSpeed;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final Double getMaxElevationGain() {
        return this.maxElevationGain;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getAverageRunCadence() {
        return this.averageRunCadence;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final u0 getMaxGradeValue() {
        return this.maxGradeValue;
    }

    /* JADX INFO: renamed from: h1, reason: from getter */
    public final Double getTargetAvgSpeed() {
        return this.targetAvgSpeed;
    }

    public final int hashCode() {
        Double d14 = this.distance;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.maxDistance;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.duration;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.movingDuration;
        int iHashCode4 = (iHashCode3 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.maxDuration;
        int iHashCode5 = (iHashCode4 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.elevationGain;
        int iHashCode6 = (iHashCode5 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.elevationLoss;
        int iHashCode7 = (iHashCode6 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.averageSpeed;
        int iHashCode8 = (iHashCode7 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.averageMovingSpeed;
        int iHashCode9 = (iHashCode8 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.maxSpeed;
        int iHashCode10 = (iHashCode9 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.calories;
        int iHashCode11 = (iHashCode10 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.averageHR;
        int iHashCode12 = (iHashCode11 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Double d34 = this.maxHR;
        int iHashCode13 = (iHashCode12 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.avgPower;
        int iHashCode14 = (iHashCode13 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Double d36 = this.maxPower;
        int iHashCode15 = (iHashCode14 + (d36 == null ? 0 : d36.hashCode())) * 31;
        Double d37 = this.normalizedPower;
        int iHashCode16 = (iHashCode15 + (d37 == null ? 0 : d37.hashCode())) * 31;
        Double d38 = this.avgBikeForce;
        int iHashCode17 = (iHashCode16 + (d38 == null ? 0 : d38.hashCode())) * 31;
        Double d39 = this.maxBikeForce;
        int iHashCode18 = (iHashCode17 + (d39 == null ? 0 : d39.hashCode())) * 31;
        Double d44 = this.normalizedForce;
        int iHashCode19 = (iHashCode18 + (d44 == null ? 0 : d44.hashCode())) * 31;
        Double d45 = this.avgPowerTarget;
        int iHashCode20 = (iHashCode19 + (d45 == null ? 0 : d45.hashCode())) * 31;
        Double d46 = this.leftBalance;
        int iHashCode21 = (iHashCode20 + (d46 == null ? 0 : d46.hashCode())) * 31;
        Double d47 = this.rightBalance;
        int iHashCode22 = (iHashCode21 + (d47 == null ? 0 : d47.hashCode())) * 31;
        Double d48 = this.averageRunCadence;
        int iHashCode23 = (iHashCode22 + (d48 == null ? 0 : d48.hashCode())) * 31;
        Double d49 = this.maxRunCadence;
        int iHashCode24 = (iHashCode23 + (d49 == null ? 0 : d49.hashCode())) * 31;
        Double d54 = this.averageBikeCadence;
        int iHashCode25 = (iHashCode24 + (d54 == null ? 0 : d54.hashCode())) * 31;
        Double d55 = this.maxBikeCadence;
        int iHashCode26 = (iHashCode25 + (d55 == null ? 0 : d55.hashCode())) * 31;
        Double d56 = this.averageTemperature;
        int iHashCode27 = (iHashCode26 + (d56 == null ? 0 : d56.hashCode())) * 31;
        Double d57 = this.maxTemperature;
        int iHashCode28 = (iHashCode27 + (d57 == null ? 0 : d57.hashCode())) * 31;
        Double d58 = this.minTemperature;
        int iHashCode29 = (iHashCode28 + (d58 == null ? 0 : d58.hashCode())) * 31;
        Double d59 = this.groundContactTime;
        int iHashCode30 = (iHashCode29 + (d59 == null ? 0 : d59.hashCode())) * 31;
        Double d64 = this.groundContactBalanceLeft;
        int iHashCode31 = (iHashCode30 + (d64 == null ? 0 : d64.hashCode())) * 31;
        Double d65 = this.stepSpeedLoss;
        int iHashCode32 = (iHashCode31 + (d65 == null ? 0 : d65.hashCode())) * 31;
        Double d66 = this.stepSpeedLossPercent;
        int iHashCode33 = (iHashCode32 + (d66 == null ? 0 : d66.hashCode())) * 31;
        Double d67 = this.strideLength;
        int iHashCode34 = (iHashCode33 + (d67 == null ? 0 : d67.hashCode())) * 31;
        Double d68 = this.verticalOscillation;
        int iHashCode35 = (iHashCode34 + (d68 == null ? 0 : d68.hashCode())) * 31;
        Double d69 = this.verticalRatio;
        int iHashCode36 = (iHashCode35 + (d69 == null ? 0 : d69.hashCode())) * 31;
        Double d74 = this.maxElevationGain;
        int iHashCode37 = (iHashCode36 + (d74 == null ? 0 : d74.hashCode())) * 31;
        Double d75 = this.avgElevationGain;
        int iHashCode38 = (iHashCode37 + (d75 == null ? 0 : d75.hashCode())) * 31;
        Integer num = this.noOfSplits;
        int iHashCode39 = (iHashCode38 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.splitType;
        int iHashCode40 = (iHashCode39 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.type;
        int iHashCode41 = (iHashCode40 + (num2 == null ? 0 : num2.hashCode())) * 31;
        u0 u0Var = this.maxGradeValue;
        int iHashCode42 = (iHashCode41 + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        Integer num3 = this.numClimbsAttempted;
        int iHashCode43 = (iHashCode42 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.numFalls;
        int iHashCode44 = (iHashCode43 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.numClimbsCompleted;
        int iHashCode45 = (iHashCode44 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.numSends;
        int iHashCode46 = (iHashCode45 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Double d76 = this.targetAvgSpeed;
        int iHashCode47 = (iHashCode46 + (d76 == null ? 0 : d76.hashCode())) * 31;
        Double d77 = this.targetDistance;
        int iHashCode48 = (iHashCode47 + (d77 == null ? 0 : d77.hashCode())) * 31;
        Double d78 = this.targetDuration;
        int iHashCode49 = (iHashCode48 + (d78 == null ? 0 : d78.hashCode())) * 31;
        Double d79 = this.leftTorqueEffectiveness;
        int iHashCode50 = (iHashCode49 + (d79 == null ? 0 : d79.hashCode())) * 31;
        Double d84 = this.rightTorqueEffectiveness;
        int iHashCode51 = (iHashCode50 + (d84 == null ? 0 : d84.hashCode())) * 31;
        Double d85 = this.leftPedalSmoothness;
        int iHashCode52 = (iHashCode51 + (d85 == null ? 0 : d85.hashCode())) * 31;
        Double d86 = this.rightPedalSmoothness;
        int iHashCode53 = (iHashCode52 + (d86 == null ? 0 : d86.hashCode())) * 31;
        String str2 = this.mode;
        int iHashCode54 = (iHashCode53 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d87 = this.weightedMeanBestFiveMaxSpeedOverTenSeconds;
        int iHashCode55 = (iHashCode54 + (d87 == null ? 0 : d87.hashCode())) * 31;
        Double d88 = this.avgGradeAdjustedSpeed;
        int iHashCode56 = (iHashCode55 + (d88 == null ? 0 : d88.hashCode())) * 31;
        Double d89 = this.avgStress;
        int iHashCode57 = (iHashCode56 + (d89 == null ? 0 : d89.hashCode())) * 31;
        Double d93 = this.maxStress;
        int iHashCode58 = (iHashCode57 + (d93 == null ? 0 : d93.hashCode())) * 31;
        Double d94 = this.avgStressWin;
        int iHashCode59 = (iHashCode58 + (d94 == null ? 0 : d94.hashCode())) * 31;
        Double d95 = this.avgStressLoss;
        int iHashCode60 = (iHashCode59 + (d95 == null ? 0 : d95.hashCode())) * 31;
        Double d96 = this.avgStressDraw;
        int iHashCode61 = (iHashCode60 + (d96 == null ? 0 : d96.hashCode())) * 31;
        Integer num7 = this.gamesWon;
        int iHashCode62 = (iHashCode61 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.gamesNotWon;
        int iHashCode63 = (iHashCode62 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Double d97 = this.gamesAverageWon;
        int iHashCode64 = (iHashCode63 + (d97 == null ? 0 : d97.hashCode())) * 31;
        String str3 = this.maxPisteDifficulty;
        int iHashCode65 = (iHashCode64 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d98 = this.maxPackWeight;
        int iHashCode66 = (iHashCode65 + (d98 == null ? 0 : d98.hashCode())) * 31;
        Double d99 = this.avgPackWeight;
        return iHashCode66 + (d99 != null ? d99.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getAverageSpeed() {
        return this.averageSpeed;
    }

    public final String i0() {
        u0 u0Var = this.maxGradeValue;
        if (u0Var != null) {
            return u0Var.getValueKey();
        }
        return null;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getAverageTemperature() {
        return this.averageTemperature;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final Double getMaxHR() {
        return this.maxHR;
    }

    /* JADX INFO: renamed from: j1, reason: from getter */
    public final Double getVerticalOscillation() {
        return this.verticalOscillation;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Double getAvgBikeForce() {
        return this.avgBikeForce;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final Double getMaxPackWeight() {
        return this.maxPackWeight;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getAvgElevationGain() {
        return this.avgElevationGain;
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final String getMaxPisteDifficulty() {
        return this.maxPisteDifficulty;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Double getAvgGradeAdjustedSpeed() {
        return this.avgGradeAdjustedSpeed;
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final Double getMaxPower() {
        return this.maxPower;
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final Double getMaxRunCadence() {
        return this.maxRunCadence;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Double getAvgPackWeight() {
        return this.avgPackWeight;
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final Double getMaxSpeed() {
        return this.maxSpeed;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Double getAvgPower() {
        return this.avgPower;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Double getAvgPowerTarget() {
        return this.avgPowerTarget;
    }

    /* JADX INFO: renamed from: s1, reason: from getter */
    public final Double getVerticalRatio() {
        return this.verticalRatio;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Double getAvgStress() {
        return this.avgStress;
    }

    /* JADX INFO: renamed from: t1, reason: from getter */
    public final Double getWeightedMeanBestFiveMaxSpeedOverTenSeconds() {
        return this.weightedMeanBestFiveMaxSpeedOverTenSeconds;
    }

    public final String toString() {
        Double d14 = this.distance;
        Double d15 = this.maxDistance;
        Double d16 = this.duration;
        Double d17 = this.movingDuration;
        Double d18 = this.maxDuration;
        Double d19 = this.elevationGain;
        Double d24 = this.elevationLoss;
        Double d25 = this.averageSpeed;
        Double d26 = this.averageMovingSpeed;
        Double d27 = this.maxSpeed;
        Double d28 = this.calories;
        Double d29 = this.averageHR;
        Double d34 = this.maxHR;
        Double d35 = this.avgPower;
        Double d36 = this.maxPower;
        Double d37 = this.normalizedPower;
        Double d38 = this.avgBikeForce;
        Double d39 = this.maxBikeForce;
        Double d44 = this.normalizedForce;
        Double d45 = this.avgPowerTarget;
        Double d46 = this.leftBalance;
        Double d47 = this.rightBalance;
        Double d48 = this.averageRunCadence;
        Double d49 = this.maxRunCadence;
        Double d54 = this.averageBikeCadence;
        Double d55 = this.maxBikeCadence;
        Double d56 = this.averageTemperature;
        Double d57 = this.maxTemperature;
        Double d58 = this.minTemperature;
        Double d59 = this.groundContactTime;
        Double d64 = this.groundContactBalanceLeft;
        Double d65 = this.stepSpeedLoss;
        Double d66 = this.stepSpeedLossPercent;
        Double d67 = this.strideLength;
        Double d68 = this.verticalOscillation;
        Double d69 = this.verticalRatio;
        Double d74 = this.maxElevationGain;
        Double d75 = this.avgElevationGain;
        Integer num = this.noOfSplits;
        String str = this.splitType;
        Integer num2 = this.type;
        u0 u0Var = this.maxGradeValue;
        Integer num3 = this.numClimbsAttempted;
        Integer num4 = this.numFalls;
        Integer num5 = this.numClimbsCompleted;
        Integer num6 = this.numSends;
        Double d76 = this.targetAvgSpeed;
        Double d77 = this.targetDistance;
        Double d78 = this.targetDuration;
        Double d79 = this.leftTorqueEffectiveness;
        Double d84 = this.rightTorqueEffectiveness;
        Double d85 = this.leftPedalSmoothness;
        Double d86 = this.rightPedalSmoothness;
        String str2 = this.mode;
        Double d87 = this.weightedMeanBestFiveMaxSpeedOverTenSeconds;
        Double d88 = this.avgGradeAdjustedSpeed;
        Double d89 = this.avgStress;
        Double d93 = this.maxStress;
        Double d94 = this.avgStressWin;
        Double d95 = this.avgStressLoss;
        Double d96 = this.avgStressDraw;
        Integer num7 = this.gamesWon;
        Integer num8 = this.gamesNotWon;
        Double d97 = this.gamesAverageWon;
        String str3 = this.maxPisteDifficulty;
        Double d98 = this.maxPackWeight;
        Double d99 = this.avgPackWeight;
        StringBuilder sbI = tn.k.i("SplitSummaryDTO(distance=", d14, d15, ", maxDistance=", ", duration=");
        b71.i.p(d16, d17, ", movingDuration=", ", maxDuration=", sbI);
        b71.i.p(d18, d19, ", elevationGain=", ", elevationLoss=", sbI);
        b71.i.p(d24, d25, ", averageSpeed=", ", averageMovingSpeed=", sbI);
        b71.i.p(d26, d27, ", maxSpeed=", ", calories=", sbI);
        b71.i.p(d28, d29, ", averageHR=", ", maxHR=", sbI);
        b71.i.p(d34, d35, ", avgPower=", ", maxPower=", sbI);
        b71.i.p(d36, d37, ", normalizedPower=", ", avgBikeForce=", sbI);
        b71.i.p(d38, d39, ", maxBikeForce=", ", normalizedForce=", sbI);
        b71.i.p(d44, d45, ", avgPowerTarget=", ", leftBalance=", sbI);
        b71.i.p(d46, d47, ", rightBalance=", ", averageRunCadence=", sbI);
        b71.i.p(d48, d49, ", maxRunCadence=", ", averageBikeCadence=", sbI);
        b71.i.p(d54, d55, ", maxBikeCadence=", ", averageTemperature=", sbI);
        b71.i.p(d56, d57, ", maxTemperature=", ", minTemperature=", sbI);
        b71.i.p(d58, d59, ", groundContactTime=", ", groundContactBalanceLeft=", sbI);
        b71.i.p(d64, d65, ", stepSpeedLoss=", ", stepSpeedLossPercent=", sbI);
        b71.i.p(d66, d67, ", strideLength=", ", verticalOscillation=", sbI);
        b71.i.p(d68, d69, ", verticalRatio=", ", maxElevationGain=", sbI);
        b71.i.p(d74, d75, ", avgElevationGain=", ", noOfSplits=", sbI);
        p6.b.l(num, ", splitType=", str, ", type=", sbI);
        sbI.append(num2);
        sbI.append(", maxGradeValue=");
        sbI.append(u0Var);
        sbI.append(", numClimbsAttempted=");
        j20.x.m(sbI, num3, ", numFalls=", num4, ", numClimbsCompleted=");
        j20.x.m(sbI, num5, ", numSends=", num6, ", targetAvgSpeed=");
        b71.i.p(d76, d77, ", targetDistance=", ", targetDuration=", sbI);
        b71.i.p(d78, d79, ", leftTorqueEffectiveness=", ", rightTorqueEffectiveness=", sbI);
        b71.i.p(d84, d85, ", leftPedalSmoothness=", ", rightPedalSmoothness=", sbI);
        b71.i.u(sbI, d86, ", mode=", str2, ", weightedMeanBestFiveMaxSpeedOverTenSeconds=");
        b71.i.p(d87, d88, ", avgGradeAdjustedSpeed=", ", avgStress=", sbI);
        b71.i.p(d89, d93, ", maxStress=", ", avgStressWin=", sbI);
        b71.i.p(d94, d95, ", avgStressLoss=", ", avgStressDraw=", sbI);
        b71.i.t(sbI, d96, ", gamesWon=", num7, ", gamesNotWon=");
        b71.i.v(sbI, num8, ", gamesAverageWon=", d97, ", maxPisteDifficulty=");
        b71.i.x(sbI, str3, ", maxPackWeight=", d98, ", avgPackWeight=");
        return b71.i.g(sbI, d99, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Double getCalories() {
        return this.calories;
    }

    public final void v1(Double d14) {
        this.avgElevationGain = d14;
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final Double getMaxTemperature() {
        return this.maxTemperature;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.distance;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.maxDistance;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.duration;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.movingDuration;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.maxDuration;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.elevationGain;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        Double d24 = this.elevationLoss;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        Double d25 = this.averageSpeed;
        if (d25 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d25);
        }
        Double d26 = this.averageMovingSpeed;
        if (d26 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d26);
        }
        Double d27 = this.maxSpeed;
        if (d27 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d27);
        }
        Double d28 = this.calories;
        if (d28 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d28);
        }
        Double d29 = this.averageHR;
        if (d29 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d29);
        }
        Double d34 = this.maxHR;
        if (d34 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d34);
        }
        Double d35 = this.avgPower;
        if (d35 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d35);
        }
        Double d36 = this.maxPower;
        if (d36 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d36);
        }
        Double d37 = this.normalizedPower;
        if (d37 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d37);
        }
        Double d38 = this.avgBikeForce;
        if (d38 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d38);
        }
        Double d39 = this.maxBikeForce;
        if (d39 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d39);
        }
        Double d44 = this.normalizedForce;
        if (d44 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d44);
        }
        Double d45 = this.avgPowerTarget;
        if (d45 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d45);
        }
        Double d46 = this.leftBalance;
        if (d46 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d46);
        }
        Double d47 = this.rightBalance;
        if (d47 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d47);
        }
        Double d48 = this.averageRunCadence;
        if (d48 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d48);
        }
        Double d49 = this.maxRunCadence;
        if (d49 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d49);
        }
        Double d54 = this.averageBikeCadence;
        if (d54 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d54);
        }
        Double d55 = this.maxBikeCadence;
        if (d55 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d55);
        }
        Double d56 = this.averageTemperature;
        if (d56 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d56);
        }
        Double d57 = this.maxTemperature;
        if (d57 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d57);
        }
        Double d58 = this.minTemperature;
        if (d58 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d58);
        }
        Double d59 = this.groundContactTime;
        if (d59 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d59);
        }
        Double d64 = this.groundContactBalanceLeft;
        if (d64 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d64);
        }
        Double d65 = this.stepSpeedLoss;
        if (d65 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d65);
        }
        Double d66 = this.stepSpeedLossPercent;
        if (d66 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d66);
        }
        Double d67 = this.strideLength;
        if (d67 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d67);
        }
        Double d68 = this.verticalOscillation;
        if (d68 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d68);
        }
        Double d69 = this.verticalRatio;
        if (d69 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d69);
        }
        Double d74 = this.maxElevationGain;
        if (d74 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d74);
        }
        Double d75 = this.avgElevationGain;
        if (d75 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d75);
        }
        Integer num = this.noOfSplits;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.splitType);
        Integer num2 = this.type;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeParcelable(this.maxGradeValue, i14);
        Integer num3 = this.numClimbsAttempted;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.numFalls;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Integer num5 = this.numClimbsCompleted;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        Integer num6 = this.numSends;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num6);
        }
        Double d76 = this.targetAvgSpeed;
        if (d76 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d76);
        }
        Double d77 = this.targetDistance;
        if (d77 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d77);
        }
        Double d78 = this.targetDuration;
        if (d78 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d78);
        }
        Double d79 = this.leftTorqueEffectiveness;
        if (d79 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d79);
        }
        Double d84 = this.rightTorqueEffectiveness;
        if (d84 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d84);
        }
        Double d85 = this.leftPedalSmoothness;
        if (d85 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d85);
        }
        Double d86 = this.rightPedalSmoothness;
        if (d86 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d86);
        }
        parcel.writeString(this.mode);
        Double d87 = this.weightedMeanBestFiveMaxSpeedOverTenSeconds;
        if (d87 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d87);
        }
        Double d88 = this.avgGradeAdjustedSpeed;
        if (d88 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d88);
        }
        Double d89 = this.avgStress;
        if (d89 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d89);
        }
        Double d93 = this.maxStress;
        if (d93 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d93);
        }
        Double d94 = this.avgStressWin;
        if (d94 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d94);
        }
        Double d95 = this.avgStressLoss;
        if (d95 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d95);
        }
        Double d96 = this.avgStressDraw;
        if (d96 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d96);
        }
        Integer num7 = this.gamesWon;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num7);
        }
        Integer num8 = this.gamesNotWon;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num8);
        }
        Double d97 = this.gamesAverageWon;
        if (d97 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d97);
        }
        parcel.writeString(this.maxPisteDifficulty);
        Double d98 = this.maxPackWeight;
        if (d98 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d98);
        }
        Double d99 = this.avgPackWeight;
        if (d99 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d99);
        }
    }

    /* JADX INFO: renamed from: x0, reason: from getter */
    public final Double getMinTemperature() {
        return this.minTemperature;
    }

    public final void x1(Double d14) {
        this.distance = d14;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Double getDistance() {
        return this.distance;
    }

    public final void y1(Double d14) {
        this.duration = d14;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Double getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bG\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0006R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u0006R\u0014\u00102\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00103\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u0014\u00105\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010\u0006R\u0014\u00106\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010\u0006R\u0014\u00107\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010\u0006R\u0014\u00108\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u0010\u0006R\u0014\u00109\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010\u0006R\u0014\u0010:\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010\u0006R\u0014\u0010;\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010\u0006R\u0014\u0010<\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010\u0006R\u0014\u0010=\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010\u0006R\u0014\u0010>\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010\u0006R\u0014\u0010?\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010\u0006R\u0014\u0010@\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010\u0006R\u0014\u0010A\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010\u0006R\u0014\u0010B\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010\u0006R\u0014\u0010C\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010\u0006R\u0014\u0010D\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010\u0006R\u0014\u0010E\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010\u0006R\u0014\u0010F\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010\u0006R\u0014\u0010G\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010\u0006R\u0014\u0010H\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010\u0006R\u0014\u0010I\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010\u0006R\u0014\u0010J\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010\u0006¨\u0006K"}, d2 = {"Lps/o1$a;", "", "<init>", "()V", "", "KEY_DISTANCE", "Ljava/lang/String;", "KEY_MAX_DISTANCE", "KEY_MAX_DISTANCE_WITH_PRECISION", "KEY_DURATION", "KEY_MOVING_DURATION", "KEY_MAX_DURATION", "KEY_ELEVATION_GAIN", "KEY_TOTAL_ASCENT", "KEY_ELEVATION_LOSS", "KEY_MAX_ELEVATION_GAIN", "KEY_AVG_ELEVATION_GAIN", "KEY_AVERAGE_SPEED", "KEY_AVERAGE_MOVING_SPEED", "KEY_MAX_SPEED", "KEY_CALORIES", "KEY_AVERAGE_HR", "KEY_MAX_HR", "KEY_AVG_POWER", "KEY_MAX_POWER", "KEY_NORMALIZED_POWER", "KEY_AVG_BIKE_FORCE", "KEY_MAX_BIKE_FORCE", "KEY_NORMALIZED_FORCE", "KEY_AVG_POWER_TARGET", "KEY_LEFT_BALANCE", "KEY_RIGHT_BALANCE", "KEY_AVERAGE_RUN_CADENCE", "KEY_MAX_RUN_CADENCE", "KEY_AVERAGE_BIKE_CADENCE", "KEY_MAX_BIKE_CADENCE", "KEY_AVERAGE_TEMPERATURE", "KEY_MAX_TEMPERATURE", "KEY_MIN_TEMPERATURE", "KEY_GROUND_CONTRACT_TIME", "KEY_GROUND_CONTRACT_BALANCE_LEFT", "KEY_STEP_SPEED_LOSS", "KEY_STEP_SPEED_LOSS_PERCENT", "KEY_STRIDE_LENGTH", "KEY_VERTICAL_OSCILLATION", "KEY_VERTICAL_RATIO", "KEY_NO_SPLITS", "KEY_SPLIT_TYPE", "KEY_TYPE", "KEY_MAX_GRADE_VALUE", "KEY_NUM_CLIMBS_ATTEMPTED", "KEY_NUM_CLIMBS_COMPLETED", "KEY_NUM_CLIMBS_SENDS", "KEY_NUM_FALLS", "KEY_TARGET_AVG_SPEED", "KEY_TARGET_DURATION", "KEY_TARGET_DISTANCE", "KEY_LEFT_TORQUE_EFFECTIVENESS", "KEY_RIGHT_TORQUE_EFFECTIVENESS", "KEY_LEFT_PEDAL_SMOOTHNESS", "KEY_RIGHT_PEDAL_SMOOTHNESS", "KEY_MODE", "BEST_FIVE_MAX_10_SECOND_MEAN_SPEED", "KEY_AVERAGE_GRADE_ADJUSTED_SPEED", "KEY_AVERAGE_STRESS", "KEY_MAX_STRESS", "KEY_AVERAGE_STRESS_WIN", "KEY_AVERAGE_STRESS_LOSS", "KEY_AVERAGE_STRESS_DRAW", "KEY_GAMES_WON", "KEY_GAMES_NOT_WON", "KEY_GAMES_AVERAGE_WON", "KEY_MAX_PISTE_DIFFICULTY", "KEY_MAX_PACK_WEIGHT", "KEY_AVG_PACK_WEIGHT", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public o1(Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d44, Double d45, Double d46, Double d47, Double d48, Double d49, Double d54, Double d55, Double d56, Double d57, Double d58, Double d59, Double d64, Double d65, Double d66, Double d67, Double d68, Double d69, Double d74, Double d75, Integer num, String str, Integer num2, u0 u0Var, Integer num3, Integer num4, Integer num5, Integer num6, Double d76, Double d77, Double d78, Double d79, Double d84, Double d85, Double d86, String str2, Double d87, Double d88, Double d89, Double d93, Double d94, Double d95, Double d96, Integer num7, Integer num8, Double d97, String str3, Double d98, Double d99) {
        this.distance = d14;
        this.maxDistance = d15;
        this.duration = d16;
        this.movingDuration = d17;
        this.maxDuration = d18;
        this.elevationGain = d19;
        this.elevationLoss = d24;
        this.averageSpeed = d25;
        this.averageMovingSpeed = d26;
        this.maxSpeed = d27;
        this.calories = d28;
        this.averageHR = d29;
        this.maxHR = d34;
        this.avgPower = d35;
        this.maxPower = d36;
        this.normalizedPower = d37;
        this.avgBikeForce = d38;
        this.maxBikeForce = d39;
        this.normalizedForce = d44;
        this.avgPowerTarget = d45;
        this.leftBalance = d46;
        this.rightBalance = d47;
        this.averageRunCadence = d48;
        this.maxRunCadence = d49;
        this.averageBikeCadence = d54;
        this.maxBikeCadence = d55;
        this.averageTemperature = d56;
        this.maxTemperature = d57;
        this.minTemperature = d58;
        this.groundContactTime = d59;
        this.groundContactBalanceLeft = d64;
        this.stepSpeedLoss = d65;
        this.stepSpeedLossPercent = d66;
        this.strideLength = d67;
        this.verticalOscillation = d68;
        this.verticalRatio = d69;
        this.maxElevationGain = d74;
        this.avgElevationGain = d75;
        this.noOfSplits = num;
        this.splitType = str;
        this.type = num2;
        this.maxGradeValue = u0Var;
        this.numClimbsAttempted = num3;
        this.numFalls = num4;
        this.numClimbsCompleted = num5;
        this.numSends = num6;
        this.targetAvgSpeed = d76;
        this.targetDistance = d77;
        this.targetDuration = d78;
        this.leftTorqueEffectiveness = d79;
        this.rightTorqueEffectiveness = d84;
        this.leftPedalSmoothness = d85;
        this.rightPedalSmoothness = d86;
        this.mode = str2;
        this.weightedMeanBestFiveMaxSpeedOverTenSeconds = d87;
        this.avgGradeAdjustedSpeed = d88;
        this.avgStress = d89;
        this.maxStress = d93;
        this.avgStressWin = d94;
        this.avgStressLoss = d95;
        this.avgStressDraw = d96;
        this.gamesWon = num7;
        this.gamesNotWon = num8;
        this.gamesAverageWon = d97;
        this.maxPisteDifficulty = str3;
        this.maxPackWeight = d98;
        this.avgPackWeight = d99;
    }

    public o1() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
    }
}
