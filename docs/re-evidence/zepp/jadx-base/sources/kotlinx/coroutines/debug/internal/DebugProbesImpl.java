package kotlinx.coroutines.debug.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.e;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.m;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.debug.AgentPremain;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import org.cybergarage.http.HTTP;
import org.cybergarage.soap.SOAP;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\n\b\u0002¢\u0006\u0005\b\u0093\u0001\u0010\bJ\u001d\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ;\u0010\u0013\u001a\u00020\u0004*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\b\b\u0000\u0010\u0015*\u00020\u00012\u001c\u0010\u0019\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0016H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001aH\u0002¢\u0006\u0004\b%\u0010&J5\u0010+\u001a\b\u0012\u0004\u0012\u00020#0\u001a2\u0006\u0010'\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u001aH\u0002¢\u0006\u0004\b+\u0010,J?\u00102\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-012\u0006\u0010.\u001a\u00020-2\f\u00100\u001a\b\u0012\u0004\u0012\u00020#0/2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u001aH\u0002¢\u0006\u0004\b2\u00103J3\u00105\u001a\u00020-2\u0006\u00104\u001a\u00020-2\f\u00100\u001a\b\u0012\u0004\u0012\u00020#0/2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u001aH\u0002¢\u0006\u0004\b5\u00106J#\u00109\u001a\u00020\u00042\n\u00108\u001a\u0006\u0012\u0002\b\u0003072\u0006\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\u00020\u00042\u0006\u00108\u001a\u00020;2\u0006\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b<\u0010=J\u0016\u0010>\u001a\u0004\u0018\u00010;*\u00020;H\u0082\u0010¢\u0006\u0004\b>\u0010?J/\u0010A\u001a\u00020\u00042\n\u0010@\u001a\u0006\u0012\u0002\b\u00030\u00172\n\u00108\u001a\u0006\u0012\u0002\b\u0003072\u0006\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\bA\u0010BJ\u001d\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u0006\u0012\u0002\b\u000307H\u0002¢\u0006\u0004\bC\u0010DJ\u001a\u0010E\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u00020;H\u0082\u0010¢\u0006\u0004\bE\u0010FJ\u001b\u0010H\u001a\u0004\u0018\u00010G*\b\u0012\u0004\u0012\u00020#0\u001aH\u0002¢\u0006\u0004\bH\u0010IJ3\u0010L\u001a\b\u0012\u0004\u0012\u00028\u000007\"\u0004\b\u0000\u0010J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u0000072\b\u00108\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bL\u0010MJ\u001b\u0010N\u001a\u00020\u00042\n\u0010@\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\bN\u0010OJ'\u0010R\u001a\b\u0012\u0004\u0012\u00020#0\u001a\"\b\b\u0000\u0010J*\u00020P2\u0006\u0010Q\u001a\u00028\u0000H\u0002¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\u0004¢\u0006\u0004\bT\u0010\bJ\r\u0010U\u001a\u00020\u0004¢\u0006\u0004\bU\u0010\bJ\u0015\u0010W\u001a\u00020\u00112\u0006\u0010V\u001a\u00020\n¢\u0006\u0004\bW\u0010XJ\u0013\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u001a¢\u0006\u0004\bZ\u0010[J\u0013\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0\u001a¢\u0006\u0004\b]\u0010[J\u0015\u0010^\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b^\u0010\"J)\u0010`\u001a\b\u0012\u0004\u0012\u00020#0\u001a2\u0006\u0010_\u001a\u00020Y2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u001a¢\u0006\u0004\b`\u0010aJ\u001b\u0010d\u001a\u00020\u00042\n\u00108\u001a\u0006\u0012\u0002\b\u000307H\u0000¢\u0006\u0004\bb\u0010cJ\u001b\u0010f\u001a\u00020\u00042\n\u00108\u001a\u0006\u0012\u0002\b\u000307H\u0000¢\u0006\u0004\be\u0010cJ)\u0010i\u001a\b\u0012\u0004\u0012\u00028\u000007\"\u0004\b\u0000\u0010J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0000¢\u0006\u0004\bg\u0010hR\u0016\u0010k\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010jR\u0016\u0010n\u001a\u00020l8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010mR\u0018\u0010p\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010oR&\u0010s\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u00030q8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010rR\u0016\u0010t\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010x\u001a\u00020v8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010wR\"\u0010\u007f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u0083\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010z\u001a\u0005\b\u0081\u0001\u0010|\"\u0005\b\u0082\u0001\u0010~R'\u0010\u0086\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R#\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0q8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010rR#\u0010\u008a\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0088\u00018B@\u0002X\u0082\u0004¢\u0006\u0007\u001a\u0005\by\u0010\u0089\u0001R$\u0010\u008d\u0001\u001a\u00020\u0011*\u00020\n8B@\u0002X\u0082\u0004¢\u0006\u000f\u0012\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0005\b\u0080\u0001\u0010XR\u001d\u0010\u0090\u0001\u001a\u00020\u0003*\u00020#8B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0092\u0001\u001a\u00020\u00038@@\u0000X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010|¨\u0006\u0094\u0001"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "Lkotlin/Function1;", "", "", hl.k, "()Lkotlin/jvm/functions/Function1;", "t", "()V", "u", "Lkotlinx/coroutines/Job;", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", SportAnalytics.ParamValue.MapButtonType.MAP, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "indent", "a", "(Lkotlinx/coroutines/Job;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;", "Lkotlin/coroutines/CoroutineContext;", "create", "", "c", "(Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "l", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;)Z", "Ljava/io/PrintStream;", Argument.OUT, GoogleApiAvailabilityLight.a, "(Ljava/io/PrintStream;)V", "Ljava/lang/StackTraceElement;", "frames", com.google.android.exoplayer2.text.ttml.b.r, "(Ljava/io/PrintStream;Ljava/util/List;)V", "state", "Ljava/lang/Thread;", "thread", "coroutineTrace", "e", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "", "actualTrace", "Lkotlin/Pair;", "f", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "frameIndex", "g", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lkotlin/coroutines/Continuation;", TypedValues.AttributesType.S_FRAME, "x", "(Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "w", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Ljava/lang/String;)V", "r", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", DataCacher.o, "y", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", GoogleApiAvailabilityLight.b, "(Lkotlin/coroutines/Continuation;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;", "o", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "v", "(Ljava/util/List;)Lkotlinx/coroutines/debug/internal/StackTraceFrame;", ExifInterface.GPS_DIRECTION_TRUE, "completion", "b", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/StackTraceFrame;)Lkotlin/coroutines/Continuation;", DTransferConstants.SEARCH_KEY, "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;)V", "", "throwable", SOAP.XMLNS, "(Ljava/lang/Throwable;)Ljava/util/List;", "install", "uninstall", "job", "hierarchyToString", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "dumpCoroutinesInfo", "()Ljava/util/List;", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "dumpDebuggerInfo", "dumpCoroutines", "info", "enhanceStackTraceWithThreadDump", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;Ljava/util/List;)Ljava/util/List;", "probeCoroutineResumed$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)V", "probeCoroutineResumed", "probeCoroutineSuspended$kotlinx_coroutines_core", "probeCoroutineSuspended", "probeCoroutineCreated$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "probeCoroutineCreated", "Ljava/lang/String;", "ARTIFICIAL_FRAME_MESSAGE", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/lang/Thread;", "weakRefCleanerThread", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "capturedCoroutinesMap", "installations", LogUtil.I, "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "coroutineStateLock", "h", "Z", "getSanitizeStackTraces", "()Z", "setSanitizeStackTraces", "(Z)V", "sanitizeStackTraces", "i", "getEnableCreationStackTraces", "setEnableCreationStackTraces", "enableCreationStackTraces", z.j, "Lkotlin/jvm/functions/Function1;", "dynamicAttach", "callerInfoCache", "", "()Ljava/util/Set;", "capturedCoroutines", "getDebugString$annotations", "(Lkotlinx/coroutines/Job;)V", "debugString", "m", "(Ljava/lang/StackTraceElement;)Z", "isInternalMethod", "isInstalled$kotlinx_coroutines_core", "isInstalled", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public final class DebugProbesImpl {

    @NotNull
    public static final DebugProbesImpl INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String ARTIFICIAL_FRAME_MESSAGE = "Coroutine creation stacktrace";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final SimpleDateFormat dateFormat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static Thread weakRefCleanerThread;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final ConcurrentWeakMap<a<?>, Boolean> capturedCoroutinesMap;

    @NotNull
    private static final /* synthetic */ kotlinx.coroutines.debug.internal.a e;
    private static final /* synthetic */ AtomicLongFieldUpdater f;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final ReentrantReadWriteLock coroutineStateLock;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static boolean sanitizeStackTraces;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static boolean enableCreationStackTraces;
    private static volatile int installations;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private static final Function1<Boolean, Unit> dynamicAttach;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static final ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfo> callerInfoCache;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B'\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"kotlinx/coroutines/debug/internal/DebugProbesImpl$a", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "a", "Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "b", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "info", "c", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", TypedValues.AttributesType.S_FRAME, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", DbUtils.Const.Table.CONTEXT, "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public static final class a<T> implements Continuation<T>, CoroutineStackFrame {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final Continuation<T> delegate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final DebugCoroutineInfo info;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final CoroutineStackFrame frame;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Continuation<? super T> continuation, @NotNull DebugCoroutineInfo debugCoroutineInfo, @Nullable CoroutineStackFrame coroutineStackFrame) {
            this.delegate = continuation;
            this.info = debugCoroutineInfo;
            this.frame = coroutineStackFrame;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        public CoroutineStackFrame getCallerFrame() {
            CoroutineStackFrame coroutineStackFrame = this.frame;
            if (coroutineStackFrame == null) {
                return null;
            }
            return coroutineStackFrame.getCallerFrame();
        }

        @Override // kotlin.coroutines.Continuation
        @NotNull
        /* JADX INFO: renamed from: getContext */
        public CoroutineContext getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String() {
            return this.delegate.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        public StackTraceElement getStackTraceElement() {
            CoroutineStackFrame coroutineStackFrame = this.frame;
            if (coroutineStackFrame == null) {
                return null;
            }
            return coroutineStackFrame.getStackTraceElement();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object result) {
            DebugProbesImpl.INSTANCE.q(this);
            this.delegate.resumeWith(result);
        }

        @NotNull
        public String toString() {
            return this.delegate.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<a<?>, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull a<?> aVar) {
            return Boolean.valueOf(!DebugProbesImpl.INSTANCE.l(aVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DebugProbesImpl.callerInfoCache.runWeakRefQueueCleaningLoopUntilInterrupted();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.debug.internal.a] */
    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        INSTANCE = debugProbesImpl;
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        capturedCoroutinesMap = new ConcurrentWeakMap<>(false, 1, null);
        final long j = 0;
        e = new Object(j) { // from class: kotlinx.coroutines.debug.internal.a
            public volatile long sequenceNumber;

            {
                this.sequenceNumber = j;
            }
        };
        coroutineStateLock = new ReentrantReadWriteLock();
        sanitizeStackTraces = true;
        enableCreationStackTraces = true;
        dynamicAttach = debugProbesImpl.k();
        callerInfoCache = new ConcurrentWeakMap<>(true);
        f = AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.debug.internal.a.class, "sequenceNumber");
    }

    private DebugProbesImpl() {
    }

    private final void a(Job job, Map<Job, DebugCoroutineInfo> map, StringBuilder sb, String str) {
        DebugCoroutineInfo debugCoroutineInfo = map.get(job);
        if (debugCoroutineInfo != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) CollectionsKt.firstOrNull((List) debugCoroutineInfo.lastObservedStackTrace());
            sb.append(str + i(job) + ", continuation is " + debugCoroutineInfo.get_state() + " at line " + stackTraceElement + '\n');
            str = Intrinsics.stringPlus(str, HTTP.TAB);
        } else if (!(job instanceof ScopeCoroutine)) {
            sb.append(str + i(job) + '\n');
            str = Intrinsics.stringPlus(str, HTTP.TAB);
        }
        Iterator<Job> it2 = job.getChildren().iterator();
        while (it2.hasNext()) {
            a(it2.next(), map, sb, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> Continuation<T> b(Continuation<? super T> completion, StackTraceFrame frame) {
        if (!isInstalled$kotlinx_coroutines_core()) {
            return completion;
        }
        a<?> aVar = new a<>(completion, new DebugCoroutineInfo(completion.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String(), frame, f.incrementAndGet(e)), frame);
        ConcurrentWeakMap<a<?>, Boolean> concurrentWeakMap = capturedCoroutinesMap;
        concurrentWeakMap.put(aVar, Boolean.TRUE);
        if (!isInstalled$kotlinx_coroutines_core()) {
            concurrentWeakMap.clear();
        }
        return aVar;
    }

    private final <R> List<R> c(Function2<? super a<?>, ? super CoroutineContext, ? extends R> create) {
        CoroutineContext context;
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = INSTANCE;
            if (!debugProbesImpl.isInstalled$kotlinx_coroutines_core()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            List<a> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(debugProbesImpl.h(), new DebugProbesImpl$dumpCoroutinesInfoImpl$lambda14$$inlined$sortedBy$1());
            ArrayList arrayList = new ArrayList();
            for (a aVar : listSortedWith) {
                R rInvoke = null;
                if (!INSTANCE.l(aVar) && (context = aVar.info.getContext()) != null) {
                    rInvoke = create.invoke(aVar, context);
                }
                if (rInvoke != null) {
                    arrayList.add(rInvoke);
                }
            }
            InlineMarker.finallyStart(1);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            InlineMarker.finallyEnd(1);
            return arrayList;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    private final void d(PrintStream out) {
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = INSTANCE;
            if (!debugProbesImpl.isInstalled$kotlinx_coroutines_core()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            out.print(Intrinsics.stringPlus("Coroutines dump ", dateFormat.format(Long.valueOf(System.currentTimeMillis()))));
            for (a aVar : SequencesKt___SequencesKt.sortedWith(SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(debugProbesImpl.h()), b.a), new Comparator() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$lambda-21$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((DebugProbesImpl.a) t).info.sequenceNumber), Long.valueOf(((DebugProbesImpl.a) t2).info.sequenceNumber));
                }
            })) {
                DebugCoroutineInfo debugCoroutineInfo = aVar.info;
                List<StackTraceElement> listLastObservedStackTrace = debugCoroutineInfo.lastObservedStackTrace();
                DebugProbesImpl debugProbesImpl2 = INSTANCE;
                List<StackTraceElement> listE = debugProbesImpl2.e(debugCoroutineInfo.get_state(), debugCoroutineInfo.lastObservedThread, listLastObservedStackTrace);
                out.print("\n\nCoroutine " + aVar.delegate + ", state: " + ((Intrinsics.areEqual(debugCoroutineInfo.get_state(), DebugCoroutineInfoImplKt.RUNNING) && listE == listLastObservedStackTrace) ? Intrinsics.stringPlus(debugCoroutineInfo.get_state(), " (Last suspension stacktrace, not an actual stacktrace)") : debugCoroutineInfo.get_state()));
                if (listLastObservedStackTrace.isEmpty()) {
                    out.print(Intrinsics.stringPlus("\n\tat ", StackTraceRecoveryKt.artificialFrame(ARTIFICIAL_FRAME_MESSAGE)));
                    debugProbesImpl2.p(out, debugCoroutineInfo.getCreationStackTrace());
                } else {
                    debugProbesImpl2.p(out, listE);
                }
            }
            Unit unit = Unit.INSTANCE;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    private final List<StackTraceElement> e(String state, Thread thread, List<StackTraceElement> coroutineTrace) {
        Object objM3845constructorimpl;
        if (!Intrinsics.areEqual(state, DebugCoroutineInfoImplKt.RUNNING) || thread == null) {
            return coroutineTrace;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(thread.getStackTrace());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) objM3845constructorimpl;
        if (stackTraceElementArr == null) {
            return coroutineTrace;
        }
        int length = stackTraceElementArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            if (Intrinsics.areEqual(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && Intrinsics.areEqual(stackTraceElement.getMethodName(), "resumeWith") && Intrinsics.areEqual(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i2++;
        }
        Pair<Integer, Integer> pairF = f(i2, stackTraceElementArr, coroutineTrace);
        int iIntValue = pairF.component1().intValue();
        int iIntValue2 = pairF.component2().intValue();
        if (iIntValue == -1) {
            return coroutineTrace;
        }
        ArrayList arrayList = new ArrayList((((coroutineTrace.size() + i2) - iIntValue) - 1) - iIntValue2);
        int i3 = i2 - iIntValue2;
        if (i3 > 0) {
            while (true) {
                int i4 = i + 1;
                arrayList.add(stackTraceElementArr[i]);
                if (i4 >= i3) {
                    break;
                }
                i = i4;
            }
        }
        int i5 = iIntValue + 1;
        int size = coroutineTrace.size();
        if (i5 < size) {
            while (true) {
                int i6 = i5 + 1;
                arrayList.add(coroutineTrace.get(i5));
                if (i6 >= size) {
                    break;
                }
                i5 = i6;
            }
        }
        return arrayList;
    }

    private final Pair<Integer, Integer> f(int indexOfResumeWith, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        for (int i = 0; i < 3; i++) {
            int iG = INSTANCE.g((indexOfResumeWith - 1) - i, actualTrace, coroutineTrace);
            if (iG != -1) {
                return TuplesKt.to(Integer.valueOf(iG), Integer.valueOf(i));
            }
        }
        return TuplesKt.to(-1, 0);
    }

    private final int g(int frameIndex, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.getOrNull(actualTrace, frameIndex);
        if (stackTraceElement == null) {
            return -1;
        }
        int i = 0;
        for (StackTraceElement stackTraceElement2 : coroutineTrace) {
            if (Intrinsics.areEqual(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && Intrinsics.areEqual(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && Intrinsics.areEqual(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<a<?>> h() {
        return capturedCoroutinesMap.keySet();
    }

    private final String i(Job job) {
        return job instanceof JobSupport ? ((JobSupport) job).toDebugString() : job.toString();
    }

    private static /* synthetic */ void j(Job job) {
    }

    private final Function1<Boolean, Unit> k() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            }
            objM3845constructorimpl = Result.m3845constructorimpl((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(objNewInstance, 1));
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            return (Function1) objM3845constructorimpl;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l(a<?> aVar) {
        CoroutineContext context = aVar.info.getContext();
        Job job = context == null ? null : (Job) context.get(Job.INSTANCE);
        if (job == null || !job.isCompleted()) {
            return false;
        }
        capturedCoroutinesMap.remove(aVar);
        return true;
    }

    private final boolean m(StackTraceElement stackTraceElement) {
        return m.startsWith$default(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    private final a<?> n(Continuation<?> continuation) {
        CoroutineStackFrame coroutineStackFrame = continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
        if (coroutineStackFrame == null) {
            return null;
        }
        return o(coroutineStackFrame);
    }

    private final a<?> o(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof a)) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        }
        return (a) coroutineStackFrame;
    }

    private final void p(PrintStream out, List<StackTraceElement> frames) {
        Iterator<T> it2 = frames.iterator();
        while (it2.hasNext()) {
            out.print(Intrinsics.stringPlus("\n\tat ", (StackTraceElement) it2.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(a<?> owner) {
        capturedCoroutinesMap.remove(owner);
        CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = owner.info.getLastObservedFrame$kotlinx_coroutines_core();
        CoroutineStackFrame coroutineStackFrameR = lastObservedFrame$kotlinx_coroutines_core == null ? null : r(lastObservedFrame$kotlinx_coroutines_core);
        if (coroutineStackFrameR == null) {
            return;
        }
        callerInfoCache.remove(coroutineStackFrameR);
    }

    private final CoroutineStackFrame r(CoroutineStackFrame coroutineStackFrame) {
        do {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        } while (coroutineStackFrame.getStackTraceElement() == null);
        return coroutineStackFrame;
    }

    private final <T extends Throwable> List<StackTraceElement> s(T throwable) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int length2 = stackTrace.length - 1; length2 >= 0; length2--) {
            if (Intrinsics.areEqual(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                i = length2;
                break;
            }
        }
        if (!sanitizeStackTraces) {
            int i2 = length - i;
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 < i2) {
                arrayList.add(i3 == 0 ? StackTraceRecoveryKt.artificialFrame(ARTIFICIAL_FRAME_MESSAGE) : stackTrace[i3 + i]);
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i) + 1);
        arrayList2.add(StackTraceRecoveryKt.artificialFrame(ARTIFICIAL_FRAME_MESSAGE));
        while (true) {
            i++;
            while (i < length) {
                if (m(stackTrace[i])) {
                    arrayList2.add(stackTrace[i]);
                    int i4 = i + 1;
                    while (i4 < length && m(stackTrace[i4])) {
                        i4++;
                    }
                    int i5 = i4 - 1;
                    int i6 = i5;
                    while (i6 > i && stackTrace[i6].getFileName() == null) {
                        i6--;
                    }
                    if (i6 > i && i6 < i5) {
                        arrayList2.add(stackTrace[i6]);
                    }
                    arrayList2.add(stackTrace[i5]);
                    i = i4;
                } else {
                    arrayList2.add(stackTrace[i]);
                }
            }
            return arrayList2;
        }
    }

    private final void t() {
        weakRefCleanerThread = ThreadsKt.thread((21 & 1) != 0, (21 & 2) != 0 ? false : true, (21 & 4) != 0 ? null : null, (21 & 8) != 0 ? null : "Coroutines Debugger Cleaner", (21 & 16) != 0 ? -1 : 0, c.a);
    }

    private final void u() {
        Thread thread = weakRefCleanerThread;
        if (thread != null) {
            thread.interrupt();
        }
        weakRefCleanerThread = null;
    }

    private final StackTraceFrame v(List<StackTraceElement> list) {
        StackTraceFrame stackTraceFrame = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                stackTraceFrame = new StackTraceFrame(stackTraceFrame, listIterator.previous());
            }
        }
        return stackTraceFrame;
    }

    private final void w(CoroutineStackFrame frame, String state) {
        ReentrantReadWriteLock.ReadLock lock = coroutineStateLock.readLock();
        lock.lock();
        try {
            DebugProbesImpl debugProbesImpl = INSTANCE;
            if (debugProbesImpl.isInstalled$kotlinx_coroutines_core()) {
                ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfo> concurrentWeakMap = callerInfoCache;
                DebugCoroutineInfo debugCoroutineInfoRemove = concurrentWeakMap.remove(frame);
                if (debugCoroutineInfoRemove == null) {
                    a<?> aVarO = debugProbesImpl.o(frame);
                    if (aVarO == null) {
                        return;
                    }
                    debugCoroutineInfoRemove = aVarO.info;
                    CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = debugCoroutineInfoRemove.getLastObservedFrame$kotlinx_coroutines_core();
                    CoroutineStackFrame coroutineStackFrameR = lastObservedFrame$kotlinx_coroutines_core == null ? null : debugProbesImpl.r(lastObservedFrame$kotlinx_coroutines_core);
                    if (coroutineStackFrameR != null) {
                        concurrentWeakMap.remove(coroutineStackFrameR);
                    }
                }
                debugCoroutineInfoRemove.updateState$kotlinx_coroutines_core(state, (Continuation) frame);
                CoroutineStackFrame coroutineStackFrameR2 = debugProbesImpl.r(frame);
                if (coroutineStackFrameR2 == null) {
                    return;
                }
                concurrentWeakMap.put(coroutineStackFrameR2, debugCoroutineInfoRemove);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            lock.unlock();
        }
    }

    private final void x(Continuation<?> frame, String state) {
        if (isInstalled$kotlinx_coroutines_core()) {
            if (Intrinsics.areEqual(state, DebugCoroutineInfoImplKt.RUNNING) && KotlinVersion.CURRENT.isAtLeast(1, 3, 30)) {
                CoroutineStackFrame coroutineStackFrame = frame instanceof CoroutineStackFrame ? (CoroutineStackFrame) frame : null;
                if (coroutineStackFrame == null) {
                    return;
                }
                w(coroutineStackFrame, state);
                return;
            }
            a<?> aVarN = n(frame);
            if (aVarN == null) {
                return;
            }
            y(aVarN, frame, state);
        }
    }

    private final void y(a<?> owner, Continuation<?> frame, String state) {
        ReentrantReadWriteLock.ReadLock lock = coroutineStateLock.readLock();
        lock.lock();
        try {
            if (INSTANCE.isInstalled$kotlinx_coroutines_core()) {
                owner.info.updateState$kotlinx_coroutines_core(state, frame);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            lock.unlock();
        }
    }

    public final void dumpCoroutines(@NotNull PrintStream out) {
        synchronized (out) {
            INSTANCE.d(out);
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final List<DebugCoroutineInfo> dumpCoroutinesInfo() {
        CoroutineContext context;
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = INSTANCE;
            if (!debugProbesImpl.isInstalled$kotlinx_coroutines_core()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            List<a> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(debugProbesImpl.h(), new DebugProbesImpl$dumpCoroutinesInfoImpl$lambda14$$inlined$sortedBy$1());
            ArrayList arrayList = new ArrayList();
            for (a aVar : listSortedWith) {
                DebugCoroutineInfo debugCoroutineInfo = null;
                if (!INSTANCE.l(aVar) && (context = aVar.info.getContext()) != null) {
                    debugCoroutineInfo = new DebugCoroutineInfo(aVar.info, context);
                }
                if (debugCoroutineInfo != null) {
                    arrayList.add(debugCoroutineInfo);
                }
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            return arrayList;
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @NotNull
    public final List<DebuggerInfo> dumpDebuggerInfo() {
        CoroutineContext context;
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = INSTANCE;
            if (!debugProbesImpl.isInstalled$kotlinx_coroutines_core()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            List<a> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(debugProbesImpl.h(), new DebugProbesImpl$dumpCoroutinesInfoImpl$lambda14$$inlined$sortedBy$1());
            ArrayList arrayList = new ArrayList();
            for (a aVar : listSortedWith) {
                DebuggerInfo debuggerInfo = null;
                if (!INSTANCE.l(aVar) && (context = aVar.info.getContext()) != null) {
                    debuggerInfo = new DebuggerInfo(aVar.info, context);
                }
                if (debuggerInfo != null) {
                    arrayList.add(debuggerInfo);
                }
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            return arrayList;
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @NotNull
    public final List<StackTraceElement> enhanceStackTraceWithThreadDump(@NotNull DebugCoroutineInfo info, @NotNull List<StackTraceElement> coroutineTrace) {
        return e(info.getState(), info.getLastObservedThread(), coroutineTrace);
    }

    public final boolean getEnableCreationStackTraces() {
        return enableCreationStackTraces;
    }

    public final boolean getSanitizeStackTraces() {
        return sanitizeStackTraces;
    }

    @NotNull
    public final String hierarchyToString(@NotNull Job job) {
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = INSTANCE;
            if (!debugProbesImpl.isInstalled$kotlinx_coroutines_core()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            Set<a<?>> setH = debugProbesImpl.h();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setH) {
                if (((a) obj).delegate.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().get(Job.INSTANCE) != null) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                linkedHashMap.put(JobKt.getJob(((a) obj2).delegate.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String()), ((a) obj2).info);
            }
            StringBuilder sb = new StringBuilder();
            INSTANCE.a(job, linkedHashMap, sb, "");
            String string = sb.toString();
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            return string;
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void install() {
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = INSTANCE;
            installations++;
            if (installations > 1) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            debugProbesImpl.t();
            if (AgentPremain.INSTANCE.isInstalledStatically()) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            Function1<Boolean, Unit> function1 = dynamicAttach;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            Unit unit = Unit.INSTANCE;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final boolean isInstalled$kotlinx_coroutines_core() {
        return installations > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T> Continuation<T> probeCoroutineCreated$kotlinx_coroutines_core(@NotNull Continuation<? super T> completion) {
        if (isInstalled$kotlinx_coroutines_core() && n(completion) == null) {
            return b(completion, enableCreationStackTraces ? v(s(new Exception())) : null);
        }
        return completion;
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(@NotNull Continuation<?> frame) {
        x(frame, DebugCoroutineInfoImplKt.RUNNING);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(@NotNull Continuation<?> frame) {
        x(frame, DebugCoroutineInfoImplKt.SUSPENDED);
    }

    public final void setEnableCreationStackTraces(boolean z) {
        enableCreationStackTraces = z;
    }

    public final void setSanitizeStackTraces(boolean z) {
        sanitizeStackTraces = z;
    }

    public final void uninstall() {
        ReentrantReadWriteLock reentrantReadWriteLock = coroutineStateLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            DebugProbesImpl debugProbesImpl = INSTANCE;
            if (!debugProbesImpl.isInstalled$kotlinx_coroutines_core()) {
                throw new IllegalStateException("Agent was not installed".toString());
            }
            installations--;
            if (installations != 0) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            debugProbesImpl.u();
            capturedCoroutinesMap.clear();
            callerInfoCache.clear();
            if (AgentPremain.INSTANCE.isInstalledStatically()) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            Function1<Boolean, Unit> function1 = dynamicAttach;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            Unit unit = Unit.INSTANCE;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }
}
