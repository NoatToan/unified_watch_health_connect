package sk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.agent.xml.DeviceXmlReadAgent", f = "DeviceXmlReadAgent.kt", l = {164}, m = "load$suspendImpl")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f159953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rs2.c f159954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f159955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f159956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f159957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f159956d = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f159955c = obj;
        this.f159957e |= Integer.MIN_VALUE;
        return c.F(this.f159956d, null, this);
    }
}
