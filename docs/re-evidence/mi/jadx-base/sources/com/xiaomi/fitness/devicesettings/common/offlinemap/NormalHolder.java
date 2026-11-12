package com.xiaomi.fitness.devicesettings.common.offlinemap;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.CustomCircleProgressBar;
import defpackage.zqi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0015\u001a\n \u000f*\u0004\u0018\u00010\u00140\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/NormalHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "districtName", "Landroid/widget/TextView;", "getDistrictName", "()Landroid/widget/TextView;", "districtSize", "getDistrictSize", "Landroid/widget/ImageView;", "iconIv", "Landroid/widget/ImageView;", "getIconIv", "()Landroid/widget/ImageView;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "downloadProgressLayout", "Landroid/view/View;", "getDownloadProgressLayout", "()Landroid/view/View;", "Lcom/xiaomi/fitness/baseui/widget/CustomCircleProgressBar;", "downloadProgress", "Lcom/xiaomi/fitness/baseui/widget/CustomCircleProgressBar;", "getDownloadProgress", "()Lcom/xiaomi/fitness/baseui/widget/CustomCircleProgressBar;", "distInstalled", "getDistInstalled", "view", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class NormalHolder extends RecyclerView.d0 {

    @NotNull
    private final TextView distInstalled;

    @NotNull
    private final TextView districtName;

    @NotNull
    private final TextView districtSize;
    private final CustomCircleProgressBar downloadProgress;
    private final View downloadProgressLayout;

    @NotNull
    private final ImageView iconIv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(zqi.e2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.districtName = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(zqi.f2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.districtSize = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(zqi.b2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.iconIv = (ImageView) viewFindViewById3;
        this.downloadProgressLayout = view.findViewById(zqi.L6);
        this.downloadProgress = (CustomCircleProgressBar) view.findViewById(zqi.K6);
        View viewFindViewById4 = view.findViewById(zqi.c2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.distInstalled = (TextView) viewFindViewById4;
    }

    @NotNull
    public final TextView getDistInstalled() {
        return this.distInstalled;
    }

    @NotNull
    public final TextView getDistrictName() {
        return this.districtName;
    }

    @NotNull
    public final TextView getDistrictSize() {
        return this.districtSize;
    }

    public final CustomCircleProgressBar getDownloadProgress() {
        return this.downloadProgress;
    }

    public final View getDownloadProgressLayout() {
        return this.downloadProgressLayout;
    }

    @NotNull
    public final ImageView getIconIv() {
        return this.iconIv;
    }
}
