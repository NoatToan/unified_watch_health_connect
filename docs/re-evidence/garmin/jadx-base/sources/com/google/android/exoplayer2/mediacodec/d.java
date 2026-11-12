package com.google.android.exoplayer2.mediacodec;

import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class d implements MediaCodecSelector {
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecSelector
    public final List getDecoderInfos(String str, boolean z14, boolean z15) {
        return MediaCodecUtil.getDecoderInfos(str, z14, z15);
    }
}
