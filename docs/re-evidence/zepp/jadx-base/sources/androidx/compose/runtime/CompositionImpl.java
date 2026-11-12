package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.snapshots.StateObject;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.watch.notification.TransportUri;
import com.twitter.sdk.android.tweetcomposer.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001:\u0001pB'\u0012\u0006\u0010,\u001a\u00020+\u0012\n\u0010/\u001a\u0006\u0012\u0002\b\u00030.\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010Y¢\u0006\u0004\bn\u0010oJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001c\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\"\u0010\u0015\u001a\u00020\u00022\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\u00022\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\u0016\u0010\u0019\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u001d\u001a\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010 \u001a\u00020\u001aH\u0016J\b\u0010!\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020\u0002H\u0016J\b\u0010#\u001a\u00020\u0002H\u0016J\u0018\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0006J\u001f\u0010*\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\fH\u0000¢\u0006\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\u0006\u0012\u0002\b\u00030.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R*\u00103\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000601j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006`28\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R&\u0010:\u001a\u0012\u0012\u0004\u0012\u00020807j\b\u0012\u0004\u0012\u000208`98\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010<R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020\f0=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010A\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030@0=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?Ri\u0010K\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030.¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110F¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110H¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(I\u0012\u0004\u0012\u00020\u00020Cj\u0002`J0B8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020\f0=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010?R*\u0010N\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010P\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0019\u0010\\\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\\\u0010Q\u001a\u0004\b\\\u0010SR\u0016\u0010]\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010QR-\u0010^\u001a\r\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0002\b\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010\u0016R\u0016\u0010d\u001a\u00020\u001a8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010SR\u0013\u0010g\u001a\u00020Y8F@\u0006¢\u0006\u0006\u001a\u0004\be\u0010fR\u0016\u0010h\u001a\u00020\u001a8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010SR\u0016\u0010i\u001a\u00020\u001a8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010SR\u0016\u0010k\u001a\u00020\u001a8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010SR\u0016\u0010m\u001a\u00020\u001a8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010S¨\u0006q"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "", "", "values", "addPendingInvalidationsLocked", "value", "invalidateScopeOfLocked", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "takeInvalidations", "Landroidx/compose/runtime/SlotTable;", "slotTable", "validateRecomposeScopeAnchors", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "composeContent", "dispose", "recordModificationsOf", "", "observesAnyOf", TransportUri.ACTION_BLOCK, "prepareCompose", "recordReadOf", "recordWriteOf", "recompose", "applyChanges", "invalidateAll", "verifyConsistent", "scope", DefaultSettingsSpiCall.n, "Landroidx/compose/runtime/InvalidationResult;", "invalidate", "removeObservation$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/Applier;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "lock", "Ljava/lang/Object;", "Ljava/util/HashSet;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/collections/HashSet;", "abandonSet", "Ljava/util/HashSet;", "Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "observations", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "Landroidx/compose/runtime/DerivedState;", "derivedStates", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Landroidx/compose/runtime/Change;", "changes", "Ljava/util/List;", "observationsProcessed", "invalidations", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "pendingInvalidScopes", "Z", "getPendingInvalidScopes$runtime_release", "()Z", "setPendingInvalidScopes$runtime_release", "(Z)V", "Landroidx/compose/runtime/ComposerImpl;", g.c, "Landroidx/compose/runtime/ComposerImpl;", "Lkotlin/coroutines/CoroutineContext;", "_recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "isRoot", "disposed", "composable", "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "getAreChildrenComposing", "areChildrenComposing", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "recomposeContext", "isComposing", "isDisposed", "getHasPendingChanges", "hasPendingChanges", "getHasInvalidations", "hasInvalidations", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "RememberEventDispatcher", "runtime_release"}, k = 1, mv = {1, 5, 1})
public final class CompositionImpl implements ControlledComposition {

    @Nullable
    private final CoroutineContext _recomposeContext;

    @NotNull
    private final HashSet<RememberObserver> abandonSet;

    @NotNull
    private final Applier<?> applier;

    @NotNull
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes;

    @NotNull
    private Function2<? super Composer, ? super Integer, Unit> composable;

    @NotNull
    private final ComposerImpl composer;

