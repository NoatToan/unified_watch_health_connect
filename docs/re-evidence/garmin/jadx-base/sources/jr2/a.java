package jr2;

import android.view.View;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f100549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f100550c;

    public /* synthetic */ a(Object obj, int i14, int i15) {
        this.f100548a = i15;
        this.f100550c = obj;
        this.f100549b = i14;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view2) {
        switch (this.f100548a) {
            case 0:
                e23.l<? super Integer, Unit> lVar = ((kr2.a) this.f100550c).f106238c;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(this.f100549b));
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.settings.devices.d.b bVar = ((com.garmin.android.apps.connectmobile.settings.devices.d) this.f100550c).f42887a;
                if (bVar != null) {
                    bVar.Y6(this.f100549b);
                }
                break;
        }
        return true;
    }
}
