package kb1;

import android.content.DialogInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import db1.m;
import e23.p;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b f103833b;

    public /* synthetic */ g(com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b bVar, int i14) {
        this.f103832a = i14;
        this.f103833b = bVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f103832a;
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b bVar = this.f103833b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).getClass();
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.f40906o;
        switch (i14) {
            case 0:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                m mVar = bVar.f40916i;
                if (mVar == null) {
                    s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                LocalDate originalDueDate = mVar.getOriginalDueDate();
                if (originalDueDate != null) {
                    a aVar2 = bVar.f40917j;
                    if (aVar2 == null) {
                        s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                    aVar2.O1(originalDueDate);
                }
                return Unit.INSTANCE;
            default:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                bVar.u6();
                return Unit.INSTANCE;
        }
    }
}
