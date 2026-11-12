package com.xiaomi.fitness.relative.weight;

import android.view.View;
import android.widget.ImageView;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.relative.base.BaseRelativeParentFragment;
import com.xiaomi.fitness.relative.base.WrapperRelativeChildFragment;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.c0j;
import defpackage.jui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0014J\u0014\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0006H\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/relative/weight/WeightRFragment;", "Lcom/xiaomi/fitness/relative/base/BaseRelativeParentFragment;", "Lcom/xiaomi/fitness/relative/base/WrapperRelativeChildFragment;", "<init>", "()V", "defaultSportType", "", "getDefaultSportType", "()I", "setTabList", "", "initContentView", "contentView", "Landroid/view/View;", "setTabType", "getClassChild", "Ljava/lang/Class;", "position", "getClassChildName", "", "contentResourceId", "getContentResourceId", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightRFragment extends BaseRelativeParentFragment<WrapperRelativeChildFragment> {
    @Override // com.xiaomi.fitness.relative.base.BaseRelativeParentFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        return WeightDayRFragment.class;
    }

    @Override // com.xiaomi.fitness.relative.base.BaseRelativeParentFragment
    @NotNull
    public String getClassChildName(int position) {
        return "WeightDayRFragment";
    }

    @Override // com.xiaomi.fitness.relative.base.BaseRelativeParentFragment
    public int getContentResourceId() {
        return jui.f23149r;
    }

    @Override // com.xiaomi.fitness.relative.base.BaseRelativeParentFragment
    public int getDefaultSportType() {
        return 10000;
    }

    @Override // com.xiaomi.fitness.relative.base.BaseRelativeParentFragment
    public void initContentView(@NotNull View contentView) {
        ImageView imgShare;
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        super.initContentView(contentView);
        TitleBarAlphaView titleBarAlphaView = getTitleBarAlphaView();
        if (titleBarAlphaView == null || (imgShare = titleBarAlphaView.getImgShare()) == null) {
            return;
        }
        imgShare.setVisibility(8);
    }

    @Override // com.xiaomi.fitness.relative.base.BaseRelativeParentFragment
    public void setTabList() {
        ListExtKt.add(getMTabTitles(), getString(c0j.ip));
        ListExtKt.add(getMTabTitles(), getString(c0j.d7));
    }

    @Override // com.xiaomi.fitness.relative.base.BaseRelativeParentFragment
    public void setTabType() {
        setTabType(2);
    }
}
