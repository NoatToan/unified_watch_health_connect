package rz1;

import hd1.k0;
import j70.j;
import n70.a0;
import o13.p;
import o53.s0;
import p005kotlin.Metadata;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B3\u0012*\u0010\t\u001a&\u0012\"\u0012 \u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00040\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lrz1/d;", "Ln70/a0;", "Lr53/i;", "Lrz1/h;", "Lj70/j;", "Lo13/p;", "", "", "Lhd1/k0;", "data", "<init>", "(Lr53/i;)V", "gcm-training-readiness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements a0<i<? extends h>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<j<p<String, Boolean>, k0>> f155220a;

    public d(i<j<p<String, Boolean>, k0>> iVar) {
        iVar.getClass();
        this.f155220a = iVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetTrainingReadinessDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends h> invoke() {
        return s.A(new a(this.f155220a, this), s0.f129406a);
    }
}
