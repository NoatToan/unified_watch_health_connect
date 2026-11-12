package rf0;

import android.view.View;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.filter.EcgFilterDateFragment;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import e23.l;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import pf0.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152392a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EcgFilterDateFragment f152393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f152394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f152395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LocalDate f152396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GCMComplexTwoLineButton f152397f;

    public /* synthetic */ b(EcgFilterDateFragment ecgFilterDateFragment, LocalDate localDate, a aVar, LocalDate localDate2, GCMComplexTwoLineButton gCMComplexTwoLineButton) {
        this.f152393b = ecgFilterDateFragment;
        this.f152395d = localDate;
        this.f152394c = aVar;
        this.f152396e = localDate2;
        this.f152397f = gCMComplexTwoLineButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f152392a) {
            case 0:
                final a aVar = this.f152394c;
                LocalDate localDate = aVar.f152391d;
                if (localDate == null) {
                    localDate = this.f152396e;
                }
                LocalDate localDate2 = aVar.f152390c;
                final int i14 = 0;
                final GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f152397f;
                final EcgFilterDateFragment ecgFilterDateFragment = this.f152393b;
                ecgFilterDateFragment.u6(this.f152395d, localDate, localDate2, new l() { // from class: rf0.d
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        LocalDate localDate3 = (LocalDate) obj;
                        switch (i14) {
                            case 0:
                                localDate3.getClass();
                                a aVar2 = aVar;
                                aVar2.f152390c = localDate3;
                                EcgFilterDateFragment ecgFilterDateFragment2 = ecgFilterDateFragment;
                                s sVar = ecgFilterDateFragment2.f34910b;
                                if (sVar == null) {
                                    p005kotlin.jvm.internal.s.m("formatter");
                                    throw null;
                                }
                                String strD = sVar.d(localDate3);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = gCMComplexTwoLineButton;
                                gCMComplexTwoLineButton2.setButtonBottomLeftLabel(strD);
                                ecgFilterDateFragment2.v6(gCMComplexTwoLineButton2, aVar2.f152390c != null);
                                return Unit.INSTANCE;
                            default:
                                localDate3.getClass();
                                a aVar3 = aVar;
                                aVar3.f152391d = localDate3;
                                EcgFilterDateFragment ecgFilterDateFragment3 = ecgFilterDateFragment;
                                s sVar2 = ecgFilterDateFragment3.f34910b;
                                if (sVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("formatter");
                                    throw null;
                                }
                                String strD2 = sVar2.d(localDate3);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton3 = gCMComplexTwoLineButton;
                                gCMComplexTwoLineButton3.setButtonBottomLeftLabel(strD2);
                                ecgFilterDateFragment3.v6(gCMComplexTwoLineButton3, aVar3.f152391d != null);
                                return Unit.INSTANCE;
                        }
                    }
                });
                break;
            default:
                final a aVar2 = this.f152394c;
                LocalDate localDate3 = aVar2.f152390c;
                if (localDate3 == null) {
                    localDate3 = this.f152395d;
                }
                LocalDate localDate4 = aVar2.f152391d;
                final int i15 = 1;
                final GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f152397f;
                final EcgFilterDateFragment ecgFilterDateFragment2 = this.f152393b;
                ecgFilterDateFragment2.u6(localDate3, this.f152396e, localDate4, new l() { // from class: rf0.d
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        LocalDate localDate5 = (LocalDate) obj;
                        switch (i15) {
                            case 0:
                                localDate5.getClass();
                                a aVar3 = aVar2;
                                aVar3.f152390c = localDate5;
                                EcgFilterDateFragment ecgFilterDateFragment3 = ecgFilterDateFragment2;
                                s sVar = ecgFilterDateFragment3.f34910b;
                                if (sVar == null) {
                                    p005kotlin.jvm.internal.s.m("formatter");
                                    throw null;
                                }
                                String strD = sVar.d(localDate5);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton3 = gCMComplexTwoLineButton2;
                                gCMComplexTwoLineButton3.setButtonBottomLeftLabel(strD);
                                ecgFilterDateFragment3.v6(gCMComplexTwoLineButton3, aVar3.f152390c != null);
                                return Unit.INSTANCE;
                            default:
                                localDate5.getClass();
                                a aVar4 = aVar2;
                                aVar4.f152391d = localDate5;
                                EcgFilterDateFragment ecgFilterDateFragment4 = ecgFilterDateFragment2;
                                s sVar2 = ecgFilterDateFragment4.f34910b;
                                if (sVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("formatter");
                                    throw null;
                                }
                                String strD2 = sVar2.d(localDate5);
                                GCMComplexTwoLineButton gCMComplexTwoLineButton4 = gCMComplexTwoLineButton2;
                                gCMComplexTwoLineButton4.setButtonBottomLeftLabel(strD2);
                                ecgFilterDateFragment4.v6(gCMComplexTwoLineButton4, aVar4.f152391d != null);
                                return Unit.INSTANCE;
                        }
                    }
                });
                break;
        }
    }

    public /* synthetic */ b(EcgFilterDateFragment ecgFilterDateFragment, a aVar, LocalDate localDate, LocalDate localDate2, GCMComplexTwoLineButton gCMComplexTwoLineButton) {
        this.f152393b = ecgFilterDateFragment;
        this.f152394c = aVar;
        this.f152395d = localDate;
        this.f152396e = localDate2;
        this.f152397f = gCMComplexTwoLineButton;
    }
}
