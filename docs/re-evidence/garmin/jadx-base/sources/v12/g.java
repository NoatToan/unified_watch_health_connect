package v12;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f174702b;

    public /* synthetic */ g(h hVar, int i14) {
        this.f174701a = i14;
        this.f174702b = hVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Parcelable parcelable;
        int i14 = this.f174701a;
        h hVar = this.f174702b;
        switch (i14) {
            case 0:
                h.a aVar = h.f174703f;
                Bundle bundleRequireArguments = hVar.requireArguments();
                int i15 = Build.VERSION.SDK_INT;
                Parcelable parcelable2 = null;
                if (i15 >= 33) {
                    parcelable = bundleRequireArguments != null ? (Parcelable) bundleRequireArguments.getParcelable("activity", ip.a.class) : null;
                } else {
                    Parcelable parcelable3 = bundleRequireArguments != null ? bundleRequireArguments.getParcelable("activity") : null;
                    if (!(parcelable3 instanceof ip.a)) {
                        parcelable3 = null;
                    }
                    parcelable = (ip.a) parcelable3;
                }
                ip.a aVar2 = parcelable instanceof ip.a ? (ip.a) parcelable : null;
                Bundle bundleRequireArguments2 = hVar.requireArguments();
                if (i15 < 33) {
                    Parcelable parcelable4 = bundleRequireArguments2 != null ? bundleRequireArguments2.getParcelable("GCM_extra_screen_access_role") : null;
                    parcelable2 = (hl.a) (parcelable4 instanceof hl.a ? parcelable4 : null);
                } else if (bundleRequireArguments2 != null) {
                    parcelable2 = (Parcelable) bundleRequireArguments2.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                }
                Object obj = (hl.a) parcelable2;
                if (obj == null) {
                    obj = hl.a.c.f84256b;
                }
                return ParametersHolderKt.parametersOf(aVar2, obj);
            case 1:
                h.a aVar3 = h.f174703f;
                Context contextRequireContext = hVar.requireContext();
                contextRequireContext.getClass();
                PrivacyType privacyType = ((k) ((p2) hVar.u6().y4()).getValue()).f174751e;
                return b.a(contextRequireContext, privacyType != null ? privacyType.getF28797a() : R.string.unknown, new g(hVar, 2), new g(hVar, 3));
            case 2:
                h.a aVar4 = h.f174703f;
                hVar.u6().z4(w.c.f174821a);
                return Unit.INSTANCE;
            case 3:
                h.a aVar5 = h.f174703f;
                hVar.u6().z4(w.b.f174820a);
                return Unit.INSTANCE;
            case 4:
                h.a aVar6 = h.f174703f;
                hVar.u6().z4(w.c.f174821a);
                return Unit.INSTANCE;
            default:
                h.a aVar7 = h.f174703f;
                hVar.u6().z4(w.b.f174820a);
                return Unit.INSTANCE;
        }
    }
}
