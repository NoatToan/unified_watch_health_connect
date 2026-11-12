package com.huawei.openalliance.ad.linked.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.views.AutoScaleSizeRelativeLayout;

/* JADX INFO: loaded from: classes12.dex */
public class LinkedNativeViewControlPanel extends AutoScaleSizeRelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f19464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f19465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f19466c;
    private SeekBar d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private View h;
    private ImageView i;
    private View j;
    private View k;
    private LinkedWifiAlertPlayButton l;
    private TextView m;

    public void setNonWifiAlertMsg(String str) {
        TextView textView = this.m;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setNonWifiAlertMsg(int i) {
        TextView textView = this.m;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public LinkedWifiAlertPlayButton o() {
        return this.l;
    }

    public View n() {
        return this.k;
    }

    public ImageView m() {
        return this.i;
    }

    public View l() {
        return this.h;
    }

    public TextView k() {
        return this.g;
    }

    public TextView j() {
        return this.f;
    }

    public ImageView i() {
        return this.e;
    }

    public SeekBar h() {
        return this.d;
    }

    public ImageView g() {
        return this.f19466c;
    }

    public ImageView f() {
        return this.f19465b;
    }

    public ImageView e() {
        return this.f19464a;
    }

    public void d() {
        a.C0220a c0220aA = this.l.getStyle().a();
        this.l.setTextColor(c0220aA.f19469b);
        this.l.setProgressDrawable(c0220aA.f19468a);
    }

    public static int c() {
        return R.drawable.hiad_linked_video_refresh;
    }

    public static int b() {
        return R.drawable.hiad_linked_video_pause;
    }

    private void a(Context context) {
        try {
            LayoutInflater.from(context).inflate(R.layout.hiad_linked_native_video_control_panel, this);
            this.j = findViewById(R.id.hiad_linked_native_video_control_panel);
            this.f19465b = (ImageView) findViewById(R.id.hiad_linked_cb_sound);
            this.f19466c = (ImageView) findViewById(R.id.hiad_linked_cb_fullcreen);
            this.e = (ImageView) findViewById(R.id.hiad_linked_restart);
            this.f = (TextView) findViewById(R.id.hiad_linked_video_now_time);
            this.g = (TextView) findViewById(R.id.hiad_linked_video_total_time);
            this.f19465b.setImageResource(dk.a(true, false));
            dk.a(this.f19465b);
            this.h = findViewById(R.id.hiad_linked_pb_buffering);
            this.f19464a = (ImageView) findViewById(R.id.hiad_linked_btn_play_or_pause);
            this.i = (ImageView) findViewById(R.id.hiad_linked_preview_video);
            this.k = findViewById(R.id.hiad_linked_non_wifi_alert);
            this.l = (LinkedWifiAlertPlayButton) findViewById(R.id.hiad_linked_btn_non_wifi_play);
            d();
            this.m = (TextView) findViewById(R.id.hiad_linked_non_wifi_alert_msg);
            SeekBar seekBar = (SeekBar) (cc.a(context).g() ? findViewById(R.id.hiad_linked_native_video_progress_hm) : findViewById(R.id.hiad_linked_native_video_progress));
            this.d = seekBar;
            seekBar.setVisibility(0);
        } catch (RuntimeException unused) {
            hw.c("LinkedNativeViewControlPanel", "init RuntimeException");
        } catch (Exception e) {
            hw.d("LinkedNativeViewControlPanel", "init " + e.getClass().getSimpleName());
        }
    }

    public static int a() {
        return R.drawable.hiad_linked_video_play;
    }

    public LinkedNativeViewControlPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public LinkedNativeViewControlPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public LinkedNativeViewControlPanel(Context context) {
        super(context);
        a(context);
    }
}
