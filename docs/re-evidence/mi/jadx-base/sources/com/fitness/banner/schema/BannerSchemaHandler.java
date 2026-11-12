package com.fitness.banner.schema;

import android.content.Context;
import android.net.Uri;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J \u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u0011"}, d2 = {"Lcom/fitness/banner/schema/BannerSchemaHandler;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "parameterList", "", "", "pathList", "doProcess", "", "context", "Landroid/content/Context;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "jumpPkPage", "pageType", "Companion", "banner_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BannerSchemaHandler extends IntentSchemeHandle {

    @NotNull
    public static final String PARAM_PAGE_TYPE = "pageType";

    @NotNull
    public static final String SENSING_GAME = "sensingGame";

    @NotNull
    public static final String TAG = "BannerSchemaHandler";

    private final void jumpPkPage(Context context, String pageType, Uri uri) {
        if (Intrinsics.areEqual(pageType, SENSING_GAME)) {
            SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).jumpSensingGamePageCheckActivity(context);
        }
    }

    @Override // defpackage.y0c
    public void doProcess(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Logger.i(TAG, "doProcess uri is " + uri);
        String queryParameter = uri.getQueryParameter("pageType");
        if (queryParameter == null || !parameterList().contains(queryParameter)) {
            Logger.i(TAG, "pageType " + queryParameter + " is invalid");
            return;
        }
        try {
            jumpPkPage(context, queryParameter, uri);
        } catch (Exception e) {
            Logger.e(TAG, "doProcess exception , exception is " + e);
        }
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> parameterList() {
        return CollectionsKt__CollectionsJVMKt.listOf(SENSING_GAME);
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> pathList() {
        return CollectionsKt__CollectionsKt.emptyList();
    }
}
