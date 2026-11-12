package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.Bundle;
import com.huawei.openalliance.ad.beans.inner.AdContentData;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.listeners.NativeAdListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class gu implements gs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NativeAdListener f18839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private qy f18840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f18841c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.openalliance.ad.gs
    public void a(Map map) {
        StringBuilder sb = new StringBuilder("onAdsLoaded, size:");
        sb.append(map != null ? Integer.valueOf(map.size()) : null);
        sb.append(", listener:");
        sb.append(this.f18839a);
        hw.b("NativeAd", sb.toString());
        NativeAdListener nativeAdListener = this.f18839a;
        if (nativeAdListener != 0) {
            map = com.huawei.openalliance.ad.utils.as.a(this.f18841c, (Map<String, List<INativeAd>>) map);
            nativeAdListener.onAdsLoaded(map);
        }
        b(map);
    }

    @Override // com.huawei.openalliance.ad.gs
    public void a(qy qyVar) {
        this.f18840b = qyVar;
    }

    @Override // com.huawei.openalliance.ad.gs
    public void a(int i) {
        hw.b("NativeAd", "onAdFailed, errorCode:" + i);
        NativeAdListener nativeAdListener = this.f18839a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdFailed(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Map<String, List<INativeAd>> map) {
        String str;
        hw.b("NativeAd", "triggerEngineDown");
        if (com.huawei.openalliance.ad.utils.br.a(map)) {
            str = "nativeAdsMap is empty";
        } else {
            List<AdContentData> listC = c(map);
            if (!com.huawei.openalliance.ad.utils.bm.a(listC)) {
                if (com.huawei.openalliance.ad.utils.c.b() && e.b() != null) {
                    try {
                        String strB = com.huawei.openalliance.ad.utils.bk.b(listC);
                        hw.a("NativeAd", "contentJson : %s", strB);
                        if (this.f18840b != null) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean(ParamConstants.Param.DOWNLOAD_IN_DATA, this.f18840b.b());
                            bundle.putBoolean("directCacheVideo", this.f18840b.c());
                            e.b().a(strB, bundle);
                        } else {
                            e.b().a(strB, (Bundle) null);
                        }
                        qy qyVar = this.f18840b;
                        if (qyVar == null) {
                            return true;
                        }
                        qyVar.a();
                        return true;
                    } catch (Throwable th) {
                        hw.c("NativeAd", "down err: %s", th.getClass().getSimpleName());
                    }
                }
                return false;
            }
            str = "tpt ads is empty";
        }
        hw.a("NativeAd", str);
        return false;
    }

    private List<AdContentData> c(Map<String, List<INativeAd>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<INativeAd>> entry : map.entrySet()) {
            if (entry != null && !com.huawei.openalliance.ad.utils.bm.a(entry.getValue())) {
                for (INativeAd iNativeAd : entry.getValue()) {
                    if (iNativeAd instanceof com.huawei.openalliance.ad.inter.data.e) {
                        com.huawei.openalliance.ad.inter.data.e eVar = (com.huawei.openalliance.ad.inter.data.e) iNativeAd;
                        if (99 == eVar.getCreativeType()) {
                            arrayList.add(eVar.v());
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private void b(final Map<String, List<INativeAd>> map) {
        com.huawei.openalliance.ad.utils.o.d(new Runnable() { // from class: com.huawei.openalliance.ad.gu.1
            @Override // java.lang.Runnable
            public void run() {
                gu.this.d(map);
            }
        });
    }

    public gu(NativeAdListener nativeAdListener, Context context) {
        this.f18839a = nativeAdListener;
        this.f18841c = context;
    }
}
