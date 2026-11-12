package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.graphics.pdf.PdfDocument;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmHandle$drawPDF$1$path$1", f = "SleepRhythmHandle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SleepRhythmHandle$drawPDF$1$path$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ File $appDir;
    final /* synthetic */ BaseActivity $context;
    final /* synthetic */ PdfDocument $document;
    final /* synthetic */ int $totalHeight;
    final /* synthetic */ int $totalWidth;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepRhythmHandle$drawPDF$1$path$1(File file, PdfDocument pdfDocument, int i, int i2, BaseActivity baseActivity, Continuation<? super SleepRhythmHandle$drawPDF$1$path$1> continuation) {
        super(2, continuation);
        this.$appDir = file;
        this.$document = pdfDocument;
        this.$totalWidth = i;
        this.$totalHeight = i2;
        this.$context = baseActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepRhythmHandle$drawPDF$1$path$1(this.$appDir, this.$document, this.$totalWidth, this.$totalHeight, this.$context, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String absolutePath = this.$appDir.getAbsolutePath();
        String str = File.separator;
        File file = new File(absolutePath + str + "sleep_rhythm_pdf.pdf");
        File file2 = new File(this.$appDir.getAbsolutePath() + str + "sleep_rhythm_image.jpg");
        this.$document.writeTo(new FileOutputStream(file));
        ShareUtil.saveImageToGallery(this.$context, SleepRhythmHandle.INSTANCE.createPDFBitmap(file, this.$totalWidth, this.$totalHeight));
        return file2.getAbsolutePath();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((SleepRhythmHandle$drawPDF$1$path$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
