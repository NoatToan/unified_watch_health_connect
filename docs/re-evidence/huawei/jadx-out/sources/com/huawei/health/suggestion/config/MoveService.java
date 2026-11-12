package com.huawei.health.suggestion.config;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.buh;
import defpackage.iej;
import defpackage.ifp;
import defpackage.xkd;
import defpackage.xkf;
import health.compact.a.LogAnonymous;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes31.dex */
public class MoveService extends IntentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8851b;
    private boolean d;

    public MoveService() {
        super("MoveService");
        this.f8850a = false;
        this.d = false;
        this.f8851b = false;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        LogUtil.d("Suggestion_MoveService", "onCreate()");
        super.onCreate();
    }

    @Override // android.app.IntentService, android.app.Service
    public void onStart(Intent intent, int i) {
        LogUtil.a("Suggestion_MoveService", "onStart(intent, startId), mIsCopyDoing = ", Boolean.valueOf(b()), ", mIsDeleteDoing = ", Boolean.valueOf(a()), ", mIsCopyCancel = ", Boolean.valueOf(e()));
        if (intent == null) {
            LogUtil.j("Suggestion_MoveService", "onStart intent == null");
            return;
        }
        int intExtra = intent.getIntExtra("TYPE_KEY", 0);
        LogUtil.d("Suggestion_MoveService", "onStart(intent, startId)  typeValue = ", Integer.valueOf(intExtra));
        if (intExtra == 1) {
            if (b() || a()) {
                return;
            } else {
                b(true);
            }
        } else if (intExtra != 2) {
            LogUtil.j("Suggestion_MoveService", "onStart else typeValue = ", Integer.valueOf(intExtra));
            return;
        } else {
            if (a()) {
                return;
            }
            if (b()) {
                c(true);
            }
            d(true);
        }
        super.onStart(intent, i);
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        LogUtil.a("Suggestion_MoveService", "onHandleIntent(Intent intent), mIsCopyDoing = ", Boolean.valueOf(b()), ", mIsDeleteDoing = ", Boolean.valueOf(a()), ", mIsCopyCancel = ", Boolean.valueOf(e()));
        if (intent == null) {
            LogUtil.j("Suggestion_MoveService", "onHandleIntent(Intent intent) intent == null");
            return;
        }
        int intExtra = intent.getIntExtra("TYPE_KEY", 0);
        LogUtil.d("Suggestion_MoveService", "onHandleIntent(Intent intent)  typeValue = ", Integer.valueOf(intExtra));
        if (intExtra == 1) {
            if (!i() || xkf.i() || d()) {
                xkf.l();
            }
            b(false);
            c(false);
        } else if (intExtra != 2) {
            LogUtil.j("Suggestion_MoveService", "onHandleIntent type abnormal");
        } else {
            c();
            xkf.k();
            xkf.l();
            h();
            d(false);
        }
        LogUtil.d("Suggestion_MoveService", "onHandleIntent end");
    }

    private void c() {
        c(xkf.f());
        if (i()) {
            for (String str : xkf.g()) {
                c(str);
            }
        }
    }

    private void h() {
        LocalBroadcastManager.getInstance().sendBroadcast(new Intent("com.huawei.health.suggestion.config.MoveService.DEL_ACTION"));
    }

    private void c(String str) {
        for (String str2 : xkf.e()) {
            c(new File(str + "/" + str2));
        }
    }

    private static void c(File file) {
        if (file == null || !file.exists() || !file.isDirectory()) {
            LogUtil.j("Suggestion_MoveService", "deleteDirWithFile directory == null || !directory.exists() || !directory.isDirectory()");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            LogUtil.j("Suggestion_MoveService", "deleteDirWithFile files == null");
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2 != null) {
                if (file2.isFile()) {
                    LogUtil.d("Suggestion_MoveService", "delFile = ", Boolean.valueOf(file2.delete()));
                } else if (!file2.isDirectory()) {
                    LogUtil.j("Suggestion_MoveService", "deleteDirWithFile Abnormal");
                } else {
                    c(file2);
                }
            }
        }
        LogUtil.a("Suggestion_MoveService", "delFileDir = ", Boolean.valueOf(file.delete()));
    }

    private boolean d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strF = xkf.f();
        String[] strArrG = xkf.g();
        String[] strArrE = xkf.e();
        boolean zD = false;
        for (String str : strArrG) {
            for (String str2 : strArrE) {
                zD = d(new File(str + "/" + str2), new File(strF + "/" + str2));
                if (!zD) {
                    LogUtil.d("Suggestion_MoveService", "isCopyDone = false");
                    return false;
                }
            }
        }
        LogUtil.d("Suggestion_MoveService", "onHandleIntent copy time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ", isCopyDone = ", Boolean.valueOf(zD));
        return true;
    }

    private boolean d(File file, File file2) {
        String str;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            LogUtil.d("Suggestion_MoveService", "onHandleIntent files == null");
            return true;
        }
        LogUtil.d("Suggestion_MoveService", "files = ", Integer.valueOf(fileArrListFiles.length));
        for (File file3 : fileArrListFiles) {
            if (file3 == null) {
                LogUtil.d("Suggestion_MoveService", "onHandleIntent fileFrom == null");
            } else {
                if (e()) {
                    LogUtil.j("Suggestion_MoveService", "isCopyCancel() = true");
                    return false;
                }
                if (file3.isFile()) {
                    try {
                        str = file2.getCanonicalPath() + "/" + file3.getName();
                    } catch (IOException e) {
                        LogUtil.j("Suggestion_MoveService", LogAnonymous.b(e));
                        str = "";
                    }
                    File file4 = new File(str);
                    if (file4.exists()) {
                        xkf.c(file4.getName(), file4.lastModified());
                    } else if (e(file3)) {
                        try {
                            File file5 = new File(file4.getCanonicalFile() + ".temp");
                            LogUtil.d("Suggestion_MoveService", "fileToTemp = ", file5.getCanonicalPath());
                            boolean zD = iej.d(file3, file5);
                            if (zD && file5.renameTo(file4)) {
                                LogUtil.d("Suggestion_MoveService", "fileToTemp.renameTo(fileTo) = true");
                                xkf.c(file4.getName(), file4.lastModified());
                            } else if (!zD || file5.renameTo(file4)) {
                                LogUtil.j("Suggestion_MoveService", "isCopy = false  ", file3.getName());
                            } else {
                                LogUtil.d("Suggestion_MoveService", "fileToTemp.renameTo(fileTo) = false");
                            }
                        } catch (IOException e2) {
                            LogUtil.e("Suggestion_MoveService", "exception = ", LogAnonymous.b(e2));
                        }
                    }
                }
            }
        }
        return true;
    }

    private static boolean e(File file) {
        if (xkf.b(file, xkf.m(file.getName()))) {
            return true;
        }
        return xkf.a(file.getName(), buh.e(file.getName()));
    }

    private void c(boolean z) {
        synchronized (this) {
            this.f8851b = z;
        }
    }

    private boolean e() {
        boolean z;
        synchronized (this) {
            z = this.f8851b;
        }
        return z;
    }

    private void d(boolean z) {
        synchronized (this) {
            this.d = z;
        }
    }

    private boolean a() {
        boolean z;
        synchronized (this) {
            z = this.d;
        }
        return z;
    }

    private void b(boolean z) {
        synchronized (this) {
            this.f8850a = z;
        }
    }

    private boolean b() {
        boolean z;
        synchronized (this) {
            z = this.f8850a;
        }
        return z;
    }

    private static boolean i() {
        boolean zH = xkd.d().h();
        LogUtil.d("Suggestion_MoveService", "isSdPermission() = ", Boolean.valueOf(zH));
        return zH;
    }

    public static void a(Context context, int i) {
        if (context == null) {
            LogUtil.j("Suggestion_MoveService", "startService context == null");
            return;
        }
        LogUtil.d("Suggestion_MoveService", "startService type = ", Integer.valueOf(i));
        try {
            if (i == 1) {
                if (xkf.h() || xkf.i()) {
                    return;
                }
                Intent intent = new Intent(context, (Class<?>) MoveService.class);
                intent.putExtra("TYPE_KEY", 1);
                context.startService(intent);
                LogUtil.d("Suggestion_MoveService", "startService TYPE_COPE");
                return;
            }
            if (i == 2) {
                Intent intent2 = new Intent(context, (Class<?>) MoveService.class);
                intent2.putExtra("TYPE_KEY", 2);
                context.startService(intent2);
                buh.d("clear_version", String.valueOf(ifp.e((Object) buh.e("clear_version")) + 1));
                LogUtil.j("Suggestion_MoveService", "startService type TYPE_DELETE");
                return;
            }
            LogUtil.j("Suggestion_MoveService", "startService type abnormal");
        } catch (IllegalStateException e) {
            e = e;
            LogUtil.e("Suggestion_MoveService", "startService exception:", LogAnonymous.b(e));
        } catch (SecurityException e2) {
            e = e2;
            LogUtil.e("Suggestion_MoveService", "startService exception:", LogAnonymous.b(e));
        }
    }
}
