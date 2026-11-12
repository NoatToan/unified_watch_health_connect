package vn2;

import com.google.common.base.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class q implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f178931b;

    public /* synthetic */ q(s sVar, int i14) {
        this.f178930a = i14;
        this.f178931b = sVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f178930a) {
            case 0:
                return s.D1(this.f178931b, (tn2.y0.c) obj);
            case 1:
                return s.F1(this.f178931b, (tn2.y0.c) obj);
            case 2:
                return s.K1(this.f178931b, (List) obj);
            case 3:
                return s.J1(this.f178931b, (fs2.a) obj);
            case 4:
                return s.y1(this.f178931b, (Optional) obj);
            default:
                return s.Q1(this.f178931b, (pn2.e) obj);
        }
    }
}
