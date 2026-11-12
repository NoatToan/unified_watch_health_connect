package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class v1t {
    public static final String e = p0t.t("SU2hhcmVkUHJlZmVyZW5jZUFkaXU");
    public static v1t f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<String> f36393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36394b;
    public final Context c;
    public final Handler d;

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f36395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f36396b;

        public a(String str, int i) {
            this.f36395a = str;
            this.f36396b = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            String strH = d2t.h(this.f36395a);
            if (TextUtils.isEmpty(strH)) {
                return;
            }
            if ((this.f36396b & 1) > 0) {
                try {
                    if (Settings.System.canWrite(v1t.this.c)) {
                        Settings.System.putString(v1t.this.c.getContentResolver(), v1t.this.f36394b, strH);
                    }
                } catch (Exception unused) {
                }
            }
            if ((this.f36396b & 16) > 0) {
                y1t.b(v1t.this.c, v1t.this.f36394b, strH);
            }
            if ((this.f36396b & 256) > 0) {
                SharedPreferences.Editor editorEdit = v1t.this.c.getSharedPreferences(v1t.e, 0).edit();
                editorEdit.putString(v1t.this.f36394b, strH);
                editorEdit.apply();
            }
        }
    }

    public v1t(Context context) {
        this.c = context.getApplicationContext();
        if (Looper.myLooper() == null) {
            this.d = new b(Looper.getMainLooper(), this);
        } else {
            this.d = new b(this);
        }
    }

    public static v1t b(Context context) {
        if (f == null) {
            synchronized (v1t.class) {
                try {
                    if (f == null) {
                        f = new v1t(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public final void c(String str) {
        this.f36394b = str;
    }

    public final synchronized void d(String str, int i) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new a(str, i).start();
            return;
        }
        String strH = d2t.h(str);
        if (!TextUtils.isEmpty(strH)) {
            if ((i & 1) > 0) {
                try {
                    Settings.System.putString(this.c.getContentResolver(), this.f36394b, strH);
                } catch (Exception unused) {
                }
            }
            if ((i & 16) > 0) {
                y1t.b(this.c, this.f36394b, strH);
            }
            if ((i & 256) > 0) {
                SharedPreferences.Editor editorEdit = this.c.getSharedPreferences(e, 0).edit();
                editorEdit.putString(this.f36394b, strH);
                editorEdit.apply();
            }
        }
    }

    public final void g(String str) {
        List<String> list = this.f36393a;
        if (list != null) {
            list.clear();
            this.f36393a.add(str);
        }
        d(str, 273);
    }

    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<v1t> f36397a;

        public b(v1t v1tVar) {
            this.f36397a = new WeakReference<>(v1tVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object obj;
            v1t v1tVar = this.f36397a.get();
            if (v1tVar == null || message == null || (obj = message.obj) == null) {
                return;
            }
            v1tVar.d((String) obj, message.what);
        }

        public b(Looper looper, v1t v1tVar) {
            super(looper);
            this.f36397a = new WeakReference<>(v1tVar);
        }
    }
}
