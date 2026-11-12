package com.xiaomi.fitness.device.manager.ui.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.NestRecyclerViewItemEffectiveExposeBiz;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.example.statistics.export.TrackContentBean;
import com.mibi.sdk.component.Constants;
import com.miui.circulate.device.api.Constant;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.DevicePreference;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceFaceEntranceViewV4;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.dui;
import defpackage.l86;
import defpackage.pyi;
import defpackage.uzi;
import defpackage.xqi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 22\u00020\u0001:\u000212B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0014\u0010 \u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"J\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0015J\u000e\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001bJ\b\u0010*\u001a\u00020\u001dH\u0002J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020\u001dH\u0002J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u0017H\u0002J\b\u00100\u001a\u00020\u001dH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceFaceEntranceViewV4;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "moreView", "title", "Landroid/widget/TextView;", "countTitle", "redPoint", "Landroid/widget/ImageView;", "adapter", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceFaceEntranceViewV4$DeviceFaceEntranceAdapter;", "atEnd", "", "totalDelta", "", "initialTranslation", "scrollEnd", "loadTime", "", "setTitle", "", "type", "", "setIconList", "list", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "setRecentOnlineCount", "count", "showRedPoint", "show", "setLoadTime", "time", "addScrollListener", "checkThresholdState", "fromScroll", "resetHintView", "updateHintView", BroadcastsKt.SILENT_PUSHING_PROGRESS, "gotoMarket", "DeviceFaceEntranceAdapter", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceFaceEntranceViewV4 extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final DeviceFaceEntranceAdapter adapter;
    private boolean atEnd;

    @NotNull
    private final TextView countTitle;
    private int initialTranslation;
    private long loadTime;

    @Nullable
    private ConstraintLayout moreView;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final ImageView redPoint;
    private boolean scrollEnd;

    @NotNull
    private final TextView title;
    private float totalDelta;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceFaceEntranceViewV4$Companion;", "", "<init>", "()V", "setTitle", "", "view", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceFaceEntranceViewV4;", "title", "", "setIconList", "list", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "setRecentOnlineCount", "count", "", "setRedPoint", "show", "", "setLoadTime", "time", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void setIconList(@NotNull DeviceFaceEntranceViewV4 view, @NotNull List<FaceData> list) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(list, "list");
            view.setIconList(list);
        }

        @JvmStatic
        public final void setLoadTime(@NotNull DeviceFaceEntranceViewV4 view, long time) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setLoadTime(time);
        }

        @JvmStatic
        public final void setRecentOnlineCount(@NotNull DeviceFaceEntranceViewV4 view, int count) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setRecentOnlineCount(count);
        }

        @JvmStatic
        public final void setRedPoint(@NotNull DeviceFaceEntranceViewV4 view, boolean show) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.showRedPoint(show);
        }

        @JvmStatic
        public final void setTitle(@NotNull DeviceFaceEntranceViewV4 view, @NotNull String title) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(title, "title");
            view.setTitle(title);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fJ \u0010\r\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J \u0010\u0013\u001a\u00020\n2\u000e\u0010\u0014\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceFaceEntranceViewV4$DeviceFaceEntranceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceFaceEntranceViewV4$DeviceFaceEntranceAdapter$DeviceFaceEntranceHolder;", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceFaceEntranceViewV4;", "<init>", "(Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceFaceEntranceViewV4;)V", "iconList", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "setIconList", "", "list", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "DeviceFaceEntranceHolder", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DeviceFaceEntranceAdapter extends RecyclerView.Adapter<DeviceFaceEntranceHolder> {

        @NotNull
        private final List<FaceData> iconList = new ArrayList();

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceFaceEntranceViewV4$DeviceFaceEntranceAdapter$DeviceFaceEntranceHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "data", "", "onBind", "(ILcom/xiaomi/fitness/watch/face/export/data/FaceData;)V", "onClick", "(I)V", "Ll86;", "binding", "Ll86;", "<init>", "(Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceFaceEntranceViewV4$DeviceFaceEntranceAdapter;Ll86;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        @SourceDebugExtension({"SMAP\nDeviceFaceEntranceViewV4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFaceEntranceViewV4.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceFaceEntranceViewV4$DeviceFaceEntranceAdapter$DeviceFaceEntranceHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1557#2:382\n1628#2,3:383\n1557#2:386\n1628#2,3:387\n*S KotlinDebug\n*F\n+ 1 DeviceFaceEntranceViewV4.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceFaceEntranceViewV4$DeviceFaceEntranceAdapter$DeviceFaceEntranceHolder\n*L\n270#1:382\n270#1:383,3\n271#1:386\n271#1:387,3\n*E\n"})
        public final class DeviceFaceEntranceHolder extends RecyclerView.d0 {

            @NotNull
            private final l86 binding;
            final /* synthetic */ DeviceFaceEntranceAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeviceFaceEntranceHolder(@NotNull DeviceFaceEntranceAdapter deviceFaceEntranceAdapter, l86 binding) {
                super(binding.getRoot());
                Intrinsics.checkNotNullParameter(binding, "binding");
                this.this$0 = deviceFaceEntranceAdapter;
                this.binding = binding;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void onClick$lambda$4(FaceData data, int i, DeviceFaceEntranceHolder this$0, View view) {
                Intrinsics.checkNotNullParameter(data, "$data");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel == null) {
                    return;
                }
                if (!wearableDeviceModel.getIsDeviceConnected()) {
                    ToastExtKt.toastShort(ApplicationExtKt.getApplication(), uzi.o1);
                    return;
                }
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.51.0.1.36390"), "name", "Device_page_Dialmarket_btname", "type", "device_tab", "subtype", "2", "asset_id", data.getId(), OneTrack.Param.ASSET_NAME, data.getDisplay_name(), "watchface_position_id", Integer.valueOf(i + 1));
                FaceHelper faceHelperExtKt = FaceHelperExtKt.getInstance(FaceHelper.INSTANCE);
                Context context = this$0.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                faceHelperExtKt.gotoFaceFromDeviceTab(context, data, i);
            }

            public final void onBind(int position, @NotNull FaceData data) {
                Collection collectionEmptyList;
                Collection collectionEmptyList2;
                Intrinsics.checkNotNullParameter(data, "data");
                int dp = ExtUtilsKt.getDp(76);
                int i = (FaceIcon.INFO_WIDTH * dp) / FaceIcon.INFO_HEIGHT;
                int i2 = (int) ((FaceIcon.INFO_RADIUS * dp) / FaceIcon.INFO_HEIGHT);
                ViewGroup.LayoutParams layoutParams = this.binding.A.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = dp;
                FaceHelper faceHelperExtKt = FaceHelperExtKt.getInstance(FaceHelper.INSTANCE);
                ImageView icon = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(icon, "icon");
                faceHelperExtKt.loadFace(icon, data.getIcon(), i, dp, i2);
                this.binding.B.setText(data.getDisplay_name());
                String str = data.getContentSource() == 3 ? "manual_operation" : "recommend_strategy";
                Pair[] pairArr = new Pair[12];
                pairArr[0] = TuplesKt.to("asset_id", data.getId());
                pairArr[1] = TuplesKt.to(OneTrack.Param.ASSET_NAME, data.getDisplay_name());
                pairArr[2] = TuplesKt.to(Constants.KEY_PRICE, Long.valueOf(data.getPrice()));
                pairArr[3] = TuplesKt.to("content_source", str);
                pairArr[4] = TuplesKt.to("expose_source", "watchface_market_entrance");
                int i3 = position + 1;
                pairArr[5] = TuplesKt.to("watchface_position_id", Integer.valueOf(i3));
                pairArr[6] = TuplesKt.to("source", "watchface_market_entrance");
                List<FaceData.Tag> tag_list = data.getTag_list();
                if (tag_list != null) {
                    List<FaceData.Tag> list = tag_list;
                    collectionEmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        collectionEmptyList.add(((FaceData.Tag) it.next()).getTag_id());
                    }
                } else {
                    collectionEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                pairArr[7] = TuplesKt.to(FeedbackConstants.KEY_TAG_ID, collectionEmptyList);
                List<FaceData.Tag> tag_list2 = data.getTag_list();
                if (tag_list2 != null) {
                    List<FaceData.Tag> list2 = tag_list2;
                    collectionEmptyList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        collectionEmptyList2.add(((FaceData.Tag) it2.next()).getTag_name());
                    }
                } else {
                    collectionEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                }
                pairArr[8] = TuplesKt.to("tag_name", collectionEmptyList2);
                FaceData.Category category = data.getCategory();
                pairArr[9] = TuplesKt.to("category_id", category != null ? category.getId() : null);
                FaceData.Category category2 = data.getCategory();
                pairArr[10] = TuplesKt.to("category_name", category2 != null ? category2.getName() : null);
                pairArr[11] = TuplesKt.to("watchface_type", Integer.valueOf(data.isPurchaseFace() ? 1 : 2));
                Map mapMutableMapOf = MapsKt__MapsKt.mutableMapOf(pairArr);
                String id = data.getId();
                mapMutableMapOf.put("tip", "56.0.0.0.39956");
                mapMutableMapOf.put("name", "watchface_single");
                Unit unit = Unit.INSTANCE;
                this.binding.A.setTag(new TrackContentBean(id, false, "expose_v3", MapsKt__MapsKt.toMap(mapMutableMapOf), 0.0f, 16, null));
                IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
                DeviceFaceEntranceViewV4 deviceFaceEntranceViewV4 = DeviceFaceEntranceViewV4.this;
                mapMutableMapOf.put("tip", "56.82.0.1.41529");
                mapMutableMapOf.put("duration_msec", Long.valueOf(System.currentTimeMillis() - deviceFaceEntranceViewV4.loadTime));
                mapMutableMapOf.put("name", "watchface_loading_time");
                oneTrackExtKt.reportData(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, MapsKt__MapsKt.toMap(mapMutableMapOf));
                this.binding.getRoot().setContentDescription(DeviceFaceEntranceViewV4.this.getContext().getResources().getQuantityString(pyi.d, this.this$0.iconList.size(), data.getDisplay_name(), Integer.valueOf(i3), Integer.valueOf(this.this$0.iconList.size())));
            }

            public final void onClick(final int position) {
                final FaceData faceData = (FaceData) this.this$0.iconList.get(position);
                this.binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: m46
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DeviceFaceEntranceViewV4.DeviceFaceEntranceAdapter.DeviceFaceEntranceHolder.onClick$lambda$4(faceData, position, this, view);
                    }
                });
            }
        }

        public DeviceFaceEntranceAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return this.iconList.size();
        }

        public final void setIconList(@NotNull List<FaceData> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.iconList.clear();
            this.iconList.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull DeviceFaceEntranceHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.onBind(position, this.iconList.get(position));
            holder.onClick(position);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public DeviceFaceEntranceHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            l86 l86VarA0 = l86.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(l86VarA0, "inflate(...)");
            return new DeviceFaceEntranceHolder(this, l86VarA0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceFaceEntranceViewV4(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addScrollListener() {
        ConstraintLayout constraintLayout = this.moreView;
        if (constraintLayout != null) {
            constraintLayout.post(new Runnable() { // from class: k46
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceFaceEntranceViewV4.addScrollListener$lambda$0(this.f23417a);
                }
            });
        }
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceFaceEntranceViewV4$addScrollListener$gestureDetector$1
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
        this.recyclerView.addOnItemTouchListener(new RecyclerView.x() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceFaceEntranceViewV4.addScrollListener.2
            @Override // androidx.recyclerview.widget.RecyclerView.x, androidx.recyclerview.widget.RecyclerView.r
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                ViewParent parent;
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e, "e");
                if (!DeviceFaceEntranceViewV4.this.atEnd) {
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
                if (DeviceFaceEntranceViewV4.this.atEnd) {
                    if (e.getActionMasked() == 2) {
                        gestureDetector.onTouchEvent(e);
                    } else if (e.getActionMasked() == 1 && DeviceFaceEntranceViewV4.this.scrollEnd) {
                        DeviceFaceEntranceViewV4.this.gotoMarket();
                        DeviceFaceEntranceViewV4.this.scrollEnd = false;
                    }
                }
                if (DeviceFaceEntranceViewV4.this.atEnd && e.getActionMasked() == 2) {
                    gestureDetector.onTouchEvent(e);
                }
            }
        });
        this.recyclerView.addOnScrollListener(new RecyclerView.s() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceFaceEntranceViewV4.addScrollListener.3
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == 1) {
                    DeviceFaceEntranceViewV4.this.checkThresholdState(false);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.s
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                DeviceFaceEntranceViewV4.this.checkThresholdState(true);
            }
        });
        this.recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: l46
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DeviceFaceEntranceViewV4.addScrollListener$lambda$1(gestureDetector, this, view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addScrollListener$lambda$0(DeviceFaceEntranceViewV4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ConstraintLayout constraintLayout = this$0.moreView;
        int width = (constraintLayout != null ? constraintLayout.getWidth() : 0) + ExtUtilsKt.getDp(18);
        this$0.initialTranslation = width;
        ConstraintLayout constraintLayout2 = this$0.moreView;
        if (constraintLayout2 != null) {
            constraintLayout2.setTranslationX(width);
        }
        ConstraintLayout constraintLayout3 = this$0.moreView;
        if (constraintLayout3 != null) {
            constraintLayout3.setAlpha(0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addScrollListener$lambda$1(GestureDetector gestureDetector, DeviceFaceEntranceViewV4 this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(gestureDetector, "$gestureDetector");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean zOnTouchEvent = gestureDetector.onTouchEvent(motionEvent);
        if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && this$0.atEnd) {
            this$0.resetHintView();
        }
        return zOnTouchEvent;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void gotoMarket() {
        if (!DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).isConnected()) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), uzi.o1);
            return;
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.51.0.1.36390"), "name", "Device_page_Dialmarket_btname", "type", "device_tab", "subtype", "1");
        FaceHelper faceHelperExtKt = FaceHelperExtKt.getInstance(FaceHelper.INSTANCE);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        faceHelperExtKt.gotoFacePage(context, (!DeviceFaceEntranceItemKt.getTabFaceEntranceItem().getRedPoint().get() || DeviceFaceEntranceItemKt.getTabFaceEntranceItem().getNewRoute().length() <= 0) ? "" : DeviceFaceEntranceItemKt.getTabFaceEntranceItem().getNewRoute());
        resetHintView();
    }

    private final void resetHintView() {
        this.totalDelta = 0.0f;
        ConstraintLayout constraintLayout = this.moreView;
        if (constraintLayout != null) {
            constraintLayout.setTranslationX(this.initialTranslation);
        }
        ConstraintLayout constraintLayout2 = this.moreView;
        if (constraintLayout2 != null) {
            constraintLayout2.setAlpha(0.0f);
        }
        this.recyclerView.setTranslationX(0.0f);
    }

    @JvmStatic
    public static final void setIconList(@NotNull DeviceFaceEntranceViewV4 deviceFaceEntranceViewV4, @NotNull List<FaceData> list) {
        INSTANCE.setIconList(deviceFaceEntranceViewV4, list);
    }

    @JvmStatic
    public static final void setLoadTime(@NotNull DeviceFaceEntranceViewV4 deviceFaceEntranceViewV4, long j) {
        INSTANCE.setLoadTime(deviceFaceEntranceViewV4, j);
    }

    @JvmStatic
    public static final void setRecentOnlineCount(@NotNull DeviceFaceEntranceViewV4 deviceFaceEntranceViewV4, int i) {
        INSTANCE.setRecentOnlineCount(deviceFaceEntranceViewV4, i);
    }

    @JvmStatic
    public static final void setRedPoint(@NotNull DeviceFaceEntranceViewV4 deviceFaceEntranceViewV4, boolean z) {
        INSTANCE.setRedPoint(deviceFaceEntranceViewV4, z);
    }

    @JvmStatic
    public static final void setTitle(@NotNull DeviceFaceEntranceViewV4 deviceFaceEntranceViewV4, @NotNull String str) {
        INSTANCE.setTitle(deviceFaceEntranceViewV4, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateHintView(float progress) {
        float f = this.initialTranslation * (1 - progress);
        ConstraintLayout constraintLayout = this.moreView;
        if (constraintLayout != null) {
            constraintLayout.setTranslationX(f);
        }
        this.recyclerView.setTranslationX(-(this.initialTranslation * progress));
        ConstraintLayout constraintLayout2 = this.moreView;
        if (constraintLayout2 != null) {
            constraintLayout2.setAlpha(progress);
        }
    }

    public final void showRedPoint(boolean show) {
        ViewExtKt.setVisible(this.redPoint, show);
        if (show) {
            return;
        }
        this.countTitle.setText(uzi.Y0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceFaceEntranceViewV4(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setIconList(@NotNull List<FaceData> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.adapter.setIconList(list);
    }

    public final void setLoadTime(long time) {
        this.loadTime = time;
    }

    public final void setRecentOnlineCount(int count) {
        if (count >= 0 && count < 5) {
            this.countTitle.setText(uzi.Y0);
        } else if (5 > count || count >= 100) {
            this.countTitle.setText(uzi.Z0);
        } else {
            this.countTitle.setText(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), pyi.c, count, Integer.valueOf(count)));
        }
    }

    public final void setTitle(@NotNull String type) {
        int i;
        Intrinsics.checkNotNullParameter(type, "type");
        TextView textView = this.title;
        if (DevicePreference.INSTANCE.getFACE_ENTRANCE_TITLE()) {
            i = uzi.b1;
        } else {
            i = Intrinsics.areEqual(type, Constant.DeviceType.WATCH) ? uzi.a1 : uzi.I0;
        }
        textView.setText(ResourceExtKt.getString(i));
    }

    public /* synthetic */ DeviceFaceEntranceViewV4(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DeviceFaceEntranceViewV4(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = View.inflate(context, dui.K, this);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(xqi.b0);
        this.recyclerView = recyclerView;
        this.moreView = (ConstraintLayout) viewInflate.findViewById(xqi.C0);
        this.title = (TextView) viewInflate.findViewById(xqi.c0);
        this.countTitle = (TextView) viewInflate.findViewById(xqi.a0);
        this.redPoint = (ImageView) viewInflate.findViewById(xqi.o0);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        DeviceFaceEntranceAdapter deviceFaceEntranceAdapter = new DeviceFaceEntranceAdapter();
        this.adapter = deviceFaceEntranceAdapter;
        recyclerView.setAdapter(deviceFaceEntranceAdapter);
        NestRecyclerViewItemEffectiveExposeBiz.startTrackItemExpose$default(new NestRecyclerViewItemEffectiveExposeBiz(), recyclerView, 0, null, 6, null);
        addScrollListener();
    }
}
