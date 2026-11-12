package com.huami.wallet.datasource.cloud;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.applet.api.SeAppletApi;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.ble.NfcBleApi;
import com.huami.wallet.lib.util.CitySimpleInfoCache;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140 \u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140 ¢\u0006\u0004\b(\u0010)Jn\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u00052'\u0010\u000b\u001a#\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u0005H\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0016R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006*"}, d2 = {"Lcom/huami/wallet/datasource/cloud/ExtendAppletBleApi;", "Lcom/huami/wallet/datasource/cloud/FilterAppletApi;", ExifInterface.GPS_DIRECTION_TRUE, "", "appCode", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "aid", "Lcom/huami/nfc/base/PayResponse;", "bleBlock", "apduBlock", "a", "", "getBalance", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "", "Lcom/huami/nfc/applet/TransEntity;", "getTransRecord", "", "isInstalled", "getLingNanTongCityCode", "", "activateCard", "deactivateCard", "aidList", "getDefaultCardAid", "Lcom/huami/nfc/ble/NfcBleApi;", "b", "Lcom/huami/nfc/ble/NfcBleApi;", "bleApi", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/Function0;", "withBleApi", GoogleApiAvailabilityLight.a, "isSupportDynamic", "Lcom/huami/nfc/applet/api/SeAppletApi;", "delegate", "<init>", "(Lcom/huami/nfc/applet/api/SeAppletApi;Lcom/huami/nfc/ble/NfcBleApi;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "cloud-api_release"}, k = 1, mv = {1, 5, 1})
public final class ExtendAppletBleApi extends FilterAppletApi {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final NfcBleApi bleApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> withBleApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isSupportDynamic;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<String, PayResponse<? extends Integer>> {
        public a(NfcBleApi nfcBleApi) {
            super(1, nfcBleApi, NfcBleApi.class, "getBalance", "getBalance(Ljava/lang/String;)Lcom/huami/nfc/base/PayResponse;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Integer> invoke(@NotNull String str) {
            return ((NfcBleApi) this.receiver).getBalance(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<String, PayResponse<? extends Integer>> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Integer> invoke(@NotNull String str) {
            return ExtendAppletBleApi.super.getBalance(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1<String, PayResponse<? extends CardInfo>> {
        public c(NfcBleApi nfcBleApi) {
            super(1, nfcBleApi, NfcBleApi.class, "getCardInfo", "getCardInfo(Ljava/lang/String;)Lcom/huami/nfc/base/PayResponse;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<CardInfo> invoke(@NotNull String str) {
            return ((NfcBleApi) this.receiver).getCardInfo(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/applet/CardInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<String, PayResponse<? extends CardInfo>> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<CardInfo> invoke(@NotNull String str) {
            return ExtendAppletBleApi.super.getCardInfo(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1<String, PayResponse<? extends List<TransEntity>>> {
        public e(NfcBleApi nfcBleApi) {
            super(1, nfcBleApi, NfcBleApi.class, "getTransRecord", "getTransRecord(Ljava/lang/String;)Lcom/huami/nfc/base/PayResponse;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<List<TransEntity>> invoke(@NotNull String str) {
            return ((NfcBleApi) this.receiver).getTransRecord(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/applet/TransEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<String, PayResponse<? extends List<TransEntity>>> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<List<TransEntity>> invoke(@NotNull String str) {
            return ExtendAppletBleApi.super.getTransRecord(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class g extends FunctionReferenceImpl implements Function1<String, PayResponse<? extends Boolean>> {
        public g(NfcBleApi nfcBleApi) {
            super(1, nfcBleApi, NfcBleApi.class, "isInstalled", "isInstalled(Ljava/lang/String;)Lcom/huami/nfc/base/PayResponse;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Boolean> invoke(@NotNull String str) {
            return ((NfcBleApi) this.receiver).isInstalled(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<String, PayResponse<? extends Boolean>> {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Boolean> invoke(@NotNull String str) {
            return ExtendAppletBleApi.super.isInstalled(str);
        }
    }

    public ExtendAppletBleApi(@NotNull SeAppletApi seAppletApi, @NotNull NfcBleApi nfcBleApi, @NotNull Function0<Boolean> function0, @NotNull Function0<Boolean> function1) {
        super(seAppletApi);
        this.bleApi = nfcBleApi;
        this.withBleApi = function0;
        this.isSupportDynamic = function1;
    }

    private final <T> PayResponse<T> a(String appCode, Function1<? super String, ? extends PayResponse<? extends T>> bleBlock, Function1<? super String, ? extends PayResponse<? extends T>> apduBlock) {
        if (!this.withBleApi.invoke().booleanValue()) {
            return apduBlock.invoke(appCode);
        }
        String aid = CitySimpleInfoCache.INSTANCE.getAid(appCode);
        if (aid == null || kotlin.text.m.isBlank(aid)) {
            return PayResponse.Companion.error$default(PayResponse.INSTANCE, "没有匹配的公交卡", null, 2, null);
        }
        return this.isSupportDynamic.invoke().booleanValue() ? bleBlock.invoke(aid) : apduBlock.invoke(appCode);
    }

    @Override // com.huami.wallet.datasource.cloud.FilterAppletApi, com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> activateCard(@NotNull String appCode) {
        if (!this.withBleApi.invoke().booleanValue()) {
            return super.activateCard(appCode);
        }
        String aid = CitySimpleInfoCache.INSTANCE.getAid(appCode);
        return aid == null || kotlin.text.m.isBlank(aid) ? PayResponse.Companion.error$default(PayResponse.INSTANCE, "没有匹配的公交卡", null, 2, null) : this.bleApi.activeDefaultCard(aid, AppletType.BUS);
    }

    @Override // com.huami.wallet.datasource.cloud.FilterAppletApi, com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> deactivateCard(@NotNull String aid) {
        return this.withBleApi.invoke().booleanValue() ? this.bleApi.deactivateDefaultCard(aid, AppletType.BUS) : super.deactivateCard(aid);
    }

    @Override // com.huami.wallet.datasource.cloud.FilterAppletApi, com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Integer> getBalance(@NotNull String appCode) {
        return a(appCode, new a(this.bleApi), new b());
    }

    @Override // com.huami.wallet.datasource.cloud.FilterAppletApi, com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<CardInfo> getCardInfo(@NotNull String appCode) {
        return a(appCode, new c(this.bleApi), new d());
    }

    @Override // com.huami.wallet.datasource.cloud.FilterAppletApi, com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<String> getDefaultCardAid(@NotNull List<String> aidList) {
        return this.withBleApi.invoke().booleanValue() ? this.bleApi.readDefaultCard() : super.getDefaultCardAid(aidList);
    }

    @Override // com.huami.wallet.datasource.cloud.FilterAppletApi, com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<String> getLingNanTongCityCode() {
        if (this.withBleApi.invoke().booleanValue()) {
            return this.isSupportDynamic.invoke().booleanValue() ? this.bleApi.getLingNanTongCityCode() : super.getLingNanTongCityCode();
        }
        return super.getLingNanTongCityCode();
    }

    @Override // com.huami.wallet.datasource.cloud.FilterAppletApi, com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<List<TransEntity>> getTransRecord(@NotNull String appCode) {
        return a(appCode, new e(this.bleApi), new f());
    }

    @Override // com.huami.wallet.datasource.cloud.FilterAppletApi, com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Boolean> isInstalled(@NotNull String appCode) {
        return a(appCode, new g(this.bleApi), new h());
    }
}
