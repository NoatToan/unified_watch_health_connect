package com.amap.api.location;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.loc.d;
import com.loc.ei;
import com.loc.em;
import com.loc.n;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AMapLocationClient {
    public Context a;
    public d b;

    public AMapLocationClient(Context context) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            this.a = context.getApplicationContext();
            this.b = new d(context, null, null);
        } catch (Throwable th) {
            ei.a(th, "AMClt", "ne1");
        }
    }

    public AMapLocationClient(Context context, Intent intent) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            this.a = context.getApplicationContext();
            this.b = new d(this.a, intent, null);
        } catch (Throwable th) {
            ei.a(th, "AMClt", "ne2");
        }
    }

    public AMapLocationClient(Looper looper, Context context) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            this.a = context.getApplicationContext();
            this.b = new d(this.a, null, looper);
        } catch (Throwable th) {
            ei.a(th, "AMClt", "ne3");
        }
    }

    public static String getDeviceId(Context context) {
        return n.x(context);
    }

    public static void setApiKey(String str) {
        try {
            AMapLocationClientOption.a = str;
        } catch (Throwable th) {
            ei.a(th, "AMClt", "sKey");
        }
    }

    public void disableBackgroundLocation(boolean z) {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.a(z);
            }
        } catch (Throwable th) {
            ei.a(th, "AMClt", "dBackL");
        }
    }

    public void enableBackgroundLocation(int i, Notification notification) {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.a(i, notification);
            }
        } catch (Throwable th) {
            ei.a(th, "AMClt", "eBackL");
        }
    }

    public AMapLocation getLastKnownLocation() {
        try {
            d dVar = this.b;
            if (dVar != null) {
                return dVar.e();
            }
            return null;
        } catch (Throwable th) {
            ei.a(th, "AMClt", "gLastL");
            return null;
        }
    }

    public String getVersion() {
        return "5.0.0";
    }

    public boolean isStarted() {
        try {
            d dVar = this.b;
            if (dVar != null) {
                return dVar.a();
            }
            return false;
        } catch (Throwable th) {
            ei.a(th, "AMClt", "isS");
            return false;
        }
    }

    public void onDestroy() {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.d();
            }
        } catch (Throwable th) {
            ei.a(th, "AMClt", "onDy");
        }
    }

    public void setLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            if (aMapLocationListener == null) {
                throw new IllegalArgumentException("listener参数不能为null");
            }
            d dVar = this.b;
            if (dVar != null) {
                dVar.a(aMapLocationListener);
            }
        } catch (Throwable th) {
            ei.a(th, "AMClt", "sLocL");
        }
    }

    public void setLocationOption(AMapLocationClientOption aMapLocationClientOption) {
        try {
            if (aMapLocationClientOption == null) {
                throw new IllegalArgumentException("LocationManagerOption参数不能为null");
            }
            d dVar = this.b;
            if (dVar != null) {
                dVar.a(aMapLocationClientOption);
            }
            if (aMapLocationClientOption.b) {
                aMapLocationClientOption.b = false;
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(aMapLocationClientOption.c)) {
                    jSONObject.put("amap_loc_scenes_type", aMapLocationClientOption.c);
                }
                em.a(this.a, "O019", jSONObject);
            }
        } catch (Throwable th) {
            ei.a(th, "AMClt", "sLocnO");
        }
    }

    public void startAssistantLocation() {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.f();
            }
        } catch (Throwable th) {
            ei.a(th, "AMClt", "stAssLo");
        }
    }

    public void startAssistantLocation(WebView webView) {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.a(webView);
            }
        } catch (Throwable th) {
            ei.a(th, "AMClt", "sttAssL1");
        }
    }

    public void startLocation() {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.b();
            }
        } catch (Throwable th) {
            ei.a(th, "AMClt", "stl");
        }
    }

    public void stopAssistantLocation() {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.g();
            }
        } catch (Throwable th) {
            ei.a(th, "AMClt", "stAssL");
        }
    }

    public void stopLocation() {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.c();
            }
        } catch (Throwable th) {
            ei.a(th, "AMClt", "stl");
        }
    }

    public void unRegisterLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.b(aMapLocationListener);
            }
        } catch (Throwable th) {
            ei.a(th, "AMClt", "unRL");
        }
    }
}
