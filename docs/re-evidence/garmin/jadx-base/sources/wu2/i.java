package wu2;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwu2/i;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f187354a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cx2.h f187355b = new cx2.h("ConfirmationDisplayUtil", null, 2, null);

    public interface a {
        p<Fragment, dx2.c, Unit> a();

        p<Fragment, dx2.c, Unit> b();

        p<Fragment, dx2.c, Unit> c();
    }

    private i() {
    }

    public static void a(final Fragment fragment, final a aVar, final dx2.c cVar, zw2.f fVar, b bVar) {
        fragment.getClass();
        cVar.getClass();
        f187355b.getClass();
        String strB = fVar.b(bVar.f187332a);
        String strB2 = fVar.b(bVar.f187333b);
        String strB3 = fVar.b(bVar.f187334c);
        if (strB3.length() == 0) {
            strB3 = fragment.requireContext().getString(R.string.lbl_ok);
            strB3.getClass();
        }
        String strB4 = fVar.b(bVar.f187335d);
        if (strB4.length() == 0) {
            strB4 = fragment.requireContext().getString(R.string.lbl_cancel);
            strB4.getClass();
        }
        if (strB2.length() <= 0) {
            Logger logger = cx2.h.f56678c;
            aVar.c().invoke(fragment, cVar);
            return;
        }
        ew2.e.a aVar2 = ew2.e.f66901a;
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        final int i14 = 0;
        o13.p pVar = new o13.p(strB3, new p() { // from class: wu2.h
            @Override // e23.p
            public final Object invoke(Object obj, Object obj2) {
                int i15 = i14;
                dx2.c cVar2 = cVar;
                Fragment fragment2 = fragment;
                i.a aVar3 = aVar;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                i iVar = i.f187354a;
                switch (i15) {
                    case 0:
                        dialogInterface.getClass();
                        i.f187355b.getClass();
                        aVar3.a().invoke(fragment2, cVar2);
                        break;
                    default:
                        dialogInterface.getClass();
                        i.f187355b.getClass();
                        aVar3.b().invoke(fragment2, cVar2);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        final int i15 = 1;
        ew2.e.a.a(aVar2, contextRequireContext, strB, strB2, pVar, new o13.p(strB4, new p() { // from class: wu2.h
            @Override // e23.p
            public final Object invoke(Object obj, Object obj2) {
                int i16 = i15;
                dx2.c cVar2 = cVar;
                Fragment fragment2 = fragment;
                i.a aVar3 = aVar;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                i iVar = i.f187354a;
                switch (i16) {
                    case 0:
                        dialogInterface.getClass();
                        i.f187355b.getClass();
                        aVar3.a().invoke(fragment2, cVar2);
                        break;
                    default:
                        dialogInterface.getClass();
                        i.f187355b.getClass();
                        aVar3.b().invoke(fragment2, cVar2);
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 992).show();
    }
}
