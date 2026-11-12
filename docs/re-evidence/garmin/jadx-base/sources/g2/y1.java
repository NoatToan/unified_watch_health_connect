package g2;

import android.os.Build;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f75309a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"g2/y1$a", "Lg2/x1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements x1 {
        @Override // g2.x1
        public final void a(t1.a aVar) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    static {
        a aVar;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                aVar = new a();
            } else {
                aVar = null;
            }
        } else {
            aVar = null;
        }
        f75309a = aVar;
    }
}
