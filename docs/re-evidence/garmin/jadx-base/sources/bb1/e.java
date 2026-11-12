package bb1;

import e23.l;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import w52.y1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17314a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f17316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f17317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17319f;

    public /* synthetic */ e(String str, l lVar, boolean z14, int i14, int i15) {
        this.f17315b = str;
        this.f17316c = lVar;
        this.f17317d = z14;
        this.f17318e = i14;
        this.f17319f = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17314a) {
            case 0:
                ((Integer) obj2).getClass();
                f.a(p0.t(this.f17318e | 1), this.f17319f, this.f17316c, this.f17315b, (m) obj, this.f17317d);
                break;
            default:
                ((Integer) obj2).getClass();
                y1.a(p0.t(this.f17318e | 1), this.f17319f, this.f17316c, this.f17315b, (m) obj, this.f17317d);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(String str, boolean z14, l lVar, int i14, int i15) {
        this.f17315b = str;
        this.f17317d = z14;
        this.f17316c = lVar;
        this.f17318e = i14;
        this.f17319f = i15;
    }
}
