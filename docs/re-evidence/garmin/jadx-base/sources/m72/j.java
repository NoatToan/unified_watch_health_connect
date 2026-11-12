package m72;

import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import lc.m0;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreviewCatalogActivity f117111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f117112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f117113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f117114e;

    public /* synthetic */ j(PreviewCatalogActivity previewCatalogActivity, m0 m0Var, e23.a aVar, i iVar, int i14, int i15) {
        this.f117110a = i15;
        this.f117111b = previewCatalogActivity;
        this.f117112c = m0Var;
        this.f117113d = aVar;
        this.f117114e = iVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f117110a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                int i14 = PreviewCatalogActivity.f49781a;
                this.f117111b.L9(this.f117112c, this.f117113d, this.f117114e, mVar, p0.t(1));
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                ((Integer) obj2).getClass();
                int i15 = PreviewCatalogActivity.f49781a;
                this.f117111b.M9(this.f117112c, this.f117113d, this.f117114e, mVar2, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
