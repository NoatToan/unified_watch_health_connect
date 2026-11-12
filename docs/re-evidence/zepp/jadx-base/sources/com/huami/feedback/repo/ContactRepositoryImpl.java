package com.huami.feedback.repo;

import com.huami.feedback.ContactType;
import com.huami.feedback.datasource.ContactDataSource;
import com.huami.feedback.entity.Contact;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/feedback/repo/ContactRepositoryImpl;", "Lcom/huami/feedback/repo/ContactRepository;", "Lcom/huami/feedback/ContactType;", "contactType", "Lcom/huami/feedback/entity/Contact;", "getContactByType", "(Lcom/huami/feedback/ContactType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ContactSettingItemActivity.KEY_CONTACT, "", "saveContact", "(Lcom/huami/feedback/entity/Contact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/feedback/datasource/ContactDataSource;", "a", "Lcom/huami/feedback/datasource/ContactDataSource;", "contactDataSource", "<init>", "(Lcom/huami/feedback/datasource/ContactDataSource;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class ContactRepositoryImpl implements ContactRepository {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ContactDataSource contactDataSource;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.repo.ContactRepositoryImpl", f = "ContactRepositoryImpl.kt", i = {0}, l = {17}, m = "getContactByType", n = {"contactType"}, s = {"L$0"})
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
            return ContactRepositoryImpl.this.getContactByType(null, this);
        }
    }

    public ContactRepositoryImpl(@NotNull ContactDataSource contactDataSource) {
        this.contactDataSource = contactDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.feedback.repo.ContactRepository
    @Nullable
    public Object getContactByType(@NotNull ContactType contactType, @NotNull Continuation<? super Contact> continuation) {
        a aVar;
        Object next;
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
        Object contacts = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(contacts);
            ContactDataSource contactDataSource = this.contactDataSource;
            aVar.a = contactType;
            aVar.d = 1;
            contacts = contactDataSource.getContacts(aVar);
            if (contacts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            contactType = (ContactType) aVar.a;
            ResultKt.throwOnFailure(contacts);
        }
        Iterator it2 = ((Iterable) contacts).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(((Contact) next).getContactType() == contactType));
        Contact contact = (Contact) next;
        return contact == null ? new Contact(contactType, "") : contact;
    }

    @Override // com.huami.feedback.repo.ContactRepository
    @Nullable
    public Object saveContact(@NotNull Contact contact, @NotNull Continuation<? super Unit> continuation) {
        if (contact.getContactInfo().length() == 0) {
            return Unit.INSTANCE;
        }
        Object objSaveContact = this.contactDataSource.saveContact(contact, continuation);
        return objSaveContact == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objSaveContact : Unit.INSTANCE;
    }
}
