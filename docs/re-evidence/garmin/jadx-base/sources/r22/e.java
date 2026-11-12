package r22;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import lo.l3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lr22/e;", "Lr22/r1;", "<init>", "()V", "b", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends r1 {
    public static final a Z = new a(null);
    public boolean T;
    public b X;
    public boolean Y;

    public interface b {
        void a(int i14, int i15, String str, l3 l3Var);
    }

    public static final e y6(boolean z14) {
        Z.getClass();
        Bundle bundle = new Bundle();
        e eVar = new e();
        bundle.putBoolean("EXTRA_IS_SWIMMING", z14);
        eVar.setArguments(bundle);
        return eVar;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.T = arguments.getBoolean("EXTRA_IS_SWIMMING");
        }
        this.f149845t = getString(R.string.lbl_cancel);
        this.f149846v = getString(R.string.lbl_done);
        this.f149848x = new d(this);
        this.f149847w = new d(this);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lr22/e$a;", "", "<init>", "()V", "", "EXTRA_IS_SWIMMING", "Ljava/lang/String;", "TAG", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
