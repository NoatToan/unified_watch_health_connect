package defpackage;

import android.content.Context;
import android.os.Handler;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
class znz extends g {
    private static znz ac;
    private Handler ab;
    private MagnesSettings al;
    private znn an;
    private Context am = null;
    private List<String> aa = new ArrayList();
    private long ad = 0;
    private boolean ae = false;
    private boolean ah = false;
    private boolean ag = false;
    private d ai = d.c();
    private HashMap<String, EditText> af = new HashMap<>();

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

    void b(znn znnVar, MagnesSettings magnesSettings, Handler handler) {
        this.an = znnVar;
        this.al = magnesSettings;
        this.ab = handler;
    }

    static class d {
        private static d i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f54374b = false;
        boolean d = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f54375c = false;
        boolean e = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f54373a = false;

        static d c() {
            d dVar;
            synchronized (d.class) {
                if (i == null) {
                    i = new d();
                }
                dVar = i;
            }
            return dVar;
        }

        private d() {
        }
    }

    static znz e() {
        znz znzVar;
        synchronized (znz.class) {
            if (ac == null) {
                ac = new znz();
            }
            znzVar = ac;
        }
        return znzVar;
    }

    znz() {
    }
}
