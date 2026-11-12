package yz2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateFormat f200489a;

    public d() {
        this.f200489a = new SimpleDateFormat("LLLL yyyy", Locale.getDefault());
    }

    @Override // yz2.g
    public final CharSequence a(xz2.b bVar) {
        return this.f200489a.format(bVar.g());
    }

    public d(DateFormat dateFormat) {
        this.f200489a = dateFormat;
    }
}
