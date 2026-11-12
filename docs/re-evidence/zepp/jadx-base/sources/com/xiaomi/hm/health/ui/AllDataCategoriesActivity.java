package com.xiaomi.hm.health.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chenenyu.router.Router;
import com.chenenyu.router.annotation.Route;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.pai.ui.uicase.PaiDetailActivity;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.step.ui.StepInfoActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.firstbeat.SportLoadActivity;
import com.huami.watch.companion.firstbeat.VO2maxActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.adapter.BaseRecyclerAdapter;
import com.xiaomi.hm.health.adapter.MyViewHolder;
import com.xiaomi.hm.health.baseui.GlobalTitleStyle;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.di.koin.spo2.Spo2Proxy;
import com.xiaomi.hm.health.di.koin.util.FemaleCheckUtil;
import com.xiaomi.hm.health.eventbus.EventDetailBack;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.dto.StressDataType;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.utils.TempUtils;
import com.xiaomi.hm.health.healthdata.utils.HealthDataNavigator;
import com.xiaomi.hm.health.heartrate.HeartRateHelperKt;
import com.xiaomi.hm.health.manager.RunningManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.running.calori.CaloriActivity;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import com.xiaomi.hm.health.utils.AppRateDialogHelper;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Route({RouterHelper.ALL_DATA_PATH})
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0004\u001f !\"B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0014J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013R#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/ui/AllDataCategoriesActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "u", com.google.android.exoplayer2.text.ttml.b.r, "t", "r", SOAP.XMLNS, DTransferConstants.SEARCH_KEY, GoogleApiAvailabilityLight.b, "o", "Landroidx/recyclerview/widget/RecyclerView;", "m", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "Lcom/xiaomi/hm/health/eventbus/EventDetailBack;", "event", "onEventMainThread", "", "Lcom/xiaomi/hm/health/ui/AllDataCategoriesActivity$Group;", "x", "Lkotlin/Lazy;", "l", "()Ljava/util/List;", "allData", "<init>", "()V", "Group", "GroupAdapter", "Item", "ItemAdapter", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AllDataCategoriesActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy allData = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/ui/AllDataCategoriesActivity$Group;", "", "", "component1", "", "Lcom/xiaomi/hm/health/ui/AllDataCategoriesActivity$Item;", "component2", "name", "items", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Group {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final List<Item> items;

        public Group(@NotNull String str, @NotNull List<Item> list) {
            this.name = str;
            this.items = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Group copy$default(Group group, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = group.name;
            }
            if ((i & 2) != 0) {
                list = group.items;
            }
            return group.copy(str, list);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final List<Item> component2() {
            return this.items;
        }

        @NotNull
        public final Group copy(@NotNull String name, @NotNull List<Item> items) {
            return new Group(name, items);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Group)) {
                return false;
            }
            Group group = (Group) other;
            return Intrinsics.areEqual(this.name, group.name) && Intrinsics.areEqual(this.items, group.items);
        }

        @NotNull
        public final List<Item> getItems() {
            return this.items;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.items.hashCode();
        }

        @NotNull
        public String toString() {
            return "Group(name=" + this.name + ", items=" + this.items + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/ui/AllDataCategoriesActivity$GroupAdapter;", "Lcom/xiaomi/hm/health/adapter/BaseRecyclerAdapter;", "Lcom/xiaomi/hm/health/ui/AllDataCategoriesActivity$Group;", "Lcom/xiaomi/hm/health/adapter/MyViewHolder;", "holder", "group", "", "position", "", "onBindViewHolder", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class GroupAdapter extends BaseRecyclerAdapter<Group> {
        public GroupAdapter() {
            super(R.layout.item_all_data_category);
        }

        @Override // com.xiaomi.hm.health.adapter.BaseRecyclerAdapter
        public void onBindViewHolder(@NotNull MyViewHolder holder, @NotNull Group group, int position) {
            ((TextView) holder.getView(R.id.tv_group_name)).setText(group.getName());
            RecyclerView recyclerView = (RecyclerView) holder.getView(R.id.rv_items);
            if (recyclerView.getAdapter() == null) {
                recyclerView.setAdapter(new ItemAdapter());
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            BaseRecyclerAdapter baseRecyclerAdapter = adapter instanceof BaseRecyclerAdapter ? (BaseRecyclerAdapter) adapter : null;
            if (baseRecyclerAdapter == null) {
                return;
            }
            baseRecyclerAdapter.update(group.getItems());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J$\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/ui/AllDataCategoriesActivity$ItemAdapter;", "Lcom/xiaomi/hm/health/adapter/BaseRecyclerAdapter;", "Lcom/xiaomi/hm/health/ui/AllDataCategoriesActivity$Item;", "Lcom/xiaomi/hm/health/adapter/MyViewHolder;", "holder", "item", "", "position", "", "onBindViewHolder", "Landroid/view/View;", "itemView", "onItemClicked", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class ItemAdapter extends BaseRecyclerAdapter<Item> {
        public ItemAdapter() {
            super(R.layout.item_all_data_category_item);
        }

        @Override // com.xiaomi.hm.health.adapter.BaseRecyclerAdapter
        public void onBindViewHolder(@NotNull MyViewHolder holder, @NotNull Item item, int position) {
            ((TextView) holder.getView(R.id.tv_item_name)).setText(item.getName());
            ImageView imageView = (ImageView) holder.getView(R.id.ic_item_icon);
            imageView.setImageResource(item.getIconRes());
            imageView.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(imageView.getContext(), item.getIconTint())));
        }

        @Override // com.xiaomi.hm.health.adapter.BaseRecyclerAdapter
        public void onItemClicked(@Nullable View itemView, int position, @Nullable Item item) {
            if (item == null) {
                return;
            }
            item.getAction().getA();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/ui/AllDataCategoriesActivity$Group;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<? extends Group>> {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.AllDataCategoriesActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C1022a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1022a(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AllDataCategoriesActivity allDataCategoriesActivity = this.a;
                allDataCategoriesActivity.p(allDataCategoriesActivity);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_FEMALE_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AllDataCategoriesActivity allDataCategoriesActivity = this.a;
                allDataCategoriesActivity.t(allDataCategoriesActivity);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_VO2MAX_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AllDataCategoriesActivity allDataCategoriesActivity = this.a;
                allDataCategoriesActivity.s(allDataCategoriesActivity);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_EXERCISE_CAPACITY_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AllDataCategoriesActivity allDataCategoriesActivity = this.a;
                allDataCategoriesActivity.o(allDataCategoriesActivity);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_ECG_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Spo2Proxy.INSTANCE.navigateToDetailActivity(this.a);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_SPO2_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HealthDataNavigator.INSTANCE.navigateToHealthDataDetail(this.a, HealthDataType.BLOOD_SUGAR);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_BLOOD_GLUCOSE_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HealthDataNavigator.INSTANCE.goToBloodPressure(this.a);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_BLOOD_PRESSURE_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TempUtils.INSTANCE.launchToDetail(this.a);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_BODY_TEMPERATURE_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HealthDataNavigator.INSTANCE.navigateToHealthDataDetail(this.a, HealthDataType.CHEST);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_CHEST_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HealthDataNavigator.INSTANCE.navigateToHealthDataDetail(this.a, HealthDataType.WAIST);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_WAIST_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AllDataCategoriesActivity allDataCategoriesActivity = this.a;
                allDataCategoriesActivity.startActivity(StepInfoActivity.Companion.launchStepDetail$default(StepInfoActivity.INSTANCE, allDataCategoriesActivity, "", 0, 4, null));
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_STEPS_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class l extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HealthDataNavigator.INSTANCE.navigateToHealthDataDetail(this.a, HealthDataType.HIP);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_HIP_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class m extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HealthDataNavigator.INSTANCE.navigateToHealthDataDetail(this.a, HealthDataType.ARM);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_ARM_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class n extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HealthDataNavigator.INSTANCE.navigateToHealthDataDetail(this.a, HealthDataType.THIGH);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_THIGH_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class o extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HealthDataNavigator.INSTANCE.navigateToHealthDataDetail(this.a, HealthDataType.CALF);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_CALF_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class p extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CaloriActivity.INSTANCE.start(this.a);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_CALORIES_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class q extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AllDataCategoriesActivity allDataCategoriesActivity = this.a;
                allDataCategoriesActivity.r(allDataCategoriesActivity);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_PAI_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class r extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public r(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                RunningManager.startRunningRecord(this.a, HistoryRecordManager.getInstance().queryLatestExerciseHistory(), new int[0]);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_EXERCISE_RECORD_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class s extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public s(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SleepHomeActivity.INSTANCE.launch(this.a, HMPersonInfo.getInstance().getUserInfo().getUserid(), null);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_SLEEP_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class t extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public t(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AllDataCategoriesActivity allDataCategoriesActivity = this.a;
                allDataCategoriesActivity.q(allDataCategoriesActivity);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_HEARTRATE_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class u extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public u(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HealthDataNavigator.INSTANCE.navigateToDataDetail(this.a, StressDataType.ALL_DAY);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_STRESS_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class v extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public v(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AllDataCategoriesActivity allDataCategoriesActivity = this.a;
                allDataCategoriesActivity.u(allDataCategoriesActivity);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_WEIGHT_C, null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class w extends Lambda implements Function0<Unit> {
            public final /* synthetic */ AllDataCategoriesActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public w(AllDataCategoriesActivity allDataCategoriesActivity) {
                super(0);
                this.a = allDataCategoriesActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AllDataCategoriesActivity allDataCategoriesActivity = this.a;
                allDataCategoriesActivity.n(allDataCategoriesActivity);
                AllDataAnalytics.recordEvent$default(AllDataAnalytics.EventId.ALL_DATA_PAGE_BODYSCORE_C, null, 2, null);
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<? extends Group> getA() {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Group[]{new Group(AllDataCategoriesActivity.this.getString(R.string.data_category_sport_data), CollectionsKt__CollectionsKt.listOf((Object[]) new Item[]{new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_step), R.drawable.ic_steps_24, R.color.s30, new k(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_calories), R.drawable.ic_calories_24, R.color.p3, new p(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.card_pai), R.drawable.ic_pai_24, R.color.s25, new q(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_sport_record), R.drawable.ic_activities_24, R.color.s15, new r(AllDataCategoriesActivity.this))})), new Group(AllDataCategoriesActivity.this.getString(R.string.data_category_status_data), CollectionsKt__CollectionsKt.listOf((Object[]) new Item[]{new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_sleep), R.drawable.ic_monitor_snoring_24, R.color.s25, new s(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_heart_rate), R.drawable.ic_heart_rate_24, R.color.p3, new t(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.stress), R.drawable.ic_stress_24, R.color.s20, new u(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_weight), R.drawable.ic_weight_24, R.color.s20, new v(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.card_intro_body_sorce_title), R.drawable.ic_body_score_24, R.color.s20, new w(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.fh_female_health), R.drawable.ic_women_s_health_24, R.color.p3, new C1022a(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_vo2max), R.drawable.ic_vo2_24, R.color.s15, new b(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_sport_load), R.drawable.ic_training_load_24, R.color.s25, new c(AllDataCategoriesActivity.this))})), new Group(AllDataCategoriesActivity.this.getString(R.string.data_category_health_signs), CollectionsKt__CollectionsKt.listOf((Object[]) new Item[]{new Item(AllDataCategoriesActivity.this.getString(R.string.ecg_simple), R.drawable.ic_ecg_24, R.color.p3, new d(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.bo_ui_spo2_name), R.drawable.ic_spo2_24, R.color.p3, new e(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_blood_sugar), R.drawable.ic_blood_glucose_24, R.color.p3, new f(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_blood_pressure), R.drawable.ic_blood_pressure_24, R.color.p3, new g(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_temperature), R.drawable.ic_body_temperature_24, R.color.s25, new h(AllDataCategoriesActivity.this))})), new Group(AllDataCategoriesActivity.this.getString(R.string.data_category_body_dimension), CollectionsKt__CollectionsKt.listOf((Object[]) new Item[]{new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_chest), R.drawable.ic_chest_c_24, R.color.s15, new i(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_waist), R.drawable.ic_waist_c_24, R.color.p3, new j(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_hip), R.drawable.ic_hip_c_24, R.color.s20, new l(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_arm), R.drawable.ic_arm_c_24, R.color.s25, new m(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_thigh), R.drawable.ic_thigh_c_24, R.color.s20, new n(AllDataCategoriesActivity.this)), new Item(AllDataCategoriesActivity.this.getString(R.string.health_data_calf), R.drawable.ic_calf_c_24, R.color.s15, new o(AllDataCategoriesActivity.this))}))});
        }
    }

    private final List<Group> l() {
        return (List) this.allData.getValue();
    }

    private final RecyclerView m() {
        RecyclerView recyclerView = new RecyclerView(this);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.size_10dp);
        recyclerView.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        GroupAdapter groupAdapter = new GroupAdapter();
        recyclerView.setAdapter(groupAdapter);
        groupAdapter.update(l());
        recyclerView.setItemAnimator(null);
        recyclerView.setDescendantFocusability(393216);
        recyclerView.setOverScrollMode(2);
        return recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(Context context) {
        Router.build(RouterHelper.BODY_SCORE_PATH).go(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(Context context) {
        Router.build(RouterHelper.ECG_PATH).go(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Context context) {
        FemaleMifitViewModel femaleViewModel = FemaleCheckUtil.INSTANCE.getFemaleViewModel();
        if (femaleViewModel == null) {
            return;
        }
        FemaleMifitViewModel.jumpToFemaleHealth$default(femaleViewModel, context, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(Context context) {
        HeartRateHelperKt.launchHeartRate(context);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.SPORT_LIST_C).addExtra("tp", "heart_rate").addExtra("fr", "status_card").addExtra("source", String.valueOf(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI).getValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(Context context) {
        PaiDetailActivity.INSTANCE.startHMPai(context);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.SPORT_LIST_C).addExtra("tp", "pai").addExtra("fr", "status_card").addExtra("source", String.valueOf(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI).getValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Context context) {
        context.startActivity(new Intent(context, (Class<?>) SportLoadActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(Context context) {
        context.startActivity(new Intent(context, (Class<?>) VO2maxActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(Context context) {
        Router.build(RouterHelper.WEIGHT_PATH).go(context);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.SPORT_LIST_C).addExtra("tp", "weight").addExtra("fr", "status_card").addExtra("source", String.valueOf(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.WEIGHT).getValue())));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(m());
        GlobalTitleStyle.setUnifyTitleStyle$default(this, getString(R.string.data_category_all_data), null, 2, null);
        EventBus.getDefault().register(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull EventDetailBack event) {
        if (event.getStatus() == 1) {
            AppRateDialogHelper.showWhenStart(this);
        } else if (event.getStatus() == EventDetailBack.SPORT || event.getStatus() == EventDetailBack.HEART_RATE) {
            AppRateDialogHelper.showWhenActivityStart(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/ui/AllDataCategoriesActivity$Item;", "", "", "component1", "", "component2", "component3", "Lkotlin/Function0;", "", "component4", "name", "iconRes", "iconTint", "action", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", LogUtil.I, "getIconRes", "()I", "c", "getIconTint", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function0;", "getAction", "()Lkotlin/jvm/functions/Function0;", "<init>", "(Ljava/lang/String;IILkotlin/jvm/functions/Function0;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Item {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int iconRes;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final int iconTint;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        private final Function0<Unit> action;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public Item(@NotNull String str, @DrawableRes int i, @ColorRes int i2, @NotNull Function0<Unit> function0) {
            this.name = str;
            this.iconRes = i;
            this.iconTint = i2;
            this.action = function0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Item copy$default(Item item, String str, int i, int i2, Function0 function0, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = item.name;
            }
            if ((i3 & 2) != 0) {
                i = item.iconRes;
            }
            if ((i3 & 4) != 0) {
                i2 = item.iconTint;
            }
            if ((i3 & 8) != 0) {
                function0 = item.action;
            }
            return item.copy(str, i, i2, function0);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getIconRes() {
            return this.iconRes;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getIconTint() {
            return this.iconTint;
        }

        @NotNull
        public final Function0<Unit> component4() {
            return this.action;
        }

        @NotNull
        public final Item copy(@NotNull String name, @DrawableRes int iconRes, @ColorRes int iconTint, @NotNull Function0<Unit> action) {
            return new Item(name, iconRes, iconTint, action);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.name, item.name) && this.iconRes == item.iconRes && this.iconTint == item.iconTint && Intrinsics.areEqual(this.action, item.action);
        }

        @NotNull
        public final Function0<Unit> getAction() {
            return this.action;
        }

        public final int getIconRes() {
            return this.iconRes;
        }

        public final int getIconTint() {
            return this.iconTint;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.iconRes) * 31) + this.iconTint) * 31) + this.action.hashCode();
        }

        @NotNull
        public String toString() {
            return "Item(name=" + this.name + ", iconRes=" + this.iconRes + ", iconTint=" + this.iconTint + ", action=" + this.action + ")";
        }

        public /* synthetic */ Item(String str, int i, int i2, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i3 & 8) != 0 ? a.a : function0);
        }
    }
}
