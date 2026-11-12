package dn0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import java.util.Map;
import java.util.Objects;
import t10.n;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f60505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f60506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f60507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f60508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f60509g;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14) {
        this.f60503a = i14;
        this.f60504b = obj;
        this.f60505c = obj2;
        this.f60506d = obj3;
        this.f60507e = obj4;
        this.f60508f = obj5;
        this.f60509g = obj6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        int i14 = this.f60503a;
        Object obj2 = this.f60509g;
        Object obj3 = this.f60508f;
        Object obj4 = this.f60507e;
        Object obj5 = this.f60506d;
        Object obj6 = this.f60505c;
        Object obj7 = this.f60504b;
        switch (i14) {
            case 0:
                GSMRedirectActivity.r rVar = (GSMRedirectActivity.r) obj7;
                Boolean bool = (Boolean) obj6;
                String str = (String) obj5;
                d32.b bVar = (d32.b) obj4;
                Context context = (Context) obj3;
                n nVar = (n) obj2;
                g3 g3Var = (g3) obj;
                int i15 = GSMRedirectActivity.a.f36461b[g3Var.f35300a.ordinal()];
                if (i15 != 1) {
                    if (i15 == 2) {
                        i2.i("GSMRedirectActivity", "Loading workout detail fails, " + g3Var.f35303d);
                        GSMRedirectActivity.this.f36458c.setVisibility(8);
                        bVar.setTitle(String.format(context.getString(R.string.workout_name_not_found), rVar.f36500i));
                        bVar.setMessage(context.getString(R.string.workout_name_not_found_desc));
                        bVar.setPositiveButton(R.string.lbl_create_workout_title, new com.garmin.android.apps.connectmobile.gsm.a(rVar));
                    }
                } else if (bool != null) {
                    if (bool.booleanValue()) {
                        if (str != null) {
                            bVar.setTitle(String.format(context.getString(nVar.f161708c), str));
                        } else {
                            bVar.setTitle(context.getString(nVar.f161708c));
                        }
                        bVar.setMessage(context.getString(nVar.f161709d));
                        bVar.setPositiveButton(R.string.lbl_edit, new bi2.k(rVar, 9, nVar, g3Var));
                    } else {
                        rVar.e(nVar, ((WorkoutDetailsDTO) g3Var.f35301b).f48044e);
                    }
                }
                bVar.setNegativeButton(R.string.common_cancel, new com.garmin.android.apps.connectmobile.gsm.b(rVar));
                bVar.show();
                break;
            default:
                lh2.e eVar = (lh2.e) obj7;
                Map<String, ? extends Object> map = (Map) obj6;
                ei2.i iVar = (ei2.i) obj4;
                Fragment fragment = (Fragment) obj3;
                ei2.d dVar = (ei2.d) obj2;
                int i16 = lh2.e.f112471j;
                StyledTextView styledTextView = eVar.f112474d;
                ImageView imageView = eVar.f112477g;
                StyledTextView styledTextView2 = eVar.f112476f;
                hi2.d dVar2 = eVar.f112473c;
                Objects.toString(map.get(mh2.i.TITLE.f118617a));
                dVar2.getClass();
                eVar.i((ii2.b) obj5, map, null);
                if (iVar != null && (iVar instanceof ei2.i.a)) {
                    ei2.i.a aVar = (ei2.i.a) iVar;
                    mh2.e eVar2 = aVar.f64392c;
                    String str2 = aVar.f64390a;
                    styledTextView2.setText(str2);
                    com.bumptech.glide.b.e(eVar.getContext()).l(aVar.f64391b).E(imageView);
                    styledTextView.setText(eVar.getContext().getString(eVar2.f118545a));
                    eVar.f112475e.setOnClickListener(new bv2.j(eVar, fragment, iVar, dVar));
                    eVar.k(eVar2);
                    String str3 = aVar.f64393d;
                    zh2.e.f204807a.getClass();
                    lh2.c cVarF = ((uc0.d) zh2.e.a()).f(str3, str2);
                    if (!cVarF.f112456b.invoke(str3).booleanValue()) {
                        View view2 = fragment.getView();
                        if (view2 != null && (frameLayout2 = (FrameLayout) view2.findViewById(R.id.frag_device_link_banner)) != null) {
                            frameLayout2.addView(cVarF.f112455a.invoke());
                            break;
                        }
                    } else {
                        View view3 = fragment.getView();
                        if (view3 != null && (frameLayout = (FrameLayout) view3.findViewById(R.id.frag_device_link_banner)) != null) {
                            frameLayout.removeAllViews();
                            break;
                        }
                    }
                } else {
                    styledTextView2.setText(eVar.getContext().getString(R.string.setting_device));
                    imageView.setImageDrawable(a7.b.getDrawable(eVar.getContext(), R.drawable.icon_settings_device_default));
                    styledTextView.setText(eVar.getContext().getString(R.string.devices_not_connected));
                    break;
                }
                break;
        }
    }
}
