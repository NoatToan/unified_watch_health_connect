package rk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.agent.omt.OmtFirmwareDownloadAgent$DeviceXmlReader$DefaultImpls", f = "OmtFirmwareDownloadAgent.kt", l = {193}, m = "retrieveDeviceXml")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f153368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f153369b;

    public d(t13.d<? super d> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f153368a = obj;
        this.f153369b |= Integer.MIN_VALUE;
        return c.d.a.a(null, this);
    }
}
