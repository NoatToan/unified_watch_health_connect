package mr0;

import ae0.e;
import hd1.c0;
import hs1.g;
import j70.j;
import java.util.List;
import n70.a0;
import o53.s0;
import oe2.f;
import p005kotlin.Metadata;
import r53.i;
import r53.s;
import zz1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B;\u0012\"\u0010\b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00040\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmr0/c;", "Ln70/a0;", "Lr53/i;", "Lzz1/d;", "Lj70/j;", "", "", "Lhd1/c0;", "data", "Lae0/b;", "userSummariesUseCase", "Lae0/e;", "getUserGoalsDataUseCase", "<init>", "(Lr53/i;Lae0/b;Lae0/e;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements a0<i<? extends d>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<j<List<String>, c0>> f120347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae0.b f120348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f120349c;

    public c(i<j<List<String>, c0>> iVar, ae0.b bVar, e eVar) {
        iVar.getClass();
        bVar.getClass();
        eVar.getClass();
        this.f120347a = iVar;
        this.f120348b = bVar;
        this.f120349c = eVar;
    }

    public static final int c(c cVar, hs1.d dVar) {
        cVar.getClass();
        g intensityMinutes = dVar.getIntensityMinutes();
        Integer moderate = intensityMinutes != null ? intensityMinutes.getModerate() : null;
        g intensityMinutes2 = dVar.getIntensityMinutes();
        return f.y(moderate, intensityMinutes2 != null ? intensityMinutes2.getVigorous() : null);
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetIntensityMinutesDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends d> invoke() {
        return s.A(new b(this.f120347a, this), s0.f129406a);
    }
}
