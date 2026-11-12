package vx;

import i3.bc;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvx/d;", "Li3/bc;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i53.c<Long> f180636a;

    public d(i53.c<Long> cVar) {
        this.f180636a = cVar;
    }

    @Override // i3.bc
    public final boolean a(long j8) {
        i53.c<Long> cVar = this.f180636a;
        return cVar.isEmpty() || cVar.contains(Long.valueOf(j8));
    }
}
