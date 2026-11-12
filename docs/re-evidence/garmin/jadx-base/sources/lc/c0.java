package lc;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f111725b;

    public /* synthetic */ c0(int i14, Bundle bundle) {
        this.f111724a = i14;
        this.f111725b = bundle;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean zContainsKey;
        int i14 = this.f111724a;
        Bundle bundle = this.f111725b;
        String str = (String) obj;
        switch (i14) {
            case 0:
                d53.k kVar = d0.f111726q;
                str.getClass();
                zContainsKey = bundle.containsKey(str);
                break;
            default:
                str.getClass();
                zContainsKey = bundle.containsKey(str);
                break;
        }
        return Boolean.valueOf(!zContainsKey);
    }
}
