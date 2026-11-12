package com.baidu.idl.statistics;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.baidu.idl.license.License;
import com.baidu.idl.util.FileUtil;
import com.baidu.idl.util.NetUtil;
import com.baidu.idl.util.StuLogEx;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Statistics {
    private static final String k = "AuthenticationStatistics";
    private static final String l = "http://sdkss.shitu.baidu.com/cgi-bin/sdkstat.py";
    private static final String m = "as";
    private static final int n = 1;
    private static final int o = 2;
    private static final long p = 3000;
    private Context a;
    private String b;
    private String c;
    private String d;
    private String e;
    private boolean f;
    private File g;
    private final Properties h;
    private HandlerThread i;
    private Handler j;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            int i = message.what;
            if (i == 1 || i == 2) {
                FileUtil.savePropertiesFile(Statistics.this.g, Statistics.this.h);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Properties a;

        public class a extends NetUtil.RequestAdapter<d> {
            public a() {
            }

            @Override // com.baidu.idl.util.NetUtil.RequestAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, d dVar, Exception exc) {
                if (i != 0) {
                    StuLogEx.e(Statistics.k, exc.getMessage(), exc);
                } else if (dVar.a != 0) {
                    StuLogEx.e(Statistics.k, dVar.b);
                } else {
                    b.this.a.clear();
                }
                b bVar = b.this;
                Statistics.this.i(bVar.a);
            }

            @Override // com.baidu.idl.util.NetUtil.RequestAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d parseResponse(InputStream inputStream) throws JSONException, IOException {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    } catch (Throwable th) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused) {
                        }
                        throw th;
                    }
                }
                byteArrayOutputStream.flush();
                JSONObject jSONObject = new JSONObject(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                d dVar = new d(jSONObject.getInt("errno"), jSONObject.getString("errnmsg"));
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused2) {
                }
                return dVar;
            }

            @Override // com.baidu.idl.util.NetUtil.RequestAdapter
            public String getRequestString() {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : b.this.a.entrySet()) {
                    String str = (String) entry.getKey();
                    for (String str2 : ((String) entry.getValue()).split(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                        sb.append(Statistics.this.b);
                        sb.append(" ");
                        sb.append(Statistics.this.c);
                        sb.append(" ");
                        sb.append(str);
                        sb.append(" ");
                        sb.append(str2);
                        sb.append(" ");
                        sb.append(Statistics.this.e);
                        sb.append(" ");
                        sb.append(Statistics.this.d);
                        sb.append("\n");
                    }
                }
                return sb.toString();
            }

            @Override // com.baidu.idl.util.NetUtil.RequestAdapter
            public String getURL() {
                return Statistics.l;
            }
        }

        public b(Properties properties) {
            this.a = properties;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            NetUtil.uploadData(new a());
        }
    }

    public static final class c {
        private static final Statistics a = new Statistics(null);

        private c() {
        }
    }

    public static final class d {
        public int a;
        public String b;

        public d(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    public /* synthetic */ Statistics(a aVar) {
        this();
    }

    public static Statistics getInstance() {
        return c.a;
    }

    private boolean h() {
        File file = new File(this.a.getFilesDir(), "as");
        this.g = file;
        return FileUtil.createFile(file) && FileUtil.loadPropertiesFile(this.g, this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i(Properties properties) {
        for (Map.Entry entry : properties.entrySet()) {
            String string = entry.getKey().toString();
            String string2 = entry.getValue().toString();
            if (this.h.containsKey(string)) {
                this.h.setProperty(string, String.format(Locale.getDefault(), "%s-%s", string2, this.h.getProperty(string)));
            } else {
                this.h.setProperty(string, string2);
            }
        }
        j(true);
    }

    private void j(boolean z) {
        if (z) {
            this.j.removeMessages(1);
            this.j.sendEmptyMessage(1);
        } else {
            this.j.removeMessages(2);
            this.j.sendEmptyMessageDelayed(2, 3000L);
        }
    }

    public boolean init(Context context, String str) {
        if (this.f) {
            return true;
        }
        if (context == null || str == null || "".equals(str)) {
            throw new IllegalArgumentException("The params is invalid!");
        }
        this.a = context;
        this.b = str;
        this.d = License.getAlgorithmVersion();
        this.e = License.getAuthorityVersion();
        HandlerThread handlerThread = new HandlerThread("workerThread");
        this.i = handlerThread;
        handlerThread.start();
        this.j = new a(this.i.getLooper());
        if (!h()) {
            return false;
        }
        if (NetUtil.isConnected(context) && this.h.size() > 0) {
            Properties properties = (Properties) this.h.clone();
            this.h.clear();
            new Thread(new b(properties)).start();
        }
        this.f = true;
        return true;
    }

    public synchronized void triggerEvent(String str) {
    }

    private Statistics() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = null;
        this.h = new Properties();
        this.i = null;
        this.j = null;
    }
}
