package y10;

import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQStorageManagementViewModel", f = "ConnectIQStorageManagementViewModel.kt", l = {90}, m = "getAppIcons", v = 2)
public final class i0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f193892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f193894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f193895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, t13.d<? super i0> dVar) {
        super(dVar);
        this.f193894c = k0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193893b = obj;
        this.f193895d |= Integer.MIN_VALUE;
        return k0.x4(this.f193894c, null, this);
    }
}
