package com.xiaomi.fitness.nfc.ui;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.BulletinResponseInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.UncompletedOrderList;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.nfc.bean.CardSwitcherBean;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.TransitViewModel;
import defpackage.bg4;
import defpackage.o0j;
import defpackage.o4h;
import defpackage.s3q;
import defpackage.vqg;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J0\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000eJ0\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000f2\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00050\u000eJ*\u0010\u0014\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000eJ\"\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u000eJ\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0016J$\u0010\"\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0014\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\u000eJ\u0016\u0010$\u001a\u00020%2\u0006\u0010\t\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010&R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/TransitViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "setDefailtCard", "cardWrapper", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "success", "Lkotlin/Function0;", "fail", "Lkotlin/Function1;", "", "loadBulletDialog", "tag", "", "Lcom/miui/tsmclient/entity/BulletinResponseInfo$BulletinInfo;", "loadBullet", "loadCardSwitchList", "supportCallback", "", "cardSwitchRet", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/nfc/bean/CardSwitcherBean;", "getCardSwitchRet", "()Landroidx/lifecycle/MutableLiveData;", "cardSwitchRet$delegate", "Lkotlin/Lazy;", LifecycleConstantKt.ON_DESTROY, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "checkUncompletedTypeCanRemove", "remindMessage", "getUncompletedOrderList", "Lcom/miui/tsmclient/model/BaseResponse;", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransitViewModel extends AbsViewModel {

    /* JADX INFO: renamed from: cardSwitchRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cardSwitchRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hzp
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransitViewModel.cardSwitchRet_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.TransitViewModel$checkUncompletedTypeCanRemove$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.TransitViewModel$checkUncompletedTypeCanRemove$1", f = "TransitViewModel.kt", i = {}, l = {SportReportBaseParser.ReportType.avgDivingDepth}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTransitViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitViewModel.kt\ncom/xiaomi/fitness/nfc/ui/TransitViewModel$checkUncompletedTypeCanRemove$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n1863#2,2:221\n1#3:223\n*S KotlinDebug\n*F\n+ 1 TransitViewModel.kt\ncom/xiaomi/fitness/nfc/ui/TransitViewModel$checkUncompletedTypeCanRemove$1\n*L\n193#1:221,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cardWrapper;
        final /* synthetic */ Function1<String, Unit> $remindMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(CardWrapper cardWrapper, Function1<? super String, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cardWrapper = cardWrapper;
            this.$remindMessage = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransitViewModel.this.new AnonymousClass1(this.$cardWrapper, this.$remindMessage, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v5, types: [T, java.lang.String] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object[] objArr;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TransitViewModel transitViewModel = TransitViewModel.this;
                CardWrapper cardWrapper = this.$cardWrapper;
                this.label = 1;
                obj = transitViewModel.getUncompletedOrderList(cardWrapper, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BaseResponse baseResponse = (BaseResponse) obj;
            if (!baseResponse.isSuccess() || (objArr = baseResponse.mDatas) == null || objArr.length == 0) {
                Function1<String, Unit> function1 = this.$remindMessage;
                String string = baseResponse.mMsg;
                if (string.length() == 0) {
                    string = ApplicationExtKt.getApplication().getString(o0j.t2);
                }
                function1.invoke2(string);
            } else {
                Object obj2 = objArr[0];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.miui.tsmclient.sesdk.UncompletedOrderList");
                UncompletedOrderList uncompletedOrderList = (UncompletedOrderList) obj2;
                if (uncompletedOrderList.isEmpty()) {
                    this.$remindMessage.invoke2(null);
                } else {
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    List<UncompletedOrderList.UncompletedOrder> list = uncompletedOrderList.getList();
                    Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
                    CardWrapper cardWrapper2 = this.$cardWrapper;
                    for (UncompletedOrderList.UncompletedOrder uncompletedOrder : list) {
                        vqg.d("uncompletedOrderList = " + uncompletedOrder.getType() + "SeCard.aid =  " + cardWrapper2.mSeCard.getAid() + " it.aid =  " + uncompletedOrder.getAid());
                        if (StringsKt__StringsJVMKt.equals(cardWrapper2.mSeCard.getAid(), uncompletedOrder.getAid(), true) && uncompletedOrder.getType() == 3) {
                            objectRef.element = ApplicationExtKt.getApplication().getString(o0j.d2);
                        }
                    }
                    this.$remindMessage.invoke2(objectRef.element);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.TransitViewModel$getUncompletedOrderList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.TransitViewModel", f = "TransitViewModel.kt", i = {}, l = {213}, m = "getUncompletedOrderList", n = {}, s = {})
    public static final class C26851 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C26851(Continuation<? super C26851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransitViewModel.this.getUncompletedOrderList(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.TransitViewModel$loadBullet$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.TransitViewModel$loadBullet$1", f = "TransitViewModel.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cardWrapper;
        final /* synthetic */ Function1<String, Unit> $success;
        final /* synthetic */ String $tag;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.TransitViewModel$loadBullet$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.TransitViewModel$loadBullet$1$1", f = "TransitViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CardWrapper $cardWrapper;
            final /* synthetic */ Function1<String, Unit> $success;
            final /* synthetic */ String $tag;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06841(CardWrapper cardWrapper, String str, Function1<? super String, Unit> function1, Continuation<? super C06841> continuation) {
                super(2, continuation);
                this.$cardWrapper = cardWrapper;
                this.$tag = str;
                this.$success = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(Function1 function1, List list) {
                AnyExtKt.main$default(null, new TransitViewModel$loadBullet$1$1$1$1(list, function1, null), 1, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$2(String str, Throwable th) {
                vqg.c("loadBulletinList err" + str, th);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06841(this.$cardWrapper, this.$tag, this.$success, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                o4h<List<BulletinResponseInfo.BulletinInfo>> o4hVarI1 = s3q.f0().i1(this.$cardWrapper, this.$tag);
                final Function1<String, Unit> function1 = this.$success;
                final Function1 function2 = new Function1() { // from class: com.xiaomi.fitness.nfc.ui.l
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return TransitViewModel.C26861.C06841.invokeSuspend$lambda$0(function1, (List) obj2);
                    }
                };
                bg4<? super List<BulletinResponseInfo.BulletinInfo>> bg4Var = new bg4() { // from class: com.xiaomi.fitness.nfc.ui.m
                    @Override // defpackage.bg4
                    public final void accept(Object obj2) {
                        function2.invoke2(obj2);
                    }
                };
                final String str = this.$tag;
                final Function1 function3 = new Function1() { // from class: com.xiaomi.fitness.nfc.ui.n
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return TransitViewModel.C26861.C06841.invokeSuspend$lambda$2(str, (Throwable) obj2);
                    }
                };
                o4hVarI1.O(bg4Var, new bg4() { // from class: com.xiaomi.fitness.nfc.ui.o
                    @Override // defpackage.bg4
                    public final void accept(Object obj2) {
                        function3.invoke2(obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26861(CardWrapper cardWrapper, String str, Function1<? super String, Unit> function1, Continuation<? super C26861> continuation) {
            super(2, continuation);
            this.$cardWrapper = cardWrapper;
            this.$tag = str;
            this.$success = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26861(this.$cardWrapper, this.$tag, this.$success, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06841 c06841 = new C06841(this.$cardWrapper, this.$tag, this.$success, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06841, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.TransitViewModel$loadBulletDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.TransitViewModel$loadBulletDialog$1", f = "TransitViewModel.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cardWrapper;
        final /* synthetic */ Function1<List<? extends BulletinResponseInfo.BulletinInfo>, Unit> $success;
        final /* synthetic */ String $tag;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.TransitViewModel$loadBulletDialog$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.TransitViewModel$loadBulletDialog$1$1", f = "TransitViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CardWrapper $cardWrapper;
            final /* synthetic */ Function1<List<? extends BulletinResponseInfo.BulletinInfo>, Unit> $success;
            final /* synthetic */ String $tag;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06851(CardWrapper cardWrapper, String str, Function1<? super List<? extends BulletinResponseInfo.BulletinInfo>, Unit> function1, Continuation<? super C06851> continuation) {
                super(2, continuation);
                this.$cardWrapper = cardWrapper;
                this.$tag = str;
                this.$success = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(Function1 function1, List list) {
                AnyExtKt.main$default(null, new TransitViewModel$loadBulletDialog$1$1$1$1(function1, list, null), 1, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$2(String str, Throwable th) {
                vqg.c("loadBulletinList err" + str, th);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06851(this.$cardWrapper, this.$tag, this.$success, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                o4h<List<BulletinResponseInfo.BulletinInfo>> o4hVarI1 = s3q.f0().i1(this.$cardWrapper, this.$tag);
                final Function1<List<? extends BulletinResponseInfo.BulletinInfo>, Unit> function1 = this.$success;
                final Function1 function2 = new Function1() { // from class: com.xiaomi.fitness.nfc.ui.p
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return TransitViewModel.C26871.C06851.invokeSuspend$lambda$0(function1, (List) obj2);
                    }
                };
                bg4<? super List<BulletinResponseInfo.BulletinInfo>> bg4Var = new bg4() { // from class: com.xiaomi.fitness.nfc.ui.q
                    @Override // defpackage.bg4
                    public final void accept(Object obj2) {
                        function2.invoke2(obj2);
                    }
                };
                final String str = this.$tag;
                final Function1 function3 = new Function1() { // from class: com.xiaomi.fitness.nfc.ui.r
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return TransitViewModel.C26871.C06851.invokeSuspend$lambda$2(str, (Throwable) obj2);
                    }
                };
                o4hVarI1.O(bg4Var, new bg4() { // from class: com.xiaomi.fitness.nfc.ui.s
                    @Override // defpackage.bg4
                    public final void accept(Object obj2) {
                        function3.invoke2(obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26871(CardWrapper cardWrapper, String str, Function1<? super List<? extends BulletinResponseInfo.BulletinInfo>, Unit> function1, Continuation<? super C26871> continuation) {
            super(2, continuation);
            this.$cardWrapper = cardWrapper;
            this.$tag = str;
            this.$success = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26871(this.$cardWrapper, this.$tag, this.$success, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06851 c06851 = new C06851(this.$cardWrapper, this.$tag, this.$success, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06851, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.TransitViewModel$loadCardSwitchList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.TransitViewModel$loadCardSwitchList$1", f = "TransitViewModel.kt", i = {}, l = {153, 158}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cardWrapper;
        final /* synthetic */ Function1<Boolean, Unit> $supportCallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26881(Function1<? super Boolean, Unit> function1, CardWrapper cardWrapper, Continuation<? super C26881> continuation) {
            super(2, continuation);
            this.$supportCallback = function1;
            this.$cardWrapper = cardWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransitViewModel.this.new C26881(this.$supportCallback, this.$cardWrapper, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0057 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:6:0x0010, B:21:0x0053, B:23:0x0057, B:24:0x0060, B:18:0x003f), top: B:30:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CardSwitcherBean cardSwitcherBean;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    cardSwitcherBean = (CardSwitcherBean) obj;
                    if (cardSwitcherBean != null) {
                        TransitViewModel.this.getCardSwitchRet().postValue(cardSwitcherBean);
                    }
                    this.$supportCallback.invoke2(Boxing.boxBoolean(true));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                TransitViewModel$loadCardSwitchList$1$isSupport$1 transitViewModel$loadCardSwitchList$1$isSupport$1 = new TransitViewModel$loadCardSwitchList$1$isSupport$1(null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, transitViewModel$loadCardSwitchList$1$isSupport$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) obj).booleanValue()) {
                    CoroutineDispatcher io3 = Dispatchers.getIO();
                    TransitViewModel$loadCardSwitchList$1$cardSwitcherTime$1 transitViewModel$loadCardSwitchList$1$cardSwitcherTime$1 = new TransitViewModel$loadCardSwitchList$1$cardSwitcherTime$1(this.$cardWrapper, null);
                    this.label = 2;
                    obj = BuildersKt.withContext(io3, transitViewModel$loadCardSwitchList$1$cardSwitcherTime$1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cardSwitcherBean = (CardSwitcherBean) obj;
                    if (cardSwitcherBean != null) {
                        TransitViewModel.this.getCardSwitchRet().postValue(cardSwitcherBean);
                    }
                    this.$supportCallback.invoke2(Boxing.boxBoolean(true));
                } else {
                    this.$supportCallback.invoke2(Boxing.boxBoolean(false));
                }
            } catch (Exception e) {
                vqg.c("isSupportCardSwitch", e);
                e.printStackTrace();
                this.$supportCallback.invoke2(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.TransitViewModel$setDefailtCard$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.TransitViewModel$setDefailtCard$1", f = "TransitViewModel.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardWrapper $cardWrapper;
        final /* synthetic */ Function1<String, Unit> $fail;
        final /* synthetic */ Function0<Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.TransitViewModel$setDefailtCard$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.TransitViewModel$setDefailtCard$1$1", f = "TransitViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CardWrapper $cardWrapper;
            final /* synthetic */ Function1<String, Unit> $fail;
            final /* synthetic */ Function0<Unit> $success;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06861(CardWrapper cardWrapper, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C06861> continuation) {
                super(2, continuation);
                this.$cardWrapper = cardWrapper;
                this.$success = function0;
                this.$fail = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(Function0 function0, Function1 function1, Boolean bool) {
                AnyExtKt.main$default(null, new TransitViewModel$setDefailtCard$1$1$1$1(bool, function0, function1, null), 1, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$2(Function1 function1, Throwable th) {
                vqg.c("setDefaultCard", th);
                AnyExtKt.main$default(null, new TransitViewModel$setDefailtCard$1$1$2$1(function1, th, null), 1, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06861(this.$cardWrapper, this.$success, this.$fail, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                o4h<Boolean> o4hVarS1 = s3q.f0().s1(this.$cardWrapper);
                final Function0<Unit> function0 = this.$success;
                final Function1<String, Unit> function1 = this.$fail;
                final Function1 function2 = new Function1() { // from class: com.xiaomi.fitness.nfc.ui.t
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return TransitViewModel.C26891.C06861.invokeSuspend$lambda$0(function0, function1, (Boolean) obj2);
                    }
                };
                bg4<? super Boolean> bg4Var = new bg4() { // from class: com.xiaomi.fitness.nfc.ui.u
                    @Override // defpackage.bg4
                    public final void accept(Object obj2) {
                        function2.invoke2(obj2);
                    }
                };
                final Function1<String, Unit> function3 = this.$fail;
                final Function1 function4 = new Function1() { // from class: com.xiaomi.fitness.nfc.ui.v
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return TransitViewModel.C26891.C06861.invokeSuspend$lambda$2(function3, (Throwable) obj2);
                    }
                };
                o4hVarS1.O(bg4Var, new bg4() { // from class: com.xiaomi.fitness.nfc.ui.w
                    @Override // defpackage.bg4
                    public final void accept(Object obj2) {
                        function4.invoke2(obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26891(CardWrapper cardWrapper, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C26891> continuation) {
            super(2, continuation);
            this.$cardWrapper = cardWrapper;
            this.$success = function0;
            this.$fail = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26891(this.$cardWrapper, this.$success, this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06861 c06861 = new C06861(this.$cardWrapper, this.$success, this.$fail, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06861, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData cardSwitchRet_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getUncompletedOrderList(CardWrapper cardWrapper, Continuation<? super BaseResponse> continuation) {
        C26851 c26851;
        if (continuation instanceof C26851) {
            c26851 = (C26851) continuation;
            int i = c26851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26851.label = i - Integer.MIN_VALUE;
            } else {
                c26851 = new C26851(continuation);
            }
        } else {
            c26851 = new C26851(continuation);
        }
        Object objWithContext = c26851.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26851.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            TransitViewModel$getUncompletedOrderList$response$1 transitViewModel$getUncompletedOrderList$response$1 = new TransitViewModel$getUncompletedOrderList$response$1(cardWrapper, null);
            c26851.label = 1;
            objWithContext = BuildersKt.withContext(io2, transitViewModel$getUncompletedOrderList$response$1, c26851);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        BaseResponse baseResponse = (BaseResponse) objWithContext;
        Intrinsics.checkNotNull(baseResponse);
        return baseResponse;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void checkUncompletedTypeCanRemove(@NotNull CardWrapper cardWrapper, @NotNull Function1<? super String, Unit> remindMessage) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(remindMessage, "remindMessage");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(cardWrapper, remindMessage, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<CardSwitcherBean> getCardSwitchRet() {
        return (MutableLiveData) this.cardSwitchRet.getValue();
    }

    public final void loadBullet(@NotNull CardWrapper cardWrapper, @NotNull String tag, @NotNull Function1<? super String, Unit> success) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(success, "success");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26861(cardWrapper, tag, success, null), 3, null);
    }

    public final void loadBulletDialog(@NotNull CardWrapper cardWrapper, @NotNull String tag, @NotNull Function1<? super List<? extends BulletinResponseInfo.BulletinInfo>, Unit> success) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(success, "success");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26871(cardWrapper, tag, success, null), 3, null);
    }

    public final void loadCardSwitchList(@NotNull CardWrapper cardWrapper, @NotNull Function1<? super Boolean, Unit> supportCallback) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(supportCallback, "supportCallback");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26881(supportCallback, cardWrapper, null), 3, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
    }

    public final void setDefailtCard(@NotNull CardWrapper cardWrapper, @NotNull Function0<Unit> success, @NotNull Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26891(cardWrapper, success, fail, null), 3, null);
    }
}
