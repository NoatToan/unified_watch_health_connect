package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import com.android.billingclient.BuildConfig;
import com.google.android.gms.internal.play_billing.zza;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class a extends BillingClient {
    private volatile int a;
    private final String b;
    private final Handler c;
    private volatile q d;
    private Context e;
    private Context f;
    private volatile com.google.android.gms.internal.play_billing.zzd g;
    private volatile f h;
    private boolean i;
    private boolean j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private ExecutorService u;

    private a(Activity activity, boolean z, String str) {
        this(activity.getApplicationContext(), z, new zzah(), str, null);
    }

    private void a(Context context, PurchasesUpdatedListener purchasesUpdatedListener, boolean z) {
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        this.d = new q(applicationContext, purchasesUpdatedListener);
        this.e = context;
        this.t = z;
    }

    private int b(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void c(Activity activity, PriceChangeFlowParams priceChangeFlowParams, long j) {
        launchPriceChangeConfirmationFlow(activity, priceChangeFlowParams, new zzah(j));
    }

    private void d(long j) {
        ServiceInfo serviceInfo;
        zzah zzahVar = new zzah(j);
        if (isReady()) {
            zza.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            zzahVar.onBillingSetupFinished(j.p);
            return;
        }
        if (this.a == 1) {
            zza.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            zzahVar.onBillingSetupFinished(j.d);
            return;
        }
        if (this.a == 3) {
            zza.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            zzahVar.onBillingSetupFinished(j.q);
            return;
        }
        this.a = 1;
        this.d.d();
        zza.zzj("BillingClient", "Starting in-app billing setup.");
        this.h = new f(this, zzahVar, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null) {
                zza.zzk("BillingClient", "The device doesn't have valid Play Store.");
            } else {
                ComponentName componentName = new ComponentName(str, str2);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                intent2.putExtra("playBillingLibraryVersion", this.b);
                if (this.f.bindService(intent2, this.h, 1)) {
                    zza.zzj("BillingClient", "Service was bonded successfully.");
                    return;
                }
                zza.zzk("BillingClient", "Connection to Billing service is blocked.");
            }
        }
        this.a = 0;
        zza.zzj("BillingClient", "Billing service unavailable on device.");
        zzahVar.onBillingSetupFinished(j.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler h() {
        return Looper.myLooper() == null ? this.c : new Handler(Looper.myLooper());
    }

    private final BillingResult i(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.c.post(new Runnable() { // from class: com.android.billingclient.api.zzq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.F(billingResult);
            }
        });
        return billingResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingResult j() {
        return (this.a == 0 || this.a == 3) ? j.q : j.l;
    }

    private final BillingResult k(final String str) {
        try {
            return ((Integer) l(new Callable() { // from class: com.android.billingclient.api.zzn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.A(str);
                }
            }, 5000L, null, h()).get(5000L, TimeUnit.MILLISECONDS)).intValue() == 0 ? j.p : j.i;
        } catch (Exception unused) {
            zza.zzk("BillingClient", "Exception while checking if billing is supported; try to reconnect");
            return j.q;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public final <T> Future<T> l(Callable<T> callable, long j, @Nullable final Runnable runnable, Handler handler) {
        long j2 = (long) (j * 0.95d);
        if (this.u == null) {
            this.u = Executors.newFixedThreadPool(zza.zza, new e(this));
        }
        try {
            final Future<T> futureSubmit = this.u.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzw
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    zza.zzk("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, j2);
            return futureSubmit;
        } catch (Exception e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 28);
            sb.append("Async task throws exception ");
            sb.append(strValueOf);
            zza.zzk("BillingClient", sb.toString());
            return null;
        }
    }

    private final void m(final BillingResult billingResult, final PriceChangeConfirmationListener priceChangeConfirmationListener) {
        if (Thread.interrupted()) {
            return;
        }
        this.c.post(new Runnable() { // from class: com.android.billingclient.api.zzs
            @Override // java.lang.Runnable
            public final void run() {
                priceChangeConfirmationListener.onPriceChangeConfirmationResult(billingResult);
            }
        });
    }

    public static /* synthetic */ g v(a aVar, String str) {
        String strValueOf = String.valueOf(str);
        zza.zzj("BillingClient", strValueOf.length() != 0 ? "Querying purchase history, item type: ".concat(strValueOf) : new String("Querying purchase history, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzf = zza.zzf(aVar.n, aVar.t, aVar.b);
        String string = null;
        while (aVar.l) {
            try {
                Bundle bundleZzh = aVar.g.zzh(6, aVar.f.getPackageName(), str, string, bundleZzf);
                BillingResult billingResultA = l.a(bundleZzh, "BillingClient", "getPurchaseHistory()");
                if (billingResultA != j.p) {
                    return new g(billingResultA, null);
                }
                ArrayList<String> stringArrayList = bundleZzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str2 = stringArrayList2.get(i);
                    String str3 = stringArrayList3.get(i);
                    String strValueOf2 = String.valueOf(stringArrayList.get(i));
                    zza.zzj("BillingClient", strValueOf2.length() != 0 ? "Purchase record found for sku : ".concat(strValueOf2) : new String("Purchase record found for sku : "));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                            zza.zzk("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e) {
                        String strValueOf3 = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(strValueOf3.length() + 48);
                        sb.append("Got an exception trying to decode the purchase: ");
                        sb.append(strValueOf3);
                        zza.zzk("BillingClient", sb.toString());
                        return new g(j.l, null);
                    }
                }
                string = bundleZzh.getString("INAPP_CONTINUATION_TOKEN");
                String strValueOf4 = String.valueOf(string);
                zza.zzj("BillingClient", strValueOf4.length() != 0 ? "Continuation token: ".concat(strValueOf4) : new String("Continuation token: "));
                if (TextUtils.isEmpty(string)) {
                    return new g(j.p, arrayList);
                }
            } catch (RemoteException e2) {
                String strValueOf5 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(strValueOf5.length() + 64);
                sb2.append("Got exception trying to get purchase history: ");
                sb2.append(strValueOf5);
                sb2.append("; try to reconnect");
                zza.zzk("BillingClient", sb2.toString());
                return new g(j.q, null);
            }
        }
        zza.zzk("BillingClient", "getPurchaseHistory is not supported on current device");
        return new g(j.j, null);
    }

    public static /* synthetic */ Purchase.PurchasesResult x(a aVar, String str) {
        String strValueOf = String.valueOf(str);
        zza.zzj("BillingClient", strValueOf.length() != 0 ? "Querying owned items, item type: ".concat(strValueOf) : new String("Querying owned items, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzf = zza.zzf(aVar.n, aVar.t, aVar.b);
        String string = null;
        do {
            try {
                Bundle bundleZzj = aVar.n ? aVar.g.zzj(9, aVar.f.getPackageName(), str, string, bundleZzf) : aVar.g.zzi(3, aVar.f.getPackageName(), str, string);
                BillingResult billingResultA = l.a(bundleZzj, "BillingClient", "getPurchase()");
                if (billingResultA != j.p) {
                    return new Purchase.PurchasesResult(billingResultA, null);
                }
                ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str2 = stringArrayList2.get(i);
                    String str3 = stringArrayList3.get(i);
                    String strValueOf2 = String.valueOf(stringArrayList.get(i));
                    zza.zzj("BillingClient", strValueOf2.length() != 0 ? "Sku is owned: ".concat(strValueOf2) : new String("Sku is owned: "));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            zza.zzk("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        String strValueOf3 = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(strValueOf3.length() + 48);
                        sb.append("Got an exception trying to decode the purchase: ");
                        sb.append(strValueOf3);
                        zza.zzk("BillingClient", sb.toString());
                        return new Purchase.PurchasesResult(j.l, null);
                    }
                }
                string = bundleZzj.getString("INAPP_CONTINUATION_TOKEN");
                String strValueOf4 = String.valueOf(string);
                zza.zzj("BillingClient", strValueOf4.length() != 0 ? "Continuation token: ".concat(strValueOf4) : new String("Continuation token: "));
            } catch (Exception e2) {
                String strValueOf5 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(strValueOf5.length() + 57);
                sb2.append("Got exception trying to get purchases: ");
                sb2.append(strValueOf5);
                sb2.append("; try to reconnect");
                zza.zzk("BillingClient", sb2.toString());
                return new Purchase.PurchasesResult(j.q, null);
            }
        } while (!TextUtils.isEmpty(string));
        return new Purchase.PurchasesResult(j.p, arrayList);
    }

    public final /* synthetic */ Integer A(String str) throws Exception {
        com.google.android.gms.internal.play_billing.zzd zzdVar = this.g;
        String packageName = this.f.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putBoolean(BillingFlowParams.EXTRA_PARAM_KEY_VR, true);
        return Integer.valueOf(zzdVar.zzc(7, packageName, str, bundle));
    }

    public final /* synthetic */ Object B(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) throws Exception {
        try {
            Bundle bundleZzd = this.g.zzd(9, this.f.getPackageName(), acknowledgePurchaseParams.getPurchaseToken(), zza.zzb(acknowledgePurchaseParams, this.b));
            int iZza = zza.zza(bundleZzd, "BillingClient");
            String strZzh = zza.zzh(bundleZzd, "BillingClient");
            BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
            builderNewBuilder.setResponseCode(iZza);
            builderNewBuilder.setDebugMessage(strZzh);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(builderNewBuilder.build());
            return null;
        } catch (Exception e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 32);
            sb.append("Error acknowledge purchase; ex: ");
            sb.append(strValueOf);
            zza.zzk("BillingClient", sb.toString());
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(j.q);
            return null;
        }
    }

    public final /* synthetic */ Object C(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Exception {
        int iZza;
        String strZzh;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            String strValueOf = String.valueOf(purchaseToken);
            zza.zzj("BillingClient", strValueOf.length() != 0 ? "Consuming purchase with token: ".concat(strValueOf) : new String("Consuming purchase with token: "));
            if (this.n) {
                Bundle bundleZze = this.g.zze(9, this.f.getPackageName(), purchaseToken, zza.zzc(consumeParams, this.n, this.b));
                iZza = bundleZze.getInt("RESPONSE_CODE");
                strZzh = zza.zzh(bundleZze, "BillingClient");
            } else {
                iZza = this.g.zza(3, this.f.getPackageName(), purchaseToken);
                strZzh = "";
            }
            BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
            builderNewBuilder.setResponseCode(iZza);
            builderNewBuilder.setDebugMessage(strZzh);
            BillingResult billingResultBuild = builderNewBuilder.build();
            if (iZza == 0) {
                zza.zzj("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(billingResultBuild, purchaseToken);
                return null;
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Error consuming purchase with token. Response code: ");
            sb.append(iZza);
            zza.zzk("BillingClient", sb.toString());
            consumeResponseListener.onConsumeResponse(billingResultBuild, purchaseToken);
            return null;
        } catch (Exception e) {
            String strValueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 30);
            sb2.append("Error consuming purchase; ex: ");
            sb2.append(strValueOf2);
            zza.zzk("BillingClient", sb2.toString());
            consumeResponseListener.onConsumeResponse(j.q, purchaseToken);
            return null;
        }
    }

    public final /* synthetic */ Object D(String str, List list, String str2, SkuDetailsResponseListener skuDetailsResponseListener) throws Exception {
        String strZzh;
        int i;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (true) {
            strZzh = "Item is unavailable for purchase.";
            if (i2 >= size) {
                strZzh = "";
                i = 0;
                break;
            }
            int i3 = i2 + 20;
            ArrayList arrayList2 = new ArrayList(list.subList(i2, i3 > size ? size : i3));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(((zzaq) arrayList2.get(i4)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.b);
            try {
                Bundle bundleZzl = this.o ? this.g.zzl(10, this.f.getPackageName(), str, bundle, zza.zzd(this.k, this.t, this.b, null, arrayList2)) : this.g.zzk(3, this.f.getPackageName(), str, bundle);
                if (bundleZzl != null) {
                    if (bundleZzl.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            zza.zzk("BillingClient", "querySkuDetailsAsync got null response list");
                        } else {
                            for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                                try {
                                    SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i5));
                                    String strValueOf = String.valueOf(skuDetails);
                                    StringBuilder sb = new StringBuilder(strValueOf.length() + 17);
                                    sb.append("Got sku details: ");
                                    sb.append(strValueOf);
                                    zza.zzj("BillingClient", sb.toString());
                                    arrayList.add(skuDetails);
                                } catch (JSONException unused) {
                                    zza.zzk("BillingClient", "Got a JSON exception trying to decode SkuDetails.");
                                    strZzh = "Error trying to decode SkuDetails.";
                                    arrayList = null;
                                }
                            }
                            i2 = i3;
                        }
                    } else {
                        int iZza = zza.zza(bundleZzl, "BillingClient");
                        strZzh = zza.zzh(bundleZzl, "BillingClient");
                        if (iZza != 0) {
                            StringBuilder sb2 = new StringBuilder(50);
                            sb2.append("getSkuDetails() failed. Response code: ");
                            sb2.append(iZza);
                            zza.zzk("BillingClient", sb2.toString());
                            i = iZza;
                            break;
                        }
                        zza.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    }
                    i = 6;
                    break;
                }
                zza.zzk("BillingClient", "querySkuDetailsAsync got null sku details list");
                arrayList = null;
                i = 4;
                break;
            } catch (Exception e) {
                String strValueOf2 = String.valueOf(e);
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 63);
                sb3.append("querySkuDetailsAsync got a remote exception (try to reconnect).");
                sb3.append(strValueOf2);
                zza.zzk("BillingClient", sb3.toString());
                i = -1;
                strZzh = "Service connection is disconnected.";
                arrayList = null;
            }
        }
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i);
        builderNewBuilder.setDebugMessage(strZzh);
        skuDetailsResponseListener.onSkuDetailsResponse(builderNewBuilder.build(), arrayList);
        return null;
    }

    public final /* synthetic */ void F(BillingResult billingResult) {
        this.d.b().onPurchasesUpdated(billingResult, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(j.q);
            return;
        }
        if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            zza.zzk("BillingClient", "Please provide a valid purchase token.");
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(j.k);
        } else if (!this.n) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(j.b);
        } else if (l(new Callable() { // from class: com.android.billingclient.api.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.B(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzj
            @Override // java.lang.Runnable
            public final void run() {
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(j.r);
            }
        }, h()) == null) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(j());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            consumeResponseListener.onConsumeResponse(j.q, consumeParams.getPurchaseToken());
        } else if (l(new Callable() { // from class: com.android.billingclient.api.zzl
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.C(consumeParams, consumeResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzr
            @Override // java.lang.Runnable
            public final void run() {
                consumeResponseListener.onConsumeResponse(j.r, consumeParams.getPurchaseToken());
            }
        }, h()) == null) {
            consumeResponseListener.onConsumeResponse(j(), consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void endConnection() {
        try {
            this.e = null;
            this.d.c();
            if (this.h != null) {
                this.h.c();
            }
            if (this.h != null && this.g != null) {
                zza.zzj("BillingClient", "Unbinding from service.");
                this.f.unbindService(this.h);
                this.h = null;
            }
            this.g = null;
            ExecutorService executorService = this.u;
            if (executorService != null) {
                executorService.shutdownNow();
                this.u = null;
            }
        } catch (Exception e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 48);
            sb.append("There was an exception while ending connection: ");
            sb.append(strValueOf);
            zza.zzk("BillingClient", sb.toString());
        } finally {
            this.a = 3;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        return this.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult isFeatureSupported(String str) {
        if (!isReady()) {
            return j.q;
        }
        switch (str) {
            case "subscriptions":
                return this.i ? j.p : j.i;
            case "subscriptionsUpdate":
                return this.j ? j.p : j.i;
            case "inAppItemsOnVr":
                return k(BillingClient.SkuType.INAPP);
            case "subscriptionsOnVr":
                return k(BillingClient.SkuType.SUBS);
            case "priceChangeConfirmation":
                return this.m ? j.p : j.i;
            case "bbb":
                return this.p ? j.p : j.i;
            case "aaa":
                return this.r ? j.p : j.i;
            case "ddd":
                return this.q ? j.p : j.i;
            case "ccc":
            case "eee":
                return this.s ? j.p : j.i;
            default:
                zza.zzk("BillingClient", str.length() != 0 ? "Unsupported feature: ".concat(str) : new String("Unsupported feature: "));
                return j.v;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        return (this.a != 2 || this.g == null || this.h == null) ? false : true;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult launchBillingFlow(Activity activity, final BillingFlowParams billingFlowParams) {
        String str;
        Future futureL;
        boolean z;
        final int i;
        String strOptString;
        String str2 = "BUY_INTENT";
        if (!isReady()) {
            BillingResult billingResult = j.q;
            i(billingResult);
            return billingResult;
        }
        ArrayList<SkuDetails> arrayListZzj = billingFlowParams.zzj();
        final SkuDetails skuDetails = arrayListZzj.get(0);
        final String type = skuDetails.getType();
        if (type.equals(BillingClient.SkuType.SUBS) && !this.i) {
            zza.zzk("BillingClient", "Current client doesn't support subscriptions.");
            BillingResult billingResult2 = j.s;
            i(billingResult2);
            return billingResult2;
        }
        if (billingFlowParams.h() && !this.l) {
            zza.zzk("BillingClient", "Current client doesn't support extra params for buy intent.");
            BillingResult billingResult3 = j.h;
            i(billingResult3);
            return billingResult3;
        }
        if (arrayListZzj.size() > 1 && !this.s) {
            zza.zzk("BillingClient", "Current client doesn't support multi-item purchases.");
            BillingResult billingResult4 = j.u;
            i(billingResult4);
            return billingResult4;
        }
        String str3 = "";
        for (int i2 = 0; i2 < arrayListZzj.size(); i2++) {
            String strValueOf = String.valueOf(str3);
            String strValueOf2 = String.valueOf(arrayListZzj.get(i2));
            StringBuilder sb = new StringBuilder(strValueOf.length() + strValueOf2.length());
            sb.append(strValueOf);
            sb.append(strValueOf2);
            String string = sb.toString();
            if (i2 < arrayListZzj.size() - 1) {
                string = String.valueOf(string).concat(", ");
            }
            str3 = string;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 41 + type.length());
        sb2.append("Constructing buy intent for ");
        sb2.append(str3);
        sb2.append(", item type: ");
        sb2.append(type);
        zza.zzj("BillingClient", sb2.toString());
        if (this.l) {
            final Bundle bundleZze = zza.zze(billingFlowParams, this.n, this.t, this.b);
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList<Integer> arrayList4 = new ArrayList<>();
            ArrayList<String> arrayList5 = new ArrayList<>();
            int size = arrayListZzj.size();
            int i3 = 0;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            while (i3 < size) {
                SkuDetails skuDetails2 = arrayListZzj.get(i3);
                if (!skuDetails2.a().isEmpty()) {
                    arrayList.add(skuDetails2.a());
                }
                String str4 = str2;
                try {
                    strOptString = new JSONObject(skuDetails2.getOriginalJson()).optString("offer_id_token");
                } catch (JSONException unused) {
                    strOptString = "";
                }
                String strZzb = skuDetails2.zzb();
                int iZza = skuDetails2.zza();
                String strZzd = skuDetails2.zzd();
                arrayList2.add(strOptString);
                z2 |= !TextUtils.isEmpty(strOptString);
                arrayList3.add(strZzb);
                z3 |= !TextUtils.isEmpty(strZzb);
                arrayList4.add(Integer.valueOf(iZza));
                z4 |= iZza != 0;
                z5 |= !TextUtils.isEmpty(strZzd);
                arrayList5.add(strZzd);
                i3++;
                size = size;
                str2 = str4;
            }
            str = str2;
            if (!arrayList.isEmpty()) {
                bundleZze.putStringArrayList("skuDetailsTokens", arrayList);
            }
            if (z2) {
                if (!this.q) {
                    BillingResult billingResult5 = j.i;
                    i(billingResult5);
                    return billingResult5;
                }
                bundleZze.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
            if (z3) {
                bundleZze.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
            }
            if (z4) {
                bundleZze.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList4);
            }
            if (z5) {
                bundleZze.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
            }
            if (TextUtils.isEmpty(skuDetails.zzc())) {
                z = false;
            } else {
                bundleZze.putString("skuPackageName", skuDetails.zzc());
                z = true;
            }
            if (!TextUtils.isEmpty(null)) {
                bundleZze.putString("accountName", null);
            }
            if (arrayListZzj.size() > 1) {
                ArrayList<String> arrayList6 = new ArrayList<>(arrayListZzj.size() - 1);
                ArrayList<String> arrayList7 = new ArrayList<>(arrayListZzj.size() - 1);
                for (int i4 = 1; i4 < arrayListZzj.size(); i4++) {
                    arrayList6.add(arrayListZzj.get(i4).getSku());
                    arrayList7.add(arrayListZzj.get(i4).getType());
                }
                bundleZze.putStringArrayList("additionalSkus", arrayList6);
                bundleZze.putStringArrayList("additionalSkuTypes", arrayList7);
            }
            if (!TextUtils.isEmpty(activity.getIntent().getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = activity.getIntent().getStringExtra("PROXY_PACKAGE");
                bundleZze.putString("proxyPackage", stringExtra);
                try {
                    bundleZze.putString("proxyPackageVersion", this.f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused2) {
                    bundleZze.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.r && z) {
                i = 15;
            } else if (this.n) {
                i = 9;
            } else {
                i = billingFlowParams.getVrPurchaseFlow() ? 7 : 6;
            }
            futureL = l(new Callable() { // from class: com.android.billingclient.api.zzx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.r(i, skuDetails, type, billingFlowParams, bundleZze);
                }
            }, 5000L, null, this.c);
        } else {
            str = "BUY_INTENT";
            futureL = l(new Callable() { // from class: com.android.billingclient.api.zzm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.s(skuDetails, type);
                }
            }, 5000L, null, this.c);
        }
        try {
            Bundle bundle = (Bundle) futureL.get(5000L, TimeUnit.MILLISECONDS);
            int iZza2 = zza.zza(bundle, "BillingClient");
            String strZzh = zza.zzh(bundle, "BillingClient");
            if (iZza2 == 0) {
                Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                String str5 = str;
                intent.putExtra(str5, (PendingIntent) bundle.getParcelable(str5));
                activity.startActivity(intent);
                return j.p;
            }
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Unable to buy item, Error response code: ");
            sb3.append(iZza2);
            zza.zzk("BillingClient", sb3.toString());
            BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
            builderNewBuilder.setResponseCode(iZza2);
            builderNewBuilder.setDebugMessage(strZzh);
            BillingResult billingResultBuild = builderNewBuilder.build();
            i(billingResultBuild);
            return billingResultBuild;
        } catch (CancellationException | TimeoutException unused3) {
            String str6 = str3;
            StringBuilder sb4 = new StringBuilder(String.valueOf(str6).length() + 68);
            sb4.append("Time out while launching billing flow: ; for sku: ");
            sb4.append(str6);
            sb4.append("; try to reconnect");
            zza.zzk("BillingClient", sb4.toString());
            BillingResult billingResult6 = j.r;
            i(billingResult6);
            return billingResult6;
        } catch (Exception unused4) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(str3).length() + 69);
            sb5.append("Exception while launching billing flow: ; for sku: ");
            sb5.append(str3);
            sb5.append("; try to reconnect");
            zza.zzk("BillingClient", sb5.toString());
            BillingResult billingResult7 = j.q;
            i(billingResult7);
            return billingResult7;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void launchPriceChangeConfirmationFlow(Activity activity, PriceChangeFlowParams priceChangeFlowParams, PriceChangeConfirmationListener priceChangeConfirmationListener) {
        if (!isReady()) {
            m(j.q, priceChangeConfirmationListener);
            return;
        }
        if (priceChangeFlowParams == null || priceChangeFlowParams.getSkuDetails() == null) {
            zza.zzk("BillingClient", "Please fix the input params. priceChangeFlowParams must contain valid sku.");
            m(j.n, priceChangeConfirmationListener);
            return;
        }
        final String sku = priceChangeFlowParams.getSkuDetails().getSku();
        if (sku == null) {
            zza.zzk("BillingClient", "Please fix the input params. priceChangeFlowParams must contain valid sku.");
            m(j.n, priceChangeConfirmationListener);
            return;
        }
        if (!this.m) {
            zza.zzk("BillingClient", "Current client doesn't support price change confirmation flow.");
            m(j.i, priceChangeConfirmationListener);
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", this.b);
        bundle.putBoolean("subs_price_change", true);
        try {
            Bundle bundle2 = (Bundle) l(new Callable() { // from class: com.android.billingclient.api.zzo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.t(sku, bundle);
                }
            }, 5000L, null, this.c).get(5000L, TimeUnit.MILLISECONDS);
            int iZza = zza.zza(bundle2, "BillingClient");
            String strZzh = zza.zzh(bundle2, "BillingClient");
            BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
            builderNewBuilder.setResponseCode(iZza);
            builderNewBuilder.setDebugMessage(strZzh);
            BillingResult billingResultBuild = builderNewBuilder.build();
            if (iZza != 0) {
                StringBuilder sb = new StringBuilder(68);
                sb.append("Unable to launch price change flow, error response code: ");
                sb.append(iZza);
                zza.zzk("BillingClient", sb.toString());
                m(billingResultBuild, priceChangeConfirmationListener);
                return;
            }
            zzy zzyVar = new zzy(this, this.c, priceChangeConfirmationListener);
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("SUBS_MANAGEMENT_INTENT", (PendingIntent) bundle2.getParcelable("SUBS_MANAGEMENT_INTENT"));
            intent.putExtra("result_receiver", zzyVar);
            activity.startActivity(intent);
        } catch (CancellationException | TimeoutException unused) {
            StringBuilder sb2 = new StringBuilder(sku.length() + 70);
            sb2.append("Time out while launching Price Change Flow for sku: ");
            sb2.append(sku);
            sb2.append("; try to reconnect");
            zza.zzk("BillingClient", sb2.toString());
            m(j.r, priceChangeConfirmationListener);
        } catch (Exception unused2) {
            StringBuilder sb3 = new StringBuilder(sku.length() + 78);
            sb3.append("Exception caught while launching Price Change Flow for sku: ");
            sb3.append(sku);
            sb3.append("; try to reconnect");
            zza.zzk("BillingClient", sb3.toString());
            m(j.q, priceChangeConfirmationListener);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(j.q, null);
        } else if (l(new d(this, str, purchaseHistoryResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzt
            @Override // java.lang.Runnable
            public final void run() {
                purchaseHistoryResponseListener.onPurchaseHistoryResponse(j.r, null);
            }
        }, h()) == null) {
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(j(), null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final Purchase.PurchasesResult queryPurchases(String str) {
        if (!isReady()) {
            return new Purchase.PurchasesResult(j.q, null);
        }
        if (TextUtils.isEmpty(str)) {
            zza.zzk("BillingClient", "Please provide a valid SKU type.");
            return new Purchase.PurchasesResult(j.g, null);
        }
        try {
            return (Purchase.PurchasesResult) l(new s(this, str), 5000L, null, this.c).get(5000L, TimeUnit.MILLISECONDS);
        } catch (CancellationException | TimeoutException unused) {
            return new Purchase.PurchasesResult(j.r, null);
        } catch (Exception unused2) {
            return new Purchase.PurchasesResult(j.l, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zze
    public void queryPurchasesAsync(String str, final PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            purchasesResponseListener.onQueryPurchasesResponse(j.q, com.google.android.gms.internal.play_billing.zzp.zzg());
            return;
        }
        if (TextUtils.isEmpty(str)) {
            zza.zzk("BillingClient", "Please provide a valid SKU type.");
            purchasesResponseListener.onQueryPurchasesResponse(j.g, com.google.android.gms.internal.play_billing.zzp.zzg());
        } else if (l(new c(this, str, purchasesResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzu
            @Override // java.lang.Runnable
            public final void run() {
                purchasesResponseListener.onQueryPurchasesResponse(j.r, com.google.android.gms.internal.play_billing.zzp.zzg());
            }
        }, h()) == null) {
            purchasesResponseListener.onQueryPurchasesResponse(j(), com.google.android.gms.internal.play_billing.zzp.zzg());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            skuDetailsResponseListener.onSkuDetailsResponse(j.q, null);
            return;
        }
        final String skuType = skuDetailsParams.getSkuType();
        List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            zza.zzk("BillingClient", "Please fix the input params. SKU type can't be empty.");
            skuDetailsResponseListener.onSkuDetailsResponse(j.g, null);
            return;
        }
        if (skusList == null) {
            zza.zzk("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            skuDetailsResponseListener.onSkuDetailsResponse(j.f, null);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        for (String str : skusList) {
            zzap zzapVar = new zzap(null);
            zzapVar.zza(str);
            arrayList.add(zzapVar.zzb());
        }
        final String str2 = null;
        if (l(new Callable(skuType, arrayList, str2, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzp
            public final /* synthetic */ String zzb;
            public final /* synthetic */ List zzc;
            public final /* synthetic */ SkuDetailsResponseListener zzd;

            {
                this.zzd = skuDetailsResponseListener;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.D(this.zzb, this.zzc, null, this.zzd);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzv
            @Override // java.lang.Runnable
            public final void run() {
                skuDetailsResponseListener.onSkuDetailsResponse(j.r, null);
            }
        }, h()) == null) {
            skuDetailsResponseListener.onSkuDetailsResponse(j(), null);
        }
    }

    public final /* synthetic */ Bundle r(int i, SkuDetails skuDetails, String str, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        return this.g.zzg(i, this.f.getPackageName(), skuDetails.getSku(), str, null, bundle);
    }

    public final /* synthetic */ Bundle s(SkuDetails skuDetails, String str) throws Exception {
        return this.g.zzf(3, this.f.getPackageName(), skuDetails.getSku(), str, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            zza.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            billingClientStateListener.onBillingSetupFinished(j.p);
            return;
        }
        if (this.a == 1) {
            zza.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            billingClientStateListener.onBillingSetupFinished(j.d);
            return;
        }
        if (this.a == 3) {
            zza.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            billingClientStateListener.onBillingSetupFinished(j.q);
            return;
        }
        this.a = 1;
        this.d.d();
        zza.zzj("BillingClient", "Starting in-app billing setup.");
        this.h = new f(this, billingClientStateListener, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null) {
                zza.zzk("BillingClient", "The device doesn't have valid Play Store.");
            } else {
                ComponentName componentName = new ComponentName(str, str2);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                intent2.putExtra("playBillingLibraryVersion", this.b);
                if (this.f.bindService(intent2, this.h, 1)) {
                    zza.zzj("BillingClient", "Service was bonded successfully.");
                    return;
                }
                zza.zzk("BillingClient", "Connection to Billing service is blocked.");
            }
        }
        this.a = 0;
        zza.zzj("BillingClient", "Billing service unavailable on device.");
        billingClientStateListener.onBillingSetupFinished(j.c);
    }

    public final /* synthetic */ Bundle t(String str, Bundle bundle) throws Exception {
        return this.g.zzm(8, this.f.getPackageName(), str, BillingClient.SkuType.SUBS, bundle);
    }

    @AnyThread
    private a(Context context, boolean z, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.k = 0;
        this.b = str;
        a(context, purchasesUpdatedListener, z);
    }

    private a(String str) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.k = 0;
        this.b = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @AnyThread
    public a(@Nullable String str, boolean z, Context context, PurchasesUpdatedListener purchasesUpdatedListener) {
        String str2;
        try {
            str2 = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str2 = BuildConfig.VERSION_NAME;
        }
        this(context, z, purchasesUpdatedListener, str2, null);
    }
}
