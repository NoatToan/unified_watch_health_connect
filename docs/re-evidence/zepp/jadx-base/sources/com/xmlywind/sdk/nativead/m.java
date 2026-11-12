package com.xmlywind.sdk.nativead;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.LoadAdRequest;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.models.SigmobError;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntitySigmob;
import com.xmlywind.sdk.common.mta.PointEntitySigmobError;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class m implements com.xmlywind.sdk.base.a.b.a {
    private Context a;
    private Handler b;
    private p c;
    private LoadAdRequest d;

    public m(Context context, LoadAdRequest loadAdRequest, p pVar) {
        if (context == null) {
            p pVar2 = this.c;
            if (pVar2 != null) {
                pVar2.onNativeAdLoadFail(600502, "SigmobNativeAd context can't null");
                return;
            }
            return;
        }
        this.d = loadAdRequest;
        this.b = new Handler(Looper.getMainLooper());
        this.c = pVar;
        this.a = context.getApplicationContext();
    }

    private s a(BaseAdUnit baseAdUnit) {
        if (baseAdUnit != null) {
            return new t(this.a, baseAdUnit);
        }
        return null;
    }

    private void a(final List<s> list, final int i, final String str) {
        this.b.post(new Runnable() { // from class: com.xmlywind.sdk.nativead.m.1
            @Override // java.lang.Runnable
            public void run() {
                if (m.this.c != null) {
                    if (i != 0) {
                        m.this.c.onNativeAdLoadFail(i, str);
                        return;
                    }
                    List list2 = list;
                    if (list2 != null && list2.size() != 0) {
                        m.this.c.onNativeAdLoaded(list);
                        return;
                    }
                    p pVar = m.this.c;
                    SigmobError sigmobError = SigmobError.ERROR_REQUEST_NEED_AD_SLOTS_INFO;
                    pVar.onNativeAdLoadFail(sigmobError.getErrorCode(), sigmobError.getMessage());
                }
            }
        });
    }

    public void a() {
        SigmobError sigmobError;
        SigmobError sigmobErrorC;
        if (com.xmlywind.sdk.a.a()) {
            LoadAdRequest loadAdRequest = this.d;
            if (loadAdRequest != null && !TextUtils.isEmpty(loadAdRequest.getPlacementId())) {
                try {
                    if (com.xmlywind.sdk.a.b() != null && (sigmobErrorC = com.xmlywind.sdk.a.b().c()) != null) {
                        SigmobLog.e("check loadAd error " + sigmobErrorC.toString());
                        PointEntitySigmobError.SigmobError(PointCategory.LOAD, sigmobErrorC.getErrorCode(), sigmobErrorC.getMessage()).commit();
                        a(null, sigmobErrorC.getErrorCode(), sigmobErrorC.getMessage());
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                com.xmlywind.sdk.base.common.t.a("request", PointCategory.INIT, (BaseAdUnit) null, new com.xmlywind.sdk.base.common.t.a() { // from class: com.xmlywind.sdk.nativead.m.2
                    @Override // com.xmlywind.sdk.base.common.t.a
                    public void a(Object obj) {
                        if (obj instanceof PointEntitySigmob) {
                            PointEntitySigmob pointEntitySigmob = (PointEntitySigmob) obj;
                            pointEntitySigmob.setAdtype(String.valueOf(5));
                            pointEntitySigmob.setPlacement_id(m.this.d.getPlacementId());
                        }
                    }
                });
                com.xmlywind.sdk.base.a.b.a(SDKConfig.sharedInstance().getAdsUrl(), this.d, this);
                return;
            }
            sigmobError = SigmobError.ERROR_SIGMOB_PLACEMENTID_EMPTY;
        } else {
            sigmobError = SigmobError.ERROR_SIGMOB_NOT_INIT;
        }
        a(null, sigmobError.getErrorCode(), sigmobError.getMessage());
    }

    @Override // com.xmlywind.sdk.base.a.b.a
    public void a(int i, String str, String str2, final LoadAdRequest loadAdRequest) {
        com.xmlywind.sdk.base.common.t.a(PointCategory.SERVER_ERROR, i, str, (BaseAdUnit) null, new com.xmlywind.sdk.base.common.t.a() { // from class: com.xmlywind.sdk.nativead.m.5
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmobError) {
                    PointEntitySigmobError pointEntitySigmobError = (PointEntitySigmobError) obj;
                    pointEntitySigmobError.setRequest_id(loadAdRequest.getRequestId());
                    pointEntitySigmobError.setPlacement_id(loadAdRequest.getPlacementId());
                    pointEntitySigmobError.setAdtype(String.valueOf(loadAdRequest.getAdType()));
                }
            }
        });
        com.xmlywind.sdk.base.common.t.a(PointCategory.RESPOND, "0", (BaseAdUnit) null, new com.xmlywind.sdk.base.common.t.a() { // from class: com.xmlywind.sdk.nativead.m.6
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmob) {
                    PointEntitySigmob pointEntitySigmob = (PointEntitySigmob) obj;
                    pointEntitySigmob.setAdtype(String.valueOf(loadAdRequest.getAdType()));
                    pointEntitySigmob.setPlacement_id(loadAdRequest.getPlacementId());
                    pointEntitySigmob.setLoad_id(loadAdRequest.getLoadId());
                    pointEntitySigmob.setRequest_id(loadAdRequest.getRequestId());
                }
            }
        });
        a(null, i, str);
    }

    @Override // com.xmlywind.sdk.base.a.b.a
    public void a(List<BaseAdUnit> list, final LoadAdRequest loadAdRequest) {
        com.xmlywind.sdk.base.common.t.a aVar;
        String str;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            BaseAdUnit baseAdUnit = list.get(i);
            s sVarA = a(baseAdUnit);
            if (sVarA != null) {
                arrayList.add(sVarA);
                com.xmlywind.sdk.base.common.d.f().f(baseAdUnit);
            }
        }
        if (arrayList.size() > 0) {
            aVar = new com.xmlywind.sdk.base.common.t.a() { // from class: com.xmlywind.sdk.nativead.m.3
                @Override // com.xmlywind.sdk.base.common.t.a
                public void a(Object obj) {
                    if (obj instanceof PointEntitySigmob) {
                        PointEntitySigmob pointEntitySigmob = (PointEntitySigmob) obj;
                        pointEntitySigmob.setAdtype(String.valueOf(loadAdRequest.getAdType()));
                        pointEntitySigmob.setPlacement_id(loadAdRequest.getPlacementId());
                        pointEntitySigmob.setLoad_id(loadAdRequest.getLoadId());
                        pointEntitySigmob.setRequest_id(loadAdRequest.getRequestId());
                    }
                }
            };
            str = "1";
        } else {
            aVar = new com.xmlywind.sdk.base.common.t.a() { // from class: com.xmlywind.sdk.nativead.m.4
                @Override // com.xmlywind.sdk.base.common.t.a
                public void a(Object obj) {
                    if (obj instanceof PointEntitySigmob) {
                        PointEntitySigmob pointEntitySigmob = (PointEntitySigmob) obj;
                        pointEntitySigmob.setAdtype(String.valueOf(loadAdRequest.getAdType()));
                        pointEntitySigmob.setPlacement_id(loadAdRequest.getPlacementId());
                        pointEntitySigmob.setLoad_id(loadAdRequest.getLoadId());
                        pointEntitySigmob.setRequest_id(loadAdRequest.getRequestId());
                    }
                }
            };
            str = "0";
        }
        com.xmlywind.sdk.base.common.t.a(PointCategory.RESPOND, str, (BaseAdUnit) null, aVar);
        a(arrayList, 0, null);
    }
}
