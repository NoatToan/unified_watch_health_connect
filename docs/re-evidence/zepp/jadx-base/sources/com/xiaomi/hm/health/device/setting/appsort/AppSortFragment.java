package com.xiaomi.hm.health.device.setting.appsort;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.baseui.fragment.BaseNavFragment;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.appsort.AppSortFragment;
import com.xiaomi.hm.health.device.setting.appsort.condition.AppGroupCountCondition;
import com.xiaomi.hm.health.device.setting.appsort.condition.AppHideCondition;
import com.xiaomi.hm.health.device.setting.appsort.condition.ZeppOSHideCondition;
import com.xiaomi.hm.health.device.setting.appsort.repo.AppSortRepoFactory;
import com.xiaomi.hm.health.device.setting.appsort.repo.ControlCenterRepo;
import com.xiaomi.hm.health.device.setting.appsort.repo.ISortRepo;
import com.xiaomi.hm.health.device.setting.appsort.repo.ScreenEditRepo;
import com.xiaomi.hm.health.device.settings.base.XRecyclerViewDragAdapter;
import com.xiaomi.hm.health.device.view.FixedXRecyclerView;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.zhouyou.recyclerview.adapter.HelperRecyclerViewHolder;
import com.zhouyou.recyclerview.divider.FlexibleDividerDecoration;
import com.zhouyou.recyclerview.listener.ItemDragListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 R2\u00020\u0001:\u0003SRTB\u0007¢\u0006\u0004\bP\u0010QJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J;\u0010\u0017\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0010\b\n\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00132\u0010\b\n\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013H\u0082\bJ\b\u0010\u0018\u001a\u00020\fH\u0002J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u001d\u0010 \u001a\u00020\u0002*\u00020\u001e2\u000e\b\u0004\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0082\bJ\u0012\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J&\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\b\u0010*\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016J\b\u0010,\u001a\u00020\fH\u0014J\b\u0010-\u001a\u00020\u0010H\u0014R\u001d\u00103\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u00108\u001a\u0002048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0004098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010?R\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010GR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010GR\u0016\u0010L\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010O\u001a\u00020\b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006U"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment;", "Lcom/xiaomi/hm/health/baseui/fragment/BaseNavFragment;", "", "initView", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$a;", "group", "Lcom/xiaomi/hm/health/device/setting/appsort/condition/AppGroupCountCondition;", "condition", "", "groupCount", "originGroup", "originGroupCount", "", "h", "o", "w", "", "tips", "y", "Lkotlin/Function0;", "action", "success", com.facebook.login.a.K, "i", com.google.android.exoplayer2.text.ttml.b.r, "", "Lcom/xiaomi/hm/health/device/setting/appsort/AppGroup;", hl.k, "groups", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/recyclerview/widget/RecyclerView;", "notify", "x", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onResume", "onDestroyView", "onBackPressed", "tag", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortViewModel;", "b", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.b, "()Lcom/xiaomi/hm/health/device/setting/appsort/AppSortViewModel;", "viewModel", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "c", "l", "()Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingHelper", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter;", "adapter", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "saveBtn", "f", "titleTv", "Lcom/xiaomi/hm/health/device/view/FixedXRecyclerView;", "g", "Lcom/xiaomi/hm/health/device/view/FixedXRecyclerView;", "dataView", "Lkotlin/jvm/functions/Function0;", "actionSuccess", "actionFailure", z.j, "Z", "refreshData", "m", "()I", "sortType", "<init>", "()V", "Companion", "Adapter", "a", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AppSortFragment extends BaseNavFragment {

    @NotNull
    public static final String KEY_TYPE = "type";
    public static final int TYPE_APP_SORT = 0;
    public static final int TYPE_CONTROL_CENTER_EDIT = 2;
    public static final int TYPE_SCREEN_EDIT = 1;

    @NotNull
    private static final String k = "AppSortFragment";
    private static final int l = 90;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Adapter<a> adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private TextView saveBtn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private TextView titleTv;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private FixedXRecyclerView dataView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> actionSuccess;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> actionFailure;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean refreshData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 >*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u0003?@AB+\u0012\u0006\u0010;\u001a\u00020:\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\"¢\u0006\u0004\b<\u0010=J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005J'\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0016R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010+\u001a\u00020&8\u0014@\u0014X\u0094D¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020&8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010(R\u0018\u00100\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0013\u00109\u001a\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006B"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/device/settings/base/XRecyclerViewDragAdapter;", "Lcom/zhouyou/recyclerview/divider/FlexibleDividerDecoration$VisibilityProvider;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "", DTransferConstants.SEARCH_KEY, GoogleApiAvailabilityLight.b, "groupPos", "m", "Landroid/view/View;", "itemView", "position", "", hl.k, "", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/zhouyou/recyclerview/adapter/HelperRecyclerViewHolder;", "item", "h", "(Lcom/zhouyou/recyclerview/adapter/HelperRecyclerViewHolder;ILcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;)V", "r", "onItemDragStart", "onItemDragEnd", "l", "(Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;I)I", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "shouldHideDivider", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Movement;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Movement;", "movement", "Lkotlin/Function0;", SOAP.XMLNS, "Lkotlin/jvm/functions/Function0;", "onChanged", "", "t", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "u", "dragLimitTag", "v", "Ljava/lang/Integer;", "dragStart", "w", LogUtil.I, "dragStartGroupCount", "x", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;", "dragStartGroup", "o", "()I", "disableGroupIndex", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Movement;Lkotlin/jvm/functions/Function0;)V", "y", "a", "Item", "Movement", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Adapter<T extends Item> extends XRecyclerViewDragAdapter<T> implements FlexibleDividerDecoration.VisibilityProvider {

        @Deprecated
        public static final int A = 1;

        @NotNull
        private static final a y = new a(null);

        @Deprecated
        public static final int z = 0;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @NotNull
        private final Movement<T> movement;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @NotNull
        private final Function0<Unit> onChanged;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @NotNull
        private final String tag;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @NotNull
        private final String dragLimitTag;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @Nullable
        private Integer dragStart;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private int dragStartGroupCount;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private T dragStartGroup;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\b\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;", "", "", "isGroupHeader", "isDisableGroup", "", "content", "tips", "canDisable", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public interface Item {
            boolean canDisable();

            @Nullable
            String content();

            boolean isDisableGroup();

            boolean isGroupHeader();

            @Nullable
            String tips();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003J7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Movement;", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;", ExifInterface.GPS_DIRECTION_TRUE, "", "item", "group", "", "groupCount", "originGroup", "originGroupCount", "", "check", "(Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;ILcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;I)Z", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public interface Movement<T extends Item> {
            boolean check(@NotNull T item, @NotNull T group, int groupCount, @NotNull T originGroup, int originGroupCount);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"com/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$a", "", "", "ITEM_TYPE_APP", LogUtil.I, "ITEM_TYPE_GROUP", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Adapter<T> a;
            public final /* synthetic */ RecyclerView.ViewHolder b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Adapter<T> adapter, RecyclerView.ViewHolder viewHolder, int i) {
                super(0);
                this.a = adapter;
                this.b = viewHolder;
                this.c = i;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.notifyItemMoved(this.b.getAdapterPosition(), this.a.getItemViewHolderPosition(this.c));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Adapter<T> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Adapter<T> adapter) {
                super(0);
                this.a = adapter;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.notifyDataSetChanged();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<String> {
            public final /* synthetic */ Adapter<T> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Adapter<T> adapter) {
                super(0);
                this.a = adapter;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                int i = ((Adapter) this.a).dragStartGroupCount;
                Item item = ((Adapter) this.a).dragStartGroup;
                Objects.requireNonNull(item);
                return "drag start, groupCount: " + i + ", group: " + item;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ T b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(int i, T t) {
                super(0);
                this.a = i;
                this.b = t;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "quick move start, groupCount: " + this.a + ", group: " + this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(int i, int i2, int i3, int i4) {
                super(0);
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.d = i4;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Quick move " + this.a + "(" + this.b + ") to " + this.c + "(" + this.d + "})";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Adapter<T> a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Adapter<T> adapter, int i, int i2) {
                super(0);
                this.a = adapter;
                this.b = i;
                this.c = i2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.notifyItemMoved(this.b, this.c);
                this.a.notifyItemRangeChanged(Math.min(this.b, this.c) - 1, Math.abs(this.b - this.c) + 2);
            }
        }

        public Adapter(@NotNull Context context, @NotNull Movement<T> movement, @NotNull Function0<Unit> function0) {
            super(context, R.layout.item_sort, R.layout.item_sort_header);
            this.movement = movement;
            this.onChanged = function0;
            this.tag = AppSortFragment.k;
            this.dragLimitTag = "AppSortDragLimit";
            this.dragStartGroupCount = Integer.MAX_VALUE;
        }

        private final void k(View itemView, int position) {
            T data = position > 0 ? getData(position - 1) : null;
            int i = position + 1;
            T data2 = i < getSize() ? getData(i) : null;
            if (data == null || data.isGroupHeader()) {
                itemView.setBackgroundResource(R.drawable.bg_round_corner_item_first);
            } else if (data2 == null || data2.isGroupHeader()) {
                itemView.setBackgroundResource(R.drawable.bg_round_corner_item_last);
            } else {
                itemView.setBackgroundColor(ContextCompat.getColor(this.mContext, R.color.s38));
            }
        }

        private final int m(int groupPos) {
            int i = groupPos + 1;
            int size = getSize();
            int i2 = 0;
            if (i < size) {
                while (true) {
                    int i3 = i + 1;
                    if (getData(i).isGroupHeader()) {
                        break;
                    }
                    i2++;
                    if (i3 >= size) {
                        break;
                    }
                    i = i3;
                }
            }
            return i2;
        }

        private final int n(RecyclerView.ViewHolder viewHolder) {
            return m(q(viewHolder));
        }

        private final int q(RecyclerView.ViewHolder viewHolder) {
            int iDataPosition = dataPosition(viewHolder) - 1;
            if (iDataPosition >= 0) {
                while (true) {
                    int i = iDataPosition - 1;
                    if (getData(iDataPosition).isGroupHeader()) {
                        return iDataPosition;
                    }
                    if (i >= 0) {
                        iDataPosition = i;
                    }
                }
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(Adapter adapter, int i, HelperRecyclerViewHolder helperRecyclerViewHolder, View view) {
            int size;
            int size2;
            int iO = adapter.o();
            if (i >= iO) {
                int i2 = iO - 1;
                int i3 = 0;
                if (i2 >= 0) {
                    int i4 = i2;
                    while (true) {
                        int i5 = i4 - 1;
                        if (((Item) adapter.getData(i4)).isGroupHeader()) {
                            size2 = iO;
                            size = i3;
                            iO = i4;
                            break;
                        } else {
                            i3++;
                            if (i5 < 0) {
                                size = i3;
                            } else {
                                i4 = i5;
                            }
                        }
                    }
                } else {
                    size = 0;
                }
                size2 = iO;
                iO = i2;
                break;
            } else {
                size2 = adapter.getSize() - 1;
                size = (adapter.getSize() - iO) - 1;
            }
            int iN = adapter.n(helperRecyclerViewHolder);
            Item item = (Item) adapter.getData(adapter.q(helperRecyclerViewHolder));
            HMLog.info(adapter.dragLimitTag, new e(iN, item));
            if (!adapter.movement.check((Item) adapter.getData(i), (Item) adapter.getData(iO), size, item, iN)) {
                return;
            }
            int adapterPosition = helperRecyclerViewHolder.getAdapterPosition();
            int itemViewHolderPosition = adapter.getItemViewHolderPosition(size2);
            HMLog.verbose(AppSortFragment.k, new f(i, adapterPosition, size2, itemViewHolderPosition));
            adapter.move(i, size2);
            Function1<Function0<Unit>, Unit> safeNotify = adapter.getSafeNotify();
            if (safeNotify != null) {
                safeNotify.invoke(new g(adapter, adapterPosition, itemViewHolderPosition));
            }
            adapter.onChanged.invoke();
        }

        @Override // com.xiaomi.hm.health.device.settings.base.XRecyclerViewDragAdapter
        @NotNull
        public String getTag() {
            return this.tag;
        }

        @Override // com.zhouyou.recyclerview.adapter.HelperRecyclerViewAdapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void HelperBindData(@NotNull HelperRecyclerViewHolder viewHolder, int position, @NotNull T item) {
            HelperRecyclerViewHolder text;
            if (item.isGroupHeader()) {
                viewHolder.setText(R.id.tv_text, item.content());
                String strTips = item.tips();
                if (strTips == null) {
                    text = null;
                } else {
                    int i = R.id.tv_tips;
                    viewHolder.setVisible(i, true);
                    text = viewHolder.setText(i, strTips);
                }
                if (text == null) {
                    viewHolder.setVisible(R.id.tv_tips, false);
                    return;
                }
                return;
            }
            viewHolder.setText(R.id.tv_text, item.content());
            int i2 = R.id.iv_quick_delete;
            viewHolder.setVisible(i2, isItemDraggable());
            viewHolder.setVisible(R.id.iv_drag, isItemDraggable());
            boolean z2 = position < o();
            ImageView imageView = (ImageView) viewHolder.getView(i2);
            if (imageView != null) {
                imageView.setEnabled(item.canDisable());
                if (z2) {
                    imageView.setImageResource(R.drawable.icon_item_quick_delete);
                } else {
                    imageView.setImageResource(R.drawable.icon_item_quick_add);
                }
            }
            k(viewHolder.itemView, position);
        }

        @Override // com.zhouyou.recyclerview.adapter.BaseRecyclerViewAdapter
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int checkLayout(@NotNull T item, int position) {
            return item.isGroupHeader() ? 1 : 0;
        }

        public final int o() {
            Iterator<T> it2 = getList().iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (it2.next().isDisableGroup()) {
                    return i;
                }
                i++;
            }
            return -1;
        }

        @Override // com.xiaomi.hm.health.device.settings.base.XRecyclerViewDragAdapter, com.zhouyou.recyclerview.adapter.HelperRecyclerViewDragAdapter
        public void onItemDragEnd(@NotNull RecyclerView.ViewHolder viewHolder) {
            Integer num;
            int iIntValue;
            int iDataPosition;
            super.onItemDragEnd(viewHolder);
            if (!isItemDraggable() || (num = this.dragStart) == null || (iIntValue = num.intValue()) == (iDataPosition = dataPosition(viewHolder))) {
                return;
            }
            int iQ = q(viewHolder);
            int iM = m(iQ) - 1;
            Movement<T> movement = this.movement;
            T data = getData(iDataPosition);
            T data2 = getData(iQ);
            T t = this.dragStartGroup;
            Objects.requireNonNull(t);
            if (movement.check(data, data2, iM, t, this.dragStartGroupCount)) {
                Function1<Function0<Unit>, Unit> safeNotify = getSafeNotify();
                if (safeNotify != null) {
                    safeNotify.invoke(new c(this));
                }
                this.onChanged.invoke();
                return;
            }
            move(iDataPosition, iIntValue);
            Function1<Function0<Unit>, Unit> safeNotify2 = getSafeNotify();
            if (safeNotify2 == null) {
                return;
            }
            safeNotify2.invoke(new b(this, viewHolder, iIntValue));
        }

        @Override // com.xiaomi.hm.health.device.settings.base.XRecyclerViewDragAdapter, com.zhouyou.recyclerview.adapter.HelperRecyclerViewDragAdapter
        public void onItemDragStart(@NotNull RecyclerView.ViewHolder viewHolder) {
            super.onItemDragStart(viewHolder);
            if (isItemDraggable()) {
                this.dragStart = Integer.valueOf(dataPosition(viewHolder));
                this.dragStartGroupCount = n(viewHolder);
                this.dragStartGroup = getData(q(viewHolder));
                HMLog.info(this.dragLimitTag, new d(this));
            }
        }

        public final boolean p(@NotNull RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                return itemViewType == 1 && dataPosition(viewHolder) > 0;
            }
            return true;
        }

        @Override // com.zhouyou.recyclerview.adapter.HelperRecyclerViewAdapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void setListener(@NotNull final HelperRecyclerViewHolder viewHolder, final int position, @NotNull T item) {
            if (item.isGroupHeader()) {
                return;
            }
            viewHolder.setOnClickListener(R.id.iv_quick_delete, new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.appsort.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppSortFragment.Adapter.s(this.a, position, viewHolder, view);
                }
            });
        }

        @Override // com.zhouyou.recyclerview.divider.FlexibleDividerDecoration.VisibilityProvider
        public boolean shouldHideDivider(int position, @NotNull RecyclerView recyclerView) {
            int i;
            T data = getData(position);
            if (data != null && (i = position + 1) < getSize()) {
                return data.isGroupHeader() || getData(i).isGroupHeader();
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0019\u0010\r\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"com/xiaomi/hm/health/device/setting/appsort/AppSortFragment$a", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortFragment$Adapter$Item;", "", "isGroupHeader", "isDisableGroup", "", "content", "tips", "canDisable", "", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", IconCompat.EXTRA_OBJ, "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/Object;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Adapter.Item {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Object obj;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private String tips;

        public a(@NotNull Object obj) {
            this.obj = obj;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getObj() {
            return this.obj;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTips() {
            return this.tips;
        }

        public final void c(@Nullable String str) {
            this.tips = str;
        }

        @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortFragment.Adapter.Item
        public boolean canDisable() {
            Object obj = this.obj;
            return (obj instanceof AppItem) && ((AppItem) obj).getCanDisable();
        }

        @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortFragment.Adapter.Item
        @Nullable
        public String content() {
            Object obj = this.obj;
            if (obj instanceof AppGroup) {
                return ((AppGroup) obj).getDesc();
            }
            if (obj instanceof AppItem) {
                return ((AppItem) obj).getName();
            }
            return null;
        }

        @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortFragment.Adapter.Item
        public boolean isDisableGroup() {
            Object obj = this.obj;
            return (obj instanceof AppGroup) && ((AppGroup) obj).isDisableGroup();
        }

        @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortFragment.Adapter.Item
        public boolean isGroupHeader() {
            return this.obj instanceof AppGroup;
        }

        @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortFragment.Adapter.Item
        @Nullable
        public String tips() {
            return this.tips;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (AppSortFragment.this.m() == 0) {
                AppSortFragment.this.w();
            }
            TextView textView = AppSortFragment.this.saveBtn;
            Objects.requireNonNull(textView);
            textView.setEnabled(AppSortFragment.this.p());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<LoadingDialogHelper> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper invoke() {
            return new LoadingDialogHelper(AppSortFragment.this.requireActivity());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AppSortFragment.this.l().hideLoading();
            AppSortFragment.this.getBackPressedCallback().setEnabled(false);
            AppSortFragment.this.requireActivity().onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "指令执行失败";
            }
        }

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AppSortFragment.this.l().hideLoading();
            HMLog.info(AppSortFragment.k, a.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AppSortFragment.this.l().hideLoading();
            IconToast.showError(AppSortFragment.this.getContext(), R.string.load_fail);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppSortFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.device.setting.appsort.AppSortFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<AppSortViewModel>() { // from class: com.xiaomi.hm.health.device.setting.appsort.AppSortFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.device.setting.appsort.AppSortViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AppSortViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(AppSortViewModel.class), function0, objArr);
            }
        });
        this.loadingHelper = LazyKt__LazyJVMKt.lazy(new c());
    }

    private final List<a> A(List<AppGroup> groups) {
        ArrayList arrayList = new ArrayList();
        for (AppGroup appGroup : groups) {
            arrayList.add(new a(appGroup));
            Iterator<T> it2 = appGroup.getItems().iterator();
            while (it2.hasNext()) {
                arrayList.add(new a((AppItem) it2.next()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h(a group, AppGroupCountCondition condition, int groupCount, a originGroup, int originGroupCount) {
        if ((group.getObj() instanceof AppGroup) && (originGroup.getObj() instanceof AppGroup)) {
            if (((AppGroup) group.getObj()).getGroup() == condition.getGroup() && groupCount >= condition.getMax()) {
                y(condition.getMaxTips());
                return true;
            }
            if (((AppGroup) originGroup.getObj()).getGroup() == condition.getGroup() && originGroupCount <= condition.getMin()) {
                y(condition.getMinTips());
                return true;
            }
        }
        return false;
    }

    private final void i(Function0<Unit> action, Function0<Unit> success, Function0<Unit> failure) {
        this.actionSuccess = success;
        this.actionFailure = failure;
        action.invoke();
    }

    private final void initView() {
        ISortRepo iSortRepoCreateAppSortRepoApi;
        View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        Bundle arguments = getArguments();
        int i = arguments == null ? 0 : arguments.getInt("type");
        AppSortViewModel appSortViewModelN = n();
        if (i == 0) {
            TextView textView = this.titleTv;
            Objects.requireNonNull(textView);
            textView.setText(GlobalConfig.get().isBuildMidong() ? getString(R.string.app_list_manage) : getString(R.string.setting_peyto_apps_title_band));
            iSortRepoCreateAppSortRepoApi = AppSortRepoFactory.INSTANCE.createAppSortRepoApi(DeviceXFunctionsKt.getContext(), (DeviceCenter) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), null, null));
        } else if (i == 1) {
            int i2 = GlobalConfig.get().isBuildMidong() ? R.string.ds_screen_edit : R.string.setting_shotcut_apps_title;
            TextView textView2 = this.titleTv;
            Objects.requireNonNull(textView2);
            textView2.setText(getString(i2));
            iSortRepoCreateAppSortRepoApi = new ScreenEditRepo(DeviceXFunctionsKt.getContext(), (DeviceCenter) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), null, null));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("not support type: " + i);
            }
            TextView textView3 = this.titleTv;
            Objects.requireNonNull(textView3);
            textView3.setText(getString(R.string.ds_control_center_edit));
            iSortRepoCreateAppSortRepoApi = new ControlCenterRepo(DeviceXFunctionsKt.getContext(), (DeviceCenter) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), null, null));
        }
        appSortViewModelN.setRepo(iSortRepoCreateAppSortRepoApi);
        this.dataView = (FixedXRecyclerView) contentView.findViewById(R.id.content_layout);
        Adapter<a> adapter = this.adapter;
        Objects.requireNonNull(adapter);
        adapter.setSafeNotify(new Function1<Function0<? extends Unit>, Unit>() { // from class: com.xiaomi.hm.health.device.setting.appsort.AppSortFragment.initView.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
                invoke2((Function0<Unit>) function0);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final Function0<Unit> function0) {
                FixedXRecyclerView fixedXRecyclerView = AppSortFragment.this.dataView;
                Objects.requireNonNull(fixedXRecyclerView);
                if (fixedXRecyclerView.isComputingLayout()) {
                    fixedXRecyclerView.post(new Runnable() { // from class: com.xiaomi.hm.health.device.setting.appsort.AppSortFragment$initView$2$invoke$$inlined$safeNotify$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            function0.invoke();
                        }
                    });
                } else {
                    function0.invoke();
                }
            }
        });
        final Adapter<a> adapter2 = this.adapter;
        Objects.requireNonNull(adapter2);
        ItemDragListener itemDragListener = new ItemDragListener(adapter2) { // from class: com.xiaomi.hm.health.device.setting.appsort.AppSortFragment$initView$itemDragCallback$1
            @Override // com.zhouyou.recyclerview.listener.ItemDragListener, androidx.recyclerview.widget.ItemTouchHelper.Callback
            public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder source, @NotNull RecyclerView.ViewHolder target) {
                AppSortFragment.Adapter adapter3 = this.f.adapter;
                Objects.requireNonNull(adapter3);
                return adapter3.p(target);
            }
        };
        itemDragListener.setDragMoveFlags(3);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(itemDragListener);
        FixedXRecyclerView fixedXRecyclerView = this.dataView;
        Objects.requireNonNull(fixedXRecyclerView);
        itemTouchHelper.attachToRecyclerView(fixedXRecyclerView);
        Adapter<a> adapter3 = this.adapter;
        Objects.requireNonNull(adapter3);
        adapter3.enableDragItem(itemTouchHelper, R.id.iv_drag, true);
        Adapter<a> adapter4 = this.adapter;
        Objects.requireNonNull(adapter4);
        FixedXRecyclerView fixedXRecyclerView2 = this.dataView;
        Objects.requireNonNull(fixedXRecyclerView2);
        adapter4.setRecyclerView(fixedXRecyclerView2);
        FixedXRecyclerView fixedXRecyclerView3 = this.dataView;
        Objects.requireNonNull(fixedXRecyclerView3);
        fixedXRecyclerView3.setPullRefreshEnabled(false);
        FixedXRecyclerView fixedXRecyclerView4 = this.dataView;
        Objects.requireNonNull(fixedXRecyclerView4);
        fixedXRecyclerView4.setLoadingMoreEnabled(false);
        FixedXRecyclerView fixedXRecyclerView5 = this.dataView;
        Objects.requireNonNull(fixedXRecyclerView5);
        Adapter<a> adapter5 = this.adapter;
        Objects.requireNonNull(adapter5);
        fixedXRecyclerView5.setAdapter(adapter5);
        FixedXRecyclerView fixedXRecyclerView6 = this.dataView;
        Objects.requireNonNull(fixedXRecyclerView6);
        View view = new View(requireContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) ViewUtils.dp2px(view.getContext(), 90.0f)));
        Unit unit = Unit.INSTANCE;
        fixedXRecyclerView6.addFooterView(view);
    }

    public static /* synthetic */ void j(AppSortFragment appSortFragment, Function0 function0, Function0 function1, Function0 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        appSortFragment.actionSuccess = function1;
        appSortFragment.actionFailure = function2;
        function0.invoke();
    }

    private final List<AppGroup> k() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Adapter<a> adapter = this.adapter;
        Objects.requireNonNull(adapter);
        ArrayList arrayList3 = arrayList2;
        AppGroup appGroup = null;
        for (a aVar : adapter.getList()) {
            if (aVar.getObj() instanceof AppGroup) {
                if (appGroup != null) {
                    arrayList.add(AppGroup.copy$default(appGroup, 0, arrayList3, null, 5, null));
                }
                arrayList3 = new ArrayList();
                appGroup = (AppGroup) aVar.getObj();
            } else if (aVar.getObj() instanceof AppItem) {
                arrayList3.add(aVar.getObj());
            }
        }
        if (appGroup != null) {
            arrayList.add(AppGroup.copy$default(appGroup, 0, arrayList3, null, 5, null));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadingDialogHelper l() {
        return (LoadingDialogHelper) this.loadingHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int m() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return 0;
        }
        return arguments.getInt("type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppSortViewModel n() {
        return (AppSortViewModel) this.viewModel.getValue();
    }

    private final void o() {
        this.adapter = new Adapter<>(requireContext(), new Adapter.Movement<a>() { // from class: com.xiaomi.hm.health.device.setting.appsort.AppSortFragment$initAdapter$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ AppSortFragment.a a;
                public final /* synthetic */ AppSortFragment.a b;
                public final /* synthetic */ int c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(AppSortFragment.a aVar, AppSortFragment.a aVar2, int i) {
                    super(0);
                    this.a = aVar;
                    this.b = aVar2;
                    this.c = i;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Check " + this.a.content() + " move to " + this.b.content() + "(" + this.c + ")";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "condition", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function1<Object, Boolean> {
                public final /* synthetic */ AppSortFragment a;
                public final /* synthetic */ AppSortFragment.a b;
                public final /* synthetic */ int c;
                public final /* synthetic */ AppSortFragment.a d;
                public final /* synthetic */ int e;
                public final /* synthetic */ AppSortFragment.a f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(AppSortFragment appSortFragment, AppSortFragment.a aVar, int i, AppSortFragment.a aVar2, int i2, AppSortFragment.a aVar3) {
                    super(1);
                    this.a = appSortFragment;
                    this.b = aVar;
                    this.c = i;
                    this.d = aVar2;
                    this.e = i2;
                    this.f = aVar3;
                }

                /* JADX WARN: Code duplicated, block: B:18:0x0054  */
                public final boolean a(@NotNull Object obj) {
                    boolean z;
                    Function1<Context, Unit> actionWhenCannotHide;
                    if (obj instanceof AppGroupCountCondition) {
                        return this.a.h(this.b, (AppGroupCountCondition) obj, this.c, this.d, this.e);
                    }
                    if (obj instanceof AppHideCondition) {
                        if (((AppGroup) this.b.getObj()).isDisableGroup()) {
                            AppHideCondition appHideCondition = (AppHideCondition) obj;
                            if (((AppItem) this.f.getObj()).getValue() == appHideCondition.getType() && !appHideCondition.getCanDisable()) {
                                return true;
                            }
                        }
                    } else if (obj instanceof ZeppOSHideCondition) {
                        Object obj2 = this.f.getObj();
                        if ((obj2 instanceof IdSortItem) && ((AppGroup) this.b.getObj()).isDisableGroup()) {
                            ZeppOSHideCondition zeppOSHideCondition = (ZeppOSHideCondition) obj;
                            z = Intrinsics.areEqual(((IdSortItem) obj2).getId(), zeppOSHideCondition.getAppID()) && !zeppOSHideCondition.getCanDisable();
                        }
                        AppSortFragment appSortFragment = this.a;
                        if (!z || (actionWhenCannotHide = ((ZeppOSHideCondition) obj).getActionWhenCannotHide()) == null) {
                            return z;
                        }
                        actionWhenCannotHide.invoke(appSortFragment.requireContext());
                        return z;
                    }
                    return false;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                    return Boolean.valueOf(a(obj));
                }
            }

            @Override // com.xiaomi.hm.health.device.setting.appsort.AppSortFragment.Adapter.Movement
            public boolean check(@NotNull AppSortFragment.a item, @NotNull AppSortFragment.a group, int groupCount, @NotNull AppSortFragment.a originGroup, int originGroupCount) {
                HMLog.verbose("AppSortFragment", new a(item, group, groupCount));
                if ((item.getObj() instanceof AppItem) && (group.getObj() instanceof AppGroup)) {
                    b bVar = new b(this.a, group, groupCount, originGroup, originGroupCount, item);
                    List<Object> conditions = this.a.n().getConditions();
                    if (!(conditions == null || conditions.isEmpty())) {
                        Iterator<Object> it2 = conditions.iterator();
                        while (it2.hasNext()) {
                            if (bVar.invoke(it2.next()).booleanValue()) {
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
        }, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p() {
        List<AppGroup> value = n().getDataLiveData().getValue();
        if (value == null) {
            return false;
        }
        List<AppGroup> listK = k();
        if (value.size() != listK.size()) {
            return true;
        }
        int size = value.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                List<AppItem> items = value.get(i).getItems();
                List<AppItem> items2 = listK.get(i).getItems();
                if (items.size() != items2.size()) {
                    return true;
                }
                int size2 = items.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        if (!Intrinsics.areEqual(items.get(i3), items2.get(i3))) {
                            return true;
                        }
                        if (i4 > size2) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                if (i2 <= size) {
                    i = i2;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(AppSortFragment appSortFragment, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        appSortFragment.getBackPressedCallback().setEnabled(false);
        appSortFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(AppSortFragment appSortFragment, List list) {
        appSortFragment.l().hideLoading();
        List<a> listA = appSortFragment.A(list);
        Adapter<a> adapter = appSortFragment.adapter;
        Objects.requireNonNull(adapter);
        adapter.setListAll(listA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(AppSortFragment appSortFragment, Boolean bool) {
        if (bool.booleanValue()) {
            Function0<Unit> function0 = appSortFragment.actionSuccess;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            Function0<Unit> function1 = appSortFragment.actionFailure;
            if (function1 != null) {
                function1.invoke();
            }
        }
        appSortFragment.actionSuccess = null;
        appSortFragment.actionFailure = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(AppSortFragment appSortFragment, View view) {
        appSortFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(AppSortFragment appSortFragment, View view) {
        d dVar = appSortFragment.new d();
        e eVar = appSortFragment.new e();
        appSortFragment.actionSuccess = dVar;
        appSortFragment.actionFailure = eVar;
        appSortFragment.l().showLoading(R.string.saving);
        appSortFragment.n().sync(appSortFragment.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        final int i;
        Adapter<a> adapter = this.adapter;
        Objects.requireNonNull(adapter);
        List<a> list = adapter.getList();
        Iterator<a> it2 = list.iterator();
        final int i2 = 0;
        while (true) {
            i = -1;
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            a next = it2.next();
            if ((next.getObj() instanceof AppGroup) && ((AppGroup) next.getObj()).isMoreGroup()) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = 0;
        for (a aVar : list) {
            if ((aVar.getObj() instanceof AppGroup) && ((AppGroup) aVar.getObj()).isDisableGroup()) {
                i = i3;
                break;
            }
            i3++;
        }
        list.get(i2).c(i2 + 1 == i ? requireContext().getString(R.string.setting_app_more_setting) : null);
        list.get(i).c(i + 1 == list.size() ? requireContext().getString(HMDeviceConfig.hasBoundWatch() ? R.string.invisible_item_app_watch_tips : R.string.invisible_item_app_band_tips) : null);
        FixedXRecyclerView fixedXRecyclerView = this.dataView;
        Objects.requireNonNull(fixedXRecyclerView);
        if (fixedXRecyclerView.isComputingLayout()) {
            fixedXRecyclerView.post(new Runnable() { // from class: com.xiaomi.hm.health.device.setting.appsort.AppSortFragment$refreshAppSortTips$$inlined$safeNotify$1
                @Override // java.lang.Runnable
                public final void run() {
                    AppSortFragment.Adapter adapter2 = this.a.adapter;
                    Objects.requireNonNull(adapter2);
                    adapter2.notifyItemChanged(i2);
                    AppSortFragment.Adapter adapter3 = this.a.adapter;
                    Objects.requireNonNull(adapter3);
                    adapter3.notifyItemChanged(i);
                }
            });
            return;
        }
        Adapter adapter2 = this.adapter;
        Objects.requireNonNull(adapter2);
        adapter2.notifyItemChanged(i2);
        Adapter adapter3 = this.adapter;
        Objects.requireNonNull(adapter3);
        adapter3.notifyItemChanged(i);
    }

    private final void x(RecyclerView recyclerView, final Function0<Unit> function0) {
        if (recyclerView.isComputingLayout()) {
            recyclerView.post(new Runnable() { // from class: com.xiaomi.hm.health.device.setting.appsort.AppSortFragment$safeNotify$1
                @Override // java.lang.Runnable
                public final void run() {
                    function0.invoke();
                }
            });
        } else {
            function0.invoke();
        }
    }

    private final void y(String tips) {
        new AlertDialogFragment.Builder(requireContext()).setMessage(tips).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: fi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AppSortFragment.z(dialogInterface, i);
            }
        }).create().show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(DialogInterface dialogInterface, int i) {
    }

    @Override // com.xiaomi.hm.health.baseui.fragment.BaseNavFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.baseui.fragment.BaseNavFragment
    public boolean onBackPressed() {
        if (!p()) {
            return super.onBackPressed();
        }
        new AlertDialogFragment.Builder(requireContext()).setMessage(R.string.sort_save_cancle).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: gi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AppSortFragment.q(dialogInterface, i);
            }
        }).setPositiveButton(R.string.give_up, new DialogInterface.OnClickListener() { // from class: ei
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AppSortFragment.r(this.a, dialogInterface, i);
            }
        }).create().show(getChildFragmentManager());
        return true;
    }

    @Override // com.xiaomi.hm.health.baseui.fragment.BaseNavFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        o();
        n().getDataLiveData().observe(this, new Observer() { // from class: ki
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AppSortFragment.s(this.a, (List) obj);
            }
        });
        n().getResultLiveData().observe(this, new Observer() { // from class: ji
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AppSortFragment.t(this.a, (Boolean) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentView = getContentView();
        if (contentView == null) {
            contentView = inflater.inflate(R.layout.fragment_app_sort, container, false);
            setContentView(contentView);
            View viewFindViewById = contentView.findViewById(R.id.btn_back);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: hi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AppSortFragment.u(this.a, view);
                    }
                });
            }
            this.titleTv = (TextView) contentView.findViewById(R.id.tv_title);
            TextView textView = (TextView) contentView.findViewById(R.id.tv_btn);
            this.saveBtn = textView;
            Objects.requireNonNull(textView);
            textView.setText(R.string.save);
            TextView textView2 = this.saveBtn;
            Objects.requireNonNull(textView2);
            textView2.setEnabled(false);
            TextView textView3 = this.saveBtn;
            Objects.requireNonNull(textView3);
            textView3.setOnClickListener(new View.OnClickListener() { // from class: ii
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppSortFragment.v(this.a, view);
                }
            });
            initView();
        }
        return contentView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Adapter<a> adapter = this.adapter;
        Objects.requireNonNull(adapter);
        adapter.setSafeNotify(null);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.refreshData) {
            return;
        }
        f fVar = new f();
        this.actionSuccess = null;
        this.actionFailure = fVar;
        this.refreshData = true;
        l().showLoading(R.string.custom_vibrate_loading);
        n().loadData();
    }

    @Override // com.xiaomi.hm.health.baseui.fragment.BaseNavFragment
    @NotNull
    public String tag() {
        return k;
    }
}
