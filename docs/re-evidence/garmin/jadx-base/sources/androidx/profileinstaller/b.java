package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.camera.camera2.internal.compat.j;
import gd.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f10221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f10222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.InterfaceC0142c f10223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f10224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f10225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f10227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10229i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public gd.a[] f10230j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f10231k;

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0142c interfaceC0142c, String str, String str2, String str3, File file) {
        byte[] bArr;
        this.f10221a = assetManager;
        this.f10222b = executor;
        this.f10223c = interfaceC0142c;
        this.f10226f = str;
        this.f10227g = str2;
        this.f10228h = str3;
        this.f10225e = file;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 31) {
            switch (i14) {
                case 28:
                case 29:
                case 30:
                    bArr = e.f76945b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = e.f76944a;
        }
        this.f10224d = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f10223c.a();
            return null;
        }
    }

    public final void b(int i14, Serializable serializable) {
        this.f10222b.execute(new j(this, i14, serializable, 9));
    }
}
