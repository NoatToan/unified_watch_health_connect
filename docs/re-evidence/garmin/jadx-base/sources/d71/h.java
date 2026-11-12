package d71;

import java.util.List;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B#\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00040\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ld71/h;", "Ln70/a0;", "Lr53/i;", "Ld71/j;", "Lj70/d;", "", "", "data", "<init>", "(Lr53/i;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements a0<r53.i<? extends j>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<j70.d<List<String>>> f58151a;

    public h(r53.i<j70.d<List<String>>> iVar) {
        iVar.getClass();
        this.f58151a = iVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetTrainingLoadDataUseCase";
    }

    @Override // n70.a0
    public final r53.i<? extends j> invoke() {
        return s.A(new e(this.f58151a, this), s0.f129406a);
    }
}
