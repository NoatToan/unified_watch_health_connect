package com.xiaomi.hm.health.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.devicex.R;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;

/* JADX INFO: loaded from: classes20.dex */
public class UnbindAlipayActivity extends BaseTitleActivity {
    public static final String EXTRA = "unbind_device";

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        finish();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.activity_unbind_alipay);
        if (GlobalConfig.get().isBuildMidong()) {
            setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.white), true);
        } else {
            setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.pale_grey_two), true);
        }
        findViewById(R.id.got_it).setOnClickListener(new View.OnClickListener() { // from class: a18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
        TextView textView = (TextView) findViewById(R.id.title_tv);
        TextView textView2 = (TextView) findViewById(R.id.sub_title_tv);
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra(EXTRA, 0);
            if (!GlobalConfig.get().isBuildMidong()) {
                if (intExtra == HMDeviceSource.MILI_PEYTO.getValue()) {
                    textView.setText(R.string.unbind_alipay_title);
                    textView2.setText(R.string.unbind_alipay_tips_peyto);
                    return;
                } else {
                    ((ImageView) findViewById(R.id.device_img)).setImageResource(R.drawable.img_miband);
                    textView.setText(R.string.unbind_alipay_title_band);
                    textView2.setText(R.string.unbind_alipay_tips);
                    return;
                }
            }
            ImageView imageView = (ImageView) findViewById(R.id.device_img);
            if (intExtra == HMDeviceSource.MILI_AMAZFIT.getValue()) {
                i = R.drawable.img_amazfit;
            } else if (HMDeviceConfig.isPYHSeries()) {
                i = R.drawable.img_amazfitwatch;
            } else {
                i = HMDeviceConfig.hasBoundWatch() ? R.drawable.img_midong_watch_lite : R.drawable.img_miband;
            }
            imageView.setImageResource(i);
            boolean zHasBoundWatch = HMDeviceConfig.hasBoundWatch();
            int i2 = zHasBoundWatch ? R.string.unbind_alipay_tips_peyto : R.string.unbind_alipay_tips;
            textView.setText(zHasBoundWatch ? R.string.unbind_alipay_title : R.string.unbind_alipay_title_band);
            textView2.setText(i2);
        }
    }
}
