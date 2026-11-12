package com.xiaomi.hm.health.device.sleep;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ui.widget.sleepdial.OnTimeChangedListener;
import com.loc.z;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import java.text.NumberFormat;
import java.util.BitSet;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b3\u00104J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0006\u0010\u000e\u001a\u00020\u0003J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H\u0016R\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001a\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b \u0010\u001eR+\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\"0\u00138\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u001eR+\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\"0\u00138\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010\u001eR\u0016\u0010+\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R%\u00102\u001a\n /*\u0004\u0018\u00010.0.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0018\u001a\u0004\b\u0014\u00101¨\u00065"}, d2 = {"Lcom/xiaomi/hm/health/device/sleep/SleepSettingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/ui/widget/sleepdial/OnTimeChangedListener;", "", "e", "", "start", "endTime", "a", "index", "reversSetValue", "Landroidx/lifecycle/LiveData;", "Ljava/util/BitSet;", "loadWeeklySetting", "initTimes", "end", "startTime", "Ljava/util/BitSet;", "weeklyBitSet", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "weeklySwitchLiveData", "c", "Lkotlin/Lazy;", "()I", "oneDay", "", GoogleApiAvailabilityLight.a, "getEnterSleepTimeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "enterSleepTimeLiveData", "getWakeUpTimeLiveData", "wakeUpTimeLiveData", "Lkotlin/Pair;", "f", "getRestoreTimesLiveData", "restoreTimesLiveData", "g", "getTimeDiffLiveData", "timeDiffLiveData", "h", LogUtil.I, "startTimeInMinutes", "i", "endTimeInMinutes", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", z.j, "()Ljava/text/NumberFormat;", "numberFormat", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepSettingViewModel extends ViewModel implements OnTimeChangedListener {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int startTimeInMinutes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int endTimeInMinutes;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BitSet weeklyBitSet = new BitSet();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BitSet> weeklySwitchLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy oneDay = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> enterSleepTimeLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> wakeUpTimeLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Integer, Integer>> restoreTimesLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<String, String>> timeDiffLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy numberFormat = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<NumberFormat> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NumberFormat invoke() {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setMinimumIntegerDigits(2);
            return integerInstance;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return 1440;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int a(int start, int endTime) {
        if (start > endTime) {
            endTime += c();
        } else if (start >= endTime) {
            return c();
        }
        return endTime - start;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NumberFormat b() {
        return (NumberFormat) this.numberFormat.getValue();
    }

    private final int c() {
        return ((Number) this.oneDay.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SleepSettingViewModel$timeDiff$$inlined$safeLaunch$1(null, this), 2, null);
    }

    @Override // com.huami.ui.widget.sleepdial.OnTimeChangedListener
    public void end(int endTime) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SleepSettingViewModel$end$$inlined$safeLaunch$1(null, this, endTime), 2, null);
    }

    @NotNull
    public final MutableLiveData<String> getEnterSleepTimeLiveData() {
        return this.enterSleepTimeLiveData;
    }

    @NotNull
    public final MutableLiveData<Pair<Integer, Integer>> getRestoreTimesLiveData() {
        return this.restoreTimesLiveData;
    }

    @NotNull
    public final MutableLiveData<Pair<String, String>> getTimeDiffLiveData() {
        return this.timeDiffLiveData;
    }

    @NotNull
    public final MutableLiveData<String> getWakeUpTimeLiveData() {
        return this.wakeUpTimeLiveData;
    }

    public final void initTimes() {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SleepSettingViewModel$initTimes$$inlined$safeLaunch$1(null, this), 2, null);
    }

    @NotNull
    public final LiveData<BitSet> loadWeeklySetting() {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SleepSettingViewModel$loadWeeklySetting$$inlined$safeLaunch$1(null, this), 2, null);
        return this.weeklySwitchLiveData;
    }

    public final void reversSetValue(int index) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SleepSettingViewModel$reversSetValue$$inlined$safeLaunch$1(null, index, this), 2, null);
    }

    @Override // com.huami.ui.widget.sleepdial.OnTimeChangedListener
    public void start(int startTime) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SleepSettingViewModel$start$$inlined$safeLaunch$1(null, this, startTime), 2, null);
    }
}
