package com.xiaomi.fitness.sport.sporttab.viewholder;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationListener;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.miui.tsmclient.net.TSMAuthContants;
import com.tsmclient.smartcard.CardConstants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.running.group.export.RunningGroupApiKt;
import com.xiaomi.fitness.running.group.export.data.RunningGroupEntranceItemData;
import com.xiaomi.fitness.running.group.export.data.RunningGroupEntranceResult;
import com.xiaomi.fitness.running.group.export.data.RunningGroupFindItemData;
import com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel;
import com.xiaomi.fitness.sport.sporttab.viewholder.RunningGroupViewHolder;
import com.xiaomi.wearable.hm.BroadcastsKt;
import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.export.YRNHelperExtKt;
import defpackage.c1j;
import defpackage.eoi;
import defpackage.g4o;
import defpackage.xri;
import defpackage.zxi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 G2\u00020\u0001:\u0002GHB\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bE\u0010FJ#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u000bJ\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u000bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010,\u001a\n +*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001eR\u001c\u0010-\u001a\n +*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001eR\u001c\u0010.\u001a\n +*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001eR\u001c\u00100\u001a\n +*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00102\u001a\n +*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u001eR\u0016\u00103\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u000609R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010=R\u0016\u0010D\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00104¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lkotlin/Function1;", "", "", "callback", "requestPermission", "(Lkotlin/jvm/functions/Function1;)V", "", "requestLocation", "gotoAllPage", "()V", "goneHolder", TSMAuthContants.PARAM_CITYCODE, "requestEntrance", "(Ljava/lang/String;)V", "visibleHolder", "addScrollListener", "fromScroll", "checkThresholdState", "(Z)V", "resetHintView", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "updateHintView", "(F)V", "bindData", "refresh", "Landroid/view/View;", "holderItemView", "Landroid/view/View;", "getHolderItemView", "()Landroid/view/View;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "mViewModel", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "getMViewModel", "()Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "kotlin.jvm.PlatformType", "container", "all", "bg", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "moreView", "allRouteUrl", "Ljava/lang/String;", "", "Lcom/xiaomi/fitness/running/group/export/data/RunningGroupFindItemData;", "discover", "Ljava/util/List;", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder$RunningGroupEntranceItemAdapter;", "adapter", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder$RunningGroupEntranceItemAdapter;", "atEnd", "Z", "totalDelta", "F", "", "initialTranslation", "I", "scrollEnd", "cacheCityCode", "<init>", "(Landroid/view/View;Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;)V", "Companion", "RunningGroupEntranceItemAdapter", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRunningGroupViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningGroupViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,475:1\n1755#2,3:476\n*S KotlinDebug\n*F\n+ 1 RunningGroupViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder\n*L\n179#1:476,3\n*E\n"})
public final class RunningGroupViewHolder extends RecyclerView.d0 {

    @NotNull
    private static final String TAG = "RunningGroupViewHolder";

    @NotNull
    private final RunningGroupEntranceItemAdapter adapter;
    private final View all;

    @NotNull
    private String allRouteUrl;
    private boolean atEnd;
    private final View bg;

    @NotNull
    private String cacheCityCode;
    private final View container;

    @Nullable
    private List<RunningGroupFindItemData> discover;

    @NotNull
    private final FragmentActivity fragmentActivity;

    @NotNull
    private final View holderItemView;
    private int initialTranslation;

