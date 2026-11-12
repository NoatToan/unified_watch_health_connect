package defpackage;

import android.content.Context;
import android.os.Vibrator;
import com.apprichtap.haptic.sync.SyncCallback;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class pa extends pk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static pa f45058c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private oz f45059a;
    private Context d;
    private pu f;
    private Vibrator h;
    private int j = -1;
    private int g = -1;
    private ExecutorService i = Executors.newSingleThreadExecutor();

    public void b() {
        try {
            po.e.d("RichTapUtils", "quit()");
            ExecutorService executorService = this.i;
            if (executorService != null) {
                executorService.shutdown();
            }
            Vibrator vibrator = this.h;
            if (vibrator != null) {
                vibrator.cancel();
            }
            oz ozVar = this.f45059a;
            if (ozVar != null) {
                ozVar.stop();
                this.f45059a.release();
            }
            pu puVar = this.f;
            if (puVar != null) {
                puVar.b();
            }
            f45058c = null;
            this.d = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void d(String str, int i, int i2, int i3, int i4, SyncCallback syncCallback) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Wrong parameter {string: " + str + "} is null!");
        }
        StringBuilder sb = new StringBuilder("playHaptic: loop:");
        sb.append(i);
        sb.append(",interval:");
        sb.append(i2);
        sb.append(",amplitude:");
        sb.append(i3);
        sb.append(",freq:");
        sb.append(i4);
        sb.append(",callback is null:");
        sb.append(syncCallback == null);
        po.e.d("RichTapUtils", sb.toString());
        this.i.execute(new e(str, i, i2, i3, i4, syncCallback));
    }

    public void d(String str, int i, int i2, int i3, int i4) {
        d(str, i, i2, i3, i4, null);
    }

    public void a(String str, int i, int i2) {
        d(str, i, 0, i2, 0);
    }

    public void b(String str, int i) {
        a(str, i, 255);
    }

    public boolean a() {
        return oz.c(2) || oz.c(1);
    }

    public pa a(Context context) {
        oz ozVarB;
        if (context == null) {
            throw new IllegalArgumentException("context shouldn't be null");
        }
        try {
            oz ozVar = this.f45059a;
            if (ozVar != null) {
                ozVar.release();
                this.f45059a = null;
            }
            pu puVar = this.f;
            if (puVar != null) {
                puVar.b();
            }
            Context applicationContext = context.getApplicationContext();
            this.d = applicationContext;
            if (applicationContext == null) {
                po.e.e("RichTapUtils", "fail to get application context!");
                this.d = context;
            }
            this.h = (Vibrator) this.d.getSystemService("vibrator");
            this.g = d();
            int i = 2;
            if (oz.c(2)) {
                int i2 = this.g;
                if (32 <= i2) {
                    this.f = new pu(this.d, i2);
                } else {
                    ozVarB = oz.b(this.d, 2);
                }
                this.j = i;
                po.e.b("RichTapUtils", "init , sdk version:" + pk.f45530b + " versionCode:" + pk.e + ", RichTap Core Major Version:" + this.g);
                return f45058c;
            }
            i = 1;
            if (oz.c(1)) {
                ozVarB = oz.b(this.d, 1);
            } else {
                this.f45059a = oz.b(this.d, 0);
                this.j = 0;
            }
            po.e.b("RichTapUtils", "init , sdk version:" + pk.f45530b + " versionCode:" + pk.e + ", RichTap Core Major Version:" + this.g);
            return f45058c;
            this.f45059a = ozVarB;
            this.j = i;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        po.e.b("RichTapUtils", "init , sdk version:" + pk.f45530b + " versionCode:" + pk.e + ", RichTap Core Major Version:" + this.g);
        return f45058c;
    }

    @Deprecated
    public int d() {
        return oz.c(this.d);
    }

    public static pa e() {
        if (f45058c == null) {
            synchronized (pa.class) {
                if (f45058c == null) {
                    f45058c = new pa();
                }
            }
        }
        return f45058c;
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f45060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f45061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f45062c;
        final /* synthetic */ String d;
        final /* synthetic */ int e;
        final /* synthetic */ SyncCallback h;

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (32 > pa.this.g || 2 != pa.this.j) {
                    pa.this.f45059a.reset();
                    pa.this.f45059a.setDataSource(this.d, this.f45062c, this.e, this.f45060a, this.f45061b, this.h);
                    pa.this.f45059a.prepare();
                    pa.this.f45059a.start();
                    return;
                }
                pa.this.f.d(this.d, this.f45060a, this.f45061b, this.f45062c, this.e, this.h);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        e(String str, int i, int i2, int i3, int i4, SyncCallback syncCallback) {
            this.d = str;
            this.f45060a = i;
            this.f45061b = i2;
            this.f45062c = i3;
            this.e = i4;
            this.h = syncCallback;
        }
    }

    private pa() {
    }
}
