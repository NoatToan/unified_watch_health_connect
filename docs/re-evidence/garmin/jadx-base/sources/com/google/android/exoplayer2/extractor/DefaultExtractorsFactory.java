package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.extractor.flac.FlacExtractor;
import com.google.android.exoplayer2.extractor.flv.FlvExtractor;
import com.google.android.exoplayer2.extractor.jpeg.JpegExtractor;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.ogg.OggExtractor;
import com.google.android.exoplayer2.extractor.ts.Ac3Extractor;
import com.google.android.exoplayer2.extractor.ts.Ac4Extractor;
import com.google.android.exoplayer2.extractor.ts.AdtsExtractor;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.extractor.wav.WavExtractor;
import com.google.android.exoplayer2.util.FileTypes;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
public final class DefaultExtractorsFactory implements ExtractorsFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    private static final FlacExtensionLoader FLAC_EXTENSION_LOADER = new FlacExtensionLoader();
    private int adtsFlags;
    private int amrFlags;
    private boolean constantBitrateSeekingAlwaysEnabled;
    private boolean constantBitrateSeekingEnabled;
    private int flacFlags;
    private int fragmentedMp4Flags;
    private int matroskaFlags;
    private int mp3Flags;
    private int mp4Flags;
    private int tsFlags;
    private int tsMode = 1;
    private int tsTimestampSearchBytes = TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES;

    public static final class FlacExtensionLoader {
        private final AtomicBoolean extensionLoaded = new AtomicBoolean(false);
        private Constructor<? extends Extractor> extractorConstructor;

        private Constructor<? extends Extractor> maybeLoadExtractorConstructor() {
            synchronized (this.extensionLoaded) {
                if (this.extensionLoaded.get()) {
                    return this.extractorConstructor;
                }
                try {
                    if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                        this.extractorConstructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(Integer.TYPE);
                    }
                } catch (ClassNotFoundException unused) {
                } catch (Exception e4) {
                    throw new RuntimeException("Error instantiating FLAC extension", e4);
                }
                this.extensionLoaded.set(true);
                return this.extractorConstructor;
            }
        }

        public Extractor getExtractor(int i14) {
            Constructor<? extends Extractor> constructorMaybeLoadExtractorConstructor = maybeLoadExtractorConstructor();
            if (constructorMaybeLoadExtractorConstructor == null) {
                return null;
            }
            try {
                return constructorMaybeLoadExtractorConstructor.newInstance(Integer.valueOf(i14));
            } catch (Exception e4) {
                com.airbnb.lottie.animation.keyframe.a.x("Unexpected error creating FLAC extractor", e4);
                return null;
            }
        }
    }

    private void addExtractorsForFileType(int i14, List<Extractor> list) {
        switch (i14) {
            case 0:
                list.add(new Ac3Extractor());
                break;
            case 1:
                list.add(new Ac4Extractor());
                break;
            case 2:
                list.add(new AdtsExtractor((this.constantBitrateSeekingAlwaysEnabled ? 2 : 0) | ((this.adtsFlags | (this.constantBitrateSeekingEnabled ? 1 : 0)) == true ? 1 : 0)));
                break;
            case 3:
                list.add(new AmrExtractor((this.constantBitrateSeekingAlwaysEnabled ? 2 : 0) | this.amrFlags | (this.constantBitrateSeekingEnabled ? 1 : 0)));
                break;
            case 4:
                Extractor extractor = FLAC_EXTENSION_LOADER.getExtractor(this.flacFlags);
                if (extractor == null) {
                    list.add(new FlacExtractor(this.flacFlags));
                } else {
                    list.add(extractor);
                }
                break;
            case 5:
                list.add(new FlvExtractor());
                break;
            case 6:
                list.add(new MatroskaExtractor(this.matroskaFlags));
                break;
            case 7:
                list.add(new Mp3Extractor((this.constantBitrateSeekingAlwaysEnabled ? 2 : 0) | this.mp3Flags | (this.constantBitrateSeekingEnabled ? 1 : 0)));
                break;
            case 8:
                list.add(new FragmentedMp4Extractor(this.fragmentedMp4Flags));
                list.add(new Mp4Extractor(this.mp4Flags));
                break;
            case 9:
                list.add(new OggExtractor());
                break;
            case 10:
                list.add(new PsExtractor());
                break;
            case 11:
                list.add(new TsExtractor(this.tsMode, this.tsFlags, this.tsTimestampSearchBytes));
                break;
            case 12:
                list.add(new WavExtractor());
                break;
            case 14:
                list.add(new JpegExtractor());
                break;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public synchronized Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(14);
            int iInferFileTypeFromResponseHeaders = FileTypes.inferFileTypeFromResponseHeaders(map);
            if (iInferFileTypeFromResponseHeaders != -1) {
                addExtractorsForFileType(iInferFileTypeFromResponseHeaders, arrayList);
            }
            int iInferFileTypeFromUri = FileTypes.inferFileTypeFromUri(uri);
            if (iInferFileTypeFromUri != -1 && iInferFileTypeFromUri != iInferFileTypeFromResponseHeaders) {
                addExtractorsForFileType(iInferFileTypeFromUri, arrayList);
            }
            for (int i14 : DEFAULT_EXTRACTOR_ORDER) {
                if (i14 != iInferFileTypeFromResponseHeaders && i14 != iInferFileTypeFromUri) {
                    addExtractorsForFileType(i14, arrayList);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return (Extractor[]) arrayList.toArray(new Extractor[arrayList.size()]);
    }

    public synchronized DefaultExtractorsFactory setAdtsExtractorFlags(int i14) {
        this.adtsFlags = i14;
        return this;
    }

    public synchronized DefaultExtractorsFactory setAmrExtractorFlags(int i14) {
        this.amrFlags = i14;
        return this;
    }

    public synchronized DefaultExtractorsFactory setConstantBitrateSeekingAlwaysEnabled(boolean z14) {
        this.constantBitrateSeekingAlwaysEnabled = z14;
        return this;
    }

    public synchronized DefaultExtractorsFactory setConstantBitrateSeekingEnabled(boolean z14) {
        this.constantBitrateSeekingEnabled = z14;
        return this;
    }

    public synchronized DefaultExtractorsFactory setFlacExtractorFlags(int i14) {
        this.flacFlags = i14;
        return this;
    }

    public synchronized DefaultExtractorsFactory setFragmentedMp4ExtractorFlags(int i14) {
        this.fragmentedMp4Flags = i14;
        return this;
    }

    public synchronized DefaultExtractorsFactory setMatroskaExtractorFlags(int i14) {
        this.matroskaFlags = i14;
        return this;
    }

    public synchronized DefaultExtractorsFactory setMp3ExtractorFlags(int i14) {
        this.mp3Flags = i14;
        return this;
    }

    public synchronized DefaultExtractorsFactory setMp4ExtractorFlags(int i14) {
        this.mp4Flags = i14;
        return this;
    }

    public synchronized DefaultExtractorsFactory setTsExtractorFlags(int i14) {
        this.tsFlags = i14;
        return this;
    }

    public synchronized DefaultExtractorsFactory setTsExtractorMode(int i14) {
        this.tsMode = i14;
        return this;
    }

    public synchronized DefaultExtractorsFactory setTsExtractorTimestampSearchBytes(int i14) {
        this.tsTimestampSearchBytes = i14;
        return this;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public synchronized Extractor[] createExtractors() {
        return createExtractors(Uri.EMPTY, new HashMap());
    }
}
