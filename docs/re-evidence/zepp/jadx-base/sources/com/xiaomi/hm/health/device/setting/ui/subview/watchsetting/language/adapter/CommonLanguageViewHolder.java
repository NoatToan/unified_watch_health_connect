package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.devicex.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R!\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR!\u0010\u0014\u001a\n \t*\u0004\u0018\u00010\u000f0\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/adapter/CommonLanguageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroidx/appcompat/widget/AppCompatImageView;", "kotlin.jvm.PlatformType", "b", "Landroidx/appcompat/widget/AppCompatImageView;", "getSelectIv", "()Landroidx/appcompat/widget/AppCompatImageView;", "selectIv", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "getLanguageTv", "()Landroid/widget/TextView;", "languageTv", "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CommonLanguageViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AppCompatImageView selectIv;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextView languageTv;

    public CommonLanguageViewHolder(@NotNull View view) {
        super(view);
        this.view = view;
        this.selectIv = (AppCompatImageView) view.findViewById(R.id.selected_iv);
        this.languageTv = (TextView) view.findViewById(R.id.language_tv);
    }

    public final TextView getLanguageTv() {
        return this.languageTv;
    }

    public final AppCompatImageView getSelectIv() {
        return this.selectIv;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }
}
