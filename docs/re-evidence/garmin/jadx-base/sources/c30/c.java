package c30;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.AddClimbToCourseRouteUseCase", f = "AddClimbToCourseRouteUseCase.kt", l = {111}, m = "buildNewSegments", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f23809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f23810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f23811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f23812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f23813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f23813e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23812d = obj;
        this.f23814f |= Integer.MIN_VALUE;
        int i14 = a.f23771e;
        return this.f23813e.b(null, null, null, null, this);
    }
}
