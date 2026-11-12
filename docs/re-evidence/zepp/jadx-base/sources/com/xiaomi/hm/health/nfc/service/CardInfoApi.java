package com.xiaomi.hm.health.nfc.service;

import com.huami.nfc.applet.BusCardExtensions;
import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.applet.TransType;
import com.huami.nfc.applet.api.SeAppletApi;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.xiaomi.hm.health.nfc.bus.INFCOpenServiceWebAPI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/nfc/service/CardInfoApi;", "Lcom/xiaomi/hm/health/nfc/service/ICardInfoApi;", "", "aid", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "getCardNumber", "number", "getCardNumberFromWeb", "", "getBalance", "getValidityDate", "", "Lcom/xiaomi/hm/health/nfc/service/Record;", "getTradeRecords", "Lcom/huami/nfc/applet/api/SeAppletApi;", "a", "Lcom/huami/nfc/applet/api/SeAppletApi;", "api", "Lcom/xiaomi/hm/health/nfc/bus/INFCOpenServiceWebAPI;", "b", "Lcom/xiaomi/hm/health/nfc/bus/INFCOpenServiceWebAPI;", "webApi", "<init>", "(Lcom/huami/nfc/applet/api/SeAppletApi;Lcom/xiaomi/hm/health/nfc/bus/INFCOpenServiceWebAPI;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CardInfoApi implements ICardInfoApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SeAppletApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final INFCOpenServiceWebAPI webApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/applet/CardInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayResponse<? extends CardInfo>, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends CardInfo> payResponse) {
            if (payResponse.isSuccessful()) {
                return payResponse.getData().getNumber();
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/applet/TransEntity;", "", "Lcom/xiaomi/hm/health/nfc/service/Record;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends List<TransEntity>>, List<? extends Record>> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Record> invoke(@NotNull PayResponse<? extends List<TransEntity>> payResponse) {
            if (!payResponse.isSuccessful()) {
                return null;
            }
            List<TransEntity> data = payResponse.getData();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
            for (TransEntity transEntity : data) {
                arrayList.add(new Record(transEntity.getType() == TransType.Consume ? 1 : 2, transEntity.getAmount(), CardInfoApiKt.a(transEntity.getTime(), "yyyyMMddHHmmss")));
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/applet/CardInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends CardInfo>, String> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends CardInfo> payResponse) {
            if (payResponse.isSuccessful()) {
                return CardInfoApiKt.b(payResponse.getData().getActivationDate(), null, 1, null);
            }
            return null;
        }
    }

    public CardInfoApi(@NotNull SeAppletApi seAppletApi, @NotNull INFCOpenServiceWebAPI iNFCOpenServiceWebAPI) {
        this.api = seAppletApi;
        this.webApi = iNFCOpenServiceWebAPI;
    }

    @Override // com.xiaomi.hm.health.nfc.service.ICardInfoApi
    @NotNull
    public PayResponse<Integer> getBalance(@NotNull String aid) {
        return this.api.getBalance(BusCardExtensions.fromAid(aid).getAppCode());
    }

    @Override // com.xiaomi.hm.health.nfc.service.ICardInfoApi
    @NotNull
    public PayResponse<CardInfo> getCardInfo(@NotNull String aid) {
        return this.api.getCardInfo(BusCardExtensions.fromAid(aid).getAppCode());
    }

    @Override // com.xiaomi.hm.health.nfc.service.ICardInfoApi
    @NotNull
    public PayResponse<String> getCardNumber(@NotNull String aid) {
        return PayResponseKt.map(getCardInfo(aid), a.a);
    }

    @Override // com.xiaomi.hm.health.nfc.service.ICardInfoApi
    @NotNull
    public PayResponse<String> getCardNumberFromWeb(@NotNull String aid, @NotNull String number) {
        return this.webApi.getCardNumber(aid, number);
    }

    @Override // com.xiaomi.hm.health.nfc.service.ICardInfoApi
    @NotNull
    public PayResponse<List<Record>> getTradeRecords(@NotNull String aid) {
        return PayResponseKt.map(this.api.getTransRecord(BusCardExtensions.fromAid(aid).getAppCode()), b.a);
    }

    @Override // com.xiaomi.hm.health.nfc.service.ICardInfoApi
    @NotNull
    public PayResponse<String> getValidityDate(@NotNull String aid) {
        return PayResponseKt.map(getCardInfo(aid), c.a);
    }
}
