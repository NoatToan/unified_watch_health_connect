package t92;

import android.content.SharedPreferences;
import d53.w;
import e23.p;
import i3.e5;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import lp.k;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.k0;
import p13.u0;
import p92.y;
import q53.t;
import q92.u;
import q92.v;
import q92.x;
import r53.s;
import s92.l;
import sg0.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lt92/c;", "Lt92/b;", "<init>", "()V", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class c implements t92.b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.cache.ConsentPrefsImpl$observeSyncDeviceDataStatus$1", f = "ConsentPrefsImpl.kt", l = {269}, m = "invokeSuspend")
    public static final class b extends i implements p<t<? super Boolean>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f163210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f163211b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = c.this.new b(dVar);
            bVar.f163211b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(t<? super Boolean> tVar, t13.d<? super Unit> dVar) {
            return ((b) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f163210a;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.f163211b;
                c cVar = c.this;
                Boolean boolH = cVar.h();
                y.f136664a.getClass();
                y.a.a("ConsentPrefsImpl", "observeSyncDeviceDataStatus() isSyncDeviceDataEnabled[" + boolH + "]");
                tVar.i(boolH);
                k kVar = new k(cVar, tVar, 6);
                cVar.j().registerOnSharedPreferenceChangeListener(kVar);
                j jVar = new j(tVar, 15, cVar, kVar);
                this.f163210a = 1;
                if (q53.r.a(tVar, jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public static String k(l lVar) {
        return lVar == null ? "" : "_".concat(lVar.f158101a);
    }

    @Override // t92.b
    public final void a(x xVar, u uVar, l lVar) {
        xVar.getClass();
        uVar.getClass();
        y.f136664a.getClass();
        y.a.a("ConsentPrefsImpl", "setSourceType(" + xVar + " , " + uVar + ")");
        j().edit().putString(e5.g(xVar.f143820b, "_consent_source_type", k(lVar)), uVar.f143782a).apply();
    }

    @Override // t92.b
    public final void b(boolean z14) {
        String strG = com.airbnb.lottie.animation.keyframe.a.g("setSyncDeviceData(", ")", z14);
        y.f136664a.getClass();
        y.a.a("ConsentPrefsImpl", strG);
        j().edit().putBoolean("sync_device_data", z14).apply();
    }

    @Override // t92.b
    public final r53.i<Boolean> c() {
        r53.b bVarF = s.f(new b(null));
        x53.c cVar = s0.f129406a;
        return s.A(bVarF, x53.b.f189152a);
    }

    @Override // t92.b
    public final void clear() {
        y.f136664a.getClass();
        y.a.a("ConsentPrefsImpl", "Clear consent saved data");
        j().edit().clear().apply();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0136  */
    @Override // t92.b
    public final v d(x xVar, l lVar) {
        Map mapL;
        o13.p pVar;
        xVar.getClass();
        q92.y.a aVar = q92.y.f143821b;
        SharedPreferences sharedPreferencesJ = j();
        String str = xVar.f143820b;
        String string = sharedPreferencesJ.getString(str + "_consent_user_option" + k(lVar), null);
        aVar.getClass();
        q92.y yVarA = q92.y.a.a(string);
        u.a aVar2 = u.f143774b;
        String string2 = j().getString(str + "_consent_source_type" + k(lVar), null);
        aVar2.getClass();
        u uVarA = u.a.a(string2);
        q92.b.a aVar3 = q92.b.f143610b;
        String string3 = j().getString(str + "_consent_enforcement_state" + k(lVar), null);
        aVar3.getClass();
        q92.b bVarA = q92.b.a.a(string3);
        if (bVarA == null) {
            bVarA = q92.b.NONE;
        }
        q92.b bVar = bVarA;
        q92.a.C2709a c2709a = q92.a.f143600b;
        String string4 = j().getString(str + "_consent_delete_status" + k(lVar), null);
        c2709a.getClass();
        q92.a aVarA = q92.a.C2709a.a(string4);
        if (aVarA == null) {
            aVarA = q92.a.NOT_APPLICABLE;
        }
        q92.a aVar4 = aVarA;
        long j8 = j().getLong(e5.g(str, "_consent_retrieval_date", k(lVar)), -1L);
        Long lValueOf = Long.valueOf(j8);
        if (j8 <= -1) {
            lValueOf = null;
        }
        Date date = lValueOf != null ? new Date(lValueOf.longValue()) : null;
        String string5 = j().getString(str + "_consent_user_metadata" + k(lVar), null);
        x[] xVarArr = q92.c.f143616a;
        if (string5 == null || w.J(string5)) {
            mapL = k0.f134949a;
            mapL.getClass();
        } else {
            List<String> listW = w.W(string5, new String[]{","});
            ArrayList arrayList = new ArrayList();
            for (String str2 : listW) {
                int iH = w.H(str2, "=", 0, false, 6);
                if (iH <= 0) {
                    pVar = null;
                } else {
                    String string6 = w.i0(str2.substring(0, iH)).toString();
                    String string7 = w.i0(str2.substring(iH + 1)).toString();
                    if (string6.length() == 0 || string7.length() == 0) {
                        pVar = null;
                    } else {
                        pVar = new o13.p(string6, string7);
                    }
                }
                if (pVar != null) {
                    arrayList.add(pVar);
                }
            }
            mapL = u0.l(arrayList);
        }
        long j14 = j().getLong(e5.g(str, "_consent_update_date", k(lVar)), -1L);
        Long lValueOf2 = Long.valueOf(j14);
        if (j14 <= -1) {
            lValueOf2 = null;
        }
        Date date2 = lValueOf2 != null ? new Date(lValueOf2.longValue()) : null;
        if (yVarA == null || uVarA == null) {
            return null;
        }
        return new v(xVar, yVarA, uVarA, bVar, aVar4, date, mapL, date2);
    }

    @Override // t92.b
    public final void e(x xVar, s92.c cVar, l lVar) {
        xVar.getClass();
        String str = xVar.f143820b;
        cVar.getClass();
        y.f136664a.getClass();
        y.a.a("ConsentPrefsImpl", "Persist Consent -> " + xVar + " = " + cVar);
        q92.y.a aVar = q92.y.f143821b;
        String userOption = cVar.getUserOption();
        aVar.getClass();
        q92.y yVarA = q92.y.a.a(userOption);
        u.a aVar2 = u.f143774b;
        String sourceType = cVar.getSourceType();
        aVar2.getClass();
        u uVarA = u.a.a(sourceType);
        q92.b.a aVar3 = q92.b.f143610b;
        String consentEnforcementState = cVar.getConsentEnforcementState();
        aVar3.getClass();
        q92.b bVarA = q92.b.a.a(consentEnforcementState);
        q92.a.C2709a c2709a = q92.a.f143600b;
        String deleteStatus = cVar.getDeleteStatus();
        c2709a.getClass();
        q92.a aVarA = q92.a.C2709a.a(deleteStatus);
        SharedPreferences.Editor editorEdit = j().edit();
        if (yVarA != null) {
            editorEdit.putString(e5.g(str, "_consent_user_option", k(lVar)), yVarA.f143825a);
            if (lVar == null && xVar == x.DI_CONNECT_UPLOAD && yVarA == q92.y.OPT_OUT) {
                y.a.a("ConsentPrefsImpl", "Update the \"syncDeviceData\" cached flag to false since DATA STORAGE (old name UPLOAD) consent is OPT OUT");
                b(false);
            }
        }
        if (uVarA != null) {
            editorEdit.putString(e5.g(str, "_consent_source_type", k(lVar)), uVarA.f143782a);
        }
        if (bVarA != null) {
            editorEdit.putString(e5.g(str, "_consent_enforcement_state", k(lVar)), bVarA.f143615a);
        }
        if (aVarA != null) {
            editorEdit.putString(e5.g(str, "_consent_delete_status", k(lVar)), aVarA.f143607a);
        }
        String strG = e5.g(str, "_consent_user_metadata", k(lVar));
        if (cVar.getUserMetadata() == null) {
            editorEdit.remove(strG);
        } else {
            editorEdit.putString(strG, cVar.getUserMetadata());
        }
        String strG2 = e5.g(str, "_consent_update_date", k(lVar));
        Date dateB = q92.c.b(cVar.getUpdateDate());
        Long lValueOf = dateB != null ? Long.valueOf(dateB.getTime()) : null;
        if (lValueOf == null) {
            editorEdit.remove(strG2);
        } else {
            editorEdit.putLong(strG2, lValueOf.longValue());
        }
        editorEdit.putLong(e5.g(str, "_consent_retrieval_date", lVar != null ? lVar.f158101a : null), System.currentTimeMillis());
        editorEdit.apply();
    }

    @Override // t92.b
    public final void f(x xVar, q92.y yVar, l lVar) {
        xVar.getClass();
        yVar.getClass();
        y.f136664a.getClass();
        y.a.a("ConsentPrefsImpl", "setUserOption(" + xVar + " , " + yVar + ")");
        j().edit().putString(e5.g(xVar.f143820b, "_consent_user_option", k(lVar)), yVar.f143825a).apply();
    }

    @Override // t92.b
    public final t92.a g(x xVar) {
        xVar.getClass();
        return new t92.a(xVar, j(), new d(this));
    }

    @Override // t92.b
    public final Boolean h() {
        if (j().contains("sync_device_data")) {
            return Boolean.valueOf(j().getBoolean("sync_device_data", true));
        }
        return null;
    }

    @Override // t92.b
    public final void i(x xVar, q92.a aVar, l lVar) {
        xVar.getClass();
        String str = aVar.f143607a;
        y.f136664a.getClass();
        y.a.a("ConsentPrefsImpl", "setConsentDeleteStatus(" + xVar + " , " + str + ")");
        j().edit().putString(xVar.f143820b + "_consent_delete_status" + k(lVar), str).apply();
    }

    public abstract SharedPreferences j();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lt92/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "CONSENT_USER_OPTION_KEY", "CONSENT_SOURCE_TYPE_KEY", "CONSENT_ENFORCEMENT_STATE_KEY", "CONSENT_DELETE_STATUS_KEY", "CONSENT_RETRIEVAL_DATE_KEY", "CONSENT_USER_METADATA_KEY", "CONSENT_UPDATE_DATE_KEY", "SYNC_DEVICE_DATA", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
