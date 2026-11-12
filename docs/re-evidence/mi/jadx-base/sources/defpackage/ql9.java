package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ql9 implements Runnable {
    public static final String e = zpd.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31621a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f31622b = new Handler(Looper.getMainLooper());
    public final Map<Integer, d> c = new HashMap();
    public final Map<String, nok> d;

    public class a extends uok {
        public a() {
        }

        @Override // defpackage.nok
        public void a(Object obj, nrk nrkVar) {
            synchronized (ql9.this.c) {
                try {
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        if (jSONObject == null) {
                            throw new Exception("params must be an object { mode: string, filename: string }");
                        }
                        String strOptString = jSONObject.optString("mode");
                        if (strOptString == null) {
                            throw new Exception("missing params.mode");
                        }
                        String strOptString2 = jSONObject.optString("filename");
                        if (strOptString2 == null) {
                            throw new Exception("missing params.filename");
                        }
                        if (!strOptString.equals("r")) {
                            throw new IllegalArgumentException("unsupported mode: " + strOptString);
                        }
                        nrkVar.b(Integer.valueOf(ql9.this.c(strOptString2)));
                    } catch (Exception e) {
                        nrkVar.a(e.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class b extends uok {
        public b() {
        }

        @Override // defpackage.nok
        public void a(Object obj, nrk nrkVar) {
            synchronized (ql9.this.c) {
                try {
                    try {
                        if (!(obj instanceof Number)) {
                            throw new Exception("params must be a file handle");
                        }
                        Map map = ql9.this.c;
                        Integer num = (Integer) obj;
                        num.intValue();
                        d dVar = (d) map.get(num);
                        if (dVar == null) {
                            throw new Exception("invalid file handle, it might have timed out");
                        }
                        Map map2 = ql9.this.c;
                        Integer num2 = (Integer) obj;
                        num2.intValue();
                        map2.remove(num2);
                        dVar.a();
                        nrkVar.b("");
                    } catch (Exception e) {
                        nrkVar.a(e.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class c extends uok {
        public c() {
        }

        @Override // defpackage.nok
        public void a(Object obj, nrk nrkVar) {
            synchronized (ql9.this.c) {
                try {
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        if (jSONObject == null) {
                            throw new Exception("params must be an object { file: handle, size: number }");
                        }
                        int iOptInt = jSONObject.optInt("file");
                        if (iOptInt == 0) {
                            throw new Exception("invalid or missing file handle");
                        }
                        int iOptInt2 = jSONObject.optInt(MediaStoreUtil.MediaInfo.SIZE);
                        if (iOptInt2 == 0) {
                            throw new Exception("invalid or missing read size");
                        }
                        d dVar = (d) ql9.this.c.get(Integer.valueOf(iOptInt));
                        if (dVar == null) {
                            throw new Exception("invalid file handle, it might have timed out");
                        }
                        nrkVar.b(dVar.d(iOptInt2));
                    } catch (Exception e) {
                        nrkVar.a(e.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FileInputStream f31626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f31627b = System.currentTimeMillis() + 30000;

        public d(String str) throws FileNotFoundException {
            this.f31626a = new FileInputStream(str);
        }

        public void a() throws IOException {
            this.f31626a.close();
        }

        public boolean b() {
            return System.currentTimeMillis() >= this.f31627b;
        }

        public final void c() {
            this.f31627b = System.currentTimeMillis() + 30000;
        }

        public String d(int i) throws IOException {
            c();
            byte[] bArr = new byte[i];
            return Base64.encodeToString(bArr, 0, this.f31626a.read(bArr), 0);
        }
    }

    public ql9() {
        HashMap map = new HashMap();
        this.d = map;
        map.put("fopen", new a());
        map.put("fclose", new b());
        map.put("fread", new c());
    }

    public final int c(String str) throws FileNotFoundException {
        int i = this.f31621a;
        this.f31621a = i + 1;
        this.c.put(Integer.valueOf(i), new d(str));
        if (this.c.size() == 1) {
            this.f31622b.postDelayed(this, 30000L);
        }
        return i;
    }

    public Map<String, nok> d() {
        return this.d;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.c) {
            Iterator<d> it = this.c.values().iterator();
            while (it.hasNext()) {
                d next = it.next();
                if (next.b()) {
                    it.remove();
                    try {
                        next.a();
                    } catch (IOException e2) {
                        cm8.i(e, "closing expired file failed: " + e2.toString());
                    }
                }
            }
            if (!this.c.isEmpty()) {
                this.f31622b.postDelayed(this, 30000L);
            }
        }
    }
}
