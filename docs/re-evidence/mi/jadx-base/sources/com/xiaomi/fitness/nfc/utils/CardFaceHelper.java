package com.xiaomi.fitness.nfc.utils;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.pdf.PdfRenderer;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.view.ViewGroup;
import android.widget.ImageView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.TLSCompatSocketFactory;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.ni4;
import defpackage.pli;
import defpackage.r72;
import defpackage.wni;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJW\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00070\u0015H\u0082@¢\u0006\u0002\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0002J\u0012\u0010\u001f\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u0005H\u0002J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0005H\u0002J\u0010\u0010%\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0006\u0010&\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/nfc/utils/CardFaceHelper;", "", "<init>", "()V", "TAG", "", "loadVISACardFace", "", "cardWrapper", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "faceView", "Landroid/widget/ImageView;", "download", "Lkotlinx/coroutines/flow/Flow;", "", "url", "file", "Ljava/io/File;", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "error", "(Ljava/lang/String;Ljava/io/File;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestHead", "Lokhttp3/Response;", "supportRange", "", com.xiaomi.onetrack.api.b.I, "contentLength", "", "loadPDF", "Landroid/graphics/Bitmap;", "cardFace", "getCardFaceResFile", "removePDFCardFace", "clearPDFCardFace", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCardFaceLoadHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardFaceLoadHelper.kt\ncom/xiaomi/fitness/nfc/utils/CardFaceHelper\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,342:1\n54#2,3:343\n24#2:346\n57#2,6:347\n63#2,2:354\n54#2,3:356\n24#2:359\n59#2,6:360\n54#2,3:366\n24#2:369\n59#2,6:370\n57#3:353\n*S KotlinDebug\n*F\n+ 1 CardFaceLoadHelper.kt\ncom/xiaomi/fitness/nfc/utils/CardFaceHelper\n*L\n69#1:343,3\n69#1:346\n69#1:347,6\n69#1:354,2\n76#1:356,3\n76#1:359\n76#1:360,6\n119#1:366,3\n119#1:369\n119#1:370,6\n69#1:353\n*E\n"})
public final class CardFaceHelper {

    @NotNull
    public static final CardFaceHelper INSTANCE = new CardFaceHelper();

