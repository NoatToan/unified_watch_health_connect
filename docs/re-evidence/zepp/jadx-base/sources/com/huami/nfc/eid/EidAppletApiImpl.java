package com.huami.nfc.eid;

import com.facebook.share.internal.ShareConstants;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.bus.ConstantKt;
import com.huami.nfc.eid.api.EidAppletApi;
import com.huami.nfc.web.InitRequestTask;
import com.huami.nfc.web.http.HttpComponent;
import com.huami.nfc.web.http.HttpEngine;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/nfc/eid/EidAppletApiImpl;", "Lcom/huami/nfc/eid/api/EidAppletApi;", "Lcom/huami/nfc/web/http/HttpComponent;", "", "", "", "a", "bizSerialNumber", "Lcom/huami/nfc/base/PayResponse;", "", "deleteEid", "issueEid", "Lcom/huami/nfc/web/InitRequestTask;", "Lcom/huami/nfc/web/InitRequestTask;", "task", "<init>", "(Lcom/huami/nfc/web/InitRequestTask;)V", "nfc-eid_release"}, k = 1, mv = {1, 5, 1})
public final class EidAppletApiImpl implements EidAppletApi, HttpComponent {

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

    public EidAppletApiImpl(@NotNull InitRequestTask initRequestTask) {
        this.task = initRequestTask;
    }

    private final Map<String, Object> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ConstantKt.KEY_APP_CODE, ConsatntKt.APP_CODE_EID);
        linkedHashMap.put("product_sub_type", "1");
        return linkedHashMap;
    }

    @Override // com.huami.nfc.eid.api.EidAppletApi
    @NotNull
    public PayResponse<Unit> deleteEid(@NotNull String bizSerialNumber) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(a());
        linkedHashMap.put("biz_serial_no", bizSerialNumber);
        linkedHashMap.put(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "delete");
        return PayResponseKt.map(this.task.apply(linkedHashMap), a.a);
    }

    @Override // com.huami.nfc.web.http.HttpComponent
    @NotNull
    public HttpEngine getEngine() {
        return HttpComponent.DefaultImpls.getEngine(this);
    }

    @Override // com.huami.nfc.eid.api.EidAppletApi
    @NotNull
    public PayResponse<Unit> issueEid(@NotNull String bizSerialNumber) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(a());
        linkedHashMap.put(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "issue");
        linkedHashMap.put("biz_serial_no", bizSerialNumber);
        return PayResponseKt.map(this.task.apply(linkedHashMap), b.a);
    }
}
