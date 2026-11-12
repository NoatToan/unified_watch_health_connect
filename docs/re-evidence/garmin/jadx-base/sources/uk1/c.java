package uk1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.ArrayList;
import java.util.Iterator;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u000bB#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Luk1/c;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lvk1/b;", "", "deviceUnitId", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", RemoteConfigComponent.DEFAULTS_FILE_NAME, "<init>", "(JLcom/garmin/android/library/backgroundtaskmanagement/b$a;Z)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends com.garmin.android.library.backgroundtaskmanagement.b<vk1.b> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f171878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f171879m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vk1.b f171880n;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171881a;

        static {
            int[] iArr = new int[vk1.e.values().length];
            try {
                iArr[vk1.e.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vk1.e.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vk1.e.CYCLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vk1.e.SWIMMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f171881a = iArr;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j8, com.garmin.android.library.backgroundtaskmanagement.b.a aVar, boolean z14) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        aVar.getClass();
        this.f171878l = j8;
        this.f171879m = z14;
        vk1.b bVar = new vk1.b();
        this.f171880n = bVar;
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, bVar);
        b(new e(this));
    }

    public static final void k(c cVar) {
        sd2.f fVar;
        Object next;
        String productNumber;
        cVar.getClass();
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListD = rd2.j.d();
        if (arrayListD != null) {
            Iterator it = arrayListD.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    productNumber = ((sd2.f) next).getProductNumber();
                    productNumber.getClass();
                }
            } while (!u0.n(productNumber, u0.U0, u0.V0));
            fVar = (sd2.f) next;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            vk1.b bVar = cVar.f171880n;
            vk1.f fVar2 = bVar.f178585e;
            if (fVar2 != null) {
                fVar2.f178631w = true;
            }
            vk1.f fVar3 = bVar.f178586f;
            if (fVar3 != null) {
                fVar3.f178631w = true;
            }
            vk1.f fVar4 = bVar.f178587g;
            if (fVar4 != null) {
                fVar4.f178631w = true;
            }
            vk1.f fVar5 = bVar.f178588h;
            if (fVar5 != null) {
                fVar5.f178631w = true;
            }
            cVar.b(new d(cVar, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName(), DateTimeFormat.forPattern("yyyy-MM-dd").print(new DateTime())));
        }
    }

    public static final void l(c cVar) {
        vk1.b bVar = cVar.f171880n;
        vk1.f fVar = bVar.f178585e;
        if (fVar != null) {
            if (bVar.f178581a && bVar.f178586f == null) {
                bVar.f178586f = fVar.C("RUNNING");
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.SETTINGS;
                aVar.getClass();
                i2.a.b(a2Var, "GetHRZonesConfigOperation", "Created 'running' dto based on clone of the 'default' dto.");
            }
            if (bVar.f178582b && bVar.f178587g == null) {
                vk1.f fVar2 = bVar.f178585e;
                bVar.f178587g = fVar2 != null ? fVar2.C("CYCLING") : null;
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.SETTINGS;
                aVar2.getClass();
                i2.a.b(a2Var2, "GetHRZonesConfigOperation", "Created 'cycling' dto based on clone of the 'default' dto.");
            }
            if (bVar.f178583c && bVar.f178588h == null) {
                vk1.f fVar3 = bVar.f178585e;
                bVar.f178588h = fVar3 != null ? fVar3.C("SWIMMING") : null;
                i2.a aVar3 = i2.f36769a;
                a2 a2Var3 = a2.SETTINGS;
                aVar3.getClass();
                i2.a.b(a2Var3, "GetHRZonesConfigOperation", "Created 'swimming' dto based on clone of the 'default' dto.");
            }
        }
    }

    public static final void m(c cVar, JSONArray jSONArray) throws JSONException {
        vk1.f fVarA;
        vk1.b bVar = cVar.f171880n;
        if (jSONArray.length() == 0) {
            if (cVar.f171879m) {
                vk1.c.f178593a.getClass();
                fVarA = vk1.c.a();
            } else {
                fVarA = null;
            }
            bVar.f178585e = fVarA;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            aVar.getClass();
            i2.a.b(a2Var, "GetHRZonesConfigOperation", "JSON array was empty. Created a default DTO with HR Max training method.");
            return;
        }
        int length = jSONArray.length();
        for (int i14 = 0; i14 < length; i14++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i14);
            vk1.f fVar = new vk1.f();
            fVar.k(jSONObject);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.SETTINGS;
            String str = "Created " + fVar.f178612b + " dto from JSON.";
            aVar2.getClass();
            i2.a.b(a2Var2, "GetHRZonesConfigOperation", str);
            vk1.e eVarD = vk1.c.d(fVar);
            if (eVarD != null) {
                int i15 = b.f171881a[eVarD.ordinal()];
                if (i15 == 1) {
                    bVar.f178585e = fVar;
                } else if (i15 == 2) {
                    bVar.f178586f = fVar;
                } else if (i15 == 3) {
                    bVar.f178587g = fVar;
                } else if (i15 == 4) {
                    bVar.f178588h = fVar;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luk1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(long j8, com.garmin.android.library.backgroundtaskmanagement.b.a aVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, aVar, (i14 & 4) != 0 ? true : z14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(long j8, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        this(j8, aVar, false, 4, null);
        aVar.getClass();
    }
}
