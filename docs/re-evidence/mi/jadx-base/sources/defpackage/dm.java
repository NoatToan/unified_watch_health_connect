package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.model.HMCardSwitchTime;
import com.xiaomi.hm.health.bt.profile.nfc.ApduResponse;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardConfig;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardIdent;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardStatus;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000b\u001a\u00020\nH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u0011\u001a\u00020\u0010H&J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000b\u001a\u00020\nH&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\u0006\u0010\u001c\u001a\u00020\u001bH&J\b\u0010\r\u001a\u00020\u001aH&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\u0006\u0010\u001e\u001a\u00020\u001dH&J$\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00130\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0007H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\"\u001a\u00020\nH&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010#\u001a\u00020\u001fH&¨\u0006$"}, d2 = {"Ldm;", "", "Llm;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", PluginDeviceInfo.FMODEL, "Lol;", "", PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FICONOFF, "", "byteArray", "Lcom/xiaomi/hm/health/bt/profile/nfc/ApduResponse;", PluginDeviceInfo.FDESC, "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardInfo;", PluginDeviceInfo.FBLUETOOTHPAIR, "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardConfig;", "cardConfig", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardStatus;", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardIdent;", "cardList", "Ll9;", PluginDeviceInfo.FICONON, "Lcom/xiaomi/hm/health/bt/model/HMAidInfo;", "state", "", "Lcom/xiaomi/hm/health/bt/model/HMAccessInfo;", "info", "Lcom/xiaomi/hm/health/bt/model/HMCardSwitchTime;", "hmCardSwitchTime", "", "aid", "cardType", "data", "password", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 36)
public interface dm {
    @NotNull
    ol<Integer> a();

    @NotNull
    ol<Boolean> a(@NotNull HMAccessInfo info);

    @NotNull
    ol<Boolean> a(@NotNull HMAidInfo state);

    @NotNull
    ol<Boolean> a(@NotNull HMCardSwitchTime hmCardSwitchTime);

    @NotNull
    ol<HMNFCCardStatus> a(@NotNull HMNFCCardConfig cardConfig);

    @NotNull
    ol<Integer> a(@NotNull String password);

    @NotNull
    ol<List<HMCardSwitchTime>> a(@NotNull String aid, int cardType);

    @NotNull
    ol<l9> a(@NotNull List<? extends HMNFCCardIdent> cardList);

    @NotNull
    ol<ApduResponse> a(@NotNull byte[] data);

    void a(@NotNull lm listener);

    @NotNull
    ol<Boolean> b(@NotNull HMCardSwitchTime hmCardSwitchTime);

    @NotNull
    ol<ApduResponse> b(@NotNull byte[] byteArray);

    boolean b();

    @NotNull
    ol<Integer> c();

    @NotNull
    ol<ApduResponse> c(@NotNull byte[] byteArray);

    @NotNull
    ol<Integer> d();

    @NotNull
    ol<Integer> e();

    @NotNull
    ol<HMNFCCardInfo> f();
}
