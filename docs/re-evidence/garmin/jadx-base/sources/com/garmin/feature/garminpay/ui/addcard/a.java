package com.garmin.feature.garminpay.ui.addcard;

import android.content.Intent;
import android.os.Bundle;
import g8.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ms2.f;
import o13.r;
import o53.f0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import ps2.n;
import ps2.w;
import yr2.k;
import yw2.h;
import zq2.d;
import zq2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/addcard/a;", "", "Lhn2/c;", "activity", "<init>", "(Lhn2/c;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn2.c f51835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dr2.a f51836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f51837c;

    public a(hn2.c cVar) {
        cVar.getClass();
        this.f51835a = cVar;
        this.f51836b = (dr2.a) KoinJavaComponent.get$default(dr2.a.class, null, null, 6, null);
        this.f51837c = new b(cVar, new h(this, 18), null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0085 A[Catch: all -> 0x00cb, TryCatch #1 {all -> 0x00cb, blocks: (B:28:0x0071, B:30:0x0077, B:32:0x0085, B:34:0x008d), top: B:65:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4 A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:12:0x0037, B:38:0x00a8, B:39:0x00ae, B:41:0x00b4, B:45:0x00c3), top: B:67:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[LOOP:1: B:65:0x0071->B:77:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a2 -> B:38:0x00a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(com.garmin.feature.garminpay.ui.addcard.a r17, qs2.d r18, long r19, ns2.a r21, v13.c r22) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.feature.garminpay.ui.addcard.a.a(com.garmin.feature.garminpay.ui.addcard.a, qs2.d, long, ns2.a, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(a aVar, f fVar, long j8, String str, v13.c cVar) throws Throwable {
        d dVar;
        a aVar2;
        f fVar2;
        long j14;
        aVar.getClass();
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f206671f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f206671f = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(aVar, cVar);
            }
        } else {
            dVar = new d(aVar, cVar);
        }
        Object objE0 = dVar.f206669d;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f206671f;
        if (i15 == 0) {
            r.b(objE0);
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            aVar2 = aVar;
            e eVar = new e(aVar2, fVar, j8, null);
            dVar.f206666a = fVar;
            dVar.f206667b = str;
            dVar.f206668c = j8;
            dVar.f206671f = 1;
            objE0 = ge1.b.e0(bVar, eVar, dVar);
            if (objE0 == aVar3) {
                return aVar3;
            }
            fVar2 = fVar;
            j14 = j8;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j14 = dVar.f206668c;
            str = dVar.f206667b;
            fVar2 = dVar.f206666a;
            r.b(objE0);
            aVar2 = aVar;
        }
        dr2.a.InterfaceC1294a interfaceC1294a = (dr2.a.InterfaceC1294a) objE0;
        if (interfaceC1294a != null) {
            c.b(aVar2.f51835a, c.a(interfaceC1294a, new a90.c(str, 17)));
            return Unit.INSTANCE;
        }
        aVar2.f51837c.a(fVar2, j14);
        return Unit.INSTANCE;
    }

    public final void c(long j8, String str, ns2.a<? extends ms2.e> aVar, qs2.d dVar) {
        is2.b f206680a;
        hs2.a aVar2;
        Set<is2.b> setI;
        is2.b bVar;
        List<T> list = aVar.f127815a;
        hn2.c cVar = this.f51835a;
        if (dVar != null) {
            ge1.b.T(f0.w(cVar), null, null, new zq2.b(this, dVar, j8, aVar, str, null), 3);
            return;
        }
        this.f51836b.getClass();
        ms2.e eVar = (ms2.e) h0.d0(aVar);
        if (eVar != null && (f206680a = eVar.getF206680a()) != null) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((ms2.e) it.next()).getF206680a() != f206680a) {
                        f206680a = null;
                        break;
                    }
                }
            }
        } else {
            f206680a = null;
            break;
        }
        if (f206680a != null) {
            w.f140538a.getClass();
            n nVarI = w.i(j8);
            if (nVarI != null && (aVar2 = nVarI.f140498a) != null && (setI = aVar2.i()) != null && (bVar = (is2.b) h0.J0(setI)) != null && aVar.f127816b && f206680a == bVar) {
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    do {
                        if (it3.hasNext()) {
                        }
                    } while (((ms2.e) it3.next()).x3());
                }
                ge1.b.T(f0.w(cVar), null, null, new zq2.c(j8, aVar, this, str, null), 3);
                return;
            }
        }
        ArrayList arrayListM = i.m(aVar);
        if (arrayListM.isEmpty()) {
            Logger loggerA = b.f51838f.f51844a.a();
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "No supported categories found for ", str, " #");
            sbJ.append(".");
            loggerA.warn(sbJ.toString());
            c.b(cVar, ar2.a.b.C0176b.f12566a);
            return;
        }
        int size = arrayListM.size();
        b bVar2 = this.f51837c;
        if (size == 1) {
            bVar2.b((qs2.e) h0.I0(arrayListM), aVar, j8, str);
            return;
        }
        bVar2.getClass();
        try {
            f.c<Intent> cVar2 = bVar2.f51843e;
            SelectCategoryActivity.a aVar3 = SelectCategoryActivity.f51799i;
            hn2.c cVar3 = bVar2.f51839a;
            aVar3.getClass();
            cVar3.getClass();
            Intent intent = new Intent(cVar3, (Class<?>) SelectCategoryActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra.operators", aVar);
            bundle.putLong("device.unit.id", j8);
            bundle.putString("device.name", str);
            k.a(intent, bundle);
            cVar2.a(intent, null);
        } catch (Throwable th3) {
            b.f51838f.f51844a.a().warn("Failed to start SelectCategoryActivity", th3);
            bVar2.f51840b.invoke(new b.c.C1080b());
        }
    }
}
