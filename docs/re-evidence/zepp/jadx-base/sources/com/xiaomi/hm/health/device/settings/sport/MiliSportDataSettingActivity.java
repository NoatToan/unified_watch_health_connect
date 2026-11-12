package com.xiaomi.hm.health.device.settings.sport;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.Loading;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.devicex.R;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.ui.activity.SportItemSortActivity;
import com.loc.z;
import com.xiaomi.hm.health.bt.profile.sport.SportItemData;
import com.xiaomi.hm.health.bt.profile.sport.SportItemDataConfig;
import com.xiaomi.hm.health.training.ui.activity.TrainingHistoryActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig;", "sportTypeConfig", "", "l", "initViews", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/device/settings/sport/SportDataViewModel;", "x", "Lcom/xiaomi/hm/health/device/settings/sport/SportDataViewModel;", "sportDataViewModel", "", "y", LogUtil.I, "sportType", "Landroidx/recyclerview/widget/ItemTouchHelper;", "z", "Landroidx/recyclerview/widget/ItemTouchHelper;", "touchHelper", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "<init>", "()V", "Companion", "SportDataItemAdapter", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MiliSportDataSettingActivity extends BaseTitleActivity {
    private static final int B = 0;

    @NotNull
    public static final String EXTRA_SPORT_NAME = "extra_sport_name";

    @NotNull
    public static final String EXTRA_SPORT_TYPE = "extra_sport_type";

    @NotNull
    public static final String TAG = "MiliSportDataSettingActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private SportDataViewModel sportDataViewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private int sportType = -1;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private ItemTouchHelper touchHelper;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int C = 1;
    private static final int D = 2;
    private static final int E = 3;
    private static final int F = 4;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001c\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001c\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0016\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity$Companion;", "", "Landroid/content/Context;", "ctx", "", "sportType", "", SportItemSortActivity.KEY_SPORT_NAME, "", WebConstant.QueryParam.LAUNCH, "TYPE_SORTED_TITLE", LogUtil.I, "getTYPE_SORTED_TITLE", "()I", "TYPE_SORTED_ITEM", "getTYPE_SORTED_ITEM", "TYPE_CLOSED_TITLE", "getTYPE_CLOSED_TITLE", "TYPE_CLOSED_ITEM", "getTYPE_CLOSED_ITEM", "TYPE_DATA_CATEGORY", "getTYPE_DATA_CATEGORY", "EXTRA_SPORT_NAME", "Ljava/lang/String;", TrainingHistoryActivity.EXTRA_SPORT_TYPE, "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getTYPE_CLOSED_ITEM() {
            return MiliSportDataSettingActivity.E;
        }

        public final int getTYPE_CLOSED_TITLE() {
            return MiliSportDataSettingActivity.D;
        }

        public final int getTYPE_DATA_CATEGORY() {
            return MiliSportDataSettingActivity.F;
        }

        public final int getTYPE_SORTED_ITEM() {
            return MiliSportDataSettingActivity.C;
        }

        public final int getTYPE_SORTED_TITLE() {
            return MiliSportDataSettingActivity.B;
        }

        public final void launch(@NotNull Context ctx, int sportType, @NotNull String sportName) {
            Intent intent = new Intent(ctx, (Class<?>) MiliSportDataSettingActivity.class);
            intent.putExtra(MiliSportDataSettingActivity.EXTRA_SPORT_TYPE, sportType);
            intent.putExtra(MiliSportDataSettingActivity.EXTRA_SPORT_NAME, sportName);
            ctx.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004 !\"#B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0014\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0016\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0006\u0010\u0014\u001a\u00020\nJ\b\u0010\u0015\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0006\u0010\u0017\u001a\u00020\u0005R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity$SportDataItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "onCreateViewHolder", "viewHolder", "position", "", "onBindViewHolder", "", "Lcom/xiaomi/hm/health/device/settings/sport/SportDataItem;", "list", "e", "from", "to", "m", "f", z.j, "getItemCount", "getItemViewType", "l", "", "a", "Ljava/util/List;", "", "b", "allItems", "<init>", "(Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity;)V", "ClosedInfoViewHolder", "ClosedTitleViewHolder", "SortedInfoViewHolder", "SortedTitleViewHolder", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class SportDataItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private List<SportDataItem> list = new ArrayList();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final List<Object> allItems = new ArrayList();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\n0\u0001R\u00060\u0002R\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity$SportDataItemAdapter$ClosedInfoViewHolder;", "Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity$SportDataItemAdapter$SortedInfoViewHolder;", "Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity$SportDataItemAdapter;", "Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity$SportDataItemAdapter;Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public final class ClosedInfoViewHolder extends SortedInfoViewHolder {
            public ClosedInfoViewHolder(View view) {
                super(view);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\n0\u0001R\u00060\u0002R\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity$SportDataItemAdapter$ClosedTitleViewHolder;", "Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity$SportDataItemAdapter$SortedTitleViewHolder;", "Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity$SportDataItemAdapter;", "Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity$SportDataItemAdapter;Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public final class ClosedTitleViewHolder extends SortedTitleViewHolder {
            public ClosedTitleViewHolder(View view) {
                super(view);
                getTitleText().setText(R.string.more_sport_item);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0090\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity$SportDataItemAdapter$SortedInfoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getNameText", "()Landroid/widget/TextView;", "setNameText", "(Landroid/widget/TextView;)V", "nameText", "Landroid/widget/Switch;", "b", "Landroid/widget/Switch;", "getItemSwitch", "()Landroid/widget/Switch;", "setItemSwitch", "(Landroid/widget/Switch;)V", "itemSwitch", "Landroid/view/View;", "c", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "rootView", "itemView", "<init>", "(Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity$SportDataItemAdapter;Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public class SortedInfoViewHolder extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private TextView nameText;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private Switch itemSwitch;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            private View rootView;

            public SortedInfoViewHolder(View view) {
                super(view);
                this.nameText = (TextView) view.findViewById(com.huami.watch.companion.R.id.text);
                this.itemSwitch = (Switch) view.findViewById(com.huami.watch.companion.R.id.item_switch);
                this.rootView = view.findViewById(com.huami.watch.companion.R.id.sport_item);
            }

            @NotNull
            public final Switch getItemSwitch() {
                return this.itemSwitch;
            }

            @NotNull
            public final TextView getNameText() {
                return this.nameText;
            }

            @NotNull
            public final View getRootView() {
                return this.rootView;
            }

            public final void setItemSwitch(@NotNull Switch r1) {
                this.itemSwitch = r1;
            }

            public final void setNameText(@NotNull TextView textView) {
                this.nameText = textView;
            }

            public final void setRootView(@NotNull View view) {
                this.rootView = view;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0090\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity$SportDataItemAdapter$SortedTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getTitleText", "()Landroid/widget/TextView;", "setTitleText", "(Landroid/widget/TextView;)V", "titleText", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity$SportDataItemAdapter;Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public class SortedTitleViewHolder extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private TextView titleText;

            public SortedTitleViewHolder(View view) {
                super(view);
                this.titleText = (TextView) view.findViewById(R.id.title);
                this.titleText.setText(MiliSportDataSettingActivity.this.getResources().getString(R.string.sport_sort_drag_tip, SportConfigUtils.INSTANCE.getNameByType(MiliSportDataSettingActivity.this.sportType, MiliSportDataSettingActivity.this)));
            }

            @NotNull
            public final TextView getTitleText() {
                return this.titleText;
            }

            public final void setTitleText(@NotNull TextView textView) {
                this.titleText = textView;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ SportDataItem c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, int i2, SportDataItem sportDataItem) {
                super(0);
                this.a = i;
                this.b = i2;
                this.c = sportDataItem;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Closed current position:" + this.a + ", current index:" + this.b + ", item:" + this.c;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ SportDataItem c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i, int i2, SportDataItem sportDataItem) {
                super(0);
                this.a = i;
                this.b = i2;
                this.c = sportDataItem;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Open current position:" + this.a + ", current index:" + this.b + ", item:" + this.c;
            }
        }

        public SportDataItemAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(SportDataItem sportDataItem, SportDataItemAdapter sportDataItemAdapter, MiliSportDataSettingActivity miliSportDataSettingActivity, int i, int i2, CompoundButton compoundButton, boolean z) {
            HMLog.info(MiliSportDataSettingActivity.TAG, new a(i, i2, sportDataItem));
            if (z) {
                sportDataItem.open();
                sportDataItemAdapter.j();
                sportDataItemAdapter.notifyDataSetChanged();
                SportDataViewModel sportDataViewModel = miliSportDataSettingActivity.sportDataViewModel;
                Objects.requireNonNull(sportDataViewModel);
                int i3 = miliSportDataSettingActivity.sportType;
                List<SportDataItem> listF = sportDataItemAdapter.f();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listF, 10));
                for (SportDataItem sportDataItem2 : listF) {
                    arrayList.add(new SportItemData(sportDataItem2.getType(), sportDataItem2.getStatus()));
                }
                sportDataViewModel.setSportTypeSort(new SportItemDataConfig(i3, arrayList));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean h(MiliSportDataSettingActivity miliSportDataSettingActivity, RecyclerView.ViewHolder viewHolder, View view) {
            ItemTouchHelper itemTouchHelper = miliSportDataSettingActivity.touchHelper;
            Objects.requireNonNull(itemTouchHelper);
            itemTouchHelper.startDrag(viewHolder);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(SportDataItem sportDataItem, SportDataItemAdapter sportDataItemAdapter, MiliSportDataSettingActivity miliSportDataSettingActivity, int i, int i2, CompoundButton compoundButton, boolean z) {
            HMLog.info(MiliSportDataSettingActivity.TAG, new b(i, i2, sportDataItem));
            if (z) {
                return;
            }
            sportDataItem.hidden();
            sportDataItemAdapter.j();
            sportDataItemAdapter.notifyDataSetChanged();
            SportDataViewModel sportDataViewModel = miliSportDataSettingActivity.sportDataViewModel;
            Objects.requireNonNull(sportDataViewModel);
            int i3 = miliSportDataSettingActivity.sportType;
            List<SportDataItem> listF = sportDataItemAdapter.f();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listF, 10));
            for (SportDataItem sportDataItem2 : listF) {
                arrayList.add(new SportItemData(sportDataItem2.getType(), sportDataItem2.getStatus()));
            }
            sportDataViewModel.setSportTypeSort(new SportItemDataConfig(i3, arrayList));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int k(SportDataItem sportDataItem, SportDataItem sportDataItem2) {
            if (sportDataItem.getStatus() == sportDataItem2.getStatus() || sportDataItem.getStatus() + sportDataItem2.getStatus() == 5) {
                return 0;
            }
            return sportDataItem2.getStatus() - sportDataItem.getStatus();
        }

        public final void e(@NotNull List<SportDataItem> list) {
            this.list = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
            j();
            notifyDataSetChanged();
        }

        @NotNull
        public final List<SportDataItem> f() {
            return CollectionsKt___CollectionsKt.toList(this.list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            if (this.list.isEmpty()) {
                return 0;
            }
            return this.allItems.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            Object obj = this.allItems.get(position);
            if (obj instanceof Integer) {
                return position == 0 ? MiliSportDataSettingActivity.INSTANCE.getTYPE_SORTED_TITLE() : MiliSportDataSettingActivity.INSTANCE.getTYPE_CLOSED_TITLE();
            }
            if (obj instanceof SportDataItem) {
                return ((SportDataItem) obj).isOpen() ? MiliSportDataSettingActivity.INSTANCE.getTYPE_SORTED_ITEM() : MiliSportDataSettingActivity.INSTANCE.getTYPE_CLOSED_ITEM();
            }
            return obj instanceof SportConfigUtils.SportDataCategory ? MiliSportDataSettingActivity.INSTANCE.getTYPE_DATA_CATEGORY() : MiliSportDataSettingActivity.INSTANCE.getTYPE_CLOSED_ITEM();
        }

        public final void j() {
            kotlin.collections.g.sortWith(this.list, new Comparator() { // from class: com.xiaomi.hm.health.device.settings.sport.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return MiliSportDataSettingActivity.SportDataItemAdapter.k((SportDataItem) obj, (SportDataItem) obj2);
                }
            });
            List<SportDataItem> list = this.list;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                SportDataItem sportDataItem = (SportDataItem) next;
                if (sportDataItem.getStatus() == 2 || sportDataItem.getStatus() == 3) {
                    arrayList.add(next);
                }
            }
            List<SportDataItem> list2 = this.list;
            ArrayList<SportDataItem> arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (((SportDataItem) obj).getStatus() == 1) {
                    arrayList2.add(obj);
                }
            }
            this.allItems.clear();
            this.allItems.add(Integer.valueOf(R.string.sport_sort_drag_tip));
            this.allItems.addAll(arrayList);
            this.allItems.add(Integer.valueOf(R.string.more_sport_item));
            ArrayList arrayList3 = new ArrayList();
            for (SportConfigUtils.SportDataCategory sportDataCategory : SportConfigUtils.SportDataCategory.values()) {
                arrayList3.clear();
                for (Integer num : sportDataCategory.getDataTypes()) {
                    int iIntValue = num.intValue();
                    for (SportDataItem sportDataItem2 : arrayList2) {
                        if (sportDataItem2.getType() == iIntValue) {
                            arrayList3.add(sportDataItem2);
                        }
                    }
                }
                if (!arrayList3.isEmpty()) {
                    this.allItems.add(sportDataCategory);
                    this.allItems.addAll(arrayList3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (!this.allItems.contains((SportDataItem) obj2)) {
                    arrayList4.add(obj2);
                }
            }
            if (!arrayList4.isEmpty()) {
                this.allItems.add(SportConfigUtils.SportDataCategory.OTHER);
                this.allItems.addAll(arrayList4);
            }
        }

        public final int l() {
            List<SportDataItem> list = this.list;
            if ((list instanceof Collection) && list.isEmpty()) {
                return 0;
            }
            Iterator<T> it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if ((((SportDataItem) it2.next()).getStatus() != 1) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
            return i;
        }

        public final void m(int from, int to) {
            SportDataItem sportDataItem = this.list.get(to);
            List<SportDataItem> list = this.list;
            list.set(to, list.get(from));
            this.list.set(from, sportDataItem);
            Collections.swap(this.allItems, from + 1, to + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull final RecyclerView.ViewHolder viewHolder, final int position) {
            Object obj = this.allItems.get(position);
            if (viewHolder instanceof ClosedInfoViewHolder) {
                final int i = position <= l() ? position - 1 : position - 2;
                final SportDataItem sportDataItem = (SportDataItem) obj;
                ClosedInfoViewHolder closedInfoViewHolder = (ClosedInfoViewHolder) viewHolder;
                closedInfoViewHolder.getNameText().setText(sportDataItem.getName());
                closedInfoViewHolder.getItemSwitch().setChecked(false);
                Switch itemSwitch = closedInfoViewHolder.getItemSwitch();
                final MiliSportDataSettingActivity miliSportDataSettingActivity = MiliSportDataSettingActivity.this;
                itemSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.xiaomi.hm.health.device.settings.sport.c
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        MiliSportDataSettingActivity.SportDataItemAdapter.g(sportDataItem, this, miliSportDataSettingActivity, position, i, compoundButton, z);
                    }
                });
                return;
            }
            if (!(viewHolder instanceof SortedInfoViewHolder)) {
                if ((viewHolder instanceof ClosedTitleViewHolder) && (obj instanceof SportConfigUtils.SportDataCategory)) {
                    ((ClosedTitleViewHolder) viewHolder).getTitleText().setText(((SportConfigUtils.SportDataCategory) obj).getNamename());
                    return;
                }
                return;
            }
            final int i2 = position - 1;
            final SportDataItem sportDataItem2 = (SportDataItem) obj;
            SortedInfoViewHolder sortedInfoViewHolder = (SortedInfoViewHolder) viewHolder;
            sortedInfoViewHolder.getNameText().setText(sportDataItem2.getName());
            sortedInfoViewHolder.getItemSwitch().setChecked(true);
            View rootView = sortedInfoViewHolder.getRootView();
            final MiliSportDataSettingActivity miliSportDataSettingActivity2 = MiliSportDataSettingActivity.this;
            rootView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.xiaomi.hm.health.device.settings.sport.a
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return MiliSportDataSettingActivity.SportDataItemAdapter.h(miliSportDataSettingActivity2, viewHolder, view);
                }
            });
            if (!sportDataItem2.isSupportHidden()) {
                sortedInfoViewHolder.getItemSwitch().setVisibility(8);
                return;
            }
            sortedInfoViewHolder.getItemSwitch().setVisibility(0);
            Switch itemSwitch2 = sortedInfoViewHolder.getItemSwitch();
            final MiliSportDataSettingActivity miliSportDataSettingActivity3 = MiliSportDataSettingActivity.this;
            itemSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.xiaomi.hm.health.device.settings.sport.b
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    MiliSportDataSettingActivity.SportDataItemAdapter.i(sportDataItem2, this, miliSportDataSettingActivity3, position, i2, compoundButton, z);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int viewType) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(MiliSportDataSettingActivity.this.getApplicationContext());
            Companion companion = MiliSportDataSettingActivity.INSTANCE;
            if (viewType == companion.getTYPE_SORTED_TITLE()) {
                return new SortedTitleViewHolder(layoutInflaterFrom.inflate(R.layout.sport_item_sorted_title, viewGroup, false));
            }
            if (viewType == companion.getTYPE_SORTED_ITEM()) {
                return new SortedInfoViewHolder(layoutInflaterFrom.inflate(R.layout.sport_item_closed_item, viewGroup, false));
            }
            if (viewType == companion.getTYPE_CLOSED_TITLE()) {
                return new ClosedTitleViewHolder(layoutInflaterFrom.inflate(R.layout.sport_item_sorted_title, viewGroup, false));
            }
            if (viewType == companion.getTYPE_CLOSED_ITEM()) {
                return new ClosedInfoViewHolder(layoutInflaterFrom.inflate(R.layout.sport_item_closed_item, viewGroup, false));
            }
            return viewType == companion.getTYPE_DATA_CATEGORY() ? new ClosedTitleViewHolder(layoutInflaterFrom.inflate(R.layout.sport_item_data_category, viewGroup, false)) : new SortedInfoViewHolder(layoutInflaterFrom.inflate(R.layout.sport_item_sorted_title, viewGroup, false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Not support sport type " + MiliSportDataSettingActivity.this.sportType;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<StateBuilder<SportItemDataConfig>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Loading<? extends SportItemDataConfig>, Unit> {
            public static final a a = new a();

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.sport.MiliSportDataSettingActivity$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0870a extends Lambda implements Function0<String> {
                public static final C0870a a = new C0870a();

                public C0870a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Loading sport data item";
                }
            }

            public a() {
                super(1);
            }

            public final void a(@NotNull Loading<SportItemDataConfig> loading) {
                HMLog.info(MiliSportDataSettingActivity.TAG, C0870a.a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Loading<? extends SportItemDataConfig> loading) {
                a(loading);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.sport.MiliSportDataSettingActivity$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0871b extends Lambda implements Function1<Success<? extends SportItemDataConfig>, Unit> {
            public final /* synthetic */ MiliSportDataSettingActivity a;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.sport.MiliSportDataSettingActivity$b$b$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Load sport data success";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0871b(MiliSportDataSettingActivity miliSportDataSettingActivity) {
                super(1);
                this.a = miliSportDataSettingActivity;
            }

            public final void a(@NotNull Success<SportItemDataConfig> success) {
                HMLog.info(MiliSportDataSettingActivity.TAG, a.a);
                this.a.l(success.getValue());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends SportItemDataConfig> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<Fail<? extends SportItemDataConfig>, Unit> {
            public static final c a = new c();

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Fail<SportItemDataConfig> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fail<SportItemDataConfig> fail) {
                    super(0);
                    this.a = fail;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Load sport data failed: " + this.a.getError().getMessage();
                }
            }

            public c() {
                super(1);
            }

            public final void a(@NotNull Fail<SportItemDataConfig> fail) {
                HMLog.info(MiliSportDataSettingActivity.TAG, new a(fail));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends SportItemDataConfig> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<SportItemDataConfig> stateBuilder) {
            stateBuilder.onLoading(a.a);
            stateBuilder.onSuccess(new C0871b(MiliSportDataSettingActivity.this));
            stateBuilder.onFail(c.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<SportItemDataConfig> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<StateBuilder<SportItemDataConfig>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Loading<? extends SportItemDataConfig>, Unit> {
            public final /* synthetic */ MiliSportDataSettingActivity a;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.sport.MiliSportDataSettingActivity$c$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0872a extends Lambda implements Function0<String> {
                public static final C0872a a = new C0872a();

                public C0872a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Sending sport data item";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MiliSportDataSettingActivity miliSportDataSettingActivity) {
                super(1);
                this.a = miliSportDataSettingActivity;
            }

            public final void a(@NotNull Loading<SportItemDataConfig> loading) {
                HMLog.info(MiliSportDataSettingActivity.TAG, C0872a.a);
                MiliSportDataSettingActivity miliSportDataSettingActivity = this.a;
                miliSportDataSettingActivity.loadingDialog = LoadingDialog.showDialog(miliSportDataSettingActivity, miliSportDataSettingActivity.getString(R.string.saving));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Loading<? extends SportItemDataConfig> loading) {
                a(loading);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Success<? extends SportItemDataConfig>, Unit> {
            public final /* synthetic */ MiliSportDataSettingActivity a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Send sport data success";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MiliSportDataSettingActivity miliSportDataSettingActivity) {
                super(1);
                this.a = miliSportDataSettingActivity;
            }

            public final void a(@NotNull Success<SportItemDataConfig> success) {
                HMLog.info(MiliSportDataSettingActivity.TAG, a.a);
                LoadingDialog loadingDialog = this.a.loadingDialog;
                if (loadingDialog == null) {
                    return;
                }
                loadingDialog.setSuccess(this.a.getString(R.string.save_success));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends SportItemDataConfig> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.sport.MiliSportDataSettingActivity$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportItemDataConfig;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0873c extends Lambda implements Function1<Fail<? extends SportItemDataConfig>, Unit> {
            public final /* synthetic */ MiliSportDataSettingActivity a;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.sport.MiliSportDataSettingActivity$c$c$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Fail<SportItemDataConfig> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fail<SportItemDataConfig> fail) {
                    super(0);
                    this.a = fail;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Send sport data failed: " + this.a.getError().getMessage();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0873c(MiliSportDataSettingActivity miliSportDataSettingActivity) {
                super(1);
                this.a = miliSportDataSettingActivity;
            }

            public final void a(@NotNull Fail<SportItemDataConfig> fail) {
                HMLog.info(MiliSportDataSettingActivity.TAG, new a(fail));
                LoadingDialog loadingDialog = this.a.loadingDialog;
                if (loadingDialog == null) {
                    return;
                }
                loadingDialog.setFailed(this.a.getString(R.string.save_failed));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends SportItemDataConfig> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<SportItemDataConfig> stateBuilder) {
            stateBuilder.onLoading(new a(MiliSportDataSettingActivity.this));
            stateBuilder.onSuccess(new b(MiliSportDataSettingActivity.this));
            stateBuilder.onFail(new C0873c(MiliSportDataSettingActivity.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<SportItemDataConfig> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.sport.MiliSportDataSettingActivity$initViews$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u001a\u0010\u0012\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"com/xiaomi/hm/health/device/settings/sport/MiliSportDataSettingActivity$initViews$1", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "", "getMovementFlags", "source", "target", "", "onMove", "i", "", "onSwiped", "clearView", "isLongPressDragEnabled", "actionState", "onSelectedChanged", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends ItemTouchHelper.Callback {
        public final /* synthetic */ SportDataItemAdapter a;
        public final /* synthetic */ MiliSportDataSettingActivity b;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.sport.MiliSportDataSettingActivity$initViews$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Clear View";
            }
        }

        public AnonymousClass1(SportDataItemAdapter sportDataItemAdapter, MiliSportDataSettingActivity miliSportDataSettingActivity) {
            this.a = sportDataItemAdapter;
            this.b = miliSportDataSettingActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(SportDataItemAdapter sportDataItemAdapter) {
            sportDataItemAdapter.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
            HMLog.info(MiliSportDataSettingActivity.TAG, a.a);
            super.clearView(recyclerView, viewHolder);
            SportDataViewModel sportDataViewModel = this.b.sportDataViewModel;
            Objects.requireNonNull(sportDataViewModel);
            int i = this.b.sportType;
            List<SportDataItem> listF = this.a.f();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listF, 10));
            for (SportDataItem sportDataItem : listF) {
                arrayList.add(new SportItemData(sportDataItem.getType(), sportDataItem.getStatus()));
            }
            sportDataViewModel.setSportTypeSort(new SportItemDataConfig(i, arrayList));
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
            return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        /* JADX INFO: renamed from: isLongPressDragEnabled */
        public boolean getIsEnableDrag() {
            return false;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder source, @NotNull RecyclerView.ViewHolder target) {
            if ((target instanceof SportDataItemAdapter.SortedTitleViewHolder) || (target instanceof SportDataItemAdapter.ClosedInfoViewHolder) || (source instanceof SportDataItemAdapter.SortedTitleViewHolder)) {
                return false;
            }
            int adapterPosition = source.getAdapterPosition();
            int adapterPosition2 = target.getAdapterPosition();
            this.a.m(adapterPosition - 1, adapterPosition2 - 1);
            this.a.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int actionState) {
            super.onSelectedChanged(viewHolder, actionState);
            if (viewHolder == null) {
                RecyclerView recyclerView = (RecyclerView) this.b.findViewById(R.id.sportDataRecycleView);
                final SportDataItemAdapter sportDataItemAdapter = this.a;
                recyclerView.post(new Runnable() { // from class: com.xiaomi.hm.health.device.settings.sport.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        MiliSportDataSettingActivity.AnonymousClass1.b(sportDataItemAdapter);
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        }
    }

    private final void initViews() {
        int i = R.id.sportDataRecycleView;
        ((RecyclerView) findViewById(i)).setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        SportDataItemAdapter sportDataItemAdapter = new SportDataItemAdapter();
        ((RecyclerView) findViewById(i)).setAdapter(sportDataItemAdapter);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new AnonymousClass1(sportDataItemAdapter, this));
        this.touchHelper = itemTouchHelper;
        Objects.requireNonNull(itemTouchHelper);
        itemTouchHelper.attachToRecyclerView((RecyclerView) findViewById(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(SportItemDataConfig sportTypeConfig) {
        RecyclerView.Adapter adapter = ((RecyclerView) findViewById(R.id.sportDataRecycleView)).getAdapter();
        if (adapter instanceof SportDataItemAdapter) {
            List<SportItemData> sportItemData = sportTypeConfig.getSportItemData();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sportItemData, 10));
            for (SportItemData sportItemData2 : sportItemData) {
                arrayList.add(new SportDataItem(sportItemData2.getDataType(), sportItemData2.getStatus(), SportConfigUtils.INSTANCE.getSportDataItemName(sportItemData2.getDataType(), this)));
            }
            ((SportDataItemAdapter) adapter).e(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mili_sport_data_seeting);
        this.sportDataViewModel = (SportDataViewModel) new ViewModelProvider(this).get(SportDataViewModel.class);
        this.sportType = getIntent().getIntExtra(EXTRA_SPORT_TYPE, -1);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, -1, getIntent().getStringExtra(EXTRA_SPORT_NAME));
        if (this.sportType < 0) {
            HMLog.info(TAG, new a());
        }
        initViews();
        SportDataViewModel sportDataViewModel = this.sportDataViewModel;
        Objects.requireNonNull(sportDataViewModel);
        LiveDataExtensionKt.observeState$default(sportDataViewModel.getSportDataLiveData(), this, null, new b(), 2, null);
        SportDataViewModel sportDataViewModel2 = this.sportDataViewModel;
        Objects.requireNonNull(sportDataViewModel2);
        LiveDataExtensionKt.observeState$default(sportDataViewModel2.getSetDeviceDataLiveData(), this, null, new c(), 2, null);
        SportDataViewModel sportDataViewModel3 = this.sportDataViewModel;
        Objects.requireNonNull(sportDataViewModel3);
        sportDataViewModel3.loadSportType(this.sportType);
    }
}
