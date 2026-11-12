package com.huami.ai.skill;

import com.huami.ai.entity.phone.CallType;
import com.huami.ai.entity.phone.Contact;
import com.huami.ai.entity.phone.SimType;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\n"}, d2 = {"Lcom/huami/ai/skill/PhoneCallSkill;", "", "Lcom/huami/ai/entity/phone/SimType;", "simType", "Lcom/huami/ai/entity/phone/CallType;", "callType", "Lcom/huami/ai/entity/phone/Contact;", ContactSettingItemActivity.KEY_CONTACT, "", "makeCall", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public interface PhoneCallSkill {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void makeCall$default(PhoneCallSkill phoneCallSkill, SimType simType, CallType callType, Contact contact, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeCall");
            }
            if ((i & 2) != 0) {
                callType = null;
            }
            if ((i & 4) != 0) {
                contact = null;
            }
            phoneCallSkill.makeCall(simType, callType, contact);
        }
    }

    void makeCall(@NotNull SimType simType, @Nullable CallType callType, @Nullable Contact contact);
}
