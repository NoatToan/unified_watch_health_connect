package com.huami.bluetooth.profile.channel.module.contact;

import com.huami.bluetooth.profile.channel.module.contact.bean.Contact;
import com.huami.bluetooth.profile.channel.module.contact.bean.VersionInfo;
import com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0013\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/contact/ContactApi;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "callback", "", "setInterceptor", "Lcom/huami/bluetooth/profile/channel/module/contact/bean/VersionInfo;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bluetooth/profile/channel/module/contact/bean/Contact;", ContactSettingItemActivity.KEY_CONTACT, "", "addContacts", "([Lcom/huami/bluetooth/profile/channel/module/contact/bean/Contact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteContact", "", "contacts", "setContact", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllContacts", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface ContactApi {
    @Nullable
    Object addContacts(@NotNull Contact[] contactArr, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object deleteContact(@NotNull Contact[] contactArr, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object getAllContacts(@NotNull Continuation<? super List<Contact>> continuation);

    @Nullable
    Object queryVersion(@NotNull Continuation<? super VersionInfo> continuation);

    @Nullable
    Object setContact(@NotNull List<Contact> list, @NotNull Continuation<? super Boolean> continuation);

    void setInterceptor(@NotNull DataTransferCallback callback);
}
