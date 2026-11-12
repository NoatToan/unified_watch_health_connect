package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class zzlj extends zzg {
    protected zzky zza;
    final zzx zzb;
    protected boolean zzc;
    private zzjp zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private boolean zzi;
    private int zzj;
    private zzay zzk;
    private zzay zzl;
    private PriorityQueue zzm;
    private boolean zzn;
    private zzjl zzo;
    private final AtomicLong zzp;
    private long zzq;
    private zzay zzr;
    private SharedPreferences.OnSharedPreferenceChangeListener zzs;
    private zzay zzt;
    private final zzpo zzv;

    public zzlj(zzic zzicVar) {
        super(zzicVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzi = false;
        this.zzj = 1;
        this.zzc = true;
        this.zzv = new zzkn(this);
        this.zzg = new AtomicReference();
        this.zzo = zzjl.zza;
        this.zzq = -1L;
        this.zzp = new AtomicLong(0L);
        this.zzb = new zzx(zzicVar);
    }

    private final zzlr zzar(final zzom zzomVar) {
        try {
            URL url = new URI(zzomVar.zzc).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strZzl = this.zzu.zzv().zzl();
            zzic zzicVar = this.zzu;
            zzgs zzgsVarZzk = zzicVar.zzaV().zzk();
            Long lValueOf = Long.valueOf(zzomVar.zza);
            zzgsVarZzk.zzd("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzomVar.zzc, Integer.valueOf(zzomVar.zzb.length));
            if (!TextUtils.isEmpty(zzomVar.zzg)) {
                zzicVar.zzaV().zzk().zzc("[sgtm] Uploading data from app. row_id", lValueOf, zzomVar.zzg);
            }
            HashMap map = new HashMap();
            Bundle bundle = zzomVar.zzd;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            zzlo zzloVarZzn = zzicVar.zzn();
            byte[] bArr = zzomVar.zzb;
            zzll zzllVar = new zzll() { // from class: com.google.android.gms.measurement.internal.zzkz
                /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r8
                  0x002e: PHI (r8v7 int) = (r8v1 int), (r8v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:13:0x0064  */
                /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                @Override // com.google.android.gms.measurement.internal.zzll
                public final /* synthetic */ void zza(String str2, int i14, Throwable th3, byte[] bArr2, Map map2) {
                    zzlr zzlrVar;
                    zzlj zzljVar = this.zza;
                    zzljVar.zzg();
                    zzom zzomVar2 = zzomVar;
                    if (i14 == 200 || i14 == 204) {
                        if (th3 == null) {
                            zzljVar.zzu.zzaV().zzk().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.zza));
                            zzlrVar = zzlr.SUCCESS;
                        } else {
                            zzljVar.zzu.zzaV().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i14), th3);
                            if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i14))) {
                                zzlrVar = zzlr.BACKOFF;
                            } else {
                                zzlrVar = zzlr.FAILURE;
                            }
                        }
                    } else if (i14 == 304) {
                        i14 = 304;
                        if (th3 == null) {
                            zzljVar.zzu.zzaV().zzk().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.zza));
                            zzlrVar = zzlr.SUCCESS;
                        } else {
                            zzljVar.zzu.zzaV().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i14), th3);
                            if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i14))) {
                                zzlrVar = zzlr.BACKOFF;
                            } else {
                                zzlrVar = zzlr.FAILURE;
                            }
                        }
                    } else {
                        zzljVar.zzu.zzaV().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i14), th3);
                        if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i14))) {
                            zzlrVar = zzlr.BACKOFF;
                        } else {
                            zzlrVar = zzlr.FAILURE;
                        }
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    zznl zznlVarZzt = zzljVar.zzu.zzt();
                    long j8 = zzomVar2.zza;
                    zznlVarZzt.zzy(new zzaf(j8, zzlrVar.zza(), zzomVar2.zzf));
                    zzljVar.zzu.zzaV().zzk().zzc("[sgtm] Updated status for row_id", Long.valueOf(j8), zzlrVar);
                    synchronized (atomicReference2) {
                        atomicReference2.set(zzlrVar);
                        atomicReference2.notifyAll();
                    }
                }
            };
            zzloVarZzn.zzw();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(bArr);
            Preconditions.checkNotNull(zzllVar);
            zzloVarZzn.zzu.zzaW().zzm(new zzln(zzloVarZzn, strZzl, url, bArr, map, zzllVar));
            try {
                zzic zzicVar2 = zzicVar.zzk().zzu;
                long jCurrentTimeMillis = zzicVar2.zzaZ().currentTimeMillis() + 60000;
                synchronized (atomicReference) {
                    for (long jCurrentTimeMillis2 = 60000; atomicReference.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - zzicVar2.zzaZ().currentTimeMillis()) {
                        try {
                            atomicReference.wait(jCurrentTimeMillis2);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                a.q(this.zzu, "[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? zzlr.UNKNOWN : (zzlr) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e4) {
            this.zzu.zzaV().zzb().zzd("[sgtm] Bad upload url for row_id", zzomVar.zzc, Long.valueOf(zzomVar.zza), e4);
            return zzlr.FAILURE;
        }
    }

    private final void zzas(Boolean bool, boolean z14) {
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzj().zzb("Setting app measurement enabled (FE)", bool);
        zzicVar.zzd().zzh(bool);
        if (z14) {
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzic zzicVar2 = zzhhVarZzd.zzu;
            zzhhVarZzd.zzg();
            SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.zzu.zzE() || !(bool == null || bool.booleanValue())) {
            zzal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzat, reason: merged with bridge method [inline-methods] */
    public final void zzal() {
        zzlj zzljVar;
        zzg();
        zzic zzicVar = this.zzu;
        String strZza = zzicVar.zzd().zzh.zza();
        if (strZza == null) {
            zzljVar = this;
        } else if ("unset".equals(strZza)) {
            zzljVar = this;
            zzljVar.zzN("app", "_npa", null, zzicVar.zzaZ().currentTimeMillis());
        } else {
            zzN("app", "_npa", Long.valueOf(true != BooleanUtils.TRUE.equals(strZza) ? 0L : 1L), zzicVar.zzaZ().currentTimeMillis());
            zzljVar = this;
        }
        if (!zzljVar.zzu.zzB() || !zzljVar.zzc) {
            zzicVar.zzaV().zzj().zza("Updating Scion state (FE)");
            zzljVar.zzu.zzt().zzi();
        } else {
            zzicVar.zzaV().zzj().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzU();
            zzljVar.zzu.zzh().zza.zza();
            zzicVar.zzaW().zzj(new zzjz(this));
        }
    }

    public final void zzA(zzjl zzjlVar) {
        zzg();
        boolean z14 = (zzjlVar.zzo(zzjk.ANALYTICS_STORAGE) && zzjlVar.zzo(zzjk.AD_STORAGE)) || this.zzu.zzt().zzO();
        zzic zzicVar = this.zzu;
        if (z14 != zzicVar.zzE()) {
            zzicVar.zzD(z14);
            zzhh zzhhVarZzd = this.zzu.zzd();
            zzic zzicVar2 = zzhhVarZzd.zzu;
            zzhhVarZzd.zzg();
            Boolean boolValueOf = zzhhVarZzd.zzd().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzhhVarZzd.zzd().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z14 || boolValueOf == null || boolValueOf.booleanValue()) {
                zzas(Boolean.valueOf(z14), false);
            }
        }
    }

    public final void zzB(String str, String str2, Bundle bundle) {
        zzC(str, str2, bundle, true, true, this.zzu.zzaZ().currentTimeMillis());
    }

    public final void zzC(String str, String str2, Bundle bundle, boolean z14, boolean z15, long j8) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            this.zzu.zzs().zzj(bundle2, j8);
            return;
        }
        boolean z16 = true;
        if (z15 && this.zzd != null && !zzpp.zzZ(str2)) {
            z16 = false;
        }
        boolean z17 = z16;
        if (str == null) {
            str = "app";
        }
        zzJ(str, str2, j8, bundle2, z15, z17, z14, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzD() {
        zzod zzodVar;
        zzod zzodVar2;
        com.google.android.gms.internal.measurement.zzkq zzkqVar;
        zzg();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzj().zza("Handle tcf update.");
        SharedPreferences sharedPreferencesZze = zzicVar.zzd().zze();
        HashMap map = new HashMap();
        zzfx zzfxVar = zzfy.zzaZ;
        if (((Boolean) zzfxVar.zzb(null)).booleanValue()) {
            int i14 = zzof.zzb;
            com.google.android.gms.internal.measurement.zzkp zzkpVar = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            zzoe zzoeVar = zzoe.CONSENT;
            int i15 = 2;
            Objects.requireNonNull(zzkpVar);
            Objects.requireNonNull(zzoeVar);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(zzkpVar, zzoeVar);
            com.google.android.gms.internal.measurement.zzkp zzkpVar2 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            int i16 = 1;
            zzoe zzoeVar2 = zzoe.FLEXIBLE_LEGITIMATE_INTEREST;
            Objects.requireNonNull(zzkpVar2);
            Objects.requireNonNull(zzoeVar2);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(zzkpVar2, zzoeVar2);
            com.google.android.gms.internal.measurement.zzkp zzkpVar3 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            Objects.requireNonNull(zzkpVar3);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(zzkpVar3, zzoeVar);
            com.google.android.gms.internal.measurement.zzkp zzkpVar4 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            Objects.requireNonNull(zzkpVar4);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(zzkpVar4, zzoeVar);
            com.google.android.gms.internal.measurement.zzkp zzkpVar5 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            Objects.requireNonNull(zzkpVar5);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry5 = new AbstractMap.SimpleImmutableEntry(zzkpVar5, zzoeVar2);
            com.google.android.gms.internal.measurement.zzkp zzkpVar6 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS;
            Objects.requireNonNull(zzkpVar6);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry6 = new AbstractMap.SimpleImmutableEntry(zzkpVar6, zzoeVar2);
            com.google.android.gms.internal.measurement.zzkp zzkpVar7 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS;
            Objects.requireNonNull(zzkpVar7);
            ImmutableMap immutableMapOfEntries = ImmutableMap.ofEntries(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, simpleImmutableEntry5, simpleImmutableEntry6, new AbstractMap.SimpleImmutableEntry(zzkpVar7, zzoeVar2));
            ImmutableSet immutableSetOf = ImmutableSet.of("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesZze.contains("IABTCF_TCString");
            int iZzb = zzof.zzb(sharedPreferencesZze, "IABTCF_CmpSdkID");
            int iZzb2 = zzof.zzb(sharedPreferencesZze, "IABTCF_PolicyVersion");
            int iZzb3 = zzof.zzb(sharedPreferencesZze, "IABTCF_gdprApplies");
            int iZzb4 = zzof.zzb(sharedPreferencesZze, "IABTCF_PurposeOneTreatment");
            int iZzb5 = zzof.zzb(sharedPreferencesZze, "IABTCF_EnableAdvertiserConsentMode");
            String strZza = zzof.zza(sharedPreferencesZze, "IABTCF_PublisherCC");
            ImmutableMap.Builder builder = ImmutableMap.builder();
            UnmodifiableIterator it = immutableMapOfEntries.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzkp zzkpVar8 = (com.google.android.gms.internal.measurement.zzkp) it.next();
                int iZza = zzkpVar8.zza();
                StringBuilder sb3 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb3.append("IABTCF_PublisherRestrictions");
                sb3.append(iZza);
                String strZza2 = zzof.zza(sharedPreferencesZze, sb3.toString());
                if (TextUtils.isEmpty(strZza2) || strZza2.length() < 755) {
                    zzkqVar = com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strZza2.charAt(754), 10);
                    if (iDigit < 0 || iDigit > com.google.android.gms.internal.measurement.zzkq.values().length || iDigit == 0) {
                        zzkqVar = com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    } else if (iDigit != i16) {
                        zzkqVar = iDigit != i15 ? com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    } else {
                        zzkqVar = com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    }
                }
                builder.put(zzkpVar8, zzkqVar);
                i15 = 2;
                i16 = 1;
            }
            ImmutableMap immutableMapBuildOrThrow = builder.buildOrThrow();
            String strZza3 = zzof.zza(sharedPreferencesZze, "IABTCF_PurposeConsents");
            String strZza4 = zzof.zza(sharedPreferencesZze, "IABTCF_VendorConsents");
            boolean z14 = !TextUtils.isEmpty(strZza4) && strZza4.length() >= 755 && strZza4.charAt(754) == '1';
            String strZza5 = zzof.zza(sharedPreferencesZze, "IABTCF_PurposeLegitimateInterests");
            String strZza6 = zzof.zza(sharedPreferencesZze, "IABTCF_VendorLegitimateInterests");
            boolean z15 = !TextUtils.isEmpty(strZza6) && strZza6.length() >= 755 && strZza6.charAt(754) == '1';
            cArr[0] = '2';
            zzodVar = new zzod(zzof.zzd(immutableMapOfEntries, immutableMapBuildOrThrow, immutableSetOf, cArr, iZzb, iZzb5, iZzb3, iZzb2, iZzb4, strZza, strZza3, strZza5, z14, z15, zContains));
        } else {
            String strZza7 = zzof.zza(sharedPreferencesZze, "IABTCF_VendorConsents");
            if (!"".equals(strZza7) && strZza7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strZza7.charAt(754)));
            }
            int iZzb6 = zzof.zzb(sharedPreferencesZze, "IABTCF_gdprApplies");
            if (iZzb6 != -1) {
                map.put("gdprApplies", String.valueOf(iZzb6));
            }
            int iZzb7 = zzof.zzb(sharedPreferencesZze, "IABTCF_EnableAdvertiserConsentMode");
            if (iZzb7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iZzb7));
            }
            int iZzb8 = zzof.zzb(sharedPreferencesZze, "IABTCF_PolicyVersion");
            if (iZzb8 != -1) {
                map.put("PolicyVersion", String.valueOf(iZzb8));
            }
            String strZza8 = zzof.zza(sharedPreferencesZze, "IABTCF_PurposeConsents");
            if (!"".equals(strZza8)) {
                map.put("PurposeConsents", strZza8);
            }
            int iZzb9 = zzof.zzb(sharedPreferencesZze, "IABTCF_CmpSdkID");
            if (iZzb9 != -1) {
                map.put("CmpSdkID", String.valueOf(iZzb9));
            }
            zzodVar = new zzod(map);
        }
        zzicVar.zzaV().zzk().zzb("Tcf preferences read", zzodVar);
        if (!zzicVar.zzc().zzp(null, zzfxVar)) {
            if (zzicVar.zzd().zzm(zzodVar)) {
                Bundle bundleZzb = zzodVar.zzb();
                zzicVar.zzaV().zzk().zzb("Consent generated from Tcf", bundleZzb);
                if (bundleZzb != Bundle.EMPTY) {
                    zzp(bundleZzb, -30, zzicVar.zzaZ().currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", zzodVar.zze());
                zzF(TtmlNode.TEXT_EMPHASIS_AUTO, "_tcf", bundle);
                return;
            }
            return;
        }
        zzhh zzhhVarZzd = zzicVar.zzd();
        zzhhVarZzd.zzg();
        String string = zzhhVarZzd.zzd().getString("stored_tcf_param", "");
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            zzodVar2 = new zzod(map2);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && zzof.zza.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            zzodVar2 = new zzod(map2);
        }
        if (zzicVar.zzd().zzm(zzodVar)) {
            Bundle bundleZzb2 = zzodVar.zzb();
            zzicVar.zzaV().zzk().zzb("Consent generated from Tcf", bundleZzb2);
            if (bundleZzb2 != Bundle.EMPTY) {
                zzp(bundleZzb2, -30, zzicVar.zzaZ().currentTimeMillis());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", zzodVar.zzd(zzodVar2));
            bundle2.putString("_tcfd2", zzodVar.zzc());
            bundle2.putString("_tcfd", zzodVar.zze());
            zzF(TtmlNode.TEXT_EMPHASIS_AUTO, "_tcf", bundle2);
        }
    }

    public final void zzE() {
        zzg();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzj().zza("Register tcfPrefChangeListener.");
        if (this.zzs == null) {
            this.zzt = new zzkb(this, this.zzu);
            this.zzs = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.zza.zzag(sharedPreferences, str);
                }
            };
        }
        zzicVar.zzd().zze().registerOnSharedPreferenceChangeListener(this.zzs);
    }

    public final void zzF(String str, String str2, Bundle bundle) {
        zzg();
        zzG(str, str2, this.zzu.zzaZ().currentTimeMillis(), bundle);
    }

    public final void zzG(String str, String str2, long j8, Bundle bundle) {
        zzg();
        boolean z14 = true;
        if (this.zzd != null && !zzpp.zzZ(str2)) {
            z14 = false;
        }
        zzH(str, str2, j8, bundle, true, z14, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzH(String str, String str2, long j8, Bundle bundle, boolean z14, boolean z15, boolean z16, String str3) {
        boolean z17;
        int i14;
        zzic zzicVar;
        long j14;
        long j15;
        String str4;
        long j16;
        Bundle[] bundleArr;
        String str5 = str;
        Preconditions.checkNotEmpty(str5);
        Preconditions.checkNotNull(bundle);
        zzg();
        zzb();
        zzic zzicVar2 = this.zzu;
        boolean zZzB = zzicVar2.zzB();
        zzic zzicVar3 = this.zzu;
        if (!zZzB) {
            zzicVar3.zzaV().zzj().zza("Event not sent since app measurement is disabled");
            return;
        }
        List listZzp = zzicVar3.zzv().zzp();
        if (listZzp != null && !listZzp.contains(str2)) {
            this.zzu.zzaV().zzj().zzc("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!zzicVar2.zzp() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzu.zzaY().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzu.zzaY());
                } catch (Exception e4) {
                    this.zzu.zzaV().zze().zzb("Failed to invoke Tag Manager's initialize() method", e4);
                }
            } catch (ClassNotFoundException unused) {
                this.zzu.zzaV().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        zzic zzicVar4 = this.zzu;
        if (!zzicVar4.zzc().zzp(null, zzfy.zzbf) && Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2) && bundle.containsKey("gclid")) {
            zzicVar4.zzaU();
            zzN(TtmlNode.TEXT_EMPHASIS_AUTO, "_lgclid", bundle.getString("gclid"), zzicVar4.zzaZ().currentTimeMillis());
        }
        zzlj zzljVar = this;
        zzicVar4.zzaU();
        if (z14 && zzpp.zzaf(str2)) {
            zzicVar4.zzk().zzI(bundle, zzicVar4.zzd().zzt.zza());
        }
        if (!z16) {
            zzicVar4.zzaU();
            if (!"_iap".equals(str2)) {
                zzic zzicVar5 = zzljVar.zzu;
                zzpp zzppVarZzk = zzicVar5.zzk();
                int i15 = 2;
                if (zzppVarZzk.zzj("event", str2)) {
                    if (zzppVarZzk.zzl("event", zzjm.zza, zzjm.zzb, str2)) {
                        zzppVarZzk.zzu.zzc();
                        if (zzppVarZzk.zzm("event", 40, str2)) {
                            i15 = 0;
                        }
                    } else {
                        i15 = 13;
                    }
                }
                if (i15 != 0) {
                    zzicVar4.zzaV().zzd().zzb("Invalid public event name. Event will not be logged (FE)", zzicVar4.zzl().zza(str2));
                    zzpp zzppVarZzk2 = zzicVar5.zzk();
                    zzicVar5.zzc();
                    zzicVar5.zzk().zzN(zzljVar.zzv, null, i15, "_ev", zzppVarZzk2.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzicVar4.zzaU();
        zzic zzicVar6 = zzljVar.zzu;
        zzlu zzluVarZzh = zzicVar6.zzs().zzh(false);
        if (zzluVarZzh != null && !bundle.containsKey("_sc")) {
            zzluVarZzh.zzd = true;
        }
        zzpp.zzav(zzluVarZzh, bundle, z14 && !z16);
        boolean zEquals = "am".equals(str5);
        boolean zZzZ = zzpp.zzZ(str2);
        if (!z14 || zzljVar.zzd == null || zZzZ) {
            z17 = zEquals;
        } else {
            if (!zEquals) {
                zzicVar4.zzaV().zzj().zzc("Passing event to registered event handler (FE)", zzicVar4.zzl().zza(str2), zzicVar4.zzl().zze(bundle));
                Preconditions.checkNotNull(zzljVar.zzd);
                zzljVar.zzd.interceptEvent(str5, str2, bundle, j8);
                return;
            }
            z17 = true;
        }
        zzic zzicVar7 = zzljVar.zzu;
        if (zzicVar7.zzH()) {
            int iZzn = zzicVar4.zzk().zzn(str2);
            if (iZzn != 0) {
                zzicVar4.zzaV().zzd().zzb("Invalid event name. Event will not be logged (FE)", zzicVar4.zzl().zza(str2));
                zzpp zzppVarZzk3 = zzicVar4.zzk();
                zzicVar4.zzc();
                zzicVar7.zzk().zzN(zzljVar.zzv, str3, iZzn, "_ev", zzppVarZzk3.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleZzF = zzicVar4.zzk().zzF(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z16);
            Preconditions.checkNotNull(bundleZzF);
            zzicVar4.zzaU();
            if (zzicVar6.zzs().zzh(false) == null || !"_ae".equals(str2)) {
                i14 = 0;
                zzicVar = zzicVar6;
                j14 = 0;
            } else {
                zzoa zzoaVar = zzicVar6.zzh().zzb;
                j14 = 0;
                long jElapsedRealtime = zzoaVar.zzc.zzu.zzaZ().elapsedRealtime();
                i14 = 0;
                zzicVar = zzicVar6;
                long j17 = jElapsedRealtime - zzoaVar.zzb;
                zzoaVar.zzb = jElapsedRealtime;
                if (j17 > 0) {
                    zzicVar4.zzk().zzak(bundleZzF, j17);
                }
            }
            if (!TtmlNode.TEXT_EMPHASIS_AUTO.equals(str5) && "_ssr".equals(str2)) {
                zzpp zzppVarZzk4 = zzicVar4.zzk();
                String string = bundleZzF.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                zzic zzicVar8 = zzppVarZzk4.zzu;
                if (Objects.equals(string, zzicVar8.zzd().zzq.zza())) {
                    zzicVar8.zzaV().zzj().zza("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                zzicVar8.zzd().zzq.zzb(string);
            } else if ("_ae".equals(str2)) {
                String strZza = zzicVar4.zzk().zzu.zzd().zzq.zza();
                if (!TextUtils.isEmpty(strZza)) {
                    bundleZzF.putString("_ffr", strZza);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleZzF);
            boolean zZzi = zzicVar4.zzc().zzp(null, zzfy.zzaU) ? zzicVar.zzh().zzi() : zzicVar4.zzd().zzn.zza();
            if (zzicVar4.zzd().zzk.zza() > j14 && zzicVar4.zzd().zzp(j8) && zZzi) {
                zzicVar4.zzaV().zzk().zza("Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                j15 = j14;
                zzN(TtmlNode.TEXT_EMPHASIS_AUTO, "_sid", null, zzicVar4.zzaZ().currentTimeMillis());
                zzN(TtmlNode.TEXT_EMPHASIS_AUTO, "_sno", null, zzicVar4.zzaZ().currentTimeMillis());
                zzN(TtmlNode.TEXT_EMPHASIS_AUTO, "_se", null, zzicVar4.zzaZ().currentTimeMillis());
                zzljVar = this;
                zzicVar4.zzd().zzl.zzb(j15);
            } else {
                j15 = j14;
                str4 = "_ae";
            }
            if (bundleZzF.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j15) == 1) {
                zzicVar4.zzaV().zzk().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j16 = j8;
                zzicVar7.zzh().zza.zzb(j16, true);
            } else {
                j16 = j8;
            }
            ArrayList arrayList2 = new ArrayList(bundleZzF.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i16 = i14; i16 < size; i16++) {
                String str6 = (String) arrayList2.get(i16);
                if (str6 != null) {
                    zzicVar4.zzk();
                    Object obj = bundleZzF.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i14] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleZzF.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i17 = i14;
            while (i17 < arrayList.size()) {
                Bundle bundleZzab = (Bundle) arrayList.get(i17);
                String str7 = i17 != 0 ? "_ep" : str2;
                bundleZzab.putString("_o", str5);
                if (z15) {
                    bundleZzab = zzicVar4.zzk().zzab(bundleZzab, null);
                }
                Bundle bundle2 = bundleZzab;
                zzicVar.zzt().zzn(new zzbg(str7, new zzbe(bundle2), str5, j16), str3);
                if (!z17) {
                    Iterator it = zzljVar.zze.iterator();
                    while (it.hasNext()) {
                        ((zzjq) it.next()).onEvent(str, str2, new Bundle(bundle2), j8);
                    }
                }
                i17++;
                str5 = str;
                j16 = j8;
            }
            zzicVar4.zzaU();
            if (zzicVar.zzs().zzh(i14) == null || !str4.equals(str2)) {
                return;
            }
            zzicVar.zzh().zzb.zzd(true, true, zzicVar4.zzaZ().elapsedRealtime());
        }
    }

    public final void zzI(String str, String str2, Bundle bundle, String str3) {
        zzic.zzL();
        zzJ(TtmlNode.TEXT_EMPHASIS_AUTO, str2, this.zzu.zzaZ().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void zzJ(String str, String str2, long j8, Bundle bundle, boolean z14, boolean z15, boolean z16, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i14 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i14 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i14];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i14] = new Bundle((Bundle) parcelable);
                        }
                        i14++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i14 < list.size()) {
                        Object obj2 = list.get(i14);
                        if (obj2 instanceof Bundle) {
                            list.set(i14, new Bundle((Bundle) obj2));
                        }
                        i14++;
                    }
                }
            }
        }
        this.zzu.zzaW().zzj(new zzkc(this, str, str2, j8, bundle2, z14, z15, z16, str3));
    }

    public final void zzK(String str, String str2, Object obj, boolean z14) {
        zzL(TtmlNode.TEXT_EMPHASIS_AUTO, "_ldl", obj, true, this.zzu.zzaZ().currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public final void zzL(String str, String str2, Object obj, boolean z14, long j8) {
        int i14;
        int iZzp;
        String str3;
        zzic zzicVar;
        int iZzK;
        Object objZzL;
        zzic zzicVar2 = this.zzu;
        if (!z14) {
            zzpp zzppVarZzk = zzicVar2.zzk();
            if (!zzppVarZzk.zzj("user property", str2)) {
                i14 = 6;
            } else if (zzppVarZzk.zzl("user property", zzjo.zza, null, str2)) {
                zzppVarZzk.zzu.zzc();
                if (zzppVarZzk.zzm("user property", 24, str2)) {
                    i14 = 0;
                } else {
                    i14 = 6;
                }
            } else {
                iZzp = 15;
            }
            if (i14 != 0) {
                zzic zzicVar3 = this.zzu;
                zzpp zzppVarZzk2 = zzicVar3.zzk();
                zzicVar3.zzc();
                this.zzu.zzk().zzN(this.zzv, null, i14, "_ev", zzppVarZzk2.zzC(str2, 24, true), str2 != null ? str2.length() : 0);
                return;
            }
            if (str == null) {
                str3 = "app";
            } else {
                str3 = str;
            }
            if (obj != null) {
                zzM(str3, str2, j8, null);
                return;
            }
            zzicVar = this.zzu;
            iZzK = zzicVar.zzk().zzK(str2, obj);
            if (iZzK != 0) {
                objZzL = zzicVar.zzk().zzL(str2, obj);
                if (objZzL != null) {
                    zzM(str3, str2, j8, objZzL);
                    return;
                }
                return;
            }
            zzpp zzppVarZzk3 = zzicVar.zzk();
            zzicVar.zzc();
            this.zzu.zzk().zzN(this.zzv, null, iZzK, "_ev", zzppVarZzk3.zzC(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
        }
        iZzp = zzicVar2.zzk().zzp(str2);
        i14 = iZzp;
        if (i14 != 0) {
            zzic zzicVar4 = this.zzu;
            zzpp zzppVarZzk4 = zzicVar4.zzk();
            zzicVar4.zzc();
            if (str2 != null) {
            }
            this.zzu.zzk().zzN(this.zzv, null, i14, "_ev", zzppVarZzk4.zzC(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            zzM(str3, str2, j8, null);
            return;
        }
        zzicVar = this.zzu;
        iZzK = zzicVar.zzk().zzK(str2, obj);
        if (iZzK != 0) {
            objZzL = zzicVar.zzk().zzL(str2, obj);
            if (objZzL != null) {
                zzM(str3, str2, j8, objZzL);
                return;
            }
            return;
        }
        zzpp zzppVarZzk5 = zzicVar.zzk();
        zzicVar.zzc();
        this.zzu.zzk().zzN(this.zzv, null, iZzK, "_ev", zzppVarZzk5.zzC(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
    }

    public final void zzM(String str, String str2, long j8, Object obj) {
        this.zzu.zzaW().zzj(new zzkd(this, str, str2, obj, j8));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    public final void zzN(String str, String str2, Object obj, long j8) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzb();
        Object obj2 = obj;
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String lowerCase = str3.toLowerCase(Locale.ENGLISH);
                    String str4 = BooleanUtils.FALSE;
                    long j14 = true != BooleanUtils.FALSE.equals(lowerCase) ? 0L : 1L;
                    zzic zzicVar = this.zzu;
                    Long lValueOf = Long.valueOf(j14);
                    zzhg zzhgVar = zzicVar.zzd().zzh;
                    if (lValueOf.longValue() == 1) {
                        str4 = BooleanUtils.TRUE;
                    }
                    zzhgVar.zzb(str4);
                    obj = lValueOf;
                } else if (obj == null) {
                    this.zzu.zzd().zzh.zzb("unset");
                    obj = obj;
                }
                str2 = "_npa";
            } else if (obj == null) {
                this.zzu.zzd().zzh.zzb("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.zzu.zzaV().zzk().zzc("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str5 = str2;
        Object obj3 = obj2;
        zzic zzicVar2 = this.zzu;
        if (!zzicVar2.zzB()) {
            this.zzu.zzaV().zzk().zza("User property not set since app measurement is disabled");
        } else if (zzicVar2.zzH()) {
            this.zzu.zzt().zzA(new zzpl(str5, j8, obj3, str));
        }
    }

    public final List zzO(boolean z14) {
        zzb();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzk().zza("Getting user properties (FE)");
        if (zzicVar.zzaW().zze()) {
            a.j(zzicVar, "Cannot get all user properties from analytics worker thread");
            return Collections.EMPTY_LIST;
        }
        zzicVar.zzaU();
        if (zzae.zza()) {
            a.j(zzicVar, "Cannot get all user properties from main thread");
            return Collections.EMPTY_LIST;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get user properties", new zzkf(this, atomicReference, z14));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzicVar.zzaV().zzb().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z14));
        return Collections.EMPTY_LIST;
    }

    public final Map zzP(String str, String str2, boolean z14) {
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaW().zze()) {
            a.j(zzicVar, "Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        zzicVar.zzaU();
        if (zzae.zza()) {
            a.j(zzicVar, "Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get user properties", new zzkl(this, atomicReference, null, str, str2, z14));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            zzicVar.zzaV().zzb().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z14));
            return Collections.EMPTY_MAP;
        }
        p1.a aVar = new p1.a(list.size());
        for (zzpl zzplVar : list) {
            Object objZza = zzplVar.zza();
            if (objZza != null) {
                aVar.put(zzplVar.zzb, objZza);
            }
        }
        return aVar;
    }

    public final String zzQ() {
        return (String) this.zzg.get();
    }

    public final void zzR(String str) {
        this.zzg.set(str);
    }

    public final void zzS() {
        zzg();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzd().zzo.zza()) {
            zzicVar.zzaV().zzj().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jZza = zzicVar.zzd().zzp.zza();
        zzicVar.zzd().zzp.zzb(1 + jZza);
        zzicVar.zzc();
        if (jZza >= 5) {
            zzicVar.zzaV().zze().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzicVar.zzd().zzo.zzb(true);
        } else {
            if (this.zzr == null) {
                this.zzr = new zzkg(this, this.zzu);
            }
            this.zzr.zzb(0L);
        }
    }

    public final void zzT(long j8) {
        this.zzg.set(null);
        this.zzu.zzaW().zzj(new zzkh(this, j8));
    }

    public final void zzU() {
        zzg();
        zzb();
        if (this.zzu.zzH()) {
            zzic zzicVar = this.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            zzalVarZzc.zzu.zzaU();
            Boolean boolZzr = zzalVarZzc.zzr("google_analytics_deferred_deep_link_enabled");
            if (boolZzr != null && boolZzr.booleanValue()) {
                zzicVar.zzaV().zzj().zza("Deferred Deep Link feature enabled.");
                zzicVar.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlh
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzS();
                    }
                });
            }
            this.zzu.zzt().zzE();
            this.zzc = false;
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzhhVarZzd.zzg();
            String string = zzhhVarZzd.zzd().getString("previous_os_version", null);
            zzhhVarZzd.zzu.zzu().zzw();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            zzicVar.zzu().zzw();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzF(TtmlNode.TEXT_EMPHASIS_AUTO, "_ou", bundle);
        }
    }

    public final void zzV(zzjp zzjpVar) {
        zzjp zzjpVar2;
        zzg();
        zzb();
        if (zzjpVar != null && zzjpVar != (zzjpVar2 = this.zzd)) {
            Preconditions.checkState(zzjpVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzjpVar;
    }

    public final void zzW(zzjq zzjqVar) {
        zzb();
        Preconditions.checkNotNull(zzjqVar);
        if (this.zze.add(zzjqVar)) {
            return;
        }
        a.q(this.zzu, "OnEventListener already registered");
    }

    public final void zzX(zzjq zzjqVar) {
        zzb();
        Preconditions.checkNotNull(zzjqVar);
        if (this.zze.remove(zzjqVar)) {
            return;
        }
        a.q(this.zzu, "OnEventListener had not been registered");
    }

    public final int zzY(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzu.zzc();
        return 25;
    }

    public final void zzZ(Bundle bundle) {
        zzaa(bundle, this.zzu.zzaZ().currentTimeMillis());
    }

    public final void zzaa(Bundle bundle, long j8) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            a.q(this.zzu, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzjh.zzb(bundle2, "app_id", String.class, null);
        zzjh.zzb(bundle2, "origin", String.class, null);
        zzjh.zzb(bundle2, "name", String.class, null);
        zzjh.zzb(bundle2, "value", Object.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j8);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        zzic zzicVar = this.zzu;
        if (zzicVar.zzk().zzp(string) != 0) {
            zzicVar.zzaV().zzb().zzb("Invalid conditional user property name", zzicVar.zzl().zzc(string));
            return;
        }
        if (zzicVar.zzk().zzK(string, obj) != 0) {
            zzicVar.zzaV().zzb().zzc("Invalid conditional user property value", zzicVar.zzl().zzc(string), obj);
            return;
        }
        Object objZzL = zzicVar.zzk().zzL(string, obj);
        if (objZzL == null) {
            zzicVar.zzaV().zzb().zzc("Unable to normalize conditional user property value", zzicVar.zzl().zzc(string), obj);
            return;
        }
        zzjh.zza(bundle2, objZzL);
        long j14 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            zzicVar.zzc();
            if (j14 > 15552000000L || j14 < 1) {
                zzicVar.zzaV().zzb().zzc("Invalid conditional user property timeout", zzicVar.zzl().zzc(string), Long.valueOf(j14));
                return;
            }
        }
        long j15 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        zzicVar.zzc();
        if (j15 > 15552000000L || j15 < 1) {
            zzicVar.zzaV().zzb().zzc("Invalid conditional user property time to live", zzicVar.zzl().zzc(string), Long.valueOf(j15));
        } else {
            zzicVar.zzaW().zzj(new zzki(this, bundle2));
        }
    }

    public final void zzab(String str, String str2, Bundle bundle) {
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzaZ().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzicVar.zzaW().zzj(new zzkj(this, bundle2));
    }

    public final ArrayList zzac(String str, String str2) {
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaW().zze()) {
            zzicVar.zzaV().zzb().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        zzicVar.zzaU();
        if (zzae.zza()) {
            zzicVar.zzaV().zzb().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get conditional user properties", new zzkk(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzpp.zzas(list);
        }
        zzicVar.zzaV().zzb().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String zzad() {
        zzlu zzluVarZzl = this.zzu.zzs().zzl();
        if (zzluVarZzl != null) {
            return zzluVarZzl.zza;
        }
        return null;
    }

    public final String zzae() {
        zzlu zzluVarZzl = this.zzu.zzs().zzl();
        if (zzluVarZzl != null) {
            return zzluVarZzl.zzb;
        }
        return null;
    }

    public final String zzaf() {
        try {
            return zzlt.zza(this.zzu.zzaY(), "google_app_id", this.zzu.zzq());
        } catch (IllegalStateException e4) {
            this.zzu.zzaV().zzb().zzb("getGoogleAppId failed with exception", e4);
            return null;
        }
    }

    public final /* synthetic */ void zzag(SharedPreferences sharedPreferences, String str) {
        zzic zzicVar = this.zzu;
        if (!zzicVar.zzc().zzp(null, zzfy.zzaZ)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                zzicVar.zzaV().zzk().zza("IABTCF_TCString change picked up in listener.");
                ((zzay) Preconditions.checkNotNull(this.zzt)).zzb(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            zzicVar.zzaV().zzk().zza("IABTCF_TCString change picked up in listener.");
            ((zzay) Preconditions.checkNotNull(this.zzt)).zzb(500L);
        }
    }

    public final /* synthetic */ void zzah(Bundle bundle) {
        Bundle bundle2;
        int i14;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            zzic zzicVar = this.zzu;
            bundle2 = new Bundle(zzicVar.zzd().zzt.zza());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i14 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (zzicVar.zzk().zzt(obj)) {
                        zzicVar.zzk().zzN(this.zzv, null, 27, null, null, 0);
                    }
                    zzicVar.zzaV().zzh().zzc("Invalid default event parameter type. Name, value", next, obj);
                } else if (zzpp.zzZ(next)) {
                    zzicVar.zzaV().zzh().zzb("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (zzicVar.zzk().zzu("param", next, zzicVar.zzc().zze(null, false), obj)) {
                    zzicVar.zzk().zzM(bundle2, next, obj);
                }
            }
            zzicVar.zzk();
            int iZzc = zzicVar.zzc().zzc();
            if (bundle2.size() > iZzc) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i14++;
                    if (i14 > iZzc) {
                        bundle2.remove(str);
                    }
                }
                zzicVar.zzk().zzN(this.zzv, null, 26, null, null, 0);
                zzicVar.zzaV().zzh().zza("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        zzic zzicVar2 = this.zzu;
        zzicVar2.zzd().zzt.zzb(bundle2);
        if (!bundle.isEmpty() || zzicVar2.zzc().zzp(null, zzfy.zzaW)) {
            this.zzu.zzt().zzH(bundle2);
        }
    }

    public final /* synthetic */ void zzai(int i14) {
        if (this.zzk == null) {
            this.zzk = new zzjx(this, this.zzu);
        }
        this.zzk.zzb(((long) i14) * 1000);
    }

    public final /* synthetic */ void zzaj(Boolean bool, boolean z14) {
        zzas(bool, true);
    }

    public final /* synthetic */ void zzak(zzjl zzjlVar, long j8, boolean z14, boolean z15) {
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        zzjl zzjlVarZzl = zzicVar.zzd().zzl();
        if (j8 <= this.zzq && zzjl.zzu(zzjlVarZzl.zzb(), zzjlVar.zzb())) {
            zzicVar.zzaV().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzjlVar);
            return;
        }
        zzhh zzhhVarZzd = zzicVar.zzd();
        zzic zzicVar2 = zzhhVarZzd.zzu;
        zzhhVarZzd.zzg();
        int iZzb = zzjlVar.zzb();
        if (!zzhhVarZzd.zzk(iZzb)) {
            zzicVar.zzaV().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzjlVar.zzb()));
            return;
        }
        zzic zzicVar3 = this.zzu;
        SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
        editorEdit.putString("consent_settings", zzjlVar.zzl());
        editorEdit.putInt("consent_source", iZzb);
        editorEdit.apply();
        zzicVar.zzaV().zzk().zzb("Setting storage consent(FE)", zzjlVar);
        this.zzq = j8;
        if (zzicVar3.zzt().zzP()) {
            zzicVar3.zzt().zzk(z14);
        } else {
            zzicVar3.zzt().zzj(z14);
        }
        if (z15) {
            zzicVar3.zzt().zzC(new AtomicReference());
        }
    }

    public final /* synthetic */ void zzam(boolean z14) {
        this.zzi = false;
    }

    public final /* synthetic */ int zzan() {
        return this.zzj;
    }

    public final /* synthetic */ void zzao(int i14) {
        this.zzj = i14;
    }

    public final /* synthetic */ zzay zzap() {
        return this.zzr;
    }

    public final /* synthetic */ int zzaq(Throwable th3) {
        String message = th3.getMessage();
        this.zzn = false;
        if (message == null) {
            return 2;
        }
        if (!(th3 instanceof IllegalStateException) && !message.contains("garbage collected") && !th3.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th3 instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.zzn = true;
        return 1;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final void zzh() {
        zzic zzicVar = this.zzu;
        if (!(zzicVar.zzaY().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) zzicVar.zzaY().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzu.zzaW().zzk(atomicReference, 15000L, "boolean test flag value", new zzke(this, atomicReference));
    }

    public final String zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzu.zzaW().zzk(atomicReference, 15000L, "String test flag value", new zzko(this, atomicReference));
    }

    public final Long zzk() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzu.zzaW().zzk(atomicReference, 15000L, "long test flag value", new zzkp(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzu.zzaW().zzk(atomicReference, 15000L, "int test flag value", new zzkq(this, atomicReference));
    }

    public final Double zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzu.zzaW().zzk(atomicReference, 15000L, "double test flag value", new zzkr(this, atomicReference));
    }

    public final void zzn(Boolean bool) {
        zzb();
        this.zzu.zzaW().zzj(new zzks(this, bool));
    }

    public final void zzp(Bundle bundle, int i14, long j8) {
        Object obj;
        String string;
        zzb();
        zzjl zzjlVar = zzjl.zza;
        zzjk[] zzjkVarArrZzb = zzjj.STORAGE.zzb();
        int length = zzjkVarArrZzb.length;
        int i15 = 0;
        while (true) {
            obj = null;
            if (i15 >= length) {
                break;
            }
            String str = zzjkVarArrZzb[i15].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i15++;
        }
        if (obj != null) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaV().zzh().zzb("Ignoring invalid consent setting", obj);
            zzicVar.zzaV().zzh().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean zZze = this.zzu.zzaW().zze();
        zzjl zzjlVarZze = zzjl.zze(bundle, i14);
        if (zzjlVarZze.zzc()) {
            zzs(zzjlVarZze, zZze);
        }
        zzaz zzazVarZzh = zzaz.zzh(bundle, i14);
        if (zzazVarZzh.zzd()) {
            zzq(zzazVarZzh, zZze);
        }
        Boolean boolZzi = zzaz.zzi(bundle);
        if (boolZzi != null) {
            String str2 = i14 == -30 ? "tcf" : "app";
            if (zZze) {
                zzN(str2, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolZzi.toString(), j8);
            } else {
                zzL(str2, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolZzi.toString(), false, j8);
            }
        }
    }

    public final void zzq(zzaz zzazVar, boolean z14) {
        zzkt zzktVar = new zzkt(this, zzazVar);
        if (!z14) {
            this.zzu.zzaW().zzj(zzktVar);
        } else {
            zzg();
            zzktVar.run();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void zzs(com.google.android.gms.measurement.internal.zzjl r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.zzs(com.google.android.gms.measurement.internal.zzjl, boolean):void");
    }

    public final void zzt(Runnable runnable) {
        zzb();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaW().zze()) {
            a.j(zzicVar, "Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (zzicVar.zzaW().zzf()) {
            a.j(zzicVar, "Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        zzicVar.zzaU();
        if (zzae.zza()) {
            a.j(zzicVar, "Cannot retrieve and upload batches from main thread");
            return;
        }
        zzicVar.zzaV().zzk().zza("[sgtm] Started client-side batch upload work.");
        boolean z14 = false;
        int size = 0;
        int i14 = 0;
        while (!z14) {
            zzicVar.zzaV().zzk().zza("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzicVar.zzaW().zzk(atomicReference, AbstractComponentTracker.LINGERING_TIMEOUT, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzli
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu.zzt().zzx(atomicReference, zzoo.zza(zzls.SGTM_CLIENT));
                }
            });
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.zza;
            if (!list.isEmpty()) {
                zzicVar.zzaV().zzk().zzb("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                size += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z14 = false;
                        break;
                    }
                    zzlr zzlrVarZzar = zzar((zzom) it.next());
                    if (zzlrVarZzar == zzlr.SUCCESS) {
                        i14++;
                    } else if (zzlrVarZzar == zzlr.BACKOFF) {
                        z14 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        zzicVar.zzaV().zzk().zzc("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i14));
        runnable.run();
    }

    public final void zzu(long j8) {
        zzg();
        if (this.zzl == null) {
            this.zzl = new zzju(this, this.zzu);
        }
        this.zzl.zzb(j8);
    }

    public final void zzv() {
        zzg();
        zzay zzayVar = this.zzl;
        if (zzayVar != null) {
            zzayVar.zzd();
        }
    }

    public final void zzw() {
        zzqp.zza();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzc().zzp(null, zzfy.zzaQ)) {
            if (zzicVar.zzaW().zze()) {
                a.j(zzicVar, "Cannot get trigger URIs from analytics worker thread");
                return;
            }
            zzicVar.zzaU();
            if (zzae.zza()) {
                a.j(zzicVar, "Cannot get trigger URIs from main thread");
                return;
            }
            zzb();
            zzicVar.zzaV().zzk().zza("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzicVar.zzaW().zzk(atomicReference, AbstractComponentTracker.LINGERING_TIMEOUT, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzla
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzlj zzljVar = this.zza;
                    zzljVar.zzu.zzt().zzw(atomicReference, zzljVar.zzu.zzd().zzi.zza());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzicVar.zzaV().zzd().zza("Timed out waiting for get trigger URIs");
            } else {
                zzicVar.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzlj zzljVar = this.zza;
                        zzljVar.zzg();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<zzoh> list2 = list;
                        SparseArray sparseArrayZzf = zzljVar.zzu.zzd().zzf();
                        for (zzoh zzohVar : list2) {
                            int i14 = zzohVar.zzc;
                            if (!sparseArrayZzf.contains(i14) || ((Long) sparseArrayZzf.get(i14)).longValue() < zzohVar.zzb) {
                                zzljVar.zzy().add(zzohVar);
                            }
                        }
                        zzljVar.zzz();
                    }
                });
            }
        }
    }

    public final boolean zzx() {
        return this.zzn;
    }

    @TargetApi(30)
    public final PriorityQueue zzy() {
        if (this.zzm == null) {
            this.zzm = new PriorityQueue(Comparator.comparing(zzlc.zza, zzld.zza));
        }
        return this.zzm;
    }

    @TargetApi(30)
    public final void zzz() {
        zzoh zzohVar;
        zzg();
        this.zzn = false;
        if (zzy().isEmpty() || this.zzi || (zzohVar = (zzoh) zzy().poll()) == null) {
            return;
        }
        zzic zzicVar = this.zzu;
        ed.a aVarZzT = zzicVar.zzk().zzT();
        if (aVarZzT != null) {
            this.zzi = true;
            zzgs zzgsVarZzk = zzicVar.zzaV().zzk();
            String str = zzohVar.zza;
            zzgsVarZzk.zzb("Registering trigger URI", str);
            ListenableFuture<Unit> listenableFutureB = aVarZzT.b(Uri.parse(str));
            if (listenableFutureB != null) {
                Futures.addCallback(listenableFutureB, new zzjw(this, zzohVar), new zzjv(this));
            } else {
                this.zzi = false;
                zzy().add(zzohVar);
            }
        }
    }
}
