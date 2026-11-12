package com.huami.jac.repo.repo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.jac.repo.ActionToJacActivity;
import com.huami.jac.repo.device.JacDeviceSyncApi;
import com.huami.jac.repo.event.JacEventApi;
import com.huami.nfc.applet.api.SeInfoApi;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.car.api.CarAppletApi;
import com.huami.nfc.car.api.CarSubType;
import com.huami.nfc.car.api.DefaultCarApi;
import com.huami.nfc.car.entity.SupportCar;
import com.huami.nfc.car.entity.VCardInfo;
import com.huami.nfc.web.NfcDevice;
import com.huami.tools.log.HMLog;
import io.netty.util.internal.StringUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B/\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016JA\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002H\u0016R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/huami/jac/repo/repo/JacCardRepoImpl;", "Lcom/huami/jac/repo/repo/JacCardRepo;", "", GoogleApiAvailabilityLight.a, "userId", "", "b", "a", "c", "Lcom/huami/nfc/car/entity/VCardInfo;", "getVCardInfo", "", "Lcom/huami/nfc/car/entity/SupportCar;", "getSupportCarList", "action", "token", "keyToken", "watchId", "vin", "", "issueCard", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", "deleteCard", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", "bindDeviceDeleteCard", "aid", "isDefaultCard", "setDefaultCard", "Lcom/huami/nfc/web/NfcDevice;", "Lcom/huami/nfc/web/NfcDevice;", "nfcDevice", "Lcom/huami/nfc/applet/api/SeInfoApi;", "Lcom/huami/nfc/applet/api/SeInfoApi;", "seInfoApi", "Lcom/huami/nfc/car/api/DefaultCarApi;", "Lcom/huami/nfc/car/api/DefaultCarApi;", "carApi", "Lcom/huami/jac/repo/event/JacEventApi;", "Lcom/huami/jac/repo/event/JacEventApi;", "jacEventApi", "Lcom/huami/jac/repo/device/JacDeviceSyncApi;", "e", "Lcom/huami/jac/repo/device/JacDeviceSyncApi;", "deviceSyncApi", "<init>", "(Lcom/huami/nfc/web/NfcDevice;Lcom/huami/nfc/applet/api/SeInfoApi;Lcom/huami/nfc/car/api/DefaultCarApi;Lcom/huami/jac/repo/event/JacEventApi;Lcom/huami/jac/repo/device/JacDeviceSyncApi;)V", "Companion", "jac-repo_release"}, k = 1, mv = {1, 5, 1})
public final class JacCardRepoImpl implements JacCardRepo {

    @NotNull
    private static final String f = "JacCardRepoImpl";

    @NotNull
    private static final String g = "WALLET_USER";

