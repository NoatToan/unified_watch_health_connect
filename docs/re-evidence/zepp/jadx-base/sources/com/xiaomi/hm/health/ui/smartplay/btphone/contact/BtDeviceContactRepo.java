package com.xiaomi.hm.health.ui.smartplay.btphone.contact;

import com.huami.bluetooth.profile.channel.module.contact.ContactApi;
import com.huami.bluetooth.profile.channel.module.contact.ContactModule;
import com.huami.bluetooth.profile.channel.module.ex.ProtocolNotSupportException;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004J!\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ'\u0010\u0010\u001a\u00020\u00022\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000e\"\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0010\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\u00020\u00198D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtDeviceContactRepo;", "Lorg/koin/core/component/KoinComponent;", "", PointCategory.INIT, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/Contact;", "loadContact", ContactSettingItemActivity.KEY_CONTACT, "", "insertFriend", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contacts", "deleteFriend", "", "btContact", "updateFriendInfo", "([Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/Contact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/util/List;", "Lcom/huami/bluetooth/profile/channel/module/contact/ContactApi;", "b", "Lcom/huami/bluetooth/profile/channel/module/contact/ContactApi;", "contactApi", "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "Lkotlin/Lazy;", "getDeviceManagerApi", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class BtDeviceContactRepo implements KoinComponent {

    @NotNull
    private static final String d = "BtDeviceContactRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Contact> contacts = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ContactApi contactApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo", f = "BtDeviceContactRepo.kt", i = {0, 0}, l = {67}, m = "deleteFriend", n = {"this", "element$iv"}, s = {"L$0", "L$2"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return BtDeviceContactRepo.this.deleteFriend(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "init failed as device is null";
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
            return "protocol not support!!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo", f = "BtDeviceContactRepo.kt", i = {0, 0}, l = {59}, m = "insertFriend", n = {"this", "element$iv"}, s = {"L$0", "L$2"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return BtDeviceContactRepo.this.insertFriend(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo", f = "BtDeviceContactRepo.kt", i = {0}, l = {48}, m = "loadContact", n = {"this"}, s = {"L$0"})
    public static final class e extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BtDeviceContactRepo.this.loadContact(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo", f = "BtDeviceContactRepo.kt", i = {}, l = {80}, m = "updateFriendInfo", n = {}, s = {})
    public static final class f extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BtDeviceContactRepo.this.updateFriendInfo((List<Contact>) null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BtDeviceContactRepo() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[PHI: r2 r5
      0x0045: PHI (r2v2 java.util.Iterator) = (r2v1 java.util.Iterator), (r2v3 java.util.Iterator) binds: [B:14:0x003c, B:28:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r5v1 com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo) = 
      (r5v0 com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo)
      (r5v2 com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo)
     binds: [B:14:0x003c, B:28:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b A[PHI: r2 r5 r11
      0x007b: PHI (r2v4 java.util.Iterator) = (r2v2 java.util.Iterator), (r2v5 java.util.Iterator) binds: [B:18:0x0054, B:24:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r5v3 com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo) = 
      (r5v1 com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo)
      (r5v4 com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo)
     binds: [B:18:0x0054, B:24:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r11v9 java.lang.Object) = (r11v7 java.lang.Object), (r11v10 java.lang.Object) binds: [B:18:0x0054, B:24:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0054 -> B:25:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0074 -> B:23:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteFriend(@org.jetbrains.annotations.NotNull java.util.List<com.xiaomi.hm.health.ui.smartplay.btphone.contact.Contact> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo.a
            if (r0 == 0) goto L13
            r0 = r12
            com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo$a r0 = (com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo$a r0 = new com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r11 = r0.c
            java.lang.Object r2 = r0.b
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.a
            com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo r5 = (com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo) r5
            kotlin.ResultKt.throwOnFailure(r12)
            goto L77
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            kotlin.ResultKt.throwOnFailure(r12)
            java.util.Iterator r11 = r11.iterator()
            r5 = r10
            r2 = r11
        L45:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L8d
            java.lang.Object r11 = r2.next()
            r12 = r11
            com.xiaomi.hm.health.ui.smartplay.btphone.contact.Contact r12 = (com.xiaomi.hm.health.ui.smartplay.btphone.contact.Contact) r12
            com.huami.bluetooth.profile.channel.module.contact.ContactApi r6 = r5.contactApi
            if (r6 != 0) goto L57
            goto L7b
        L57:
            com.huami.bluetooth.profile.channel.module.contact.bean.Contact[] r7 = new com.huami.bluetooth.profile.channel.module.contact.bean.Contact[r4]
            com.huami.bluetooth.profile.channel.module.contact.bean.Contact r8 = new com.huami.bluetooth.profile.channel.module.contact.bean.Contact
            java.lang.String r9 = r12.getUName()
            java.lang.String r12 = r12.getPhone()
            r8.<init>(r9, r12)
            r7[r3] = r8
            r0.a = r5
            r0.b = r2
            r0.c = r11
            r0.f = r4
            java.lang.Object r12 = r6.deleteContact(r7, r0)
            if (r12 != r1) goto L77
            return r1
        L77:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            if (r12 != 0) goto L7d
        L7b:
            r12 = 0
            goto L81
        L7d:
            boolean r12 = r12.booleanValue()
        L81:
            r12 = r12 ^ r4
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r12)
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L45
            goto L8e
        L8d:
            r11 = 0
        L8e:
            com.xiaomi.hm.health.ui.smartplay.btphone.contact.Contact r11 = (com.xiaomi.hm.health.ui.smartplay.btphone.contact.Contact) r11
            if (r11 != 0) goto L93
            r3 = 1
        L93:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo.deleteFriend(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final DeviceManagerApi getDeviceManagerApi() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Nullable
    public final Object init(@NotNull Continuation<? super Unit> continuation) {
        HMBaseDevice device = getDeviceManagerApi().getDevice(HMDeviceType.MILI);
        ContactApi contactApi = null;
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        if (hMMiLiProDevice == null) {
            HMLog.info(d, b.a);
            return Unit.INSTANCE;
        }
        try {
            ContactModule contactModule = (ContactModule) hMMiLiProDevice.getChannelModule(ContactModule.class);
            if (contactModule != null) {
                contactApi = contactModule.getContactApi();
            }
            this.contactApi = contactApi;
        } catch (ProtocolNotSupportException unused) {
            HMLog.info(d, c.a);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[PHI: r2 r5
      0x0045: PHI (r2v2 java.util.Iterator) = (r2v1 java.util.Iterator), (r2v3 java.util.Iterator) binds: [B:14:0x003c, B:28:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r5v1 com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo) = 
      (r5v0 com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo)
      (r5v2 com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo)
     binds: [B:14:0x003c, B:28:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b A[PHI: r2 r5 r11
      0x007b: PHI (r2v4 java.util.Iterator) = (r2v2 java.util.Iterator), (r2v5 java.util.Iterator) binds: [B:18:0x0054, B:24:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r5v3 com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo) = 
      (r5v1 com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo)
      (r5v4 com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo)
     binds: [B:18:0x0054, B:24:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r11v9 java.lang.Object) = (r11v7 java.lang.Object), (r11v10 java.lang.Object) binds: [B:18:0x0054, B:24:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0054 -> B:25:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0074 -> B:23:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertFriend(@org.jetbrains.annotations.NotNull java.util.List<com.xiaomi.hm.health.ui.smartplay.btphone.contact.Contact> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo.d
            if (r0 == 0) goto L13
            r0 = r12
            com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo$d r0 = (com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo.d) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo$d r0 = new com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r11 = r0.c
            java.lang.Object r2 = r0.b
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.a
            com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo r5 = (com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo) r5
            kotlin.ResultKt.throwOnFailure(r12)
            goto L77
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            kotlin.ResultKt.throwOnFailure(r12)
            java.util.Iterator r11 = r11.iterator()
            r5 = r10
            r2 = r11
        L45:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L8d
            java.lang.Object r11 = r2.next()
            r12 = r11
            com.xiaomi.hm.health.ui.smartplay.btphone.contact.Contact r12 = (com.xiaomi.hm.health.ui.smartplay.btphone.contact.Contact) r12
            com.huami.bluetooth.profile.channel.module.contact.ContactApi r6 = r5.contactApi
            if (r6 != 0) goto L57
            goto L7b
        L57:
            com.huami.bluetooth.profile.channel.module.contact.bean.Contact[] r7 = new com.huami.bluetooth.profile.channel.module.contact.bean.Contact[r4]
            com.huami.bluetooth.profile.channel.module.contact.bean.Contact r8 = new com.huami.bluetooth.profile.channel.module.contact.bean.Contact
            java.lang.String r9 = r12.getUName()
            java.lang.String r12 = r12.getPhone()
            r8.<init>(r9, r12)
            r7[r3] = r8
            r0.a = r5
            r0.b = r2
            r0.c = r11
            r0.f = r4
            java.lang.Object r12 = r6.addContacts(r7, r0)
            if (r12 != r1) goto L77
            return r1
        L77:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            if (r12 != 0) goto L7d
        L7b:
            r12 = 0
            goto L81
        L7d:
            boolean r12 = r12.booleanValue()
        L81:
            r12 = r12 ^ r4
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r12)
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L45
            goto L8e
        L8d:
            r11 = 0
        L8e:
            com.xiaomi.hm.health.ui.smartplay.btphone.contact.Contact r11 = (com.xiaomi.hm.health.ui.smartplay.btphone.contact.Contact) r11
            if (r11 != 0) goto L93
            r3 = 1
        L93:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtDeviceContactRepo.insertFriend(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object loadContact(@NotNull Continuation<? super List<Contact>> continuation) {
        e eVar;
        BtDeviceContactRepo btDeviceContactRepo;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.d = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object allContacts = eVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = eVar.d;
        ArrayList arrayList = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(allContacts);
            this.contacts.clear();
            ContactApi contactApi = this.contactApi;
            if (contactApi == null) {
                btDeviceContactRepo = this;
            } else {
                eVar.a = this;
                eVar.d = 1;
                allContacts = contactApi.getAllContacts(eVar);
                if (allContacts == coroutine_suspended) {
                    return coroutine_suspended;
                }
                btDeviceContactRepo = this;
            }
            if (!(arrayList != null || arrayList.isEmpty())) {
                btDeviceContactRepo.contacts.addAll(arrayList);
            }
            return btDeviceContactRepo.contacts;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        btDeviceContactRepo = (BtDeviceContactRepo) eVar.a;
        ResultKt.throwOnFailure(allContacts);
        List list = (List) allContacts;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                com.huami.bluetooth.profile.channel.module.contact.bean.Contact contact = (com.huami.bluetooth.profile.channel.module.contact.bean.Contact) obj;
                Boxing.boxInt(i3).intValue();
                arrayList.add(new Contact(contact.getName(), contact.getNumber()));
                i3 = i4;
            }
        }
        if (!(arrayList != null || arrayList.isEmpty())) {
            btDeviceContactRepo.contacts.addAll(arrayList);
        }
        return btDeviceContactRepo.contacts;
    }

    @Nullable
    public final Object updateFriendInfo(@NotNull Contact[] contactArr, @NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object updateFriendInfo(@NotNull List<Contact> list, @NotNull Continuation<? super Boolean> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i = fVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.c = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object contact = fVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = fVar.c;
        boolean zBooleanValue = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(contact);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (Contact contact2 : list) {
                arrayList.add(new com.huami.bluetooth.profile.channel.module.contact.bean.Contact(contact2.getUName(), contact2.getPhone()));
            }
            ContactApi contactApi = this.contactApi;
            if (contactApi != null) {
                fVar.c = 1;
                contact = contactApi.setContact(arrayList, fVar);
                if (contact == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(contact);
        Boolean bool = (Boolean) contact;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }
}
