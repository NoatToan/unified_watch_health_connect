package com.xmlywind.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.c;
import com.xmlywind.sdk.base.common.d;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.LoadAdRequest;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.b.b;
import com.xmlywind.sdk.common.models.SigmobError;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntitySigmob;
import com.xmlywind.volley.t;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class a {
    private static a a;
    private SigmobError b;
    private b c = null;
    private Context d;

    private a(final Context context) {
        this.d = context;
        Boolean bool = Constants.IS_TEST;
        t.b = bool.booleanValue();
        d.b();
        d.c();
        d.d();
        d.i();
        d.h();
        if (bool.booleanValue()) {
            d.a();
        }
        d.c(context);
        com.xmlywind.sdk.base.common.t.a(PointCategory.INIT, (LoadAdRequest) null, new com.xmlywind.sdk.base.common.t.a() { // from class: com.xmlywind.sdk.a.1
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmob) {
                    PointEntitySigmob pointEntitySigmob = (PointEntitySigmob) obj;
                    HashMap map = new HashMap();
                    map.put("is_minor", com.xmlywind.sdk.common.a.n().ap() ? "0" : "1");
                    map.put("is_unpersonalized", com.xmlywind.sdk.common.a.n().aq() ? "0" : "1");
                    pointEntitySigmob.setOptions(map);
                }
            }
        });
        if (SDKConfig.sharedInstance().isEnable_permission()) {
            com.xmlywind.sdk.base.common.t.a(PointCategory.PERMISSION, PointCategory.INIT, (BaseAdUnit) null, new com.xmlywind.sdk.base.common.t.a() { // from class: com.xmlywind.sdk.a.2
                @Override // com.xmlywind.sdk.base.common.t.a
                public void a(Object obj) {
                    if (obj instanceof PointEntitySigmob) {
                        ((PointEntitySigmob) obj).setPermission(com.xmlywind.sdk.common.a.n().b(context));
                    }
                }
            });
        }
        com.xmlywind.sdk.base.common.t.a("app");
        this.b = c.a(this.d);
        d.b(this.d);
        d();
    }

    public static a a(Context context) {
        if (context == null) {
            SigmobLog.e("initialize: failed ", new IllegalArgumentException("context is null"));
            return null;
        }
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a(context);
                }
            }
        }
        return a;
    }

    public static boolean a() {
        return a != null;
    }

    public static a b() {
        return a;
    }

    private void d() {
        b bVar = new b(new Handler(Looper.getMainLooper())) { // from class: com.xmlywind.sdk.a.3
            @Override // com.xmlywind.sdk.common.b.b
            public void a() {
                try {
                    com.xmlywind.sdk.base.a.c.a_();
                } catch (Throwable th) {
                    SigmobLog.e("retryFaildTracking error " + th.getMessage());
                }
            }
        };
        this.c = bVar;
        bVar.a(SDKConfig.sharedInstance().getAdTrackerRetryInterval());
    }

    public SigmobError c() {
        return this.b;
    }
}
