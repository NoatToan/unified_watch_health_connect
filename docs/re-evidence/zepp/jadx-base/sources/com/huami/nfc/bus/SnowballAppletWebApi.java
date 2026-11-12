package com.huami.nfc.bus;

import com.facebook.share.internal.ShareConstants;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.bus.api.ISnowballAppletWebApi;
import com.huami.nfc.web.InitRequestTask;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J8\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/nfc/bus/SnowballAppletWebApi;", "Lcom/huami/nfc/bus/api/ISnowballAppletWebApi;", "", "appCode", "deviceId", "orderNum", "Lcom/huami/nfc/bus/ExtraInfo;", "extra", "actionType", "Lcom/huami/nfc/base/PayResponse;", "", "issueCard", "charge", "deleteApp", "safeDeleteApp", "shiftOutCard", "shiftInCard", "snbTicket", "returnCard", "Lcom/huami/nfc/web/InitRequestTask;", "a", "Lcom/huami/nfc/web/InitRequestTask;", "task", "<init>", "(Lcom/huami/nfc/web/InitRequestTask;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final class SnowballAppletWebApi implements ISnowballAppletWebApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InitRequestTask task;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    public SnowballAppletWebApi(@NotNull InitRequestTask initRequestTask) {
        this.task = initRequestTask;
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> charge(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull String actionType, @Nullable ExtraInfo extra) {
        Map<String, Object> mapMutableMapOf = r.mutableMapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, actionType), TuplesKt.to("deviceId", deviceId), TuplesKt.to("snb_order_no", orderNum));
        if (extra != null) {
            mapMutableMapOf.put("extra_info", extra.getExtraInfo());
        }
        return PayResponseKt.map(this.task.apply(mapMutableMapOf), a.a);
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> deleteApp(@NotNull String appCode, @NotNull String deviceId) {
        return PayResponseKt.map(this.task.apply(r.mutableMapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, ApduAction.DeleteApp.getValue()), TuplesKt.to("deviceId", deviceId))), b.a);
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> issueCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull ExtraInfo extra, @NotNull String actionType) {
        InitRequestTask initRequestTask = this.task;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode);
        if (Intrinsics.areEqual(com.huami.nfc.applet.ConstantKt.APP_CODE_SHANG_HAI, appCode)) {
            actionType = ApduAction.IssueAndCharge.getValue();
        }
        pairArr[1] = TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, actionType);
        pairArr[2] = TuplesKt.to("deviceId", deviceId);
        pairArr[3] = TuplesKt.to("snb_order_no", orderNum);
        pairArr[4] = TuplesKt.to("extra_info", extra.getExtraInfo());
        return PayResponseKt.map(initRequestTask.apply(r.mutableMapOf(pairArr)), c.a);
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> returnCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String snbTicket) {
        return PayResponseKt.map(this.task.apply(r.mutableMapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, ApduAction.Return.getValue()), TuplesKt.to("deviceId", deviceId), TuplesKt.to("snb_ticket", snbTicket))), d.a);
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> safeDeleteApp(@NotNull String appCode, @NotNull String deviceId) {
        return PayResponseKt.map(this.task.apply(r.mutableMapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, ApduAction.SafeDeleteApp.getValue()), TuplesKt.to("deviceId", deviceId))), e.a);
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> shiftInCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull ExtraInfo extra) {
        return PayResponseKt.map(this.task.apply(r.mutableMapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, ApduAction.ShiftInCard.getValue()), TuplesKt.to("deviceId", deviceId), TuplesKt.to("snb_order_no", orderNum), TuplesKt.to("extra_info", extra.getExtraInfo()))), f.a);
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> shiftOutCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull ExtraInfo extra) {
        return PayResponseKt.map(this.task.apply(r.mutableMapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, ApduAction.ShiftOutCard.getValue()), TuplesKt.to("deviceId", deviceId), TuplesKt.to("snb_order_no", orderNum), TuplesKt.to("extra_info", extra.getExtraInfo()))), g.a);
    }
}
