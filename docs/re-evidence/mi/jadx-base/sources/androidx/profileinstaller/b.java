package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.aa8;
import defpackage.wu6;
import defpackage.xbi;
import defpackage.ybi;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f2771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f2772b;
    public final c.InterfaceC0065c c;
    public final File e;
    public final String f;
    public final String g;
    public final String h;
    public wu6[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f2773k;
    public boolean i = false;
    public final byte[] d = d();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public b(AssetManager assetManager, Executor executor, c.InterfaceC0065c interfaceC0065c, String str, String str2, String str3, File file) {
        this.f2771a = assetManager;
        this.f2772b = executor;
        this.c = interfaceC0065c;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.e = file;
    }

    public static byte[] d() {
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            return null;
        }
        switch (i) {
            case 26:
                return ybi.d;
            case 27:
                return ybi.c;
            case 28:
            case 29:
            case 30:
                return ybi.f40018b;
            case 31:
            case 32:
            case 33:
                return ybi.f40017a;
            default:
                return null;
        }
    }

    public static boolean k() {
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            return false;
        }
        switch (i) {
            case 31:
            case 32:
            case 33:
                return true;
            default:
                return false;
        }
    }

    public final b b(wu6[] wu6VarArr, byte[] bArr) {
        try {
            InputStream inputStreamH = h(this.f2771a, this.h);
            if (inputStreamH == null) {
                if (inputStreamH != null) {
                    inputStreamH.close();
                }
                return null;
            }
            try {
                this.j = xbi.q(inputStreamH, xbi.o(inputStreamH, xbi.f38945b), bArr, wu6VarArr);
                inputStreamH.close();
                return this;
            } catch (Throwable th) {
                try {
                    inputStreamH.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e) {
            this.c.a(9, e);
        } catch (IOException e2) {
            this.c.a(7, e2);
        } catch (IllegalStateException e3) {
            this.j = null;
            this.c.a(8, e3);
        }
    }

    public final void c() {
        if (!this.i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean e() {
        if (this.d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.e.canWrite()) {
            this.i = true;
            return true;
        }
        l(4, null);
        return false;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.g);
        } catch (FileNotFoundException e) {
            this.c.a(6, e);
            return null;
        } catch (IOException e2) {
            this.c.a(7, e2);
            return null;
        }
    }

    public final /* synthetic */ void g(int i, Object obj) {
        this.c.a(i, obj);
    }

    public final InputStream h(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.c.b(5, null);
            }
            return null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public b i() {
        b bVarB;
        c();
        if (this.d == null) {
            return this;
        }
        InputStream inputStreamF = f(this.f2771a);
        if (inputStreamF != null) {
            this.j = j(inputStreamF);
        }
        wu6[] wu6VarArr = this.j;
        return (wu6VarArr == null || !k() || (bVarB = b(wu6VarArr, this.d)) == null) ? this : bVarB;
    }

    public final wu6[] j(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        wu6[] wu6VarArrW = xbi.w(inputStream, xbi.o(inputStream, xbi.f38944a), this.f);
                        try {
                            return wu6VarArrW;
                        } catch (IOException e) {
                            return wu6VarArrW;
                        }
                    } catch (IOException e2) {
                        this.c.a(7, e2);
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    this.c.a(8, e3);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e4) {
                this.c.a(7, e4);
                inputStream.close();
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.c.a(7, e5);
            }
        }
    }

    public final void l(final int i, final Object obj) {
        this.f2772b.execute(new Runnable() { // from class: sa6
            @Override // java.lang.Runnable
            public final void run() {
                this.f33450a.g(i, obj);
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public b m() {
        wu6[] wu6VarArr = this.j;
        byte[] bArr = this.d;
        if (wu6VarArr != null && bArr != null) {
            c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    xbi.E(byteArrayOutputStream, bArr);
                    if (!xbi.B(byteArrayOutputStream, bArr, wu6VarArr)) {
                        this.c.a(5, null);
                        this.j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f2773k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.j = null;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                this.c.a(7, e);
            } catch (IllegalStateException e2) {
                this.c.a(8, e2);
            }
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean n() {
        byte[] bArr = this.f2773k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.e);
                    try {
                        aa8.l(byteArrayInputStream, fileOutputStream);
                        l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        this.f2773k = null;
                        this.j = null;
                        return true;
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                this.f2773k = null;
                this.j = null;
                throw th5;
            }
        } catch (FileNotFoundException e) {
            l(6, e);
            this.f2773k = null;
            this.j = null;
            return false;
        } catch (IOException e2) {
            l(7, e2);
            this.f2773k = null;
            this.j = null;
            return false;
        }
    }
}
