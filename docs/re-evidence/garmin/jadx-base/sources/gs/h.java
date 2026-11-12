package gs;

import com.airbnb.lottie.LottieAnimationView;
import f5.v1;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import w2.a0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78616a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f78618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f78619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f78620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f78621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f78622g;

    public /* synthetic */ h(v1 v1Var, int i14, int i15, v1 v1Var2, int i16, p0 p0Var) {
        this.f78620e = v1Var;
        this.f78617b = i14;
        this.f78618c = i15;
        this.f78621f = v1Var2;
        this.f78619d = i16;
        this.f78622g = p0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f78616a) {
            case 0:
                List list = (List) this.f78620e;
                List list2 = (List) this.f78621f;
                zw1.c cVar = (zw1.c) this.f78622g;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
                lottieAnimationView.getClass();
                a0.n(lottieAnimationView, list, list2, this.f78617b, this.f78618c, this.f78619d, cVar);
                break;
            default:
                v1 v1Var = (v1) this.f78620e;
                v1 v1Var2 = (v1) this.f78621f;
                p0 p0Var = (p0) this.f78622g;
                v1.a aVar = (v1.a) obj;
                v1.a.B(aVar, v1Var, this.f78617b, this.f78618c);
                v1.a.B(aVar, v1Var2, this.f78619d, p0Var.f105807a);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(List list, List list2, int i14, int i15, int i16, zw1.c cVar) {
        this.f78620e = list;
        this.f78621f = list2;
        this.f78617b = i14;
        this.f78618c = i15;
        this.f78619d = i16;
        this.f78622g = cVar;
    }
}
