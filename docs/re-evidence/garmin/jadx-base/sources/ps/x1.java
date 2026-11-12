package ps;

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
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0003\b»\u0001\b\u0087\b\u0018\u00002\u00020\u0001:\u0001bB\u008d\b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010N\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010^\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\u0017\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b`\u0010aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010c\u001a\u0004\bi\u0010e\"\u0004\bj\u0010gR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bk\u0010c\u001a\u0004\bl\u0010e\"\u0004\bm\u0010gR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bt\u0010o\u001a\u0004\bu\u0010q\"\u0004\bv\u0010sR$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bw\u0010o\u001a\u0004\bx\u0010q\"\u0004\by\u0010sR$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bu\u0010o\u001a\u0004\bz\u0010q\"\u0004\b{\u0010sR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b|\u0010o\u001a\u0004\b}\u0010qR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bp\u0010o\u001a\u0004\b~\u0010qR%\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\b\u007f\u0010o\u001a\u0004\bw\u0010q\"\u0005\b\u0080\u0001\u0010sR'\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010o\u001a\u0005\b\u0082\u0001\u0010q\"\u0005\b\u0083\u0001\u0010sR'\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010o\u001a\u0005\b\u0085\u0001\u0010q\"\u0005\b\u0086\u0001\u0010sR'\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010o\u001a\u0005\b\u0088\u0001\u0010q\"\u0005\b\u0089\u0001\u0010sR'\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010o\u001a\u0005\b\u008b\u0001\u0010q\"\u0005\b\u008c\u0001\u0010sR'\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010o\u001a\u0005\b\u008e\u0001\u0010q\"\u0005\b\u008f\u0001\u0010sR*\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R'\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010o\u001a\u0005\b\u0097\u0001\u0010q\"\u0005\b\u0098\u0001\u0010sR'\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010o\u001a\u0005\b\u009a\u0001\u0010q\"\u0005\b\u009b\u0001\u0010sR0\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R*\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010\u0091\u0001\u001a\u0006\b©\u0001\u0010\u0093\u0001\"\u0006\bª\u0001\u0010\u0095\u0001R*\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010£\u0001\u001a\u0006\b¬\u0001\u0010¥\u0001\"\u0006\b\u00ad\u0001\u0010§\u0001R(\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010\u008b\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R*\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R\u001e\u0010!\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¯\u0001\u0010o\u001a\u0005\b®\u0001\u0010qR\u001e\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¹\u0001\u0010o\u001a\u0005\bº\u0001\u0010qR\u001e\u0010#\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bµ\u0001\u0010o\u001a\u0005\b»\u0001\u0010qR\u001d\u0010$\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\r\n\u0004\bx\u0010o\u001a\u0005\b¼\u0001\u0010qR\u001e\u0010%\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b½\u0001\u0010o\u001a\u0005\b¾\u0001\u0010qR\u001d\u0010&\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\r\n\u0004\bz\u0010o\u001a\u0005\b¿\u0001\u0010qR\u001d\u0010'\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0088\u0001\u0010o\u001a\u0004\b|\u0010qR\u001e\u0010(\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÀ\u0001\u0010o\u001a\u0005\bÁ\u0001\u0010qR\u001e\u0010)\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÂ\u0001\u0010o\u001a\u0005\bÃ\u0001\u0010qR\u001e\u0010*\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÄ\u0001\u0010o\u001a\u0005\bÅ\u0001\u0010qR\u001e\u0010+\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÆ\u0001\u0010o\u001a\u0005\bÇ\u0001\u0010qR'\u0010,\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010o\u001a\u0005\bÈ\u0001\u0010q\"\u0005\bÉ\u0001\u0010sR\u001e\u0010-\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¬\u0001\u0010o\u001a\u0005\bÊ\u0001\u0010qR'\u0010.\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\bË\u0001\u0010o\u001a\u0005\b\u0096\u0001\u0010q\"\u0005\bÌ\u0001\u0010sR'\u0010/\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\bÍ\u0001\u0010o\u001a\u0005\bÎ\u0001\u0010q\"\u0005\bÏ\u0001\u0010sR\u001e\u00100\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010o\u001a\u0005\bÐ\u0001\u0010qR'\u00101\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\bÑ\u0001\u0010o\u001a\u0005\b\u0081\u0001\u0010q\"\u0005\bÒ\u0001\u0010sR'\u00102\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\bÓ\u0001\u0010o\u001a\u0005\bÔ\u0001\u0010q\"\u0005\bÕ\u0001\u0010sR\u001e\u00103\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÎ\u0001\u0010o\u001a\u0005\bÖ\u0001\u0010qR\u001e\u00104\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b×\u0001\u0010o\u001a\u0005\bØ\u0001\u0010qR\u001e\u00105\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÙ\u0001\u0010o\u001a\u0005\bÚ\u0001\u0010qR&\u00106\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0005\bÁ\u0001\u0010o\u001a\u0004\b\u007f\u0010q\"\u0005\bÛ\u0001\u0010sR'\u00107\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\bÈ\u0001\u0010o\u001a\u0005\bÜ\u0001\u0010q\"\u0005\bÝ\u0001\u0010sR\u001e\u00108\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÞ\u0001\u0010o\u001a\u0005\bß\u0001\u0010qR\u001e\u00109\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÅ\u0001\u0010o\u001a\u0005\bà\u0001\u0010qR\u001e\u0010:\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bá\u0001\u0010o\u001a\u0005\b\u008d\u0001\u0010qR\u001d\u0010;\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\r\n\u0005\bâ\u0001\u0010o\u001a\u0004\bn\u0010qR\u001e\u0010<\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010o\u001a\u0005\bã\u0001\u0010qR\u001e\u0010=\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bä\u0001\u0010o\u001a\u0005\bå\u0001\u0010qR\u001e\u0010>\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bæ\u0001\u0010o\u001a\u0005\b\u009c\u0001\u0010qR\u001e\u0010?\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bç\u0001\u0010o\u001a\u0005\b\u0087\u0001\u0010qR \u0010@\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bå\u0001\u0010£\u0001\u001a\u0006\b³\u0001\u0010¥\u0001R \u0010A\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bè\u0001\u0010£\u0001\u001a\u0006\bé\u0001\u0010¥\u0001R \u0010B\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÃ\u0001\u0010\u0091\u0001\u001a\u0006\bê\u0001\u0010\u0093\u0001R\u001f\u0010C\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b~\u0010\u0091\u0001\u001a\u0006\bë\u0001\u0010\u0093\u0001R\u001e\u0010D\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bì\u0001\u0010o\u001a\u0005\b\u0099\u0001\u0010qR\u001e\u0010E\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÐ\u0001\u0010o\u001a\u0005\bÞ\u0001\u0010qR\u001e\u0010F\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bí\u0001\u0010o\u001a\u0005\bî\u0001\u0010qR\u001e\u0010G\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bï\u0001\u0010o\u001a\u0005\bð\u0001\u0010qR\u001e\u0010H\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÊ\u0001\u0010o\u001a\u0005\bñ\u0001\u0010qR\u001e\u0010I\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bò\u0001\u0010o\u001a\u0005\bó\u0001\u0010qR\u001e\u0010J\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b©\u0001\u0010o\u001a\u0005\bô\u0001\u0010qR\u001e\u0010K\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bõ\u0001\u0010o\u001a\u0005\bö\u0001\u0010qR \u0010L\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b÷\u0001\u0010\u0091\u0001\u001a\u0006\bø\u0001\u0010\u0093\u0001R \u0010M\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bù\u0001\u0010\u0091\u0001\u001a\u0006\bú\u0001\u0010\u0093\u0001R*\u0010O\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002R*\u0010P\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0081\u0002\u0010£\u0001\u001a\u0006\b\u0082\u0002\u0010¥\u0001\"\u0006\b\u0083\u0002\u0010§\u0001R*\u0010Q\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0084\u0002\u0010£\u0001\u001a\u0006\b\u0085\u0002\u0010¥\u0001\"\u0006\b\u0086\u0002\u0010§\u0001R*\u0010R\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0087\u0002\u0010£\u0001\u001a\u0006\bÓ\u0001\u0010¥\u0001\"\u0006\b\u0088\u0002\u0010§\u0001R'\u0010S\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0089\u0002\u0010o\u001a\u0005\b\u008a\u0002\u0010q\"\u0005\b\u008b\u0002\u0010sR'\u0010T\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008c\u0002\u0010o\u001a\u0005\b\u008d\u0002\u0010q\"\u0005\b\u008e\u0002\u0010sR'\u0010U\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\bø\u0001\u0010o\u001a\u0005\b\u008f\u0002\u0010q\"\u0005\b\u0090\u0002\u0010sR'\u0010V\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0091\u0002\u0010o\u001a\u0005\b\u008c\u0002\u0010q\"\u0005\b\u0092\u0002\u0010sR'\u0010W\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0085\u0002\u0010o\u001a\u0005\b\u0093\u0002\u0010q\"\u0005\b\u0094\u0002\u0010sR'\u0010X\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0095\u0002\u0010o\u001a\u0005\b\u0096\u0002\u0010q\"\u0005\b\u0097\u0002\u0010s¨\u0006\u0098\u0002"}, d2 = {"Lps/x1;", "Landroid/os/Parcelable;", "Lorg/joda/time/DateTime;", "startDateTime", "startDateTimeLocal", "endDateTime", "", "averageSpeed", "averageMovingSpeed", "distance", "duration", "elapsedDuration", "movingDuration", "averageHR", "maxHR", "elevationGain", "elevationLoss", "endLatitude", "endLongitude", "", "messageIndex", "startLatitude", "startLongitude", "", "lapIndexes", "", "internalType", "numFalls", "internalStatus", "", "climbSend", "Lps/u0;", "difficulty", "calories", "targetAvgSpeed", "targetDuration", "targetDistance", "startElevation", "strideLength", "averageRunCadence", "maxRunCadence", "minTemperature", "maxTemperature", "avgTemperature", "maxSpeed", "normalizedPower", "avgPower", "maxPower", "normalizedForce", "avgBikeForce", "maxBikeForce", "targetPower", "leftBalance", "rightBalance", "avgBikeCadence", "maxBikeCadence", "max2SecondSpeed", "max10SecondSpeed", "avgGradeAdjustedSpeed", "averageGrade", "maxGrade", "minCadence", "avgVerticalSpeed", "avgDescentSpeed", "climbProDifficulty", "gamesStatus", "gameRank", "gameRanksPossible", "avgStress", "maxStress", "groundContactTime", "groundContactBalanceLeft", "stepSpeedLoss", "stepSpeedLossPercent", "verticalOscillation", "verticalRatio", "parentIndex", "timingGateIndex", "", "groupRideCompetitionId", "groupRideSessionUuid", "pisteDifficulty", "maxPisteDifficulty", "bottomTime", "surfaceInterval", "maxDepth", "packWeight", "maxPackWeight", "avgPackWeight", "cumulativeTime", "cumulativeDistance", "startTime", "stopTime", "Lps/w;", "ciqMeasurements", "minHR", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLps/u0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Double;)V", "a", "Lorg/joda/time/DateTime;", "y1", "()Lorg/joda/time/DateTime;", "t3", "(Lorg/joda/time/DateTime;)V", "b", "A1", "v3", "c", "M", "P2", "d", "Ljava/lang/Double;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Double;", "h2", "(Ljava/lang/Double;)V", JWKParameterNames.RSA_EXPONENT, "g", "setAverageMovingSpeed", "f", "D", "z2", "F", "A2", "h", "G", "c1", "j", "g2", JWKParameterNames.OCT_KEY_VALUE, "J0", "k3", "l", "H", "H2", "m", "I", "J2", JWKParameterNames.RSA_MODULUS, "Z", "T2", "o", "a0", "Z2", "p", "Ljava/lang/Integer;", "V0", "()Ljava/lang/Integer;", "q3", "(Ljava/lang/Integer;)V", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "D1", "w3", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "F1", "y3", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Ljava/util/List;", "p0", "()Ljava/util/List;", "b3", "(Ljava/util/List;)V", "v", "Ljava/lang/String;", "n0", "()Ljava/lang/String;", "setInternalType", "(Ljava/lang/String;)V", "w", "j1", "r3", "x", "k0", "setInternalStatus", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "A", "()Z", "n2", "(Z)V", "z", "Lps/u0;", "C", "()Lps/u0;", "y2", "(Lps/u0;)V", "B", "U1", "getTargetDuration", "getTargetDistance", "E", "C1", "M1", "P", "P0", "T", "b1", "X", "S0", "Y", "s", "Q0", "o3", "h1", "H0", "l2", "I0", "M0", "l3", "e1", "K0", "setAvgBikeForce", "L0", "A0", "setMaxBikeForce", "V1", "N0", "q0", "O0", "x1", "k2", "z0", "j3", "R0", "x0", "w0", "T0", "U0", "E0", "W0", "Z0", "X0", "Y0", "a1", "f0", "c0", "e0", "d1", "f1", "h0", "g1", "g0", "I1", "i1", "J1", "b2", "k1", "e2", "l1", "t1", "m1", "Y1", "n1", "Ljava/lang/Long;", "i0", "()Ljava/lang/Long;", "a3", "(Ljava/lang/Long;)V", "o1", "j0", "setGroupRideSessionUuid", "p1", "v1", "setPisteDifficulty", "q1", "setMaxPisteDifficulty", "r1", "u", "setBottomTime", "s1", "S1", "setSurfaceInterval", "C0", "setMaxDepth", "u1", "s3", "getMaxPackWeight", "setMaxPackWeight", "w1", "getAvgPackWeight", "setAvgPackWeight", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x1 implements Parcelable {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("calories")
    private final Double calories;
    public Double A1;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("targetAverageSpeed")
    private final Double targetAvgSpeed;
    public final List<w> B1;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("targetDuration")
    private final Double targetDuration;
    public Double C1;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("targetDistance")
    private final Double targetDistance;
    public double D1;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("startElevation")
    private final Double startElevation;
    public double E1;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("strideLength")
    private final Double strideLength;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @SerializedName("averagePower")
    private Double avgPower;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("averageRunCadence")
    private final Double averageRunCadence;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @SerializedName("maxPower")
    private Double maxPower;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @SerializedName("normalizedForce")
    private final Double normalizedForce;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @SerializedName("avgForce")
    private Double avgBikeForce;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @SerializedName("maxForce")
    private Double maxBikeForce;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @SerializedName("powerGuidanceTargetPower")
    private final Double targetPower;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @SerializedName("leftBalance")
    private final Double leftBalance;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @SerializedName("rightBalance")
    private final Double rightBalance;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("maxRunCadence")
    private final Double maxRunCadence;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @SerializedName("averageBikeCadence")
    private Double avgBikeCadence;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @SerializedName("maxBikeCadence")
    private Double maxBikeCadence;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @SerializedName("max2SecondSpeed")
    private final Double max2SecondSpeed;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @SerializedName("max10SecondSpeed")
    private final Double max10SecondSpeed;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("minTemperature")
    private final Double minTemperature;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @SerializedName("avgGradeAdjustedSpeed")
    private final Double avgGradeAdjustedSpeed;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @SerializedName("averageGrade")
    private final Double averageGrade;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @SerializedName("maxGrade")
    private final Double maxGrade;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    @SerializedName("minCadence")
    private final Double minCadence;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("maxTemperature")
    private final Double maxTemperature;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    @SerializedName("avgVerticalSpeed")
    private final Double avgVerticalSpeed;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @SerializedName("averageTemperature")
    private final Double avgTemperature;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    @SerializedName("avgDescentSpeed")
    private final Double avgDescentSpeed;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @SerializedName("maxSpeed")
    private Double maxSpeed;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    @SerializedName("climbProDifficulty")
    private final String climbProDifficulty;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeGMT")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private DateTime startDateTime;

    /* JADX INFO: renamed from: a1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gameStatus")
    private final String gamesStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeLocal")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private DateTime startDateTimeLocal;

    /* JADX INFO: renamed from: b1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gameRank")
    private final Integer gameRank;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimeGMT")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private DateTime endDateTime;

    /* JADX INFO: renamed from: c1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gameRanksPossible")
    private final Integer gameRanksPossible;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSpeed")
    private Double averageSpeed;

    /* JADX INFO: renamed from: d1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgStress")
    private final Double avgStress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageMovingSpeed")
    private Double averageMovingSpeed;

    /* JADX INFO: renamed from: e1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxStress")
    private final Double maxStress;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private Double distance;

    /* JADX INFO: renamed from: f1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groundContactTime")
    private final Double groundContactTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private Double duration;

    /* JADX INFO: renamed from: g1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groundContactBalanceLeft")
    private final Double groundContactBalanceLeft;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elapsedDuration")
    private final Double elapsedDuration;

    /* JADX INFO: renamed from: h1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stepSpeedLoss")
    private final Double stepSpeedLoss;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("movingDuration")
    private final Double movingDuration;

    /* JADX INFO: renamed from: i1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stepSpeedLossPercent")
    private final Double stepSpeedLossPercent;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageHR")
    private Double averageHR;

    /* JADX INFO: renamed from: j1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("verticalOscillation")
    private final Double verticalOscillation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxHR")
    private Double maxHR;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("normalizedPower")
    private final Double normalizedPower;

    /* JADX INFO: renamed from: k1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("verticalRatio")
    private final Double verticalRatio;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationGain")
    private Double elevationGain;

    /* JADX INFO: renamed from: l1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("parentIndex")
    private final Integer parentIndex;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationLoss")
    private Double elevationLoss;

    /* JADX INFO: renamed from: m1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timingGateIndex")
    private final Integer timingGateIndex;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endLatitude")
    private Double endLatitude;

    /* JADX INFO: renamed from: n1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupRideCompetitionId")
    private Long groupRideCompetitionId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endLongitude")
    private Double endLongitude;

    /* JADX INFO: renamed from: o1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupRideSessionUuid")
    private String groupRideSessionUuid;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageIndex")
    private Integer messageIndex;

    /* JADX INFO: renamed from: p1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pisteDifficulty")
    private String pisteDifficulty;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLatitude")
    private Double startLatitude;

    /* JADX INFO: renamed from: q1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxPisteDifficulty")
    private String maxPisteDifficulty;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLongitude")
    private Double startLongitude;

    /* JADX INFO: renamed from: r1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bottomTime")
    private Double bottomTime;

    /* JADX INFO: renamed from: s1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("surfaceInterval")
    private Double surfaceInterval;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lapIndexes")
    private List<Integer> lapIndexes;

    /* JADX INFO: renamed from: t1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxDepth")
    private Double maxDepth;

    /* JADX INFO: renamed from: u1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("packWeightGrams")
    private Double packWeight;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private String internalType;

    /* JADX INFO: renamed from: v1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxPackWeight")
    private Double maxPackWeight;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numFalls")
    private Integer numFalls;

    /* JADX INFO: renamed from: w1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgPackWeight")
    private Double avgPackWeight;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private String internalStatus;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public Double f140403x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("climbSend")
    private boolean climbSend;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public Double f140405y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gradeValue")
    private u0 difficulty;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public Double f140407z1;
    public static final a F1 = new a(null);
    public static final Parcelable.Creator<x1> CREATOR = new b();
    public static final int G1 = 8;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<x1> {
        @Override // android.os.Parcelable.Creator
        public final x1 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            parcel.getClass();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
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
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double dValueOf13 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf14 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
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
            String string = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            boolean z14 = parcel.readInt() != 0;
            u0 u0Var = (u0) parcel.readParcelable(x1.class.getClassLoader());
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
            Double dValueOf39 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf40 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf41 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf42 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf43 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf44 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf45 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string3 = parcel.readString();
            Double d14 = dValueOf16;
            Double d15 = dValueOf17;
            Double d16 = dValueOf18;
            Double d17 = dValueOf19;
            Double d18 = dValueOf20;
            Double d19 = dValueOf21;
            Double d24 = dValueOf22;
            Double d25 = dValueOf23;
            Double d26 = dValueOf24;
            Double d27 = dValueOf25;
            Double d28 = dValueOf26;
            Double d29 = dValueOf27;
            Double d34 = dValueOf28;
            Double d35 = dValueOf29;
            Double d36 = dValueOf30;
            Double d37 = dValueOf31;
            Double d38 = dValueOf32;
            Double d39 = dValueOf33;
            Double d44 = dValueOf34;
            Double d45 = dValueOf35;
            Double d46 = dValueOf36;
            Double d47 = dValueOf37;
            Double d48 = dValueOf38;
            Double d49 = dValueOf39;
            Double d54 = dValueOf40;
            Double d55 = dValueOf41;
            Double d56 = dValueOf42;
            Double d57 = dValueOf43;
            Double d58 = dValueOf44;
            Double d59 = dValueOf45;
            String string4 = parcel.readString();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double dValueOf46 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf47 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf48 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf49 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf50 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf51 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf52 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf53 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            Integer num = numValueOf3;
            Integer num2 = numValueOf4;
            Double d64 = dValueOf46;
            Double d65 = dValueOf47;
            Double d66 = dValueOf48;
            Double d67 = dValueOf49;
            Double d68 = dValueOf50;
            Double d69 = dValueOf51;
            Double d74 = dValueOf52;
            Double d75 = dValueOf53;
            Integer num3 = numValueOf5;
            Integer num4 = numValueOf6;
            Long l14 = lValueOf;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Double dValueOf54 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf55 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf56 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf57 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf58 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf59 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf60 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf61 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf62 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf63 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList2 = new ArrayList(i16);
                int iA = 0;
                while (iA != i16) {
                    iA = kg.f.a(w.CREATOR, parcel, arrayList2, iA, 1);
                    i16 = i16;
                    dateTime2 = dateTime2;
                }
            }
            return new x1(dateTime, dateTime2, dateTime3, dValueOf, dValueOf2, dValueOf3, dValueOf4, dValueOf5, dValueOf6, dValueOf7, dValueOf8, dValueOf9, dValueOf10, dValueOf11, dValueOf12, numValueOf, dValueOf13, dValueOf14, arrayList, string, numValueOf2, string2, z14, u0Var, dValueOf15, d14, d15, d16, d17, d18, d19, d24, d25, d26, d27, d28, d29, d34, d35, d36, d37, d38, d39, d44, d45, d46, d47, d48, d49, d54, d55, d56, d57, d58, d59, string3, string4, num, num2, d64, d65, d66, d67, d68, d69, d74, d75, num3, num4, l14, string5, string6, string7, dValueOf54, dValueOf55, dValueOf56, dValueOf57, dValueOf58, dValueOf59, dValueOf60, dValueOf61, dValueOf62, dValueOf63, arrayList2, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final x1[] newArray(int i14) {
            return new x1[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ x1(DateTime dateTime, DateTime dateTime2, DateTime dateTime3, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Integer num, Double d34, Double d35, List list, String str, Integer num2, String str2, boolean z14, u0 u0Var, Double d36, Double d37, Double d38, Double d39, Double d44, Double d45, Double d46, Double d47, Double d48, Double d49, Double d54, Double d55, Double d56, Double d57, Double d58, Double d59, Double d64, Double d65, Double d66, Double d67, Double d68, Double d69, Double d74, Double d75, Double d76, Double d77, Double d78, Double d79, Double d84, Double d85, Double d86, String str3, String str4, Integer num3, Integer num4, Double d87, Double d88, Double d89, Double d93, Double d94, Double d95, Double d96, Double d97, Integer num5, Integer num6, Long l14, String str5, String str6, String str7, Double d98, Double d99, Double d100, Double d101, Double d102, Double d103, Double d104, Double d105, Double d106, Double d107, List list2, Double d108, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        Double dValueOf = Double.valueOf(0.0d);
        DateTime dateTime4 = (i14 & 1) != 0 ? null : dateTime;
        DateTime dateTime5 = (i14 & 2) != 0 ? null : dateTime2;
        DateTime dateTime6 = (i14 & 4) != 0 ? null : dateTime3;
        Double d109 = (i14 & 8) != 0 ? dValueOf : d14;
        Double d110 = (i14 & 16) != 0 ? dValueOf : d15;
        Double d111 = (i14 & 32) != 0 ? dValueOf : d16;
        Double d112 = (i14 & 64) != 0 ? dValueOf : d17;
        Double d113 = (i14 & 128) != 0 ? dValueOf : d18;
        Double d114 = (i14 & 256) != 0 ? null : d19;
        Double d115 = (i14 & 512) != 0 ? dValueOf : d24;
        Double d116 = (i14 & 1024) != 0 ? dValueOf : d25;
        Double d117 = (i14 & 2048) != 0 ? dValueOf : d26;
        Double d118 = dValueOf;
        Double d119 = (i14 & 4096) != 0 ? d118 : d27;
        Double d120 = (i14 & 8192) != 0 ? d118 : d28;
        Double d121 = (i14 & 16384) != 0 ? d118 : d29;
        Integer num7 = (i14 & 32768) != 0 ? 0 : num;
        Double d122 = (i14 & 65536) != 0 ? d118 : d34;
        d118 = (i14 & 131072) == 0 ? d35 : d118;
        List list3 = (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : list;
        String str8 = (i14 & 524288) != 0 ? null : str;
        Integer num8 = (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num2;
        String str9 = (i14 & 2097152) != 0 ? null : str2;
        boolean z15 = (i14 & 4194304) != 0 ? false : z14;
        u0 u0Var2 = (i14 & 8388608) != 0 ? null : u0Var;
        Double d123 = (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : d36;
        Double d124 = (i14 & 33554432) != 0 ? null : d37;
        Double d125 = (i14 & 67108864) != 0 ? null : d38;
        Double d126 = (i14 & 134217728) != 0 ? null : d39;
        Double d127 = (i14 & 268435456) != 0 ? null : d44;
        Double d128 = (i14 & 536870912) != 0 ? null : d45;
        Double d129 = (i14 & 1073741824) != 0 ? null : d46;
        Double d130 = (i14 & Integer.MIN_VALUE) != 0 ? null : d47;
        this(dateTime4, dateTime5, dateTime6, d109, d110, d111, d112, d113, d114, d115, d116, d117, d119, d120, d121, num7, d122, d118, list3, str8, num8, str9, z15, u0Var2, d123, d124, d125, d126, d127, d128, d129, d130, (i15 & 1) != 0 ? null : d48, (i15 & 2) != 0 ? null : d49, (i15 & 4) != 0 ? null : d54, (i15 & 8) != 0 ? null : d55, (i15 & 16) != 0 ? null : d56, (i15 & 32) != 0 ? null : d57, (i15 & 64) != 0 ? null : d58, (i15 & 128) != 0 ? null : d59, (i15 & 256) != 0 ? null : d64, (i15 & 512) != 0 ? null : d65, (i15 & 1024) != 0 ? null : d66, (i15 & 2048) != 0 ? null : d67, (i15 & 4096) != 0 ? null : d68, (i15 & 8192) != 0 ? null : d69, (i15 & 16384) != 0 ? null : d74, (i15 & 32768) != 0 ? null : d75, (i15 & 65536) != 0 ? null : d76, (i15 & 131072) != 0 ? null : d77, (i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : d78, (i15 & 524288) != 0 ? null : d79, (i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : d84, (i15 & 2097152) != 0 ? null : d85, (i15 & 4194304) != 0 ? null : d86, (i15 & 8388608) != 0 ? null : str3, (i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str4, (i15 & 33554432) != 0 ? null : num3, (i15 & 67108864) != 0 ? null : num4, (i15 & 134217728) != 0 ? null : d87, (i15 & 268435456) != 0 ? null : d88, (i15 & 536870912) != 0 ? null : d89, (i15 & 1073741824) != 0 ? null : d93, (i15 & Integer.MIN_VALUE) != 0 ? null : d94, (i16 & 1) != 0 ? null : d95, (i16 & 2) != 0 ? null : d96, (i16 & 4) != 0 ? null : d97, (i16 & 8) != 0 ? null : num5, (i16 & 16) != 0 ? null : num6, (i16 & 32) != 0 ? null : l14, (i16 & 64) != 0 ? null : str5, (i16 & 128) != 0 ? null : str6, (i16 & 256) != 0 ? null : str7, (i16 & 512) != 0 ? null : d98, (i16 & 1024) != 0 ? null : d99, (i16 & 2048) != 0 ? null : d100, (i16 & 4096) != 0 ? null : d101, (i16 & 8192) != 0 ? null : d102, (i16 & 16384) != 0 ? null : d103, (i16 & 32768) != 0 ? null : d104, (i16 & 65536) != 0 ? null : d105, (i16 & 131072) != 0 ? null : d106, (i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : d107, (i16 & 524288) != 0 ? null : list2, (i16 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : d108);
    }

    public static x1 b(x1 x1Var, DateTime dateTime, int i14) {
        DateTime dateTime2 = x1Var.startDateTime;
        DateTime dateTime3 = x1Var.startDateTimeLocal;
        DateTime dateTime4 = (i14 & 4) != 0 ? x1Var.endDateTime : dateTime;
        Double d14 = x1Var.averageSpeed;
        Double d15 = x1Var.averageMovingSpeed;
        Double d16 = x1Var.distance;
        Double d17 = x1Var.duration;
        Double d18 = x1Var.elapsedDuration;
        Double d19 = x1Var.movingDuration;
        Double d24 = x1Var.averageHR;
        Double d25 = x1Var.maxHR;
        Double d26 = x1Var.elevationGain;
        Double d27 = x1Var.elevationLoss;
        Double d28 = x1Var.endLatitude;
        Double d29 = x1Var.endLongitude;
        Integer num = x1Var.messageIndex;
        Double d34 = x1Var.startLatitude;
        Double d35 = x1Var.startLongitude;
        List<Integer> list = x1Var.lapIndexes;
        String str = x1Var.internalType;
        Integer num2 = x1Var.numFalls;
        String str2 = x1Var.internalStatus;
        boolean z14 = x1Var.climbSend;
        u0 u0Var = x1Var.difficulty;
        Double d36 = x1Var.calories;
        Double d37 = x1Var.targetAvgSpeed;
        Double d38 = x1Var.targetDuration;
        Double d39 = x1Var.targetDistance;
        Double d44 = x1Var.startElevation;
        Double d45 = x1Var.strideLength;
        Double d46 = x1Var.averageRunCadence;
        Double d47 = x1Var.maxRunCadence;
        Double d48 = x1Var.minTemperature;
        Double d49 = x1Var.maxTemperature;
        Double d54 = x1Var.avgTemperature;
        Double d55 = x1Var.maxSpeed;
        Double d56 = x1Var.normalizedPower;
        Double d57 = x1Var.avgPower;
        Double d58 = x1Var.maxPower;
        Double d59 = x1Var.normalizedForce;
        Double d64 = x1Var.avgBikeForce;
        Double d65 = x1Var.maxBikeForce;
        Double d66 = x1Var.targetPower;
        Double d67 = x1Var.leftBalance;
        Double d68 = x1Var.rightBalance;
        Double d69 = x1Var.avgBikeCadence;
        Double d74 = x1Var.maxBikeCadence;
        Double d75 = x1Var.max2SecondSpeed;
        Double d76 = x1Var.max10SecondSpeed;
        Double d77 = x1Var.avgGradeAdjustedSpeed;
        Double d78 = x1Var.averageGrade;
        Double d79 = x1Var.maxGrade;
        Double d84 = x1Var.minCadence;
        Double d85 = x1Var.avgVerticalSpeed;
        Double d86 = x1Var.avgDescentSpeed;
        String str3 = x1Var.climbProDifficulty;
        String str4 = x1Var.gamesStatus;
        Integer num3 = x1Var.gameRank;
        Integer num4 = x1Var.gameRanksPossible;
        Double d87 = x1Var.avgStress;
        Double d88 = x1Var.maxStress;
        Double d89 = x1Var.groundContactTime;
        Double d93 = x1Var.groundContactBalanceLeft;
        Double d94 = x1Var.stepSpeedLoss;
        Double d95 = x1Var.stepSpeedLossPercent;
        Double d96 = x1Var.verticalOscillation;
        Double d97 = x1Var.verticalRatio;
        Integer num5 = x1Var.parentIndex;
        Integer num6 = x1Var.timingGateIndex;
        Long l14 = x1Var.groupRideCompetitionId;
        String str5 = x1Var.groupRideSessionUuid;
        String str6 = x1Var.pisteDifficulty;
        String str7 = x1Var.maxPisteDifficulty;
        Double d98 = x1Var.bottomTime;
        Double d99 = x1Var.surfaceInterval;
        Double d100 = x1Var.maxDepth;
        Double d101 = x1Var.packWeight;
        Double d102 = x1Var.maxPackWeight;
        Double d103 = x1Var.avgPackWeight;
        Double d104 = x1Var.f140403x1;
        Double d105 = x1Var.f140405y1;
        Double d106 = x1Var.f140407z1;
        Double d107 = x1Var.A1;
        List<w> list2 = x1Var.B1;
        Double d108 = x1Var.C1;
        x1Var.getClass();
        return new x1(dateTime2, dateTime3, dateTime4, d14, d15, d16, d17, d18, d19, d24, d25, d26, d27, d28, d29, num, d34, d35, list, str, num2, str2, z14, u0Var, d36, d37, d38, d39, d44, d45, d46, d47, d48, d49, d54, d55, d56, d57, d58, d59, d64, d65, d66, d67, d68, d69, d74, d75, d76, d77, d78, d79, d84, d85, d86, str3, str4, num3, num4, d87, d88, d89, d93, d94, d95, d96, d97, num5, num6, l14, str5, str6, str7, d98, d99, d100, d101, d102, d103, d104, d105, d106, d107, list2, d108);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getClimbSend() {
        return this.climbSend;
    }

    /* JADX INFO: renamed from: A0, reason: from getter */
    public final Double getMaxBikeForce() {
        return this.maxBikeForce;
    }

    /* JADX INFO: renamed from: A1, reason: from getter */
    public final DateTime getStartDateTimeLocal() {
        return this.startDateTimeLocal;
    }

    public final void A2(Double d14) {
        this.duration = d14;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final u0 getDifficulty() {
        return this.difficulty;
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final Double getMaxDepth() {
        return this.maxDepth;
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final Double getStartElevation() {
        return this.startElevation;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: D1, reason: from getter */
    public final Double getStartLatitude() {
        return this.startLatitude;
    }

    /* JADX INFO: renamed from: E0, reason: from getter */
    public final Double getMaxGrade() {
        return this.maxGrade;
    }

    public final void E3(qs.w wVar) {
        this.internalStatus = wVar != null ? wVar.f147194a : null;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Double getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: F1, reason: from getter */
    public final Double getStartLongitude() {
        return this.startLongitude;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Double getElapsedDuration() {
        return this.elapsedDuration;
    }

    public final qs.w G1() {
        Object next;
        w13.c cVar = qs.w.f147193f;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            next = bVarN.next();
            if (p005kotlin.jvm.internal.s.g(((qs.w) next).f147194a, this.internalStatus)) {
                return (qs.w) next;
            }
        }
        next = null;
        return (qs.w) next;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Double getElevationGain() {
        return this.elevationGain;
    }

    public final void H2(Double d14) {
        this.elevationGain = d14;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final Double getElevationLoss() {
        return this.elevationLoss;
    }

    /* JADX INFO: renamed from: I1, reason: from getter */
    public final Double getStepSpeedLoss() {
        return this.stepSpeedLoss;
    }

    /* JADX INFO: renamed from: J0, reason: from getter */
    public final Double getMaxHR() {
        return this.maxHR;
    }

    /* JADX INFO: renamed from: J1, reason: from getter */
    public final Double getStepSpeedLossPercent() {
        return this.stepSpeedLossPercent;
    }

    public final void J2(Double d14) {
        this.elevationLoss = d14;
    }

    /* JADX INFO: renamed from: L0, reason: from getter */
    public final String getMaxPisteDifficulty() {
        return this.maxPisteDifficulty;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final DateTime getEndDateTime() {
        return this.endDateTime;
    }

    /* JADX INFO: renamed from: M0, reason: from getter */
    public final Double getMaxPower() {
        return this.maxPower;
    }

    /* JADX INFO: renamed from: M1, reason: from getter */
    public final Double getStrideLength() {
        return this.strideLength;
    }

    /* JADX INFO: renamed from: P0, reason: from getter */
    public final Double getMaxRunCadence() {
        return this.maxRunCadence;
    }

    public final void P2(DateTime dateTime) {
        this.endDateTime = dateTime;
    }

    /* JADX INFO: renamed from: Q0, reason: from getter */
    public final Double getMaxSpeed() {
        return this.maxSpeed;
    }

    /* JADX INFO: renamed from: R0, reason: from getter */
    public final Double getMaxStress() {
        return this.maxStress;
    }

    /* JADX INFO: renamed from: S0, reason: from getter */
    public final Double getMaxTemperature() {
        return this.maxTemperature;
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final Double getSurfaceInterval() {
        return this.surfaceInterval;
    }

    public final void T2(Double d14) {
        this.endLatitude = d14;
    }

    /* JADX INFO: renamed from: U1, reason: from getter */
    public final Double getTargetAvgSpeed() {
        return this.targetAvgSpeed;
    }

    /* JADX INFO: renamed from: V0, reason: from getter */
    public final Integer getMessageIndex() {
        return this.messageIndex;
    }

    /* JADX INFO: renamed from: V1, reason: from getter */
    public final Double getTargetPower() {
        return this.targetPower;
    }

    /* JADX INFO: renamed from: Y1, reason: from getter */
    public final Integer getTimingGateIndex() {
        return this.timingGateIndex;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final Double getEndLatitude() {
        return this.endLatitude;
    }

    /* JADX INFO: renamed from: Z0, reason: from getter */
    public final Double getMinCadence() {
        return this.minCadence;
    }

    public final void Z2(Double d14) {
        this.endLongitude = d14;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final Double getEndLongitude() {
        return this.endLongitude;
    }

    public final qs.x a2() {
        Object next;
        w13.c cVar = qs.x.P0;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            next = bVarN.next();
            if (p005kotlin.jvm.internal.s.g(((qs.x) next).f147220a, this.internalType)) {
                return (qs.x) next;
            }
        }
        next = null;
        return (qs.x) next;
    }

    public final void a3(Long l14) {
        this.groupRideCompetitionId = l14;
    }

    /* JADX INFO: renamed from: b1, reason: from getter */
    public final Double getMinTemperature() {
        return this.minTemperature;
    }

    /* JADX INFO: renamed from: b2, reason: from getter */
    public final Double getVerticalOscillation() {
        return this.verticalOscillation;
    }

    public final void b3(List<Integer> list) {
        this.lapIndexes = list;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final Integer getGameRank() {
        return this.gameRank;
    }

    /* JADX INFO: renamed from: c1, reason: from getter */
    public final Double getMovingDuration() {
        return this.movingDuration;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getAverageGrade() {
        return this.averageGrade;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final Integer getGameRanksPossible() {
        return this.gameRanksPossible;
    }

    /* JADX INFO: renamed from: e1, reason: from getter */
    public final Double getNormalizedForce() {
        return this.normalizedForce;
    }

    /* JADX INFO: renamed from: e2, reason: from getter */
    public final Double getVerticalRatio() {
        return this.verticalRatio;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return p005kotlin.jvm.internal.s.g(this.startDateTime, x1Var.startDateTime) && p005kotlin.jvm.internal.s.g(this.startDateTimeLocal, x1Var.startDateTimeLocal) && p005kotlin.jvm.internal.s.g(this.endDateTime, x1Var.endDateTime) && p005kotlin.jvm.internal.s.g(this.averageSpeed, x1Var.averageSpeed) && p005kotlin.jvm.internal.s.g(this.averageMovingSpeed, x1Var.averageMovingSpeed) && p005kotlin.jvm.internal.s.g(this.distance, x1Var.distance) && p005kotlin.jvm.internal.s.g(this.duration, x1Var.duration) && p005kotlin.jvm.internal.s.g(this.elapsedDuration, x1Var.elapsedDuration) && p005kotlin.jvm.internal.s.g(this.movingDuration, x1Var.movingDuration) && p005kotlin.jvm.internal.s.g(this.averageHR, x1Var.averageHR) && p005kotlin.jvm.internal.s.g(this.maxHR, x1Var.maxHR) && p005kotlin.jvm.internal.s.g(this.elevationGain, x1Var.elevationGain) && p005kotlin.jvm.internal.s.g(this.elevationLoss, x1Var.elevationLoss) && p005kotlin.jvm.internal.s.g(this.endLatitude, x1Var.endLatitude) && p005kotlin.jvm.internal.s.g(this.endLongitude, x1Var.endLongitude) && p005kotlin.jvm.internal.s.g(this.messageIndex, x1Var.messageIndex) && p005kotlin.jvm.internal.s.g(this.startLatitude, x1Var.startLatitude) && p005kotlin.jvm.internal.s.g(this.startLongitude, x1Var.startLongitude) && p005kotlin.jvm.internal.s.g(this.lapIndexes, x1Var.lapIndexes) && p005kotlin.jvm.internal.s.g(this.internalType, x1Var.internalType) && p005kotlin.jvm.internal.s.g(this.numFalls, x1Var.numFalls) && p005kotlin.jvm.internal.s.g(this.internalStatus, x1Var.internalStatus) && this.climbSend == x1Var.climbSend && p005kotlin.jvm.internal.s.g(this.difficulty, x1Var.difficulty) && p005kotlin.jvm.internal.s.g(this.calories, x1Var.calories) && p005kotlin.jvm.internal.s.g(this.targetAvgSpeed, x1Var.targetAvgSpeed) && p005kotlin.jvm.internal.s.g(this.targetDuration, x1Var.targetDuration) && p005kotlin.jvm.internal.s.g(this.targetDistance, x1Var.targetDistance) && p005kotlin.jvm.internal.s.g(this.startElevation, x1Var.startElevation) && p005kotlin.jvm.internal.s.g(this.strideLength, x1Var.strideLength) && p005kotlin.jvm.internal.s.g(this.averageRunCadence, x1Var.averageRunCadence) && p005kotlin.jvm.internal.s.g(this.maxRunCadence, x1Var.maxRunCadence) && p005kotlin.jvm.internal.s.g(this.minTemperature, x1Var.minTemperature) && p005kotlin.jvm.internal.s.g(this.maxTemperature, x1Var.maxTemperature) && p005kotlin.jvm.internal.s.g(this.avgTemperature, x1Var.avgTemperature) && p005kotlin.jvm.internal.s.g(this.maxSpeed, x1Var.maxSpeed) && p005kotlin.jvm.internal.s.g(this.normalizedPower, x1Var.normalizedPower) && p005kotlin.jvm.internal.s.g(this.avgPower, x1Var.avgPower) && p005kotlin.jvm.internal.s.g(this.maxPower, x1Var.maxPower) && p005kotlin.jvm.internal.s.g(this.normalizedForce, x1Var.normalizedForce) && p005kotlin.jvm.internal.s.g(this.avgBikeForce, x1Var.avgBikeForce) && p005kotlin.jvm.internal.s.g(this.maxBikeForce, x1Var.maxBikeForce) && p005kotlin.jvm.internal.s.g(this.targetPower, x1Var.targetPower) && p005kotlin.jvm.internal.s.g(this.leftBalance, x1Var.leftBalance) && p005kotlin.jvm.internal.s.g(this.rightBalance, x1Var.rightBalance) && p005kotlin.jvm.internal.s.g(this.avgBikeCadence, x1Var.avgBikeCadence) && p005kotlin.jvm.internal.s.g(this.maxBikeCadence, x1Var.maxBikeCadence) && p005kotlin.jvm.internal.s.g(this.max2SecondSpeed, x1Var.max2SecondSpeed) && p005kotlin.jvm.internal.s.g(this.max10SecondSpeed, x1Var.max10SecondSpeed) && p005kotlin.jvm.internal.s.g(this.avgGradeAdjustedSpeed, x1Var.avgGradeAdjustedSpeed) && p005kotlin.jvm.internal.s.g(this.averageGrade, x1Var.averageGrade) && p005kotlin.jvm.internal.s.g(this.maxGrade, x1Var.maxGrade) && p005kotlin.jvm.internal.s.g(this.minCadence, x1Var.minCadence) && p005kotlin.jvm.internal.s.g(this.avgVerticalSpeed, x1Var.avgVerticalSpeed) && p005kotlin.jvm.internal.s.g(this.avgDescentSpeed, x1Var.avgDescentSpeed) && p005kotlin.jvm.internal.s.g(this.climbProDifficulty, x1Var.climbProDifficulty) && p005kotlin.jvm.internal.s.g(this.gamesStatus, x1Var.gamesStatus) && p005kotlin.jvm.internal.s.g(this.gameRank, x1Var.gameRank) && p005kotlin.jvm.internal.s.g(this.gameRanksPossible, x1Var.gameRanksPossible) && p005kotlin.jvm.internal.s.g(this.avgStress, x1Var.avgStress) && p005kotlin.jvm.internal.s.g(this.maxStress, x1Var.maxStress) && p005kotlin.jvm.internal.s.g(this.groundContactTime, x1Var.groundContactTime) && p005kotlin.jvm.internal.s.g(this.groundContactBalanceLeft, x1Var.groundContactBalanceLeft) && p005kotlin.jvm.internal.s.g(this.stepSpeedLoss, x1Var.stepSpeedLoss) && p005kotlin.jvm.internal.s.g(this.stepSpeedLossPercent, x1Var.stepSpeedLossPercent) && p005kotlin.jvm.internal.s.g(this.verticalOscillation, x1Var.verticalOscillation) && p005kotlin.jvm.internal.s.g(this.verticalRatio, x1Var.verticalRatio) && p005kotlin.jvm.internal.s.g(this.parentIndex, x1Var.parentIndex) && p005kotlin.jvm.internal.s.g(this.timingGateIndex, x1Var.timingGateIndex) && p005kotlin.jvm.internal.s.g(this.groupRideCompetitionId, x1Var.groupRideCompetitionId) && p005kotlin.jvm.internal.s.g(this.groupRideSessionUuid, x1Var.groupRideSessionUuid) && p005kotlin.jvm.internal.s.g(this.pisteDifficulty, x1Var.pisteDifficulty) && p005kotlin.jvm.internal.s.g(this.maxPisteDifficulty, x1Var.maxPisteDifficulty) && p005kotlin.jvm.internal.s.g(this.bottomTime, x1Var.bottomTime) && p005kotlin.jvm.internal.s.g(this.surfaceInterval, x1Var.surfaceInterval) && p005kotlin.jvm.internal.s.g(this.maxDepth, x1Var.maxDepth) && p005kotlin.jvm.internal.s.g(this.packWeight, x1Var.packWeight) && p005kotlin.jvm.internal.s.g(this.maxPackWeight, x1Var.maxPackWeight) && p005kotlin.jvm.internal.s.g(this.avgPackWeight, x1Var.avgPackWeight) && p005kotlin.jvm.internal.s.g(this.f140403x1, x1Var.f140403x1) && p005kotlin.jvm.internal.s.g(this.f140405y1, x1Var.f140405y1) && p005kotlin.jvm.internal.s.g(this.f140407z1, x1Var.f140407z1) && p005kotlin.jvm.internal.s.g(this.A1, x1Var.A1) && p005kotlin.jvm.internal.s.g(this.B1, x1Var.B1) && p005kotlin.jvm.internal.s.g(this.C1, x1Var.C1);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getAverageHR() {
        return this.averageHR;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final String getGamesStatus() {
        return this.gamesStatus;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getAverageMovingSpeed() {
        return this.averageMovingSpeed;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final Double getGroundContactBalanceLeft() {
        return this.groundContactBalanceLeft;
    }

    public final void g2(Double d14) {
        this.averageHR = d14;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getAverageRunCadence() {
        return this.averageRunCadence;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final Double getGroundContactTime() {
        return this.groundContactTime;
    }

    /* JADX INFO: renamed from: h1, reason: from getter */
    public final Double getNormalizedPower() {
        return this.normalizedPower;
    }

    public final void h2(Double d14) {
        this.averageSpeed = d14;
    }

    public final int hashCode() {
        DateTime dateTime = this.startDateTime;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        DateTime dateTime2 = this.startDateTimeLocal;
        int iHashCode2 = (iHashCode + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.endDateTime;
        int iHashCode3 = (iHashCode2 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        Double d14 = this.averageSpeed;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.averageMovingSpeed;
        int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.distance;
        int iHashCode6 = (iHashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.duration;
        int iHashCode7 = (iHashCode6 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.elapsedDuration;
        int iHashCode8 = (iHashCode7 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.movingDuration;
        int iHashCode9 = (iHashCode8 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.averageHR;
        int iHashCode10 = (iHashCode9 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.maxHR;
        int iHashCode11 = (iHashCode10 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.elevationGain;
        int iHashCode12 = (iHashCode11 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.elevationLoss;
        int iHashCode13 = (iHashCode12 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.endLatitude;
        int iHashCode14 = (iHashCode13 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.endLongitude;
        int iHashCode15 = (iHashCode14 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Integer num = this.messageIndex;
        int iHashCode16 = (iHashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        Double d34 = this.startLatitude;
        int iHashCode17 = (iHashCode16 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.startLongitude;
        int iHashCode18 = (iHashCode17 + (d35 == null ? 0 : d35.hashCode())) * 31;
        List<Integer> list = this.lapIndexes;
        int iHashCode19 = (iHashCode18 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.internalType;
        int iHashCode20 = (iHashCode19 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.numFalls;
        int iHashCode21 = (iHashCode20 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.internalStatus;
        int iG = q6.f.g((iHashCode21 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.climbSend);
        u0 u0Var = this.difficulty;
        int iHashCode22 = (iG + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        Double d36 = this.calories;
        int iHashCode23 = (iHashCode22 + (d36 == null ? 0 : d36.hashCode())) * 31;
        Double d37 = this.targetAvgSpeed;
        int iHashCode24 = (iHashCode23 + (d37 == null ? 0 : d37.hashCode())) * 31;
        Double d38 = this.targetDuration;
        int iHashCode25 = (iHashCode24 + (d38 == null ? 0 : d38.hashCode())) * 31;
        Double d39 = this.targetDistance;
        int iHashCode26 = (iHashCode25 + (d39 == null ? 0 : d39.hashCode())) * 31;
        Double d44 = this.startElevation;
        int iHashCode27 = (iHashCode26 + (d44 == null ? 0 : d44.hashCode())) * 31;
        Double d45 = this.strideLength;
        int iHashCode28 = (iHashCode27 + (d45 == null ? 0 : d45.hashCode())) * 31;
        Double d46 = this.averageRunCadence;
        int iHashCode29 = (iHashCode28 + (d46 == null ? 0 : d46.hashCode())) * 31;
        Double d47 = this.maxRunCadence;
        int iHashCode30 = (iHashCode29 + (d47 == null ? 0 : d47.hashCode())) * 31;
        Double d48 = this.minTemperature;
        int iHashCode31 = (iHashCode30 + (d48 == null ? 0 : d48.hashCode())) * 31;
        Double d49 = this.maxTemperature;
        int iHashCode32 = (iHashCode31 + (d49 == null ? 0 : d49.hashCode())) * 31;
        Double d54 = this.avgTemperature;
        int iHashCode33 = (iHashCode32 + (d54 == null ? 0 : d54.hashCode())) * 31;
        Double d55 = this.maxSpeed;
        int iHashCode34 = (iHashCode33 + (d55 == null ? 0 : d55.hashCode())) * 31;
        Double d56 = this.normalizedPower;
        int iHashCode35 = (iHashCode34 + (d56 == null ? 0 : d56.hashCode())) * 31;
        Double d57 = this.avgPower;
        int iHashCode36 = (iHashCode35 + (d57 == null ? 0 : d57.hashCode())) * 31;
        Double d58 = this.maxPower;
        int iHashCode37 = (iHashCode36 + (d58 == null ? 0 : d58.hashCode())) * 31;
        Double d59 = this.normalizedForce;
        int iHashCode38 = (iHashCode37 + (d59 == null ? 0 : d59.hashCode())) * 31;
        Double d64 = this.avgBikeForce;
        int iHashCode39 = (iHashCode38 + (d64 == null ? 0 : d64.hashCode())) * 31;
        Double d65 = this.maxBikeForce;
        int iHashCode40 = (iHashCode39 + (d65 == null ? 0 : d65.hashCode())) * 31;
        Double d66 = this.targetPower;
        int iHashCode41 = (iHashCode40 + (d66 == null ? 0 : d66.hashCode())) * 31;
        Double d67 = this.leftBalance;
        int iHashCode42 = (iHashCode41 + (d67 == null ? 0 : d67.hashCode())) * 31;
        Double d68 = this.rightBalance;
        int iHashCode43 = (iHashCode42 + (d68 == null ? 0 : d68.hashCode())) * 31;
        Double d69 = this.avgBikeCadence;
        int iHashCode44 = (iHashCode43 + (d69 == null ? 0 : d69.hashCode())) * 31;
        Double d74 = this.maxBikeCadence;
        int iHashCode45 = (iHashCode44 + (d74 == null ? 0 : d74.hashCode())) * 31;
        Double d75 = this.max2SecondSpeed;
        int iHashCode46 = (iHashCode45 + (d75 == null ? 0 : d75.hashCode())) * 31;
        Double d76 = this.max10SecondSpeed;
        int iHashCode47 = (iHashCode46 + (d76 == null ? 0 : d76.hashCode())) * 31;
        Double d77 = this.avgGradeAdjustedSpeed;
        int iHashCode48 = (iHashCode47 + (d77 == null ? 0 : d77.hashCode())) * 31;
        Double d78 = this.averageGrade;
        int iHashCode49 = (iHashCode48 + (d78 == null ? 0 : d78.hashCode())) * 31;
        Double d79 = this.maxGrade;
        int iHashCode50 = (iHashCode49 + (d79 == null ? 0 : d79.hashCode())) * 31;
        Double d84 = this.minCadence;
        int iHashCode51 = (iHashCode50 + (d84 == null ? 0 : d84.hashCode())) * 31;
        Double d85 = this.avgVerticalSpeed;
        int iHashCode52 = (iHashCode51 + (d85 == null ? 0 : d85.hashCode())) * 31;
        Double d86 = this.avgDescentSpeed;
        int iHashCode53 = (iHashCode52 + (d86 == null ? 0 : d86.hashCode())) * 31;
        String str3 = this.climbProDifficulty;
        int iHashCode54 = (iHashCode53 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.gamesStatus;
        int iHashCode55 = (iHashCode54 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.gameRank;
        int iHashCode56 = (iHashCode55 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.gameRanksPossible;
        int iHashCode57 = (iHashCode56 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d87 = this.avgStress;
        int iHashCode58 = (iHashCode57 + (d87 == null ? 0 : d87.hashCode())) * 31;
        Double d88 = this.maxStress;
        int iHashCode59 = (iHashCode58 + (d88 == null ? 0 : d88.hashCode())) * 31;
        Double d89 = this.groundContactTime;
        int iHashCode60 = (iHashCode59 + (d89 == null ? 0 : d89.hashCode())) * 31;
        Double d93 = this.groundContactBalanceLeft;
        int iHashCode61 = (iHashCode60 + (d93 == null ? 0 : d93.hashCode())) * 31;
        Double d94 = this.stepSpeedLoss;
        int iHashCode62 = (iHashCode61 + (d94 == null ? 0 : d94.hashCode())) * 31;
        Double d95 = this.stepSpeedLossPercent;
        int iHashCode63 = (iHashCode62 + (d95 == null ? 0 : d95.hashCode())) * 31;
        Double d96 = this.verticalOscillation;
        int iHashCode64 = (iHashCode63 + (d96 == null ? 0 : d96.hashCode())) * 31;
        Double d97 = this.verticalRatio;
        int iHashCode65 = (iHashCode64 + (d97 == null ? 0 : d97.hashCode())) * 31;
        Integer num5 = this.parentIndex;
        int iHashCode66 = (iHashCode65 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.timingGateIndex;
        int iHashCode67 = (iHashCode66 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l14 = this.groupRideCompetitionId;
        int iHashCode68 = (iHashCode67 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str5 = this.groupRideSessionUuid;
        int iHashCode69 = (iHashCode68 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pisteDifficulty;
        int iHashCode70 = (iHashCode69 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.maxPisteDifficulty;
        int iHashCode71 = (iHashCode70 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d98 = this.bottomTime;
        int iHashCode72 = (iHashCode71 + (d98 == null ? 0 : d98.hashCode())) * 31;
        Double d99 = this.surfaceInterval;
        int iHashCode73 = (iHashCode72 + (d99 == null ? 0 : d99.hashCode())) * 31;
        Double d100 = this.maxDepth;
        int iHashCode74 = (iHashCode73 + (d100 == null ? 0 : d100.hashCode())) * 31;
        Double d101 = this.packWeight;
        int iHashCode75 = (iHashCode74 + (d101 == null ? 0 : d101.hashCode())) * 31;
        Double d102 = this.maxPackWeight;
        int iHashCode76 = (iHashCode75 + (d102 == null ? 0 : d102.hashCode())) * 31;
        Double d103 = this.avgPackWeight;
        int iHashCode77 = (iHashCode76 + (d103 == null ? 0 : d103.hashCode())) * 31;
        Double d104 = this.f140403x1;
        int iHashCode78 = (iHashCode77 + (d104 == null ? 0 : d104.hashCode())) * 31;
        Double d105 = this.f140405y1;
        int iHashCode79 = (iHashCode78 + (d105 == null ? 0 : d105.hashCode())) * 31;
        Double d106 = this.f140407z1;
        int iHashCode80 = (iHashCode79 + (d106 == null ? 0 : d106.hashCode())) * 31;
        Double d107 = this.A1;
        int iHashCode81 = (iHashCode80 + (d107 == null ? 0 : d107.hashCode())) * 31;
        List<w> list2 = this.B1;
        int iHashCode82 = (iHashCode81 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Double d108 = this.C1;
        return iHashCode82 + (d108 != null ? d108.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getAverageSpeed() {
        return this.averageSpeed;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final Long getGroupRideCompetitionId() {
        return this.groupRideCompetitionId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getAvgBikeCadence() {
        return this.avgBikeCadence;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final String getGroupRideSessionUuid() {
        return this.groupRideSessionUuid;
    }

    /* JADX INFO: renamed from: j1, reason: from getter */
    public final Integer getNumFalls() {
        return this.numFalls;
    }

    public final void j3(Double d14) {
        this.maxBikeCadence = d14;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Double getAvgBikeForce() {
        return this.avgBikeForce;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final String getInternalStatus() {
        return this.internalStatus;
    }

    public final void k2(Double d14) {
        this.avgBikeCadence = d14;
    }

    public final void k3(Double d14) {
        this.maxHR = d14;
    }

    public final void l2(Double d14) {
        this.avgPower = d14;
    }

    public final void l3(Double d14) {
        this.maxPower = d14;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getAvgDescentSpeed() {
        return this.avgDescentSpeed;
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final String getInternalType() {
        return this.internalType;
    }

    public final void n2(boolean z14) {
        this.climbSend = z14;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Double getAvgGradeAdjustedSpeed() {
        return this.avgGradeAdjustedSpeed;
    }

    public final String o0() {
        return this.internalType;
    }

    public final void o3(Double d14) {
        this.maxSpeed = d14;
    }

    public final List<Integer> p0() {
        return this.lapIndexes;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Double getAvgPower() {
        return this.avgPower;
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final Double getLeftBalance() {
        return this.leftBalance;
    }

    public final void q3(Integer num) {
        this.messageIndex = num;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Double getAvgStress() {
        return this.avgStress;
    }

    public final void r3(Integer num) {
        this.numFalls = num;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Double getAvgTemperature() {
        return this.avgTemperature;
    }

    /* JADX INFO: renamed from: s1, reason: from getter */
    public final Double getPackWeight() {
        return this.packWeight;
    }

    public final void s3(Double d14) {
        this.packWeight = d14;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Double getAvgVerticalSpeed() {
        return this.avgVerticalSpeed;
    }

    /* JADX INFO: renamed from: t1, reason: from getter */
    public final Integer getParentIndex() {
        return this.parentIndex;
    }

    public final void t3(DateTime dateTime) {
        this.startDateTime = dateTime;
    }

    public final String toString() {
        DateTime dateTime = this.startDateTime;
        DateTime dateTime2 = this.startDateTimeLocal;
        DateTime dateTime3 = this.endDateTime;
        Double d14 = this.averageSpeed;
        Double d15 = this.averageMovingSpeed;
        Double d16 = this.distance;
        Double d17 = this.duration;
        Double d18 = this.elapsedDuration;
        Double d19 = this.movingDuration;
        Double d24 = this.averageHR;
        Double d25 = this.maxHR;
        Double d26 = this.elevationGain;
        Double d27 = this.elevationLoss;
        Double d28 = this.endLatitude;
        Double d29 = this.endLongitude;
        Integer num = this.messageIndex;
        Double d34 = this.startLatitude;
        Double d35 = this.startLongitude;
        List<Integer> list = this.lapIndexes;
        String str = this.internalType;
        Integer num2 = this.numFalls;
        String str2 = this.internalStatus;
        boolean z14 = this.climbSend;
        u0 u0Var = this.difficulty;
        Double d36 = this.calories;
        Double d37 = this.targetAvgSpeed;
        Double d38 = this.targetDuration;
        Double d39 = this.targetDistance;
        Double d44 = this.startElevation;
        Double d45 = this.strideLength;
        Double d46 = this.averageRunCadence;
        Double d47 = this.maxRunCadence;
        Double d48 = this.minTemperature;
        Double d49 = this.maxTemperature;
        Double d54 = this.avgTemperature;
        Double d55 = this.maxSpeed;
        Double d56 = this.normalizedPower;
        Double d57 = this.avgPower;
        Double d58 = this.maxPower;
        Double d59 = this.normalizedForce;
        Double d64 = this.avgBikeForce;
        Double d65 = this.maxBikeForce;
        Double d66 = this.targetPower;
        Double d67 = this.leftBalance;
        Double d68 = this.rightBalance;
        Double d69 = this.avgBikeCadence;
        Double d74 = this.maxBikeCadence;
        Double d75 = this.max2SecondSpeed;
        Double d76 = this.max10SecondSpeed;
        Double d77 = this.avgGradeAdjustedSpeed;
        Double d78 = this.averageGrade;
        Double d79 = this.maxGrade;
        Double d84 = this.minCadence;
        Double d85 = this.avgVerticalSpeed;
        Double d86 = this.avgDescentSpeed;
        String str3 = this.climbProDifficulty;
        String str4 = this.gamesStatus;
        Integer num3 = this.gameRank;
        Integer num4 = this.gameRanksPossible;
        Double d87 = this.avgStress;
        Double d88 = this.maxStress;
        Double d89 = this.groundContactTime;
        Double d93 = this.groundContactBalanceLeft;
        Double d94 = this.stepSpeedLoss;
        Double d95 = this.stepSpeedLossPercent;
        Double d96 = this.verticalOscillation;
        Double d97 = this.verticalRatio;
        Integer num5 = this.parentIndex;
        Integer num6 = this.timingGateIndex;
        Long l14 = this.groupRideCompetitionId;
        String str5 = this.groupRideSessionUuid;
        String str6 = this.pisteDifficulty;
        String str7 = this.maxPisteDifficulty;
        Double d98 = this.bottomTime;
        Double d99 = this.surfaceInterval;
        Double d100 = this.maxDepth;
        Double d101 = this.packWeight;
        Double d102 = this.maxPackWeight;
        Double d103 = this.avgPackWeight;
        Double d104 = this.f140403x1;
        Double d105 = this.f140405y1;
        Double d106 = this.f140407z1;
        Double d107 = this.A1;
        Double d108 = this.C1;
        StringBuilder sb3 = new StringBuilder("TypedSplitDTO(startDateTime=");
        sb3.append(dateTime);
        sb3.append(", startDateTimeLocal=");
        sb3.append(dateTime2);
        sb3.append(", endDateTime=");
        sb3.append(dateTime3);
        sb3.append(", averageSpeed=");
        sb3.append(d14);
        sb3.append(", averageMovingSpeed=");
        b71.i.p(d15, d16, ", distance=", ", duration=", sb3);
        b71.i.p(d17, d18, ", elapsedDuration=", ", movingDuration=", sb3);
        b71.i.p(d19, d24, ", averageHR=", ", maxHR=", sb3);
        b71.i.p(d25, d26, ", elevationGain=", ", elevationLoss=", sb3);
        b71.i.p(d27, d28, ", endLatitude=", ", endLongitude=", sb3);
        b71.i.t(sb3, d29, ", messageIndex=", num, ", startLatitude=");
        b71.i.p(d34, d35, ", startLongitude=", ", lapIndexes=", sb3);
        o2.c.n(", internalType=", str, ", numFalls=", sb3, list);
        p6.b.l(num2, ", internalStatus=", str2, ", climbSend=", sb3);
        sb3.append(z14);
        sb3.append(", difficulty=");
        sb3.append(u0Var);
        sb3.append(", calories=");
        b71.i.p(d36, d37, ", targetAvgSpeed=", ", targetDuration=", sb3);
        b71.i.p(d38, d39, ", targetDistance=", ", startElevation=", sb3);
        b71.i.p(d44, d45, ", strideLength=", ", averageRunCadence=", sb3);
        b71.i.p(d46, d47, ", maxRunCadence=", ", minTemperature=", sb3);
        b71.i.p(d48, d49, ", maxTemperature=", ", avgTemperature=", sb3);
        b71.i.p(d54, d55, ", maxSpeed=", ", normalizedPower=", sb3);
        b71.i.p(d56, d57, ", avgPower=", ", maxPower=", sb3);
        b71.i.p(d58, d59, ", normalizedForce=", ", avgBikeForce=", sb3);
        b71.i.p(d64, d65, ", maxBikeForce=", ", targetPower=", sb3);
        b71.i.p(d66, d67, ", leftBalance=", ", rightBalance=", sb3);
        b71.i.p(d68, d69, ", avgBikeCadence=", ", maxBikeCadence=", sb3);
        b71.i.p(d74, d75, ", max2SecondSpeed=", ", max10SecondSpeed=", sb3);
        b71.i.p(d76, d77, ", avgGradeAdjustedSpeed=", ", averageGrade=", sb3);
        b71.i.p(d78, d79, ", maxGrade=", ", minCadence=", sb3);
        b71.i.p(d84, d85, ", avgVerticalSpeed=", ", avgDescentSpeed=", sb3);
        b71.i.u(sb3, d86, ", climbProDifficulty=", str3, ", gamesStatus=");
        fb1.c.u(num3, str4, ", gameRank=", ", gameRanksPossible=", sb3);
        b71.i.v(sb3, num4, ", avgStress=", d87, ", maxStress=");
        b71.i.p(d88, d89, ", groundContactTime=", ", groundContactBalanceLeft=", sb3);
        b71.i.p(d93, d94, ", stepSpeedLoss=", ", stepSpeedLossPercent=", sb3);
        b71.i.p(d95, d96, ", verticalOscillation=", ", verticalRatio=", sb3);
        b71.i.t(sb3, d97, ", parentIndex=", num5, ", timingGateIndex=");
        sb3.append(num6);
        sb3.append(", groupRideCompetitionId=");
        sb3.append(l14);
        sb3.append(", groupRideSessionUuid=");
        sn.a.t(sb3, str5, ", pisteDifficulty=", str6, ", maxPisteDifficulty=");
        b71.i.x(sb3, str7, ", bottomTime=", d98, ", surfaceInterval=");
        b71.i.p(d99, d100, ", maxDepth=", ", packWeight=", sb3);
        b71.i.p(d101, d102, ", maxPackWeight=", ", avgPackWeight=", sb3);
        b71.i.p(d103, d104, ", cumulativeTime=", ", cumulativeDistance=", sb3);
        b71.i.p(d105, d106, ", startTime=", ", stopTime=", sb3);
        sb3.append(d107);
        sb3.append(", ciqMeasurements=");
        sb3.append(this.B1);
        sb3.append(", minHR=");
        return b71.i.g(sb3, d108, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Double getBottomTime() {
        return this.bottomTime;
    }

    /* JADX INFO: renamed from: v1, reason: from getter */
    public final String getPisteDifficulty() {
        return this.pisteDifficulty;
    }

    public final void v3(DateTime dateTime) {
        this.startDateTimeLocal = dateTime;
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final Double getMax10SecondSpeed() {
        return this.max10SecondSpeed;
    }

    public final void w3(Double d14) {
        this.startLatitude = d14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.startDateTime);
        parcel.writeSerializable(this.startDateTimeLocal);
        parcel.writeSerializable(this.endDateTime);
        Double d14 = this.averageSpeed;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.averageMovingSpeed;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.distance;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.duration;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.elapsedDuration;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.movingDuration;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        Double d24 = this.averageHR;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        Double d25 = this.maxHR;
        if (d25 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d25);
        }
        Double d26 = this.elevationGain;
        if (d26 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d26);
        }
        Double d27 = this.elevationLoss;
        if (d27 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d27);
        }
        Double d28 = this.endLatitude;
        if (d28 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d28);
        }
        Double d29 = this.endLongitude;
        if (d29 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d29);
        }
        Integer num = this.messageIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d34 = this.startLatitude;
        if (d34 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d34);
        }
        Double d35 = this.startLongitude;
        if (d35 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d35);
        }
        List<Integer> list = this.lapIndexes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = lc.u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeInt(((Number) itO.next()).intValue());
            }
        }
        parcel.writeString(this.internalType);
        Integer num2 = this.numFalls;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeString(this.internalStatus);
        parcel.writeInt(this.climbSend ? 1 : 0);
        parcel.writeParcelable(this.difficulty, i14);
        Double d36 = this.calories;
        if (d36 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d36);
        }
        Double d37 = this.targetAvgSpeed;
        if (d37 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d37);
        }
        Double d38 = this.targetDuration;
        if (d38 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d38);
        }
        Double d39 = this.targetDistance;
        if (d39 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d39);
        }
        Double d44 = this.startElevation;
        if (d44 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d44);
        }
        Double d45 = this.strideLength;
        if (d45 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d45);
        }
        Double d46 = this.averageRunCadence;
        if (d46 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d46);
        }
        Double d47 = this.maxRunCadence;
        if (d47 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d47);
        }
        Double d48 = this.minTemperature;
        if (d48 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d48);
        }
        Double d49 = this.maxTemperature;
        if (d49 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d49);
        }
        Double d54 = this.avgTemperature;
        if (d54 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d54);
        }
        Double d55 = this.maxSpeed;
        if (d55 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d55);
        }
        Double d56 = this.normalizedPower;
        if (d56 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d56);
        }
        Double d57 = this.avgPower;
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
        Double d59 = this.normalizedForce;
        if (d59 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d59);
        }
        Double d64 = this.avgBikeForce;
        if (d64 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d64);
        }
        Double d65 = this.maxBikeForce;
        if (d65 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d65);
        }
        Double d66 = this.targetPower;
        if (d66 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d66);
        }
        Double d67 = this.leftBalance;
        if (d67 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d67);
        }
        Double d68 = this.rightBalance;
        if (d68 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d68);
        }
        Double d69 = this.avgBikeCadence;
        if (d69 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d69);
        }
        Double d74 = this.maxBikeCadence;
        if (d74 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d74);
        }
        Double d75 = this.max2SecondSpeed;
        if (d75 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d75);
        }
        Double d76 = this.max10SecondSpeed;
        if (d76 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d76);
        }
        Double d77 = this.avgGradeAdjustedSpeed;
        if (d77 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d77);
        }
        Double d78 = this.averageGrade;
        if (d78 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d78);
        }
        Double d79 = this.maxGrade;
        if (d79 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d79);
        }
        Double d84 = this.minCadence;
        if (d84 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d84);
        }
        Double d85 = this.avgVerticalSpeed;
        if (d85 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d85);
        }
        Double d86 = this.avgDescentSpeed;
        if (d86 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d86);
        }
        parcel.writeString(this.climbProDifficulty);
        parcel.writeString(this.gamesStatus);
        Integer num3 = this.gameRank;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.gameRanksPossible;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Double d87 = this.avgStress;
        if (d87 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d87);
        }
        Double d88 = this.maxStress;
        if (d88 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d88);
        }
        Double d89 = this.groundContactTime;
        if (d89 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d89);
        }
        Double d93 = this.groundContactBalanceLeft;
        if (d93 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d93);
        }
        Double d94 = this.stepSpeedLoss;
        if (d94 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d94);
        }
        Double d95 = this.stepSpeedLossPercent;
        if (d95 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d95);
        }
        Double d96 = this.verticalOscillation;
        if (d96 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d96);
        }
        Double d97 = this.verticalRatio;
        if (d97 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d97);
        }
        Integer num5 = this.parentIndex;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        Integer num6 = this.timingGateIndex;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num6);
        }
        Long l14 = this.groupRideCompetitionId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.groupRideSessionUuid);
        parcel.writeString(this.pisteDifficulty);
        parcel.writeString(this.maxPisteDifficulty);
        Double d98 = this.bottomTime;
        if (d98 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d98);
        }
        Double d99 = this.surfaceInterval;
        if (d99 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d99);
        }
        Double d100 = this.maxDepth;
        if (d100 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d100);
        }
        Double d101 = this.packWeight;
        if (d101 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d101);
        }
        Double d102 = this.maxPackWeight;
        if (d102 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d102);
        }
        Double d103 = this.avgPackWeight;
        if (d103 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d103);
        }
        Double d104 = this.f140403x1;
        if (d104 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d104);
        }
        Double d105 = this.f140405y1;
        if (d105 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d105);
        }
        Double d106 = this.f140407z1;
        if (d106 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d106);
        }
        Double d107 = this.A1;
        if (d107 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d107);
        }
        List<w> list2 = this.B1;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = lc.u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((w) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        Double d108 = this.C1;
        if (d108 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d108);
        }
    }

    /* JADX INFO: renamed from: x0, reason: from getter */
    public final Double getMax2SecondSpeed() {
        return this.max2SecondSpeed;
    }

    /* JADX INFO: renamed from: x1, reason: from getter */
    public final Double getRightBalance() {
        return this.rightBalance;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Double getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: y1, reason: from getter */
    public final DateTime getStartDateTime() {
        return this.startDateTime;
    }

    public final void y2(u0 u0Var) {
        this.difficulty = u0Var;
    }

    public final void y3(Double d14) {
        this.startLongitude = d14;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getClimbProDifficulty() {
        return this.climbProDifficulty;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final Double getMaxBikeCadence() {
        return this.maxBikeCadence;
    }

    public final void z2(Double d14) {
        this.distance = d14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lps/x1$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public x1(DateTime dateTime, DateTime dateTime2, DateTime dateTime3, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Integer num, Double d34, Double d35, List<Integer> list, String str, Integer num2, String str2, boolean z14, u0 u0Var, Double d36, Double d37, Double d38, Double d39, Double d44, Double d45, Double d46, Double d47, Double d48, Double d49, Double d54, Double d55, Double d56, Double d57, Double d58, Double d59, Double d64, Double d65, Double d66, Double d67, Double d68, Double d69, Double d74, Double d75, Double d76, Double d77, Double d78, Double d79, Double d84, Double d85, Double d86, String str3, String str4, Integer num3, Integer num4, Double d87, Double d88, Double d89, Double d93, Double d94, Double d95, Double d96, Double d97, Integer num5, Integer num6, Long l14, String str5, String str6, String str7, Double d98, Double d99, Double d100, Double d101, Double d102, Double d103, Double d104, Double d105, Double d106, Double d107, List<w> list2, Double d108) {
        this.startDateTime = dateTime;
        this.startDateTimeLocal = dateTime2;
        this.endDateTime = dateTime3;
        this.averageSpeed = d14;
        this.averageMovingSpeed = d15;
        this.distance = d16;
        this.duration = d17;
        this.elapsedDuration = d18;
        this.movingDuration = d19;
        this.averageHR = d24;
        this.maxHR = d25;
        this.elevationGain = d26;
        this.elevationLoss = d27;
        this.endLatitude = d28;
        this.endLongitude = d29;
        this.messageIndex = num;
        this.startLatitude = d34;
        this.startLongitude = d35;
        this.lapIndexes = list;
        this.internalType = str;
        this.numFalls = num2;
        this.internalStatus = str2;
        this.climbSend = z14;
        this.difficulty = u0Var;
        this.calories = d36;
        this.targetAvgSpeed = d37;
        this.targetDuration = d38;
        this.targetDistance = d39;
        this.startElevation = d44;
        this.strideLength = d45;
        this.averageRunCadence = d46;
        this.maxRunCadence = d47;
        this.minTemperature = d48;
        this.maxTemperature = d49;
        this.avgTemperature = d54;
        this.maxSpeed = d55;
        this.normalizedPower = d56;
        this.avgPower = d57;
        this.maxPower = d58;
        this.normalizedForce = d59;
        this.avgBikeForce = d64;
        this.maxBikeForce = d65;
        this.targetPower = d66;
        this.leftBalance = d67;
        this.rightBalance = d68;
        this.avgBikeCadence = d69;
        this.maxBikeCadence = d74;
        this.max2SecondSpeed = d75;
        this.max10SecondSpeed = d76;
        this.avgGradeAdjustedSpeed = d77;
        this.averageGrade = d78;
        this.maxGrade = d79;
        this.minCadence = d84;
        this.avgVerticalSpeed = d85;
        this.avgDescentSpeed = d86;
        this.climbProDifficulty = str3;
        this.gamesStatus = str4;
        this.gameRank = num3;
        this.gameRanksPossible = num4;
        this.avgStress = d87;
        this.maxStress = d88;
        this.groundContactTime = d89;
        this.groundContactBalanceLeft = d93;
        this.stepSpeedLoss = d94;
        this.stepSpeedLossPercent = d95;
        this.verticalOscillation = d96;
        this.verticalRatio = d97;
        this.parentIndex = num5;
        this.timingGateIndex = num6;
        this.groupRideCompetitionId = l14;
        this.groupRideSessionUuid = str5;
        this.pisteDifficulty = str6;
        this.maxPisteDifficulty = str7;
        this.bottomTime = d98;
        this.surfaceInterval = d99;
        this.maxDepth = d100;
        this.packWeight = d101;
        this.maxPackWeight = d102;
        this.avgPackWeight = d103;
        this.f140403x1 = d104;
        this.f140405y1 = d105;
        this.f140407z1 = d106;
        this.A1 = d107;
        this.B1 = list2;
        this.C1 = d108;
    }

    public x1() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 2097151, null);
    }
}
