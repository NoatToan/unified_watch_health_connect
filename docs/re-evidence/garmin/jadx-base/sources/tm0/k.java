package tm0;

import b.s;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltm0/k;", "Lb/s;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f165394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar) {
        super(true);
        this.f165394d = iVar;
    }

    @Override // b.s
    public final void b() {
        i.a aVar = i.f165371j;
        this.f165394d.requireActivity().onBackPressed();
    }
}
