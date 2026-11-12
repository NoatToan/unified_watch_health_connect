package im;

import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import com.garmin.android.apps.connectmobile.activities.newmodel.q0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim/p;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f94169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SparseArray<q0> f94170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f94171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<zm.p, Unit> f94172d;

    /* JADX WARN: Multi-variable type inference failed */
    public p(q qVar, SparseArray<q0> sparseArray, fz.c cVar, e23.l<? super zm.p, Unit> lVar) {
        this.f94169a = qVar;
        this.f94170b = sparseArray;
        this.f94171c = cVar;
        this.f94172d = lVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view2, int i14, long j8) throws Throwable {
        q qVar = this.f94169a;
        String item = qVar.f94174m.getItem(i14);
        if (item != null) {
            qVar.l(item, this.f94170b, this.f94171c);
            e23.l<zm.p, Unit> lVar = this.f94172d;
            if (lVar != null) {
                for (Object obj : qVar.f94176o) {
                    if (p005kotlin.jvm.internal.s.g(((zm.p) obj).W0(), item)) {
                        lVar.invoke((zm.p) obj);
                    }
                }
                obj = null;
                lVar.invoke((zm.p) obj);
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
