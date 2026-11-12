package lc;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llc/n;", "Llc/q0;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends q0<Integer> {
    public n() {
        super(false);
    }

    @Override // lc.q0
    public final Integer a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return Integer.valueOf(nd.b.d(bundle, str));
    }

    @Override // lc.q0
    public final String b() {
        return "integer";
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final Integer h(String str) {
        int i14;
        str.getClass();
        if (d53.u.y(str, "0x", false)) {
            String strSubstring = str.substring(2);
            d53.a.a(16);
            i14 = Integer.parseInt(strSubstring, 16);
        } else {
            i14 = Integer.parseInt(str);
        }
        return Integer.valueOf(i14);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, Integer num) {
        int iIntValue = num.intValue();
        str.getClass();
        bundle.putInt(str, iIntValue);
    }
}
