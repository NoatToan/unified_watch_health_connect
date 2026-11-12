package com.xiaomi.fitness.nfc.protocol;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.net.TLSCompatSocketFactory;
import defpackage.hpg;
import defpackage.r72;
import defpackage.sui;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
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
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00012B\u0007¢\u0006\u0004\b0\u00101J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJY\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00100\u0012H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\"2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\u0010*\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J!\u0010+\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/nfc/protocol/OpenPDFProtocolFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/nfc/protocol/OpenPDFProtocolViewModel;", "Lhpg;", "", "protocol", "Ljava/io/File;", "getPDFResFile", "(Ljava/lang/String;)Ljava/io/File;", "", "Landroid/graphics/Bitmap;", "loadPDF", "(Ljava/lang/String;)Ljava/util/List;", "url", "file", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "error", "onError", "Lkotlinx/coroutines/flow/Flow;", "", "download", "(Ljava/lang/String;Ljava/io/File;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/Response;", "requestHead", "(Ljava/lang/String;)Lokhttp3/Response;", com.xiaomi.onetrack.api.b.I, "", "supportRange", "(Lokhttp3/Response;)Z", "", "contentLength", "(Lokhttp3/Response;)J", "bindView", "(Lhpg;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "getLayoutId", "()I", "layoutId", "<init>", "()V", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class OpenPDFProtocolFragment extends BaseBindingFragment<OpenPDFProtocolViewModel, hpg> {

    @NotNull
    public static final String PROTOCOL_URL = "pdf_protocol_url";

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.protocol.OpenPDFProtocolFragment$download$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.protocol.OpenPDFProtocolFragment$download$2", f = "OpenPDFProtocolFragment.kt", i = {0, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3}, l = {126, 132, 180, SportReportBaseParser.ReportType.exitTime, SportReportBaseParser.ReportType.oxygenPartialPressureThreshold, 201}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "fileTmp", com.xiaomi.onetrack.api.b.I, "outputStream", "buffer", "len", SportDataTypeKt.DIMEN_TOTAL, "totalBytesRead", com.xiaomi.onetrack.api.b.I, "outputStream"}, s = {"L$0", "L$0", "L$1", "L$5", "L$6", "L$7", "L$8", "J$0", "J$1", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nOpenPDFProtocolFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenPDFProtocolFragment.kt\ncom/xiaomi/fitness/nfc/protocol/OpenPDFProtocolFragment$download$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
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
        final /* synthetic */ OpenPDFProtocolFragment this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.protocol.OpenPDFProtocolFragment$download$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.protocol.OpenPDFProtocolFragment$download$2$1", f = "OpenPDFProtocolFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.protocol.OpenPDFProtocolFragment$download$2$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.protocol.OpenPDFProtocolFragment$download$2$4", f = "OpenPDFProtocolFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
        public AnonymousClass2(String str, Function1<? super String, Unit> function1, File file, OpenPDFProtocolFragment openPDFProtocolFragment, Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$url = str;
            this.$onError = function1;
            this.$file = file;
            this.this$0 = openPDFProtocolFragment;
            this.$onSuccess = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$url, this.$onError, this.$file, this.this$0, this.$onSuccess, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0200  */
        /* JADX WARN: Code duplicated, block: B:106:0x0238 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:107:0x0239  */
        /* JADX WARN: Not initialized variable reg: 14, insn: 0x0285: MOVE (r3 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:120:0x0284 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0239 -> B:21:0x0077). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 792
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.nfc.protocol.OpenPDFProtocolFragment.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.protocol.OpenPDFProtocolFragment$onViewCreated$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.protocol.OpenPDFProtocolFragment$onViewCreated$1", f = "OpenPDFProtocolFragment.kt", i = {}, l = {58, 63}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OpenPDFProtocolAdapter $mOpenPDFProtocolAdapter;
        final /* synthetic */ File $pdfFile;
        final /* synthetic */ String $protocol;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, File file, OpenPDFProtocolAdapter openPDFProtocolAdapter, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$protocol = str;
            this.$pdfFile = file;
            this.$mOpenPDFProtocolAdapter = openPDFProtocolAdapter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(OpenPDFProtocolFragment openPDFProtocolFragment, String str, OpenPDFProtocolAdapter openPDFProtocolAdapter) {
            openPDFProtocolAdapter.updateCurrentList(openPDFProtocolFragment.loadPDF(str));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(String str) {
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OpenPDFProtocolFragment.this.new AnonymousClass1(this.$protocol, this.$pdfFile, this.$mOpenPDFProtocolAdapter, continuation);
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
            final OpenPDFProtocolFragment openPDFProtocolFragment = OpenPDFProtocolFragment.this;
            final String str = this.$protocol;
            File file = this.$pdfFile;
            final OpenPDFProtocolAdapter openPDFProtocolAdapter = this.$mOpenPDFProtocolAdapter;
            Function0 function0 = new Function0() { // from class: com.xiaomi.fitness.nfc.protocol.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OpenPDFProtocolFragment.AnonymousClass1.invokeSuspend$lambda$0(openPDFProtocolFragment, str, openPDFProtocolAdapter);
                }
            };
            Function1 function1 = new Function1() { // from class: com.xiaomi.fitness.nfc.protocol.b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return OpenPDFProtocolFragment.AnonymousClass1.invokeSuspend$lambda$1((String) obj2);
                }
            };
            this.label = 1;
            obj = openPDFProtocolFragment.download(str, file, function0, function1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.nfc.protocol.OpenPDFProtocolFragment.onViewCreated.1.3
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.protocol.OpenPDFProtocolFragment$onViewCreated$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.protocol.OpenPDFProtocolFragment$onViewCreated$2", f = "OpenPDFProtocolFragment.kt", i = {}, l = {71, 76}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26632 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OpenPDFProtocolAdapter $mOpenPDFProtocolAdapter;
        final /* synthetic */ File $pdfFile;
        final /* synthetic */ String $protocol;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26632(String str, File file, OpenPDFProtocolAdapter openPDFProtocolAdapter, Continuation<? super C26632> continuation) {
            super(2, continuation);
            this.$protocol = str;
            this.$pdfFile = file;
            this.$mOpenPDFProtocolAdapter = openPDFProtocolAdapter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(OpenPDFProtocolFragment openPDFProtocolFragment, String str, OpenPDFProtocolAdapter openPDFProtocolAdapter) {
            openPDFProtocolAdapter.updateCurrentList(openPDFProtocolFragment.loadPDF(str));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(String str) {
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OpenPDFProtocolFragment.this.new C26632(this.$protocol, this.$pdfFile, this.$mOpenPDFProtocolAdapter, continuation);
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
            final OpenPDFProtocolFragment openPDFProtocolFragment = OpenPDFProtocolFragment.this;
            final String str = this.$protocol;
            File file = this.$pdfFile;
            final OpenPDFProtocolAdapter openPDFProtocolAdapter = this.$mOpenPDFProtocolAdapter;
            Function0 function0 = new Function0() { // from class: com.xiaomi.fitness.nfc.protocol.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OpenPDFProtocolFragment.C26632.invokeSuspend$lambda$0(openPDFProtocolFragment, str, openPDFProtocolAdapter);
                }
            };
            Function1 function1 = new Function1() { // from class: com.xiaomi.fitness.nfc.protocol.d
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return OpenPDFProtocolFragment.C26632.invokeSuspend$lambda$1((String) obj2);
                }
            };
            this.label = 1;
            obj = openPDFProtocolFragment.download(str, file, function0, function1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.nfc.protocol.OpenPDFProtocolFragment.onViewCreated.2.3
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
            return ((C26632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
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
        return FlowKt.flow(new AnonymousClass2(str, function1, file, this, function0, null));
    }

    private final File getPDFResFile(String protocol) {
        File file = new File(r72.f("bank_protocol") + File.separator);
        if (!file.exists()) {
            file.mkdirs();
        }
        String strSubstring = protocol.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) protocol, "/", 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new File(file, strSubstring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Bitmap> loadPDF(String protocol) {
        File pDFResFile = getPDFResFile(protocol);
        ArrayList arrayList = new ArrayList();
        if (!pDFResFile.exists()) {
            return arrayList;
        }
        float screenWidth = DisplayUtil.getScreenWidth();
        DisplayUtil.getScreenHeight();
        PdfRenderer pdfRenderer = new PdfRenderer(ParcelFileDescriptor.open(pDFResFile, 268435456));
        int pageCount = pdfRenderer.getPageCount();
        for (int i = 0; i < pageCount; i++) {
            PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i);
            Intrinsics.checkNotNullExpressionValue(pageOpenPage, "openPage(...)");
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) screenWidth, (int) ((screenWidth / pageOpenPage.getWidth()) * pageOpenPage.getHeight()), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
            arrayList.add(bitmapCreateBitmap);
            pageOpenPage.close();
        }
        pdfRenderer.close();
        return arrayList;
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

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull hpg hpgVar) {
        Intrinsics.checkNotNullParameter(hpgVar, "<this>");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sui.V;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(PROTOCOL_URL) : null;
        Intrinsics.checkNotNull(string);
        OpenPDFProtocolAdapter openPDFProtocolAdapter = new OpenPDFProtocolAdapter();
        getMBinding().A.setAdapter(openPDFProtocolAdapter);
        RecyclerView recyclerView = getMBinding().A;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        recyclerView.setLayoutManager(new LinearLayoutManager(mActivity, 1, false));
        File pDFResFile = getPDFResFile(string);
        if (!pDFResFile.exists()) {
            AnyExtKt.io$default(null, new C26632(string, pDFResFile, openPDFProtocolAdapter, null), 1, null);
            return;
        }
        try {
            openPDFProtocolAdapter.updateCurrentList(loadPDF(string));
            Unit unit = Unit.INSTANCE;
        } catch (Exception unused) {
            AnyExtKt.io$default(null, new AnonymousClass1(string, pDFResFile, openPDFProtocolAdapter, null), 1, null);
        }
    }
}
