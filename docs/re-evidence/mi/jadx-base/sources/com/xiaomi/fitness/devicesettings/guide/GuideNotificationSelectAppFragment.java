package com.xiaomi.fitness.devicesettings.guide;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.devicesettings.guide.GuideNotificationSelectAppFragment;
import defpackage.eui;
import defpackage.t6b;
import defpackage.wzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationSelectAppFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationViewModel;", "Lt6b;", "", "toCallSettingPage", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", "bindView", "(Lt6b;)V", "Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationSelectAppAdapter;", "mNotifyAdapter", "Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationSelectAppAdapter;", "getMNotifyAdapter", "()Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationSelectAppAdapter;", "setMNotifyAdapter", "(Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationSelectAppAdapter;)V", "", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideNotificationSelectAppFragment extends Hilt_GuideNotificationSelectAppFragment<GuideNotificationViewModel, t6b> {

    @Nullable
    private GuideNotificationSelectAppAdapter mNotifyAdapter;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(GuideNotificationSelectAppFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.toCallSettingPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(GuideNotificationSelectAppFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        GuideNotificationSelectAppAdapter guideNotificationSelectAppAdapter = this$0.mNotifyAdapter;
        if (guideNotificationSelectAppAdapter != null) {
            guideNotificationSelectAppAdapter.refreshList(it);
        }
        return Unit.INSTANCE;
    }

    private final void toCallSettingPage() {
        BaseFragmentExKt.gotoPage(this, GuideOpenPhoneCallFragment.class, null);
        finish();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull t6b t6bVar) {
        Intrinsics.checkNotNullParameter(t6bVar, "<this>");
        t6bVar.B.setOnClickListener(new View.OnClickListener() { // from class: e6b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideNotificationSelectAppFragment.bindView$lambda$1(this.f16308a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.E2;
    }

    @Nullable
    public final GuideNotificationSelectAppAdapter getMNotifyAdapter() {
        return this.mNotifyAdapter;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        return true;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.Oe);
        hideBack();
        this.mNotifyAdapter = new GuideNotificationSelectAppAdapter((GuideNotificationViewModel) getMViewModel());
        ((t6b) getMBinding()).A.setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
        ((t6b) getMBinding()).A.setAdapter(this.mNotifyAdapter);
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        ((GuideNotificationViewModel) getMViewModel()).getPackageList(new Function1() { // from class: f6b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GuideNotificationSelectAppFragment.onViewCreated$lambda$0(this.f17457a, (List) obj);
            }
        });
    }

    public final void setMNotifyAdapter(@Nullable GuideNotificationSelectAppAdapter guideNotificationSelectAppAdapter) {
        this.mNotifyAdapter = guideNotificationSelectAppAdapter;
    }
}
