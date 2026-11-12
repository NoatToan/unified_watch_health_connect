package com.xiaomi.hm.health.play.card.intelligence;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.worldclock.bean.WorldClockBean;
import com.huami.worldclock.manager.WorldClockStrResHelper;
import com.xiaomi.hm.health.databinding.LayoutToolWorldClockItemBinding;
import com.xiaomi.hm.health.view.ClockView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\"\u0010#J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010!\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/WorldClockAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/play/card/intelligence/WorldClockHolder;", "", "pattern", "Ljava/util/Date;", "date", "Ljava/util/TimeZone;", "timeZone", "formatDate", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/worldclock/bean/WorldClockBean;", "b", "Ljava/util/List;", "worldClockBeans", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "c", "Ljava/util/Calendar;", "calendar", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WorldClockAdapter extends RecyclerView.Adapter<WorldClockHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<WorldClockBean> worldClockBeans;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Calendar calendar = Calendar.getInstance();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;
        public final /* synthetic */ TimeZone b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc, TimeZone timeZone, String str) {
            super(0);
            this.a = exc;
            this.b = timeZone;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage() + "\nlocale:" + Locale.getDefault() + "\ntimezone:" + this.b.getID() + "\npattern:" + this.c;
        }
    }

    public WorldClockAdapter(@NotNull Context context, @NotNull List<WorldClockBean> list) {
        this.context = context;
        this.worldClockBeans = list;
    }

    private final String formatDate(String pattern, Date date, TimeZone timeZone) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.getDefault());
            simpleDateFormat.setTimeZone(timeZone);
            return simpleDateFormat.format(date);
        } catch (Exception e) {
            HMLog.warn$default(null, null, new a(e, timeZone, pattern), 3, null);
            return "";
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.worldClockBeans.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull WorldClockHolder holder, int position) {
        WorldClockBean worldClockBean = this.worldClockBeans.get(position);
        TimeZone timeZone = TimeZone.getTimeZone(worldClockBean.getIdentifier());
        int city = WorldClockStrResHelper.INSTANCE.getCity(this.context, worldClockBean);
        holder.getBinding().toolClockCity.setText(city == 0 ? "" : this.context.getResources().getString(city));
        this.calendar.setTimeZone(timeZone);
        this.calendar.setTime(new Date());
        holder.getBinding().toolClockTime.setText(formatDate(this.context.getResources().getString(R.string.world_clock_date_format_minute_hour), this.calendar.getTime(), timeZone));
        int i = this.calendar.get(11);
        ClockView clockView = holder.getBinding().toolClockView;
        boolean z = false;
        if (6 <= i && i <= 18) {
            z = true;
        }
        clockView.updatePaintColor(!z);
        holder.getBinding().toolClockView.updateTime(i, this.calendar.get(12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public WorldClockHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new WorldClockHolder(LayoutToolWorldClockItemBinding.inflate(LayoutInflater.from(this.context), parent, false));
    }
}
