package an2;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.device.sharing.management.SharedDeviceManager", f = "SharedDeviceManager.kt", l = {498, 507}, m = "mergeDualPairingDevice")
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f4574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f4575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Serializable f4579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashSet f4580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Iterator f4581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashSet f4582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a f4584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4585l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f4584k = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f4583j = obj;
        this.f4585l |= Integer.MIN_VALUE;
        a.d dVar = a.f4492e;
        return this.f4584k.e(null, null, null, null, this);
    }
}
