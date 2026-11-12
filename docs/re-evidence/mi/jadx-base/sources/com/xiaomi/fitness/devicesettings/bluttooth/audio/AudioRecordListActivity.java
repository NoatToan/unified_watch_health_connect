package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordListActivity;
import defpackage.bd6;
import defpackage.blf;
import defpackage.cji;
import defpackage.eui;
import defpackage.jni;
import defpackage.wc0;
import defpackage.wzi;
import defpackage.xc6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u0006R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/RecordViewModel;", "Lbd6;", "", "updateFilterSortView", "()V", "bindView", "(Lbd6;)V", "refreshPhoneList", "", "title", "refreshWatchList", "(Ljava/lang/String;)V", LifecycleConstantKt.ON_DESTROY, "", "titles", "Ljava/util/List;", "Landroidx/viewpager2/widget/ViewPager2;", "mViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AudioRecordListActivity extends BaseBindingActivity<RecordViewModel, bd6> {

    @Nullable
    private ViewPager2 mViewPager;

    @NotNull
    private List<String> titles = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(bd6 this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ViewPager2 viewPager2 = this_bindView.B;
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        viewPager2.setCurrentItem(((Integer) tag).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(bd6 this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ViewPager2 viewPager2 = this_bindView.B;
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        viewPager2.setCurrentItem(((Integer) tag).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2(AudioRecordListActivity this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xc6.d("AudioRecordListActivity recordLiveData status:" + pair.getFirst());
        List<Fragment> listY0 = this$0.getSupportFragmentManager().y0();
        Intrinsics.checkNotNullExpressionValue(listY0, "getFragments(...)");
        if (listY0.size() > 1) {
            Fragment fragment = listY0.get(1);
            if (fragment instanceof AudioListWatchFragment) {
                ((AudioListWatchFragment) fragment).recordStatusChange((blf) pair.getFirst());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$3(bd6 this_bindView, AudioRecordListActivity this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int currentItem = this_bindView.B.getCurrentItem();
        if (activityResult != null && activityResult.c() == -1) {
            this$0.refreshPhoneList();
            if (currentItem != 0) {
                List<Fragment> listY0 = this$0.getSupportFragmentManager().y0();
                Intrinsics.checkNotNullExpressionValue(listY0, "getFragments(...)");
                if (listY0.size() > 1) {
                    Fragment fragment = listY0.get(1);
                    if (fragment instanceof AudioListWatchFragment) {
                        ((AudioListWatchFragment) fragment).updateRecordData(WatchPullDataManager.INSTANCE.get());
                    }
                }
            }
        }
        WatchPullDataManager.INSTANCE.reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$4(bd6 this_bindView, AudioRecordListActivity this$0, ActivityResultLauncher intentLauncher, View view) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(intentLauncher, "$intentLauncher");
        this_bindView.B.getCurrentItem();
        List<Fragment> listY0 = this$0.getSupportFragmentManager().y0();
        Intrinsics.checkNotNullExpressionValue(listY0, "getFragments(...)");
        if (listY0.size() > 1) {
            Fragment fragment = listY0.get(1);
            if (fragment instanceof AudioListWatchFragment) {
                WatchPullDataManager.INSTANCE.set(((AudioListWatchFragment) fragment).getRecordData());
                intentLauncher.launch(new Intent(this$0, (Class<?>) AudioWatchBatchActivity.class));
            }
        }
    }

    private final void updateFilterSortView() {
        ViewGroup.LayoutParams layoutParams = getMBinding().A.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = UIUtils.INSTANCE.isTabletAndLandscape(this) ? ExtUtilsKt.getDp(420) : -1;
        getMBinding().A.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, android.view.View, miuix.miuixbasewidget.widget.FilterSortView$TabView] */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final bd6 bd6Var) {
        Intrinsics.checkNotNullParameter(bd6Var, "<this>");
        setTitle(wzi.v0);
        setTitleBackground(cji.y);
        this.titles.clear();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? K = bd6Var.A.k(getString(wzi.u0));
        objectRef.element = K;
        K.setTag(0);
        ((FilterSortView.TabView) objectRef.element).setOnClickListener(new View.OnClickListener() { // from class: zn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioRecordListActivity.bindView$lambda$0(bd6Var, view);
            }
        });
        final FilterSortView.TabView tabViewK = bd6Var.A.k(getString(wzi.w0));
        tabViewK.setTag(1);
        tabViewK.setOnClickListener(new View.OnClickListener() { // from class: ao1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioRecordListActivity.bindView$lambda$1(bd6Var, view);
            }
        });
        updateFilterSortView();
        bd6Var.A.setFilteredTab((FilterSortView.TabView) objectRef.element);
        bd6Var.B.setOffscreenPageLimit(2);
        ViewPager2 viewPager2 = bd6Var.B;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        viewPager2.setAdapter(new AudioRecoderFragmentAdapter(supportFragmentManager, lifecycle, CollectionsKt__CollectionsKt.emptyList()));
        bd6Var.B.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordListActivity.bindView.3
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int position) {
                wc0 miuiActionBar = AudioRecordListActivity.this.getMiuiActionBar();
                if (miuiActionBar != null) {
                    View endView = miuiActionBar.getEndView();
                    Intrinsics.checkNotNullExpressionValue(endView, "getEndView(...)");
                    ExtUtilsKt.setVisible(endView, position == 1);
                }
                if (position == 0) {
                    bd6Var.A.setFilteredTab(objectRef.element);
                } else {
                    bd6Var.A.setFilteredTab(tabViewK);
                }
            }
        });
        ((RecordViewModel) getMViewModel()).getRecordLiveData().observe(this, new AudioRecordListActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bo1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioRecordListActivity.bindView$lambda$2(this.f4413a, (Pair) obj);
            }
        }));
        ((RecordViewModel) getMViewModel()).register(this);
        ((RecordViewModel) getMViewModel()).requestRecordStatus();
        final ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: co1
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                AudioRecordListActivity.bindView$lambda$3(bd6Var, this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        IActionBar.DefaultImpls.setEndView$default(this, 0, jni.g, getString(wzi.x0), new View.OnClickListener() { // from class: do1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioRecordListActivity.bindView$lambda$4(bd6Var, this, activityResultLauncherRegisterForActivityResult, view);
            }
        }, 1, null);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((RecordViewModel) getMViewModel()).unRegister(this);
    }

    public final void refreshPhoneList() {
        List<Fragment> listY0 = getSupportFragmentManager().y0();
        Intrinsics.checkNotNullExpressionValue(listY0, "getFragments(...)");
        if (listY0.size() > 0) {
            Fragment fragment = listY0.get(0);
            if (fragment instanceof AudioListPhoneFragment) {
                ((AudioListPhoneFragment) fragment).refreshData();
            }
        }
    }

    public final void refreshWatchList(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        List<Fragment> listY0 = getSupportFragmentManager().y0();
        Intrinsics.checkNotNullExpressionValue(listY0, "getFragments(...)");
        if (listY0.size() > 1) {
            Fragment fragment = listY0.get(1);
            if (fragment instanceof AudioListWatchFragment) {
                ((AudioListWatchFragment) fragment).refreshData(title);
            }
        }
    }
}
