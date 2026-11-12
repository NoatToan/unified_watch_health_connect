package zo;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;
import java.util.Set;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p13.b1;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k f206079b;

    public /* synthetic */ w(com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k kVar, int i14) {
        this.f206078a = i14;
        this.f206079b = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int i14 = this.f206078a;
        com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k kVar = this.f206079b;
        switch (i14) {
            case 0:
                int i15 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k.f29371j;
                if (obj != null) {
                    kVar.requireActivity().setResult(0);
                    kVar.requireActivity().finish();
                    jd0.j jVarM = ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).M();
                    Context contextRequireContext = kVar.requireContext();
                    ap.d dVar = kVar.f29372a;
                    if (dVar != null) {
                        jVarM.c(contextRequireContext, dVar.f11589a);
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("viewModel");
                        throw null;
                    }
                }
                return;
            default:
                o13.p pVar = (o13.p) obj;
                int i16 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k.f29371j;
                pVar.getClass();
                yo.a aVar = (yo.a) pVar.f128594a;
                List<? extends Object> list = (List) pVar.f128595b;
                switch (com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k.b.f29381a[aVar.ordinal()]) {
                    case 1:
                        g22.e.f(kVar);
                        return;
                    case 2:
                        g22.e.l(kVar);
                        return;
                    case 3:
                        g22.e.f(kVar);
                        ap.d dVar2 = kVar.f29372a;
                        if (dVar2 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        String strValueOf = String.valueOf(dVar2.f11589a);
                        SharedPreferences sharedPreferences = kVar.requireActivity().getSharedPreferences(kVar.getString(R.string.aae_trimmed_or_edited_legs_activity_set_key), 0);
                        Set<String> stringSet = sharedPreferences.getStringSet(kVar.getString(R.string.aae_edited_legs_activity_list_key), null);
                        Set<String> setF1 = stringSet != null ? h0.f1(stringSet) : null;
                        if (setF1 == null) {
                            setF1 = b1.e(strValueOf);
                        } else {
                            setF1.add(strValueOf);
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putStringSet(kVar.getString(R.string.aae_edited_legs_activity_list_key), setF1);
                        editorEdit.apply();
                        ap.d dVar3 = kVar.f29372a;
                        if (dVar3 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        yo.e eVar = dVar3.f11593e;
                        if (list == null) {
                            list = j0.f134944a;
                        }
                        eVar.g(list);
                        return;
                    case 4:
                        g22.e.f(kVar);
                        Snackbar snackbarMake = Snackbar.make(kVar.requireView(), kVar.getString(R.string.activities_trim_error_message), 0);
                        snackbarMake.getClass();
                        v22.c.a(snackbarMake);
                        snackbarMake.show();
                        return;
                    case 5:
                        g22.e.l(kVar);
                        ap.d dVar4 = kVar.f29372a;
                        if (dVar4 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        yo.e eVar2 = dVar4.f11593e;
                        if (list == null) {
                            list = j0.f134944a;
                        }
                        eVar2.g(list);
                        return;
                    case 6:
                    case 7:
                        g22.e.f(kVar);
                        kVar.requireActivity().setResult(0);
                        kVar.requireActivity().finish();
                        jd0.j jVarM2 = ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).M();
                        Context contextRequireContext2 = kVar.requireContext();
                        ap.d dVar5 = kVar.f29372a;
                        if (dVar5 != null) {
                            jVarM2.b(contextRequireContext2, dVar5.f11589a);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                    default:
                        u0.r();
                        return;
                }
        }
    }
}
