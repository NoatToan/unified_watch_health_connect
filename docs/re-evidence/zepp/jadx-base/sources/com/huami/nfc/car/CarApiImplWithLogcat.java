package com.huami.nfc.car;

import com.huami.nfc.base.ErrorCodeConstant;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseExtensionsKt;
import com.huami.nfc.car.api.CarApi;
import com.huami.nfc.car.entity.SupportCar;
import com.huami.nfc.car.entity.VCardInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004H\u0016J>\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J>\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0015\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/nfc/car/CarApiImplWithLogcat;", "Lcom/huami/nfc/car/api/CarApi;", "", "carSubType", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/car/entity/VCardInfo;", "getVCardInfo", "", "Lcom/huami/nfc/car/entity/SupportCar;", "getCarSupportDevices", "token", "keyToken", "productSubType", "watchId", "vin", "", "installVCardAndKeyCard", "deleteVCardAndKeyCard", "installKeyCard", "a", "Lcom/huami/nfc/car/api/CarApi;", "carApi", "<init>", "(Lcom/huami/nfc/car/api/CarApi;)V", "nfc-car_release"}, k = 1, mv = {1, 5, 1})
public final class CarApiImplWithLogcat implements CarApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CarApi carApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return Intrinsics.stringPlus("删除大小卡", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/car/entity/SupportCar;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends List<SupportCar>>, String> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<SupportCar>> payResponse) {
            return "获支持的卡信息";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/car/entity/VCardInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends VCardInfo>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<VCardInfo> payResponse) {
            return Intrinsics.stringPlus("获取卡信息", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return Intrinsics.stringPlus("安装小卡", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return Intrinsics.stringPlus("安装大小卡", this.a);
        }
    }

    public CarApiImplWithLogcat(@NotNull CarApi carApi) {
        this.carApi = carApi;
    }

    @Override // com.huami.nfc.car.api.CarAppletApi
    @NotNull
    public PayResponse<Unit> deleteVCardAndKeyCard(@NotNull String productSubType, @Nullable String watchId, @Nullable String vin) {
        return PayResponseExtensionsKt.logcat(this.carApi.deleteVCardAndKeyCard(productSubType, watchId, vin), "70004", new a(productSubType));
    }

    @Override // com.huami.nfc.car.api.CarApi
    @NotNull
    public PayResponse<List<SupportCar>> getCarSupportDevices() {
        return PayResponseExtensionsKt.logcat(this.carApi.getCarSupportDevices(), ErrorCodeConstant.NFC_XP_SUPPORT, b.a);
    }

    @Override // com.huami.nfc.car.api.CarApi
    @NotNull
    public PayResponse<VCardInfo> getVCardInfo(@Nullable String carSubType) {
        return PayResponseExtensionsKt.logcat(this.carApi.getVCardInfo(carSubType), "70001", new c(carSubType));
    }

    @Override // com.huami.nfc.car.api.CarAppletApi
    @NotNull
    public PayResponse<Unit> installKeyCard(@Nullable String token, @Nullable String keyToken, @NotNull String productSubType, @Nullable String watchId, @Nullable String vin) {
        return PayResponseExtensionsKt.logcat(this.carApi.installKeyCard(token, keyToken, productSubType, watchId, vin), "70003", new d(productSubType));
    }

    @Override // com.huami.nfc.car.api.CarAppletApi
    @NotNull
    public PayResponse<Unit> installVCardAndKeyCard(@Nullable String token, @Nullable String keyToken, @NotNull String productSubType, @Nullable String watchId, @Nullable String vin) {
        return PayResponseExtensionsKt.logcat(this.carApi.installVCardAndKeyCard(token, keyToken, productSubType, watchId, vin), "70002", new e(productSubType));
    }
}
