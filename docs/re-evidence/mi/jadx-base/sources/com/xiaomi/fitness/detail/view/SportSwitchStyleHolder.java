package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.detail.video.share.adapter.PatternStyleAdapter;
import com.xiaomi.fitness.detail.video.share.model.StyleItem;
import com.xiaomi.fitness.detail.video.share.util.SportTraceConstants;
import com.xiaomi.fitness.detail.video.share.util.SportTraceVideoShareUtilKt;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResUtilExtKt;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.j1j;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0001(B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0016\u001a\u00020\u0017J@\u0010\u0018\u001a\u00020\u001728\u0010\u0019\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001aJF\u0010\u001f\u001a\u00020\u00172>\u0010\u0019\u001a:\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000b0 ¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001aJ\u001e\u0010\"\u001a\u00020\u000b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0 2\u0006\u0010%\u001a\u00020\tH\u0002J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\tH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportSwitchStyleHolder;", "", "context", "Landroid/content/Context;", "styleView", "Landroid/view/View;", "isMapStyle", "", "currentStyle", "", "currentIndex", "", "<init>", "(Landroid/content/Context;Landroid/view/View;ZLjava/lang/String;I)V", "getContext", "()Landroid/content/Context;", "traceStyleRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "titleTv", "Landroid/widget/TextView;", "styleAdapter", "Lcom/xiaomi/fitness/detail/video/share/adapter/PatternStyleAdapter;", "initHolder", "", "initMapAdapterOnClickCallback", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "typeId", "nameStr", "initEditAdapterOnClickCallback", "", "index", "getStylePositionByType", "dataList", "Lcom/xiaomi/fitness/detail/video/share/model/StyleItem;", "styleString", "setCustomMapStyle", "mapStyleId", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportSwitchStyleHolder {

    @NotNull
    public static final String TAG = "SwitchMapHolder";

    @NotNull
    private final Context context;
    private final int currentIndex;

    @NotNull
    private final String currentStyle;
    private final boolean isMapStyle;

    @Nullable
    private PatternStyleAdapter styleAdapter;

    @NotNull
    private final TextView titleTv;

    @NotNull
    private final RecyclerView traceStyleRecycler;

    public SportSwitchStyleHolder(@NotNull Context context, @NotNull View styleView, boolean z, @NotNull String currentStyle, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleView, "styleView");
        Intrinsics.checkNotNullParameter(currentStyle, "currentStyle");
        this.context = context;
        this.isMapStyle = z;
        this.currentStyle = currentStyle;
        this.currentIndex = i;
        View viewFindViewById = styleView.findViewById(bsi.T7);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.traceStyleRecycler = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = styleView.findViewById(bsi.K7);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.titleTv = (TextView) viewFindViewById2;
    }

    private final int getStylePositionByType(List<StyleItem> dataList, String styleString) {
        int size = dataList.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.areEqual(styleString, dataList.get(i).getStyleId())) {
                return i;
            }
        }
        return 0;
    }

    private final void setCustomMapStyle(String mapStyleId) {
        Logger.d("SwitchMapHolder", "setCustomMapStyle mapStyleId=" + mapStyleId);
        boolean zIsBlank = StringsKt__StringsKt.isBlank(mapStyleId) ^ true;
        CustomMapStyleOptions customMapStyleOptions = new CustomMapStyleOptions();
        customMapStyleOptions.setEnable(zIsBlank);
        customMapStyleOptions.setStyleId(mapStyleId);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void initEditAdapterOnClickCallback(@Nullable final Function2<? super List<Integer>, ? super Integer, Unit> callback) {
        PatternStyleAdapter patternStyleAdapter = this.styleAdapter;
        if (patternStyleAdapter != null) {
            patternStyleAdapter.setOnItemClickListener(new PatternStyleAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.detail.view.SportSwitchStyleHolder.initEditAdapterOnClickCallback.1
                @Override // com.xiaomi.fitness.detail.video.share.adapter.PatternStyleAdapter.OnItemClickListener
                public void onItemClick(StyleItem styleItem) {
                    Intrinsics.checkNotNullParameter(styleItem, "styleItem");
                    TraceStyleResModel traceStyleModel = TraceStyleResUtilExtKt.getTraceStyleModel(styleItem.getTypeId());
                    List<Integer> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(traceStyleModel.getStartIcon()), Integer.valueOf(traceStyleModel.getEndIcon())});
                    Function2<List<Integer>, Integer, Unit> function2 = callback;
                    if (function2 != null) {
                        function2.invoke(listListOf, Integer.valueOf(styleItem.getTypeId()));
                    }
                }
            });
        }
    }

    public final void initHolder() {
        this.titleTv.setText(this.isMapStyle ? j1j.j6 : j1j.k6);
        PatternStyleAdapter patternStyleAdapter = new PatternStyleAdapter(2);
        this.styleAdapter = patternStyleAdapter;
        patternStyleAdapter.setRecyclerView(this.traceStyleRecycler);
        List<StyleItem> listBuildStyleItemList = SportTraceVideoShareUtilKt.buildStyleItemList(this.isMapStyle);
        if (this.isMapStyle) {
            ListExtKt.add(listBuildStyleItemList, 0, new StyleItem(ResourceExtKt.getString(j1j.G1), "-1", hoi.D1, -1, SportTraceConstants.MAP_STYLE_RES_ID_BIAOZHUN));
        }
        PatternStyleAdapter patternStyleAdapter2 = this.styleAdapter;
        if (patternStyleAdapter2 != null) {
            patternStyleAdapter2.bindListData(listBuildStyleItemList);
        }
        PatternStyleAdapter patternStyleAdapter3 = this.styleAdapter;
        if (patternStyleAdapter3 != null) {
            patternStyleAdapter3.setPrevSelectedPos(this.isMapStyle ? getStylePositionByType(listBuildStyleItemList, this.currentStyle) : this.currentIndex);
        }
        this.traceStyleRecycler.setAdapter(this.styleAdapter);
        PatternStyleAdapter patternStyleAdapter4 = this.styleAdapter;
        if (patternStyleAdapter4 != null) {
            patternStyleAdapter4.notifyDataSetChanged();
        }
    }

    public final void initMapAdapterOnClickCallback(@Nullable final Function2<? super String, ? super String, Unit> callback) {
        PatternStyleAdapter patternStyleAdapter = this.styleAdapter;
        if (patternStyleAdapter != null) {
            patternStyleAdapter.setOnItemClickListener(new PatternStyleAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.detail.view.SportSwitchStyleHolder.initMapAdapterOnClickCallback.1
                @Override // com.xiaomi.fitness.detail.video.share.adapter.PatternStyleAdapter.OnItemClickListener
                public void onItemClick(StyleItem styleItem) {
                    Intrinsics.checkNotNullParameter(styleItem, "styleItem");
                    Function2<String, String, Unit> function2 = callback;
                    if (function2 != null) {
                        function2.invoke(styleItem.getStyleId(), styleItem.getNameStr());
                    }
                }
            });
        }
    }
}
