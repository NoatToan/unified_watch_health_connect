package pj1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.AssistancePlusMccManager", f = "AssistancePlusMccManager.kt", l = {93}, m = "findMccAndNotifyDevice", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f137882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f137883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f137884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f137883b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f137882a = obj;
        this.f137884c |= Integer.MIN_VALUE;
        return this.f137883b.b(null, null, this);
    }
}
