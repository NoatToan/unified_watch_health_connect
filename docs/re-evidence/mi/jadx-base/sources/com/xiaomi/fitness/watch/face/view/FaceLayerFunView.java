package com.xiaomi.fitness.watch.face.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import coil.ImageLoader;
import coil.ImageLoaders;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.watch.face.data.FaceFunUtilKt;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002JA\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000fj\b\u0012\u0004\u0012\u00020\u0007`\u001d¢\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007J\u0018\u0010\"\u001a\u0004\u0018\u00010\u00122\u0006\u0010!\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0014J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)H\u0014J\b\u0010*\u001a\u00020\u0019H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/watch/face/view/FaceLayerFunView;", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "iconStyle", "iconColor", "functions", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Functions;", "bitmaps", "Landroid/graphics/drawable/Drawable;", "getIconPath", "", "id", "getScaledSize", MediaStoreUtil.MediaInfo.SIZE, "setData", "", "serverData", "", "selectedList", "Lkotlin/collections/ArrayList;", "([Lcom/xiaomi/fitness/watch/face/export/data/FaceData$Functions;IILjava/util/ArrayList;)V", "setItem", "funPos", "funId", "getBitDrawable", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onDetachedFromWindow", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceLayerFunView extends FaceInfoView {

    @NotNull
    private final ArrayList<Drawable> bitmaps;

    @NotNull
    private final ArrayList<FaceData.Functions> functions;
    private int iconColor;
    private int iconStyle;

    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.view.FaceLayerFunView$getBitDrawable$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.view.FaceLayerFunView", f = "FaceLayerFunView.kt", i = {0, 0, 0}, l = {74}, m = "getBitDrawable", n = {"this", "icon", "funId"}, s = {"L$0", "L$1", "I$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FaceLayerFunView.this.getBitDrawable(0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.view.FaceLayerFunView$setData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.view.FaceLayerFunView$setData$1", f = "FaceLayerFunView.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList<Integer> $selectedList;
        final /* synthetic */ FaceData.Functions[] $serverData;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.view.FaceLayerFunView$setData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.watch.face.view.FaceLayerFunView$setData$1$1", f = "FaceLayerFunView.kt", i = {0}, l = {50}, m = "invokeSuspend", n = {"pos"}, s = {"I$0"})
        public static final class C08141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ArrayList<Integer> $selectedList;
            final /* synthetic */ FaceData.Functions[] $serverData;
            int I$0;
            int I$1;
            Object L$0;
            int label;
            final /* synthetic */ FaceLayerFunView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08141(FaceData.Functions[] functionsArr, ArrayList<Integer> arrayList, FaceLayerFunView faceLayerFunView, Continuation<? super C08141> continuation) {
                super(2, continuation);
                this.$serverData = functionsArr;
                this.$selectedList = arrayList;
                this.this$0 = faceLayerFunView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08141(this.$serverData, this.$selectedList, this.this$0, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x002a  */
            /* JADX WARN: Code duplicated, block: B:12:0x0036  */
            /* JADX WARN: Code duplicated, block: B:13:0x003f  */
            /* JADX WARN: Code duplicated, block: B:16:0x006c A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:17:0x006d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006d -> B:18:0x0070). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r8.label
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 != r3) goto L18
                    int r1 = r8.I$1
                    int r4 = r8.I$0
                    java.lang.Object r5 = r8.L$0
                    java.util.ArrayList r5 = (java.util.ArrayList) r5
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L70
                L18:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L20:
                    kotlin.ResultKt.throwOnFailure(r9)
                    com.xiaomi.fitness.watch.face.export.data.FaceData$Functions[] r9 = r8.$serverData
                    int r9 = r9.length
                    r1 = r9
                    r4 = r2
                L28:
                    if (r4 >= r1) goto L75
                    com.xiaomi.fitness.watch.face.export.data.FaceData$Functions[] r9 = r8.$serverData
                    r9 = r9[r4]
                    java.util.ArrayList<java.lang.Integer> r5 = r8.$selectedList
                    int r5 = r5.size()
                    if (r4 >= r5) goto L3f
                    java.util.ArrayList<java.lang.Integer> r5 = r8.$selectedList
                    java.lang.Object r5 = r5.get(r4)
                    java.lang.Integer r5 = (java.lang.Integer) r5
                    goto L43
                L3f:
                    java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
                L43:
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                    int r5 = r5.intValue()
                    r9.setId(r5)
                    com.xiaomi.fitness.watch.face.view.FaceLayerFunView r6 = r8.this$0
                    java.util.ArrayList r6 = com.xiaomi.fitness.watch.face.view.FaceLayerFunView.access$getFunctions$p(r6)
                    r6.add(r9)
                    com.xiaomi.fitness.watch.face.view.FaceLayerFunView r9 = r8.this$0
                    java.util.ArrayList r9 = com.xiaomi.fitness.watch.face.view.FaceLayerFunView.access$getBitmaps$p(r9)
                    com.xiaomi.fitness.watch.face.view.FaceLayerFunView r6 = r8.this$0
                    r8.L$0 = r9
                    r8.I$0 = r4
                    r8.I$1 = r1
                    r8.label = r3
                    java.lang.Object r5 = com.xiaomi.fitness.watch.face.view.FaceLayerFunView.access$getBitDrawable(r6, r5, r8)
                    if (r5 != r0) goto L6d
                    return r0
                L6d:
                    r7 = r5
                    r5 = r9
                    r9 = r7
                L70:
                    r5.add(r9)
                    int r4 = r4 + r3
                    goto L28
                L75:
                    kotlin.Unit r9 = kotlin.Unit.INSTANCE
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.watch.face.view.FaceLayerFunView.C33981.C08141.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C08141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33981(FaceData.Functions[] functionsArr, ArrayList<Integer> arrayList, Continuation<? super C33981> continuation) {
            super(2, continuation);
            this.$serverData = functionsArr;
            this.$selectedList = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceLayerFunView.this.new C33981(this.$serverData, this.$selectedList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C08141 c08141 = new C08141(this.$serverData, this.$selectedList, FaceLayerFunView.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c08141, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FaceLayerFunView.this.invalidate();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.view.FaceLayerFunView$setItem$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.view.FaceLayerFunView$setItem$1", f = "FaceLayerFunView.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $funId;
        final /* synthetic */ int $funPos;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.view.FaceLayerFunView$setItem$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.watch.face.view.FaceLayerFunView$setItem$1$1", f = "FaceLayerFunView.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $funId;
            final /* synthetic */ int $funPos;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ FaceLayerFunView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08151(FaceLayerFunView faceLayerFunView, int i, int i2, Continuation<? super C08151> continuation) {
                super(2, continuation);
                this.this$0 = faceLayerFunView;
                this.$funPos = i;
                this.$funId = i2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08151(this.this$0, this.$funPos, this.$funId, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ArrayList arrayList;
                int i;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ((FaceData.Functions) this.this$0.functions.get(this.$funPos)).setId(this.$funId);
                    arrayList = this.this$0.bitmaps;
                    int i3 = this.$funPos;
                    FaceLayerFunView faceLayerFunView = this.this$0;
                    int i4 = this.$funId;
                    this.L$0 = arrayList;
                    this.I$0 = i3;
                    this.label = 1;
                    Object bitDrawable = faceLayerFunView.getBitDrawable(i4, this);
                    if (bitDrawable == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = i3;
                    obj = bitDrawable;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    arrayList = (ArrayList) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                arrayList.set(i, obj);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C08151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33991(int i, int i2, Continuation<? super C33991> continuation) {
            super(2, continuation);
            this.$funPos = i;
            this.$funId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceLayerFunView.this.new C33991(this.$funPos, this.$funId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C08151 c08151 = new C08151(FaceLayerFunView.this, this.$funPos, this.$funId, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c08151, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FaceLayerFunView.this.invalidate();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceLayerFunView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getBitDrawable(int i, Continuation<? super Drawable> continuation) {
        AnonymousClass1 anonymousClass1;
        File file;
        FaceLayerFunView faceLayerFunView;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            File file2 = new File(getIconPath(this.iconColor, this.iconStyle, i));
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ImageLoader imageLoaderCreate = ImageLoaders.create(context);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ImageRequest imageRequestBuild = new ImageRequest.Builder(context2).data(file2).build();
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = file2;
            anonymousClass1.I$0 = i;
            anonymousClass1.label = 1;
            Object objExecute = imageLoaderCreate.execute(imageRequestBuild, anonymousClass1);
            if (objExecute == coroutine_suspended) {
                return coroutine_suspended;
            }
            file = file2;
            obj = objExecute;
            faceLayerFunView = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = anonymousClass1.I$0;
            file = (File) anonymousClass1.L$1;
            faceLayerFunView = (FaceLayerFunView) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        SuccessResult successResult = obj instanceof SuccessResult ? (SuccessResult) obj : null;
        Drawable drawable = successResult != null ? successResult.getDrawable() : null;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        if (i == 0 || !file.exists() || bitmap == null) {
            return null;
        }
        return new BitmapDrawable(faceLayerFunView.getResources(), bitmap);
    }

    private final String getIconPath(int iconColor, int iconStyle, int id) {
        return FaceFunUtilKt.getICON_PATH() + File.separator + "face_data_" + iconColor + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + iconStyle + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + id + ".png";
    }

    private final int getScaledSize(int size) {
        return (int) (FaceManager.getScaledSize((FaceIcon.ORI_WIDTH / 454) * size) * 0.85f);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
    }

    @Override // com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView, android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int size = this.functions.size();
        for (int i = 0; i < size; i++) {
            FaceData.Functions functions = this.functions.get(i);
            Intrinsics.checkNotNullExpressionValue(functions, "get(...)");
            FaceData.Functions functions2 = functions;
            Drawable drawable = this.bitmaps.get(i);
            if (drawable != null) {
                int scaledSize = getScaledSize(drawable.getIntrinsicWidth());
                int scaledSize2 = getScaledSize(drawable.getIntrinsicHeight()) >>> 1;
                float w = getW() * functions2.getX();
                float h = getH() * functions2.getY();
                float f = scaledSize >>> 1;
                float f2 = scaledSize2;
                drawable.setBounds((int) (w - f), (int) (h - f2), (int) (w + f), (int) (h + f2));
                drawable.draw(canvas);
            }
        }
    }

    @Override // com.xiaomi.fitness.watch.face.export.exportview.FaceIcon, android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(getW(), getH());
    }

    public final void setData(@NotNull FaceData.Functions[] serverData, int iconColor, int iconStyle, @NotNull ArrayList<Integer> selectedList) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        Intrinsics.checkNotNullParameter(selectedList, "selectedList");
        this.iconColor = iconColor;
        this.iconStyle = iconStyle;
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C33981(serverData, selectedList, null), 3, null);
    }

    public final void setItem(int funPos, int funId) {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C33991(funPos, funId, null), 3, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceLayerFunView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceLayerFunView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scope = CoroutineScopeKt.MainScope();
        this.iconStyle = 1;
        this.iconColor = 1;
        this.functions = new ArrayList<>();
        this.bitmaps = new ArrayList<>();
    }

    public /* synthetic */ FaceLayerFunView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
