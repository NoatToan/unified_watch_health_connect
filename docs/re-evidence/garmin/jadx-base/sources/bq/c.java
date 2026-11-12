package bq;

import android.util.SparseArray;
import androidx.fragment.app.m;
import androidx.media3.exoplayer.w;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.q0;
import im.q;
import p005kotlin.Metadata;
import zm.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbq/c;", "", "Landroidx/fragment/app/m;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroidx/fragment/app/m;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f19475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<int[]> f19477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray<q0> f19478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f19479e;

    public c(m mVar) {
        mVar.getClass();
        this.f19475a = mVar;
        this.f19477c = new SparseArray<>();
    }

    public final String a(int i14) {
        String string = this.f19475a.getString(i14);
        string.getClass();
        return string;
    }

    public final void b(q qVar, p pVar) {
        String strN = pVar.N();
        if (strN != null) {
            qVar.d(strN, a(R.string.lbl_average));
        } else {
            qVar.h(false);
        }
    }
}
