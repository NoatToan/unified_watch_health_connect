package com.huami.xiaopeng.repo.repo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.car.api.CarApi;
import com.huami.nfc.car.api.CarAppletApi;
import com.huami.nfc.car.entity.VCardInfo;
import com.huami.tools.log.HMLog;
import com.huami.xiaopeng.repo.ActionToXiaoPengActivity;
import com.huami.xiaopeng.repo.device.XpDeviceSyncApi;
import com.huami.xiaopeng.repo.event.XpEventApi;
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

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/xiaopeng/repo/repo/XiaopengCardRepoImpl;", "Lcom/huami/xiaopeng/repo/repo/XiaopengCardRepo;", "", GoogleApiAvailabilityLight.a, "userId", "", "b", "a", "c", "Lcom/huami/nfc/car/entity/VCardInfo;", "getVCardInfo", "action", "token", "keyToken", "", "issueCard", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", "deleteCard", "()Lkotlin/Unit;", "bindDeviceDeleteCard", "aid", "isDefaultCard", "setDefaultCard", "Lcom/huami/nfc/car/api/CarApi;", "Lcom/huami/nfc/car/api/CarApi;", "carApi", "Lcom/huami/xiaopeng/repo/event/XpEventApi;", "Lcom/huami/xiaopeng/repo/event/XpEventApi;", "xpEventApi", "Lcom/huami/xiaopeng/repo/device/XpDeviceSyncApi;", "Lcom/huami/xiaopeng/repo/device/XpDeviceSyncApi;", "deviceSyncApi", "<init>", "(Lcom/huami/nfc/car/api/CarApi;Lcom/huami/xiaopeng/repo/event/XpEventApi;Lcom/huami/xiaopeng/repo/device/XpDeviceSyncApi;)V", "Companion", "xiaopeng-repo_release"}, k = 1, mv = {1, 5, 1})
public final class XiaopengCardRepoImpl implements XiaopengCardRepo {

    @NotNull
    private static final String d = "XiaopengCardRepoImpl";

    @NotNull
    private static final String e = "WALLET_USER";

