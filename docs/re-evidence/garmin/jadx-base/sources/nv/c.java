package nv;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127923a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f127924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f127925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f127926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f127927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f127928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f127929g;

    public /* synthetic */ c(r rVar, int i14, String str, String str2, e23.a aVar, int i15, int i16) {
        this.f127924b = rVar;
        this.f127928f = i14;
        this.f127925c = str;
        this.f127926d = str2;
        this.f127927e = aVar;
        this.f127929g = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f127923a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                d.a(this.f127924b, this.f127928f, this.f127925c, this.f127926d, this.f127927e, mVar, p0.t(1), this.f127929g);
                break;
            default:
                y32.a.a(this.f127924b, this.f127925c, this.f127926d, this.f127927e, mVar, p0.t(this.f127928f | 1), this.f127929g);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(r rVar, String str, String str2, e23.a aVar, int i14, int i15) {
        this.f127924b = rVar;
        this.f127925c = str;
        this.f127926d = str2;
        this.f127927e = aVar;
        this.f127928f = i14;
        this.f127929g = i15;
    }
}
