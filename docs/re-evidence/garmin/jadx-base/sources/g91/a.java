package g91;

import android.content.Context;
import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.LombardiRouterImpl", f = "LombardiRouterImpl.kt", l = {20}, m = "getLombardiConsentOrLanguageSelectionIntent", v = 2)
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f76471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f76472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f76473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f76474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, d<? super a> dVar) {
        super(dVar);
        this.f76473c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f76472b = obj;
        this.f76474d |= Integer.MIN_VALUE;
        return this.f76473c.d(null, this);
    }
}
