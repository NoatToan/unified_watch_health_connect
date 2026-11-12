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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Le32/c;", "Data", "Le32/p;", "ViewBinder", "NavigatorDestination", "Le32/a;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c<Data, ViewBinder extends p<Data>, NavigatorDestination> extends e32.a<Data, ViewBinder, NavigatorDestination> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f62777m = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DateTime f62778k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f32.l f62779l;

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        f32.l lVar = this.f62779l;
        if (lVar == null) {
            s.m("dataAdapter");
            throw null;
        }
        lVar.f68691a.a(U6());
    }

    @Override // e32.a
    public final s0<fw.m<Data>> I6() {
        f32.l lVar = this.f62779l;
        if (lVar != null) {
            return (s0<fw.m<Data>>) lVar.a(U6());
        }
        s.m("dataAdapter");
        throw null;
    }

    public int T6() {
        return R.color.gcm_background_hero;
    }

    public final DateTime U6() {
        DateTime dateTime = this.f62778k;
        if (dateTime != null) {
            return dateTime;
        }
        s.m("date");
        throw null;
    }

    public abstract f32.l V6();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f62778k = new DateTime(arguments != null ? arguments.getLong("extra.date.time") : DateTime.now().getMillis());
        f32.l lVarV6 = V6();
        lVarV6.getClass();
        this.f62779l = lVarV6;
    }

    @Override // e32.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        v22.e.g(T6(), view2);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le32/c$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
