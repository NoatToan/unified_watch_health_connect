package com.google.android.gms.measurement.internal;

import am.j;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import b71.i;
import cd.b;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.maps.android.BuildConfig;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ed.a;
import fd.c;
import fd.e;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import lc.u0;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.slf4j.Marker;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zzpp extends zzjf {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"firebase_", "google_", "ga_"};
    private static final String[] zzc = {"_err"};
    private SecureRandom zzd;
    private final AtomicLong zze;
    private int zzf;
    private a zzg;
    private Boolean zzh;
    private Integer zzi;

    public zzpp(zzic zzicVar) {
        super(zzicVar);
        this.zzi = null;
        this.zze = new AtomicLong(0L);
    }

    public static MessageDigest zzO() {
        for (int i14 = 0; i14 < 2; i14++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static long zzP(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i14 = 0;
        Preconditions.checkState(length > 0);
        long j8 = 0;
        for (int i15 = length - 1; i15 >= 0 && i15 >= bArr.length - 8; i15--) {
            j8 += (((long) bArr[i15]) & 255) << i14;
            i14 += 8;
        }
        return j8;
    }

    public static boolean zzQ(Context context, boolean z14) {
        Preconditions.checkNotNull(context);
        return zzR(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean zzR(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean zzZ(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    private static boolean zzaA(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzaf(String str) {
        return !zzc[0].equals(str);
    }

    public static ArrayList zzas(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzahVar.zza);
            bundle.putString("origin", zzahVar.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzahVar.zzd);
            bundle.putString("name", zzahVar.zzc.zzb);
            zzjh.zza(bundle, Preconditions.checkNotNull(zzahVar.zzc.zza()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzahVar.zze);
            String str = zzahVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzbg zzbgVar = zzahVar.zzg;
            if (zzbgVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzbgVar.zza);
                zzbe zzbeVar = zzbgVar.zzb;
                if (zzbeVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzbeVar.zzf());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzahVar.zzh);
            zzbg zzbgVar2 = zzahVar.zzi;
            if (zzbgVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzbgVar2.zza);
                zzbe zzbeVar2 = zzbgVar2.zzb;
                if (zzbeVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzbeVar2.zzf());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzahVar.zzc.zzc);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzahVar.zzj);
            zzbg zzbgVar3 = zzahVar.zzk;
            if (zzbgVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzbgVar3.zza);
                zzbe zzbeVar3 = zzbgVar3.zzb;
                if (zzbeVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzbeVar3.zzf());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean zzau(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void zzav(zzlu zzluVar, Bundle bundle, boolean z14) {
        if (bundle != null && zzluVar != null) {
            if (!bundle.containsKey("_sc") || z14) {
                String str = zzluVar.zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzluVar.zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzluVar.zzc);
                return;
            }
            z14 = false;
        }
        if (bundle != null && zzluVar == null && z14) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean zzax(Bundle bundle, int i14) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i14);
        return true;
    }

    private final Object zzay(int i14, Object obj, boolean z14, boolean z15, String str) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return zzC(obj.toString(), i14, z14);
        }
        if (!z15 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleZzab = zzab((Bundle) parcelable, null);
                if (!bundleZzab.isEmpty()) {
                    arrayList.add(bundleZzab);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final int zzaz(String str) {
        if ("_ldl".equals(str)) {
            this.zzu.zzc();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.zzu.zzc();
            return 256;
        }
        boolean zEquals = "_lgclid".equals(str);
        zzic zzicVar = this.zzu;
        if (zEquals) {
            zzicVar.zzc();
            return 100;
        }
        zzicVar.zzc();
        return 36;
    }

    public static boolean zzh(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public final boolean zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            this.zzu.zzaV().zzd().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        Preconditions.checkNotNull(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        this.zzu.zzaV().zzd().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzgu.zzl(str));
        return false;
    }

    public final boolean zzB(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            Preconditions.checkNotNull(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final String zzC(String str, int i14, boolean z14) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i14) {
            return str;
        }
        if (z14) {
            return str.substring(0, str.offsetByCodePoints(0, i14)).concat("...");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    public final int zzD(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z14, boolean z15) {
        int i14;
        int size;
        zzg();
        if (!zzt(obj)) {
            i14 = 0;
        } else {
            if (!z15) {
                return 21;
            }
            if (!zzaA(str3, zzjn.zzc)) {
                return 20;
            }
            zznl zznlVarZzt = this.zzu.zzt();
            zznlVarZzt.zzg();
            zznlVarZzt.zzb();
            if (zznlVarZzt.zzK() && zznlVarZzt.zzu.zzk().zzah() < 200900) {
                return 25;
            }
            zzic zzicVar = this.zzu;
            zzicVar.zzc();
            boolean z16 = obj instanceof Parcelable[];
            if (z16) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i14 = 0;
            }
            if (size > 200) {
                zzicVar.zzaV().zzh().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                zzicVar.zzc();
                if (z16) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i14 = 17;
            } else {
                i14 = 0;
            }
        }
        if (!zzu("param", str3, (zzZ(str2) || zzZ(str3)) ? this.zzu.zzc().zzf(null, false) : this.zzu.zzc().zze(null, false), obj)) {
            if (!z15) {
                return 4;
            }
            if (obj instanceof Bundle) {
                zzz(str, str2, str3, (Bundle) obj, list, z14);
                return i14;
            }
            if (obj instanceof Parcelable[]) {
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (!(parcelable instanceof Bundle)) {
                        this.zzu.zzaV().zzh().zzc("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                        return 4;
                    }
                    zzz(str, str2, str3, (Bundle) parcelable, list, z14);
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    Object obj2 = arrayList2.get(i15);
                    if (!(obj2 instanceof Bundle)) {
                        this.zzu.zzaV().zzh().zzc("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : BuildConfig.TRAVIS, str3);
                        return 4;
                    }
                    zzz(str, str2, str3, (Bundle) obj2, list, z14);
                }
            }
        }
        return i14;
    }

    public final Object zzE(String str, Object obj) {
        if ("_ev".equals(str)) {
            return zzay(this.zzu.zzc().zzf(null, false), obj, true, true, null);
        }
        boolean zZzZ = zzZ(str);
        zzic zzicVar = this.zzu;
        return zzay(zZzZ ? zzicVar.zzc().zzf(null, false) : zzicVar.zzc().zze(null, false), obj, false, true, null);
    }

    public final Bundle zzF(String str, String str2, Bundle bundle, List list, boolean z14) {
        int iZzq;
        boolean zZzaA = zzaA(str2, zzjm.zzd);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        zzic zzicVar = this.zzu;
        int iZzc = zzicVar.zzc().zzc();
        int i14 = 0;
        boolean z15 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str3)) {
                iZzq = !z14 ? zzq(str3) : 0;
                if (iZzq == 0) {
                    iZzq = zzs(str3);
                }
            } else {
                iZzq = 0;
            }
            if (iZzq != 0) {
                zzJ(bundle2, iZzq, str3, iZzq == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int iZzD = zzD(str, str2, str3, bundle.get(str3), bundle2, list, z14, zZzaA);
                if (iZzD == 17) {
                    zzJ(bundle2, 17, str3, Boolean.FALSE);
                } else if (iZzD != 0 && !"_ev".equals(str3)) {
                    zzJ(bundle2, iZzD, iZzD == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (zzh(str3) && (i14 = i14 + 1) > iZzc) {
                    if (!zzicVar.zzc().zzp(null, zzfy.zzbe) || !z15) {
                        zzicVar.zzaV().zzd().zzc(u0.k(new StringBuilder(String.valueOf(iZzc).length() + 37), "Event can't contain more than ", iZzc, " params"), zzicVar.zzl().zza(str2), zzicVar.zzl().zze(bundle));
                    }
                    zzax(bundle2, 5);
                    bundle2.remove(str3);
                    z15 = true;
                }
            }
        }
        return bundle2;
    }

    public final void zzG(zzgv zzgvVar, int i14) {
        Bundle bundle = zzgvVar.zzd;
        int i15 = 0;
        boolean z14 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (zzh(str) && (i15 = i15 + 1) > i14) {
                zzic zzicVar = this.zzu;
                if (!zzicVar.zzc().zzp(null, zzfy.zzbe) || !z14) {
                    zzicVar.zzaV().zzd().zzc(u0.k(new StringBuilder(String.valueOf(i14).length() + 37), "Event can't contain more than ", i14, " params"), zzicVar.zzl().zza(zzgvVar.zza), zzicVar.zzl().zze(bundle));
                    zzax(bundle, 5);
                }
                bundle.remove(str);
                z14 = true;
            }
        }
    }

    public final void zzH(Parcelable[] parcelableArr, int i14) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i15 = 0;
            boolean z14 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (zzh(str) && !zzaA(str, zzjn.zzd) && (i15 = i15 + 1) > i14) {
                    zzic zzicVar = this.zzu;
                    if (!zzicVar.zzc().zzp(null, zzfy.zzbe) || !z14) {
                        zzicVar.zzaV().zzd().zzc(u0.k(new StringBuilder(String.valueOf(i14).length() + 60), "Param can't contain more than ", i14, " item-scoped custom parameters"), zzicVar.zzl().zzb(str), zzicVar.zzl().zze(bundle));
                    }
                    zzax(bundle, 28);
                    bundle.remove(str);
                    z14 = true;
                }
            }
        }
    }

    public final void zzI(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.zzu.zzk().zzM(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void zzJ(Bundle bundle, int i14, String str, Object obj) {
        if (zzax(bundle, i14)) {
            this.zzu.zzc();
            bundle.putString("_ev", zzC(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int zzK(String str, Object obj) {
        return "_ldl".equals(str) ? zzu("user property referrer", str, zzaz(str), obj) : zzu("user property", str, zzaz(str), obj) ? 0 : 7;
    }

    public final Object zzL(String str, Object obj) {
        return "_ldl".equals(str) ? zzay(zzaz(str), obj, true, false, null) : zzay(zzaz(str), obj, false, false, null);
    }

    public final void zzM(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            zzic zzicVar = this.zzu;
            zzicVar.zzaV().zzh().zzc("Not putting event parameter. Invalid value type. name, type", zzicVar.zzl().zzb(str), simpleName);
        }
    }

    public final void zzN(zzpo zzpoVar, String str, int i14, String str2, String str3, int i15) {
        Bundle bundle = new Bundle();
        zzax(bundle, i14);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i14 == 6 || i14 == 7 || i14 == 2) {
            bundle.putLong("_el", i15);
        }
        zzpoVar.zza(str, "_err", bundle);
    }

    public final boolean zzS() {
        zzg();
        return zzV() == 1;
    }

    public final a zzT() {
        c eVar;
        Object objInvoke;
        if (this.zzg == null) {
            Context contextZzaY = this.zzu.zzaY();
            a.f63802a.getClass();
            contextZzaY.getClass();
            c.f70421a.getClass();
            cd.a.f26754a.getClass();
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                cd.a.b.f26756a.a();
            }
            if ((i14 >= 33 ? cd.a.b.f26756a.a() : 0) >= 5) {
                eVar = new e(contextZzaY);
            } else {
                if (((i14 == 31 || i14 == 32) ? cd.a.C0410a.f26755a.a() : 0) >= 9) {
                    b bVar = b.f26757a;
                    fd.b bVar2 = new fd.b(contextZzaY);
                    bVar.getClass();
                    try {
                        objInvoke = bVar2.invoke(contextZzaY);
                    } catch (NoClassDefFoundError unused) {
                        cd.a.f26754a.getClass();
                        int i15 = Build.VERSION.SDK_INT;
                        if (i15 == 31 || i15 == 32) {
                            cd.a.C0410a.f26755a.a();
                        }
                        objInvoke = null;
                    }
                    eVar = (c) objInvoke;
                } else {
                    eVar = null;
                }
            }
            this.zzg = eVar != null ? new a.C1347a(eVar) : null;
        }
        return this.zzg;
    }

    public final int zzU() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public final long zzV() {
        long j8;
        zzg();
        if (!zzX(this.zzu.zzv().zzj())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j8 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j8 = 8;
        } else {
            zzic zzicVar = this.zzu;
            int iZzU = zzU();
            zzicVar.zzc();
            j8 = iZzU < ((Integer) zzfy.zzal.zzb(null)).intValue() ? 16L : 0L;
        }
        if (!zzY("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j8 |= 2;
        }
        if (j8 == 0 && !zzW()) {
            j8 = 64;
        }
        if (j8 == 0) {
            return 1L;
        }
        return j8;
    }

    @TargetApi(30)
    public final boolean zzW() {
        Object e4;
        Integer num;
        if (this.zzh == null) {
            a aVarZzT = zzT();
            boolean z14 = false;
            if (aVarZzT == null) {
                return false;
            }
            try {
                num = aVarZzT.a().get(AbstractComponentTracker.LINGERING_TIMEOUT, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z14 = true;
                        }
                    } catch (InterruptedException e14) {
                        e4 = e14;
                        this.zzu.zzaV().zze().zzb("Measurement manager api exception", e4);
                        this.zzh = Boolean.FALSE;
                    } catch (CancellationException e15) {
                        e4 = e15;
                        this.zzu.zzaV().zze().zzb("Measurement manager api exception", e4);
                        this.zzh = Boolean.FALSE;
                    } catch (ExecutionException e16) {
                        e4 = e16;
                        this.zzu.zzaV().zze().zzb("Measurement manager api exception", e4);
                        this.zzh = Boolean.FALSE;
                    } catch (TimeoutException e17) {
                        e4 = e17;
                        this.zzu.zzaV().zze().zzb("Measurement manager api exception", e4);
                        this.zzh = Boolean.FALSE;
                    }
                }
                this.zzh = Boolean.valueOf(z14);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e18) {
                e4 = e18;
                num = null;
            }
            this.zzu.zzaV().zzk().zzb("Measurement manager api status result", num);
        }
        return this.zzh.booleanValue();
    }

    public final boolean zzX(String str) {
        String str2 = (String) zzfy.zzar.zzb(null);
        return str2.equals(Marker.ANY_MARKER) || Arrays.asList(str2.split(",")).contains(str);
    }

    public final boolean zzY(String str) {
        zzg();
        zzic zzicVar = this.zzu;
        if (Wrappers.packageManager(zzicVar.zzaY()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzicVar.zzaV().zzj().zzb("Permission not granted", str);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean zza() {
        return true;
    }

    public final boolean zzaa(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        zzic zzicVar = this.zzu;
        String strZzA = zzicVar.zzc().zzA();
        zzicVar.zzaU();
        return strZzA.equals(str);
    }

    public final Bundle zzab(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objZzE = zzE(str2, bundle.get(str2));
                if (objZzE == null) {
                    zzic zzicVar = this.zzu;
                    zzicVar.zzaV().zzh().zzb("Param value can't be null", zzicVar.zzl().zzb(str2));
                } else {
                    zzM(bundle2, str2, objZzE);
                }
            }
        }
        return bundle2;
    }

    public final zzbg zzac(String str, String str2, Bundle bundle, String str3, long j8, boolean z14, boolean z15) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzn(str2) != 0) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaV().zzb().zzb("Invalid conditional property event name", zzicVar.zzl().zzc(str2));
            h.w();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleZzF = zzF(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        if (z14) {
            bundleZzF = zzab(bundleZzF, str);
        }
        Preconditions.checkNotNull(bundleZzF);
        return new zzbg(str2, new zzbe(bundleZzF), str3, j8);
    }

    public final boolean zzad(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e4) {
            this.zzu.zzaV().zzb().zzb("Package name not found", e4);
            return true;
        } catch (CertificateException e14) {
            this.zzu.zzaV().zzb().zzb("Error obtaining certificate", e14);
            return true;
        }
    }

    public final byte[] zzae(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public final boolean zzag(int i14, boolean z14) {
        Boolean boolZzJ = this.zzu.zzt().zzJ();
        if (zzah() < i14 / 1000) {
            return (boolZzJ == null || boolZzJ.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int zzah() {
        if (this.zzi == null) {
            this.zzi = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzu.zzaY()) / 1000);
        }
        return this.zzi.intValue();
    }

    public final int zzai(int i14) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzu.zzaY(), 12451000);
    }

    public final long zzaj(long j8, long j14) {
        return ((j14 * 60000) + j8) / 86400000;
    }

    public final void zzak(Bundle bundle, long j8) {
        long j14 = bundle.getLong("_et");
        if (j14 != 0) {
            this.zzu.zzaV().zze().zzb("Params already contained engagement", Long.valueOf(j14));
        } else {
            j14 = 0;
        }
        bundle.putLong("_et", j8 + j14);
    }

    public final void zzal(com.google.android.gms.internal.measurement.zzcu zzcuVar, String str) {
        try {
            zzcuVar.zzb(i.d(JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, str));
        } catch (RemoteException e4) {
            this.zzu.zzaV().zze().zzb("Error returning string value to wrapper", e4);
        }
    }

    public final void zzam(com.google.android.gms.internal.measurement.zzcu zzcuVar, long j8) {
        Bundle bundle = new Bundle();
        bundle.putLong(JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, j8);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzaV().zze().zzb("Error returning long value to wrapper", e4);
        }
    }

    public final void zzan(com.google.android.gms.internal.measurement.zzcu zzcuVar, int i14) {
        try {
            zzcuVar.zzb(j.e(i14, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR));
        } catch (RemoteException e4) {
            this.zzu.zzaV().zze().zzb("Error returning int value to wrapper", e4);
        }
    }

    public final void zzao(com.google.android.gms.internal.measurement.zzcu zzcuVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, bArr);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzaV().zze().zzb("Error returning byte array to wrapper", e4);
        }
    }

    public final void zzap(com.google.android.gms.internal.measurement.zzcu zzcuVar, boolean z14) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, z14);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzaV().zze().zzb("Error returning boolean value to wrapper", e4);
        }
    }

    public final void zzaq(com.google.android.gms.internal.measurement.zzcu zzcuVar, Bundle bundle) {
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzaV().zze().zzb("Error returning bundle value to wrapper", e4);
        }
    }

    public final void zzar(com.google.android.gms.internal.measurement.zzcu zzcuVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, arrayList);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e4) {
            this.zzu.zzaV().zze().zzb("Error returning bundle list to wrapper", e4);
        }
    }

    public final URL zzat(long j8, String str, String str2, long j14, String str3) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + zzah()) + "&rdid=" + str2 + "&bundleid=" + str + "&retry=" + j14;
            if (str.equals(this.zzu.zzc().zzB())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e4) {
            e = e4;
            this.zzu.zzaV().zzb().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e14) {
            e = e14;
            this.zzu.zzaV().zzb().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final String zzaw() {
        byte[] bArr = new byte[16];
        zzf().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final void zzba() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                com.google.android.gms.internal.measurement.a.q(this.zzu, "Utils falling back to Random for random id");
            }
        }
        this.zze.set(jNextLong);
    }

    public final long zzd() {
        long andIncrement;
        long j8;
        AtomicLong atomicLong = this.zze;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.zze;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNextLong = new Random(System.nanoTime() ^ this.zzu.zzaZ().currentTimeMillis()).nextLong();
            int i14 = this.zzf + 1;
            this.zzf = i14;
            j8 = jNextLong + ((long) i14);
        }
        return j8;
    }

    public final SecureRandom zzf() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new SecureRandom();
        }
        return this.zzd;
    }

    public final Bundle zzi(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString(FirebaseAnalytics.Param.CONTENT, queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString(FirebaseAnalytics.Param.SOURCE_PLATFORM, queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString(FirebaseAnalytics.Param.CREATIVE_FORMAT, queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString(FirebaseAnalytics.Param.MARKETING_TACTIC, queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("sfmc_id", queryParameter9);
            }
            for (String str : uri.getQueryParameterNames()) {
                if (str.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str, queryParameter19);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e4) {
            this.zzu.zzaV().zze().zzb("Install referrer url isn't a hierarchical URI", e4);
            return null;
        }
    }

    public final boolean zzj(String str, String str2) {
        if (str2 == null) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.zzu.zzaV().zzd().zzc("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.zzu.zzaV().zzd().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean zzk(String str, String str2) {
        if (str2 == null) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.zzu.zzaV().zzd().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.zzu.zzaV().zzd().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean zzl(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = zzb;
        for (int i14 = 0; i14 < 3; i14++) {
            if (str2.startsWith(strArr3[i14])) {
                this.zzu.zzaV().zzd().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzaA(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zzaA(str2, strArr2)) {
            return true;
        }
        this.zzu.zzaV().zzd().zzc("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean zzm(String str, int i14, String str2) {
        if (str2 == null) {
            this.zzu.zzaV().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i14) {
            return true;
        }
        this.zzu.zzaV().zzd().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i14), str2);
        return false;
    }

    public final int zzn(String str) {
        if (!zzk("event", str)) {
            return 2;
        }
        if (!zzl("event", zzjm.zza, zzjm.zzb, str)) {
            return 13;
        }
        this.zzu.zzc();
        return !zzm("event", 40, str) ? 2 : 0;
    }

    public final int zzp(String str) {
        if (!zzk("user property", str)) {
            return 6;
        }
        if (!zzl("user property", zzjo.zza, null, str)) {
            return 15;
        }
        this.zzu.zzc();
        return !zzm("user property", 24, str) ? 6 : 0;
    }

    public final int zzq(String str) {
        if (!zzj("event param", str)) {
            return 3;
        }
        if (!zzl("event param", null, null, str)) {
            return 14;
        }
        this.zzu.zzc();
        return !zzm("event param", 40, str) ? 3 : 0;
    }

    public final int zzs(String str) {
        if (!zzk("event param", str)) {
            return 3;
        }
        if (!zzl("event param", null, null, str)) {
            return 14;
        }
        this.zzu.zzc();
        return !zzm("event param", 40, str) ? 3 : 0;
    }

    public final boolean zzt(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean zzu(String str, String str2, int i14, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i14) {
                this.zzu.zzaV().zzh().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    public final void zzz(String str, String str2, String str3, Bundle bundle, List list, boolean z14) {
        int iZzq;
        String str4;
        int iZzD;
        list = list;
        if (bundle == null) {
            return;
        }
        zzic zzicVar = this.zzu;
        int i14 = true != zzicVar.zzc().zzu.zzk().zzag(231100000, true) ? 0 : 35;
        int i15 = 0;
        boolean z15 = false;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                iZzq = !z14 ? zzq(str5) : 0;
                if (iZzq == 0) {
                    iZzq = zzs(str5);
                }
            } else {
                iZzq = 0;
            }
            if (iZzq != 0) {
                zzJ(bundle, iZzq, str5, iZzq == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (zzt(bundle.get(str5))) {
                    zzicVar.zzaV().zzh().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iZzD = 22;
                    str4 = null;
                } else {
                    str4 = null;
                    iZzD = zzD(str, str2, str5, bundle.get(str5), bundle, list, z14, false);
                }
                if (iZzD != 0 && !"_ev".equals(str5)) {
                    zzJ(bundle, iZzD, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (zzh(str5) && !zzaA(str5, zzjn.zzd)) {
                    i15++;
                    if (!zzag(231100000, true)) {
                        zzicVar.zzaV().zzd().zzc("Item array not supported on client's version of Google Play Services (Android Only)", zzicVar.zzl().zza(str2), zzicVar.zzl().zze(bundle));
                        zzax(bundle, 23);
                        bundle.remove(str5);
                    } else if (i15 > i14) {
                        if (!zzicVar.zzc().zzp(str4, zzfy.zzbe) || !z15) {
                            zzicVar.zzaV().zzd().zzc(u0.k(new StringBuilder(String.valueOf(i14).length() + 55), "Item can't contain more than ", i14, " item-scoped custom params"), zzicVar.zzl().zza(str2), zzicVar.zzl().zze(bundle));
                        }
                        zzax(bundle, 28);
                        bundle.remove(str5);
                        z15 = true;
                    }
                }
            }
        }
    }
}
