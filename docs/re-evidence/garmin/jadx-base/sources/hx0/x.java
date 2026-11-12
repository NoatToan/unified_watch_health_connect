package hx0;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsViewModel", f = "MenstrualCycleDetailsViewModel.kt", l = {312}, m = "getSettings", v = 2)
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocalDate f86192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ww0.a f86193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f86194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f86195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86196e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(s sVar, t13.d<? super x> dVar) {
        super(dVar);
        this.f86195d = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f86194c = obj;
        this.f86196e |= Integer.MIN_VALUE;
        return s.x4(this.f86195d, null, this);
    }
}
