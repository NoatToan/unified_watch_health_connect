package rs2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.GfdiDevice", f = "GfdiDevice.kt", l = {476}, m = "notifyFeatureCapabilitiesUpdate$gfdi_release")
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f154440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f154441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f154442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f154443d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i iVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f154442c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154441b = obj;
        this.f154443d |= Integer.MIN_VALUE;
        return this.f154442c.c(null, null, this);
    }
}
