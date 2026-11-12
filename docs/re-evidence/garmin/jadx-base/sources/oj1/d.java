package oj1;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.repo.SettingsRepo", f = "SettingsRepo.kt", l = {64, 66}, m = "getUserSettingsFromGC", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f132375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f132376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f132377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f132378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f132377c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132376b = obj;
        this.f132378d |= Integer.MIN_VALUE;
        return this.f132377c.c(this);
    }
}
