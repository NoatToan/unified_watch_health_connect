package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gx {
    public static final String a = gu.c("SU2hhcmVkUHJlZmVyZW5jZUFkaXU");
    private static gx f;
    private List<String> b;
    private String c;
    private final Context d;
    private final Handler e;

    private gx(Context context) {
        this.d = context.getApplicationContext();
        if (Looper.myLooper() == null) {
            this.e = new a(Looper.getMainLooper(), this);
        } else {
            this.e = new a(this);
        }
    }

    public static final class a extends Handler {
        private final WeakReference<gx> a;

        public a(gx gxVar) {
            this.a = new WeakReference<>(gxVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object obj;
            gx gxVar = this.a.get();
            if (gxVar == null || message == null || (obj = message.obj) == null) {
                return;
            }
            gxVar.a((String) obj, message.what);
        }

        public a(Looper looper, gx gxVar) {
            super(looper);
            this.a = new WeakReference<>(gxVar);
        }
    }

    public final void b(String str) {
        List<String> list = this.b;
        if (list != null) {
            list.clear();
            this.b.add(str);
        }
        a(str, 273);
    }

    public static gx a(Context context) {
        if (f == null) {
            synchronized (gx.class) {
                if (f == null) {
                    f = new gx(context);
                }
            }
        }
        return f;
    }

    public final void a(String str) {
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(final String str, final int i) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Thread() { // from class: com.amap.api.mapcore.util.gx.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    String strB = hd.b(str);
                    if (TextUtils.isEmpty(strB)) {
                        return;
                    }
                    if ((i & 1) > 0) {
                        try {
                            if (Build.VERSION.SDK_INT >= 23) {
                                Settings.System.putString(gx.this.d.getContentResolver(), gx.this.c, strB);
                            } else {
                                Settings.System.putString(gx.this.d.getContentResolver(), gx.this.c, strB);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if ((i & 16) > 0) {
                        gz.a(gx.this.d, gx.this.c, strB);
                    }
                    if ((i & 256) > 0) {
                        SharedPreferences.Editor editorEdit = gx.this.d.getSharedPreferences(gx.a, 0).edit();
                        editorEdit.putString(gx.this.c, strB);
                        if (Build.VERSION.SDK_INT >= 9) {
                            editorEdit.apply();
                        } else {
                            editorEdit.commit();
                        }
                    }
                }
            }.start();
            return;
        }
        String strB = hd.b(str);
        if (!TextUtils.isEmpty(strB)) {
            if ((i & 1) > 0) {
                try {
                    if (Build.VERSION.SDK_INT >= 23) {
                        Settings.System.putString(this.d.getContentResolver(), this.c, strB);
                    } else {
                        Settings.System.putString(this.d.getContentResolver(), this.c, strB);
                    }
                } catch (Exception unused) {
                }
            }
            if ((i & 16) > 0) {
                gz.a(this.d, this.c, strB);
            }
            if ((i & 256) > 0) {
                SharedPreferences.Editor editorEdit = this.d.getSharedPreferences(a, 0).edit();
                editorEdit.putString(this.c, strB);
                if (Build.VERSION.SDK_INT >= 9) {
                    editorEdit.apply();
                    return;
                }
                editorEdit.commit();
            }
        }
    }
}
