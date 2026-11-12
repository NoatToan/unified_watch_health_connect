package wr1;

import e23.l;
import e23.p;
import gs1.t;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import tf0.i;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DateTime f186799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f186800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f186801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f186802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f186803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f186804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f186805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f186806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f186807j;

    public /* synthetic */ b(DateTime dateTime, t tVar, boolean z14, i iVar, l lVar, l lVar2, l lVar3, l lVar4, int i14, int i15) {
        this.f186798a = i15;
        this.f186799b = dateTime;
        this.f186800c = tVar;
        this.f186801d = z14;
        this.f186802e = iVar;
        this.f186803f = lVar;
        this.f186804g = lVar2;
        this.f186805h = lVar3;
        this.f186806i = lVar4;
        this.f186807j = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f186798a) {
            case 0:
                ((Integer) obj2).getClass();
                g.e(this.f186799b, this.f186800c, this.f186801d, this.f186802e, this.f186803f, this.f186804g, this.f186805h, this.f186806i, (m) obj, p0.t(this.f186807j | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                g.f(this.f186799b, this.f186800c, this.f186801d, this.f186802e, this.f186803f, this.f186804g, this.f186805h, this.f186806i, (m) obj, p0.t(this.f186807j | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
