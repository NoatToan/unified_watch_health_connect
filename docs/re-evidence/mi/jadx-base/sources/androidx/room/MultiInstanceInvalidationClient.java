package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001-\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u00106\u001a\u00020\u001a\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b7\u00108J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0004J)\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\r2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, d2 = {"Landroidx/room/MultiInstanceInvalidationClient;", "", "", "registerCallback", "()V", "Landroid/content/Intent;", "serviceIntent", StatConstants.PARAM_START, "(Landroid/content/Intent;)V", BroadcastsKt.SILENT_PUSHING_STOP, "", "", "resolvedTableNames", "Lkotlinx/coroutines/flow/Flow;", "", "createFlow", "([Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Landroidx/room/InvalidationTracker;", "invalidationTracker", "Landroidx/room/InvalidationTracker;", "getInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "appContext", "Landroid/content/Context;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "clientId", "I", "Landroidx/room/b;", "invalidationService", "Landroidx/room/b;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "invalidatedTables", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "androidx/room/MultiInstanceInvalidationClient$observer$1", "observer", "Landroidx/room/MultiInstanceInvalidationClient$observer$1;", "Landroidx/room/a;", "invalidationCallback", "Landroidx/room/a;", "Landroid/content/ServiceConnection;", "serviceConnection", "Landroid/content/ServiceConnection;", "context", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/room/InvalidationTracker;)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMultiInstanceInvalidationClient.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiInstanceInvalidationClient.android.kt\nandroidx/room/MultiInstanceInvalidationClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,146:1\n1#2:147\n60#3:148\n63#3:152\n50#4:149\n55#4:151\n107#5:150\n*S KotlinDebug\n*F\n+ 1 MultiInstanceInvalidationClient.android.kt\nandroidx/room/MultiInstanceInvalidationClient\n*L\n133#1:148\n133#1:152\n133#1:149\n133#1:151\n133#1:150\n*E\n"})
public final class MultiInstanceInvalidationClient {
    private final Context appContext;
    private int clientId;

    @NotNull
    private final CoroutineScope coroutineScope;

    @NotNull
    private final MutableSharedFlow<Set<String>> invalidatedTables;

    @NotNull
    private final a invalidationCallback;

    @Nullable
    private b invalidationService;

    @NotNull
    private final InvalidationTracker invalidationTracker;

    @NotNull
    private final String name;

    @NotNull
    private final MultiInstanceInvalidationClient$observer$1 observer;

    @NotNull
    private final ServiceConnection serviceConnection;

    @NotNull
    private final AtomicBoolean stopped;

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.room.MultiInstanceInvalidationClient$observer$1] */
    public MultiInstanceInvalidationClient(@NotNull Context context, @NotNull String name, @NotNull InvalidationTracker invalidationTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        this.name = name;
        this.invalidationTracker = invalidationTracker;
        this.appContext = context.getApplicationContext();
        this.coroutineScope = invalidationTracker.getDatabase().getCoroutineScope();
        this.stopped = new AtomicBoolean(true);
        this.invalidatedTables = SharedFlowKt.MutableSharedFlow(0, 0, BufferOverflow.SUSPEND);
        final String[] tableNames$room_runtime_release = invalidationTracker.getTableNames();
        this.observer = new InvalidationTracker.Observer(tableNames$room_runtime_release) { // from class: androidx.room.MultiInstanceInvalidationClient$observer$1
            @Override // androidx.room.InvalidationTracker.Observer
            public boolean isRemote$room_runtime_release() {
                return true;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(Set<String> tables) {
                Intrinsics.checkNotNullParameter(tables, "tables");
                if (this.this$0.stopped.get()) {
                    return;
                }
                try {
                    b bVar = this.this$0.invalidationService;
                    if (bVar != null) {
                        bVar.broadcastInvalidation(this.this$0.clientId, (String[]) tables.toArray(new String[0]));
                    }
                } catch (RemoteException unused) {
                }
            }
        };
        this.invalidationCallback = new a.AbstractBinderC0074a() { // from class: androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1
            @Override // androidx.room.a
            public void onInvalidation(String[] tables) {
                Intrinsics.checkNotNullParameter(tables, "tables");
                BuildersKt__Builders_commonKt.launch$default(this.this$0.coroutineScope, null, null, new MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(tables, this.this$0, null), 3, null);
            }
        };
        this.serviceConnection = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name2, IBinder service) {
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(service, "service");
                this.this$0.invalidationService = b.a.asInterface(service);
                this.this$0.registerCallback();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name2) {
                Intrinsics.checkNotNullParameter(name2, "name");
                this.this$0.invalidationService = null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerCallback() {
        try {
            b bVar = this.invalidationService;
            if (bVar != null) {
                this.clientId = bVar.registerCallback(this.invalidationCallback, this.name);
            }
        } catch (RemoteException unused) {
        }
    }

    @NotNull
    public final Flow<Set<String>> createFlow(@NotNull final String[] resolvedTableNames) {
        Intrinsics.checkNotNullParameter(resolvedTableNames, "resolvedTableNames");
        final MutableSharedFlow<Set<String>> mutableSharedFlow = this.invalidatedTables;
        return new Flow<Set<? extends String>>() { // from class: androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MultiInstanceInvalidationClient.android.kt\nandroidx/room/MultiInstanceInvalidationClient\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n61#2:223\n62#2:239\n134#3,2:224\n136#3:227\n137#3,4:229\n141#3:234\n142#3,2:236\n13402#4:226\n13403#4:235\n1863#5:228\n1864#5:233\n1#6:238\n*S KotlinDebug\n*F\n+ 1 MultiInstanceInvalidationClient.android.kt\nandroidx/room/MultiInstanceInvalidationClient\n*L\n135#1:226\n135#1:235\n136#1:228\n136#1:233\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ String[] $resolvedTableNames$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2", f = "MultiInstanceInvalidationClient.android.kt", i = {}, l = {239}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String[] strArr) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$resolvedTableNames$inlined = strArr;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Set set = (Set) obj;
                        Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
                        for (String str : this.$resolvedTableNames$inlined) {
                            Iterator<T> it = set.iterator();
                            while (it.hasNext()) {
                                if (StringsKt__StringsJVMKt.equals(str, (String) it.next(), true)) {
                                    setCreateSetBuilder.add(str);
                                }
                            }
                        }
                        Set setBuild = SetsKt__SetsJVMKt.build(setCreateSetBuilder);
                        if (setBuild.isEmpty()) {
                            setBuild = null;
                        }
                        if (setBuild != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(setBuild, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Set<? extends String>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = mutableSharedFlow.collect(new AnonymousClass2(flowCollector, resolvedTableNames), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @NotNull
    public final InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void start(@NotNull Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        if (this.stopped.compareAndSet(true, false)) {
            this.appContext.bindService(serviceIntent, this.serviceConnection, 1);
            this.invalidationTracker.addRemoteObserver$room_runtime_release(this.observer);
        }
    }

    public final void stop() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.removeObserver(this.observer);
            try {
                b bVar = this.invalidationService;
                if (bVar != null) {
                    bVar.unregisterCallback(this.invalidationCallback, this.clientId);
                }
            } catch (RemoteException unused) {
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}
