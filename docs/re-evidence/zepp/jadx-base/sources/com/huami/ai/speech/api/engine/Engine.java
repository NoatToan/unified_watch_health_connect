package com.huami.ai.speech.api.engine;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.notification.TransportUri;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H&J\b\u0010\n\u001a\u00020\u0007H&J \u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH&J\b\u0010\u0011\u001a\u00020\u0007H&J\b\u0010\u0012\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0007H&¨\u0006\u0014"}, d2 = {"Lcom/huami/ai/speech/api/engine/Engine;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "", TransportUri.ACTION_BLOCK, PointCategory.INIT, "start", "", "byte", "", SessionDescription.p, "offset", "putData", "interrupt", Command.STOP, "destroy", "speech-api_release"}, k = 1, mv = {1, 5, 1})
public interface Engine {
    void destroy();

    void init(@NotNull Function1<? super Boolean, Unit> block);

    void interrupt();

    void putData(@NotNull byte[] bArr, int length, int offset);

    void start();

    void stop();
}
