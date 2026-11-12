package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.model.HMCardSwitchTime;
import com.xiaomi.hm.health.bt.model.HMCardTSResponse;
import com.xiaomi.hm.health.bt.profile.nfc.ApduResponse;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardConfig;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardIdent;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardStatus;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardType;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCStatus;
import com.xiaomi.hm.health.bt.profile.nfc.PasswordInteractionResponse;
import com.xiaomi.onetrack.c.q;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0005\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0005\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0005\u0010\u0014J#\u0010\u0005\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0005\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0005\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH&¢\u0006\u0004\b\u0005\u0010\u001fJ'\u0010\u0005\u001a\u00020\u00112\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b\u0005\u0010%J\u0017\u0010\u0005\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b\u0005\u0010(J\u000f\u0010\u0005\u001a\u00020\u0011H&¢\u0006\u0004\b\u0005\u0010)J\u0017\u0010\u0005\u001a\u00020\u00112\u0006\u0010+\u001a\u00020*H&¢\u0006\u0004\b\u0005\u0010,J\u0011\u0010.\u001a\u0004\u0018\u00010-H&¢\u0006\u0004\b.\u0010/J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0005\u00100J\u000f\u00101\u001a\u00020\u0011H&¢\u0006\u0004\b1\u0010)J\u000f\u00102\u001a\u00020\u0011H&¢\u0006\u0004\b2\u0010)J\u000f\u00103\u001a\u00020\u0011H&¢\u0006\u0004\b3\u0010)J\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u0011062\u0006\u00105\u001a\u000204H&¢\u0006\u0004\b3\u00107J+\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040 062\u0006\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020\u000fH&¢\u0006\u0004\b\u0005\u0010:J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u0011062\u0006\u00105\u001a\u000204H&¢\u0006\u0004\b\u0005\u00107¨\u0006;"}, d2 = {"Lgm;", "", "Lbj;", "notify", "", PluginDeviceInfo.FMODEL, "(Lbj;)V", "Lw1t;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCStatus;", "(Lw1t;)Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCStatus;", "disconnect", "()Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCStatus;", "", "data", "", "dataLen", "", "encrypt", "Lcom/xiaomi/hm/health/bt/profile/nfc/ApduResponse;", "([BIZ)Lcom/xiaomi/hm/health/bt/profile/nfc/ApduResponse;", "([BI)Lcom/xiaomi/hm/health/bt/profile/nfc/ApduResponse;", "Lcom/xiaomi/hm/health/bt/model/HMAidInfo;", "aidInfo", "(Lcom/xiaomi/hm/health/bt/model/HMAidInfo;)Z", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardInfo;", PluginDeviceInfo.FICONOFF, "()Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardInfo;", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardConfig;", q.f13857a, "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardStatus;", "(Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardConfig;)Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardStatus;", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardIdent;", "cardIdents", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardType;", "type", "(Ljava/util/List;Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardType;)Z", "Lcom/xiaomi/hm/health/bt/model/HMAccessInfo;", "info", "(Lcom/xiaomi/hm/health/bt/model/HMAccessInfo;)Z", "()Z", "", "password", "(Ljava/lang/String;)Z", "Lcom/xiaomi/hm/health/bt/profile/nfc/PasswordInteractionResponse;", PluginDeviceInfo.FICONON, "()Lcom/xiaomi/hm/health/bt/profile/nfc/PasswordInteractionResponse;", "([B)Lcom/xiaomi/hm/health/bt/profile/nfc/ApduResponse;", PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FDESC, "Lcom/xiaomi/hm/health/bt/model/HMCardSwitchTime;", "hmCardSwitchTime", "Lcom/xiaomi/hm/health/bt/model/HMCardTSResponse;", "(Lcom/xiaomi/hm/health/bt/model/HMCardSwitchTime;)Lcom/xiaomi/hm/health/bt/model/HMCardTSResponse;", "aid", "cardType", "(Ljava/lang/String;I)Lcom/xiaomi/hm/health/bt/model/HMCardTSResponse;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface gm {
    @NotNull
    HMCardTSResponse<Boolean> a(@NotNull HMCardSwitchTime hmCardSwitchTime);

    @NotNull
    HMCardTSResponse<List<HMCardSwitchTime>> a(@NotNull String aid, int cardType);

    @Nullable
    ApduResponse a(@Nullable byte[] data);

    @Nullable
    ApduResponse a(@Nullable byte[] data, int dataLen);

    @Nullable
    ApduResponse a(@Nullable byte[] data, int dataLen, boolean encrypt);

    @Nullable
    HMNFCCardStatus a(@Nullable HMNFCCardConfig config);

    @Nullable
    HMNFCStatus a(@Nullable w1t listener);

    void a(@NotNull bj notify);

    boolean a();

    boolean a(@NotNull HMAccessInfo info);

    boolean a(@NotNull HMAidInfo aidInfo);

    boolean a(@NotNull String password);

    boolean a(@Nullable List<? extends HMNFCCardIdent> cardIdents, @NotNull HMNFCCardType type);

    @NotNull
    HMCardTSResponse<Boolean> b(@NotNull HMCardSwitchTime hmCardSwitchTime);

    boolean b();

    @Nullable
    PasswordInteractionResponse c();

    @Nullable
    HMNFCCardInfo d();

    @Nullable
    HMNFCStatus disconnect();

    boolean e();

    boolean f();
}
