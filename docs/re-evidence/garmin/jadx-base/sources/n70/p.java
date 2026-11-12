package n70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetAutoSaveFocusType", f = "GetAutoSaveFocusType.kt", l = {22}, m = "invoke", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f124466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f124467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f124468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f124467b = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f124466a = obj;
        this.f124468c |= Integer.MIN_VALUE;
        return this.f124467b.a(null, false, this);
    }
}
