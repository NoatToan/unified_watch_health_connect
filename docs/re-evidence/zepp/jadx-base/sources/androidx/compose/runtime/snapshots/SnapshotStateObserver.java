package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.notification.TransportUri;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u00011B0\u0012'\u0010\u001e\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0002JA\u0010\r\u001a\u00020\u0002\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\t\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0001J)\u0010\u0015\u001a\u00020\u00022!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00130\u0005J\u0006\u0010\u0016\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0002J\u001c\u0010\u001c\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u0010\u001a\u00020\u0002R7\u0010\u001e\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR.\u0010!\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR \u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u001c\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "", "callOnChanged", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "onChanged", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ApplyMap;", "ensureMap", "scope", "onValueChangedForScope", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "observeReads", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "withNoObservations", "clear", "Lkotlin/ParameterName;", "name", "", "predicate", "clearIf", "start", Command.STOP, "", "changes", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "notifyChanges", "callback", "onChangedExecutor", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function2;", "applyObserver", "Lkotlin/jvm/functions/Function2;", "readObserver", "Landroidx/compose/runtime/collection/MutableVector;", "applyMaps", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "isObserving", "Z", "isPaused", "currentMap", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ApplyMap;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ApplyMap", "runtime_release"}, k = 1, mv = {1, 5, 1})
public final class SnapshotStateObserver {
    public static final int $stable = 8;

    @Nullable
    private ObserverHandle applyUnsubscribe;

    @Nullable
    private ApplyMap<?> currentMap;
    private boolean isObserving;
    private boolean isPaused;

    @NotNull
    private final Function1<Function0<Unit>, Unit> onChangedExecutor;