    @NotNull
    private final SportTabV4ViewModel mViewModel;
    private final View moreView;
    private final RecyclerView recyclerView;
    private boolean scrollEnd;
    private float totalDelta;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\n*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0014\u0010\u0011\u001a\u00020\n*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0012\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J \u0010\u0018\u001a\u00020\n2\u000e\u0010\u0019\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0016H\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder$RunningGroupEntranceItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder$RunningGroupEntranceItemAdapter$RunningGroupEntranceItemHolder;", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder;", "<init>", "(Lcom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder;)V", "list", "", "Lcom/xiaomi/fitness/running/group/export/data/RunningGroupEntranceItemData;", "setData", "", "data", "Lcom/xiaomi/fitness/running/group/export/data/RunningGroupEntranceResult;", "safeLoadGroupImage", "Landroidx/constraintlayout/utils/widget/ImageFilterView;", "url", "", "safeLoadFindGroup", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "RunningGroupEntranceItemHolder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRunningGroupViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningGroupViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder$RunningGroupEntranceItemAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,475:1\n54#2,3:476\n24#2:479\n59#2,6:480\n54#2,3:486\n24#2:489\n59#2,6:490\n*S KotlinDebug\n*F\n+ 1 RunningGroupViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder$RunningGroupEntranceItemAdapter\n*L\n443#1:476,3\n443#1:479\n443#1:480,6\n447#1:486,3\n447#1:489\n447#1:490,6\n*E\n"})
    public final class RunningGroupEntranceItemAdapter extends RecyclerView.Adapter<RunningGroupEntranceItemHolder> {

        @NotNull
        private final List<RunningGroupEntranceItemData> list = new ArrayList();

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder$RunningGroupEntranceItemAdapter$RunningGroupEntranceItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fitness/running/group/export/data/RunningGroupFindItemData;", "list", "", "loadFindItemImage", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/running/group/export/data/RunningGroupEntranceItemData;", "data", "onBind", "(Lcom/xiaomi/fitness/running/group/export/data/RunningGroupEntranceItemData;)V", "onClick", "Lg4o;", "binding", "Lg4o;", "<init>", "(Lcom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder$RunningGroupEntranceItemAdapter;Lg4o;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        @SourceDebugExtension({"SMAP\nRunningGroupViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningGroupViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder$RunningGroupEntranceItemAdapter$RunningGroupEntranceItemHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,475:1\n54#2,3:476\n24#2:479\n57#2,6:480\n63#2,2:487\n54#2,3:489\n24#2:492\n57#2,6:493\n63#2,2:500\n54#2,3:502\n24#2:505\n57#2,6:506\n63#2,2:513\n54#2,3:515\n24#2:518\n57#2,6:519\n63#2,2:526\n54#2,3:528\n24#2:531\n57#2,6:532\n63#2,2:539\n54#2,3:541\n24#2:544\n57#2,6:545\n63#2,2:552\n54#2,3:554\n24#2:557\n57#2,6:558\n63#2,2:565\n54#2,3:567\n24#2:570\n57#2,6:571\n63#2,2:578\n54#2,3:580\n24#2:583\n57#2,6:584\n63#2,2:591\n54#2,3:593\n24#2:596\n57#2,6:597\n63#2,2:604\n54#2,3:606\n24#2:609\n57#2,6:610\n63#2,2:617\n57#3:486\n57#3:499\n57#3:512\n57#3:525\n57#3:538\n57#3:551\n57#3:564\n57#3:577\n57#3:590\n57#3:603\n57#3:616\n*S KotlinDebug\n*F\n+ 1 RunningGroupViewHolder.kt\ncom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder$RunningGroupEntranceItemAdapter$RunningGroupEntranceItemHolder\n*L\n362#1:476,3\n362#1:479\n362#1:480,6\n362#1:487,2\n404#1:489,3\n404#1:492\n404#1:493,6\n404#1:500,2\n405#1:502,3\n405#1:505\n405#1:506,6\n405#1:513,2\n406#1:515,3\n406#1:518\n406#1:519,6\n406#1:526,2\n407#1:528,3\n407#1:531\n407#1:532,6\n407#1:539,2\n412#1:541,3\n412#1:544\n412#1:545,6\n412#1:552,2\n413#1:554,3\n413#1:557\n413#1:558,6\n413#1:565,2\n414#1:567,3\n414#1:570\n414#1:571,6\n414#1:578,2\n420#1:580,3\n420#1:583\n420#1:584,6\n420#1:591,2\n421#1:593,3\n421#1:596\n421#1:597,6\n421#1:604,2\n426#1:606,3\n426#1:609\n426#1:610,6\n426#1:617,2\n362#1:486\n404#1:499\n405#1:512\n406#1:525\n407#1:538\n412#1:551\n413#1:564\n414#1:577\n420#1:590\n421#1:603\n426#1:616\n*E\n"})
        public final class RunningGroupEntranceItemHolder extends RecyclerView.d0 {

            @NotNull
            private final g4o binding;
            final /* synthetic */ RunningGroupEntranceItemAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RunningGroupEntranceItemHolder(@NotNull RunningGroupEntranceItemAdapter runningGroupEntranceItemAdapter, g4o binding) {
                super(binding.getRoot());
                Intrinsics.checkNotNullParameter(binding, "binding");
                this.this$0 = runningGroupEntranceItemAdapter;
                this.binding = binding;
            }

            private final void loadFindItemImage(List<RunningGroupFindItemData> list) {
                int size = list.size();
                if (size == 0) {
                    ImageFilterView group1 = this.binding.G;
                    Intrinsics.checkNotNullExpressionValue(group1, "group1");
                    Coil.imageLoader(group1.getContext()).enqueue(new ImageRequest.Builder(group1.getContext()).data(Integer.valueOf(eoi.e0)).target(group1).build());
                    ImageFilterView group2 = this.binding.H;
                    Intrinsics.checkNotNullExpressionValue(group2, "group2");
                    Coil.imageLoader(group2.getContext()).enqueue(new ImageRequest.Builder(group2.getContext()).data(Integer.valueOf(eoi.e0)).target(group2).build());
                    ImageFilterView default1 = this.binding.B;
                    Intrinsics.checkNotNullExpressionValue(default1, "default1");
                    Coil.imageLoader(default1.getContext()).enqueue(new ImageRequest.Builder(default1.getContext()).data(Integer.valueOf(eoi.e0)).target(default1).build());
                    ImageFilterView default2 = this.binding.C;
                    Intrinsics.checkNotNullExpressionValue(default2, "default2");
                    Coil.imageLoader(default2.getContext()).enqueue(new ImageRequest.Builder(default2.getContext()).data(Integer.valueOf(eoi.e0)).target(default2).build());
                    return;
                }
                if (size == 1) {
                    RunningGroupEntranceItemAdapter runningGroupEntranceItemAdapter = this.this$0;
                    ImageFilterView group3 = this.binding.G;
                    Intrinsics.checkNotNullExpressionValue(group3, "group1");
                    runningGroupEntranceItemAdapter.safeLoadFindGroup(group3, list.get(0).getAvatar());
                    ImageFilterView group4 = this.binding.H;
                    Intrinsics.checkNotNullExpressionValue(group4, "group2");
                    Coil.imageLoader(group4.getContext()).enqueue(new ImageRequest.Builder(group4.getContext()).data(Integer.valueOf(eoi.e0)).target(group4).build());
                    ImageFilterView default3 = this.binding.B;
                    Intrinsics.checkNotNullExpressionValue(default3, "default1");
                    Coil.imageLoader(default3.getContext()).enqueue(new ImageRequest.Builder(default3.getContext()).data(Integer.valueOf(eoi.e0)).target(default3).build());
                    ImageFilterView default4 = this.binding.C;
                    Intrinsics.checkNotNullExpressionValue(default4, "default2");
                    Coil.imageLoader(default4.getContext()).enqueue(new ImageRequest.Builder(default4.getContext()).data(Integer.valueOf(eoi.e0)).target(default4).build());
                    return;
                }
                if (size == 2) {
                    RunningGroupEntranceItemAdapter runningGroupEntranceItemAdapter2 = this.this$0;
                    ImageFilterView group5 = this.binding.G;
                    Intrinsics.checkNotNullExpressionValue(group5, "group1");
                    runningGroupEntranceItemAdapter2.safeLoadFindGroup(group5, list.get(0).getAvatar());
                    RunningGroupEntranceItemAdapter runningGroupEntranceItemAdapter3 = this.this$0;
                    ImageFilterView group6 = this.binding.H;
                    Intrinsics.checkNotNullExpressionValue(group6, "group2");
                    runningGroupEntranceItemAdapter3.safeLoadFindGroup(group6, list.get(1).getAvatar());
                    ImageFilterView default5 = this.binding.B;
                    Intrinsics.checkNotNullExpressionValue(default5, "default1");
                    Coil.imageLoader(default5.getContext()).enqueue(new ImageRequest.Builder(default5.getContext()).data(Integer.valueOf(eoi.e0)).target(default5).build());
                    ImageFilterView default6 = this.binding.C;
                    Intrinsics.checkNotNullExpressionValue(default6, "default2");
                    Coil.imageLoader(default6.getContext()).enqueue(new ImageRequest.Builder(default6.getContext()).data(Integer.valueOf(eoi.e0)).target(default6).build());
                    return;
                }
                if (size == 3) {
                    RunningGroupEntranceItemAdapter runningGroupEntranceItemAdapter4 = this.this$0;
                    ImageFilterView group7 = this.binding.G;
                    Intrinsics.checkNotNullExpressionValue(group7, "group1");
                    runningGroupEntranceItemAdapter4.safeLoadFindGroup(group7, list.get(0).getAvatar());
                    ImageFilterView group8 = this.binding.H;
                    Intrinsics.checkNotNullExpressionValue(group8, "group2");
                    Coil.imageLoader(group8.getContext()).enqueue(new ImageRequest.Builder(group8.getContext()).data(Integer.valueOf(eoi.e0)).target(group8).build());
                    RunningGroupEntranceItemAdapter runningGroupEntranceItemAdapter5 = this.this$0;
                    ImageFilterView default7 = this.binding.B;
                    Intrinsics.checkNotNullExpressionValue(default7, "default1");
                    runningGroupEntranceItemAdapter5.safeLoadFindGroup(default7, list.get(1).getAvatar());
                    RunningGroupEntranceItemAdapter runningGroupEntranceItemAdapter6 = this.this$0;
                    ImageFilterView default8 = this.binding.C;
                    Intrinsics.checkNotNullExpressionValue(default8, "default2");
                    runningGroupEntranceItemAdapter6.safeLoadFindGroup(default8, list.get(2).getAvatar());
                    return;
                }
                if (size != 4) {
                    return;
                }
                RunningGroupEntranceItemAdapter runningGroupEntranceItemAdapter7 = this.this$0;
                ImageFilterView group9 = this.binding.G;
                Intrinsics.checkNotNullExpressionValue(group9, "group1");
                runningGroupEntranceItemAdapter7.safeLoadFindGroup(group9, list.get(0).getAvatar());
                RunningGroupEntranceItemAdapter runningGroupEntranceItemAdapter8 = this.this$0;
                ImageFilterView group10 = this.binding.H;
                Intrinsics.checkNotNullExpressionValue(group10, "group2");
                runningGroupEntranceItemAdapter8.safeLoadFindGroup(group10, list.get(1).getAvatar());
                RunningGroupEntranceItemAdapter runningGroupEntranceItemAdapter9 = this.this$0;
                ImageFilterView default9 = this.binding.B;
                Intrinsics.checkNotNullExpressionValue(default9, "default1");
                runningGroupEntranceItemAdapter9.safeLoadFindGroup(default9, list.get(2).getAvatar());
                RunningGroupEntranceItemAdapter runningGroupEntranceItemAdapter10 = this.this$0;
                ImageFilterView default10 = this.binding.C;
                Intrinsics.checkNotNullExpressionValue(default10, "default2");
                runningGroupEntranceItemAdapter10.safeLoadFindGroup(default10, list.get(3).getAvatar());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit onClick$lambda$0(RunningGroupEntranceItemData runningGroupEntranceItemData, Activity activity, RunningGroupEntranceItemHolder this$0, View it) {
                Intrinsics.checkNotNullParameter(activity, "$activity");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (runningGroupEntranceItemData == null) {
                    YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).openPage(activity, "https://m.xiaomi.com/miwear/sport/FindRunGroup");
                    return Unit.INSTANCE;
                }
                if (runningGroupEntranceItemData.getRecommend()) {
                    YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).openPage(activity, "https://m.xiaomi.com/miwear/sport/RunGroupDetail?id=" + runningGroupEntranceItemData.getId() + "&source=workout_tab");
                } else {
                    YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).openPage(activity, "https://m.xiaomi.com/miwear/sport/RunGroupHome?id=" + runningGroupEntranceItemData.getId() + "&source=workout_tab");
                }
                IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
                Pair[] pairArr = new Pair[4];
                pairArr[0] = TuplesKt.to("tip", "56.2.3.1.42836");
                pairArr[1] = TuplesKt.to("type", runningGroupEntranceItemData.getJoin() ? "joined" : "not_joined");
                pairArr[2] = TuplesKt.to("name", "workout_tab_sport_club_module");
                pairArr[3] = TuplesKt.to("position_id", Integer.valueOf(this$0.getBindingAdapterPosition() + 1));
                oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
                return Unit.INSTANCE;
            }

            public final void onBind(@Nullable RunningGroupEntranceItemData data) {
                if (data == null) {
                    ImageFilterView cover = this.binding.A;
                    Intrinsics.checkNotNullExpressionValue(cover, "cover");
                    ViewExtKt.invisible(cover);
                    TextView recommend = this.binding.I;
                    Intrinsics.checkNotNullExpressionValue(recommend, "recommend");
                    ViewExtKt.gone(recommend);
                    Group discover = this.binding.E;
                    Intrinsics.checkNotNullExpressionValue(discover, "discover");
                    ViewExtKt.visible(discover);
                    List<RunningGroupFindItemData> listEmptyList = RunningGroupViewHolder.this.discover;
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    loadFindItemImage(listEmptyList);
                    this.binding.J.setText(c1j.j4);
                    this.binding.D.setText(c1j.i4);
                    return;
                }
                ImageFilterView cover2 = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(cover2, "cover");
                ViewExtKt.visible(cover2);
                Group discover2 = this.binding.E;
                Intrinsics.checkNotNullExpressionValue(discover2, "discover");
                ViewExtKt.invisible(discover2);
                this.binding.J.setText(data.getName());
                TextView recommend2 = this.binding.I;
                Intrinsics.checkNotNullExpressionValue(recommend2, "recommend");
                ViewExtKt.setVisible(recommend2, data.getRecommend());
                if (data.getJoinCount() >= 10000) {
                    this.binding.D.setText(ApplicationExtKt.getApplication().getString(c1j.k4, Float.valueOf(data.getJoinCount() / 10000.0f)));
                } else {
                    this.binding.D.setText(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), zxi.n, data.getJoinCount(), Integer.valueOf(data.getJoinCount())));
                }
                if (data.getAvatar().length() == 0) {
                    ImageFilterView cover3 = this.binding.A;
                    Intrinsics.checkNotNullExpressionValue(cover3, "cover");
                    Coil.imageLoader(cover3.getContext()).enqueue(new ImageRequest.Builder(cover3.getContext()).data(Integer.valueOf(eoi.d0)).target(cover3).build());
                    return;
                }
                RunningGroupEntranceItemAdapter runningGroupEntranceItemAdapter = this.this$0;
                ImageFilterView cover4 = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(cover4, "cover");
                runningGroupEntranceItemAdapter.safeLoadGroupImage(cover4, data.getAvatar());
            }

            public final void onClick(@Nullable final RunningGroupEntranceItemData data) {
                final Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
                if (currentActivity == null) {
                    return;
                }
                ViewExtKt.clickWithTrigger$default(this.binding.getRoot(), 0L, new Function1() { // from class: v1l
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return RunningGroupViewHolder.RunningGroupEntranceItemAdapter.RunningGroupEntranceItemHolder.onClick$lambda$0(data, currentActivity, this, (View) obj);
                    }
                }, 1, null);
            }
        }

        public RunningGroupEntranceItemAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void safeLoadFindGroup(ImageFilterView imageFilterView, String str) {
            ImageLoader imageLoader = Coil.imageLoader(imageFilterView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageFilterView.getContext()).data(str).target(imageFilterView);
            builderTarget.error(eoi.e0);
            imageLoader.enqueue(builderTarget.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void safeLoadGroupImage(ImageFilterView imageFilterView, String str) {
            ImageLoader imageLoader = Coil.imageLoader(imageFilterView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageFilterView.getContext()).data(str).target(imageFilterView);
            builderTarget.error(eoi.d0);
            imageLoader.enqueue(builderTarget.build());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return this.list.size();
        }

        public final void setData(@NotNull RunningGroupEntranceResult data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.list.clear();
            List<RunningGroupEntranceItemData> list = this.list;
            List<RunningGroupEntranceItemData> list2 = data.getList();
            if (list2 == null) {
                list2 = CollectionsKt__CollectionsKt.emptyList();
            }
            list.addAll(list2);
            if (data.getDiscover() != null) {
                this.list.add(null);
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RunningGroupEntranceItemHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            RunningGroupEntranceItemData runningGroupEntranceItemData = this.list.get(position);
            holder.onBind(runningGroupEntranceItemData);
            holder.onClick(runningGroupEntranceItemData);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RunningGroupEntranceItemHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            g4o g4oVarA0 = g4o.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(g4oVarA0, "inflate(...)");
            return new RunningGroupEntranceItemHolder(this, g4oVarA0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunningGroupViewHolder(@NotNull View holderItemView, @NotNull FragmentActivity fragmentActivity, @NotNull SportTabV4ViewModel mViewModel) {
        super(holderItemView);
        Intrinsics.checkNotNullParameter(holderItemView, "holderItemView");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        this.holderItemView = holderItemView;
        this.fragmentActivity = fragmentActivity;
        this.mViewModel = mViewModel;
        this.container = holderItemView.findViewById(xri.o0);
        this.all = holderItemView.findViewById(xri.m);
        this.bg = holderItemView.findViewById(xri.w8);
        this.recyclerView = (RecyclerView) holderItemView.findViewById(xri.d2);
        this.moreView = holderItemView.findViewById(xri.f6);
        this.allRouteUrl = "";
        this.adapter = new RunningGroupEntranceItemAdapter();
        this.cacheCityCode = "";
    }

    private final void addScrollListener() {
        View view = this.moreView;
        if (view != null) {
            view.post(new Runnable() { // from class: m1l
                @Override // java.lang.Runnable
                public final void run() {
                    RunningGroupViewHolder.addScrollListener$lambda$10(this.f25652a);
                }
            });
        }
        final GestureDetector gestureDetector = new GestureDetector(this.fragmentActivity, new GestureDetector.SimpleOnGestureListener() { // from class: com.xiaomi.fitness.sport.sporttab.viewholder.RunningGroupViewHolder$addScrollListener$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                Intrinsics.checkNotNullParameter(e2, "e2");
                if (!this.this$0.atEnd || distanceX <= 0.0f) {
                    return false;
                }
                this.this$0.totalDelta += distanceX;
                this.this$0.updateHintView(RangesKt___RangesKt.coerceAtMost(this.this$0.totalDelta / this.this$0.initialTranslation, 1.0f));
                if (this.this$0.totalDelta >= this.this$0.initialTranslation) {
                    this.this$0.scrollEnd = true;
                }
                return true;
            }
        });
        this.recyclerView.addOnItemTouchListener(new RecyclerView.x() { // from class: com.xiaomi.fitness.sport.sporttab.viewholder.RunningGroupViewHolder.addScrollListener.2
            @Override // androidx.recyclerview.widget.RecyclerView.x, androidx.recyclerview.widget.RecyclerView.r
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                ViewParent parent;
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e, "e");
                if (!RunningGroupViewHolder.this.atEnd) {
                    return false;
                }
                if (e.getActionMasked() == 0 && (parent = rv.getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                return gestureDetector.onTouchEvent(e);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.x, androidx.recyclerview.widget.RecyclerView.r
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e, "e");
                if (RunningGroupViewHolder.this.atEnd) {
                    if (e.getActionMasked() == 2) {
                        gestureDetector.onTouchEvent(e);
                    } else if (e.getActionMasked() == 1 && RunningGroupViewHolder.this.scrollEnd) {
                        RunningGroupViewHolder.this.gotoAllPage();
                        RunningGroupViewHolder.this.scrollEnd = false;
                    }
                }
                if (RunningGroupViewHolder.this.atEnd && e.getActionMasked() == 2) {
                    gestureDetector.onTouchEvent(e);
                }
            }
        });
        this.recyclerView.addOnScrollListener(new RecyclerView.s() { // from class: com.xiaomi.fitness.sport.sporttab.viewholder.RunningGroupViewHolder.addScrollListener.3
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == 1) {
                    RunningGroupViewHolder.this.checkThresholdState(false);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.s
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                RunningGroupViewHolder.this.checkThresholdState(true);
            }
        });
        this.recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: n1l
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return RunningGroupViewHolder.addScrollListener$lambda$11(gestureDetector, this, view2, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addScrollListener$lambda$10(RunningGroupViewHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.moreView;
        int width = (view != null ? view.getWidth() : 0) + ExtUtilsKt.getDp(18);
        this$0.initialTranslation = width;
        this$0.moreView.setTranslationX(width);
        this$0.moreView.setAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addScrollListener$lambda$11(GestureDetector gestureDetector, RunningGroupViewHolder this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(gestureDetector, "$gestureDetector");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean zOnTouchEvent = gestureDetector.onTouchEvent(motionEvent);
        if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && this$0.atEnd) {
            this$0.resetHintView();
        }
        return zOnTouchEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindData$lambda$0(RunningGroupViewHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.2.3.1.42836"), TuplesKt.to("name", "workout_tab_sport_club_module"), TuplesKt.to("position_id", -1)));
        this$0.gotoAllPage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindData$lambda$1(RunningGroupViewHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.2.3.1.42836"), TuplesKt.to("type", "default"), TuplesKt.to("name", "workout_tab_sport_club_module"), TuplesKt.to("position_id", Integer.valueOf(CardConstants.RESULT_INVALID))));
        this$0.gotoAllPage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkThresholdState(boolean fromScroll) {
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        boolean z = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == this.adapter.getCount() - 1;
        this.atEnd = z;
        if (z) {
            return;
        }
        resetHintView();
    }

    private final void goneHolder() {
        View container = this.container;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        ViewExtKt.gone(container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gotoAllPage() {
        try {
            if (this.allRouteUrl.length() == 0) {
                this.allRouteUrl = "https://m.xiaomi.com/miwear/sport/FindRunGroup";
            }
            YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).openPage(this.fragmentActivity, this.allRouteUrl);
        } catch (Exception e) {
            e.printStackTrace();
            Logger.e(TAG, "allRouteUrl route fail: " + e);
        }
    }

    private final void requestEntrance(String cityCode) {
        RunningGroupApiKt.getRunningGroupApi().getRunningGroupEntrance(cityCode, new Function1() { // from class: k1l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RunningGroupViewHolder.requestEntrance$lambda$7(this.f23329a, (RunningGroupEntranceResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0087 A[EDGE_INSN: B:19:0x0087->B:20:0x0088 BREAK  A[LOOP:0: B:14:0x0073->B:28:?]] */
    public static final Unit requestEntrance$lambda$7(RunningGroupViewHolder this$0, RunningGroupEntranceResult runningGroupEntranceResult) {
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View container = this$0.container;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        ViewExtKt.visible(container);
        if (runningGroupEntranceResult == null) {
            View bg = this$0.bg;
            Intrinsics.checkNotNullExpressionValue(bg, "bg");
            ViewExtKt.visible(bg);
            RecyclerView recyclerView = this$0.recyclerView;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            ViewExtKt.gone(recyclerView);
            this$0.allRouteUrl = "https://m.xiaomi.com/miwear/sport/FindRunGroup";
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.2.3.1.42830"), TuplesKt.to("type", "default"), TuplesKt.to("name", "workout_tab_sport_club_module")));
            return Unit.INSTANCE;
        }
        List<RunningGroupEntranceItemData> list = runningGroupEntranceResult.getList();
        if (list == null) {
            z = false;
            break;
        }
        List<RunningGroupEntranceItemData> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((RunningGroupEntranceItemData) it.next()).getJoin()) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("tip", "56.2.3.1.42830");
        pairArr[1] = TuplesKt.to("type", z ? "joined" : "not_joined");
        pairArr[2] = TuplesKt.to("name", "workout_tab_sport_club_module");
        oneTrackExtKt.reportData("expose_v3", MapsKt__MapsKt.mapOf(pairArr));
        View bg2 = this$0.bg;
        Intrinsics.checkNotNullExpressionValue(bg2, "bg");
        ViewExtKt.gone(bg2);
        RecyclerView recyclerView2 = this$0.recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
        ViewExtKt.visible(recyclerView2);
        this$0.recyclerView.setAdapter(this$0.adapter);
        this$0.recyclerView.setLayoutManager(new LinearLayoutManager(ApplicationExtKt.getApplication(), 0, false));
        this$0.adapter.setData(runningGroupEntranceResult);
        this$0.allRouteUrl = runningGroupEntranceResult.getUrl();
        this$0.discover = runningGroupEntranceResult.getDiscover();
        this$0.addScrollListener();
        return Unit.INSTANCE;
    }

    private final void requestLocation(final Function1<? super String, Unit> callback) {
        AMapLocationClient.updatePrivacyShow(ApplicationExtKt.getApplication(), true, true);
        AMapLocationClient.updatePrivacyAgree(ApplicationExtKt.getApplication(), true);
        final AMapLocationClient aMapLocationClient = new AMapLocationClient(ApplicationExtKt.getApplication());
        aMapLocationClient.setLocationListener(new AMapLocationListener() { // from class: s1l
            @Override // com.amap.api.location.AMapLocationListener
            public final void onLocationChanged(AMapLocation aMapLocation) {
                RunningGroupViewHolder.requestLocation$lambda$5(this.f33172a, callback, aMapLocationClient, aMapLocation);
            }
        });
        aMapLocationClient.startLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestLocation$lambda$5(RunningGroupViewHolder this$0, Function1 callback, AMapLocationClient mLocationClient, AMapLocation aMapLocation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(mLocationClient, "$mLocationClient");
        Logger.i(TAG, "AMapLocationListener get location: " + aMapLocation.getCityCode());
        this$0.cacheCityCode = aMapLocation.getCityCode();
        String cityCode = aMapLocation.getCityCode();
        Intrinsics.checkNotNullExpressionValue(cityCode, "getCityCode(...)");
        callback.invoke2(cityCode);
        mLocationClient.stopLocation();
        mLocationClient.onDestroy();
    }

    private final void requestPermission(final Function1<? super Boolean, Unit> callback) {
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity == null) {
            return;
        }
        PermissionExtKt.permission(fragmentActivity, "android.permission.ACCESS_FINE_LOCATION", ResourceExtKt.getString(c1j.l4), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: t1l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RunningGroupViewHolder.requestPermission$lambda$4(callback, (PermissionBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$4(final Function1 callback, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: p1l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RunningGroupViewHolder.requestPermission$lambda$4$lambda$2(callback, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: q1l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RunningGroupViewHolder.requestPermission$lambda$4$lambda$3(callback, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$4$lambda$2(Function1 callback, String it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        callback.invoke2(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$4$lambda$3(Function1 callback, String it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        callback.invoke2(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    private final void resetHintView() {
        this.totalDelta = 0.0f;
        View view = this.moreView;
        if (view != null) {
            view.setTranslationX(this.initialTranslation);
        }
        View view2 = this.moreView;
        if (view2 != null) {
            view2.setAlpha(0.0f);
        }
        this.recyclerView.setTranslationX(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHintView(float progress) {
        float f = this.initialTranslation * (1 - progress);
        View view = this.moreView;
        if (view != null) {
            view.setTranslationX(f);
        }
        this.recyclerView.setTranslationX(-(this.initialTranslation * progress));
        View view2 = this.moreView;
        if (view2 != null) {
            view2.setAlpha(progress);
        }
    }

    private final void visibleHolder() {
        requestPermission(new Function1() { // from class: r1l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RunningGroupViewHolder.visibleHolder$lambda$9(this.f32081a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit visibleHolder$lambda$9(final RunningGroupViewHolder this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.requestLocation(new Function1() { // from class: o1l
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RunningGroupViewHolder.visibleHolder$lambda$9$lambda$8(this.f28648a, (String) obj);
                }
            });
        } else {
            this$0.requestEntrance("010");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit visibleHolder$lambda$9$lambda$8(RunningGroupViewHolder this$0, String cityCode) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cityCode, "cityCode");
        this$0.requestEntrance(cityCode);
        return Unit.INSTANCE;
    }

    public final void bindData() {
        AppUtil appUtil = AppUtil.INSTANCE;
        if (!appUtil.isPlayChannel() && AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            visibleHolder();
            ViewExtKt.clickWithTrigger$default(this.all, 0L, new Function1() { // from class: u1l
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RunningGroupViewHolder.bindData$lambda$0(this.f35279a, (View) obj);
                }
            }, 1, null);
            ViewExtKt.clickWithTrigger$default(this.bg, 0L, new Function1() { // from class: l1l
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RunningGroupViewHolder.bindData$lambda$1(this.f24531a, (View) obj);
                }
            }, 1, null);
            return;
        }
        Logger.d(TAG, "gone view holder " + appUtil.isPlayChannel() + "  " + AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin());
        goneHolder();
    }

    @NotNull
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    @NotNull
    public final View getHolderItemView() {
        return this.holderItemView;
    }

    @NotNull
    public final SportTabV4ViewModel getMViewModel() {
        return this.mViewModel;
    }

    public final void refresh() {
        if (PermissionsUtil.INSTANCE.checkPermission("android.permission.ACCESS_FINE_LOCATION") && this.cacheCityCode.length() != 0) {
            requestEntrance(this.cacheCityCode);
        }
    }
}
