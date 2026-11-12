package com.mi.fitness.lpamanagement.ui.chinaunicon.provision.wechat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.mi.fitness.lpamanagement.ui.chinaunicon.provision.wechat.LpaCUWechatFragment;
import com.mi.fitness.lpamanagement.ui.download.DownloadProfileFragment;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import defpackage.azi;
import defpackage.pti;
import defpackage.t9a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0011\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/mi/fitness/lpamanagement/ui/chinaunicon/provision/wechat/LpaCUWechatFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/mi/fitness/lpamanagement/ui/chinaunicon/provision/wechat/LpaCUWechatViewModel;", "Lt9a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLpaCUWechatFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LpaCUWechatFragment.kt\ncom/mi/fitness/lpamanagement/ui/chinaunicon/provision/wechat/LpaCUWechatFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class LpaCUWechatFragment extends BaseBindingFragment<LpaCUWechatViewModel, t9a> {

    @NotNull
    private static final String UNICOM_AC = "LPA:1$esim.wo.com.cn$$1.3.6.1.4.1.47814.101.8";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$0(LpaCUWechatFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((LpaCUWechatViewModel) this$0.getMViewModel()).prepareDownloadProfile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(LpaCUWechatFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        if (context != null) {
            DownloadProfileFragment.INSTANCE.startDownloadProfile(UNICOM_AC, context);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return pti.h;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(azi.f3611k);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: zte
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LpaCUWechatFragment.setListener$lambda$0(this.f41659a, view);
            }
        });
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: aue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LpaCUWechatFragment.setListener$lambda$2(this.f3456a, view);
            }
        });
    }
}
