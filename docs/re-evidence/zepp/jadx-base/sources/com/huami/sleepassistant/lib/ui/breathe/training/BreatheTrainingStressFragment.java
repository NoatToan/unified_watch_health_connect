package com.huami.sleepassistant.lib.ui.breathe.training;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.base.Navigator;
import com.huami.sleepassistant.lib.ui.breathe.training.BreatheTrainingStressFragment;
import com.huami.sleepassistant.lib.utils.DrawableUtils;
import com.huami.sleepassistant.lib.utils.SlRecorderEventHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/breathe/training/BreatheTrainingStressFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class BreatheTrainingStressFragment extends Fragment {
    public BreatheTrainingStressFragment() {
        super(R.layout.sls_fragment_stress_breathe_training);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(BreatheTrainingStressFragment breatheTrainingStressFragment, View view) {
        SlRecorderEventHelper.BreatheTrainHelper.INSTANCE.uploadButtonEvent(SlRecorderEventHelper.DECOMPRESSION_INTRO_START_C);
        FragmentActivity activity = breatheTrainingStressFragment.getActivity();
        if (activity == null) {
            return;
        }
        Navigator.INSTANCE.startTrainingBeginsStress(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(BreatheTrainingStressFragment breatheTrainingStressFragment) {
        Context context = breatheTrainingStressFragment.getContext();
        if (context == null) {
            return;
        }
        DrawableUtils drawableUtils = DrawableUtils.INSTANCE;
        View view = breatheTrainingStressFragment.getView();
        drawableUtils.setDrawableStartDot(context, (TextView) (view == null ? null : view.findViewById(R.id.sls_breathe_training_prompt_1)));
        View view2 = breatheTrainingStressFragment.getView();
        drawableUtils.setDrawableStartDot(context, (TextView) (view2 != null ? view2.findViewById(R.id.sls_breathe_training_prompt_2) : null));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View view2 = getView();
        ((Button) (view2 == null ? null : view2.findViewById(R.id.sls_btn_start_training))).setOnClickListener(new View.OnClickListener() { // from class: v70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                BreatheTrainingStressFragment.c(this.a, view3);
            }
        });
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: w70
            @Override // java.lang.Runnable
            public final void run() {
                BreatheTrainingStressFragment.d(this.a);
            }
        });
        if (RainbowUtils.isDarkMode(getContext())) {
            View view3 = getView();
            ((ConstraintLayout) (view3 == null ? null : view3.findViewById(R.id.sls_breathe_training_header_layout))).setBackgroundResource(R.drawable.sls_stress_breathe_training_header_bg_dark);
            View view4 = getView();
            ((ConstraintLayout) (view4 == null ? null : view4.findViewById(R.id.sls_breathe_training_inhale_layout))).setBackgroundResource(R.drawable.sls_breathing_training_inhale_bg_dark);
            View view5 = getView();
            ((ConstraintLayout) (view5 != null ? view5.findViewById(R.id.sls_breathe_training_exhale_layout) : null)).setBackgroundResource(R.drawable.sls_breathing_training_exhale_bg_dark);
            return;
        }
        View view6 = getView();
        ((ConstraintLayout) (view6 == null ? null : view6.findViewById(R.id.sls_breathe_training_header_layout))).setBackgroundResource(R.drawable.sls_stress_breathe_training_header_bg);
        View view7 = getView();
        ((ConstraintLayout) (view7 == null ? null : view7.findViewById(R.id.sls_breathe_training_inhale_layout))).setBackgroundResource(R.drawable.sls_breathing_training_inhale_bg);
        View view8 = getView();
        ((ConstraintLayout) (view8 != null ? view8.findViewById(R.id.sls_breathe_training_exhale_layout) : null)).setBackgroundResource(R.drawable.sls_breathing_training_exhale_bg);
    }
}
