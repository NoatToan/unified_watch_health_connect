package og1;

import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity;
import g22.n;
import hb2.i;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import zb0.d0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Log1/a;", "", "Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityOptionsActivity f131976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d80.f<e> f131977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d80.f<Object> f131978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d80.f<com.garmin.android.apps.connectmobile.devices.model.f> f131979d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"og1/a$b", "Ld80/b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements d80.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.e.a f131981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.e.b f131982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f131983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f131984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ u0 f131985f;

        public b(com.garmin.android.apps.connectmobile.settings.devices.e.a aVar, com.garmin.android.apps.connectmobile.settings.devices.e.b bVar, long j8, String str, u0 u0Var) {
            this.f131981b = aVar;
            this.f131982c = bVar;
            this.f131983d = j8;
            this.f131984e = str;
            this.f131985f = u0Var;
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            lj0.b bVar2 = lj0.b.f112951e;
            a aVar = a.this;
            if (bVar != bVar2) {
                Toast.makeText(aVar.f131976a, R.string.txt_error_occurred, 0).show();
            }
            aVar.f131976a.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            aVar.getClass();
            if (obj == null) {
                a(lj0.b.f112956j);
                return;
            }
            a aVar2 = a.this;
            aVar2.f131976a.hideProgressOverlay();
            String str = this.f131984e;
            u0 u0Var = this.f131985f;
            ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).B(aVar2.f131976a, this.f131981b, this.f131982c, (com.garmin.android.apps.connectmobile.devices.model.f) obj, this.f131983d, str, u0Var);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"og1/a$c", "Ld80/b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements d80.b {
        public c() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a aVar = a.this;
            aVar.f131976a.hideProgressOverlay();
            aVar.f131976a.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVarValueOf;
            com.garmin.android.apps.connectmobile.settings.devices.e.b bVarValueOf;
            Integer num;
            aVar.getClass();
            a aVar2 = a.this;
            if (obj == null) {
                aVar2.f131976a.hideProgressOverlay();
                aVar2.f131976a.finish();
                return;
            }
            ActivityOptionsActivity activityOptionsActivity = aVar2.f131976a;
            activityOptionsActivity.f42534h = (e) obj;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            e eVar = activityOptionsActivity.f42534h;
            List<g> list = eVar != null ? eVar.f131999a : null;
            if (list != null && !list.isEmpty()) {
                if (activityOptionsActivity.f42537k == u0.T1 && !bo1.a.a().c().z()) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : list) {
                        String strD = ((g) obj2).getSport();
                        String strG = strD != null ? n.g(strD) : null;
                        if (strG == null) {
                            strG = "";
                        }
                        if (com.garmin.android.apps.connectmobile.settings.devices.e.a.valueOf(strG) != com.garmin.android.apps.connectmobile.settings.devices.e.a.CYCLING) {
                            arrayList4.add(obj2);
                        }
                    }
                    list = arrayList4;
                }
                for (g gVar : list) {
                    try {
                        String strD2 = gVar.getSport();
                        String strG2 = strD2 != null ? n.g(strD2) : null;
                        if (strG2 == null) {
                            strG2 = "";
                        }
                        aVarValueOf = com.garmin.android.apps.connectmobile.settings.devices.e.a.valueOf(strG2);
                        try {
                            String strF = gVar.getSubSport();
                            String strG3 = strF != null ? n.g(strF) : null;
                            if (strG3 == null) {
                                strG3 = "";
                            }
                            bVarValueOf = com.garmin.android.apps.connectmobile.settings.devices.e.b.valueOf(strG3);
                        } catch (IllegalArgumentException unused) {
                            a2 a2Var = a2.SETTINGS;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var, "ActivityOptionsActivity", "Sport or SubSport sent by API is not supported in the App");
                            bVarValueOf = null;
                        }
                    } catch (IllegalArgumentException unused2) {
                        aVarValueOf = null;
                    }
                    if (bVarValueOf != null && aVarValueOf != null) {
                        com.garmin.android.apps.connectmobile.settings.devices.activityoptions.b.f42547d.getClass();
                        com.garmin.android.apps.connectmobile.settings.devices.activityoptions.b[] bVarArrValues = com.garmin.android.apps.connectmobile.settings.devices.activityoptions.b.values();
                        int length = bVarArrValues.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                num = null;
                                break;
                            }
                            com.garmin.android.apps.connectmobile.settings.devices.activityoptions.b bVar = bVarArrValues[i14];
                            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar3 = bVar.f42554a;
                            aVar3.getClass();
                            if (aVar3 == aVarValueOf) {
                                com.garmin.android.apps.connectmobile.settings.devices.e.b bVar2 = bVar.f42555b;
                                bVar2.getClass();
                                if (bVar2 == bVarValueOf) {
                                    num = bVar.f42556c;
                                    break;
                                }
                            }
                            i14++;
                        }
                        if (num != null) {
                            String string = activityOptionsActivity.getString(num.intValue());
                            string.getClass();
                            gVar.f132003d = string;
                            arrayList3.add(string);
                            if (s.g(gVar.getEnabled(), Boolean.TRUE)) {
                                arrayList.add(string);
                            } else {
                                arrayList2.add(string);
                            }
                        }
                    }
                }
                activityOptionsActivity.f42532f = activityOptionsActivity.ea(arrayList, new ActivityOptionsActivity.a(arrayList3));
                activityOptionsActivity.f42533g = new og1.c(arrayList2, new ActivityOptionsActivity.a(arrayList3), activityOptionsActivity);
                RecyclerView recyclerView = activityOptionsActivity.f42529c;
                if (recyclerView == null) {
                    s.m("mRVDisplayedActivities");
                    throw null;
                }
                recyclerView.setAdapter(activityOptionsActivity.fa());
                RecyclerView recyclerView2 = activityOptionsActivity.f42530d;
                if (recyclerView2 == null) {
                    s.m("mRVDisabledActivities");
                    throw null;
                }
                recyclerView2.setAdapter(activityOptionsActivity.ga());
            }
            aVar2.f131976a.hideProgressOverlay();
        }
    }

    static {
        new C2504a(null);
    }

    public a(ActivityOptionsActivity activityOptionsActivity) {
        activityOptionsActivity.getClass();
        this.f131976a = activityOptionsActivity;
    }

    public void a(com.garmin.android.apps.connectmobile.settings.devices.e.a aVar, com.garmin.android.apps.connectmobile.settings.devices.e.b bVar, String str, long j8, u0 u0Var) {
        aVar.getClass();
        bVar.getClass();
        u0Var.getClass();
        ActivityOptionsActivity activityOptionsActivity = this.f131976a;
        if (i.a(activityOptionsActivity)) {
            activityOptionsActivity.showProgressOverlay();
            com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
            b bVar2 = new b(aVar, bVar, j8, str, u0Var);
            eVarN.getClass();
            this.f131979d = com.garmin.android.apps.connectmobile.settings.devices.e.M(j8, aVar, bVar, bVar2);
        }
    }

    public final void b(long j8) {
        ActivityOptionsActivity activityOptionsActivity = this.f131976a;
        if (i.a(activityOptionsActivity)) {
            activityOptionsActivity.showProgressOverlay();
            com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
            c cVar = new c();
            eVarN.getClass();
            d80.f.b bVar = new d80.f.b(new Object[]{String.valueOf(j8)}, lj0.f.f112990p);
            bVar.f58273c = e.class;
            bVar.f58274d = cVar;
            bVar.f58275e = d80.g.JSON_OBJECT;
            d80.f<e> fVarA = bVar.a();
            fVarA.b();
            this.f131977b = fVarA;
        }
    }

    /* JADX INFO: renamed from: og1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Log1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2504a {
        public /* synthetic */ C2504a(j jVar) {
            this();
        }

        private C2504a() {
        }
    }
}
