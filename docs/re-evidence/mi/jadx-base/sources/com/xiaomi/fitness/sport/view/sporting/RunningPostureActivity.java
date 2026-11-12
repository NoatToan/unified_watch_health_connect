package com.xiaomi.fitness.sport.view.sporting;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.bean.SportingData;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.sport.view.sporting.RunningPostureActivity;
import com.xiaomi.fitness.sport.view.widget.SportCommandView;
import com.xiaomi.fitness.sport.viewmodel.RunningPostureViewModel;
import com.xiaomi.fitness.sport_manager_export.utils.SportStateUtilsKt;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.un0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001c\u0010\u0013J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/sport/view/sporting/RunningPostureActivity;", "Lcom/xiaomi/fitness/sport/view/sporting/BaseSportingActivity;", "Lcom/xiaomi/fitness/sport/viewmodel/RunningPostureViewModel;", "Lun0;", "", "mWearMode", "", "Lcom/xiaomi/fitness/sport/bean/SportingItemData;", "list", "", "showUI", "(ILjava/util/List;)V", "buildEmptyData", "()Ljava/util/List;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "()V", "Lcom/xiaomi/fitness/sport/view/widget/SportCommandView;", "getSportCommandView", "()Lcom/xiaomi/fitness/sport/view/widget/SportCommandView;", "I", "getMWearMode", "()I", "setMWearMode", "(I)V", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRunningPostureActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningPostureActivity.kt\ncom/xiaomi/fitness/sport/view/sporting/RunningPostureActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,96:1\n54#2,3:97\n24#2:100\n57#2,6:101\n63#2,2:108\n57#3:107\n*S KotlinDebug\n*F\n+ 1 RunningPostureActivity.kt\ncom/xiaomi/fitness/sport/view/sporting/RunningPostureActivity\n*L\n62#1:97,3\n62#1:100\n62#1:101,6\n62#1:108,2\n62#1:107\n*E\n"})
public final class RunningPostureActivity extends Hilt_RunningPostureActivity<RunningPostureViewModel, un0> {

    @NotNull
    public static final String TAG = "RunningPostureActivity";
    private int mWearMode;

    public RunningPostureActivity() {
        super(dvi.g, 0);
        this.mWearMode = 1;
    }

    private final List<SportingItemData> buildEmptyData() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SportingItemData("--", AppUtil.getApp().getString(c1j.h5), null, 4, null));
        arrayList.add(new SportingItemData("--", AppUtil.getApp().getResources().getString(c1j.d1), null, 4, null));
        arrayList.add(new SportingItemData("--", AppUtil.getApp().getString(c1j.u0), null, 4, null));
        arrayList.add(new SportingItemData("--", AppUtil.getApp().getString(c1j.T4), CommonSportModelUtil.KEY_RUNNING_POSTURE));
        arrayList.add(new SportingItemData("--", AppUtil.getApp().getString(c1j.X4), CommonSportModelUtil.KEY_RUNNING_POSTURE));
        arrayList.add(new SportingItemData("--", AppUtil.getApp().getString(c1j.Y2), CommonSportModelUtil.KEY_RUNNING_POSTURE));
        if (this.mWearMode == 1) {
            arrayList.add(new SportingItemData("--", AppUtil.getApp().getString(c1j.o2), CommonSportModelUtil.KEY_RUNNING_POSTURE));
        }
        if (SportStateUtilsKt.isSupportWristPosture(getSportType())) {
            arrayList.add(new SportingItemData("--", AppUtil.getApp().getString(c1j.v5), CommonSportModelUtil.KEY_RUNNING_POSTURE));
            arrayList.add(new SportingItemData("--", AppUtil.getApp().getString(c1j.w5), CommonSportModelUtil.KEY_RUNNING_POSTURE));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(RunningPostureActivity this$0, SportingData sportingData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showUI(this$0.mWearMode, sportingData.getList());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showUI(int mWearMode, List<SportingItemData> list) {
        CommonSportModelUtil commonSportModelUtil = CommonSportModelUtil.INSTANCE;
        List<SportingItemData> sportBeanSpecificSportingItemList = commonSportModelUtil.getSportBeanSpecificSportingItemList(list);
        ((un0) getMBinding()).A0(sportBeanSpecificSportingItemList);
        if (mWearMode != 1) {
            ImageView landingStyleIv = ((un0) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(landingStyleIv, "landingStyleIv");
            ViewExtKt.gone(landingStyleIv);
        } else {
            ImageView landingStyleIv2 = ((un0) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(landingStyleIv2, "landingStyleIv");
            Coil.imageLoader(landingStyleIv2.getContext()).enqueue(new ImageRequest.Builder(landingStyleIv2.getContext()).data(Integer.valueOf(commonSportModelUtil.getLandingStyleResId(sportBeanSpecificSportingItemList))).target(landingStyleIv2).build());
        }
    }

    public final int getMWearMode() {
        return this.mWearMode;
    }

    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity
    @Nullable
    public SportCommandView getSportCommandView() {
        return null;
    }

    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.sporting.Hilt_RunningPostureActivity, com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mWearMode = getIntent().getIntExtra("WEAR_MODE", 0);
        setTitle(c1j.r3);
        showUI(this.mWearMode, buildEmptyData());
        MutableLiveData<SportingData> mData = ((RunningPostureViewModel) getMViewModel()).getMData();
        if (mData != null) {
            mData.observe(this, new RunningPostureActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: f2l
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RunningPostureActivity.onCreate$lambda$0(this.f17337a, (SportingData) obj);
                }
            }));
        }
    }

    public final void setMWearMode(int i) {
        this.mWearMode = i;
    }
}
