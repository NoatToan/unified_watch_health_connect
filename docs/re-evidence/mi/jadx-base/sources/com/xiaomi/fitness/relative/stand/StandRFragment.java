package com.xiaomi.fitness.relative.stand;

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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\tH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\tH\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0014R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/relative/stand/StandRFragment;", "Lcom/xiaomi/fitness/relative/base/BaseRelativeParentFragment;", "Lcom/xiaomi/fitness/relative/base/WrapperRelativeChildFragment;", "<init>", "()V", "isSupportSedentary", "", "Ljava/lang/Boolean;", "defaultSportType", "", "getDefaultSportType", "()I", "getClassChild", "Ljava/lang/Class;", "position", "getClassChildName", "", "setTabList", "", "contentResourceId", "getContentResourceId", "initContentView", "contentView", "Landroid/view/View;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StandRFragment extends BaseRelativeParentFragment<WrapperRelativeChildFragment> {

    @Nullable
    private Boolean isSupportSedentary;

    @Override // com.xiaomi.fitness.relative.base.BaseRelativeParentFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        return position == 0 ? StandDayRFragment.class : StandWeekRFragment.class;
    }

    @Override // com.xiaomi.fitness.relative.base.BaseRelativeParentFragment
    @NotNull
    public String getClassChildName(int position) {
        return position == 0 ? "StandDayRFragment" : "StandWeekRFragment";
    }

    @Override // com.xiaomi.fitness.relative.base.BaseRelativeParentFragment
    public int getContentResourceId() {
        return jui.f23149r;
    }

    @Override // com.xiaomi.fitness.relative.base.BaseRelativeParentFragment
    public int getDefaultSportType() {
        return 5;
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
        ListExtKt.add(getMTabTitles(), getString(c0j.b7));
        ListExtKt.add(getMTabTitles(), getString(c0j.e7));
    }
}
