package androidx.browser.trusted;

import android.content.pm.PackageManager;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f5316a;

    private b(d dVar) {
        this.f5316a = dVar;
    }

    public static b a(PackageManager packageManager, String str) {
        ArrayList arrayListA;
        try {
            arrayListA = new a().a(packageManager, str);
        } catch (PackageManager.NameNotFoundException unused) {
            arrayListA = null;
        }
        if (arrayListA != null) {
            try {
                return new b(d.a(str, arrayListA));
            } catch (IOException unused2) {
            }
        }
        return null;
    }

    public static b b(byte[] bArr) {
        return new b(d.b(bArr));
    }
}
