package ga0;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.DeviceCustomizationViewModel", f = "DeviceCustomizationViewModel.kt", l = {151, 153, 158, SyslogConstants.LOG_LOCAL4, 167, 173}, m = "finishActivityProfilesAndSensorsCustomization", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public la0.a f76611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f76612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f76613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f76614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f76615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f76616f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f76615e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f76614d = obj;
        this.f76616f |= Integer.MIN_VALUE;
        return this.f76615e.x4(null, this);
    }
}
