package com.xiaomi.hm.health.ui.smartplay.btphone.contact;

import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0004J!\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/BtContactsNetRepo;", "Lorg/koin/core/component/KoinComponent;", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "c", "", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/Contact;", "loadContacts", ContactSettingItemActivity.KEY_CONTACT, "", "insertFriend", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contacts", "updateFriendInfo", "", "Ljava/util/List;", "allContacts", "Lcom/huami/devicex/injection/data/PropertyStoreApi;", "b", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/data/PropertyStoreApi;", "propertyStoreApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BtContactsNetRepo implements KoinComponent {

    @NotNull
    private static final String c = "huami.mifit.user.setting.contacts";

    @NotNull
    private static final String d = "BtContactsNetRepo";

    @NotNull
    private static final String e = "name";

    @NotNull
    private static final String f = "phoneNumber";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Contact> allContacts = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy propertyStoreApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactsNetRepo", f = "BtContactsNetRepo.kt", i = {0}, l = {28}, m = "loadContacts", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BtContactsNetRepo.this.loadContacts(this);
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
        public final String invoke() {
            return "property is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "property is: " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BtContactsNetRepo() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.propertyStoreApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<PropertyStoreApi>() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactsNetRepo$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.data.PropertyStoreApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PropertyStoreApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(PropertyStoreApi.class), qualifier, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Continuation<? super String> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        b().getPropertyAsync(c, false, new PropertyStoreApi.GetPropertyHandler() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.contact.BtContactsNetRepo$getProperty$2$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "get net property failed, try to get local";
                }
            }

            @Override // com.huami.devicex.injection.data.PropertyStoreApi.GetPropertyHandler
            public void onFailed() {
                HMLog.info("BtContactsNetRepo", a.a);
                Continuation<String> continuation2 = safeContinuation;
                String property = this.b().getProperty("huami.mifit.user.setting.contacts", null);
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m3845constructorimpl(property));
            }

            @Override // com.huami.devicex.injection.data.PropertyStoreApi.GetPropertyHandler
            public void onSuccess(@Nullable String value) {
                Continuation<String> continuation2 = safeContinuation;
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m3845constructorimpl(value));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PropertyStoreApi b() {
        return (PropertyStoreApi) this.propertyStoreApi.getValue();
    }

    private final void c() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Contact contact : this.allContacts) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", contact.getUName());
            jSONObject.put("phoneNumber", contact.getPhone());
            jSONArray.put(jSONObject);
        }
        b().setProperty(c, jSONArray.toString());
        b().postPropertiesToServer(true);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Nullable
    public final Object insertFriend(@NotNull List<Contact> list, @NotNull Continuation<? super Boolean> continuation) throws JSONException {
        this.allContacts.addAll(list);
        c();
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object loadContacts(@NotNull Continuation<? super List<Contact>> continuation) {
        a aVar;
        BtContactsNetRepo btContactsNetRepo;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            this.allContacts.clear();
            aVar.a = this;
            aVar.d = 1;
            objA = a(aVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            btContactsNetRepo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            btContactsNetRepo = (BtContactsNetRepo) aVar.a;
            ResultKt.throwOnFailure(objA);
        }
        String str = (String) objA;
        if (str != null) {
            int i3 = 0;
            if (!(str.length() == 0)) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    int length = jSONArray.length();
                    if (length > 0) {
                        while (true) {
                            int i4 = i3 + 1;
                            Object obj = jSONArray.get(i3);
                            if (obj == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                            }
                            JSONObject jSONObject = (JSONObject) obj;
                            btContactsNetRepo.allContacts.add(new Contact(jSONObject.getString("name"), jSONObject.getString("phoneNumber")));
                            if (i4 < length) {
                                i3 = i4;
                            }
                        }
                    }
                } catch (Exception e2) {
                    HMLog.info(d, new c(str));
                    e2.printStackTrace();
                }
                return btContactsNetRepo.allContacts;
            }
        }
        HMLog.info(d, b.a);
        return btContactsNetRepo.allContacts;
    }

    @Nullable
    public final Object updateFriendInfo(@NotNull List<Contact> list, @NotNull Continuation<? super Unit> continuation) throws JSONException {
        this.allContacts.clear();
        this.allContacts.addAll(list);
        c();
        return Unit.INSTANCE;
    }
}
