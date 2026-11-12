package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lxt;", "", "Lyt;", "request", "", PluginDeviceInfo.FMODEL, "(Lyt;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface xt {
    @Nullable
    Object a(@NotNull StickyNotificationRequest stickyNotificationRequest, @NotNull Continuation<? super Unit> continuation);
}
