package com.huawei.watchface;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.uikit.hwprogressbar.widget.HwProgressBar;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class z3 extends u {
    public static final String i = "z3";
    public Context f;
    public HwProgressBar g;
    public TextView h;

    public z3(Context context, int i2) {
        super(context, i2);
        u.a(context, this);
        this.f = context.getApplicationContext();
    }

    public static z3 d(Context context) {
        z3 z3Var = new z3(context, R.style.watch_face_style_saving_dialog);
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.watchface_dialog_saving, (ViewGroup) null);
        z3Var.h = (TextView) viewInflate.findViewById(R.id.tv_basic_info_check);
        HwProgressBar hwProgressBar = (HwProgressBar) viewInflate.findViewById(R.id.pb_basic_info);
        z3Var.g = hwProgressBar;
        hwProgressBar.setLayerType(1, null);
        z3Var.g.setVisibility(0);
        z3Var.addContentView(viewInflate, new ViewGroup.LayoutParams(-1, -2));
        return z3Var;
    }

    public void b(String str) {
        if (this.h == null || str == null) {
            return;
        }
        int color = ContextCompat.getColor(this.f, R.color.aar_textColorPrimary);
        float dimension = this.f.getResources().getDimension(R.dimen.dp_15);
        this.h.setTextColor(color);
        this.h.setTextSize(0, dimension);
        this.h.setText(str);
    }

    @Override // com.huawei.watchface.u, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        u.a(this);
        HwLog.i(i, "dismiss() enter.");
        super.dismiss();
        if (this.g != null) {
            this.g = null;
        }
    }

    public void e() {
        show();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
