package com.huami.watch.companion.ximalaya;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.util.DeviceCompatibility;

/* JADX INFO: loaded from: classes16.dex */
public class XimaIntroduceActivity extends Activity {
    private TextView a;
    private String b;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            XimaIntroduceActivity.this.onBackPressed();
        }
    }

    private void a() {
        String stringExtra = getIntent().getStringExtra("detail_introduce");
        this.b = stringExtra;
        this.a.setText(getString(R.string.xima_album_detail, new Object[]{stringExtra}));
    }

    private void b() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar_detail);
        actionbarLayout.setTitleText(getString(R.string.xima_detail_introduce));
        actionbarLayout.setBackArrowClickListener(new a());
        this.a = (TextView) findViewById(R.id.detail_content);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.xima_introduce);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        b();
        a();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
