package ot2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.lib.workoutcommon.presentation.formatter.EndConditionFormatterKt", f = "EndConditionFormatter.kt", l = {113, 115, 119}, m = "formatHeartRate")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f133861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f133862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f133863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f133864d;

    public e(t13.d<? super e> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133863c = obj;
        this.f133864d |= Integer.MIN_VALUE;
        return b.d(false, 0.0d, null, this);
    }
}
