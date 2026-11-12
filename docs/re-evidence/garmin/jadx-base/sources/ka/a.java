package ka;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.q;
import androidx.media3.common.x;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import fa.z;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f103656c = new a(ImmutableList.of(b.f103661d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final ImmutableList<Integer> f103657d = ImmutableList.of(2, 5, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImmutableMap<Integer, Integer> f103658e = new ImmutableMap.Builder().put(5, 6).put(17, 6).put(7, 6).put(30, 10).put(18, 6).put(6, 8).put(8, 8).put(14, 8).buildOrThrow();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<b> f103659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f103660b;

    private a(List<b> list) {
        this.f103659a = new SparseArray<>();
        for (int i14 = 0; i14 < list.size(); i14++) {
            b bVar = list.get(i14);
            this.f103659a.put(bVar.f103662a, bVar);
        }
        int iMax = 0;
        for (int i15 = 0; i15 < this.f103659a.size(); i15++) {
            iMax = Math.max(iMax, this.f103659a.valueAt(i15).f103663b);
        }
        this.f103660b = iMax;
    }

    public static ImmutableList a(int i14, int[] iArr) {
        ImmutableList.Builder builder = ImmutableList.builder();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i15 : iArr) {
            builder.add(new b(i15, i14));
        }
        return builder.build();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0233  */
    /* JADX WARN: Code duplicated, block: B:87:0x023b  */
    @SuppressLint({"InlinedApi"})
    public static a b(Context context, Intent intent, androidx.media3.common.d dVar, ka.b bVar) {
        ka.b bVar2;
        Object systemService = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (bVar != null) {
            bVar2 = bVar;
        } else if (z.f70071a >= 33) {
            try {
                List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(dVar.a().f8185a);
                if (audioDevicesForAttributes.isEmpty()) {
                    bVar2 = null;
                } else {
                    bVar2 = new ka.b((AudioDeviceInfo) audioDevicesForAttributes.get(0));
                }
            } catch (RuntimeException unused) {
            }
        } else {
            bVar2 = null;
        }
        int i14 = z.f70071a;
        ImmutableMap<Integer, Integer> immutableMap = f103658e;
        if (i14 >= 33 && (z.L(context) || (i14 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(dVar.a().f8185a);
            HashMap map = new HashMap();
            map.put(2, new HashSet(Ints.asList(12)));
            for (int i15 = 0; i15 < directProfilesForAttributes.size(); i15++) {
                AudioProfile audioProfileB = ja.o.b(directProfilesForAttributes.get(i15));
                if (audioProfileB.getEncapsulationType() != 1) {
                    int format = audioProfileB.getFormat();
                    if (z.I(format) || immutableMap.containsKey(Integer.valueOf(format))) {
                        if (map.containsKey(Integer.valueOf(format))) {
                            Set set = (Set) map.get(Integer.valueOf(format));
                            set.getClass();
                            set.addAll(Ints.asList(audioProfileB.getChannelMasks()));
                        } else {
                            map.put(Integer.valueOf(format), new HashSet(Ints.asList(audioProfileB.getChannelMasks())));
                        }
                    }
                }
            }
            ImmutableList.Builder builder = ImmutableList.builder();
            for (Map.Entry entry : map.entrySet()) {
                builder.add(new b(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
            }
            return new a(builder.build());
        }
        if (i14 >= 23) {
            AudioDeviceInfo[] devices = bVar2 == null ? audioManager.getDevices(2) : new AudioDeviceInfo[]{bVar2.f103665a};
            ImmutableSet.Builder builderAdd = new ImmutableSet.Builder().add((Object[]) new Integer[]{8, 7});
            if (i14 >= 31) {
                builderAdd.add((Object[]) new Integer[]{26, 27});
            }
            if (i14 >= 33) {
                builderAdd.add(30);
            }
            ImmutableSet immutableSetBuild = builderAdd.build();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (immutableSetBuild.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return f103656c;
                }
            }
        }
        ImmutableSet.Builder builder2 = new ImmutableSet.Builder();
        builder2.add(2);
        int i16 = z.f70071a;
        if (i16 >= 29 && (z.L(context) || (i16 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            ImmutableList.Builder builder3 = ImmutableList.builder();
            UnmodifiableIterator<Integer> it = immutableMap.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                int iIntValue = next.intValue();
                if (z.f70071a >= z.o(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(OpusUtil.SAMPLE_RATE).build(), dVar.a().f8185a)) {
                    builder3.add(next);
                }
            }
            builder3.add(2);
            builder2.addAll((Iterable) builder3.build());
            return new a(a(10, Ints.toArray(builder2.build())));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z14 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z14) {
            String str = z.f70073c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    builder2.addAll((Iterable) f103657d);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            builder2.addAll((Iterable) f103657d);
        }
        if (intent == null || z14 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new a(a(10, Ints.toArray(builder2.build())));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            builder2.addAll((Iterable) Ints.asList(intArrayExtra));
        }
        return new a(a(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), Ints.toArray(builder2.build())));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static a c(Context context, androidx.media3.common.d dVar, ka.b bVar) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), dVar, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00fe  */
    public final Pair d(androidx.media3.common.d dVar, q qVar) {
        String str = qVar.f8386n;
        str.getClass();
        int iC = x.c(str, qVar.f8383k);
        Integer numValueOf = Integer.valueOf(iC);
        ImmutableMap<Integer, Integer> immutableMap = f103658e;
        if (!immutableMap.containsKey(numValueOf)) {
            return null;
        }
        int i14 = 6;
        if (iC == 18 && !e(18)) {
            iC = 6;
        } else if ((iC == 8 && !e(8)) || (iC == 30 && !e(30))) {
            iC = 7;
        }
        if (!e(iC)) {
            return null;
        }
        b bVar = this.f103659a.get(iC);
        bVar.getClass();
        int iIntValue = bVar.f103663b;
        ImmutableSet<Integer> immutableSet = bVar.f103664c;
        int i15 = qVar.C;
        boolean zContains = false;
        if (i15 == -1 || iC == 18) {
            int i16 = qVar.D;
            if (i16 == -1) {
                i16 = OpusUtil.SAMPLE_RATE;
            }
            int i17 = bVar.f103662a;
            if (immutableSet == null) {
                if (z.f70071a >= 29) {
                    iIntValue = 10;
                    while (true) {
                        if (iIntValue <= 0) {
                            iIntValue = 0;
                            break;
                        }
                        int iQ = z.q(iIntValue);
                        if (iQ != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i17).setSampleRate(i16).setChannelMask(iQ).build(), dVar.a().f8185a)) {
                            break;
                        }
                        iIntValue--;
                    }
                } else {
                    Integer orDefault = immutableMap.getOrDefault(Integer.valueOf(i17), 0);
                    orDefault.getClass();
                    iIntValue = orDefault.intValue();
                }
            }
            i15 = iIntValue;
        } else if (!qVar.f8386n.equals(MimeTypes.AUDIO_DTS_X) || z.f70071a >= 33) {
            if (immutableSet != null) {
                int iQ2 = z.q(i15);
                if (iQ2 != 0) {
                    zContains = immutableSet.contains(Integer.valueOf(iQ2));
                }
            } else if (i15 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i15 > 10) {
            return null;
        }
        int i18 = z.f70071a;
        if (i18 > 28) {
            i14 = i15;
        } else if (i15 == 7) {
            i14 = 8;
        } else if (i15 != 3 && i15 != 4 && i15 != 5) {
            i14 = i15;
        }
        if (i18 <= 26 && "fugu".equals(z.f70072b) && i14 == 1) {
            i14 = 2;
        }
        int iQ3 = z.q(i14);
        if (iQ3 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iC), Integer.valueOf(iQ3));
    }

    public final boolean e(int i14) {
        int i15 = z.f70071a;
        return this.f103659a.indexOfKey(i14) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                SparseArray<b> sparseArray = aVar.f103659a;
                int i14 = z.f70071a;
                SparseArray<b> sparseArray2 = this.f103659a;
                if (sparseArray2 == null) {
                    if (sparseArray == null) {
                        zContentEquals = true;
                    } else {
                        zContentEquals = false;
                    }
                } else if (sparseArray == null) {
                    zContentEquals = false;
                } else if (z.f70071a >= 31) {
                    zContentEquals = sparseArray2.contentEquals(sparseArray);
                } else {
                    int size = sparseArray2.size();
                    if (size == sparseArray.size()) {
                        int i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                if (Objects.equals(sparseArray2.valueAt(i15), sparseArray.get(sparseArray2.keyAt(i15)))) {
                                    i15++;
                                }
                            } else {
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                }
                if (!zContentEquals || this.f103660b != aVar.f103660b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        int i14 = z.f70071a;
        SparseArray<b> sparseArray = this.f103659a;
        if (i14 >= 31) {
            iHashCode = sparseArray.contentHashCode();
        } else {
            iHashCode = 17;
            for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i15)) + ((sparseArray.keyAt(i15) + (iHashCode * 31)) * 31);
            }
        }
        return (iHashCode * 31) + this.f103660b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f103660b + ", audioProfiles=" + this.f103659a + "]";
    }

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f103661d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f103662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f103663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImmutableSet<Integer> f103664c;

        static {
            b bVar;
            if (z.f70071a >= 33) {
                ImmutableSet.Builder builder = new ImmutableSet.Builder();
                for (int i14 = 1; i14 <= 10; i14++) {
                    builder.add(Integer.valueOf(z.q(i14)));
                }
                bVar = new b(2, builder.build());
            } else {
                bVar = new b(2, 10);
            }
            f103661d = bVar;
        }

        public b(int i14, Set<Integer> set) {
            this.f103662a = i14;
            ImmutableSet<Integer> immutableSetCopyOf = ImmutableSet.copyOf((Collection) set);
            this.f103664c = immutableSetCopyOf;
            UnmodifiableIterator<Integer> it = immutableSetCopyOf.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(it.next().intValue()));
            }
            this.f103663b = iMax;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f103662a == bVar.f103662a && this.f103663b == bVar.f103663b) {
                ImmutableSet<Integer> immutableSet = bVar.f103664c;
                int i14 = z.f70071a;
                if (Objects.equals(this.f103664c, immutableSet)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i14 = ((this.f103662a * 31) + this.f103663b) * 31;
            ImmutableSet<Integer> immutableSet = this.f103664c;
            return i14 + (immutableSet == null ? 0 : immutableSet.hashCode());
        }

        public final String toString() {
            return "AudioProfile[format=" + this.f103662a + ", maxChannelCount=" + this.f103663b + ", channelMasks=" + this.f103664c + "]";
        }

        public b(int i14, int i15) {
            this.f103662a = i14;
            this.f103663b = i15;
            this.f103664c = null;
        }
    }

    @Deprecated
    public a(int[] iArr, int i14) {
        this(a(i14, iArr));
    }
}
