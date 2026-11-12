package com.xiaomi.hm.health.ui.goal.manager;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.WheelView;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.goal.GoalFunctionsKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR%\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\u0007\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/ui/goal/manager/SportGoalPickerManager;", "", "", "b", PointCategory.INIT, "saveData", "Lcom/huami/widget/wheelview/WheelView;", "a", "Lcom/huami/widget/wheelview/WheelView;", "wheelView", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "personInfo", "", "c", LogUtil.I, "stepGap", "<init>", "(Lcom/huami/widget/wheelview/WheelView;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportGoalPickerManager {

    @NotNull
    public static final String TAG = "SportGoalPickerManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WheelView wheelView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy personInfo = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int stepGap = 1000;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "cur item:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HMPersonInfo> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMPersonInfo invoke() {
            return HMPersonInfo.getInstance();
        }
    }

    public SportGoalPickerManager(@NotNull WheelView wheelView) {
        this.wheelView = wheelView;
    }

    private final HMPersonInfo a() {
        return (HMPersonInfo) this.personInfo.getValue();
    }

    private final void b() {
        if (a().getMiliConfig().getGoalStepsCount() < 2000) {
            a().getMiliConfig().setGoalStepsCount(2000);
        }
        int goalStepsCount = (a().getMiliConfig().getGoalStepsCount() - 2000) / this.stepGap;
        HMLog.debug(TAG, new a(goalStepsCount));
        this.wheelView.setCurrentItem(goalStepsCount);
    }

    public final void init() {
        WheelView wheelView = this.wheelView;
        int i = this.stepGap;
        GoalFunctionsKt.setupWheelPicker(wheelView, 2000 / i, 30000 / i, 1000, R.string.step, true);
        b();
    }

    public final void saveData() {
        a().getMiliConfig().setGoalStepsCount((this.wheelView.getCurrentItem() * this.stepGap) + 2000);
    }
}