    @NotNull
    private final Function2<Set<? extends Object>, Snapshot, Unit> applyObserver = new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, Snapshot snapshot) throws Throwable {
            invoke2(set, snapshot);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Set<? extends Object> set, @NotNull Snapshot snapshot) throws Throwable {
            Object[] objArr;
            boolean z;
            boolean z2;
            int i;
            int i2;
            MutableVector mutableVector = this.this$0.applyMaps;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            synchronized (mutableVector) {
                try {
                    MutableVector mutableVector2 = snapshotStateObserver.applyMaps;
                    int size = mutableVector2.getSize();
                    if (size > 0) {
                        try {
                            Object[] content = mutableVector2.getContent();
                            int i3 = 0;
                            boolean z3 = false;
                            while (true) {
                                SnapshotStateObserver.ApplyMap applyMap = (SnapshotStateObserver.ApplyMap) content[i3];
                                HashSet<Object> invalidated = applyMap.getInvalidated();
                                IdentityScopeMap map = applyMap.getMap();
                                Iterator<? extends Object> it2 = set.iterator();
                                while (it2.hasNext()) {
                                    int iFind = map.find(it2.next());
                                    if (iFind >= 0) {
                                        Iterator<T> it3 = map.scopeSetAt(iFind).iterator();
                                        while (it3.hasNext()) {
                                            invalidated.add(it3.next());
                                            z3 = true;
                                        }
                                    }
                                }
                                if (!invalidated.isEmpty()) {
                                    int size2 = map.getSize();
                                    if (size2 > 0) {
                                        int i4 = 0;
                                        i = 0;
                                        while (true) {
                                            int i5 = i4 + 1;
                                            int i6 = map.getValueOrder()[i4];
                                            IdentityArraySet identityArraySet = map.getScopeSets()[i6];
                                            int size3 = identityArraySet.size();
                                            objArr = content;
                                            if (size3 > 0) {
                                                i2 = 0;
                                                int i7 = 0;
                                                while (true) {
                                                    z = z3;
                                                    int i8 = i7 + 1;
                                                    Object obj = identityArraySet.getValues()[i7];
                                                    if (obj == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                                    }
                                                    if (!invalidated.contains(obj)) {
                                                        if (i2 != i7) {
                                                            identityArraySet.getValues()[i2] = obj;
                                                        }
                                                        i2++;
                                                    }
                                                    if (i8 >= size3) {
                                                        break;
                                                    }
                                                    i7 = i8;
                                                    z3 = z;
                                                }
                                            } else {
                                                z = z3;
                                                i2 = 0;
                                            }
                                            int size4 = identityArraySet.size();
                                            if (i2 < size4) {
                                                int i9 = i2;
                                                while (true) {
                                                    int i10 = i9 + 1;
                                                    identityArraySet.getValues()[i9] = null;
                                                    if (i10 >= size4) {
                                                        break;
                                                    } else {
                                                        i9 = i10;
                                                    }
                                                }
                                            }
                                            identityArraySet.setSize(i2);
                                            if (identityArraySet.size() > 0) {
                                                if (i != i4) {
                                                    int i11 = map.getValueOrder()[i];
                                                    map.getValueOrder()[i] = i6;
                                                    map.getValueOrder()[i4] = i11;
                                                }
                                                i++;
                                            }
                                            if (i5 >= size2) {
                                                break;
                                            }
                                            i4 = i5;
                                            content = objArr;
                                            z3 = z;
                                        }
                                    } else {
                                        objArr = content;
                                        z = z3;
                                        i = 0;
                                    }
                                    int size5 = map.getSize();
                                    if (i < size5) {
                                        int i12 = i;
                                        while (true) {
                                            int i13 = i12 + 1;
                                            map.getValues()[map.getValueOrder()[i12]] = null;
                                            if (i13 >= size5) {
                                                break;
                                            } else {
                                                i12 = i13;
                                            }
                                        }
                                    }
                                    map.setSize(i);
                                } else {
                                    objArr = content;
                                    z = z3;
                                }
                                i3++;
                                if (i3 >= size) {
                                    z2 = z;
                                    break;
                                } else {
                                    content = objArr;
                                    z3 = z;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } else {
                        z2 = false;
                    }
                    Unit unit = Unit.INSTANCE;
                    if (z2) {
                        Function1 function1 = this.this$0.onChangedExecutor;
                        final SnapshotStateObserver snapshotStateObserver2 = this.this$0;
                        function1.invoke(new Function0<Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1.2
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                snapshotStateObserver2.callOnChanged();
                            }
                        });
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    };

    @NotNull
    private final Function1<Object, Unit> readObserver = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Object obj) {
            if (this.this$0.isPaused) {
                return;
            }
            MutableVector mutableVector = this.this$0.applyMaps;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            synchronized (mutableVector) {
                snapshotStateObserver.currentMap.addValue(obj);
                Unit unit = Unit.INSTANCE;
            }
        }
    };

    @NotNull
    private final MutableVector<ApplyMap<?>> applyMaps = new MutableVector<>(new ApplyMap[16], 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006R%\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R)\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013j\b\u0012\u0004\u0012\u00020\u0001`\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ApplyMap;", "", ExifInterface.GPS_DIRECTION_TRUE, "value", "", "addValue", "", "scopes", "callOnChanged", "Lkotlin/Function1;", "onChanged", "Lkotlin/jvm/functions/Function1;", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/collection/IdentityScopeMap;", SportAnalytics.ParamValue.MapButtonType.MAP, "Landroidx/compose/runtime/collection/IdentityScopeMap;", "getMap", "()Landroidx/compose/runtime/collection/IdentityScopeMap;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "invalidated", "Ljava/util/HashSet;", "getInvalidated", "()Ljava/util/HashSet;", "currentScope", "Ljava/lang/Object;", "getCurrentScope", "()Ljava/lang/Object;", "setCurrentScope", "(Ljava/lang/Object;)V", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, k = 1, mv = {1, 5, 1})
    public static final class ApplyMap<T> {

        @Nullable
        private T currentScope;

        @NotNull
        private final Function1<T, Unit> onChanged;

        @NotNull
        private final IdentityScopeMap<T> map = new IdentityScopeMap<>();

        @NotNull
        private final HashSet<Object> invalidated = new HashSet<>();

        /* JADX WARN: Multi-variable type inference failed */
        public ApplyMap(@NotNull Function1<? super T, Unit> function1) {
            this.onChanged = function1;
        }

        public final void addValue(@NotNull Object value) {
            this.map.add(value, this.currentScope);
        }

        public final void callOnChanged(@NotNull Collection<? extends Object> scopes) {
            Iterator<T> it2 = scopes.iterator();
            while (it2.hasNext()) {
                getOnChanged().invoke(it2.next());
            }
        }

        @Nullable
        public final T getCurrentScope() {
            return this.currentScope;
        }

        @NotNull
        public final HashSet<Object> getInvalidated() {
            return this.invalidated;
        }

        @NotNull
        public final IdentityScopeMap<T> getMap() {
            return this.map;
        }

        @NotNull
        public final Function1<T, Unit> getOnChanged() {
            return this.onChanged;
        }

        public final void setCurrentScope(@Nullable T t) {
            this.currentScope = t;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(@NotNull Function1<? super Function0<Unit>, Unit> function1) {
        this.onChangedExecutor = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callOnChanged() {
        MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i = 0;
            ApplyMap<?>[] content = mutableVector.getContent();
            do {
                ApplyMap<?> applyMap = content[i];
                HashSet<Object> invalidated = applyMap.getInvalidated();
                if (!invalidated.isEmpty()) {
                    applyMap.callOnChanged(invalidated);
                    invalidated.clear();
                }
                i++;
            } while (i < size);
        }
    }

    private final <T> ApplyMap<T> ensureMap(Function1<? super T, Unit> onChanged) {
        int i;
        MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
        int size = mutableVector.getSize();
        if (size <= 0) {
            i = -1;
            break;
        }
        ApplyMap[] content = mutableVector.getContent();
        i = 0;
        while (true) {
            if (content[i].getOnChanged() == onChanged) {
                break;
            }
            i++;
            if (i >= size) {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            return (ApplyMap) this.applyMaps.getContent()[i];
        }
        ApplyMap<T> applyMap = new ApplyMap<>(onChanged);
        this.applyMaps.add(applyMap);
        return applyMap;
    }

    public final void clear(@NotNull Object scope) {
        ApplyMap<?>[] applyMapArr;
        int i;
        int i2;
        synchronized (this.applyMaps) {
            MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ApplyMap<?>[] content = mutableVector.getContent();
                int i3 = 0;
                while (true) {
                    IdentityScopeMap<?> map = content[i3].getMap();
                    int size2 = map.getSize();
                    if (size2 > 0) {
                        int i4 = 0;
                        i = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            int i6 = map.getValueOrder()[i4];
                            IdentityArraySet<?> identityArraySet = map.getScopeSets()[i6];
                            int size3 = identityArraySet.size();
                            if (size3 > 0) {
                                i2 = 0;
                                int i7 = 0;
                                while (true) {
                                    int i8 = i7 + 1;
                                    applyMapArr = content;
                                    Object obj = identityArraySet.getValues()[i7];
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    }
                                    if (!(obj == scope)) {
                                        if (i2 != i7) {
                                            identityArraySet.getValues()[i2] = obj;
                                        }
                                        i2++;
                                    }
                                    if (i8 >= size3) {
                                        break;
                                    }
                                    i7 = i8;
                                    content = applyMapArr;
                                }
                            } else {
                                applyMapArr = content;
                                i2 = 0;
                            }
                            int size4 = identityArraySet.size();
                            if (i2 < size4) {
                                int i9 = i2;
                                while (true) {
                                    int i10 = i9 + 1;
                                    identityArraySet.getValues()[i9] = null;
                                    if (i10 >= size4) {
                                        break;
                                    } else {
                                        i9 = i10;
                                    }
                                }
                            }
                            identityArraySet.setSize(i2);
                            if (identityArraySet.size() > 0) {
                                if (i != i4) {
                                    int i11 = map.getValueOrder()[i];
                                    map.getValueOrder()[i] = i6;
                                    map.getValueOrder()[i4] = i11;
                                }
                                i++;
                            }
                            if (i5 >= size2) {
                                break;
                            }
                            i4 = i5;
                            content = applyMapArr;
                        }
                    } else {
                        applyMapArr = content;
                        i = 0;
                    }
                    int size5 = map.getSize();
                    if (i < size5) {
                        int i12 = i;
                        while (true) {
                            int i13 = i12 + 1;
                            map.getValues()[map.getValueOrder()[i12]] = null;
                            if (i13 >= size5) {
                                break;
                            } else {
                                i12 = i13;
                            }
                        }
                    }
                    map.setSize(i);
                    i3++;
                    if (i3 >= size) {
                        break;
                    } else {
                        content = applyMapArr;
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void clearIf(@NotNull Function1<Object, Boolean> predicate) {
        ApplyMap<?>[] applyMapArr;
        int i;
        int i2;
        synchronized (this.applyMaps) {
            MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ApplyMap<?>[] content = mutableVector.getContent();
                int i3 = 0;
                while (true) {
                    IdentityScopeMap<?> map = content[i3].getMap();
                    int size2 = map.getSize();
                    if (size2 > 0) {
                        int i4 = 0;
                        i = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            int i6 = map.getValueOrder()[i4];
                            IdentityArraySet<?> identityArraySet = map.getScopeSets()[i6];
                            int size3 = identityArraySet.size();
                            if (size3 > 0) {
                                i2 = 0;
                                int i7 = 0;
                                while (true) {
                                    int i8 = i7 + 1;
                                    applyMapArr = content;
                                    Object obj = identityArraySet.getValues()[i7];
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    }
                                    if (!predicate.invoke(obj).booleanValue()) {
                                        if (i2 != i7) {
                                            identityArraySet.getValues()[i2] = obj;
                                        }
                                        i2++;
                                    }
                                    if (i8 >= size3) {
                                        break;
                                    }
                                    i7 = i8;
                                    content = applyMapArr;
                                }
                            } else {
                                applyMapArr = content;
                                i2 = 0;
                            }
                            int size4 = identityArraySet.size();
                            if (i2 < size4) {
                                int i9 = i2;
                                while (true) {
                                    int i10 = i9 + 1;
                                    identityArraySet.getValues()[i9] = null;
                                    if (i10 >= size4) {
                                        break;
                                    } else {
                                        i9 = i10;
                                    }
                                }
                            }
                            identityArraySet.setSize(i2);
                            if (identityArraySet.size() > 0) {
                                if (i != i4) {
                                    int i11 = map.getValueOrder()[i];
                                    map.getValueOrder()[i] = i6;
                                    map.getValueOrder()[i4] = i11;
                                }
                                i++;
                            }
                            if (i5 >= size2) {
                                break;
                            }
                            i4 = i5;
                            content = applyMapArr;
                        }
                    } else {
                        applyMapArr = content;
                        i = 0;
                    }
                    int size5 = map.getSize();
                    if (i < size5) {
                        int i12 = i;
                        while (true) {
                            int i13 = i12 + 1;
                            map.getValues()[map.getValueOrder()[i12]] = null;
                            if (i13 >= size5) {
                                break;
                            } else {
                                i12 = i13;
                            }
                        }
                    }
                    map.setSize(i);
                    i3++;
                    if (i3 >= size) {
                        break;
                    } else {
                        content = applyMapArr;
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void notifyChanges(@NotNull Set<? extends Object> changes, @NotNull Snapshot snapshot) {
        this.applyObserver.invoke(changes, snapshot);
    }

    public final <T> void observeReads(@NotNull T scope, @NotNull Function1<? super T, Unit> onValueChangedForScope, @NotNull Function0<Unit> block) {
        ApplyMap<?> applyMapEnsureMap;
        boolean z;
        Object obj;
        ApplyMap<?> applyMap;
        int i;
        int i2;
        ApplyMap<?> applyMap2 = this.currentMap;
        boolean z2 = this.isPaused;
        synchronized (this.applyMaps) {
            applyMapEnsureMap = ensureMap(onValueChangedForScope);
        }
        Object currentScope = applyMapEnsureMap.getCurrentScope();
        applyMapEnsureMap.setCurrentScope(scope);
        this.currentMap = applyMapEnsureMap;
        this.isPaused = false;
        if (this.isObserving) {
            z = z2;
            obj = currentScope;
            applyMap = applyMapEnsureMap;
            block.invoke();
        } else {
            this.isObserving = true;
            try {
                synchronized (this.applyMaps) {
                    IdentityScopeMap<?> map = applyMapEnsureMap.getMap();
                    int size = map.getSize();
                    if (size > 0) {
                        int i3 = 0;
                        i = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            int i5 = map.getValueOrder()[i3];
                            IdentityArraySet<?> identityArraySet = map.getScopeSets()[i5];
                            int size2 = identityArraySet.size();
                            z = z2;
                            if (size2 > 0) {
                                i2 = 0;
                                int i6 = 0;
                                while (true) {
                                    obj = currentScope;
                                    int i7 = i6 + 1;
                                    applyMap = applyMapEnsureMap;
                                    Object obj2 = identityArraySet.getValues()[i6];
                                    if (obj2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    }
                                    if (!(obj2 == scope)) {
                                        if (i2 != i6) {
                                            identityArraySet.getValues()[i2] = obj2;
                                        }
                                        i2++;
                                    }
                                    if (i7 >= size2) {
                                        break;
                                    }
                                    i6 = i7;
                                    currentScope = obj;
                                    applyMapEnsureMap = applyMap;
                                }
                            } else {
                                obj = currentScope;
                                applyMap = applyMapEnsureMap;
                                i2 = 0;
                            }
                            int size3 = identityArraySet.size();
                            if (i2 < size3) {
                                int i8 = i2;
                                while (true) {
                                    int i9 = i8 + 1;
                                    identityArraySet.getValues()[i8] = null;
                                    if (i9 >= size3) {
                                        break;
                                    } else {
                                        i8 = i9;
                                    }
                                }
                            }
                            identityArraySet.setSize(i2);
                            if (identityArraySet.size() > 0) {
                                if (i != i3) {
                                    int i10 = map.getValueOrder()[i];
                                    map.getValueOrder()[i] = i5;
                                    map.getValueOrder()[i3] = i10;
                                }
                                i++;
                            }
                            if (i4 >= size) {
                                break;
                            }
                            i3 = i4;
                            z2 = z;
                            currentScope = obj;
                            applyMapEnsureMap = applyMap;
                        }
                    } else {
                        z = z2;
                        obj = currentScope;
                        applyMap = applyMapEnsureMap;
                        i = 0;
                    }
                    int size4 = map.getSize();
                    if (i < size4) {
                        int i11 = i;
                        while (true) {
                            int i12 = i11 + 1;
                            map.getValues()[map.getValueOrder()[i11]] = null;
                            if (i12 >= size4) {
                                break;
                            } else {
                                i11 = i12;
                            }
                        }
                    }
                    map.setSize(i);
                    Unit unit = Unit.INSTANCE;
                }
                Snapshot.INSTANCE.observe(this.readObserver, null, block);
                this.isObserving = false;
            } catch (Throwable th) {
                this.isObserving = false;
                throw th;
            }
        }
        this.currentMap = applyMap2;
        applyMap.setCurrentScope(obj);
        this.isPaused = z;
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.INSTANCE.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle == null) {
            return;
        }
        observerHandle.dispose();
    }

    public final void withNoObservations(@NotNull Function0<Unit> block) {
        boolean z = this.isPaused;
        this.isPaused = true;
        try {
            block.invoke();
        } finally {
            this.isPaused = z;
        }
    }

    public final void clear() {
        synchronized (this.applyMaps) {
            MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                int i = 0;
                ApplyMap<?>[] content = mutableVector.getContent();
                do {
                    content[i].getMap().clear();
                    i++;
                } while (i < size);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
