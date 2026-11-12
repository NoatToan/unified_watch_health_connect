package com.huami.nfc.car;

import com.google.gson.reflect.TypeToken;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.base.NfcChannelExtensionsKt;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.car.api.CarApi;
import com.huami.nfc.car.api.CarAppletApi;
import com.huami.nfc.car.entity.SupportCar;
import com.huami.nfc.car.entity.VCardInfo;
import com.huami.nfc.web.http.HttpComponent;
import com.huami.nfc.web.http.HttpComponentKt;
import com.huami.nfc.web.http.HttpEngine;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0005H\u0016J>\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016J>\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/nfc/car/CarApiImpl;", "Lcom/huami/nfc/car/api/CarApi;", "Lcom/huami/nfc/web/http/HttpComponent;", "", "carSubType", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/car/entity/VCardInfo;", "getVCardInfo", "", "Lcom/huami/nfc/car/entity/SupportCar;", "getCarSupportDevices", "token", "keyToken", "productSubType", "watchId", "vin", "", "installVCardAndKeyCard", "deleteVCardAndKeyCard", "installKeyCard", "Lcom/huami/nfc/base/INfcChannel;", "a", "Lcom/huami/nfc/base/INfcChannel;", "channel", "Lcom/huami/nfc/car/api/CarAppletApi;", "b", "Lcom/huami/nfc/car/api/CarAppletApi;", "appletApi", "<init>", "(Lcom/huami/nfc/base/INfcChannel;Lcom/huami/nfc/car/api/CarAppletApi;)V", "nfc-car_release"}, k = 1, mv = {1, 5, 1})
public final class CarApiImpl implements CarApi, HttpComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel channel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CarAppletApi appletApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: com.huami.nfc.car.CarApiImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0506a extends Lambda implements Function1<PayResponse<? extends Unit>, Unit> {
            public static final C0506a a = new C0506a();

            public C0506a() {
                super(1);
            }

            public final void a(@NotNull PayResponse<Unit> payResponse) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends Unit> payResponse) {
                a(payResponse);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> invoke() {
            return PayResponseKt.map(CarApiImpl.this.appletApi.deleteVCardAndKeyCard(this.b, this.c, this.d), C0506a.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, String str4, String str5) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> invoke() {
            return CarApiImpl.this.appletApi.installKeyCard(this.b, this.c, this.d, this.e, this.f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<PayResponse<? extends Unit>, Unit> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            public final void a(@NotNull PayResponse<Unit> payResponse) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends Unit> payResponse) {
                a(payResponse);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, String str4, String str5) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> invoke() {
            return PayResponseKt.map(CarApiImpl.this.appletApi.installVCardAndKeyCard(this.b, this.c, this.d, this.e, this.f), a.a);
        }
    }

    public CarApiImpl(@NotNull INfcChannel iNfcChannel, @NotNull CarAppletApi carAppletApi) {
        this.channel = iNfcChannel;
        this.appletApi = carAppletApi;
    }

    @Override // com.huami.nfc.car.api.CarAppletApi
    @NotNull
    public PayResponse<Unit> deleteVCardAndKeyCard(@NotNull String productSubType, @Nullable String watchId, @Nullable String vin) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.channel, new a(productSubType, watchId, vin));
    }

    @Override // com.huami.nfc.car.api.CarApi
    @NotNull
    public PayResponse<List<SupportCar>> getCarSupportDevices() {
        Object payResponse;
        Response responseHttpGet$default = HttpComponentKt.httpGet$default(this, "/nfc/carkey/devices", null, ConstantKt.getHEADERS(), 2, null);
        if (!responseHttpGet$default.isSuccessful() || responseHttpGet$default.body() == null) {
            String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(responseHttpGet$default.code()));
            ResponseBody responseBodyErrorBody = responseHttpGet$default.errorBody();
            payResponse = new PayResponse(strStringPlus, PayResponseKt.getMessage(responseHttpGet$default, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), null);
        } else {
            payResponse = PayResponseKt.getGson().fromJson(((ResponseBody) responseHttpGet$default.body()).string(), new TypeToken<PayResponse<? extends List<SupportCar>>>() { // from class: com.huami.nfc.car.CarApiImpl$getCarSupportDevices$$inlined$asPayResponse$1
            }.getType());
        }
        return (PayResponse) payResponse;
    }

    @Override // com.huami.nfc.web.http.HttpComponent
    @NotNull
    public HttpEngine getEngine() {
        return HttpComponent.DefaultImpls.getEngine(this);
    }

    @Override // com.huami.nfc.car.api.CarApi
    @NotNull
    public PayResponse<VCardInfo> getVCardInfo(@Nullable String carSubType) {
        Object payResponse;
        Response<ResponseBody> responseHttpGet = HttpComponentKt.httpGet(this, "/nfc/card/list", r.mutableMapOf(TuplesKt.to("carSubType", String.valueOf(carSubType))), ConstantKt.getHEADERS());
        if (!responseHttpGet.isSuccessful() || responseHttpGet.body() == null) {
            String strStringPlus = Intrinsics.stringPlus("http", Integer.valueOf(responseHttpGet.code()));
            ResponseBody responseBodyErrorBody = responseHttpGet.errorBody();
            payResponse = new PayResponse(strStringPlus, PayResponseKt.getMessage(responseHttpGet, responseBodyErrorBody == null ? null : responseBodyErrorBody.string()), null);
        } else {
            payResponse = PayResponseKt.getGson().fromJson(responseHttpGet.body().string(), new TypeToken<PayResponse<? extends VCardInfo>>() { // from class: com.huami.nfc.car.CarApiImpl$getVCardInfo$$inlined$asPayResponse$1
            }.getType());
        }
        return (PayResponse) payResponse;
    }

    @Override // com.huami.nfc.car.api.CarAppletApi
    @NotNull
    public PayResponse<Unit> installKeyCard(@Nullable String token, @Nullable String keyToken, @NotNull String productSubType, @Nullable String watchId, @Nullable String vin) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.channel, new b(token, keyToken, productSubType, watchId, vin));
    }

    @Override // com.huami.nfc.car.api.CarAppletApi
    @NotNull
    public PayResponse<Unit> installVCardAndKeyCard(@Nullable String token, @Nullable String keyToken, @NotNull String productSubType, @Nullable String watchId, @Nullable String vin) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.channel, new c(token, keyToken, productSubType, watchId, vin));
    }
}
