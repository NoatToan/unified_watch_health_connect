package px2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.samd.protoimpl.GarminHealthServiceHandler", f = "GarminHealthServiceHandler.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 227}, m = "handleMsg")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f141804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dt2.k f141805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f141806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f141807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f141808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f141807d = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141806c = obj;
        this.f141808e |= Integer.MIN_VALUE;
        return this.f141807d.j(null, this);
    }
}
