package defpackage;

import a42.s;
import b82.j;
import bb2.q;
import bb2.r;
import c22.l3;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import com.garmin.feature.garminpay.util.InvalidApduResponseException;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import d53.w;
import e23.l;
import java.util.ArrayList;
import java.util.Arrays;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p13.u;
import p5.h0;
import p5.k0;
import ud.a;
import ud.c;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13785b;

    public /* synthetic */ b(String str, int i14) {
        this.f13784a = i14;
        this.f13785b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        int i14 = this.f13784a;
        String strM1 = null;
        r rVar = null;
        String strM2 = null;
        r rVar2 = null;
        String strM3 = null;
        r rVar3 = null;
        String str = this.f13785b;
        switch (i14) {
            case 0:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.n(k0Var, str);
                return Unit.INSTANCE;
            case 1:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.n(k0Var2, str);
                return Unit.INSTANCE;
            case 2:
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                h0.n(k0Var3, str);
                return Unit.INSTANCE;
            case 3:
                k0 k0Var4 = (k0) obj;
                s.a aVar = s.f1073g;
                k0Var4.getClass();
                h0.n(k0Var4, str);
                return Unit.INSTANCE;
            case 4:
                k0 k0Var5 = (k0) obj;
                s.a aVar2 = s.f1073g;
                k0Var5.getClass();
                h0.n(k0Var5, str);
                return Unit.INSTANCE;
            case 5:
                k0 k0Var6 = (k0) obj;
                k0Var6.getClass();
                h0.n(k0Var6, str);
                return Unit.INSTANCE;
            case 6:
                k0 k0Var7 = (k0) obj;
                k0Var7.getClass();
                h0.n(k0Var7, str);
                return Unit.INSTANCE;
            case 7:
                k0 k0Var8 = (k0) obj;
                k0Var8.getClass();
                h0.n(k0Var8, str);
                return Unit.INSTANCE;
            case 8:
                Double d14 = (Double) obj;
                if (d14 == null) {
                    return str;
                }
                l3.a aVar3 = l3.f23124b;
                int iDoubleValue = (int) d14.doubleValue();
                aVar3.getClass();
                return l3.a.Z0(iDoubleValue);
            case 9:
                return str;
            case 10:
                k0 k0Var9 = (k0) obj;
                k0Var9.getClass();
                h0.n(k0Var9, str);
                return Unit.INSTANCE;
            case 11:
                k0 k0Var10 = (k0) obj;
                k0Var10.getClass();
                if (str != null) {
                    h0.n(k0Var10, str);
                }
                return Unit.INSTANCE;
            case 12:
                k0 k0Var11 = (k0) obj;
                k0Var11.getClass();
                h0.i(k0Var11, str, null);
                return Unit.INSTANCE;
            case 13:
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                p pVar = new p(p13.h0.V0(u.B(bArr)), p13.h0.V0(u.b0(2, bArr)));
                byte[] bArr2 = (byte[]) pVar.f128594a;
                if (Arrays.equals((byte[]) pVar.f128595b, new byte[]{-112, 0})) {
                    return bArr2;
                }
                throw new InvalidApduResponseException(str);
            case 14:
                k0 k0Var12 = (k0) obj;
                k0Var12.getClass();
                String strV = str != null ? d53.u.v(str, ":", "", false) : null;
                h0.n(k0Var12, strV != null ? strV : "");
                return Unit.INSTANCE;
            case 15:
                k0 k0Var13 = (k0) obj;
                k0Var13.getClass();
                h0.n(k0Var13, d53.u.v(str, ":", "", false));
                return Unit.INSTANCE;
            case 16:
                k0 k0Var14 = (k0) obj;
                k0Var14.getClass();
                h0.n(k0Var14, str);
                p5.l.f136032b.getClass();
                h0.w(k0Var14, p5.l.f136037g);
                return Unit.INSTANCE;
            case 17:
                k0 k0Var15 = (k0) obj;
                j jVar = j.f16611a;
                k0Var15.getClass();
                h0.n(k0Var15, str);
                return Unit.INSTANCE;
            case 18:
                a aVar4 = (a) obj;
                q.c cVar = q.f17382c;
                aVar4.getClass();
                c cVarM0 = aVar4.M0("SELECT * FROM response_cache WHERE requestUrl = ? AND strftime('%s','now') * 1000 < lastUpdate + maxAge");
                try {
                    cVarM0.q3(1, str);
                    int iB = ge1.b.B(cVarM0, "requestUrl");
                    int iB2 = ge1.b.B(cVarM0, "response");
                    int iB3 = ge1.b.B(cVarM0, "lastUpdate");
                    int iB4 = ge1.b.B(cVarM0, "maxAge");
                    int iB5 = ge1.b.B(cVarM0, "maxStale");
                    if (cVarM0.J0()) {
                        String strM4 = cVarM0.M1(iB);
                        if (!cVarM0.isNull(iB2)) {
                            strM3 = cVarM0.M1(iB2);
                        }
                        r rVar4 = new r(strM4, strM3);
                        rVar4.f17387c = cVarM0.getLong(iB3);
                        rVar4.f17388d = cVarM0.getLong(iB4);
                        rVar4.f17389e = cVarM0.getLong(iB5);
                        rVar3 = rVar4;
                    }
                    return rVar3;
                } finally {
                    cVarM0.close();
                }
            case 19:
                a aVar5 = (a) obj;
                q.c cVar2 = q.f17382c;
                aVar5.getClass();
                c cVarM1 = aVar5.M0("SELECT * FROM response_cache WHERE requestUrl = ? AND strftime('%s','now') * 1000 < lastUpdate + maxStale");
                try {
                    cVarM1.q3(1, str);
                    int iB6 = ge1.b.B(cVarM1, "requestUrl");
                    int iB7 = ge1.b.B(cVarM1, "response");
                    int iB8 = ge1.b.B(cVarM1, "lastUpdate");
                    int iB9 = ge1.b.B(cVarM1, "maxAge");
                    int iB10 = ge1.b.B(cVarM1, "maxStale");
                    if (cVarM1.J0()) {
                        String strM5 = cVarM1.M1(iB6);
                        if (!cVarM1.isNull(iB7)) {
                            strM2 = cVarM1.M1(iB7);
                        }
                        r rVar5 = new r(strM5, strM2);
                        rVar5.f17387c = cVarM1.getLong(iB8);
                        rVar5.f17388d = cVarM1.getLong(iB9);
                        rVar5.f17389e = cVarM1.getLong(iB10);
                        rVar2 = rVar5;
                    }
                    return rVar2;
                } finally {
                    cVarM1.close();
                }
            case 20:
                a aVar6 = (a) obj;
                q.c cVar3 = q.f17382c;
                aVar6.getClass();
                c cVarM2 = aVar6.M0("DELETE FROM response_cache WHERE requestUrl LIKE ? ESCAPE '\\'");
                try {
                    cVarM2.q3(1, str);
                    cVarM2.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM2.close();
                }
            case 21:
                a aVar7 = (a) obj;
                q.c cVar4 = q.f17382c;
                aVar7.getClass();
                c cVarM3 = aVar7.M0("SELECT response FROM response_cache WHERE requestUrl = ? AND strftime('%s','now') * 1000 < lastUpdate + maxAge");
                try {
                    cVarM3.q3(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (cVarM3.J0()) {
                        arrayList.add(cVarM3.isNull(0) ? null : cVarM3.M1(0));
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarM3.close();
                }
            case 22:
                a aVar8 = (a) obj;
                q.c cVar5 = q.f17382c;
                aVar8.getClass();
                c cVarM4 = aVar8.M0("SELECT * FROM response_cache WHERE requestUrl = ? AND strftime('%s','now') * 1000 < lastUpdate + maxAge");
                try {
                    cVarM4.q3(1, str);
                    int iB11 = ge1.b.B(cVarM4, "requestUrl");
                    int iB12 = ge1.b.B(cVarM4, "response");
                    int iB13 = ge1.b.B(cVarM4, "lastUpdate");
                    int iB14 = ge1.b.B(cVarM4, "maxAge");
                    int iB15 = ge1.b.B(cVarM4, "maxStale");
                    if (cVarM4.J0()) {
                        String strM6 = cVarM4.M1(iB11);
                        if (!cVarM4.isNull(iB12)) {
                            strM1 = cVarM4.M1(iB12);
                        }
                        r rVar6 = new r(strM6, strM1);
                        rVar6.f17387c = cVarM4.getLong(iB13);
                        rVar6.f17388d = cVarM4.getLong(iB14);
                        rVar6.f17389e = cVarM4.getLong(iB15);
                        rVar = rVar6;
                    }
                    return rVar;
                } finally {
                    cVarM4.close();
                }
            case 23:
                oi0.b bVar = (oi0.b) obj;
                bVar.getClass();
                if (p005kotlin.jvm.internal.s.g(p13.h0.d0(w.W(str, new String[]{StringUtils.SPACE})), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    bVar.r();
                    bVar.A();
                } else {
                    bVar.s();
                    bVar.B();
                }
                return Unit.INSTANCE;
            case 24:
                k0 k0Var16 = (k0) obj;
                k0Var16.getClass();
                h0.n(k0Var16, str);
                return Unit.INSTANCE;
            case 25:
                k0 k0Var17 = (k0) obj;
                k0Var17.getClass();
                h0.n(k0Var17, str);
                return Unit.INSTANCE;
            case 26:
                k0 k0Var18 = (k0) obj;
                k0Var18.getClass();
                h0.n(k0Var18, str);
                return Unit.INSTANCE;
            case 27:
                k0 k0Var19 = (k0) obj;
                k0Var19.getClass();
                h0.n(k0Var19, str);
                return Unit.INSTANCE;
            case 28:
                k0 k0Var20 = (k0) obj;
                k0Var20.getClass();
                if (str != null) {
                    h0.n(k0Var20, str);
                } else {
                    h0.h(k0Var20);
                }
                return Unit.INSTANCE;
            default:
                WorkoutDetailsActivity.a aVar9 = WorkoutDetailsActivity.f48482f;
                return new p((Long) obj, str);
        }
    }
}
