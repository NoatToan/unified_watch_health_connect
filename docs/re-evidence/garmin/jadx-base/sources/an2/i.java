package an2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.device.sharing.management.SharedDeviceManager", f = "SharedDeviceManager.kt", l = {451, 455}, m = "mergeDeviceLists")
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f4563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f4564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f4565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dn2.j f4566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Collection f4567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashSet f4568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f4569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashSet f4570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f4572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4573k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f4572j = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f4571i = obj;
        this.f4573k |= Integer.MIN_VALUE;
        a.d dVar = a.f4492e;
        return this.f4572j.d(null, null, null, this);
    }
}
