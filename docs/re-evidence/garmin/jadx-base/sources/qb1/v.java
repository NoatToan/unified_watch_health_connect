package qb1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel", f = "PregnancySetupViewModel.kt", l = {239}, m = "postPregnancyInitialSetup", v = 2)
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f144182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f144183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f144184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f144185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f144186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(f fVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f144185d = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144184c = obj;
        this.f144186e |= Integer.MIN_VALUE;
        return f.H4(this.f144185d, this);
    }
}
