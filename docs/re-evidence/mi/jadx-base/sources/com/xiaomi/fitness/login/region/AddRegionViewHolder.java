package com.xiaomi.fitness.login.region;

import android.view.View;
import com.xiaomi.fitness.account.api.bean.CountryInfo;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.dv1;
import defpackage.yqe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/login/region/AddRegionViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseBindingViewHolder;", "Lyqe;", "Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "bindView", "(Lyqe;Lcom/xiaomi/fitness/account/api/bean/CountryInfo;)V", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AddRegionViewHolder extends BaseBindingViewHolder<yqe, CountryInfo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddRegionViewHolder(@NotNull View view) {
        super(dv1.f15952b, view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder
    public void bindView(@NotNull yqe yqeVar, @NotNull CountryInfo t) {
        Intrinsics.checkNotNullParameter(yqeVar, "<this>");
        Intrinsics.checkNotNullParameter(t, "t");
    }
}
