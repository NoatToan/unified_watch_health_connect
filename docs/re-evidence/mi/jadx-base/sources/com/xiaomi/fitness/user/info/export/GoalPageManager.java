package com.xiaomi.fitness.user.info.export;

import android.app.Activity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/GoalPageManager;", "", "goFirstGuidPage", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "goNextGuidPage", "index", "", "isLastPage", "", "onFinishClick", "destoryActivity", "isShowGoalGuid", "setCurrentTarget", "goFirstGuidPageFromRaindow", "Companion", "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface GoalPageManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/GoalPageManager$Companion;", "", "<init>", "()V", "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void destoryActivity();

    void goFirstGuidPage(@Nullable Activity activity);

    void goFirstGuidPageFromRaindow(@Nullable Activity activity);

    void goNextGuidPage(@Nullable Activity activity, int index);

    boolean isLastPage(int index);

    boolean isShowGoalGuid();

    void onFinishClick();

    void setCurrentTarget();
}
