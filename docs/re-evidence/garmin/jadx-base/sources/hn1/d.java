package hn1;

import e23.p;
import i3.mc;
import km1.a0;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.p0;
import sm1.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f84518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f84519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f84520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f84521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mc f84522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f84523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f84524h;

    public /* synthetic */ d(a0 a0Var, DateTime dateTime, DateTime dateTime2, s sVar, mc mcVar, b0 b0Var, int i14, int i15) {
        this.f84517a = i15;
        this.f84518b = a0Var;
        this.f84519c = dateTime;
        this.f84520d = dateTime2;
        this.f84521e = sVar;
        this.f84522f = mcVar;
        this.f84523g = b0Var;
        this.f84524h = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f84517a) {
            case 0:
                ((Integer) obj2).getClass();
                g.a(this.f84518b, this.f84519c, this.f84520d, this.f84521e, this.f84522f, this.f84523g, (p3.m) obj, p0.t(this.f84524h | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                m.b(this.f84518b, this.f84519c, this.f84520d, this.f84521e, this.f84522f, this.f84523g, (p3.m) obj, p0.t(this.f84524h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                o.b(this.f84518b, this.f84519c, this.f84520d, this.f84521e, this.f84522f, this.f84523g, (p3.m) obj, p0.t(this.f84524h | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
