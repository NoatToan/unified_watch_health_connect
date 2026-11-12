package defpackage;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\tH&J\u0012\u0010\u0007\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0002H&J<\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&J\u0010\u0010\u0019\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H&J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH&J\b\u0010 \u001a\u00020\u001fH&J\b\u0010!\u001a\u00020\u0002H&J\n\u0010#\u001a\u0004\u0018\u00010\"H&J\b\u0010\u0019\u001a\u00020\u0002H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020\u000fH&J\b\u0010&\u001a\u00020\u000fH&J\b\u0010\u0005\u001a\u00020\u000fH&¨\u0006'"}, d2 = {"Lk7;", "", "", "running", "", PluginDeviceInfo.FICONON, CervicalMucusRecord.Appearance.CLEAR, PluginDeviceInfo.FDESC, "deInit", "Lo7;", "j", "inDfu", "Lpv;", "Lyd;", "firmwareType", "", "firmwareSize", "", "firmwareCRC32", "chunkSize", "Lnv;", "mode", "Lo5;", "continueModeExtraInfo", "Lhp;", PluginDeviceInfo.FMODEL, "fromBreakpoint", "Lvt;", "", "byteArray", PluginDeviceInfo.FICONOFF, "Ldv;", Constant.KeyValue.KEY_COLUMN, "h", "Lwv;", PluginDeviceInfo.FBLUETOOTHPAIR, "timeout", "Lov;", PluginDeviceInfo.FICONOFFLINE, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface k7 {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public static /* synthetic */ UpgradeStatueResponse a(k7 k7Var, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryUpgradeStatus");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return k7Var.b(z);
        }

        public static /* synthetic */ PrepareResponse a(k7 k7Var, yd ydVar, int i, long j, int i2, nv nvVar, o5 o5Var, int i3, Object obj) {
            if (obj == null) {
                return k7Var.a(ydVar, i, j, i2, nvVar, (i3 & 32) != 0 ? null : o5Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareTransfer");
        }
    }

    @NotNull
    PrepareResponse a(@NotNull yd firmwareType, int firmwareSize, long firmwareCRC32, int chunkSize, @NotNull nv mode, @Nullable o5 continueModeExtraInfo);

    @NotNull
    StartTransferResponse a(boolean fromBreakpoint);

    boolean a();

    @Nullable
    UpgradeResponse b(int timeout);

    @NotNull
    UpgradeStatueResponse b(boolean inDfu);

    boolean b();

    int c();

    void c(boolean running);

    void clear();

    boolean d(@NotNull byte[] byteArray);

    boolean deInit();

    int e();

    @Nullable
    ValidateResponse f();

    boolean h();

    @NotNull
    DfuProtocolInfo j();

    @NotNull
    TransferContinueResponse k();
}
