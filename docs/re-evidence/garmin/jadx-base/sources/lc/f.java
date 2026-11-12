package lc;

import android.os.Bundle;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llc/f;", "Llc/q0;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends q0<Boolean> {
    public f() {
        super(false);
    }

    @Override // lc.q0
    public final Boolean a(Bundle bundle, String str) {
        if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
            return null;
        }
        return Boolean.valueOf(nd.b.a(bundle, str));
    }

    @Override // lc.q0
    public final String b() {
        return "boolean";
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final Boolean h(String str) {
        boolean z14;
        str.getClass();
        if (str.equals(BooleanUtils.TRUE)) {
            z14 = true;
        } else {
            if (!str.equals(BooleanUtils.FALSE)) {
                vb.h.s("A boolean NavType only accepts \"true\" or \"false\" values.");
                return null;
            }
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        str.getClass();
        bundle.putBoolean(str, zBooleanValue);
    }
}
