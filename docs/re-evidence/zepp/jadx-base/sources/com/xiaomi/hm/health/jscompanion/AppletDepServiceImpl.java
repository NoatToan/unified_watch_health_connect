package com.xiaomi.hm.health.jscompanion;

import android.content.Context;
import com.huami.applet.applet_dependent_service.AppletDepService;
import com.xiaomi.hm.health.BraceletApp;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/jscompanion/AppletDepServiceImpl;", "Lcom/huami/applet/applet_dependent_service/AppletDepService;", "Landroid/content/Context;", "obtainApplicationContext", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AppletDepServiceImpl implements AppletDepService {
    @Override // com.huami.applet.applet_dependent_service.AppletDepService
    @Nullable
    public Context obtainApplicationContext() {
        return BraceletApp.getContext();
    }
}
