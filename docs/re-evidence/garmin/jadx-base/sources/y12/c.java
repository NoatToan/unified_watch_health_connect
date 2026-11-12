package y12;

import e23.l;
import f4.s;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c implements l<Boolean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f194030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s<a> f194031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f194032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l<List<? extends a>, Unit> f194033d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z14, s<a> sVar, a aVar, l<? super List<? extends a>, Unit> lVar) {
        this.f194030a = z14;
        this.f194031b = sVar;
        this.f194032c = aVar;
        this.f194033d = lVar;
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        bool.getClass();
        a aVar = this.f194032c;
        boolean z14 = this.f194030a;
        s<a> sVar = this.f194031b;
        if (z14) {
            sVar.remove(aVar);
        } else {
            sVar.add(aVar);
        }
        this.f194033d.invoke(h0.d1(sVar));
        return Unit.INSTANCE;
    }
}
