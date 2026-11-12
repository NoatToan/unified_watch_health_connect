package com.mi.fitness.course.schedule.web;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatDelegate;
import com.mi.fitness.course.schedule.util.SyncCourseClassHelper;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.kad;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/mi/fitness/course/schedule/web/CourseScheduleWebViewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "()V", "initWebView", "Lkad;", "getJavaScriptInterface", "()Lkad;", LifecycleConstantKt.ON_PAUSE, "onBackPressed", "<init>", "course-schedule_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CourseScheduleWebViewActivity extends WebViewActivity {
    @Override // com.xiaomi.fitness.webview.WebViewActivity
    @NotNull
    public kad getJavaScriptInterface() {
        return new CourseScheduleJavaScriptImpl(this, this);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void initWebView() {
        super.initWebView();
        getWebView().addJavascriptInterface(getJavaScriptInterface(), "wear");
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        if (getWebView().canGoBack()) {
            getWebView().goBack();
        } else {
            finishFromWeb();
        }
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hideBack();
        AppCompatDelegate.H(-1);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        SyncCourseClassHelper.syncCourseSchedule$default(SyncCourseClassHelper.INSTANCE, false, 1, null);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        SyncCourseClassHelper.syncCourseSchedule$default(SyncCourseClassHelper.INSTANCE, false, 1, null);
    }
}
