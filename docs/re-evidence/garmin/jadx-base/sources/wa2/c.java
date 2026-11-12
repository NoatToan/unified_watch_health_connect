package wa2;

import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.appcompat.app.e;
import com.garmin.android.apps.connectmobile.R;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwa2/c;", "", "<init>", "()V", "a", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f183804a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwa2/c$a;", "", "<init>", "()V", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static e a(a aVar, Context context, String str, String str2, p pVar, p pVar2, int i14) {
            if ((i14 & 16) != 0) {
                pVar2 = null;
            }
            aVar.getClass();
            e.a aVar2 = new e.a(new ContextThemeWrapper(context, R.style.Theme_Gcm_Dialog));
            if (str != null) {
                aVar2.setTitle(str);
            }
            if (str2 != null) {
                aVar2.setMessage(str2);
            }
            aVar2.setPositiveButton((CharSequence) pVar.f128594a, new br2.b((e23.p) pVar.f128595b, 13));
            if (pVar2 != null) {
                aVar2.setNegativeButton((CharSequence) pVar2.f128594a, new br2.b((e23.p) pVar2.f128595b, 14));
            }
            aVar2.setCancelable(false);
            e eVarCreate = aVar2.create();
            eVarCreate.getClass();
            eVarCreate.setCanceledOnTouchOutside(false);
            return eVarCreate;
        }

        private a() {
        }
    }
}
