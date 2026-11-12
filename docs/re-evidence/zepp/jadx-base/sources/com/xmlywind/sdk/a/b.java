package com.xmlywind.sdk.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.k;
import com.xmlywind.sdk.base.common.t;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.LoadAdRequest;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.models.SigmobError;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntitySigmob;
import com.xmlywind.sdk.common.mta.PointEntitySigmobError;
import com.xmlywind.sdk.common.utils.q;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements com.xmlywind.sdk.base.a.b.a, k.b {
    private a a;
    private Handler b;
    private BaseAdUnit c;
    private Context d;
    private String e;
    private d f;
    private c g;

    public b(Context context, String str, a aVar) {
        String message;
        int errorCode;
        if (TextUtils.isEmpty(str)) {
            SigmobLog.e("placement is empty");
            if (aVar == null) {
                return;
            }
            SigmobError sigmobError = SigmobError.ERROR_SIGMOB_PLACEMENTID_EMPTY;
            errorCode = sigmobError.getErrorCode();
            message = sigmobError.getMessage();
        } else {
            if (context != null) {
                this.d = context;
                this.e = str;
                this.a = aVar;
                this.f = new d(this);
                this.b = new Handler(Looper.getMainLooper());
                return;
            }
            message = "context is null";
            SigmobLog.e("context is null");
            if (aVar == null) {
                return;
            } else {
                errorCode = SigmobError.ERROR_SIGMOB_REQUEST.getErrorCode();
            }
        }
        aVar.onDriftAdError(errorCode, message, str);
    }

    private void a(final int i, final String str, final String str2) {
        SigmobLog.d("onDriftError: " + i + " :placementId: " + str2);
        this.b.post(new Runnable() { // from class: com.xmlywind.sdk.a.b.9
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.a != null) {
                    b.this.a.onDriftAdError(i, str, str2);
                }
            }
        });
    }

    public void a() {
        BaseAdUnit baseAdUnit;
        Context context;
        c cVar = this.g;
        if (cVar != null && (baseAdUnit = this.c) != null && (context = this.d) != null && this.f != null) {
            cVar.a(context, (q) null, (q) null, com.xmlywind.sdk.base.a.DRIFT, baseAdUnit);
            this.f.a(this.d, this.c, (Bundle) null);
        } else {
            a aVar = this.a;
            if (aVar != null) {
                aVar.onDriftAdError(SigmobError.ERROR_SIGMOB_AD_PLAY.getErrorCode(), "ad is null or other params is null", this.e);
            }
        }
    }

    @Override // com.xmlywind.sdk.base.a.b.a
    public void a(int i, String str, String str2, LoadAdRequest loadAdRequest) {
        t.a(PointCategory.RESPOND, "0", (BaseAdUnit) null, new t.a() { // from class: com.xmlywind.sdk.a.b.7
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmob) {
                    PointEntitySigmob pointEntitySigmob = (PointEntitySigmob) obj;
                    pointEntitySigmob.setPlacement_id(b.this.e);
                    pointEntitySigmob.setAdtype(String.valueOf(3));
                }
            }
        });
        t.a(PointCategory.RESPOND, i, str, (BaseAdUnit) null, new t.a() { // from class: com.xmlywind.sdk.a.b.8
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmobError) {
                    PointEntitySigmobError pointEntitySigmobError = (PointEntitySigmobError) obj;
                    pointEntitySigmobError.setPlacement_id(b.this.e);
                    pointEntitySigmobError.setAdtype(String.valueOf(3));
                }
            }
        });
        a(i, str, loadAdRequest.getPlacementId());
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void a(BaseAdUnit baseAdUnit) {
        t.a("start", (String) null, baseAdUnit);
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void a(BaseAdUnit baseAdUnit, final String str) {
        t.a(PointCategory.LOADEND, "0", baseAdUnit);
        t.a(PointCategory.LOADEND, SigmobError.ERROR_SIGMOB_FILE_DOWNLOAD.getErrorCode(), str, this.c, new t.a() { // from class: com.xmlywind.sdk.a.b.2
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmobError) {
                    PointEntitySigmobError pointEntitySigmobError = (PointEntitySigmobError) obj;
                    pointEntitySigmobError.setPlacement_id(b.this.e);
                    pointEntitySigmobError.setAdtype(String.valueOf(3));
                    pointEntitySigmobError.commit();
                }
            }
        });
        this.b.post(new Runnable() { // from class: com.xmlywind.sdk.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.a != null) {
                    b.this.a.onDriftAdError(SigmobError.ERROR_SIGMOB_FILE_DOWNLOAD.getErrorCode(), str, b.this.e);
                }
            }
        });
    }

    @Override // com.xmlywind.sdk.base.a.b.a
    public void a(List<BaseAdUnit> list, LoadAdRequest loadAdRequest) {
        if (list == null || list.size() <= 0) {
            SigmobError sigmobError = SigmobError.ERROR_REQUEST_NEED_AD_SLOTS_INFO;
            a(sigmobError.getErrorCode(), sigmobError.getMessage(), loadAdRequest.getPlacementId());
            return;
        }
        BaseAdUnit baseAdUnit = list.get(0);
        t.a(PointCategory.RESPOND, "1", baseAdUnit);
        this.c = baseAdUnit;
        this.f.a(this.d, new HashMap(), baseAdUnit);
    }

    public File b() {
        d dVar = this.f;
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void b(BaseAdUnit baseAdUnit) {
        this.g = c.c(this.c);
        t.a(PointCategory.LOADEND, "1", baseAdUnit);
        this.b.post(new Runnable() { // from class: com.xmlywind.sdk.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.a != null) {
                    b.this.a.onDriftAdReceive(b.this.e);
                }
            }
        });
    }

    public void c() {
        t.a("request", PointCategory.INIT, (BaseAdUnit) null, new t.a() { // from class: com.xmlywind.sdk.a.b.6
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmob) {
                    PointEntitySigmob pointEntitySigmob = (PointEntitySigmob) obj;
                    pointEntitySigmob.setAdtype(String.valueOf(3));
                    pointEntitySigmob.setPlacement_id(b.this.e);
                }
            }
        });
        com.xmlywind.sdk.base.a.b.a(SDKConfig.sharedInstance().getAdsUrl(), new LoadAdRequest(com.xmlywind.sdk.common.a.a(), this.e, 3, null, null), this);
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void c(BaseAdUnit baseAdUnit) {
        this.g.a(this.d, 0, this.c);
        this.b.post(new Runnable() { // from class: com.xmlywind.sdk.a.b.4
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.a != null) {
                    b.this.a.onDriftAdPresent(b.this.e);
                }
            }
        });
    }

    public void d() {
        this.c = null;
        this.g = null;
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void d(BaseAdUnit baseAdUnit) {
    }

    public void e() {
        t.a(PointCategory.CLOSE_DRIFT, "1", this.c);
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void e(BaseAdUnit baseAdUnit) {
        if (this.c != null) {
            t.a("close", (String) null, baseAdUnit);
            this.b.post(new Runnable() { // from class: com.xmlywind.sdk.a.b.5
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.a != null) {
                        b.this.a.onDriftAdClose(b.this.e);
                    }
                }
            });
        }
    }
}
