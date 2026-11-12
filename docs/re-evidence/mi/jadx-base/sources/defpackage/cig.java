package defpackage;

import android.os.Bundle;
import androidx.navigation.h;

/* JADX INFO: loaded from: classes.dex */
public final class cig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f5374b;
    public Bundle c;

    public cig(int i) {
        this(i, null);
    }

    public Bundle a() {
        return this.c;
    }

    public int b() {
        return this.f5373a;
    }

    public h c() {
        return this.f5374b;
    }

    public void d(Bundle bundle) {
        this.c = bundle;
    }

    public void e(h hVar) {
        this.f5374b = hVar;
    }

    public cig(int i, h hVar) {
        this(i, hVar, null);
    }

    public cig(int i, h hVar, Bundle bundle) {
        this.f5373a = i;
        this.f5374b = hVar;
        this.c = bundle;
    }
}
