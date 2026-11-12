package com.xiaomi.fitness.health.todayhealth.ui.items;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.health.todayhealth.ui.holder.BloodPressureHealthHolder;
import com.xiaomi.fitness.health.todayhealth.ui.holder.HeartHealthHolder;
import com.xiaomi.fitness.health.todayhealth.ui.holder.HeartRateHolder;
import com.xiaomi.fitness.health.todayhealth.ui.holder.LongSleepHolder;
import com.xiaomi.fitness.health.todayhealth.ui.holder.Spo2Holder;
import com.xiaomi.fitness.health.todayhealth.ui.holder.StressHolder;
import com.xiaomi.fitness.health.todayhealth.ui.holder.SummaryCardViewHolder;
import com.xiaomi.fitness.health.todayhealth.ui.items.TodayHealthItemAdapter;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004$%&'B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lorg/joda/time/LocalDate;", "selectedDate", "", "refreshDate", "(Lorg/joda/time/LocalDate;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "healthCheckViewModel", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem;", "healthItemList", "Ljava/util/List;", "mSelectedDate", "Lorg/joda/time/LocalDate;", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;)V", "Companion", "TodayHealthItem", "TitleViewHolder", "KnowMoreHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TodayHealthItemAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int CODE_BASIC_HEALTH_TITLE = 2;
    public static final int CODE_BLOOD_PRESSURE_HEALTH = 11;
    public static final int CODE_HEART_HEALTH = 10;
    public static final int CODE_HEART_RATE = 3;
    public static final int CODE_KNOW_MORE = 12;
    public static final int CODE_LONG_SLEEP = 9;
    public static final int CODE_PRESSURE = 6;
    public static final int CODE_SLEEP_HEALTH_INDEX_TITLE = 7;
    public static final int CODE_SPO2 = 5;
    public static final int CODE_SUMMARY_CARD = 0;

    @NotNull
    public static final String TAG = "TodayHealthItemAdapter";

    @NotNull
    private final HealthCheckViewModel healthCheckViewModel;

    @NotNull
    private final List<TodayHealthItem> healthItemList;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @NotNull
    private LocalDate mSelectedDate;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$KnowMoreHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "<init>", "(Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class KnowMoreHolder extends RecyclerView.d0 {
        final /* synthetic */ TodayHealthItemAdapter this$0;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KnowMoreHolder(@NotNull TodayHealthItemAdapter todayHealthItemAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = todayHealthItemAdapter;
            this.view = view;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "bind", "(I)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroid/widget/TextView;", "titleTv", "Landroid/widget/TextView;", "<init>", "(Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class TitleViewHolder extends RecyclerView.d0 {
        final /* synthetic */ TodayHealthItemAdapter this$0;

        @NotNull
        private final TextView titleTv;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleViewHolder(@NotNull TodayHealthItemAdapter todayHealthItemAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = todayHealthItemAdapter;
            this.view = view;
            View viewFindViewById = view.findViewById(eri.cj);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.titleTv = (TextView) viewFindViewById;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$0(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), c0j.common_save_success);
            return Unit.INSTANCE;
        }

        public final void bind(int position) {
            int i;
            int type = ((TodayHealthItem) this.this$0.healthItemList.get(position)).getType();
            if (type != 2) {
                i = type != 7 ? c0j.t : c0j.X4;
            } else {
                i = c0j.M4;
            }
            this.titleTv.setText(i);
            ViewExtKt.clickWithTrigger$default(this.view, 0L, new Function1() { // from class: ghp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TodayHealthItemAdapter.TitleViewHolder.bind$lambda$0((View) obj);
                }
            }, 1, null);
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B%\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000f\u0082\u0001\b\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem;", "", "type", "", "stringId", "orderId", "<init>", "(ILjava/lang/Integer;I)V", "getType", "()I", "getStringId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOrderId", "setOrderId", "(I)V", "SummaryCard", "BasicHealthTitle", "HeartRate", "BloodOxygen", "Stress", "LongSleep", "HeartHealth", "BloodHealth", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$BasicHealthTitle;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$BloodHealth;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$BloodOxygen;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$HeartHealth;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$HeartRate;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$LongSleep;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$Stress;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$SummaryCard;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TodayHealthItem {
        private int orderId;

        @Nullable
        private final Integer stringId;
        private final int type;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$BasicHealthTitle;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem;", "type", "", "orderId", "stringId", "<init>", "(IILjava/lang/Integer;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BasicHealthTitle extends TodayHealthItem {
            public BasicHealthTitle() {
                this(0, 0, null, 7, null);
            }

            public /* synthetic */ BasicHealthTitle(int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? 2 : i, (i3 & 2) != 0 ? 30 : i2, (i3 & 4) != 0 ? Integer.valueOf(c0j.M4) : num);
            }

            public BasicHealthTitle(int i, int i2, @Nullable Integer num) {
                super(i, num, i2, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$BloodHealth;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem;", "type", "", "stringId", "orderId", "<init>", "(ILjava/lang/Integer;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BloodHealth extends TodayHealthItem {
            public BloodHealth() {
                this(0, null, 0, 7, null);
            }

            public /* synthetic */ BloodHealth(int i, Integer num, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? 11 : i, (i3 & 2) != 0 ? Integer.valueOf(c0j.O4) : num, (i3 & 4) != 0 ? 80 : i2);
            }

            public BloodHealth(int i, @Nullable Integer num, int i2) {
                super(i, num, i2, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$BloodOxygen;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem;", "type", "", "stringId", "orderId", "<init>", "(ILjava/lang/Integer;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BloodOxygen extends TodayHealthItem {
            public BloodOxygen() {
                this(0, null, 0, 7, null);
            }

            public /* synthetic */ BloodOxygen(int i, Integer num, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? 5 : i, (i3 & 2) != 0 ? Integer.valueOf(c0j.N4) : num, (i3 & 4) != 0 ? 50 : i2);
            }

            public BloodOxygen(int i, @Nullable Integer num, int i2) {
                super(i, num, i2, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$HeartHealth;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem;", "type", "", "stringId", "orderId", "<init>", "(ILjava/lang/Integer;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HeartHealth extends TodayHealthItem {
            public HeartHealth() {
                this(0, null, 0, 7, null);
            }

            public /* synthetic */ HeartHealth(int i, Integer num, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? 10 : i, (i3 & 2) != 0 ? Integer.valueOf(c0j.P4) : num, (i3 & 4) != 0 ? 70 : i2);
            }

            public HeartHealth(int i, @Nullable Integer num, int i2) {
                super(i, num, i2, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$HeartRate;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem;", "type", "", "stringId", "orderId", "<init>", "(ILjava/lang/Integer;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HeartRate extends TodayHealthItem {
            public HeartRate() {
                this(0, null, 0, 7, null);
            }

            public /* synthetic */ HeartRate(int i, Integer num, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? 3 : i, (i3 & 2) != 0 ? Integer.valueOf(c0j.Q4) : num, (i3 & 4) != 0 ? 40 : i2);
            }

            public HeartRate(int i, @Nullable Integer num, int i2) {
                super(i, num, i2, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$LongSleep;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem;", "type", "", "stringId", "orderId", "<init>", "(ILjava/lang/Integer;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class LongSleep extends TodayHealthItem {
            public LongSleep() {
                this(0, null, 0, 7, null);
            }

            public /* synthetic */ LongSleep(int i, Integer num, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? 9 : i, (i3 & 2) != 0 ? Integer.valueOf(c0j.jh) : num, (i3 & 4) != 0 ? 60 : i2);
            }

            public LongSleep(int i, @Nullable Integer num, int i2) {
                super(i, num, i2, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$Stress;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem;", "type", "", "stringId", "orderId", "<init>", "(ILjava/lang/Integer;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Stress extends TodayHealthItem {
            public Stress() {
                this(0, null, 0, 7, null);
            }

            public /* synthetic */ Stress(int i, Integer num, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? 6 : i, (i3 & 2) != 0 ? Integer.valueOf(c0j.Z4) : num, (i3 & 4) != 0 ? 50 : i2);
            }

            public Stress(int i, @Nullable Integer num, int i2) {
                super(i, num, i2, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem$SummaryCard;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter$TodayHealthItem;", "type", "", "orderId", "stringId", "<init>", "(IILjava/lang/Integer;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SummaryCard extends TodayHealthItem {
            public SummaryCard() {
                this(0, 0, null, 7, null);
            }

            public /* synthetic */ SummaryCard(int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 10 : i2, (i3 & 4) != 0 ? null : num);
            }

            public SummaryCard(int i, int i2, @Nullable Integer num) {
                super(i, num, i2, null);
            }
        }

        public /* synthetic */ TodayHealthItem(int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, num, i2);
        }

        public final int getOrderId() {
            return this.orderId;
        }

        @Nullable
        public final Integer getStringId() {
            return this.stringId;
        }

        public final int getType() {
            return this.type;
        }

        public final void setOrderId(int i) {
            this.orderId = i;
        }

        private TodayHealthItem(int i, Integer num, int i2) {
            this.type = i;
            this.stringId = num;
            this.orderId = i2;
        }

        public /* synthetic */ TodayHealthItem(int i, Integer num, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, num, (i3 & 4) != 0 ? -1 : i2, null);
        }
    }

    public TodayHealthItemAdapter(@NotNull LifecycleOwner lifecycleOwner, @NotNull HealthCheckViewModel healthCheckViewModel) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(healthCheckViewModel, "healthCheckViewModel");
        this.lifecycleOwner = lifecycleOwner;
        this.healthCheckViewModel = healthCheckViewModel;
        this.healthItemList = new ArrayList();
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        this.mSelectedDate = localDateNow;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        Logger.i(TAG, "getItemCount healthItemList.size=" + this.healthItemList.size());
        return this.healthItemList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.healthItemList.get(position).getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof SummaryCardViewHolder) {
            ((SummaryCardViewHolder) holder).bindData();
            return;
        }
        if (holder instanceof HeartRateHolder) {
            ((HeartRateHolder) holder).bindData();
            return;
        }
        if (holder instanceof Spo2Holder) {
            ((Spo2Holder) holder).bindData();
            return;
        }
        if (holder instanceof StressHolder) {
            ((StressHolder) holder).bindData();
        } else if (holder instanceof LongSleepHolder) {
            ((LongSleepHolder) holder).bindData();
        } else if (holder instanceof TitleViewHolder) {
            ((TitleViewHolder) holder).bind(position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (viewType) {
            case 0:
                View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.Q2, parent, false);
                Intrinsics.checkNotNull(viewInflate);
                return new SummaryCardViewHolder(viewInflate, this.healthCheckViewModel, this.lifecycleOwner);
            case 1:
            case 4:
            case 8:
            default:
                View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(jui.Q5, parent, false);
                Intrinsics.checkNotNull(viewInflate2);
                return new TitleViewHolder(this, viewInflate2);
            case 2:
            case 7:
                View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(jui.P5, parent, false);
                Intrinsics.checkNotNull(viewInflate3);
                return new TitleViewHolder(this, viewInflate3);
            case 3:
                View viewInflate4 = LayoutInflater.from(parent.getContext()).inflate(jui.L5, parent, false);
                Intrinsics.checkNotNull(viewInflate4);
                return new HeartRateHolder(viewInflate4, this.healthCheckViewModel, this.lifecycleOwner);
            case 5:
                View viewInflate5 = LayoutInflater.from(parent.getContext()).inflate(jui.P2, parent, false);
                Intrinsics.checkNotNull(viewInflate5);
                return new Spo2Holder(viewInflate5, this.healthCheckViewModel, this.lifecycleOwner);
            case 6:
                View viewInflate6 = LayoutInflater.from(parent.getContext()).inflate(jui.O5, parent, false);
                Intrinsics.checkNotNull(viewInflate6);
                return new StressHolder(viewInflate6, this.healthCheckViewModel, this.lifecycleOwner);
            case 9:
                View viewInflate7 = LayoutInflater.from(parent.getContext()).inflate(jui.O2, parent, false);
                Intrinsics.checkNotNull(viewInflate7);
                return new LongSleepHolder(viewInflate7, this.healthCheckViewModel, this.lifecycleOwner);
            case 10:
                View viewInflate8 = LayoutInflater.from(parent.getContext()).inflate(jui.K5, parent, false);
                Intrinsics.checkNotNull(viewInflate8);
                return new HeartHealthHolder(viewInflate8, this.healthCheckViewModel, this.lifecycleOwner);
            case 11:
                View viewInflate9 = LayoutInflater.from(parent.getContext()).inflate(jui.J5, parent, false);
                Intrinsics.checkNotNull(viewInflate9);
                return new BloodPressureHealthHolder(viewInflate9, this.healthCheckViewModel, this.lifecycleOwner);
            case 12:
                View viewInflate10 = LayoutInflater.from(parent.getContext()).inflate(jui.Q5, parent, false);
                Intrinsics.checkNotNull(viewInflate10);
                return new KnowMoreHolder(this, viewInflate10);
        }
    }

    public final void refreshDate(@NotNull LocalDate selectedDate) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        this.mSelectedDate = selectedDate;
        Logger.d(TAG, "TodayHealthItemAdapter refreshDate selectedDate=" + selectedDate);
        this.healthItemList.clear();
        int i = 7;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i2 = 0;
        this.healthItemList.add(new TodayHealthItem.SummaryCard(i2, 0, null, i, defaultConstructorMarker));
        Integer num = null;
        int i3 = 0;
        this.healthItemList.add(new TodayHealthItem.HeartRate(i2, num, i3, i, defaultConstructorMarker));
        this.healthItemList.add(new TodayHealthItem.BloodOxygen(i2, num, i3, i, defaultConstructorMarker));
        this.healthItemList.add(new TodayHealthItem.Stress(i2, num, i3, i, defaultConstructorMarker));
        this.healthItemList.add(new TodayHealthItem.LongSleep(i2, num, i3, i, defaultConstructorMarker));
        if (!AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            int i4 = 7;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            int i5 = 0;
            Integer num2 = null;
            int i6 = 0;
            this.healthItemList.add(new TodayHealthItem.HeartHealth(i5, num2, i6, i4, defaultConstructorMarker2));
            this.healthItemList.add(new TodayHealthItem.BloodHealth(i5, num2, i6, i4, defaultConstructorMarker2));
        }
        notifyDataSetChanged();
    }
}
