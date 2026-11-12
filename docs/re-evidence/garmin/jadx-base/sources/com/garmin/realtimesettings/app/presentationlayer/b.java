package com.garmin.realtimesettings.app.presentationlayer;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import cx2.h;
import e23.l;
import e23.p;
import iw2.w;
import o13.r;
import o53.b0;
import o53.c2;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import t13.d;
import v13.i;
import yw2.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/garmin/realtimesettings/app/presentationlayer/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lyw2/e;", "settingsCoordinatorListener", "Lrw2/a;", "settingsDataModel", "", "compositionId", "", "isCompositionBakedInApp", "<init>", "(Landroid/content/Context;Lyw2/e;Lrw2/a;IZ)V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f52621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f52622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rw2.a f52623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f52624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f52625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f52626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f52627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f52628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f52629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f52630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f52631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f52632l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/realtimesettings/app/presentationlayer/b$a;", "", "", "status", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        VALID_COMPOSITION("validComposition"),
        INVALID_COMPOSITION("invalidComposition"),
        OUTDATED_COMPOSITION_CACHE("outdatedCompositionCache"),
        UNKNOWN(PrivacyUpdateRequestError.UNKNOWN);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52638a;

        a(String str) {
            this.f52638a = str;
        }
    }

    /* JADX INFO: renamed from: com.garmin.realtimesettings.app.presentationlayer.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.app.presentationlayer.SettingsDeviceCoordinator$restartGlobalSettings$1", f = "SettingsDeviceCoordinator.kt", l = {362}, m = "invokeSuspend", v = 1)
    public static final class C1128b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52639a;

        public C1128b(d<? super C1128b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return b.this.new C1128b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C1128b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f52639a;
            if (i14 == 0) {
                r.b(obj);
                w wVar = w.f95547a;
                Context context = b.this.f52621a;
                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                long j8 = com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192449a;
                this.f52639a = 1;
                wVar.getClass();
                if (w.e(context, j8, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public b(Context context, e eVar, rw2.a aVar, int i14, boolean z14) {
        context.getClass();
        eVar.getClass();
        aVar.getClass();
        this.f52621a = context;
        this.f52622b = eVar;
        this.f52623c = aVar;
        this.f52624d = i14;
        this.f52625e = z14;
        this.f52626f = new h("SettingsDeviceCoordinator", null, 2, null);
        this.f52628h = 2;
        this.f52632l = true;
    }

    public static void b(final b bVar, boolean z14, boolean z15, boolean z16, boolean z17, final boolean z18, int i14) {
        c2 c2Var;
        if ((i14 & 1) != 0) {
            z14 = false;
        }
        boolean z19 = (i14 & 2) != 0 ? false : z15;
        if ((i14 & 4) != 0) {
            z16 = false;
        }
        if ((i14 & 16) != 0) {
            z17 = false;
        }
        if ((i14 & 32) != 0) {
            z18 = false;
        }
        h hVar = bVar.f52626f;
        rw2.a aVar = bVar.f52623c;
        hVar.getClass();
        if (z14) {
            bVar.d();
            return;
        }
        if (z16 && z17) {
            if (z18) {
                bVar.j();
                return;
            } else {
                bVar.i();
                return;
            }
        }
        bVar.f52629i = false;
        bVar.f52630j = false;
        if (z16) {
            bVar.f52629i = true;
        } else {
            final int i15 = 0;
            aVar.d(bVar.f52621a, bVar.f52624d, 0, z19, bVar.f52625e, new l(bVar) { // from class: yw2.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.realtimesettings.app.presentationlayer.b f200003b;

                {
                    this.f200003b = bVar;
                }

                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i16 = i15;
                    ((Boolean) obj).booleanValue();
                    switch (i16) {
                        case 0:
                            com.garmin.realtimesettings.app.presentationlayer.b bVar2 = this.f200003b;
                            bVar2.f52626f.getClass();
                            bVar2.f52629i = true;
                            if (z18) {
                                bVar2.j();
                            } else {
                                bVar2.i();
                            }
                            break;
                        default:
                            com.garmin.realtimesettings.app.presentationlayer.b bVar3 = this.f200003b;
                            bVar3.f52626f.getClass();
                            bVar3.f52630j = true;
                            if (z18) {
                                bVar3.j();
                            } else {
                                bVar3.i();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
        if (z17) {
            bVar.f52630j = true;
            return;
        }
        int i16 = bVar.f52624d;
        final int i17 = 1;
        l lVar = new l(bVar) { // from class: yw2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.realtimesettings.app.presentationlayer.b f200003b;

            {
                this.f200003b = bVar;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                ((Boolean) obj).booleanValue();
                switch (i18) {
                    case 0:
                        com.garmin.realtimesettings.app.presentationlayer.b bVar2 = this.f200003b;
                        bVar2.f52626f.getClass();
                        bVar2.f52629i = true;
                        if (z18) {
                            bVar2.j();
                        } else {
                            bVar2.i();
                        }
                        break;
                    default:
                        com.garmin.realtimesettings.app.presentationlayer.b bVar3 = this.f200003b;
                        bVar3.f52626f.getClass();
                        bVar3.f52630j = true;
                        if (z18) {
                            bVar3.j();
                        } else {
                            bVar3.i();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        aVar.f154861a.getClass();
        aVar.f154869i = i16;
        c2 c2Var2 = aVar.f154863c;
        if (c2Var2 != null && c2Var2.isActive() && (c2Var = aVar.f154863c) != null) {
            c2Var.c(null);
        }
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        aVar.f154863c = ge1.b.T(com.garmin.realtimesettings.app.initialization.b.f52593e, null, null, new rw2.b(i16, aVar, lVar, null), 3);
    }

    public static String h(rw2.e eVar, rw2.e eVar2) {
        if (eVar.f154897a != eVar2.f154897a) {
            return a.OUTDATED_COMPOSITION_CACHE.f52638a;
        }
        return eVar.f154898b != eVar2.f154898b ? a.INVALID_COMPOSITION.f52638a : a.VALID_COMPOSITION.f52638a;
    }

    public final void a() {
        boolean z14 = this.f52632l;
        h hVar = this.f52626f;
        if (!z14) {
            hVar.b("invalidateSettings: already a request is in progress, either screen or device is sending a second request. So, ignoring this request");
            return;
        }
        hVar.getClass();
        this.f52632l = false;
        this.f52627g = 0;
        this.f52631k = false;
        if (this.f52624d == 36356) {
            b(this, true, false, false, false, false, 62);
        } else {
            this.f52622b.W2();
            b(this, false, false, true, false, true, 9);
        }
    }

    public final void c(String str) {
        this.f52626f.getClass();
        rw2.a aVar = this.f52623c;
        c2 c2Var = aVar.f154862b;
        if (c2Var != null) {
            c2Var.c(null);
        }
        c2 c2Var2 = aVar.f154863c;
        if (c2Var2 != null) {
            c2Var2.c(null);
        }
        this.f52632l = true;
        e eVar = this.f52622b;
        eVar.P5();
        eVar.x4(str);
    }

    public final void d() {
        com.garmin.realtimesettings.app.initialization.b bVar = com.garmin.realtimesettings.app.initialization.b.f52589a;
        bVar.getClass();
        ge1.b.T(com.garmin.realtimesettings.app.initialization.b.f52593e, null, null, new C1128b(null), 3);
        e eVar = this.f52622b;
        h hVar = this.f52626f;
        int i14 = this.f52624d;
        if (i14 == 36352) {
            hVar.getClass();
            eVar.P0(false);
        } else if (i14 != 36356) {
            hVar.getClass();
            eVar.P0(true);
        } else if (com.garmin.realtimesettings.app.initialization.b.d(bVar) != null) {
            hVar.getClass();
            eVar.P0(false);
        } else {
            hVar.getClass();
            f();
        }
    }

    public final void e() {
        this.f52626f.getClass();
        this.f52632l = true;
        e eVar = this.f52622b;
        eVar.O3();
        eVar.P5();
    }

    public final void f() {
        this.f52626f.getClass();
        this.f52623c.d(this.f52621a, this.f52624d, 0, false, true, new yw2.h(this, 0));
    }

    public final void g() {
        this.f52626f.getClass();
        rw2.a aVar = this.f52623c;
        c2 c2Var = aVar.f154862b;
        if (c2Var != null) {
            c2Var.c(null);
        }
        c2 c2Var2 = aVar.f154863c;
        if (c2Var2 != null) {
            c2Var2.c(null);
        }
        this.f52632l = true;
        e eVar = this.f52622b;
        eVar.P5();
        eVar.g1();
    }

    public final void i() {
        if (this.f52629i && this.f52630j) {
            rw2.a aVar = this.f52623c;
            rw2.e eVar = aVar.f154871k;
            h hVar = this.f52626f;
            if (eVar == null) {
                Logger logger = h.f56678c;
                hVar.getClass();
                g();
                return;
            }
            rw2.e eVar2 = aVar.f154872l;
            if (eVar2 == null) {
                if (this.f52624d == 36352) {
                    e();
                    return;
                }
                Logger logger2 = h.f56678c;
                hVar.getClass();
                g();
                return;
            }
            String strH = h(eVar, eVar2);
            if (s.g(strH, a.VALID_COMPOSITION.f52638a)) {
                e();
                return;
            }
            if (!s.g(strH, a.INVALID_COMPOSITION.f52638a)) {
                if (s.g(strH, a.OUTDATED_COMPOSITION_CACHE.f52638a)) {
                    d();
                    return;
                }
                return;
            }
            int i14 = this.f52627g;
            if (i14 < this.f52628h) {
                this.f52627g = i14 + 1;
                b(this, false, true, false, true, false, 9);
            } else {
                Logger logger3 = h.f56678c;
                hVar.getClass();
                g();
            }
        }
    }

    public final void j() {
        if (this.f52629i && this.f52630j) {
            rw2.a aVar = this.f52623c;
            rw2.e eVar = aVar.f154872l;
            if (eVar == null) {
                c(a.UNKNOWN.f52638a);
                return;
            }
            rw2.e eVar2 = aVar.f154871k;
            if (eVar2 == null) {
                c(a.UNKNOWN.f52638a);
                return;
            }
            String strH = h(eVar2, eVar);
            a aVar2 = a.VALID_COMPOSITION;
            if (s.g(strH, aVar2.f52638a)) {
                if (this.f52631k) {
                    c(a.INVALID_COMPOSITION.f52638a);
                    return;
                } else {
                    c(aVar2.f52638a);
                    return;
                }
            }
            if (!s.g(strH, a.INVALID_COMPOSITION.f52638a)) {
                a aVar3 = a.OUTDATED_COMPOSITION_CACHE;
                if (s.g(strH, aVar3.f52638a)) {
                    c(aVar3.f52638a);
                    return;
                }
                return;
            }
            this.f52631k = true;
            if (this.f52627g >= this.f52628h) {
                c(a.UNKNOWN.f52638a);
            } else {
                this.f52627g++;
                b(this, false, true, false, false, true, 9);
            }
        }
    }
}
