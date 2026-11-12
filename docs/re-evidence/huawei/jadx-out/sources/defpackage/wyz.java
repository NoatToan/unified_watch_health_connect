package defpackage;

import android.util.Base64;
import health.compact.a.WhiteBoxManager;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes20.dex */
public class wyz {
    public static String b(int i, int i2, int i3, int i4) {
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        return new String(whiteBoxManagerB.a(Base64.decode(whiteBoxManagerB.a(i, i2) + whiteBoxManagerB.a(i, i3) + whiteBoxManagerB.a(i, i4), 0)), StandardCharsets.UTF_8);
    }
}
