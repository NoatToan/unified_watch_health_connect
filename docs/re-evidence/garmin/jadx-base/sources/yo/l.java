package yo;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.repo.MultisportEditLegsRepo", f = "MultisportEditLegsRepo.kt", l = {378}, m = "processPollHeaders", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f198277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f198278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f198279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f198280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f198279c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f198278b = obj;
        this.f198280d |= Integer.MIN_VALUE;
        int i14 = e.f198230s;
        return this.f198279c.h(null, this);
    }
}
