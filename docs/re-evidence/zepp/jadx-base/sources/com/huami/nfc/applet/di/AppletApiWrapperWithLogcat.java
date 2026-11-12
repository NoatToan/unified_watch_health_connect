package com.huami.nfc.applet.di;

import com.huami.nfc.applet.AppletState;
import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.applet.api.SeAppletApi;
import com.huami.nfc.base.ErrorCodeConstant;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016J\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00110\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0016J\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0016J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00110\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0016\u0010 \u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/nfc/applet/di/AppletApiWrapperWithLogcat;", "Lcom/huami/nfc/applet/api/SeAppletApi;", "Lcom/huami/nfc/base/PayResponse;", "", "getCplc", "appCode", "", "getBalance", "", "activateCard", "aid", "setDefaultCard", "setDefaultCardBySearchSe", "setDefaultCardBySeResponse", "deactivateCard", "Lcom/huami/nfc/applet/AppletState;", "getAppletState", "", "aids", "getAppletsState", "aidList", "getDefaultCard", "getDefaultCardAid", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "Lcom/huami/nfc/applet/TransEntity;", "getTransRecord", "", "isInstalled", "getLingNanTongCityCode", "a", "Lcom/huami/nfc/applet/api/SeAppletApi;", "api", "<init>", "(Lcom/huami/nfc/applet/api/SeAppletApi;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class AppletApiWrapperWithLogcat implements SeAppletApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SeAppletApi api;

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
            return "SE设置默认卡[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "SE去激活默认卡[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/applet/AppletState;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends AppletState>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<AppletState> payResponse) {
            return "SE查询Applet状态[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/applet/AppletState;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends List<AppletState>>, String> {
        public final /* synthetic */ List<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<String> list) {
            super(1);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<AppletState>> payResponse) {
            return "SE查询Applet状态[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PayResponse<? extends Integer>, String> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Integer> payResponse) {
            return "SE查询余额";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/applet/CardInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<PayResponse<? extends CardInfo>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends CardInfo> payResponse) {
            return "SE查询交通卡卡详情[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "SE读取CPLC";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/applet/AppletState;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<PayResponse<? extends AppletState>, String> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<AppletState> payResponse) {
            return "SE获取默认卡";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final i a = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "SE获取默认卡";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final j a = new j();

        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "SE查询区域代码";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/applet/TransEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<PayResponse<? extends List<TransEntity>>, String> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<TransEntity>> payResponse) {
            return "SE获取交易记录";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<PayResponse<? extends Boolean>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Boolean> payResponse) {
            return "SE检查公交卡是否存在[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "SE设置默认卡[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "SE设置默认卡[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "SE设置默认卡[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    public AppletApiWrapperWithLogcat(@NotNull SeAppletApi seAppletApi) {
        this.api = seAppletApi;
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> activateCard(@NotNull String appCode) {
        return PayResponseExtensionsKt.logcat(this.api.activateCard(appCode), ErrorCodeConstant.SE_SET_DEFAULT_CARD, new a(appCode));
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> deactivateCard(@NotNull String aid) {
        return PayResponseExtensionsKt.logcat(this.api.deactivateCard(aid), ErrorCodeConstant.SE_DEACTIVATE_CARD, new b(aid));
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<AppletState> getAppletState(@NotNull String aid) {
        return PayResponseExtensionsKt.logcat(this.api.getAppletState(aid), ErrorCodeConstant.SE_GET_APPLET_STATE, new c(aid));
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<List<AppletState>> getAppletsState(@NotNull List<String> aids) {
        return PayResponseExtensionsKt.logcat(this.api.getAppletsState(aids), ErrorCodeConstant.SE_GET_APPLET_STATE, new d(aids));
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Integer> getBalance(@NotNull String appCode) {
        return PayResponseExtensionsKt.logcat(this.api.getBalance(appCode), ErrorCodeConstant.SE_GET_BALANCE, e.a);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<CardInfo> getCardInfo(@NotNull String appCode) {
        return PayResponseExtensionsKt.logcat(this.api.getCardInfo(appCode), ErrorCodeConstant.SE_GET_CARD_INFO, new f(appCode));
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<String> getCplc() {
        return PayResponseExtensionsKt.logcat(this.api.getCplc(), ErrorCodeConstant.SE_GET_CPLC, g.a);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<AppletState> getDefaultCard(@NotNull List<String> aidList) {
        return PayResponseExtensionsKt.logcat(this.api.getDefaultCard(aidList), ErrorCodeConstant.SE_GET_DEFAULT_CARD, h.a);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<String> getDefaultCardAid(@NotNull List<String> aidList) {
        return PayResponseExtensionsKt.logcat(this.api.getDefaultCardAid(aidList), ErrorCodeConstant.SE_GET_DEFAULT_CARD, i.a);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<String> getLingNanTongCityCode() {
        return PayResponseExtensionsKt.logcat(this.api.getLingNanTongCityCode(), ErrorCodeConstant.SE_GET_LNT_CITY_CODE, j.a);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<List<TransEntity>> getTransRecord(@NotNull String appCode) {
        return PayResponseExtensionsKt.logcat(this.api.getTransRecord(appCode), ErrorCodeConstant.SE_GET_TRANS_RECORD, k.a);
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Boolean> isInstalled(@NotNull String appCode) {
        return PayResponseExtensionsKt.logcat(this.api.isInstalled(appCode), ErrorCodeConstant.SE_IS_INSTALLED, new l(appCode));
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> setDefaultCard(@NotNull String aid) {
        return PayResponseExtensionsKt.logcat(this.api.setDefaultCard(aid), ErrorCodeConstant.SE_SET_DEFAULT_CARD, new m(aid));
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> setDefaultCardBySeResponse(@NotNull String aid) {
        return PayResponseExtensionsKt.logcat(this.api.setDefaultCardBySeResponse(aid), ErrorCodeConstant.SE_SET_DEFAULT_CARD, new n(aid));
    }

    @Override // com.huami.nfc.applet.api.SeAppletApi
    @NotNull
    public PayResponse<Unit> setDefaultCardBySearchSe(@NotNull String aid) {
        return PayResponseExtensionsKt.logcat(this.api.setDefaultCardBySearchSe(aid), ErrorCodeConstant.SE_SET_DEFAULT_CARD, new o(aid));
    }
}
