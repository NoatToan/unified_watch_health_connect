package ee1;

import f12.l;
import hd1.g0;
import j70.j;
import java.util.List;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001BC\u0012\"\u0010\b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00040\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lee1/b;", "Ln70/a0;", "Lr53/i;", "Lee1/c;", "Lj70/j;", "", "", "Lhd1/g0;", "data", "Lae0/b;", "userSummariesUseCase", "Lde1/a;", "respirationDelegate", "Lf12/l;", "userSettings", "<init>", "(Lr53/i;Lae0/b;Lde1/a;Lf12/l;)V", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements a0<i<? extends c>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<j<List<String>, g0>> f63917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae0.b f63918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final de1.a f63919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f63920d;

    public b(i<j<List<String>, g0>> iVar, ae0.b bVar, de1.a aVar, l lVar) {
        iVar.getClass();
        bVar.getClass();
        aVar.getClass();
        lVar.getClass();
        this.f63917a = iVar;
        this.f63918b = bVar;
        this.f63919c = aVar;
        this.f63920d = lVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetRespirationDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends c> invoke() {
        return s.A(new a(this.f63917a, this), s0.f129406a);
    }
}
