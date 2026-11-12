package com.garmin.android.library.mapsdkadapter;

import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/m;", "", "<init>", "()V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f50298a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ArrayList f50299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static LatLngBounds f50300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList f50301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static LatLngBounds f50302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ArrayList f50303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static ArrayList f50304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static LatLngBounds f50305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static LatLngBounds f50306i;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f50308b;

        static {
            int[] iArr = new int[i.b.values().length];
            try {
                iArr[i.b.WGS84.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.b.GCJ02.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f50307a = iArr;
            int[] iArr2 = new int[i.d.values().length];
            try {
                iArr2[i.d.MAPBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f50308b = iArr2;
        }
    }

    private m() {
    }

    public static final LatLngBounds a(m mVar, List list) {
        mVar.getClass();
        LatLngBounds.Builder builder = LatLngBounds.builder();
        builder.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            builder.include((LatLng) it.next());
        }
        LatLngBounds latLngBoundsBuild = builder.build();
        latLngBoundsBuild.getClass();
        return latLngBoundsBuild;
    }

    public static final ArrayList b(m mVar, Context context, int i14) throws IOException {
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        Resources resources = context.getResources();
        resources.getClass();
        InputStream inputStreamOpenRawResource = resources.openRawResource(i14);
        inputStreamOpenRawResource.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, d53.c.f57666b), 8192);
        try {
            String strE = lg.d.E(bufferedReader);
            bufferedReader.close();
            JsonElement jsonElement = new JsonParser().parse(strE);
            jsonElement.getClass();
            Iterator<JsonElement> it = ((JsonArray) jsonElement).iterator();
            it.getClass();
            while (it.hasNext()) {
                JsonObject asJsonObject = it.next().getAsJsonObject();
                arrayList.add(new LatLng(asJsonObject.get("lat").getAsDouble(), asJsonObject.get("lng").getAsDouble()));
            }
            return arrayList;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(bufferedReader, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x003f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x0049  */
    /* JADX WARN: Code duplicated, block: B:32:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0064  */
    /* JADX WARN: Code duplicated, block: B:44:0x006d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0076  */
    /* JADX WARN: Code duplicated, block: B:50:0x007c  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0068, code lost:
    
        if (i(r2, r1) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final i.b c(LatLng latLng, i.d dVar) {
        LatLngBounds latLngBounds;
        LatLngBounds latLngBounds2;
        ArrayList arrayList;
        ArrayList arrayList2;
        dVar.getClass();
        latLng.getClass();
        if (dVar == i.d.GOOGLE) {
            return f(latLng) ? i.b.GCJ02 : i.b.WGS84;
        }
        if (dVar != i.d.BAIDU) {
            return i.b.WGS84;
        }
        f50298a.getClass();
        LatLngBounds latLngBounds3 = f50302e;
        if (latLngBounds3 == null) {
            p005kotlin.jvm.internal.s.m("HONGKONG_LATLNG_BOUNDS");
            throw null;
        }
        if (latLngBounds3.contains(latLng)) {
            ArrayList arrayList3 = f50301d;
            if (arrayList3 == null) {
                p005kotlin.jvm.internal.s.m("HONGKONG_POLYGON");
                throw null;
            }
            if (!i(arrayList3, latLng)) {
                latLngBounds = f50300c;
                if (latLngBounds != null) {
                    p005kotlin.jvm.internal.s.m("TAIWAN_LATLNG_BOUNDS");
                    throw null;
                }
                if (!latLngBounds.contains(latLng)) {
                    latLngBounds2 = f50305h;
                    if (latLngBounds2 != null) {
                        p005kotlin.jvm.internal.s.m("COMPLEX_CHINA_LATLNG_BOUNDS");
                        throw null;
                    }
                    if (latLngBounds2.contains(latLng)) {
                        arrayList = f50303f;
                        if (arrayList != null) {
                            p005kotlin.jvm.internal.s.m("COMPLEX_CHINA_POLYGON");
                            throw null;
                        }
                    }
                    return i.b.WGS84;
                }
                arrayList2 = f50299b;
                if (arrayList2 != null) {
                    p005kotlin.jvm.internal.s.m("TAIWAN_POLYGON");
                    throw null;
                }
                if (!i(arrayList2, latLng)) {
                    latLngBounds2 = f50305h;
                    if (latLngBounds2 != null) {
                        p005kotlin.jvm.internal.s.m("COMPLEX_CHINA_LATLNG_BOUNDS");
                        throw null;
                    }
                    if (latLngBounds2.contains(latLng)) {
                        arrayList = f50303f;
                        if (arrayList != null) {
                            p005kotlin.jvm.internal.s.m("COMPLEX_CHINA_POLYGON");
                            throw null;
                        }
                    }
                    return i.b.WGS84;
                }
            }
        } else {
            latLngBounds = f50300c;
            if (latLngBounds != null) {
                p005kotlin.jvm.internal.s.m("TAIWAN_LATLNG_BOUNDS");
                throw null;
            }
            if (!latLngBounds.contains(latLng)) {
                latLngBounds2 = f50305h;
                if (latLngBounds2 != null) {
                    p005kotlin.jvm.internal.s.m("COMPLEX_CHINA_LATLNG_BOUNDS");
                    throw null;
                }
                if (latLngBounds2.contains(latLng)) {
                    arrayList = f50303f;
                    if (arrayList != null) {
                        p005kotlin.jvm.internal.s.m("COMPLEX_CHINA_POLYGON");
                        throw null;
                    }
                }
                return i.b.WGS84;
            }
            arrayList2 = f50299b;
            if (arrayList2 != null) {
                p005kotlin.jvm.internal.s.m("TAIWAN_POLYGON");
                throw null;
            }
            if (!i(arrayList2, latLng)) {
                latLngBounds2 = f50305h;
                if (latLngBounds2 != null) {
                    p005kotlin.jvm.internal.s.m("COMPLEX_CHINA_LATLNG_BOUNDS");
                    throw null;
                }
                if (latLngBounds2.contains(latLng)) {
                    arrayList = f50303f;
                    if (arrayList != null) {
                        p005kotlin.jvm.internal.s.m("COMPLEX_CHINA_POLYGON");
                        throw null;
                    }
                }
                return i.b.WGS84;
            }
        }
        return i.b.GCJ02;
    }

    public static final i.b d(double d14, double d15) {
        return f(new LatLng(d14, d15)) ? i.b.GCJ02 : i.b.WGS84;
    }

    public static final boolean e(f fVar) {
        fVar.getClass();
        LatLng latLng = fVar.f50283a;
        int i14 = a.f50307a[fVar.f50284b.ordinal()];
        if (i14 == 1) {
            return f(latLng);
        }
        if (i14 != 2) {
            u0.r();
            return false;
        }
        f50298a.getClass();
        LatLngBounds latLngBounds = f50306i;
        if (latLngBounds == null) {
            p005kotlin.jvm.internal.s.m("COMPLEX_CHINA_LATLNG_BOUNDS_GCJ02");
            throw null;
        }
        if (!latLngBounds.contains(latLng)) {
            return false;
        }
        ArrayList arrayList = f50304g;
        if (arrayList != null) {
            return i(arrayList, latLng);
        }
        p005kotlin.jvm.internal.s.m("COMPLEX_CHINA_POLYGON_GCJ02");
        throw null;
    }

    public static final boolean f(LatLng latLng) {
        latLng.getClass();
        f50298a.getClass();
        LatLngBounds latLngBounds = f50305h;
        if (latLngBounds == null) {
            p005kotlin.jvm.internal.s.m("COMPLEX_CHINA_LATLNG_BOUNDS");
            throw null;
        }
        if (!latLngBounds.contains(latLng)) {
            return false;
        }
        ArrayList arrayList = f50303f;
        if (arrayList != null) {
            return i(arrayList, latLng);
        }
        p005kotlin.jvm.internal.s.m("COMPLEX_CHINA_POLYGON");
        throw null;
    }

    public static final boolean g(LatLng latLng) {
        latLng.getClass();
        f50298a.getClass();
        LatLngBounds latLngBounds = f50302e;
        if (latLngBounds == null) {
            p005kotlin.jvm.internal.s.m("HONGKONG_LATLNG_BOUNDS");
            throw null;
        }
        if (!latLngBounds.contains(latLng)) {
            return false;
        }
        ArrayList arrayList = f50301d;
        if (arrayList != null) {
            return i(arrayList, latLng);
        }
        p005kotlin.jvm.internal.s.m("HONGKONG_POLYGON");
        throw null;
    }

    public static final boolean h(Location location) {
        if (Math.abs(location.getLatitude()) > 90.0d || Math.abs(location.getLongitude()) > 180.0d) {
            return false;
        }
        return (location.getLatitude() == 0.0d && location.getLongitude() == 0.0d) ? false : true;
    }

    public static boolean i(List list, LatLng latLng) {
        list.getClass();
        latLng.getClass();
        int size = list.size();
        int i14 = size - 1;
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            LatLng latLng2 = (LatLng) list.get(i15);
            LatLng latLng3 = (LatLng) list.get(i14);
            double d14 = latLng2.latitude;
            double d15 = latLng.latitude;
            boolean z15 = d14 > d15;
            double d16 = latLng3.latitude;
            if (z15 != (d16 > d15)) {
                double d17 = latLng3.longitude;
                double d18 = latLng2.longitude;
                if (latLng.longitude < (((d15 - d14) * (d17 - d18)) / (d16 - d14)) + d18) {
                    z14 = !z14;
                }
            }
            i14 = i15;
        }
        return z14;
    }
}
