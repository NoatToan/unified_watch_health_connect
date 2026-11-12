package c2;

import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import kotlin.v3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f22962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f22963c;

    public /* synthetic */ z1(float f14, float f15, int i14) {
        this.f22961a = i14;
        this.f22962b = f14;
        this.f22963c = f15;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f22961a) {
            case 0:
                kotlin.m2 m2Var = (kotlin.m2) obj;
                m2Var.f91341a = MapboxMap.QFE_OFFSET;
                v3 v3Var = m2Var.f91343c;
                v3Var.c(g6.f.a(this.f22962b), "x");
                v3Var.c(g6.f.a(this.f22963c), JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE);
                break;
            case 1:
                kotlin.m2 m2Var2 = (kotlin.m2) obj;
                m2Var2.f91341a = "padding";
                v3 v3Var2 = m2Var2.f91343c;
                v3Var2.c(g6.f.a(this.f22962b), "horizontal");
                v3Var2.c(g6.f.a(this.f22963c), "vertical");
                break;
            default:
                o4.t0 t0Var = (o4.t0) obj;
                t0Var.getClass();
                t0Var.x(this.f22962b);
                t0Var.q(this.f22963c);
                break;
        }
        return Unit.INSTANCE;
    }
}
