package n5;

import android.util.TypedValue;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln5/d;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0<TypedValue> f123718a = new i0<>(0, 1, null);

    public final void a() {
        synchronized (this) {
            this.f123718a.c();
            Unit unit = Unit.INSTANCE;
        }
    }
}
