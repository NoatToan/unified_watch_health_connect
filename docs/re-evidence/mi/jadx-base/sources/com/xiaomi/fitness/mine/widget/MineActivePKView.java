package com.xiaomi.fitness.mine.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.active.pk.export.ActivePkPageExtKt;
import com.xiaomi.fitness.active.pk.export.IPkExport;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.mine.widget.MineActivePKView;
import com.xiaomi.fitness.util.MineOneTrack;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.m0j;
import defpackage.m1g;
import defpackage.nuf;
import defpackage.vni;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/mine/widget/MineActivePKView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "pkActiveCount", MediaStoreUtil.MediaInfo.SIZE, "Landroidx/fragment/app/FragmentActivity;", "mActivity", "", "queryProcessPkCountLiveData", "(IILandroidx/fragment/app/FragmentActivity;)V", "Lm1g;", "mRootView", "Lm1g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMineActivePKView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineActivePKView.kt\ncom/xiaomi/fitness/mine/widget/MineActivePKView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,77:1\n54#2,3:78\n24#2:81\n57#2,6:82\n63#2,2:89\n57#3:88\n*S KotlinDebug\n*F\n+ 1 MineActivePKView.kt\ncom/xiaomi/fitness/mine/widget/MineActivePKView\n*L\n33#1:78,3\n33#1:81\n33#1:82,6\n33#1:89,2\n33#1:88\n*E\n"})
public final class MineActivePKView extends ConstraintLayout {

    @NotNull
    private final m1g mRootView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineActivePKView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(View view) {
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) currentActivity;
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(fragmentActivity);
        } else {
            MineOneTrack.INSTANCE.trackCompetition();
            ActivePkPageExtKt.getINSTANCE(IPkExport.INSTANCE).goToSendInvitationActivity(fragmentActivity, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryProcessPkCountLiveData$lambda$1(FragmentActivity mActivity, int i, View view) {
        Intrinsics.checkNotNullParameter(mActivity, "$mActivity");
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(mActivity);
            return;
        }
        MineOneTrack.INSTANCE.trackCompetition();
        if (i <= 0) {
            ActivePkPageExtKt.getINSTANCE(IPkExport.INSTANCE).goToSendInvitationActivity(mActivity, null);
        } else {
            ActivePkPageExtKt.getINSTANCE(IPkExport.INSTANCE).goToPkListActivity(mActivity, null);
        }
    }

    public final void queryProcessPkCountLiveData(int pkActiveCount, final int size, @NotNull final FragmentActivity mActivity) {
        Intrinsics.checkNotNullParameter(mActivity, "mActivity");
        setOnClickListener(new View.OnClickListener() { // from class: dyf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineActivePKView.queryProcessPkCountLiveData$lambda$1(mActivity, size, view);
            }
        });
        this.mRootView.A.setText(pkActiveCount <= 0 ? ResourceExtKt.getString(m0j.Y) : ResourceExtKt.getString(m0j.X));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineActivePKView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MineActivePKView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineActivePKView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        m1g m1gVarA0 = m1g.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(m1gVarA0, "inflate(...)");
        this.mRootView = m1gVarA0;
        m1gVarA0.C.setText(ResourceExtKt.getString(m0j.Z));
        m1gVarA0.A.setText(ResourceExtKt.getString(m0j.Y));
        ImageView functionIcon = m1gVarA0.B;
        Intrinsics.checkNotNullExpressionValue(functionIcon, "functionIcon");
        Coil.imageLoader(functionIcon.getContext()).enqueue(new ImageRequest.Builder(functionIcon.getContext()).data(Integer.valueOf(vni.g)).target(functionIcon).build());
        nuf.e(this);
        setOnClickListener(new View.OnClickListener() { // from class: eyf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineActivePKView._init_$lambda$0(view);
            }
        });
    }
}
