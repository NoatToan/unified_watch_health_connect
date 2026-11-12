package com.google.android.exoplayer2.mediacodec;

import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new d();

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z14, boolean z15);
}
