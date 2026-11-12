package yz2;

import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class b implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Calendar f200487b;

    public b(Calendar calendar) {
        calendar.get(7);
        this.f200487b = calendar;
    }

    @Override // yz2.h
    public final CharSequence format(int i14) {
        Calendar calendar = this.f200487b;
        calendar.set(7, i14);
        return calendar.getDisplayName(7, 1, Locale.getDefault());
    }

    public b() {
        this(xz2.g.a());
    }
}
