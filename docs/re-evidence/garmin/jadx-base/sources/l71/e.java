package l71;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import w52.e0;
import w52.q1;
import wv0.y;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f110851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f110852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f110853d;

    public /* synthetic */ e(String str, String str2, int i14, int i15, int i16) {
        this.f110850a = i16;
        this.f110851b = str;
        this.f110852c = str2;
        switch (i16) {
            case 3:
                this.f110853d = i15;
                break;
            default:
                this.f110853d = i14;
                break;
        }
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (this.f110850a) {
            case 0:
                num.getClass();
                h.a(this.f110853d, p0.t(1), this.f110851b, this.f110852c, mVar);
                break;
            case 1:
                num.getClass();
                po0.a.a(this.f110853d, p0.t(1), this.f110851b, this.f110852c, mVar);
                break;
            case 2:
                num.intValue();
                e0.b(this.f110851b, this.f110852c, mVar, p0.t(this.f110853d | 1));
                break;
            case 3:
                num.getClass();
                q1.e(p0.t(1), this.f110853d, this.f110851b, this.f110852c, mVar);
                break;
            default:
                num.getClass();
                y.a(this.f110851b, this.f110852c, mVar, p0.t(this.f110853d | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(int i14, int i15, String str, String str2) {
        this.f110850a = 0;
        this.f110853d = i14;
        this.f110851b = str;
        this.f110852c = str2;
    }

    public /* synthetic */ e(int i14, int i15, byte b14, String str, String str2) {
        this.f110850a = i15;
        this.f110851b = str;
        this.f110852c = str2;
        this.f110853d = i14;
    }
}
