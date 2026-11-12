package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0016\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/interest/InterestDialTypeHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "a", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "rootView", "Landroidx/appcompat/widget/AppCompatImageView;", "b", "Landroidx/appcompat/widget/AppCompatImageView;", "getStyleIv", "()Landroidx/appcompat/widget/AppCompatImageView;", "styleIv", "c", "getCheckedIv", "checkedIv", "Landroid/widget/TextView;", GoogleApiAvailabilityLight.a, "Landroid/widget/TextView;", "getStyleTv", "()Landroid/widget/TextView;", "styleTv", "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class InterestDialTypeHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final View rootView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AppCompatImageView styleIv;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final AppCompatImageView checkedIv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final TextView styleTv;

    public InterestDialTypeHolder(@NotNull View view) {
        super(view);
        this.rootView = view;
        this.styleIv = (AppCompatImageView) view.findViewById(R.id.style_iv);
        this.checkedIv = (AppCompatImageView) view.findViewById(R.id.checked_iv);
        this.styleTv = (TextView) view.findViewById(R.id.style_tv);
    }

    @NotNull
    public final AppCompatImageView getCheckedIv() {
        return this.checkedIv;
    }

    @NotNull
    public final View getRootView() {
        return this.rootView;
    }

    @NotNull
    public final AppCompatImageView getStyleIv() {
        return this.styleIv;
    }

    @NotNull
    public final TextView getStyleTv() {
        return this.styleTv;
    }
}
