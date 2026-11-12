package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.text.TextOutput;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c implements TextOutput {
    @Override // com.google.android.exoplayer2.text.TextOutput
    public final void onCues(List list) {
        DownloadHelper.lambda$getRendererCapabilities$0(list);
    }
}
