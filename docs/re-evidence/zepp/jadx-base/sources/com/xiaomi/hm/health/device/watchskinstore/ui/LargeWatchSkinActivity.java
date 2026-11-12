package com.xiaomi.hm.health.device.watchskinstore.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.device.watchskinstore.WatchSkinHelper;
import com.xiaomi.hm.health.device.watchskinstore.bean.WatchSkinBean;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;

/* JADX INFO: loaded from: classes12.dex */
public class LargeWatchSkinActivity extends BaseTitleActivity {
    private static final String C = "LargeWatchSkinActivity";
    public static final String KEY_BEAN = "bean";
    public static final String KEY_IMAGE = "image";
    private String A;
    private WatchSkinBean B;
    private View x;
    private ImageView y;
    private ImageView z;

    private void initData() {
        if (this.B == null) {
            return;
        }
        if (TextUtils.isEmpty(this.A)) {
            WatchSkinHelper.loadImage(this, this.y, this.B.getImage(), this.B.getIsLocal());
        } else {
            WatchSkinHelper.loadImage(this, this.y, this.A, true);
        }
        if (this.B.getCustomizable()) {
            WatchSkinHelper.setTintTransBg(this, this.z, WatchSkinHelper.getTransImageRes(this.B), this.B.getSelectColor());
        }
    }

    private void initView() {
        this.x = findViewById(R.id.layout_container);
        this.y = (ImageView) findViewById(R.id.large_iv);
        this.z = (ImageView) findViewById(R.id.transparent_iv);
    }

    private void n() {
        this.x.setOnClickListener(new View.OnClickListener() { // from class: ul4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.o(view);
            }
        });
        this.y.setOnClickListener(new View.OnClickListener() { // from class: vl4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LargeWatchSkinActivity.p(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            finishAfterTransition();
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(View view) {
        HMLog.d(C, "", new Object[0]);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.scale_in_disappear, R.anim.scale_out_disappear);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(BaseTitleActivity.STYLE.NONE, -1, true);
        setContentViewBehindTitleBar(false, false);
        setContentView(R.layout.activity_large_watch_skin);
        Intent intent = getIntent();
        this.A = intent == null ? null : intent.getStringExtra("image");
        this.B = intent != null ? (WatchSkinBean) intent.getSerializableExtra(KEY_BEAN) : null;
        initView();
        n();
        initData();
    }
}
