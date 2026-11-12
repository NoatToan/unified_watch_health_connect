package com.xiaomi.hm.health.ui.smartplay.btphone.contact;

import android.app.Application;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.contacts.bean.PhoneContact;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB\u000f\u0012\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0013\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\u0003J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0003J\u0014\u0010\u0013\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\fJ\u0014\u0010\u001a\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001d\u0010'\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b!\u0010&R&\u0010-\u001a\u0012\u0012\u0004\u0012\u00020)0(j\b\u0012\u0004\u0012\u00020)`*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R%\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00100.8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010/\u001a\u0004\b0\u00101R\"\u00108\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001f\u0010;\u001a\b\u0012\u0004\u0012\u00020\f0.8\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u00101R\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020\f0.8\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010/\u001a\u0004\b=\u00101R\u001f\u0010A\u001a\b\u0012\u0004\u0012\u00020\f0.8\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010/\u001a\u0004\b@\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "name", "number", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPermission", "", "hasPermit", "onPermission", "cancelEdit", "", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/PositionChangeEvent;", "positionEvents", "savePositionChange", "", "getAllowSelectCount", "editMode", "setEditMode", "Lcom/huami/contacts/bean/PhoneContact;", "phoneContacts", "addFriends", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtDeviceContactRepo;", "Lkotlin/Lazy;", "c", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtDeviceContactRepo;", "mRepoDevice", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactsNetRepo;", "b", "e", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactsNetRepo;", "netRepo", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/Contact;", "Lkotlin/collections/ArrayList;", GoogleApiAvailabilityLight.a, "Ljava/util/ArrayList;", "contacts", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getItemData", "()Landroidx/lifecycle/MutableLiveData;", "itemData", "Z", "getShowEditMode", "()Z", "setShowEditMode", "(Z)V", "showEditMode", "g", "getShowEditModeData", "showEditModeData", "h", "getAllowAddData", "allowAddData", "i", "getShowPermissionAlertLiveData", "showPermissionAlertLiveData", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BtContactViewModel extends AndroidViewModel implements KoinComponent {
    public static final int MAX_CONTACTS_COUNT = 50;

    @NotNull
    private static final String j = "BtContactViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRepoDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy netRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Contact> contacts;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<Contact>> itemData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean showEditMode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showEditModeData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> allowAddData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showPermissionAlertLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactViewModel$1", f = "BtContactViewModel.kt", i = {1, 2}, l = {52, 55, 56, 57}, m = "invokeSuspend", n = {"netContacts", "netContacts"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BtContactViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0079 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x008b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<Contact> list;
            BtDeviceContactRepo btDeviceContactRepoC;
            BtDeviceContactRepo btDeviceContactRepoC2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    list = (List) this.a;
                    ResultKt.throwOnFailure(obj);
                    btDeviceContactRepoC = BtContactViewModel.this.c();
                    this.a = list;
                    this.b = 3;
                    if (btDeviceContactRepoC.init(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    btDeviceContactRepoC2 = BtContactViewModel.this.c();
                    this.a = null;
                    this.b = 4;
                    if (btDeviceContactRepoC2.updateFriendInfo(list, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 3) {
                    list = (List) this.a;
                    ResultKt.throwOnFailure(obj);
                    btDeviceContactRepoC2 = BtContactViewModel.this.c();
                    this.a = null;
                    this.b = 4;
                    if (btDeviceContactRepoC2.updateFriendInfo(list, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            BtContactsNetRepo btContactsNetRepoE = BtContactViewModel.this.e();
            this.b = 1;
            obj = btContactsNetRepoE.loadContacts(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            List<Contact> list2 = (List) obj;
            BtContactViewModel.this.contacts.clear();
            BtContactViewModel.this.contacts.addAll(list2);
            BtContactViewModel btContactViewModel = BtContactViewModel.this;
            this.a = list2;
            this.b = 2;
            if (btContactViewModel.f(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = list2;
            btDeviceContactRepoC = BtContactViewModel.this.c();
            this.a = list;
            this.b = 3;
            if (btDeviceContactRepoC.init(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            btDeviceContactRepoC2 = BtContactViewModel.this.c();
            this.a = null;
            this.b = 4;
            if (btDeviceContactRepoC2.updateFriendInfo(list, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactViewModel", f = "BtContactViewModel.kt", i = {0}, l = {94, 96}, m = "addFriend", n = {ContactSettingItemActivity.KEY_CONTACT}, s = {"L$1"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return BtContactViewModel.this.a(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactViewModel$addFriends$1", f = "BtContactViewModel.kt", i = {}, l = {168, 170, 171}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ List<PhoneContact> c;
        public final /* synthetic */ BtContactViewModel d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "insert friend failed as sync to device failed";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<PhoneContact> list, BtContactViewModel btContactViewModel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = list;
            this.d = btContactViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00f7 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<Contact> list;
            BtContactsNetRepo btContactsNetRepoE;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    list = (List) this.a;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    list = (List) this.a;
                    ResultKt.throwOnFailure(obj);
                    btContactsNetRepoE = this.d.e();
                    this.a = null;
                    this.b = 3;
                    if (btContactsNetRepoE.insertFriend(list, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            List<PhoneContact> list2 = this.c;
            BtContactViewModel btContactViewModel = this.d;
            for (PhoneContact phoneContact : list2) {
                ArrayList<Contact> arrayList2 = btContactViewModel.contacts;
                boolean z = false;
                if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                    for (Contact contact : arrayList2) {
                        if (Boxing.boxBoolean(Intrinsics.areEqual(contact.getUName(), phoneContact.getDisPlayName()) && Intrinsics.areEqual(phoneContact.getPhoneNum(), contact.getPhone())).booleanValue()) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z) {
                    arrayList.add(new Contact(phoneContact.getDisPlayName(), phoneContact.getPhoneNum()));
                }
            }
            List<Contact> listPlus = CollectionsKt___CollectionsKt.plus((Collection) this.d.contacts, (Iterable) arrayList);
            BtDeviceContactRepo btDeviceContactRepoC = this.d.c();
            this.a = arrayList;
            this.b = 1;
            Object objUpdateFriendInfo = btDeviceContactRepoC.updateFriendInfo(listPlus, this);
            if (objUpdateFriendInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
            obj = objUpdateFriendInfo;
            if (((Boolean) obj).booleanValue()) {
                this.d.contacts.addAll(list);
                BtContactViewModel btContactViewModel2 = this.d;
                this.a = list;
                this.b = 2;
                if (btContactViewModel2.f(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                btContactsNetRepoE = this.d.e();
                this.a = null;
                this.b = 3;
                if (btContactsNetRepoE.insertFriend(list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                HMLog.info(BtContactViewModel.j, a.a);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactViewModel$cancelEdit$1", f = "BtContactViewModel.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BtContactViewModel.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BtContactViewModel btContactViewModel = BtContactViewModel.this;
                this.a = 1;
                if (btContactViewModel.f(this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtDeviceContactRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<BtDeviceContactRepo> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BtDeviceContactRepo getA() {
            return new BtDeviceContactRepo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactsNetRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<BtContactsNetRepo> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BtContactsNetRepo getA() {
            return new BtContactsNetRepo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactViewModel$savePositionChange$1", f = "BtContactViewModel.kt", i = {1}, l = {129, 134, 137}, m = "invokeSuspend", n = {"success"}, s = {"Z$0"})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public boolean a;
        public int b;
        public final /* synthetic */ List<PositionChangeEvent> c;
        public final /* synthetic */ BtContactViewModel d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "save position failed as sync to device failed";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<PositionChangeEvent> list, BtContactViewModel btContactViewModel, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = list;
            this.d = btContactViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:30:0x00fc A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00fd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            BtContactsNetRepo btContactsNetRepoE;
            ArrayList arrayList;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    zBooleanValue = this.a;
                    ResultKt.throwOnFailure(obj);
                    if (zBooleanValue) {
                        btContactsNetRepoE = this.d.e();
                        arrayList = this.d.contacts;
                        this.b = 3;
                        if (btContactsNetRepoE.updateFriendInfo(arrayList, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        HMLog.info(BtContactViewModel.j, a.a);
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            List<PositionChangeEvent> list = this.c;
            BtContactViewModel btContactViewModel = this.d;
            for (PositionChangeEvent positionChangeEvent : list) {
                if (positionChangeEvent.getOriginPos() >= btContactViewModel.contacts.size()) {
                    HMLog.i(BtContactViewModel.j, "save positon failed origionPos = " + positionChangeEvent.getOriginPos() + " and contact size = " + btContactViewModel.contacts.size(), new Object[0]);
                } else {
                    Contact contact = (Contact) btContactViewModel.contacts.get(positionChangeEvent.getOriginPos());
                    btContactViewModel.contacts.remove(contact);
                    if (positionChangeEvent.getType() == PositionChangeType.MOVE) {
                        btContactViewModel.contacts.add(positionChangeEvent.getToPos(), contact);
                    }
                }
            }
            BtDeviceContactRepo btDeviceContactRepoC = this.d.c();
            ArrayList arrayList2 = this.d.contacts;
            this.b = 1;
            obj = btDeviceContactRepoC.updateFriendInfo(arrayList2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            this.d.setShowEditMode(false);
            this.d.getShowEditModeData().postValue(Boxing.boxBoolean(this.d.getShowEditMode()));
            BtContactViewModel btContactViewModel2 = this.d;
            this.a = zBooleanValue;
            this.b = 2;
            if (btContactViewModel2.f(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (zBooleanValue) {
                btContactsNetRepoE = this.d.e();
                arrayList = this.d.contacts;
                this.b = 3;
                if (btContactsNetRepoE.updateFriendInfo(arrayList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                HMLog.info(BtContactViewModel.j, a.a);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BtContactViewModel(@NotNull Application application) {
        super(application);
        this.mRepoDevice = LazyKt__LazyJVMKt.lazy(e.a);
        this.netRepo = LazyKt__LazyJVMKt.lazy(f.a);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
        this.contacts = new ArrayList<>();
        this.itemData = new MutableLiveData<>();
        this.showEditModeData = new MutableLiveData<>();
        this.allowAddData = new MutableLiveData<>();
        this.showPermissionAlertLiveData = new MutableLiveData<>();
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, Continuation<? super Unit> continuation) {
        b bVar;
        BtContactViewModel btContactViewModel;
        Contact contact;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.e = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                contact = (Contact) bVar.b;
                btContactViewModel = (BtContactViewModel) bVar.a;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        ArrayList<Contact> arrayList = this.contacts;
        boolean z = false;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            for (Contact contact2 : arrayList) {
                if (Boxing.boxBoolean(Intrinsics.areEqual(contact2.getUName(), str) && Intrinsics.areEqual(str2, contact2.getPhone())).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return Unit.INSTANCE;
        }
        Contact contact3 = new Contact(str, str2);
        BtDeviceContactRepo btDeviceContactRepoC = c();
        List<Contact> listListOf = kotlin.collections.e.listOf(contact3);
        bVar.a = this;
        bVar.b = contact3;
        bVar.e = 1;
        Object objInsertFriend = btDeviceContactRepoC.insertFriend(listListOf, bVar);
        if (objInsertFriend == coroutine_suspended) {
            return coroutine_suspended;
        }
        btContactViewModel = this;
        obj = objInsertFriend;
        contact = contact3;
        if (!((Boolean) obj).booleanValue()) {
            return Unit.INSTANCE;
        }
        btContactViewModel.contacts.add(contact);
        bVar.a = null;
        bVar.b = null;
        bVar.e = 2;
        if (btContactViewModel.f(bVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    private final DeviceUtilsApi b() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BtDeviceContactRepo c() {
        return (BtDeviceContactRepo) this.mRepoDevice.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BtContactsNetRepo e() {
        return (BtContactsNetRepo) this.netRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(Continuation<? super Unit> continuation) {
        getAllowAddData().postValue(Boxing.boxBoolean((this.contacts.size() < 50) && b().checkPermission("android.permission.READ_CONTACTS")));
        getItemData().postValue(this.contacts);
        return Unit.INSTANCE;
    }

    public final void addFriends(@NotNull List<PhoneContact> phoneContacts) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(phoneContacts, this, null), 2, null);
    }

    public final void cancelEdit() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(null), 2, null);
        setEditMode(false);
    }

    public final void checkPermission() {
        this.showPermissionAlertLiveData.setValue(Boolean.valueOf(!b().checkPermission("android.permission.READ_CONTACTS")));
    }

    @NotNull
    public final MutableLiveData<Boolean> getAllowAddData() {
        return this.allowAddData;
    }

    public final int getAllowSelectCount() {
        return 50 - this.contacts.size();
    }

    @NotNull
    public final MutableLiveData<List<Contact>> getItemData() {
        return this.itemData;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final boolean getShowEditMode() {
        return this.showEditMode;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowEditModeData() {
        return this.showEditModeData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowPermissionAlertLiveData() {
        return this.showPermissionAlertLiveData;
    }

    public final void onPermission(boolean hasPermit) {
        if (hasPermit) {
            checkPermission();
        }
    }

    public final void savePositionChange(@NotNull List<PositionChangeEvent> positionEvents) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new g(positionEvents, this, null), 2, null);
    }

    public final void setEditMode(boolean editMode) {
        this.showEditMode = editMode;
        this.showEditModeData.setValue(Boolean.valueOf(editMode));
    }

    public final void setShowEditMode(boolean z) {
        this.showEditMode = z;
    }
}
