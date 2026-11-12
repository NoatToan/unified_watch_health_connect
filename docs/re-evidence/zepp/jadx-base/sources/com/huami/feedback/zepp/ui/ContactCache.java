package com.huami.feedback.zepp.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import com.huami.feedback.ContactType;
import com.huami.feedback.entity.Contact;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/feedback/zepp/ui/ContactCache;", "", "Lcom/huami/feedback/entity/Contact;", ContactSettingItemActivity.KEY_CONTACT, "", "cache", "Lcom/huami/feedback/ContactType;", "contactType", "getContactByType", "", "", "a", "Ljava/util/Map;", "<init>", "()V", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ContactCache {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Contact> cache = new LinkedHashMap();

    public final void cache(@NotNull Contact contact) {
        this.cache.put(contact.getContactType().name(), contact);
    }

    @NotNull
    public final Contact getContactByType(@NotNull ContactType contactType) {
        Contact contact = this.cache.get(contactType.name());
        return contact == null ? new Contact(contactType, "") : contact;
    }
}
