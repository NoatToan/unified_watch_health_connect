package com.xiaomi.ai.android.core;

import android.text.TextUtils;
import com.xiaomi.ai.log.Logger;
import com.xiaomi.ai.log.LoggerHooker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ThreadPoolExecutor;
import org.cybergarage.upnp.std.av.server.ContentDirectory;

/* JADX INFO: loaded from: classes18.dex */
public class g implements LoggerHooker {
    private com.xiaomi.ai.android.track.i a;
    private SimpleDateFormat b = new SimpleDateFormat("yyy-MM-dd HH:mm:ss.SSS", Locale.CHINA);
    private Date c = new Date();
    private Runnable d = new Runnable() { // from class: com.xiaomi.ai.android.core.g.1
        @Override // java.lang.Runnable
        public void run() {
            if (g.this.a != null) {
                g.this.a.a(true);
            }
        }
    };
    private Runnable e = new Runnable() { // from class: com.xiaomi.ai.android.core.g.2
        @Override // java.lang.Runnable
        public void run() {
            if (g.this.a != null) {
                g.this.a.a(false);
            }
        }
    };

    public g(d dVar) {
        this.a = new com.xiaomi.ai.android.track.i(dVar);
    }

    private String a() {
        this.c.setTime(System.currentTimeMillis());
        return this.b.format(this.c);
    }

    private void a(String str, String str2, String str3) {
        if (this.a == null) {
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            Logger.b("LogUploadManager", "can not send empty msg!", false);
            return;
        }
        if (this.a.a("[" + a() + "][" + str + "]" + str2 + ": " + str3)) {
            a(true);
        }
    }

    public void a(boolean z) {
        ThreadPoolExecutor threadPoolExecutor;
        Runnable runnable;
        if (this.a == null) {
            return;
        }
        if (z) {
            threadPoolExecutor = com.xiaomi.ai.b.c.b;
            runnable = this.d;
        } else {
            threadPoolExecutor = com.xiaomi.ai.b.c.b;
            runnable = this.e;
        }
        threadPoolExecutor.execute(runnable);
    }

    @Override // com.xiaomi.ai.log.LoggerHooker
    public void d(String str, String str2) {
        a("DEBUG", str, str2);
    }

    @Override // com.xiaomi.ai.log.LoggerHooker
    public void e(String str, String str2) {
        a(ContentDirectory.ERROR, str, str2);
    }

    @Override // com.xiaomi.ai.log.LoggerHooker
    public void i(String str, String str2) {
        a("INFO", str, str2);
    }

    @Override // com.xiaomi.ai.log.LoggerHooker
    public void w(String str, String str2) {
        a("WARN", str, str2);
    }
}
