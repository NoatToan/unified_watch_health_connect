package com.xiaomi.hm.health.ui.smartplay.customvibrate.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.lib.rainbow.ListTile;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateRepo;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateType;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateTypeRepo;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.VibrateTypeActivity;
import com.xiaomi.hm.health.ui.smartplay.logsit.LongSitLogicKt;
import com.xiaomi.hm.health.ui.smartplay.logsit.LongSitMode;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0015R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR)\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/customvibrate/ui/VibrateTypeActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "Landroidx/recyclerview/widget/RecyclerView;", "x", "Lkotlin/Lazy;", "l", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/ui/smartplay/customvibrate/model/VibrateType;", "Lkotlin/collections/ArrayList;", "y", "Ljava/util/ArrayList;", "getVibrateTypes", "()Ljava/util/ArrayList;", "vibrateTypes", "<init>", "()V", "VibrateAdapter", "VibrateHolder", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class VibrateTypeActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy recyclerView = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<VibrateType> vibrateTypes = new VibrateTypeRepo().getVibrateConfig();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/customvibrate/ui/VibrateTypeActivity$VibrateAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/ui/smartplay/customvibrate/ui/VibrateTypeActivity$VibrateHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "<init>", "(Lcom/xiaomi/hm/health/ui/smartplay/customvibrate/ui/VibrateTypeActivity;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public final class VibrateAdapter extends RecyclerView.Adapter<VibrateHolder> {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VibrateType.values().length];
                iArr[VibrateType.INCOMING_CALL.ordinal()] = 1;
                iArr[VibrateType.EVENT_REMIND.ordinal()] = 2;
                iArr[VibrateType.ALARM.ordinal()] = 3;
                iArr[VibrateType.APP_NOTIFY.ordinal()] = 4;
                iArr[VibrateType.LONG_SIT.ordinal()] = 5;
                iArr[VibrateType.SMS.ordinal()] = 6;
                iArr[VibrateType.SPORT_REACH_GOAL.ordinal()] = 7;
                iArr[VibrateType.FIND_BAND.ordinal()] = 8;
                iArr[VibrateType.TODO.ordinal()] = 9;
                iArr[VibrateType.SCHEDULE.ordinal()] = 10;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public VibrateAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(VibrateTypeActivity vibrateTypeActivity, View view) {
            VibrateListActivity.launch(vibrateTypeActivity, VibrateType.INCOMING_CALL);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(VibrateTypeActivity vibrateTypeActivity, View view) {
            VibrateListActivity.launch(vibrateTypeActivity, VibrateType.EVENT_REMIND);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(VibrateTypeActivity vibrateTypeActivity, View view) {
            VibrateListActivity.launch(vibrateTypeActivity, VibrateType.ALARM);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(VibrateTypeActivity vibrateTypeActivity, View view) {
            VibrateListActivity.launch(vibrateTypeActivity, VibrateType.APP_NOTIFY);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(VibrateTypeActivity vibrateTypeActivity, View view) {
            VibrateListActivity.launch(vibrateTypeActivity, VibrateType.LONG_SIT);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(VibrateTypeActivity vibrateTypeActivity, View view) {
            VibrateListActivity.launch(vibrateTypeActivity, VibrateType.SMS);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(VibrateTypeActivity vibrateTypeActivity, View view) {
            VibrateListActivity.launch(vibrateTypeActivity, VibrateType.SPORT_REACH_GOAL);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(VibrateTypeActivity vibrateTypeActivity, View view) {
            VibrateListActivity.launch(vibrateTypeActivity, VibrateType.FIND_BAND);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(VibrateTypeActivity vibrateTypeActivity, View view) {
            VibrateListActivity.launch(vibrateTypeActivity, VibrateType.TODO);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(VibrateTypeActivity vibrateTypeActivity, View view) {
            VibrateListActivity.launch(vibrateTypeActivity, VibrateType.SCHEDULE);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return VibrateTypeActivity.this.getVibrateTypes().size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull VibrateHolder holder, int position) {
            int i;
            int i2;
            ListTile listTile = (ListTile) holder.itemView;
            listTile.setTitle(VibrateTypeActivity.this.getVibrateTypes().get(position).toString());
            switch (WhenMappings.$EnumSwitchMapping$0[VibrateTypeActivity.this.getVibrateTypes().get(position).ordinal()]) {
                case 1:
                    listTile.setTitle(R.string.incoming_call_alert);
                    listTile.setLeading(R.drawable.incoming_call_alert_icon);
                    listTile.setTips(VibrateRepo.getInstance().getVibrateEntityName(VibrateTypeActivity.this, VibrateType.INCOMING_CALL));
                    final VibrateTypeActivity vibrateTypeActivity = VibrateTypeActivity.this;
                    listTile.setOnClickListener(new View.OnClickListener() { // from class: da8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            VibrateTypeActivity.VibrateAdapter.k(vibrateTypeActivity, view);
                        }
                    });
                    break;
                case 2:
                    listTile.setTitle(ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_EVENT_REMIND_NEW_NAME) ? R.string.schedule : R.string.event_remind_title);
                    listTile.setLeading(R.drawable.icon_event_remind);
                    listTile.setTips(VibrateRepo.getInstance().getVibrateEntityName(VibrateTypeActivity.this, VibrateType.EVENT_REMIND));
                    final VibrateTypeActivity vibrateTypeActivity2 = VibrateTypeActivity.this;
                    listTile.setOnClickListener(new View.OnClickListener() { // from class: y98
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            VibrateTypeActivity.VibrateAdapter.l(vibrateTypeActivity2, view);
                        }
                    });
                    break;
                case 3:
                    listTile.setTitle(HMDeviceConfig.hasBoundWatch() ? R.string.chaohu_alarm : R.string.mi_band_alarm);
                    listTile.setLeading(R.drawable.mi_band_alarm_icon);
                    listTile.setTips(VibrateRepo.getInstance().getVibrateEntityName(VibrateTypeActivity.this, VibrateType.ALARM));
                    final VibrateTypeActivity vibrateTypeActivity3 = VibrateTypeActivity.this;
                    listTile.setOnClickListener(new View.OnClickListener() { // from class: z98
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            VibrateTypeActivity.VibrateAdapter.m(vibrateTypeActivity3, view);
                        }
                    });
                    break;
                case 4:
                    listTile.setTitle(R.string.app_notification_alert);
                    listTile.setLeading(R.drawable.app_notification_alert_icon);
                    listTile.setTips(VibrateRepo.getInstance().getVibrateEntityName(VibrateTypeActivity.this, VibrateType.APP_NOTIFY));
                    final VibrateTypeActivity vibrateTypeActivity4 = VibrateTypeActivity.this;
                    listTile.setOnClickListener(new View.OnClickListener() { // from class: ca8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            VibrateTypeActivity.VibrateAdapter.n(vibrateTypeActivity4, view);
                        }
                    });
                    break;
                case 5:
                    LongSitMode longSitMode$default = LongSitLogicKt.getLongSitMode$default(null, 1, null);
                    if (longSitMode$default.isStandAlert() || longSitMode$default.isFakeStandAlert()) {
                        i = R.string.stand_alert;
                        i2 = R.drawable.icon_stand_alert;
                    } else {
                        i = R.string.long_sit_alert;
                        i2 = R.drawable.long_sit_alert_icon;
                    }
                    listTile.setTitle(i);
                    listTile.setLeading(i2);
                    listTile.setTips(VibrateRepo.getInstance().getVibrateEntityName(VibrateTypeActivity.this, VibrateType.LONG_SIT));
                    final VibrateTypeActivity vibrateTypeActivity5 = VibrateTypeActivity.this;
                    listTile.setOnClickListener(new View.OnClickListener() { // from class: w98
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            VibrateTypeActivity.VibrateAdapter.o(vibrateTypeActivity5, view);
                        }
                    });
                    break;
                case 6:
                    listTile.setTitle(R.string.sm_alert);
                    listTile.setLeading(R.drawable.sm_alert_icon);
                    listTile.setTips(VibrateRepo.getInstance().getVibrateEntityName(VibrateTypeActivity.this, VibrateType.SMS));
                    final VibrateTypeActivity vibrateTypeActivity6 = VibrateTypeActivity.this;
                    listTile.setOnClickListener(new View.OnClickListener() { // from class: aa8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            VibrateTypeActivity.VibrateAdapter.p(vibrateTypeActivity6, view);
                        }
                    });
                    break;
                case 7:
                    listTile.setTitle(R.string.reach_goal);
                    listTile.setLeading(R.drawable.reach_goal_alert_icon);
                    listTile.setTips(VibrateRepo.getInstance().getVibrateEntityName(VibrateTypeActivity.this, VibrateType.SPORT_REACH_GOAL));
                    final VibrateTypeActivity vibrateTypeActivity7 = VibrateTypeActivity.this;
                    listTile.setOnClickListener(new View.OnClickListener() { // from class: x98
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            VibrateTypeActivity.VibrateAdapter.q(vibrateTypeActivity7, view);
                        }
                    });
                    break;
                case 8:
                    listTile.setTitle(R.string.mili_setting_find_bracelet);
                    listTile.setLeading(R.drawable.icon_find_band);
                    listTile.setTips(VibrateRepo.getInstance().getVibrateEntityName(VibrateTypeActivity.this, VibrateType.FIND_BAND));
                    final VibrateTypeActivity vibrateTypeActivity8 = VibrateTypeActivity.this;
                    listTile.setOnClickListener(new View.OnClickListener() { // from class: u98
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            VibrateTypeActivity.VibrateAdapter.r(vibrateTypeActivity8, view);
                        }
                    });
                    break;
                case 9:
                    listTile.setTitle(R.string.device_todo);
                    listTile.setLeading(R.drawable.icon_todo);
                    listTile.setTips(VibrateRepo.getInstance().getVibrateEntityName(VibrateTypeActivity.this, VibrateType.TODO));
                    final VibrateTypeActivity vibrateTypeActivity9 = VibrateTypeActivity.this;
                    listTile.setOnClickListener(new View.OnClickListener() { // from class: ba8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            VibrateTypeActivity.VibrateAdapter.s(vibrateTypeActivity9, view);
                        }
                    });
                    break;
                case 10:
                    listTile.setTitle(R.string.app_sort_schedule);
                    listTile.setLeading(R.drawable.icon_schedule_90);
                    listTile.setTips(VibrateRepo.getInstance().getVibrateEntityName(VibrateTypeActivity.this, VibrateType.SCHEDULE));
                    final VibrateTypeActivity vibrateTypeActivity10 = VibrateTypeActivity.this;
                    listTile.setOnClickListener(new View.OnClickListener() { // from class: v98
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            VibrateTypeActivity.VibrateAdapter.t(vibrateTypeActivity10, view);
                        }
                    });
                    break;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public VibrateHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            return new VibrateHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_vibrate_item, parent, false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/customvibrate/ui/VibrateTypeActivity$VibrateHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class VibrateHolder extends RecyclerView.ViewHolder {
        public VibrateHolder(@NotNull View view) {
            super(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<RecyclerView> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclerView getA() {
            return (RecyclerView) VibrateTypeActivity.this.findViewById(R.id.vibrate_type_list);
        }
    }

    private final RecyclerView l() {
        return (RecyclerView) this.recyclerView.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final ArrayList<VibrateType> getVibrateTypes() {
        return this.vibrateTypes;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrate_type);
        UnifyTitleBarStyle.setUnifyTitleStyle$default(this, getString(R.string.custom_vibrate_mode), null, 2, null);
        l().setLayoutManager(new LinearLayoutManager(this));
        l().setAdapter(new VibrateAdapter());
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    @SuppressLint({"NotifyDataSetChanged"})
    public void onResume() {
        super.onResume();
        RecyclerView.Adapter adapter = l().getAdapter();
        if (adapter == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }
}
