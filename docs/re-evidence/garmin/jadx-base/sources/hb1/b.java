package hb1;

import android.content.DialogInterface;
import db1.m;
import e23.p;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a f82755b;

    public /* synthetic */ b(com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a aVar, int i14) {
        this.f82754a = i14;
        this.f82755b = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82754a;
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a aVar = this.f82755b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).getClass();
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
        switch (i14) {
            case 0:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                m mVar = aVar.f40592m;
                if (mVar == null) {
                    s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                LocalDate originalDueDate = mVar.getOriginalDueDate();
                if (originalDueDate != null) {
                    ((kb1.e) aVar.f40580a.getValue()).y4(originalDueDate);
                }
                return Unit.INSTANCE;
            case 1:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                m mVar2 = aVar.f40592m;
                if (mVar2 == null) {
                    s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                LocalDate originalDueDate2 = mVar2.getOriginalDueDate();
                if (originalDueDate2 != null) {
                    ((kb1.e) aVar.f40580a.getValue()).y4(originalDueDate2);
                }
                return Unit.INSTANCE;
            default:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                aVar.u6();
                return Unit.INSTANCE;
        }
    }
}
