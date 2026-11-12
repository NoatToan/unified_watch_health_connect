package com.huami.jac.repo.repo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.jac.repo.config.JacConfig;
import com.huami.jac.repo.exception.JacLoginException;
import com.huami.jac.repo.exception.JacNoBondingException;
import com.huami.jac.repo.exception.JacNoSupportException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\u0004\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/huami/jac/repo/repo/JacCardCheckRepoImpl;", "Lcom/huami/jac/repo/repo/JacCardCheckRepo;", "", GoogleApiAvailabilityLight.a, "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "b", "", "action", "", "checkConditionList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "Companion", "jac-repo_release"}, k = 1, mv = {1, 5, 1})
public final class JacCardCheckRepoImpl implements JacCardCheckRepo {
    public static final int CHECK_BT_COUNT = 10;
    public static final long CHECK_BT_TIME = 2000;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.jac.repo.repo.JacCardCheckRepoImpl", f = "JacCardCheckRepoImpl.kt", i = {}, l = {37}, m = "checkBt", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return JacCardCheckRepoImpl.this.a(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.jac.repo.repo.JacCardCheckRepoImpl", f = "JacCardCheckRepoImpl.kt", i = {}, l = {24}, m = "checkConditionList", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return JacCardCheckRepoImpl.this.checkConditionList(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0065 -> B:21:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.huami.jac.repo.repo.JacCardCheckRepoImpl.a
            if (r0 == 0) goto L13
            r0 = r8
            com.huami.jac.repo.repo.JacCardCheckRepoImpl$a r0 = (com.huami.jac.repo.repo.JacCardCheckRepoImpl.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.huami.jac.repo.repo.JacCardCheckRepoImpl$a r0 = new com.huami.jac.repo.repo.JacCardCheckRepoImpl$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r2 = r0.b
            int r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L68
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = 10
            r2 = 0
            r2 = 10
            r4 = 0
        L3e:
            if (r4 >= r2) goto L6d
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            r8.intValue()
            com.huami.jac.repo.config.JacConfig r8 = com.huami.jac.repo.config.JacConfig.INSTANCE
            kotlin.jvm.functions.Function0 r8 = r8.isBtConnected()
            java.lang.Object r8 = r8.invoke()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L6a
            r5 = 2000(0x7d0, double:9.88E-321)
            r0.a = r4
            r0.b = r2
            r0.e = r3
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r8 != r1) goto L68
            return r1
        L68:
            int r4 = r4 + r3
            goto L3e
        L6a:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L6d:
            com.huami.jac.repo.config.JacConfig r8 = com.huami.jac.repo.config.JacConfig.INSTANCE
            kotlin.jvm.functions.Function0 r8 = r8.isBtConnected()
            java.lang.Object r8 = r8.invoke()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L82
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L82:
            com.huami.jac.repo.exception.JacBtException r8 = new com.huami.jac.repo.exception.JacBtException
            r0 = 3
            r1 = 0
            r8.<init>(r1, r1, r0, r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.jac.repo.repo.JacCardCheckRepoImpl.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void b() throws JacNoSupportException {
        if (!JacConfig.INSTANCE.isDeviceSupport().invoke().booleanValue()) {
            throw new JacNoSupportException(null, null, 3, null);
        }
    }

    private final void c() throws JacNoBondingException {
        if (!JacConfig.INSTANCE.isHasBondingDevice().invoke().booleanValue()) {
            throw new JacNoBondingException(null, null, 3, null);
        }
    }

    private final void d() throws JacLoginException {
        if (!JacConfig.INSTANCE.isLogin().invoke().booleanValue()) {
            throw new JacLoginException(null, null, 3, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.jac.repo.repo.JacCardCheckRepo
    @Nullable
    public Object checkConditionList(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) throws JacNoSupportException, JacLoginException, JacNoBondingException {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            d();
            c();
            b();
            bVar.c = 1;
            if (a(bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(true);
    }
}
