package de2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.device.DefaultDeviceManager", f = "DefaultDeviceManager.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 208}, m = "sendAutoStartFail", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f59287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ae2.a f59288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f59289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f59290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59291e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f59290d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59289c = obj;
        this.f59291e |= Integer.MIN_VALUE;
        return this.f59290d.d(0L, null, this);
    }
}
