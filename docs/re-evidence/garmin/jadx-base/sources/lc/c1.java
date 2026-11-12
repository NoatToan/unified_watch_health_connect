package lc;

import android.os.Bundle;
import com.google.maps.android.BuildConfig;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llc/c1;", "Llc/q0;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c1 extends q0<String> {
    public c1() {
        super(true);
    }

    @Override // lc.q0
    public final String a(Bundle bundle, String str) {
        if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
            return null;
        }
        return nd.b.h(bundle, str);
    }

    @Override // lc.q0
    public final String b() {
        return "string";
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final String h(String str) {
        str.getClass();
        if (str.equals(BuildConfig.TRAVIS)) {
            return null;
        }
        return str;
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, String str2) {
        String str3 = str2;
        str.getClass();
        if (str3 != null) {
            bundle.putString(str, str3);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // lc.q0
    public final String f(String str) {
        String str2 = str;
        return str2 != null ? r0.a(r0.f111862a, str2) : BuildConfig.TRAVIS;
    }
}
