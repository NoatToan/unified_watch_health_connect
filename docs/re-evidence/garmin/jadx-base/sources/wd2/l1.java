package wd2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackServiceController", f = "LivetrackServiceController.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "updateDeviceSettings", v = 2)
public final class l1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f184523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f184524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f184525c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(g1 g1Var, t13.d<? super l1> dVar) {
        super(dVar);
        this.f184524b = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184523a = obj;
        this.f184525c |= Integer.MIN_VALUE;
        return this.f184524b.j(0L, null, this);
    }
}
