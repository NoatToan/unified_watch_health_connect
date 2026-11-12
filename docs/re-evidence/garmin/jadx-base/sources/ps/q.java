package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0003\b¦\u0001\b\u0087\b\u0018\u00002\u00020\u0001Bã\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\f\u0012\b\u0010!\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\"\u001a\u00020\f\u0012\b\u0010#\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010'\u001a\u00020\f\u0012\u0006\u0010(\u001a\u00020\u0006\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\f\u0012\u0006\u0010+\u001a\u00020\f\u0012\u0006\u0010,\u001a\u00020\u0006\u0012\u0006\u0010-\u001a\u00020\f\u0012\u0006\u0010.\u001a\u00020\f\u0012\u0006\u0010/\u001a\u00020\u0006\u0012\u0006\u00100\u001a\u00020\u0006\u0012\u0006\u00101\u001a\u00020\u0006\u0012\u0006\u00102\u001a\u00020\f\u0012\b\u00103\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u00104\u001a\u00020\f\u0012\u0006\u00105\u001a\u00020\u0006\u0012\u0006\u00106\u001a\u00020\f\u0012\u0006\u00107\u001a\u00020\f\u0012\u0006\u00108\u001a\u00020\u0004\u0012\u0006\u00109\u001a\u00020\u0006\u0012\u0006\u0010:\u001a\u00020\u0006\u0012\u0006\u0010;\u001a\u00020\u0006\u0012\u0006\u0010<\u001a\u00020\u0004\u0012\u0006\u0010=\u001a\u00020\f\u0012\u0006\u0010>\u001a\u00020\f\u0012\u0006\u0010?\u001a\u00020\f\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010C\u001a\u00020\f\u0012\u0006\u0010D\u001a\u00020\f\u0012\u0010\b\u0002\u0010G\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010E\u0012\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010E\u0012\b\b\u0002\u0010J\u001a\u00020\u0002\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010M\u001a\u00020\u0002\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010O\u001a\u00020\f\u0012\u0006\u0010P\u001a\u00020\f\u0012\u0006\u0010Q\u001a\u00020\f\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010U\u0012\b\u0010W\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010X\u001a\u0004\u0018\u00010\f\u0012\b\u0010Y\u001a\u0004\u0018\u00010\f\u0012\b\u0010Z\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010[\u001a\u00020\u0006\u0012\b\u0010\\\u001a\u0004\u0018\u00010\f\u0012\b\u0010]\u001a\u0004\u0018\u00010\f\u0012\b\u0010^\u001a\u0004\u0018\u00010\f\u0012\b\u0010_\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010`\u001a\u0004\u0018\u00010\f\u0012\b\u0010a\u001a\u0004\u0018\u00010\f\u0012\b\u0010b\u001a\u0004\u0018\u00010\f\u0012\b\u0010d\u001a\u0004\u0018\u00010c\u0012\b\u0010e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010f\u001a\u0004\u0018\u00010\f\u0012\b\u0010g\u001a\u0004\u0018\u00010\f\u0012\b\u0010h\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bi\u0010jR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bw\u0010p\u001a\u0004\bx\u0010rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\by\u0010p\u001a\u0004\bz\u0010rR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010p\u001a\u0004\b|\u0010rR\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010t\u001a\u0004\b~\u0010vR\u001f\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010p\u001a\u0005\b\u0084\u0001\u0010rR\u001e\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001d\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bm\u0010\u0086\u0001\u001a\u0006\b\u0089\u0001\u0010\u0088\u0001R\u001e\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u0086\u0001\u001a\u0006\b\u008b\u0001\u0010\u0088\u0001R\u001d\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bq\u0010\u0086\u0001\u001a\u0006\b\u008c\u0001\u0010\u0088\u0001R\u001e\u0010\u0013\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u0086\u0001\u001a\u0006\b\u008e\u0001\u0010\u0088\u0001R\u001e\u0010\u0014\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0086\u0001\u001a\u0006\b\u0090\u0001\u0010\u0088\u0001R\u001e\u0010\u0015\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0086\u0001\u001a\u0006\b\u0092\u0001\u0010\u0088\u0001R\u001d\u0010\u0016\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bu\u0010\u0086\u0001\u001a\u0006\b\u0093\u0001\u0010\u0088\u0001R\u001f\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0094\u0001\u0010\u0080\u0001\u001a\u0005\bt\u0010\u0082\u0001R \u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0080\u0001\u001a\u0006\b\u0095\u0001\u0010\u0082\u0001R\u001e\u0010\u0019\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0086\u0001\u001a\u0006\b\u0097\u0001\u0010\u0088\u0001R \u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R \u0010\u001b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u0080\u0001\u001a\u0006\b\u009d\u0001\u0010\u0082\u0001R\u001e\u0010\u001c\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u0086\u0001\u001a\u0006\b\u009f\u0001\u0010\u0088\u0001R \u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R \u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R \u0010 \u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b§\u0001\u0010\u0080\u0001\u001a\u0006\b¨\u0001\u0010\u0082\u0001R \u0010!\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010\u0080\u0001\u001a\u0006\bª\u0001\u0010\u0082\u0001R\u001e\u0010\"\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0086\u0001\u001a\u0006\b\u0085\u0001\u0010\u0088\u0001R \u0010#\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b«\u0001\u0010\u0080\u0001\u001a\u0006\b¬\u0001\u0010\u0082\u0001R \u0010$\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u0080\u0001\u001a\u0006\b®\u0001\u0010\u0082\u0001R\u001d\u0010&\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bt\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u001e\u0010'\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b²\u0001\u0010\u0086\u0001\u001a\u0006\b³\u0001\u0010\u0088\u0001R\u001c\u0010(\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b´\u0001\u0010t\u001a\u0005\bµ\u0001\u0010vR\u001c\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¶\u0001\u0010l\u001a\u0005\b·\u0001\u0010nR\u001e\u0010*\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¸\u0001\u0010\u0086\u0001\u001a\u0006\b¹\u0001\u0010\u0088\u0001R\u001e\u0010+\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¯\u0001\u0010\u0086\u0001\u001a\u0006\bº\u0001\u0010\u0088\u0001R\u001c\u0010,\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bµ\u0001\u0010t\u001a\u0005\b»\u0001\u0010vR\u001e\u0010-\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¼\u0001\u0010\u0086\u0001\u001a\u0006\b£\u0001\u0010\u0088\u0001R\u001e\u0010.\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b½\u0001\u0010\u0086\u0001\u001a\u0006\b¾\u0001\u0010\u0088\u0001R\u001b\u0010/\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\r\n\u0005\b¿\u0001\u0010t\u001a\u0004\bo\u0010vR\u001c\u00100\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÀ\u0001\u0010t\u001a\u0005\bÁ\u0001\u0010vR\u001c\u00101\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bº\u0001\u0010t\u001a\u0005\b¯\u0001\u0010vR\u001e\u00102\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÂ\u0001\u0010\u0086\u0001\u001a\u0006\b\u0083\u0001\u0010\u0088\u0001R\u001e\u00103\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÃ\u0001\u0010p\u001a\u0005\bÄ\u0001\u0010rR\u001e\u00104\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÅ\u0001\u0010\u0086\u0001\u001a\u0006\b\u0094\u0001\u0010\u0088\u0001R\u001c\u00105\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÆ\u0001\u0010t\u001a\u0005\bÇ\u0001\u0010vR\u001e\u00106\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÈ\u0001\u0010\u0086\u0001\u001a\u0006\bÉ\u0001\u0010\u0088\u0001R\u001d\u00107\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bz\u0010\u0086\u0001\u001a\u0006\bÊ\u0001\u0010\u0088\u0001R\u001c\u00108\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bË\u0001\u0010p\u001a\u0005\bÌ\u0001\u0010rR\u001c\u00109\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÍ\u0001\u0010t\u001a\u0005\bÎ\u0001\u0010vR\u001c\u0010:\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÏ\u0001\u0010t\u001a\u0005\bÐ\u0001\u0010vR\u001c\u0010;\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÑ\u0001\u0010t\u001a\u0005\bÒ\u0001\u0010vR\u001c\u0010<\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÓ\u0001\u0010p\u001a\u0005\bÔ\u0001\u0010rR\u001e\u0010=\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÕ\u0001\u0010\u0086\u0001\u001a\u0006\bÖ\u0001\u0010\u0088\u0001R\u001e\u0010>\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b×\u0001\u0010\u0086\u0001\u001a\u0006\bÆ\u0001\u0010\u0088\u0001R\u001e\u0010?\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0086\u0001\u001a\u0006\bØ\u0001\u0010\u0088\u0001R \u0010@\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÙ\u0001\u0010¤\u0001\u001a\u0006\bÚ\u0001\u0010¦\u0001R\u001e\u0010A\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010p\u001a\u0005\bÛ\u0001\u0010rR\u001e\u0010B\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bÜ\u0001\u0010p\u001a\u0005\bÝ\u0001\u0010rR\u001e\u0010C\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÞ\u0001\u0010\u0086\u0001\u001a\u0006\bß\u0001\u0010\u0088\u0001R\u001e\u0010D\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÌ\u0001\u0010\u0086\u0001\u001a\u0006\bà\u0001\u0010\u0088\u0001R&\u0010G\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010E8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001R&\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010E8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bå\u0001\u0010â\u0001\u001a\u0006\bæ\u0001\u0010ä\u0001R\u001c\u0010J\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bç\u0001\u0010l\u001a\u0005\bË\u0001\u0010nR \u0010K\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bè\u0001\u0010\u0080\u0001\u001a\u0006\bé\u0001\u0010\u0082\u0001R\u001e\u0010L\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bê\u0001\u0010p\u001a\u0005\bë\u0001\u0010rR\u001c\u0010M\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bì\u0001\u0010l\u001a\u0005\bí\u0001\u0010nR \u0010N\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bî\u0001\u0010¤\u0001\u001a\u0006\bï\u0001\u0010¦\u0001R\u001e\u0010O\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bð\u0001\u0010\u0086\u0001\u001a\u0006\bñ\u0001\u0010\u0088\u0001R\u001e\u0010P\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bò\u0001\u0010\u0086\u0001\u001a\u0006\b\u009e\u0001\u0010\u0088\u0001R\u001e\u0010Q\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bó\u0001\u0010\u0086\u0001\u001a\u0006\bô\u0001\u0010\u0088\u0001R\u001f\u0010R\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\bõ\u0001\u0010\u0080\u0001\u001a\u0005\b{\u0010\u0082\u0001R\u001f\u0010S\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\bö\u0001\u0010\u0080\u0001\u001a\u0005\bw\u0010\u0082\u0001R \u0010T\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b÷\u0001\u0010\u0080\u0001\u001a\u0006\bÜ\u0001\u0010\u0082\u0001R \u0010V\u001a\u0004\u0018\u00010U8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bß\u0001\u0010ø\u0001\u001a\u0006\bê\u0001\u0010ù\u0001R \u0010W\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bà\u0001\u0010¤\u0001\u001a\u0006\bú\u0001\u0010¦\u0001R \u0010X\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bû\u0001\u0010\u0080\u0001\u001a\u0006\b©\u0001\u0010\u0082\u0001R\u001f\u0010Y\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b|\u0010\u0080\u0001\u001a\u0006\bü\u0001\u0010\u0082\u0001R \u0010Z\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bý\u0001\u0010\u0080\u0001\u001a\u0006\bÂ\u0001\u0010\u0082\u0001R\u001c\u0010[\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bï\u0001\u0010t\u001a\u0005\bþ\u0001\u0010vR\u001f\u0010\\\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\bØ\u0001\u0010\u0080\u0001\u001a\u0005\b}\u0010\u0082\u0001R\u001f\u0010]\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\bÿ\u0001\u0010\u0080\u0001\u001a\u0005\b\u007f\u0010\u0082\u0001R \u0010^\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0080\u0001\u001a\u0006\b\u0080\u0002\u0010\u0082\u0001R \u0010_\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0081\u0002\u0010¤\u0001\u001a\u0006\b\u0082\u0002\u0010¦\u0001R \u0010`\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÊ\u0001\u0010\u0080\u0001\u001a\u0006\bÑ\u0001\u0010\u0082\u0001R \u0010a\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bú\u0001\u0010\u0080\u0001\u001a\u0006\b\u0083\u0002\u0010\u0082\u0001R \u0010b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0084\u0002\u0010\u0080\u0001\u001a\u0006\b\u0086\u0001\u0010\u0082\u0001R \u0010d\u001a\u0004\u0018\u00010c8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÁ\u0001\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R\u001e\u0010e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bª\u0001\u0010p\u001a\u0005\bç\u0001\u0010rR \u0010f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010\u0080\u0001\u001a\u0006\b\u00ad\u0001\u0010\u0082\u0001R \u0010g\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÐ\u0001\u0010\u0080\u0001\u001a\u0006\b¿\u0001\u0010\u0082\u0001R\u001f\u0010h\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b~\u0010\u0080\u0001\u001a\u0006\bÈ\u0001\u0010\u0082\u0001¨\u0006\u0089\u0002"}, d2 = {"Lps/q;", "Landroid/os/Parcelable;", "", "activityId", "", "activityName", "", "activityTypeId", "activityTypeKey", "ownerDisplayName", "startTimeLocal", "unitId", "", "poolLength", "unitKey", "factor", "duration", "averageSpeed", "ascent", "elevationGain", "elevationLoss", "averageHR", "averagePower", "calories", "packWeightCalories", "strokes", "workoutId", "workoutTime", "maxDepth", "Lns/v;", "divingGas", "divingWaterType", "divingWaterDensity", "totalSurfaceInterval", "activityBottomTime", "maxBottomTime", "longestDiveDuration", "", "isDecoDive", "maxHR", "lapCount", "bestLapTime", "distance", "maxSpeed", "floorsClimbed", "averageVerticalSpeed", "averageRespirationRate", "activeSets", "totalSets", "climbRoutes", "activeSplitTime", "maxDiffKey", "averageBikingCadenceInRevPerMinute", "waveCount", "longestWaveDistance", "surfingMaxSpeed", "scoreType", "golfScore", "typeScore", "nrOfHoles", "leaderboardPosition", "avgStress", "maxStress", "stressChange", "bodyBatteryNetImpact", "climbMode", "locationName", "startLatitude", "startLongitude", "", "Lcom/google/android/gms/maps/model/LatLng;", "polylinePoints", "Lps/x1;", "splits", "ownerId", "numberOfActiveLengths", "calendarEventUuid", "calendarEventId", "steps", "maxLapAvgRunCadence", "averageRunCadence", "maxRunCadence", "activeSplitMovingTime", "activeSplitIdleTime", "restSplitTime", "Lps/o1;", "splitSummary", "totalReps", "avgJumpRopeCadence", "maxJumpRopeCadence", "maxSplitSpeed", "noOfSplits", "activeSplitSummaryDistance", "activeSplitSummaryElevationLoss", "longestPoolApneaInterval", "diveCount", "packWeight", "maxPackWeight", "avgPackWeight", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/p;", "deviceDisplayUnits", "speedDeviceDisplayMeasure", "avgSpO2", "maxSpO2", "minSpO2", "<init>", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;Ljava/lang/String;DDDDDDDDLjava/lang/Double;Ljava/lang/Double;DLjava/lang/Long;Ljava/lang/Double;DLns/v;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/Double;ZDIJDDIDDIIIDLjava/lang/String;DIDDLjava/lang/String;IIILjava/lang/String;DDDLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;DDLjava/util/List;Ljava/util/List;JLjava/lang/Double;Ljava/lang/String;JLjava/lang/Integer;DDDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lps/o1;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/garmin/android/apps/connectmobile/activities/newmodel/p;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "J", JWKParameterNames.OCT_KEY_VALUE, "()J", "b", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "c", "I", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()I", "d", "U", JWKParameterNames.RSA_EXPONENT, "R0", "f", "v1", "g", "J1", "h", "Ljava/lang/Double;", "b1", "()Ljava/lang/Double;", IntegerTokenConverter.CONVERTER_KEY, "M1", "j", "D", "i0", "()D", "f0", "l", "z", "getAscent", JWKParameterNames.RSA_MODULUS, "g0", "o", "h0", "p", "s", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Z0", "v", "A1", "w", "Ljava/lang/Long;", "getWorkoutId", "()Ljava/lang/Long;", "x", "S1", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "q0", "Lns/v;", "e0", "()Lns/v;", "A", "Ljava/lang/Integer;", "getDivingWaterType", "()Ljava/lang/Integer;", "B", "getDivingWaterDensity", "C", "G1", "E", "getMaxBottomTime", "F", "o0", "Z", "V1", "()Z", "P", "x0", "T", "k0", "X", "getBestLapTime", "Y", "a0", "L0", "j0", "H0", "I0", "u", "J0", "K0", "F1", "M0", "N0", "w0", "O0", "P0", "getWaveCount", "Q0", "getLongestWaveDistance", "C1", "S0", "e1", "T0", "getGolfScore", "U0", "I1", "V0", "getNrOfHoles", "W0", "getLeaderboardPosition", "X0", "G", "Y0", "y1", "a1", "H", "M", "c1", "n0", "d1", "s1", "t1", "f1", "Ljava/util/List;", "getPolylinePoints", "()Ljava/util/List;", "g1", "getSplits", "h1", "i1", "getNumberOfActiveLengths", "j1", "getCalendarEventUuid", "k1", "getCalendarEventId", "l1", "x1", "m1", "A0", "n1", "o1", "E0", "p1", "q1", "r1", "Lps/o1;", "()Lps/o1;", "D1", "u1", "z0", "w1", "getNoOfSplits", "z1", "p0", "B1", "c0", "C0", "E1", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/p;", "getDeviceDisplayUnits", "()Lcom/garmin/android/apps/connectmobile/activities/newmodel/p;", "H1", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();
    public static final int K1 = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @SerializedName("divingWaterType")
    private final Integer divingWaterType;

    /* JADX INFO: renamed from: A1, reason: from kotlin metadata */
    @SerializedName("longestPoolApneaInterval")
    private final Double longestPoolApneaInterval;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @SerializedName("divingWaterDensity")
    private final Double divingWaterDensity;

    /* JADX INFO: renamed from: B1, reason: from kotlin metadata */
    @SerializedName("diveCount")
    private final Integer diveCount;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @SerializedName("totalSurfaceInterval")
    private final Double totalSurfaceInterval;

    /* JADX INFO: renamed from: C1, reason: from kotlin metadata */
    @SerializedName("beginPackWeight")
    private final Double packWeight;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @SerializedName("activityBottomTime")
    private final double activityBottomTime;

    /* JADX INFO: renamed from: D1, reason: from kotlin metadata */
    @SerializedName("maxPackWeight")
    private final Double maxPackWeight;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @SerializedName("maxBottomTime")
    private final Double maxBottomTime;

    /* JADX INFO: renamed from: E1, reason: from kotlin metadata */
    @SerializedName("avgPackWeight")
    private final Double avgPackWeight;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @SerializedName("maxDuration")
    private final Double longestDiveDuration;

    /* JADX INFO: renamed from: F1, reason: from kotlin metadata */
    @SerializedName("deviceDisplayUnitsDTO")
    private final com.garmin.android.apps.connectmobile.activities.newmodel.p deviceDisplayUnits;

    /* JADX INFO: renamed from: G1, reason: from kotlin metadata */
    @SerializedName("speedDeviceDisplayMeasure")
    private final String speedDeviceDisplayMeasure;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @SerializedName("averageVerticalSpeed")
    private final double averageVerticalSpeed;

    /* JADX INFO: renamed from: H1, reason: from kotlin metadata */
    @SerializedName("avgSpo2")
    private final Double avgSpO2;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @SerializedName("isDecoDive")
    private final boolean isDecoDive;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @SerializedName("averageRespirationRate")
    private final double averageRespirationRate;

    /* JADX INFO: renamed from: I1, reason: from kotlin metadata */
    @SerializedName("maxSpo2")
    private final Double maxSpO2;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @SerializedName("activeSets")
    private final int activeSets;

    /* JADX INFO: renamed from: J1, reason: from kotlin metadata */
    @SerializedName("minSpo2")
    private final Double minSpO2;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @SerializedName("totalSets")
    private final int totalSets;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @SerializedName("climbRoutes")
    private final int climbRoutes;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @SerializedName("activeSplitTime")
    private final double activeSplitTime;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @SerializedName("maxDiffKey")
    private final String maxDiffKey;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @SerializedName("averageBikingCadenceInRevPerMinute")
    private final double averageBikingCadenceInRevPerMinute;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @SerializedName("maxHR")
    private final double maxHR;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @SerializedName("waveCount")
    private final int waveCount;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @SerializedName("longestWaveDistance")
    private final double longestWaveDistance;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @SerializedName("surfingMaxSpeed")
    private final double surfingMaxSpeed;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @SerializedName("scoreType")
    private final String scoreType;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @SerializedName("lapCount")
    private final int lapCount;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @SerializedName("golfScore")
    private final int golfScore;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @SerializedName("typeScore")
    private final int typeScore;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @SerializedName("nrOfHoles")
    private final int nrOfHoles;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    @SerializedName("leaderboardPosition")
    private final String leaderboardPosition;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @SerializedName("bestLapTime")
    private final long bestLapTime;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    @SerializedName("avgStress")
    private final double avgStress;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @SerializedName("distance")
    private final double distance;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    @SerializedName("maxStress")
    private final double maxStress;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @SerializedName("maxSpeed")
    private final double maxSpeed;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    @SerializedName("stressChange")
    private final double stressChange;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final long activityId;

    /* JADX INFO: renamed from: a1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("netImpact")
    private final Integer bodyBatteryNetImpact;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityName")
    private final String activityName;

    /* JADX INFO: renamed from: b1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("climbMode")
    private final String climbMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityTypeId")
    private final int activityTypeId;

    /* JADX INFO: renamed from: c1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locationName")
    private final String locationName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityTypeKey")
    private final String activityTypeKey;

    /* JADX INFO: renamed from: d1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLatitude")
    private final double startLatitude;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ownerDisplayName")
    private final String ownerDisplayName;

    /* JADX INFO: renamed from: e1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLongitude")
    private final double startLongitude;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeLocal")
    private final String startTimeLocal;

    /* JADX INFO: renamed from: f1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("polylinePoints")
    private final List<LatLng> polylinePoints;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitId")
    private final int unitId;

    /* JADX INFO: renamed from: g1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splits")
    private final List<x1> splits;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("poolLength")
    private final Double poolLength;

    /* JADX INFO: renamed from: h1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ownerId")
    private final long ownerId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitKey")
    private final String unitKey;

    /* JADX INFO: renamed from: i1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numberOfActiveLengths")
    private final Double numberOfActiveLengths;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("factor")
    private final double factor;

    /* JADX INFO: renamed from: j1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarEventUuid")
    private final String calendarEventUuid;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final double duration;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("floorsClimbed")
    private final int floorsClimbed;

    /* JADX INFO: renamed from: k1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarEventId")
    private final long calendarEventId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSpeed")
    private final double averageSpeed;

    /* JADX INFO: renamed from: l1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("steps")
    private final Integer steps;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ascent")
    private final double ascent;

    /* JADX INFO: renamed from: m1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxLapAvgRunCadence")
    private final double maxLapAvgRunCadence;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationGain")
    private final double elevationGain;

    /* JADX INFO: renamed from: n1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageRunCadence")
    private final double averageRunCadence;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationLoss")
    private final double elevationLoss;

    /* JADX INFO: renamed from: o1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxRunCadence")
    private final double maxRunCadence;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageHR")
    private final double averageHR;

    /* JADX INFO: renamed from: p1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activeSplitMovingTime")
    private final Double activeSplitMovingTime;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averagePower")
    private final double averagePower;

    /* JADX INFO: renamed from: q1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activeSplitIdleTime")
    private final Double activeSplitIdleTime;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calories")
    private final Double calories;

    /* JADX INFO: renamed from: r1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("restSplitTime")
    private final Double restSplitTime;

    /* JADX INFO: renamed from: s1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaries")
    private final o1 splitSummary;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("packWeightCalories")
    private final Double packWeightCalories;

    /* JADX INFO: renamed from: t1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalReps")
    private final Integer totalReps;

    /* JADX INFO: renamed from: u1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgJumpRopeCadence")
    private final Double avgJumpRopeCadence;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("strokes")
    private final double strokes;

    /* JADX INFO: renamed from: v1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxJumpRopeCadence")
    private final Double maxJumpRopeCadence;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutId")
    private final Long workoutId;

    /* JADX INFO: renamed from: w1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxSplitSpeed")
    private final Double maxSplitSpeed;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutTime")
    private final Double workoutTime;

    /* JADX INFO: renamed from: x1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("noOfSplits")
    private final int noOfSplits;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxDepth")
    private final double maxDepth;

    /* JADX INFO: renamed from: y1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaryDistance")
    private final Double activeSplitSummaryDistance;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("divingGas")
    private final ns.v divingGas;

    /* JADX INFO: renamed from: z1, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaryElevationLoss")
    private final Double activeSplitSummaryElevationLoss;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<q> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r108v3, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r116v4, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r31v0, types: [java.lang.Long] */
        /* JADX WARN: Type inference failed for: r36v5, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r82v2, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r90v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r95v1 */
        /* JADX WARN: Type inference failed for: r95v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r97v2, types: [java.lang.Integer] */
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            Double dValueOf;
            Double d14;
            ?? arrayList;
            ?? arrayList2;
            parcel.getClass();
            long j8 = parcel.readLong();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i15 = parcel.readInt();
            if (parcel.readInt() == 0) {
                dValueOf = null;
                d14 = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
                d14 = null;
            }
            String string5 = parcel.readString();
            Double d15 = d14;
            double d16 = parcel.readDouble();
            double d17 = parcel.readDouble();
            double d18 = parcel.readDouble();
            double d19 = parcel.readDouble();
            double d24 = parcel.readDouble();
            double d25 = parcel.readDouble();
            double d26 = parcel.readDouble();
            double d27 = parcel.readDouble();
            Double dValueOf2 = parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble());
            double d28 = parcel.readDouble();
            Object objValueOf = parcel.readInt() == 0 ? d15 : Long.valueOf(parcel.readLong());
            Double dValueOf4 = parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble());
            double d29 = parcel.readDouble();
            ns.v vVar = (ns.v) (parcel.readInt() == 0 ? d15 : ns.v.CREATOR.createFromParcel(parcel));
            Object objValueOf2 = parcel.readInt() == 0 ? d15 : Integer.valueOf(parcel.readInt());
            Double dValueOf5 = parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble());
            Double dValueOf6 = parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble());
            double d34 = parcel.readDouble();
            Double d35 = dValueOf5;
            Double d36 = dValueOf6;
            Double dValueOf7 = parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble());
            Double dValueOf8 = parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble());
            boolean z14 = parcel.readInt() != 0;
            double d37 = parcel.readDouble();
            Double d38 = dValueOf2;
            Double d39 = dValueOf3;
            ?? r34 = objValueOf;
            Double d44 = dValueOf4;
            int i16 = parcel.readInt();
            long j14 = parcel.readLong();
            double d45 = parcel.readDouble();
            double d46 = parcel.readDouble();
            int i17 = parcel.readInt();
            double d47 = parcel.readDouble();
            double d48 = parcel.readDouble();
            int i18 = parcel.readInt();
            int i19 = parcel.readInt();
            int i24 = parcel.readInt();
            double d49 = parcel.readDouble();
            String string6 = parcel.readString();
            double d54 = parcel.readDouble();
            int i25 = parcel.readInt();
            double d55 = parcel.readDouble();
            double d56 = parcel.readDouble();
            String string7 = parcel.readString();
            int i26 = parcel.readInt();
            int i27 = parcel.readInt();
            int i28 = parcel.readInt();
            String string8 = parcel.readString();
            double d57 = parcel.readDouble();
            double d58 = parcel.readDouble();
            double d59 = parcel.readDouble();
            Object objValueOf3 = parcel.readInt() == 0 ? d15 : Integer.valueOf(parcel.readInt());
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            ?? r84 = objValueOf3;
            double d64 = parcel.readDouble();
            double d65 = parcel.readDouble();
            if (parcel.readInt() == 0) {
                arrayList = d15;
            } else {
                int i29 = parcel.readInt();
                arrayList = new ArrayList(i29);
                int iD = 0;
                while (iD != i29) {
                    iD = lc.u0.d(q.class, parcel, arrayList, iD, 1);
                    i29 = i29;
                    i14 = i14;
                }
            }
            int i30 = i14;
            if (parcel.readInt() == 0) {
                arrayList2 = d15;
            } else {
                int i34 = parcel.readInt();
                arrayList2 = new ArrayList(i34);
                int iA = 0;
                while (iA != i34) {
                    arrayList = arrayList;
                    iA = kg.f.a(x1.CREATOR, parcel, arrayList2, iA, 1);
                    i34 = i34;
                    arrayList = arrayList;
                }
                arrayList = arrayList;
            }
            ?? r95 = arrayList;
            long j15 = parcel.readLong();
            Double dValueOf9 = parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble());
            ?? r93 = arrayList2;
            String string11 = parcel.readString();
            ?? r36 = objValueOf2;
            Double d66 = dValueOf9;
            long j16 = parcel.readLong();
            Object objValueOf4 = parcel.readInt() == 0 ? d15 : Integer.valueOf(parcel.readInt());
            return new q(j8, string, i30, string2, string3, string4, i15, dValueOf, string5, d16, d17, d18, d19, d24, d25, d26, d27, d38, d39, d28, r34, d44, d29, vVar, r36, d35, d36, d34, dValueOf7, dValueOf8, z14, d37, i16, j14, d45, d46, i17, d47, d48, i18, i19, i24, d49, string6, d54, i25, d55, d56, string7, i26, i27, i28, string8, d57, d58, d59, r84, string9, string10, d64, d65, r95, r93, j15, d66, string11, j16, objValueOf4, parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble()), (o1) (parcel.readInt() == 0 ? d15 : o1.CREATOR.createFromParcel(parcel)), parcel.readInt() == 0 ? d15 : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble()), parcel.readInt(), parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? d15 : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble()), (com.garmin.android.apps.connectmobile.activities.newmodel.p) (parcel.readInt() == 0 ? d15 : com.garmin.android.apps.connectmobile.activities.newmodel.p.CREATOR.createFromParcel(parcel)), parcel.readString(), parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    public q(long j8, String str, int i14, String str2, String str3, String str4, int i15, Double d14, String str5, double d15, double d16, double d17, double d18, double d19, double d24, double d25, double d26, Double d27, Double d28, double d29, Long l14, Double d34, double d35, ns.v vVar, Integer num, Double d36, Double d37, double d38, Double d39, Double d44, boolean z14, double d45, int i16, long j14, double d46, double d47, int i17, double d48, double d49, int i18, int i19, int i24, double d54, String str6, double d55, int i25, double d56, double d57, String str7, int i26, int i27, int i28, String str8, double d58, double d59, double d64, Integer num2, String str9, String str10, double d65, double d66, List<LatLng> list, List<x1> list2, long j15, Double d67, String str11, long j16, Integer num3, double d68, double d69, double d74, Double d75, Double d76, Double d77, o1 o1Var, Integer num4, Double d78, Double d79, Double d84, int i29, Double d85, Double d86, Double d87, Integer num5, Double d88, Double d89, Double d93, com.garmin.android.apps.connectmobile.activities.newmodel.p pVar, String str12, Double d94, Double d95, Double d96) {
        com.airbnb.lottie.animation.keyframe.a.y(str2, str7, str8);
        this.activityId = j8;
        this.activityName = str;
        this.activityTypeId = i14;
        this.activityTypeKey = str2;
        this.ownerDisplayName = str3;
        this.startTimeLocal = str4;
        this.unitId = i15;
        this.poolLength = d14;
        this.unitKey = str5;
        this.factor = d15;
        this.duration = d16;
        this.averageSpeed = d17;
        this.ascent = d18;
        this.elevationGain = d19;
        this.elevationLoss = d24;
        this.averageHR = d25;
        this.averagePower = d26;
        this.calories = d27;
        this.packWeightCalories = d28;
        this.strokes = d29;
        this.workoutId = l14;
        this.workoutTime = d34;
        this.maxDepth = d35;
        this.divingGas = vVar;
        this.divingWaterType = num;
        this.divingWaterDensity = d36;
        this.totalSurfaceInterval = d37;
        this.activityBottomTime = d38;
        this.maxBottomTime = d39;
        this.longestDiveDuration = d44;
        this.isDecoDive = z14;
        this.maxHR = d45;
        this.lapCount = i16;
        this.bestLapTime = j14;
        this.distance = d46;
        this.maxSpeed = d47;
        this.floorsClimbed = i17;
        this.averageVerticalSpeed = d48;
        this.averageRespirationRate = d49;
        this.activeSets = i18;
        this.totalSets = i19;
        this.climbRoutes = i24;
        this.activeSplitTime = d54;
        this.maxDiffKey = str6;
        this.averageBikingCadenceInRevPerMinute = d55;
        this.waveCount = i25;
        this.longestWaveDistance = d56;
        this.surfingMaxSpeed = d57;
        this.scoreType = str7;
        this.golfScore = i26;
        this.typeScore = i27;
        this.nrOfHoles = i28;
        this.leaderboardPosition = str8;
        this.avgStress = d58;
        this.maxStress = d59;
        this.stressChange = d64;
        this.bodyBatteryNetImpact = num2;
        this.climbMode = str9;
        this.locationName = str10;
        this.startLatitude = d65;
        this.startLongitude = d66;
        this.polylinePoints = list;
        this.splits = list2;
        this.ownerId = j15;
        this.numberOfActiveLengths = d67;
        this.calendarEventUuid = str11;
        this.calendarEventId = j16;
        this.steps = num3;
        this.maxLapAvgRunCadence = d68;
        this.averageRunCadence = d69;
        this.maxRunCadence = d74;
        this.activeSplitMovingTime = d75;
        this.activeSplitIdleTime = d76;
        this.restSplitTime = d77;
        this.splitSummary = o1Var;
        this.totalReps = num4;
        this.avgJumpRopeCadence = d78;
        this.maxJumpRopeCadence = d79;
        this.maxSplitSpeed = d84;
        this.noOfSplits = i29;
        this.activeSplitSummaryDistance = d85;
        this.activeSplitSummaryElevationLoss = d86;
        this.longestPoolApneaInterval = d87;
        this.diveCount = num5;
        this.packWeight = d88;
        this.maxPackWeight = d89;
        this.avgPackWeight = d93;
        this.deviceDisplayUnits = pVar;
        this.speedDeviceDisplayMeasure = str12;
        this.avgSpO2 = d94;
        this.maxSpO2 = d95;
        this.minSpO2 = d96;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final double getAverageVerticalSpeed() {
        return this.averageVerticalSpeed;
    }

    /* JADX INFO: renamed from: A0, reason: from getter */
    public final double getMaxLapAvgRunCadence() {
        return this.maxLapAvgRunCadence;
    }

    /* JADX INFO: renamed from: A1, reason: from getter */
    public final double getStrokes() {
        return this.strokes;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Double getAvgJumpRopeCadence() {
        return this.avgJumpRopeCadence;
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final Double getMaxPackWeight() {
        return this.maxPackWeight;
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final double getSurfingMaxSpeed() {
        return this.surfingMaxSpeed;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Double getAvgPackWeight() {
        return this.avgPackWeight;
    }

    /* JADX INFO: renamed from: D1, reason: from getter */
    public final Integer getTotalReps() {
        return this.totalReps;
    }

    /* JADX INFO: renamed from: E0, reason: from getter */
    public final double getMaxRunCadence() {
        return this.maxRunCadence;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Double getAvgSpO2() {
        return this.avgSpO2;
    }

    /* JADX INFO: renamed from: F1, reason: from getter */
    public final int getTotalSets() {
        return this.totalSets;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final double getAvgStress() {
        return this.avgStress;
    }

    /* JADX INFO: renamed from: G1, reason: from getter */
    public final Double getTotalSurfaceInterval() {
        return this.totalSurfaceInterval;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Integer getBodyBatteryNetImpact() {
        return this.bodyBatteryNetImpact;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final Double getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: I1, reason: from getter */
    public final int getTypeScore() {
        return this.typeScore;
    }

    /* JADX INFO: renamed from: J0, reason: from getter */
    public final Double getMaxSpO2() {
        return this.maxSpO2;
    }

    /* JADX INFO: renamed from: J1, reason: from getter */
    public final int getUnitId() {
        return this.unitId;
    }

    /* JADX INFO: renamed from: L0, reason: from getter */
    public final double getMaxSpeed() {
        return this.maxSpeed;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getClimbMode() {
        return this.climbMode;
    }

    /* JADX INFO: renamed from: M0, reason: from getter */
    public final Double getMaxSplitSpeed() {
        return this.maxSplitSpeed;
    }

    /* JADX INFO: renamed from: M1, reason: from getter */
    public final String getUnitKey() {
        return this.unitKey;
    }

    /* JADX INFO: renamed from: P0, reason: from getter */
    public final double getMaxStress() {
        return this.maxStress;
    }

    /* JADX INFO: renamed from: Q0, reason: from getter */
    public final Double getMinSpO2() {
        return this.minSpO2;
    }

    /* JADX INFO: renamed from: R0, reason: from getter */
    public final String getOwnerDisplayName() {
        return this.ownerDisplayName;
    }

    /* JADX INFO: renamed from: S0, reason: from getter */
    public final long getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final Double getWorkoutTime() {
        return this.workoutTime;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final String getActivityTypeKey() {
        return this.activityTypeKey;
    }

    public final boolean U1() {
        Double d14 = this.workoutTime;
        return d14 != null && d14.doubleValue() > 0.0d && this.activeSets > 0;
    }

    /* JADX INFO: renamed from: V0, reason: from getter */
    public final Double getPackWeight() {
        return this.packWeight;
    }

    /* JADX INFO: renamed from: V1, reason: from getter */
    public final boolean getIsDecoDive() {
        return this.isDecoDive;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final int getClimbRoutes() {
        return this.climbRoutes;
    }

    /* JADX INFO: renamed from: Z0, reason: from getter */
    public final Double getPackWeightCalories() {
        return this.packWeightCalories;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getActiveSets() {
        return this.activeSets;
    }

    /* JADX INFO: renamed from: b1, reason: from getter */
    public final Double getPoolLength() {
        return this.poolLength;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final Integer getDiveCount() {
        return this.diveCount;
    }

    /* JADX INFO: renamed from: c1, reason: from getter */
    public final Double getRestSplitTime() {
        return this.restSplitTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getActiveSplitIdleTime() {
        return this.activeSplitIdleTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final ns.v getDivingGas() {
        return this.divingGas;
    }

    /* JADX INFO: renamed from: e1, reason: from getter */
    public final String getScoreType() {
        return this.scoreType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.activityId == qVar.activityId && p005kotlin.jvm.internal.s.g(this.activityName, qVar.activityName) && this.activityTypeId == qVar.activityTypeId && p005kotlin.jvm.internal.s.g(this.activityTypeKey, qVar.activityTypeKey) && p005kotlin.jvm.internal.s.g(this.ownerDisplayName, qVar.ownerDisplayName) && p005kotlin.jvm.internal.s.g(this.startTimeLocal, qVar.startTimeLocal) && this.unitId == qVar.unitId && p005kotlin.jvm.internal.s.g(this.poolLength, qVar.poolLength) && p005kotlin.jvm.internal.s.g(this.unitKey, qVar.unitKey) && Double.compare(this.factor, qVar.factor) == 0 && Double.compare(this.duration, qVar.duration) == 0 && Double.compare(this.averageSpeed, qVar.averageSpeed) == 0 && Double.compare(this.ascent, qVar.ascent) == 0 && Double.compare(this.elevationGain, qVar.elevationGain) == 0 && Double.compare(this.elevationLoss, qVar.elevationLoss) == 0 && Double.compare(this.averageHR, qVar.averageHR) == 0 && Double.compare(this.averagePower, qVar.averagePower) == 0 && p005kotlin.jvm.internal.s.g(this.calories, qVar.calories) && p005kotlin.jvm.internal.s.g(this.packWeightCalories, qVar.packWeightCalories) && Double.compare(this.strokes, qVar.strokes) == 0 && p005kotlin.jvm.internal.s.g(this.workoutId, qVar.workoutId) && p005kotlin.jvm.internal.s.g(this.workoutTime, qVar.workoutTime) && Double.compare(this.maxDepth, qVar.maxDepth) == 0 && p005kotlin.jvm.internal.s.g(this.divingGas, qVar.divingGas) && p005kotlin.jvm.internal.s.g(this.divingWaterType, qVar.divingWaterType) && p005kotlin.jvm.internal.s.g(this.divingWaterDensity, qVar.divingWaterDensity) && p005kotlin.jvm.internal.s.g(this.totalSurfaceInterval, qVar.totalSurfaceInterval) && Double.compare(this.activityBottomTime, qVar.activityBottomTime) == 0 && p005kotlin.jvm.internal.s.g(this.maxBottomTime, qVar.maxBottomTime) && p005kotlin.jvm.internal.s.g(this.longestDiveDuration, qVar.longestDiveDuration) && this.isDecoDive == qVar.isDecoDive && Double.compare(this.maxHR, qVar.maxHR) == 0 && this.lapCount == qVar.lapCount && this.bestLapTime == qVar.bestLapTime && Double.compare(this.distance, qVar.distance) == 0 && Double.compare(this.maxSpeed, qVar.maxSpeed) == 0 && this.floorsClimbed == qVar.floorsClimbed && Double.compare(this.averageVerticalSpeed, qVar.averageVerticalSpeed) == 0 && Double.compare(this.averageRespirationRate, qVar.averageRespirationRate) == 0 && this.activeSets == qVar.activeSets && this.totalSets == qVar.totalSets && this.climbRoutes == qVar.climbRoutes && Double.compare(this.activeSplitTime, qVar.activeSplitTime) == 0 && p005kotlin.jvm.internal.s.g(this.maxDiffKey, qVar.maxDiffKey) && Double.compare(this.averageBikingCadenceInRevPerMinute, qVar.averageBikingCadenceInRevPerMinute) == 0 && this.waveCount == qVar.waveCount && Double.compare(this.longestWaveDistance, qVar.longestWaveDistance) == 0 && Double.compare(this.surfingMaxSpeed, qVar.surfingMaxSpeed) == 0 && p005kotlin.jvm.internal.s.g(this.scoreType, qVar.scoreType) && this.golfScore == qVar.golfScore && this.typeScore == qVar.typeScore && this.nrOfHoles == qVar.nrOfHoles && p005kotlin.jvm.internal.s.g(this.leaderboardPosition, qVar.leaderboardPosition) && Double.compare(this.avgStress, qVar.avgStress) == 0 && Double.compare(this.maxStress, qVar.maxStress) == 0 && Double.compare(this.stressChange, qVar.stressChange) == 0 && p005kotlin.jvm.internal.s.g(this.bodyBatteryNetImpact, qVar.bodyBatteryNetImpact) && p005kotlin.jvm.internal.s.g(this.climbMode, qVar.climbMode) && p005kotlin.jvm.internal.s.g(this.locationName, qVar.locationName) && Double.compare(this.startLatitude, qVar.startLatitude) == 0 && Double.compare(this.startLongitude, qVar.startLongitude) == 0 && p005kotlin.jvm.internal.s.g(this.polylinePoints, qVar.polylinePoints) && p005kotlin.jvm.internal.s.g(this.splits, qVar.splits) && this.ownerId == qVar.ownerId && p005kotlin.jvm.internal.s.g(this.numberOfActiveLengths, qVar.numberOfActiveLengths) && p005kotlin.jvm.internal.s.g(this.calendarEventUuid, qVar.calendarEventUuid) && this.calendarEventId == qVar.calendarEventId && p005kotlin.jvm.internal.s.g(this.steps, qVar.steps) && Double.compare(this.maxLapAvgRunCadence, qVar.maxLapAvgRunCadence) == 0 && Double.compare(this.averageRunCadence, qVar.averageRunCadence) == 0 && Double.compare(this.maxRunCadence, qVar.maxRunCadence) == 0 && p005kotlin.jvm.internal.s.g(this.activeSplitMovingTime, qVar.activeSplitMovingTime) && p005kotlin.jvm.internal.s.g(this.activeSplitIdleTime, qVar.activeSplitIdleTime) && p005kotlin.jvm.internal.s.g(this.restSplitTime, qVar.restSplitTime) && p005kotlin.jvm.internal.s.g(this.splitSummary, qVar.splitSummary) && p005kotlin.jvm.internal.s.g(this.totalReps, qVar.totalReps) && p005kotlin.jvm.internal.s.g(this.avgJumpRopeCadence, qVar.avgJumpRopeCadence) && p005kotlin.jvm.internal.s.g(this.maxJumpRopeCadence, qVar.maxJumpRopeCadence) && p005kotlin.jvm.internal.s.g(this.maxSplitSpeed, qVar.maxSplitSpeed) && this.noOfSplits == qVar.noOfSplits && p005kotlin.jvm.internal.s.g(this.activeSplitSummaryDistance, qVar.activeSplitSummaryDistance) && p005kotlin.jvm.internal.s.g(this.activeSplitSummaryElevationLoss, qVar.activeSplitSummaryElevationLoss) && p005kotlin.jvm.internal.s.g(this.longestPoolApneaInterval, qVar.longestPoolApneaInterval) && p005kotlin.jvm.internal.s.g(this.diveCount, qVar.diveCount) && p005kotlin.jvm.internal.s.g(this.packWeight, qVar.packWeight) && p005kotlin.jvm.internal.s.g(this.maxPackWeight, qVar.maxPackWeight) && p005kotlin.jvm.internal.s.g(this.avgPackWeight, qVar.avgPackWeight) && p005kotlin.jvm.internal.s.g(this.deviceDisplayUnits, qVar.deviceDisplayUnits) && p005kotlin.jvm.internal.s.g(this.speedDeviceDisplayMeasure, qVar.speedDeviceDisplayMeasure) && p005kotlin.jvm.internal.s.g(this.avgSpO2, qVar.avgSpO2) && p005kotlin.jvm.internal.s.g(this.maxSpO2, qVar.maxSpO2) && p005kotlin.jvm.internal.s.g(this.minSpO2, qVar.minSpO2);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getActiveSplitMovingTime() {
        return this.activeSplitMovingTime;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final double getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getActiveSplitSummaryDistance() {
        return this.activeSplitSummaryDistance;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final double getElevationGain() {
        return this.elevationGain;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getActiveSplitSummaryElevationLoss() {
        return this.activeSplitSummaryElevationLoss;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final double getElevationLoss() {
        return this.elevationLoss;
    }

    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getSpeedDeviceDisplayMeasure() {
        return this.speedDeviceDisplayMeasure;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.activityId) * 31;
        String str = this.activityName;
        int iJ = wr.g.j(q2.d(this.activityTypeId, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.activityTypeKey);
        String str2 = this.ownerDisplayName;
        int iHashCode2 = (iJ + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startTimeLocal;
        int iD = q2.d(this.unitId, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Double d14 = this.poolLength;
        int iHashCode3 = (iD + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str4 = this.unitKey;
        int iB = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.factor), 31, this.duration), 31, this.averageSpeed), 31, this.ascent), 31, this.elevationGain), 31, this.elevationLoss), 31, this.averageHR), 31, this.averagePower);
        Double d15 = this.calories;
        int iHashCode4 = (iB + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.packWeightCalories;
        int iB2 = org.apache.commons.lang3.e.b((iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31, 31, this.strokes);
        Long l14 = this.workoutId;
        int iHashCode5 = (iB2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Double d17 = this.workoutTime;
        int iB3 = org.apache.commons.lang3.e.b((iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31, 31, this.maxDepth);
        ns.v vVar = this.divingGas;
        int iHashCode6 = (iB3 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        Integer num = this.divingWaterType;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Double d18 = this.divingWaterDensity;
        int iHashCode8 = (iHashCode7 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.totalSurfaceInterval;
        int iB4 = org.apache.commons.lang3.e.b((iHashCode8 + (d19 == null ? 0 : d19.hashCode())) * 31, 31, this.activityBottomTime);
        Double d24 = this.maxBottomTime;
        int iHashCode9 = (iB4 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.longestDiveDuration;
        int iB5 = org.apache.commons.lang3.e.b(q2.d(this.climbRoutes, q2.d(this.totalSets, q2.d(this.activeSets, org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(q2.d(this.floorsClimbed, org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(q6.f.e(q2.d(this.lapCount, org.apache.commons.lang3.e.b(q6.f.g((iHashCode9 + (d25 == null ? 0 : d25.hashCode())) * 31, 31, this.isDecoDive), 31, this.maxHR), 31), 31, this.bestLapTime), 31, this.distance), 31, this.maxSpeed), 31), 31, this.averageVerticalSpeed), 31, this.averageRespirationRate), 31), 31), 31), 31, this.activeSplitTime);
        String str5 = this.maxDiffKey;
        int iB6 = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(wr.g.j(q2.d(this.nrOfHoles, q2.d(this.typeScore, q2.d(this.golfScore, wr.g.j(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(q2.d(this.waveCount, org.apache.commons.lang3.e.b((iB5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.averageBikingCadenceInRevPerMinute), 31), 31, this.longestWaveDistance), 31, this.surfingMaxSpeed), 31, this.scoreType), 31), 31), 31), 31, this.leaderboardPosition), 31, this.avgStress), 31, this.maxStress), 31, this.stressChange);
        Integer num2 = this.bodyBatteryNetImpact;
        int iHashCode10 = (iB6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.climbMode;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.locationName;
        int iB7 = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.startLatitude), 31, this.startLongitude);
        List<LatLng> list = this.polylinePoints;
        int iHashCode12 = (iB7 + (list == null ? 0 : list.hashCode())) * 31;
        List<x1> list2 = this.splits;
        int iE = q6.f.e((iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.ownerId);
        Double d26 = this.numberOfActiveLengths;
        int iHashCode13 = (iE + (d26 == null ? 0 : d26.hashCode())) * 31;
        String str8 = this.calendarEventUuid;
        int iE2 = q6.f.e((iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.calendarEventId);
        Integer num3 = this.steps;
        int iB8 = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iE2 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.maxLapAvgRunCadence), 31, this.averageRunCadence), 31, this.maxRunCadence);
        Double d27 = this.activeSplitMovingTime;
        int iHashCode14 = (iB8 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.activeSplitIdleTime;
        int iHashCode15 = (iHashCode14 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.restSplitTime;
        int iHashCode16 = (iHashCode15 + (d29 == null ? 0 : d29.hashCode())) * 31;
        o1 o1Var = this.splitSummary;
        int iHashCode17 = (iHashCode16 + (o1Var == null ? 0 : o1Var.hashCode())) * 31;
        Integer num4 = this.totalReps;
        int iHashCode18 = (iHashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d34 = this.avgJumpRopeCadence;
        int iHashCode19 = (iHashCode18 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.maxJumpRopeCadence;
        int iHashCode20 = (iHashCode19 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Double d36 = this.maxSplitSpeed;
        int iD2 = q2.d(this.noOfSplits, (iHashCode20 + (d36 == null ? 0 : d36.hashCode())) * 31, 31);
        Double d37 = this.activeSplitSummaryDistance;
        int iHashCode21 = (iD2 + (d37 == null ? 0 : d37.hashCode())) * 31;
        Double d38 = this.activeSplitSummaryElevationLoss;
        int iHashCode22 = (iHashCode21 + (d38 == null ? 0 : d38.hashCode())) * 31;
        Double d39 = this.longestPoolApneaInterval;
        int iHashCode23 = (iHashCode22 + (d39 == null ? 0 : d39.hashCode())) * 31;
        Integer num5 = this.diveCount;
        int iHashCode24 = (iHashCode23 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Double d44 = this.packWeight;
        int iHashCode25 = (iHashCode24 + (d44 == null ? 0 : d44.hashCode())) * 31;
        Double d45 = this.maxPackWeight;
        int iHashCode26 = (iHashCode25 + (d45 == null ? 0 : d45.hashCode())) * 31;
        Double d46 = this.avgPackWeight;
        int iHashCode27 = (iHashCode26 + (d46 == null ? 0 : d46.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.activities.newmodel.p pVar = this.deviceDisplayUnits;
        int iHashCode28 = (iHashCode27 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str9 = this.speedDeviceDisplayMeasure;
        int iHashCode29 = (iHashCode28 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Double d47 = this.avgSpO2;
        int iHashCode30 = (iHashCode29 + (d47 == null ? 0 : d47.hashCode())) * 31;
        Double d48 = this.maxSpO2;
        int iHashCode31 = (iHashCode30 + (d48 == null ? 0 : d48.hashCode())) * 31;
        Double d49 = this.minSpO2;
        return iHashCode31 + (d49 != null ? d49.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final double getActiveSplitTime() {
        return this.activeSplitTime;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final double getFactor() {
        return this.factor;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final double getActivityBottomTime() {
        return this.activityBottomTime;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final int getFloorsClimbed() {
        return this.floorsClimbed;
    }

    /* JADX INFO: renamed from: j1, reason: from getter */
    public final o1 getSplitSummary() {
        return this.splitSummary;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final int getLapCount() {
        return this.lapCount;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final String getLocationName() {
        return this.locationName;
    }

    public final am.x0 o() {
        return am.z0.l(am.x0.f4346x, this.activityTypeKey);
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final Double getLongestDiveDuration() {
        return this.longestDiveDuration;
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final Double getLongestPoolApneaInterval() {
        return this.longestPoolApneaInterval;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getActivityTypeId() {
        return this.activityTypeId;
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final double getMaxDepth() {
        return this.maxDepth;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final double getAverageBikingCadenceInRevPerMinute() {
        return this.averageBikingCadenceInRevPerMinute;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final double getAverageHR() {
        return this.averageHR;
    }

    /* JADX INFO: renamed from: s1, reason: from getter */
    public final double getStartLatitude() {
        return this.startLatitude;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final double getAveragePower() {
        return this.averagePower;
    }

    /* JADX INFO: renamed from: t1, reason: from getter */
    public final double getStartLongitude() {
        return this.startLongitude;
    }

    public final String toString() {
        long j8 = this.activityId;
        String str = this.activityName;
        int i14 = this.activityTypeId;
        String str2 = this.activityTypeKey;
        String str3 = this.ownerDisplayName;
        String str4 = this.startTimeLocal;
        int i15 = this.unitId;
        Double d14 = this.poolLength;
        String str5 = this.unitKey;
        double d15 = this.factor;
        double d16 = this.duration;
        double d17 = this.averageSpeed;
        double d18 = this.ascent;
        double d19 = this.elevationGain;
        double d24 = this.elevationLoss;
        double d25 = this.averageHR;
        double d26 = this.averagePower;
        Double d27 = this.calories;
        Double d28 = this.packWeightCalories;
        double d29 = this.strokes;
        Long l14 = this.workoutId;
        Double d34 = this.workoutTime;
        double d35 = this.maxDepth;
        ns.v vVar = this.divingGas;
        Integer num = this.divingWaterType;
        Double d36 = this.divingWaterDensity;
        Double d37 = this.totalSurfaceInterval;
        double d38 = this.activityBottomTime;
        Double d39 = this.maxBottomTime;
        Double d44 = this.longestDiveDuration;
        boolean z14 = this.isDecoDive;
        double d45 = this.maxHR;
        int i16 = this.lapCount;
        long j14 = this.bestLapTime;
        double d46 = this.distance;
        double d47 = this.maxSpeed;
        int i17 = this.floorsClimbed;
        double d48 = this.averageVerticalSpeed;
        double d49 = this.averageRespirationRate;
        int i18 = this.activeSets;
        int i19 = this.totalSets;
        int i24 = this.climbRoutes;
        double d54 = this.activeSplitTime;
        String str6 = this.maxDiffKey;
        double d55 = this.averageBikingCadenceInRevPerMinute;
        int i25 = this.waveCount;
        double d56 = this.longestWaveDistance;
        double d57 = this.surfingMaxSpeed;
        String str7 = this.scoreType;
        int i26 = this.golfScore;
        int i27 = this.typeScore;
        int i28 = this.nrOfHoles;
        String str8 = this.leaderboardPosition;
        double d58 = this.avgStress;
        double d59 = this.maxStress;
        double d64 = this.stressChange;
        Integer num2 = this.bodyBatteryNetImpact;
        String str9 = this.climbMode;
        String str10 = this.locationName;
        double d65 = this.startLatitude;
        double d66 = this.startLongitude;
        List<LatLng> list = this.polylinePoints;
        List<x1> list2 = this.splits;
        long j15 = this.ownerId;
        Double d67 = this.numberOfActiveLengths;
        String str11 = this.calendarEventUuid;
        long j16 = this.calendarEventId;
        Integer num3 = this.steps;
        double d68 = this.maxLapAvgRunCadence;
        double d69 = this.averageRunCadence;
        double d74 = this.maxRunCadence;
        Double d75 = this.activeSplitMovingTime;
        Double d76 = this.activeSplitIdleTime;
        Double d77 = this.restSplitTime;
        o1 o1Var = this.splitSummary;
        Integer num4 = this.totalReps;
        Double d78 = this.avgJumpRopeCadence;
        Double d79 = this.maxJumpRopeCadence;
        Double d84 = this.maxSplitSpeed;
        int i29 = this.noOfSplits;
        Double d85 = this.activeSplitSummaryDistance;
        Double d86 = this.activeSplitSummaryElevationLoss;
        Double d87 = this.longestPoolApneaInterval;
        Integer num5 = this.diveCount;
        Double d88 = this.packWeight;
        Double d89 = this.maxPackWeight;
        Double d93 = this.avgPackWeight;
        com.garmin.android.apps.connectmobile.activities.newmodel.p pVar = this.deviceDisplayUnits;
        String str12 = this.speedDeviceDisplayMeasure;
        Double d94 = this.avgSpO2;
        Double d95 = this.maxSpO2;
        Double d96 = this.minSpO2;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "ActivityStatsBrief(activityId=", ", activityName=", str);
        sbK.append(", activityTypeId=");
        sbK.append(i14);
        sbK.append(", activityTypeKey=");
        sbK.append(str2);
        sn.a.t(sbK, ", ownerDisplayName=", str3, ", startTimeLocal=", str4);
        sbK.append(", unitId=");
        sbK.append(i15);
        sbK.append(", poolLength=");
        sbK.append(d14);
        am.j.y(sbK, ", unitKey=", str5, ", factor=");
        sbK.append(d15);
        am.j.x(sbK, ", duration=", d16, ", averageSpeed=");
        sbK.append(d17);
        am.j.x(sbK, ", ascent=", d18, ", elevationGain=");
        sbK.append(d19);
        am.j.x(sbK, ", elevationLoss=", d24, ", averageHR=");
        sbK.append(d25);
        am.j.x(sbK, ", averagePower=", d26, ", calories=");
        b71.i.p(d27, d28, ", packWeightCalories=", ", strokes=", sbK);
        sbK.append(d29);
        sbK.append(", workoutId=");
        sbK.append(l14);
        sbK.append(", workoutTime=");
        sbK.append(d34);
        sbK.append(", maxDepth=");
        sbK.append(d35);
        sbK.append(", divingGas=");
        sbK.append(vVar);
        sbK.append(", divingWaterType=");
        sbK.append(num);
        sbK.append(", divingWaterDensity=");
        sbK.append(d36);
        sbK.append(", totalSurfaceInterval=");
        sbK.append(d37);
        sbK.append(", activityBottomTime=");
        sbK.append(d38);
        sbK.append(", maxBottomTime=");
        sbK.append(d39);
        sbK.append(", longestDiveDuration=");
        sbK.append(d44);
        sbK.append(", isDecoDive=");
        sbK.append(z14);
        am.j.x(sbK, ", maxHR=", d45, ", lapCount=");
        sbK.append(i16);
        sbK.append(", bestLapTime=");
        sbK.append(j14);
        am.j.x(sbK, ", distance=", d46, ", maxSpeed=");
        sbK.append(d47);
        sbK.append(", floorsClimbed=");
        sbK.append(i17);
        am.j.x(sbK, ", averageVerticalSpeed=", d48, ", averageRespirationRate=");
        sbK.append(d49);
        sbK.append(", activeSets=");
        sbK.append(i18);
        androidx.core.view.j.m(i19, i24, ", totalSets=", ", climbRoutes=", sbK);
        am.j.x(sbK, ", activeSplitTime=", d54, ", maxDiffKey=");
        sbK.append(str6);
        sbK.append(", averageBikingCadenceInRevPerMinute=");
        sbK.append(d55);
        sbK.append(", waveCount=");
        sbK.append(i25);
        sbK.append(", longestWaveDistance=");
        sbK.append(d56);
        am.j.x(sbK, ", surfingMaxSpeed=", d57, ", scoreType=");
        q6.f.q(i26, str7, ", golfScore=", ", typeScore=", sbK);
        ds.e0.m(i27, i28, ", nrOfHoles=", ", leaderboardPosition=", sbK);
        sbK.append(str8);
        sbK.append(", avgStress=");
        sbK.append(d58);
        am.j.x(sbK, ", maxStress=", d59, ", stressChange=");
        sbK.append(d64);
        sbK.append(", bodyBatteryNetImpact=");
        sbK.append(num2);
        sn.a.t(sbK, ", climbMode=", str9, ", locationName=", str10);
        am.j.x(sbK, ", startLatitude=", d65, ", startLongitude=");
        sbK.append(d66);
        sbK.append(", polylinePoints=");
        sbK.append(list);
        sbK.append(", splits=");
        sbK.append(list2);
        sbK.append(", ownerId=");
        sbK.append(j15);
        sbK.append(", numberOfActiveLengths=");
        sbK.append(d67);
        am.j.y(sbK, ", calendarEventUuid=", str11, ", calendarEventId=");
        sbK.append(j16);
        sbK.append(", steps=");
        sbK.append(num3);
        am.j.x(sbK, ", maxLapAvgRunCadence=", d68, ", averageRunCadence=");
        sbK.append(d69);
        am.j.x(sbK, ", maxRunCadence=", d74, ", activeSplitMovingTime=");
        b71.i.p(d75, d76, ", activeSplitIdleTime=", ", restSplitTime=", sbK);
        sbK.append(d77);
        sbK.append(", splitSummary=");
        sbK.append(o1Var);
        sbK.append(", totalReps=");
        b71.i.v(sbK, num4, ", avgJumpRopeCadence=", d78, ", maxJumpRopeCadence=");
        b71.i.p(d79, d84, ", maxSplitSpeed=", ", noOfSplits=", sbK);
        sbK.append(i29);
        sbK.append(", activeSplitSummaryDistance=");
        sbK.append(d85);
        sbK.append(", activeSplitSummaryElevationLoss=");
        b71.i.p(d86, d87, ", longestPoolApneaInterval=", ", diveCount=", sbK);
        b71.i.v(sbK, num5, ", packWeight=", d88, ", maxPackWeight=");
        b71.i.p(d89, d93, ", avgPackWeight=", ", deviceDisplayUnits=", sbK);
        sbK.append(pVar);
        sbK.append(", speedDeviceDisplayMeasure=");
        sbK.append(str12);
        sbK.append(", avgSpO2=");
        b71.i.p(d94, d95, ", maxSpO2=", ", minSpO2=", sbK);
        return b71.i.g(sbK, d96, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final double getAverageRespirationRate() {
        return this.averageRespirationRate;
    }

    /* JADX INFO: renamed from: v1, reason: from getter */
    public final String getStartTimeLocal() {
        return this.startTimeLocal;
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final String getMaxDiffKey() {
        return this.maxDiffKey;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.activityId);
        parcel.writeString(this.activityName);
        parcel.writeInt(this.activityTypeId);
        parcel.writeString(this.activityTypeKey);
        parcel.writeString(this.ownerDisplayName);
        parcel.writeString(this.startTimeLocal);
        parcel.writeInt(this.unitId);
        Double d14 = this.poolLength;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeString(this.unitKey);
        parcel.writeDouble(this.factor);
        parcel.writeDouble(this.duration);
        parcel.writeDouble(this.averageSpeed);
        parcel.writeDouble(this.ascent);
        parcel.writeDouble(this.elevationGain);
        parcel.writeDouble(this.elevationLoss);
        parcel.writeDouble(this.averageHR);
        parcel.writeDouble(this.averagePower);
        Double d15 = this.calories;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.packWeightCalories;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        parcel.writeDouble(this.strokes);
        Long l14 = this.workoutId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Double d17 = this.workoutTime;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        parcel.writeDouble(this.maxDepth);
        ns.v vVar = this.divingGas;
        if (vVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vVar.writeToParcel(parcel, i14);
        }
        Integer num = this.divingWaterType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d18 = this.divingWaterDensity;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.totalSurfaceInterval;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        parcel.writeDouble(this.activityBottomTime);
        Double d24 = this.maxBottomTime;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        Double d25 = this.longestDiveDuration;
        if (d25 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d25);
        }
        parcel.writeInt(this.isDecoDive ? 1 : 0);
        parcel.writeDouble(this.maxHR);
        parcel.writeInt(this.lapCount);
        parcel.writeLong(this.bestLapTime);
        parcel.writeDouble(this.distance);
        parcel.writeDouble(this.maxSpeed);
        parcel.writeInt(this.floorsClimbed);
        parcel.writeDouble(this.averageVerticalSpeed);
        parcel.writeDouble(this.averageRespirationRate);
        parcel.writeInt(this.activeSets);
        parcel.writeInt(this.totalSets);
        parcel.writeInt(this.climbRoutes);
        parcel.writeDouble(this.activeSplitTime);
        parcel.writeString(this.maxDiffKey);
        parcel.writeDouble(this.averageBikingCadenceInRevPerMinute);
        parcel.writeInt(this.waveCount);
        parcel.writeDouble(this.longestWaveDistance);
        parcel.writeDouble(this.surfingMaxSpeed);
        parcel.writeString(this.scoreType);
        parcel.writeInt(this.golfScore);
        parcel.writeInt(this.typeScore);
        parcel.writeInt(this.nrOfHoles);
        parcel.writeString(this.leaderboardPosition);
        parcel.writeDouble(this.avgStress);
        parcel.writeDouble(this.maxStress);
        parcel.writeDouble(this.stressChange);
        Integer num2 = this.bodyBatteryNetImpact;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeString(this.climbMode);
        parcel.writeString(this.locationName);
        parcel.writeDouble(this.startLatitude);
        parcel.writeDouble(this.startLongitude);
        List<LatLng> list = this.polylinePoints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = lc.u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        List<x1> list2 = this.splits;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = lc.u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((x1) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeLong(this.ownerId);
        Double d26 = this.numberOfActiveLengths;
        if (d26 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d26);
        }
        parcel.writeString(this.calendarEventUuid);
        parcel.writeLong(this.calendarEventId);
        Integer num3 = this.steps;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        parcel.writeDouble(this.maxLapAvgRunCadence);
        parcel.writeDouble(this.averageRunCadence);
        parcel.writeDouble(this.maxRunCadence);
        Double d27 = this.activeSplitMovingTime;
        if (d27 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d27);
        }
        Double d28 = this.activeSplitIdleTime;
        if (d28 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d28);
        }
        Double d29 = this.restSplitTime;
        if (d29 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d29);
        }
        o1 o1Var = this.splitSummary;
        if (o1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            o1Var.writeToParcel(parcel, i14);
        }
        Integer num4 = this.totalReps;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Double d34 = this.avgJumpRopeCadence;
        if (d34 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d34);
        }
        Double d35 = this.maxJumpRopeCadence;
        if (d35 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d35);
        }
        Double d36 = this.maxSplitSpeed;
        if (d36 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d36);
        }
        parcel.writeInt(this.noOfSplits);
        Double d37 = this.activeSplitSummaryDistance;
        if (d37 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d37);
        }
        Double d38 = this.activeSplitSummaryElevationLoss;
        if (d38 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d38);
        }
        Double d39 = this.longestPoolApneaInterval;
        if (d39 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d39);
        }
        Integer num5 = this.diveCount;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        Double d44 = this.packWeight;
        if (d44 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d44);
        }
        Double d45 = this.maxPackWeight;
        if (d45 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d45);
        }
        Double d46 = this.avgPackWeight;
        if (d46 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d46);
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.p pVar = this.deviceDisplayUnits;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.speedDeviceDisplayMeasure);
        Double d47 = this.avgSpO2;
        if (d47 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d47);
        }
        Double d48 = this.maxSpO2;
        if (d48 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d48);
        }
        Double d49 = this.minSpO2;
        if (d49 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d49);
        }
    }

    /* JADX INFO: renamed from: x0, reason: from getter */
    public final double getMaxHR() {
        return this.maxHR;
    }

    /* JADX INFO: renamed from: x1, reason: from getter */
    public final Integer getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final double getAverageRunCadence() {
        return this.averageRunCadence;
    }

    /* JADX INFO: renamed from: y1, reason: from getter */
    public final double getStressChange() {
        return this.stressChange;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final double getAverageSpeed() {
        return this.averageSpeed;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final Double getMaxJumpRopeCadence() {
        return this.maxJumpRopeCadence;
    }

    public /* synthetic */ q(long j8, String str, int i14, String str2, String str3, String str4, int i15, Double d14, String str5, double d15, double d16, double d17, double d18, double d19, double d24, double d25, double d26, Double d27, Double d28, double d29, Long l14, Double d34, double d35, ns.v vVar, Integer num, Double d36, Double d37, double d38, Double d39, Double d44, boolean z14, double d45, int i16, long j14, double d46, double d47, int i17, double d48, double d49, int i18, int i19, int i24, double d54, String str6, double d55, int i25, double d56, double d57, String str7, int i26, int i27, int i28, String str8, double d58, double d59, double d64, Integer num2, String str9, String str10, double d65, double d66, List list, List list2, long j15, Double d67, String str11, long j16, Integer num3, double d68, double d69, double d74, Double d75, Double d76, Double d77, o1 o1Var, Integer num4, Double d78, Double d79, Double d84, int i29, Double d85, Double d86, Double d87, Integer num5, Double d88, Double d89, Double d93, com.garmin.android.apps.connectmobile.activities.newmodel.p pVar, String str12, Double d94, Double d95, Double d96, int i30, int i34, int i35, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, i14, str2, str3, str4, i15, d14, str5, d15, d16, d17, d18, d19, d24, d25, d26, d27, (i30 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : d28, d29, l14, d34, d35, vVar, num, d36, d37, d38, d39, d44, z14, d45, i16, j14, d46, d47, i17, d48, d49, i18, i19, i24, d54, str6, d55, i25, d56, d57, str7, i26, i27, i28, str8, d58, d59, d64, (i34 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : num2, str9, str10, d65, d66, (i34 & 536870912) != 0 ? null : list, (i34 & 1073741824) != 0 ? null : list2, (i34 & Integer.MIN_VALUE) != 0 ? 0L : j15, (i35 & 1) != 0 ? null : d67, (i35 & 2) != 0 ? null : str11, (i35 & 4) != 0 ? -1L : j16, num3, d68, d69, d74, (i35 & 128) != 0 ? null : d75, (i35 & 256) != 0 ? null : d76, (i35 & 512) != 0 ? null : d77, (i35 & 1024) != 0 ? null : o1Var, num4, d78, d79, d84, i29, d85, d86, d87, num5, d88, d89, d93, pVar, str12, d94, d95, d96);
    }
}
