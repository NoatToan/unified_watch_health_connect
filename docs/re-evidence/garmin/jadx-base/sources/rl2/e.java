package rl2;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.device.nfc.gdi.NfcServiceHandler", f = "NfcServiceHandler.kt", l = {139, 149, ModuleDescriptor.MODULE_VERSION}, m = "setupConnection", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f153476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f153477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f153478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f153479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f153480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(dVar2);
        this.f153479d = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f153478c = obj;
        this.f153480e |= Integer.MIN_VALUE;
        return this.f153479d.c(0, this);
    }
}
