package com.huami.feedback.datasource;

import com.huami.feedback.entity.Contact;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/huami/feedback/datasource/ContactDataSource;", "", "", "Lcom/huami/feedback/entity/Contact;", "getContacts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ContactSettingItemActivity.KEY_CONTACT, "", "saveContact", "(Lcom/huami/feedback/entity/Contact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public interface ContactDataSource {
    @Nullable
    Object getContacts(@NotNull Continuation<? super List<Contact>> continuation);

    @Nullable
    Object saveContact(@NotNull Contact contact, @NotNull Continuation<? super Unit> continuation);
}
