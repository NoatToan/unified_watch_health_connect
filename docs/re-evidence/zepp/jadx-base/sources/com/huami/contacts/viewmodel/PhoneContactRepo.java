package com.huami.contacts.viewmodel;

import android.content.Context;
import com.github.tamir7.contacts.Contact;
import com.github.tamir7.contacts.Contacts;
import com.github.tamir7.contacts.Query;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/huami/contacts/viewmodel/PhoneContactRepo;", "", "", "Lcom/github/tamir7/contacts/Contact;", "loadAllContacts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "name", "searchByName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "phoneNum", "searchByPhoneNmu", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "contacts_release"}, k = 1, mv = {1, 4, 1})
public final class PhoneContactRepo {
    public PhoneContactRepo(@NotNull Context context) {
        Contacts.initialize(context.getApplicationContext());
    }

    @Nullable
    public final Object loadAllContacts(@NotNull Continuation<? super List<Contact>> continuation) {
        return Contacts.getQuery().find();
    }

    @Nullable
    public final Object searchByName(@NotNull String str, @NotNull Continuation<? super List<Contact>> continuation) {
        Query query = Contacts.getQuery();
        query.whereContains(Contact.Field.DisplayName, str);
        return query.find();
    }

    @Nullable
    public final Object searchByPhoneNmu(@NotNull String str, @NotNull Continuation<? super List<Contact>> continuation) {
        Query query = Contacts.getQuery();
        query.whereEqualTo(Contact.Field.PhoneNumber, str);
        return query.find();
    }
}
