package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lkh;", "", "Lxct;", "authInfo", "Ldts;", "authCallback", "Lt0;", PluginDeviceInfo.FMODEL, "(Lxct;Ldts;)Lt0;", "", "(Lxct;)Z", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface kh {
    @NotNull
    AuthResult a(@NotNull xct authInfo, @NotNull dts authCallback);

    boolean a(@NotNull xct authInfo);
}
