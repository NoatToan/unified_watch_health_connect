package qb1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel", f = "PregnancySetupViewModel.kt", l = {611}, m = "getDeviceId", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f144108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f144109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f144110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f144111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f144110c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144109b = obj;
        this.f144111d |= Integer.MIN_VALUE;
        return f.y4(this.f144110c, this);
    }
}
