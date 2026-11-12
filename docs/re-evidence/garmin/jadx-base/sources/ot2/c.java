package ot2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.lib.workoutcommon.presentation.formatter.EndConditionFormatterKt", f = "EndConditionFormatter.kt", l = {99, 101, 104}, m = "formatCalories")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f133855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f133856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133857c;

    public c(t13.d<? super c> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133856b = obj;
        this.f133857c |= Integer.MIN_VALUE;
        return b.b(false, 0.0d, this);
    }
}
