package com.xiaomi.fitness.relative.hrm;

import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.relative.base.WrapperRelativeChildFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/relative/hrm/HrmWeekRFragment;", "Lcom/xiaomi/fitness/relative/base/WrapperRelativeChildFragment;", "<init>", "()V", "mPageName", "", "getMPageName", "()Ljava/lang/String;", "getItemChildFragmentClass", "Ljava/lang/Class;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "xAxisPosition", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HrmWeekRFragment extends WrapperRelativeChildFragment {
    @Override // com.xiaomi.fitness.relative.base.WrapperRelativeChildFragment
    @NotNull
    public Class<BaseFragment> getItemChildFragmentClass() {
        return HrmWeekItemRFragment.class;
    }

    @Override // com.xiaomi.fitness.relative.base.WrapperRelativeChildFragment
    @NotNull
    public String getMPageName() {
        return "HrmWeek";
    }

    @Override // com.xiaomi.fitness.relative.base.BaseRelativeChildFragment
    public int xAxisPosition() {
        return 1;
    }
}
