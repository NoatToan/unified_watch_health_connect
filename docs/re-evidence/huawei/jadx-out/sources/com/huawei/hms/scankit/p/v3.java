package com.huawei.hms.scankit.p;

import android.os.Bundle;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.wearengine.sensor.DataResult;
import com.tencent.open.apireq.BaseResp;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: loaded from: classes34.dex */
public final class v3 extends u3 {
    private static String o = "AiDetect";
    private static String p = "defaultDetect";
    private int h;
    protected String i;
    protected String j;
    protected long k;
    protected long l;
    protected long m;
    protected boolean n;

    public void i() {
        try {
            if (a()) {
                b bVar = new b();
                bVar.put("result", String.valueOf(this.h));
                bVar.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf(System.currentTimeMillis() - this.f16352c));
                bVar.put("scanType", this.i);
                bVar.put("sceneType", this.j);
                if (this.l != 0 && this.m != 0) {
                    if (this.n) {
                        bVar.put("recognizeMode", o);
                        bVar.put("defaultDetectTime", String.valueOf(this.l - this.k));
                        bVar.put("aiDetectTime", String.valueOf(this.m - this.l));
                    } else {
                        bVar.put("recognizeMode", p);
                        bVar.put("defaultDetectTime", String.valueOf(this.l - this.k));
                    }
                    bVar.put("recognizeSuccessTime", String.valueOf(this.m - this.k));
                }
                a4.b().b("60000", bVar);
                j();
            }
        } catch (NullPointerException unused) {
            o4.b("HaLog60000", "nullPoint");
        } catch (Exception unused2) {
            o4.b("HaLog60000", "logEnd Exception");
        }
    }

    class a extends SimpleDateFormat {
        a(String str) {
            super(str);
            setTimeZone(TimeZone.getTimeZone(DataResult.UTC));
        }
    }

    public v3(Bundle bundle, String str) {
        super(bundle, DynamicModuleInitializer.getContext().getApplicationContext());
        this.h = BaseResp.CODE_QQ_LOW_VERSION;
        this.i = u3.d;
        this.j = u3.e;
        this.f16351b.put("callTime", new a("yyyyMMddHHmmss.SSS").format(Long.valueOf(System.currentTimeMillis())));
        this.f16351b.put("transId", UUID.randomUUID().toString());
        this.f16351b.put("apiName", str);
    }

    public void h() {
        this.f16352c = System.currentTimeMillis();
    }

    class b extends LinkedHashMap {
        b() {
            v3.this.g();
            putAll(v3.this.f16351b);
        }
    }

    private void j() {
        this.h = BaseResp.CODE_QQ_LOW_VERSION;
        this.i = u3.d;
        this.j = u3.e;
    }

    public void a(long j, long j2, boolean z) {
        this.l = j;
        this.m = j2;
        this.n = z;
    }

    public void c(int i) {
        this.h = i;
    }

    public void a(HmsScan[] hmsScanArr) {
        if (hmsScanArr != null) {
            this.h = hmsScanArr.length;
            for (HmsScan hmsScan : hmsScanArr) {
                this.i = u3.a(hmsScan.scanType);
                this.j = u3.b(hmsScan.scanTypeForm);
            }
        }
    }

    public void a(long j) {
        this.k = j;
    }
}
