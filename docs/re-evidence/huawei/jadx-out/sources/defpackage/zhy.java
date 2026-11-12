package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.hms.network.embedded.r3;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Opers;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Incomplete;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobCancellingNode;
import kotlinx.coroutines.JobNode;
import kotlinx.coroutines.ParentJob;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\n²\u0001³\u0001´\u0001µ\u0001¶\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0002J\u001e\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00112\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110KH\u0002J\u0012\u0010L\u001a\u00020H2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0014J\u000e\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\u0002J\u0013\u0010O\u001a\u0004\u0018\u00010\u000bH\u0084@ø\u0001\u0000¢\u0006\u0002\u0010PJ\u0013\u0010Q\u001a\u0004\u0018\u00010\u000bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010PJ\u0012\u0010R\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0017J\u0018\u0010R\u001a\u00020H2\u000e\u0010S\u001a\n\u0018\u00010Tj\u0004\u0018\u0001`UH\u0016J\u0010\u0010V\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010\u0011J\u0017\u0010W\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\bXJ\u0010\u0010Y\u001a\u00020H2\u0006\u0010S\u001a\u00020\u0011H\u0016J\u0014\u0010Z\u001a\u0004\u0018\u00010\u000b2\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010[\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u0011H\u0002J\b\u0010\\\u001a\u00020]H\u0014J\u0010\u0010^\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u0011H\u0016J\u001a\u0010_\u001a\u00020H2\u0006\u00108\u001a\u00020?2\b\u0010`\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010a\u001a\u00020H2\u0006\u00108\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010f\u001a\u00020\u00112\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0002J&\u0010g\u001a\u00020h2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010]2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0011H\u0080\b¢\u0006\u0002\bjJ\u001c\u0010k\u001a\u0004\u0018\u00010\u000b2\u0006\u00108\u001a\u00020b2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010l\u001a\u0004\u0018\u00010d2\u0006\u00108\u001a\u00020?H\u0002J\n\u0010m\u001a\u00060Tj\u0002`UJ\f\u0010n\u001a\u00060Tj\u0002`UH\u0016J\u000f\u0010o\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\bpJ\b\u0010q\u001a\u0004\u0018\u00010\u0011J \u0010r\u001a\u0004\u0018\u00010\u00112\u0006\u00108\u001a\u00020b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110KH\u0002J\u0012\u0010s\u001a\u0004\u0018\u00010D2\u0006\u00108\u001a\u00020?H\u0002J\u0010\u0010t\u001a\u00020\u00052\u0006\u0010u\u001a\u00020\u0011H\u0014J\u0015\u0010v\u001a\u00020H2\u0006\u0010u\u001a\u00020\u0011H\u0010¢\u0006\u0002\bwJ\u0012\u0010x\u001a\u00020H2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0004JA\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020\u00052\u0006\u0010|\u001a\u00020\u00052)\u0010}\u001a%\u0012\u0016\u0012\u0014\u0018\u00010\u0011¢\u0006\r\b\u007f\u0012\t\b\u0080\u0001\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020H0~j\u0003`\u0081\u0001J1\u0010y\u001a\u00020z2)\u0010}\u001a%\u0012\u0016\u0012\u0014\u0018\u00010\u0011¢\u0006\r\b\u007f\u0012\t\b\u0080\u0001\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020H0~j\u0003`\u0081\u0001J\u0012\u0010\u0082\u0001\u001a\u00020HH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010PJ\t\u0010\u0083\u0001\u001a\u00020\u0005H\u0002J\u0012\u0010\u0084\u0001\u001a\u00020HH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010PJ\"\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0015\u0010\u0087\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020H0~H\u0082\bJ\u0015\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010S\u001a\u0004\u0018\u00010\u000bH\u0002J\u0019\u0010\u0089\u0001\u001a\u00020\u00052\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0003\b\u008a\u0001J\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0003\b\u008c\u0001J<\u0010\u008d\u0001\u001a\u00020F2)\u0010}\u001a%\u0012\u0016\u0012\u0014\u0018\u00010\u0011¢\u0006\r\b\u007f\u0012\t\b\u0080\u0001\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020H0~j\u0003`\u0081\u00012\u0006\u0010{\u001a\u00020\u0005H\u0002J\u000f\u0010\u008e\u0001\u001a\u00020]H\u0010¢\u0006\u0003\b\u008f\u0001J\u0019\u0010\u0090\u0001\u001a\u00020H2\u0006\u0010C\u001a\u00020D2\u0006\u0010S\u001a\u00020\u0011H\u0002J)\u0010\u0091\u0001\u001a\u00020H\"\u000b\b\u0000\u0010\u0092\u0001\u0018\u0001*\u00020F2\u0006\u0010C\u001a\u00020D2\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0082\bJ!\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u000b2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010\u0096\u0001\u001a\u00020H2\f\u0010\u0097\u0001\u001a\u0007\u0012\u0002\b\u00030\u0098\u00012\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010{\u001a\u00020H2\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0014J\u0013\u0010\u0099\u0001\u001a\u00020H2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0014J\t\u0010\u009a\u0001\u001a\u00020HH\u0014J\u0010\u0010\u009b\u0001\u001a\u00020H2\u0007\u0010\u009c\u0001\u001a\u00020\u0003J\u0012\u0010\u009d\u0001\u001a\u00020H2\u0007\u00108\u001a\u00030\u009e\u0001H\u0002J\u0011\u0010\u009f\u0001\u001a\u00020H2\u0006\u00108\u001a\u00020FH\u0002J\"\u0010 \u0001\u001a\u00020H2\f\u0010\u0097\u0001\u001a\u0007\u0012\u0002\b\u00030\u0098\u00012\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u000bH\u0002J\u0017\u0010¡\u0001\u001a\u00020H2\u0006\u0010E\u001a\u00020FH\u0000¢\u0006\u0003\b¢\u0001J\u0007\u0010£\u0001\u001a\u00020\u0005J\u0014\u0010¤\u0001\u001a\u00030¥\u00012\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0002J\u0013\u0010¦\u0001\u001a\u00020]2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0002J\t\u0010§\u0001\u001a\u00020]H\u0007J\t\u0010¨\u0001\u001a\u00020]H\u0016J\u001b\u0010©\u0001\u001a\u00020\u00052\u0006\u00108\u001a\u00020?2\b\u0010`\u001a\u0004\u0018\u00010\u000bH\u0002J\u0019\u0010ª\u0001\u001a\u00020\u00052\u0006\u00108\u001a\u00020?2\u0006\u0010I\u001a\u00020\u0011H\u0002J\u001f\u0010«\u0001\u001a\u0004\u0018\u00010\u000b2\b\u00108\u001a\u0004\u0018\u00010\u000b2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J\u001d\u0010¬\u0001\u001a\u0004\u0018\u00010\u000b2\u0006\u00108\u001a\u00020?2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0002J$\u0010\u00ad\u0001\u001a\u00020\u00052\u0006\u00108\u001a\u00020b2\u0006\u0010N\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00010\u000bH\u0082\u0010J\u0010\u0010®\u0001\u001a\u0004\u0018\u00010d*\u00030¯\u0001H\u0002J\u0017\u0010°\u0001\u001a\u00020H*\u00020D2\b\u0010S\u001a\u0004\u0018\u00010\u0011H\u0002J\u001d\u0010±\u0001\u001a\u00060Tj\u0002`U*\u00020\u00112\n\b\u0002\u0010i\u001a\u0004\u0018\u00010]H\u0004R\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004R\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bX\u0082\u0004R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0015\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u001e\u0010\"\u001a\u0006\u0012\u0002\b\u00030#8DX\u0084\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0017\u0010*\u001a\u00020+8F¢\u0006\f\u0012\u0004\b,\u0010%\u001a\u0004\b-\u0010.R\u0016\u0010/\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R(\u00103\u001a\u0004\u0018\u00010\t2\b\u00102\u001a\u0004\u0018\u00010\t8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u00108\u001a\u0004\u0018\u00010\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0018\u0010>\u001a\u00020\u0005*\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006·\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", "active", "", "(Z)V", "_parentHandle", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/ChildHandle;", "_state", "", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "completionCause", "", "getCompletionCause", "()Ljava/lang/Throwable;", "completionCauseHandled", "getCompletionCauseHandled", "()Z", "handlesException", "getHandlesException$kotlinx_coroutines_core", r3.B, "isCancelled", "isCompleted", "isCompletedExceptionally", "isScopedCoroutine", MedalConstants.EVENT_KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "onAwaitInternal", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwaitInternal$annotations", "()V", "getOnAwaitInternal", "()Lkotlinx/coroutines/selects/SelectClause1;", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin$annotations", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "parent", "getParent", "()Lkotlinx/coroutines/Job;", "value", "parentHandle", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "exceptionOrNull", "getExceptionOrNull", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "isCancelling", "Lkotlinx/coroutines/Incomplete;", "(Lkotlinx/coroutines/Incomplete;)Z", "addLastAtomic", "expect", "list", "Lkotlinx/coroutines/NodeList;", "node", "Lkotlinx/coroutines/JobNode;", "addSuppressedExceptions", "", "rootCause", "exceptions", "", "afterCompletion", "attachChild", "child", "awaitInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSuspend", "cancel", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelCoroutine", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "cancelInternal", "cancelMakeCompleting", "cancelParent", "cancellationExceptionMessage", "", "childCancelled", "completeStateFinalization", "update", "continueCompleting", "Lkotlinx/coroutines/JobSupport$Finishing;", "lastChild", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "createCauseException", "defaultCancellationException", "Lkotlinx/coroutines/JobCancellationException;", "message", "defaultCancellationException$kotlinx_coroutines_core", "finalizeFinishingState", "firstChild", "getCancellationException", "getChildJobCancellationCause", "getCompletedInternal", "getCompletedInternal$kotlinx_coroutines_core", "getCompletionExceptionOrNull", "getFinalRootCause", "getOrPromoteCancellingList", "handleJobException", TrackConstants$Events.EXCEPTION, "handleOnCompletionException", "handleOnCompletionException$kotlinx_coroutines_core", "initParentJob", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "join", "joinInternal", "joinSuspend", "loopOnState", "", "block", "makeCancelling", "makeCompleting", "makeCompleting$kotlinx_coroutines_core", "makeCompletingOnce", "makeCompletingOnce$kotlinx_coroutines_core", "makeNode", "nameString", "nameString$kotlinx_coroutines_core", "notifyCancelling", "notifyHandlers", ExifInterface.GPS_DIRECTION_TRUE, "onAwaitInternalProcessResFunc", "ignoredParam", "result", "onAwaitInternalRegFunc", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "onCompletionInternal", "onStart", "parentCancelled", "parentJob", "promoteEmptyToNodeList", "Lkotlinx/coroutines/Empty;", "promoteSingleToNodeList", "registerSelectForOnJoin", "removeNode", "removeNode$kotlinx_coroutines_core", "start", "startInternal", "", "stateString", "toDebugString", "toString", "tryFinalizeSimpleState", "tryMakeCancelling", "tryMakeCompleting", "tryMakeCompletingSlowPath", "tryWaitForChild", "nextChild", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "notifyCompletion", "toCancellationException", "AwaitContinuation", "ChildCompletion", "Finishing", "SelectOnAwaitCompletionHandler", "SelectOnJoinCompletionHandler", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class zhy implements Job, ChildJob, ParentJob {

    @Volatile
    private volatile Object _parentHandle;

    @Volatile
    private volatile Object _state;
    private static final AtomicReferenceFieldUpdater _state$FU = AtomicReferenceFieldUpdater.newUpdater(zhy.class, Object.class, "_state");
    private static final AtomicReferenceFieldUpdater _parentHandle$FU = AtomicReferenceFieldUpdater.newUpdater(zhy.class, Object.class, "_parentHandle");

    protected static /* synthetic */ void getOnAwaitInternal$annotations() {
    }

    public static /* synthetic */ void getOnJoin$annotations() {
    }

    protected void afterCompletion(Object state) {
    }

    /* JADX INFO: renamed from: getHandlesException$kotlinx_coroutines_core */
    public boolean getD() {
        return true;
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    protected boolean handleJobException(Throwable exception) {
        return false;
    }

    protected boolean isScopedCoroutine() {
        return false;
    }

    protected void onCancelling(Throwable cause) {
    }

    protected void onCompletionInternal(Object state) {
    }

    protected void onStart() {
    }

    public zhy(boolean z) {
        this._state = z ? COMPLETING_ALREADY.e : COMPLETING_ALREADY.f54130b;
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) Job.b.a(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) Job.b.c(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return Job.b.b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return Job.b.b(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public Job plus(Job job) {
        return Job.b.c(this, job);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key<?> getKey() {
        return Job.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", ParamConstants.CallbackMethod.ON_PREPARE, "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f extends LockFreeLinkedListNode.CondAddOp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f54120a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zhy f54121c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LockFreeLinkedListNode lockFreeLinkedListNode, zhy zhyVar, Object obj) {
            super(lockFreeLinkedListNode);
            this.f54121c = zhyVar;
            this.f54120a = obj;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object prepare(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f54121c.getState$kotlinx_coroutines_core() == this.f54120a) {
                return null;
            }
            return CONDITION_FALSE.a();
        }
    }

    public final ChildHandle getParentHandle$kotlinx_coroutines_core() {
        return (ChildHandle) _parentHandle$FU.get(this);
    }

    public final void setParentHandle$kotlinx_coroutines_core(ChildHandle childHandle) {
        _parentHandle$FU.set(this, childHandle);
    }

    @Override // kotlinx.coroutines.Job
    public Job getParent() {
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            return parentHandle$kotlinx_coroutines_core.getParent();
        }
        return null;
    }

    protected final void initParentJob(Job parent) {
        if (ASSERTIONS_ENABLED.a() && getParentHandle$kotlinx_coroutines_core() != null) {
            throw new AssertionError();
        }
        if (parent == null) {
            setParentHandle$kotlinx_coroutines_core(zif.f54134b);
            return;
        }
        parent.start();
        ChildHandle childHandleAttachChild = parent.attachChild(this);
        setParentHandle$kotlinx_coroutines_core(childHandleAttachChild);
        if (isCompleted()) {
            childHandleAttachChild.dispose();
            setParentHandle$kotlinx_coroutines_core(zif.f54134b);
        }
    }

    public final Object getState$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).perform(this);
        }
    }

    private final Void loopOnState(Function1<Object, yzc> block) {
        while (true) {
            block.invoke(getState$kotlinx_coroutines_core());
        }
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof Incomplete) && ((Incomplete) state$kotlinx_coroutines_core).getF54103b();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof Incomplete);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof zgl) {
            return true;
        }
        return (state$kotlinx_coroutines_core instanceof a) && ((a) state$kotlinx_coroutines_core).e();
    }

    private final Object finalizeFinishingState(a aVar, Object obj) throws Throwable {
        boolean zE;
        Throwable finalRootCause;
        if (ASSERTIONS_ENABLED.a() && getState$kotlinx_coroutines_core() != aVar) {
            throw new AssertionError();
        }
        if (ASSERTIONS_ENABLED.a() && aVar.d()) {
            throw new AssertionError();
        }
        if (ASSERTIONS_ENABLED.a() && !aVar.b()) {
            throw new AssertionError();
        }
        zcm zcmVar = null;
        zgl zglVar = obj instanceof zgl ? (zgl) obj : null;
        Throwable th = zglVar != null ? zglVar.f54081b : null;
        synchronized (aVar) {
            zE = aVar.e();
            List<Throwable> listB = aVar.b(th);
            finalRootCause = getFinalRootCause(aVar, listB);
            if (finalRootCause != null) {
                addSuppressedExceptions(finalRootCause, listB);
            }
        }
        if (finalRootCause != null && finalRootCause != th) {
            obj = new zgl(finalRootCause, false, 2, zcmVar);
        }
        if (finalRootCause != null && (cancelParent(finalRootCause) || handleJobException(finalRootCause))) {
            zcp.e(obj, "");
            ((zgl) obj).e();
        }
        if (!zE) {
            onCancelling(finalRootCause);
        }
        onCompletionInternal(obj);
        boolean zM = AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$FU, this, aVar, COMPLETING_ALREADY.e(obj));
        if (ASSERTIONS_ENABLED.a() && !zM) {
            throw new AssertionError();
        }
        completeStateFinalization(aVar, obj);
        return obj;
    }

    private final Throwable getFinalRootCause(a aVar, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (aVar.e()) {
                return new zhu(cancellationExceptionMessage(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof zip) {
            for (Object obj2 : list2) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof zip)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final void addSuppressedExceptions(Throwable rootCause, List<? extends Throwable> exceptions) {
        if (exceptions.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(exceptions.size()));
        Throwable thE = !ASSERTIONS_ENABLED.b() ? rootCause : ARTIFICIAL_FRAME.e(rootCause);
        for (Throwable thE2 : exceptions) {
            if (ASSERTIONS_ENABLED.b()) {
                thE2 = ARTIFICIAL_FRAME.e(thE2);
            }
            if (thE2 != rootCause && thE2 != thE && !(thE2 instanceof CancellationException) && setNewSetFromMap.add(thE2)) {
                yyl.d(rootCause, thE2);
            }
        }
    }

    private final boolean tryFinalizeSimpleState(Incomplete state, Object update) throws Throwable {
        if (ASSERTIONS_ENABLED.a() && !(state instanceof zhk) && !(state instanceof JobNode)) {
            throw new AssertionError();
        }
        if (ASSERTIONS_ENABLED.a() && (update instanceof zgl)) {
            throw new AssertionError();
        }
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$FU, this, state, COMPLETING_ALREADY.e(update))) {
            return false;
        }
        onCancelling(null);
        onCompletionInternal(update);
        completeStateFinalization(state, update);
        return true;
    }

    private final void completeStateFinalization(Incomplete state, Object update) throws Throwable {
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            parentHandle$kotlinx_coroutines_core.dispose();
            setParentHandle$kotlinx_coroutines_core(zif.f54134b);
        }
        zgl zglVar = update instanceof zgl ? (zgl) update : null;
        Throwable th = zglVar != null ? zglVar.f54081b : null;
        if (state instanceof JobNode) {
            try {
                ((JobNode) state).invoke(th);
                return;
            } catch (Throwable th2) {
                handleOnCompletionException$kotlinx_coroutines_core(new zgp("Exception in completion handler " + state + " for " + this, th2));
                return;
            }
        }
        zig f54115a = state.getF54108b();
        if (f54115a != null) {
            notifyCompletion(f54115a, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x002d, please report this as an issue */
    private final void notifyCancelling(zig zigVar, Throwable th) throws Throwable {
        onCancelling(th);
        zig zigVar2 = zigVar;
        Object next = zigVar2.getNext();
        zcp.e(next, "");
        zgp zgpVar = null;
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !zcp.b(nextNode, zigVar2); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof JobCancellingNode) {
                JobNode jobNode = (JobNode) nextNode;
                try {
                    jobNode.invoke(th);
                } catch (Throwable th2) {
                    zgp zgpVar2 = zgpVar;
                    if (zgpVar2 == null) {
                        zgp zgpVar3 = new zgp("Exception in completion handler " + jobNode + " for " + this, th2);
                        yzc yzcVar = yzc.e;
                        zgpVar = zgpVar3;
                    } else {
                        yyl.d(zgpVar2, th2);
                        if (zgpVar2 == null) {
                            zgp zgpVar4 = new zgp("Exception in completion handler " + jobNode + " for " + this, th2);
                            yzc yzcVar2 = yzc.e;
                            zgpVar = zgpVar4;
                        }
                    }
                }
            }
        }
        zgp zgpVar5 = zgpVar;
        if (zgpVar5 != null) {
            handleOnCompletionException$kotlinx_coroutines_core(zgpVar5);
        }
        cancelParent(th);
    }

    private final boolean cancelParent(Throwable cause) {
        if (isScopedCoroutine()) {
            return true;
        }
        boolean z = cause instanceof CancellationException;
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core == null || parentHandle$kotlinx_coroutines_core == zif.f54134b) {
            return z;
        }
        return parentHandle$kotlinx_coroutines_core.childCancelled(cause) || z;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x0033, please report this as an issue */
    private final /* synthetic */ <T extends JobNode> void notifyHandlers(zig zigVar, Throwable th) throws Throwable {
        zig zigVar2 = zigVar;
        Object next = zigVar2.getNext();
        zcp.e(next, "");
        zgp zgpVar = null;
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !zcp.b(nextNode, zigVar2); nextNode = nextNode.getNextNode()) {
            zcp.b(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (nextNode instanceof LockFreeLinkedListNode) {
                JobNode jobNode = (JobNode) nextNode;
                try {
                    jobNode.invoke(th);
                } catch (Throwable th2) {
                    zgp zgpVar2 = zgpVar;
                    if (zgpVar2 == null) {
                        zgp zgpVar3 = new zgp("Exception in completion handler " + jobNode + " for " + this, th2);
                        yzc yzcVar = yzc.e;
                        zgpVar = zgpVar3;
                    } else {
                        yyl.d(zgpVar2, th2);
                        if (zgpVar2 == null) {
                            zgp zgpVar4 = new zgp("Exception in completion handler " + jobNode + " for " + this, th2);
                            yzc yzcVar2 = yzc.e;
                            zgpVar = zgpVar4;
                        }
                    }
                }
            }
        }
        zgp zgpVar5 = zgpVar;
        if (zgpVar5 != null) {
            handleOnCompletionException$kotlinx_coroutines_core(zgpVar5);
        }
    }

    private final int startInternal(Object state) {
        if (state instanceof zhk) {
            if (((zhk) state).getF54103b()) {
                return 0;
            }
            if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$FU, this, state, COMPLETING_ALREADY.e)) {
                return -1;
            }
            onStart();
            return 1;
        }
        if (!(state instanceof zhq)) {
            return 0;
        }
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$FU, this, state, ((zhq) state).getF54108b())) {
            return -1;
        }
        onStart();
        return 1;
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException getCancellationException() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof a) {
            Throwable thC = ((a) state$kotlinx_coroutines_core).c();
            if (thC != null) {
                CancellationException cancellationException = toCancellationException(thC, classSimpleName.a(this) + " is cancelling");
                if (cancellationException != null) {
                    return cancellationException;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof zgl) {
            return toCancellationException$default(this, ((zgl) state$kotlinx_coroutines_core).f54081b, null, 1, null);
        }
        return new zhu(classSimpleName.a(this) + " has completed normally", null, this);
    }

    public static /* synthetic */ CancellationException toCancellationException$default(zhy zhyVar, Throwable th, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        return zhyVar.toCancellationException(th, str);
    }

    protected final CancellationException toCancellationException(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (str == null) {
            str = cancellationExceptionMessage();
        }
        return new zhu(str, th, this);
    }

    protected final Throwable getCompletionCause() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof a) {
            Throwable thC = ((a) state$kotlinx_coroutines_core).c();
            if (thC != null) {
                return thC;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof zgl) {
            return ((zgl) state$kotlinx_coroutines_core).f54081b;
        }
        return null;
    }

    protected final boolean getCompletionCauseHandled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof zgl) && ((zgl) state$kotlinx_coroutines_core).a();
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(Function1<? super Throwable, yzc> handler) {
        return invokeOnCompletion(false, true, handler);
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, Function1<? super Throwable, yzc> handler) {
        JobNode jobNodeMakeNode = makeNode(handler, onCancelling);
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof zhk) {
                zhk zhkVar = (zhk) state$kotlinx_coroutines_core;
                if (zhkVar.getF54103b()) {
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$FU, this, state$kotlinx_coroutines_core, jobNodeMakeNode)) {
                        return jobNodeMakeNode;
                    }
                } else {
                    promoteEmptyToNodeList(zhkVar);
                }
            } else {
                Throwable thC = null;
                if (state$kotlinx_coroutines_core instanceof Incomplete) {
                    zig f54115a = ((Incomplete) state$kotlinx_coroutines_core).getF54108b();
                    if (f54115a == null) {
                        zcp.e(state$kotlinx_coroutines_core, "");
                        promoteSingleToNodeList((JobNode) state$kotlinx_coroutines_core);
                    } else {
                        DisposableHandle disposableHandle = zif.f54134b;
                        if (onCancelling && (state$kotlinx_coroutines_core instanceof a)) {
                            synchronized (state$kotlinx_coroutines_core) {
                                thC = ((a) state$kotlinx_coroutines_core).c();
                                if (thC == null || ((handler instanceof zgn) && !((a) state$kotlinx_coroutines_core).b())) {
                                    if (addLastAtomic(state$kotlinx_coroutines_core, f54115a, jobNodeMakeNode)) {
                                        if (thC == null) {
                                            return jobNodeMakeNode;
                                        }
                                        disposableHandle = jobNodeMakeNode;
                                    }
                                }
                                yzc yzcVar = yzc.e;
                            }
                        }
                        if (thC != null) {
                            if (invokeImmediately) {
                                handler.invoke(thC);
                            }
                            return disposableHandle;
                        }
                        if (addLastAtomic(state$kotlinx_coroutines_core, f54115a, jobNodeMakeNode)) {
                            return jobNodeMakeNode;
                        }
                    }
                } else {
                    if (invokeImmediately) {
                        zgl zglVar = state$kotlinx_coroutines_core instanceof zgl ? (zgl) state$kotlinx_coroutines_core : null;
                        handler.invoke(zglVar != null ? zglVar.f54081b : null);
                    }
                    return zif.f54134b;
                }
            }
        }
    }

    private final JobNode makeNode(Function1<? super Throwable, yzc> handler, boolean onCancelling) {
        zhv zhvVar;
        if (onCancelling) {
            zhvVar = handler instanceof JobCancellingNode ? (JobCancellingNode) handler : null;
            if (zhvVar == null) {
                zhvVar = new zhw(handler);
            }
            zhvVar = zhvVar;
        } else {
            zhvVar = handler instanceof JobNode ? (JobNode) handler : null;
            if (zhvVar != null) {
                if (ASSERTIONS_ENABLED.a() && (zhvVar instanceof JobCancellingNode)) {
                    throw new AssertionError();
                }
            } else {
                zhvVar = new zhv(handler);
            }
        }
        zhvVar.setJob(this);
        return zhvVar;
    }

    private final boolean addLastAtomic(Object obj, zig zigVar, JobNode jobNode) {
        int iTryCondAddNext;
        zig zigVar2 = zigVar;
        JobNode jobNode2 = jobNode;
        f fVar = new f(jobNode2, this, obj);
        do {
            iTryCondAddNext = zigVar2.getPrevNode().tryCondAddNext(jobNode2, zigVar2, fVar);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    private final void promoteEmptyToNodeList(zhk zhkVar) {
        zig zigVar = new zig();
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$FU, this, zhkVar, zhkVar.getF54103b() ? zigVar : new zhq(zigVar));
    }

    private final void promoteSingleToNodeList(JobNode state) {
        state.addOneIfEmpty(new zig());
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$FU, this, state, state.getNextNode());
    }

    @Override // kotlinx.coroutines.Job
    public final Object join(Continuation<? super yzc> continuation) {
        if (!joinInternal()) {
            zhs.e(continuation.getF54257c());
            return yzc.e;
        }
        Object objJoinSuspend = joinSuspend(continuation);
        return objJoinSuspend == zbg.a() ? objJoinSuspend : yzc.e;
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class g extends zcn implements Function3<zhy, SelectInstance<?>, Object, yzc> {
        public static final g e = new g();

        public final void b(zhy zhyVar, SelectInstance<?> selectInstance, Object obj) {
            zhyVar.registerSelectForOnJoin(selectInstance, obj);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ yzc invoke(zhy zhyVar, SelectInstance<?> selectInstance, Object obj) {
            b(zhyVar, selectInstance, obj);
            return yzc.e;
        }

        g() {
            super(3, zhy.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }
    }

    @Override // kotlinx.coroutines.Job
    public final SelectClause0 getOnJoin() {
        g gVar = g.e;
        zcp.e(gVar, "");
        return new znc(this, (Function3) zcy.c(gVar, 3), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForOnJoin(SelectInstance<?> select, Object ignoredParam) {
        if (!joinInternal()) {
            select.selectInRegistrationPhase(yzc.e);
        } else {
            select.disposeOnCompletion(invokeOnCompletion(new d(select)));
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnJoinCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/SelectInstance;)V", TrackConstants$Opers.INVOKE, "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class d extends JobNode {
        private final SelectInstance<?> e;

        public d(SelectInstance<?> selectInstance) {
            this.e = selectInstance;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ yzc invoke(Throwable th) {
            invoke2(th);
            return yzc.e;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(Throwable cause) {
            this.e.trySelect(zhy.this, yzc.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String cancellationExceptionMessage() {
        return "Job was cancelled";
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(Throwable cause) throws Throwable {
        zhu zhuVar;
        if (cause == null || (zhuVar = toCancellationException$default(this, cause, null, 1, null)) == null) {
            zhuVar = new zhu(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(zhuVar);
        return true;
    }

    public void cancelInternal(Throwable cause) throws Throwable {
        cancelImpl$kotlinx_coroutines_core(cause);
    }

    @Override // kotlinx.coroutines.ChildJob
    public final void parentCancelled(ParentJob parentJob) throws Throwable {
        cancelImpl$kotlinx_coroutines_core(parentJob);
    }

    public boolean childCancelled(Throwable cause) {
        if (cause instanceof CancellationException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(cause) && getD();
    }

    public final boolean cancelCoroutine(Throwable cause) {
        return cancelImpl$kotlinx_coroutines_core(cause);
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(Object cause) throws Throwable {
        Object objMakeCancelling = COMPLETING_ALREADY.f54129a;
        if (getOnCancelComplete$kotlinx_coroutines_core() && (objMakeCancelling = cancelMakeCompleting(cause)) == COMPLETING_ALREADY.f54131c) {
            return true;
        }
        if (objMakeCancelling == COMPLETING_ALREADY.f54129a) {
            objMakeCancelling = makeCancelling(cause);
        }
        if (objMakeCancelling == COMPLETING_ALREADY.f54129a || objMakeCancelling == COMPLETING_ALREADY.f54131c) {
            return true;
        }
        if (objMakeCancelling == COMPLETING_ALREADY.i) {
            return false;
        }
        afterCompletion(objMakeCancelling);
        return true;
    }

    public static /* synthetic */ zhu defaultCancellationException$kotlinx_coroutines_core$default(zhy zhyVar, String str, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        if (str == null) {
            str = zhyVar.cancellationExceptionMessage();
        }
        return new zhu(str, th, zhyVar);
    }

    public final zhu defaultCancellationException$kotlinx_coroutines_core(String str, Throwable th) {
        if (str == null) {
            str = cancellationExceptionMessage();
        }
        return new zhu(str, th, this);
    }

    @Override // kotlinx.coroutines.ParentJob
    public CancellationException getChildJobCancellationCause() {
        Throwable thC;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof a) {
            thC = ((a) state$kotlinx_coroutines_core).c();
        } else if (state$kotlinx_coroutines_core instanceof zgl) {
            thC = ((zgl) state$kotlinx_coroutines_core).f54081b;
        } else {
            if (state$kotlinx_coroutines_core instanceof Incomplete) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + state$kotlinx_coroutines_core).toString());
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new zhu("Parent job is " + stateString(state$kotlinx_coroutines_core), thC, this);
    }

    private final Throwable createCauseException(Object cause) {
        if (cause == null || (cause instanceof Throwable)) {
            Throwable th = (Throwable) cause;
            return th == null ? new zhu(cancellationExceptionMessage(), null, this) : th;
        }
        zcp.e(cause, "");
        return ((ParentJob) cause).getChildJobCancellationCause();
    }

    private final zig getOrPromoteCancellingList(Incomplete incomplete) {
        zig f54115a = incomplete.getF54108b();
        if (f54115a != null) {
            return f54115a;
        }
        if (incomplete instanceof zhk) {
            return new zig();
        }
        if (incomplete instanceof JobNode) {
            promoteSingleToNodeList((JobNode) incomplete);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + incomplete).toString());
    }

    private final boolean tryMakeCancelling(Incomplete state, Throwable rootCause) throws Throwable {
        if (ASSERTIONS_ENABLED.a() && (state instanceof a)) {
            throw new AssertionError();
        }
        if (ASSERTIONS_ENABLED.a() && !state.getF54103b()) {
            throw new AssertionError();
        }
        zig orPromoteCancellingList = getOrPromoteCancellingList(state);
        if (orPromoteCancellingList == null) {
            return false;
        }
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$FU, this, state, new a(orPromoteCancellingList, false, rootCause))) {
            return false;
        }
        notifyCancelling(orPromoteCancellingList, rootCause);
        return true;
    }

    private final Object tryMakeCompleting(Object state, Object proposedUpdate) {
        if (!(state instanceof Incomplete)) {
            return COMPLETING_ALREADY.f54129a;
        }
        if ((!(state instanceof zhk) && !(state instanceof JobNode)) || (state instanceof zgn) || (proposedUpdate instanceof zgl)) {
            return tryMakeCompletingSlowPath((Incomplete) state, proposedUpdate);
        }
        return tryFinalizeSimpleState((Incomplete) state, proposedUpdate) ? proposedUpdate : COMPLETING_ALREADY.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object tryMakeCompletingSlowPath(Incomplete state, Object proposedUpdate) throws Throwable {
        zig orPromoteCancellingList = getOrPromoteCancellingList(state);
        if (orPromoteCancellingList == null) {
            return COMPLETING_ALREADY.d;
        }
        a aVar = state instanceof a ? (a) state : null;
        if (aVar == null) {
            aVar = new a(orPromoteCancellingList, false, null);
        }
        zcw.e eVar = new zcw.e();
        synchronized (aVar) {
            if (aVar.b()) {
                return COMPLETING_ALREADY.f54129a;
            }
            aVar.d(true);
            if (aVar != state && !AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$FU, this, state, aVar)) {
                return COMPLETING_ALREADY.d;
            }
            if (ASSERTIONS_ENABLED.a() && aVar.d()) {
                throw new AssertionError();
            }
            boolean zE = aVar.e();
            zgl zglVar = proposedUpdate instanceof zgl ? (zgl) proposedUpdate : null;
            if (zglVar != null) {
                aVar.c(zglVar.f54081b);
            }
            Throwable thC = aVar.c();
            Boolean.valueOf(!zE).getClass();
            eVar.f53983c = zE ? 0 : thC;
            yzc yzcVar = yzc.e;
            Throwable th = (Throwable) eVar.f53983c;
            if (th != null) {
                notifyCancelling(orPromoteCancellingList, th);
            }
            zgn zgnVarFirstChild = firstChild(state);
            if (zgnVarFirstChild != null && tryWaitForChild(aVar, zgnVarFirstChild, proposedUpdate)) {
                return COMPLETING_ALREADY.f54131c;
            }
            return finalizeFinishingState(aVar, proposedUpdate);
        }
    }

    private final Throwable getExceptionOrNull(Object obj) {
        zgl zglVar = obj instanceof zgl ? (zgl) obj : null;
        if (zglVar != null) {
            return zglVar.f54081b;
        }
        return null;
    }

    private final zgn firstChild(Incomplete incomplete) {
        zgn zgnVar = incomplete instanceof zgn ? (zgn) incomplete : null;
        if (zgnVar != null) {
            return zgnVar;
        }
        zig f54115a = incomplete.getF54108b();
        if (f54115a != null) {
            return nextChild(f54115a);
        }
        return null;
    }

    private final boolean tryWaitForChild(a aVar, zgn zgnVar, Object obj) {
        while (Job.b.a(zgnVar.d, false, false, new c(this, aVar, zgnVar, obj), 1, null) == zif.f54134b) {
            zgnVar = nextChild(zgnVar);
            if (zgnVar == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void continueCompleting(a aVar, zgn zgnVar, Object obj) {
        if (ASSERTIONS_ENABLED.a() && getState$kotlinx_coroutines_core() != aVar) {
            throw new AssertionError();
        }
        zgn zgnVarNextChild = nextChild(zgnVar);
        if (zgnVarNextChild == null || !tryWaitForChild(aVar, zgnVarNextChild, obj)) {
            afterCompletion(finalizeFinishingState(aVar, obj));
        }
    }

    private final zgn nextChild(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getPrevNode();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!lockFreeLinkedListNode.isRemoved()) {
                if (lockFreeLinkedListNode instanceof zgn) {
                    return (zgn) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof zig) {
                    return null;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lkotlinx/coroutines/Job;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {956, 958}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class i extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Job>, Continuation<? super yzc>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f54123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f54124c;
        Object d;
        private /* synthetic */ Object e;

        /* JADX WARN: Code duplicated, block: B:22:0x006e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0070 -> B:27:0x0086). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:27:0x0086). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = defpackage.zbg.a()
                int r1 = r6.f54123b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f54124c
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
                java.lang.Object r3 = r6.d
                zls r3 = (defpackage.zls) r3
                java.lang.Object r4 = r6.e
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                defpackage.createFailure.c(r7)
                goto L86
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                defpackage.createFailure.c(r7)
                goto L8b
            L2a:
                defpackage.createFailure.c(r7)
                java.lang.Object r7 = r6.e
                kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
                zhy r1 = defpackage.zhy.this
                java.lang.Object r1 = r1.getState$kotlinx_coroutines_core()
                boolean r4 = r1 instanceof defpackage.zgn
                if (r4 == 0) goto L4b
                zgn r1 = (defpackage.zgn) r1
                kotlinx.coroutines.ChildJob r1 = r1.d
                r2 = r6
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r6.f54123b = r3
                java.lang.Object r7 = r7.yield(r1, r2)
                if (r7 != r0) goto L8b
                goto L85
            L4b:
                boolean r3 = r1 instanceof kotlinx.coroutines.Incomplete
                if (r3 == 0) goto L8b
                kotlinx.coroutines.Incomplete r1 = (kotlinx.coroutines.Incomplete) r1
                zig r1 = r1.getF54108b()
                if (r1 == 0) goto L8b
                zls r1 = (defpackage.zls) r1
                java.lang.Object r3 = r1.getNext()
                java.lang.String r4 = ""
                defpackage.zcp.e(r3, r4)
                kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L68:
                boolean r7 = defpackage.zcp.b(r1, r3)
                if (r7 != 0) goto L8b
                boolean r7 = r1 instanceof defpackage.zgn
                if (r7 == 0) goto L86
                r7 = r1
                zgn r7 = (defpackage.zgn) r7
                kotlinx.coroutines.ChildJob r7 = r7.d
                r6.e = r4
                r6.d = r3
                r6.f54124c = r1
                r6.f54123b = r2
                java.lang.Object r7 = r4.yield(r7, r6)
                if (r7 != r0) goto L86
            L85:
                return r0
            L86:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.getNextNode()
                goto L68
            L8b:
                yzc r7 = defpackage.yzc.e
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zhy.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SequenceScope<? super Job> sequenceScope, Continuation<? super yzc> continuation) {
            return ((i) create(sequenceScope, continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
            i iVar = zhy.this.new i(continuation);
            iVar.e = obj;
            return iVar;
        }

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence<Job> getChildren() {
        return zdz.e(new i(null));
    }

    @Override // kotlinx.coroutines.Job
    public final ChildHandle attachChild(ChildJob child) {
        DisposableHandle disposableHandleA = Job.b.a(this, true, false, new zgn(child), 2, null);
        zcp.e(disposableHandleA, "");
        return (ChildHandle) disposableHandleA;
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(Throwable exception) throws Throwable {
        throw exception;
    }

    public String toString() {
        return toDebugString() + '@' + classSimpleName.d(this);
    }

    public final String toDebugString() {
        return nameString$kotlinx_coroutines_core() + '{' + stateString(getState$kotlinx_coroutines_core()) + '}';
    }

    public String nameString$kotlinx_coroutines_core() {
        return classSimpleName.a(this);
    }

    private final String stateString(Object state) {
        if (state instanceof a) {
            a aVar = (a) state;
            if (aVar.e()) {
                return "Cancelling";
            }
            return aVar.b() ? "Completing" : "Active";
        }
        if (state instanceof Incomplete) {
            return ((Incomplete) state).getF54103b() ? "Active" : "New";
        }
        return state instanceof zgl ? "Cancelled" : "Completed";
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\tJ\u0018\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\t0&j\b\u0012\u0004\u0012\u00020\t`'H\u0002J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0)2\b\u0010*\u001a\u0004\u0018\u00010\tJ\b\u0010+\u001a\u00020,H\u0016R\u0011\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fX\u0082\u0004R\t\u0010\r\u001a\u00020\u000eX\u0082\u0004R\u0011\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fX\u0082\u0004R(\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0017\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006-"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;", "list", "Lkotlinx/coroutines/NodeList;", "isCompleting", "", "rootCause", "", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "_exceptionsHolder", "Lkotlinx/atomicfu/AtomicRef;", "_isCompleting", "Lkotlinx/atomicfu/AtomicBoolean;", "_rootCause", "value", "exceptionsHolder", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", r3.B, "()Z", "isCancelling", "setCompleting", "(Z)V", "isSealed", "getList", "()Lkotlinx/coroutines/NodeList;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "(Ljava/lang/Throwable;)V", "addExceptionLocked", "", TrackConstants$Events.EXCEPTION, "allocateList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sealLocked", "", "proposedException", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class a implements Incomplete {

        @Volatile
        private volatile Object _exceptionsHolder;

        @Volatile
        private volatile int _isCompleting;

        @Volatile
        private volatile Object _rootCause;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final zig f54115a;
        private static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isCompleting");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f54114c = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_rootCause");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f54113b = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_exceptionsHolder");

        @Override // kotlinx.coroutines.Incomplete
        /* JADX INFO: renamed from: getList, reason: from getter */
        public zig getF54108b() {
            return this.f54115a;
        }

        public a(zig zigVar, boolean z, Throwable th) {
            this.f54115a = zigVar;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        public final boolean b() {
            return d.get(this) != 0;
        }

        public final void d(boolean z) {
            d.set(this, z ? 1 : 0);
        }

        public final Throwable c() {
            return (Throwable) f54114c.get(this);
        }

        public final void d(Throwable th) {
            f54114c.set(this, th);
        }

        private final Object f() {
            return f54113b.get(this);
        }

        private final void b(Object obj) {
            f54113b.set(this, obj);
        }

        public final boolean d() {
            return f() == COMPLETING_ALREADY.f;
        }

        public final boolean e() {
            return c() != null;
        }

        @Override // kotlinx.coroutines.Incomplete
        /* JADX INFO: renamed from: isActive */
        public boolean getF54103b() {
            return c() == null;
        }

        public final List<Throwable> b(Throwable th) {
            ArrayList<Throwable> arrayListA;
            Object objF = f();
            if (objF == null) {
                arrayListA = a();
            } else if (objF instanceof Throwable) {
                ArrayList<Throwable> arrayListA2 = a();
                arrayListA2.add(objF);
                arrayListA = arrayListA2;
            } else {
                if (!(objF instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objF).toString());
                }
                arrayListA = (ArrayList) objF;
            }
            Throwable thC = c();
            if (thC != null) {
                arrayListA.add(0, thC);
            }
            if (th != null && !zcp.b(th, thC)) {
                arrayListA.add(th);
            }
            b(COMPLETING_ALREADY.f);
            return arrayListA;
        }

        public final void c(Throwable th) {
            Throwable thC = c();
            if (thC == null) {
                d(th);
                return;
            }
            if (th == thC) {
                return;
            }
            Object objF = f();
            if (objF == null) {
                b((Object) th);
                return;
            }
            if (!(objF instanceof Throwable)) {
                if (objF instanceof ArrayList) {
                    ((ArrayList) objF).add(th);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + objF).toString());
                }
            }
            if (th == objF) {
                return;
            }
            ArrayList<Throwable> arrayListA = a();
            arrayListA.add(objF);
            arrayListA.add(th);
            b(arrayListA);
        }

        private final ArrayList<Throwable> a() {
            return new ArrayList<>(4);
        }

        public String toString() {
            return "Finishing[cancelling=" + e() + ", completing=" + b() + ", rootCause=" + c() + ", exceptions=" + f() + ", list=" + getF54108b() + ']';
        }
    }

    private final boolean isCancelling(Incomplete incomplete) {
        return (incomplete instanceof a) && ((a) incomplete).e();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", TrackConstants$Opers.INVOKE, "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class c extends JobNode {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f54116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final zgn f54117c;
        private final Object d;
        private final zhy e;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ yzc invoke(Throwable th) {
            invoke2(th);
            return yzc.e;
        }

        public c(zhy zhyVar, a aVar, zgn zgnVar, Object obj) {
            this.e = zhyVar;
            this.f54116b = aVar;
            this.f54117c = zgnVar;
            this.d = obj;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(Throwable cause) {
            this.e.continueCompleting(this.f54116b, this.f54117c, this.d);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CancellableContinuationImpl;", "delegate", "Lkotlin/coroutines/Continuation;", "job", "Lkotlinx/coroutines/JobSupport;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "getContinuationCancellationCause", "", "parent", "Lkotlinx/coroutines/Job;", "nameString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class b<T> extends zgf<T> {
        private final zhy d;

        public b(Continuation<? super T> continuation, zhy zhyVar) {
            super(continuation, 1);
            this.d = zhyVar;
        }

        @Override // defpackage.zgf
        public Throwable e(Job job) {
            Throwable thC;
            Object state$kotlinx_coroutines_core = this.d.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof a) || (thC = ((a) state$kotlinx_coroutines_core).c()) == null) {
                return state$kotlinx_coroutines_core instanceof zgl ? ((zgl) state$kotlinx_coroutines_core).f54081b : job.getCancellationException();
            }
            return thC;
        }

        @Override // defpackage.zgf
        protected String e() {
            return "AwaitContinuation";
        }
    }

    public final boolean isCompletedExceptionally() {
        return getState$kotlinx_coroutines_core() instanceof zgl;
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        return getExceptionOrNull(state$kotlinx_coroutines_core);
    }

    public final Object getCompletedInternal$kotlinx_coroutines_core() throws Throwable {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (state$kotlinx_coroutines_core instanceof zgl) {
            throw ((zgl) state$kotlinx_coroutines_core).f54081b;
        }
        return COMPLETING_ALREADY.a(state$kotlinx_coroutines_core);
    }

    protected final Object awaitInternal(Continuation<Object> continuation) throws Throwable {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                if (state$kotlinx_coroutines_core instanceof zgl) {
                    Throwable th = ((zgl) state$kotlinx_coroutines_core).f54081b;
                    if (ASSERTIONS_ENABLED.b() && (continuation instanceof CoroutineStackFrame)) {
                        throw ARTIFICIAL_FRAME.d(th, (CoroutineStackFrame) continuation);
                    }
                    throw th;
                }
                return COMPLETING_ALREADY.a(state$kotlinx_coroutines_core);
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return awaitSuspend(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitSuspend(Continuation<Object> continuation) {
        b bVar = new b(zbg.c(continuation), this);
        bVar.initCancellability();
        getOrCreateCancellableContinuation.e(bVar, invokeOnCompletion(new zie(bVar)));
        Object objB = bVar.b();
        if (objB == zbg.a()) {
            probeCoroutineCreated.e(continuation);
        }
        return objB;
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class h extends zcn implements Function3<zhy, SelectInstance<?>, Object, yzc> {
        public static final h d = new h();

        public final void d(zhy zhyVar, SelectInstance<?> selectInstance, Object obj) {
            zhyVar.onAwaitInternalRegFunc(selectInstance, obj);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ yzc invoke(zhy zhyVar, SelectInstance<?> selectInstance, Object obj) {
            d(zhyVar, selectInstance, obj);
            return yzc.e;
        }

        h() {
            super(3, zhy.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class j extends zcn implements Function3<zhy, Object, Object, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f54125c = new j();

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zhy zhyVar, Object obj, Object obj2) {
            return zhyVar.onAwaitInternalProcessResFunc(obj, obj2);
        }

        j() {
            super(3, zhy.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }
    }

    protected final SelectClause1<?> getOnAwaitInternal() {
        h hVar = h.d;
        zcp.e(hVar, "");
        Function3 function3 = (Function3) zcy.c(hVar, 3);
        j jVar = j.f54125c;
        zcp.e(jVar, "");
        return new zne(this, function3, (Function3) zcy.c(jVar, 3), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAwaitInternalRegFunc(SelectInstance<?> select, Object ignoredParam) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                if (!(state$kotlinx_coroutines_core instanceof zgl)) {
                    state$kotlinx_coroutines_core = COMPLETING_ALREADY.a(state$kotlinx_coroutines_core);
                }
                select.selectInRegistrationPhase(state$kotlinx_coroutines_core);
                return;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        select.disposeOnCompletion(invokeOnCompletion(new e(select)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onAwaitInternalProcessResFunc(Object ignoredParam, Object result) throws Throwable {
        if (result instanceof zgl) {
            throw ((zgl) result).f54081b;
        }
        return result;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnAwaitCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/SelectInstance;)V", TrackConstants$Opers.INVOKE, "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class e extends JobNode {
        private final SelectInstance<?> d;

        public e(SelectInstance<?> selectInstance) {
            this.d = selectInstance;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ yzc invoke(Throwable th) {
            invoke2(th);
            return yzc.e;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(Throwable cause) {
            Object state$kotlinx_coroutines_core = zhy.this.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof zgl)) {
                state$kotlinx_coroutines_core = COMPLETING_ALREADY.a(state$kotlinx_coroutines_core);
            }
            this.d.trySelect(zhy.this, state$kotlinx_coroutines_core);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x002a, please report this as an issue */
    private final void notifyCompletion(zig zigVar, Throwable th) throws Throwable {
        zig zigVar2 = zigVar;
        Object next = zigVar2.getNext();
        zcp.e(next, "");
        zgp zgpVar = null;
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !zcp.b(nextNode, zigVar2); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof JobNode) {
                JobNode jobNode = (JobNode) nextNode;
                try {
                    jobNode.invoke(th);
                } catch (Throwable th2) {
                    zgp zgpVar2 = zgpVar;
                    if (zgpVar2 == null) {
                        zgp zgpVar3 = new zgp("Exception in completion handler " + jobNode + " for " + this, th2);
                        yzc yzcVar = yzc.e;
                        zgpVar = zgpVar3;
                    } else {
                        yyl.d(zgpVar2, th2);
                        if (zgpVar2 == null) {
                            zgp zgpVar4 = new zgp("Exception in completion handler " + jobNode + " for " + this, th2);
                            yzc yzcVar2 = yzc.e;
                            zgpVar = zgpVar4;
                        }
                    }
                }
            }
        }
        zgp zgpVar5 = zgpVar;
        if (zgpVar5 != null) {
            handleOnCompletionException$kotlinx_coroutines_core(zgpVar5);
        }
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int iStartInternal;
        do {
            iStartInternal = startInternal(getState$kotlinx_coroutines_core());
            if (iStartInternal == 0) {
                return false;
            }
        } while (iStartInternal != 1);
        return true;
    }

    private final boolean joinInternal() {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                return false;
            }
        } while (startInternal(state$kotlinx_coroutines_core) < 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object joinSuspend(Continuation<? super yzc> continuation) {
        zgf zgfVar = new zgf(zbg.c(continuation), 1);
        zgfVar.initCancellability();
        zgf zgfVar2 = zgfVar;
        getOrCreateCancellableContinuation.e(zgfVar2, invokeOnCompletion(new zid(zgfVar2)));
        Object objB = zgfVar.b();
        if (objB == zbg.a()) {
            probeCoroutineCreated.e(continuation);
        }
        return objB == zbg.a() ? objB : yzc.e;
    }

    public final void removeNode$kotlinx_coroutines_core(JobNode node) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof JobNode)) {
                if (!(state$kotlinx_coroutines_core instanceof Incomplete) || ((Incomplete) state$kotlinx_coroutines_core).getF54108b() == null) {
                    return;
                }
                node.remove();
                return;
            }
            if (state$kotlinx_coroutines_core != node) {
                return;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$FU, this, state$kotlinx_coroutines_core, COMPLETING_ALREADY.e));
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(CancellationException cause) throws Throwable {
        if (cause == null) {
            cause = new zhu(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cause);
    }

    private final Object cancelMakeCompleting(Object cause) {
        Object objTryMakeCompleting;
        do {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete) || ((state$kotlinx_coroutines_core instanceof a) && ((a) state$kotlinx_coroutines_core).b())) {
                return COMPLETING_ALREADY.f54129a;
            }
            objTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new zgl(createCauseException(cause), false, 2, null));
        } while (objTryMakeCompleting == COMPLETING_ALREADY.d);
        return objTryMakeCompleting;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object makeCancelling(Object cause) throws Throwable {
        Object[] objArr = 0;
        Throwable thCreateCauseException = null;
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof a)) {
                if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                    return COMPLETING_ALREADY.i;
                }
                if (thCreateCauseException == null) {
                    thCreateCauseException = createCauseException(cause);
                }
                Incomplete incomplete = (Incomplete) state$kotlinx_coroutines_core;
                if (incomplete.getF54103b()) {
                    if (tryMakeCancelling(incomplete, thCreateCauseException)) {
                        return COMPLETING_ALREADY.f54129a;
                    }
                } else {
                    Object objTryMakeCompleting = tryMakeCompleting(state$kotlinx_coroutines_core, new zgl(thCreateCauseException, false, 2, objArr == true ? 1 : 0));
                    if (objTryMakeCompleting != COMPLETING_ALREADY.f54129a) {
                        if (objTryMakeCompleting != COMPLETING_ALREADY.d) {
                            return objTryMakeCompleting;
                        }
                    } else {
                        throw new IllegalStateException(("Cannot happen in " + state$kotlinx_coroutines_core).toString());
                    }
                }
            } else {
                synchronized (state$kotlinx_coroutines_core) {
                    if (((a) state$kotlinx_coroutines_core).d()) {
                        return COMPLETING_ALREADY.i;
                    }
                    boolean zE = ((a) state$kotlinx_coroutines_core).e();
                    if (cause != null || !zE) {
                        if (thCreateCauseException == null) {
                            thCreateCauseException = createCauseException(cause);
                        }
                        ((a) state$kotlinx_coroutines_core).c(thCreateCauseException);
                    }
                    Throwable thC = zE ? null : ((a) state$kotlinx_coroutines_core).c();
                    if (thC != null) {
                        notifyCancelling(((a) state$kotlinx_coroutines_core).getF54108b(), thC);
                    }
                    return COMPLETING_ALREADY.f54129a;
                }
            }
        }
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(Object proposedUpdate) {
        Object objTryMakeCompleting;
        do {
            objTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), proposedUpdate);
            if (objTryMakeCompleting == COMPLETING_ALREADY.f54129a) {
                return false;
            }
            if (objTryMakeCompleting == COMPLETING_ALREADY.f54131c) {
                return true;
            }
        } while (objTryMakeCompleting == COMPLETING_ALREADY.d);
        afterCompletion(objTryMakeCompleting);
        return true;
    }

    public final Object makeCompletingOnce$kotlinx_coroutines_core(Object proposedUpdate) {
        Object objTryMakeCompleting;
        do {
            objTryMakeCompleting = tryMakeCompleting(getState$kotlinx_coroutines_core(), proposedUpdate);
            if (objTryMakeCompleting == COMPLETING_ALREADY.f54129a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, getExceptionOrNull(proposedUpdate));
            }
        } while (objTryMakeCompleting == COMPLETING_ALREADY.d);
        return objTryMakeCompleting;
    }

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, yzc> function1, Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }
}
