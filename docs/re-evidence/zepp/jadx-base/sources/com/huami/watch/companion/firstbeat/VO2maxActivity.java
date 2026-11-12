package com.huami.watch.companion.firstbeat;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.chenenyu.router.annotation.Route;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
@Route({RouterHelper.SPORT_STATE_VO2_MAX_PATH})
public class VO2maxActivity extends AppCompatActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_vo2max);
        ((RainbowTitleBar) findViewById(R.id.title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: t88
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d(view);
            }
        });
    }
}
