package tn1;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltn1/b;", "Ltn1/a;", "Ltn1/d;", "screenType", "<init>", "(Ltn1/d;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f165504a;

    public b(d dVar) {
        dVar.getClass();
        this.f165504a = dVar;
    }

    @Override // tn1.a
    public final void a() {
        Bundle bundle = new Bundle();
        bundle.putString("Screen", this.f165504a.f165510a);
        ht.a.f85464a.getClass();
        ht.a.a(bundle, "DismissSleepEducationBanner");
    }

    @Override // tn1.a
    public final void b(boolean z14) {
        Bundle bundle = new Bundle();
        bundle.putString("Screen", this.f165504a.f165510a);
        bundle.putBoolean("ShowSleepEducationBanner", z14);
        ht.a.f85464a.getClass();
        ht.a.a(bundle, "ShowSleepEducationBanner");
    }
}
