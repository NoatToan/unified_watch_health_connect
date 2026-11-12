package com.xiaomi.fitness.main.utils;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.PrivacyExtKt;
import com.xiaomi.fitness.main.MainActivity;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.main.utils.SimplifiedChineseModel;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/main/utils/SimplifiedChineseModel;", "", "Landroid/content/Context;", "context", "", "index", "", "gotoPrivacyActivity", "(Landroid/content/Context;I)V", "", "isPrivacyEasyMode", "()Z", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "selectTab", "(Landroid/content/Context;Lcom/google/android/material/tabs/TabLayout;I)V", "Lcom/xiaomi/fitness/main/MainActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "id", "Landroidx/fragment/app/Fragment;", "fragment", "curFragment", "showFragment", "(Lcom/xiaomi/fitness/main/MainActivity;IILandroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)V", "selectDefaultTab", "(Lcom/google/android/material/tabs/TabLayout;)V", "Lcom/google/android/material/tabs/TabLayout$g;", FaceSchema.FACE_PAGE_TAB, "setTabClickListener", "(Landroid/content/Context;Lcom/google/android/material/tabs/TabLayout$g;I)V", "<init>", "()V", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SimplifiedChineseModel {
    private final void gotoPrivacyActivity(Context context, int index) {
        if (index == MainTab.INSTANCE.getINDEX_SPORT() || index == -1) {
            return;
        }
        PrivacyExtKt.showPrivacyActivity$default(context, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTabClickListener$lambda$0(SimplifiedChineseModel this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        if (!this$0.isPrivacyEasyMode() || Intrinsics.areEqual(view.getTag(), Integer.valueOf(MainTab.INSTANCE.getINDEX_SPORT()))) {
            return;
        }
        PrivacyExtKt.showPrivacyActivity$default(context, null, null, 6, null);
    }

    public final boolean isPrivacyEasyMode() {
        return !RegionPreference.INSTANCE.getPRIVACY_AGREE();
    }

    public final void selectDefaultTab(@NotNull TabLayout tabLayout) {
        TabLayout.g gVarX;
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        if (!isPrivacyEasyMode() || (gVarX = tabLayout.x(MainTab.INSTANCE.getINDEX_SPORT())) == null) {
            return;
        }
        gVarX.m();
    }

    public final void selectTab(@NotNull Context context, @NotNull TabLayout tabLayout, int index) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        if (isPrivacyEasyMode()) {
            TabLayout.g gVarX = tabLayout.x(MainTab.INSTANCE.getINDEX_SPORT());
            if (gVarX != null) {
                gVarX.m();
            }
            gotoPrivacyActivity(context, index);
        }
    }

    public final void setTabClickListener(@NotNull final Context context, @NotNull TabLayout.g tab, int index) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tab, "tab");
        View viewE = tab.e();
        Object parent = viewE != null ? viewE.getParent() : null;
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        View view = (View) parent;
        view.setTag(Integer.valueOf(index));
        view.setOnClickListener(new View.OnClickListener() { // from class: tdm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SimplifiedChineseModel.setTabClickListener$lambda$0(this.f34603a, context, view2);
            }
        });
    }

    public final void showFragment(@NotNull MainActivity activity, int index, int id, @NotNull Fragment fragment, @Nullable Fragment curFragment) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Logger.i("SimplifiedChineseModel", "index:" + index);
        if (index == MainTab.INSTANCE.getINDEX_SPORT()) {
            LaunchExtensionKt.showFragment(activity, id, fragment, curFragment);
        }
    }
}
