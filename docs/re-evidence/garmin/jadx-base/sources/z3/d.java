package z3;

import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import i3.mc;
import o53.b0;
import p005kotlin.Unit;
import p3.p0;
import zo1.w0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f202085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f202086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f202087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f202088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f202089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f202090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f202091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f202092i;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i14, int i15) {
        this.f202084a = i15;
        this.f202086c = obj;
        this.f202087d = obj2;
        this.f202088e = obj3;
        this.f202089f = obj4;
        this.f202090g = obj5;
        this.f202091h = obj6;
        this.f202092i = obj7;
        this.f202085b = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f202084a) {
            case 0:
                ((Integer) obj2).getClass();
                ((e) this.f202086c).b(this.f202087d, this.f202088e, this.f202089f, this.f202090g, this.f202091h, this.f202092i, (p3.m) obj, p0.t(this.f202085b) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                w0.b((yo1.j) this.f202086c, (b0) this.f202087d, (mc) this.f202088e, (zo1.q) this.f202089f, (e23.a) this.f202090g, (e23.a) this.f202091h, (e23.l) this.f202092i, (p3.m) obj, p0.t(this.f202085b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                zr.m.a((PrivacyType) this.f202086c, (Integer) this.f202087d, (Integer) this.f202088e, (mc) this.f202089f, (e23.l) this.f202090g, (e23.a) this.f202091h, (e23.p) this.f202092i, (p3.m) obj, p0.t(this.f202085b | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
