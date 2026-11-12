package hl0;

import org.json.JSONArray;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.domain.GolfCourseMediumMapTypeUpdateCheckOperation", f = "GolfCourseMediumMapTypeUpdateCheckOperation.kt", l = {82}, m = "handleResponse", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONArray f84331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f84334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f84335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84336f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r rVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f84335e = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f84334d = obj;
        this.f84336f |= Integer.MIN_VALUE;
        return r.a(this.f84335e, null, this);
    }
}
