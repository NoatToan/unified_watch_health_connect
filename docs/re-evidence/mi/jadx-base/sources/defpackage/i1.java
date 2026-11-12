package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0003\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Li1;", "", "Lubt;", PluginDeviceInfo.FMODEL, "()Lubt;", "Lvvs;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "(Lvvs;)Z", "", PluginDeviceInfo.FDESC, "(Lvvs;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface i1 {
    @Nullable
    ubt a();

    boolean a(@NotNull vvs listener);

    void b(@NotNull vvs listener);
}
