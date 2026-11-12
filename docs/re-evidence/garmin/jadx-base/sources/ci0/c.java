package ci0;

import e23.l;
import e23.p;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DateTime f27628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sh0.d f27629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f27630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f27631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf0.i f27632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f27633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f27634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f27635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f27636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f27637k;

    public /* synthetic */ c(DateTime dateTime, sh0.d dVar, boolean z14, boolean z15, tf0.i iVar, l lVar, l lVar2, l lVar3, l lVar4, int i14, int i15) {
        this.f27627a = i15;
        this.f27628b = dateTime;
        this.f27629c = dVar;
        this.f27630d = z14;
        this.f27631e = z15;
        this.f27632f = iVar;
        this.f27633g = lVar;
        this.f27634h = lVar2;
        this.f27635i = lVar3;
        this.f27636j = lVar4;
        this.f27637k = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27627a) {
            case 0:
                ((Integer) obj2).getClass();
                d.a(this.f27628b, this.f27629c, this.f27630d, this.f27631e, this.f27632f, this.f27633g, this.f27634h, this.f27635i, this.f27636j, (m) obj, p0.t(this.f27637k | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                h.a(this.f27628b, this.f27629c, this.f27630d, this.f27631e, this.f27632f, this.f27633g, this.f27634h, this.f27635i, this.f27636j, (m) obj, p0.t(this.f27637k | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
