package com.huami.nfc.web;

import com.google.gson.Gson;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.web.entity.ApduScript;
import com.huami.nfc.web.entity.Command;
import com.huami.nfc.web.entity.RequestCommand;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/nfc/web/InitRequestTaskImpl;", "Lcom/huami/nfc/web/InitRequestTask;", "", "", "", SportAnalytics.ParamValue.MapButtonType.MAP, "Lcom/huami/nfc/base/PayResponse;", "apply", "Lcom/huami/nfc/web/InitRequestApi;", "a", "Lcom/huami/nfc/web/InitRequestApi;", "api", "Lcom/huami/nfc/web/IApduScript;", "b", "Lcom/huami/nfc/web/IApduScript;", "apduScript", "<init>", "(Lcom/huami/nfc/web/InitRequestApi;Lcom/huami/nfc/web/IApduScript;)V", "web_release"}, k = 1, mv = {1, 5, 1})
public final class InitRequestTaskImpl implements InitRequestTask {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InitRequestApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IApduScript apduScript;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ Ref.ObjectRef<ApduScript> a;
        public final /* synthetic */ Command b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef<ApduScript> objectRef, Command command) {
            super(0);
            this.a = objectRef;
            this.b = command;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "TSM下发 " + this.a.element.getCommands().size() + " 条APDU指令，执行到第 " + this.b.getIndex() + " 条时出错，与期望结果不符，如下：";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Object> {
        public final /* synthetic */ Command a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Command command, String str) {
            super(0);
            this.a = command;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "发送 = " + this.a.getCommand() + ", 实际返回 = " + this.b + ", 期望返回 = " + ((Object) this.a.getChecker());
        }
    }

    public InitRequestTaskImpl(@NotNull InitRequestApi initRequestApi, @NotNull IApduScript iApduScript) {
        this.api = initRequestApi;
        this.apduScript = iApduScript;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    @Override // com.huami.nfc.web.InitRequestTask
    @NotNull
    public PayResponse<String> apply(@NotNull Map<String, Object> map) {
        PayResponse<ApduScript> payResponseInitApdu = this.api.initApdu(map);
        if (!payResponseInitApdu.isSuccessful() || payResponseInitApdu.getData() == null) {
            return new PayResponse<>(payResponseInitApdu.getCode(), payResponseInitApdu.getMessage(), null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? data = payResponseInitApdu.getData();
        objectRef.element = data;
        Object session = ((ApduScript) data).getSession();
        ArrayList arrayList = new ArrayList();
        String voucherCode = null;
        while (!Intrinsics.areEqual(((ApduScript) objectRef.element).getNextStep(), "EOF")) {
            boolean z = true;
            boolean zMatches = true;
            for (Command command : ((ApduScript) objectRef.element).getCommands()) {
                String strExecuteApdu = this.apduScript.executeApdu(command.getCommand());
                arrayList.add(new Command(command.getIndex(), command.getCommand(), command.getChecker(), strExecuteApdu));
                String checker = command.getChecker();
                if (!(checker == null || m.isBlank(checker))) {
                    zMatches = Pattern.matches(command.getChecker(), StringsKt___StringsKt.takeLast(strExecuteApdu, 4));
                }
                if (!zMatches) {
                    Logcat logcat = Logcat.INSTANCE;
                    LogcatKt.warn$default(logcat, null, new a(objectRef, command), 1, null);
                    LogcatKt.warn$default(logcat, null, new b(command, strExecuteApdu), 1, null);
                    break;
                }
            }
            ApduScript data2 = payResponseInitApdu.getData();
            String aid = data2 == null ? null : data2.getAid();
            if (!(aid == null || aid.length() == 0)) {
                map.put("aid", aid);
            }
            ApduScript data3 = payResponseInitApdu.getData();
            String bizSerialNo = data3 == null ? null : data3.getBizSerialNo();
            if (bizSerialNo != null && bizSerialNo.length() != 0) {
                z = false;
            }
            if (!z) {
                map.put("biz_serial_no", bizSerialNo);
            }
            map.put(com.google.firebase.crashlytics.internal.settings.b.c, session);
            map.put("current_step", ((ApduScript) objectRef.element).getNextStep());
            map.put("command_results", new JSONObject(new Gson().toJson(new RequestCommand(zMatches, arrayList))));
            payResponseInitApdu = this.api.requestApdu(map);
            if (!payResponseInitApdu.isSuccessful() || payResponseInitApdu.getData() == null) {
                break;
            }
            ?? data4 = payResponseInitApdu.getData();
            objectRef.element = data4;
            voucherCode = ((ApduScript) data4).getVoucherCode();
            session = ((ApduScript) objectRef.element).getSession();
            arrayList.clear();
        }
        PayResponse<String> payResponse = new PayResponse<>(payResponseInitApdu.getCode(), payResponseInitApdu.getMessage(), session);
        payResponse.setVoucherCode(voucherCode);
        return payResponse;
    }
}
