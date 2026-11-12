package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2883a = iy.c("SU2hhcmVkUHJlZmVyZW5jZUFkaXU");
    private static ji f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f2884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f2885c;
    private final Context d;
    private final Handler e;

    public static ji a(Context context) {
        if (f == null) {
            synchronized (ji.class) {
                if (f == null) {
                    f = new ji(context);
                }
            }
        }
        return f;
    }

    private ji(Context context) {
        this.d = context.getApplicationContext();
        if (Looper.myLooper() == null) {
            this.e = new a(Looper.getMainLooper(), this);
        } else {
            this.e = new a(this);
        }
    }

    public final void a(String str) {
        this.f2885c = str;
    }

    public final void b(String str) {
        List<String> list = this.f2884b;
        if (list != null) {
            list.clear();
            this.f2884b.add(str);
        }
        a(str, OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.amap.api.col.3sl.ji$1] */
    public void a(final String str, final int i) {
        synchronized (this) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                new Thread() { // from class: com.amap.api.col.3sl.ji.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public final void run() {
                        String strB = jo.b(str);
                        if (TextUtils.isEmpty(strB)) {
                            return;
                        }
                        if ((i & 1) > 0) {
                            try {
                                if (Settings.System.canWrite(ji.this.d)) {
                                    Settings.System.putString(ji.this.d.getContentResolver(), ji.this.f2885c, strB);
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if ((i & 16) > 0) {
                            jk.a(ji.this.d, ji.this.f2885c, strB);
                        }
                        if ((i & 256) > 0) {
                            SharedPreferences.Editor editorEdit = ji.this.d.getSharedPreferences(ji.f2883a, 0).edit();
                            editorEdit.putString(ji.this.f2885c, strB);
                            editorEdit.apply();
                        }
                    }
                }.start();
                return;
            }
            String strB = jo.b(str);
            if (!TextUtils.isEmpty(strB)) {
                if ((i & 1) > 0) {
                    try {
                        Settings.System.putString(this.d.getContentResolver(), this.f2885c, strB);
                    } catch (Exception unused) {
                    }
                }
                if ((i & 16) > 0) {
                    jk.a(this.d, this.f2885c, strB);
                }
                if ((i & 256) > 0) {
                    SharedPreferences.Editor editorEdit = this.d.getSharedPreferences(f2883a, 0).edit();
                    editorEdit.putString(this.f2885c, strB);
                    editorEdit.apply();
                }
            }
        }
    }

    static final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<ji> f2889a;

        a(ji jiVar) {
            this.f2889a = new WeakReference<>(jiVar);
        }

        a(Looper looper, ji jiVar) {
            super(looper);
            this.f2889a = new WeakReference<>(jiVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ji jiVar = this.f2889a.get();
            if (jiVar == null || message == null || message.obj == null) {
                return;
            }
            jiVar.a((String) message.obj, message.what);
        }
    }
}
