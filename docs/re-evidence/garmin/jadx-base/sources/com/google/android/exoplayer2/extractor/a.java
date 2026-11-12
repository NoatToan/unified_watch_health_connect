package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.extractor.flac.FlacExtractor;
import com.google.android.exoplayer2.extractor.flv.FlvExtractor;
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

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements ExtractorsFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52998a;

    public /* synthetic */ a(int i14) {
        this.f52998a = i14;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        switch (this.f52998a) {
            case 0:
                return ExtractorsFactory.lambda$static$0();
            case 1:
                return AmrExtractor.lambda$static$0();
            case 2:
                return FlacExtractor.lambda$static$0();
            case 3:
                return FlvExtractor.lambda$static$0();
            case 4:
                return MatroskaExtractor.lambda$static$0();
            case 5:
                return Mp3Extractor.lambda$static$0();
            case 6:
                return FragmentedMp4Extractor.lambda$static$0();
            case 7:
                return Mp4Extractor.lambda$static$0();
            case 8:
                return OggExtractor.lambda$static$0();
            case 9:
                return Ac3Extractor.lambda$static$0();
            case 10:
                return Ac4Extractor.lambda$static$0();
            case 11:
                return AdtsExtractor.lambda$static$0();
            case 12:
                return PsExtractor.lambda$static$0();
            case 13:
                return TsExtractor.lambda$static$0();
            default:
                return WavExtractor.lambda$static$0();
        }
    }
}
