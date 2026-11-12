package an2;

import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.device.sharing.management.SharedDeviceManager$BondingListener", f = "SharedDeviceManager.kt", l = {790, 798, 804}, m = "handleBondChange")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.b f4528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedDeviceInfo f4529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedDeviceInfo f4530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f4531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Collection f4532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f4533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a.b f4536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4537j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a.b bVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f4536i = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f4535h = obj;
        this.f4537j |= Integer.MIN_VALUE;
        return a.b.a(this.f4536i, null, null, null, 0, null, null, this);
    }
}
