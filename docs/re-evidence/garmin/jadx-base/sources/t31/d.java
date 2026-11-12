package t31;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f162211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f162212c;

    public /* synthetic */ d(g gVar, Context context, int i14) {
        this.f162210a = i14;
        this.f162211b = gVar;
        this.f162212c = context;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f162210a;
        Context context = this.f162212c;
        g gVar = this.f162211b;
        switch (i14) {
            case 0:
                int i15 = g.f162217g;
                h82.c.f(gVar, context, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5624990/");
                break;
            default:
                int i16 = g.f162217g;
                h82.c.f(gVar, context, "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5624990/");
                break;
        }
        return Unit.INSTANCE;
    }
}
