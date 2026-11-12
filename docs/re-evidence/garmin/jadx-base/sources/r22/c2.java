package r22;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr22/c2;", "Lr22/a2;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c2 extends a2 {
    public static final a S0 = new a(null);

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i14 = arguments.getInt("EXTRA_MILLISECONDS");
            C6(0, 59, true);
            H6(0, 59, true);
            J6(0, 99, true);
            this.F = getString(R.string.lbl_cancel);
            this.I = getString(R.string.lbl_done);
            A6((i14 / DateTimeConstants.MILLIS_PER_MINUTE) % 60);
            E6((i14 / 1000) % 60);
            I6((i14 % 1000) / 10);
        }
    }

    @Override // r22.a2
    public final String v6(String str, int i14, int i15, String str2, String str3, int i16) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return i14 + ":" + i15 + "." + i16;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr22/c2$a;", "", "<init>", "()V", "", "EXTRA_TIME", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
