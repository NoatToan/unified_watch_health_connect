package com.huami.feedback.datasource;

import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.feedback.ContactType;
import com.huami.feedback.entity.Contact;
import com.huami.feedback.util.ConstantsKt;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/huami/feedback/datasource/ContactDataSourceImpl;", "Lcom/huami/feedback/datasource/ContactDataSource;", "", "a", "", "Lcom/huami/feedback/entity/Contact;", "getContacts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ContactSettingItemActivity.KEY_CONTACT, "", "saveContact", "(Lcom/huami/feedback/entity/Contact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/account/service/AccountService;", "Lcom/huami/account/service/AccountService;", "accountService", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/huami/account/service/AccountService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class ContactDataSourceImpl implements ContactDataSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AccountService accountService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher dispatcher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/feedback/entity/Contact;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.datasource.ContactDataSourceImpl$getContacts$2", f = "ContactDataSourceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Contact>>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ContactDataSourceImpl.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Contact>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Contact>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<Contact>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Contact contact;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String strA = ContactDataSourceImpl.this.a();
            if (strA == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            KvPersistence kvPersistence$default = KvKit.getKvPersistence$default(ConstantsKt.FEEDBACK_KV_FILE, false, 2, null);
            ArrayList arrayList = new ArrayList();
            for (ContactType contactType : ContactType.values()) {
                String strStringPlus = Intrinsics.stringPlus(strA, contactType.name());
                if (kvPersistence$default.isContainKey(strStringPlus) && (contact = (Contact) kvPersistence$default.getParcelableValue(strStringPlus, Contact.class)) != null) {
                    Boxing.boxBoolean(arrayList.add(contact));
                }
            }
            return arrayList;
        }
    }

    public ContactDataSourceImpl(@NotNull AccountService accountService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.accountService = accountService;
        this.dispatcher = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a() {
        String strUserId = AccountServiceExtKt.userId(this.accountService);
        if (strUserId == null) {
            return null;
        }
        return Intrinsics.stringPlus(ConstantsKt.FEEDBACK_CONTACT_KEY, strUserId);
    }

    @Override // com.huami.feedback.datasource.ContactDataSource
    @Nullable
    public Object getContacts(@NotNull Continuation<? super List<Contact>> continuation) {
        return BuildersKt.withContext(this.dispatcher, new a(null), continuation);
    }

    @Override // com.huami.feedback.datasource.ContactDataSource
    @Nullable
    public Object saveContact(@NotNull Contact contact, @NotNull Continuation<? super Unit> continuation) {
        KvKit.getKvPersistence$default(ConstantsKt.FEEDBACK_KV_FILE, false, 2, null).setValue(Intrinsics.stringPlus(a(), contact.getContactType().name()), contact);
        return Unit.INSTANCE;
    }

    public /* synthetic */ ContactDataSourceImpl(AccountService accountService, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(accountService, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
