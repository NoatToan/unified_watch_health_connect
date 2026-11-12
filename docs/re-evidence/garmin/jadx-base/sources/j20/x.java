package j20;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x implements fa.j.a, fa.j.b, u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96630a;

    public static float a(float f14, float f15, float f16, float f17) {
        return ((f14 - f15) * f16) + f17;
    }

    public static long b(p3.m mVar) {
        return d92.b.a(mVar).c().e();
    }

    public static String d(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String e(StringBuilder sb3, int i14, String str) {
        sb3.append(str);
        sb3.append(i14);
        return sb3.toString();
    }

    public static String f(Locale locale, String str, Locale locale2) {
        locale.getClass();
        String lowerCase = str.toLowerCase(locale2);
        lowerCase.getClass();
        return lowerCase;
    }

    public static Iterator g(i53.c cVar, Parcel parcel) {
        parcel.writeInt(cVar.size());
        return cVar.iterator();
    }

    public static /* synthetic */ void h() {
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(int i14, String str, Object obj) {
        throw new IllegalArgumentException(str + obj + ((char) i14));
    }

    public static void j(long j8, String str, String str2, StringBuilder sb3) {
        sb3.append(str);
        sb3.append(j8);
        sb3.append(str2);
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    public static /* synthetic */ void l(String str) {
        throw new NullPointerException(str);
    }

    public static void m(StringBuilder sb3, Integer num, String str, Integer num2, String str2) {
        sb3.append(num);
        sb3.append(str);
        sb3.append(num2);
        sb3.append(str2);
    }

    @Override // fa.j.b
    public void c(Object obj, androidx.media3.common.o oVar) {
    }

    @Override // fa.j.a
    public void invoke(Object obj) {
        ja.b bVar = (ja.b) obj;
        switch (this.f96630a) {
            case 5:
                bVar.getClass();
                break;
            case 6:
                bVar.getClass();
                break;
            case 7:
                bVar.getClass();
                break;
            case 8:
                bVar.getClass();
                break;
            case 9:
                bVar.getClass();
                break;
            case 10:
                bVar.getClass();
                break;
            case 11:
                bVar.getClass();
                break;
            case 12:
                bVar.getClass();
                break;
            case 13:
                bVar.getClass();
                break;
            case 14:
                bVar.getClass();
                break;
            case 15:
                bVar.getClass();
                break;
            case 16:
                bVar.getClass();
                break;
            case 17:
                bVar.getClass();
                break;
            case 18:
            default:
                bVar.getClass();
                break;
            case 19:
                bVar.getClass();
                break;
            case 20:
                bVar.getClass();
                break;
        }
    }

    @Override // u03.a
    public void run() {
        Parcelable parcelable;
        hs2.a aVarB;
        jn2.u uVar = jn2.u.f99680a;
        ps2.w.f140538a.getClass();
        if (!ps2.w.f140550m) {
            jn2.u.f99681b.warn("executeQueueItems: wallet not yet initialized");
            return;
        }
        jn2.c cVar = jn2.u.f99686g;
        if (!cVar.f99618c.isEmpty()) {
            synchronized (cVar.f99618c) {
                try {
                    if (!cVar.f99618c.isEmpty()) {
                        try {
                            Iterator<Map.Entry<Long, List<ql2.a>>> it = cVar.f99618c.entrySet().iterator();
                            while (it.hasNext()) {
                                Iterator<T> it3 = it.next().getValue().iterator();
                                while (it3.hasNext()) {
                                    cVar.f99616a.a((ql2.a) it3.next());
                                }
                            }
                            cVar.f99618c.clear();
                            cVar.a().debug("deliver: complete, queue cleared");
                        } catch (Throwable th3) {
                            cVar.f99618c.clear();
                            cVar.a().debug("deliver: complete, queue cleared");
                            throw th3;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return;
        }
        jn2.u.f99681b.debug("executeQueueItems: deviceActionQueue is empty, checking if the device is already connected...");
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListD = rd2.j.d();
        if (arrayListD != null) {
            ArrayList<sd2.f> arrayList = new ArrayList();
            for (Object obj : arrayListD) {
                sd2.f fVar = (sd2.f) obj;
                if (((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).a(fVar.getUnitID()) && fVar.d0() != null) {
                    arrayList.add(obj);
                }
            }
            jn2.u.f99680a.getClass();
            Logger logger = jn2.u.f99681b;
            logger.debug("handleNfcReadyForConnectedDevices");
            if (arrayList.isEmpty()) {
                logger.debug("handleNfcReadyForConnectedDevices: no nfc connected devices available yet... returning");
                return;
            }
            for (sd2.f fVar2 : arrayList) {
                wr.g.w("handleNfcReadyForConnectedDevices: handling device ", fVar2.getUnitID(), logger);
                ps2.w wVar = ps2.w.f140538a;
                long unitID = fVar2.getUnitID();
                wVar.getClass();
                ps2.n nVarI = ps2.w.i(unitID);
                hs2.b bVarH = nVarI != null ? nVarI.h() : null;
                if (bVarH != null && bVarH == hs2.b.DISCONNECTED) {
                    da2.f fVarA = da2.f.a();
                    String strD0 = fVar2.d0();
                    strD0.getClass();
                    fVarA.getClass();
                    da2.d dVarB = da2.d.b();
                    da2.b bVar = dVarB != null ? dVarB.f58886a.f111646e : null;
                    da2.l lVarF = bVar != null ? bVar.f(strD0) : null;
                    rl2.c cVar2 = lVarF != null ? (rl2.c) lVarF.getCapability(rl2.c.class) : null;
                    pl2.f fVar3 = cVar2 != null ? cVar2.f153459h : null;
                    if (fVar3 != null) {
                        Bundle bundle = new Bundle();
                        String strD1 = fVar2.d0();
                        strD1.getClass();
                        bundle.putString("extra.device.mac.address", strD1);
                        bundle.putParcelable("extra.nfc.capabilities", fVar3);
                        jn2.u uVar2 = jn2.u.f99680a;
                        long unitID2 = fVar2.getUnitID();
                        uVar2.getClass();
                        String string = bundle.getString("extra.device.mac.address", "");
                        string.getClass();
                        if (TextUtils.isEmpty(string)) {
                            logger.error("createWalletMetadata(" + unitID2 + "): intent missing macAddress");
                            aVarB = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) bundle.getParcelable("extra.nfc.capabilities", pl2.f.class);
                            } else {
                                Parcelable parcelable2 = bundle.getParcelable("extra.nfc.capabilities");
                                if (!(parcelable2 instanceof pl2.f)) {
                                    parcelable2 = null;
                                }
                                parcelable = (pl2.f) parcelable2;
                            }
                            aVarB = jn2.u.b(unitID2, string, (pl2.f) parcelable);
                        }
                        if (aVarB != null) {
                            jn2.u.c(aVarB, fVar2.getUnitID());
                        }
                    }
                }
            }
        }
    }

    public /* synthetic */ x(int i14) {
        this.f96630a = i14;
    }

    public /* synthetic */ x(ja.b.a aVar, int i14) {
        this.f96630a = i14;
    }
}
