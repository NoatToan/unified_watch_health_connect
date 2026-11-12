package r22;

import android.content.Context;
import android.os.Bundle;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr22/f0;", "Lr22/a2;", "<init>", "()V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class f0 extends a2 {
    public static final a U0 = new a(null);
    public static final String V0 = f0.class.getSimpleName();
    public boolean S0;
    public boolean T0;

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i14 = arguments.getInt("EXTRA_SECONDS");
            int i15 = arguments.getInt("EXTRA_MAX_HOURS");
            boolean z14 = arguments.getBoolean("EXTRA_DISABLE_HOURS");
            this.S0 = arguments.getBoolean("EXTRA_DISABLE_SECONDS");
            this.T0 = arguments.getBoolean("EXTRA_DISABLE_TIME_UNITS");
            C6(0, i15, true);
            H6(0, 59, true);
            J6(0, 59, true);
            this.F = getString(R.string.lbl_cancel);
            this.I = getString(R.string.lbl_done);
            int i16 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
            int i17 = i14 % DateTimeConstants.SECONDS_PER_HOUR;
            int i18 = i17 / 60;
            int i19 = i17 % 60;
            if (this.S0 && i19 > 0) {
                i18++;
                if (i18 == 60) {
                    i16++;
                    i18 = 0;
                }
                i19 = 0;
            }
            A6(i16);
            E6(i18);
            I6(i19);
            if (z14) {
                this.f149567m = false;
            }
            if (this.S0) {
                this.f149569o = false;
            }
        }
    }

    @Override // r22.a2
    public final String v6(String str, int i14, int i15, String str2, String str3, int i16) {
        int iD = fb1.c.d(i15, 60, i14 * DateTimeConstants.SECONDS_PER_HOUR, i16);
        boolean z14 = this.T0;
        if (z14 && this.S0) {
            l3.f23124b.getClass();
            return l3.a.q1(iD);
        }
        if (!z14 && this.S0) {
            l3.a aVar = l3.f23124b;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            aVar.getClass();
            return l3.a.h1(iD, contextRequireContext);
        }
        if (z14 && !this.S0) {
            l3.f23124b.getClass();
            return l3.a.n1(iD);
        }
        l3.a aVar2 = l3.f23124b;
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        aVar2.getClass();
        return l3.a.j1(contextRequireContext2, i14, i15, i16);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lr22/f0$a;", "", "<init>", "()V", "", "EXTRA_TIME", "Ljava/lang/String;", "EXTRA_MAX_HOURS", "EXTRA_DISABLE_HOURS", "EXTRA_DISABLE_SECONDS", "EXTRA_DISABLE_TIME_UNITS", "", "ONE_HOUR_IN_SECONDS", "I", "ONE_HOUR_IN_MINUTES", "ONE_MINUTE_IN_SECONDS", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static f0 a(int i14, int i15, boolean z14, boolean z15, boolean z16) {
            f0 f0Var = new f0();
            f0Var.setArguments(h7.c.a(new o13.p("EXTRA_SECONDS", Integer.valueOf(i14)), new o13.p("EXTRA_MAX_HOURS", Integer.valueOf(i15)), new o13.p("EXTRA_DISABLE_HOURS", Boolean.valueOf(z14)), new o13.p("EXTRA_DISABLE_SECONDS", Boolean.valueOf(z15)), new o13.p("EXTRA_DISABLE_TIME_UNITS", Boolean.valueOf(z16))));
            return f0Var;
        }

        public static /* synthetic */ f0 b(a aVar, int i14, int i15, int i16) {
            boolean z14 = (i16 & 4) == 0;
            boolean z15 = (i16 & 16) == 0;
            aVar.getClass();
            return a(i14, i15, z14, false, z15);
        }

        private a() {
        }
    }
}
