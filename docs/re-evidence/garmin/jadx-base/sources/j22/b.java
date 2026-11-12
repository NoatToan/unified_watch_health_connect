package j22;

import android.app.Activity;
import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import bv2.j;
import c22.o;
import com.garmin.android.apps.connectmobile.R;
import go1.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.u;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj22/b;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f96736a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f96737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f96738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f96739d;

    static {
        int i14 = gt2.c.f79010a;
        f96737b = gt2.b.f79005a.h("AndroidPermissionUtil");
        f96738c = -1L;
        f96739d = -1L;
    }

    private b() {
    }

    public static void A(f.c cVar, List list) {
        cVar.getClass();
        list.getClass();
        f96738c = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).f96735b);
        }
        cVar.a(arrayList.toArray(new String[0]), null);
    }

    public static void B(com.garmin.android.apps.connectmobile.c cVar, a... aVarArr) {
        LayoutInflater layoutInflater = cVar.getLayoutInflater();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.contact_read_permission_information_dialog, (ViewGroup) null);
        viewInflate.getClass();
        AppCompatButton appCompatButton = (AppCompatButton) viewInflate.findViewById(R.id.allow_contacts_access);
        AppCompatButton appCompatButton2 = (AppCompatButton) viewInflate.findViewById(R.id.not_now);
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(cVar);
        aVar.setView(viewInflate);
        androidx.appcompat.app.e eVarShow = aVar.show();
        appCompatButton.setOnClickListener(new j(cVar, 15, aVarArr, eVarShow));
        appCompatButton2.setOnClickListener(new g0(eVarShow, 28));
    }

    public static boolean C(Activity activity, a aVar) {
        activity.getClass();
        aVar.getClass();
        return z6.a.b(activity, aVar.f96735b);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    public static f D(Map map) {
        f fVar;
        map.getClass();
        Logger logger = f96737b;
        logger.debug("verifyLocationRequestResults: permissionResults: " + map);
        Collection collectionValues = map.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            fVar = f.ALLOWED_ALL_TIME;
        } else {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    Collection collectionValues2 = map.values();
                    if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                        Iterator it3 = collectionValues2.iterator();
                        while (it3.hasNext()) {
                            if (((Boolean) it3.next()).booleanValue()) {
                                fVar = f.ALLOWED_WHILE_USING;
                            }
                        }
                        if (m()) {
                            fVar = f.DENIED_DONT_ASK_AGAIN;
                        } else {
                            fVar = f.DENIED;
                        }
                    } else if (m()) {
                        fVar = f.DENIED_DONT_ASK_AGAIN;
                    } else {
                        fVar = f.DENIED;
                    }
                }
            }
            fVar = f.ALLOWED_ALL_TIME;
        }
        logger.debug("verifyLocationRequestResults: LocationPermissionStatus[" + fVar + "]");
        return fVar;
    }

    public static boolean E(int[] iArr) {
        iArr.getClass();
        return G(iArr) == h.ALLOWED;
    }

    public static h F(Map map) {
        map.getClass();
        Collection collectionValues = map.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    Collection collectionValues2 = map.values();
                    if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                        Iterator it3 = collectionValues2.iterator();
                        while (it3.hasNext()) {
                            if (((Boolean) it3.next()).booleanValue()) {
                                return h.PARTIALLY_ALLOWED;
                            }
                        }
                    }
                    return m() ? h.DENIED_DONT_ASK_AGAIN : h.DENIED;
                }
            }
        }
        return h.ALLOWED;
    }

    public static h G(int[] iArr) {
        iArr.getClass();
        if (iArr.length == 0) {
            return h.DENIED;
        }
        for (int i14 : iArr) {
            f96736a.getClass();
            if (i14 != 0) {
                for (int i15 : iArr) {
                    if (i15 == 0) {
                        return h.PARTIALLY_ALLOWED;
                    }
                }
                return m() ? h.DENIED_DONT_ASK_AGAIN : h.DENIED;
            }
        }
        return h.ALLOWED;
    }

    public static boolean a(Context context) {
        context.getClass();
        if (!l()) {
            return false;
        }
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        return ((AlarmManager) systemService).canScheduleExactAlarms();
    }

    public static boolean b(Context context) {
        context.getClass();
        return !n() || p(context, g.f96759d);
    }

    public static boolean c(Context context) {
        context.getClass();
        return j(context) == f.ALLOWED_WHILE_USING || j(context) == f.ALLOWED_ALL_TIME;
    }

    public static boolean d() {
        return !q() || k(a.f96722k);
    }

    public static Intent e(Context context) {
        context.getClass();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return intent;
        }
        return null;
    }

    public static String f(a aVar) {
        aVar.getClass();
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        String string = contextC.getString(R.string.msg_generic_permission_required, contextC.getString(aVar.f96734a));
        string.getClass();
        return string;
    }

    public static String g(a aVar) {
        aVar.getClass();
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        String string = contextC.getString(R.string.msg_generic_permission_required_snackbar, contextC.getString(aVar.f96734a));
        string.getClass();
        return string;
    }

    public static String h(List list) {
        list.getClass();
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        StringBuilder sb3 = new StringBuilder();
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (i14 > 0) {
                sb3.append(", ");
            }
            sb3.append(contextC.getString(((a) list.get(i14)).f96734a));
        }
        String string = contextC.getString(R.string.msg_generic_permissions_required_app_settings, sb3.toString());
        string.getClass();
        return string;
    }

    public static String i(ArrayList arrayList) {
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        StringBuilder sb3 = new StringBuilder(contextC.getString(R.string.msg_generic_permissions_required));
        sb3.append("<p>");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb3.append("&#149;&nbsp;");
            sb3.append(contextC.getString(aVar.f96734a));
            sb3.append("<br/>");
        }
        sb3.append("</p>");
        return sb3.toString();
    }

    public static f j(Context context) {
        f fVar;
        context.getClass();
        boolean zO = o(context, a.f96718g.f96735b);
        boolean zO2 = o(context, a.f96719h.f96735b);
        Logger logger = f96737b;
        if (zO || zO2) {
            logger.debug("getLocationPermissionStatus version: " + Build.VERSION.SDK_INT);
            fVar = (!t() || o(context, a.f96720i.f96735b)) ? f.ALLOWED_ALL_TIME : f.ALLOWED_WHILE_USING;
        } else {
            fVar = f.DENIED;
        }
        com.airbnb.lottie.animation.keyframe.a.w("getLocationPermissionStatus: returning ", fVar.name(), logger);
        return fVar;
    }

    public static boolean k(a... aVarArr) {
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        for (a aVar : aVarArr) {
            String str = aVar.f96735b;
            f96736a.getClass();
            if (!o(contextC, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean m() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f96739d = jCurrentTimeMillis;
        wr.g.v("verifyResults: time taken=[", jCurrentTimeMillis - f96738c, "], threshold=[350]", f96737b);
        long j8 = f96738c;
        return j8 != -1 && f96739d - j8 < 350;
    }

    public static boolean n() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean o(Context context, String str) {
        context.getClass();
        str.getClass();
        return a7.b.checkSelfPermission(context, str) == 0;
    }

    public static boolean p(Context context, g gVar) {
        context.getClass();
        gVar.getClass();
        List<a> list = gVar.f96774c;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = ((a) it.next()).f96735b;
            f96736a.getClass();
            if (!o(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean q() {
        return Build.VERSION.SDK_INT < 29;
    }

    public static void r(Activity activity) {
        activity.getClass();
        Intent intentE = e(activity);
        if (intentE != null) {
            activity.startActivityForResult(intentE, 1);
        } else {
            f96737b.error("launchGCMAppInfoScreen: failed to resolve activity, android.settings.APPLICATION_DETAILS_SETTINGS");
        }
    }

    public static void s(Context context, List list, int i14) {
        f96737b.debug(context.getResources().getQuantityString(R.plurals.log_message_request_permissions, list.size(), Integer.valueOf(list.size()), Integer.valueOf(i14)));
    }

    public static boolean t() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static void u(Activity activity, int i14, g gVar) {
        activity.getClass();
        gVar.getClass();
        w(activity, i14, gVar.f96774c);
    }

    public static void v(f.c cVar, g gVar) {
        cVar.getClass();
        gVar.getClass();
        A(cVar, gVar.f96774c);
    }

    public static void w(Activity activity, int i14, List list) {
        activity.getClass();
        list.getClass();
        s(activity, list, i14);
        f96738c = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).f96735b);
        }
        z6.a.a(activity, (String[]) arrayList.toArray(new String[0]), i14);
    }

    public static void x(Activity activity, int i14, a... aVarArr) {
        activity.getClass();
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (a aVar : aVarArr) {
            arrayList.add(aVar.f96735b);
        }
        s(activity, arrayList, i14);
        f96738c = System.currentTimeMillis();
        z6.a.a(activity, (String[]) arrayList.toArray(new String[0]), i14);
    }

    public static void y(Fragment fragment, int i14, List list) {
        fragment.getClass();
        list.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        s(contextRequireContext, list, i14);
        f96738c = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).f96735b);
        }
        fragment.requestPermissions((String[]) arrayList.toArray(new String[0]), i14);
    }

    public static void z(Fragment fragment, int i14, a... aVarArr) {
        fragment.getClass();
        y(fragment, i14, u.i0(aVarArr));
    }
}
