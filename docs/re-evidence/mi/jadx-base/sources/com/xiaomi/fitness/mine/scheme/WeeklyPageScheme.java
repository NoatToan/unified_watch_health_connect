package com.xiaomi.fitness.mine.scheme;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.fitness.about.utils.MineHtmlUrlsKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.mine.preference.WeeklyReportSharePreference;
import com.xiaomi.fitness.mine.weeklyreport.WeeklyReportAuthActivity;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import defpackage.m0j;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/mine/scheme/WeeklyPageScheme;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "parameterList", "Ljava/util/ArrayList;", "", "pathList", "", "doProcess", "", "context", "Landroid/content/Context;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "decodeParam", "param", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeeklyPageScheme extends IntentSchemeHandle {

    @NotNull
    private static final String PAGE_TYPE_WEEKLY_REPORT = "weeklyReport";

    @NotNull
    private ArrayList<String> parameterList = CollectionsKt__CollectionsKt.arrayListOf(PAGE_TYPE_WEEKLY_REPORT);

    @Nullable
    public final String decodeParam(@Nullable String param) {
        return !TextUtils.isEmpty(param) ? URLDecoder.decode(param) : "";
    }

    @Override // defpackage.y0c
    public void doProcess(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (Intrinsics.areEqual(uri.getQueryParameter("pageType"), PAGE_TYPE_WEEKLY_REPORT)) {
            String strDecodeParam = decodeParam(uri.getQueryParameter("url"));
            Logger.d("weekly_report_url from parameter = " + strDecodeParam, new Object[0]);
            if (TextUtils.isEmpty(strDecodeParam)) {
                strDecodeParam = MineHtmlUrlsKt.getWeeklyReportHtmlUrl();
            }
            Logger.d("weekly_report_url = " + strDecodeParam, new Object[0]);
            if (WeeklyReportSharePreference.INSTANCE.getKEY_WEEKLY_REPORT_AUTH() != 1) {
                Intent intent = new Intent();
                intent.putExtra(WeeklyReportAuthActivity.WEEKLY_REPORT_URL, strDecodeParam);
                intent.putExtra(WebViewActivity.IS_FROM_SCHEMA, true);
                intent.setClass(context, WeeklyReportAuthActivity.class);
                intent.setFlags(268435456);
                context.startActivity(intent);
                return;
            }
            Intent intent2 = new Intent();
            intent2.setClass(context, HealthWebViewActivity.class);
            intent2.putExtra(WebViewActivity.TITLE, context.getString(m0j.A0));
            intent2.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
            intent2.putExtra("URL", strDecodeParam);
            intent2.putExtra(WebViewActivity.IS_FROM_SCHEMA, true);
            intent2.setFlags(268435456);
            context.startActivity(intent2);
        }
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> pathList() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public ArrayList<String> parameterList() {
        return this.parameterList;
    }
}