    @NotNull
    private final IdentityScopeMap<DerivedState<?>> derivedStates;
    private boolean disposed;

    @NotNull
    private IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidations;
    private final boolean isRoot;

    @NotNull
    private final Object lock;

    @NotNull
    private final IdentityScopeMap<RecomposeScopeImpl> observations;

    @NotNull
    private final IdentityScopeMap<RecomposeScopeImpl> observationsProcessed;

    @NotNull
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;

    @NotNull
    private final AtomicReference<Object> pendingModifications;

    @NotNull
    private final SlotTable slotTable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "Landroidx/compose/runtime/RememberObserver;", DefaultSettingsSpiCall.n, "", "remembering", "forgetting", "Lkotlin/Function0;", "effect", "sideEffect", "dispatchRememberObservers", "dispatchSideEffects", "dispatchAbandons", "", "abandoning", "Ljava/util/Set;", "", "Ljava/util/List;", "sideEffects", "<init>", "(Ljava/util/Set;)V", "runtime_release"}, k = 1, mv = {1, 5, 1})
    public static final class RememberEventDispatcher implements RememberManager {

        @NotNull
        private final Set<RememberObserver> abandoning;

        @NotNull
        private final List<RememberObserver> remembering = new ArrayList();

        @NotNull
        private final List<RememberObserver> forgetting = new ArrayList();

        @NotNull
        private final List<Function0<Unit>> sideEffects = new ArrayList();

        public RememberEventDispatcher(@NotNull Set<RememberObserver> set) {
            this.abandoning = set;
        }

        public final void dispatchAbandons() {
            if (!this.abandoning.isEmpty()) {
                Iterator<RememberObserver> it2 = this.abandoning.iterator();
                while (it2.hasNext()) {
                    RememberObserver next = it2.next();
                    it2.remove();
                    next.onAbandoned();
                }
            }
        }

        public final void dispatchRememberObservers() {
            int size;
            if ((!this.forgetting.isEmpty()) && (size = this.forgetting.size() - 1) >= 0) {
                while (true) {
                    int i = size - 1;
                    RememberObserver rememberObserver = this.forgetting.get(size);
                    if (!this.abandoning.contains(rememberObserver)) {
                        rememberObserver.onForgotten();
                    }
                    if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
            if (!(!this.remembering.isEmpty())) {
                return;
            }
            List<RememberObserver> list = this.remembering;
            int i2 = 0;
            int size2 = list.size() - 1;
            if (size2 < 0) {
                return;
            }
            while (true) {
                int i3 = i2 + 1;
                RememberObserver rememberObserver2 = list.get(i2);
                this.abandoning.remove(rememberObserver2);
                rememberObserver2.onRemembered();
                if (i3 > size2) {
                    return;
                } else {
                    i2 = i3;
                }
            }
        }

        public final void dispatchSideEffects() {
            if (!this.sideEffects.isEmpty()) {
                List<Function0<Unit>> list = this.sideEffects;
                int i = 0;
                int size = list.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = i + 1;
                        list.get(i).getA();
                        if (i2 > size) {
                            break;
                        } else {
                            i = i2;
                        }
                    }
                }
                this.sideEffects.clear();
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(@NotNull RememberObserver instance) {
            int iLastIndexOf = this.remembering.lastIndexOf(instance);
            if (iLastIndexOf < 0) {
                this.forgetting.add(instance);
            } else {
                this.remembering.remove(iLastIndexOf);
                this.abandoning.remove(instance);
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(@NotNull RememberObserver instance) {
            int iLastIndexOf = this.forgetting.lastIndexOf(instance);
            if (iLastIndexOf < 0) {
                this.remembering.add(instance);
            } else {
                this.forgetting.remove(iLastIndexOf);
                this.abandoning.remove(instance);
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(@NotNull Function0<Unit> effect) {
            this.sideEffects.add(effect);
        }
    }

    public CompositionImpl(@NotNull CompositionContext compositionContext, @NotNull Applier<?> applier, @Nullable CoroutineContext coroutineContext) {
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        HashSet<RememberObserver> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        SlotTable slotTable = new SlotTable();
        this.slotTable = slotTable;
        this.observations = new IdentityScopeMap<>();
        this.derivedStates = new IdentityScopeMap<>();
        ArrayList arrayList = new ArrayList();
        this.changes = arrayList;
        this.observationsProcessed = new IdentityScopeMap<>();
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, hashSet, arrayList, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        Unit unit = Unit.INSTANCE;
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m887getLambda1$runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addPendingInvalidationsLocked(Set<? extends Object> values) {
        int i;
        int i2;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Object obj : values) {
            if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).invalidateForResult(null);
            } else {
                addPendingInvalidationsLocked$invalidate(this, objectRef, obj);
                IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
                int iFind = identityScopeMap.find(obj);
                if (iFind >= 0) {
                    Iterator<T> it2 = identityScopeMap.scopeSetAt(iFind).iterator();
                    while (it2.hasNext()) {
                        addPendingInvalidationsLocked$invalidate(this, objectRef, (DerivedState) it2.next());
                    }
                }
            }
        }
        HashSet hashSet = (HashSet) objectRef.element;
        if (hashSet == null) {
            return;
        }
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap2 = this.observations;
        int size = identityScopeMap2.getSize();
        if (size > 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = i3 + 1;
                int i6 = identityScopeMap2.getValueOrder()[i3];
                IdentityArraySet<RecomposeScopeImpl> identityArraySet = identityScopeMap2.getScopeSets()[i6];
                int size2 = identityArraySet.size();
                if (size2 > 0) {
                    int i7 = 0;
                    i2 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        Object obj2 = identityArraySet.getValues()[i7];
                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        if (!hashSet.contains((RecomposeScopeImpl) obj2)) {
                            if (i2 != i7) {
                                identityArraySet.getValues()[i2] = obj2;
                            }
                            i2++;
                        }
                        if (i8 >= size2) {
                            break;
                        } else {
                            i7 = i8;
                        }
                    }
                } else {
                    i2 = 0;
                }
                int size3 = identityArraySet.size();
                if (i2 < size3) {
                    int i9 = i2;
                    while (true) {
                        int i10 = i9 + 1;
                        identityArraySet.getValues()[i9] = null;
                        if (i10 >= size3) {
                            break;
                        } else {
                            i9 = i10;
                        }
                    }
                }
                identityArraySet.setSize(i2);
                if (identityArraySet.size() > 0) {
                    if (i4 != i3) {
                        int i11 = identityScopeMap2.getValueOrder()[i4];
                        identityScopeMap2.getValueOrder()[i4] = i6;
                        identityScopeMap2.getValueOrder()[i3] = i11;
                    }
                    i4++;
                }
                if (i5 >= size) {
                    break;
                } else {
                    i3 = i5;
                }
            }
            i = i4;
        } else {
            i = 0;
        }
        int size4 = identityScopeMap2.getSize();
        if (i < size4) {
            int i12 = i;
            while (true) {
                int i13 = i12 + 1;
                identityScopeMap2.getValues()[identityScopeMap2.getValueOrder()[i12]] = null;
                if (i13 >= size4) {
                    break;
                } else {
                    i12 = i13;
                }
            }
        }
        identityScopeMap2.setSize(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    private static final void addPendingInvalidationsLocked$invalidate(CompositionImpl compositionImpl, Ref.ObjectRef<HashSet<RecomposeScopeImpl>> objectRef, Object obj) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = compositionImpl.observations;
        int iFind = identityScopeMap.find(obj);
        if (iFind >= 0) {
            for (RecomposeScopeImpl recomposeScopeImpl : identityScopeMap.scopeSetAt(iFind)) {
                if (!compositionImpl.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                    HashSet<RecomposeScopeImpl> hashSet = objectRef.element;
                    ?? r2 = hashSet;
                    if (hashSet == null) {
                        ?? hashSet2 = new HashSet();
                        objectRef.element = hashSet2;
                        r2 = hashSet2;
                    }
                    r2.add(recomposeScopeImpl);
                }
            }
        }
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet == null) {
            return;
        }
        if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
            throw new IllegalStateException("pending composition has not been applied".toString());
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet);
            return;
        }
        if (!(andSet instanceof Object[])) {
            throw new IllegalStateException(Intrinsics.stringPlus("corrupt pendingModifications drain: ", this.pendingModifications).toString());
        }
        Set<? extends Object>[] setArr = (Set[]) andSet;
        int i = 0;
        int length = setArr.length;
        while (i < length) {
            Set<? extends Object> set = setArr[i];
            i++;
            addPendingInvalidationsLocked(set);
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet);
            return;
        }
        if (!(andSet instanceof Object[])) {
            if (andSet != null) {
                throw new IllegalStateException(Intrinsics.stringPlus("corrupt pendingModifications drain: ", this.pendingModifications).toString());
            }
            throw new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
        }
        Set<? extends Object>[] setArr = (Set[]) andSet;
        int i = 0;
        int length = setArr.length;
        while (i < length) {
            Set<? extends Object> set = setArr[i];
            i++;
            addPendingInvalidationsLocked(set);
        }
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    private final void invalidateScopeOfLocked(Object value) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
        int iFind = identityScopeMap.find(value);
        if (iFind >= 0) {
            for (RecomposeScopeImpl recomposeScopeImpl : identityScopeMap.scopeSetAt(iFind)) {
                if (recomposeScopeImpl.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                    this.observationsProcessed.add(value, recomposeScopeImpl);
                }
            }
        }
    }

    private final IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap = this.invalidations;
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        return identityArrayMap;
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = i + 1;
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                throw new IllegalStateException(("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + ArraysKt___ArraysKt.indexOf((RecomposeScopeImpl[]) slotTable.getSlots(), recomposeScopeImpl2)).toString());
            }
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this.lock) {
            RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
            try {
                this.applier.onBeginChanges();
                SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                try {
                    Applier<?> applier = this.applier;
                    List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list = this.changes;
                    int size = list.size() - 1;
                    if (size >= 0) {
                        int i5 = 0;
                        while (true) {
                            int i6 = i5 + 1;
                            list.get(i5).invoke(applier, slotWriterOpenWriter, rememberEventDispatcher);
                            if (i6 > size) {
                                break;
                            } else {
                                i5 = i6;
                            }
                        }
                    }
                    this.changes.clear();
                    Unit unit = Unit.INSTANCE;
                    slotWriterOpenWriter.close();
                    this.applier.onEndChanges();
                    rememberEventDispatcher.dispatchRememberObservers();
                    rememberEventDispatcher.dispatchSideEffects();
                    if (getPendingInvalidScopes()) {
                        setPendingInvalidScopes$runtime_release(false);
                        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
                        int size2 = identityScopeMap.getSize();
                        if (size2 > 0) {
                            int i7 = 0;
                            i = 0;
                            while (true) {
                                int i8 = i7 + 1;
                                int i9 = identityScopeMap.getValueOrder()[i7];
                                IdentityArraySet<RecomposeScopeImpl> identityArraySet = identityScopeMap.getScopeSets()[i9];
                                int size3 = identityArraySet.size();
                                if (size3 > 0) {
                                    int i10 = 0;
                                    i4 = 0;
                                    while (true) {
                                        int i11 = i10 + 1;
                                        Object obj = identityArraySet.getValues()[i10];
                                        if (obj == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                        }
                                        if (!(!((RecomposeScopeImpl) obj).getValid())) {
                                            if (i4 != i10) {
                                                identityArraySet.getValues()[i4] = obj;
                                            }
                                            i4++;
                                        }
                                        if (i11 >= size3) {
                                            break;
                                        } else {
                                            i10 = i11;
                                        }
                                    }
                                } else {
                                    i4 = 0;
                                }
                                int size4 = identityArraySet.size();
                                if (i4 < size4) {
                                    int i12 = i4;
                                    while (true) {
                                        int i13 = i12 + 1;
                                        identityArraySet.getValues()[i12] = null;
                                        if (i13 >= size4) {
                                            break;
                                        } else {
                                            i12 = i13;
                                        }
                                    }
                                }
                                identityArraySet.setSize(i4);
                                if (identityArraySet.size() > 0) {
                                    if (i != i7) {
                                        int i14 = identityScopeMap.getValueOrder()[i];
                                        identityScopeMap.getValueOrder()[i] = i9;
                                        identityScopeMap.getValueOrder()[i7] = i14;
                                    }
                                    i++;
                                }
                                if (i8 >= size2) {
                                    break;
                                } else {
                                    i7 = i8;
                                }
                            }
                        } else {
                            i = 0;
                        }
                        int size5 = identityScopeMap.getSize();
                        if (i < size5) {
                            int i15 = i;
                            while (true) {
                                int i16 = i15 + 1;
                                identityScopeMap.getValues()[identityScopeMap.getValueOrder()[i15]] = null;
                                if (i16 >= size5) {
                                    break;
                                } else {
                                    i15 = i16;
                                }
                            }
                        }
                        identityScopeMap.setSize(i);
                        IdentityScopeMap<DerivedState<?>> identityScopeMap2 = this.derivedStates;
                        int size6 = identityScopeMap2.getSize();
                        if (size6 > 0) {
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                int i19 = i17 + 1;
                                int i20 = identityScopeMap2.getValueOrder()[i17];
                                IdentityArraySet<DerivedState<?>> identityArraySet2 = identityScopeMap2.getScopeSets()[i20];
                                int size7 = identityArraySet2.size();
                                if (size7 > 0) {
                                    int i21 = 0;
                                    i3 = 0;
                                    while (true) {
                                        int i22 = i21 + 1;
                                        Object obj2 = identityArraySet2.getValues()[i21];
                                        if (obj2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                        }
                                        if (!(!this.observations.contains((DerivedState) obj2))) {
                                            if (i3 != i21) {
                                                identityArraySet2.getValues()[i3] = obj2;
                                            }
                                            i3++;
                                        }
                                        if (i22 >= size7) {
                                            break;
                                        } else {
                                            i21 = i22;
                                        }
                                    }
                                } else {
                                    i3 = 0;
                                }
                                int size8 = identityArraySet2.size();
                                if (i3 < size8) {
                                    int i23 = i3;
                                    while (true) {
                                        int i24 = i23 + 1;
                                        identityArraySet2.getValues()[i23] = null;
                                        if (i24 >= size8) {
                                            break;
                                        } else {
                                            i23 = i24;
                                        }
                                    }
                                }
                                identityArraySet2.setSize(i3);
                                if (identityArraySet2.size() > 0) {
                                    if (i18 != i17) {
                                        int i25 = identityScopeMap2.getValueOrder()[i18];
                                        identityScopeMap2.getValueOrder()[i18] = i20;
                                        identityScopeMap2.getValueOrder()[i17] = i25;
                                    }
                                    i18++;
                                }
                                if (i19 >= size6) {
                                    i2 = i18;
                                    break;
                                }
                                i17 = i19;
                            }
                        } else {
                            i2 = 0;
                        }
                        int size9 = identityScopeMap2.getSize();
                        if (i2 < size9) {
                            int i26 = i2;
                            while (true) {
                                int i27 = i26 + 1;
                                identityScopeMap2.getValues()[identityScopeMap2.getValueOrder()[i26]] = null;
                                if (i27 >= size9) {
                                    break;
                                } else {
                                    i26 = i27;
                                }
                            }
                        }
                        identityScopeMap2.setSize(i2);
                    }
                    rememberEventDispatcher.dispatchAbandons();
                    drainPendingModificationsLocked();
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th) {
                    slotWriterOpenWriter.close();
                    throw th;
                }
            } catch (Throwable th2) {
                rememberEventDispatcher.dispatchAbandons();
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        synchronized (this.lock) {
            drainPendingModificationsForCompositionLocked();
            this.composer.composeContent$runtime_release(takeInvalidations(), content);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            if (!this.disposed) {
                this.disposed = true;
                setComposable(ComposableSingletons$CompositionKt.INSTANCE.m888getLambda2$runtime_release());
                if (this.slotTable.getGroupsSize() > 0) {
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                    SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                    try {
                        ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                        Unit unit = Unit.INSTANCE;
                        slotWriterOpenWriter.close();
                        this.applier.clear();
                        rememberEventDispatcher.dispatchRememberObservers();
                    } catch (Throwable th) {
                        slotWriterOpenWriter.close();
                        throw th;
                    }
                }
                this.composer.dispose$runtime_release();
                this.parent.unregisterComposition$runtime_release(this);
                this.parent.unregisterComposition$runtime_release(this);
            }
            Unit unit2 = Unit.INSTANCE;
        }
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getComposable() {
        return this.composable;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = this.invalidations.getSize() > 0;
        }
        return z;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    /* JADX INFO: renamed from: getPendingInvalidScopes$runtime_release, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    @NotNull
    public final CoroutineContext getRecomposeContext() {
        CoroutineContext coroutineContext = this._recomposeContext;
        return coroutineContext == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : coroutineContext;
    }

    @NotNull
    public final InvalidationResult invalidate(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) {
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        Anchor anchor = scope.getAnchor();
        if (anchor == null || !this.slotTable.ownsAnchor(anchor) || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (anchor.toIndexFor(this.slotTable) < 0) {
            return InvalidationResult.IGNORED;
        }
        if (isComposing() && this.composer.tryImminentInvalidation$runtime_release(scope, instance)) {
            return InvalidationResult.IMMINENT;
        }
        if (instance == null) {
            this.invalidations.set(scope, null);
        } else {
            CompositionKt.addValue(this.invalidations, scope, instance);
        }
        this.parent.invalidate$runtime_release(this);
        return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            for (Object obj : this.slotTable.getSlots()) {
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    /* JADX INFO: renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    /* JADX INFO: renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean observesAnyOf(@NotNull Set<? extends Object> values) {
        for (Object obj : values) {
            if (this.observations.contains(obj) || this.derivedStates.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(@NotNull Function0<Unit> block) {
        this.composer.prepareCompose$runtime_release(block);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean zRecompose$runtime_release;
        synchronized (this.lock) {
            drainPendingModificationsForCompositionLocked();
            zRecompose$runtime_release = this.composer.recompose$runtime_release(takeInvalidations());
            if (!zRecompose$runtime_release) {
                drainPendingModificationsLocked();
            }
        }
        return zRecompose$runtime_release;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(@NotNull Set<? extends Object> values) {
        Object obj;
        Object objPlus;
        do {
            obj = this.pendingModifications.get();
            if (obj == null ? true : Intrinsics.areEqual(obj, CompositionKt.PendingApplyNoModifications)) {
                objPlus = values;
            } else if (obj instanceof Set) {
                objPlus = new Set[]{(Set) obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(Intrinsics.stringPlus("corrupt pendingModifications: ", this.pendingModifications).toString());
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objPlus = ArraysKt.plus((Set<? extends Object>[]) obj, values);
            }
        } while (!this.pendingModifications.compareAndSet(obj, objPlus));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordReadOf(@NotNull Object value) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        currentRecomposeScope$runtime_release.setUsed(true);
        this.observations.add(value, currentRecomposeScope$runtime_release);
        if (value instanceof DerivedState) {
            Iterator<T> it2 = ((DerivedState) value).getDependencies().iterator();
            while (it2.hasNext()) {
                this.derivedStates.add((StateObject) it2.next(), value);
            }
        }
        currentRecomposeScope$runtime_release.recordRead(value);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(@NotNull Object value) {
        synchronized (this.lock) {
            invalidateScopeOfLocked(value);
            IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
            int iFind = identityScopeMap.find(value);
            if (iFind >= 0) {
                Iterator<T> it2 = identityScopeMap.scopeSetAt(iFind).iterator();
                while (it2.hasNext()) {
                    invalidateScopeOfLocked((DerivedState) it2.next());
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeObservation$runtime_release(@NotNull Object instance, @NotNull RecomposeScopeImpl scope) {
        this.observations.remove(instance, scope);
    }

    public final void setComposable(@NotNull Function2<? super Composer, ? super Integer, Unit> function2) {
        this.composable = function2;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        if (!(!this.disposed)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.composable = content;
        this.parent.composeInitial$runtime_release(this, content);
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z) {
        this.pendingInvalidScopes = z;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.slotTable.verifyWellFormed();
                validateRecomposeScopeAnchors(this.slotTable);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i & 4) != 0 ? null : coroutineContext);
    }
}
