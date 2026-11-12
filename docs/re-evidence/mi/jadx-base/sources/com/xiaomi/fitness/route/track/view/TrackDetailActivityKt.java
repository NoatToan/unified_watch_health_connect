package com.xiaomi.fitness.route.track.view;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.map.export.MapDynamicUtils;
import com.xiaomi.fitness.route.track.view.TrackDetailActivityKt;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"startTrackDetailActivity", "", "suffix", "", "fileUrl", "value", "Ljava/io/Serializable;", "fromPage", "", "route_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TrackDetailActivityKt {
    public static final void startTrackDetailActivity(@Nullable String str, @Nullable String str2, @Nullable Serializable serializable, int i) {
        final Application app = AppUtil.getApp();
        final Intent intent = new Intent(app, (Class<?>) TrackDetailActivity.class);
        intent.addFlags(268435456);
        if (str == null) {
            str = "";
        }
        intent.putExtra(TrackDetailActivity.FILE_EXT, str);
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra(TrackDetailActivity.ROUTE_URL, str2);
        intent.putExtra(TrackDetailActivity.FROM_PAGE, i);
        Bundle bundle = new Bundle();
        bundle.putSerializable(TrackDetailActivity.ROUTE_DETAIL, serializable);
        intent.putExtras(bundle);
        MapDynamicUtils.INSTANCE.checkSoLoaded(null, new Function2() { // from class: jmp
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TrackDetailActivityKt.startTrackDetailActivity$lambda$2(app, intent, ((Boolean) obj).booleanValue(), (Exception) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startTrackDetailActivity$lambda$2(Application context, Intent intent, boolean z, Exception exc) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(intent, "$intent");
        if (z) {
            AnyExtKt.main$default(null, new TrackDetailActivityKt$startTrackDetailActivity$1$1(context, intent, null), 1, null);
        }
        return Unit.INSTANCE;
    }
}
