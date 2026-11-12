package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lwm;", "", "Lfn;", "info", "Lkotlin/Function1;", "", "", "action", PluginDeviceInfo.FMODEL, "Le7;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 30)
public interface wm {
    void a(@NotNull e7 listener);

    void a(@NotNull fn info, @NotNull Function1<? super Boolean, Unit> action);
}