    @NotNull
    private static final String TAG = "CardFaceHelper";

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.utils.CardFaceHelper$download$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.utils.CardFaceHelper$download$2", f = "CardFaceLoadHelper.kt", i = {0, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3}, l = {135, 141, SportReportBaseParser.ReportType.divingOTU, SportReportBaseParser.ReportType.noFlyDuration, 208, 214}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "fileTmp", com.xiaomi.onetrack.api.b.I, "outputStream", "buffer", "len", SportDataTypeKt.DIMEN_TOTAL, "totalBytesRead", com.xiaomi.onetrack.api.b.I, "outputStream"}, s = {"L$0", "L$0", "L$1", "L$5", "L$6", "L$7", "L$8", "J$0", "J$1", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nCardFaceLoadHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardFaceLoadHelper.kt\ncom/xiaomi/fitness/nfc/utils/CardFaceHelper$download$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
        final /* synthetic */ File $file;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ String $url;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.utils.CardFaceHelper$download$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.utils.CardFaceHelper$download$2$1", f = "CardFaceLoadHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $onSuccess;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$onSuccess = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$onSuccess, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$onSuccess.invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.utils.CardFaceHelper$download$2$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.utils.CardFaceHelper$download$2$4", f = "CardFaceLoadHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<String, Unit> $onError;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass4(Function1<? super String, Unit> function1, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$onError = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$onError, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$onError.invoke2("");
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, Function1<? super String, Unit> function1, File file, Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$url = str;
            this.$onError = function1;
            this.$file = file;
            this.$onSuccess = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$url, this.$onError, this.$file, this.$onSuccess, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:102:0x01fe  */
        /* JADX WARN: Code duplicated, block: B:106:0x0236 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:107:0x0237  */
        /* JADX WARN: Not initialized variable reg: 14, insn: 0x0283: MOVE (r3 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:120:0x0282 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0237 -> B:21:0x0077). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 790
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.nfc.utils.CardFaceHelper.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.utils.CardFaceHelper$loadVISACardFace$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.utils.CardFaceHelper$loadVISACardFace$2", f = "CardFaceLoadHelper.kt", i = {}, l = {83, 94}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCardFaceLoadHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardFaceLoadHelper.kt\ncom/xiaomi/fitness/nfc/utils/CardFaceHelper$loadVISACardFace$2\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,342:1\n54#2,3:343\n24#2:346\n59#2,6:347\n*S KotlinDebug\n*F\n+ 1 CardFaceLoadHelper.kt\ncom/xiaomi/fitness/nfc/utils/CardFaceHelper$loadVISACardFace$2\n*L\n87#1:343,3\n87#1:346\n87#1:347,6\n*E\n"})
    public static final class C27112 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cardWrapper;
        final /* synthetic */ ImageView $faceView;
        final /* synthetic */ Drawable $holderDrawable;
        final /* synthetic */ File $pdfFile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27112(CardWrapper cardWrapper, File file, ImageView imageView, Drawable drawable, Continuation<? super C27112> continuation) {
            super(2, continuation);
            this.$cardWrapper = cardWrapper;
            this.$pdfFile = file;
            this.$faceView = imageView;
            this.$holderDrawable = drawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(CardWrapper cardWrapper, ImageView imageView, Drawable drawable) {
            CardFaceHelper cardFaceHelper = CardFaceHelper.INSTANCE;
            String cardFace = cardWrapper.getCardFace();
            Intrinsics.checkNotNullExpressionValue(cardFace, "getCardFace(...)");
            Bitmap bitmapLoadPDF = cardFaceHelper.loadPDF(cardFace);
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(bitmapLoadPDF).target(imageView);
            builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(Float.valueOf(16.0f))));
            builderTarget.error(drawable);
            imageLoader.enqueue(builderTarget.build());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(String str) {
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27112(this.$cardWrapper, this.$pdfFile, this.$faceView, this.$holderDrawable, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CardFaceHelper cardFaceHelper = CardFaceHelper.INSTANCE;
            String cardFace = this.$cardWrapper.getCardFace();
            File file = this.$pdfFile;
            final CardWrapper cardWrapper = this.$cardWrapper;
            final ImageView imageView = this.$faceView;
            final Drawable drawable = this.$holderDrawable;
            Function0 function0 = new Function0() { // from class: com.xiaomi.fitness.nfc.utils.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CardFaceHelper.C27112.invokeSuspend$lambda$1(cardWrapper, imageView, drawable);
                }
            };
            Function1 function1 = new Function1() { // from class: com.xiaomi.fitness.nfc.utils.b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return CardFaceHelper.C27112.invokeSuspend$lambda$2((String) obj2);
                }
            };
            this.label = 1;
            obj = cardFaceHelper.download(cardFace, file, function0, function1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.nfc.utils.CardFaceHelper.loadVISACardFace.2.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(int i2, Continuation<? super Unit> continuation) {
                    return Unit.INSTANCE;
                }
            };
            this.label = 2;
            if (((Flow) obj).collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27112) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.utils.CardFaceHelper$loadVISACardFace$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.utils.CardFaceHelper$loadVISACardFace$3", f = "CardFaceLoadHelper.kt", i = {}, l = {102, 113}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCardFaceLoadHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardFaceLoadHelper.kt\ncom/xiaomi/fitness/nfc/utils/CardFaceHelper$loadVISACardFace$3\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,342:1\n54#2,3:343\n24#2:346\n59#2,6:347\n*S KotlinDebug\n*F\n+ 1 CardFaceLoadHelper.kt\ncom/xiaomi/fitness/nfc/utils/CardFaceHelper$loadVISACardFace$3\n*L\n106#1:343,3\n106#1:346\n106#1:347,6\n*E\n"})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cardWrapper;
        final /* synthetic */ ImageView $faceView;
        final /* synthetic */ Drawable $holderDrawable;
        final /* synthetic */ File $pdfFile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CardWrapper cardWrapper, File file, ImageView imageView, Drawable drawable, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$cardWrapper = cardWrapper;
            this.$pdfFile = file;
            this.$faceView = imageView;
            this.$holderDrawable = drawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(CardWrapper cardWrapper, ImageView imageView, Drawable drawable) {
            CardFaceHelper cardFaceHelper = CardFaceHelper.INSTANCE;
            String cardFace = cardWrapper.getCardFace();
            Intrinsics.checkNotNullExpressionValue(cardFace, "getCardFace(...)");
            Bitmap bitmapLoadPDF = cardFaceHelper.loadPDF(cardFace);
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(bitmapLoadPDF).target(imageView);
            builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(Float.valueOf(16.0f))));
            builderTarget.error(drawable);
            imageLoader.enqueue(builderTarget.build());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(String str) {
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$cardWrapper, this.$pdfFile, this.$faceView, this.$holderDrawable, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CardFaceHelper cardFaceHelper = CardFaceHelper.INSTANCE;
            String cardFace = this.$cardWrapper.getCardFace();
            File file = this.$pdfFile;
            final CardWrapper cardWrapper = this.$cardWrapper;
            final ImageView imageView = this.$faceView;
            final Drawable drawable = this.$holderDrawable;
            Function0 function0 = new Function0() { // from class: com.xiaomi.fitness.nfc.utils.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CardFaceHelper.AnonymousClass3.invokeSuspend$lambda$1(cardWrapper, imageView, drawable);
                }
            };
            Function1 function1 = new Function1() { // from class: com.xiaomi.fitness.nfc.utils.d
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return CardFaceHelper.AnonymousClass3.invokeSuspend$lambda$2((String) obj2);
                }
            };
            this.label = 1;
            obj = cardFaceHelper.download(cardFace, file, function0, function1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.nfc.utils.CardFaceHelper.loadVISACardFace.3.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(int i2, Continuation<? super Unit> continuation) {
                    return Unit.INSTANCE;
                }
            };
            this.label = 2;
            if (((Flow) obj).collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private CardFaceHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long contentLength(Response response) {
        if ((response != null ? response.body() : null) == null) {
            return -1L;
        }
        ResponseBody responseBodyBody = response.body();
        Intrinsics.checkNotNull(responseBodyBody);
        return responseBodyBody.getContentLength();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object download(String str, File file, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super Flow<Integer>> continuation) {
        return FlowKt.flow(new AnonymousClass2(str, function1, file, function0, null));
    }

    private final File getCardFaceResFile(String cardFace) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        File file = new File(r72.f(Environment.DIRECTORY_DOWNLOADS) + File.separator + (wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null));
        if (!file.exists()) {
            file.mkdirs();
        }
        String strSubstring = cardFace.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) cardFace, "/", 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new File(file, strSubstring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap loadPDF(String cardFace) {
        File cardFaceResFile = getCardFaceResFile(cardFace);
        if (!cardFaceResFile.exists()) {
            return null;
        }
        PdfRenderer pdfRenderer = new PdfRenderer(ParcelFileDescriptor.open(cardFaceResFile, 268435456));
        pdfRenderer.getPageCount();
        float screenWidth = DisplayUtil.getScreenWidth() - (2 * ApplicationExtKt.getApplication().getResources().getDimension(pli.e));
        PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
        Intrinsics.checkNotNullExpressionValue(pageOpenPage, "openPage(...)");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) screenWidth, (int) ((63 * screenWidth) / 100), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
        pageOpenPage.close();
        pdfRenderer.close();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Response requestHead(String url) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TLSCompatSocketFactory.Companion companion = TLSCompatSocketFactory.INSTANCE;
        try {
            Response responseExecute = builder.sslSocketFactory(companion.sslSocketFactory(), companion.trustManager()).build().newCall(new Request.Builder().url(url).head().build()).execute();
            try {
                if (responseExecute.isSuccessful()) {
                    CloseableKt.closeFinally(responseExecute, null);
                    return responseExecute;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(responseExecute, null);
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(responseExecute, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean supportRange(Response response) {
        if (response != null) {
            return StringsKt__StringsJVMKt.equals("bytes", Response.header$default(response, "Accept-Ranges", null, 2, null), true);
        }
        return false;
    }

    public final void clearPDFCardFace() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        File file = new File(r72.f(Environment.DIRECTORY_DOWNLOADS) + File.separator + (wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null));
        if (!file.exists() || !file.isDirectory()) {
            if (file.exists()) {
                file.delete();
                return;
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "listFiles(...)");
        for (File file2 : fileArrListFiles) {
            FileUtils.INSTANCE.deleteFile(file2);
        }
        file.delete();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x008c  */
    public final void loadVISACardFace(@Nullable CardWrapper cardWrapper, @NotNull ImageView faceView) {
        Drawable drawableE;
        Intrinsics.checkNotNullParameter(faceView, "faceView");
        if (cardWrapper == null) {
            return;
        }
        int screenWidth = DisplayUtil.getScreenWidth() - (((int) ApplicationExtKt.getApplication().getResources().getDimension(pli.e)) * 2);
        ViewGroup.LayoutParams layoutParams = faceView.getLayoutParams();
        layoutParams.width = screenWidth;
        layoutParams.height = (screenWidth * 63) / 100;
        faceView.setLayoutParams(layoutParams);
        String backgroundColor = cardWrapper.bankCard.getCardMetaData().getBackgroundColor();
        if (backgroundColor == null || backgroundColor.length() == 0) {
            drawableE = ni4.e(ApplicationExtKt.getApplication(), wni.f);
        } else {
            String backgroundColor2 = cardWrapper.bankCard.getCardMetaData().getBackgroundColor();
            Intrinsics.checkNotNullExpressionValue(backgroundColor2, "getBackgroundColor(...)");
            if (StringsKt__StringsKt.contains$default((CharSequence) backgroundColor2, (CharSequence) "0x", false, 2, (Object) null)) {
                String backgroundColor3 = cardWrapper.bankCard.getCardMetaData().getBackgroundColor();
                Intrinsics.checkNotNullExpressionValue(backgroundColor3, "getBackgroundColor(...)");
                String strReplace$default = StringsKt__StringsJVMKt.replace$default(backgroundColor3, "0x", PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, false, 4, (Object) null);
                Drawable drawableE2 = ni4.e(ApplicationExtKt.getApplication(), wni.x);
                Intrinsics.checkNotNull(drawableE2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                GradientDrawable gradientDrawable = (GradientDrawable) drawableE2;
                gradientDrawable.setColor(Color.parseColor(strReplace$default));
                drawableE = gradientDrawable;
            } else {
                drawableE = ni4.e(ApplicationExtKt.getApplication(), wni.f);
            }
        }
        Drawable drawable = drawableE;
        Coil.imageLoader(faceView.getContext()).enqueue(new ImageRequest.Builder(faceView.getContext()).data(drawable).target(faceView).build());
        String cardFace = cardWrapper.getCardFace();
        if (cardFace != null && cardFace.length() != 0) {
            String cardFace2 = cardWrapper.getCardFace();
            Intrinsics.checkNotNullExpressionValue(cardFace2, "getCardFace(...)");
            if (StringsKt__StringsKt.contains$default((CharSequence) cardFace2, (CharSequence) "pdf", false, 2, (Object) null)) {
                String cardFace3 = cardWrapper.getCardFace();
                Intrinsics.checkNotNullExpressionValue(cardFace3, "getCardFace(...)");
                File cardFaceResFile = getCardFaceResFile(cardFace3);
                if (!cardFaceResFile.exists()) {
                    AnyExtKt.io$default(null, new AnonymousClass3(cardWrapper, cardFaceResFile, faceView, drawable, null), 1, null);
                    return;
                }
                try {
                    String cardFace4 = cardWrapper.getCardFace();
                    Intrinsics.checkNotNullExpressionValue(cardFace4, "getCardFace(...)");
                    Bitmap bitmapLoadPDF = loadPDF(cardFace4);
                    ImageLoader imageLoader = Coil.imageLoader(faceView.getContext());
                    ImageRequest.Builder builderTarget = new ImageRequest.Builder(faceView.getContext()).data(bitmapLoadPDF).target(faceView);
                    builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(Float.valueOf(16.0f))));
                    builderTarget.error(drawable);
                    imageLoader.enqueue(builderTarget.build());
                    return;
                } catch (Exception e) {
                    Logger.e(TAG, "loadVISACardFace error" + e);
                    AnyExtKt.io$default(null, new C27112(cardWrapper, cardFaceResFile, faceView, drawable, null), 1, null);
                    return;
                }
            }
        }
        String cardFace5 = cardWrapper.getCardFace();
        ImageLoader imageLoader2 = Coil.imageLoader(faceView.getContext());
        ImageRequest.Builder builderTarget2 = new ImageRequest.Builder(faceView.getContext()).data(cardFace5).target(faceView);
        builderTarget2.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(Float.valueOf(16.0f))));
        builderTarget2.error(drawable);
        imageLoader2.enqueue(builderTarget2.build());
    }

    public final void removePDFCardFace(@Nullable CardWrapper cardWrapper) {
        String cardFace;
        if (cardWrapper == null || (cardFace = cardWrapper.getCardFace()) == null || cardFace.length() == 0) {
            return;
        }
        String cardFace2 = cardWrapper.getCardFace();
        Intrinsics.checkNotNullExpressionValue(cardFace2, "getCardFace(...)");
        if (StringsKt__StringsKt.contains$default((CharSequence) cardFace2, (CharSequence) "pdf", false, 2, (Object) null)) {
            String cardFace3 = cardWrapper.getCardFace();
            Intrinsics.checkNotNullExpressionValue(cardFace3, "getCardFace(...)");
            String cardFace4 = cardWrapper.getCardFace();
            Intrinsics.checkNotNullExpressionValue(cardFace4, "getCardFace(...)");
            String strSubstring = cardFace3.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) cardFace4, "/", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            File file = new File(r72.f(Environment.DIRECTORY_DOWNLOADS) + File.separator + (wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null));
            if (file.exists() && file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "listFiles(...)");
                for (File file2 : fileArrListFiles) {
                    if (file2.exists() && Intrinsics.areEqual(file2.getName(), strSubstring)) {
                        FileUtils.INSTANCE.deleteFile(file2);
                    }
                }
            }
        }
    }
}
