package tv0;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.domain.SaveBehaviourChangesUseCase", f = "SaveBehaviourChangesUseCase.kt", l = {118}, m = "saveUpdatedCustomBehaviours", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i.b f166621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f166622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f166623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pv0.d f166624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f166625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f166626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f166627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f166628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f166629i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i iVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f166628h = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f166627g = obj;
        this.f166629i |= Integer.MIN_VALUE;
        return i.e(this.f166628h, null, this);
    }
}
