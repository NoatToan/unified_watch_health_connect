package androidx.paging;

import androidx.arch.core.util.Function;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00040\u0005B9\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0002H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0011H\u0016J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0090@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\"\u0010 \u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00020\tR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/paging/WrapperDataSource;", "Key", "", "ValueFrom", "ValueTo", "Landroidx/paging/DataSource;", "source", "listFunction", "Landroidx/arch/core/util/Function;", "", "(Landroidx/paging/DataSource;Landroidx/arch/core/util/Function;)V", "isInvalid", "", "()Z", "keyMap", "Ljava/util/IdentityHashMap;", "addInvalidatedCallback", "", "onInvalidatedCallback", "Landroidx/paging/DataSource$InvalidatedCallback;", "getKeyInternal", "item", "getKeyInternal$paging_common", "(Ljava/lang/Object;)Ljava/lang/Object;", "invalidate", "load", "Landroidx/paging/DataSource$BaseResult;", "params", "Landroidx/paging/DataSource$Params;", "load$paging_common", "(Landroidx/paging/DataSource$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeInvalidatedCallback", "stashKeysIfNeeded", "dest", "paging-common"}, k = 1, mv = {1, 4, 2})
public class WrapperDataSource<Key, ValueFrom, ValueTo> extends DataSource<Key, ValueTo> {
    private final IdentityHashMap<ValueTo, Key> keyMap;
    private final Function<List<ValueFrom>, List<ValueTo>> listFunction;
    private final DataSource<Key, ValueFrom> source;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataSource.KeyType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DataSource.KeyType.ITEM_KEYED.ordinal()] = 1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapperDataSource(@NotNull DataSource<Key, ValueFrom> source, @NotNull Function<List<ValueFrom>, List<ValueTo>> listFunction) {
        super(source.getType());
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(listFunction, "listFunction");
        this.source = source;
        this.listFunction = listFunction;
        this.keyMap = WhenMappings.$EnumSwitchMapping$0[source.getType().ordinal()] != 1 ? null : new IdentityHashMap<>();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object load$paging_common$suspendImpl(WrapperDataSource wrapperDataSource, DataSource.Params params, Continuation continuation) {
        WrapperDataSource$load$1 wrapperDataSource$load$1;
        WrapperDataSource wrapperDataSource2;
        if (continuation instanceof WrapperDataSource$load$1) {
            wrapperDataSource$load$1 = (WrapperDataSource$load$1) continuation;
            int i = wrapperDataSource$load$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wrapperDataSource$load$1.label = i - Integer.MIN_VALUE;
            } else {
                wrapperDataSource$load$1 = new WrapperDataSource$load$1(wrapperDataSource, continuation);
            }
        } else {
            wrapperDataSource$load$1 = new WrapperDataSource$load$1(wrapperDataSource, continuation);
        }
        Object objLoad$paging_common = wrapperDataSource$load$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = wrapperDataSource$load$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoad$paging_common);
            DataSource<Key, ValueFrom> dataSource = wrapperDataSource.source;
            wrapperDataSource$load$1.L$0 = wrapperDataSource;
            wrapperDataSource$load$1.label = 1;
            objLoad$paging_common = dataSource.load$paging_common(params, wrapperDataSource$load$1);
            if (objLoad$paging_common == coroutine_suspended) {
                wrapperDataSource2 = wrapperDataSource;
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            WrapperDataSource wrapperDataSource3 = (WrapperDataSource) wrapperDataSource$load$1.L$0;
            ResultKt.throwOnFailure(objLoad$paging_common);
            wrapperDataSource2 = wrapperDataSource3;
        }
        wrapperDataSource2 = wrapperDataSource;
        DataSource.BaseResult baseResult = (DataSource.BaseResult) objLoad$paging_common;
        DataSource.BaseResult baseResultConvert$paging_common = DataSource.BaseResult.INSTANCE.convert$paging_common(baseResult, wrapperDataSource2.listFunction);
        wrapperDataSource2.stashKeysIfNeeded(baseResult.data, baseResultConvert$paging_common.data);
        return baseResultConvert$paging_common;
    }

    @Override // androidx.paging.DataSource
    public void addInvalidatedCallback(@NotNull DataSource.InvalidatedCallback onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.addInvalidatedCallback(onInvalidatedCallback);
    }

    @Override // androidx.paging.DataSource
    @NotNull
    public Key getKeyInternal$paging_common(@NotNull ValueTo item) {
        Key key;
        Intrinsics.checkNotNullParameter(item, "item");
        IdentityHashMap<ValueTo, Key> identityHashMap = this.keyMap;
        if (identityHashMap == null) {
            throw new IllegalStateException("Cannot get key by item in non-item keyed DataSource");
        }
        synchronized (identityHashMap) {
            key = this.keyMap.get(item);
            Intrinsics.checkNotNull(key);
        }
        return key;
    }

    @Override // androidx.paging.DataSource
    public void invalidate() {
        this.source.invalidate();
    }

    @Override // androidx.paging.DataSource
    public boolean isInvalid() {
        return this.source.isInvalid();
    }

    @Override // androidx.paging.DataSource
    @Nullable
    public Object load$paging_common(@NotNull DataSource.Params<Key> params, @NotNull Continuation<? super DataSource.BaseResult<ValueTo>> continuation) {
        return load$paging_common$suspendImpl(this, params, continuation);
    }

    @Override // androidx.paging.DataSource
    public void removeInvalidatedCallback(@NotNull DataSource.InvalidatedCallback onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.removeInvalidatedCallback(onInvalidatedCallback);
    }

    public final void stashKeysIfNeeded(@NotNull List<? extends ValueFrom> source, @NotNull List<? extends ValueTo> dest) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        IdentityHashMap<ValueTo, Key> identityHashMap = this.keyMap;
        if (identityHashMap != null) {
            synchronized (identityHashMap) {
                try {
                    int size = dest.size();
                    for (int i = 0; i < size; i++) {
                        IdentityHashMap<ValueTo, Key> identityHashMap2 = this.keyMap;
                        ValueTo valueto = dest.get(i);
                        DataSource<Key, ValueFrom> dataSource = this.source;
                        if (dataSource == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.ItemKeyedDataSource<Key, ValueFrom>");
                        }
                        identityHashMap2.put(valueto, (Key) ((ItemKeyedDataSource) dataSource).getKey(source.get(i)));
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
