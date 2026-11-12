package com.garmin.android.apps.connectmobile.activities.health.presentation;

import androidx.lifecycle.v1;
import lc.u0;
import nn.k;
import nn.l;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import s70.b0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/health/presentation/e;", "Lnn/c;", "Lcom/garmin/android/apps/connectmobile/activities/health/presentation/b;", "Ltn/g;", "Lcom/garmin/android/apps/connectmobile/activities/health/presentation/a;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends nn.c<b, tn.g, com.garmin.android.apps.connectmobile.activities.health.presentation.a> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f29058j = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f29060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qn.a f29061i = (qn.a) KoinJavaComponent.get$default(qn.a.class, null, null, 6, null);

    static {
        new a(null);
    }

    public static final void D4(e eVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a aVar) {
        eVar.getClass();
        aVar.getClass();
        ge1.b.T(v1.a(eVar), null, null, new nn.b(eVar, aVar, null), 3);
    }

    @Override // nn.c
    public final l B4() {
        return new tn.g(null, null);
    }

    @Override // nn.c
    public final void z4(k kVar) {
        b bVar = (b) kVar;
        bVar.getClass();
        if (bVar instanceof b.a) {
            b.a aVar = (b.a) bVar;
            ge1.b.T(v1.a(this), null, null, new f(this, aVar.f29033a, aVar.f29034b, null), 3);
            A4(b.d.f29038a);
            return;
        }
        if (bVar instanceof b.C0446b) {
            b.C0446b c0446b = (b.C0446b) bVar;
            ge1.b.T(v1.a(this), null, null, new g(this, c0446b.f29035a, c0446b.f29036b, null), 3);
            return;
        }
        if (bVar instanceof b.c) {
            tn.g value = x4().getValue();
            value.getClass();
            sn.h hVar = ((b.c) bVar).f29037a;
            tn.g gVarA = tn.g.a(value, hVar, null, 2);
            nn.f<tn.g> fVarY4 = y4();
            fVarY4.getClass();
            fVarY4.f126670b.setValue(gVarA);
            ge1.b.T(v1.a(this), null, null, new g(this, hVar.d(), hVar.getCalendarDate(), null), 3);
            return;
        }
        if (bVar instanceof b.f) {
            b.f fVar = (b.f) bVar;
            String str = fVar.f29042a;
            String str2 = fVar.f29043b;
            ge1.b.T(v1.a(this), null, null, new i(fVar.f29044c, this, str, str2, null), 3);
            A4(b.d.f29038a);
            return;
        }
        if (!(bVar instanceof b.e)) {
            if (bVar instanceof b.d) {
                C4(new b0(this, 29));
                return;
            } else {
                u0.r();
                return;
            }
        }
        b.e eVar = (b.e) bVar;
        ge1.b.T(v1.a(this), null, null, new h(this, eVar.f29039a, eVar.f29040b, eVar.f29041c, null), 3);
        A4(b.d.f29038a);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/health/presentation/e$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
