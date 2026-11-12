package tv0;

import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.domain.SaveBehaviourChangesUseCase", f = "SaveBehaviourChangesUseCase.kt", l = {90}, m = "deleteCustomBehaviours", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i.b f166571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f166572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f166573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f166574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f166575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f166574d = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f166573c = obj;
        this.f166575e |= Integer.MIN_VALUE;
        return i.a(this.f166574d, null, this);
    }
}
