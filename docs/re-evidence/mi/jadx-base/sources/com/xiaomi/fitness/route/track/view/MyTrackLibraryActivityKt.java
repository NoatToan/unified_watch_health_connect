package com.xiaomi.fitness.route.track.view;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.map.export.MapDynamicUtils;
import com.xiaomi.fitness.route.export.track.File;
import com.xiaomi.fitness.route.export.track.Route;
import com.xiaomi.fitness.route.export.track.RouteValue;
import com.xiaomi.fitness.route.export.track.TrackDetailData;
import com.xiaomi.fitness.route.track.view.MyTrackLibraryActivityKt;
import defpackage.x0j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u001e\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"startTrackLibraryActivity", "", "routerIds", "", "", "([Ljava/lang/String;)V", "startToTrackDetailActivity", "uploadTime", "route", "Lcom/xiaomi/fitness/route/export/track/Route;", "routeValue", "Lcom/xiaomi/fitness/route/export/track/RouteValue;", "route_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MyTrackLibraryActivityKt {
    public static final void startToTrackDetailActivity(@NotNull String uploadTime, @NotNull Route route, @NotNull RouteValue routeValue) {
        String url;
        Intrinsics.checkNotNullParameter(uploadTime, "uploadTime");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(routeValue, "routeValue");
        if (!NetUtil.INSTANCE.getNetWorkAvailable(AppUtil.getApp())) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), x0j.y);
            return;
        }
        final Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) TrackDetailActivity.class);
        intent.setFlags(268435456);
        Bundle bundle = new Bundle();
        String suffix = routeValue.getSuffix();
        String str = suffix == null ? "" : suffix;
        File mFile = route.getMFile();
        String str2 = (mFile == null || (url = mFile.getUrl()) == null) ? "" : url;
        String uploadTime2 = routeValue.getUploadTime();
        long j = uploadTime2 != null ? Long.parseLong(uploadTime2) : 0L;
        String source = routeValue.getSource();
        String str3 = source == null ? "" : source;
        String route_id = route.getRoute_id();
        String alias = routeValue.getAlias();
        String str4 = alias == null ? "" : alias;
        String dis = routeValue.getDis();
        bundle.putSerializable(TrackDetailActivity.ROUTE_DETAIL, new TrackDetailData(str, str2, j, uploadTime, str3, route_id, str4, dis == null ? "" : dis));
        intent.putExtras(bundle);
        MapDynamicUtils.INSTANCE.checkSoLoaded(null, new Function2() { // from class: gfg
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MyTrackLibraryActivityKt.startToTrackDetailActivity$lambda$4(intent, ((Boolean) obj).booleanValue(), (Exception) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startToTrackDetailActivity$lambda$4(Intent intent, boolean z, Exception exc) {
        Intrinsics.checkNotNullParameter(intent, "$intent");
        if (z) {
            AnyExtKt.main$default(null, new MyTrackLibraryActivityKt$startToTrackDetailActivity$1$1(intent, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final void startTrackLibraryActivity(@NotNull String[] routerIds) {
        Intrinsics.checkNotNullParameter(routerIds, "routerIds");
        Application app = AppUtil.getApp();
        Intent intent = new Intent(app, (Class<?>) MyTrackLibraryActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(MyTrackLibraryActivity.ROUTE_IDS, routerIds);
        intent.putExtra(MyTrackLibraryActivity.isFromDeviceLib, true);
        app.startActivity(intent);
    }

    public static final void startTrackLibraryActivity() {
        Application app = AppUtil.getApp();
        Intent intent = new Intent(app, (Class<?>) MyTrackLibraryActivity.class);
        intent.addFlags(268435456);
        app.startActivity(intent);
    }
}
