package com.xiaomi.fitness.nfc.ui;

import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.nfc.bean.AutoSwitchCardBean;
import com.xiaomi.fitness.nfc.ui.AutoSwitchCardViewModel;
import defpackage.csg;
import defpackage.s7r;
import defpackage.vqg;
import defpackage.xrg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J{\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u000fj\b\u0012\u0004\u0012\u00020\u000e`\r2H\u0010\u0010\u001aD\u0012\u0004\u0012\u00020\u0012\u00124\u00122\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u000fj\b\u0012\u0004\u0012\u00020\u000e`\r0\u000fj\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u000fj\b\u0012\u0004\u0012\u00020\u000e`\r`\r\u0012\u0004\u0012\u00020\u000b0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\u0010\u0015JÃ\u0001\u0010\u0016\u001a2\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u000fj\b\u0012\u0004\u0012\u00020\u000e`\r0\u000fj\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u000fj\b\u0012\u0004\u0012\u00020\u000e`\r`\r2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u000fj\b\u0012\u0004\u0012\u00020\u000e`\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u000fj\b\u0012\u0004\u0012\u00020\u000e`\r2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u000fj\b\u0012\u0004\u0012\u00020\u000e`\r2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u000fj\b\u0012\u0004\u0012\u00020\u000e`\r2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u000fj\b\u0012\u0004\u0012\u00020\u000e`\rH\u0002¢\u0006\u0002\u0010\u001eJ%\u0010\u001f\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u000fj\b\u0012\u0004\u0012\u00020\u000e`\rH\u0002¢\u0006\u0002\u0010 J4\u0010!\u001a\u00020\u000b2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u000b0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014J>\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190$2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b0%2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/AutoSwitchCardViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "deviceContact", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "getDeviceContact", "()Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "setDeviceContact", "(Lcom/xiaomi/fitness/device/contact/export/DeviceContact;)V", "takeApartList", "", "list", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/nfc/bean/AutoSwitchCardBean;", "Ljava/util/ArrayList;", "success", "Lkotlin/Function2;", "", "error", "Lkotlin/Function0;", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "checkSelected", "aidList", "", "", "tranList", "miLockList", "jobList", "doorList", "(Ljava/util/ArrayList;[Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/util/ArrayList;", "checkHasSelectedCard", "(Ljava/util/ArrayList;)V", "loadConfig", "setAidList", "enabled", "", "Lkotlin/Function1;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAutoSwitchCardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoSwitchCardViewModel.kt\ncom/xiaomi/fitness/nfc/ui/AutoSwitchCardViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n1863#2,2:144\n295#2,2:146\n*S KotlinDebug\n*F\n+ 1 AutoSwitchCardViewModel.kt\ncom/xiaomi/fitness/nfc/ui/AutoSwitchCardViewModel\n*L\n51#1:144,2\n73#1:146,2\n*E\n"})
public final class AutoSwitchCardViewModel extends AbsViewModel {
    public DeviceContact deviceContact;

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.AutoSwitchCardViewModel$loadConfig$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.AutoSwitchCardViewModel$loadConfig$1", f = "AutoSwitchCardViewModel.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $error;
        final /* synthetic */ Function2<Boolean, String[], Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.AutoSwitchCardViewModel$loadConfig$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.AutoSwitchCardViewModel$loadConfig$1$1", f = "AutoSwitchCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $error;
            final /* synthetic */ Function2<Boolean, String[], Unit> $success;
            int label;
            final /* synthetic */ AutoSwitchCardViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06601(AutoSwitchCardViewModel autoSwitchCardViewModel, Function2<? super Boolean, ? super String[], Unit> function2, Function0<Unit> function0, Continuation<? super C06601> continuation) {
                super(2, continuation);
                this.this$0 = autoSwitchCardViewModel;
                this.$success = function2;
                this.$error = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06601(this.this$0, this.$success, this.$error, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 5;
                s7rVar.f = 21;
                DeviceContact deviceContact = this.this$0.getDeviceContact();
                final Function2<Boolean, String[], Unit> function2 = this.$success;
                final Function0<Unit> function0 = this.$error;
                DeviceContact.DefaultImpls.call$default(deviceContact, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.nfc.ui.AutoSwitchCardViewModel.loadConfig.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        vqg.d("AutoSwitchCardViewModel loadConfig onError code:" + code);
                        AnyExtKt.main$default(null, new AutoSwitchCardViewModel$loadConfig$1$1$1$onError$1(function0, null), 1, null);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        s7r packet;
                        csg csgVarB;
                        xrg.c cVarU = (result == null || (packet = result.getPacket()) == null || (csgVarB = packet.B()) == null) ? null : csgVarB.u();
                        Boolean boolValueOf = cVarU != null ? Boolean.valueOf(cVarU.c) : null;
                        String string = Arrays.toString(cVarU != null ? cVarU.d : null);
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        vqg.d("AutoSwitchCardViewModel loadConfig onSuccess cardSwitcherSmart:" + boolValueOf + " aids:" + string);
                        AnyExtKt.main$default(null, new AutoSwitchCardViewModel$loadConfig$1$1$1$onSuccess$1(cVarU, function2, null), 1, null);
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super Boolean, ? super String[], Unit> function2, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$success = function2;
            this.$error = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AutoSwitchCardViewModel.this.new AnonymousClass1(this.$success, this.$error, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06601 c06601 = new C06601(AutoSwitchCardViewModel.this, this.$success, this.$error, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06601, this) == coroutine_suspended) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.AutoSwitchCardViewModel$setAidList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.AutoSwitchCardViewModel$setAidList$1", f = "AutoSwitchCardViewModel.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $aidList;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function0<Unit> $error;
        final /* synthetic */ Function1<Boolean, Unit> $success;
        int label;
        final /* synthetic */ AutoSwitchCardViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.AutoSwitchCardViewModel$setAidList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.AutoSwitchCardViewModel$setAidList$1$1", f = "AutoSwitchCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nAutoSwitchCardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoSwitchCardViewModel.kt\ncom/xiaomi/fitness/nfc/ui/AutoSwitchCardViewModel$setAidList$1$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,143:1\n37#2:144\n36#2,3:145\n*S KotlinDebug\n*F\n+ 1 AutoSwitchCardViewModel.kt\ncom/xiaomi/fitness/nfc/ui/AutoSwitchCardViewModel$setAidList$1$1\n*L\n120#1:144\n120#1:145,3\n*E\n"})
        public static final class C06621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<String> $aidList;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ Function0<Unit> $error;
            final /* synthetic */ Function1<Boolean, Unit> $success;
            int label;
            final /* synthetic */ AutoSwitchCardViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06621(boolean z, List<String> list, AutoSwitchCardViewModel autoSwitchCardViewModel, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Continuation<? super C06621> continuation) {
                super(2, continuation);
                this.$enabled = z;
                this.$aidList = list;
                this.this$0 = autoSwitchCardViewModel;
                this.$success = function1;
                this.$error = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06621(this.$enabled, this.$aidList, this.this$0, this.$success, this.$error, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 5;
                s7rVar.f = 22;
                s7rVar.Z(new csg());
                s7rVar.B().G(new xrg.c());
                s7rVar.B().u().c = this.$enabled;
                s7rVar.B().u().d = (String[]) this.$aidList.toArray(new String[0]);
                DeviceContact deviceContact = this.this$0.getDeviceContact();
                final Function1<Boolean, Unit> function1 = this.$success;
                final Function0<Unit> function0 = this.$error;
                DeviceContact.DefaultImpls.call$default(deviceContact, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.nfc.ui.AutoSwitchCardViewModel.setAidList.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        vqg.d("AutoSwitchCardViewModel loadConfig onError code:" + code);
                        AnyExtKt.main$default(null, new AutoSwitchCardViewModel$setAidList$1$1$1$onError$1(function0, null), 1, null);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        s7r packet;
                        csg csgVarB;
                        xrg.b bVarT = (result == null || (packet = result.getPacket()) == null || (csgVarB = packet.B()) == null) ? null : csgVarB.t();
                        vqg.d("AutoSwitchCardViewModel setAidList onSuccess cardSwitcherResult:" + (bVarT != null ? Integer.valueOf(bVarT.c) : null));
                        AnyExtKt.main$default(null, new AutoSwitchCardViewModel$setAidList$1$1$1$onSuccess$1(bVarT, function1, null), 1, null);
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26721(boolean z, List<String> list, AutoSwitchCardViewModel autoSwitchCardViewModel, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Continuation<? super C26721> continuation) {
            super(2, continuation);
            this.$enabled = z;
            this.$aidList = list;
            this.this$0 = autoSwitchCardViewModel;
            this.$success = function1;
            this.$error = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26721(this.$enabled, this.$aidList, this.this$0, this.$success, this.$error, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06621 c06621 = new C06621(this.$enabled, this.$aidList, this.this$0, this.$success, this.$error, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06621, this) == coroutine_suspended) {
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
            return ((C26721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void checkHasSelectedCard(ArrayList<AutoSwitchCardBean> list) {
        Object next;
        if (!list.isEmpty()) {
            if (list.size() == 1) {
                list.get(0).setSelected(true);
                return;
            }
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((AutoSwitchCardBean) next).getIsSelected());
            AutoSwitchCardBean autoSwitchCardBean = (AutoSwitchCardBean) next;
            if (autoSwitchCardBean != null) {
                autoSwitchCardBean.setSelected(true);
            } else {
                list.get(0).setSelected(true);
            }
        }
    }

    private final ArrayList<ArrayList<AutoSwitchCardBean>> checkSelected(ArrayList<AutoSwitchCardBean> list, String[] aidList, ArrayList<AutoSwitchCardBean> tranList, ArrayList<AutoSwitchCardBean> miLockList, ArrayList<AutoSwitchCardBean> jobList, ArrayList<AutoSwitchCardBean> doorList) {
        for (AutoSwitchCardBean autoSwitchCardBean : list) {
            autoSwitchCardBean.setSelected(ArraysKt___ArraysKt.contains(aidList, autoSwitchCardBean.getAid()));
            int type = autoSwitchCardBean.getType();
            if (type == 0) {
                tranList.add(autoSwitchCardBean);
            } else if (type == 2) {
                miLockList.add(autoSwitchCardBean);
            } else if (type != 3) {
                doorList.add(autoSwitchCardBean);
            } else {
                jobList.add(autoSwitchCardBean);
            }
        }
        return CollectionsKt__CollectionsKt.arrayListOf(tranList, doorList, miLockList, jobList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit takeApartList$lambda$0(AutoSwitchCardViewModel this$0, ArrayList list, Ref.ObjectRef tranList, Ref.ObjectRef miLockList, Ref.ObjectRef jobList, Ref.ObjectRef doorList, Function2 success, boolean z, String[] aidList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(list, "$list");
        Intrinsics.checkNotNullParameter(tranList, "$tranList");
        Intrinsics.checkNotNullParameter(miLockList, "$miLockList");
        Intrinsics.checkNotNullParameter(jobList, "$jobList");
        Intrinsics.checkNotNullParameter(doorList, "$doorList");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(aidList, "aidList");
        success.invoke(Boolean.valueOf(z), this$0.checkSelected(list, aidList, (ArrayList) tranList.element, (ArrayList) miLockList.element, (ArrayList) jobList.element, (ArrayList) doorList.element));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit takeApartList$lambda$1(Function0 error) {
        Intrinsics.checkNotNullParameter(error, "$error");
        error.invoke();
        return Unit.INSTANCE;
    }

    @NotNull
    public final DeviceContact getDeviceContact() {
        DeviceContact deviceContact = this.deviceContact;
        if (deviceContact != null) {
            return deviceContact;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceContact");
        return null;
    }

    public final void loadConfig(@NotNull Function2<? super Boolean, ? super String[], Unit> success, @NotNull Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(success, error, null), 3, null);
    }

    public final void setAidList(boolean enabled, @NotNull List<String> aidList, @NotNull Function1<? super Boolean, Unit> success, @NotNull Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(aidList, "aidList");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26721(enabled, aidList, this, success, error, null), 3, null);
    }

    public final void setDeviceContact(@NotNull DeviceContact deviceContact) {
        Intrinsics.checkNotNullParameter(deviceContact, "<set-?>");
        this.deviceContact = deviceContact;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.util.ArrayList] */
    public final void takeApartList(@NotNull final ArrayList<AutoSwitchCardBean> list, @NotNull final Function2<? super Boolean, ? super ArrayList<ArrayList<AutoSwitchCardBean>>, Unit> success, @NotNull final Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ArrayList();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new ArrayList();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = new ArrayList();
        final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        objectRef4.element = new ArrayList();
        loadConfig(new Function2() { // from class: ns1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AutoSwitchCardViewModel.takeApartList$lambda$0(this.f28308a, list, objectRef, objectRef3, objectRef4, objectRef2, success, ((Boolean) obj).booleanValue(), (String[]) obj2);
            }
        }, new Function0() { // from class: os1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutoSwitchCardViewModel.takeApartList$lambda$1(error);
            }
        });
    }
}
