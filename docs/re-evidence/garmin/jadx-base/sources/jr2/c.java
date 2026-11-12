package jr2;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Toast;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeveloperSettingsActivity f100555b;

    public /* synthetic */ c(DeveloperSettingsActivity developerSettingsActivity, int i14) {
        this.f100554a = i14;
        this.f100555b = developerSettingsActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f100554a;
        DeveloperSettingsActivity developerSettingsActivity = this.f100555b;
        switch (i14) {
            case 0:
                String str = DeveloperSettingsActivity.f51946n;
                Toast.makeText(developerSettingsActivity, ((Throwable) obj).getMessage(), 0).show();
                return Unit.INSTANCE;
            case 1:
                String str2 = DeveloperSettingsActivity.f51946n;
                hn2.c.ba(developerSettingsActivity, (Boolean) obj, null, null, 14);
                return Unit.INSTANCE;
            case 2:
                String str3 = DeveloperSettingsActivity.f51946n;
                if (((Boolean) obj).booleanValue()) {
                    kr2.h hVar = developerSettingsActivity.f51955g;
                    if (hVar == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    hVar.x4();
                }
                return Unit.INSTANCE;
            case 3:
                wr2.f fVar = (wr2.f) obj;
                String str4 = DeveloperSettingsActivity.f51946n;
                fVar.getClass();
                wr2.g gVar = wr2.g.f186857a;
                View viewFindViewById = developerSettingsActivity.findViewById(R.id.content);
                viewFindViewById.getClass();
                gVar.getClass();
                wr2.g.b(viewFindViewById, fVar);
                return Unit.INSTANCE;
            case 4:
                List<kr2.a> list = (List) obj;
                String str5 = DeveloperSettingsActivity.f51946n;
                pp2.a.f139535c.getClass();
                pp2.a aVar = new pp2.a();
                list.getClass();
                aVar.f139537b = list;
                developerSettingsActivity.ha(aVar, DeveloperSettingsActivity.f51947o);
                return Unit.INSTANCE;
            default:
                List list2 = (List) obj;
                String str6 = DeveloperSettingsActivity.f51946n;
                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(new ContextThemeWrapper(developerSettingsActivity, com.garmin.android.apps.connectmobile.R.style.AlertDialogTheme));
                developerSettingsActivity.setTitle("Pick a device");
                list2.getClass();
                ArrayList arrayList = new ArrayList(y.r(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((sd2.f) it.next()).getUnitID()));
                }
                aVar2.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), -1, new hg1.g(12, developerSettingsActivity, list2));
                aVar2.show();
                return Unit.INSTANCE;
        }
    }
}
