package com.xiaomi.fitness.mine.weeklyreport;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.xiaomi.fitness.about.utils.MineHtmlUrlsKt;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.mine.MineViewModel;
import com.xiaomi.fitness.mine.preference.WeeklyReportSharePreference;
import com.xiaomi.fitness.mine.weeklyreport.WeeklyReportAuthActivity;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import defpackage.gv1;
import defpackage.hyf;
import defpackage.m0j;
import defpackage.pji;
import defpackage.rui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/mine/weeklyreport/WeeklyReportAuthActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/mine/MineViewModel;", "Lhyf;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "pushUrl", "Ljava/lang/String;", "getPushUrl", "()Ljava/lang/String;", "setPushUrl", "(Ljava/lang/String;)V", "", "isFromSchema", "Z", "()Z", "setFromSchema", "(Z)V", "TAG", "getTAG", "setTAG", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "()V", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeeklyReportAuthActivity extends BaseBindingActivity<MineViewModel, hyf> {
    public static final int WEEKLY_REPORT_AGREE = 1;

    @NotNull
    public static final String WEEKLY_REPORT_URL = "weekly_report_url";
    private boolean isFromSchema;

    @NotNull
    private String pushUrl = "";

    @NotNull
    private String TAG = "WeeklyReportAuthActivity";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(WeeklyReportAuthActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WeeklyReportSharePreference.INSTANCE.setKEY_WEEKLY_REPORT_AUTH(1);
        this$0.finish();
        Intent intent = new Intent();
        String weeklyReportHtmlUrl = TextUtils.isEmpty(this$0.pushUrl) ? MineHtmlUrlsKt.getWeeklyReportHtmlUrl() : this$0.pushUrl;
        Logger.d(this$0.TAG, "pushUrl is " + this$0.pushUrl + " , url = " + weeklyReportHtmlUrl);
        boolean z = this$0.isFromSchema;
        if (z) {
            intent.putExtra(WebViewActivity.IS_FROM_SCHEMA, z);
        }
        intent.setClass(this$0, HealthWebViewActivity.class);
        intent.putExtra("data4", this$0.getString(m0j.A0));
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
        intent.putExtra("URL", TextUtils.isEmpty(this$0.pushUrl) ? MineHtmlUrlsKt.getWeeklyReportHtmlUrl() : this$0.pushUrl);
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(WeeklyReportAuthActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return rui.f32915b;
    }

    @NotNull
    public final String getPushUrl() {
        return this.pushUrl;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return gv1.f19359a;
    }

    /* JADX INFO: renamed from: isFromSchema, reason: from getter */
    public final boolean getIsFromSchema() {
        return this.isFromSchema;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra(WEEKLY_REPORT_URL);
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.pushUrl = stringExtra;
            this.isFromSchema = intent.getBooleanExtra(WebViewActivity.IS_FROM_SCHEMA, false);
        }
        setTitle(m0j.B0);
        setTitleBackground(pji.h);
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: kdr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeeklyReportAuthActivity.onCreate$lambda$2(this.f23762a, view);
            }
        });
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: ldr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeeklyReportAuthActivity.onCreate$lambda$3(this.f24952a, view);
            }
        });
    }

    public final void setFromSchema(boolean z) {
        this.isFromSchema = z;
    }

    public final void setPushUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pushUrl = str;
    }

    public final void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.TAG = str;
    }
}
