package com.huami.moving.ui.sport.in;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.moving.R;
import com.huami.moving.databinding.FragmentSportDataSwitcherBinding;
import com.huami.moving.databinding.ItemSportingDataBinding;
import com.huami.moving.datacenter.SportDataType;
import com.huami.moving.ui.sport.in.SportDataSwitcherFragment;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.utils.ViewUtils;
import com.huami.moving.utils.Utils;
import com.huami.tools.analytics.DbUtils;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.widget.typeface.TypefaceTextView;
import com.kogitune.activity_transition.fragment.ExitFragmentTransition;
import com.kogitune.activity_transition.fragment.FragmentTransition;
import com.loc.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u000b*\u0001E\u0018\u0000 K2\u00020\u0001:\u0006LK\u001eMN$B\u0007¢\u0006\u0004\bI\u0010JJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0003J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J)\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016R\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00109R\u0016\u0010<\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010=R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010@R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010CR\u001d\u0010H\u001a\u00020E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\b:\u0010G¨\u0006O"}, d2 = {"Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "g", "Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$a;", "item", "h", "l", hl.k, "Lcom/huami/moving/datacenter/SportDataType;", "selectedDataType", "f", "", DbUtils.Const.Columns.Event.EVENT_ID, "", "sportType", "dataType", "c", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/huami/moving/datacenter/SportDataType;)V", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "outState", "onSaveInstanceState", "onDestroyView", "dismiss", "Lcom/huami/moving/databinding/FragmentSportDataSwitcherBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "e", "()Lcom/huami/moving/databinding/FragmentSportDataSwitcherBinding;", "viewBinding", "Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$ActionListener;", "b", "Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$ActionListener;", "getActionListener", "()Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$ActionListener;", "setActionListener", "(Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$ActionListener;)V", "actionListener", "Lcom/huami/moving/ui/sport/in/SportDataFormatter;", "sportDataFormatter", "Lcom/huami/moving/ui/sport/in/SportDataFormatter;", "getSportDataFormatter", "()Lcom/huami/moving/ui/sport/in/SportDataFormatter;", "setSportDataFormatter", "(Lcom/huami/moving/ui/sport/in/SportDataFormatter;)V", "Lcom/huami/moving/ui/sport/in/SportDataCenter;", "sportDataCenter", "Lcom/huami/moving/ui/sport/in/SportDataCenter;", "getSportDataCenter", "()Lcom/huami/moving/ui/sport/in/SportDataCenter;", "setSportDataCenter", "(Lcom/huami/moving/ui/sport/in/SportDataCenter;)V", LogUtil.I, GoogleApiAvailabilityLight.a, "Lcom/huami/moving/datacenter/SportDataType;", "originDataType", "Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$a;", "selectedItem", "", "Ljava/util/List;", "items", "Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$b;", "Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$b;", "adapter", "com/huami/moving/ui/sport/in/SportDataSwitcherFragment$sportDataObserver$2$1", "Lkotlin/Lazy;", "()Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$sportDataObserver$2$1;", "sportDataObserver", "<init>", "()V", "Companion", "ActionListener", "ItemViewHolder", "OnItemClickListener", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportDataSwitcherFragment extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] i;
    private static final int j = 600;

    @NotNull
    private static final String k = "data";

    @NotNull
    private static final String l = "sportType";

    @NotNull
    private static final String m = "dataTypeID";

    @NotNull
    private static final String n = "newTypeID";
    private static final int o = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ActionListener actionListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int sportType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private SportDataType originDataType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Item selectedItem;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private List<Item> items;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private b adapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportDataObserver;
    public SportDataCenter sportDataCenter;
    public SportDataFormatter sportDataFormatter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$ActionListener;", "", "Lcom/huami/moving/datacenter/SportDataType;", "dataType", "", "onSportDataChanged", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface ActionListener {
        void onSportDataChanged(@NotNull SportDataType dataType);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$Companion;", "", "", "sportType", "Lcom/huami/moving/datacenter/SportDataType;", "dataType", "", "data", "Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment;", "newInstance", "ARG_DATA", "Ljava/lang/String;", "ARG_DATA_TYPE_ID", "ARG_NEW_TYPE_ID", "ARG_SPORT_TYPE", "ITEM_COUNT_PRE_ROW", LogUtil.I, "TRANSITION_ANIMATION_DURATION", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SportDataSwitcherFragment newInstance(int sportType, @NotNull SportDataType dataType, @NotNull String data) {
            SportDataSwitcherFragment sportDataSwitcherFragment = new SportDataSwitcherFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("sportType", sportType);
            bundle.putString(SportDataSwitcherFragment.m, dataType.getId());
            bundle.putString("data", data);
            Unit unit = Unit.INSTANCE;
            sportDataSwitcherFragment.setArguments(bundle);
            return sportDataSwitcherFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/moving/databinding/ItemSportingDataBinding;", "a", "Lcom/huami/moving/databinding/ItemSportingDataBinding;", "getCommentBinding", "()Lcom/huami/moving/databinding/ItemSportingDataBinding;", "commentBinding", "<init>", "(Lcom/huami/moving/databinding/ItemSportingDataBinding;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class ItemViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ItemSportingDataBinding commentBinding;

        public ItemViewHolder(@NonNull @NotNull ItemSportingDataBinding itemSportingDataBinding) {
            super(itemSportingDataBinding.getRoot());
            this.commentBinding = itemSportingDataBinding;
        }

        @NotNull
        public final ItemSportingDataBinding getCommentBinding() {
            return this.commentBinding;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$OnItemClickListener;", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "position", "", "onItemClick", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface OnItemClickListener {
        void onItemClick(@NotNull View view, int position);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportDataType.values().length];
            iArr[SportDataType.ALTITUDE.ordinal()] = 1;
            iArr[SportDataType.AVG_PACE.ordinal()] = 2;
            iArr[SportDataType.AVG_SPEED.ordinal()] = 3;
            iArr[SportDataType.CALORY.ordinal()] = 4;
            iArr[SportDataType.CLIMB.ordinal()] = 5;
            iArr[SportDataType.DISTANCE.ordinal()] = 6;
            iArr[SportDataType.HEART_RATE.ordinal()] = 7;
            iArr[SportDataType.PACE.ordinal()] = 8;
            iArr[SportDataType.SPEED.ordinal()] = 9;
            iArr[SportDataType.STEP_FREQ.ordinal()] = 10;
            iArr[SportDataType.STEPS.ordinal()] = 11;
            iArr[SportDataType.TIME.ordinal()] = 12;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.huami.moving.ui.sport.in.SportDataSwitcherFragment$a, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001d"}, d2 = {"com/huami/moving/ui/sport/in/SportDataSwitcherFragment$a", "", "Lcom/huami/moving/datacenter/SportDataType;", "a", "", "b", "c", "dataType", "isSelected", "isSpace", "Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$a;", GoogleApiAvailabilityLight.a, "", "toString", "", "hashCode", "other", "equals", "Lcom/huami/moving/datacenter/SportDataType;", "f", "()Lcom/huami/moving/datacenter/SportDataType;", "Z", "g", "()Z", "i", "(Z)V", "h", "<init>", "(Lcom/huami/moving/datacenter/SportDataType;ZZ)V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Item {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final SportDataType dataType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private boolean isSelected;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final boolean isSpace;

        public Item(@NotNull SportDataType sportDataType, boolean z, boolean z2) {
            this.dataType = sportDataType;
            this.isSelected = z;
            this.isSpace = z2;
        }

        public static /* synthetic */ Item e(Item item, SportDataType sportDataType, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                sportDataType = item.dataType;
            }
            if ((i & 2) != 0) {
                z = item.isSelected;
            }
            if ((i & 4) != 0) {
                z2 = item.isSpace;
            }
            return item.d(sportDataType, z, z2);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final SportDataType getDataType() {
            return this.dataType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsSpace() {
            return this.isSpace;
        }

        @NotNull
        public final Item d(@NotNull SportDataType dataType, boolean isSelected, boolean isSpace) {
            return new Item(dataType, isSelected, isSpace);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return this.dataType == item.dataType && this.isSelected == item.isSelected && this.isSpace == item.isSpace;
        }

        @NotNull
        public final SportDataType f() {
            return this.dataType;
        }

        public final boolean g() {
            return this.isSelected;
        }

        public final boolean h() {
            return this.isSpace;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public int hashCode() {
            int iHashCode = this.dataType.hashCode() * 31;
            boolean z = this.isSelected;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = (iHashCode + r1) * 31;
            boolean z2 = this.isSpace;
            return i + (z2 ? 1 : z2);
        }

        public final void i(boolean z) {
            this.isSelected = z;
        }

        @NotNull
        public String toString() {
            return "Item(dataType=" + this.dataType + ", isSelected=" + this.isSelected + ", isSpace=" + this.isSpace + ")";
        }

        public /* synthetic */ Item(SportDataType sportDataType, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(sportDataType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010 \u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#\"\u0004\b$\u0010%¨\u0006)"}, d2 = {"com/huami/moving/ui/sport/in/SportDataSwitcherFragment$b", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$ItemViewHolder;", "holder", "", "position", "", "e", "Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$OnItemClickListener;", "click", z.j, "Landroid/view/ViewGroup;", "parent", "viewType", "f", "getItemCount", "Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$a;", "c", "", "newdata", "setNewData", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Ljava/util/List;", "data", "Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$OnItemClickListener;", "()Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$OnItemClickListener;", "h", "(Lcom/huami/moving/ui/sport/in/SportDataSwitcherFragment$OnItemClickListener;)V", "clickListener", GoogleApiAvailabilityLight.a, LogUtil.I, "()I", "i", "(I)V", "itemSize", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class b extends RecyclerView.Adapter<ItemViewHolder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private List<Item> data;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private OnItemClickListener clickListener;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int itemSize = -2;

        public b(@NotNull Context context, @NotNull List<Item> list) {
            this.context = context;
            this.data = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(b bVar, ItemSportingDataBinding itemSportingDataBinding, ItemViewHolder itemViewHolder, View view) {
            OnItemClickListener clickListener = bVar.getClickListener();
            if (clickListener == null) {
                return;
            }
            clickListener.onItemClick(itemSportingDataBinding.getRoot(), itemViewHolder.getPosition());
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final OnItemClickListener getClickListener() {
            return this.clickListener;
        }

        @NotNull
        public final Item c(int position) {
            return this.data.get(position);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getItemSize() {
            return this.itemSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull ItemViewHolder holder, int position) {
            Item item = this.data.get(position);
            ItemSportingDataBinding commentBinding = holder.getCommentBinding();
            if (item.h()) {
                commentBinding.dataContent.setVisibility(8);
                return;
            }
            commentBinding.dataContent.setVisibility(0);
            commentBinding.dataContent.setSelected(item.g());
            commentBinding.ivDataIcon.setImageResource(item.f().getIconResId());
            commentBinding.tvDataName.setText(item.f().getNameResId());
            if (Utils.isMidong()) {
                return;
            }
            commentBinding.tvDataName.setTextColor(ContextCompat.getColorStateList(this.context, R.color.text_color_sporting_data_selector));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public ItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            final ItemSportingDataBinding itemSportingDataBindingInflate = ItemSportingDataBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            final ItemViewHolder itemViewHolder = new ItemViewHolder(itemSportingDataBindingInflate);
            itemViewHolder.getCommentBinding().dataRoot.getLayoutParams().height = getItemSize();
            itemViewHolder.getCommentBinding().dataRoot.getLayoutParams().width = getItemSize();
            itemViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huami.moving.ui.sport.in.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportDataSwitcherFragment.b.g(this.a, itemSportingDataBindingInflate, itemViewHolder, view);
                }
            });
            return itemViewHolder;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.data.size();
        }

        public final void h(@Nullable OnItemClickListener onItemClickListener) {
            this.clickListener = onItemClickListener;
        }

        public final void i(int i) {
            this.itemSize = i;
        }

        public final void j(@NotNull OnItemClickListener click) {
            this.clickListener = click;
        }

        public final void setNewData(@NotNull List<Item> newdata) {
            this.data = newdata;
            notifyDataSetChanged();
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SportDataSwitcherFragment.class), "viewBinding", "getViewBinding()Lcom/huami/moving/databinding/FragmentSportDataSwitcherBinding;"));
        i = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    public SportDataSwitcherFragment() {
        super(R.layout.fragment_sport_data_switcher);
        this.viewBinding = FragmentViewBindingKt.viewBinding(new SportDataSwitcherFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentSportDataSwitcherBinding.class)));
        this.sportType = 1;
        this.originDataType = SportDataType.DISTANCE;
        this.sportDataObserver = LazyKt__LazyJVMKt.lazy(new Function0<SportDataSwitcherFragment$sportDataObserver$2.AnonymousClass1>() { // from class: com.huami.moving.ui.sport.in.SportDataSwitcherFragment$sportDataObserver$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.moving.ui.sport.in.SportDataSwitcherFragment$sportDataObserver$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 getA() {
                final SportDataSwitcherFragment sportDataSwitcherFragment = this.a;
                return new SportDataCenter.DataObserver() { // from class: com.huami.moving.ui.sport.in.SportDataSwitcherFragment$sportDataObserver$2.1
                    @Override // com.huami.moving.ui.sport.in.SportDataCenter.DataObserver
                    public void onDataChanged(@NotNull SportDataType type, @NotNull SportDataCenter dataCenter) {
                        SportDataSwitcherFragment.Item item = sportDataSwitcherFragment.selectedItem;
                        Objects.requireNonNull(item);
                        if (type != item.f()) {
                            return;
                        }
                        sportDataSwitcherFragment.e().tvData.setText(sportDataSwitcherFragment.getSportDataFormatter().getFormatData(type, dataCenter));
                        if (type == SportDataType.STEPS) {
                            sportDataSwitcherFragment.e().tvDesc.setText(sportDataSwitcherFragment.getResources().getQuantityString(R.plurals.sporting_data_unit_steps, dataCenter.getSteps()));
                        }
                    }
                };
            }
        });
    }

    private final void c(String eventId, Integer sportType, SportDataType dataType) {
        String str;
        CountEventBuilder countEventBuilder = new CountEventBuilder(eventId);
        HashMap map = new HashMap();
        if (sportType != null && sportType.intValue() == 1) {
            str = SportAnalytics.ParamValue.SportType.OUTDOOR_RUNNING;
        } else if (sportType != null && sportType.intValue() == 8) {
            str = SportAnalytics.ParamValue.SportType.TREADMILL;
        } else if (sportType != null && sportType.intValue() == 6) {
            str = "Walking";
        } else {
            str = (sportType != null && sportType.intValue() == 9) ? SportAnalytics.ParamValue.SportType.OUTDOOR_CYCLING : "";
        }
        map.put(SportAnalytics.ParamKey.SPORTS_PAGE, str);
        switch (WhenMappings.$EnumSwitchMapping$0[dataType.ordinal()]) {
            case 1:
                map.put(SportAnalytics.ParamKey.DATA_TYPE, SportAnalytics.ParamValue.DataName.ALTITUDE);
                break;
            case 2:
                map.put(SportAnalytics.ParamKey.DATA_TYPE, SportAnalytics.ParamValue.DataName.AVGPACE);
                break;
            case 3:
                map.put(SportAnalytics.ParamKey.DATA_TYPE, SportAnalytics.ParamValue.DataName.AVGSPEED);
                break;
            case 4:
                map.put(SportAnalytics.ParamKey.DATA_TYPE, SportAnalytics.ParamValue.DataName.CAL);
                break;
            case 5:
                map.put(SportAnalytics.ParamKey.DATA_TYPE, "Climb");
                break;
            case 6:
                map.put(SportAnalytics.ParamKey.DATA_TYPE, SportAnalytics.ParamValue.DataName.DISTANCE);
                break;
            case 7:
                map.put(SportAnalytics.ParamKey.DATA_TYPE, SportAnalytics.ParamValue.DataName.HEARTRATE);
                break;
            case 8:
                map.put(SportAnalytics.ParamKey.DATA_TYPE, "Pace");
                break;
            case 9:
                map.put(SportAnalytics.ParamKey.DATA_TYPE, "Speed");
                break;
            case 10:
                map.put(SportAnalytics.ParamKey.DATA_TYPE, SportAnalytics.ParamValue.DataName.STEPFREQ);
                break;
            case 11:
                map.put(SportAnalytics.ParamKey.DATA_TYPE, SportAnalytics.ParamValue.DataName.STEPS);
                break;
            case 12:
                map.put(SportAnalytics.ParamKey.DATA_TYPE, "Time");
                break;
        }
        countEventBuilder.putExtras(map);
        Analytics.recordEvent(countEventBuilder);
    }

    private final SportDataSwitcherFragment$sportDataObserver$2.AnonymousClass1 d() {
        return (SportDataSwitcherFragment$sportDataObserver$2.AnonymousClass1) this.sportDataObserver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentSportDataSwitcherBinding e() {
        return (FragmentSportDataSwitcherBinding) this.viewBinding.getValue(this, i[0]);
    }

    private final void f(SportDataType selectedDataType) {
        ArrayList<SportDataType> arrayList = new ArrayList();
        arrayList.addAll(this.sportType == 9 ? CollectionsKt__CollectionsKt.listOf((Object[]) new SportDataType[]{SportDataType.SPEED, SportDataType.AVG_SPEED}) : CollectionsKt__CollectionsKt.listOf((Object[]) new SportDataType[]{SportDataType.PACE, SportDataType.AVG_PACE}));
        arrayList.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new SportDataType[]{SportDataType.HEART_RATE, SportDataType.CALORY, SportDataType.DISTANCE, SportDataType.TIME}));
        int i2 = this.sportType;
        arrayList.addAll(i2 != 6 ? i2 != 9 ? e.listOf(SportDataType.STEP_FREQ) : CollectionsKt__CollectionsKt.listOf((Object[]) new SportDataType[]{SportDataType.CLIMB, SportDataType.ALTITUDE}) : CollectionsKt__CollectionsKt.listOf((Object[]) new SportDataType[]{SportDataType.STEP_FREQ, SportDataType.STEPS}));
        Unit unit = Unit.INSTANCE;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (SportDataType sportDataType : arrayList) {
            Item item = new Item(sportDataType, selectedDataType == sportDataType, false, 4, null);
            if (item.g()) {
                this.selectedItem = item;
            }
            arrayList2.add(item);
        }
        this.items = arrayList2;
        Objects.requireNonNull(arrayList2);
        int size = 3 - (arrayList2.size() % 3);
        if (size == 0) {
            return;
        }
        List<Item> list = this.items;
        Objects.requireNonNull(list);
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        if (size > 0) {
            int i3 = 0;
            do {
                i3++;
                mutableList.add(new Item(SportDataType.DISTANCE, false, true));
            } while (i3 < size);
        }
        this.items = CollectionsKt___CollectionsKt.toList(mutableList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Bundle savedInstanceState) {
        ExitFragmentTransition exitFragmentTransitionStart = FragmentTransition.with(this).duration(600).interpolator(new FastOutSlowInInterpolator()).to(e().tvData).enterListener(new AnimatorListenerAdapter() { // from class: com.huami.moving.ui.sport.in.SportDataSwitcherFragment$initTransition$exitFragmentTransition$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                this.a.e().tvDesc.setVisibility(0);
                this.a.e().dataContainer.setVisibility(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                this.a.e().tvDesc.setVisibility(4);
                this.a.e().dataContainer.setVisibility(4);
            }
        }).start(savedInstanceState);
        exitFragmentTransitionStart.exitListener(new AnimatorListenerAdapter() { // from class: com.huami.moving.ui.sport.in.SportDataSwitcherFragment$initTransition$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                SportDataSwitcherFragment.ActionListener actionListener;
                if (!this.a.isDetached()) {
                    this.a.e().tvDesc.setVisibility(4);
                    this.a.e().dataContainer.setVisibility(4);
                }
                SportDataType sportDataType = this.a.originDataType;
                SportDataSwitcherFragment.Item item = this.a.selectedItem;
                Objects.requireNonNull(item);
                if (sportDataType == item.f() || (actionListener = this.a.getActionListener()) == null) {
                    return;
                }
                SportDataSwitcherFragment.Item item2 = this.a.selectedItem;
                Objects.requireNonNull(item2);
                actionListener.onSportDataChanged(item2.f());
            }
        });
        exitFragmentTransitionStart.startExitListening();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Item item) {
        Item item2 = this.selectedItem;
        Objects.requireNonNull(item2);
        if (Intrinsics.areEqual(item, item2)) {
            return;
        }
        Item item3 = this.selectedItem;
        Objects.requireNonNull(item3);
        item3.i(false);
        b bVar = this.adapter;
        Objects.requireNonNull(bVar);
        List<Item> list = this.items;
        Objects.requireNonNull(list);
        Item item4 = this.selectedItem;
        Objects.requireNonNull(item4);
        bVar.notifyItemChanged(list.indexOf(item4));
        item.i(true);
        this.selectedItem = item;
        TypefaceTextView typefaceTextView = e().tvData;
        SportDataFormatter sportDataFormatter = getSportDataFormatter();
        Item item5 = this.selectedItem;
        Objects.requireNonNull(item5);
        typefaceTextView.setText(sportDataFormatter.getFormatData(item5.f(), getSportDataCenter()));
        Item item6 = this.selectedItem;
        Objects.requireNonNull(item6);
        if (item6.f() == SportDataType.STEPS) {
            e().tvDesc.setText(getResources().getQuantityString(R.plurals.sporting_data_unit_steps, getSportDataCenter().getSteps()));
        } else {
            l();
        }
        b bVar2 = this.adapter;
        Objects.requireNonNull(bVar2);
        List<Item> list2 = this.items;
        Objects.requireNonNull(list2);
        Item item7 = this.selectedItem;
        Objects.requireNonNull(item7);
        bVar2.notifyItemChanged(list2.indexOf(item7));
        Integer numValueOf = Integer.valueOf(this.sportType);
        Item item8 = this.selectedItem;
        Objects.requireNonNull(item8);
        c(SportAnalytics.EVENT_RUNNING_DATA_CHOICE_CLICK, numValueOf, item8.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SportDataSwitcherFragment sportDataSwitcherFragment, View view) {
        sportDataSwitcherFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SportDataSwitcherFragment sportDataSwitcherFragment) {
        sportDataSwitcherFragment.k();
    }

    private final void k() {
        int width = ViewUtils.getWidth(e().dataContainer) / 3;
        b bVar = this.adapter;
        Objects.requireNonNull(bVar);
        bVar.i(width);
        b bVar2 = this.adapter;
        Objects.requireNonNull(bVar2);
        List<Item> list = this.items;
        Objects.requireNonNull(list);
        bVar2.setNewData(list);
        List<Item> list2 = this.items;
        Objects.requireNonNull(list2);
        int size = list2.size();
        int i2 = (size / 3) + (size % 3 > 0 ? 1 : 0);
        RecyclerView recyclerView = e().dataContainer;
        ViewGroup.LayoutParams layoutParams = e().dataContainer.getLayoutParams();
        layoutParams.height = width * i2;
        Unit unit = Unit.INSTANCE;
        recyclerView.setLayoutParams(layoutParams);
    }

    @SuppressLint({"SetTextI18n"})
    private final void l() {
        TypefaceTextView typefaceTextView = e().tvDesc;
        Item item = this.selectedItem;
        Objects.requireNonNull(item);
        typefaceTextView.setText(item.f().unit(e().tvDesc.getContext(), RunnerData.getRunner().isMetric()));
    }

    @JvmStatic
    @NotNull
    public static final SportDataSwitcherFragment newInstance(int i2, @NotNull SportDataType sportDataType, @NotNull String str) {
        return INSTANCE.newInstance(i2, sportDataType, str);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        e().tvData.dispatchKeyEvent(new KeyEvent(1, 4));
    }

    @Nullable
    public final ActionListener getActionListener() {
        return this.actionListener;
    }

    @NotNull
    public final SportDataCenter getSportDataCenter() {
        SportDataCenter sportDataCenter = this.sportDataCenter;
        Objects.requireNonNull(sportDataCenter);
        return sportDataCenter;
    }

    @NotNull
    public final SportDataFormatter getSportDataFormatter() {
        SportDataFormatter sportDataFormatter = this.sportDataFormatter;
        Objects.requireNonNull(sportDataFormatter);
        return sportDataFormatter;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R.style.DimPanelTintNoAnim);
        SportDataType sportDataTypeValueOfID = null;
        if (savedInstanceState != null) {
            this.sportType = savedInstanceState.getInt("sportType");
            SportDataType.Companion companion = SportDataType.INSTANCE;
            String string = savedInstanceState.getString(m);
            if (string == null) {
                string = "";
            }
            SportDataType sportDataTypeValueOfID2 = companion.valueOfID(string);
            if (sportDataTypeValueOfID2 == null) {
                sportDataTypeValueOfID2 = SportDataType.DISTANCE;
            }
            this.originDataType = sportDataTypeValueOfID2;
            String string2 = savedInstanceState.getString(n);
            sportDataTypeValueOfID = string2 != null ? companion.valueOfID(string2) : null;
            if (sportDataTypeValueOfID == null) {
                sportDataTypeValueOfID = this.originDataType;
            }
        }
        if (sportDataTypeValueOfID == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.sportType = arguments.getInt("sportType");
                SportDataType.Companion companion2 = SportDataType.INSTANCE;
                String string3 = arguments.getString(m);
                SportDataType sportDataTypeValueOfID3 = companion2.valueOfID(string3 != null ? string3 : "");
                if (sportDataTypeValueOfID3 == null) {
                    sportDataTypeValueOfID3 = SportDataType.DISTANCE;
                }
                this.originDataType = sportDataTypeValueOfID3;
            }
            sportDataTypeValueOfID = this.originDataType;
        }
        f(sportDataTypeValueOfID);
        b bVar = new b(requireContext(), CollectionsKt__CollectionsKt.emptyList());
        bVar.j(new OnItemClickListener() { // from class: com.huami.moving.ui.sport.in.SportDataSwitcherFragment$onCreate$1$1
            @Override // com.huami.moving.ui.sport.in.SportDataSwitcherFragment.OnItemClickListener
            public void onItemClick(@NotNull View view, int position) {
                SportDataSwitcherFragment.b bVar2 = this.a.adapter;
                Objects.requireNonNull(bVar2);
                SportDataSwitcherFragment.Item itemC = bVar2.c(position);
                SportDataSwitcherFragment sportDataSwitcherFragment = this.a;
                if (!itemC.h()) {
                    sportDataSwitcherFragment.h(itemC);
                }
                sportDataSwitcherFragment.dismiss();
            }
        });
        Unit unit = Unit.INSTANCE;
        this.adapter = bVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (this.sportDataCenter != null) {
            getSportDataCenter().unregisterDataObserver(d());
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("sportType", this.sportType);
        outState.putString(m, this.originDataType.getId());
        Item item = this.selectedItem;
        Objects.requireNonNull(item);
        outState.putString(n, item.f().getId());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable final Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            e().tvData.setText(arguments.getString("data"));
        }
        l();
        view.setOnClickListener(new View.OnClickListener() { // from class: c87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SportDataSwitcherFragment.i(this.a, view2);
            }
        });
        e().dataContainer.post(new Runnable() { // from class: d87
            @Override // java.lang.Runnable
            public final void run() {
                SportDataSwitcherFragment.j(this.a);
            }
        });
        RecyclerView recyclerView = e().dataContainer;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 3));
        b bVar = this.adapter;
        Objects.requireNonNull(bVar);
        recyclerView.setAdapter(bVar);
        e().tvData.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.huami.moving.ui.sport.in.SportDataSwitcherFragment.onViewCreated.5
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                int[] iArr = new int[2];
                SportDataSwitcherFragment.this.e().tvData.getLocationOnScreen(iArr);
                boolean z = iArr[1] != 0;
                if (z) {
                    SportDataSwitcherFragment.this.e().tvData.getViewTreeObserver().removeOnPreDrawListener(this);
                    SportDataSwitcherFragment.this.g(savedInstanceState);
                }
                return z;
            }
        });
        if (this.sportDataCenter != null) {
            getSportDataCenter().registerDataObserver(d());
        }
    }

    public final void setActionListener(@Nullable ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public final void setSportDataCenter(@NotNull SportDataCenter sportDataCenter) {
        this.sportDataCenter = sportDataCenter;
    }

    public final void setSportDataFormatter(@NotNull SportDataFormatter sportDataFormatter) {
        this.sportDataFormatter = sportDataFormatter;
    }
}
