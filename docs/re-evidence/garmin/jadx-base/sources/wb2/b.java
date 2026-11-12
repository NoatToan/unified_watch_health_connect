package wb2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f183933a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f183934b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f183935c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f183936d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f183937e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f183938f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StringBuilder f183939g = new StringBuilder();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f183940h = -1;

    public enum a {
        LISTING,
        LISTED,
        EXTRACTING,
        EXTRACTED,
        POSTING,
        POSTED,
        POSTED_AWAITING_PROCESSING,
        ARCHIVING,
        ARCHIVED,
        BROWSING,
        BROWSED,
        DOWNLOADING,
        DOWNLOADED,
        SAVING,
        SAVED,
        ACKNOWLEDGING,
        ACKED
    }

    public final void a() {
        StringBuilder sb3 = this.f183933a;
        sb3.append("- ");
        sb3.append(this.f183935c);
        sb3.append(" (");
        sb3.append(String.format("%02X", Byte.valueOf(this.f183936d)));
        sb3.append("/");
        sb3.append(this.f183937e);
        if (this.f183940h != -1) {
            sb3.append("/");
            sb3.append(this.f183940h);
            sb3.append("B");
        }
        sb3.append("): ");
    }

    public final void b(String str) {
        a aVar = this.f183934b;
        StringBuilder sb3 = this.f183933a;
        if (aVar != null) {
            sb3.append(aVar.name());
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        am.j.y(sb3, " (", str, ")");
    }

    public final void c() {
        StringBuilder sb3 = this.f183933a;
        sb3.append(" {");
        StringBuilder sb4 = this.f183939g;
        sb3.append((CharSequence) sb4);
        sb3.append(" }");
        sb4.setLength(0);
        sb3.append("\n");
    }

    public final void d(a aVar) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f183938f;
        StringBuilder sb3 = this.f183939g;
        sb3.append(StringUtils.SPACE);
        sb3.append(aVar.name().toLowerCase(Locale.ENGLISH));
        sb3.append("=");
        sb3.append(jCurrentTimeMillis);
        sb3.append("ms");
    }

    public final synchronized void e(String str, ArrayList arrayList) {
        try {
            a aVar = this.f183934b;
            if (aVar != null) {
                d(aVar);
                if (this.f183935c != null) {
                    a();
                    StringBuilder sb3 = this.f183933a;
                    sb3.append(this.f183934b.name());
                    sb3.append(" FAILED");
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb4 = this.f183933a;
                        sb4.append(" [");
                        sb4.append(str);
                        sb4.append("]");
                    }
                    c();
                    if (arrayList != null && arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (str2 != null) {
                                StringBuilder sb5 = this.f183933a;
                                sb5.append("- ");
                                sb5.append(str2);
                                sb5.append(": not processed\n");
                            }
                        }
                    }
                } else {
                    StringBuilder sb6 = this.f183933a;
                    sb6.append(this.f183934b.name());
                    sb6.append(" FAILED");
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb7 = this.f183933a;
                        sb7.append(" [");
                        sb7.append(str);
                        sb7.append("]");
                    }
                    c();
                }
            } else {
                this.f183933a.append("FAILURE OCCURRED");
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb8 = this.f183933a;
                    sb8.append(" [");
                    sb8.append(str);
                    sb8.append("]");
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void f(String str) {
        try {
            this.f183933a.setLength(0);
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb3 = this.f183933a;
                sb3.append(str);
                sb3.append(":\n");
            }
            this.f183935c = null;
            this.f183934b = null;
            this.f183936d = (byte) -1;
            this.f183937e = null;
            this.f183938f = -1L;
            this.f183939g.setLength(0);
            this.f183940h = -1L;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void g(bc2.h hVar) {
        if (((il2.e) ec2.e.b()).f94040b.i()) {
            StringBuilder sb3 = this.f183933a;
            sb3.append("\n");
            sb3.append(hVar.f184120g.toString());
            sb3.append("\n");
        }
    }

    public final synchronized void h(String str, byte b14, byte b15, gy2.g gVar) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f183935c = str;
            }
            this.f183936d = b14;
            if (gVar != null) {
                this.f183937e = gVar.name() + " (" + ((int) b15) + ")";
            } else {
                this.f183937e = "NA";
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void i(a aVar) {
        j(aVar, null);
    }

    public final synchronized void j(a aVar, String str) {
        try {
            this.f183934b = aVar;
            if (aVar == a.LISTING || aVar == a.EXTRACTING || aVar == a.POSTING || aVar == a.ARCHIVING || aVar == a.BROWSING || aVar == a.DOWNLOADING || aVar == a.SAVING || aVar == a.ACKNOWLEDGING) {
                this.f183938f = System.currentTimeMillis();
            }
            a aVar2 = a.LISTED;
            if (aVar == aVar2 || aVar == a.EXTRACTED || aVar == a.POSTED || aVar == a.POSTED_AWAITING_PROCESSING || aVar == a.ARCHIVED || aVar == a.BROWSED || aVar == a.DOWNLOADED || aVar == a.SAVED || aVar == a.ACKED) {
                d(aVar);
            }
            if (aVar == aVar2 || aVar == a.BROWSED) {
                b(str);
                c();
            }
            if (aVar == a.ARCHIVED || aVar == a.ACKED) {
                a();
                b(str);
                c();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized String toString() {
        return this.f183933a.toString();
    }
}
