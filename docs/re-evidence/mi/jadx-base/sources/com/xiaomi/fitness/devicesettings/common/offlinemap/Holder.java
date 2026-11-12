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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001f\u0010\u000b\u001a\n \u0003*\u0004\u0018\u00010\n0\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0010\u001a\n \u0003*\u0004\u0018\u00010\u000f0\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0015\u001a\n \u0003*\u0004\u0018\u00010\u00140\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\u0007R\u001f\u0010\u001b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u001c\u0010\u0007¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "districtName", "Landroid/widget/TextView;", "getDistrictName", "()Landroid/widget/TextView;", "districtSize", "getDistrictSize", "Landroid/widget/ImageView;", "download", "Landroid/widget/ImageView;", "getDownload", "()Landroid/widget/ImageView;", "Landroid/view/View;", "downloadProgressLayout", "Landroid/view/View;", "getDownloadProgressLayout", "()Landroid/view/View;", "Lcom/xiaomi/fitness/baseui/widget/CustomCircleProgressBar;", "downloadProgress", "Lcom/xiaomi/fitness/baseui/widget/CustomCircleProgressBar;", "getDownloadProgress", "()Lcom/xiaomi/fitness/baseui/widget/CustomCircleProgressBar;", "downloadProgressText", "getDownloadProgressText", "installingLabel", "getInstallingLabel", "view", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class Holder extends RecyclerView.d0 {
    private final TextView districtName;
    private final TextView districtSize;
    private final ImageView download;
    private final CustomCircleProgressBar downloadProgress;
    private final View downloadProgressLayout;
    private final TextView downloadProgressText;
    private final TextView installingLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Holder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.districtName = (TextView) view.findViewById(zqi.e2);
        this.districtSize = (TextView) view.findViewById(zqi.f2);
        this.download = (ImageView) view.findViewById(zqi.b2);
        this.downloadProgressLayout = view.findViewById(zqi.L6);
        this.downloadProgress = (CustomCircleProgressBar) view.findViewById(zqi.K6);
        this.downloadProgressText = (TextView) view.findViewById(zqi.M6);
        this.installingLabel = (TextView) view.findViewById(zqi.c2);
    }

    public final TextView getDistrictName() {
        return this.districtName;
    }

    public final TextView getDistrictSize() {
        return this.districtSize;
    }

    public final ImageView getDownload() {
        return this.download;
    }

    public final CustomCircleProgressBar getDownloadProgress() {
        return this.downloadProgress;
    }

    public final View getDownloadProgressLayout() {
        return this.downloadProgressLayout;
    }

    public final TextView getDownloadProgressText() {
        return this.downloadProgressText;
    }

    public final TextView getInstallingLabel() {
        return this.installingLabel;
    }
}
