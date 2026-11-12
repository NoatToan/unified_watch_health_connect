package com.garmin.android.apps.connectmobile.golf.truswing;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.q1;
import i3.e5;
import java.text.DecimalFormat;
import java.util.List;
import o62.b0;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes8.dex */
public class j extends ArrayAdapter<SwingDTO> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f35855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f35856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public cl0.d f35859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f35860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<Long> f35861g;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SwingDTO f35862a;

        public a(SwingDTO swingDTO) {
            this.f35862a = swingDTO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            c cVar = j.this.f35856b;
            if (cVar != null) {
                com.garmin.android.apps.connectmobile.golf.truswing.a aVar = (com.garmin.android.apps.connectmobile.golf.truswing.a) cVar;
                cl0.a.e().getClass();
                boolean zH = cl0.a.h();
                SwingDTO swingDTO = this.f35862a;
                if (!zH) {
                    aVar.V6(swingDTO);
                    return;
                }
                List<Long> listY6 = aVar.Y6();
                if (listY6 == null) {
                    aVar.T6(swingDTO);
                    cl0.a.e().getClass();
                    if (cl0.a.g()) {
                        aVar.U6();
                        return;
                    }
                    return;
                }
                if (aVar.c7(listY6, swingDTO)) {
                    cl0.a.e().getClass();
                    if (cl0.a.g()) {
                        aVar.U6();
                        return;
                    }
                    return;
                }
                aVar.T6(swingDTO);
                cl0.a.e().getClass();
                if (cl0.a.g()) {
                    aVar.U6();
                }
            }
        }
    }

    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SwingDTO f35864a;

        public b(SwingDTO swingDTO) {
            this.f35864a = swingDTO;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view2) {
            c cVar = j.this.f35856b;
            if (cVar != null) {
                com.garmin.android.apps.connectmobile.golf.truswing.a aVar = (com.garmin.android.apps.connectmobile.golf.truswing.a) cVar;
                String string = aVar.getString(aVar.A.getCount() <= 1 ? R.string.golf_lbl_delete_swing_and_notes_message : R.string.golf_lbl_swing_delete_message);
                b0 b0Var = new b0(29, aVar, this.f35864a);
                q1.f41066b.getClass();
                q1.b.a(0, string, R.string.lbl_delete, R.string.lbl_cancel, b0Var).show(aVar.getChildFragmentManager(), (String) null);
            }
            return true;
        }
    }

    public interface c {
    }

    public j(Activity activity, cl0.d dVar, c cVar) {
        super(activity, android.R.layout.simple_list_item_2);
        this.f35860f = getContext().getString(R.string.golf_lbl_swing_tempo).toLowerCase(getContext().getResources().getConfiguration().locale);
        this.f35855a = activity;
        this.f35857c = activity.getString(R.string.no_value);
        this.f35858d = activity.getString(R.string.sensor_unknown);
        this.f35859e = dVar;
        this.f35856b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b9  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        d dVar;
        String strG;
        String strJ;
        SwingDTO swingDTO = (SwingDTO) getItem(i14);
        com.garmin.android.apps.connectmobile.golf.truswing.model.i iVar = swingDTO.f35879h;
        com.garmin.android.apps.connectmobile.golf.truswing.model.k kVar = swingDTO.f35875d;
        int i15 = 0;
        if (view2 == null) {
            view2 = this.f35855a.getLayoutInflater().inflate(R.layout.gcm_golf_swing_list_item, viewGroup, false);
            dVar = new d(i15);
            dVar.f35866a = view2.findViewById(R.id.top_divider);
            dVar.f35867b = (TextView) view2.findViewById(R.id.swing_order);
            dVar.f35868c = (TextView) view2.findViewById(R.id.swing_club);
            dVar.f35869d = (TextView) view2.findViewById(R.id.swing_speed);
            dVar.f35870e = (TextView) view2.findViewById(R.id.swing_tempo);
            dVar.f35871f = (ImageView) view2.findViewById(R.id.swing_selected_icon);
            view2.setTag(dVar);
        } else {
            dVar = (d) view2.getTag();
        }
        String str = this.f35857c;
        if (iVar != null) {
            double d14 = iVar.f35934a;
            q3 q3Var = this.f35859e.f27935b;
            DecimalFormat decimalFormatM = l3.m();
            l3.f23124b.getClass();
            String strM0 = l3.a.M0(this.f35855a, d14, q3Var, decimalFormatM, true);
            if (!TextUtils.isEmpty(strM0)) {
                str = strM0;
            }
            strG = e5.g(l3.a.D(iVar.f35937d), StringUtils.SPACE, this.f35860f);
        } else {
            strG = str;
        }
        if (kVar == null) {
            strJ = this.f35858d;
        } else if (!TextUtils.isEmpty(kVar.f35953b)) {
            strJ = kVar.f35953b;
        } else if (kVar.f35954c != null) {
            strJ = wl0.h.i().j(kVar.f35954c.f20622a);
        } else {
            strJ = this.f35858d;
        }
        dVar.f35866a.setVisibility(i14 == 0 ? 0 : 8);
        dVar.f35867b.setText(String.valueOf(swingDTO.f35881j));
        dVar.f35868c.setText(strJ);
        dVar.f35869d.setText(str);
        dVar.f35870e.setText(strG);
        ImageView imageView = dVar.f35871f;
        List<Long> list = this.f35861g;
        imageView.setVisibility((list == null || list.isEmpty()) ? false : this.f35861g.contains(Long.valueOf(swingDTO.f35872a)) ? 0 : 4);
        view2.setOnClickListener(new a(swingDTO));
        view2.setOnLongClickListener(new b(swingDTO));
        return view2;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f35866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f35867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f35868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f35869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f35870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ImageView f35871f;

        public /* synthetic */ d(int i14) {
            this();
        }

        private d() {
        }
    }
}
