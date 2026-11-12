package bv2;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.presentationlayer.SettingsDeviceActivity;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21501a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f21502b;

    public /* synthetic */ i(Fragment fragment) {
        this.f21502b = fragment;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        FrameLayout frameLayout;
        int i14 = this.f21501a;
        Fragment fragment = this.f21502b;
        switch (i14) {
            case 0:
                Boolean bool = (Boolean) obj;
                int i15 = k.f21507h;
                if (bool != null && bool.booleanValue()) {
                    v childFragmentManager = fragment.getChildFragmentManager();
                    h.f21485k.getClass();
                    Fragment fragmentG = childFragmentManager.G(h.f21486l);
                    if (fragmentG != null) {
                        v childFragmentManager2 = fragment.getChildFragmentManager();
                        childFragmentManager2.getClass();
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager2);
                        aVar.k(fragmentG);
                        aVar.e();
                    } else {
                        View view2 = fragment.getView();
                        if (view2 != null && (frameLayout = (FrameLayout) view2.findViewById(R.id.frag_device_link_banner)) != null) {
                            frameLayout.removeAllViews();
                        }
                    }
                }
                break;
            default:
                jw2.c cVar = (jw2.c) obj;
                cx2.h hVar = uv2.a.f172960c;
                cVar.getClass();
                tv2.b bVar = cVar.f101373b;
                uv2.d.f172969a.getClass();
                fragment.getClass();
                uv2.d.f172970b.getClass();
                androidx.fragment.app.m activity = fragment.getActivity();
                SettingsDeviceActivity settingsDeviceActivity = activity instanceof SettingsDeviceActivity ? (SettingsDeviceActivity) activity : null;
                if (settingsDeviceActivity != null) {
                    if (bVar != null) {
                        if (cx2.g.e(settingsDeviceActivity)) {
                            Context contextRequireContext = fragment.requireContext();
                            contextRequireContext.getClass();
                            bx2.a aVar2 = new bx2.a(contextRequireContext);
                            tv2.a.C3135a c3135a = tv2.a.f166658a;
                            Context contextRequireContext2 = fragment.requireContext();
                            contextRequireContext2.getClass();
                            ug2.h hVar2 = new ug2.h(7, cVar, settingsDeviceActivity);
                            c3135a.getClass();
                            tv2.a.C3135a.a(contextRequireContext2, settingsDeviceActivity, aVar2, bVar, hVar2);
                        } else {
                            Logger logger = cx2.h.f56678c;
                        }
                    } else if (cVar.f101372a) {
                        settingsDeviceActivity.V9();
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
