package com.xiaomi.fitness.health.trainload;

import android.view.View;
import android.widget.ImageView;
import com.xiaomi.fitness.base.BaseDetailChildFragment;
import com.xiaomi.fitness.base.BaseDetailParentFragment;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.jui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/health/trainload/TrainingLoadFragment;", "Lcom/xiaomi/fitness/base/BaseDetailParentFragment;", "Lcom/xiaomi/fitness/base/BaseDetailChildFragment;", "<init>", "()V", "defaultSportType", "", "getDefaultSportType", "()I", "getClassChild", "Ljava/lang/Class;", "position", "getClassChildName", "", "contentResourceId", "getContentResourceId", "setTabType", "", "initContentView", "contentView", "Landroid/view/View;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrainingLoadFragment extends BaseDetailParentFragment<BaseDetailChildFragment> {
    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        return TrainingLoadDetailFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public String getClassChildName(int position) {
        return "TrainingLoadDetailFragment";
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getContentResourceId() {
        return jui.f23149r;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getDefaultSportType() {
        return 20;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public void initContentView(@NotNull View contentView) {
        ImageView imgShare;
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        super.initContentView(contentView);
        TitleBarAlphaView titleBarAlphaView = getTitleBarAlphaView();
        if (titleBarAlphaView != null && (imgShare = titleBarAlphaView.getImgShare()) != null) {
            imgShare.setVisibility(8);
        }
        TitleBarAlphaView titleBarAlphaView2 = getTitleBarAlphaView();
        if (titleBarAlphaView2 != null) {
            titleBarAlphaView2.setTitleClickable(false);
        }
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public void setTabType() {
        setTabType(2);
    }
}
