package com.xiaomi.wearable.home.sport.report;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.utils.SportUtilsExtKt;
import com.xiaomi.fitness.sport.view.launch.gym.data.GymReport;
import com.xiaomi.wearable.home.sport.report.ReportAdapter;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.lp5;
import defpackage.pz6;
import defpackage.xri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001/B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0013H\u0016J\u001c\u0010#\u001a\u00020$2\n\u0010%\u001a\u00060\u0002R\u00020\u00002\u0006\u0010&\u001a\u00020\u0013H\u0016J\u0006\u0010'\u001a\u00020$J\b\u0010(\u001a\u00020\u0013H\u0016JY\u0010)\u001a\u00020$2\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0018\u00010+j\n\u0012\u0004\u0012\u00020\u001a\u0018\u0001`*2\"\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0015j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014`\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140\u001e¢\u0006\u0002\u0010.R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R0\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0015j\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/xiaomi/wearable/home/sport/report/ReportAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/wearable/home/sport/report/ReportAdapter$SportDataHolder;", "context", "Landroid/content/Context;", "timeDim", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getTimeDim", "()Ljava/lang/String;", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "selectMap", "Lkotlin/collections/HashMap;", "", "", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "comma", "list", "", "Lcom/xiaomi/fitness/sport/view/launch/gym/data/GymReport;", "todayTitlePosition", "earlierTitlePosition", "hasSelect", "Landroidx/lifecycle/MutableLiveData;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "changeSelectState", "getItemCount", "setData", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "map", "hasItem", "(Ljava/util/ArrayList;Ljava/util/HashMap;Landroidx/lifecycle/MutableLiveData;)V", "SportDataHolder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportAdapter.kt\ncom/xiaomi/wearable/home/sport/report/ReportAdapter\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,164:1\n216#2,2:165\n*S KotlinDebug\n*F\n+ 1 ReportAdapter.kt\ncom/xiaomi/wearable/home/sport/report/ReportAdapter\n*L\n65#1:165,2\n*E\n"})
public final class ReportAdapter extends RecyclerView.Adapter<SportDataHolder> {

    @NotNull
    private final String comma;

    @NotNull
    private final Context context;
    private int earlierTitlePosition;

    @Nullable
    private MutableLiveData<Boolean> hasSelect;
    private final LayoutInflater inflater;
    private List<GymReport> list;

    @Nullable
    private HashMap<Integer, Boolean> selectMap;

    @NotNull
    private final String timeDim;
    private int todayTitlePosition;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042&\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0018\u001a\n \u0012*\u0004\u0018\u00010\u00170\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u001c\u001a\n \u0012*\u0004\u0018\u00010\u00170\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001f\u0010\u001e\u001a\n \u0012*\u0004\u0018\u00010\u00170\u00178\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001f\u0010 \u001a\n \u0012*\u0004\u0018\u00010\u00170\u00178\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001f\u0010#\u001a\n \u0012*\u0004\u0018\u00010\"0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/xiaomi/wearable/home/sport/report/ReportAdapter$SportDataHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "time", "", "position", "", "setTopHolder", "(Ljava/lang/Long;I)V", "Lcom/xiaomi/fitness/sport/view/launch/gym/data/GymReport;", "report", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "selectMap", "bind", "(Lcom/xiaomi/fitness/sport/view/launch/gym/data/GymReport;ILjava/util/HashMap;)V", "Landroid/widget/CheckBox;", "kotlin.jvm.PlatformType", "checkbox", "Landroid/widget/CheckBox;", "getCheckbox", "()Landroid/widget/CheckBox;", "Landroid/widget/TextView;", "nameView", "Landroid/widget/TextView;", "getNameView", "()Landroid/widget/TextView;", "infoView", "getInfoView", "dateView", "getDateView", "monthView", "getMonthView", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/wearable/home/sport/report/ReportAdapter;Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SportDataHolder extends RecyclerView.d0 {
        private final CheckBox checkbox;
        private final TextView dateView;
        private final ImageView icon;
        private final TextView infoView;
        private final TextView monthView;
        private final TextView nameView;
        final /* synthetic */ ReportAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportDataHolder(@NotNull ReportAdapter reportAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = reportAdapter;
            this.checkbox = (CheckBox) itemView.findViewById(xri.d0);
            this.nameView = (TextView) itemView.findViewById(xri.O3);
            this.infoView = (TextView) itemView.findViewById(xri.F2);
            this.dateView = (TextView) itemView.findViewById(xri.Z0);
            this.monthView = (TextView) itemView.findViewById(xri.K3);
            this.icon = (ImageView) itemView.findViewById(xri.u2);
        }

