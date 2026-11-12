package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Leh;", "", "Lyus;", "baseProfile", "Lg4s;", PluginDeviceInfo.FMODEL, "(Lyus;)Lg4s;", "Lt0;", "authResult", "Ln1t;", "baseBleDevice", "", "(Lt0;Ln1t;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface eh {
    @Nullable
    g4s a(@NotNull yus baseProfile);

    void a(@NotNull AuthResult authResult, @NotNull n1t baseBleDevice);
}