    @NotNull
    private static final String h = "WALLET_USER_ID";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final NfcDevice nfcDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SeInfoApi seInfoApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DefaultCarApi carApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final JacEventApi jacEventApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final JacDeviceSyncApi deviceSyncApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/car/entity/VCardInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayResponse<? extends VCardInfo>, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(@NotNull PayResponse<VCardInfo> payResponse) {
            VCardInfo data = payResponse.getData();
            if (data == null) {
                return null;
            }
            JacCardRepoImpl jacCardRepoImpl = JacCardRepoImpl.this;
            if ((!m.isBlank(data.getVCardId())) && !jacCardRepoImpl.b(data.getAccountId())) {
                PayResponse<String> cplc = jacCardRepoImpl.seInfoApi.getCplc(jacCardRepoImpl.nfcDevice.getSn());
                PayResponse<String> payResponse2 = cplc.isSuccessful() && cplc.getData() != null ? cplc : null;
                if (payResponse2 != null) {
                    CarAppletApi.DefaultImpls.deleteVCardAndKeyCard$default(jacCardRepoImpl.carApi, "9", payResponse2.getData(), null, 4, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/car/entity/VCardInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends VCardInfo>, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final boolean a(@NotNull PayResponse<VCardInfo> payResponse) {
            VCardInfo data = payResponse.getData();
            String vCardId = data == null ? null : data.getVCardId();
            return !(vCardId == null || vCardId.length() == 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(PayResponse<? extends VCardInfo> payResponse) {
            return Boolean.valueOf(a(payResponse));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/car/entity/VCardInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends VCardInfo>, String> {
        public final /* synthetic */ Ref.ObjectRef<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.ObjectRef<String> objectRef) {
            super(1);
            this.a = objectRef;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.String] */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<VCardInfo> payResponse) {
            ?? aid;
            VCardInfo data = payResponse.getData();
            if (data == null || (aid = data.getAid()) == 0) {
                return null;
            }
            this.a.element = aid;
            return aid;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/car/entity/SupportCar;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends List<SupportCar>>, List<SupportCar>> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<SupportCar> invoke(@NotNull PayResponse<? extends List<SupportCar>> payResponse) {
            return payResponse.getData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/car/entity/VCardInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PayResponse<? extends VCardInfo>, VCardInfo> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VCardInfo invoke(@NotNull PayResponse<VCardInfo> payResponse) {
            String aid;
            if (payResponse.getData() == null) {
                return null;
            }
            VCardInfo data = payResponse.getData();
            if (data == null || (aid = data.getAid()) == null) {
                aid = "F060BBA2E1B8FD6B01";
            }
            VCardInfo data2 = payResponse.getData();
            String vCardId = data2 == null ? null : data2.getVCardId();
            if (vCardId == null || vCardId.length() == 0) {
                JacCardRepoImpl.this.deviceSyncApi.updateCarCardList("");
            } else {
                JacCardRepoImpl jacCardRepoImpl = JacCardRepoImpl.this;
                VCardInfo data3 = payResponse.getData();
                if (!jacCardRepoImpl.b(data3 == null ? null : data3.getAccountId())) {
                    HMLog.i(JacCardRepoImpl.f, "删除不属于当前用户的车钥匙", new Object[0]);
                    PayResponse<String> cplc = JacCardRepoImpl.this.seInfoApi.getCplc(JacCardRepoImpl.this.nfcDevice.getSn());
                    if (!(cplc.isSuccessful() && cplc.getData() != null)) {
                        cplc = null;
                    }
                    if (cplc != null) {
                        CarAppletApi.DefaultImpls.deleteVCardAndKeyCard$default(JacCardRepoImpl.this.carApi, "9", cplc.getData(), null, 4, null);
                    }
                    JacCardRepoImpl.this.deviceSyncApi.deleteApplet(aid);
                    return null;
                }
                JacCardRepoImpl.this.deviceSyncApi.updateCarCardList(aid);
            }
            return payResponse.getData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<PayResponse<? extends Boolean>, Boolean> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        public final boolean a(@NotNull PayResponse<Boolean> payResponse) {
            Boolean data = payResponse.getData();
            if (data == null) {
                return false;
            }
            return data.booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(PayResponse<? extends Boolean> payResponse) {
            return Boolean.valueOf(a(payResponse));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<PayResponse<? extends Unit>, Boolean> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        public final boolean a(@NotNull PayResponse<Unit> payResponse) {
            return true;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(PayResponse<? extends Unit> payResponse) {
            return Boolean.valueOf(a(payResponse));
        }
    }

    public JacCardRepoImpl(@NotNull NfcDevice nfcDevice, @NotNull SeInfoApi seInfoApi, @NotNull DefaultCarApi defaultCarApi, @NotNull JacEventApi jacEventApi, @NotNull JacDeviceSyncApi jacDeviceSyncApi) {
        this.nfcDevice = nfcDevice;
        this.seInfoApi = seInfoApi;
        this.carApi = defaultCarApi;
        this.jacEventApi = jacEventApi;
        this.deviceSyncApi = jacDeviceSyncApi;
    }

    private final boolean a() {
        return ((Boolean) JacCardRepoImplKt.onSuccess(this.carApi.getVCardInfo(CarSubType.Jac.getValue()), b.a)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(String userId) {
        HMLog.i(f, "checkUserId currentUserId = " + d() + " userId=" + ((Object) userId) + StringUtil.SPACE, new Object[0]);
        return m.equals(d(), userId, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String c() throws Exception {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "F060BBA2E1B8FD6B01";
        JacCardRepoImplKt.onSuccess(this.carApi.getVCardInfo(CarSubType.Jac.getValue()), new c(objectRef));
        return (String) objectRef.element;
    }

    private final String d() {
        return (String) Koin.getOrCreateScope$default(KoinJavaComponent.getKoin(), "WALLET_USER", QualifierKt.named("WALLET_USER"), null, 4, null).get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named("WALLET_USER_ID"), null);
    }

    @Override // com.huami.jac.repo.repo.JacCardRepo
    public void bindDeviceDeleteCard() throws Exception {
        JacCardRepoImplKt.onSuccess(this.carApi.getVCardInfo(CarSubType.Jac.getValue()), new a());
    }

    @Override // com.huami.jac.repo.repo.JacCardRepo
    @Nullable
    public Unit deleteCard(@Nullable String watchId, @Nullable String vin) throws Exception {
        try {
            PayResponse<String> cplc = this.seInfoApi.getCplc(this.nfcDevice.getSn());
            if (!(cplc.isSuccessful() && cplc.getData() != null)) {
                cplc = null;
            }
            if (cplc != null) {
                JacCardRepoImplKt.onFailDoThrow(CarAppletApi.DefaultImpls.deleteVCardAndKeyCard$default(this.carApi, "9", cplc.getData(), null, 4, null));
            }
            this.deviceSyncApi.deleteApplet(c());
            this.jacEventApi.deleteCardSuccess();
            return null;
        } catch (Exception e2) {
            this.jacEventApi.deleteCardFail(String.valueOf(e2));
            throw e2;
        }
    }

    @Override // com.huami.jac.repo.repo.JacCardRepo
    @Nullable
    public List<SupportCar> getSupportCarList() {
        return (List) JacCardRepoImplKt.onSuccess(this.carApi.getCarSupportDevices(), d.a);
    }

    @Override // com.huami.jac.repo.repo.JacCardRepo
    @Nullable
    public VCardInfo getVCardInfo() {
        return (VCardInfo) JacCardRepoImplKt.onSuccess(this.carApi.getVCardInfo(CarSubType.Jac.getValue()), new e());
    }

    @Override // com.huami.jac.repo.repo.JacCardRepo
    public boolean isDefaultCard(@NotNull String aid) {
        return ((Boolean) JacCardRepoImplKt.onSuccess(this.deviceSyncApi.isDefaultCard(aid), f.a)).booleanValue();
    }

    @Override // com.huami.jac.repo.repo.JacCardRepo
    @Nullable
    public Unit issueCard(@NotNull String action, @Nullable String token, @Nullable String keyToken, @Nullable String watchId, @Nullable String vin) throws Exception {
        ActionToJacActivity actionToJacActivity = ActionToJacActivity.BigCard;
        boolean zA = Intrinsics.areEqual(actionToJacActivity.getAction(), action) ? a() : false;
        HMLog.i(f, Intrinsics.stringPlus("isHadXpVCard = ", Boolean.valueOf(zA)), new Object[0]);
        if (!zA && Intrinsics.areEqual(action, actionToJacActivity.getAction())) {
            try {
                JacCardRepoImplKt.onFailDoThrow(this.carApi.installVCardAndKeyCard(token, keyToken, "9", watchId, vin));
                String strC = c();
                this.deviceSyncApi.issueApplet(strC);
                this.deviceSyncApi.activeApplet(strC);
                this.jacEventApi.installVCardAndKeyCardSuccess();
                return null;
            } catch (Exception e2) {
                this.jacEventApi.installVCardAndKeyCardFail(String.valueOf(e2));
                throw e2;
            }
        }
        if (!zA && !Intrinsics.areEqual(action, ActionToJacActivity.KeyCard.getAction())) {
            return null;
        }
        try {
            JacCardRepoImplKt.onFailDoThrow(this.carApi.installKeyCard(token, keyToken, "9", watchId, vin));
            String strC2 = c();
            this.deviceSyncApi.issueApplet(strC2);
            this.deviceSyncApi.activeApplet(strC2);
            this.jacEventApi.installKeyCardSuccess();
            return null;
        } catch (Exception e3) {
            this.jacEventApi.installKeyCardFail(String.valueOf(e3));
            throw e3;
        }
    }

    @Override // com.huami.jac.repo.repo.JacCardRepo
    public boolean setDefaultCard(@NotNull String aid) {
        return ((Boolean) JacCardRepoImplKt.onSuccess(this.deviceSyncApi.activeApplet(aid), g.a)).booleanValue();
    }
}
