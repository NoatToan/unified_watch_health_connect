package defpackage;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.viewmodel.CreationExtras;

/* JADX INFO: loaded from: classes2.dex */
public final class u9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CreationExtras f35548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SavedStateHandle f35549b;
    public final boolean c;

    public u9l(CreationExtras creationExtras) {
        this.c = creationExtras == null;
        this.f35548a = creationExtras;
    }

    public void a() {
        this.f35548a = null;
    }

    public boolean b() {
        return this.f35549b == null && this.f35548a == null;
    }

    public void c(CreationExtras creationExtras) {
        if (this.f35549b != null) {
            return;
        }
        this.f35548a = creationExtras;
    }
}
