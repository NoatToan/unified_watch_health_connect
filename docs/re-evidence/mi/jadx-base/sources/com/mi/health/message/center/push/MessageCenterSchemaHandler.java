package com.mi.health.message.center.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.mi.health.message.center.ui.MessageCenterActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u0010"}, d2 = {"Lcom/mi/health/message/center/push/MessageCenterSchemaHandler;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "parameterList", "", "", "pathList", "doProcess", "", "context", "Landroid/content/Context;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "jumpPage", "Companion", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MessageCenterSchemaHandler extends IntentSchemeHandle {

    @NotNull
    public static final String PARAM_PAGE_TYPE = "pageType";

    @NotNull
    public static final String PARAM_TARGET = "target";

    @NotNull
    public static final String TAG = "MessageCenterSchemaHandler";

    @NotNull
    public static final String VALUE_PAGE_TYPE = "messageCenter";

    private final void jumpPage(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("target");
        Logger.i(TAG, "jumpPage target " + queryParameter);
        if (Intrinsics.areEqual(queryParameter, "relativeDetail")) {
            String queryParameter2 = uri.getQueryParameter("relativeUid");
            long j = queryParameter2 != null ? Long.parseLong(queryParameter2) : 0L;
            String queryParameter3 = uri.getQueryParameter("relativeNote");
            if (queryParameter3 == null) {
                queryParameter3 = AbstractJsonLexerKt.NULL;
            }
            IHealthPage.DefaultImpls.gotoRelativeHealthFragment$default(HealthPageExtKt.getInstance(IHealthPage.INSTANCE), context, j, queryParameter3, null, 8, null);
            return;
        }
        if (!Intrinsics.areEqual(queryParameter, "relativeDataAbnormal")) {
            Intent intent = new Intent(context, (Class<?>) MessageCenterActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return;
        }
        String queryParameter4 = uri.getQueryParameter("key");
        String queryParameter5 = uri.getQueryParameter(SportConstants.KEY_TIMESTAMP);
        long j2 = queryParameter5 != null ? Long.parseLong(queryParameter5) : 0L;
        String queryParameter6 = uri.getQueryParameter("relativeUid");
        long j3 = queryParameter6 != null ? Long.parseLong(queryParameter6) : 0L;
        if (Intrinsics.areEqual(queryParameter4, "low_spo2")) {
            HealthPageExtKt.getInstance(IHealthPage.INSTANCE).gotoRelativeSpo2Fragment(context, j2, j3);
        } else {
            HealthPageExtKt.getInstance(IHealthPage.INSTANCE).gotoRelativeHrmFragment(context, j2, j3);
        }
    }

    @Override // defpackage.y0c
    public void doProcess(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Logger.i(TAG, "doProcess uri is " + uri);
        String queryParameter = uri.getQueryParameter("pageType");
        if (Intrinsics.areEqual(queryParameter, VALUE_PAGE_TYPE)) {
            try {
                jumpPage(context, uri);
                return;
            } catch (Exception e) {
                Logger.w(TAG, "doProcess exception , exception is", e);
                return;
            }
        }
        Logger.i(TAG, "pageType " + queryParameter + " is invalid");
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> parameterList() {
        List<String> listSingletonList = Collections.singletonList(VALUE_PAGE_TYPE);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> pathList() {
        return CollectionsKt__CollectionsKt.emptyList();
    }
}
