package vj1;

import android.text.TextUtils;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import gc0.k;
import java.util.ArrayList;
import l20.r;
import o53.s0;
import p005kotlin.Metadata;
import pj1.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lvj1/i;", "Lpj1/e;", "Lwj1/a;", "data", "Lvj1/b;", "configuration", "Lhl/a;", "screenAccessRole", "<init>", "(Lwj1/a;Lvj1/b;Lhl/a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends pj1.e {
    public static final /* synthetic */ int B = 0;
    public final boolean A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wj1.a f178468p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hl.a f178469q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f178470r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l20.a f178471t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public l20.a f178472v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public l20.a f178473w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y0<Boolean> f178474x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y0 f178475y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f178476z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f178477a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.CONTACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.SERVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f178477a = iArr;
        }
    }

    static {
        new a(null);
    }

    public i(wj1.a aVar, vj1.b bVar, hl.a aVar2) {
        r userContactsDTO;
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        this.f178468p = aVar;
        this.f178469q = aVar2;
        y0<Boolean> y0Var = new y0<>();
        this.f178474x = y0Var;
        this.f178475y = y0Var;
        ArrayList arrayList = new ArrayList(aVar.b());
        this.f178476z = arrayList;
        this.A = bVar.f178452a;
        this.f178472v = f.a(arrayList);
        tj1.e eVar = aVar.f185783a;
        l20.a emergencyServiceContact = (eVar == null || (userContactsDTO = eVar.getUserContactsDTO()) == null) ? null : userContactsDTO.getEmergencyServiceContact();
        emergencyServiceContact = (emergencyServiceContact == null || !f.d(emergencyServiceContact)) ? null : emergencyServiceContact;
        this.f178473w = emergencyServiceContact;
        if (this.f178472v != null) {
            this.f178470r = c.CONTACT;
        } else if (emergencyServiceContact != null) {
            this.f178470r = c.SERVICES;
        } else {
            this.f178470r = null;
        }
        this.f178471t = I4();
    }

    public static boolean J4(String str) {
        str.getClass();
        int length = str.length();
        return 2 <= length && length < 16 && TextUtils.isDigitsOnly(str);
    }

    public final void H4() {
        a2 a2Var = a2.ONBOARDING;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "EmergencyCallingViewModel", "Finish Emergency Calling wizard");
        new qj1.a(null, 1, null).f145046a.O2("key_emergency_calling_setup_completed", true);
        this.f178474x.j(Boolean.TRUE);
    }

    public final l20.a I4() {
        c cVar = this.f178470r;
        int i14 = cVar == null ? -1 : b.f178477a[cVar.ordinal()];
        if (i14 == 1) {
            return this.f178472v;
        }
        if (i14 != 2) {
            return null;
        }
        return this.f178473w;
    }

    public final y0 K4() {
        y0 y0Var = new y0();
        tj1.e eVar = this.f178468p.f185783a;
        if (eVar == null) {
            y0Var.j(g3.a.a(g3.f35298f, "ECC contacts null", null, null, null, 14));
            return y0Var;
        }
        y0Var.j(g3.a.c(g3.f35298f));
        tj1.e eVarN = d0.n(eVar, I4());
        k kVar = new k(y0Var, this);
        hl.a aVar = this.f178469q;
        aVar.getClass();
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new pj1.k(eVarN, aVar, this, kVar, null), 2);
        return y0Var;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvj1/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ i(wj1.a aVar, vj1.b bVar, hl.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, bVar, (i14 & 4) != 0 ? hl.a.c.f84256b : aVar2);
    }
}
