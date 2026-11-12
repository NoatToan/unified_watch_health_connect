package com.huami.nfc.watch.unionpay.api.impl;

import com.huami.nfc.base.ErrorCodeConstant;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseExtensionsKt;
import com.huami.nfc.watch.unionpay.api.WatchUnionpayWebApi;
import com.huami.nfc.watch.unionpay.entity.BankCardBindStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0016J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u0016\u0010\u0010\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/nfc/watch/unionpay/api/impl/WatchUnionpayWebApiWithLog;", "Lcom/huami/nfc/watch/unionpay/api/WatchUnionpayWebApi;", "Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/watch/unionpay/entity/BankCardBindStatus;", "getBindCards", "", "aidList", "", "deleteCards", "aid", "bindCard", "appName", "getTsmDownloadUrl", "a", "Lcom/huami/nfc/watch/unionpay/api/WatchUnionpayWebApi;", "webApi", "<init>", "(Lcom/huami/nfc/watch/unionpay/api/WatchUnionpayWebApi;)V", "nfc-watch-unionpay_release"}, k = 1, mv = {1, 5, 1})
public final class WatchUnionpayWebApiWithLog implements WatchUnionpayWebApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WatchUnionpayWebApi webApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "添加绑定关系到云端";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "删除银联卡绑定关系";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/watch/unionpay/entity/BankCardBindStatus;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends List<? extends BankCardBindStatus>>, String> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<BankCardBindStatus>> payResponse) {
            return "获取已绑定的银联卡";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "获取银联安全控件下载地址";
        }
    }

    public WatchUnionpayWebApiWithLog(@NotNull WatchUnionpayWebApi watchUnionpayWebApi) {
        this.webApi = watchUnionpayWebApi;
    }

    @Override // com.huami.nfc.watch.unionpay.api.WatchUnionpayWebApi
    @NotNull
    public PayResponse<Unit> bindCard(@NotNull String aid) {
        return PayResponseExtensionsKt.logcat(this.webApi.bindCard(aid), ErrorCodeConstant.NFC_UNIONPAY_INSTALL_APP, a.a);
    }

    @Override // com.huami.nfc.watch.unionpay.api.WatchUnionpayWebApi
    @NotNull
    public PayResponse<Unit> deleteCards(@NotNull List<String> aidList) {
        return PayResponseExtensionsKt.logcat(this.webApi.deleteCards(aidList), ErrorCodeConstant.NFC_UNIONPAY_DELETE_APP, b.a);
    }

    @Override // com.huami.nfc.watch.unionpay.api.WatchUnionpayWebApi
    @NotNull
    public PayResponse<List<BankCardBindStatus>> getBindCards() {
        return PayResponseExtensionsKt.logcat(this.webApi.getBindCards(), ErrorCodeConstant.NFC_UNIONPAY_GET_APP_LIST, c.a);
    }

    @Override // com.huami.nfc.watch.unionpay.api.WatchUnionpayWebApi
    @NotNull
    public PayResponse<String> getTsmDownloadUrl(@NotNull String appName) {
        return PayResponseExtensionsKt.logcat(this.webApi.getTsmDownloadUrl(appName), ErrorCodeConstant.NFC_UNIONPAY_GET_TSM_URL, d.a);
    }
}
