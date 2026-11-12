package ot2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.lib.workoutcommon.presentation.formatter.EndConditionFormatterKt", f = "EndConditionFormatter.kt", l = {179, 181}, m = "formatDistance")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f133858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f133859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133860c;

    public d(t13.d<? super d> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133859b = obj;
        this.f133860c |= Integer.MIN_VALUE;
        return b.c(false, null, 0.0d, null, this);
    }
}
