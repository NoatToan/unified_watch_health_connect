package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zza;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class l {
    public static BillingResult a(Bundle bundle, String str, String str2) {
        BillingResult billingResult = j.l;
        if (bundle == null) {
            zza.zzk("BillingClient", String.format("%s got null owned items list", str2));
            return billingResult;
        }
        int iZza = zza.zza(bundle, "BillingClient");
        String strZzh = zza.zzh(bundle, "BillingClient");
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(iZza);
        builderNewBuilder.setDebugMessage(strZzh);
        BillingResult billingResultBuild = builderNewBuilder.build();
        if (iZza != 0) {
            zza.zzk("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iZza)));
            return billingResultBuild;
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            zza.zzk("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return billingResult;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            zza.zzk("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return billingResult;
        }
        if (stringArrayList2 == null) {
            zza.zzk("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return billingResult;
        }
        if (stringArrayList3 != null) {
            return j.p;
        }
        zza.zzk("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return billingResult;
    }
}
