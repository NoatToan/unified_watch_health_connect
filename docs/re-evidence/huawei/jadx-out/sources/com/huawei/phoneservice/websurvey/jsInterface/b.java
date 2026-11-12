package com.huawei.phoneservice.websurvey.jsInterface;

import android.webkit.JavascriptInterface;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.websurvey.ui.SurveyWebActivity;
import com.huawei.phoneservice.websurvey.utils.c;
import com.huawei.phoneservice.websurvey.utils.e;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<SurveyWebActivity> f21983c;

    @JavascriptInterface
    public void writeSp(String str, String str2, String str3) {
        WeakReference<SurveyWebActivity> weakReference = this.f21983c;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        try {
            g.c("HicareJsInterface", "writeSp  success fileName:%s + key:%s + value:%s", str, str2, str3);
            this.f21983c.get().getSharedPreferences(str, 0).edit().putString(str2, str3).apply();
        } catch (Exception unused) {
            g.e("HicareJsInterface", "writeSp  denied");
        }
    }

    @JavascriptInterface
    public void setTitleNoDelay(boolean z) {
        WeakReference<SurveyWebActivity> weakReference = this.f21983c;
        SurveyWebActivity surveyWebActivity = weakReference == null ? null : weakReference.get();
        if (surveyWebActivity != null) {
            surveyWebActivity.j = z;
        }
    }

    @JavascriptInterface
    public void setNpsBlockBack(String str) {
        SurveyWebActivity surveyWebActivity = this.f21983c.get();
        if (c.b(surveyWebActivity)) {
            surveyWebActivity.b(str);
        }
    }

    @JavascriptInterface
    public String readSp(String str, String str2, String str3) {
        WeakReference<SurveyWebActivity> weakReference = this.f21983c;
        if (weakReference != null && weakReference.get() != null) {
            try {
                g.c("HicareJsInterface", "readSp  success fileName:%s + key:%s + defaultValue:%s", str, str2, str3);
                return this.f21983c.get().getSharedPreferences(str, 0).getString(str2, str3);
            } catch (Exception unused) {
                g.e("HicareJsInterface", "readSp  denied");
            }
        }
        return str3;
    }

    @JavascriptInterface
    public String isDarkMode() {
        WeakReference<SurveyWebActivity> weakReference = this.f21983c;
        return e.b(weakReference == null ? null : weakReference.get()) ? "dark" : CervicalMucusRecord.Sensation.LIGHT;
    }

    @JavascriptInterface
    public boolean getNewWorkIsConnected() {
        WeakReference<SurveyWebActivity> weakReference = this.f21983c;
        SurveyWebActivity surveyWebActivity = weakReference == null ? null : weakReference.get();
        if (c.b(surveyWebActivity)) {
            return com.huawei.phoneservice.faq.base.util.d.c(surveyWebActivity);
        }
        return false;
    }

    @JavascriptInterface
    public void close() {
        g.e("HicareJsInterface", "close()");
        WeakReference<SurveyWebActivity> weakReference = this.f21983c;
        final SurveyWebActivity surveyWebActivity = weakReference == null ? null : weakReference.get();
        if (c.b(surveyWebActivity)) {
            Objects.requireNonNull(surveyWebActivity);
            surveyWebActivity.runOnUiThread(new Runnable() { // from class: com.huawei.phoneservice.websurvey.jsInterface.d
                @Override // java.lang.Runnable
                public final void run() {
                    surveyWebActivity.finish();
                }
            });
        }
    }

    public b(WeakReference<SurveyWebActivity> weakReference) {
        this.f21983c = weakReference;
    }
}
