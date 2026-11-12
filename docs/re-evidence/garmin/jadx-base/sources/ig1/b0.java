package ig1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class b0 extends fb2.e<com.garmin.android.apps.connectmobile.devices.model.f> implements Observer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0[] f93285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f93286e;

    public b0(Context context, int i14, int i15) {
        super(context);
        View.generateViewId();
        this.f93286e = i14;
        this.f93285d = new a0[i15];
        for (int i16 = 0; i16 < this.f93285d.length; i16++) {
            a0 a0Var = new a0(this.f70343a, i14, i16);
            a0Var.addObserver(this);
            this.f93285d[i16] = a0Var;
        }
    }

    @Override // fb2.e
    public final View a() {
        View viewF = f(R.layout.gcm3_activity_options_dynamic_content);
        LinearLayout linearLayout = (LinearLayout) viewF.findViewById(R.id.page_content);
        int i14 = 0;
        while (true) {
            a0[] a0VarArr = this.f93285d;
            if (i14 >= a0VarArr.length) {
                return viewF;
            }
            linearLayout.addView(a0VarArr[i14].a());
            i14++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.garmin.android.apps.connectmobile.devices.model.f, java.lang.Object] */
    @Override // fb2.e
    public final boolean k(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        if (fVar2 == 0) {
            vb.h.s("Model is required");
            return false;
        }
        this.f70344b = fVar2;
        boolean zH = h(fVar2);
        if (zH) {
            int i14 = 0;
            while (true) {
                a0[] a0VarArr = this.f93285d;
                if (i14 >= a0VarArr.length) {
                    break;
                }
                a0VarArr[i14].k(fVar2);
                i14++;
            }
        }
        return zH;
    }

    @Override // fb2.e
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean g(i.c cVar, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        if (fVar == null) {
            vb.h.s("Model is required");
            return false;
        }
        boolean zG = true;
        int i14 = 0;
        while (true) {
            a0[] a0VarArr = this.f93285d;
            if (i14 >= a0VarArr.length) {
                return zG;
            }
            zG &= a0VarArr[i14].g(cVar, fVar);
            i14++;
        }
    }

    @Override // fb2.e
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final boolean h(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        if (fVar != null) {
            return fVar.P0() && this.f93286e < fVar.I().size();
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        setChanged();
        notifyObservers(obj);
    }

    public b0(Context context) {
        super(context);
        View.generateViewId();
    }
}
