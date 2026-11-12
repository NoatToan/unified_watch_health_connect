package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hms.network.embedded.g4;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.operation.utils.Constants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Opers;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\"\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0004Þ\u0001ß\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\"\b\u0002\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0002\u0010\tJ\u0010\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u0010H\u0002J\u0006\u0010R\u001a\u00020\u0007J\u0010\u0010R\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016J\u0016\u0010R\u001a\u00020\u00072\u000e\u0010S\u001a\n\u0018\u00010Tj\u0004\u0018\u0001`UJ\u0017\u0010V\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016H\u0010¢\u0006\u0002\bWJ\u001e\u0010X\u001a\u00020\u00072\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010K\u001a\u00020\u0010H\u0002J\u0006\u0010Z\u001a\u00020\u0007J\u0012\u0010[\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u001a\u0010]\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u00162\u0006\u0010R\u001a\u00020\u001cH\u0014J\u0010\u0010^\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u0010H\u0002J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010_\u001a\u00020\u0010H\u0002J\b\u0010a\u001a\u00020\u0007H\u0002J\u0010\u0010b\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u0010H\u0004J\b\u0010d\u001a\u00020\u0007H\u0002J.\u0010e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010h\u001a\u00020\u0010H\u0002J&\u0010i\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J&\u0010j\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\r\u0010k\u001a\u00020\u001cH\u0000¢\u0006\u0002\blJ\u0012\u0010m\u001a\u00020\u00072\b\b\u0002\u0010n\u001a\u00020\u0010H\u0002J\b\u0010o\u001a\u00020\u0007H\u0002J-\u0010p\u001a\u00020\u00072#\u0010q\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J&\u0010r\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u0010H\u0002J\u0018\u0010v\u001a\u00020\u001c2\u0006\u0010w\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000f\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000yH\u0096\u0002J\u0016\u0010z\u001a\u00020\u00102\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\b\u0010{\u001a\u00020\u0007H\u0002J\b\u0010|\u001a\u00020\u0007H\u0002J\b\u0010}\u001a\u00020\u0007H\u0002J\u001e\u0010~\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\b\u0010\u007f\u001a\u00020\u0007H\u0014J\"\u0010\u0080\u0001\u001a\u00020\u00072\u0014\u0010\u0081\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0\u0082\u0001H\u0002ø\u0001\u0000J\u0019\u0010\u0083\u0001\u001a\u00020\u00072\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u0001H\u0002J\u0015\u0010\u0084\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u000309H\u0002J$\u0010\u0085\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u00002\n\u0010<\u001a\u0006\u0012\u0002\b\u000309H\u0002¢\u0006\u0003\u0010\u0087\u0001J\u001c\u0010\u0088\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u0089\u0001J(\u0010\u008a\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u0082\u0001H\u0002¢\u0006\u0003\u0010\u008b\u0001J\t\u0010\u008c\u0001\u001a\u00020\u0007H\u0014J\t\u0010\u008d\u0001\u001a\u00020\u0007H\u0014J!\u0010\u008e\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0091\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0092\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0093\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J\u0013\u0010\u0094\u0001\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0095\u0001J%\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\b\u0097\u0001\u0010\u0095\u0001JD\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u0010H\u0082@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u008c\u0002\u0010\u009c\u0001\u001a\u0003H\u009d\u0001\"\u0005\b\u0001\u0010\u009d\u00012\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2$\u0010\u009f\u0001\u001a\u001f\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0005\u0012\u0003H\u009d\u00010\u00062V\u0010 \u0001\u001aQ\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0099\u0001\u0012\u0005\u0012\u0003H\u009d\u0001082\u000f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012X\b\u0002\u0010¥\u0001\u001aQ\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0099\u0001\u0012\u0005\u0012\u0003H\u009d\u000108H\u0082\b¢\u0006\u0003\u0010¦\u0001Jh\u0010§\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\b\u0010\u009e\u0001\u001a\u00030¨\u00012#\u0010\u009f\u0001\u001a\u001e\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u0001H\u0082\bJ2\u0010©\u0001\u001a\u00028\u00002\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u009b\u0001J \u0010ª\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u0003092\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\fH\u0002J \u0010«\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u0003092\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\fH\u0014J\u0017\u0010¬\u0001\u001a\u00020\u00072\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u001c\u0010\u00ad\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0089\u0001J\u001f\u0010®\u0001\u001a\u00020\u001c2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0090@ø\u0001\u0000¢\u0006\u0006\b¯\u0001\u0010\u0089\u0001J\u0082\u0002\u0010°\u0001\u001a\u0003H\u009d\u0001\"\u0005\b\u0001\u0010\u009d\u00012\u0007\u0010\u0086\u0001\u001a\u00028\u00002\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u000f\u0010±\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012A\u0010 \u0001\u001a<\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0005\u0012\u0003H\u009d\u00010²\u00012\u000f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012o\b\u0002\u0010¥\u0001\u001ah\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(´\u0001\u0012\u0005\u0012\u0003H\u009d\u00010³\u0001H\u0084\b¢\u0006\u0003\u0010µ\u0001Jb\u0010¶\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\b\u0010\u009e\u0001\u001a\u00030¨\u00012\u000e\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u00012\u000e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u0001H\u0082\b¢\u0006\u0003\u0010·\u0001J;\u0010¸\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010¹\u0001J\u000f\u0010º\u0001\u001a\u00020\u001cH\u0010¢\u0006\u0003\b»\u0001J\u0012\u0010º\u0001\u001a\u00020\u001c2\u0007\u0010¼\u0001\u001a\u00020\u0010H\u0003J\n\u0010½\u0001\u001a\u00030¾\u0001H\u0016J\u0010\u0010¿\u0001\u001a\u00030¾\u0001H\u0000¢\u0006\u0003\bÀ\u0001J!\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J*\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070,2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J(\u0010Ç\u0001\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010È\u0001\u001a\u00020\u0010H\u0002J(\u0010É\u0001\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010È\u0001\u001a\u00020\u0010H\u0002J5\u0010Ê\u0001\u001a\u0004\u0018\u00010\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\fH\u0002J5\u0010Ë\u0001\u001a\u0004\u0018\u00010\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\fH\u0002JK\u0010Ì\u0001\u001a\u00020\u00042\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u0007\u0010Í\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0003\u0010Î\u0001JK\u0010Ï\u0001\u001a\u00020\u00042\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u0007\u0010Í\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0003\u0010Î\u0001J\u0012\u0010Ð\u0001\u001a\u00020\u00072\u0007\u0010Ñ\u0001\u001a\u00020\u0010H\u0002J\u0012\u0010Ò\u0001\u001a\u00020\u00072\u0007\u0010Ñ\u0001\u001a\u00020\u0010H\u0002J\u0017\u0010Ó\u0001\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u0010H\u0000¢\u0006\u0003\bÔ\u0001J$\u0010Õ\u0001\u001a\u00020\u0007*\u00030¨\u00012\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002J$\u0010Ö\u0001\u001a\u00020\u0007*\u00030¨\u00012\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002J\u000e\u0010×\u0001\u001a\u00020\u0007*\u00030¨\u0001H\u0002J\u000e\u0010Ø\u0001\u001a\u00020\u0007*\u00030¨\u0001H\u0002J\u0017\u0010Ù\u0001\u001a\u00020\u0007*\u00030¨\u00012\u0007\u0010Ú\u0001\u001a\u00020\u001cH\u0002J\u001c\u0010Û\u0001\u001a\u00020\u001c*\u00020\f2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0002¢\u0006\u0003\u0010Ü\u0001J#\u0010Ý\u0001\u001a\u00020\u001c*\u00020\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002R\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\t\u0010\r\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\t\u0010\u001a\u001a\u00020\u000eX\u0082\u0004R\u001a\u0010\u001b\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u001a\u0010 \u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020\u001c8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u001fR\u0014\u0010%\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR \u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'8VX\u0096\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*R)\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0'8VX\u0096\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010*R\"\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000'8VX\u0096\u0004¢\u0006\f\u0012\u0004\b0\u0010\u001e\u001a\u0004\b1\u0010*R,\u00102\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000038VX\u0096\u0004¢\u0006\f\u0012\u0004\b4\u0010\u001e\u001a\u0004\b5\u00106R*\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000Ru\u00107\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u000309¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(=\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u000108j\u0004\u0018\u0001`?X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b@\u0010\u001eR\u0014\u0010A\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0018R\u0015\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\t\u0010D\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010E\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0012R\u0014\u0010G\u001a\u00020\u00168DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0018R\u0015\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\t\u0010J\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010K\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0012R\u0018\u0010M\u001a\u00020\u001c*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010O\u001a\u00020\u001c*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010N\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006à\u0001"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/Channel;", "capacity", "", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(ILkotlin/jvm/functions/Function1;)V", "_closeCause", "Lkotlinx/atomicfu/AtomicRef;", "", "bufferEnd", "Lkotlinx/atomicfu/AtomicLong;", "bufferEndCounter", "", "getBufferEndCounter", "()J", "bufferEndSegment", "Lkotlinx/coroutines/channels/ChannelSegment;", "closeCause", "", "getCloseCause", "()Ljava/lang/Throwable;", "closeHandler", "completedExpandBuffersAndPauseFlag", "isClosedForReceive", "", "isClosedForReceive$annotations", "()V", "()Z", "isClosedForSend", "isClosedForSend$annotations", "isConflatedDropOldest", "isEmpty", "isEmpty$annotations", "isRendezvousOrUnlimited", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive$annotations", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching$annotations", "getOnReceiveCatching", "onReceiveOrNull", "getOnReceiveOrNull$annotations", "getOnReceiveOrNull", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onUndeliveredElementReceiveCancellationConstructor", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/ParameterName;", "name", "select", RemoteMessageConst.MessageBody.PARAM, "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "receiveException", "getReceiveException", "receiveSegment", "receivers", "receiversCounter", "getReceiversCounter$kotlinx_coroutines_core", "sendException", "getSendException", "sendSegment", "sendersAndCloseStatus", "sendersCounter", "getSendersCounter$kotlinx_coroutines_core", "isClosedForReceive0", "(J)Z", "isClosedForSend0", "bufferOrRendezvousSend", "curSenders", "cancel", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "cancelSuspendedReceiveRequests", "lastSegment", "checkSegmentStructureInvariants", "close", "closeLinkedList", "closeOrCancelImpl", "completeCancel", "sendersCur", "completeClose", "completeCloseOrCancel", "dropFirstElementUntilTheSpecifiedCellIsInTheBuffer", "globalCellIndex", "expandBuffer", "findSegmentBufferEnd", "id", "startFrom", "currentBufferEndCounter", "findSegmentReceive", "findSegmentSend", "hasElements", "hasElements$kotlinx_coroutines_core", "incCompletedExpandBufferAttempts", "nAttempts", "invokeCloseHandler", "invokeOnClose", "handler", "isCellNonEmpty", "segment", "index", "globalIndex", "isClosed", "sendersAndCloseStatusCur", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "markAllEmptyCellsAsClosed", "markCancellationStarted", "markCancelled", "markClosed", "moveSegmentBufferEndToSpecifiedOrLast", "onClosedIdempotent", "onClosedReceiveCatchingOnNoWaiterSuspend", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "onClosedReceiveOnNoWaiterSuspend", "onClosedSelectOnReceive", "onClosedSelectOnSend", FunctionSetBeanReader.BI_ELEMENT, "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)V", "onClosedSend", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClosedSendOnNoWaiterSuspend", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "onReceiveDequeued", "onReceiveEnqueued", "processResultSelectReceive", "ignoredParam", "selectResult", "processResultSelectReceiveCatching", "processResultSelectReceiveOrNull", "processResultSelectSend", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveCatchingOnNoWaiterSuspend", "r", "receiveCatchingOnNoWaiterSuspend-GKJJFZk", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveImpl", "R", "waiter", "onElementRetrieved", "onSuspend", "segm", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "onClosed", "Lkotlin/Function0;", "onNoWaiterSuspend", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "receiveImplOnNoWaiter", "Lkotlinx/coroutines/Waiter;", "receiveOnNoWaiterSuspend", "registerSelectForReceive", "registerSelectForSend", "removeUnprocessedElements", "send", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "sendImpl", "onRendezvousOrBuffered", "Lkotlin/Function2;", "Lkotlin/Function4;", "s", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "sendImplOnNoWaiter", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlinx/coroutines/Waiter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "sendOnNoWaiterSuspend", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldSendSuspend", "shouldSendSuspend$kotlinx_coroutines_core", "curSendersAndCloseStatus", "toString", "", "toStringDebug", "toStringDebug$kotlinx_coroutines_core", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "trySend", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "updateCellExpandBuffer", "b", "updateCellExpandBufferSlow", "updateCellReceive", "updateCellReceiveSlow", "updateCellSend", "closed", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLjava/lang/Object;Z)I", "updateCellSendSlow", "updateReceiversCounterIfLower", "value", "updateSendersCounterIfLower", "waitExpandBufferCompletion", "waitExpandBufferCompletion$kotlinx_coroutines_core", "prepareReceiverForSuspension", "prepareSenderForSuspension", "resumeReceiverOnClosedChannel", "resumeSenderOnCancelledChannel", "resumeWaiterOnClosedChannel", SocialConstants.PARAM_RECEIVER, "tryResumeReceiver", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "tryResumeSender", "BufferedChannelIterator", "SendBroadcast", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class zir<E> implements Channel<E> {

    @Volatile
    private volatile Object _closeCause;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1<E, yzc> f54143b;

    @Volatile
    private volatile long bufferEnd;

    @Volatile
    private volatile Object bufferEndSegment;

    @Volatile
    private volatile Object closeHandler;

    @Volatile
    private volatile long completedExpandBuffersAndPauseFlag;
    private final Function3<SelectInstance<?>, Object, Object, Function1<Throwable, yzc>> l;
    private final int o;

    @Volatile
    private volatile Object receiveSegment;

    @Volatile
    private volatile long receivers;

    @Volatile
    private volatile Object sendSegment;

    @Volatile
    private volatile long sendersAndCloseStatus;
    private static final AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(zir.class, "sendersAndCloseStatus");
    private static final AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(zir.class, "receivers");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f54141a = AtomicLongFieldUpdater.newUpdater(zir.class, "bufferEnd");
    private static final AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(zir.class, "completedExpandBuffersAndPauseFlag");
    private static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(zir.class, Object.class, "sendSegment");
    private static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(zir.class, Object.class, "receiveSegment");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f54142c = AtomicReferenceFieldUpdater.newUpdater(zir.class, Object.class, "bufferEndSegment");
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(zir.class, Object.class, "_closeCause");
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(zir.class, Object.class, "closeHandler");

    protected boolean g() {
        return false;
    }

    protected void k() {
    }

    protected void l() {
    }

    protected void n() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zir(int i2, Function1<? super E, yzc> function1) {
        this.o = i2;
        this.f54143b = function1;
        if (i2 >= 0) {
            this.bufferEnd = BUFFERED.d(i2);
            this.completedExpandBuffersAndPauseFlag = p();
            zja zjaVar = new zja(0L, null, this, 3);
            this.sendSegment = zjaVar;
            this.receiveSegment = zjaVar;
            if (s()) {
                zjaVar = BUFFERED.k;
                zcp.e(zjaVar, "");
            }
            this.bufferEndSegment = zjaVar;
            this.l = function1 != 0 ? new k(this) : null;
            this._closeCause = BUFFERED.o;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e2) {
        return Channel.d.e(this, e2);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return (E) Channel.d.b(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object receiveOrNull(Continuation<? super E> continuation) {
        return Channel.d.d(this, continuation);
    }

    public final long h() {
        return i.get(this) & 1152921504606846975L;
    }

    public final long j() {
        return g.get(this);
    }

    private final long p() {
        return f54141a.get(this);
    }

    private final boolean s() {
        long jP = p();
        return jP == 0 || jP == Long.MAX_VALUE;
    }

    static /* synthetic */ <E> Object c(zir<E> zirVar, E e2, Continuation<? super yzc> continuation) {
        zja<E> zjaVar = (zja) h.get(zirVar);
        while (true) {
            long andIncrement = i.getAndIncrement(zirVar);
            long j2 = 1152921504606846975L & andIncrement;
            boolean zI = zirVar.i(andIncrement);
            long j3 = j2 / ((long) BUFFERED.d);
            int i2 = (int) (j2 % ((long) BUFFERED.d));
            if (zjaVar.id != j3) {
                zja<E> zjaVarE = zirVar.e(j3, zjaVar);
                if (zjaVarE != null) {
                    zjaVar = zjaVarE;
                } else if (zI) {
                    Object objD = zirVar.d((Object) e2, continuation);
                    if (objD != zbg.a()) {
                        break;
                    }
                    return objD;
                }
            }
            int iB = zirVar.b(zjaVar, i2, e2, j2, null, zI);
            if (iB == 0) {
                zjaVar.cleanPrev();
                break;
            }
            if (iB != 1) {
                if (iB == 2) {
                    if (!zI) {
                        if (!ASSERTIONS_ENABLED.a()) {
                            break;
                        }
                        throw new AssertionError();
                    }
                    zjaVar.onSlotCleaned();
                    Object objD2 = zirVar.d((Object) e2, continuation);
                    if (objD2 != zbg.a()) {
                        break;
                    }
                    return objD2;
                }
                if (iB == 3) {
                    Object objC = zirVar.c(zjaVar, i2, e2, j2, continuation);
                    if (objC != zbg.a()) {
                        break;
                    }
                    return objC;
                }
                if (iB == 4) {
                    if (j2 < zirVar.j()) {
                        zjaVar.cleanPrev();
                    }
                    Object objD3 = zirVar.d((Object) e2, continuation);
                    if (objD3 != zbg.a()) {
                        break;
                    }
                    return objD3;
                }
                if (iB == 5) {
                    zjaVar.cleanPrev();
                }
            } else {
                break;
            }
        }
        return yzc.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Waiter waiter, zja<E> zjaVar, int i2) {
        waiter.invokeOnCancellation(zjaVar, i2 + BUFFERED.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(E e2, CancellableContinuation<? super yzc> cancellableContinuation) {
        Function1<E, yzc> function1 = this.f54143b;
        if (function1 != null) {
            bindCancellationFun.d(function1, e2, cancellableContinuation.getF54257c());
        }
        CancellableContinuation<? super yzc> cancellableContinuation2 = cancellableContinuation;
        Throwable thF = f();
        if (ASSERTIONS_ENABLED.b() && (cancellableContinuation2 instanceof CoroutineStackFrame)) {
            thF = ARTIFICIAL_FRAME.d(thF, (CoroutineStackFrame) cancellableContinuation2);
        }
        yyt.c cVar = yyt.f53903b;
        cancellableContinuation2.resumeWith(yyt.e(createFailure.a(thF)));
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo1959trySendJP2dKIU(E element) {
        zja zjaVar;
        if (g(i.get(this))) {
            return ziw.d.e();
        }
        Object obj = BUFFERED.i;
        zja zjaVar2 = (zja) h.get(this);
        while (true) {
            long andIncrement = i.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zI = i(andIncrement);
            long j3 = j2 / ((long) BUFFERED.d);
            int i2 = (int) (j2 % ((long) BUFFERED.d));
            if (zjaVar2.id != j3) {
                zja zjaVarE = e(j3, zjaVar2);
                if (zjaVarE != null) {
                    zjaVar = zjaVarE;
                } else if (zI) {
                    return ziw.d.b(f());
                }
            } else {
                zjaVar = zjaVar2;
            }
            int iB = b(zjaVar, i2, element, j2, obj, zI);
            if (iB == 0) {
                zjaVar.cleanPrev();
                return ziw.d.d(yzc.e);
            }
            if (iB == 1) {
                return ziw.d.d(yzc.e);
            }
            if (iB == 2) {
                if (zI) {
                    zjaVar.onSlotCleaned();
                    return ziw.d.b(f());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    c(waiter, zjaVar, i2);
                }
                zjaVar.onSlotCleaned();
                return ziw.d.e();
            }
            if (iB == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iB == 4) {
                if (j2 < j()) {
                    zjaVar.cleanPrev();
                }
                return ziw.d.b(f());
            }
            if (iB == 5) {
                zjaVar.cleanPrev();
            }
            zjaVar2 = zjaVar;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$SendBroadcast;", "Lkotlinx/coroutines/Waiter;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/CancellableContinuation;)V", "getCont", "()Lkotlinx/coroutines/CancellableContinuation;", "invokeOnCancellation", "", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class c implements Waiter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CancellableContinuation<Boolean> f54145a;
        private final /* synthetic */ zgf<Boolean> e;

        public final CancellableContinuation<Boolean> c() {
            return this.f54145a;
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int index) {
            this.e.invokeOnCancellation(segment, index);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b(zja<E> zjaVar, int i2, E e2, long j2, Object obj, boolean z) {
        zjaVar.e(i2, e2);
        if (z) {
            return a(zjaVar, i2, e2, j2, obj, z);
        }
        Object objE = zjaVar.e(i2);
        if (objE == null) {
            if (c(j2)) {
                if (zjaVar.a(i2, null, BUFFERED.f54168a)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (zjaVar.a(i2, null, obj)) {
                    return 2;
                }
            }
        } else if (objE instanceof Waiter) {
            zjaVar.d(i2);
            if (d(objE, e2)) {
                zjaVar.a(i2, BUFFERED.f);
                n();
                return 0;
            }
            if (zjaVar.c(i2, BUFFERED.j) == BUFFERED.j) {
                return 5;
            }
            zjaVar.a(i2, true);
            return 5;
        }
        return a(zjaVar, i2, e2, j2, obj, z);
    }

    private final int a(zja<E> zjaVar, int i2, E e2, long j2, Object obj, boolean z) {
        while (true) {
            Object objE = zjaVar.e(i2);
            if (objE != null) {
                if (objE != BUFFERED.n) {
                    if (objE != BUFFERED.j) {
                        if (objE == BUFFERED.m) {
                            zjaVar.d(i2);
                            return 5;
                        }
                        if (objE == BUFFERED.s()) {
                            zjaVar.d(i2);
                            o();
                            return 4;
                        }
                        if (ASSERTIONS_ENABLED.a() && !(objE instanceof Waiter) && !(objE instanceof zji)) {
                            throw new AssertionError();
                        }
                        zjaVar.d(i2);
                        if (objE instanceof zji) {
                            objE = ((zji) objE).e;
                        }
                        if (d(objE, e2)) {
                            zjaVar.a(i2, BUFFERED.f);
                            n();
                            return 0;
                        }
                        if (zjaVar.c(i2, BUFFERED.j) != BUFFERED.j) {
                            zjaVar.a(i2, true);
                        }
                        return 5;
                    }
                    zjaVar.d(i2);
                    return 5;
                }
                if (zjaVar.a(i2, objE, BUFFERED.f54168a)) {
                    return 1;
                }
            } else if (!c(j2) || z) {
                if (z) {
                    if (zjaVar.a(i2, null, BUFFERED.i)) {
                        zjaVar.a(i2, false);
                        return 4;
                    }
                } else {
                    if (obj == null) {
                        return 3;
                    }
                    if (zjaVar.a(i2, null, obj)) {
                        return 2;
                    }
                }
            } else if (zjaVar.a(i2, null, BUFFERED.f54168a)) {
                return 1;
            }
        }
    }

    private final boolean g(long j2) {
        if (i(j2)) {
            return false;
        }
        return !c(j2 & 1152921504606846975L);
    }

    private final boolean c(long j2) {
        return j2 < p() || j2 < j() + ((long) this.o);
    }

    private final boolean d(Object obj, E e2) {
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).trySelect(this, e2);
        }
        if (obj instanceof zjk) {
            zcp.e(obj, "");
            zjk zjkVar = (zjk) obj;
            zgf<ziw<? extends E>> zgfVar = zjkVar.f54187a;
            ziw ziwVarC = ziw.c(ziw.d.d(e2));
            Function1<E, yzc> function1 = this.f54143b;
            return BUFFERED.e(zgfVar, ziwVarC, function1 != null ? bindCancellationFun.e(function1, e2, zjkVar.f54187a.getF54257c()) : null);
        }
        if (obj instanceof d) {
            zcp.e(obj, "");
            return ((d) obj).a(e2);
        }
        if (obj instanceof CancellableContinuation) {
            zcp.e(obj, "");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            Function1<E, yzc> function2 = this.f54143b;
            return BUFFERED.e(cancellableContinuation, e2, function2 != null ? bindCancellationFun.e(function2, e2, cancellableContinuation.getF54257c()) : null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    static /* synthetic */ <E> Object d(zir<E> zirVar, Continuation<? super E> continuation) throws Throwable {
        zja<E> zjaVar = (zja) f.get(zirVar);
        while (!zirVar.isClosedForReceive()) {
            long andIncrement = g.getAndIncrement(zirVar);
            long j2 = andIncrement / ((long) BUFFERED.d);
            int i2 = (int) (andIncrement % ((long) BUFFERED.d));
            if (zjaVar.id != j2) {
                zja<E> zjaVarB = zirVar.b(j2, zjaVar);
                if (zjaVarB == null) {
                    continue;
                } else {
                    zjaVar = zjaVarB;
                }
            }
            Object objD = zirVar.d(zjaVar, i2, andIncrement, (Object) null);
            if (objD != BUFFERED.q) {
                if (objD != BUFFERED.g) {
                    if (objD == BUFFERED.r) {
                        return zirVar.d((zja) zjaVar, i2, andIncrement, (Continuation) continuation);
                    }
                    zjaVar.cleanPrev();
                    return objD;
                }
                if (andIncrement < zirVar.h()) {
                    zjaVar.cleanPrev();
                }
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        throw ARTIFICIAL_FRAME.c(zirVar.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Waiter waiter, zja<E> zjaVar, int i2) {
        k();
        waiter.invokeOnCancellation(zjaVar, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(CancellableContinuation<? super E> cancellableContinuation) {
        yyt.c cVar = yyt.f53903b;
        cancellableContinuation.resumeWith(yyt.e(createFailure.a(r())));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ <E> Object c(zir<E> zirVar, Continuation<? super ziw<? extends E>> continuation) {
        n nVar;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            if ((nVar.e & Integer.MIN_VALUE) != 0) {
                nVar.e -= Integer.MIN_VALUE;
            } else {
                nVar = new n(zirVar, continuation);
            }
        } else {
            nVar = new n(zirVar, continuation);
        }
        n nVar2 = nVar;
        Object obj = nVar2.f54158b;
        Object objA = zbg.a();
        int i2 = nVar2.e;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createFailure.c(obj);
            return ((ziw) obj).getE();
        }
        createFailure.c(obj);
        zja<E> zjaVar = (zja) f.get(zirVar);
        while (!zirVar.isClosedForReceive()) {
            long andIncrement = g.getAndIncrement(zirVar);
            long j2 = andIncrement / ((long) BUFFERED.d);
            int i3 = (int) (andIncrement % ((long) BUFFERED.d));
            if (zjaVar.id != j2) {
                zja<E> zjaVarB = zirVar.b(j2, zjaVar);
                if (zjaVarB == null) {
                    continue;
                } else {
                    zjaVar = zjaVarB;
                }
            }
            Object objD = zirVar.d(zjaVar, i3, andIncrement, (Object) null);
            if (objD != BUFFERED.q) {
                if (objD != BUFFERED.g) {
                    if (objD == BUFFERED.r) {
                        nVar2.e = 1;
                        Object objA2 = zirVar.a(zjaVar, i3, andIncrement, nVar2);
                        return objA2 == objA ? objA : objA2;
                    }
                    zjaVar.cleanPrev();
                    return ziw.d.d(objD);
                }
                if (andIncrement < zirVar.h()) {
                    zjaVar.cleanPrev();
                }
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        return ziw.d.b(zirVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(zja<E> zjaVar, int i2, long j2, Continuation<? super ziw<? extends E>> continuation) {
        m mVar;
        ziw ziwVarC;
        Function1<E, yzc> function1;
        CoroutineContext f54257c;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            if ((mVar.f54155b & Integer.MIN_VALUE) != 0) {
                mVar.f54155b -= Integer.MIN_VALUE;
            } else {
                mVar = new m(this, continuation);
            }
        } else {
            mVar = new m(this, continuation);
        }
        Object objB = mVar.f;
        Object objA = zbg.a();
        int i3 = mVar.f54155b;
        if (i3 == 0) {
            createFailure.c(objB);
            mVar.f54154a = this;
            mVar.d = zjaVar;
            mVar.f54156c = i2;
            mVar.e = j2;
            mVar.f54155b = 1;
            m mVar2 = mVar;
            zgf zgfVarC = getOrCreateCancellableContinuation.c(zbg.c(mVar2));
            try {
                zcp.e(zgfVarC, "");
                zjk zjkVar = new zjk(zgfVarC);
                Object objD = d(zjaVar, i2, j2, zjkVar);
                if (objD != BUFFERED.q) {
                    Function1<Throwable, yzc> function1E = null;
                    function1E = null;
                    if (objD == BUFFERED.g) {
                        if (j2 < h()) {
                            zjaVar.cleanPrev();
                        }
                        zja zjaVar2 = (zja) f.get(this);
                        while (true) {
                            if (isClosedForReceive()) {
                                a((CancellableContinuation) zgfVarC);
                            } else {
                                long andIncrement = g.getAndIncrement(this);
                                long j3 = andIncrement / ((long) BUFFERED.d);
                                int i4 = (int) (andIncrement % ((long) BUFFERED.d));
                                if (zjaVar2.id != j3) {
                                    zja zjaVarB = b(j3, zjaVar2);
                                    if (zjaVarB != null) {
                                        zjaVar2 = zjaVarB;
                                    }
                                }
                                objD = d(zjaVar2, i4, andIncrement, zjkVar);
                                if (objD != BUFFERED.q) {
                                    if (objD == BUFFERED.g) {
                                        if (andIncrement < h()) {
                                            zjaVar2.cleanPrev();
                                        }
                                    } else {
                                        if (objD == BUFFERED.r) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        zjaVar2.cleanPrev();
                                        ziwVarC = ziw.c(ziw.d.d(objD));
                                        function1 = this.f54143b;
                                        if (function1 != null) {
                                            f54257c = zgfVarC.getF54257c();
                                            function1E = bindCancellationFun.e(function1, objD, f54257c);
                                        }
                                        zgfVarC.resume(ziwVarC, function1E);
                                    }
                                } else {
                                    zjk zjkVar2 = zjkVar instanceof Waiter ? zjkVar : null;
                                    if (zjkVar2 != null) {
                                        b(zjkVar2, zjaVar2, i4);
                                    }
                                }
                            }
                        }
                    } else {
                        zjaVar.cleanPrev();
                        ziwVarC = ziw.c(ziw.d.d(objD));
                        function1 = this.f54143b;
                        if (function1 != null) {
                            f54257c = zgfVarC.getF54257c();
                            function1E = bindCancellationFun.e(function1, objD, f54257c);
                        }
                        zgfVarC.resume(ziwVarC, function1E);
                    }
                } else {
                    b(zjkVar, zjaVar, i2);
                }
                objB = zgfVarC.b();
                if (objB == zbg.a()) {
                    probeCoroutineCreated.e(mVar2);
                }
                if (objB == objA) {
                    return objA;
                }
            } catch (Throwable th) {
                zgfVarC.a();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j4 = mVar.e;
            int i5 = mVar.f54156c;
            createFailure.c(objB);
        }
        return ((ziw) objB).getE();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(CancellableContinuation<? super ziw<? extends E>> cancellableContinuation) {
        yyt.c cVar = yyt.f53903b;
        cancellableContinuation.resumeWith(yyt.e(ziw.c(ziw.d.b(a()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    public Object mo1958tryReceivePtdJZtk() {
        zja zjaVar;
        long j2 = g.get(this);
        long j3 = i.get(this);
        if (j(j3)) {
            return ziw.d.b(a());
        }
        if (j2 < (j3 & 1152921504606846975L)) {
            Object obj = BUFFERED.j;
            zja zjaVar2 = (zja) f.get(this);
            while (!isClosedForReceive()) {
                long andIncrement = g.getAndIncrement(this);
                long j4 = andIncrement / ((long) BUFFERED.d);
                int i2 = (int) (andIncrement % ((long) BUFFERED.d));
                if (zjaVar2.id != j4) {
                    zja zjaVarB = b(j4, zjaVar2);
                    if (zjaVarB == null) {
                        continue;
                    } else {
                        zjaVar = zjaVarB;
                    }
                } else {
                    zjaVar = zjaVar2;
                }
                Object objD = d(zjaVar, i2, andIncrement, obj);
                if (objD != BUFFERED.q) {
                    if (objD != BUFFERED.g) {
                        if (objD == BUFFERED.r) {
                            throw new IllegalStateException("unexpected".toString());
                        }
                        zjaVar.cleanPrev();
                        return ziw.d.d(objD);
                    }
                    if (andIncrement < h()) {
                        zjaVar.cleanPrev();
                    }
                    zjaVar2 = zjaVar;
                } else {
                    Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                    if (waiter != null) {
                        b(waiter, zjaVar, i2);
                    }
                    e(andIncrement);
                    zjaVar.onSlotCleaned();
                    return ziw.d.e();
                }
            }
            return ziw.d.b(a());
        }
        return ziw.d.e();
    }

    protected final void b(long j2) {
        zmn zmnVarC;
        if (ASSERTIONS_ENABLED.a() && !g()) {
            throw new AssertionError();
        }
        zja<E> zjaVar = (zja) f.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(((long) this.o) + j3, p())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = j3 / ((long) BUFFERED.d);
                int i2 = (int) (j3 % ((long) BUFFERED.d));
                if (zjaVar.id != j4) {
                    zja<E> zjaVarB = b(j4, zjaVar);
                    if (zjaVarB == null) {
                        continue;
                    } else {
                        zjaVar = zjaVarB;
                    }
                }
                Object objD = d(zjaVar, i2, j3, (Object) null);
                if (objD != BUFFERED.g) {
                    zjaVar.cleanPrev();
                    Function1<E, yzc> function1 = this.f54143b;
                    if (function1 != null && (zmnVarC = bindCancellationFun.c(function1, objD, null, 2, null)) != null) {
                        throw zmnVarC;
                    }
                } else if (j3 < h()) {
                    zjaVar.cleanPrev();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(zja<E> zjaVar, int i2, long j2, Object obj) {
        Object objE = zjaVar.e(i2);
        if (objE == null) {
            if (j2 >= (i.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return BUFFERED.r;
                }
                if (zjaVar.a(i2, objE, obj)) {
                    q();
                    return BUFFERED.q;
                }
            }
        } else if (objE == BUFFERED.f54168a && zjaVar.a(i2, objE, BUFFERED.f)) {
            q();
            return zjaVar.c(i2);
        }
        return c(zjaVar, i2, j2, obj);
    }

    private final Object c(zja<E> zjaVar, int i2, long j2, Object obj) {
        while (true) {
            Object objE = zjaVar.e(i2);
            if (objE == null || objE == BUFFERED.n) {
                if (j2 < (i.get(this) & 1152921504606846975L)) {
                    if (zjaVar.a(i2, objE, BUFFERED.m)) {
                        q();
                        return BUFFERED.g;
                    }
                } else {
                    if (obj == null) {
                        return BUFFERED.r;
                    }
                    if (zjaVar.a(i2, objE, obj)) {
                        q();
                        return BUFFERED.q;
                    }
                }
            } else if (objE == BUFFERED.f54168a) {
                if (zjaVar.a(i2, objE, BUFFERED.f)) {
                    q();
                    return zjaVar.c(i2);
                }
            } else {
                if (objE != BUFFERED.i && objE != BUFFERED.m) {
                    if (objE != BUFFERED.s()) {
                        if (objE != BUFFERED.p && zjaVar.a(i2, objE, BUFFERED.s)) {
                            boolean z = objE instanceof zji;
                            if (z) {
                                objE = ((zji) objE).e;
                            }
                            if (c(objE, zjaVar, i2)) {
                                zjaVar.a(i2, BUFFERED.f);
                                q();
                                return zjaVar.c(i2);
                            }
                            zjaVar.a(i2, BUFFERED.i);
                            zjaVar.a(i2, false);
                            if (z) {
                                q();
                            }
                            return BUFFERED.g;
                        }
                    } else {
                        q();
                        return BUFFERED.g;
                    }
                }
                return BUFFERED.g;
            }
        }
    }

    private final boolean c(Object obj, zja<E> zjaVar, int i2) {
        if (obj instanceof CancellableContinuation) {
            zcp.e(obj, "");
            return BUFFERED.e((CancellableContinuation) obj, yzc.e, null, 2, null);
        }
        if (obj instanceof SelectInstance) {
            zcp.e(obj, "");
            TrySelectDetailedResult trySelectDetailedResultB = ((znl) obj).b(this, yzc.e);
            if (trySelectDetailedResultB == TrySelectDetailedResult.REREGISTER) {
                zjaVar.d(i2);
            }
            return trySelectDetailedResultB == TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof c) {
            return BUFFERED.e(((c) obj).c(), true, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final void q() {
        if (s()) {
            return;
        }
        zja<E> zjaVar = (zja) f54142c.get(this);
        while (true) {
            long andIncrement = f54141a.getAndIncrement(this);
            long j2 = andIncrement / ((long) BUFFERED.d);
            if (h() <= andIncrement) {
                if (zjaVar.id < j2 && zjaVar.getNext() != 0) {
                    c(j2, zjaVar);
                }
                c(this, 0L, 1, (Object) null);
                return;
            }
            if (zjaVar.id != j2) {
                zja<E> zjaVarA = a(j2, zjaVar, andIncrement);
                if (zjaVarA == null) {
                    continue;
                } else {
                    zjaVar = zjaVarA;
                }
            }
            if (d(zjaVar, (int) (andIncrement % ((long) BUFFERED.d)), andIncrement)) {
                c(this, 0L, 1, (Object) null);
                return;
            }
            c(this, 0L, 1, (Object) null);
        }
    }

    private final boolean d(zja<E> zjaVar, int i2, long j2) {
        Object objE = zjaVar.e(i2);
        if ((objE instanceof Waiter) && j2 >= g.get(this) && zjaVar.a(i2, objE, BUFFERED.p)) {
            if (!c(objE, zjaVar, i2)) {
                zjaVar.a(i2, BUFFERED.i);
                zjaVar.a(i2, false);
                return false;
            }
            zjaVar.a(i2, BUFFERED.f54168a);
            return true;
        }
        return e(zjaVar, i2, j2);
    }

    private final boolean e(zja<E> zjaVar, int i2, long j2) {
        while (true) {
            Object objE = zjaVar.e(i2);
            if (objE instanceof Waiter) {
                if (j2 >= g.get(this)) {
                    if (zjaVar.a(i2, objE, BUFFERED.p)) {
                        if (!c(objE, zjaVar, i2)) {
                            zjaVar.a(i2, BUFFERED.i);
                            zjaVar.a(i2, false);
                            return false;
                        }
                        zjaVar.a(i2, BUFFERED.f54168a);
                        return true;
                    }
                } else if (zjaVar.a(i2, objE, new zji((Waiter) objE))) {
                    return true;
                }
            } else {
                if (objE == BUFFERED.i) {
                    return false;
                }
                if (objE == null) {
                    if (zjaVar.a(i2, objE, BUFFERED.n)) {
                        return true;
                    }
                } else {
                    if (objE == BUFFERED.f54168a || objE == BUFFERED.m || objE == BUFFERED.f || objE == BUFFERED.j || objE == BUFFERED.s()) {
                        return true;
                    }
                    if (objE != BUFFERED.s) {
                        throw new IllegalStateException(("Unexpected cell state: " + objE).toString());
                    }
                }
            }
        }
    }

    static /* synthetic */ void c(zir zirVar, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i2 & 1) != 0) {
            j2 = 1;
        }
        zirVar.f(j2);
    }

    private final void f(long j2) {
        if ((j.addAndGet(this, j2) & 4611686018427387904L) != 0) {
            while ((j.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void e(long j2) {
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        if (s()) {
            return;
        }
        while (p() <= j2) {
        }
        int i2 = BUFFERED.h;
        for (int i3 = 0; i3 < i2; i3++) {
            long jP = p();
            if (jP == (4611686018427387903L & j.get(this)) && jP == p()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = j;
        do {
            j3 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, BUFFERED.e(j3 & 4611686018427387903L, true)));
        while (true) {
            long jP2 = p();
            atomicLongFieldUpdater = j;
            long j5 = atomicLongFieldUpdater.get(this);
            long j6 = j5 & 4611686018427387903L;
            boolean z = (4611686018427387904L & j5) != 0;
            if (jP2 == j6 && jP2 == p()) {
                break;
            } else if (!z) {
                atomicLongFieldUpdater.compareAndSet(this, j5, BUFFERED.e(j6, true));
            }
        }
        do {
            j4 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, BUFFERED.e(j4 & 4611686018427387903L, false)));
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class i extends zcn implements Function3<zir<?>, SelectInstance<?>, Object, yzc> {
        public static final i d = new i();

        public final void c(zir<?> zirVar, SelectInstance<?> selectInstance, Object obj) {
            zirVar.e(selectInstance, obj);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ yzc invoke(zir<?> zirVar, SelectInstance<?> selectInstance, Object obj) {
            c(zirVar, selectInstance, obj);
            return yzc.e;
        }

        i() {
            super(3, zir.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class h extends zcn implements Function3<zir<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f54150a = new h();

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zir<?> zirVar, Object obj, Object obj2) {
            return zirVar.a(obj, obj2);
        }

        h() {
            super(3, zir.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, zir<E>> getOnSend() {
        i iVar = i.d;
        zcp.e(iVar, "");
        Function3 function3 = (Function3) zcy.c(iVar, 3);
        h hVar = h.f54150a;
        zcp.e(hVar, "");
        return new znf(this, function3, (Function3) zcy.c(hVar, 3), null, 8, null);
    }

    private final void b(E e2, SelectInstance<?> selectInstance) {
        Function1<E, yzc> function1 = this.f54143b;
        if (function1 != null) {
            bindCancellationFun.d(function1, e2, selectInstance.getF54350b());
        }
        selectInstance.selectInRegistrationPhase(BUFFERED.s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Object obj, Object obj2) throws Throwable {
        if (obj2 != BUFFERED.s()) {
            return this;
        }
        throw f();
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class a extends zcn implements Function3<zir<?>, SelectInstance<?>, Object, yzc> {
        public static final a d = new a();

        public final void a(zir<?> zirVar, SelectInstance<?> selectInstance, Object obj) {
            zirVar.b(selectInstance, obj);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ yzc invoke(zir<?> zirVar, SelectInstance<?> selectInstance, Object obj) {
            a(zirVar, selectInstance, obj);
            return yzc.e;
        }

        a() {
            super(3, zir.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class b extends zcn implements Function3<zir<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f54144c = new b();

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zir<?> zirVar, Object obj, Object obj2) {
            return zirVar.c(obj, obj2);
        }

        b() {
            super(3, zir.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceive() {
        a aVar = a.d;
        zcp.e(aVar, "");
        Function3 function3 = (Function3) zcy.c(aVar, 3);
        b bVar = b.f54144c;
        zcp.e(bVar, "");
        return new zne(this, function3, (Function3) zcy.c(bVar, 3), this.l);
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class e extends zcn implements Function3<zir<?>, SelectInstance<?>, Object, yzc> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f54148a = new e();

        public final void e(zir<?> zirVar, SelectInstance<?> selectInstance, Object obj) {
            zirVar.b(selectInstance, obj);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ yzc invoke(zir<?> zirVar, SelectInstance<?> selectInstance, Object obj) {
            e(zirVar, selectInstance, obj);
            return yzc.e;
        }

        e() {
            super(3, zir.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class g extends zcn implements Function3<zir<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f54149a = new g();

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zir<?> zirVar, Object obj, Object obj2) {
            return zirVar.b(obj, obj2);
        }

        g() {
            super(3, zir.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<ziw<E>> getOnReceiveCatching() {
        e eVar = e.f54148a;
        zcp.e(eVar, "");
        Function3 function3 = (Function3) zcy.c(eVar, 3);
        g gVar = g.f54149a;
        zcp.e(gVar, "");
        return new zne(this, function3, (Function3) zcy.c(gVar, 3), this.l);
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class j extends zcn implements Function3<zir<?>, SelectInstance<?>, Object, yzc> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f54151b = new j();

        public final void a(zir<?> zirVar, SelectInstance<?> selectInstance, Object obj) {
            zirVar.b(selectInstance, obj);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ yzc invoke(zir<?> zirVar, SelectInstance<?> selectInstance, Object obj) {
            a(zirVar, selectInstance, obj);
            return yzc.e;
        }

        j() {
            super(3, zir.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class f extends zcn implements Function3<zir<?>, Object, Object, Object> {
        public static final f d = new f();

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zir<?> zirVar, Object obj, Object obj2) {
            return zirVar.e(obj, obj2);
        }

        f() {
            super(3, zir.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceiveOrNull() {
        j jVar = j.f54151b;
        zcp.e(jVar, "");
        Function3 function3 = (Function3) zcy.c(jVar, 3);
        f fVar = f.d;
        zcp.e(fVar, "");
        return new zne(this, function3, (Function3) zcy.c(fVar, 3), this.l);
    }

    private final void e(SelectInstance<?> selectInstance) {
        selectInstance.selectInRegistrationPhase(BUFFERED.s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(Object obj, Object obj2) throws Throwable {
        if (obj2 != BUFFERED.s()) {
            return obj2;
        }
        throw r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(Object obj, Object obj2) throws Throwable {
        if (obj2 != BUFFERED.s()) {
            return obj2;
        }
        if (a() == null) {
            return null;
        }
        throw r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(Object obj, Object obj2) {
        return ziw.c(obj2 == BUFFERED.s() ? ziw.d.b(a()) : ziw.d.d(obj2));
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "", "", ExifInterface.LONGITUDE_EAST, "select", "Lkotlinx/coroutines/selects/SelectInstance;", "<anonymous parameter 1>", "", FunctionSetBeanReader.BI_ELEMENT, TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends Lambda implements Function3<SelectInstance<?>, Object, Object, Function1<? super Throwable, ? extends yzc>> {
        final /* synthetic */ zir<E> d;

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Function1<Throwable, yzc> invoke(final SelectInstance<?> selectInstance, Object obj, final Object obj2) {
            final zir<E> zirVar = this.d;
            return new Function1<Throwable, yzc>() { // from class: zir.k.3
                public final void c(Throwable th) {
                    if (obj2 != BUFFERED.s()) {
                        bindCancellationFun.d(zirVar.f54143b, obj2, selectInstance.getF54350b());
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ yzc invoke(Throwable th) {
                    c(th);
                    return yzc.e;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            };
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(zir<E> zirVar) {
            super(3);
            this.d = zirVar;
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return new d();
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0011\u0010\t\u001a\u00020\u0006H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\nJ/\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0013\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0014R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator;", "Lkotlinx/coroutines/channels/ChannelIterator;", "Lkotlinx/coroutines/Waiter;", "(Lkotlinx/coroutines/channels/BufferedChannel;)V", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "", "receiveResult", "", "hasNext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNextOnNoWaiterSuspend", "segment", "Lkotlinx/coroutines/channels/ChannelSegment;", "index", "", "r", "", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeOnCancellation", "", "Lkotlinx/coroutines/internal/Segment;", "next", "()Ljava/lang/Object;", "onClosedHasNext", "onClosedHasNextNoWaiterSuspend", "tryResumeHasNext", FunctionSetBeanReader.BI_ELEMENT, "(Ljava/lang/Object;)Z", "tryResumeHasNextOnClosedChannel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class d implements ChannelIterator<E>, Waiter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private zgf<? super Boolean> f54146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f54147c = BUFFERED.l;

        public d() {
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ Object next(Continuation continuation) {
            return ChannelIterator.d.d(this, continuation);
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object hasNext(Continuation<? super Boolean> continuation) {
            zja<E> zjaVar;
            zir<E> zirVar = zir.this;
            zja<E> zjaVar2 = (zja) zir.f.get(zirVar);
            while (!zirVar.isClosedForReceive()) {
                long andIncrement = zir.g.getAndIncrement(zirVar);
                long j = andIncrement / ((long) BUFFERED.d);
                int i = (int) (andIncrement % ((long) BUFFERED.d));
                if (zjaVar2.id != j) {
                    zja<E> zjaVarB = zirVar.b(j, zjaVar2);
                    if (zjaVarB == null) {
                        continue;
                    } else {
                        zjaVar = zjaVarB;
                    }
                } else {
                    zjaVar = zjaVar2;
                }
                Object objD = zirVar.d(zjaVar, i, andIncrement, (Object) null);
                if (objD != BUFFERED.q) {
                    if (objD != BUFFERED.g) {
                        if (objD == BUFFERED.r) {
                            return c(zjaVar, i, andIncrement, continuation);
                        }
                        zjaVar.cleanPrev();
                        this.f54147c = objD;
                        return boxBoolean.d(true);
                    }
                    if (andIncrement < zirVar.h()) {
                        zjaVar.cleanPrev();
                    }
                    zjaVar2 = zjaVar;
                } else {
                    throw new IllegalStateException("unreachable".toString());
                }
            }
            return boxBoolean.d(d());
        }

        private final boolean d() throws Throwable {
            this.f54147c = BUFFERED.s();
            Throwable thA = zir.this.a();
            if (thA == null) {
                return false;
            }
            throw ARTIFICIAL_FRAME.c(thA);
        }

        private final Object c(zja<E> zjaVar, int i, long j, Continuation<? super Boolean> continuation) {
            Boolean boolD;
            Function1<E, yzc> function1;
            CoroutineContext f54257c;
            zir<E> zirVar = zir.this;
            zgf zgfVarC = getOrCreateCancellableContinuation.c(zbg.c(continuation));
            try {
                this.f54146b = zgfVarC;
                Object objD = zirVar.d(zjaVar, i, j, this);
                if (objD != BUFFERED.q) {
                    Function1<Throwable, yzc> function1E = null;
                    function1E = null;
                    if (objD == BUFFERED.g) {
                        if (j < zirVar.h()) {
                            zjaVar.cleanPrev();
                        }
                        zja zjaVar2 = (zja) zir.f.get(zirVar);
                        while (true) {
                            if (zirVar.isClosedForReceive()) {
                                c();
                            } else {
                                long andIncrement = zir.g.getAndIncrement(zirVar);
                                long j2 = andIncrement / ((long) BUFFERED.d);
                                int i2 = (int) (andIncrement % ((long) BUFFERED.d));
                                if (zjaVar2.id != j2) {
                                    zja zjaVarB = zirVar.b(j2, zjaVar2);
                                    if (zjaVarB != null) {
                                        zjaVar2 = zjaVarB;
                                    }
                                }
                                objD = zirVar.d(zjaVar2, i2, andIncrement, this);
                                if (objD != BUFFERED.q) {
                                    if (objD == BUFFERED.g) {
                                        if (andIncrement < zirVar.h()) {
                                            zjaVar2.cleanPrev();
                                        }
                                    } else {
                                        if (objD == BUFFERED.r) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        zjaVar2.cleanPrev();
                                        this.f54147c = objD;
                                        this.f54146b = null;
                                        boolD = boxBoolean.d(true);
                                        function1 = zirVar.f54143b;
                                        if (function1 != null) {
                                            f54257c = zgfVarC.getF54257c();
                                            function1E = bindCancellationFun.e(function1, objD, f54257c);
                                        }
                                        zgfVarC.resume(boolD, function1E);
                                    }
                                } else {
                                    d dVar = this instanceof Waiter ? this : null;
                                    if (dVar != null) {
                                        zirVar.b(dVar, zjaVar2, i2);
                                    }
                                }
                            }
                        }
                    } else {
                        zjaVar.cleanPrev();
                        this.f54147c = objD;
                        this.f54146b = null;
                        boolD = boxBoolean.d(true);
                        function1 = zirVar.f54143b;
                        if (function1 != null) {
                            f54257c = zgfVarC.getF54257c();
                            function1E = bindCancellationFun.e(function1, objD, f54257c);
                        }
                        zgfVarC.resume(boolD, function1E);
                    }
                } else {
                    zirVar.b(this, zjaVar, i);
                }
                Object objB = zgfVarC.b();
                if (objB == zbg.a()) {
                    probeCoroutineCreated.e(continuation);
                }
                return objB;
            } catch (Throwable th) {
                zgfVarC.a();
                throw th;
            }
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int index) {
            zgf<? super Boolean> zgfVar = this.f54146b;
            if (zgfVar != null) {
                zgfVar.invokeOnCancellation(segment, index);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c() {
            zgf<? super Boolean> zgfVar = this.f54146b;
            zcp.e(zgfVar);
            this.f54146b = null;
            this.f54147c = BUFFERED.s();
            Throwable thA = zir.this.a();
            if (thA == null) {
                yyt.c cVar = yyt.f53903b;
                zgfVar.resumeWith(yyt.e(false));
                return;
            }
            zgf<? super Boolean> zgfVar2 = zgfVar;
            if (ASSERTIONS_ENABLED.b() && (zgfVar2 instanceof CoroutineStackFrame)) {
                thA = ARTIFICIAL_FRAME.d(thA, zgfVar2);
            }
            yyt.c cVar2 = yyt.f53903b;
            zgfVar2.resumeWith(yyt.e(createFailure.a(thA)));
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() throws Throwable {
            E e = (E) this.f54147c;
            if (e != BUFFERED.l) {
                this.f54147c = BUFFERED.l;
                if (e != BUFFERED.s()) {
                    return e;
                }
                throw ARTIFICIAL_FRAME.c(zir.this.r());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }

        public final boolean a(E e) {
            zgf<? super Boolean> zgfVar = this.f54146b;
            zcp.e(zgfVar);
            this.f54146b = null;
            this.f54147c = e;
            zgf<? super Boolean> zgfVar2 = zgfVar;
            Function1<E, yzc> function1 = zir.this.f54143b;
            return BUFFERED.e(zgfVar2, true, function1 != null ? bindCancellationFun.e(function1, e, zgfVar.getF54257c()) : null);
        }

        public final void e() {
            zgf<? super Boolean> zgfVar = this.f54146b;
            zcp.e(zgfVar);
            this.f54146b = null;
            this.f54147c = BUFFERED.s();
            Throwable thA = zir.this.a();
            if (thA == null) {
                yyt.c cVar = yyt.f53903b;
                zgfVar.resumeWith(yyt.e(false));
                return;
            }
            zgf<? super Boolean> zgfVar2 = zgfVar;
            if (ASSERTIONS_ENABLED.b() && (zgfVar2 instanceof CoroutineStackFrame)) {
                thA = ARTIFICIAL_FRAME.d(thA, zgfVar2);
            }
            yyt.c cVar2 = yyt.f53903b;
            zgfVar2.resumeWith(yyt.e(createFailure.a(thA)));
        }
    }

    protected final Throwable a() {
        return (Throwable) e.get(this);
    }

    protected final Throwable f() {
        Throwable thA = a();
        return thA == null ? new zjd("Channel was closed") : thA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable r() {
        Throwable thA = a();
        return thA == null ? new zje("Channel was closed") : thA;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable cause) {
        return d(cause, false);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(Throwable cause) {
        return a(cause);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        a((Throwable) null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(CancellationException cause) {
        a(cause);
    }

    public boolean a(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return d(th, true);
    }

    protected boolean d(Throwable th, boolean z) {
        if (z) {
            w();
        }
        boolean zM = AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(e, this, BUFFERED.o, th);
        if (z) {
            x();
        } else {
            u();
        }
        o();
        l();
        if (zM) {
            t();
        }
        return zM;
    }

    private final void t() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, obj == null ? BUFFERED.f54169b : BUFFERED.e));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(a());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(Function1<? super Throwable, yzc> handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, null, handler)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != BUFFERED.f54169b) {
                if (obj == BUFFERED.e) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(d, this, BUFFERED.f54169b, BUFFERED.e));
        handler.invoke(a());
    }

    private final void u() {
        long j2;
        long jE;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            int i2 = (int) (j2 >> 60);
            if (i2 == 0) {
                jE = BUFFERED.e(j2 & 1152921504606846975L, 2);
            } else if (i2 != 1) {
                return;
            } else {
                jE = BUFFERED.e(j2 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, jE));
    }

    private final void x() {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        do {
            j2 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, BUFFERED.e(1152921504606846975L & j2, 3)));
    }

    private final void w() {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (((int) (j2 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, BUFFERED.e(1152921504606846975L & j2, 1)));
    }

    private final void o() {
        isClosedForSend();
    }

    private final zja<E> d(long j2) {
        zja<E> zjaVarM = m();
        if (g()) {
            long jD = d(zjaVarM);
            if (jD != -1) {
                b(jD);
            }
        }
        c(zjaVarM, j2);
        return zjaVarM;
    }

    private final void a(long j2) {
        e(d(j2));
    }

    private final zja<E> m() {
        Object obj = f54142c.get(this);
        zja zjaVar = (zja) h.get(this);
        if (zjaVar.id > ((zja) obj).id) {
            obj = zjaVar;
        }
        zja zjaVar2 = (zja) f.get(this);
        if (zjaVar2.id > ((zja) obj).id) {
            obj = zjaVar2;
        }
        return (zja) CLOSED.c((ConcurrentLinkedListNode) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long d(zja<E> zjaVar) {
        do {
            int i2 = BUFFERED.d;
            while (true) {
                i2--;
                if (-1 < i2) {
                    long j2 = (zjaVar.id * ((long) BUFFERED.d)) + ((long) i2);
                    if (j2 >= j()) {
                        while (true) {
                            Object objE = zjaVar.e(i2);
                            if (objE == null || objE == BUFFERED.n) {
                                if (zjaVar.a(i2, objE, BUFFERED.s())) {
                                    zjaVar.onSlotCleaned();
                                    break;
                                }
                            } else {
                                if (objE != BUFFERED.f54168a) {
                                    break;
                                }
                                return j2;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            zjaVar = (zja) zjaVar.getPrev();
        } while (zjaVar != null);
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e(zja<E> zjaVar) {
        Function1<E, yzc> function1 = this.f54143b;
        zmn zmnVarC = null;
        Object objD = zlq.d(null, 1, null);
        loop0: do {
            for (int i2 = BUFFERED.d - 1; -1 < i2; i2--) {
                long j2 = (zjaVar.id * ((long) BUFFERED.d)) + ((long) i2);
                while (true) {
                    Object objE = zjaVar.e(i2);
                    if (objE == BUFFERED.f) {
                        break loop0;
                    }
                    if (objE != BUFFERED.f54168a) {
                        if (objE == BUFFERED.n || objE == null) {
                            if (zjaVar.a(i2, objE, BUFFERED.s())) {
                                zjaVar.onSlotCleaned();
                                break;
                            }
                        } else if (!(objE instanceof Waiter) && !(objE instanceof zji)) {
                            if (objE != BUFFERED.p && objE != BUFFERED.s) {
                                if (objE != BUFFERED.p) {
                                    break;
                                }
                            } else {
                                break loop0;
                            }
                        } else {
                            if (j2 < j()) {
                                break loop0;
                            }
                            Waiter waiter = objE instanceof zji ? ((zji) objE).e : (Waiter) objE;
                            if (zjaVar.a(i2, objE, BUFFERED.s())) {
                                if (function1 != null) {
                                    zmnVarC = bindCancellationFun.c(function1, zjaVar.a(i2), zmnVarC);
                                }
                                objD = zlq.a(objD, waiter);
                                zjaVar.d(i2);
                                zjaVar.onSlotCleaned();
                                break;
                            }
                        }
                    } else {
                        if (j2 < j()) {
                            break loop0;
                        }
                        if (zjaVar.a(i2, objE, BUFFERED.s())) {
                            if (function1 != null) {
                                zmnVarC = bindCancellationFun.c(function1, zjaVar.a(i2), zmnVarC);
                            }
                            zjaVar.d(i2);
                            zjaVar.onSlotCleaned();
                            break;
                        }
                    }
                }
            }
            zjaVar = (zja) zjaVar.getPrev();
        } while (zjaVar != null);
        if (objD != null) {
            if (!(objD instanceof ArrayList)) {
                c((Waiter) objD);
            } else {
                zcp.e(objD, "");
                ArrayList arrayList = (ArrayList) objD;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    c((Waiter) arrayList.get(size));
                }
            }
        }
        if (zmnVarC != null) {
            throw zmnVarC;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(zja<E> zjaVar, long j2) {
        Object objD = zlq.d(null, 1, null);
        loop0: while (zjaVar != null) {
            for (int i2 = BUFFERED.d - 1; -1 < i2; i2--) {
                if ((zjaVar.id * ((long) BUFFERED.d)) + ((long) i2) < j2) {
                    break loop0;
                }
                while (true) {
                    Object objE = zjaVar.e(i2);
                    if (objE == null || objE == BUFFERED.n) {
                        if (zjaVar.a(i2, objE, BUFFERED.s())) {
                            zjaVar.onSlotCleaned();
                            break;
                        }
                    } else if (objE instanceof zji) {
                        if (zjaVar.a(i2, objE, BUFFERED.s())) {
                            objD = zlq.a(objD, ((zji) objE).e);
                            zjaVar.a(i2, true);
                            break;
                        }
                    } else {
                        if (!(objE instanceof Waiter)) {
                            break;
                        }
                        if (zjaVar.a(i2, objE, BUFFERED.s())) {
                            objD = zlq.a(objD, objE);
                            zjaVar.a(i2, true);
                            break;
                        }
                    }
                }
            }
            zjaVar = (zja) zjaVar.getPrev();
        }
        if (objD != null) {
            if (!(objD instanceof ArrayList)) {
                a((Waiter) objD);
                return;
            }
            zcp.e(objD, "");
            ArrayList arrayList = (ArrayList) objD;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                a((Waiter) arrayList.get(size));
            }
        }
    }

    private final void a(Waiter waiter) {
        a(waiter, true);
    }

    private final void c(Waiter waiter) {
        a(waiter, false);
    }

    private final void a(Waiter waiter, boolean z) {
        if (waiter instanceof c) {
            CancellableContinuation<Boolean> cancellableContinuationC = ((c) waiter).c();
            yyt.c cVar = yyt.f53903b;
            cancellableContinuationC.resumeWith(yyt.e(false));
            return;
        }
        if (waiter instanceof CancellableContinuation) {
            Continuation continuation = (Continuation) waiter;
            yyt.c cVar2 = yyt.f53903b;
            continuation.resumeWith(yyt.e(createFailure.a(z ? r() : f())));
        } else if (waiter instanceof zjk) {
            zgf<ziw<? extends E>> zgfVar = ((zjk) waiter).f54187a;
            yyt.c cVar3 = yyt.f53903b;
            zgfVar.resumeWith(yyt.e(ziw.c(ziw.d.b(a()))));
        } else if (waiter instanceof d) {
            ((d) waiter).e();
        } else if (waiter instanceof SelectInstance) {
            ((SelectInstance) waiter).trySelect(this, BUFFERED.s());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return i(i.get(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(long j2) {
        return b(j2, false);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return j(i.get(this));
    }

    private final boolean j(long j2) {
        return b(j2, true);
    }

    private final boolean b(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            d(j2 & 1152921504606846975L);
            return (z && i()) ? false : true;
        }
        if (i2 == 3) {
            a(j2 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i2).toString());
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if (isClosedForReceive() || i()) {
            return false;
        }
        return !isClosedForReceive();
    }

    public final boolean i() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            zja<E> zjaVarB = (zja) atomicReferenceFieldUpdater.get(this);
            long j2 = j();
            if (h() <= j2) {
                return false;
            }
            long j3 = j2 / ((long) BUFFERED.d);
            if (zjaVarB.id == j3 || (zjaVarB = b(j3, zjaVarB)) != null) {
                zjaVarB.cleanPrev();
                if (c(zjaVarB, (int) (j2 % ((long) BUFFERED.d)), j2)) {
                    return true;
                }
                g.compareAndSet(this, j2, j2 + 1);
            } else if (((zja) atomicReferenceFieldUpdater.get(this)).id < j3) {
                return false;
            }
        }
    }

    private final boolean c(zja<E> zjaVar, int i2, long j2) {
        Object objE;
        do {
            objE = zjaVar.e(i2);
            if (objE != null && objE != BUFFERED.n) {
                if (objE == BUFFERED.f54168a) {
                    return true;
                }
                if (objE == BUFFERED.i || objE == BUFFERED.s() || objE == BUFFERED.f || objE == BUFFERED.m) {
                    return false;
                }
                if (objE == BUFFERED.p) {
                    return true;
                }
                return objE != BUFFERED.s && j2 == j();
            }
        } while (!zjaVar.a(i2, objE, BUFFERED.m));
        q();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zja<E> e(long j2, zja<E> zjaVar) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        Function2 function2 = (Function2) BUFFERED.q();
        loop0: while (true) {
            objB = CLOSED.b(zjaVar, j2, function2);
            if (!zly.c(objB)) {
                Segment segmentD = zly.d(objB);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentD.id) {
                        break loop0;
                    }
                    if (!segmentD.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, segmentD)) {
                        if (!segment.decPointers$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        segment.remove();
                        break loop0;
                    }
                    if (segmentD.decPointers$kotlinx_coroutines_core()) {
                        segmentD.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (zly.c(objB)) {
            o();
            if (zjaVar.id * ((long) BUFFERED.d) < j()) {
                zjaVar.cleanPrev();
            }
            return null;
        }
        zja<E> zjaVar2 = (zja) zly.d(objB);
        if (zjaVar2.id > j2) {
            n(zjaVar2.id * ((long) BUFFERED.d));
            if (zjaVar2.id * ((long) BUFFERED.d) < j()) {
                zjaVar2.cleanPrev();
            }
            return null;
        }
        if (!ASSERTIONS_ENABLED.a() || zjaVar2.id == j2) {
            return zjaVar2;
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zja<E> b(long j2, zja<E> zjaVar) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        Function2 function2 = (Function2) BUFFERED.q();
        loop0: while (true) {
            objB = CLOSED.b(zjaVar, j2, function2);
            if (!zly.c(objB)) {
                Segment segmentD = zly.d(objB);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentD.id) {
                        break loop0;
                    }
                    if (!segmentD.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, segmentD)) {
                        if (!segment.decPointers$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        segment.remove();
                        break loop0;
                    }
                    if (segmentD.decPointers$kotlinx_coroutines_core()) {
                        segmentD.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (zly.c(objB)) {
            o();
            if (zjaVar.id * ((long) BUFFERED.d) < h()) {
                zjaVar.cleanPrev();
            }
            return null;
        }
        zja<E> zjaVar2 = (zja) zly.d(objB);
        if (!s() && j2 <= p() / ((long) BUFFERED.d)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f54142c;
            while (true) {
                Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                zja<E> zjaVar3 = zjaVar2;
                if (segment2.id >= zjaVar3.id || !zjaVar3.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, segment2, zjaVar3)) {
                    if (!segment2.decPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    segment2.remove();
                    break;
                }
                if (zjaVar3.decPointers$kotlinx_coroutines_core()) {
                    zjaVar3.remove();
                }
            }
        }
        if (zjaVar2.id > j2) {
            h(zjaVar2.id * ((long) BUFFERED.d));
            if (zjaVar2.id * ((long) BUFFERED.d) < h()) {
                zjaVar2.cleanPrev();
            }
            return null;
        }
        if (!ASSERTIONS_ENABLED.a() || zjaVar2.id == j2) {
            return zjaVar2;
        }
        throw new AssertionError();
    }

    private final zja<E> a(long j2, zja<E> zjaVar, long j3) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54142c;
        Function2 function2 = (Function2) BUFFERED.q();
        loop0: while (true) {
            objB = CLOSED.b(zjaVar, j2, function2);
            if (!zly.c(objB)) {
                Segment segmentD = zly.d(objB);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentD.id) {
                        break loop0;
                    }
                    if (!segmentD.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, segmentD)) {
                        if (!segment.decPointers$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        segment.remove();
                        break loop0;
                    }
                    if (segmentD.decPointers$kotlinx_coroutines_core()) {
                        segmentD.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (zly.c(objB)) {
            o();
            c(j2, zjaVar);
            c(this, 0L, 1, (Object) null);
            return null;
        }
        zja<E> zjaVar2 = (zja) zly.d(objB);
        if (zjaVar2.id > j2) {
            if (f54141a.compareAndSet(this, j3 + 1, ((long) BUFFERED.d) * zjaVar2.id)) {
                f((zjaVar2.id * ((long) BUFFERED.d)) - j3);
            } else {
                c(this, 0L, 1, (Object) null);
            }
            return null;
        }
        if (!ASSERTIONS_ENABLED.a() || zjaVar2.id == j2) {
            return zjaVar2;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(long j2, zja<E> zjaVar) {
        zja<E> zjaVar2;
        zja<E> zjaVar3;
        while (zjaVar.id < j2 && (zjaVar3 = (zja) zjaVar.getNext()) != null) {
            zjaVar = zjaVar3;
        }
        while (true) {
            if (!zjaVar.isRemoved() || (zjaVar2 = (zja) zjaVar.getNext()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54142c;
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    zja<E> zjaVar4 = zjaVar;
                    if (segment.id >= zjaVar4.id) {
                        return;
                    }
                    if (!zjaVar4.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, zjaVar4)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                            return;
                        }
                        return;
                    } else if (zjaVar4.decPointers$kotlinx_coroutines_core()) {
                        zjaVar4.remove();
                    }
                }
            } else {
                zjaVar = zjaVar2;
            }
        }
    }

    private final void n(long j2) {
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j2) {
                return;
            }
        } while (!i.compareAndSet(this, j3, BUFFERED.e(j4, (int) (j3 >> 60))));
    }

    private final void h(long j2) {
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j2) {
                return;
            }
        } while (!g.compareAndSet(this, j3, j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (i.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.o + ',');
        sb.append("data=[");
        int i3 = 0;
        List listC = yzp.c(f.get(this), h.get(this), f54142c.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (((zja) obj) != BUFFERED.k) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((zja) next).id;
            do {
                Object next2 = it.next();
                long j3 = ((zja) next2).id;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        zja zjaVar = (zja) next;
        long j4 = j();
        long jH = h();
        loop2: while (true) {
            int i4 = BUFFERED.d;
            for (int i5 = i3; i5 < i4; i5++) {
                long j5 = (zjaVar.id * ((long) BUFFERED.d)) + ((long) i5);
                if (j5 >= jH && j5 >= j4) {
                    break loop2;
                }
                Object objE = zjaVar.e(i5);
                Object objA = zjaVar.a(i5);
                if (objE instanceof CancellableContinuation) {
                    if (j5 < j4 && j5 >= jH) {
                        string = "receive";
                    } else if (j5 < jH && j5 >= j4) {
                        string = "send";
                    } else {
                        string = "cont";
                    }
                } else if (objE instanceof SelectInstance) {
                    if (j5 < j4 && j5 >= jH) {
                        string = "onReceive";
                    } else if (j5 < jH && j5 >= j4) {
                        string = "onSend";
                    } else {
                        string = "select";
                    }
                } else if (objE instanceof zjk) {
                    string = "receiveCatching";
                } else if (objE instanceof c) {
                    string = "sendBroadcast";
                } else if (objE instanceof zji) {
                    string = "EB(" + objE + g4.l;
                } else if (zcp.b(objE, BUFFERED.s) || zcp.b(objE, BUFFERED.p)) {
                    string = "resuming_sender";
                } else {
                    if (objE != null && !zcp.b(objE, BUFFERED.n) && !zcp.b(objE, BUFFERED.f) && !zcp.b(objE, BUFFERED.m) && !zcp.b(objE, BUFFERED.j) && !zcp.b(objE, BUFFERED.i) && !zcp.b(objE, BUFFERED.s())) {
                        string = objE.toString();
                    }
                }
                if (objA != null) {
                    sb.append(Constants.LEFT_BRACKET_ONLY + string + ',' + objA + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            zjaVar = (zja) zjaVar.getNext();
            if (zjaVar == null) {
                break;
            }
            i3 = 0;
        }
        if (zes.h(sb) == ',') {
            zcp.b((Object) sb.deleteCharAt(sb.length() - 1), "");
        }
        sb.append("]");
        return sb.toString();
    }

    private final Object d(E e2, Continuation<? super yzc> continuation) {
        zmn zmnVarC;
        zgf zgfVar = new zgf(zbg.c(continuation), 1);
        zgfVar.initCancellability();
        zgf zgfVar2 = zgfVar;
        Function1<E, yzc> function1 = this.f54143b;
        if (function1 != null && (zmnVarC = bindCancellationFun.c(function1, e2, null, 2, null)) != null) {
            zmn zmnVarD = zmnVarC;
            yyl.d(zmnVarD, f());
            zgf zgfVar3 = zgfVar2;
            yyt.c cVar = yyt.f53903b;
            if (ASSERTIONS_ENABLED.b() && (zgfVar3 instanceof CoroutineStackFrame)) {
                zmnVarD = ARTIFICIAL_FRAME.d(zmnVarD, zgfVar3);
            }
            zgfVar3.resumeWith(yyt.e(createFailure.a(zmnVarD)));
        } else {
            zgf zgfVar4 = zgfVar2;
            Throwable thF = f();
            yyt.c cVar2 = yyt.f53903b;
            if (ASSERTIONS_ENABLED.b() && (zgfVar4 instanceof CoroutineStackFrame)) {
                thF = ARTIFICIAL_FRAME.d(thF, zgfVar4);
            }
            zgfVar4.resumeWith(yyt.e(createFailure.a(thF)));
        }
        Object objB = zgfVar.b();
        if (objB == zbg.a()) {
            probeCoroutineCreated.e(continuation);
        }
        return objB == zbg.a() ? objB : yzc.e;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0120  */
    /* JADX WARN: Code duplicated, block: B:63:0x0129 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x012a  */
    private final Object c(zja<E> zjaVar, int i2, E e2, long j2, Continuation<? super yzc> continuation) {
        zgf zgfVar;
        yzc yzcVar;
        Object objB;
        zgf zgfVarC = getOrCreateCancellableContinuation.c(zbg.c(continuation));
        try {
            int iB = b(zjaVar, i2, e2, j2, zgfVarC, false);
            if (iB == 0) {
                zjaVar.cleanPrev();
                zgfVar = zgfVarC;
                yyt.c cVar = yyt.f53903b;
                yzcVar = yzc.e;
            } else {
                if (iB != 1) {
                    if (iB != 2) {
                        if (iB != 4) {
                            if (iB != 5) {
                                throw new IllegalStateException("unexpected".toString());
                            }
                            zjaVar.cleanPrev();
                            zja zjaVar2 = (zja) h.get(this);
                            while (true) {
                                long andIncrement = i.getAndIncrement(this);
                                long j3 = andIncrement & 1152921504606846975L;
                                boolean zI = i(andIncrement);
                                long j4 = j3 / ((long) BUFFERED.d);
                                int i3 = (int) (j3 % ((long) BUFFERED.d));
                                if (zjaVar2.id != j4) {
                                    zja zjaVarE = e(j4, zjaVar2);
                                    if (zjaVarE != null) {
                                        zjaVar2 = zjaVarE;
                                    } else if (zI) {
                                    }
                                }
                                int iB2 = b(zjaVar2, i3, e2, j3, zgfVarC, zI);
                                if (iB2 == 0) {
                                    zjaVar2.cleanPrev();
                                    zgfVar = zgfVarC;
                                    yyt.c cVar2 = yyt.f53903b;
                                    yzcVar = yzc.e;
                                } else if (iB2 == 1) {
                                    zgfVar = zgfVarC;
                                    yyt.c cVar3 = yyt.f53903b;
                                    yzcVar = yzc.e;
                                } else if (iB2 != 2) {
                                    if (iB2 == 3) {
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                    if (iB2 != 4) {
                                        if (iB2 == 5) {
                                            zjaVar2.cleanPrev();
                                        }
                                    } else if (j3 < j()) {
                                        zjaVar2.cleanPrev();
                                    }
                                } else if (zI) {
                                    zjaVar2.onSlotCleaned();
                                } else {
                                    zgf zgfVar2 = zgfVarC instanceof Waiter ? zgfVarC : null;
                                    if (zgfVar2 != null) {
                                        c((Waiter) zgfVar2, zjaVar2, i3);
                                    }
                                }
                            }
                        } else if (j2 < j()) {
                            zjaVar.cleanPrev();
                        }
                        b((Object) e2, (CancellableContinuation<? super yzc>) zgfVarC);
                    } else {
                        c((Waiter) zgfVarC, (zja) zjaVar, i2);
                    }
                    objB = zgfVarC.b();
                    if (objB == zbg.a()) {
                        probeCoroutineCreated.e(continuation);
                    }
                    if (objB == zbg.a()) {
                        return objB;
                    }
                    return yzc.e;
                }
                zgfVar = zgfVarC;
                yyt.c cVar4 = yyt.f53903b;
                yzcVar = yzc.e;
            }
            zgfVar.resumeWith(yyt.e(yzcVar));
            objB = zgfVarC.b();
            if (objB == zbg.a()) {
                probeCoroutineCreated.e(continuation);
            }
            if (objB == zbg.a()) {
                return objB;
            }
            return yzc.e;
        } catch (Throwable th) {
            zgfVarC.a();
            throw th;
        }
    }

    private final Object d(zja<E> zjaVar, int i2, long j2, Continuation<? super E> continuation) {
        Function1<E, yzc> function1;
        CoroutineContext f54257c;
        zgf zgfVarC = getOrCreateCancellableContinuation.c(zbg.c(continuation));
        try {
            Object objD = d((zja) zjaVar, i2, j2, (Object) zgfVarC);
            if (objD != BUFFERED.q) {
                Function1<Throwable, yzc> function1E = null;
                function1E = null;
                if (objD == BUFFERED.g) {
                    if (j2 < h()) {
                        zjaVar.cleanPrev();
                    }
                    zja zjaVar2 = (zja) f.get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            d(zgfVarC);
                        } else {
                            long andIncrement = g.getAndIncrement(this);
                            long j3 = andIncrement / ((long) BUFFERED.d);
                            int i3 = (int) (andIncrement % ((long) BUFFERED.d));
                            if (zjaVar2.id != j3) {
                                zja zjaVarB = b(j3, zjaVar2);
                                if (zjaVarB != null) {
                                    zjaVar2 = zjaVarB;
                                }
                            }
                            objD = d(zjaVar2, i3, andIncrement, (Object) zgfVarC);
                            if (objD != BUFFERED.q) {
                                if (objD == BUFFERED.g) {
                                    if (andIncrement < h()) {
                                        zjaVar2.cleanPrev();
                                    }
                                } else {
                                    if (objD == BUFFERED.r) {
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                    zjaVar2.cleanPrev();
                                    function1 = this.f54143b;
                                    if (function1 != null) {
                                        f54257c = zgfVarC.getF54257c();
                                        function1E = bindCancellationFun.e(function1, objD, f54257c);
                                    }
                                    zgfVarC.resume(objD, function1E);
                                }
                            } else {
                                zgf zgfVar = zgfVarC instanceof Waiter ? zgfVarC : null;
                                if (zgfVar != null) {
                                    b(zgfVar, zjaVar2, i3);
                                }
                            }
                        }
                    }
                } else {
                    zjaVar.cleanPrev();
                    function1 = this.f54143b;
                    if (function1 != null) {
                        f54257c = zgfVarC.getF54257c();
                        function1E = bindCancellationFun.e(function1, objD, f54257c);
                    }
                    zgfVarC.resume(objD, function1E);
                }
            } else {
                b(zgfVarC, zjaVar, i2);
            }
            Object objB = zgfVarC.b();
            if (objB == zbg.a()) {
                probeCoroutineCreated.e(continuation);
            }
            return objB;
        } catch (Throwable th) {
            zgfVarC.a();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void e(SelectInstance<?> selectInstance, Object obj) {
        zja zjaVar = (zja) h.get(this);
        while (true) {
            long andIncrement = i.getAndIncrement(this);
            long j2 = 1152921504606846975L & andIncrement;
            boolean zI = i(andIncrement);
            long j3 = j2 / ((long) BUFFERED.d);
            int i2 = (int) (j2 % ((long) BUFFERED.d));
            if (zjaVar.id != j3) {
                zja zjaVarE = e(j3, zjaVar);
                if (zjaVarE != null) {
                    zjaVar = zjaVarE;
                } else if (zI) {
                    b(obj, selectInstance);
                    return;
                }
            }
            int iB = b(zjaVar, i2, obj, j2, selectInstance, zI);
            if (iB == 0) {
                zjaVar.cleanPrev();
                selectInstance.selectInRegistrationPhase(yzc.e);
                return;
            }
            if (iB == 1) {
                selectInstance.selectInRegistrationPhase(yzc.e);
                return;
            }
            if (iB == 2) {
                if (zI) {
                    zjaVar.onSlotCleaned();
                    b(obj, selectInstance);
                    return;
                } else {
                    Waiter waiter = selectInstance instanceof Waiter ? (Waiter) selectInstance : null;
                    if (waiter != null) {
                        c(waiter, zjaVar, i2);
                        return;
                    }
                    return;
                }
            }
            if (iB == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iB == 4) {
                if (j2 < j()) {
                    zjaVar.cleanPrev();
                }
                b(obj, selectInstance);
                return;
            } else if (iB == 5) {
                zjaVar.cleanPrev();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(SelectInstance<?> selectInstance, Object obj) {
        zja zjaVar = (zja) f.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = g.getAndIncrement(this);
            long j2 = andIncrement / ((long) BUFFERED.d);
            int i2 = (int) (andIncrement % ((long) BUFFERED.d));
            if (zjaVar.id != j2) {
                zja zjaVarB = b(j2, zjaVar);
                if (zjaVarB == null) {
                    continue;
                } else {
                    zjaVar = zjaVarB;
                }
            }
            Object objD = d(zjaVar, i2, andIncrement, selectInstance);
            if (objD != BUFFERED.q) {
                if (objD != BUFFERED.g) {
                    if (objD == BUFFERED.r) {
                        throw new IllegalStateException("unexpected".toString());
                    }
                    zjaVar.cleanPrev();
                    selectInstance.selectInRegistrationPhase(objD);
                    return;
                }
                if (andIncrement < h()) {
                    zjaVar.cleanPrev();
                }
            } else {
                Waiter waiter = selectInstance instanceof Waiter ? (Waiter) selectInstance : null;
                if (waiter != null) {
                    b(waiter, zjaVar, i2);
                    return;
                }
                return;
            }
        }
        e(selectInstance);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e2, Continuation<? super yzc> continuation) {
        return c((zir) this, (Object) e2, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    public Object mo1957receiveCatchingJP2dKIU(Continuation<? super ziw<? extends E>> continuation) {
        return c((zir) this, (Continuation) continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(Continuation<? super E> continuation) {
        return d((zir) this, (Continuation) continuation);
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3056}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", "segment", "index", "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
    static final class m extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f54154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f54155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f54156c;
        Object d;
        long e;
        /* synthetic */ Object f;
        final /* synthetic */ zir<E> i;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.f54155b |= Integer.MIN_VALUE;
            Object objA = this.i.a(null, 0, 0L, this);
            return objA == zbg.a() ? objA : ziw.c(objA);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(zir<E> zirVar, Continuation<? super m> continuation) {
            super(continuation);
            this.i = zirVar;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {739}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
    static final class n<E> extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zir<E> f54157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f54158b;
        int e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54158b = obj;
            this.e |= Integer.MIN_VALUE;
            Object objC = zir.c((zir) this.f54157a, (Continuation) this);
            return objC == zbg.a() ? objC : ziw.c(objC);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(zir<E> zirVar, Continuation<? super n> continuation) {
            super(continuation);
            this.f54157a = zirVar;
        }
    }
}
