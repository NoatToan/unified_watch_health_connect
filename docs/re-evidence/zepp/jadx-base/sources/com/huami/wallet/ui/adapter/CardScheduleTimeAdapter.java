package com.huami.wallet.ui.adapter;

import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.nfc.applet.CardScheduleTime;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.utils.KTViewExtensionKt;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016R6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R?\u0010\u001f\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/wallet/ui/adapter/CardScheduleTimeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/wallet/ui/adapter/CardScheduleTimeAdapter$CardScheduleViewHolder;", "Landroid/view/ViewGroup;", "p0", "", "p1", "onCreateViewHolder", "", "onBindViewHolder", "getItemCount", "", "Lcom/huami/nfc/applet/CardScheduleTime;", "value", "a", "Ljava/util/List;", "getDataSource", "()Ljava/util/List;", "setDataSource", "(Ljava/util/List;)V", ParamKey.dataSource, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "cardScheduleTime", "b", "Lkotlin/jvm/functions/Function1;", "getItemViewDeleteClickListener", "()Lkotlin/jvm/functions/Function1;", "setItemViewDeleteClickListener", "(Lkotlin/jvm/functions/Function1;)V", "itemViewDeleteClickListener", "<init>", "()V", "CardScheduleViewHolder", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class CardScheduleTimeAdapter extends RecyclerView.Adapter<CardScheduleViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<CardScheduleTime> dataSource = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function1<? super CardScheduleTime, Unit> itemViewDeleteClickListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/huami/wallet/ui/adapter/CardScheduleTimeAdapter$CardScheduleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/nfc/applet/CardScheduleTime;", "cardScheduleTime", "", "bindData", "Landroid/widget/Button;", "a", "Landroid/widget/Button;", "scheduleTime", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/wallet/ui/adapter/CardScheduleTimeAdapter;Landroid/view/View;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public final class CardScheduleViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private Button scheduleTime;

        public CardScheduleViewHolder(View view) {
            super(view);
            this.scheduleTime = (Button) view;
        }

        public final void bindData(@NotNull CardScheduleTime cardScheduleTime) {
            int i;
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, cardScheduleTime.getHour());
            calendar.set(12, cardScheduleTime.getMinute());
            boolean zIs24HourFormat = DateFormat.is24HourFormat(this.itemView.getContext());
            if (zIs24HourFormat) {
                i = R.string.access_door_time_pattern_hour_minute;
            } else {
                if (zIs24HourFormat) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.string.access_door_time_pattern_hour_minute_12;
            }
            this.scheduleTime.setText(new SimpleDateFormat(this.itemView.getContext().getString(i), Locale.getDefault()).format(calendar.getTime()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ List<CardScheduleTime> b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<CardScheduleTime> list, int i) {
            super(1);
            this.b = list;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable View view) {
            Function1<CardScheduleTime, Unit> itemViewDeleteClickListener = CardScheduleTimeAdapter.this.getItemViewDeleteClickListener();
            if (itemViewDeleteClickListener == null) {
                return;
            }
            itemViewDeleteClickListener.invoke(this.b.get(this.c));
        }
    }

    @NotNull
    public final List<CardScheduleTime> getDataSource() {
        return this.dataSource;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.dataSource.size();
    }

    @Nullable
    public final Function1<CardScheduleTime, Unit> getItemViewDeleteClickListener() {
        return this.itemViewDeleteClickListener;
    }

    public final void setDataSource(@NotNull List<CardScheduleTime> list) {
        this.dataSource.clear();
        this.dataSource.addAll(list);
        notifyDataSetChanged();
    }

    public final void setItemViewDeleteClickListener(@Nullable Function1<? super CardScheduleTime, Unit> function1) {
        this.itemViewDeleteClickListener = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull CardScheduleViewHolder p0, int p1) {
        List<CardScheduleTime> list = this.dataSource;
        if (!(p1 < list.size())) {
            list = null;
        }
        if (list == null) {
            return;
        }
        p0.bindData(list.get(p1));
        KTViewExtensionKt.singleClick(p0.itemView, new a(list, p1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public CardScheduleViewHolder onCreateViewHolder(@NotNull ViewGroup p0, int p1) {
        return new CardScheduleViewHolder(LayoutInflater.from(p0.getContext()).inflate(R.layout.wl_item_schedule_time_button, p0, false));
    }
}
