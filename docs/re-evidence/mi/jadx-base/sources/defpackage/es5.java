package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes5.dex */
public final class es5 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eh3 f17014b;
    public final Map<DecodeHintType, Object> c;
    public Handler d;
    public sj3 e;
    public final CountDownLatch f = new CountDownLatch(1);

    public es5(Context context, eh3 eh3Var, sj3 sj3Var, Collection<BarcodeFormat> collection, Map<DecodeHintType, Object> map, String str, btk btkVar) {
        this.f17013a = context;
        this.f17014b = eh3Var;
        this.e = sj3Var;
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        this.c = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        if (collection == null || collection.isEmpty()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            collection = EnumSet.noneOf(BarcodeFormat.class);
            if (defaultSharedPreferences.getBoolean("preferences_decode_1D_product", true)) {
                collection.addAll(yr5.f40449b);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_1D_industrial", true)) {
                collection.addAll(yr5.c);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_QR", true)) {
                collection.addAll(yr5.e);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_Data_Matrix", true)) {
                collection.addAll(yr5.f);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_Aztec", false)) {
                collection.addAll(yr5.g);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_PDF417", false)) {
                collection.addAll(yr5.h);
            }
        }
        enumMap.put(DecodeHintType.POSSIBLE_FORMATS, collection);
        if (str != null) {
            enumMap.put(DecodeHintType.CHARACTER_SET, str);
        }
        enumMap.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, btkVar);
    }

    public Handler a() {
        try {
            this.f.await();
        } catch (InterruptedException unused) {
        }
        return this.d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.d = new zr5(this.f17013a, this.f17014b, this.e, this.c);
        this.f.countDown();
        Looper.loop();
    }
}
