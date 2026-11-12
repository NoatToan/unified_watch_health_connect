package com.xiaomi.fitness.baseui.view;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import com.xiaomi.fitness.baseui.ViewCreator;
import com.xiaomi.fitness.baseui.dialog.CircleProgressDialog;
import com.xiaomi.fitness.baseui.extension.ActivityExtKt;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.widget.state.StatusPage;
import defpackage.gki;
import defpackage.wc0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import miuix.appcompat.app.AppCompatActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\bb\u0010\u0014J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0019Jn\u0010,\u001a\u00020\u00122\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00120\"¢\u0006\u0002\b$28\u0010+\u001a4\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010#¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00120&¢\u0006\u0004\b,\u0010-JO\u0010,\u001a\u00020\u00122\u0006\u0010.\u001a\u00020#28\u0010+\u001a4\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010#¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00120&¢\u0006\u0004\b,\u0010/J\u000f\u00100\u001a\u00020\u0007H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0007H\u0016¢\u0006\u0004\b2\u00101J\u0011\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0012H\u0016¢\u0006\u0004\b:\u0010\u0014J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=R5\u0010C\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020\u00120&0>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\"\u0010H\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010F\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020\u00078\u0014X\u0094D¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bM\u00101R\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001b\u0010Y\u001a\u00020U8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bV\u0010@\u001a\u0004\bW\u0010XR*\u0010\\\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010Z8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a¨\u0006c"}, d2 = {"Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Lmiuix/appcompat/app/AppCompatActivity;", "Lcom/xiaomi/fitness/baseui/ViewCreator;", "Lcom/xiaomi/fitness/baseui/view/IActionBar;", "Lcom/xiaomi/fitness/baseui/view/PageState;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "", "handleBackPress", "(Landroidx/fragment/app/FragmentActivity;)Z", "", "Landroidx/fragment/app/Fragment;", "fragmentList", "checkChildFragments", "(Ljava/util/List;)Z", "fragment", "isFragmentBackHandled", "(Landroidx/fragment/app/Fragment;)Z", "", LifecycleConstantKt.ON_RESUME, "()V", LifecycleConstantKt.ON_PAUSE, "", "featureId", "setWindowFeature", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "titleResId", "setTitle", "Ljava/lang/Class;", "cls", "Lkotlin/Function1;", "Landroid/content/Intent;", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "resultCode", "data", "callBack", "startForActivityResult", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "intent", "(Landroid/content/Intent;Lkotlin/jvm/functions/Function2;)V", "enablePadOrientationRotate", "()Z", "isDeviceSupportOrientationRotate", "Lwc0;", "getMiuiActionBar", "()Lwc0;", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onBackPressed", "", "pageName", "()Ljava/lang/String;", "Ljava/util/Deque;", "resultCallBacks$delegate", "Lkotlin/Lazy;", "getResultCallBacks", "()Ljava/util/Deque;", "resultCallBacks", "", "beginShowTime", "J", "endShowTime", "durationSec", "getDurationSec", "()J", "setDurationSec", "(J)V", "isAdaptActionBar", "Z", "Lcom/xiaomi/fitness/baseui/view/ActionBarStateProvider;", "mActionBarStateProvider", "Lcom/xiaomi/fitness/baseui/view/ActionBarStateProvider;", "Landroidx/activity/result/ActivityResultLauncher;", "activityForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/xiaomi/fitness/widget/state/StatusPage;", "mStatusPage$delegate", "getMStatusPage", "()Lcom/xiaomi/fitness/widget/state/StatusPage;", "mStatusPage", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/baseui/dialog/CircleProgressDialog;", "mLoadingDialog", "Ljava/lang/ref/WeakReference;", "getMLoadingDialog", "()Ljava/lang/ref/WeakReference;", "setMLoadingDialog", "(Ljava/lang/ref/WeakReference;)V", "<init>", "ui_release"}, k = 1, mv = {2, 0, 0})
public abstract class BaseActivity extends AppCompatActivity implements ViewCreator, IActionBar, PageState {

    @Nullable
    private ActivityResultLauncher<Intent> activityForResult;

    @Nullable
    private ActionBarStateProvider mActionBarStateProvider;

    @Nullable
    private WeakReference<CircleProgressDialog> mLoadingDialog;

    /* JADX INFO: renamed from: resultCallBacks$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy resultCallBacks = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: y12
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseActivity.resultCallBacks_delegate$lambda$0();
        }
    });
    private long beginShowTime = -1;
    private long endShowTime = -1;
    private long durationSec = -1;
    private final boolean isAdaptActionBar = true;

    /* JADX INFO: renamed from: mStatusPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mStatusPage = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: z12
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseActivity.mStatusPage_delegate$lambda$3(this.f40767a);
        }
    });

    private final boolean checkChildFragments(List<? extends Fragment> fragmentList) {
        int size = fragmentList.size() - 1;
        if (size < 0) {
            return false;
        }
        while (true) {
            int i = size - 1;
            Fragment fragment = fragmentList.get(size);
            if (isFragmentBackHandled(fragment)) {
                return true;
            }
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            List<Fragment> listY0 = childFragmentManager.y0();
            Intrinsics.checkNotNullExpressionValue(listY0, "getFragments(...)");
            if (!listY0.isEmpty()) {
                List<Fragment> listY1 = childFragmentManager.y0();
                Intrinsics.checkNotNullExpressionValue(listY1, "getFragments(...)");
                if (checkChildFragments(listY1)) {
                    return true;
                }
            }
            if (i < 0) {
                return false;
            }
            size = i;
        }
    }

    private final Deque<Function2<Integer, Intent, Unit>> getResultCallBacks() {
        return (Deque) this.resultCallBacks.getValue();
    }

    private final boolean handleBackPress(FragmentActivity fragmentActivity) {
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        if (supportFragmentManager.y0().isEmpty()) {
            return false;
        }
        List<Fragment> listY0 = supportFragmentManager.y0();
        Intrinsics.checkNotNullExpressionValue(listY0, "getFragments(...)");
        return checkChildFragments(listY0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isFragmentBackHandled(Fragment fragment) {
        return fragment != 0 && fragment.isVisible() && fragment.isResumed() && (fragment instanceof BackPressHandler) && ((BackPressHandler) fragment).onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StatusPage mStatusPage_delegate$lambda$3(BaseActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new StatusPage(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(BaseActivity this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.getResultCallBacks().isEmpty()) {
            this$0.getResultCallBacks().pop().invoke(Integer.valueOf(activityResult.c()), activityResult.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayDeque resultCallBacks_delegate$lambda$0() {
        return new ArrayDeque();
    }

    public static /* synthetic */ void setWindowFeature$default(BaseActivity baseActivity, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWindowFeature");
        }
        if ((i2 & 1) != 0) {
            i = 8;
        }
        baseActivity.setWindowFeature(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startForActivityResult$default(BaseActivity baseActivity, Class cls, Function1 function1, Function2 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startForActivityResult");
        }
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: a22
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return BaseActivity.startForActivityResult$lambda$2((Intent) obj2);
                }
            };
        }
        baseActivity.startForActivityResult(cls, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startForActivityResult$lambda$2(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void applyEditModeActionBar(int i, int i2, @Nullable Function1<? super View, Unit> function1, @Nullable Function1<? super View, Unit> function2) {
        IActionBar.DefaultImpls.applyEditModeActionBar(this, i, i2, function1, function2);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void dismissDialog() {
        PageState.DefaultImpls.dismissDialog(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void dismissDialogForce() {
        PageState.DefaultImpls.dismissDialogForce(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void displayOptions(int i) {
        IActionBar.DefaultImpls.displayOptions(this, i);
    }

    public boolean enablePadOrientationRotate() {
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    @Nullable
    public View getActionModeButton(@Nullable Window window, int i) {
        return IActionBar.DefaultImpls.getActionModeButton(this, window, i);
    }

    public final long getDurationSec() {
        return this.durationSec;
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    @Nullable
    public WeakReference<CircleProgressDialog> getMLoadingDialog() {
        return this.mLoadingDialog;
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    @NotNull
    public StatusPage getMStatusPage() {
        return (StatusPage) this.mStatusPage.getValue();
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    @Nullable
    public wc0 getMiuiActionBar() {
        return getAppCompatActionBar();
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void hideBack() {
        IActionBar.DefaultImpls.hideBack(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void hideLoading() {
        PageState.DefaultImpls.hideLoading(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public boolean isActionBarBigTitleMode() {
        return IActionBar.DefaultImpls.isActionBarBigTitleMode(this);
    }

    /* JADX INFO: renamed from: isAdaptActionBar, reason: from getter */
    public boolean getIsAdaptActionBar() {
        return this.isAdaptActionBar;
    }

    public boolean isDeviceSupportOrientationRotate() {
        return UIUtils.INSTANCE.isTablet(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public boolean isLoadingShowing() {
        return PageState.DefaultImpls.isLoadingShowing(this);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        if (handleBackPress(this)) {
            return;
        }
        super.lambda$onCreate$0();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ActionBarStateProvider actionBarStateProvider = this.mActionBarStateProvider;
        if (actionBarStateProvider != null) {
            actionBarStateProvider.onConfigurationChanged(newConfig);
        }
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setWindowFeature$default(this, 0, 1, null);
        if (isDeviceSupportOrientationRotate() && enablePadOrientationRotate()) {
            setRequestedOrientation(-1);
        }
        super.onCreate(savedInstanceState);
        if (getLayoutId() != -1) {
            setContentView(getLayoutId());
        }
        UIUtils.INSTANCE.updateBarColor(this);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setBackgroundDrawable(new ColorDrawable(ResourceExtKt.getResourceColor(this, gki.u)));
        }
        if (miuiActionBar != null && getIsAdaptActionBar()) {
            this.mActionBarStateProvider = new ActionBarStateProvider(this, this, miuiActionBar);
        }
        ActivityExtKt.adaptCutoutFullScreen(this);
        this.activityForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: b22
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                BaseActivity.onCreate$lambda$1(this.f3703a, (ActivityResult) obj);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.endShowTime = jCurrentTimeMillis;
        this.durationSec = (jCurrentTimeMillis - this.beginShowTime) / ((long) 1000);
        this.beginShowTime = -1L;
        this.endShowTime = -1L;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.beginShowTime = System.currentTimeMillis();
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void onRetry() {
        PageState.DefaultImpls.onRetry(this);
    }

    @NotNull
    public String pageName() {
        String name = getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setActionBarDisplayable(boolean z) {
        IActionBar.DefaultImpls.setActionBarDisplayable(this, z);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setActionBarExpandState(int i) {
        IActionBar.DefaultImpls.setActionBarExpandState(this, i);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setActionBarNormalTitleMode() {
        IActionBar.DefaultImpls.setActionBarNormalTitleMode(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setActionBarResizeable(boolean z) {
        IActionBar.DefaultImpls.setActionBarResizeable(this, z);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setActionModeButton(@NotNull Activity activity, @Nullable ActionMode actionMode, int i, int i2, @Nullable String str, int i3) {
        IActionBar.DefaultImpls.setActionModeButton(this, activity, actionMode, i, i2, str, i3);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setCustomView(int i) {
        IActionBar.DefaultImpls.setCustomView(this, i);
    }

    public final void setDurationSec(long j) {
        this.durationSec = j;
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    @Nullable
    public View setEndTextView(int i, int i2, @Nullable String str, float f, @NotNull View.OnClickListener onClickListener) {
        return IActionBar.DefaultImpls.setEndTextView(this, i, i2, str, f, onClickListener);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    @Nullable
    public View setEndView(int i, int i2, @Nullable String str, @NotNull View.OnClickListener onClickListener) {
        return IActionBar.DefaultImpls.setEndView(this, i, i2, str, onClickListener);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void setMLoadingDialog(@Nullable WeakReference<CircleProgressDialog> weakReference) {
        this.mLoadingDialog = weakReference;
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    @Nullable
    public View setStartView(int i, int i2, @Nullable String str, @NotNull View.OnClickListener onClickListener) {
        return IActionBar.DefaultImpls.setStartView(this, i, i2, str, onClickListener);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setStartViewRes(int i, @Nullable String str) {
        IActionBar.DefaultImpls.setStartViewRes(this, i, str);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setSubtitle(int i) {
        IActionBar.DefaultImpls.setSubtitle(this, i);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setTitle(@Nullable String str) {
        IActionBar.DefaultImpls.setTitle(this, str);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setTitleBackground(int i) {
        IActionBar.DefaultImpls.setTitleBackground(this, i);
    }

    public void setWindowFeature(int featureId) {
        requestExtraWindowFeature(featureId);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void showBack() {
        IActionBar.DefaultImpls.showBack(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void showContent() {
        PageState.DefaultImpls.showContent(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void showEmpty(int i, int i2) {
        PageState.DefaultImpls.showEmpty(this, i, i2);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void showError() {
        PageState.DefaultImpls.showError(this);
    }

    @Deprecated(message = "尽快修改成kotlin，直接使用带有默认参数的方法", replaceWith = @ReplaceWith(expression = "showLoading(msg : String = getString(R.string.dialog_loanding), progress : Int = 0, isCancelable: Boolean = true)", imports = {}))
    public void showLoading() {
        PageState.DefaultImpls.showLoading(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void showNoNetwork() {
        PageState.DefaultImpls.showNoNetwork(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void startActionMode(@NotNull Activity activity, @NotNull ActionMode.Callback callback) {
        IActionBar.DefaultImpls.startActionMode(this, activity, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startForActivityResult(@NotNull Class<?> cls, @NotNull Function1<? super Intent, Unit> block, @NotNull Function2<? super Integer, ? super Intent, Unit> callBack) {
        Intrinsics.checkNotNullParameter(cls, "cls");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        getResultCallBacks().push(callBack);
        ActivityResultLauncher<Intent> activityResultLauncher = this.activityForResult;
        if (activityResultLauncher != null) {
            Intent intent = new Intent(this, cls);
            block.invoke2(intent);
            activityResultLauncher.launch(intent);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void applyEditModeActionBar(@NotNull Bundle bundle, @Nullable Function1<? super View, Unit> function1, @Nullable Function1<? super View, Unit> function2, @Nullable String str, @Nullable String str2) {
        IActionBar.DefaultImpls.applyEditModeActionBar(this, bundle, function1, function2, str, str2);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setCustomView(@NotNull View view) {
        IActionBar.DefaultImpls.setCustomView(this, view);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setEndView(@NotNull View view) {
        IActionBar.DefaultImpls.setEndView(this, view);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setStartView(@Nullable View view) {
        IActionBar.DefaultImpls.setStartView(this, view);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setSubtitle(@Nullable String str) {
        IActionBar.DefaultImpls.setSubtitle(this, str);
    }

    @Override // android.app.Activity, com.xiaomi.fitness.baseui.view.IActionBar
    public void setTitle(int titleResId) {
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(titleResId);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void showLoading(int i, boolean z) {
        PageState.DefaultImpls.showLoading(this, i, z);
    }

    @Override // com.xiaomi.fitness.baseui.view.IActionBar
    public void setCustomView(@NotNull View view, @NotNull ActionBar.LayoutParams layoutParams) {
        IActionBar.DefaultImpls.setCustomView(this, view, layoutParams);
    }

    @Override // com.xiaomi.fitness.baseui.view.PageState
    public void showLoading(@NotNull String str, int i, boolean z) {
        PageState.DefaultImpls.showLoading(this, str, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startForActivityResult(@NotNull Intent intent, @NotNull Function2<? super Integer, ? super Intent, Unit> callBack) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        getResultCallBacks().push(callBack);
        ActivityResultLauncher<Intent> activityResultLauncher = this.activityForResult;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(intent);
        }
    }
}
