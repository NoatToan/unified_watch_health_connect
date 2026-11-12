package e32;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.s0;
import com.garmin.android.apps.connectmobile.R;
import e32.p;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Le32/i;", "Data", "Le32/p;", "ViewBinder", "NavigatorDestination", "Le32/a;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class i<Data, ViewBinder extends p<Data>, NavigatorDestination> extends e32.a<Data, ViewBinder, NavigatorDestination> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f62791o = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DateTime f62792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DateTime f62793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f62794m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f32.m f62795n;

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        f32.m mVar = this.f62795n;
        if (mVar == null) {
            s.m("dataAdapter");
            throw null;
        }
        mVar.f68692a.b(V6(), T6());
    }

    @Override // e32.a
    public final s0<fw.m<Data>> I6() {
        f32.m mVar = this.f62795n;
        if (mVar == null) {
            s.m("dataAdapter");
            throw null;
        }
        return mVar.f68692a.a(V6(), T6());
    }

    public final DateTime T6() {
        DateTime dateTime = this.f62793l;
        if (dateTime != null) {
            return dateTime;
        }
        s.m("endDate");
        throw null;
    }

    public abstract int U6();

    public final DateTime V6() {
        DateTime dateTime = this.f62792k;
        if (dateTime != null) {
            return dateTime;
        }
        s.m("startDate");
        throw null;
    }

    public abstract f32.m X6();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f62792k = new DateTime(arguments != null ? arguments.getLong("GCM_extra_start_date") : DateTime.now().getMillis());
        Bundle arguments2 = getArguments();
        this.f62793l = new DateTime(arguments2 != null ? arguments2.getLong("GCM_extra_end_date") : DateTime.now().getMillis());
        Bundle arguments3 = getArguments();
        this.f62794m = arguments3 != null ? arguments3.getInt("EXTRA_INTERVAL_TYPE", 4) : 4;
        f32.m mVarX6 = X6();
        mVarX6.getClass();
        this.f62795n = mVarX6;
    }

    @Override // e32.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        View viewFindViewById;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        int iU6 = U6();
        if (iU6 == -1 || (viewFindViewById = view2.findViewById(iU6)) == null) {
            return;
        }
        v22.e.g(R.color.gcm_background_hero, viewFindViewById);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Le32/i$a;", "", "<init>", "()V", "", "DEFAULT_INTERVAL_TYPE", "I", "", "EXTRA_INTERVAL_TYPE", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Bundle a(int i14, long j8, long j14) {
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_INTERVAL_TYPE", i14);
            bundle.putLong("GCM_extra_start_date", j8);
            bundle.putLong("GCM_extra_end_date", j14);
            return bundle;
        }

        private a() {
        }
    }
}
