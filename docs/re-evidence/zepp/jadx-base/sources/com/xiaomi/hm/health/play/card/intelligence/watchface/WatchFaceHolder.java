package com.xiaomi.hm.health.play.card.intelligence.watchface;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.analytics.DbUtils;
import com.huami.viewbindingx.ViewBindingProperty;
import com.huami.viewbindingx.viewholder.ViewHolderBindingsKt;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.databinding.PlayItemWatchFaceBinding;
import com.xiaomi.hm.health.play.bean.Metas;
import com.xiaomi.hm.health.play.bean.WatchFaceData;
import com.xiaomi.hm.health.play.di.PlayKoinModuleKt;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/watchface/WatchFaceHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/xiaomi/hm/health/play/bean/WatchFaceData;", "data", "", "bind", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/databinding/PlayItemWatchFaceBinding;", "b", "Lcom/huami/viewbindingx/ViewBindingProperty;", "()Lcom/xiaomi/hm/health/databinding/PlayItemWatchFaceBinding;", "mViewBinding", "Landroid/view/View;", "itemView", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceHolder extends RecyclerView.ViewHolder {
    public static final /* synthetic */ KProperty<Object>[] c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WatchFaceHolder.class), "mViewBinding", "getMViewBinding()Lcom/xiaomi/hm/health/databinding/PlayItemWatchFaceBinding;"))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ViewBindingProperty mViewBinding;

    public WatchFaceHolder(@NotNull Context context, @NotNull View view) {
        super(view);
        this.context = context;
        this.mViewBinding = ViewHolderBindingsKt.viewBinding(this, PlayItemWatchFaceBinding.class);
        HMDeviceSource majorDeviceSource = PlayKoinModuleKt.getMajorDeviceSource();
        WatchFaceSizeManager watchFaceSizeManager = WatchFaceSizeManager.INSTANCE;
        Pair<Integer, Integer> dialCardSize = watchFaceSizeManager.getDialCardSize(majorDeviceSource);
        int dialTopMargin = watchFaceSizeManager.getDialTopMargin(majorDeviceSource);
        int newTipsStartMargin = watchFaceSizeManager.getNewTipsStartMargin(majorDeviceSource);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = ExtensionsKt.getDp(watchFaceSizeManager.getDialItemWidth(majorDeviceSource));
        Unit unit = Unit.INSTANCE;
        view.setLayoutParams(layoutParams);
        AppCompatImageView appCompatImageView = a().ivWatchFace;
        ViewGroup.LayoutParams layoutParams2 = appCompatImageView.getLayoutParams();
        layoutParams2.width = ExtensionsKt.getDp(dialCardSize.getFirst().intValue());
        layoutParams2.height = ExtensionsKt.getDp(dialCardSize.getSecond().intValue());
        appCompatImageView.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = appCompatImageView.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams3)).topMargin = ExtensionsKt.getDp(dialTopMargin);
        ViewGroup.LayoutParams layoutParams4 = a().ivWatchFaceNew.getLayoutParams();
        Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams4).setMarginStart(ExtensionsKt.getDp(newTipsStartMargin));
    }

    private final PlayItemWatchFaceBinding a() {
        return (PlayItemWatchFaceBinding) this.mViewBinding.getValue(this, c[0]);
    }

    public final void bind(@NotNull WatchFaceData data) {
        PlayItemWatchFaceBinding playItemWatchFaceBindingA = a();
        AppCompatImageView appCompatImageView = playItemWatchFaceBindingA.ivWatchFace;
        Metas metas = data.getMetas();
        String gif = metas == null ? null : metas.getGif();
        if (gif == null) {
            gif = data.getImage();
        }
        ExtensionsKt.loadUrl(appCompatImageView, gif);
        playItemWatchFaceBindingA.tvWatchFaceName.setText(data.getName());
        Metas metas2 = data.getMetas();
        if (metas2 == null ? false : Intrinsics.areEqual((Object) metas2.getRecentMark(), (Object) 1)) {
            playItemWatchFaceBindingA.ivWatchFaceNew.setVisibility(0);
        } else {
            playItemWatchFaceBindingA.ivWatchFaceNew.setVisibility(8);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }
}
