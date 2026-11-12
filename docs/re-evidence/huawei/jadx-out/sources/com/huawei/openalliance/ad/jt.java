package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import cn.com.miaozhen.mobile.tracking.api.MzCountly;
import cn.com.miaozhen.mobile.tracking.viewability.origin.MzCallBack;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public enum jt {
    INSTANCE;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f19387b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f19388c;
    private boolean d;
    private Context e;

    public boolean b() {
        return this.d;
    }

    public boolean a(String str) {
        boolean zContains;
        if (str == null || !fp.b(this.e).aw()) {
            return false;
        }
        synchronized (f19387b) {
            zContains = this.f19388c.contains(str);
        }
        return zContains;
    }

    public void a(List<String> list, final ContentRecord contentRecord) {
        if (a("click", list, contentRecord)) {
            hw.b("MZSdkManager", "invoke onClick");
            a(0, "click", b(list), null, contentRecord, "");
            for (final String str : list) {
                MzCountly.sharedInstance().onClick(str, new MzCallBack() { // from class: com.huawei.openalliance.ad.jt.4
                    public void onSuccess(String str2) {
                        hw.b("MZSdkManager", "onClick onSuccess. %s, url is %s", str2, com.huawei.openalliance.ad.utils.ds.a(str));
                        jt jtVar = jt.this;
                        jtVar.a(1, "click", jtVar.b(str), null, contentRecord, str2);
                    }

                    public void onFailed(String str2) {
                        hw.b("MZSdkManager", "onClick failed: %s, url is %s", str2, com.huawei.openalliance.ad.utils.ds.a(str));
                        jt jtVar = jt.this;
                        jtVar.a(2, "click", jtVar.b(str), str2, contentRecord, "");
                    }
                });
            }
        }
    }

    public void a(List<String> list, View view, final ContentRecord contentRecord) {
        if (a("displayImp", list, contentRecord)) {
            hw.b("MZSdkManager", "invoke displayImp");
            a(0, "displayImp", b(list), null, contentRecord, "");
            for (final String str : list) {
                MzCountly.sharedInstance().disPlayImp(str, view, 1, new MzCallBack() { // from class: com.huawei.openalliance.ad.jt.2
                    public void onSuccess(String str2) {
                        hw.b("MZSdkManager", "displayImp onSuccess: %s, url is %s", str2, com.huawei.openalliance.ad.utils.ds.a(str));
                        jt jtVar = jt.this;
                        jtVar.a(1, "displayImp", jtVar.b(str), null, contentRecord, str2);
                    }

                    public void onFailed(String str2) {
                        hw.b("MZSdkManager", "displayImp onError: %s, url is %s", str2, com.huawei.openalliance.ad.utils.ds.a(str));
                        jt jtVar = jt.this;
                        jtVar.a(2, "displayImp", jtVar.b(str), str2, contentRecord, "");
                    }
                });
            }
        }
    }

    public void a(List<String> list) {
        if (!b()) {
            hw.b("MZSdkManager", "stopMz, not support mz");
            return;
        }
        hw.b("MZSdkManager", "stop mz monitor.");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            MzCountly.sharedInstance().stop(it.next());
        }
    }

    public void a(String str, long j) {
        if (str == null) {
            return;
        }
        synchronized (f19387b) {
            this.f19388c.edit().putLong(str, j).apply();
        }
    }

    public void a(Context context) {
        this.e = context.getApplicationContext();
        this.f19388c = context.getSharedPreferences("HiAd_mz_imp_sp", 0);
        d();
        try {
            MzCountly.sharedInstance().setLogState(hw.a());
            MzCountly.sharedInstance().init(context, "");
            hw.b("MZSdkManager", "init mz sdk success");
            this.d = true;
        } catch (Throwable th) {
            hw.c("MZSdkManager", "init mz sdk, err %s", th.getClass().getSimpleName());
            this.d = false;
        }
    }

    public void a(int i, List<String> list, View view, final ContentRecord contentRecord) {
        if (a("videoImp", list, contentRecord)) {
            hw.b("MZSdkManager", "invoke videoImp");
            a(0, "videoImp", b(list), null, contentRecord, "");
            for (final String str : list) {
                MzCountly.sharedInstance().videoImp(str, view, 1, i, new MzCallBack() { // from class: com.huawei.openalliance.ad.jt.3
                    public void onSuccess(String str2) {
                        hw.b("MZSdkManager", "videoImp onSuccess. %s, url is %s", str2, com.huawei.openalliance.ad.utils.ds.a(str));
                        jt jtVar = jt.this;
                        jtVar.a(1, "videoImp", jtVar.b(str), null, contentRecord, str2);
                    }

                    public void onFailed(String str2) {
                        hw.b("MZSdkManager", "videoImp failed: %s, url is %s", str2, com.huawei.openalliance.ad.utils.ds.a(str));
                        jt jtVar = jt.this;
                        jtVar.a(2, "videoImp", jtVar.b(str), str2, contentRecord, "");
                    }
                });
            }
        }
    }

    private void d() {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.jt.1
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (jt.f19387b) {
                    SharedPreferences.Editor editorEdit = jt.this.f19388c.edit();
                    Map<String, ?> all = jt.this.f19388c.getAll();
                    if (!com.huawei.openalliance.ad.utils.br.a(all)) {
                        for (Map.Entry<String, ?> entry : all.entrySet()) {
                            Object value = entry.getValue();
                            if ((value instanceof Long) && ((Long) value).longValue() < jCurrentTimeMillis) {
                                editorEdit.remove(entry.getKey());
                            }
                        }
                        editorEdit.apply();
                    }
                }
            }
        });
    }

    private String b(List<String> list) {
        StringBuilder sb = new StringBuilder("monitorUrls:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(",");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        return "monitorUrl:" + str;
    }

    private boolean a(String str, List<String> list, ContentRecord contentRecord) {
        int i;
        String str2;
        String str3;
        String str4;
        if (!b()) {
            hw.b("MZSdkManager", "invoke %s, not support mz", str);
            i = 2;
            str2 = "-1";
            str3 = "not support mz";
            str4 = "-1";
        } else {
            if (!com.huawei.openalliance.ad.utils.bm.a(list)) {
                return true;
            }
            hw.b("MZSdkManager", "invoke %s, url is blank", str);
            i = 2;
            str2 = "-2";
            str3 = "url is blank";
            str4 = "-2";
        }
        a(i, str, str2, str3, contentRecord, str4);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final String str, final String str2, final String str3, final ContentRecord contentRecord, final String str4) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.jt.5
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(jt.this.e).a(i, str, str2, str3, contentRecord, str4);
            }
        });
    }

    public static jt a() {
        return INSTANCE;
    }
}
