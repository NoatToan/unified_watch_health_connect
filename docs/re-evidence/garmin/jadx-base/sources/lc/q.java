package lc;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llc/q;", "Llc/q0;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q extends q0<Long> {
    public q() {
        super(false);
    }

    @Override // lc.q0
    public final Long a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return Long.valueOf(nd.b.f(bundle, str));
    }

    @Override // lc.q0
    public final String b() {
        return "long";
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final Long h(String str) {
        long j8;
        str.getClass();
        String strM = d53.u.p(str, "L", false) ? fb1.c.m(1, 0, str) : str;
        if (d53.u.y(str, "0x", false)) {
            String strSubstring = strM.substring(2);
            d53.a.a(16);
            j8 = Long.parseLong(strSubstring, 16);
        } else {
            j8 = Long.parseLong(strM);
        }
        return Long.valueOf(j8);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, Long l14) {
        long jLongValue = l14.longValue();
        str.getClass();
        bundle.putLong(str, jLongValue);
    }
}
