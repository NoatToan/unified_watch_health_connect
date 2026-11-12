package com.huawei.openalliance.ad.download.app;

import android.content.Context;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.utils.ac;
import com.huawei.openalliance.ad.utils.ai;
import com.huawei.openalliance.ad.utils.dg;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {
    public static void b(Context context, ac.a aVar) {
        ac.a(context, context.getString(R.string.hiad_dialog_title_tip), dg.a(context, R.string.hiad_non_wifi_download_prompt, "hiad_non_wifi_download_prompt", new Object[0]), context.getString(R.string.hiad_continue_download_new), context.getString(R.string.hiad_dialog_cancel), aVar);
    }

    public static void a(Context context, boolean z, ac.a aVar) {
        ac.a(context, "", context.getString(z ? R.string.hiad_confirm_restore_app : R.string.hiad_confirm_download_app), context.getString(R.string.hiad_download_install), context.getString(R.string.hiad_dialog_cancel), aVar);
    }

    public static void a(Context context, ac.a aVar) {
        ac.a(context, context.getString(R.string.hiad_dialog_title_tip), context.getString(R.string.hiad_whether_download), context.getString(R.string.hiad_continue_download_new), context.getString(R.string.hiad_dialog_cancel), aVar);
    }

    public static void a(Context context, long j, ac.a aVar) {
        ac.a(context, context.getString(R.string.hiad_prepare_download_title), context.getString(R.string.hiad_mobile_download_prompt, ai.a(context, j)), context.getString(R.string.hiad_detail_download_now), dg.a(context, R.string.hiad_prepare_download, "hiad_prepare_download", new Object[0]), aVar);
    }
}
