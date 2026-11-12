package com.xiaomi.fitness.devicesettings.common.offlinemap;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.zqi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/SectionHolder;", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/NormalHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "districtNameTv", "Landroid/widget/TextView;", "getDistrictNameTv", "()Landroid/widget/TextView;", "subDistricts", "Landroidx/recyclerview/widget/RecyclerView;", "getSubDistricts", "()Landroidx/recyclerview/widget/RecyclerView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SectionHolder extends NormalHolder {

    @NotNull
    private final TextView districtNameTv;

    @NotNull
    private final ImageView icon;

    @NotNull
    private final RecyclerView subDistricts;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(zqi.e2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.districtNameTv = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(zqi.W8);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.subDistricts = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(zqi.b2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.icon = (ImageView) viewFindViewById3;
    }

    @NotNull
    public final TextView getDistrictNameTv() {
        return this.districtNameTv;
    }

    @NotNull
    public final ImageView getIcon() {
        return this.icon;
    }

    @NotNull
    public final RecyclerView getSubDistricts() {
        return this.subDistricts;
    }
}
