package defpackage;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b4n {
    public abstract int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException;

    public void b(int i) throws IOException {
    }

    public abstract File c(String str) throws IOException;

    public String toString() {
        return getClass().getName();
    }
}
