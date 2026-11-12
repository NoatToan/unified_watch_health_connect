package hc0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import c22.e1;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import h0.r0;
import hk0.p;
import java.util.ArrayList;
import java.util.TreeSet;
import org.koin.java.KoinJavaComponent;
import rx.schedulers.Schedulers;
import zb0.a0;
import zb0.n0;
import zb0.t;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
public class b extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f83211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f83212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f83213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f83214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f83215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f83216i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC1638b f83217j = new ViewOnClickListenerC1638b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f83208a = new ArrayList(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeSet<Integer> f83209b = new TreeSet<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet<Integer> f83210c = new TreeSet<>();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            sd2.f fVar;
            String string;
            q1 q1VarA;
            int iIntValue = ((Integer) view2.getTag(R.id.device_dashboard_item_connection_icon_listview_position)).intValue();
            int iIntValue2 = ((Integer) view2.getTag(R.id.device_dashboard_item_connection_icon_resource_id)).intValue();
            b bVar = b.this;
            gc0.e eVar = (gc0.e) bVar.f83208a.get(iIntValue);
            if (eVar != null) {
                k kVar = (k) bVar.f83213f;
                if (!kVar.U6() || (fVar = eVar.f76845a) == null) {
                    return;
                }
                if (fVar.O() && (fVar instanceof sd2.j)) {
                    sd2.j jVar = (sd2.j) fVar;
                    new a0(kVar.requireContext(), new bd0.a(jVar.J0, jVar.O0), eVar.f76846b).a();
                    return;
                }
                if (!fVar.S()) {
                    new a0(kVar.requireContext(), new bd0.a(fVar.d0(), fVar.getProductDisplayName()), eVar.f76846b).a();
                    return;
                }
                nl0.a jVar2 = null;
                if (iIntValue2 == 2131231972) {
                    String productNumber = fVar.getProductNumber();
                    u0 u0Var = u0.S5;
                    if (u0.n(productNumber, u0Var, u0.P5, u0.H0)) {
                        long unitID = fVar.getUnitID();
                        if (GCMSettingManager.z(unitID)) {
                            String string2 = kVar.getString(R.string.msg_setup_success_wifi_sync_auto);
                            q1.f41066b.getClass();
                            q1VarA = q1.b.a(R.string.devices_smart_scale_wifi_setup_complete, string2, R.string.lbl_close, 0, null);
                        } else {
                            String string3 = u0.n(fVar.getProductNumber(), u0Var) ? kVar.getString(R.string.msg_mercury_wifi_connection_needed) : kVar.getString(R.string.devices_smart_scale_help_wifi_setup_incomplete_message);
                            com.google.android.datatransport.runtime.scheduling.jobscheduling.a aVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(kVar, eVar, unitID, 5);
                            q1.f41066b.getClass();
                            q1VarA = q1.b.a(R.string.devices_smart_scale_wifi_setup_incomplete, string3, R.string.lbl_settings, R.string.lbl_close, aVar);
                        }
                        if (kVar.getActivity() != null) {
                            q1VarA.v6(kVar.getChildFragmentManager(), "device.status.icon.dialog.msg");
                            return;
                        }
                        return;
                    }
                    if (p.m(fVar)) {
                        return;
                    }
                    String productNumber2 = fVar.getProductNumber();
                    boolean zN = u0.n(productNumber2, u0.I1);
                    int i14 = R.string.devices_help_how_to_sync_title;
                    if (zN) {
                        string = e1.a() ? kVar.getString(R.string.msg_vivomove_setup_how_to_pair) : kVar.getString(R.string.devices_vivomove_help_connect_device, kVar.getString(R.string.os_name_android));
                    } else if (u0.n(productNumber2, u0.H1)) {
                        string = kVar.getString(R.string.device_settings_vivofit4_help_how_to_sync);
                    } else if (n0.j(productNumber2)) {
                        string = kVar.getString(R.string.devices_vivofit_help_how_to_sync_vivofit);
                    } else {
                        if (u0.q(productNumber2) || u0.s(productNumber2)) {
                            string = kVar.getString(R.string.msg_wear_device_chest_enable_bluetooth, fVar.getProductDisplayName(), kVar.getString(R.string.os_name_android));
                        } else {
                            string = (u0.n(productNumber2, u0.L5) || u0.n(productNumber2, u0.R5) || u0.n(productNumber2, u0.U5)) ? kVar.getString(R.string.devices_pedals_info_help, fVar.getProductDisplayName()) : kVar.getString(R.string.devices_generic_help_connect_device, fVar.getProductDisplayName(), kVar.getString(R.string.os_name_android));
                        }
                        i14 = R.string.devices_help_how_to_connect_title;
                    }
                    if (kVar.getActivity() != null) {
                        q1.f41066b.getClass();
                        q1.b.a(i14, string, R.string.lbl_close, 0, null).v6(kVar.getChildFragmentManager(), "device.status.icon.dialog.msg");
                        return;
                    }
                    return;
                }
                if (iIntValue2 == 2131231971) {
                    long unitID2 = fVar.getUnitID();
                    b bVar2 = kVar.f83255x;
                    if (bVar2 != null) {
                        bVar2.a(unitID2);
                    }
                    wb2.h hVar = eVar.f76851g;
                    String string4 = (hVar == null || hVar.f184019b != wb2.h.NO_RESPONSE_ON_UPLOAD_CONFIG.f184019b) ? kVar.getString(R.string.devices_sync_failed_message_1, fVar.getProductDisplayName()) : kVar.getString(R.string.devices_sync_failed_message_104, fVar.getProductDisplayName());
                    hb.a aVar2 = new hb.a(6);
                    q1.f41066b.getClass();
                    q1 q1VarA2 = q1.b.a(R.string.devices_sync_failed, string4, R.string.lbl_dismiss, 0, aVar2);
                    if (kVar.getActivity() != null) {
                        q1VarA2.v6(kVar.getChildFragmentManager(), "devices.sync.failed.dialog");
                        return;
                    }
                    return;
                }
                if (iIntValue2 == R.drawable.exterior_link) {
                    com.garmin.android.apps.connectmobile.devices.model.l lVar = eVar.f76846b;
                    if (!eVar.b() || lVar == null) {
                        return;
                    }
                    androidx.fragment.app.m mVarRequireActivity = kVar.requireActivity();
                    String f143517g = lVar.getF143517g();
                    boolean golfAppSyncCapable = lVar.getGolfAppSyncCapable();
                    String deviceDisplayName = lVar.getDeviceDisplayName();
                    String strC = lVar.C();
                    mVarRequireActivity.getClass();
                    if (u0.p(f143517g, golfAppSyncCapable)) {
                        if (deviceDisplayName == null) {
                            deviceDisplayName = "";
                        }
                        jVar2 = new nl0.b(mVarRequireActivity, false, "golf.app.pairing.screen", f143517g, deviceDisplayName, strC).a();
                    } else if (u0.o(f143517g)) {
                        jVar2 = new en.j(mVarRequireActivity, f143517g, deviceDisplayName, null, ve2.f.b(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h()));
                    } else {
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.DEVICES;
                        aVar3.getClass();
                        i2.a.o(a2Var, "getSeparateAppDeepLink: separate app deep link not handled");
                    }
                    if (jVar2 != null) {
                        jVar2.execute();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: hc0.b$b, reason: collision with other inner class name */
    public class ViewOnClickListenerC1638b implements View.OnClickListener {
        public ViewOnClickListenerC1638b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int iIntValue = ((Integer) view2.getTag(R.id.device_dashboard_item_connection_icon_listview_position)).intValue();
            b bVar = b.this;
            gc0.e eVar = (gc0.e) bVar.f83208a.get(iIntValue);
            if (eVar != null) {
                sd2.f fVar = eVar.f76845a;
                k kVar = (k) bVar.f83213f;
                kVar.getClass();
                kg1.a.f104701a.getClass();
                if (kg1.a.C2003a.a().x()) {
                    if (fVar != null) {
                        Toast.makeText(kVar.getActivity(), "As the GCM developer Mimic Software flag is true, we will push an update", 1).show();
                        j83.l.a(new hc0.d(fVar, 0)).d(Schedulers.io()).b(l83.a.a()).c(new m(kVar, fVar, eVar));
                    }
                } else if (fVar != null) {
                    yr1.d.d(fVar, "DevicesDashboardFragment", null);
                }
                eVar.a(gc0.f.INITIATED);
                new Handler().postDelayed(new r0(4, this, eVar), AbstractComponentTracker.LINGERING_TIMEOUT);
            }
            bVar.notifyDataSetChanged();
        }
    }

    public interface c {
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f83220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f83221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f83222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f83223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ImageView f83224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ImageView f83225f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ProgressBar f83226g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinearLayout f83227h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ProgressBar f83228i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f83229j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f83230k;
    }

    public b(Context context, c cVar) {
        this.f83213f = cVar;
        this.f83212e = hb2.f.a(15, context);
        this.f83211d = LayoutInflater.from(context);
        this.f83214g = a7.b.getDrawable(context, R.drawable.progress_horizontal_device_item_default);
        this.f83215h = a7.b.getDrawable(context, R.drawable.progress_horizontal_device_item_sync_successful);
    }

    public final void a(long j8) {
        sd2.f fVar;
        gc0.f fVar2;
        ArrayList<gc0.e> arrayList = this.f83208a;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (gc0.e eVar : arrayList) {
            if (eVar != null && (fVar = eVar.f76845a) != null && fVar.getUnitID() == j8 && ((fVar2 = eVar.f76847c) == gc0.f.FINISHED_FAILURE || fVar2 == gc0.f.FINISHED_SUCCESS)) {
                eVar.f76848d = -1L;
                eVar.a(gc0.f.NONE);
                notifyDataSetChanged();
                return;
            }
        }
    }

    public final void c(d dVar, int i14, gc0.e eVar) {
        sd2.f fVar = eVar.f76845a;
        boolean zB = eVar.b();
        dVar.f83220a.setVisibility(0);
        dVar.f83230k = false;
        dVar.f83229j = false;
        dVar.f83221b.setText(!TextUtils.isEmpty(fVar.getDisplayName()) ? fVar.getDisplayName() : fVar.getProductDisplayName());
        dVar.f83225f.setVisibility(8);
        dVar.f83222c.setVisibility(8);
        dVar.f83226g.setVisibility(8);
        dVar.f83223d.setVisibility(zB ? 0 : 8);
        ImageView imageView = dVar.f83223d;
        if (zB) {
            imageView.setImageResource(R.drawable.exterior_link);
            dVar.f83223d.setImageTintList(a7.b.getColorStateList(dVar.f83220a.getContext(), R.color.gds_data_viz_neutral_secondary));
            dVar.f83223d.setOnClickListener(this.f83216i);
            dVar.f83223d.setTag(R.id.device_dashboard_item_connection_icon_listview_position, Integer.valueOf(i14));
            dVar.f83223d.setTag(R.id.device_dashboard_item_connection_icon_resource_id, Integer.valueOf(R.drawable.exterior_link));
        } else {
            imageView.setOnClickListener(null);
            dVar.f83223d.setTag(R.id.device_dashboard_item_connection_icon_listview_position, null);
            dVar.f83223d.setTag(R.id.device_dashboard_item_connection_icon_resource_id, null);
        }
        dVar.f83227h.setVisibility(8);
        eVar.a(gc0.f.NONE);
    }

    public final void d(d dVar, int i14, gc0.e eVar) {
        dVar.f83230k = false;
        dVar.f83229j = false;
        sd2.f fVar = eVar.f76845a;
        if (u0.r(fVar.getProductNumber()) && fVar.T() && !fVar.isPaired()) {
            dVar.f83225f.setVisibility(8);
        } else {
            dVar.f83225f.setVisibility(0);
            ImageView imageView = dVar.f83225f;
            if (fVar != null) {
                imageView.getClass();
                t.c(imageView, fVar);
            }
        }
        dVar.f83220a.post(new hc0.a(this, dVar, eVar, fVar, i14));
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f83208a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i14) {
        return this.f83208a.get(i14);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i14) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i14) {
        if (this.f83209b.contains(Integer.valueOf(i14))) {
            return 1;
        }
        return this.f83210c.contains(Integer.valueOf(i14)) ? 2 : 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        d dVar;
        int itemViewType = getItemViewType(i14);
        if (view2 == null) {
            dVar = new d();
            LayoutInflater layoutInflater = this.f83211d;
            if (itemViewType == 0) {
                view2 = layoutInflater.inflate(R.layout.devices_dashboard_item, viewGroup, false);
                dVar.f83225f = (ImageView) view2.findViewById(R.id.device_image);
                dVar.f83221b = (TextView) view2.findViewById(R.id.device_friendly_name);
                dVar.f83222c = (TextView) view2.findViewById(R.id.device_connection_status);
                dVar.f83223d = (ImageView) view2.findViewById(R.id.device_status_icon);
                dVar.f83226g = (ProgressBar) view2.findViewById(R.id.device_sync_progress_bar);
                dVar.f83220a = view2.findViewById(R.id.device_status_icon_parent_view);
                LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.sync_now_layout);
                dVar.f83227h = linearLayout;
                linearLayout.setOnClickListener(this.f83217j);
                dVar.f83224e = (ImageView) view2.findViewById(R.id.device_sync_icon);
                dVar.f83228i = (ProgressBar) view2.findViewById(R.id.initiate_sync_spinner);
                Context context = view2.getContext();
                if (c22.b.e(context)) {
                    ImageView imageView = dVar.f83224e;
                    ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
                    imageView.setScaleType(scaleType);
                    dVar.f83223d.setScaleType(scaleType);
                    int iC = (int) c22.b.c(context, xy2.b.n(context.getResources(), 32.0f), 1.8f);
                    dVar.f83225f.getLayoutParams().width = iC;
                    dVar.f83225f.getLayoutParams().height = iC;
                    int iC2 = (int) c22.b.c(context, context.getResources().getDimensionPixelSize(R.dimen.icon_default), 1.8f);
                    dVar.f83224e.getLayoutParams().width = iC2;
                    dVar.f83224e.getLayoutParams().height = iC2;
                    dVar.f83227h.getLayoutParams().width = iC2;
                    dVar.f83227h.getLayoutParams().height = iC2;
                }
            } else if (itemViewType == 1) {
                view2 = layoutInflater.inflate(R.layout.devices_dashboard_item_separator, viewGroup, false);
                dVar.f83221b = (TextView) view2.findViewById(R.id.section_text);
            } else if (itemViewType == 2) {
                view2 = layoutInflater.inflate(R.layout.gcm4_sensors_row, viewGroup, false);
            }
            if (view2 != null) {
                view2.setTag(dVar);
            }
        } else {
            dVar = (d) view2.getTag();
        }
        if (itemViewType == 1) {
            dVar.f83230k = false;
            dVar.f83229j = true;
            dVar.f83221b.setText(R.string.devices_section_title_registered_to_connect);
            return view2;
        }
        if (itemViewType == 2) {
            dVar.f83230k = true;
            dVar.f83229j = false;
            return view2;
        }
        gc0.e eVar = (gc0.e) this.f83208a.get(i14);
        dVar.f83227h.setTag(R.id.device_dashboard_item_connection_icon_listview_position, Integer.valueOf(i14));
        sd2.f fVar = eVar.f76845a;
        if (u0.n(fVar.getProductNumber(), u0.H0, u0.P5, u0.S5)) {
            if (!fVar.T()) {
                d(dVar, i14, eVar);
                return view2;
            }
            if (fVar.isPaired()) {
                d(dVar, i14, eVar);
                return view2;
            }
            c(dVar, i14, eVar);
            return view2;
        }
        if (!fVar.O()) {
            if (fVar.isPaired()) {
                d(dVar, i14, eVar);
                return view2;
            }
            c(dVar, i14, eVar);
            return view2;
        }
        boolean zB = eVar.b();
        dVar.f83230k = false;
        dVar.f83229j = false;
        dVar.f83221b.setText(!TextUtils.isEmpty(fVar.getDisplayName()) ? fVar.getDisplayName() : fVar.getProductDisplayName());
        ImageView imageView2 = dVar.f83225f;
        sd2.f fVar2 = eVar.f76845a;
        if (fVar2 != null) {
            imageView2.getClass();
            t.c(imageView2, fVar2);
        }
        dVar.f83225f.setVisibility(0);
        dVar.f83222c.setVisibility(0);
        dVar.f83222c.setText(R.string.incomplete_device_list_description);
        dVar.f83226g.setVisibility(8);
        dVar.f83223d.setVisibility(0);
        ImageView imageView3 = dVar.f83223d;
        if (zB) {
            imageView3.setImageResource(R.drawable.exterior_link);
            dVar.f83223d.setImageTintList(a7.b.getColorStateList(dVar.f83220a.getContext(), R.color.gds_data_viz_neutral_secondary));
            dVar.f83223d.setTag(R.id.device_dashboard_item_connection_icon_listview_position, Integer.valueOf(i14));
            dVar.f83223d.setTag(R.id.device_dashboard_item_connection_icon_resource_id, Integer.valueOf(R.drawable.exterior_link));
        } else {
            imageView3.setImageResource(2131231971);
            dVar.f83223d.setTag(R.id.device_dashboard_item_connection_icon_listview_position, Integer.valueOf(i14));
            dVar.f83223d.setTag(R.id.device_dashboard_item_connection_icon_resource_id, 2131231971);
        }
        dVar.f83223d.setOnClickListener(this.f83216i);
        dVar.f83227h.setVisibility(4);
        eVar.a(gc0.f.NONE);
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }
}
