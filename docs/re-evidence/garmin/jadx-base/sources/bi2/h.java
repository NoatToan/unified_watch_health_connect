package bi2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "com.garmin.androiddynamicsettings.app.onclickviews.CriticalSwimSpeedPicker", f = "CriticalSwimSpeedPicker.kt", l = {99}, m = "getPopupTitle")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f18164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f18164c = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18163b = obj;
        this.f18165d |= Integer.MIN_VALUE;
        return m.a(this.f18164c, this);
    }
}
