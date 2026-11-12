package xf;

import android.view.View;
import android.view.ViewTreeObserver;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class i implements l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k<View> f190622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f190623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f190624c;

    public i(k<View> kVar, ViewTreeObserver viewTreeObserver, j jVar) {
        this.f190622a = kVar;
        this.f190623b = viewTreeObserver;
        this.f190624c = jVar;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        this.f190622a.b(this.f190623b, this.f190624c);
        return Unit.INSTANCE;
    }
}
