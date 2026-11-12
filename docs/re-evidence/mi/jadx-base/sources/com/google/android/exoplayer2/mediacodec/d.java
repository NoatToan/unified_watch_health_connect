package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f7982a = new d() { // from class: wif
        @Override // com.google.android.exoplayer2.mediacodec.d
        public final List a(String str, boolean z, boolean z2) {
            return MediaCodecUtil.r(str, z, z2);
        }
    };

    List<c> a(String str, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException;
}
