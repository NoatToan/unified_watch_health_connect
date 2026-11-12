package com.huami.assistant.ui.v2.adapter;

import android.text.TextUtils;
import android.text.format.DateUtils;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.util.MultiTypeDelegate;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.R;
import com.huami.assistant.ui.adapter.BaseRecyclerSwipeAdapter;
import com.huami.assistant.ui.v2.model.ScheduleDataItem;
import com.huami.assistant.ui.v2.model.ScheduleDateItem;
import com.huami.assistant.ui.v2.model.ScheduleListItemModel;
import com.huami.assistant.ui.v2.model.ScheduleListType;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.assistant.ui.v2.model.ScheduleYearItem;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.TimeUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0012H\u0002J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0002J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0002J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¨\u0006\u001f"}, d2 = {"Lcom/huami/assistant/ui/v2/adapter/ScheduleAdapter;", "Lcom/huami/assistant/ui/adapter/BaseRecyclerSwipeAdapter;", "Lcom/huami/assistant/ui/v2/model/ScheduleListItemModel;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "Lcom/chad/library/adapter/base/util/MultiTypeDelegate;", GoogleApiAvailabilityLight.a, "helper", "Lcom/huami/assistant/ui/v2/model/ScheduleYearItem;", "item", "", "c", "Lcom/huami/assistant/ui/v2/model/ScheduleDateItem;", "b", "", "timestamp", "", "e", "f", "Lcom/huami/assistant/ui/v2/model/ScheduleDataItem;", "a", "time", "h", "startTime", "endTime", "g", "convert", "", "position", "getSwipeLayoutResourceId", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleAdapter extends BaseRecyclerSwipeAdapter<ScheduleListItemModel, BaseViewHolder> {
    public ScheduleAdapter() {
        super(null);
        setMultiTypeDelegate(d());
    }

    private final void a(BaseViewHolder helper, ScheduleDataItem item) {
        String strG;
        String string;
        ScheduleModel schedule = item.getSchedule().getSchedule();
        if (schedule.isAllDayEvent()) {
            strG = this.mContext.getString(R.string.all_day_event);
        } else {
            long j = 1000;
            strG = g(schedule.getStartTime() * j, schedule.getStopTime() * j);
        }
        h(helper, strG);
        if (TextUtils.isEmpty(schedule.getDesc())) {
            helper.getView(R.id.card_reminder_desc).setVisibility(8);
        } else {
            int i = R.id.card_reminder_desc;
            helper.getView(i).setVisibility(0);
            String desc = schedule.getDesc();
            int length = desc.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = Intrinsics.compare((int) desc.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            helper.setText(i, desc.subSequence(i2, length + 1).toString());
        }
        int i3 = R.id.card_reminder_title;
        if (TextUtils.isEmpty(schedule.getTitle())) {
            string = this.mContext.getString(R.string.info_empty);
        } else {
            String title = schedule.getTitle();
            int length2 = title.length() - 1;
            int i4 = 0;
            boolean z3 = false;
            while (i4 <= length2) {
                boolean z4 = Intrinsics.compare((int) title.charAt(!z3 ? i4 : length2), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    } else {
                        length2--;
                    }
                } else if (z4) {
                    i4++;
                } else {
                    z3 = true;
                }
            }
            string = title.subSequence(i4, length2 + 1).toString();
        }
        helper.setText(i3, string);
        if (DateUtils.isToday(item.getSchedule().getExpandTime() * ((long) 1000))) {
            helper.setBackgroundColor(R.id.item_color, ContextCompat.getColor(this.mContext, R.color.p3));
        } else {
            helper.setBackgroundColor(R.id.item_color, ContextCompat.getColor(this.mContext, R.color.s15));
        }
    }

    private final void b(BaseViewHolder helper, ScheduleDateItem item) {
        helper.setText(R.id.date, e(item.getTimestamp()));
        int i = R.id.weekday;
        long j = 1000;
        helper.setText(i, f(item.getTimestamp() * j));
        TextView textView = (TextView) helper.getView(i);
        textView.setText(f(item.getTimestamp() * j));
        if (DateUtils.isToday(item.getTimestamp() * j)) {
            textView.setTextColor(ContextCompat.getColor(this.mContext, R.color.p3));
        } else {
            textView.setTextColor(ContextCompat.getColor(this.mContext, R.color.s2));
        }
    }

    private final void c(BaseViewHolder helper, ScheduleYearItem item) {
        helper.setText(R.id.year_text, new SimpleDateFormat("yyyy", Locale.getDefault()).format(new Date(item.getTimestamp() * ((long) 1000))));
    }

    private final MultiTypeDelegate<ScheduleListItemModel> d() {
        MultiTypeDelegate<ScheduleListItemModel> multiTypeDelegate = new MultiTypeDelegate<ScheduleListItemModel>() { // from class: com.huami.assistant.ui.v2.adapter.ScheduleAdapter$createMultiTypeDelegate$delegate$1
            @Override // com.chad.library.adapter.base.util.MultiTypeDelegate
            public int getItemType(@NotNull ScheduleListItemModel t) {
                return t.getType().getType();
            }
        };
        multiTypeDelegate.registerItemType(ScheduleListType.YEAR.INSTANCE.getType(), R.layout.item_schedule_year);
        multiTypeDelegate.registerItemType(ScheduleListType.DATE.INSTANCE.getType(), R.layout.item_schedule_date);
        multiTypeDelegate.registerItemType(ScheduleListType.SPLIT.INSTANCE.getType(), R.layout.item_schedule_split);
        multiTypeDelegate.registerItemType(ScheduleListType.EMPTY.INSTANCE.getType(), R.layout.item_schedule_no_data);
        multiTypeDelegate.registerItemType(ScheduleListType.DATA.INSTANCE.getType(), R.layout.item_schedule_data);
        return multiTypeDelegate;
    }

    private final String e(long timestamp) {
        return DateUtils.formatDateTime(this.mContext, timestamp * ((long) 1000), 524304);
    }

    private final String f(long timestamp) {
        DateDay dateDayFrom = DateDay.from(timestamp);
        return (dateDayFrom.equals(DateDay.today()) || dateDayFrom.equals(DateDay.today().yesterday()) || dateDayFrom.equals(DateDay.today().tomorrow())) ? DateUtils.getRelativeTimeSpanString(dateDayFrom.dayStartMills(), DateDay.today().dayStartMills(), 86400000L).toString() : TimeUtil.formatDateTimeByDefaultLocal(timestamp, "EE");
    }

    private final String g(long startTime, long endTime) {
        return DateUtils.formatDateRange(this.mContext, startTime, endTime, 655489);
    }

    private final void h(BaseViewHolder helper, String time) {
        helper.setText(R.id.card_item_time, time);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeAdapterInterface
    public int getSwipeLayoutResourceId(int position) {
        return R.id.swipe;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull ScheduleListItemModel item) {
        if (item instanceof ScheduleYearItem) {
            c(helper, (ScheduleYearItem) item);
        } else if (item instanceof ScheduleDateItem) {
            b(helper, (ScheduleDateItem) item);
        } else if (item instanceof ScheduleDataItem) {
            a(helper, (ScheduleDataItem) item);
        }
    }
}
