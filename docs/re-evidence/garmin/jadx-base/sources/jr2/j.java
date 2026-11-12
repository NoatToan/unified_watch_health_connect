package jr2;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity$onFelicaFetchSEIDClicked$1$1", f = "DeveloperSettingsActivity.kt", l = {589}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeveloperSettingsActivity f100568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kr2.h f100569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DeveloperSettingsActivity developerSettingsActivity, kr2.h hVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f100568b = developerSettingsActivity;
        this.f100569c = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f100568b, this.f100569c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f100567a;
        DeveloperSettingsActivity developerSettingsActivity = this.f100568b;
        if (i14 == 0) {
            r.b(obj);
            hn2.c.ba(developerSettingsActivity, Boolean.TRUE, null, null, 14);
            this.f100567a = 1;
            this.f100569c.getClass();
            x53.c cVar = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new kr2.l(null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        List list = (List) obj;
        hn2.c.ba(developerSettingsActivity, Boolean.FALSE, null, null, 14);
        if (list.isEmpty()) {
            new androidx.appcompat.app.e.a(developerSettingsActivity).setTitle("No valid device found").setMessage("Perhaps the NFC connection is not established?").setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.connectiq.i(0)).setCancelable(false).show();
            return Unit.INSTANCE;
        }
        View viewFindViewById = new androidx.appcompat.app.e.a(developerSettingsActivity).setTitle("SEIDs:").setMessage(h0.k0(list, "\n", null, null, new jn2.b(6), 30)).setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.connectiq.i(0)).setCancelable(false).show().findViewById(android.R.id.message);
        if (viewFindViewById instanceof TextView) {
            ((TextView) viewFindViewById).setTextIsSelectable(true);
        } else {
            Toast.makeText(developerSettingsActivity, "Not able to make SEIDs copyable, please contact developers", 1).show();
        }
        return Unit.INSTANCE;
    }
}
