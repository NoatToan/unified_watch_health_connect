package health.compact.a;

import android.os.Bundle;
import com.huawei.health.ui.notification.common.IReporter;
import com.huawei.health.ui.notification.constants.UiComponent;
import com.huawei.health.ui.notification.uihandler.UiConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class UiHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<UiComponent, IReporter> f36666a = new HashMap(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StepsRecord f36667b = new StepsRecord();

    public UiHandler(UiConfig uiConfig) {
        uiConfig.e(this);
    }

    public void d(UiComponent uiComponent, IReporter iReporter) {
        this.f36666a.put(uiComponent, iReporter);
    }

    public void a(UiComponent uiComponent) {
        d(uiComponent, new Bundle());
    }

    public void d(UiComponent uiComponent, Bundle bundle) {
        IReporter iReporter = this.f36666a.get(uiComponent);
        if (iReporter != null) {
            iReporter.onStart(bundle);
        }
    }

    public void d(UiComponent uiComponent) {
        IReporter iReporter = this.f36666a.get(uiComponent);
        if (iReporter == null || !iReporter.isRunning()) {
            return;
        }
        iReporter.onStop();
    }

    public void e(StepsRecord stepsRecord) {
        if (stepsRecord != null) {
            this.f36667b.a(stepsRecord);
            c();
        }
    }

    public void c() {
        for (IReporter iReporter : this.f36666a.values()) {
            if (iReporter != null) {
                try {
                    if (iReporter.isRunning()) {
                        iReporter.onUpdate(this.f36667b);
                    }
                } catch (Exception e) {
                    com.huawei.hwlogsmodel.LogUtil.j("Step_UiHandler", "update exception:", LogAnonymous.c(e));
                }
            }
        }
    }

    public void b() {
        for (IReporter iReporter : this.f36666a.values()) {
            if (iReporter.isRunning()) {
                iReporter.onLanguageChanged();
            }
        }
    }
}
