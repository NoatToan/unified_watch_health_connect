package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.utils.dk;

/* JADX INFO: loaded from: classes41.dex */
public class NativeVideoControlPanel extends AutoScaleSizeRelativeLayout implements com.huawei.openalliance.ad.views.interfaces.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f20793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f20794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f20795c;
    private ImageView d;
    private View e;
    private View f;
    private View g;
    private TextView h;

    public void setNonWifiAlertMsg(String str) {
        this.h.setText(str);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.v
    public View h() {
        return this.e;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.v
    public View g() {
        return this.g;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.v
    public View f() {
        return this.f;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.v
    public ImageView e() {
        return this.d;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.v
    public View d() {
        return this.f20795c;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.v
    public ImageView c() {
        return this.f20794b;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.v
    public int b() {
        return R.drawable.hiad_play;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.v
    public void a(boolean z) {
        this.f20794b.setVisibility(z ? 0 : 8);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.v
    public ImageView a() {
        return this.f20793a;
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.hiad_native_video_control_panel, this);
        this.e = findViewById(R.id.hiad_native_video_control_panel);
        this.f20794b = (ImageView) findViewById(R.id.hiad_cb_sound);
        this.f20794b.setImageResource(R.drawable.hiad_selector_ic_sound_check);
        dk.a(this.f20794b);
        this.f20795c = findViewById(R.id.hiad_pb_buffering);
        this.f20793a = (ImageView) findViewById(R.id.hiad_btn_play_or_pause);
        this.d = (ImageView) findViewById(R.id.hiad_iv_preview_video);
        this.f = findViewById(R.id.hiad_rl_non_wifi_alert);
        this.g = findViewById(R.id.hiad_btn_non_wifi_play);
        this.h = (TextView) findViewById(R.id.hiad_non_wifi_alert_msg);
    }

    public NativeVideoControlPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public NativeVideoControlPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public NativeVideoControlPanel(Context context) {
        super(context);
        a(context);
    }
}
