package fm;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;
import ss.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lfm/c;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class c {
    public CharSequence a(String str) {
        return str;
    }

    public int b(ls.e eVar) {
        int i14 = k.a.f160607a[eVar.ordinal()];
        if (i14 == 2 || i14 == 3) {
            return SyslogConstants.LOG_LOCAL1;
        }
        if (i14 == 15) {
            return 265;
        }
        if (i14 == 96 || i14 == 97) {
            return 16;
        }
        return k.d(eVar);
    }

    public h c() {
        return h.BASE;
    }
}
