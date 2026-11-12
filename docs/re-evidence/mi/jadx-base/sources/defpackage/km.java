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
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0005\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0005\u0010\u0014J#\u0010\u0005\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0005\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0005\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u0005\u0010\u001fJ'\u0010\u0005\u001a\u00020\u00112\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b\u0005\u0010%J\u0017\u0010\u0005\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b\u0005\u0010&J\u0017\u0010\u0005\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b\u0005\u0010)J\u000f\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0005\u0010*J\u0017\u0010\u0005\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b\u0005\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0005\u00101J\u000f\u00102\u001a\u00020\u0011H\u0016¢\u0006\u0004\b2\u0010*J\u000f\u00103\u001a\u00020\u0011H\u0016¢\u0006\u0004\b3\u0010*J\u000f\u00104\u001a\u00020\u0011H\u0016¢\u0006\u0004\b4\u0010*J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u0011072\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b4\u00108J+\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050 072\u0006\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0005\u0010;J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u0011072\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b\u0005\u00108¨\u0006@"}, d2 = {"Lkm;", "Lgm;", "Lbj;", "notify", "", PluginDeviceInfo.FMODEL, "(Lbj;)V", "Lw1t;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCStatus;", "(Lw1t;)Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCStatus;", "disconnect", "()Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCStatus;", "", "data", "", "dataLen", "", "encrypt", "Lcom/xiaomi/hm/health/bt/profile/nfc/ApduResponse;", "([BIZ)Lcom/xiaomi/hm/health/bt/profile/nfc/ApduResponse;", "([BI)Lcom/xiaomi/hm/health/bt/profile/nfc/ApduResponse;", "Lcom/xiaomi/hm/health/bt/model/HMAidInfo;", "aidInfo", "(Lcom/xiaomi/hm/health/bt/model/HMAidInfo;)Z", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardInfo;", PluginDeviceInfo.FICONOFF, "()Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardInfo;", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardConfig;", q.f13857a, "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardStatus;", "(Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardConfig;)Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardStatus;", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardIdent;", "cardIdents", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardType;", "type", "(Ljava/util/List;Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardType;)Z", "(Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardType;)Z", "Lcom/xiaomi/hm/health/bt/model/HMAccessInfo;", "info", "(Lcom/xiaomi/hm/health/bt/model/HMAccessInfo;)Z", "()Z", "", "password", "(Ljava/lang/String;)Z", "Lcom/xiaomi/hm/health/bt/profile/nfc/PasswordInteractionResponse;", PluginDeviceInfo.FICONON, "()Lcom/xiaomi/hm/health/bt/profile/nfc/PasswordInteractionResponse;", "([B)Lcom/xiaomi/hm/health/bt/profile/nfc/ApduResponse;", PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FDESC, "Lcom/xiaomi/hm/health/bt/model/HMCardSwitchTime;", "hmCardSwitchTime", "Lcom/xiaomi/hm/health/bt/model/HMCardTSResponse;", "(Lcom/xiaomi/hm/health/bt/model/HMCardSwitchTime;)Lcom/xiaomi/hm/health/bt/model/HMCardTSResponse;", "aid", "cardType", "(Ljava/lang/String;I)Lcom/xiaomi/hm/health/bt/model/HMCardTSResponse;", "Ldm;", "nfcApi", "<init>", "(Ldm;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class km implements gm {

    @NotNull
    public static final b d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final dm f23972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public w1t f23973b;

    @Nullable
    public WeakReference<bj> c;

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"km$a", "Llm;", "", "count", "", PluginDeviceInfo.FMODEL, "Ll9;", "errorCode", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements lm {
        public a() {
        }

        @Override // defpackage.lm
        public void a(int count) {
            bj bjVar;
            WeakReference weakReference = km.this.c;
            if (weakReference == null || (bjVar = (bj) weakReference.get()) == null) {
                return;
            }
            bjVar.b(count);
        }

        @Override // defpackage.lm
        public void a(@NotNull l9 errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            w1t w1tVar = km.this.f23973b;
            if (w1tVar != null) {
                w1tVar.a(new HMNFCStatus(errorCode.getF24791a()));
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkm$b;", "", "", "tag", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public km(@NotNull dm nfcApi) {
        Intrinsics.checkNotNullParameter(nfcApi, "nfcApi");
        this.f23972a = nfcApi;
        nfcApi.a(new a());
    }

    @Override // defpackage.gm
    @NotNull
    public PasswordInteractionResponse c() {
        Integer num = (Integer) C3621pl.a(this.f23972a.c());
        return new PasswordInteractionResponse(num != null ? num.intValue() : -1);
    }

    @Override // defpackage.gm
    @Nullable
    public synchronized HMNFCCardInfo d() {
        return (HMNFCCardInfo) C3621pl.a(this.f23972a.f());
    }

    @Override // defpackage.gm
    @Nullable
    public synchronized HMNFCStatus disconnect() {
        Integer num;
        num = (Integer) C3621pl.a(this.f23972a.d());
        return num != null ? new HMNFCStatus(num.intValue()) : null;
    }

    @Override // defpackage.gm
    public boolean e() {
        return false;
    }

    @Override // defpackage.gm
    public boolean f() {
        return false;
    }

    @Override // defpackage.gm
    public void a(@NotNull bj notify) {
        Intrinsics.checkNotNullParameter(notify, "notify");
        this.c = new WeakReference<>(notify);
    }

    @Override // defpackage.gm
    public boolean b() {
        return this.f23972a.b();
    }

    @Override // defpackage.gm
    @Nullable
    public synchronized HMNFCStatus a(@Nullable w1t listener) {
        Integer num;
        this.f23973b = listener;
        num = (Integer) C3621pl.a(this.f23972a.e());
        return num != null ? new HMNFCStatus(num.intValue()) : null;
    }

    @Override // defpackage.gm
    @NotNull
    public HMCardTSResponse<Boolean> b(@NotNull HMCardSwitchTime hmCardSwitchTime) {
        HMCardTSResponse<Boolean> hMCardTSResponse;
        Intrinsics.checkNotNullParameter(hmCardSwitchTime, "hmCardSwitchTime");
        ol<Boolean> olVarB = this.f23972a.b(hmCardSwitchTime);
        if (olVarB instanceof Timeout) {
            return new HMCardTSResponse<>(Boolean.FALSE, Integer.valueOf(tm.NFC_SET_TIMEOUT.getT()));
        }
        if (olVarB instanceof Failure) {
            hMCardTSResponse = new HMCardTSResponse<>(Boolean.FALSE, Integer.valueOf(((Failure) olVarB).getCode()));
        } else {
            if (!(olVarB instanceof fu)) {
                throw new NoWhenBranchMatchedException();
            }
            hMCardTSResponse = new HMCardTSResponse<>(((fu) olVarB).a(), Integer.valueOf(tm.NFC_SUCCESS.getT()));
        }
        return hMCardTSResponse;
    }

    @Override // defpackage.gm
    @Nullable
    public synchronized ApduResponse a(@Nullable byte[] data, int dataLen, boolean encrypt) {
        return data != null ? (ApduResponse) C3621pl.a(this.f23972a.b(data)) : null;
    }

    @Override // defpackage.gm
    @Nullable
    public synchronized ApduResponse a(@Nullable byte[] data, int dataLen) {
        return data != null ? (ApduResponse) C3621pl.a(this.f23972a.c(data)) : null;
    }

    @Override // defpackage.gm
    public synchronized boolean a(@NotNull HMAidInfo aidInfo) {
        Intrinsics.checkNotNullParameter(aidInfo, "aidInfo");
        return Intrinsics.areEqual(C3621pl.a(this.f23972a.a(aidInfo)), Boolean.TRUE);
    }

    @Override // defpackage.gm
    @Nullable
    public synchronized HMNFCCardStatus a(@Nullable HMNFCCardConfig config) {
        return config != null ? (HMNFCCardStatus) C3621pl.a(this.f23972a.a(config)) : null;
    }

    @Override // defpackage.gm
    public synchronized boolean a(@Nullable List<? extends HMNFCCardIdent> cardIdents, @NotNull HMNFCCardType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (cardIdents != null && !cardIdents.isEmpty()) {
            return this.f23972a.a(cardIdents) instanceof fu;
        }
        return a(type);
    }

    public synchronized boolean a(@NotNull HMNFCCardType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f23972a.a(CollectionsKt__CollectionsJVMKt.listOf(new HMNFCCardIdent(type, 0, ""))) instanceof fu;
    }

    @Override // defpackage.gm
    public synchronized boolean a(@NotNull HMAccessInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return Intrinsics.areEqual(C3621pl.a(this.f23972a.a(info)), Boolean.TRUE);
    }

    @Override // defpackage.gm
    public boolean a() {
        Integer num = (Integer) C3621pl.a(this.f23972a.a());
        return num != null && num.intValue() == 0;
    }

    @Override // defpackage.gm
    public boolean a(@NotNull String password) {
        Intrinsics.checkNotNullParameter(password, "password");
        Integer num = (Integer) C3621pl.a(this.f23972a.a(password));
        return num != null && num.intValue() == 0;
    }

    @Override // defpackage.gm
    @Nullable
    public ApduResponse a(@Nullable byte[] data) {
        if (data == null) {
            return null;
        }
        return (ApduResponse) C3621pl.a(this.f23972a.a(data));
    }

    @Override // defpackage.gm
    @NotNull
    public HMCardTSResponse<List<HMCardSwitchTime>> a(@NotNull String aid, int cardType) {
        HMCardTSResponse<List<HMCardSwitchTime>> hMCardTSResponse;
        Intrinsics.checkNotNullParameter(aid, "aid");
        ol<List<HMCardSwitchTime>> olVarA = this.f23972a.a(aid, cardType);
        if (olVarA instanceof Timeout) {
            return new HMCardTSResponse<>(null, Integer.valueOf(tm.NFC_SET_TIMEOUT.getT()));
        }
        if (olVarA instanceof Failure) {
            hMCardTSResponse = new HMCardTSResponse<>(null, Integer.valueOf(((Failure) olVarA).getCode()));
        } else {
            if (!(olVarA instanceof fu)) {
                throw new NoWhenBranchMatchedException();
            }
            hMCardTSResponse = new HMCardTSResponse<>(((fu) olVarA).a(), Integer.valueOf(tm.NFC_SUCCESS.getT()));
        }
        return hMCardTSResponse;
    }

    @Override // defpackage.gm
    @NotNull
    public HMCardTSResponse<Boolean> a(@NotNull HMCardSwitchTime hmCardSwitchTime) {
        HMCardTSResponse<Boolean> hMCardTSResponse;
        Intrinsics.checkNotNullParameter(hmCardSwitchTime, "hmCardSwitchTime");
        ol<Boolean> olVarA = this.f23972a.a(hmCardSwitchTime);
        if (olVarA instanceof Timeout) {
            return new HMCardTSResponse<>(Boolean.FALSE, Integer.valueOf(tm.NFC_SET_TIMEOUT.getT()));
        }
        if (olVarA instanceof Failure) {
            hMCardTSResponse = new HMCardTSResponse<>(Boolean.FALSE, Integer.valueOf(((Failure) olVarA).getCode()));
        } else {
            if (!(olVarA instanceof fu)) {
                throw new NoWhenBranchMatchedException();
            }
            hMCardTSResponse = new HMCardTSResponse<>(((fu) olVarA).a(), Integer.valueOf(tm.NFC_SUCCESS.getT()));
        }
        return hMCardTSResponse;
    }
}
