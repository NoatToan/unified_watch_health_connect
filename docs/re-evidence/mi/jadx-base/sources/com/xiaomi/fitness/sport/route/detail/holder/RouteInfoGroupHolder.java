package com.xiaomi.fitness.sport.route.detail.holder;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import com.mi.health.utils.AmapLocation;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fitness.baseui.utils.AvatarLoadExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.route.detail.holder.RouteInfoGroupHolder;
import com.xiaomi.fitness.sport.route.detail.model.RankInfo;
import com.xiaomi.fitness.sport.route.detail.util.RouteDetailExtKt;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.c1j;
import defpackage.pz6;
import defpackage.yzn;
import defpackage.zxi;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/holder/RouteInfoGroupHolder;", "", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "routeInfo", "Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;", "creatorInfo", "", "bindRouteInfo", "(Lcom/xiaomi/fitness/sport_export/data/RouteInfo;Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lyzn;", "binding", "Lyzn;", "<init>", "(Landroid/content/Context;Lyzn;)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RouteInfoGroupHolder {

    @NotNull
    public static final String TAG = "RouteInfoGroupHolder";

    @NotNull
    private final yzn binding;

    @NotNull
    private final Context context;

    public RouteInfoGroupHolder(@NotNull Context context, @NotNull yzn binding) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.context = context;
        this.binding = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindRouteInfo$lambda$0(RouteInfo routeInfo, RouteInfoGroupHolder this$0, Location it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Pair<Double, Double> pairConvertFromGps84ToMars = RouteDetailExtKt.convertFromGps84ToMars(routeInfo.getStartPoint().getLatitude(), routeInfo.getStartPoint().getLongitude());
        int iCalculateLineDistance = (int) AMapUtils.calculateLineDistance(new LatLng(it.latitude, it.longitude), new LatLng(pairConvertFromGps84ToMars.getFirst().doubleValue(), pairConvertFromGps84ToMars.getSecond().doubleValue()));
        String strI = pz6.i(iCalculateLineDistance);
        this$0.binding.B.setText(ResourceExtKt.getString(c1j.h1, pz6.e(iCalculateLineDistance), strI));
        return Unit.INSTANCE;
    }

    public final void bindRouteInfo(@Nullable final RouteInfo routeInfo, @Nullable RankInfo creatorInfo) {
        if (routeInfo == null) {
            return;
        }
        this.binding.O.setText(routeInfo.getName());
        if (creatorInfo == null || creatorInfo.getNickName().length() == 0 || routeInfo.getCreateTimestamp() == 0) {
            RelativeLayout routeContributorInfo = this.binding.M;
            Intrinsics.checkNotNullExpressionValue(routeContributorInfo, "routeContributorInfo");
            ViewExtKt.gone(routeContributorInfo);
        } else {
            RelativeLayout routeContributorInfo2 = this.binding.M;
            Intrinsics.checkNotNullExpressionValue(routeContributorInfo2, "routeContributorInfo");
            ViewExtKt.visible(routeContributorInfo2);
            RoundImageView establishUserIcon = this.binding.E;
            Intrinsics.checkNotNullExpressionValue(establishUserIcon, "establishUserIcon");
            AvatarLoadExtKt.loadAvatarWithDefaultImg(establishUserIcon, creatorInfo.getIcon(), ExtUtilsKt.getDp(24));
            this.binding.A.setText(creatorInfo.getNickName());
        }
        int category = routeInfo.getCategory();
        TextView routeTypeTag = this.binding.P;
        Intrinsics.checkNotNullExpressionValue(routeTypeTag, "routeTypeTag");
        RouteDetailExtKt.showRouteTypeTag(routeTypeTag, Integer.valueOf(category));
        long createTimestamp = routeInfo.getCreateTimestamp();
        TextView establishDesc = this.binding.D;
        Intrinsics.checkNotNullExpressionValue(establishDesc, "establishDesc");
        ViewExtKt.visible(establishDesc);
        String string = this.context.getString(c1j.E3, TimeDateUtil.getDateYYYYMMddLocalFormat(createTimestamp * ((long) 1000)));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.binding.D.setText(string);
        String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(zxi.i, (int) routeInfo.getLength(), Double.valueOf(routeInfo.getLength()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String quantityString2 = ApplicationExtKt.getApplication().getResources().getQuantityString(zxi.l, routeInfo.getHeat(), Integer.valueOf(routeInfo.getHeat()));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        this.binding.N.setText(quantityString);
        this.binding.I.setText(quantityString2);
        this.binding.L.setText(routeInfo.getStartPoint().getName());
        new AmapLocation().startLocation(new Function1() { // from class: hzk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RouteInfoGroupHolder.bindRouteInfo$lambda$0(routeInfo, this, (Location) obj);
            }
        });
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }
}
