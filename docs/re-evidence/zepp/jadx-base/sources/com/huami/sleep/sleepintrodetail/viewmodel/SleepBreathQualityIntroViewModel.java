package com.huami.sleep.sleepintrodetail.viewmodel;

import android.content.Context;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.sleep.sleepintrodetail.util.SleepBreathQualityUtil;
import com.huami.sleep.sleepintrodetail.vo.SleepIntroItemVo;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR)\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\n8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/viewmodel/SleepBreathQualityIntroViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getIntroData", "", "a", "Ljava/lang/String;", "tag", "Landroidx/lifecycle/MutableLiveData;", "", "b", "Landroidx/lifecycle/MutableLiveData;", "getScore", "()Landroidx/lifecycle/MutableLiveData;", "score", "", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroItemVo;", "c", "Lkotlin/Lazy;", "introData", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepBreathQualityIntroViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "SleepBreathQualityViewModel";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> score = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy introData = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroItemVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<List<? extends SleepIntroItemVo>>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<List<SleepIntroItemVo>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @NotNull
    public final MutableLiveData<List<SleepIntroItemVo>> getIntroData() {
        return (MutableLiveData) this.introData.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getScore() {
        return this.score;
    }

    public final void getIntroData(@NotNull Context context) {
        getIntroData().setValue(SleepBreathQualityUtil.INSTANCE.getIntroList(context));
    }
}
