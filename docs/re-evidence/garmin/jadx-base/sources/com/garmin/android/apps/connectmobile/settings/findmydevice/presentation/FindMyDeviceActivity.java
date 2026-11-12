package com.garmin.android.apps.connectmobile.settings.findmydevice.presentation;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceActivity;
import com.google.android.gms.maps.model.LatLng;
import d53.w;
import e23.l;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ki1.t;
import me2.z;
import o13.m;
import o13.n;
import o13.p;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import p13.u;
import qw0.i;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/findmydevice/presentation/FindMyDeviceActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FindMyDeviceActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f43421e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43422a = m.a(n.NONE, new h(this, null, null, new jx0.e(this, 16)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.c<String[]> f43423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<Intent> f43424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<Intent> f43425d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43426a;

        static {
            int[] iArr = new int[j22.f.values().length];
            try {
                iArr[j22.f.ALLOWED_ALL_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f43426a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements l<fi1.b, Unit> {
        public c(Object obj) {
            super(1, obj, FindMyDeviceActivity.class, "onGetDirections", "onGetDirections(Lcom/garmin/android/apps/connectmobile/settings/findmydevice/data/model/DeviceLocation;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.l
        public final Unit invoke(fi1.b bVar) {
            List<ResolveInfo> list;
            Object next;
            Object next2;
            LabeledIntent labeledIntent;
            LabeledIntent labeledIntent2;
            ComponentName componentNameA;
            ComponentName componentNameA2;
            p pVar;
            Uri uri;
            fi1.b bVar2 = bVar;
            bVar2.getClass();
            FindMyDeviceActivity findMyDeviceActivity = (FindMyDeviceActivity) this.receiver;
            a aVar = FindMyDeviceActivity.f43421e;
            findMyDeviceActivity.getClass();
            double d14 = bVar2.f71766a;
            double d15 = bVar2.f71767b;
            StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("geo:0,0?q=", d14, ",");
            sbA.append(d15);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sbA.toString()));
            List<ResolveInfo> listQueryIntentActivities = findMyDeviceActivity.getPackageManager().queryIntentActivities(intent, 0);
            listQueryIntentActivities.getClass();
            if (listQueryIntentActivities.isEmpty()) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "FindMyDeviceActivity", "[onGetDirections] No application available to handle map view intent");
                ie2.n.f93149a.getClass();
                if (((i) ie2.n.a()).f() == com.garmin.android.library.mapsdkadapter.i.d.GOOGLE) {
                    LatLng latLngD = z.d(new com.garmin.android.library.mapsdkadapter.f(bVar2.f71766a, bVar2.f71767b, com.garmin.android.library.mapsdkadapter.i.b.WGS84));
                    uri = Uri.parse("https://www.google.com/maps/search/?api=1&query=".concat(latLngD.latitude + "," + latLngD.longitude));
                } else {
                    uri = Uri.parse("https://api.map.baidu.com/marker?location=" + (d14 + "," + d15) + "&output=html&coord_type=wgs84");
                }
                findMyDeviceActivity.startActivity(new Intent("android.intent.action.VIEW", uri));
            } else {
                Iterator<T> it = listQueryIntentActivities.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        list = listQueryIntentActivities;
                        next = null;
                        break;
                    }
                    next = it.next();
                    ResolveInfo resolveInfo = (ResolveInfo) next;
                    t tVar = t.f104906a;
                    resolveInfo.getClass();
                    tVar.getClass();
                    String str = resolveInfo.activityInfo.packageName;
                    str.getClass();
                    list = listQueryIntentActivities;
                    if (w.z(str, "autonavi", true)) {
                        break;
                    }
                    listQueryIntentActivities = list;
                }
                ResolveInfo resolveInfo2 = (ResolveInfo) next;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    ResolveInfo resolveInfo3 = (ResolveInfo) next2;
                    t tVar2 = t.f104906a;
                    resolveInfo3.getClass();
                    tVar2.getClass();
                    String str2 = resolveInfo3.activityInfo.packageName;
                    str2.getClass();
                    Iterator it4 = it3;
                    if (w.z(str2, "google", true)) {
                        break;
                    }
                    it3 = it4;
                }
                ResolveInfo resolveInfo4 = (ResolveInfo) next2;
                if (resolveInfo2 != null) {
                    t.f104906a.getClass();
                    LatLng latLng = new LatLng(d14, d15);
                    if (com.garmin.android.library.mapsdkadapter.m.f(latLng) || com.garmin.android.library.mapsdkadapter.m.g(latLng)) {
                        ie2.f.f93122a.getClass();
                        LatLng latLngB = ie2.f.b(latLng);
                        pVar = new p(Double.valueOf(latLngB.latitude), Double.valueOf(latLngB.longitude));
                    } else {
                        pVar = new p(Double.valueOf(d14), Double.valueOf(d15));
                    }
                    double dDoubleValue = ((Number) pVar.f128594a).doubleValue();
                    double dDoubleValue2 = ((Number) pVar.f128595b).doubleValue();
                    StringBuilder sbA2 = com.airbnb.lottie.parser.moshi.a.a("geo:0,0?q=", dDoubleValue, ",");
                    sbA2.append(dDoubleValue2);
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(sbA2.toString()));
                    intent2.setComponent(t.a(resolveInfo2));
                    labeledIntent = new LabeledIntent(intent2, resolveInfo2.activityInfo.packageName, resolveInfo2.labelRes, resolveInfo2.icon);
                } else {
                    labeledIntent = null;
                }
                if (resolveInfo4 != null) {
                    t.f104906a.getClass();
                    LatLng latLngD2 = z.d(new com.garmin.android.library.mapsdkadapter.f(bVar2.f71766a, bVar2.f71767b, com.garmin.android.library.mapsdkadapter.i.b.WGS84));
                    double d16 = latLngD2.latitude;
                    double d17 = latLngD2.longitude;
                    StringBuilder sbA3 = com.airbnb.lottie.parser.moshi.a.a("geo:0,0?q=", d16, ",");
                    sbA3.append(d17);
                    Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(sbA3.toString()));
                    intent3.setComponent(t.a(resolveInfo4));
                    labeledIntent2 = new LabeledIntent(intent3, resolveInfo4.activityInfo.packageName, resolveInfo4.labelRes, resolveInfo4.icon);
                } else {
                    labeledIntent2 = null;
                }
                LabeledIntent[] labeledIntentArr = (LabeledIntent[]) u.C(new LabeledIntent[]{labeledIntent, labeledIntent2}).toArray(new LabeledIntent[0]);
                if (resolveInfo2 != null) {
                    t.f104906a.getClass();
                    componentNameA = t.a(resolveInfo2);
                } else {
                    componentNameA = null;
                }
                if (resolveInfo4 != null) {
                    t.f104906a.getClass();
                    componentNameA2 = t.a(resolveInfo4);
                } else {
                    componentNameA2 = null;
                }
                ComponentName[] componentNameArr = (ComponentName[]) u.C(new ComponentName[]{componentNameA, componentNameA2}).toArray(new ComponentName[0]);
                Intent intentCreateChooser = Intent.createChooser(intent, null);
                if (labeledIntentArr.length != 0) {
                    intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", labeledIntentArr);
                    intentCreateChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", componentNameArr);
                }
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var2, "FindMyDeviceActivity", "[onGetDirections] Open map application for navigating to device");
                findMyDeviceActivity.startActivity(intentCreateChooser);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements e23.a<Unit> {
        public d(Object obj) {
            super(0, obj, FindMyDeviceActivity.class, "requestLocationPermissions", "requestLocationPermissions()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            FindMyDeviceActivity findMyDeviceActivity = (FindMyDeviceActivity) this.receiver;
            a aVar = FindMyDeviceActivity.f43421e;
            findMyDeviceActivity.getClass();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "FindMyDeviceActivity", "[requestLocationPermissions] Request location permissions");
            j22.b bVar = j22.b.f96736a;
            f.c<String[]> cVar = findMyDeviceActivity.f43423b;
            j22.g gVar = j22.g.f96765j;
            bVar.getClass();
            j22.b.v(cVar, gVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends q implements e23.a<Unit> {
        public e(Object obj) {
            super(0, obj, FindMyDeviceActivity.class, "navigateToApplicationDetails", "navigateToApplicationDetails()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            FindMyDeviceActivity findMyDeviceActivity = (FindMyDeviceActivity) this.receiver;
            a aVar = FindMyDeviceActivity.f43421e;
            findMyDeviceActivity.getClass();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "FindMyDeviceActivity", "[navigateToApplicationDetails] Navigate to application details to grant location permissions");
            findMyDeviceActivity.f43424c.a(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + findMyDeviceActivity.getPackageName())), null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends q implements e23.a<Unit> {
        public f(Object obj) {
            super(0, obj, FindMyDeviceActivity.class, "navigateToLocationServiceSettings", "navigateToLocationServiceSettings()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            FindMyDeviceActivity findMyDeviceActivity = (FindMyDeviceActivity) this.receiver;
            a aVar = FindMyDeviceActivity.f43421e;
            findMyDeviceActivity.getClass();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "FindMyDeviceActivity", "[navigateToLocationServiceSettings] Navigate to location service settings to enable location services");
            findMyDeviceActivity.f43425d.a(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class g extends p005kotlin.jvm.internal.a implements e23.a<Unit> {
        public g(Object obj) {
            super(0, obj, FindMyDeviceActivity.class, "onNavigateUp", "onNavigateUp()Z", 8);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((FindMyDeviceActivity) this.receiver).onNavigateUp();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<ki1.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f43427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f43428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f43429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f43430d;

        public h(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f43427a = gVar;
            this.f43428b = qualifier;
            this.f43429c = aVar;
            this.f43430d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, ki1.l] */
        @Override // e23.a
        public final ki1.l invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f43427a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f43429c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(ki1.l.class), f189591b, null, defaultViewModelCreationExtras, this.f43428b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f43430d, 4, null);
        }
    }

    public FindMyDeviceActivity() {
        final int i14 = 0;
        this.f43423b = registerForActivityResult(new g.f(), new f.b(this) { // from class: ki1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FindMyDeviceActivity f104826b;

            {
                this.f104826b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, o13.l] */
            @Override // f.b
            public final void a(Object obj) {
                Object value;
                int i15 = i14;
                FindMyDeviceActivity findMyDeviceActivity = this.f104826b;
                switch (i15) {
                    case 0:
                        Map map = (Map) obj;
                        FindMyDeviceActivity.a aVar = FindMyDeviceActivity.f43421e;
                        map.getClass();
                        j22.b.f96736a.getClass();
                        int i16 = FindMyDeviceActivity.b.f43426a[j22.b.D(map).ordinal()];
                        ?? r14 = findMyDeviceActivity.f43422a;
                        if (i16 == 1) {
                            ((l) r14.getValue()).y4();
                        } else {
                            p2 p2Var = ((l) r14.getValue()).f104862k;
                            do {
                                value = p2Var.getValue();
                            } while (!p2Var.b(value, v.c.f104912a));
                        }
                        break;
                    case 1:
                        FindMyDeviceActivity.a aVar2 = FindMyDeviceActivity.f43421e;
                        ((f.a) obj).getClass();
                        ((l) findMyDeviceActivity.f43422a.getValue()).y4();
                        break;
                    default:
                        FindMyDeviceActivity.a aVar3 = FindMyDeviceActivity.f43421e;
                        ((f.a) obj).getClass();
                        ((l) findMyDeviceActivity.f43422a.getValue()).y4();
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f43424c = registerForActivityResult(new g.h(), new f.b(this) { // from class: ki1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FindMyDeviceActivity f104826b;

            {
                this.f104826b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, o13.l] */
            @Override // f.b
            public final void a(Object obj) {
                Object value;
                int i16 = i15;
                FindMyDeviceActivity findMyDeviceActivity = this.f104826b;
                switch (i16) {
                    case 0:
                        Map map = (Map) obj;
                        FindMyDeviceActivity.a aVar = FindMyDeviceActivity.f43421e;
                        map.getClass();
                        j22.b.f96736a.getClass();
                        int i17 = FindMyDeviceActivity.b.f43426a[j22.b.D(map).ordinal()];
                        ?? r14 = findMyDeviceActivity.f43422a;
                        if (i17 == 1) {
                            ((l) r14.getValue()).y4();
                        } else {
                            p2 p2Var = ((l) r14.getValue()).f104862k;
                            do {
                                value = p2Var.getValue();
                            } while (!p2Var.b(value, v.c.f104912a));
                        }
                        break;
                    case 1:
                        FindMyDeviceActivity.a aVar2 = FindMyDeviceActivity.f43421e;
                        ((f.a) obj).getClass();
                        ((l) findMyDeviceActivity.f43422a.getValue()).y4();
                        break;
                    default:
                        FindMyDeviceActivity.a aVar3 = FindMyDeviceActivity.f43421e;
                        ((f.a) obj).getClass();
                        ((l) findMyDeviceActivity.f43422a.getValue()).y4();
                        break;
                }
            }
        });
        final int i16 = 2;
        this.f43425d = registerForActivityResult(new g.h(), new f.b(this) { // from class: ki1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FindMyDeviceActivity f104826b;

            {
                this.f104826b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, o13.l] */
            @Override // f.b
            public final void a(Object obj) {
                Object value;
                int i17 = i16;
                FindMyDeviceActivity findMyDeviceActivity = this.f104826b;
                switch (i17) {
                    case 0:
                        Map map = (Map) obj;
                        FindMyDeviceActivity.a aVar = FindMyDeviceActivity.f43421e;
                        map.getClass();
                        j22.b.f96736a.getClass();
                        int i18 = FindMyDeviceActivity.b.f43426a[j22.b.D(map).ordinal()];
                        ?? r14 = findMyDeviceActivity.f43422a;
                        if (i18 == 1) {
                            ((l) r14.getValue()).y4();
                        } else {
                            p2 p2Var = ((l) r14.getValue()).f104862k;
                            do {
                                value = p2Var.getValue();
                            } while (!p2Var.b(value, v.c.f104912a));
                        }
                        break;
                    case 1:
                        FindMyDeviceActivity.a aVar2 = FindMyDeviceActivity.f43421e;
                        ((f.a) obj).getClass();
                        ((l) findMyDeviceActivity.f43422a.getValue()).y4();
                        break;
                    default:
                        FindMyDeviceActivity.a aVar3 = FindMyDeviceActivity.f43421e;
                        ((f.a) obj).getClass();
                        ((l) findMyDeviceActivity.f43422a.getValue()).y4();
                        break;
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initComposeScreen(new z3.e(31971846, true, new ki1.c(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/findmydevice/presentation/FindMyDeviceActivity$a;", "", "<init>", "()V", "", "EXTRA_DEVICE_ID", "Ljava/lang/String;", "BAIDU_MAP_URL", "BAIDU_MAP_SUFFIX", "GOOGLE_MAP_URL", "TAG", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
