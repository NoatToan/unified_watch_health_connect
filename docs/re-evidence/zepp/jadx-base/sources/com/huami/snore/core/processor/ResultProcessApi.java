package com.huami.snore.core.processor;

import android.content.Context;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0004H&J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\b\u0010\r\u001a\u00020\u0006H&¨\u0006\u000e"}, d2 = {"Lcom/huami/snore/core/processor/ResultProcessApi;", "", "", HTTP.CONTENT_RANGE_BYTES, "", SessionDescription.p, "", "process", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "result", "setVoiceAnalysisResult", "end", "release", "snore_release"}, k = 1, mv = {1, 5, 1})
public interface ResultProcessApi {
    void end(@Nullable Context context);

    void process(@Nullable byte[] bytes, int length);

    void release();

    void setVoiceAnalysisResult(@Nullable Context context, int result);
}
