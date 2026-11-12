package com.xiaomi.wearable.yrn.components.amap.cluster;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.MarkerOptions;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.wearable.yrn.components.MarginProps;
import com.xiaomi.wearable.yrn.components.TextProps;
import com.xiaomi.wearable.yrn.components.YRNComponentsUtils;
import com.xiaomi.wearable.yrn.components.amap.ClusterData;
import com.xiaomi.wearable.yrn.components.amap.MarkerExtraProps;
import com.xiaomi.wearable.yrn.components.amap.MarkerIcon;
import com.xiaomi.wearable.yrn.components.amap.MarkerProps;
import com.xiaomi.wearable.yrn.components.amap.cluster.CLusterUtils;
import defpackage.bee;
import defpackage.dee;
import defpackage.jyi;
import defpackage.toi;
import defpackage.zde;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bJ.\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000f2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u0010H\u0002J<\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u0013H\u0002¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/cluster/CLusterUtils;", "", "<init>", "()V", "getMarker", "", "context", "Landroid/content/Context;", "data", "Lcom/xiaomi/wearable/yrn/components/amap/ClusterData;", "callback", "Lkotlin/Function3;", "Lcom/amap/api/maps/model/MarkerOptions;", "Lcom/amap/api/maps/model/BitmapDescriptor;", "getSingleMarkerIcon", "Lcom/xiaomi/wearable/yrn/components/amap/MarkerProps;", "Lkotlin/Function1;", "getMarkersIcon", "", "Lkotlin/Function2;", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCLusterUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CLusterUtils.kt\ncom/xiaomi/wearable/yrn/components/amap/cluster/CLusterUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n774#2:190\n865#2,2:191\n1557#2:193\n1628#2,3:194\n1#3:197\n*S KotlinDebug\n*F\n+ 1 CLusterUtils.kt\ncom/xiaomi/wearable/yrn/components/amap/cluster/CLusterUtils\n*L\n124#1:190\n124#1:191,2\n124#1:193\n124#1:194,3\n*E\n"})
public final class CLusterUtils {

    @NotNull
    public static final CLusterUtils INSTANCE = new CLusterUtils();

    private CLusterUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMarker$lambda$1(Function3 callback, MarkerProps props, BitmapDescriptor bitmapDescriptor, BitmapDescriptor bitmapDescriptor2) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(props, "$props");
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(props.getPosition().toLatLng());
        markerOptions.icon(bitmapDescriptor);
        markerOptions.anchor((float) props.getAnchorU(), (float) props.getAnchorV());
        markerOptions.draggable(props.isDraggable());
        markerOptions.visible(props.isVisible());
        markerOptions.period(props.getPeriod());
        markerOptions.setGps(props.isGps());
        markerOptions.zIndex((float) props.getZIndex());
        markerOptions.alpha((float) props.getAlpha());
        markerOptions.rotateAngle((float) props.getRotateAngle());
        callback.invoke(markerOptions, bitmapDescriptor, bitmapDescriptor2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMarker$lambda$3(Function3 callback, MarkerProps props, BitmapDescriptor bitmapDescriptor) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(props, "$props");
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(props.getPosition().toLatLng());
        markerOptions.icon(bitmapDescriptor);
        markerOptions.anchor((float) props.getAnchorU(), (float) props.getAnchorV());
        markerOptions.draggable(props.isDraggable());
        markerOptions.visible(props.isVisible());
        markerOptions.period(props.getPeriod());
        markerOptions.setGps(props.isGps());
        markerOptions.zIndex((float) props.getZIndex());
        markerOptions.alpha((float) props.getAlpha());
        markerOptions.rotateAngle((float) props.getRotateAngle());
        callback.invoke(markerOptions, bitmapDescriptor, bitmapDescriptor);
        return Unit.INSTANCE;
    }

