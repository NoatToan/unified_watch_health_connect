package com.xiaomi.hm.health.speech.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.core.content.ContextCompat;
import com.huami.devicex.R;
import com.huami.view.basetitle.BaseTitleActivity;

/* JADX INFO: loaded from: classes21.dex */
public class SpeechEngineUpdateMiotAuthorizeActivity extends BaseTitleActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        setResult(20);
        finish();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.pale_grey_four), getString(R.string.speech_account_authorize_smart_home_guide_activity_title), true);
        setBaseTitleColor(ContextCompat.getColor(this, R.color.black70));
        setContentView(R.layout.speech_activity_update_miot_authorize);
        ((Button) findViewById(R.id.speech_account_authorize_btn)).setOnClickListener(new View.OnClickListener() { // from class: j77
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
