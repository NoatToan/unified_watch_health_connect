package j41;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import e32.h;
import e32.k;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj41/d;", "Le32/k;", "<init>", "()V", "gcm-overnighthrv_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends k {
    public d() {
        super(null, 1, null);
    }

    @Override // e32.k
    public final Fragment b(int i14, DateTime dateTime, DateTime dateTime2) {
        a.f97025i.getClass();
        a aVar = new a();
        Bundle bundle = new Bundle();
        h.f62784h.getClass();
        bundle.putInt("ARG_INTERVAL_TYPE", i14);
        bundle.putSerializable("ARG_INITIAL_DATE", dateTime);
        bundle.putSerializable("ARG_END_DATE", null);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // e32.k
    public final Fragment c(DateTime dateTime) {
        a.f97025i.getClass();
        a aVar = new a();
        Bundle bundle = new Bundle();
        h.f62784h.getClass();
        bundle.putInt("ARG_INTERVAL_TYPE", 1);
        bundle.putSerializable("ARG_INITIAL_DATE", dateTime);
        bundle.putSerializable("ARG_END_DATE", null);
        aVar.setArguments(bundle);
        return aVar;
    }
}
