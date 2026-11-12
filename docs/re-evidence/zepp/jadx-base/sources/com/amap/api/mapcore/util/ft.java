package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ft extends fu implements View.OnClickListener {
    private OfflineMapManager a;
    private View b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private int g;
    private String h;

    public ft(Context context, OfflineMapManager offlineMapManager) {
        super(context);
        this.a = offlineMapManager;
    }

    @Override // com.amap.api.mapcore.util.fu
    public final void a() {
        View viewA = fz.a(getContext(), R.array.alarm_repeat_type);
        this.b = viewA;
        setContentView(viewA);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.amap.api.mapcore.util.ft.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ft.this.dismiss();
            }
        });
        this.c = (TextView) this.b.findViewById(R.dimen.abc_action_bar_icon_vertical_padding_material);
        TextView textView = (TextView) this.b.findViewById(R.dimen.abc_action_bar_overflow_padding_end_material);
        this.d = textView;
        textView.setText("暂停下载");
        this.e = (TextView) this.b.findViewById(R.dimen.abc_action_bar_overflow_padding_start_material);
        this.f = (TextView) this.b.findViewById(R.dimen.abc_action_bar_stacked_max_height);
        this.d.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.f.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            int id = view.getId();
            if (id != R.dimen.abc_action_bar_overflow_padding_end_material) {
                if (id != R.dimen.abc_action_bar_overflow_padding_start_material) {
                    if (id == R.dimen.abc_action_bar_stacked_max_height) {
                        dismiss();
                        return;
                    }
                    return;
                } else {
                    if (TextUtils.isEmpty(this.h)) {
                        return;
                    }
                    this.a.remove(this.h);
                    dismiss();
                    return;
                }
            }
            int i = this.g;
            if (i == 0) {
                this.d.setText("继续下载");
                this.a.pause();
            } else if (i == 3 || i == -1 || i == 101 || i == 102 || i == 103) {
                this.d.setText("暂停下载");
                this.a.downloadByCityName(this.h);
            }
            dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(int i, String str) {
        this.c.setText(str);
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
}
