package xy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.more.settings.SettingsViewModel", f = "SettingsViewModel.kt", l = {89}, m = "refreshSettingsItems", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f192690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f192691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f192692c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f192691b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f192690a = obj;
        this.f192692c |= Integer.MIN_VALUE;
        return c.x4(this.f192691b, null, this);
    }
}