    private final void getMarkersIcon(final Context context, final List<MarkerProps> data, final Function2<? super BitmapDescriptor, ? super BitmapDescriptor, Unit> callback) {
        if (data.size() == 1) {
            getSingleMarkerIcon(context, data.get(0), new Function1() { // from class: r83
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CLusterUtils.getMarkersIcon$lambda$12(callback, (BitmapDescriptor) obj);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (((MarkerProps) obj).getIcon() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MarkerIcon icon = ((MarkerProps) it.next()).getIcon();
            Intrinsics.checkNotNull(icon);
            arrayList2.add(icon.getIcon());
        }
        YRNComponentsUtils.INSTANCE.getImageDrawables(context, CollectionsKt___CollectionsKt.take(arrayList2, 4), toi.f34894a, new Function1() { // from class: s83
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return CLusterUtils.getMarkersIcon$lambda$15(context, data, callback, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMarkersIcon$lambda$12(Function2 callback, BitmapDescriptor bitmapDescriptor) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(bitmapDescriptor, bitmapDescriptor);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMarkersIcon$lambda$15(Context context, List data, Function2 callback, List drawables) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(drawables, "drawables");
        zde zdeVarA0 = zde.A0(LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(zdeVarA0, "inflate(...)");
        bee beeVarA0 = bee.A0(LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(beeVarA0, "inflate(...)");
        beeVarA0.F.setText(ResourceExtKt.getQuantityString(context, jyi.f23247a, data.size(), Integer.valueOf(data.size())));
        zdeVarA0.F.setText(ResourceExtKt.getQuantityString(context, jyi.f23247a, data.size(), Integer.valueOf(data.size())));
        if (!data.isEmpty()) {
            beeVarA0.A.setImageDrawable((Drawable) drawables.get(0));
            zdeVarA0.A.setImageDrawable((Drawable) drawables.get(0));
        }
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ImageView[]{zdeVarA0.A, zdeVarA0.B, zdeVarA0.C, zdeVarA0.D});
        int size = listListOf.size();
        for (int i = 0; i < size; i++) {
            if (i < drawables.size()) {
                Object obj = listListOf.get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                ViewExtKt.visible((View) obj);
                ((ImageView) listListOf.get(i)).setImageDrawable((Drawable) drawables.get(i));
            } else {
                Object obj2 = listListOf.get(i);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                ViewExtKt.gone((View) obj2);
            }
        }
        List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new ImageView[]{beeVarA0.A, beeVarA0.B, beeVarA0.C, beeVarA0.D});
        int size2 = listListOf2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (i2 < drawables.size()) {
                Object obj3 = listListOf2.get(i2);
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                ViewExtKt.visible((View) obj3);
                ((ImageView) listListOf2.get(i2)).setImageDrawable((Drawable) drawables.get(i2));
            } else {
                Object obj4 = listListOf2.get(i2);
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                ViewExtKt.gone((View) obj4);
            }
        }
        ImageView iconMore = zdeVarA0.E;
        Intrinsics.checkNotNullExpressionValue(iconMore, "iconMore");
        ViewExtKt.setVisible(iconMore, data.size() > 4);
        ImageView iconMore2 = beeVarA0.E;
        Intrinsics.checkNotNullExpressionValue(iconMore2, "iconMore");
        ViewExtKt.setVisible(iconMore2, data.size() > 4);
        callback.invoke(BitmapDescriptorFactory.fromView(zdeVarA0.getRoot()), BitmapDescriptorFactory.fromView(beeVarA0.getRoot()));
        return Unit.INSTANCE;
    }

    private final void getSingleMarkerIcon(Context context, MarkerProps data, final Function1<? super BitmapDescriptor, Unit> callback) {
        final dee deeVarA0 = dee.A0(LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(deeVarA0, "inflate(...)");
        final MarkerIcon icon = data.getIcon();
        if (icon == null) {
            callback.invoke2(null);
        } else {
            YRNComponentsUtils.INSTANCE.getImageDrawable(context, icon.getIcon(), toi.f34894a, new Function1() { // from class: v83
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CLusterUtils.getSingleMarkerIcon$lambda$11(deeVarA0, icon, callback, (Drawable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSingleMarkerIcon$lambda$11(dee binding, MarkerIcon markerIcon, Function1 callback, Drawable drawable) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        binding.E.setText(markerIcon.getTitle());
        binding.A.setImageDrawable(drawable);
        TextProps titleStyle = markerIcon.getTitleStyle();
        if (titleStyle != null) {
            binding.E.setTextSize(titleStyle.getSize());
            Integer color = titleStyle.getColor();
            if (color != null) {
                binding.E.setTextColor(color.intValue());
            }
            MarginProps margin = titleStyle.getMargin();
            if (margin != null) {
                ViewGroup.LayoutParams layoutParams = binding.E.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(margin.getLeft(), margin.getTop(), margin.getRight(), margin.getBottom());
            }
        }
        TextView subtitle = binding.C;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        String subTitle = markerIcon.getSubTitle();
        ViewExtKt.setVisible(subtitle, !(subTitle == null || subTitle.length() == 0));
        binding.C.setText(markerIcon.getSubTitle());
        TextProps subTitleStyle = markerIcon.getSubTitleStyle();
        if (subTitleStyle != null) {
            binding.C.setTextSize(subTitleStyle.getSize());
            Integer color2 = subTitleStyle.getColor();
            if (color2 != null) {
                binding.C.setTextColor(color2.intValue());
            }
            MarginProps margin2 = subTitleStyle.getMargin();
            if (margin2 != null) {
                ViewGroup.LayoutParams layoutParams2 = binding.C.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(margin2.getLeft(), margin2.getTop(), margin2.getRight(), margin2.getBottom());
            }
        }
        MarkerExtraProps extra = markerIcon.getExtra();
        if (extra != null) {
            ImageView subtitleIcon = binding.D;
            Intrinsics.checkNotNullExpressionValue(subtitleIcon, "subtitleIcon");
            ViewExtKt.setVisible(subtitleIcon, extra.getJoined());
        }
        callback.invoke2(BitmapDescriptorFactory.fromView(binding.getRoot()));
        return Unit.INSTANCE;
    }

    public final void getMarker(@NotNull Context context, @NotNull ClusterData data, @NotNull final Function3<? super MarkerOptions, ? super BitmapDescriptor, ? super BitmapDescriptor, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (data.getCount() <= 1) {
            final MarkerProps markerProps = data.getMarkers().get(0);
            getSingleMarkerIcon(context, markerProps, new Function1() { // from class: u83
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CLusterUtils.getMarker$lambda$3(callback, markerProps, (BitmapDescriptor) obj);
                }
            });
        } else {
            List<MarkerProps> markers = data.getMarkers();
            final MarkerProps markerProps2 = markers.get(0);
            getMarkersIcon(context, markers, new Function2() { // from class: t83
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CLusterUtils.getMarker$lambda$1(callback, markerProps2, (BitmapDescriptor) obj, (BitmapDescriptor) obj2);
                }
            });
        }
    }
}
