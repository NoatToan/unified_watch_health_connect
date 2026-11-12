package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.operation.share.HiHealthError;

/* JADX INFO: loaded from: classes12.dex */
public class d extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f21173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f21174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f21175c;
    private a d;

    public interface a {
        void c();

        void onMenuBtnClick(View view);
    }

    public void setTitle(String str) {
        if (this.f21173a == null || dg.b(str)) {
            return;
        }
        this.f21173a.setText(str);
    }

    public void setCallBack(a aVar) {
        this.d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.d;
        if (aVar != null) {
            if (view == this.f21175c) {
                aVar.c();
                return;
            }
            ImageView imageView = this.f21174b;
            if (view == imageView) {
                aVar.onMenuBtnClick(imageView);
            }
        }
    }

    public void a(boolean z) {
        TextView textView = this.f21173a;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    private void a(Context context, boolean z) {
        LayoutInflater.from(context).inflate(R.layout.hiad_custom_emui_action_bar, this);
        this.f21175c = (ImageView) findViewById(R.id.hiad_id_back_btn);
        this.f21173a = (TextView) findViewById(R.id.hiad_id_title_tv);
        ImageView imageView = (ImageView) findViewById(R.id.hiad_id_menu_btn);
        this.f21174b = imageView;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 4);
        }
    }

    private void a() {
        ImageView imageView = this.f21175c;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        ImageView imageView2 = this.f21174b;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
    }

    public d(Context context, boolean z) {
        super(context);
        setBackgroundColor(Color.rgb(0, HiHealthError.ERR_WRONG_DEVICE, 168));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.hiad_8_dp);
        setPadding(dimensionPixelSize, as.h(context) + dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        a(context, z);
        a();
    }
}
