package kotlinx.coroutines.sync;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.notification.TransportUri;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.reminder.AdRemindParserKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImplKt;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.AtomicDesc;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.AtomicOp;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectKt;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0006\u0006$%&'(B\u000f\u0012\u0006\u0010!\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u001d\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0007JT\u0010\u0012\u001a\u00020\u0005\"\u0004\b\u0000\u0010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u0019\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\b8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR$\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/selects/SelectClause2;", "", DataCacher.o, "", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tryLock", "(Ljava/lang/Object;)Z", "lock", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", TransportUri.ACTION_BLOCK, "registerSelectClause2", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "holdsLock", "unlock", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "isLocked", "()Z", "isLockedEmptyQueueState$kotlinx_coroutines_core", "isLockedEmptyQueueState", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onLock", "locked", "<init>", "(Z)V", "b", "c", GoogleApiAvailabilityLight.a, "e", "f", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public final class MutexImpl implements Mutex, SelectClause2<Object, Mutex> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "_state");

    @NotNull
    public volatile /* synthetic */ Object _state;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u0010"}, d2 = {"kotlinx/coroutines/sync/MutexImpl$a", "Lkotlinx/coroutines/sync/MutexImpl$c;", "Lkotlinx/coroutines/sync/MutexImpl;", "", "g", "", "e", "", "toString", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", DataCacher.o, "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public final class a extends c {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        private final CancellableContinuation<Unit> cont;

        /* JADX INFO: renamed from: kotlinx.coroutines.sync.MutexImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C1185a extends Lambda implements Function1<Throwable, Unit> {
            public final /* synthetic */ MutexImpl a;
            public final /* synthetic */ a b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1185a(MutexImpl mutexImpl, a aVar) {
                super(1);
                this.a = mutexImpl;
                this.b = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                this.a.unlock(this.b.owner);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Object obj, CancellableContinuation<? super Unit> cancellableContinuation) {
            super(obj);
            this.cont = cancellableContinuation;
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.c
        public void e() {
            this.cont.completeResume(CancellableContinuationImplKt.RESUME_TOKEN);
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.c
        public boolean g() {
            return f() && this.cont.tryResume(Unit.INSTANCE, null, new C1185a(MutexImpl.this, this)) != null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            return "LockCont[" + this.owner + ", " + this.cont + "] for " + MutexImpl.this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002R\u00020\u0003BF\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR5\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r8\u0006@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"kotlinx/coroutines/sync/MutexImpl$b", "R", "Lkotlinx/coroutines/sync/MutexImpl$c;", "Lkotlinx/coroutines/sync/MutexImpl;", "", "g", "", "e", "", "toString", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/coroutines/Continuation;", "", "h", "Lkotlin/jvm/functions/Function2;", TransportUri.ACTION_BLOCK, DataCacher.o, "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public final class b<R> extends c {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final SelectInstance<R> select;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final Function2<Mutex, Continuation<? super R>, Object> block;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Throwable, Unit> {
            public final /* synthetic */ MutexImpl a;
            public final /* synthetic */ b<R> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MutexImpl mutexImpl, b<R> bVar) {
                super(1);
                this.a = mutexImpl;
                this.b = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                this.a.unlock(this.b.owner);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull Object obj, @NotNull SelectInstance<? super R> selectInstance, Function2<? super Mutex, ? super Continuation<? super R>, ? extends Object> function2) {
            super(obj);
            this.select = selectInstance;
            this.block = function2;
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.c
        public void e() throws Throwable {
            CancellableKt.startCoroutineCancellable(this.block, MutexImpl.this, this.select.getCompletion(), new a(MutexImpl.this, this));
        }

        @Override // kotlinx.coroutines.sync.MutexImpl.c
        public boolean g() {
            return f() && this.select.trySelect();
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            return "LockSelect[" + this.owner + ", " + this.select + "] for " + MutexImpl.this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"kotlinx/coroutines/sync/MutexImpl$c", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;", "", "f", "()Z", "", "dispose", "()V", "g", "e", "", GoogleApiAvailabilityLight.a, "Ljava/lang/Object;", DataCacher.o, "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public abstract class c extends LockFreeLinkedListNode implements DisposableHandle {
        private static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "isTaken");

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Object owner;

        @NotNull
        private volatile /* synthetic */ Object isTaken = Boolean.FALSE;

        public c(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            remove();
        }

        public abstract void e();

        public final boolean f() {
            return f.compareAndSet(this, Boolean.FALSE, Boolean.TRUE);
        }

        public abstract boolean g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"kotlinx/coroutines/sync/MutexImpl$d", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "", "toString", "", GoogleApiAvailabilityLight.a, "Ljava/lang/Object;", DataCacher.o, "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public static final class d extends LockFreeLinkedListHead {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public Object owner;

        public d(@NotNull Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            return "LockedQueue[" + this.owner + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0019\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"kotlinx/coroutines/sync/MutexImpl$e", "Lkotlinx/coroutines/internal/AtomicDesc;", "Lkotlinx/coroutines/internal/AtomicOp;", AdRemindParserKt.KEY_OP, "", "prepare", com.facebook.login.a.K, "", PointCategory.COMPLETE, "Lkotlinx/coroutines/sync/MutexImpl;", "a", "Lkotlinx/coroutines/sync/MutexImpl;", "mutex", "b", "Ljava/lang/Object;", DataCacher.o, "<init>", "(Lkotlinx/coroutines/sync/MutexImpl;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public static final class e extends AtomicDesc {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final MutexImpl mutex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Object owner;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"kotlinx/coroutines/sync/MutexImpl$e$a", "Lkotlinx/coroutines/internal/OpDescriptor;", "", "affected", "perform", "Lkotlinx/coroutines/internal/AtomicOp;", "a", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "atomicOp", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl$e;Lkotlinx/coroutines/internal/AtomicOp;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
        public final class a extends OpDescriptor {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final AtomicOp<?> atomicOp;

            public a(AtomicOp<?> atomicOp) {
                this.atomicOp = atomicOp;
            }

            @Override // kotlinx.coroutines.internal.OpDescriptor
            @NotNull
            public AtomicOp<?> getAtomicOp() {
                return this.atomicOp;
            }

            @Override // kotlinx.coroutines.internal.OpDescriptor
            @Nullable
            public Object perform(@Nullable Object affected) {
                Object atomicOp = getAtomicOp().isDecided() ? MutexKt.f : getAtomicOp();
                Objects.requireNonNull(affected, "null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
                MutexImpl.a.compareAndSet((MutexImpl) affected, this, atomicOp);
                return null;
            }
        }

        public e(@NotNull MutexImpl mutexImpl, @Nullable Object obj) {
            this.mutex = mutexImpl;
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        public void complete(@NotNull AtomicOp<?> op, @Nullable Object failure) {
            kotlinx.coroutines.sync.b bVar;
            if (failure != null) {
                bVar = MutexKt.f;
            } else {
                Object obj = this.owner;
                bVar = obj == null ? MutexKt.e : new kotlinx.coroutines.sync.b(obj);
            }
            MutexImpl.a.compareAndSet(this.mutex, op, bVar);
        }

        @Override // kotlinx.coroutines.internal.AtomicDesc
        @Nullable
        public Object prepare(@NotNull AtomicOp<?> op) {
            a aVar = new a(op);
            return !MutexImpl.a.compareAndSet(this.mutex, MutexKt.f, aVar) ? MutexKt.a : aVar.perform(this.mutex);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"kotlinx/coroutines/sync/MutexImpl$f", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/sync/MutexImpl;", "affected", "", "b", com.facebook.login.a.K, "", "a", "Lkotlinx/coroutines/sync/MutexImpl$d;", "Lkotlinx/coroutines/sync/MutexImpl$d;", "queue", "<init>", "(Lkotlinx/coroutines/sync/MutexImpl$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    public static final class f extends AtomicOp<MutexImpl> {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final d queue;

        public f(@NotNull d dVar) {
            this.queue = dVar;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void complete(@NotNull MutexImpl affected, @Nullable Object failure) {
            MutexImpl.a.compareAndSet(affected, this, failure == null ? MutexKt.f : this.queue);
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object prepare(@NotNull MutexImpl affected) {
            if (this.queue.isEmpty()) {
                return null;
            }
            return MutexKt.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Throwable, Unit> {
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Object obj) {
            super(1);
            this.b = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Throwable th) {
            MutexImpl.this.unlock(this.b);
        }
    }

    public MutexImpl(boolean z) {
        this._state = z ? MutexKt.e : MutexKt.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Object obj, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        a aVar = new a(obj, orCreateCancellableContinuation);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.b) {
                kotlinx.coroutines.sync.b bVar = (kotlinx.coroutines.sync.b) obj2;
                if (bVar.locked != MutexKt.d) {
                    a.compareAndSet(this, obj2, new d(bVar.locked));
                } else {
                    if (a.compareAndSet(this, obj2, obj == null ? MutexKt.e : new kotlinx.coroutines.sync.b(obj))) {
                        orCreateCancellableContinuation.resume(Unit.INSTANCE, new g(obj));
                        break;
                    }
                }
            } else if (obj2 instanceof d) {
                d dVar = (d) obj2;
                if (!(dVar.owner != obj)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("Already locked by ", obj).toString());
                }
                dVar.addLast(aVar);
                if (this._state == obj2 || !aVar.f()) {
                    CancellableContinuationKt.removeOnCancellation(orCreateCancellableContinuation, aVar);
                    break;
                }
                aVar = new a(obj, orCreateCancellableContinuation);
            } else {
                if (!(obj2 instanceof OpDescriptor)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("Illegal state ", obj2).toString());
                }
                ((OpDescriptor) obj2).perform(this);
            }
        }
        Object result = orCreateCancellableContinuation.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    @NotNull
    public SelectClause2<Object, Mutex> getOnLock() {
        return this;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(@NotNull Object owner) {
        Object obj = this._state;
        if (obj instanceof kotlinx.coroutines.sync.b) {
            if (((kotlinx.coroutines.sync.b) obj).locked == owner) {
                return true;
            }
        } else if ((obj instanceof d) && ((d) obj).owner == owner) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                return ((kotlinx.coroutines.sync.b) obj).locked != MutexKt.d;
            }
            if (obj instanceof d) {
                return true;
            }
            if (!(obj instanceof OpDescriptor)) {
                throw new IllegalStateException(Intrinsics.stringPlus("Illegal state ", obj).toString());
            }
            ((OpDescriptor) obj).perform(this);
        }
    }

    public final boolean isLockedEmptyQueueState$kotlinx_coroutines_core() {
        Object obj = this._state;
        return (obj instanceof d) && ((d) obj).isEmpty();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    @Nullable
    public Object lock(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        Object objA;
        return (!tryLock(obj) && (objA = a(obj, continuation)) == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) ? objA : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.selects.SelectClause2
    public <R> void registerSelectClause2(@NotNull SelectInstance<? super R> select, @Nullable Object owner, @NotNull Function2<? super Mutex, ? super Continuation<? super R>, ? extends Object> block) {
        while (!select.isSelected()) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                kotlinx.coroutines.sync.b bVar = (kotlinx.coroutines.sync.b) obj;
                if (bVar.locked != MutexKt.d) {
                    a.compareAndSet(this, obj, new d(bVar.locked));
                } else {
                    Object objPerformAtomicTrySelect = select.performAtomicTrySelect(new e(this, owner));
                    if (objPerformAtomicTrySelect == null) {
                        UndispatchedKt.startCoroutineUnintercepted(block, this, select.getCompletion());
                        return;
                    } else {
                        if (objPerformAtomicTrySelect == SelectKt.getALREADY_SELECTED()) {
                            return;
                        }
                        if (objPerformAtomicTrySelect != MutexKt.a && objPerformAtomicTrySelect != AtomicKt.RETRY_ATOMIC) {
                            throw new IllegalStateException(Intrinsics.stringPlus("performAtomicTrySelect(TryLockDesc) returned ", objPerformAtomicTrySelect).toString());
                        }
                    }
                }
            } else if (obj instanceof d) {
                d dVar = (d) obj;
                if (!(dVar.owner != owner)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("Already locked by ", owner).toString());
                }
                b bVar2 = new b(owner, select, block);
                dVar.addLast(bVar2);
                if (this._state == obj || !bVar2.f()) {
                    select.disposeOnSelect(bVar2);
                    return;
                }
            } else {
                if (!(obj instanceof OpDescriptor)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("Illegal state ", obj).toString());
                }
                ((OpDescriptor) obj).perform(this);
            }
        }
    }

    @NotNull
    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                return "Mutex[" + ((kotlinx.coroutines.sync.b) obj).locked + JsonLexerKt.END_LIST;
            }
            if (!(obj instanceof OpDescriptor)) {
                if (!(obj instanceof d)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("Illegal state ", obj).toString());
                }
                return "Mutex[" + ((d) obj).owner + JsonLexerKt.END_LIST;
            }
            ((OpDescriptor) obj).perform(this);
        }
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(@Nullable Object owner) {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                if (((kotlinx.coroutines.sync.b) obj).locked != MutexKt.d) {
                    return false;
                }
                if (a.compareAndSet(this, obj, owner == null ? MutexKt.e : new kotlinx.coroutines.sync.b(owner))) {
                    return true;
                }
            } else {
                if (obj instanceof d) {
                    if (((d) obj).owner != owner) {
                        return false;
                    }
                    throw new IllegalStateException(Intrinsics.stringPlus("Already locked by ", owner).toString());
                }
                if (!(obj instanceof OpDescriptor)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("Illegal state ", obj).toString());
                }
                ((OpDescriptor) obj).perform(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(@Nullable Object owner) {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                if (owner == null) {
                    if (!(((kotlinx.coroutines.sync.b) obj).locked != MutexKt.d)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    kotlinx.coroutines.sync.b bVar = (kotlinx.coroutines.sync.b) obj;
                    if (!(bVar.locked == owner)) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar.locked + " but expected " + owner).toString());
                    }
                }
                if (a.compareAndSet(this, obj, MutexKt.f)) {
                    return;
                }
            } else if (obj instanceof OpDescriptor) {
                ((OpDescriptor) obj).perform(this);
            } else {
                if (!(obj instanceof d)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("Illegal state ", obj).toString());
                }
                if (owner != null) {
                    d dVar = (d) obj;
                    if (!(dVar.owner == owner)) {
                        throw new IllegalStateException(("Mutex is locked by " + dVar.owner + " but expected " + owner).toString());
                    }
                }
                d dVar2 = (d) obj;
                LockFreeLinkedListNode lockFreeLinkedListNodeRemoveFirstOrNull = dVar2.removeFirstOrNull();
                if (lockFreeLinkedListNodeRemoveFirstOrNull == null) {
                    f fVar = new f(dVar2);
                    if (a.compareAndSet(this, obj, fVar) && fVar.perform(this) == null) {
                        return;
                    }
                } else {
                    c cVar = (c) lockFreeLinkedListNodeRemoveFirstOrNull;
                    if (cVar.g()) {
                        Object obj2 = cVar.owner;
                        if (obj2 == null) {
                            obj2 = MutexKt.c;
                        }
                        dVar2.owner = obj2;
                        cVar.e();
                        return;
                    }
                }
            }
        }
    }
}
