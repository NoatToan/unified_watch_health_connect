package yz2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class c implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateFormat f200488b;

    public c() {
        this.f200488b = new SimpleDateFormat("d", Locale.getDefault());
    }

    public c(DateFormat dateFormat) {
        this.f200488b = dateFormat;
    }
}
