package xp0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import gg1.n;
import java.util.ArrayList;
import org.apache.commons.lang3.text.WordUtils;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.r0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.hydration.presentation.settings.a f191834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f191835c;

    public /* synthetic */ c(com.garmin.android.apps.connectmobile.hydration.presentation.settings.a aVar, View view2, int i14) {
        this.f191833a = i14;
        this.f191834b = aVar;
        this.f191835c = view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, gg1.n] */
    @Override // e23.a
    public final Object invoke() {
        String string;
        switch (this.f191833a) {
            case 0:
                com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.C0652a c0652a = com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.f36709l;
                r0 r0Var = new r0();
                com.garmin.android.apps.connectmobile.hydration.presentation.settings.a aVar = this.f191834b;
                r0Var.f105810a = aVar.f36710a.i();
                ArrayList<q22.b> arrayListM = x.m(q22.b.CUP, q22.b.FLUID_OUNCE, q22.b.MILLILITER);
                ArrayList arrayList = new ArrayList(y.r(arrayListM, 10));
                for (q22.b bVar : arrayListM) {
                    if (bVar == q22.b.CUP) {
                        string = WordUtils.capitalize(aVar.getString(bVar.f142313b));
                    } else {
                        String strCapitalize = WordUtils.capitalize(aVar.getString(bVar.f142313b));
                        String string2 = aVar.getString(bVar.f142314c);
                        string2.getClass();
                        string = aVar.getString(R.string.string_space_string_bracket_pattern, strCapitalize, string2);
                    }
                    arrayList.add(string);
                }
                p0 p0Var = new p0();
                int iIndexOf = arrayListM.indexOf(jp0.c.h((n) r0Var.f105810a));
                p0Var.f105807a = iIndexOf;
                if (iIndexOf == -1) {
                    iIndexOf = 0;
                }
                p0Var.f105807a = iIndexOf;
                String string3 = aVar.getString(R.string.lbl_units);
                string3.getClass();
                int i14 = p0Var.f105807a;
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("EXTRA_CHOICE_LIST", new ArrayList<>(arrayList));
                bundle.putInt("EXTRA_SELECTED_INDEX", i14 >= 0 ? i14 : 0);
                bundle.putString("EXTRA_TITLE", string3);
                v20.d dVar = new v20.d();
                dVar.setArguments(bundle);
                dVar.f175291a = new com.google.firebase.remoteconfig.internal.b(p0Var, arrayListM, r0Var, aVar, this.f191835c);
                dVar.show(aVar.requireFragmentManager(), "v20.d");
                break;
            default:
                com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.C0652a c0652a2 = com.garmin.android.apps.connectmobile.hydration.presentation.settings.a.f36709l;
                Context context = this.f191835c.getContext();
                context.getClass();
                this.f191834b.y6(context);
                break;
        }
        return Unit.INSTANCE;
    }
}
