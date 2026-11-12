package vs2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.event.SystemEventSender", f = "SystemEventSender.kt", l = {62}, m = "send")
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f179986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f179987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f179988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f179989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f179988c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179987b = obj;
        this.f179989d |= Integer.MIN_VALUE;
        return this.f179988c.a(null, this);
    }
}
