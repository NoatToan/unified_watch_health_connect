package p32;

import j70.d;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;
import q71.e;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B%\u0012\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lp32/c;", "Ln70/a0;", "Lr53/i;", "Lo32/a;", "Lj70/d;", "", "data", "Lq71/e;", "vo2MaxType", "<init>", "(Lr53/i;Lq71/e;)V", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements a0<i<? extends o32.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<d<String>> f135407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f135408b;

    public c(i<d<String>> iVar, e eVar) {
        iVar.getClass();
        eVar.getClass();
        this.f135407a = iVar;
        this.f135408b = eVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetVO2MaxDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends o32.a> invoke() {
        return s.A(new a(this.f135407a, this), s0.f129406a);
    }
}
