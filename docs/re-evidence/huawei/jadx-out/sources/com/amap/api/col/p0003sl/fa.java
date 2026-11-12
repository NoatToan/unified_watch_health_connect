package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.huawei.health.R;

/* JADX INFO: loaded from: classes21.dex */
public final class fa extends fb implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OfflineMapManager f2508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f2509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f2510c;
    private TextView d;
    private TextView e;
    private TextView f;
    private int g;
    private String h;

    public fa(Context context, OfflineMapManager offlineMapManager) {
        super(context);
        this.f2508a = offlineMapManager;
    }

    @Override // com.amap.api.col.p0003sl.fb
    protected final void a() {
        View viewA = fg.a(getContext(), R.plurals._2130903041_res_0x7f030001);
        this.f2509b = viewA;
        setContentView(viewA);
        this.f2509b.setOnClickListener(new View.OnClickListener() { // from class: com.amap.api.col.3sl.fa.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fa.this.dismiss();
            }
        });
        this.f2510c = (TextView) this.f2509b.findViewById(R.layout.abc_activity_chooser_view_list_item);
        TextView textView = (TextView) this.f2509b.findViewById(R.layout.abc_alert_dialog_button_bar_material);
        this.d = textView;
        textView.setText("暂停下载");
        this.e = (TextView) this.f2509b.findViewById(R.layout.abc_alert_dialog_material);
        this.f = (TextView) this.f2509b.findViewById(R.layout.abc_alert_dialog_title_material);
        this.d.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.f.setOnClickListener(this);
    }

    public final void a(int i, String str) {
        this.f2510c.setText(str);
        if (i == 0) {
            this.d.setText("暂停下载");
            this.d.setVisibility(0);
            this.e.setText("取消下载");
        }
        if (i == 2) {
            this.d.setVisibility(8);
            this.e.setText("取消下载");
        } else if (i == -1 || i == 101 || i == 102 || i == 103) {
            this.d.setText("继续下载");
            this.d.setVisibility(0);
        } else if (i == 3) {
            this.d.setVisibility(0);
            this.d.setText("继续下载");
            this.e.setText("取消下载");
        } else if (i == 4) {
            this.e.setText("删除");
            this.d.setVisibility(8);
        }
        this.g = i;
        this.h = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            int id = view.getId();
            if (id != R.layout.abc_alert_dialog_button_bar_material) {
                if (id != R.layout.abc_alert_dialog_material) {
                    if (id == R.layout.abc_alert_dialog_title_material) {
                        dismiss();
                        return;
                    }
                    return;
                } else {
                    if (TextUtils.isEmpty(this.h)) {
                        return;
                    }
                    this.f2508a.remove(this.h);
                    dismiss();
                    return;
                }
            }
            int i = this.g;
            if (i == 0) {
                this.d.setText("继续下载");
                this.f2508a.pauseByName(this.h);
            } else if (i == 3 || i == -1 || i == 101 || i == 102 || i == 103) {
                this.d.setText("暂停下载");
                this.f2508a.downloadByCityName(this.h);
            }
            dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
