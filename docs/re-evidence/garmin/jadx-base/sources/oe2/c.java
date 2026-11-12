package oe2;

import com.mapbox.maps.plugin.viewport.CompletionListener;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements CompletionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f131466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f131467c;

    public /* synthetic */ c(e eVar, e23.l lVar, int i14) {
        this.f131465a = i14;
        this.f131466b = eVar;
        this.f131467c = lVar;
    }

    @Override // com.mapbox.maps.plugin.viewport.CompletionListener
    public final void onComplete(boolean z14) {
        Object value;
        Object value2;
        switch (this.f131465a) {
            case 0:
                p2 p2Var = this.f131466b.f131474c;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, Integer.valueOf(((Number) value).intValue() + 1)));
                e23.l lVar = this.f131467c;
                if (lVar != null) {
                    lVar.invoke(Boolean.valueOf(z14));
                }
                break;
            default:
                p2 p2Var2 = this.f131466b.f131474c;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, Integer.valueOf(((Number) value2).intValue() + 1)));
                e23.l lVar2 = this.f131467c;
                if (lVar2 != null) {
                    lVar2.invoke(Boolean.valueOf(z14));
                }
                break;
        }
    }
}
