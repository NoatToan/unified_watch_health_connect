package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.inject.Provider;
import com.google.mlkit.common.sdkinternal.ClientPriority;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class MultiFlavorDetectorCreator {
    private final Map zza = new HashMap();

    @KeepForSdk
    public interface DetectorCreator<DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> {
        @KeepForSdk
        DetectorT create(OptionsT optionst);
    }

    @KeepForSdk
    public interface DetectorOptions<DetectorT> {
    }

    @KeepForSdk
    public interface MultiFlavorDetector {
    }

    public MultiFlavorDetectorCreator(Set set) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Registration registration = (Registration) it.next();
            Class clsZzc = registration.zzc();
            if (!this.zza.containsKey(clsZzc) || registration.zza() >= ((Integer) Preconditions.checkNotNull((Integer) map.get(clsZzc))).intValue()) {
                this.zza.put(clsZzc, registration.zzb());
                map.put(clsZzc, Integer.valueOf(registration.zza()));
            }
        }
    }

    @KeepForSdk
    public static synchronized MultiFlavorDetectorCreator getInstance() {
        return (MultiFlavorDetectorCreator) MlKitContext.getInstance().get(MultiFlavorDetectorCreator.class);
    }

    @KeepForSdk
    public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> DetectorT create(OptionsT optionst) {
        return (DetectorT) ((DetectorCreator) ((Provider) Preconditions.checkNotNull((Provider) this.zza.get(optionst.getClass()))).get()).create(optionst);
    }

    @KeepForSdk
    public static class Registration {
        private final Class zza;
        private final Provider zzb;

        @ClientPriority
        private final int zzc;

        @KeepForSdk
        public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> Registration(Class<? extends OptionsT> cls, Provider<? extends DetectorCreator<DetectorT, OptionsT>> provider, @ClientPriority int i14) {
            this.zza = cls;
            this.zzb = provider;
            this.zzc = i14;
        }

        @ClientPriority
        public final int zza() {
            return this.zzc;
        }

        public final Provider zzb() {
            return this.zzb;
        }

        public final Class zzc() {
            return this.zza;
        }

        @KeepForSdk
        public <DetectorT extends MultiFlavorDetector, OptionsT extends DetectorOptions<DetectorT>> Registration(Class<? extends OptionsT> cls, Provider<? extends DetectorCreator<DetectorT, OptionsT>> provider) {
            this(cls, provider, 100);
        }
    }
}
