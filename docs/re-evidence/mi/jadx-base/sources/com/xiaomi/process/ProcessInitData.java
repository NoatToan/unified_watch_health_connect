package com.xiaomi.process;

import android.os.IBinder;
import android.os.IInterface;
import android.util.ArrayMap;
import com.xiaomi.smarthome.state.IStateHolder;
import com.xiaomi.smarthome.state.StateHolderImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R%\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/process/ProcessInitData;", "", "()V", "factory", "Landroid/util/ArrayMap;", "", "Lcom/xiaomi/process/DataShareFactory;", "Landroid/os/IInterface;", "getFactory", "()Landroid/util/ArrayMap;", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ProcessInitData {

    @NotNull
    public static final ProcessInitData INSTANCE = new ProcessInitData();

    @NotNull
    private static final ArrayMap<String, DataShareFactory<? extends IInterface>> factory;

    static {
        ArrayMap<String, DataShareFactory<? extends IInterface>> arrayMap = new ArrayMap<>();
        arrayMap.put(IStateHolder.class.getName(), new DataShareFactory<IInterface>() { // from class: com.xiaomi.process.ProcessInitData$factory$1$1
            @Override // com.xiaomi.process.DataShareFactory
            @NotNull
            public IInterface createInstance() {
                return new StateHolderImpl();
            }

            @Override // com.xiaomi.process.DataShareFactory
            @NotNull
            public IInterface createProxy(@Nullable IBinder binder) {
                IStateHolder iStateHolderAsInterface = IStateHolder.Stub.asInterface(binder);
                Intrinsics.checkNotNullExpressionValue(iStateHolderAsInterface, "asInterface(binder)");
                return iStateHolderAsInterface;
            }
        });
        factory = arrayMap;
    }

    private ProcessInitData() {
    }

    @NotNull
    public final ArrayMap<String, DataShareFactory<? extends IInterface>> getFactory() {
        return factory;
    }
}
