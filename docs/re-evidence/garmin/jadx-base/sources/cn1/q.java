package cn1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f28048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f28050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f28052f;

    public /* synthetic */ q(h4.r rVar, String str, String str2, int i14, int i15, int i16) {
        this.f28047a = i16;
        this.f28048b = rVar;
        this.f28049c = str;
        this.f28050d = str2;
        this.f28051e = i14;
        this.f28052f = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28047a) {
            case 0:
                ((Integer) obj2).getClass();
                r.c(this.f28048b, this.f28049c, this.f28050d, (p3.m) obj, p0.t(this.f28051e | 1), this.f28052f);
                break;
            default:
                ((Integer) obj2).getClass();
                h02.d.c(this.f28048b, this.f28049c, this.f28050d, (p3.m) obj, p0.t(this.f28051e | 1), this.f28052f);
                break;
        }
        return Unit.INSTANCE;
    }
}
