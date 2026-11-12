package com.xiaomi.fitness.util;

import android.app.Application;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableAdapterHelper;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.util.AllRecordsPageUtilKt;
import defpackage.c0j;
import defpackage.iji;
import defpackage.qxi;
import defpackage.xr5;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t\u001a\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e\u001a$\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014\u001a\u0016\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0016\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c¨\u0006 "}, d2 = {"setUpAllRecordsPageBasicUi", "", "fragmentPage", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "hideActionBar", "", "getAbnormalRecordItemRangeStr", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "getAbnormalHrmItemsRangeStr", "hrAbnormalRecordItem", "getTimeDurationStrFromAbnormalFibItem", "item", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;", "checkIfAttachBottomAndLoadMoreIfNeed", "hasMore", "recyclerView", "Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView;", "pullData", "Lkotlin/Function0;", "setPageDescription", "textView", "Landroid/widget/TextView;", "textResId", "", "convertDataItemToMMDDHHMMString", "timestampInSeconds", "", "convertDataItemToTimeWindowStr", "startTime", "endTime", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAllRecordsPageUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllRecordsPageUtil.kt\ncom/xiaomi/fitness/util/AllRecordsPageUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1971#2,14:121\n2341#2,14:135\n1971#2,14:150\n2341#2,14:164\n1#3:149\n*S KotlinDebug\n*F\n+ 1 AllRecordsPageUtil.kt\ncom/xiaomi/fitness/util/AllRecordsPageUtilKt\n*L\n50#1:121,14\n51#1:135,14\n61#1:150,14\n62#1:164,14\n*E\n"})
public final class AllRecordsPageUtilKt {
    public static final void checkIfAttachBottomAndLoadMoreIfNeed(boolean z, @NotNull final MoreRecyclerView recyclerView, @NotNull final Function0<Unit> pullData) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(pullData, "pullData");
        if (z) {
            recyclerView.post(new Runnable() { // from class: p61
                @Override // java.lang.Runnable
                public final void run() {
                    AllRecordsPageUtilKt.checkIfAttachBottomAndLoadMoreIfNeed$lambda$6(recyclerView, pullData);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIfAttachBottomAndLoadMoreIfNeed$lambda$6(MoreRecyclerView recyclerView, Function0 pullData) {
        Intrinsics.checkNotNullParameter(recyclerView, "$recyclerView");
        Intrinsics.checkNotNullParameter(pullData, "$pullData");
        if (ExpandableAdapterHelper.INSTANCE.isAttachBottom(recyclerView)) {
            pullData.invoke();
        }
    }

    @NotNull
    public static final String convertDataItemToMMDDHHMMString(long j) {
        return TimeUtils.formatDate(ResourceExtKt.getString(c0j.h), Long.valueOf(j * ((long) 1000)));
    }

    @NotNull
    public static final String convertDataItemToTimeWindowStr(long j, long j2) {
        return ResourceExtKt.getString(c0j.common_format_time_window_from_to, TimeUtils.formatDate(ResourceExtKt.getString(c0j.h), Long.valueOf(j * ((long) 1000))), TimeDateUtil.getHHmmLocalFormat(j2));
    }

    @NotNull
    public static final String getAbnormalHrmItemsRangeStr(@NotNull SegmentItem hrAbnormalRecordItem) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(hrAbnormalRecordItem, "hrAbnormalRecordItem");
        List<AbnormalItem> items = hrAbnormalRecordItem.getItems();
        if (items == null) {
            return "";
        }
        List<AbnormalItem> list = items;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int value = ((AbnormalItem) next).getValue();
                do {
                    Object next3 = it.next();
                    int value2 = ((AbnormalItem) next3).getValue();
                    if (value < value2) {
                        next = next3;
                        value = value2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        AbnormalItem abnormalItem = (AbnormalItem) next;
        Integer numValueOf = abnormalItem != null ? Integer.valueOf(abnormalItem.getValue()) : null;
        Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                int value3 = ((AbnormalItem) next2).getValue();
                do {
                    Object next4 = it2.next();
                    int value4 = ((AbnormalItem) next4).getValue();
                    if (value3 > value4) {
                        next2 = next4;
                        value3 = value4;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        AbnormalItem abnormalItem2 = (AbnormalItem) next2;
        Integer numValueOf2 = abnormalItem2 != null ? Integer.valueOf(abnormalItem2.getValue()) : null;
        Application application = ApplicationExtKt.getApplication();
        int i = qxi.common_unit_heart_rate_desc;
        Intrinsics.checkNotNull(numValueOf);
        return numValueOf2 + "-" + ResourceExtKt.getQuantityString(application, i, numValueOf.intValue(), numValueOf);
    }

    @NotNull
    public static final String getAbnormalRecordItemRangeStr(@NotNull SegmentItem record) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(record, "record");
        List<AbnormalItem> items = record.getItems();
        List<AbnormalItem> list = items;
        if (list == null || list.isEmpty()) {
            return "";
        }
        List<AbnormalItem> list2 = items;
        Iterator<T> it = list2.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int value = ((AbnormalItem) next).getValue();
                do {
                    Object next3 = it.next();
                    int value2 = ((AbnormalItem) next3).getValue();
                    if (value < value2) {
                        next = next3;
                        value = value2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        AbnormalItem abnormalItem = (AbnormalItem) next;
        Integer numValueOf = abnormalItem != null ? Integer.valueOf(abnormalItem.getValue()) : null;
        Iterator<T> it2 = list2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                int value3 = ((AbnormalItem) next2).getValue();
                do {
                    Object next4 = it2.next();
                    int value4 = ((AbnormalItem) next4).getValue();
                    if (value3 > value4) {
                        next2 = next4;
                        value3 = value4;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        AbnormalItem abnormalItem2 = (AbnormalItem) next2;
        return (abnormalItem2 != null ? Integer.valueOf(abnormalItem2.getValue()) : null) + "-" + (numValueOf != null ? xr5.h(numValueOf.intValue()) : null);
    }

    @NotNull
    public static final String getTimeDurationStrFromAbnormalFibItem(@NotNull AbnormalFibItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int duration = item.getDuration();
        return ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qxi.R1, duration, Integer.valueOf(duration));
    }

    public static final void setPageDescription(@NotNull TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        ExtUtilKt.visible(textView);
        textView.setText(i);
    }

    public static final void setUpAllRecordsPageBasicUi(@NotNull BaseFragment fragmentPage, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentPage, "fragmentPage");
        if (z) {
            fragmentPage.setTitle("");
            fragmentPage.setActionBarDisplayable(false);
        } else {
            fragmentPage.setActionBarDisplayable(true);
            fragmentPage.setTitle(c0j.h5);
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = fragmentPage.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        uIUtils.setNavigationBarColor(fragmentActivityRequireActivity, iji.T2);
        fragmentPage.setTitleBackground(iji.T2);
    }

    public static /* synthetic */ void setUpAllRecordsPageBasicUi$default(BaseFragment baseFragment, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        setUpAllRecordsPageBasicUi(baseFragment, z);
    }
}
