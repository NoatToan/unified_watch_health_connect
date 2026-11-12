package com.xiaomi.fitness.sport.view.config;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.sport.view.config.SportRemindConfigActivity;
import defpackage.dvi;
import defpackage.xri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/config/SportRemindConfigActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportRemindConfigActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRemindConfigActivity.kt\ncom/xiaomi/fitness/sport/view/config/SportRemindConfigActivity\n+ 2 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 3 FragmentTransaction.kt\nandroidx/fragment/app/FragmentTransactionKt\n*L\n1#1,59:1\n26#2,6:60\n32#2,6:71\n39#3,5:66\n*S KotlinDebug\n*F\n+ 1 SportRemindConfigActivity.kt\ncom/xiaomi/fitness/sport/view/config/SportRemindConfigActivity\n*L\n53#1:60,6\n53#1:71,6\n55#1:66,5\n*E\n"})
public final class SportRemindConfigActivity extends BaseActivity {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(FrameLayout frameLayout, SportRemindConfigActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        UIUtils uIUtils = UIUtils.INSTANCE;
        layoutParams.height = (int) (uIUtils.getScreenHeight(this$0) * (uIUtils.isPortrait(this$0) ? 0.5f : 0.85f));
        layoutParams.width = (int) (((double) uIUtils.getScreenWidth(this$0)) * 0.85d);
        frameLayout.setLayoutParams(layoutParams);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.L0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (UIUtils.INSTANCE.isTablet()) {
            final FrameLayout frameLayout = (FrameLayout) findViewById(xri.L6);
            frameLayout.post(new Runnable() { // from class: svn
                @Override // java.lang.Runnable
                public final void run() {
                    SportRemindConfigActivity.onCreate$lambda$0(frameLayout, this);
                }
            });
        }
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_SPORT_TYPE", getIntent().getIntExtra("KEY_SPORT_TYPE", 0));
        bundle.putInt("DEVICE_TYPE", getIntent().getIntExtra("DEVICE_TYPE", 0));
        setActionBarDisplayable(false);
        if (savedInstanceState == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            k kVarO = supportFragmentManager.o();
            Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction()");
            kVarO.D(true);
            Intrinsics.checkNotNullExpressionValue(kVarO.d(xri.L6, SportRemindConfigFragment.class, bundle, null), "add(containerViewId, F::class.java, args, tag)");
            kVarO.l();
        }
    }
}
