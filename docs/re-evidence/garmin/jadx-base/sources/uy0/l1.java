package uy0;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luy0/l1;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f173228a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f173229b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f173230c = o13.m.b(new ux1.b(29));

    public final void a() {
        if (this.f173228a.length() == 0) {
            return;
        }
        Bundle bundleD = tn.k.d("Screen", "SearchScreen", "Action", "NoResultsShown");
        bundleD.putString("Word", this.f173228a);
        ((ht.a) this.f173230c.getValue()).getClass();
        ht.a.a(bundleD, "UserAction");
    }
}