    @NotNull
    private static final String f = "WALLET_USER_ID";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CarApi carApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final XpEventApi xpEventApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final XpDeviceSyncApi deviceSyncApi;

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
            XiaopengCardRepoImpl xiaopengCardRepoImpl = XiaopengCardRepoImpl.this;
            if ((!m.isBlank(data.getVCardId())) && !xiaopengCardRepoImpl.b(data.getAccountId())) {
                CarAppletApi.DefaultImpls.deleteVCardAndKeyCard$default(xiaopengCardRepoImpl.carApi, null, null, null, 7, null);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/car/entity/VCardInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends VCardInfo>, VCardInfo> {
        public d() {
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
                aid = "D2760001185347410002";
            }
            VCardInfo data2 = payResponse.getData();
            String vCardId = data2 == null ? null : data2.getVCardId();
            if (vCardId == null || vCardId.length() == 0) {
                XiaopengCardRepoImpl.this.deviceSyncApi.updateCarCardList("");
            } else {
                XiaopengCardRepoImpl xiaopengCardRepoImpl = XiaopengCardRepoImpl.this;
                VCardInfo data3 = payResponse.getData();
                if (!xiaopengCardRepoImpl.b(data3 == null ? null : data3.getAccountId())) {
                    HMLog.i(XiaopengCardRepoImpl.d, "删除不属于当前用户的车钥匙", new Object[0]);
                    CarAppletApi.DefaultImpls.deleteVCardAndKeyCard$default(XiaopengCardRepoImpl.this.carApi, null, null, null, 7, null);
                    XiaopengCardRepoImpl.this.deviceSyncApi.deleteApplet(aid);
                    return null;
                }
                XiaopengCardRepoImpl.this.deviceSyncApi.updateCarCardList(aid);
            }
            return payResponse.getData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PayResponse<? extends Boolean>, Boolean> {
        public static final e a = new e();

        public e() {
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
    public static final class f extends Lambda implements Function1<PayResponse<? extends Unit>, Boolean> {
        public static final f a = new f();

        public f() {
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

    public XiaopengCardRepoImpl(@NotNull CarApi carApi, @NotNull XpEventApi xpEventApi, @NotNull XpDeviceSyncApi xpDeviceSyncApi) {
        this.carApi = carApi;
        this.xpEventApi = xpEventApi;
        this.deviceSyncApi = xpDeviceSyncApi;
    }

    private final boolean a() {
        return ((Boolean) XiaopengCardRepoImplKt.onSuccess(CarApi.DefaultImpls.getVCardInfo$default(this.carApi, null, 1, null), b.a)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(String userId) {
        return m.equals(d(), userId, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String c() throws Exception {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "D2760001185347410002";
        XiaopengCardRepoImplKt.onSuccess(CarApi.DefaultImpls.getVCardInfo$default(this.carApi, null, 1, null), new c(objectRef));
        return (String) objectRef.element;
    }

    private final String d() {
        return (String) Koin.getOrCreateScope$default(KoinJavaComponent.getKoin(), "WALLET_USER", QualifierKt.named("WALLET_USER"), null, 4, null).get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named("WALLET_USER_ID"), null);
    }

    @Override // com.huami.xiaopeng.repo.repo.XiaopengCardRepo
    public void bindDeviceDeleteCard() throws Exception {
        XiaopengCardRepoImplKt.onSuccess(CarApi.DefaultImpls.getVCardInfo$default(this.carApi, null, 1, null), new a());
    }

    @Override // com.huami.xiaopeng.repo.repo.XiaopengCardRepo
    @Nullable
    public Unit deleteCard() throws Exception {
        try {
            XiaopengCardRepoImplKt.onFailDoThrow(CarAppletApi.DefaultImpls.deleteVCardAndKeyCard$default(this.carApi, null, null, null, 7, null));
            this.deviceSyncApi.deleteApplet(c());
            this.xpEventApi.deleteCardSuccess();
            return null;
        } catch (Exception e2) {
            this.xpEventApi.deleteCardFail(String.valueOf(e2));
            throw e2;
        }
    }

    @Override // com.huami.xiaopeng.repo.repo.XiaopengCardRepo
    @Nullable
    public VCardInfo getVCardInfo() {
        return (VCardInfo) XiaopengCardRepoImplKt.onSuccess(CarApi.DefaultImpls.getVCardInfo$default(this.carApi, null, 1, null), new d());
    }

    @Override // com.huami.xiaopeng.repo.repo.XiaopengCardRepo
    public boolean isDefaultCard(@NotNull String aid) {
        return ((Boolean) XiaopengCardRepoImplKt.onSuccess(this.deviceSyncApi.isDefaultCard(aid), e.a)).booleanValue();
    }

    @Override // com.huami.xiaopeng.repo.repo.XiaopengCardRepo
    @Nullable
    public Unit issueCard(@NotNull String action, @Nullable String token, @Nullable String keyToken) throws Exception {
        ActionToXiaoPengActivity actionToXiaoPengActivity = ActionToXiaoPengActivity.BigCard;
        boolean zA = Intrinsics.areEqual(actionToXiaoPengActivity.getAction(), action) ? a() : false;
        HMLog.i(d, Intrinsics.stringPlus("isHadXpVCard = ", Boolean.valueOf(zA)), new Object[0]);
        if (!zA && Intrinsics.areEqual(action, actionToXiaoPengActivity.getAction())) {
            try {
                XiaopengCardRepoImplKt.onFailDoThrow(CarAppletApi.DefaultImpls.installVCardAndKeyCard$default(this.carApi, token, keyToken, null, null, null, 28, null));
                String strC = c();
                this.deviceSyncApi.issueApplet(strC);
                this.deviceSyncApi.activeApplet(strC);
                this.xpEventApi.installVCardAndKeyCardSuccess();
                return null;
            } catch (Exception e2) {
                this.xpEventApi.installVCardAndKeyCardFail(String.valueOf(e2));
                throw e2;
            }
        }
        if (!zA && !Intrinsics.areEqual(action, ActionToXiaoPengActivity.KeyCard.getAction())) {
            return null;
        }
        try {
            XiaopengCardRepoImplKt.onFailDoThrow(CarAppletApi.DefaultImpls.installKeyCard$default(this.carApi, token, keyToken, null, null, null, 28, null));
            String strC2 = c();
            this.deviceSyncApi.issueApplet(strC2);
            this.deviceSyncApi.activeApplet(strC2);
            this.xpEventApi.installKeyCardSuccess();
            return null;
        } catch (Exception e3) {
            this.xpEventApi.installKeyCardFail(String.valueOf(e3));
            throw e3;
        }
    }

    @Override // com.huami.xiaopeng.repo.repo.XiaopengCardRepo
    public boolean setDefaultCard(@NotNull String aid) {
        return ((Boolean) XiaopengCardRepoImplKt.onSuccess(this.deviceSyncApi.activeApplet(aid), f.a)).booleanValue();
    }
}
