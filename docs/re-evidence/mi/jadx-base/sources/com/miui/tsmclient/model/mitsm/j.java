package com.miui.tsmclient.model.mitsm;

import android.text.TextUtils;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.seitsm.TsmRpcModels;

/* JADX INFO: loaded from: classes6.dex */
public enum j {
    ISSUE(k.a.INSTALL, TsmRpcModels.SeOperationType.INSTALL, TSMAuthContants.URL_PULL_BUS_CARD_PERSO_DATA, "pullBusCardIssue"),
    TRANSFER_IN(k.a.TRANSFER_IN, TsmRpcModels.SeOperationType.SHIFT_IN, TSMAuthContants.URL_PULL_BUS_CARD_TRANSFER_IN_DATA, "pullBusCardTransferIn"),
    TRANSFER_OUT(k.a.TRANSFER_OUT, TsmRpcModels.SeOperationType.SHIFT_OUT, TSMAuthContants.URL_PULL_BUS_CARD_TRANSFER_OUT_DATA, "pullBusCardTransferOut"),
    RECHARGE(k.a.RECHARGE, TsmRpcModels.SeOperationType.TOPUP, TSMAuthContants.URL_PULL_BUS_CARD_TOPUP_DATA, "pullBusCardTopUp"),
    OUT_ISSUE(k.a.OUT_INSTALL, TsmRpcModels.SeOperationType.OUT_INSTALL, TSMAuthContants.URL_PULL_BUS_CARD_PERSO_DATA, "pullBusCardOutInstall"),
    OUT_RECHARGE(k.a.OUT_RECHARGE, TsmRpcModels.SeOperationType.OUT_TOPUP, TSMAuthContants.URL_PULL_BUS_CARD_TOPUP_DATA, "pullBusCardOutTopUp"),
    OUT_RETURN(k.a.OUT_RETURN, TsmRpcModels.SeOperationType.OUT_RETURN, TSMAuthContants.URL_PULL_BUS_CARD_RETURN_DATA, "pullBusCardOutReturn"),
    OUT_EXECUTE(k.a.OUT_EXECUTE, TsmRpcModels.SeOperationType.OUT_EXEC_CMDS, TSMAuthContants.URL_PULL_BUS_CARD_EXEC_CMDS_DATA, "pullBusCardExecCmds");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k.a f10387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TsmRpcModels.SeOperationType f10388b;
    public String c;
    public String d;

    j(k.a aVar, TsmRpcModels.SeOperationType seOperationType, String str, String str2) {
        this.f10387a = aVar;
        this.f10388b = seOperationType;
        this.c = str;
        this.d = str2;
    }

    public k.a b() {
        return this.f10387a;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.c;
    }

    public TsmRpcModels.SeOperationType e() {
        return this.f10388b;
    }

    public static j a(String str) {
        for (j jVar : values()) {
            if (TextUtils.equals(jVar.e().name(), str)) {
                return jVar;
            }
        }
        return null;
    }
}
