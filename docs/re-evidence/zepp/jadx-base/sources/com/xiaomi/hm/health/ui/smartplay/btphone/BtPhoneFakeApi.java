package com.xiaomi.hm.health.ui.smartplay.btphone;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.phone.PairStatus;
import com.huami.bluetooth.profile.channel.module.phone.SettingApi;
import com.huami.bluetooth.profile.channel.module.phone.UnPair;
import com.huami.bluetooth.profile.channel.module.phone.dto.ItemDto;
import com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J!\u0010\u001c\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneFakeApi;", "Lcom/huami/bluetooth/profile/channel/module/phone/SettingApi;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onReceive", "", "phoneBtName", "", "preparePair", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/phone/PairStatus;", "queryPairStatus", "onlyRegister", "Lkotlin/Function1;", "statusChange", "registerPairStatus", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bluetooth/profile/channel/module/phone/dto/ItemDto;", "querySettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryVersion", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "callback", "setTransferCallback", "items", "updateSetting", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BtPhoneFakeApi implements SettingApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long a = 500;
    private static final int b = 30;
    private static final int c = 20;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneFakeApi$Companion;", "", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "DELAY", "J", "", "LIMIT", LogUtil.I, "REPEAT_COUNT", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object a(Continuation<? super Unit> continuation) {
            Object objDelay = DelayKt.delay(500L, continuation);
            return objDelay == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objDelay : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFakeApi", f = "BtPhoneFakeApi.kt", i = {}, l = {29}, m = "queryPairStatus", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BtPhoneFakeApi.this.queryPairStatus(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFakeApi", f = "BtPhoneFakeApi.kt", i = {}, l = {45}, m = "querySettings", n = {}, s = {})
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
            return BtPhoneFakeApi.this.querySettings(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFakeApi", f = "BtPhoneFakeApi.kt", i = {}, l = {50}, m = "queryVersion", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BtPhoneFakeApi.this.queryVersion(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFakeApi", f = "BtPhoneFakeApi.kt", i = {0, 0}, l = {35}, m = "registerPairStatus", n = {"statusChange", "it"}, s = {"L$0", "I$2"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public int b;
        public int c;
        public int d;
        public /* synthetic */ Object e;
        public int g;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return BtPhoneFakeApi.this.registerPairStatus(false, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFakeApi", f = "BtPhoneFakeApi.kt", i = {}, l = {57}, m = "updateSetting", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BtPhoneFakeApi.this.updateSetting(null, this);
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    public void onReceive(@NotNull ChannelResponse response) {
    }

    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    @Nullable
    public Object preparePair(@Nullable String str, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    @Nullable
    public Object queryPairStatus(@Nullable String str, @NotNull Continuation<? super PairStatus> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Companion companion = INSTANCE;
            aVar.c = 1;
            if (companion.a(aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return new UnPair();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    @Nullable
    public Object querySettings(@NotNull Continuation<? super List<? extends ItemDto>> continuation) {
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
            Companion companion = INSTANCE;
            bVar.c = 1;
            if (companion.a(bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ItemDto itemDto = new ItemDto();
        itemDto.value = false;
        Unit unit = Unit.INSTANCE;
        return CollectionsKt__CollectionsKt.arrayListOf(itemDto);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    @Nullable
    public Object queryVersion(@NotNull Continuation<? super Integer> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.c = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Companion companion = INSTANCE;
            cVar.c = 1;
            if (companion.a(cVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxInt(1);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0062 -> B:20:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    @org.jetbrains.annotations.Nullable
    public java.lang.Object registerPairStatus(boolean r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.huami.bluetooth.profile.channel.module.phone.PairStatus, kotlin.Unit> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r6 = r8 instanceof com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFakeApi.d
            if (r6 == 0) goto L13
            r6 = r8
            com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFakeApi$d r6 = (com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFakeApi.d) r6
            int r0 = r6.g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.g = r0
            goto L18
        L13:
            com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFakeApi$d r6 = new com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFakeApi$d
            r6.<init>(r8)
        L18:
            java.lang.Object r8 = r6.e
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.g
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L33
            int r7 = r6.d
            int r1 = r6.c
            int r3 = r6.b
            java.lang.Object r4 = r6.a
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            kotlin.ResultKt.throwOnFailure(r8)
            goto L65
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = 30
            r1 = 0
            r3 = 30
        L43:
            if (r1 >= r3) goto L7c
            int r8 = r1 + 1
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            int r1 = r1.intValue()
            com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFakeApi$Companion r4 = com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFakeApi.INSTANCE
            r6.a = r7
            r6.b = r3
            r6.c = r8
            r6.d = r1
            r6.g = r2
            java.lang.Object r4 = com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFakeApi.Companion.access$delay(r4, r6)
            if (r4 != r0) goto L62
            return r0
        L62:
            r4 = r7
            r7 = r1
            r1 = r8
        L65:
            r8 = 20
            if (r7 >= r8) goto L72
            com.huami.bluetooth.profile.channel.module.phone.Pairing r7 = new com.huami.bluetooth.profile.channel.module.phone.Pairing
            r7.<init>()
            r4.invoke(r7)
            goto L7a
        L72:
            com.huami.bluetooth.profile.channel.module.phone.Paired r7 = new com.huami.bluetooth.profile.channel.module.phone.Paired
            r7.<init>()
            r4.invoke(r7)
        L7a:
            r7 = r4
            goto L43
        L7c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneFakeApi.registerPairStatus(boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    public void setTransferCallback(@NotNull DataTransferCallback callback) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.phone.SettingApi
    @Nullable
    public Object updateSetting(@NotNull List<? extends ItemDto> list, @NotNull Continuation<? super Boolean> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.c = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = eVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Companion companion = INSTANCE;
            eVar.c = 1;
            if (companion.a(eVar) == coroutine_suspended) {
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
