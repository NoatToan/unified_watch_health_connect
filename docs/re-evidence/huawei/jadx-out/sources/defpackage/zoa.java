package defpackage;

import android.os.Handler;
import java.util.Timer;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.g;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
class zoa extends g {
    private static zoa ac;
    private MagnesSettings ae;
    private znn ai;
    private Handler al;
    private JSONObject aj = new JSONObject();
    private JSONArray an = new JSONArray();
    private JSONArray am = new JSONArray();
    private boolean aa = false;
    private int ab = 0;
    private boolean ad = false;
    private boolean ag = true;
    private int ah = 0;
    private String af = "";
    private Timer ak = new Timer();

    @Override // lib.android.paypal.com.magnessdk.g
    public JSONObject a() {
        return null;
    }

    @Override // lib.android.paypal.com.magnessdk.g
    public JSONObject a(MagnesSettings magnesSettings, znn znnVar, zno znoVar) {
        return null;
    }

    @Override // lib.android.paypal.com.magnessdk.g
    public void a(int i, MagnesSettings magnesSettings) {
    }

    void c(znn znnVar, MagnesSettings magnesSettings, Handler handler) {
        this.ai = znnVar;
        this.ae = magnesSettings;
        this.al = handler;
    }

    static zoa d() {
        zoa zoaVar;
        synchronized (zoa.class) {
            if (ac == null) {
                ac = new zoa();
            }
            zoaVar = ac;
        }
        return zoaVar;
    }

    zoa() {
    }
}
