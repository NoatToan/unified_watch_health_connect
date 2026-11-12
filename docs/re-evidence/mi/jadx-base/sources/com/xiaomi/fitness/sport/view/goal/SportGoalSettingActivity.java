package com.xiaomi.fitness.sport.view.goal;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import defpackage.dvi;
import defpackage.xri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/goal/SportGoalSettingActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportGoalSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportGoalSettingActivity.kt\ncom/xiaomi/fitness/sport/view/goal/SportGoalSettingActivity\n+ 2 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 3 FragmentTransaction.kt\nandroidx/fragment/app/FragmentTransactionKt\n*L\n1#1,43:1\n26#2,6:44\n32#2,6:55\n39#3,5:50\n*S KotlinDebug\n*F\n+ 1 SportGoalSettingActivity.kt\ncom/xiaomi/fitness/sport/view/goal/SportGoalSettingActivity\n*L\n37#1:44,6\n37#1:55,6\n39#1:50,5\n*E\n"})
public final class SportGoalSettingActivity extends BaseActivity {
    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.D;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        Bundle extras = getIntent().getExtras();
        if (savedInstanceState == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            k kVarO = supportFragmentManager.o();
            Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction()");
            kVarO.D(true);
            Intrinsics.checkNotNullExpressionValue(kVarO.d(xri.T1, SportGoalWrapperFragment.class, extras, null), "add(containerViewId, F::class.java, args, tag)");
            kVarO.l();
        }
    }
}
