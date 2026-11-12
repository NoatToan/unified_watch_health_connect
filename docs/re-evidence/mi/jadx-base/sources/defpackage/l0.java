package defpackage;

import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclientsdk.MiTsmConstants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\"\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH&J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0006H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006H&¨\u0006\u0013"}, d2 = {"Ll0;", "", "Lv0;", PluginDeviceInfo.FMODEL, "", "apiLevel", "", "keyBytes", "Lut;", CommonConstants.KEY_PUB_KEY, PluginDeviceInfo.FICONON, MiTsmConstants.KEY_SIGNATURE, "Lkotlin/Function0;", "", "callback", "Lt0;", "Llq;", PluginDeviceInfo.FDESC, "cipher", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface l0 {
    @NotNull
    AuthResult a(@NotNull byte[] cipher);

    @NotNull
    AuthResult a(@NotNull byte[] signature, @Nullable Function0<Unit> callback);

    @Nullable
    StartAuthResponse a(int apiLevel, @NotNull byte[] keyBytes);

    @Nullable
    AuthorizationProtocolInfo a();

    @Nullable
    byte[] a(int apiLevel);

    int b(@NotNull byte[] cipher);

    @Nullable
    RequestAuthResponse b(int apiLevel, @NotNull byte[] pubKey);

    @Nullable
    byte[] b(int apiLevel);

    @Nullable
    StartAuthResponse c(int apiLevel, @NotNull byte[] pubKey);
}
