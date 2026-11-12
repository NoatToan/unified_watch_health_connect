package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import e23.l;
import e23.p;
import ge1.b;
import j23.t;
import o13.r;
import o53.b0;
import o53.v1;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.g1;
import p3.p0;
import p3.p1;
import p3.x3;
import s1.l0;
import t13.d;
import t13.g;
import t13.h;
import u1.k1;
import u1.l1;
import u13.a;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b@\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJl\u0010\u001a\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u0006*\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010%R+\u0010)\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u0010\t\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u0010\u000f\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010(\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R+\u0010\u0010\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*\"\u0004\b7\u0010,R/\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010&\u001a\u0004\u0018\u00010\u00128V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010\u0011\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010(\u001a\u0004\b>\u0010?\"\u0004\b@\u0010%R+\u0010\u0019\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010(\u001a\u0004\bB\u0010*\"\u0004\bC\u0010,R\u001b\u0010G\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010?R/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010&\u001a\u0004\u0018\u00010\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010(\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR+\u0010P\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010(\u001a\u0004\bN\u0010?\"\u0004\bO\u0010%R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010(\u001a\u0004\bR\u0010?\"\u0004\bS\u0010%R+\u0010Y\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001e8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010(\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001b\u0010\\\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010E\u001a\u0004\b[\u0010?R\u001b\u0010^\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b]\u0010E\u001a\u0004\b^\u0010*R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006e"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatableImpl;", "Lcom/airbnb/lottie/compose/LottieAnimatable;", "<init>", "()V", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "progress", "", "iteration", "", "resetLastFrameNanos", "", "snapTo", "(Lcom/airbnb/lottie/LottieComposition;FIZLt13/d;)Ljava/lang/Object;", "iterations", "reverseOnRepeat", "speed", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "initialProgress", "continueFromPreviousAnimate", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "cancellationBehavior", "ignoreSystemAnimationsDisabled", "useCompositionFrameRate", "animate", "(Lcom/airbnb/lottie/LottieComposition;IIZFLcom/airbnb/lottie/compose/LottieClipSpec;FZLcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLt13/d;)Ljava/lang/Object;", "doFrame", "(ILt13/d;)Ljava/lang/Object;", "", "frameNanos", "onFrame", "(IJ)Z", "roundToCompositionFrameRate", "(FLcom/airbnb/lottie/LottieComposition;)F", "updateProgress", "(F)V", "<set-?>", "isPlaying$delegate", "Lp3/p1;", "isPlaying", "()Z", "setPlaying", "(Z)V", "iteration$delegate", "getIteration", "()I", "setIteration", "(I)V", "iterations$delegate", "getIterations", "setIterations", "reverseOnRepeat$delegate", "getReverseOnRepeat", "setReverseOnRepeat", "clipSpec$delegate", "getClipSpec", "()Lcom/airbnb/lottie/compose/LottieClipSpec;", "setClipSpec", "(Lcom/airbnb/lottie/compose/LottieClipSpec;)V", "speed$delegate", "getSpeed", "()F", "setSpeed", "useCompositionFrameRate$delegate", "getUseCompositionFrameRate", "setUseCompositionFrameRate", "frameSpeed$delegate", "Lp3/x3;", "getFrameSpeed", "frameSpeed", "composition$delegate", "getComposition", "()Lcom/airbnb/lottie/LottieComposition;", "setComposition", "(Lcom/airbnb/lottie/LottieComposition;)V", "progressRaw$delegate", "getProgressRaw", "setProgressRaw", "progressRaw", "progress$delegate", "getProgress", "setProgress", "lastFrameNanos$delegate", "getLastFrameNanos", "()J", "setLastFrameNanos", "(J)V", "lastFrameNanos", "endProgress$delegate", "getEndProgress", "endProgress", "isAtEnd$delegate", "isAtEnd", "Lu1/l1;", "mutex", "Lu1/l1;", "getValue", "()Ljava/lang/Float;", "value", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class LottieAnimatableImpl implements LottieAnimatable {

    /* JADX INFO: renamed from: clipSpec$delegate, reason: from kotlin metadata */
    private final p1 clipSpec;

    /* JADX INFO: renamed from: composition$delegate, reason: from kotlin metadata */
    private final p1 composition;

    /* JADX INFO: renamed from: endProgress$delegate, reason: from kotlin metadata */
    private final x3 endProgress;

    /* JADX INFO: renamed from: frameSpeed$delegate, reason: from kotlin metadata */
    private final x3 frameSpeed;

    /* JADX INFO: renamed from: isAtEnd$delegate, reason: from kotlin metadata */
    private final x3 isAtEnd;

    /* JADX INFO: renamed from: isPlaying$delegate, reason: from kotlin metadata */
    private final p1 isPlaying;

    /* JADX INFO: renamed from: iteration$delegate, reason: from kotlin metadata */
    private final p1 iteration;

    /* JADX INFO: renamed from: iterations$delegate, reason: from kotlin metadata */
    private final p1 iterations;

    /* JADX INFO: renamed from: lastFrameNanos$delegate, reason: from kotlin metadata */
    private final p1 lastFrameNanos;
    private final l1 mutex;

    /* JADX INFO: renamed from: progress$delegate, reason: from kotlin metadata */
    private final p1 progress;

    /* JADX INFO: renamed from: progressRaw$delegate, reason: from kotlin metadata */
    private final p1 progressRaw;

    /* JADX INFO: renamed from: reverseOnRepeat$delegate, reason: from kotlin metadata */
    private final p1 reverseOnRepeat;

    /* JADX INFO: renamed from: speed$delegate, reason: from kotlin metadata */
    private final p1 speed;

    /* JADX INFO: renamed from: useCompositionFrameRate$delegate, reason: from kotlin metadata */
    private final p1 useCompositionFrameRate;

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @e(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", l = {269}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements l<d<? super Unit>, Object> {
        final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
        final /* synthetic */ LottieClipSpec $clipSpec;
        final /* synthetic */ LottieComposition $composition;
        final /* synthetic */ boolean $continueFromPreviousAnimate;
        final /* synthetic */ float $initialProgress;
        final /* synthetic */ int $iteration;
        final /* synthetic */ int $iterations;
        final /* synthetic */ boolean $reverseOnRepeat;
        final /* synthetic */ float $speed;
        final /* synthetic */ boolean $useCompositionFrameRate;
        int label;

        /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
        @e(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", l = {277}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends i implements p<b0, d<? super Unit>, Object> {
            final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
            final /* synthetic */ int $iteration;
            final /* synthetic */ int $iterations;
            final /* synthetic */ o53.l1 $parentJob;
            int label;
            final /* synthetic */ LottieAnimatableImpl this$0;

            /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1$WhenMappings */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LottieCancellationBehavior.values().length];
                    try {
                        iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LottieCancellationBehavior lottieCancellationBehavior, o53.l1 l1Var, int i14, int i15, LottieAnimatableImpl lottieAnimatableImpl, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$cancellationBehavior = lottieCancellationBehavior;
                this.$parentJob = l1Var;
                this.$iterations = i14;
                this.$iteration = i15;
                this.this$0 = lottieAnimatableImpl;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.$cancellationBehavior, this.$parentJob, this.$iterations, this.$iteration, this.this$0, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0023  */
            /* JADX WARN: Code duplicated, block: B:15:0x0031 A[ADDED_TO_REGION, REMOVE] */
            /* JADX WARN: Code duplicated, block: B:18:0x003d A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:21:0x0046  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003b -> B:19:0x003e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x0046
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    u13.a r0 = u13.a.COROUTINE_SUSPENDED
                    int r1 = r3.label
                    r2 = 1
                    if (r1 == 0) goto L14
                    if (r1 != r2) goto Ld
                    o13.r.b(r4)
                    goto L3e
                Ld:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r4)
                    r4 = 0
                    return r4
                L14:
                    o13.r.b(r4)
                L17:
                    com.airbnb.lottie.compose.LottieCancellationBehavior r4 = r3.$cancellationBehavior
                    int[] r1 = com.airbnb.lottie.compose.LottieAnimatableImpl.AnonymousClass2.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0
                    int r4 = r4.ordinal()
                    r4 = r1[r4]
                    if (r4 != r2) goto L31
                    o53.l1 r4 = r3.$parentJob
                    boolean r4 = r4.isActive()
                    if (r4 == 0) goto L2e
                    int r4 = r3.$iterations
                    goto L33
                L2e:
                    int r4 = r3.$iteration
                    goto L33
                L31:
                    int r4 = r3.$iterations
                L33:
                    com.airbnb.lottie.compose.LottieAnimatableImpl r1 = r3.this$0
                    r3.label = r2
                    java.lang.Object r4 = com.airbnb.lottie.compose.LottieAnimatableImpl.access$doFrame(r1, r4, r3)
                    if (r4 != r0) goto L3e
                    return r0
                L3e:
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 != 0) goto L17
                    kotlin.Unit r4 = p005kotlin.Unit.INSTANCE
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieAnimatableImpl.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$WhenMappings */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LottieCancellationBehavior.values().length];
                try {
                    iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LottieCancellationBehavior.Immediately.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i14, int i15, boolean z14, float f14, LottieClipSpec lottieClipSpec, LottieComposition lottieComposition, float f15, boolean z15, boolean z16, LottieCancellationBehavior lottieCancellationBehavior, d<? super AnonymousClass2> dVar) {
            super(1, dVar);
            this.$iteration = i14;
            this.$iterations = i15;
            this.$reverseOnRepeat = z14;
            this.$speed = f14;
            this.$clipSpec = lottieClipSpec;
            this.$composition = lottieComposition;
            this.$initialProgress = f15;
            this.$useCompositionFrameRate = z15;
            this.$continueFromPreviousAnimate = z16;
            this.$cancellationBehavior = lottieCancellationBehavior;
        }

        @Override // v13.a
        public final d<Unit> create(d<?> dVar) {
            return LottieAnimatableImpl.this.new AnonymousClass2(this.$iteration, this.$iterations, this.$reverseOnRepeat, this.$speed, this.$clipSpec, this.$composition, this.$initialProgress, this.$useCompositionFrameRate, this.$continueFromPreviousAnimate, this.$cancellationBehavior, dVar);
        }

        @Override // e23.l
        public final Object invoke(d<? super Unit> dVar) {
            return ((AnonymousClass2) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            g gVar;
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    LottieAnimatableImpl.this.setIteration(this.$iteration);
                    LottieAnimatableImpl.this.setIterations(this.$iterations);
                    LottieAnimatableImpl.this.setReverseOnRepeat(this.$reverseOnRepeat);
                    LottieAnimatableImpl.this.setSpeed(this.$speed);
                    LottieAnimatableImpl.this.setClipSpec(this.$clipSpec);
                    LottieAnimatableImpl.this.setComposition(this.$composition);
                    LottieAnimatableImpl.this.updateProgress(this.$initialProgress);
                    LottieAnimatableImpl.this.setUseCompositionFrameRate(this.$useCompositionFrameRate);
                    if (!this.$continueFromPreviousAnimate) {
                        LottieAnimatableImpl.this.setLastFrameNanos(Long.MIN_VALUE);
                    }
                    if (this.$composition == null) {
                        LottieAnimatableImpl.this.setPlaying(false);
                        return Unit.INSTANCE;
                    }
                    boolean zIsInfinite = Float.isInfinite(this.$speed);
                    LottieAnimatableImpl lottieAnimatableImpl = LottieAnimatableImpl.this;
                    if (zIsInfinite) {
                        lottieAnimatableImpl.updateProgress(lottieAnimatableImpl.getEndProgress());
                        LottieAnimatableImpl.this.setPlaying(false);
                        LottieAnimatableImpl.this.setIteration(this.$iterations);
                        return Unit.INSTANCE;
                    }
                    lottieAnimatableImpl.setPlaying(true);
                    int i15 = WhenMappings.$EnumSwitchMapping$0[this.$cancellationBehavior.ordinal()];
                    if (i15 == 1) {
                        gVar = v1.f129418a;
                    } else {
                        if (i15 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gVar = h.f161748a;
                    }
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cancellationBehavior, g8.i.G(getF129302c()), this.$iterations, this.$iteration, LottieAnimatableImpl.this, null);
                    this.label = 1;
                    if (b.e0(gVar, anonymousClass1, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                g8.i.v(getF129302c());
                LottieAnimatableImpl.this.setPlaying(false);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                LottieAnimatableImpl.this.setPlaying(false);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$isAtEnd$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C38722 extends w implements e23.a<Boolean> {
        public C38722() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final Boolean invoke() {
            return Boolean.valueOf(LottieAnimatableImpl.this.getIteration() == LottieAnimatableImpl.this.getIterations() && LottieAnimatableImpl.this.getProgress() == LottieAnimatableImpl.this.getEndProgress());
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @e(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", l = {}, m = "invokeSuspend")
    public static final class C38732 extends i implements l<d<? super Unit>, Object> {
        final /* synthetic */ LottieComposition $composition;
        final /* synthetic */ int $iteration;
        final /* synthetic */ float $progress;
        final /* synthetic */ boolean $resetLastFrameNanos;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38732(LottieComposition lottieComposition, float f14, int i14, boolean z14, d<? super C38732> dVar) {
            super(1, dVar);
            this.$composition = lottieComposition;
            this.$progress = f14;
            this.$iteration = i14;
            this.$resetLastFrameNanos = z14;
        }

        @Override // v13.a
        public final d<Unit> create(d<?> dVar) {
            return LottieAnimatableImpl.this.new C38732(this.$composition, this.$progress, this.$iteration, this.$resetLastFrameNanos, dVar);
        }

        @Override // e23.l
        public final Object invoke(d<? super Unit> dVar) {
            return ((C38732) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            LottieAnimatableImpl.this.setComposition(this.$composition);
            LottieAnimatableImpl.this.updateProgress(this.$progress);
            LottieAnimatableImpl.this.setIteration(this.$iteration);
            LottieAnimatableImpl.this.setPlaying(false);
            if (this.$resetLastFrameNanos) {
                LottieAnimatableImpl.this.setLastFrameNanos(Long.MIN_VALUE);
            }
            return Unit.INSTANCE;
        }
    }

    public LottieAnimatableImpl() {
        Boolean bool = Boolean.FALSE;
        this.isPlaying = p0.n(bool);
        this.iteration = p0.n(1);
        this.iterations = p0.n(1);
        this.reverseOnRepeat = p0.n(bool);
        this.clipSpec = p0.n(null);
        this.speed = p0.n(Float.valueOf(1.0f));
        this.useCompositionFrameRate = p0.n(bool);
        this.frameSpeed = p0.f(new LottieAnimatableImpl$frameSpeed$2(this));
        this.composition = p0.n(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.progressRaw = p0.n(fValueOf);
        this.progress = p0.n(fValueOf);
        this.lastFrameNanos = p0.n(Long.MIN_VALUE);
        this.endProgress = p0.f(new LottieAnimatableImpl$endProgress$2(this));
        this.isAtEnd = p0.f(new C38722());
        this.mutex = new l1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doFrame(int i14, d<? super Boolean> dVar) {
        if (i14 == Integer.MAX_VALUE) {
            return l0.a(new C38712(i14), dVar);
        }
        return g1.a(dVar.getF129302c()).v(new AnonymousClass3(i14), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getEndProgress() {
        return ((Number) this.endProgress.getF182175a()).floatValue();
    }

    private final float getFrameSpeed() {
        return ((Number) this.frameSpeed.getF182175a()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float getProgressRaw() {
        return ((Number) this.progressRaw.getF182175a()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onFrame(int iterations, long frameNanos) {
        LottieComposition composition = getComposition();
        if (composition == null) {
            return true;
        }
        long lastFrameNanos = getLastFrameNanos() == Long.MIN_VALUE ? 0L : frameNanos - getLastFrameNanos();
        setLastFrameNanos(frameNanos);
        LottieClipSpec clipSpec = getClipSpec();
        float minProgress$lottie_compose_release = clipSpec != null ? clipSpec.getMinProgress$lottie_compose_release(composition) : 0.0f;
        LottieClipSpec clipSpec2 = getClipSpec();
        float maxProgress$lottie_compose_release = clipSpec2 != null ? clipSpec2.getMaxProgress$lottie_compose_release(composition) : 1.0f;
        float duration = ((lastFrameNanos / ((long) 1000000)) / composition.getDuration()) * getFrameSpeed();
        float progressRaw = getFrameSpeed() < 0.0f ? minProgress$lottie_compose_release - (getProgressRaw() + duration) : (getProgressRaw() + duration) - maxProgress$lottie_compose_release;
        if (progressRaw < 0.0f) {
            updateProgress(t.d(getProgressRaw(), minProgress$lottie_compose_release, maxProgress$lottie_compose_release) + duration);
        } else {
            float f14 = maxProgress$lottie_compose_release - minProgress$lottie_compose_release;
            int i14 = (int) (progressRaw / f14);
            int i15 = i14 + 1;
            if (getIteration() + i15 > iterations) {
                updateProgress(getEndProgress());
                setIteration(iterations);
                return false;
            }
            setIteration(getIteration() + i15);
            float f15 = progressRaw - (i14 * f14);
            updateProgress(getFrameSpeed() < 0.0f ? maxProgress$lottie_compose_release - f15 : minProgress$lottie_compose_release + f15);
        }
        return true;
    }

    private final float roundToCompositionFrameRate(float f14, LottieComposition lottieComposition) {
        if (lottieComposition == null) {
            return f14;
        }
        return f14 - (f14 % (1 / lottieComposition.getFrameRate()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipSpec(LottieClipSpec lottieClipSpec) {
        this.clipSpec.setValue(lottieClipSpec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComposition(LottieComposition lottieComposition) {
        this.composition.setValue(lottieComposition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIteration(int i14) {
        this.iteration.setValue(Integer.valueOf(i14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIterations(int i14) {
        this.iterations.setValue(Integer.valueOf(i14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastFrameNanos(long j8) {
        this.lastFrameNanos.setValue(Long.valueOf(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaying(boolean z14) {
        this.isPlaying.setValue(Boolean.valueOf(z14));
    }

    private void setProgress(float f14) {
        this.progress.setValue(Float.valueOf(f14));
    }

    private final void setProgressRaw(float f14) {
        this.progressRaw.setValue(Float.valueOf(f14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReverseOnRepeat(boolean z14) {
        this.reverseOnRepeat.setValue(Boolean.valueOf(z14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(float f14) {
        this.speed.setValue(Float.valueOf(f14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCompositionFrameRate(boolean z14) {
        this.useCompositionFrameRate.setValue(Boolean.valueOf(z14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateProgress(float progress) {
        setProgressRaw(progress);
        if (getUseCompositionFrameRate()) {
            progress = roundToCompositionFrameRate(progress, getComposition());
        }
        setProgress(progress);
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    public Object animate(LottieComposition lottieComposition, int i14, int i15, boolean z14, float f14, LottieClipSpec lottieClipSpec, float f15, boolean z15, LottieCancellationBehavior lottieCancellationBehavior, boolean z16, boolean z17, d<? super Unit> dVar) {
        Object objB = this.mutex.b(k1.Default, new AnonymousClass2(i14, i15, z14, f14, lottieClipSpec, lottieComposition, f15, z17, z15, lottieCancellationBehavior, null), dVar);
        return objB == a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public LottieClipSpec getClipSpec() {
        return (LottieClipSpec) this.clipSpec.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public LottieComposition getComposition() {
        return (LottieComposition) this.composition.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIteration() {
        return ((Number) this.iteration.getF182175a()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIterations() {
        return ((Number) this.iterations.getF182175a()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public long getLastFrameNanos() {
        return ((Number) this.lastFrameNanos.getF182175a()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getProgress() {
        return ((Number) this.progress.getF182175a()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean getReverseOnRepeat() {
        return ((Boolean) this.reverseOnRepeat.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getSpeed() {
        return ((Number) this.speed.getF182175a()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean getUseCompositionFrameRate() {
        return ((Boolean) this.useCompositionFrameRate.getF182175a()).booleanValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.compose.LottieAnimatable, com.airbnb.lottie.compose.LottieAnimationState, p3.x3
    /* JADX INFO: renamed from: getValue */
    public Float getF182175a() {
        return Float.valueOf(getProgress());
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isAtEnd() {
        return ((Boolean) this.isAtEnd.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isPlaying() {
        return ((Boolean) this.isPlaying.getF182175a()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    public Object snapTo(LottieComposition lottieComposition, float f14, int i14, boolean z14, d<? super Unit> dVar) {
        Object objB = this.mutex.b(k1.Default, new C38732(lottieComposition, f14, i14, z14, null), dVar);
        return objB == a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "frameNanos", "", "invoke", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C38712 extends w implements l<Long, Boolean> {
        final /* synthetic */ int $iterations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38712(int i14) {
            super(1);
            this.$iterations = i14;
        }

        public final Boolean invoke(long j8) {
            return Boolean.valueOf(LottieAnimatableImpl.this.onFrame(this.$iterations, j8));
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Boolean invoke(Long l14) {
            return invoke(l14.longValue());
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "frameNanos", "", "invoke", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends w implements l<Long, Boolean> {
        final /* synthetic */ int $iterations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i14) {
            super(1);
            this.$iterations = i14;
        }

        public final Boolean invoke(long j8) {
            return Boolean.valueOf(LottieAnimatableImpl.this.onFrame(this.$iterations, j8));
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Boolean invoke(Long l14) {
            return invoke(l14.longValue());
        }
    }
}
