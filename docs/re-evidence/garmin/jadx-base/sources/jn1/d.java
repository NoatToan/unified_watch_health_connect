package jn1;

import e23.l;
import km1.v;
import p005kotlin.Unit;
import sm1.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f99613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f99614c;

    public /* synthetic */ d(s sVar, v vVar, int i14) {
        this.f99612a = i14;
        this.f99613b = sVar;
        this.f99614c = vVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.f99612a) {
            case 0:
                str.getClass();
                this.f99613b.I4(str, v.r(this.f99614c));
                break;
            default:
                str.getClass();
                this.f99613b.I4(str, v.r(this.f99614c));
                break;
        }
        return Unit.INSTANCE;
    }
}
