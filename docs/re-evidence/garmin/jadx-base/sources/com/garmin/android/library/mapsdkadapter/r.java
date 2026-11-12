package com.garmin.android.library.mapsdkadapter;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.maps.MapsInitializer;
import com.mapbox.common.MapboxOptions;
import com.mapbox.common.location.LocationServiceFactory;
import i3.m8;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/r;", "Lcom/garmin/android/library/mapsdkadapter/k;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "mapBoxApiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "a", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class r implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f50329d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f50330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f50332c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50333a;

        static {
            int[] iArr = new int[i.d.values().length];
            try {
                iArr[i.d.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.d.MAPBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f50333a = iArr;
        }
    }

    static {
        new a(null);
    }

    public r(Context context, String str) {
        context.getClass();
        str.getClass();
        this.f50330a = context;
        this.f50331b = str;
        this.f50332c = new LinkedHashMap();
    }

    @Override // com.garmin.android.library.mapsdkadapter.k
    public final com.garmin.android.library.mapsdkadapter.a a(i.d dVar) {
        boolean zIsAvailable;
        dVar.getClass();
        int[] iArr = b.f50333a;
        int i14 = iArr[dVar.ordinal()];
        Context context = this.f50330a;
        if (i14 == 1) {
            GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } else if (i14 == 2 && !(zIsAvailable = LocationServiceFactory.getOrCreate().isAvailable()) && zIsAvailable) {
            u0.r();
            return null;
        }
        int i15 = iArr[dVar.ordinal()];
        if (i15 == 1) {
            d(dVar);
            return new me2.l(context);
        }
        if (i15 != 2) {
            dVar.toString();
            return new d();
        }
        d(dVar);
        return new ne2.s(context);
    }

    @Override // com.garmin.android.library.mapsdkadapter.k
    public i.d b() {
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f50330a) == 0) {
            return i.d.GOOGLE;
        }
        return LocationServiceFactory.getOrCreate().isAvailable() ? i.d.MAPBOX : i.d.NULL;
    }

    public List<i.d> c() {
        return h0.b1(this.f50332c.keySet());
    }

    public final void d(i.d dVar) {
        dVar.getClass();
        LinkedHashMap linkedHashMap = this.f50332c;
        Boolean bool = (Boolean) linkedHashMap.get(dVar);
        dVar.toString();
        if (p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE)) {
            int i14 = b.f50333a[dVar.ordinal()];
            if (i14 == 1) {
                MapsInitializer.initialize(this.f50330a.getApplicationContext(), MapsInitializer.Renderer.LATEST, null);
            } else if (i14 == 2) {
                MapboxOptions.setAccessToken(this.f50331b);
            }
            linkedHashMap.put(dVar, Boolean.TRUE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    public final je2.b<?> e(i.d dVar, ke2.b bVar, e23.a<je2.a> aVar, p3.m mVar, int i14) {
        je2.b<?> bVar2;
        aVar.getClass();
        mVar.C(1777555289);
        x1 x1Var = p3.n.f135158a;
        int i15 = dVar == null ? -1 : b.f50333a[dVar.ordinal()];
        int i16 = 6;
        p3.m.a aVar2 = p3.m.f135153a;
        int i17 = 0;
        if (i15 == 1) {
            mVar.C(-1796654628);
            me2.e.a aVar3 = me2.e.f118163c;
            Object[] objArr = {bVar};
            boolean z14 = (((i14 & 896) ^ 384) > 256 && mVar.B(aVar)) || (i14 & 384) == 256;
            Object objQ = mVar.q();
            if (z14) {
                objQ = new m8(aVar, i16);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new m8(aVar, i16);
                    mVar.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            aVar3.getClass();
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
            d4.l lVar2 = me2.e.f118164d;
            boolean zB = mVar.B(lVar);
            Object objQ2 = mVar.q();
            if (zB) {
                objQ2 = new me2.d(lVar, i17);
                mVar.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new me2.d(lVar, i17);
                    mVar.K(objQ2);
                }
            }
            bVar2 = (me2.e) d4.a.c(objArrCopyOf, lVar2, (e23.a) objQ2, mVar, 0);
            mVar.f();
        } else if (i15 != 2) {
            mVar.C(-1796466428);
            mVar.f();
            bVar2 = null;
        } else {
            mVar.C(-1796866916);
            oe2.e.a aVar4 = oe2.e.f131472d;
            Object[] objArr2 = {bVar};
            boolean z15 = (((i14 & 896) ^ 384) > 256 && mVar.B(aVar)) || (i14 & 384) == 256;
            Object objQ3 = mVar.q();
            if (z15) {
                objQ3 = new m8(aVar, 5);
                mVar.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new m8(aVar, 5);
                    mVar.K(objQ3);
                }
            }
            e23.l lVar3 = (e23.l) objQ3;
            aVar4.getClass();
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, 1);
            d4.l lVar4 = oe2.e.f131473e;
            boolean zB2 = mVar.B(lVar3);
            Object objQ4 = mVar.q();
            if (zB2) {
                objQ4 = new me2.d(lVar3, i16);
                mVar.K(objQ4);
            } else {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new me2.d(lVar3, i16);
                    mVar.K(objQ4);
                }
            }
            bVar2 = (oe2.e) d4.a.c(objArrCopyOf2, lVar4, (e23.a) objQ4, mVar, 0);
            mVar.f();
        }
        mVar.f();
        return bVar2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/r$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
