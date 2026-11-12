package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.onetrack.OneTrack;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class tos {
    public static volatile tos c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue<b> f34897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f34898b;

    public class a extends b {
        public a() {
            super();
        }

        @Override // tos.b, z5s.b
        public void b() {
            tos.this.i();
        }
    }

    public class b extends z5s.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f34899a = System.currentTimeMillis();

        public b() {
        }

        @Override // z5s.b
        public void b() {
        }

        public boolean d() {
            return true;
        }

        public final boolean e() {
            return System.currentTimeMillis() - this.f34899a > 172800000;
        }
    }

    public class c extends b {
        public String c;
        public String d;
        public File e;
        public int f;
        public boolean g;
        public boolean h;

        public c(String str, String str2, File file, boolean z) {
            super();
            this.c = str;
            this.d = str2;
            this.e = file;
            this.h = z;
        }

        @Override // tos.b, z5s.b
        public void b() {
            try {
                if (f()) {
                    HashMap map = new HashMap();
                    map.put("uid", rds.g());
                    map.put("token", this.d);
                    map.put(OneTrack.Param.NET, obs.j(tos.this.f34898b));
                    obs.n(this.c, map, this.e, "file");
                }
                this.g = true;
            } catch (IOException unused) {
            }
        }

        @Override // z5s.b
        public void c() {
            if (!this.g) {
                int i = this.f + 1;
                this.f = i;
                if (i < 3) {
                    tos.this.f34897a.add(this);
                }
            }
            if (this.g || this.f >= 3) {
                this.e.delete();
            }
            tos.this.e((1 << this.f) * 1000);
        }

        @Override // tos.b
        public boolean d() {
            return obs.y(tos.this.f34898b) || (this.h && obs.v(tos.this.f34898b));
        }

        public final boolean f() {
            int i;
            int i2 = 0;
            SharedPreferences sharedPreferences = tos.this.f34898b.getSharedPreferences("log.timestamp", 0);
            String string = sharedPreferences.getString("log.requst", "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject(string);
                jCurrentTimeMillis = jSONObject.getLong("time");
                i = jSONObject.getInt("times");
            } catch (JSONException unused) {
                i = 0;
            }
            if (System.currentTimeMillis() - jCurrentTimeMillis >= 86400000) {
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                if (i > 10) {
                    return false;
                }
                i2 = i;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("time", jCurrentTimeMillis);
                jSONObject2.put("times", i2 + 1);
                sharedPreferences.edit().putString("log.requst", jSONObject2.toString()).commit();
            } catch (JSONException e) {
                x9s.B("JSONException on put " + e.getMessage());
            }
            return true;
        }
    }

    public tos(Context context) {
        ConcurrentLinkedQueue<b> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f34897a = concurrentLinkedQueue;
        this.f34898b = context;
        concurrentLinkedQueue.add(new a());
        j(0L);
    }

    public static tos b(Context context) {
        if (c == null) {
            synchronized (tos.class) {
                try {
                    if (c == null) {
                        c = new tos(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c.f34898b = context;
        return c;
    }

    public void d() {
        k();
        e(0L);
    }

    public final void e(long j) {
        b bVarPeek = this.f34897a.peek();
        if (bVarPeek == null || !bVarPeek.d()) {
            return;
        }
        j(j);
    }

    public void h(String str, String str2, Date date, Date date2, int i, boolean z) {
        this.f34897a.add(new wos(this, i, date, date2, str, str2, z));
        j(0L);
    }

    public final void i() {
        try {
            File file = new File(this.f34898b.getFilesDir() + "/.logcache");
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (NullPointerException unused) {
        }
    }

    public final void j(long j) {
        if (this.f34897a.isEmpty()) {
            return;
        }
        vys.b(new yos(this), j);
    }

    public final void k() {
        while (!this.f34897a.isEmpty()) {
            b bVarPeek = this.f34897a.peek();
            if (bVarPeek != null) {
                if (!bVarPeek.e() && this.f34897a.size() <= 6) {
                    return;
                }
                x9s.B("remove Expired task");
                this.f34897a.remove(bVarPeek);
            }
        }
    }
}
