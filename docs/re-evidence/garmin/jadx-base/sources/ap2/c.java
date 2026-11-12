package ap2;

import android.content.DialogInterface;
import android.os.Handler;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayAddCardActivity f11685b;

    public /* synthetic */ c(FitPayAddCardActivity fitPayAddCardActivity, int i14) {
        this.f11684a = i14;
        this.f11685b = fitPayAddCardActivity;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f11684a;
        FitPayAddCardActivity fitPayAddCardActivity = this.f11685b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.intValue();
                FitPayAddCardActivity.a aVar = FitPayAddCardActivity.f51376x;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                fitPayAddCardActivity.ea();
                break;
            case 1:
                num.getClass();
                FitPayAddCardActivity.a aVar2 = FitPayAddCardActivity.f51376x;
                dialogInterface.getClass();
                fitPayAddCardActivity.ea();
                break;
            case 2:
                num.getClass();
                FitPayAddCardActivity.a aVar3 = FitPayAddCardActivity.f51376x;
                dialogInterface.getClass();
                fitPayAddCardActivity.ea();
                break;
            case 3:
                num.getClass();
                FitPayAddCardActivity.a aVar4 = FitPayAddCardActivity.f51376x;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                try {
                    eo2.d.f64794a.getClass();
                    if (g22.n.d(eo2.d.f64799f.get())) {
                        wr2.j.f186862a.getClass();
                        wr2.j.b("FitPayAddCardActivity.showSomethingWentWrongDialog()");
                        eo2.d.c(fitPayAddCardActivity);
                    } else {
                        fitPayAddCardActivity.S9(fitPayAddCardActivity);
                    }
                } catch (Exception unused) {
                    hn2.c.U9(fitPayAddCardActivity, fitPayAddCardActivity, null, 14);
                }
                break;
            case 4:
                num.getClass();
                FitPayAddCardActivity.a aVar5 = FitPayAddCardActivity.f51376x;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                fitPayAddCardActivity.ea();
                break;
            case 5:
                num.getClass();
                FitPayAddCardActivity.a aVar6 = FitPayAddCardActivity.f51376x;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                fitPayAddCardActivity.f51383l = true;
                Handler handler = fitPayAddCardActivity.f51389r;
                a0.c cVar = fitPayAddCardActivity.f51390t;
                handler.removeCallbacks(cVar);
                handler.postDelayed(cVar, 900000L);
                String str = fitPayAddCardActivity.f51379h;
                if (str != null) {
                    if (((com.garmin.android.apps.connectmobile.l) zf.b.r()).m()) {
                        fitPayAddCardActivity.v4(str);
                    } else {
                        fitPayAddCardActivity.B3(str, fitPayAddCardActivity.f51380i, fitPayAddCardActivity.f51382k);
                    }
                }
                break;
            case 6:
                num.getClass();
                FitPayAddCardActivity.a aVar7 = FitPayAddCardActivity.f51376x;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                fitPayAddCardActivity.ea();
                break;
            case 7:
                num.getClass();
                FitPayAddCardActivity.a aVar8 = FitPayAddCardActivity.f51376x;
                dialogInterface.getClass();
                fitPayAddCardActivity.onBackPressed();
                dialogInterface.dismiss();
                break;
            case 8:
                num.getClass();
                FitPayAddCardActivity.a aVar9 = FitPayAddCardActivity.f51376x;
                dialogInterface.getClass();
                fitPayAddCardActivity.ea();
                dialogInterface.dismiss();
                break;
            case 9:
                num.getClass();
                FitPayAddCardActivity.a aVar10 = FitPayAddCardActivity.f51376x;
                dialogInterface.getClass();
                fitPayAddCardActivity.ea();
                dialogInterface.dismiss();
                break;
            default:
                num.getClass();
                FitPayAddCardActivity.a aVar11 = FitPayAddCardActivity.f51376x;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                fitPayAddCardActivity.onBackPressed();
                break;
        }
        return Unit.INSTANCE;
    }
}
