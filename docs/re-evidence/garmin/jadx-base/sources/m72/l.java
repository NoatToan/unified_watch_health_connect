package m72;

import android.content.Context;
import android.content.SharedPreferences;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x72.o f117120b;

    public /* synthetic */ l(x72.o oVar, int i14) {
        this.f117119a = i14;
        this.f117120b = oVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f117119a;
        x72.o oVar = this.f117120b;
        switch (i14) {
            case 0:
                int i15 = PreviewCatalogActivity.f49781a;
                return p0.n(oVar.b());
            case 1:
                return p0.n(oVar.b());
            default:
                Context context = oVar.f189485a;
                SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + ".prefs_theme", 0);
                sharedPreferences.getClass();
                return sharedPreferences;
        }
    }
}
