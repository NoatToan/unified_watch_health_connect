package cc0;

import android.content.ContentValues;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import rd2.i;
import rd2.j;

/* JADX INFO: loaded from: classes8.dex */
public class e extends com.garmin.android.library.backgroundtaskmanagement.e<f> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l80.a f26695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f26696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final cc0.c f26697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public cc0.d f26698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f26699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f26700r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f26701t;

    public class a implements cc0.c.a {
        public a() {
        }
    }

    public class b implements cc0.d.a {
        public b() {
        }
    }

    public class c extends com.garmin.android.library.backgroundtaskmanagement.d {
        public c(com.garmin.android.library.backgroundtaskmanagement.b bVar) {
            super(bVar);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            int i14;
            rd2.f fVarA = rd2.f.a();
            e eVar = e.this;
            for (h hVar : eVar.f26696n) {
                i iVar = fVarA.f152047c;
                long j8 = hVar.f26709b;
                boolean z14 = hVar.f26710c;
                iVar.getClass();
                Logger logger = i.f152075b;
                try {
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("is_vivohub_configurable", Integer.valueOf(z14 ? 1 : 0));
                    i14 = i.i(contentValues, j8);
                } catch (Exception e4) {
                    logger.error("updateIsVivohubConfigurable", (Throwable) e4);
                    i14 = -1;
                }
                StringBuilder sbW = v.h.w(i14, "updateIsVivohubConfigurable: unitID [", "], nbrRows [", j8);
                sbW.append("]");
                logger.debug(sbW.toString());
                i.e(i14);
            }
            eVar.b(eVar.f26701t);
            c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
        }
    }

    public class d extends com.garmin.android.library.backgroundtaskmanagement.d {
        public d(com.garmin.android.library.backgroundtaskmanagement.b bVar) {
            super(bVar);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            rd2.f.a().f152045a.getClass();
            ArrayList<sd2.f> arrayListE = j.e();
            if (arrayListE != null) {
                for (sd2.f fVar : arrayListE) {
                    long unitID = fVar.getUnitID();
                    int iOrdinal = SupportedCapability.DEVICE_DRIVEN_LIVETRACK_SUPPORT.ordinal();
                    e eVar = e.this;
                    l80.a aVar = eVar.f26695m;
                    l80.a aVar2 = eVar.f26695m;
                    if (km2.a.i(unitID, aVar.L(), iOrdinal) && km2.a.i(fVar.getUnitID(), null, SupportedCapability.EVENT_SHARING.ordinal())) {
                        aVar2.H(fVar.getUnitID());
                        aVar2.A(fVar.getUnitID());
                    }
                }
            }
            c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
        }
    }

    /* JADX INFO: renamed from: cc0.e$e, reason: collision with other inner class name */
    public class C0409e extends com.garmin.android.library.backgroundtaskmanagement.d {

        /* JADX INFO: renamed from: cc0.e$e$a */
        public class a implements lm2.i.b<Void> {
            public a() {
            }

            @Override // lm2.i.b
            public final void a(Void r14) {
                C0409e c0409e = C0409e.this;
                e eVar = e.this;
                eVar.b(eVar.f26697o);
                c0409e.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            }

            @Override // lm2.i.b
            public final void onFailure(Throwable th3) {
                C0409e.this.c(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
            }
        }

        public C0409e(com.garmin.android.library.backgroundtaskmanagement.b bVar) {
            super(bVar);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            ed0.a.m("RefreshActiveDevicesOp", new a());
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
        }
    }

    public e(String str, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        this.f26695m = (l80.a) KoinJavaComponent.get(l80.a.class);
        a aVar2 = new a();
        this.f26699q = new b();
        this.f26700r = new c(this);
        this.f26701t = new d(this);
        i2.a(a2.DEVICES, "RefreshActiveDevicesOp", "connectUserDisplayName:" + str);
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new f());
        this.f26697o = new cc0.c(this, str, aVar2);
        b(new C0409e(this));
    }
}
