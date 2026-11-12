package lc;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llc/j;", "Llc/q0;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j extends q0<Float> {
    public j() {
        super(false);
    }

    @Override // lc.q0
    public final Float a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return Float.valueOf(nd.b.c(bundle, str));
    }

    @Override // lc.q0
    public final String b() {
        return "float";
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final Float h(String str) {
        str.getClass();
        return Float.valueOf(Float.parseFloat(str));
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, Float f14) {
        float fFloatValue = f14.floatValue();
        str.getClass();
        bundle.putFloat(str, fFloatValue);
    }
}
