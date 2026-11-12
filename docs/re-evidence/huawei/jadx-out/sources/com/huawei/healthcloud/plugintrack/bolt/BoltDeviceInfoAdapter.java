package com.huawei.healthcloud.plugintrack.bolt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.ivo;
import defpackage.jxk;
import defpackage.ltc;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class BoltDeviceInfoAdapter extends RecyclerView.Adapter<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10439a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<ivo.d> f10440c;
    private OnItemClickListener d;
    private Context e;

    public interface OnItemClickListener {
        void onItemClick(int i);
    }

    BoltDeviceInfoAdapter(Context context, List<ivo.d> list, Context context2) {
        this.f10440c = list;
        this.e = context2;
        this.f10439a = context == null ? context2 : context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bolt_device_info, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e eVar, final int i) {
        if (njy.e(this.f10440c, i)) {
            LogUtil.j("Track_BoltDeviceInfoAdapter", "onBindViewHolder() outOfBounds position: ", Integer.valueOf(i));
            return;
        }
        ivo.d dVar = this.f10440c.get(i);
        if (dVar == null) {
            LogUtil.j("Track_BoltDeviceInfoAdapter", "onBindViewHolder() deviceInfo is null");
            return;
        }
        if (dVar.e() == null) {
            LogUtil.j("Track_BoltDeviceInfoAdapter", "onBindViewHolder() deviceInfo.getDeviceInfo() is null");
            return;
        }
        b(eVar, dVar);
        b(eVar);
        jxk.c(this.f10439a, eVar.f, R.drawable.bolt_list_item_bg);
        eVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.bolt.BoltDeviceInfoAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (BoltDeviceInfoAdapter.this.d == null) {
                    LogUtil.j("Track_BoltDeviceInfoAdapter", "mOnItemClickListener is null");
                } else {
                    BoltDeviceInfoAdapter.this.d.onItemClick(i);
                }
            }
        });
        BoltCustomDialog.c().c(true);
    }

    private void b(e eVar, ivo.d dVar) {
        eVar.f10444c.setImageResource(R.drawable.ic_bolt_unchecked);
        eVar.f10444c.setVisibility(0);
        eVar.d.setVisibility(8);
        LogUtil.a("Track_BoltDeviceInfoAdapter", "initBoltDeviceStatus() deviceInfo: ", dVar);
        int deviceConnectState = dVar.e().getDeviceConnectState();
        if (dVar.c() && deviceConnectState == 2) {
            eVar.f10444c.setImageResource(R.drawable.ic_bolt_checked);
            eVar.f10444c.setVisibility(0);
            eVar.d.setText(this.e.getResources().getString(R.string.IDS_bolt_in_use));
            eVar.d.setVisibility(0);
            jxk.e(this.f10439a, eVar.d, R.color.textColorSecondary);
        }
        if (!dVar.c()) {
            eVar.f10444c.setImageResource(R.drawable.ic_bolt_unchecked);
            eVar.f10444c.setVisibility(0);
            eVar.d.setText("");
        }
        if (dVar.a()) {
            eVar.f10444c.setVisibility(8);
            eVar.h.setVisibility(0);
        }
        if (deviceConnectState == 1) {
            eVar.f10444c.setImageResource(R.drawable.ic_bolt_unchecked);
            eVar.f10444c.setVisibility(8);
            eVar.h.setVisibility(0);
            eVar.d.setVisibility(0);
            eVar.d.setText(this.e.getResources().getString(R.string.IDS_hw_health_wear_connect_device_connect_text));
            jxk.e(this.f10439a, eVar.d, R.color.textColorSecondary);
        }
        if (deviceConnectState == 3) {
            eVar.f10444c.setImageResource(R.drawable.ic_bolt_unchecked);
            eVar.f10444c.setVisibility(0);
            eVar.d.setVisibility(8);
        }
        if (deviceConnectState == 2 && dVar.b() >= 0) {
            eVar.f10442a.setText(ltc.c(dVar.b(), 2, 0));
            jxk.e(this.f10439a, eVar.f10442a, R.color.textColorSecondary);
            eVar.f10443b.setImageDrawable(qrs.e(this.f10439a, dVar.b()));
            eVar.f10442a.setVisibility(0);
            eVar.f10443b.setVisibility(0);
        } else {
            eVar.f10442a.setVisibility(8);
            eVar.f10443b.setVisibility(8);
        }
        eVar.e.setText(dVar.e().getDeviceName());
        jxk.e(this.f10439a, eVar.e, R.color.textColorPrimary);
        a(deviceConnectState);
    }

    private void a(int i) {
        if (BoltCustomDialog.c().e() || i != 4) {
            return;
        }
        Context context = this.e;
        qpx.e(context, context.getString(R.string.IDS_bolt_awaken_tip));
    }

    private void b(e eVar) {
        if (LanguageUtil.ba(this.e)) {
            eVar.f10443b.setScaleX(-1.0f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<ivo.d> list = this.f10440c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f10442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f10443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f10444c;
        HealthTextView d;
        HealthTextView e;
        LinearLayout f;
        HealthProgressBar h;

        e(View view) {
            super(view);
            this.f = (LinearLayout) view.findViewById(R.id.item_bolt_root);
            this.f10443b = (ImageView) view.findViewById(R.id.item_bolt_battery_image);
            this.f10442a = (HealthTextView) view.findViewById(R.id.item_bolt_battery_value);
            this.e = (HealthTextView) view.findViewById(R.id.item_device_name);
            this.f10444c = (ImageView) view.findViewById(R.id.item_check_image);
            this.d = (HealthTextView) view.findViewById(R.id.item_bolt_in_use);
            this.h = (HealthProgressBar) view.findViewById(R.id.hw_device_before_one_loading_img);
        }
    }

    public void b(OnItemClickListener onItemClickListener) {
        this.d = onItemClickListener;
    }
}
