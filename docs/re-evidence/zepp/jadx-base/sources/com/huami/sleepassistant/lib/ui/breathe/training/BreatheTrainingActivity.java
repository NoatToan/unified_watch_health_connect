package com.huami.sleepassistant.lib.ui.breathe.training;

import android.content.Intent;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.base.GlobalTitleStyleKt;
import com.huami.sleepassistant.lib.utils.SlRecorderEventHelper;
import com.huami.view.basetitle.BaseTitleActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\"\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¨\u0006\u0010"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/breathe/training/BreatheTrainingActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class BreatheTrainingActivity extends BaseTitleActivity {

    @NotNull
    public static final String BREATHE_TRAINING_TYPE_KEY = "breathe.training.type.key";
    public static final int SLEEP_BREATHE_TRAINING_REQUEST_CODE = 112;
    public static final int STRESS_BREATHE_TRAINING_REQUEST_CODE = 111;

    private final void initView() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BreatheTrainingSleepFragment());
        arrayList.add(new BreatheTrainingStressFragment());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getResources().getString(R.string.sls_breathe_training));
        arrayList2.add(getResources().getString(R.string.sls_breathe_training_stress));
        BreathTrainingAdapter breathTrainingAdapter = new BreathTrainingAdapter(getSupportFragmentManager(), arrayList, arrayList2);
        int i = R.id.sls_breathe_training_view_pager;
        ((ViewPager) findViewById(i)).setAdapter(breathTrainingAdapter);
        ((TabLayout) findViewById(R.id.sls_breathe_training_tab_layout)).setupWithViewPager((ViewPager) findViewById(i));
        if (getIntent().getIntExtra(BREATHE_TRAINING_TYPE_KEY, 1) == 2) {
            ((ViewPager) findViewById(i)).setCurrentItem(1, true);
            SlRecorderEventHelper.BreatheTrainHelper.INSTANCE.uploadButtonEvent(SlRecorderEventHelper.DECOMPRESSION_INTRO_START_V);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 111) {
            ((ViewPager) findViewById(R.id.sls_breathe_training_view_pager)).setCurrentItem(1, true);
        } else {
            if (requestCode != 112) {
                return;
            }
            ((ViewPager) findViewById(R.id.sls_breathe_training_view_pager)).setCurrentItem(0, true);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sls_activity_breathe_training1);
        GlobalTitleStyleKt.setUnifyTitleStyle$default(this, getResources().getString(R.string.sls_breathe_training_title), null, 2, null);
        initView();
        SlRecorderEventHelper.BreatheTrainHelper.INSTANCE.inBreatheAssistant();
    }
}
