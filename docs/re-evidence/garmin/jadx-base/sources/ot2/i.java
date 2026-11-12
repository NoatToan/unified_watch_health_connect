package ot2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.lib.workoutcommon.presentation.formatter.RepsAndWeightFormatterKt", f = "RepsAndWeightFormatter.kt", l = {183, SyslogConstants.LOG_LOCAL7}, m = "formatExerciseWeight")
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f133877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f133878b;

    public i(t13.d<? super i> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133877a = obj;
        this.f133878b |= Integer.MIN_VALUE;
        return oi0.c.q(false, null, null, null, this);
    }
}
