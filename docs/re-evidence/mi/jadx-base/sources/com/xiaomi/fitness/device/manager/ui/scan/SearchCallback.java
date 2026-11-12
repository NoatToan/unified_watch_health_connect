package com.xiaomi.fitness.device.manager.ui.scan;

import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.device.manager.export.scan.BleDevice;
import com.xiaomi.fitness.device.manager.ui.scan.SearchCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR5\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/scan/SearchCallback;", "", "<init>", "()V", "onFound", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/export/scan/BleDevice;", "", "getOnFound", "()Lkotlin/jvm/functions/Function1;", "setOnFound", "(Lkotlin/jvm/functions/Function1;)V", "onFailed", "", "Lkotlin/ParameterName;", "name", "errorCode", "getOnFailed", "setOnFailed", LifecycleConstantKt.ON_STOP, "Lkotlin/Function0;", "getOnStop", "()Lkotlin/jvm/functions/Function0;", "setOnStop", "(Lkotlin/jvm/functions/Function0;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SearchCallback {

    @NotNull
    private Function1<? super BleDevice, Unit> onFound = new Function1() { // from class: fil
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return SearchCallback.onFound$lambda$0((BleDevice) obj);
        }
    };

    @NotNull
    private Function1<? super Integer, Unit> onFailed = new Function1() { // from class: gil
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return SearchCallback.onFailed$lambda$1(((Integer) obj).intValue());
        }
    };

    @NotNull
    private Function0<Unit> onStop = new Function0() { // from class: hil
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Unit.INSTANCE;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFailed$lambda$1(int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFound$lambda$0(BleDevice it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @NotNull
    public final Function1<Integer, Unit> getOnFailed() {
        return this.onFailed;
    }

    @NotNull
    public final Function1<BleDevice, Unit> getOnFound() {
        return this.onFound;
    }

    @NotNull
    public final Function0<Unit> getOnStop() {
        return this.onStop;
    }

    public final void setOnFailed(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onFailed = function1;
    }

    public final void setOnFound(@NotNull Function1<? super BleDevice, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onFound = function1;
    }

    public final void setOnStop(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onStop = function0;
    }
}
