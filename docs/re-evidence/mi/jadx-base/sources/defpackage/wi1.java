package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import com.facebook.soloader.b;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class wi1 extends b4n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f37995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37996b;
    public b c;

    public wi1(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.f37995a = applicationContext;
        if (applicationContext == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: ");
            sb.append(context.getApplicationInfo().nativeLibraryDir);
            this.f37995a = context;
        }
        this.f37996b = i;
        this.c = new b(new File(this.f37995a.getApplicationInfo().nativeLibraryDir), i);
    }

    public static File e(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // defpackage.b4n
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return this.c.a(str, i, threadPolicy);
    }

    @Override // defpackage.b4n
    public void b(int i) throws IOException {
        this.c.b(i);
    }

    @Override // defpackage.b4n
    public File c(String str) throws IOException {
        return this.c.c(str);
    }

    public boolean d() throws IOException {
        File file = this.c.f7609a;
        Context contextF = f();
        File fileE = e(contextF);
        if (file.equals(fileE)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Native library directory updated from ");
        sb.append(file);
        sb.append(" to ");
        sb.append(fileE);
        int i = this.f37996b | 1;
        this.f37996b = i;
        b bVar = new b(fileE, i);
        this.c = bVar;
        bVar.b(this.f37996b);
        this.f37995a = contextF;
        return true;
    }

    public Context f() {
        try {
            Context context = this.f37995a;
            return context.createPackageContext(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.b4n
    public String toString() {
        return this.c.toString();
    }
}
