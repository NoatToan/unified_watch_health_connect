package com.xiaomi.fitness.medal.export;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH'J\u0010\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH'J\b\u0010\u000b\u001a\u00020\u0005H'J\b\u0010\f\u001a\u00020\u0003H'J\n\u0010\r\u001a\u0004\u0018\u00010\tH'J\b\u0010\u000e\u001a\u00020\u0005H'J\b\u0010\u000f\u001a\u00020\u0005H'J\u001e\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0016\u0010\u0015\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H&¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/medal/export/IPopMedalListRepo;", "", "setShouldPullPopMedalData", "", "shouldPull", "", "savePopMedalList", "list", "", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "getPopMedalList", "cameFromMedalDetailPage", "removePoppedMedalFromSp", "getFirstMedal", "isMedalListEmpty", "getShouldPullPopMedalData", "startObservingPopupMedalData", "medalToPopLiveData", "Landroidx/lifecycle/MutableLiveData;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "showPopupDialogIfNeed", "Companion", "medal-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IPopMedalListRepo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/medal/export/IPopMedalListRepo$Companion;", "", "<init>", "()V", "medal-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Deprecated(message = "请使用startObservingPopupMedalData和showPopupDialogIfNeed这两个封装好的方法来处理勋章弹窗")
    boolean cameFromMedalDetailPage();

    @Deprecated(message = "请使用startObservingPopupMedalData和showPopupDialogIfNeed这两个封装好的方法来处理勋章弹窗")
    @Nullable
    PopMedalData getFirstMedal();

    @Deprecated(message = "请使用startObservingPopupMedalData和showPopupDialogIfNeed这两个封装好的方法来处理勋章弹窗")
    @Nullable
    List<PopMedalData> getPopMedalList();

    @Deprecated(message = "请使用startObservingPopupMedalData和showPopupDialogIfNeed这两个封装好的方法来处理勋章弹窗")
    boolean getShouldPullPopMedalData();

    @Deprecated(message = "请使用startObservingPopupMedalData和showPopupDialogIfNeed这两个封装好的方法来处理勋章弹窗")
    boolean isMedalListEmpty();

    @Deprecated(message = "请使用startObservingPopupMedalData和showPopupDialogIfNeed这两个封装好的方法来处理勋章弹窗")
    void removePoppedMedalFromSp();

    @Deprecated(message = "请使用startObservingPopupMedalData和showPopupDialogIfNeed这两个封装好的方法来处理勋章弹窗")
    void savePopMedalList(@NotNull List<PopMedalData> list);

    @Deprecated(message = "请使用startObservingPopupMedalData和showPopupDialogIfNeed这两个封装好的方法来处理勋章弹窗")
    void setShouldPullPopMedalData(boolean shouldPull);

    void showPopupDialogIfNeed(@NotNull MutableLiveData<PopMedalData> medalToPopLiveData);

    void startObservingPopupMedalData(@NotNull MutableLiveData<PopMedalData> medalToPopLiveData, @NotNull FragmentActivity fragmentActivity);
}
