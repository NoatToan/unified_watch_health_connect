package com.huami.feedback.domain;

import com.huami.feedback.ContactType;
import com.huami.feedback.entity.Contact;
import com.huami.feedback.util.TextUtilKt;
import com.huami.feedback.util.Utils;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¨\u0006\b"}, d2 = {"Lcom/huami/feedback/domain/CheckContactValidateUseCase;", "", "Lcom/huami/feedback/entity/Contact;", ContactSettingItemActivity.KEY_CONTACT, "Lcom/huami/feedback/domain/ContactValidateState;", "invoke", "<init>", "()V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class CheckContactValidateUseCase {
    @NotNull
    public final ContactValidateState invoke(@NotNull Contact contact) {
        if (contact.getContactInfo().length() == 0) {
            return ContactValidateState.Successful;
        }
        if (contact.getContactType() == ContactType.EMAIL && !Utils.isEmailFormat(contact.getContactInfo())) {
            return ContactValidateState.EmailInValid;
        }
        if (contact.getContactType() != ContactType.PHONE || TextUtilKt.isPhoneNumFormat(contact.getContactInfo())) {
            return (contact.getContactType() != ContactType.WECHAT_ID || TextUtilKt.isWeChatIdFormat(contact.getContactInfo())) ? ContactValidateState.Successful : ContactValidateState.WeChatIDInValid;
        }
        return ContactValidateState.PhoneNumInValid;
    }
}
