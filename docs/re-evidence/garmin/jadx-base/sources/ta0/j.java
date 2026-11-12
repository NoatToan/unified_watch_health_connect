package ta0;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import l72.i3;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f163373b;

    public /* synthetic */ j(e23.l lVar, int i14) {
        this.f163372a = i14;
        this.f163373b = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        b63.o oVarB;
        int i14 = this.f163372a;
        e23.l lVar = this.f163373b;
        switch (i14) {
            case 0:
                Float f14 = (Float) obj;
                f14.floatValue();
                lVar.invoke(f14);
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj;
                str.getClass();
                if (str.length() <= 1) {
                    for (int i15 = 0; i15 < str.length(); i15++) {
                        if (Character.isDigit(str.charAt(i15))) {
                        }
                    }
                    lVar.invoke(str);
                }
                return Unit.INSTANCE;
            case 2:
                Float f15 = (Float) obj;
                f15.floatValue();
                lVar.invoke(f15);
                return Unit.INSTANCE;
            case 3:
                Float f16 = (Float) obj;
                f16.floatValue();
                lVar.invoke(f16);
                return Unit.INSTANCE;
            case 4:
                Float f17 = (Float) obj;
                f17.floatValue();
                lVar.invoke(f17);
                return Unit.INSTANCE;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                lVar.invoke(str2);
                return Unit.INSTANCE;
            case 6:
                String str3 = (String) obj;
                str3.getClass();
                lVar.invoke(str3);
                return Unit.INSTANCE;
            case 7:
                uf0.a aVar = (uf0.a) obj;
                aVar.getClass();
                lVar.invoke(new tf0.c(aVar));
                return Unit.INSTANCE;
            case 8:
                b63.o oVar = (b63.o) obj;
                oVar.getClass();
                lVar.invoke(oVar);
                return Unit.INSTANCE;
            case 9:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
                lottieAnimationView.getClass();
                lVar.invoke(lottieAnimationView);
                return Unit.INSTANCE;
            case 10:
                String str4 = (String) obj;
                str4.getClass();
                lVar.invoke(str4);
                return Unit.INSTANCE;
            case 11:
                Long l14 = (Long) obj;
                if (l14 != null) {
                    long jLongValue = l14.longValue();
                    b63.l.INSTANCE.getClass();
                    b63.l lVarA = b63.l.Companion.a(jLongValue);
                    b63.z.INSTANCE.getClass();
                    oVarB = b63.b.d(lVarA, b63.z.f16226b).b();
                } else {
                    oVarB = null;
                }
                lVar.invoke(oVarB);
                return Unit.INSTANCE;
            case 12:
                wg0.a aVar2 = (wg0.a) obj;
                aVar2.getClass();
                Boolean bool = (Boolean) lVar.invoke(aVar2);
                bool.getClass();
                return bool;
            case 13:
                i53.c cVar = (i53.c) obj;
                cVar.getClass();
                lVar.invoke(cVar);
                return Unit.INSTANCE;
            case 14:
                LocalDate localDate = (LocalDate) obj;
                localDate.getClass();
                lVar.invoke(localDate);
                return Unit.INSTANCE;
            case 15:
                dy1.d dVar = (dy1.d) obj;
                dVar.getClass();
                lVar.invoke(dVar);
                return Unit.INSTANCE;
            case 16:
                View view2 = (View) obj;
                view2.getClass();
                lVar.invoke(view2);
                return Unit.INSTANCE;
            case 17:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                lVar.invoke(i3Var.f111063a);
                return Unit.INSTANCE;
            case 18:
                pe0.g gVar = (pe0.g) obj;
                gVar.getClass();
                lVar.invoke(gVar);
                return Unit.INSTANCE;
            case 19:
                androidx.appcompat.app.e.a aVar3 = (androidx.appcompat.app.e.a) obj;
                int i16 = vq2.b.f179457y0;
                aVar3.getClass();
                aVar3.setTitle(R.string.dialog_title_error);
                aVar3.setMessage(R.string.txt_error_occurred);
                aVar3.setCancelable(false);
                aVar3.setNegativeButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 19));
                return Unit.INSTANCE;
            case 20:
                com.garmin.android.apps.connectmobile.navigation.more.b bVar = (com.garmin.android.apps.connectmobile.navigation.more.b) obj;
                bVar.getClass();
                lVar.invoke(bVar);
                return Unit.INSTANCE;
            case 21:
                com.garmin.android.apps.connectmobile.navigation.more.b bVar2 = (com.garmin.android.apps.connectmobile.navigation.more.b) obj;
                bVar2.getClass();
                lVar.invoke(bVar2);
                return Unit.INSTANCE;
            case 22:
                i3 i3Var2 = (i3) obj;
                i3Var2.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var2.f111063a, "MENU_CANCEL_SEARCH")) {
                    lVar.invoke("");
                }
                return Unit.INSTANCE;
            case 23:
                i3 i3Var3 = (i3) obj;
                i3Var3.getClass();
                lVar.invoke(Boolean.valueOf(p005kotlin.jvm.internal.s.g(i3Var3.f111063a, "MENU_SEARCH")));
                return Unit.INSTANCE;
            case 24:
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                lVar.invoke(new w02.q(f0Var));
                return Unit.INSTANCE;
            case 25:
                lVar.invoke(x11.a.f188380d.get(((Integer) obj).intValue()));
                return Unit.INSTANCE;
            case 26:
                b63.v vVar = (b63.v) obj;
                vVar.getClass();
                lVar.invoke(vVar);
                return Unit.INSTANCE;
            case 27:
                b11.l lVar2 = (b11.l) obj;
                lVar2.getClass();
                lVar.invoke(lVar2);
                return Unit.INSTANCE;
            case 28:
                m4.g0 g0Var = (m4.g0) obj;
                g0Var.getClass();
                lVar.invoke(Boolean.valueOf(g0Var.a()));
                return Unit.INSTANCE;
            default:
                String str5 = (String) obj;
                str5.getClass();
                lVar.invoke(str5);
                return Unit.INSTANCE;
        }
    }
}
