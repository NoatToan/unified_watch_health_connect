package com.xiaomi.hm.health.nfc.door;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huami.nfc.door.WorkerInfo;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.accessdoor.activity.WorkDoorActivity;
import com.xiaomi.hm.health.activity.StartUpActivity;
import com.xiaomi.hm.health.nfc.door.HuamiWorkUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/nfc/door/HuamiWorkUtils;", "", "Landroid/content/Intent;", "intent", "", "isHuamiWorkIntent", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "handleHuamiWorkIntent", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HuamiWorkUtils {

    @NotNull
    public static final HuamiWorkUtils INSTANCE = new HuamiWorkUtils();

    private HuamiWorkUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, WorkerInfo workerInfo) {
        WorkDoorActivity.INSTANCE.toWorkDoorActivity(context, workerInfo);
    }

    public final void handleHuamiWorkIntent(@NotNull final Context context, @NotNull Intent intent) {
        String queryParameter;
        Uri data = intent.getData();
        if (data == null || (queryParameter = data.getQueryParameter("name")) == null) {
            return;
        }
        List<String> queryParameters = data.getQueryParameters("number");
        String str = queryParameters.isEmpty() ? null : (String) CollectionsKt.first((List) queryParameters);
        if (str == null) {
            return;
        }
        final WorkerInfo workerInfo = new WorkerInfo(queryParameter, str);
        ((Activity) context).runOnUiThread(new Runnable() { // from class: bc4
            @Override // java.lang.Runnable
            public final void run() {
                HuamiWorkUtils.b(context, workerInfo);
            }
        });
    }

    public final boolean isHuamiWorkIntent(@Nullable Intent intent) {
        Uri data;
        if (intent == null) {
            data = null;
        } else {
            try {
                data = intent.getData();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        if (data == null) {
            return false;
        }
        String scheme = data.getScheme();
        if (scheme == null || scheme.length() == 0) {
            return false;
        }
        String host = data.getHost();
        if (host == null || host.length() == 0) {
            return false;
        }
        String path = data.getPath();
        return !(path == null || path.length() == 0) && Intrinsics.areEqual(data.getScheme(), "amazfit") && Intrinsics.areEqual(data.getHost(), StartUpActivity.NFC_CARD_HOST) && m.endsWith$default(data.getPath(), "/create_huami_card", false, 2, null);
    }
}
