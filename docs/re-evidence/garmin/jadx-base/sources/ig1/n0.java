package ig1;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lig1/n0;", "Landroid/view/View$OnClickListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.model.f f93368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f93369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i.c f93370c;

    public n0(com.garmin.android.apps.connectmobile.devices.model.f fVar, m0 m0Var, i.c cVar) {
        this.f93368a = fVar;
        this.f93369b = m0Var;
        this.f93370c = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        view2.getClass();
        com.garmin.android.apps.connectmobile.devices.model.f fVar = this.f93368a;
        int iH0 = fVar.h0();
        m0 m0Var = this.f93369b;
        int iQ = iH0 == 0 ? m0Var.q() : iH0 - 1;
        int i14 = m0.f93361m;
        String[] strArrR = m0Var.r();
        androidx.appcompat.app.e eVarShow = new androidx.appcompat.app.e.a(m0Var.f70343a).setTitle(R.string.devices_lbl_heart_rate_zones).setSingleChoiceItems(strArrR, iQ, new c32.c(m0Var, strArrR, this.f93370c, fVar, 7)).show();
        eVarShow.getClass();
        String[] strArrR2 = m0Var.r();
        Object[] objArrCopyOf = Arrays.copyOf(strArrR2, strArrR2.length);
        ArrayList arrayList = new ArrayList(objArrCopyOf.length);
        int i15 = 0;
        for (Object obj : objArrCopyOf) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        listUnmodifiableList.forEach(new k0(i15, arrayList2, m0Var));
        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
        oe2.f.f0(eVarShow, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
