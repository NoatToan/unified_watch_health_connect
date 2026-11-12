package com.xiaomi.fitness.ubox_guide.ui.fragment;

import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.device.manager.export.TempManager;
import com.xiaomi.fitness.device.manager.export.TempManagerExtKt;
import defpackage.esi;
import defpackage.lvi;
import defpackage.r8q;
import defpackage.wc0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/ubox_guide/ui/fragment/KeepAliveSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/ubox_guide/ui/fragment/TempViewModel;", "Lr8q;", "", "bindView", "(Lr8q;)V", "<init>", "()V", "ubox-guide_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class KeepAliveSettingFragment extends BaseBindingFragment<TempViewModel, r8q> {
    public KeepAliveSettingFragment() {
        super(lvi.d);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull r8q r8qVar) {
        Intrinsics.checkNotNullParameter(r8qVar, "<this>");
        wc0 actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        getParentFragmentManager().o().w(esi.e, TempManagerExtKt.getInstance(TempManager.INSTANCE).newGuideOpenKeepAliveSettingFragment()).l();
    }
}
