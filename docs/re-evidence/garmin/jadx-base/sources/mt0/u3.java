package mt0;

import androidx.fragment.app.Fragment;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class u3 implements e23.a<androidx.fragment.app.m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f120888a;

    public u3(Fragment fragment) {
        this.f120888a = fragment;
    }

    @Override // e23.a
    public final androidx.fragment.app.m invoke() {
        return this.f120888a.requireActivity();
    }
}
