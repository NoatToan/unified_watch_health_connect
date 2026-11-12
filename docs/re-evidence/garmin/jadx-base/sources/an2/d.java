package an2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.device.sharing.management.SharedDeviceManager", f = "SharedDeviceManager.kt", l = {348, 350, 383, 392}, m = "doReconcileDevices$shared_device_management_release")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f4542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dn2.j f4543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f4544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashSet f4546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f4547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a f4549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4550i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f4549h = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f4548g = obj;
        this.f4550i |= Integer.MIN_VALUE;
        return this.f4549h.a(null, this);
    }
}
