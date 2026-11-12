package com.huawei.hms.scankit;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.p.j0;
import com.huawei.hms.scankit.p.l1;
import com.huawei.hms.scankit.p.m1;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.v6;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes34.dex */
final class d extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f15929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0 f15930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f15931c;
    private Handler d;
    private a e;
    private Rect g;
    private boolean h = true;
    private final CountDownLatch f = new CountDownLatch(1);

    public void a(Rect rect) {
        this.g = rect;
    }

    public void b() {
        this.f15929a = null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.d = new c(this.f15929a, this.f15930b, this.e, this.f15931c, this.g, this.h);
        this.f.countDown();
        Looper.loop();
    }

    Handler a() {
        try {
            this.f.await();
        } catch (InterruptedException unused) {
            o4.b(TrackConstants$Events.EXCEPTION, "InterruptedException");
        }
        return this.d;
    }

    public void a(boolean z) {
        this.h = z;
    }

    d(Context context, j0 j0Var, a aVar, Collection collection, Map map, String str, v6 v6Var) {
        this.f15929a = context;
        this.e = aVar;
        this.f15930b = j0Var;
        EnumMap enumMap = new EnumMap(m1.class);
        this.f15931c = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        if (collection == null || collection.isEmpty()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            collection = EnumSet.noneOf(BarcodeFormat.class);
            if (defaultSharedPreferences.getBoolean("preferences_decode_1D_product", true)) {
                collection.addAll(l1.f16191a);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_1D_industrial", true)) {
                collection.addAll(l1.f16193c);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_QR", true)) {
                collection.addAll(l1.d);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_Data_Matrix", true)) {
                collection.addAll(l1.f);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_Aztec", false)) {
                collection.addAll(l1.e);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_PDF417", false)) {
                collection.addAll(l1.g);
            }
        }
        enumMap.put(m1.f16208c, collection);
        if (str != null) {
            enumMap.put(m1.h, str);
        }
        enumMap.put(m1.j, v6Var);
        o4.d("DecodeThread", "Hints: " + enumMap);
    }
}
