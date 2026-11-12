package com.xmlywind.sdk.nativead;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes22.dex */
public class SigAppInfoView extends RelativeLayout {
    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;

    public SigAppInfoView(Context context) {
        super(context);
        View.inflate(context, getLayoutId(), this);
        this.a = (TextView) findViewById(com.xmlywind.sdk.common.utils.o.a(getContext(), "sig_app_info_ver"));
        this.b = (TextView) findViewById(com.xmlywind.sdk.common.utils.o.a(getContext(), "sig_app_info_dev"));
        this.c = (TextView) findViewById(com.xmlywind.sdk.common.utils.o.a(getContext(), "sig_app_info_privacy"));
        this.d = (TextView) findViewById(com.xmlywind.sdk.common.utils.o.a(getContext(), "sig_app_info_permissions"));
        this.c.getPaint().setFlags(8);
        this.c.getPaint().setAntiAlias(true);
        this.d.getPaint().setFlags(8);
        this.d.getPaint().setAntiAlias(true);
    }

    private int getLayoutId() {
        return com.xmlywind.sdk.common.utils.o.b(getContext(), "sig_app_info_layout");
    }

    public void a(String str, String str2) {
        this.a.setText(str);
        this.b.setText(str2);
    }
}
