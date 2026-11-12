package okhttp3.internal;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.net.HttpHeaders;
import com.mapbox.maps.MapboxMap;
import d53.k;
import e23.a;
import e23.l;
import j23.t;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import o2.c;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import org.apache.commons.lang3.time.TimeZones;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p005kotlin.jvm.internal.y0;
import p13.j0;
import p13.k0;
import p13.p0;
import p13.x;
import p13.y;
import tr2.b;
import v.e0;
import w63.e;
import w63.f;
import w63.f0;
import w63.g;
import w63.g0;
import w63.h;
import w63.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Â\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0007*\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001c\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010\"\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#\u001a%\u0010$\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b$\u0010#\u001a%\u0010%\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&\u001a-\u0010(\u001a\u00020\u001b*\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)\u001a-\u0010(\u001a\u00020\u001b*\u00020\u00072\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b(\u0010,\u001a\u0011\u0010-\u001a\u00020\u001b*\u00020\u0007¢\u0006\u0004\b-\u0010.\u001a\u0011\u0010/\u001a\u00020\t*\u00020\u0007¢\u0006\u0004\b/\u00100\u001a\u0015\u00101\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b1\u00100\u001a)\u00102\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0012\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u0002030\u000e\"\u000203¢\u0006\u0004\b2\u00105\u001a\u0019\u00109\u001a\u000207*\u0002062\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:\u001a'\u0010>\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00002\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b>\u0010?\u001a\u0011\u0010@\u001a\u00020\u001b*\u00020*¢\u0006\u0004\b@\u0010A\u001a\u0017\u0010E\u001a\u00020D*\b\u0012\u0004\u0012\u00020C0B¢\u0006\u0004\bE\u0010F\u001a\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020C0B*\u00020D¢\u0006\u0004\bG\u0010H\u001a\u0019\u0010I\u001a\u00020\t*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\bI\u0010J\u001a\u0011\u0010M\u001a\u00020L*\u00020K¢\u0006\u0004\bM\u0010N\u001a\u001c\u0010Q\u001a\u00020\u001b*\u00020O2\u0006\u0010P\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bQ\u0010R\u001a\u001c\u0010Q\u001a\u00020\u001b*\u00020S2\u0006\u0010P\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bQ\u0010T\u001a\u001c\u0010Q\u001a\u00020\u0000*\u00020\u001b2\u0006\u0010P\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\bQ\u0010U\u001a\u0019\u0010X\u001a\u00020\u0004*\u00020V2\u0006\u0010W\u001a\u00020\u001b¢\u0006\u0004\bX\u0010Y\u001a\u0011\u0010Z\u001a\u00020\u001b*\u000206¢\u0006\u0004\bZ\u0010[\u001a!\u0010^\u001a\u00020\t*\u00020\\2\u0006\u0010;\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020<¢\u0006\u0004\b^\u0010_\u001a!\u0010a\u001a\u00020\t*\u00020\\2\u0006\u0010`\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020<¢\u0006\u0004\ba\u0010_\u001a\u0011\u0010c\u001a\u00020\u0007*\u00020b¢\u0006\u0004\bc\u0010d\u001a\u0019\u0010f\u001a\u00020\t*\u00020b2\u0006\u0010e\u001a\u000206¢\u0006\u0004\bf\u0010g\u001a!\u0010j\u001a\u00020\u00042\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00040hH\u0086\bø\u0001\u0000¢\u0006\u0004\bj\u0010k\u001a)\u0010l\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00040hH\u0086\bø\u0001\u0000¢\u0006\u0004\bl\u0010m\u001a\u0019\u0010^\u001a\u00020\u001b*\u00020n2\u0006\u0010o\u001a\u00020O¢\u0006\u0004\b^\u0010p\u001a\u001b\u0010q\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\bq\u0010r\u001a\u0011\u0010t\u001a\u00020\u0000*\u00020s¢\u0006\u0004\bt\u0010u\u001a\u0019\u0010w\u001a\u00020\u0000*\u00020\u00072\u0006\u0010v\u001a\u00020\u0000¢\u0006\u0004\bw\u0010x\u001a\u001b\u0010y\u001a\u00020\u001b*\u0004\u0018\u00010\u00072\u0006\u0010v\u001a\u00020\u001b¢\u0006\u0004\by\u0010r\u001a#\u0010{\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\u0004\b\u0000\u0010z*\b\u0012\u0004\u0012\u00028\u00000B¢\u0006\u0004\b{\u0010|\u001a/\u0010~\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\u0004\b\u0000\u0010z2\u0012\u0010}\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000H\u0007¢\u0006\u0004\b~\u0010\u007f\u001a<\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0082\u0001\"\u0005\b\u0000\u0010\u0080\u0001\"\u0005\b\u0001\u0010\u0081\u0001*\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0082\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0015\u0010\u0086\u0001\u001a\u00020\u0004*\u00030\u0085\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0014\u0010\u0086\u0001\u001a\u00020\u0004*\u00020b¢\u0006\u0006\b\u0086\u0001\u0010\u0088\u0001\u001a\u0015\u0010\u0086\u0001\u001a\u00020\u0004*\u00030\u0089\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u008a\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u00020\t*\u00030\u008b\u00012\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0014\u0010\u0090\u0001\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0014\u0010\u0090\u0001\u001a\u00020\u0007*\u00020\u001b¢\u0006\u0006\b\u0090\u0001\u0010\u0092\u0001\u001a\u0017\u0010\u0093\u0001\u001a\u00020\u0004*\u000203H\u0086\b¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0017\u0010\u0095\u0001\u001a\u00020\u0004*\u000203H\u0086\b¢\u0006\u0006\b\u0095\u0001\u0010\u0094\u0001\u001a\u0017\u0010\u0096\u0001\u001a\u00020\u0004*\u000203H\u0086\b¢\u0006\u0006\b\u0096\u0001\u0010\u0094\u0001\u001a:\u0010\u009b\u0001\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010z2\u0007\u0010\u0097\u0001\u001a\u0002032\u000e\u0010\u0099\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0098\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u0007¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a-\u0010 \u0001\u001a\u00020\u0004\"\u0005\b\u0000\u0010\u009d\u0001*\t\u0012\u0004\u0012\u00028\u00000\u009e\u00012\u0007\u0010\u009f\u0001\u001a\u00028\u0000H\u0000¢\u0006\u0006\b \u0001\u0010¡\u0001\u001a\u0017\u0010¢\u0001\u001a\u00020\u0004*\u000203H\u0080\b¢\u0006\u0006\b¢\u0001\u0010\u0094\u0001\u001a\u0017\u0010£\u0001\u001a\u00020\u0004*\u000203H\u0080\b¢\u0006\u0006\b£\u0001\u0010\u0094\u0001\u001a0\u0010¨\u0001\u001a\u00030§\u0001*\b0¤\u0001j\u0003`¥\u00012\u0013\u0010¦\u0001\u001a\u000e\u0012\n\u0012\b0¤\u0001j\u0003`¥\u00010B¢\u0006\u0006\b¨\u0001\u0010©\u0001\u001aC\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\u0004\b\u0000\u0010z*\t\u0012\u0004\u0012\u00028\u00000ª\u00012\u0014\u0010¬\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0«\u0001H\u0086\bø\u0001\u0000¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001\"\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001\"\u0017\u0010²\u0001\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001\"\u0018\u0010µ\u0001\u001a\u00030´\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001\"\u0018\u0010¸\u0001\u001a\u00030·\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001\"\u0018\u0010»\u0001\u001a\u00030º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001\"\u0018\u0010¾\u0001\u001a\u00030½\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001\"\u0018\u0010Á\u0001\u001a\u00030À\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001\"\u0017\u0010Ã\u0001\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001\"\u0017\u0010Å\u0001\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001\"\u0017\u0010Ç\u0001\u001a\u00020\u00078\u0006X\u0086T¢\u0006\b\n\u0006\bÇ\u0001\u0010Æ\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006È\u0001"}, d2 = {"", "arrayLength", MapboxMap.QFE_OFFSET, "count", "", "checkOffsetAndCount", "(JJJ)V", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "", "other", "Ljava/util/Comparator;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/HttpUrl;", "includeDefaultPort", "toHostHeader", "(Lokhttp3/HttpUrl;Z)Ljava/lang/String;", "value", "", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "indexOfFirstNonAsciiWhitespace", "(Ljava/lang/String;II)I", "indexOfLastNonAsciiWhitespace", "trimSubstring", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "delimiterOffset", "(Ljava/lang/String;Ljava/lang/String;II)I", "", TtmlNode.RUBY_DELIMITER, "(Ljava/lang/String;CII)I", "indexOfControlOrNonAscii", "(Ljava/lang/String;)I", "canParseAsIpAddress", "(Ljava/lang/String;)Z", "isSensitiveHeader", "format", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lw63/g;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", "(Lw63/g;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "checkDuration", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "parseHexDigit", "(C)I", "", "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "toHeaders", "(Ljava/util/List;)Lokhttp3/Headers;", "toHeaderList", "(Lokhttp3/Headers;)Ljava/util/List;", "canReuseConnectionFor", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "(Lokhttp3/EventListener;)Lokhttp3/EventListener$Factory;", "", "mask", "and", "(BI)I", "", "(SI)I", "(IJ)J", "Lw63/f;", "medium", "writeMedium", "(Lw63/f;I)V", "readMedium", "(Lw63/g;)I", "Lw63/g0;", "timeUnit", "skipAll", "(Lw63/g0;ILjava/util/concurrent/TimeUnit;)Z", "timeout", "discard", "Ljava/net/Socket;", "peerName", "(Ljava/net/Socket;)Ljava/lang/String;", "source", "isHealthy", "(Ljava/net/Socket;Lw63/g;)Z", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "(Le23/a;)V", "threadName", "(Ljava/lang/String;Le23/a;)V", "Lw63/e;", "b", "(Lw63/e;B)I", "indexOfNonWhitespace", "(Ljava/lang/String;I)I", "Lokhttp3/Response;", "headersContentLength", "(Lokhttp3/Response;)J", "defaultValue", "toLongOrDefault", "(Ljava/lang/String;J)J", "toNonNegativeInt", "T", "toImmutableList", "(Ljava/util/List;)Ljava/util/List;", "elements", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "K", "V", "", "toImmutableMap", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/io/Closeable;", "closeQuietly", "(Ljava/io/Closeable;)V", "(Ljava/net/Socket;)V", "Ljava/net/ServerSocket;", "(Ljava/net/ServerSocket;)V", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "isCivilized", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;)Z", "toHexString", "(J)Ljava/lang/String;", "(I)Ljava/lang/String;", "wait", "(Ljava/lang/Object;)V", "notify", "notifyAll", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "E", "", "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "assertThreadHoldsLock", "assertThreadDoesntHoldLock", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "withSuppressed", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "", "Lkotlin/Function1;", "predicate", "filterList", "(Ljava/lang/Iterable;Le23/l;)Ljava/util/List;", "", "EMPTY_BYTE_ARRAY", "[B", "EMPTY_HEADERS", "Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "Lw63/w;", "UNICODE_BOMS", "Lw63/w;", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "Ld53/k;", "VERIFY_AS_IP_ADDRESS", "Ld53/k;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", "userAgent", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.INSTANCE.of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final w UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final k VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.12.0";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.INSTANCE, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.INSTANCE, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        w.a aVar = w.f183403d;
        h.f183361d.getClass();
        h[] hVarArr = {h.a.b("efbbbf"), h.a.b("feff"), h.a.b("fffe"), h.a.b("0000ffff"), h.a.b("ffff0000")};
        aVar.getClass();
        UNICODE_BOMS = w.a.b(hVarArr);
        TimeZone timeZone = TimeZone.getTimeZone(TimeZones.GMT_ID);
        timeZone.getClass();
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new k("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        okHttpName = d53.w.R(d53.w.O(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    public static final <E> void addIfAbsent(List<E> list, E e4) {
        list.getClass();
        if (list.contains(e4)) {
            return;
        }
        list.add(e4);
    }

    public static final long and(int i14, long j8) {
        return ((long) i14) & j8;
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        eventListener.getClass();
        return new b(eventListener, 21);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventListener asFactory$lambda$8(EventListener eventListener, Call call) {
        eventListener.getClass();
        call.getClass();
        return eventListener;
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        obj.getClass();
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            c.j(Thread.currentThread().getName(), " MUST NOT hold lock on ", obj);
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        obj.getClass();
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        c.j(Thread.currentThread().getName(), " MUST hold lock on ", obj);
    }

    public static final boolean canParseAsIpAddress(String str) {
        str.getClass();
        return VERIFY_AS_IP_ADDRESS.d(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        httpUrl.getClass();
        httpUrl2.getClass();
        return s.g(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && s.g(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final int checkDuration(String str, long j8, TimeUnit timeUnit) {
        str.getClass();
        if (j8 < 0) {
            e0.n(str.concat(" < 0"));
            return 0;
        }
        if (timeUnit == null) {
            vb.h.z("unit == null");
            return 0;
        }
        long millis = timeUnit.toMillis(j8);
        if (millis > 2147483647L) {
            vb.h.x(str.concat(" too large."));
            return 0;
        }
        if (millis != 0 || j8 <= 0) {
            return (int) millis;
        }
        vb.h.x(str.concat(" too small."));
        return 0;
    }

    public static final void checkOffsetAndCount(long j8, long j14, long j15) {
        if ((j14 | j15) < 0 || j14 > j8 || j8 - j14 < j15) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e14) {
            if (!s.g(e14.getMessage(), "bio == null")) {
                throw e14;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        strArr.getClass();
        str.getClass();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static final int delimiterOffset(String str, String str2, int i14, int i15) {
        str.getClass();
        str2.getClass();
        while (i14 < i15) {
            if (d53.w.A(str2, str.charAt(i14))) {
                return i14;
            }
            i14++;
        }
        return i15;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i14, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i14 = 0;
        }
        if ((i16 & 4) != 0) {
            i15 = str.length();
        }
        return delimiterOffset(str, str2, i14, i15);
    }

    public static final boolean discard(g0 g0Var, int i14, TimeUnit timeUnit) {
        g0Var.getClass();
        timeUnit.getClass();
        try {
            return skipAll(g0Var, i14, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, l<? super T, Boolean> lVar) {
        iterable.getClass();
        lVar.getClass();
        ArrayList arrayList = j0.f134944a;
        for (T t7 : iterable) {
            if (lVar.invoke(t7).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                y0.b(arrayList).add(t7);
            }
        }
        return arrayList;
    }

    public static final String format(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        x0 x0Var = x0.f105818a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        strArr.getClass();
        comparator.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                p005kotlin.jvm.internal.b bVar = new p005kotlin.jvm.internal.b(strArr2);
                while (bVar.hasNext()) {
                    if (comparator.compare(str, (String) bVar.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        response.getClass();
        String str = response.headers().get(HttpHeaders.CONTENT_LENGTH);
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(a<Unit> aVar) {
        aVar.getClass();
        try {
            aVar.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        tArr.getClass();
        Object[] objArr = (Object[]) tArr.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(x.k(Arrays.copyOf(objArr, objArr.length)));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        strArr.getClass();
        str.getClass();
        comparator.getClass();
        int length = strArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (comparator.compare(strArr[i14], str) == 0) {
                return i14;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        str.getClass();
        int length = str.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if (s.h(cCharAt, 31) <= 0 || s.h(cCharAt, 127) >= 0) {
                return i14;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i14, int i15) {
        str.getClass();
        while (i14 < i15) {
            char cCharAt = str.charAt(i14);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i14;
            }
            i14++;
        }
        return i15;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i14 = 0;
        }
        if ((i16 & 2) != 0) {
            i15 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i14, i15);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i14, int i15) {
        str.getClass();
        int i16 = i15 - 1;
        if (i14 <= i16) {
            while (true) {
                char cCharAt = str.charAt(i16);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i16 + 1;
                }
                if (i16 != i14) {
                    i16--;
                }
            }
        }
        return i14;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i14 = 0;
        }
        if ((i16 & 2) != 0) {
            i15 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i14, i15);
    }

    public static final int indexOfNonWhitespace(String str, int i14) {
        str.getClass();
        int length = str.length();
        while (i14 < length) {
            char cCharAt = str.charAt(i14);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i14;
            }
            i14++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i14 = 0;
        }
        return indexOfNonWhitespace(str, i14);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        strArr.getClass();
        strArr2.getClass();
        comparator.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) {
        fileSystem.getClass();
        file.getClass();
        f0 f0VarSink = fileSystem.sink(file);
        try {
            try {
                fileSystem.delete(file);
                jg.b.l(f0VarSink, null);
                return true;
            } catch (IOException unused) {
                Unit unit = Unit.INSTANCE;
                jg.b.l(f0VarSink, null);
                fileSystem.delete(file);
                return false;
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(f0VarSink, th3);
                throw th4;
            }
        }
    }

    public static final boolean isHealthy(Socket socket, g gVar) {
        socket.getClass();
        gVar.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !gVar.F1();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(String str) {
        str.getClass();
        return str.equalsIgnoreCase(HttpHeaders.AUTHORIZATION) || str.equalsIgnoreCase(HttpHeaders.COOKIE) || str.equalsIgnoreCase(HttpHeaders.PROXY_AUTHORIZATION) || str.equalsIgnoreCase(HttpHeaders.SET_COOKIE);
    }

    public static final void notify(Object obj) {
        obj.getClass();
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        obj.getClass();
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c14) {
        if ('0' <= c14 && c14 < ':') {
            return c14 - '0';
        }
        if ('a' <= c14 && c14 < 'g') {
            return c14 - 'W';
        }
        if ('A' > c14 || c14 >= 'G') {
            return -1;
        }
        return c14 - '7';
    }

    public static final String peerName(Socket socket) {
        socket.getClass();
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        hostName.getClass();
        return hostName;
    }

    public static final Charset readBomAsCharset(g gVar, Charset charset) {
        gVar.getClass();
        charset.getClass();
        int iJ1 = gVar.j1(UNICODE_BOMS);
        if (iJ1 == -1) {
            return charset;
        }
        if (iJ1 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            charset2.getClass();
            return charset2;
        }
        if (iJ1 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            charset3.getClass();
            return charset3;
        }
        if (iJ1 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            charset4.getClass();
            return charset4;
        }
        if (iJ1 == 3) {
            d53.c.f57665a.getClass();
            Charset charset5 = d53.c.f57670f;
            if (charset5 != null) {
                return charset5;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            charsetForName.getClass();
            d53.c.f57670f = charsetForName;
            return charsetForName;
        }
        if (iJ1 != 4) {
            e0.l();
            return null;
        }
        d53.c.f57665a.getClass();
        Charset charset6 = d53.c.f57669e;
        if (charset6 != null) {
            return charset6;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        charsetForName2.getClass();
        d53.c.f57669e = charsetForName2;
        return charsetForName2;
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) throws IllegalAccessException {
        Object fieldOrNull;
        obj.getClass();
        cls.getClass();
        str.getClass();
        Class<?> superclass = obj.getClass();
        while (true) {
            T tCast = null;
            if (superclass.equals(Object.class)) {
                if (str.equals("delegate") || (fieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, cls, str);
            }
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (cls.isInstance(obj2)) {
                    tCast = cls.cast(obj2);
                }
                return tCast;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                superclass.getClass();
            }
        }
    }

    public static final int readMedium(g gVar) {
        gVar.getClass();
        return and(gVar.readByte(), 255) | (and(gVar.readByte(), 255) << 16) | (and(gVar.readByte(), 255) << 8);
    }

    public static final boolean skipAll(g0 g0Var, int i14, TimeUnit timeUnit) {
        g0Var.getClass();
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = g0Var.timeout().getHasDeadline() ? g0Var.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        g0Var.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i14)) + jNanoTime);
        try {
            e eVar = new e();
            while (g0Var.read(eVar, 8192L) != -1) {
                eVar.a();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                g0Var.timeout().clearDeadline();
                return true;
            }
            g0Var.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                g0Var.timeout().clearDeadline();
                return false;
            }
            g0Var.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th3) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                g0Var.timeout().clearDeadline();
            } else {
                g0Var.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th3;
        }
    }

    public static final ThreadFactory threadFactory(final String str, final boolean z14) {
        str.getClass();
        return new ThreadFactory() { // from class: v63.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.threadFactory$lambda$1(str, z14, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread threadFactory$lambda$1(String str, boolean z14, Runnable runnable) {
        str.getClass();
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z14);
        return thread;
    }

    public static final void threadName(String str, a<Unit> aVar) {
        str.getClass();
        aVar.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            aVar.invoke();
        } finally {
            threadCurrentThread.setName(name);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        headers.getClass();
        j23.l lVarO = t.o(0, headers.size());
        ArrayList arrayList = new ArrayList(y.r(lVarO, 10));
        Iterator<Integer> it = lVarO.iterator();
        while (it.hasNext()) {
            int iNextInt = ((p0) it).nextInt();
            arrayList.add(new Header(headers.name(iNextInt), headers.value(iNextInt)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        list.getClass();
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.getName().s(), header.getValue().s());
        }
        return builder.build();
    }

    public static final String toHexString(long j8) {
        String hexString = Long.toHexString(j8);
        hexString.getClass();
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z14) {
        String strHost;
        httpUrl.getClass();
        if (d53.w.z(httpUrl.host(), ":", false)) {
            strHost = "[" + httpUrl.host() + ']';
        } else {
            strHost = httpUrl.host();
        }
        if (!z14 && httpUrl.port() == HttpUrl.INSTANCE.defaultPort(httpUrl.scheme())) {
            return strHost;
        }
        return strHost + CoreConstants.COLON_CHAR + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = false;
        }
        return toHostHeader(httpUrl, z14);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        list.getClass();
        List<T> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        map.getClass();
        if (map.isEmpty()) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j8) {
        str.getClass();
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j8;
        }
    }

    public static final int toNonNegativeInt(String str, int i14) {
        if (str != null) {
            try {
                long j8 = Long.parseLong(str);
                if (j8 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j8 < 0) {
                    return 0;
                }
                return (int) j8;
            } catch (NumberFormatException unused) {
            }
        }
        return i14;
    }

    public static final String trimSubstring(String str, int i14, int i15) {
        str.getClass();
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i14, i15);
        return str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i15));
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i14 = 0;
        }
        if ((i16 & 2) != 0) {
            i15 = str.length();
        }
        return trimSubstring(str, i14, i15);
    }

    public static final void wait(Object obj) throws InterruptedException {
        obj.getClass();
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        exc.getClass();
        list.getClass();
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            o13.g.a(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(f fVar, int i14) {
        fVar.getClass();
        fVar.writeByte((i14 >>> 16) & 255);
        fVar.writeByte((i14 >>> 8) & 255);
        fVar.writeByte(i14 & 255);
    }

    public static final int and(short s8, int i14) {
        return s8 & i14;
    }

    public static final int and(byte b14, int i14) {
        return b14 & i14;
    }

    public static final String toHexString(int i14) {
        String hexString = Integer.toHexString(i14);
        hexString.getClass();
        return hexString;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c14, int i14, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i14 = 0;
        }
        if ((i16 & 4) != 0) {
            i15 = str.length();
        }
        return delimiterOffset(str, c14, i14, i15);
    }

    public static final int delimiterOffset(String str, char c14, int i14, int i15) {
        str.getClass();
        while (i14 < i15) {
            if (str.charAt(i14) == c14) {
                return i14;
            }
            i14++;
        }
        return i15;
    }

    public static final void closeQuietly(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        serverSocket.getClass();
        try {
            serverSocket.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(e eVar, byte b14) throws EOFException {
        eVar.getClass();
        int i14 = 0;
        while (!eVar.F1() && eVar.j(0L) == b14) {
            i14++;
            eVar.readByte();
        }
        return i14;
    }
}
