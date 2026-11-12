package com.xiaomi.fitness.active.pk.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.xiaomi.fitness.active.pk.PkConstants;
import com.xiaomi.fitness.active.pk.ui.InviteReceiveActivity;
import com.xiaomi.fitness.active.pk.ui.PkHistoryDetailActivity;
import com.xiaomi.fitness.active.pk.ui.PkListActivity;
import com.xiaomi.fitness.active.pk.ui.PkProcessDetailActivity;
import com.xiaomi.fitness.active.pk.util.LaunchExtKt;
import com.xiaomi.fitness.active.pk.util.PkLogger;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/active/pk/push/ActivePkSchemaHandler;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "parameterList", "", "", "pathList", "doProcess", "", "context", "Landroid/content/Context;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "jumpPkPage", "Companion", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivePkSchemaHandler extends IntentSchemeHandle {

    @NotNull
    public static final String PARAM_NOTIFY_TYPE = "type";

    @NotNull
    public static final String PARAM_PAGE_TYPE = "pageType";

    @NotNull
    public static final String TAG = "PushSchemaHandler";
    public static final int TYPE_ACCEPT_INVITE = 101;
    public static final int TYPE_OPPO_RECORD_SYNC = 200;
    public static final int TYPE_PK_PROCESS_DAILY = 201;
    public static final int TYPE_PK_RESULT = 301;
    public static final int TYPE_RECEIVED_INVITE = 100;
    public static final int TYPE_REJECT_INVITE = 102;
    public static final int TYPE_REMIND_SYNC = 300;

    @NotNull
    public static final String VALUE_PAGE_TYPE = "activePk";

    private final void jumpPkPage(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("type");
        PkLogger pkLogger = PkLogger.INSTANCE;
        pkLogger.i(TAG, "notifyType is " + queryParameter, new Object[0]);
        if (queryParameter == null) {
            return;
        }
        int i = Integer.parseInt(queryParameter);
        if (i == 100) {
            String queryParameter2 = uri.getQueryParameter(PkConstants.PARAM_INVITER_UID);
            pkLogger.i(TAG, "inviteId is " + queryParameter2, new Object[0]);
            if (queryParameter2 == null || queryParameter2.length() == 0) {
                pkLogger.i(TAG, "jumpPkPage invite id is null", new Object[0]);
                return;
            }
            Intent intent = new Intent(context, (Class<?>) InviteReceiveActivity.class);
            try {
                Intrinsics.checkNotNull(queryParameter2);
                intent.putExtra(PkConstants.PARAM_INVITER_UID, Long.parseLong(queryParameter2));
            } catch (Exception e) {
                PkLogger.INSTANCE.i(TAG, "inviter id format exception " + e, new Object[0]);
            }
            intent.putExtra("source", 1);
            intent.setFlags(268435456);
            context.startActivity(intent);
            return;
        }
        if (i != 101) {
            if (i == 200 || i == 201) {
                String queryParameter3 = uri.getQueryParameter(PkConstants.PARAM_PK_ID);
                String queryParameter4 = uri.getQueryParameter(PkConstants.PARAM_PK_UID);
                pkLogger.i(TAG, "pkId is " + queryParameter3 + " pkUid is " + queryParameter4, new Object[0]);
                if (queryParameter3 == null || queryParameter3.length() == 0 || queryParameter4 == null || queryParameter4.length() == 0) {
                    return;
                }
                Intent intent2 = new Intent(context, (Class<?>) PkProcessDetailActivity.class);
                try {
                    Intrinsics.checkNotNull(queryParameter3);
                    intent2.putExtra(PkConstants.PARAM_PK_ID, Long.parseLong(queryParameter3));
                    Intrinsics.checkNotNull(queryParameter4);
                    intent2.putExtra(PkConstants.PARAM_PK_UID, Long.parseLong(queryParameter4));
                    intent2.addFlags(268435456);
                    context.startActivity(intent2);
                    return;
                } catch (Exception e2) {
                    PkLogger.INSTANCE.i(TAG, "pkId or pkUid format exception " + e2, new Object[0]);
                    return;
                }
            }
            if (i != 300) {
                if (i != 301) {
                    LaunchExtKt.stateLaunchActivity(context);
                    return;
                }
                String queryParameter5 = uri.getQueryParameter(PkConstants.PARAM_PK_UID);
                pkLogger.i(TAG, "pkUid is " + queryParameter5, new Object[0]);
                if (queryParameter5 == null || queryParameter5.length() == 0) {
                    return;
                }
                Intent intent3 = new Intent(context, (Class<?>) PkHistoryDetailActivity.class);
                try {
                    Intrinsics.checkNotNull(queryParameter5);
                    intent3.putExtra(PkConstants.PARAM_PK_UID, Long.parseLong(queryParameter5));
                    intent3.addFlags(268435456);
                    context.startActivity(intent3);
                    return;
                } catch (Exception e3) {
                    PkLogger.INSTANCE.i(TAG, "pkUid format exception " + e3, new Object[0]);
                    return;
                }
            }
        }
        Intent intent4 = new Intent(context, (Class<?>) PkListActivity.class);
        intent4.addFlags(268435456);
        context.startActivity(intent4);
    }

    @Override // defpackage.y0c
    public void doProcess(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        PkLogger pkLogger = PkLogger.INSTANCE;
        pkLogger.i(TAG, "doProcess.. uri is " + uri, new Object[0]);
        String queryParameter = uri.getQueryParameter("pageType");
        if (Intrinsics.areEqual(queryParameter, VALUE_PAGE_TYPE)) {
            try {
                jumpPkPage(context, uri);
                return;
            } catch (Exception e) {
                PkLogger.INSTANCE.w(TAG, "doProcess exception , exception is", e);
                return;
            }
        }
        pkLogger.i(TAG, "pageType " + queryParameter + " is invalid", new Object[0]);
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
