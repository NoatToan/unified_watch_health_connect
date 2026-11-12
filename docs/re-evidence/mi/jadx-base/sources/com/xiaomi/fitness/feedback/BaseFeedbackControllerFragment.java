package com.xiaomi.fitness.feedback;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.feedback.bugreport.MiuiFeedBack;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\tH&J-\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\b\u0010\u0018\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/feedback/BaseFeedbackControllerFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "TAG", "", "feedback", "Lcom/xiaomi/fitness/feedback/bugreport/MiuiFeedBack;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "judgGotoDeviceFragment", "onRequestPermissionsResult", AccountInteractActivity.KEY_REQUEST_CODE, "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "isInValid", "", LifecycleConstantKt.ON_DESTROY, "oneTrackSettingsFeedbackReview", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseFeedbackControllerFragment extends Fragment {

    @NotNull
    private final String TAG = "FeedbackTransform";

    @NotNull
    private final MiuiFeedBack feedback = new MiuiFeedBack();

    private final void oneTrackSettingsFeedbackReview() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36275"), TuplesKt.to("name", "profile_tab_page_button"), TuplesKt.to("btn_name", "profile_tab_page_help_and_feedback")));
    }

    public final boolean isInValid() {
        return isDetached() || getActivity() == null || requireActivity().isFinishing() || requireActivity().isDestroyed();
    }

    public abstract void judgGotoDeviceFragment();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d(this.TAG, "onCreate: ");
        judgGotoDeviceFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        oneTrackSettingsFeedbackReview();
        this.feedback.destroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1000) {
            Logger.d(this.TAG, "onRequestPermissionsResult: reqCode = " + requestCode + "; ret = " + grantResults);
            MiuiFeedBack miuiFeedBack = this.feedback;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            miuiFeedBack.gotoMIUIBugReport(fragmentActivityRequireActivity);
        }
    }
}
