package es1;

import c2.l;
import e23.p;
import h4.r;
import i3.mh;
import j92.f;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import s5.x0;
import zw1.e;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f65208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f65209c;

    public /* synthetic */ a(long j8, String str) {
        this.f65207a = 0;
        this.f65209c = j8;
        this.f65208b = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f65207a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarA = x0.a(f.f97935l, this.f65209c, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    g6.f.a aVar = g6.f.f75994b;
                    mh.c(this.f65208b, l.z(r.S, 8, 4), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, mVar, 48, 0, 131068);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(this.f65208b, null, this.f65209c, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(f.f97931h, mVar2), mVar2, 0, 0, 131066);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(this.f65208b, null, this.f65209c, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, f.f97931h, mVar3, 0, 0, 131066);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(f.f97932i, mVar4);
                    d6.p.f57793b.getClass();
                    mh.c(this.f65208b, null, this.f65209c, null, 0L, null, 0L, null, 0L, d6.p.f57794c, false, Integer.MAX_VALUE, 0, null, x0VarB, mVar4, 0, 24960, 110586);
                } else {
                    mVar4.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                e.a(p0.t(1), this.f65209c, this.f65208b, (m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(long j8, String str, int i14) {
        this.f65207a = 4;
        this.f65209c = j8;
        this.f65208b = str;
    }

    public /* synthetic */ a(String str, long j8, int i14) {
        this.f65207a = i14;
        this.f65208b = str;
        this.f65209c = j8;
    }
}
