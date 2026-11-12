package com.huami.sleepassistant.lib.ui.breathe.training;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.base.Navigator;
import com.huami.sleepassistant.lib.ui.breathe.training.MiBreatheTrainingActivity;
import com.huami.sleepassistant.lib.utils.SlRecorderEventHelper;
import com.huami.view.basetitle.BaseTitleActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/breathe/training/MiBreatheTrainingActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class MiBreatheTrainingActivity extends BaseTitleActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(MiBreatheTrainingActivity miBreatheTrainingActivity, View view) {
        miBreatheTrainingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(MiBreatheTrainingActivity miBreatheTrainingActivity, View view) {
        Navigator.INSTANCE.startTrainingBegins(miBreatheTrainingActivity);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sls_activity_breathe_training);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, 0, true);
        setTitleBarVisible(false);
        ((ImageView) findViewById(R.id.back)).setOnClickListener(new View.OnClickListener() { // from class: z35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MiBreatheTrainingActivity.n(this.a, view);
            }
        });
        ((Button) findViewById(R.id.sls_btn_start_training)).setOnClickListener(new View.OnClickListener() { // from class: a45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MiBreatheTrainingActivity.o(this.a, view);
            }
        });
        SlRecorderEventHelper.BreatheTrainHelper.INSTANCE.inBreatheAssistant();
    }
}
