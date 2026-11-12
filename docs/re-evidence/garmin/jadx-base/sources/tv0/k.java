package tv0;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.domain.SaveBehaviourChangesUseCase", f = "SaveBehaviourChangesUseCase.kt", l = {59, 64, 72}, m = "executeSaveOperationTasks", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f166576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i.b f166577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f166578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f166579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f166580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f166581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166582g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f166581f = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f166580e = obj;
        this.f166582g |= Integer.MIN_VALUE;
        return i.b(this.f166581f, null, null, null, this);
    }
}
