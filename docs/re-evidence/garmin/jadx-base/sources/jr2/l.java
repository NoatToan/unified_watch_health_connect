package jr2;

import android.view.ContextThemeWrapper;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity$selectDevice$1$1", f = "DeveloperSettingsActivity.kt", l = {533}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kr2.h f100576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DeveloperSettingsActivity f100577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<ps2.n, Unit> f100578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(kr2.h hVar, DeveloperSettingsActivity developerSettingsActivity, e23.l<? super ps2.n, Unit> lVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f100576b = hVar;
        this.f100577c = developerSettingsActivity;
        this.f100578d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f100576b, this.f100577c, this.f100578d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f100575a;
        if (i14 == 0) {
            r.b(obj);
            this.f100575a = 1;
            this.f100576b.getClass();
            x53.c cVar = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new kr2.n(null), this);
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
        androidx.appcompat.app.e.a cancelable = new androidx.appcompat.app.e.a(new ContextThemeWrapper(this.f100577c, R.style.AlertDialogTheme)).setTitle("Choose target").setCancelable(false);
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((ps2.n) it.next()).f140511n));
        }
        cancelable.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), -1, new hg1.g(13, this.f100578d, list)).setNegativeButton(R.string.lbl_cancel, new com.garmin.android.apps.connectmobile.connectiq.i(0)).show();
        return Unit.INSTANCE;
    }
}
