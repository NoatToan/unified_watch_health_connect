package kotlinx.coroutines.selects;

import com.facebook.login.a;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.notification.TransportUri;
import com.xmlywind.sdk.common.mta.PointCategory;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImplKt;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.CompletionStateKt;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobCancellingNode;
import kotlinx.coroutines.internal.AtomicDesc;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.AtomicOp;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectBuilderImpl, reason: from toString */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0004WXYCB\u0015\u0012\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bU\u0010VJ.\u0010\r\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u001aH\u0001¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001b\u0010*\u001a\u0004\u0018\u00010\t2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u0004\u0018\u00010\t2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J5\u00105\u001a\u00020\u000b*\u0002032\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t04H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00106JG\u00105\u001a\u00020\u000b\"\u0004\b\u0001\u00107*\b\u0012\u0004\u0012\u00028\u0001082\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t09H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b5\u0010:J[\u00105\u001a\u00020\u000b\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u00107*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020<2\u0006\u0010=\u001a\u00028\u00012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t09H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b5\u0010>J8\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020?2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t04H\u0016ø\u0001\u0000¢\u0006\u0004\bA\u0010BR\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR(\u0010I\u001a\u0004\u0018\u00010!2\b\u0010\n\u001a\u0004\u0018\u00010!8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010$R\u001e\u0010L\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0016\u0010P\u001a\u00020M8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020%8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Z"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl;", "R", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/Function0;", "", "value", "", TransportUri.ACTION_BLOCK, "f", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "initCancellability", "()V", "e", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", Constants.EXCEPTION, "resumeSelectWithException", "(Ljava/lang/Throwable;)V", "getResult", "()Ljava/lang/Object;", "handleBuilderException", "Lkotlinx/coroutines/DisposableHandle;", "handle", "disposeOnSelect", "(Lkotlinx/coroutines/DisposableHandle;)V", "", "trySelect", "()Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "otherOp", "trySelectOther", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/AtomicDesc;", "desc", "performAtomicTrySelect", "(Lkotlinx/coroutines/internal/AtomicDesc;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/selects/SelectClause0;", "Lkotlin/Function1;", "invoke", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "timeMillis", "onTimeout", "(JLkotlin/jvm/functions/Function1;)V", GoogleApiAvailabilityLight.a, "Lkotlin/coroutines/Continuation;", "uCont", "g", "()Lkotlinx/coroutines/DisposableHandle;", "h", "parentHandle", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", DbUtils.Const.Table.CONTEXT, "getCompletion", "()Lkotlin/coroutines/Continuation;", "completion", "isSelected", "<init>", "(Lkotlin/coroutines/Continuation;)V", "a", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
@PublishedApi
public final class SelectInstance<R> extends LockFreeLinkedListHead implements SelectBuilder<R>, kotlinx.coroutines.selects.SelectInstance<R>, Continuation<R>, CoroutineStackFrame {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(SelectInstance.class, Object.class, "_state");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(SelectInstance.class, Object.class, "_result");

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Continuation<R> uCont;

    /* JADX INFO: renamed from: _state, reason: from toString */
    @NotNull
    public volatile /* synthetic */ Object state = SelectKt.getNOT_SELECTED();

    /* JADX INFO: renamed from: _result, reason: from toString */
    @NotNull
    public volatile /* synthetic */ Object result = SelectKt.c;

    @NotNull
    private volatile /* synthetic */ Object _parentHandle = null;

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectBuilderImpl$a, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0018\u001a\u00020\u00138\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"kotlinx/coroutines/selects/SelectBuilderImpl$a", "Lkotlinx/coroutines/internal/AtomicOp;", "", "b", "", "c", a.K, "a", "affected", "prepare", PointCategory.COMPLETE, "", "toString", "Lkotlinx/coroutines/selects/SelectBuilderImpl;", "Lkotlinx/coroutines/selects/SelectBuilderImpl;", "impl", "Lkotlinx/coroutines/internal/AtomicDesc;", "Lkotlinx/coroutines/internal/AtomicDesc;", "desc", "", GoogleApiAvailabilityLight.a, "J", "getOpSequence", "()J", "opSequence", "<init>", "(Lkotlinx/coroutines/selects/SelectBuilderImpl;Lkotlinx/coroutines/internal/AtomicDesc;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public static final class AtomicSelectOp extends AtomicOp<Object> {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final SelectInstance<?> impl;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final AtomicDesc desc;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final long opSequence = SelectKt.e.next();

        public AtomicSelectOp(@NotNull SelectInstance<?> selectInstance, @NotNull AtomicDesc atomicDesc) {
            this.impl = selectInstance;
            this.desc = atomicDesc;
            atomicDesc.setAtomicOp(this);
        }

        private final void a(Object failure) {
            boolean z = failure == null;
            if (SelectInstance.e.compareAndSet(this.impl, this, z ? null : SelectKt.getNOT_SELECTED()) && z) {
                this.impl.e();
            }
        }

        private final Object b() {
            SelectInstance<?> selectInstance = this.impl;
            while (true) {
                Object obj = selectInstance.state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof OpDescriptor) {
                    ((OpDescriptor) obj).perform(this.impl);
                } else {
                    if (obj != SelectKt.getNOT_SELECTED()) {
                        return SelectKt.getALREADY_SELECTED();
                    }
                    if (SelectInstance.e.compareAndSet(this.impl, SelectKt.getNOT_SELECTED(), this)) {
                        return null;
                    }
                }
            }
        }

        private final void c() {
            SelectInstance.e.compareAndSet(this.impl, this, SelectKt.getNOT_SELECTED());
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public void complete(@Nullable Object affected, @Nullable Object failure) {
            a(failure);
            this.desc.complete(this, failure);
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public long getOpSequence() {
            return this.opSequence;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        @Nullable
        public Object prepare(@Nullable Object affected) {
            Object objB;
            if (affected == null && (objB = b()) != null) {
                return objB;
            }
            try {
                return this.desc.prepare(this);
            } catch (Throwable th) {
                if (affected == null) {
                    c();
                }
                throw th;
            }
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        @NotNull
        public String toString() {
            return "AtomicSelectOp(sequence=" + getOpSequence() + ')';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectBuilderImpl$b */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"kotlinx/coroutines/selects/SelectBuilderImpl$b", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;", GoogleApiAvailabilityLight.a, "Lkotlinx/coroutines/DisposableHandle;", "handle", "<init>", "(Lkotlinx/coroutines/DisposableHandle;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public static final class b extends LockFreeLinkedListNode {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final DisposableHandle handle;

        public b(@NotNull DisposableHandle disposableHandle) {
            this.handle = disposableHandle;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectBuilderImpl$c */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"kotlinx/coroutines/selects/SelectBuilderImpl$c", "Lkotlinx/coroutines/internal/OpDescriptor;", "", "affected", "perform", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "a", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "otherOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "atomicOp", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public static final class c extends OpDescriptor {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final LockFreeLinkedListNode.PrepareOp otherOp;

        public c(@NotNull LockFreeLinkedListNode.PrepareOp prepareOp) {
            this.otherOp = prepareOp;
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        @NotNull
        public AtomicOp<?> getAtomicOp() {
            return this.otherOp.getAtomicOp();
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        @Nullable
        public Object perform(@Nullable Object affected) {
            Objects.requireNonNull(affected, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
            SelectInstance selectInstance = (SelectInstance) affected;
            this.otherOp.finishPrepare();
            Object objDecide = this.otherOp.getAtomicOp().decide(null);
            SelectInstance.e.compareAndSet(selectInstance, this, objDecide == null ? this.otherOp.desc : SelectKt.getNOT_SELECTED());
            return objDecide;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectBuilderImpl$d */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\b"}, d2 = {"kotlinx/coroutines/selects/SelectBuilderImpl$d", "Lkotlinx/coroutines/JobCancellingNode;", "", "cause", "", "invoke", "<init>", "(Lkotlinx/coroutines/selects/SelectBuilderImpl;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public final class d extends JobCancellingNode {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(@Nullable Throwable cause) {
            if (SelectInstance.this.trySelect()) {
                SelectInstance.this.resumeSelectWithException(getJob().getCancellationException());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectInstance(@NotNull Continuation<? super R> continuation) {
        this.uCont = continuation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        DisposableHandle disposableHandleG = g();
        if (disposableHandleG != null) {
            disposableHandleG.dispose();
        }
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) getNext(); !Intrinsics.areEqual(nextNode, this); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof b) {
                ((b) nextNode).handle.dispose();
            }
        }
    }

    private final void f(Function0<? extends Object> value, Function0<Unit> block) {
        if (DebugKt.getASSERTIONS_ENABLED() && !isSelected()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this.result;
            if (obj == SelectKt.c) {
                if (f.compareAndSet(this, SelectKt.c, value.invoke())) {
                    return;
                }
            } else {
                if (obj != kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (f.compareAndSet(this, kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED(), SelectKt.d)) {
                    block.invoke();
                    return;
                }
            }
        }
    }

    private final DisposableHandle g() {
        return (DisposableHandle) this._parentHandle;
    }

    private final void h(DisposableHandle disposableHandle) {
        this._parentHandle = disposableHandle;
    }

    private final void initCancellability() {
        Job job = (Job) getContext().get(Job.INSTANCE);
        if (job == null) {
            return;
        }
        DisposableHandle disposableHandleInvokeOnCompletion$default = Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new d(), 2, null);
        h(disposableHandleInvokeOnCompletion$default);
        if (isSelected()) {
            disposableHandleInvokeOnCompletion$default.dispose();
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnSelect(@NotNull DisposableHandle handle) {
        b bVar = new b(handle);
        if (!isSelected()) {
            addLast(bVar);
            if (!isSelected()) {
                return;
            }
        }
        handle.dispose();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<R> continuation = this.uCont;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    @NotNull
    public Continuation<R> getCompletion() {
        return this;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.uCont.getContext();
    }

    @PublishedApi
    @Nullable
    public final Object getResult() throws Throwable {
        if (!isSelected()) {
            initCancellability();
        }
        Object obj = this.result;
        if (obj == SelectKt.c) {
            if (f.compareAndSet(this, SelectKt.c, kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED())) {
                return kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            }
            obj = this.result;
        }
        if (obj == SelectKt.d) {
            throw new IllegalStateException("Already resumed");
        }
        if (obj instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) obj).cause;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @PublishedApi
    public final void handleBuilderException(@NotNull Throwable e2) throws Throwable {
        if (trySelect()) {
            Result.Companion companion = Result.Companion;
            resumeWith(Result.m3845constructorimpl(ResultKt.createFailure(e2)));
        } else {
            if (e2 instanceof CancellationException) {
                return;
            }
            Object result = getResult();
            if (result instanceof CompletedExceptionally) {
                Throwable thUnwrapImpl = ((CompletedExceptionally) result).cause;
                if (DebugKt.getRECOVER_STACK_TRACES()) {
                    thUnwrapImpl = StackTraceRecoveryKt.unwrapImpl(thUnwrapImpl);
                }
                if (thUnwrapImpl == (!DebugKt.getRECOVER_STACK_TRACES() ? e2 : StackTraceRecoveryKt.unwrapImpl(e2))) {
                    return;
                }
            }
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), e2);
        }
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(@NotNull SelectClause2<? super P, ? extends Q> selectClause2, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        SelectBuilder.DefaultImpls.invoke(this, selectClause2, function2);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean isSelected() {
        while (true) {
            Object obj = this.state;
            if (obj == SelectKt.getNOT_SELECTED()) {
                return false;
            }
            if (!(obj instanceof OpDescriptor)) {
                return true;
            }
            ((OpDescriptor) obj).perform(this);
        }
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void onTimeout(long timeMillis, @NotNull final Function1<? super Continuation<? super R>, ? extends Object> block) {
        if (timeMillis > 0) {
            disposeOnSelect(DelayKt.getDelay(getContext()).invokeOnTimeout(timeMillis, new Runnable() { // from class: kotlinx.coroutines.selects.SelectBuilderImpl$onTimeout$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    if (this.a.trySelect()) {
                        CancellableKt.startCoroutineCancellable(block, this.a.getCompletion());
                    }
                }
            }, getContext()));
        } else if (trySelect()) {
            UndispatchedKt.startCoroutineUnintercepted(block, getCompletion());
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    @Nullable
    public Object performAtomicTrySelect(@NotNull AtomicDesc desc) {
        return new AtomicSelectOp(this, desc).perform(null);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void resumeSelectWithException(@NotNull Throwable exception) {
        if (DebugKt.getASSERTIONS_ENABLED() && !isSelected()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this.result;
            if (obj == SelectKt.c) {
                Continuation<R> continuation = this.uCont;
                if (f.compareAndSet(this, SelectKt.c, new CompletedExceptionally((DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof CoroutineStackFrame)) ? StackTraceRecoveryKt.h(exception, (CoroutineStackFrame) continuation) : exception, false, 2, null))) {
                    return;
                }
            } else {
                if (obj != kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (f.compareAndSet(this, kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED(), SelectKt.d)) {
                    Continuation continuationIntercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.uCont);
                    Result.Companion companion = Result.Companion;
                    continuationIntercepted.resumeWith(Result.m3845constructorimpl(ResultKt.createFailure(exception)));
                    return;
                }
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object result) {
        if (DebugKt.getASSERTIONS_ENABLED() && !isSelected()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this.result;
            if (obj == SelectKt.c) {
                if (f.compareAndSet(this, SelectKt.c, CompletionStateKt.toState$default(result, null, 1, null))) {
                    return;
                }
            } else {
                if (obj != kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (f.compareAndSet(this, kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED(), SelectKt.d)) {
                    if (!Result.m3850isFailureimpl(result)) {
                        this.uCont.resumeWith(result);
                        return;
                    }
                    Continuation<R> continuation = this.uCont;
                    Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(result);
                    Result.Companion companion = Result.Companion;
                    if (DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof CoroutineStackFrame)) {
                        thM3848exceptionOrNullimpl = StackTraceRecoveryKt.h(thM3848exceptionOrNullimpl, (CoroutineStackFrame) continuation);
                    }
                    continuation.resumeWith(Result.m3845constructorimpl(ResultKt.createFailure(thM3848exceptionOrNullimpl)));
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return "SelectInstance(state=" + this.state + ", result=" + this.result + ')';
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect() {
        Object objTrySelectOther = trySelectOther(null);
        if (objTrySelectOther == CancellableContinuationImplKt.RESUME_TOKEN) {
            return true;
        }
        if (objTrySelectOther == null) {
            return false;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Unexpected trySelectIdempotent result ", objTrySelectOther).toString());
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    @Nullable
    public Object trySelectOther(@Nullable LockFreeLinkedListNode.PrepareOp otherOp) {
        while (true) {
            Object obj = this.state;
            if (obj == SelectKt.getNOT_SELECTED()) {
                if (otherOp != null) {
                    c cVar = new c(otherOp);
                    if (e.compareAndSet(this, SelectKt.getNOT_SELECTED(), cVar)) {
                        Object objPerform = cVar.perform(this);
                        if (objPerform == null) {
                            break;
                        }
                        return objPerform;
                    }
                } else if (e.compareAndSet(this, SelectKt.getNOT_SELECTED(), null)) {
                    break;
                }
            } else {
                if (!(obj instanceof OpDescriptor)) {
                    if (otherOp != null && obj == otherOp.desc) {
                        return CancellableContinuationImplKt.RESUME_TOKEN;
                    }
                    return null;
                }
                if (otherOp != null) {
                    AtomicOp<?> atomicOp = otherOp.getAtomicOp();
                    if ((atomicOp instanceof AtomicSelectOp) && ((AtomicSelectOp) atomicOp).impl == this) {
                        throw new IllegalStateException("Cannot use matching select clauses on the same object".toString());
                    }
                    if (atomicOp.isEarlierThan((OpDescriptor) obj)) {
                        return AtomicKt.RETRY_ATOMIC;
                    }
                }
                ((OpDescriptor) obj).perform(this);
            }
        }
        e();
        return CancellableContinuationImplKt.RESUME_TOKEN;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(@NotNull SelectClause0 selectClause0, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        selectClause0.registerSelectClause0(this, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(@NotNull SelectClause1<? extends Q> selectClause1, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        selectClause1.registerSelectClause1(this, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(@NotNull SelectClause2<? super P, ? extends Q> selectClause2, P p, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        selectClause2.registerSelectClause2(this, p, function2);
    }
}
