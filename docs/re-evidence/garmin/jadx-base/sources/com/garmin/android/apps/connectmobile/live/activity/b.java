package com.garmin.android.apps.connectmobile.live.activity;

import am.b2;
import am.x0;
import android.content.Context;
import au0.h0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/live/activity/b;", "Ltf2/g;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lam/b2;", "activityApi", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lam/b2;Landroid/content/Context;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements tf2.g, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f38390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f38391b;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.live.activity.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0678b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38392a;

        static {
            int[] iArr = new int[zf2.d.values().length];
            try {
                iArr[zf2.d.Z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zf2.d.Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zf2.d.S1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zf2.d.f204589e2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f38392a = iArr;
        }
    }

    static {
        new a(null);
    }

    public b(b2 b2Var, Context context) {
        b2Var.getClass();
        context.getClass();
        this.f38390a = b2Var;
        this.f38391b = context;
    }

    @Override // tf2.g
    public final String a(String str) {
        str.getClass();
        h0.f12930a.getClass();
        x0 x0VarA = h0.a.a(str);
        if (x0VarA != null) {
            return dh.b.A(this.f38391b, x0VarA.f4360c);
        }
        a2 a2Var = a2.ACTIVITIES;
        String strM = am.j.m("No activity type found for key ", str, ". Returning empty string.");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "LiveActivityActivityInfoDataSource", strM);
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // tf2.g
    public final Object b(int i14, int i15, v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i16 = cVar2.f38395c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                cVar2.f38395c = i16 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f38393a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = cVar2.f38395c;
        if (i17 == 0) {
            o13.r.b(objJ);
            d dVar = new d(this, i14, i15, null);
            cVar2.f38395c = 1;
            objJ = f0.J(this, dVar, cVar2);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return null;
            }
            u0.r();
            return null;
        }
        to.b bVar = (to.b) ((v2.b) v2Var).f47386a;
        a2 a2Var = a2.ACTIVITIES;
        String strM = am.j.m("Returning activity type key '", bVar.getTypeKey(), "'");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "LiveActivityActivityInfoDataSource", strM);
        return bVar.getTypeKey();
    }

    @Override // tf2.g
    public final u4.d c(String str) {
        str.getClass();
        h0.f12930a.getClass();
        x0 x0VarA = h0.a.a(str);
        if (x0VarA != null) {
            bv.b.f21239a.getClass();
            bv.b.a();
            return x0VarA.s(k1.f37122a.l0());
        }
        a2 a2Var = a2.ACTIVITIES;
        String strM = am.j.m("No activity type found for key ", str, ". Returning default icon.");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "LiveActivityActivityInfoDataSource", strM);
        s62.a.f157643a.getClass();
        return u62.a.a(t62.a.f162797a);
    }

    @Override // tf2.g
    public final String d(zf2.d dVar) {
        dVar.getClass();
        int i14 = C0678b.f38392a[dVar.ordinal()];
        Context context = this.f38391b;
        if (i14 == 1) {
            String string = context.getString(R.string.activity_type_bike_tour);
            string.getClass();
            return string;
        }
        if (i14 == 2) {
            String string2 = context.getString(R.string.activity_type_bike_commute);
            string2.getClass();
            return string2;
        }
        if (i14 == 3) {
            String string3 = context.getString(R.string.lbl_walk_indoor);
            string3.getClass();
            return string3;
        }
        if (i14 != 4) {
            return a(dVar.f204629a);
        }
        String string4 = context.getString(R.string.activity_type_timed_activity);
        string4.getClass();
        return string4;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/live/activity/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
