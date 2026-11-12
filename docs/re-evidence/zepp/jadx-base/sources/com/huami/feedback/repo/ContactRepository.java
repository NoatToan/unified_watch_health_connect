package com.huami.feedback.repo;

import com.huami.feedback.ContactType;
import com.huami.feedback.entity.Contact;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/huami/feedback/repo/ContactRepository;", "", "Lcom/huami/feedback/ContactType;", "contactType", "Lcom/huami/feedback/entity/Contact;", "getContactByType", "(Lcom/huami/feedback/ContactType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ContactSettingItemActivity.KEY_CONTACT, "", "saveContact", "(Lcom/huami/feedback/entity/Contact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public interface ContactRepository {
    @Nullable
    Object getContactByType(@NotNull ContactType contactType, @NotNull Continuation<? super Contact> continuation);

    @Nullable
    Object saveContact(@NotNull Contact contact, @NotNull Continuation<? super Unit> continuation);
}
