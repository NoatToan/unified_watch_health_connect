package com.huawei.hms.iap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.iap.entity.ConsumeOwnedPurchaseReq;
import com.huawei.hms.iap.entity.ConsumeOwnedPurchaseResult;
import com.huawei.hms.iap.entity.IsEnvReadyReq;
import com.huawei.hms.iap.entity.IsEnvReadyResult;
import com.huawei.hms.iap.entity.IsSandboxActivatedReq;
import com.huawei.hms.iap.entity.IsSandboxActivatedResult;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.huawei.hms.iap.entity.PurchaseIntentReq;
import com.huawei.hms.iap.entity.PurchaseIntentResult;
import com.huawei.hms.iap.entity.PurchaseIntentWithPriceReq;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.huawei.hms.iap.entity.RedeemCodeResultInfo;
import com.huawei.hms.iap.entity.ScanRedeemCodeResult;
import com.huawei.hms.iap.entity.StartIapActivityReq;
import com.huawei.hms.iap.entity.StartIapActivityResult;
import com.huawei.hms.iap.task.IapFailureTask;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class d implements IapClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f13573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f13575c;
    private String d;
    private f e;
    private e f;

    @Override // com.huawei.hms.iap.IapClient
    public Task<StartIapActivityResult> startIapActivity(StartIapActivityReq startIapActivityReq) {
        Checker.checkNonNull(startIapActivityReq);
        f fVarA = a();
        return fVarA != null ? fVarA.startIapActivity(startIapActivityReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public Task<ScanRedeemCodeResult> scanRedeemCode() {
        f fVarA = a();
        return fVarA != null ? fVarA.scanRedeemCode() : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public RedeemCodeResultInfo parseRedeemCodeResultInfoFromIntent(Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        f fVarA = a();
        return fVarA != null ? fVarA.parseRedeemCodeResultInfoFromIntent(intent) : new RedeemCodeResultInfo();
    }

    @Override // com.huawei.hms.iap.IapClient
    public PurchaseResultInfo parsePurchaseResultInfoFromIntent(Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        if (!com.huawei.hms.iap.util.c.a(intent, "isFullSdk", false)) {
            f fVarA = a();
            return fVarA != null ? fVarA.parsePurchaseResultInfoFromIntent(intent) : new PurchaseResultInfo();
        }
        HMSLog.i("IapClientEntryImpl", "parsePurchaseResultInfoFromIntent with Full SDK branch.");
        e eVarC = c();
        return eVarC != null ? eVarC.parsePurchaseResultInfoFromIntent(intent) : new PurchaseResultInfo();
    }

    @Override // com.huawei.hms.iap.IapClient
    public Task<ProductInfoResult> obtainProductInfo(ProductInfoReq productInfoReq) {
        Checker.checkNonNull(productInfoReq);
        Context context = this.f13573a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "obtainProductInfo context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, productInfoReq.getReservedInfor())) {
            f fVarA = a();
            return fVarA != null ? fVarA.obtainProductInfo(productInfoReq) : new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "obtainProductInfo with Full SDK branch.");
        e eVarC = c();
        return eVarC != null ? eVarC.obtainProductInfo(productInfoReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public Task<OwnedPurchasesResult> obtainOwnedPurchases(OwnedPurchasesReq ownedPurchasesReq) {
        Checker.checkNonNull(ownedPurchasesReq);
        Context context = this.f13573a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "obtainOwnedPurchases context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, ownedPurchasesReq.getReservedInfor())) {
            f fVarA = a();
            return fVarA != null ? fVarA.obtainOwnedPurchases(ownedPurchasesReq) : new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "obtainOwnedPurchases with Full SDK branch.");
        e eVarC = c();
        return eVarC != null ? eVarC.obtainOwnedPurchases(ownedPurchasesReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public Task<OwnedPurchasesResult> obtainOwnedPurchaseRecord(OwnedPurchasesReq ownedPurchasesReq) {
        Checker.checkNonNull(ownedPurchasesReq);
        Context context = this.f13573a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "obtainOwnedPurchaseRecord context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, ownedPurchasesReq.getReservedInfor())) {
            f fVarA = a();
            return fVarA != null ? fVarA.obtainOwnedPurchaseRecord(ownedPurchasesReq) : new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "obtainOwnedPurchaseRecord with Full SDK branch.");
        e eVarC = c();
        return eVarC != null ? eVarC.obtainOwnedPurchaseRecord(ownedPurchasesReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public Task<IsSandboxActivatedResult> isSandboxActivated(IsSandboxActivatedReq isSandboxActivatedReq) {
        Checker.checkNonNull(isSandboxActivatedReq);
        f fVarA = a();
        return fVarA != null ? fVarA.isSandboxActivated(isSandboxActivatedReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public Task<IsEnvReadyResult> isEnvReady(boolean z) {
        f fVarA = a();
        return fVarA != null ? fVarA.isEnvReady(z) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public Task<IsEnvReadyResult> isEnvReady(IsEnvReadyReq isEnvReadyReq) {
        Checker.checkNonNull(isEnvReadyReq);
        Context context = this.f13573a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "isEnvReady context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, isEnvReadyReq.getReservedInfor())) {
            return new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "isEnvReady with Full SDK branch.");
        e eVarC = c();
        return eVarC != null ? eVarC.isEnvReady(isEnvReadyReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public Task<IsEnvReadyResult> isEnvReady() {
        return isEnvReady(false);
    }

    @Override // com.huawei.hms.iap.IapClient
    public void enablePendingPurchase() {
        f fVarA = a();
        if (fVarA != null) {
            fVarA.enablePendingPurchase();
        }
    }

    @Override // com.huawei.hms.iap.IapClient
    public Task<PurchaseIntentResult> createPurchaseIntentWithPrice(PurchaseIntentWithPriceReq purchaseIntentWithPriceReq) {
        f fVarA = a();
        return fVarA != null ? fVarA.createPurchaseIntentWithPrice(purchaseIntentWithPriceReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public Task<PurchaseIntentResult> createPurchaseIntent(PurchaseIntentReq purchaseIntentReq) {
        Checker.checkNonNull(purchaseIntentReq);
        Context context = this.f13573a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "createPurchaseIntent context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, purchaseIntentReq.getReservedInfor())) {
            f fVarA = a();
            return fVarA != null ? fVarA.createPurchaseIntent(purchaseIntentReq) : new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "createPurchaseIntent with Full SDK branch.");
        e eVarC = c();
        return eVarC != null ? eVarC.createPurchaseIntent(purchaseIntentReq) : new IapFailureTask();
    }

    @Override // com.huawei.hms.iap.IapClient
    public Task<ConsumeOwnedPurchaseResult> consumeOwnedPurchase(ConsumeOwnedPurchaseReq consumeOwnedPurchaseReq) {
        Checker.checkNonNull(consumeOwnedPurchaseReq);
        Context context = this.f13573a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "consumeOwnedPurchase context is null.");
            return new IapFailureTask();
        }
        if (!com.huawei.hms.iap.util.a.a(context, consumeOwnedPurchaseReq.getReservedInfor())) {
            f fVarA = a();
            return fVarA != null ? fVarA.consumeOwnedPurchase(consumeOwnedPurchaseReq) : new IapFailureTask();
        }
        HMSLog.i("IapClientEntryImpl", "consumeOwnedPurchase with Full SDK branch.");
        e eVarC = c();
        return eVarC != null ? eVarC.consumeOwnedPurchase(consumeOwnedPurchaseReq) : new IapFailureTask();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    private e c() {
        byte b2;
        e eVar;
        e eVar2 = this.f;
        if (eVar2 != null) {
            return eVar2;
        }
        Context context = this.f13573a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "getIapClientFullImpl context is null.");
            return null;
        }
        String strB = b();
        strB.hashCode();
        int iHashCode = strB.hashCode();
        if (iHashCode != -1528914616) {
            if (iHashCode != -463465798) {
                if (iHashCode == 545923237 && strB.equals("CONSIGNMENT_MODE")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (strB.equals("GENERAL_MODE")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (strB.equals("MCP_MODE")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 != 0) {
            if (b2 == 1) {
                eVar = new e(context);
            } else if (b2 == 2) {
                eVar = new e(context, this.d);
            }
            this.f = eVar;
        } else {
            this.f = new e(context, TextUtils.isEmpty(this.f13574b) ? this.d : this.f13574b);
        }
        return this.f;
    }

    private String b() {
        if (this.f13575c) {
            return !TextUtils.isEmpty(this.d) ? "CONSIGNMENT_MODE" : "GENERAL_MODE";
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f13574b);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.d);
        if (zIsEmpty && zIsEmpty2) {
            return "GENERAL_MODE";
        }
        return (zIsEmpty || zIsEmpty2) ? "MCP_MODE" : "MCP_AND_CONSIGNMENT_MODE";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    private f a() {
        byte b2;
        f fVar;
        f fVar2 = this.e;
        if (fVar2 != null) {
            return fVar2;
        }
        Context context = this.f13573a.get();
        if (context == null) {
            HMSLog.e("IapClientEntryImpl", "getIapClientImpl context is null.");
            return null;
        }
        String strB = b();
        strB.hashCode();
        switch (strB) {
            case "MCP_MODE":
                b2 = 0;
                break;
            case "MCP_AND_CONSIGNMENT_MODE":
                b2 = 1;
                break;
            case "GENERAL_MODE":
                b2 = 2;
                break;
            case "CONSIGNMENT_MODE":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 != 0) {
            if (b2 == 1) {
                fVar = context instanceof Activity ? new f((Activity) context, this.f13574b, this.d) : new f(context, this.f13574b, this.d);
            } else if (b2 == 2) {
                fVar = context instanceof Activity ? new f((Activity) context) : new f(context);
            } else if (b2 == 3) {
                fVar = context instanceof Activity ? new f((Activity) context, this.d, this.f13575c) : new f(context, this.d, this.f13575c);
            }
            this.e = fVar;
        } else {
            String str = TextUtils.isEmpty(this.f13574b) ? this.d : this.f13574b;
            this.e = context instanceof Activity ? new f((Activity) context, str) : new f(context, str);
        }
        return this.e;
    }

    d(Context context, String str, boolean z) {
        this.f13573a = new WeakReference<>(context);
        this.d = str;
        this.f13575c = z;
    }

    d(Context context, String str, String str2) {
        this.f13573a = new WeakReference<>(context);
        this.f13574b = str;
        this.d = str2;
    }

    d(Context context, String str) {
        this.f13573a = new WeakReference<>(context);
        this.f13574b = str;
    }

    d(Context context) {
        this.f13573a = new WeakReference<>(context);
    }

    d(Activity activity, String str, boolean z) {
        this.f13573a = new WeakReference<>(activity);
        this.d = str;
        this.f13575c = z;
    }

    d(Activity activity, String str, String str2) {
        this.f13573a = new WeakReference<>(activity);
        this.f13574b = str;
        this.d = str2;
    }

    d(Activity activity, String str) {
        this.f13573a = new WeakReference<>(activity);
        this.f13574b = str;
    }

    d(Activity activity) {
        this.f13573a = new WeakReference<>(activity);
    }
}