        private final void setTopHolder(Long time, int position) {
            LocalDate localDate = new LocalDate();
            Intrinsics.checkNotNull(time);
            if (Intrinsics.areEqual(localDate, new LocalDate(time.longValue() * 1000))) {
                if (position != this.this$0.todayTitlePosition && this.this$0.todayTitlePosition != -1) {
                    TextView monthView = this.monthView;
                    Intrinsics.checkNotNullExpressionValue(monthView, "monthView");
                    ViewExtKt.gone(monthView);
                    return;
                } else {
                    TextView monthView2 = this.monthView;
                    Intrinsics.checkNotNullExpressionValue(monthView2, "monthView");
                    ViewExtKt.visible(monthView2);
                    this.monthView.setText(ResourceExtKt.getString(c1j.i5));
                    this.this$0.todayTitlePosition = position;
                    return;
                }
            }
            if (position != this.this$0.earlierTitlePosition && this.this$0.earlierTitlePosition != -1) {
                TextView monthView3 = this.monthView;
                Intrinsics.checkNotNullExpressionValue(monthView3, "monthView");
                ViewExtKt.gone(monthView3);
            } else {
                TextView monthView4 = this.monthView;
                Intrinsics.checkNotNullExpressionValue(monthView4, "monthView");
                ViewExtKt.visible(monthView4);
                this.monthView.setText(ResourceExtKt.getString(c1j.n1));
                this.this$0.earlierTitlePosition = position;
            }
        }

        public final void bind(@NotNull GymReport report, int position, @Nullable HashMap<Integer, Boolean> selectMap) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(report, "report");
            this.nameView.setText(AppUtil.getApp().getResources().getString(SportUtilsExtKt.getSportTypeStr(report.getSportType())));
            this.icon.setImageResource(lp5.b(SportUtilsExtKt.convertSportType(report.getSportType())));
            this.checkbox.setSelected(((selectMap != null ? selectMap.get(Integer.valueOf(position)) : null) == null || (bool = selectMap.get(Integer.valueOf(position))) == null) ? false : bool.booleanValue());
            int distance = report.getDistance();
            int length = pz6.e(distance).length();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pz6.c(this.this$0.getContext(), distance, 0));
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(20, true), 0, length, 17);
            String timeStrWithSecDef = TimeDateUtil.getTimeStrWithSecDef(report.getDuration());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(timeStrWithSecDef);
            spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(20, true), 0, timeStrWithSecDef.length(), 17);
            this.infoView.setText(new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) this.this$0.comma).append((CharSequence) spannableStringBuilder2));
            this.dateView.setText(TimeDateUtil.getDateMMddNumberFormat(report.getStartTime() * ((long) 1000)));
            setTopHolder(Long.valueOf(report.getStartTime()), position);
        }

        public final CheckBox getCheckbox() {
            return this.checkbox;
        }

        public final TextView getDateView() {
            return this.dateView;
        }

        public final ImageView getIcon() {
            return this.icon;
        }

        public final TextView getInfoView() {
            return this.infoView;
        }

        public final TextView getMonthView() {
            return this.monthView;
        }

        public final TextView getNameView() {
            return this.nameView;
        }
    }

    public ReportAdapter(@NotNull Context context, @NotNull String timeDim) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeDim, "timeDim");
        this.context = context;
        this.timeDim = timeDim;
        this.inflater = LayoutInflater.from(context);
        this.comma = ResourceExtKt.getString(c1j.y0);
        this.todayTitlePosition = -1;
        this.earlierTitlePosition = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(SportDataHolder holder, ReportAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        holder.getCheckbox().setSelected(!holder.getCheckbox().isSelected());
        HashMap<Integer, Boolean> map = this$0.selectMap;
        if (map != null) {
            map.put(Integer.valueOf(i), Boolean.valueOf(holder.getCheckbox().isSelected()));
        }
        this$0.changeSelectState();
    }

    public final void changeSelectState() {
        HashMap<Integer, Boolean> map = this.selectMap;
        boolean z = false;
        if (map != null) {
            Iterator<Map.Entry<Integer, Boolean>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().booleanValue()) {
                    z = true;
                }
            }
        }
        MutableLiveData<Boolean> mutableLiveData = this.hasSelect;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(Boolean.valueOf(z));
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        List<GymReport> list = this.list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            list = null;
        }
        return list.size();
    }

    @NotNull
    public final String getTimeDim() {
        return this.timeDim;
    }

    public final void setData(@Nullable ArrayList<GymReport> list, @NotNull HashMap<Integer, Boolean> map, @NotNull MutableLiveData<Boolean> hasItem) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(hasItem, "hasItem");
        if (list == null) {
            return;
        }
        this.list = list;
        this.selectMap = map;
        this.hasSelect = hasItem;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final SportDataHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<GymReport> list = this.list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("list");
            list = null;
        }
        holder.bind(list.get(position), position, this.selectMap);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: hlk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReportAdapter.onBindViewHolder$lambda$0(holder, this, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SportDataHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = this.inflater.inflate(dvi.D0, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new SportDataHolder(this, viewInflate);
    }
}
