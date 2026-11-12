package com.xiaomi.fitness.health.sleep.ui.setting;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.b;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.health.sleep.ui.setting.DeepShallowSleepDetectionSettingActivity;
import com.xiaomi.fitness.health.sleep.ui.setting.baseui.SleepDetectionGuideCarouselItem;
import com.xiaomi.fitness.health.sleep.ui.setting.baseui.SleepGuideCarouselAdapter;
import com.xiaomi.fitness.health.sleep.ui.setting.baseui.SleepGuideCarouselIndicator;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.c0j;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import defpackage.ohi;
import defpackage.pni;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/DeepShallowSleepDetectionSettingActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", "deepShallowSleepView", "Lcom/xiaomi/fitness/widget/SwitchButtonSingleLineTextView;", "mDeepShallowSleepDetectionEnabled", "", "getMDeepShallowSleepDetectionEnabled", "()Z", "setMDeepShallowSleepDetectionEnabled", "(Z)V", "mSleepViewModel", "Lcom/xiaomi/fitness/health/sleep/ui/setting/SleepSettingViewModel;", "layoutId", "", "getLayoutId", "()I", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initViews", "findViews", "startDeepLightSleepDetection", "initViewPager", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeepShallowSleepDetectionSettingActivity extends BaseActivity {
    private SwitchButtonSingleLineTextView deepShallowSleepView;
    private boolean mDeepShallowSleepDetectionEnabled;
    private SleepSettingViewModel mSleepViewModel;

    private final void findViews() {
        this.deepShallowSleepView = (SwitchButtonSingleLineTextView) findViewById(eri.N9);
    }

    private final void initViewPager() {
        String[] stringArray = ResourceExtKt.getStringArray(this, ohi.g);
        String[] stringArray2 = ResourceExtKt.getStringArray(this, ohi.f);
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(pni.A0), Integer.valueOf(pni.B0), Integer.valueOf(pni.C0), Integer.valueOf(pni.D0)});
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            SleepDetectionGuideCarouselItem sleepDetectionGuideCarouselItem = new SleepDetectionGuideCarouselItem(stringArray[i], stringArray2[i], ((Number) listListOf.get(i)).intValue());
            Logger.d("SLEEPGUIDE title " + stringArray[i] + " des " + stringArray2[i] + " img " + listListOf.get(i), new Object[0]);
            arrayList.add(sleepDetectionGuideCarouselItem);
        }
        Logger.d(" SLEEPGUIDE " + arrayList, new Object[0]);
        SleepGuideCarouselAdapter sleepGuideCarouselAdapter = new SleepGuideCarouselAdapter(arrayList);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(eri.Zo);
        final SleepGuideCarouselIndicator sleepGuideCarouselIndicator = (SleepGuideCarouselIndicator) findViewById(eri.To);
        sleepGuideCarouselIndicator.setColor(iji.x1, iji.y1);
        sleepGuideCarouselIndicator.initIndicatorCount(4);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.setClipChildren(false);
        viewPager2.setPageTransformer(new b(ExtUtilsKt.getDp(Float.valueOf(13.0f))));
        viewPager2.setAdapter(sleepGuideCarouselAdapter);
        viewPager2.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.DeepShallowSleepDetectionSettingActivity.initViewPager.1
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                sleepGuideCarouselIndicator.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }
        });
    }

    private final void initViews() {
        SleepSettingViewModel sleepSettingViewModel = (SleepSettingViewModel) new ViewModelProvider(this).get(SleepSettingViewModel.class);
        this.mSleepViewModel = sleepSettingViewModel;
        SwitchButtonSingleLineTextView switchButtonSingleLineTextView = null;
        if (sleepSettingViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSleepViewModel");
            sleepSettingViewModel = null;
        }
        this.mDeepShallowSleepDetectionEnabled = sleepSettingViewModel.getDeepLightDetectEnable();
        SwitchButtonSingleLineTextView switchButtonSingleLineTextView2 = this.deepShallowSleepView;
        if (switchButtonSingleLineTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deepShallowSleepView");
            switchButtonSingleLineTextView2 = null;
        }
        switchButtonSingleLineTextView2.setSwitch(this.mDeepShallowSleepDetectionEnabled);
        SwitchButtonSingleLineTextView switchButtonSingleLineTextView3 = this.deepShallowSleepView;
        if (switchButtonSingleLineTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deepShallowSleepView");
        } else {
            switchButtonSingleLineTextView = switchButtonSingleLineTextView3;
        }
        switchButtonSingleLineTextView.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: zs5
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                DeepShallowSleepDetectionSettingActivity.initViews$lambda$0(this.f41622a, z, iSwitchButton);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(DeepShallowSleepDetectionSettingActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mDeepShallowSleepDetectionEnabled = z;
        SleepSettingViewModel sleepSettingViewModel = this$0.mSleepViewModel;
        SleepSettingViewModel sleepSettingViewModel2 = null;
        if (sleepSettingViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSleepViewModel");
            sleepSettingViewModel = null;
        }
        sleepSettingViewModel.setDeepLightSleepDetectEnable(this$0.mDeepShallowSleepDetectionEnabled);
        Logger.d("DeepShallowSleepDetectionSettingActivity set mDeepShallowSleepDetectionEnabled " + this$0.mDeepShallowSleepDetectionEnabled, new Object[0]);
        SleepSettingViewModel sleepSettingViewModel3 = this$0.mSleepViewModel;
        if (sleepSettingViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSleepViewModel");
        } else {
            sleepSettingViewModel2 = sleepSettingViewModel3;
        }
        Logger.d("DeepShallowSleepDetectionSettingActivity get mDeepShallowSleepDetectionEnabled " + sleepSettingViewModel2.getDeepLightDetectEnable(), new Object[0]);
    }

    private final void startDeepLightSleepDetection() {
        ToastExtKt.toastLong(this, "startDeepLightSleepDetection");
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.v3;
    }

    public final boolean getMDeepShallowSleepDetectionEnabled() {
        return this.mDeepShallowSleepDetectionEnabled;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(c0j.df);
        findViews();
        initViewPager();
        initViews();
    }

    public final void setMDeepShallowSleepDetectionEnabled(boolean z) {
        this.mDeepShallowSleepDetectionEnabled = z;
    }
}
