package w21;

import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x21.c f181507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NutritionActivity.g f181508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f181509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f181510e;

    public /* synthetic */ b(x21.c cVar, NutritionActivity.g gVar, p1 p1Var, p1 p1Var2, int i14) {
        this.f181506a = i14;
        this.f181507b = cVar;
        this.f181508c = gVar;
        this.f181509d = p1Var;
        this.f181510e = p1Var2;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f181506a) {
            case 0:
                m.g(this.f181508c, this.f181509d, this.f181510e, this.f181507b);
                break;
            case 1:
                m.g(this.f181508c, this.f181509d, this.f181510e, this.f181507b);
                break;
            case 2:
                m.g(this.f181508c, this.f181509d, this.f181510e, this.f181507b);
                break;
            default:
                m.g(this.f181508c, this.f181509d, this.f181510e, this.f181507b);
                break;
        }
        return Unit.INSTANCE;
    }
}
