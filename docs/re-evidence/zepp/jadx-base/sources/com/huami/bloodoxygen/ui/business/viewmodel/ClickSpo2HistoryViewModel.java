package com.huami.bloodoxygen.ui.business.viewmodel;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.kvkit.KvKey;
import com.huami.bloodoxygen.core.usecase.clickspo2.GetReverseClickSpo2UseCase;
import com.huami.bloodoxygen.core.utils.BloodOxygenUtils;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.coroutines.ExtKt;
import com.huami.bloodoxygen.ui.utils.ChartDataHelper;
import com.huami.bloodoxygen.ui.utils.ExtensionsKt;
import com.huami.bloodoxygen.ui.utils.TimeUtils;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 .2\u00020\u0001:\u0001.B-\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010+\u001a\u00020!\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b,\u0010-J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0006\u0010\f\u001a\u00020\u0005R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0019j\b\u0012\u0004\u0012\u00020\u0007`\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006/"}, d2 = {"Lcom/huami/bloodoxygen/ui/business/viewmodel/ClickSpo2HistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "clickMeasureSpo2List", "", "a", "Lcom/huami/bloodoxygen/ui/business/viewmodel/HistoryViewTypeData;", "getList", "Landroidx/lifecycle/LiveData;", "", "getLiveData", "loadMore", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "Ljava/lang/ref/WeakReference;", "contextRef", "Lcom/huami/bloodoxygen/core/usecase/clickspo2/GetReverseClickSpo2UseCase;", "b", "Lcom/huami/bloodoxygen/core/usecase/clickspo2/GetReverseClickSpo2UseCase;", "getReverseClickSpo2UseCase", "Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", "c", "Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", "kvKey", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", GoogleApiAvailabilityLight.a, "Ljava/util/ArrayList;", "historyViewTypeDataList", "e", "Z", "isLoading", "", "f", "J", "to", "g", "from", "Landroidx/lifecycle/MutableLiveData;", "h", "Landroidx/lifecycle/MutableLiveData;", "liveData", "registerTime", "<init>", "(Ljava/lang/ref/WeakReference;JLcom/huami/bloodoxygen/core/usecase/clickspo2/GetReverseClickSpo2UseCase;Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;)V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class ClickSpo2HistoryViewModel extends ViewModel {

    @NotNull
    private static final String i = "ClickSpo2HistoryViewModel";
    private static final int j = 60;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WeakReference<Context> contextRef;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final GetReverseClickSpo2UseCase getReverseClickSpo2UseCase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final KvKey kvKey;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isLoading;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final long from;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<HistoryViewTypeData> historyViewTypeDataList = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long to = System.currentTimeMillis();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> liveData = new MutableLiveData<>();

    public ClickSpo2HistoryViewModel(@NotNull WeakReference<Context> weakReference, long j2, @NotNull GetReverseClickSpo2UseCase getReverseClickSpo2UseCase, @NotNull KvKey kvKey) {
        this.contextRef = weakReference;
        this.getReverseClickSpo2UseCase = getReverseClickSpo2UseCase;
        this.kvKey = kvKey;
        this.from = BloodOxygenUtils.INSTANCE.getZeroTimeInMillis(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(List<ClickMeasuredSpo2> clickMeasureSpo2List) throws Exception {
        Context context = this.contextRef.get();
        if (context == null) {
            return;
        }
        Iterator<Integer> it2 = CollectionsKt__CollectionsKt.getIndices(clickMeasureSpo2List).iterator();
        while (it2.hasNext()) {
            ClickMeasuredSpo2 clickMeasuredSpo2 = clickMeasureSpo2List.get(((IntIterator) it2).nextInt());
            Date date = new Date(clickMeasuredSpo2.getTimestamp());
            String year = TimeUtils.INSTANCE.formatYear(context, date);
            String formatTime$default = HMDataFormatKt.getFormatTime$default(date, HMPattern.ABBR_MONTH_DAY, (Locale) null, 2, (Object) null);
            String time = com.xiaomi.hm.health.baseutil.TimeUtils.formatTime(context, date);
            String valuePerCent$ui_release = ChartDataHelper.INSTANCE.toValuePerCent$ui_release(clickMeasuredSpo2.getSpo2(), context);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valuePerCent$ui_release);
            String string = context.getString(R.string.bo_ui_unit_percent);
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) valuePerCent$ui_release, string, 0, false, 6, (Object) null);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) ExtensionsKt.sp2Px(18)), 0, valuePerCent$ui_release.length(), 33);
            if (iIndexOf$default >= 0) {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) ExtensionsKt.sp2Px(14)), iIndexOf$default, string.length() + iIndexOf$default, 33);
            }
            Unit unit = Unit.INSTANCE;
            HistoryListValueData historyListValueData = new HistoryListValueData(year, formatTime$default, time, spannableStringBuilder);
            HistoryViewTypeData historyViewTypeData = (HistoryViewTypeData) CollectionsKt.lastOrNull((List) this.historyViewTypeDataList);
            if (historyViewTypeData != null) {
                if (historyViewTypeData instanceof ListData) {
                    ListData listData = (ListData) historyViewTypeData;
                    ArrayList<HistoryListValueData> list = listData.getList();
                    if (!(list == null || list.isEmpty())) {
                        HistoryListValueData historyListValueData2 = (HistoryListValueData) CollectionsKt.last((List) listData.getList());
                        if (!Intrinsics.areEqual(historyListValueData2.getYear(), historyListValueData.getYear())) {
                            this.historyViewTypeDataList.add(new TitleData(year, formatTime$default, false, 4, null));
                            this.historyViewTypeDataList.add(new ListData(CollectionsKt__CollectionsKt.arrayListOf(historyListValueData)));
                        } else if (Intrinsics.areEqual(historyListValueData2.getDate(), historyListValueData.getDate())) {
                            listData.getList().add(historyListValueData);
                        } else {
                            this.historyViewTypeDataList.add(new TitleData(year, formatTime$default, false));
                            this.historyViewTypeDataList.add(new ListData(CollectionsKt__CollectionsKt.arrayListOf(historyListValueData)));
                        }
                    }
                }
                throw new Exception("historyViewTypeDataList data type error");
            }
            this.historyViewTypeDataList.add(new TitleData(year, formatTime$default, false, 4, null));
            this.historyViewTypeDataList.add(new ListData(CollectionsKt__CollectionsKt.arrayListOf(historyListValueData)));
        }
    }

    @NotNull
    public final List<HistoryViewTypeData> getList() {
        return this.historyViewTypeDataList;
    }

    @NotNull
    public final LiveData<Boolean> getLiveData() {
        return this.liveData;
    }

    public final void loadMore() {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new ClickSpo2HistoryViewModel$loadMore$$inlined$safeLaunch$1(null, this), 2, null);
    }
}
