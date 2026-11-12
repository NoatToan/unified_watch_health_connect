package rw;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import java.util.Calendar;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrw/i;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.b f154815a = (lw.b) KoinJavaComponent.get$default(lw.b.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<pw.a> f154816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f154817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Calendar f154818d;

    public i() {
        y0<pw.a> y0Var = new y0<>(new pw.a(0L, null, null, null, null, null, null, null, null, null, 1023, null));
        this.f154816b = y0Var;
        this.f154817c = y0Var;
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        calendar.getClass();
        this.f154818d = calendar;
    }
}
