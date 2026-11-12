package com.huami.bluetooth.profile.channel.module.notification;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.IncreasePredict;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponsePredict;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.base.Timeout;
import com.huami.bluetooth.profile.channel.module.notification.entity.ContactItemModify;
import com.huami.bluetooth.profile.channel.module.notification.entity.ContactSettingItem;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001(B\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J,\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002J4\u0010\u0010\u001a\u00020\t2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J,\u0010\u0011\u001a\u00020\t2\"\u0010\n\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\t0\u0007H\u0016J4\u0010\u0014\u001a\u00020\t2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J4\u0010\u0015\u001a\u00020\t2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J$\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010!\u001a\u00020\u001c8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006)"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiImplV4;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiV4;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiImplV3;", "Lcom/huami/bluetooth/profile/Request$Command;", "command", "Lcom/huami/bluetooth/profile/channel/module/base/ResponsePredict;", "predicate", "Lkotlin/Function1;", "", "", "result", "b", "Ljava/util/ArrayList;", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "Lkotlin/collections/ArrayList;", "items", "addContactSettingItems", "queryContactSettingItems", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactItemModify;", "modifiedItems", "modifyContactSettingItems", "deleteContactSettingItems", "", ContactSettingItemActivity.KEY_VIBRATION, "vibrate", "e", LogUtil.I, "tagSuccess", "", "f", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;", "module", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;", "version", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;)V", "DeleteCmdPredicate", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationApiImplV4 extends NotificationApiImplV3 implements NotificationApiV4 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int tagSuccess;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiImplV4$DeleteCmdPredicate;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponsePredict;", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleRequest;", "request", "", AbstractJSONTokenResponse.RESPONSE, "", "predict", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeleteCmdPredicate implements ResponsePredict {

        @NotNull
        public static final DeleteCmdPredicate INSTANCE = new DeleteCmdPredicate();

        private DeleteCmdPredicate() {
        }

        @Override // com.huami.bluetooth.profile.channel.module.base.ResponsePredict
        public boolean predict(@NotNull ModuleRequest request, @NotNull byte[] response) {
            return !(response.length == 0) && AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(response)) == AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(request.getBytes())) + 3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.notification.NotificationApiImplV4$addContactSettingItems$1", f = "NotificationApiImplV4.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ArrayList<ContactSettingItem> b;
        public final /* synthetic */ NotificationApiImplV4 c;
        public final /* synthetic */ Function1<Boolean, Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ArrayList<ContactSettingItem> arrayList, NotificationApiImplV4 notificationApiImplV4, Function1<? super Boolean, Unit> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = arrayList;
            this.c = notificationApiImplV4;
            this.d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Request.Command commandWithShort = NotificationCommand.AddContactSettingItem.INSTANCE.withShort(this.b.size());
            for (ContactSettingItem contactSettingItem : this.b) {
                commandWithShort = commandWithShort.withString(contactSettingItem.getPkg()).withString(contactSettingItem.getContact()).withByte(contactSettingItem.getVibration());
            }
            this.c.b(commandWithShort, IncreasePredict.INSTANCE, this.d);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.notification.NotificationApiImplV4$deleteContactSettingItems$1", f = "NotificationApiImplV4.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ArrayList<ContactSettingItem> b;
        public final /* synthetic */ NotificationApiImplV4 c;
        public final /* synthetic */ Function1<Boolean, Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ArrayList<ContactSettingItem> arrayList, NotificationApiImplV4 notificationApiImplV4, Function1<? super Boolean, Unit> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = arrayList;
            this.c = notificationApiImplV4;
            this.d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Request.Command commandWithShort = NotificationCommand.DeleteContactSettingItems.INSTANCE.withShort(this.b.size());
            for (ContactSettingItem contactSettingItem : this.b) {
                commandWithShort = commandWithShort.withString(contactSettingItem.getPkg()).withString(contactSettingItem.getContact()).withByte(contactSettingItem.getVibration());
            }
            this.c.b(commandWithShort, DeleteCmdPredicate.INSTANCE, this.d);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.notification.NotificationApiImplV4$modifyContactSettingItems$1", f = "NotificationApiImplV4.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ArrayList<ContactItemModify> b;
        public final /* synthetic */ NotificationApiImplV4 c;
        public final /* synthetic */ Function1<Boolean, Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ArrayList<ContactItemModify> arrayList, NotificationApiImplV4 notificationApiImplV4, Function1<? super Boolean, Unit> function1, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = arrayList;
            this.c = notificationApiImplV4;
            this.d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Request.Command commandWithShort = NotificationCommand.ModifyContactSettingItem.INSTANCE.withShort(this.b.size());
            for (ContactItemModify contactItemModify : this.b) {
                commandWithShort = commandWithShort.withString(contactItemModify.getPkg()).withString(contactItemModify.getContactOld()).withByte(contactItemModify.getVibrationOld()).withString(contactItemModify.getContactNew()).withByte(contactItemModify.getVibrationNew());
            }
            this.c.b(commandWithShort, IncreasePredict.INSTANCE, this.d);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.notification.NotificationApiImplV4$queryContactSettingItems$1", f = "NotificationApiImplV4.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<ArrayList<ContactSettingItem>, Unit> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ ArrayList<ContactSettingItem> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ArrayList<ContactSettingItem> arrayList) {
                super(0);
                this.a = arrayList;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("query contact settings: ", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ ModuleResult<byte[]> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ModuleResult<byte[]> moduleResult) {
                super(0);
                this.a = moduleResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("fail ", ((Failure) this.a).getMsg());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "fail timeout";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super ArrayList<ContactSettingItem>, Unit> function1, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return NotificationApiImplV4.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ModuleResult<byte[]> moduleResultSendRequest = NotificationApiImplV4.this.getModule().sendRequest(new ModuleRequest(NotificationCommand.QueryContactSettingItems.INSTANCE, IncreasePredict.INSTANCE, 0L, null, false, 28, null));
            NotificationApiImplV4 notificationApiImplV4 = NotificationApiImplV4.this;
            Function1<ArrayList<ContactSettingItem>, Unit> function1 = this.c;
            if (moduleResultSendRequest instanceof Success) {
                Success success = (Success) moduleResultSendRequest;
                BufByteDecoder bufByteDecoder = new BufByteDecoder((byte[]) success.getData(), ((byte[]) success.getData()).length);
                bufByteDecoder.readByte();
                int i = bufByteDecoder.readShort();
                ArrayList<ContactSettingItem> arrayList = new ArrayList<>();
                int i2 = 0;
                if (i > 0) {
                    do {
                        i2++;
                        arrayList.add(new ContactSettingItem(bufByteDecoder.readString(), bufByteDecoder.readString(), bufByteDecoder.readByte()));
                    } while (i2 < i);
                }
                HMLog.info(notificationApiImplV4.getTag(), new a(arrayList));
                function1.invoke(arrayList);
            } else if (moduleResultSendRequest instanceof Failure) {
                HMLog.info(notificationApiImplV4.getTag(), new b(moduleResultSendRequest));
                function1.invoke(new ArrayList<>());
            } else if (moduleResultSendRequest instanceof Timeout) {
                HMLog.info(notificationApiImplV4.getTag(), c.a);
                function1.invoke(new ArrayList<>());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.notification.NotificationApiImplV4$vibrate$1", f = "NotificationApiImplV4.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ NotificationApiImplV4 c;
        public final /* synthetic */ Function1<Boolean, Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(int i, NotificationApiImplV4 notificationApiImplV4, Function1<? super Boolean, Unit> function1, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = i;
            this.c = notificationApiImplV4;
            this.d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.c.b(NotificationCommand.VibrateSpecificMode.INSTANCE.withByte(this.b), IncreasePredict.INSTANCE, this.d);
            return Unit.INSTANCE;
        }
    }

    public NotificationApiImplV4(@NotNull NotificationModule notificationModule, @NotNull NotificationVersion notificationVersion) {
        super(notificationModule, notificationVersion);
        this.tagSuccess = 1;
        this.tag = "NotificationApiImplV4";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Request.Command command, ResponsePredict predicate, Function1<? super Boolean, Unit> result) {
        ModuleResult<byte[]> moduleResultSendRequest = getModule().sendRequest(new ModuleRequest(command, predicate, 0L, null, false, 28, null));
        if (!(moduleResultSendRequest instanceof Success)) {
            result.invoke(Boolean.FALSE);
            return;
        }
        Success success = (Success) moduleResultSendRequest;
        BufByteDecoder bufByteDecoder = new BufByteDecoder((byte[]) success.getData(), ((byte[]) success.getData()).length);
        bufByteDecoder.readByte();
        result.invoke(Boolean.valueOf(bufByteDecoder.readByte() == this.tagSuccess));
    }

    @Override // com.huami.bluetooth.profile.channel.module.notification.NotificationApiV4
    public void addContactSettingItems(@NotNull ArrayList<ContactSettingItem> items, @NotNull Function1<? super Boolean, Unit> result) {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(items, this, result, null), 3, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.notification.NotificationApiV4
    public void deleteContactSettingItems(@NotNull ArrayList<ContactSettingItem> items, @NotNull Function1<? super Boolean, Unit> result) {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new b(items, this, result, null), 3, null);
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @Override // com.huami.bluetooth.profile.channel.module.notification.NotificationApiV4
    public void modifyContactSettingItems(@NotNull ArrayList<ContactItemModify> modifiedItems, @NotNull Function1<? super Boolean, Unit> result) {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new c(modifiedItems, this, result, null), 3, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.notification.NotificationApiV4
    public void queryContactSettingItems(@NotNull Function1<? super ArrayList<ContactSettingItem>, Unit> result) {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new d(result, null), 3, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.notification.NotificationApiV4
    public void vibrate(int vibration, @NotNull Function1<? super Boolean, Unit> result) {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new e(vibration, this, result, null), 3, null);
    }
}
