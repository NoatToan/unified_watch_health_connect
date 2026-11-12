package o81;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import e32.h;
import e32.k;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo81/c;", "Le32/k;", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends k {
    public c() {
        super(null, 1, null);
    }

    @Override // e32.k
    public final Fragment b(int i14, DateTime dateTime, DateTime dateTime2) {
        s71.a.f157850i.getClass();
        s71.a aVar = new s71.a();
        Bundle bundle = new Bundle();
        h.f62784h.getClass();
        bundle.putInt("ARG_INTERVAL_TYPE", i14);
        bundle.putSerializable("ARG_INITIAL_DATE", dateTime);
        bundle.putSerializable("ARG_END_DATE", null);
        aVar.setArguments(bundle);
        return aVar;
    }
}
