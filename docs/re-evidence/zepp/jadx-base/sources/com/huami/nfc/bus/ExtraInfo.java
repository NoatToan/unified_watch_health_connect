package com.huami.nfc.bus;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huami/nfc/bus/ExtraInfo;", "", "", "getExtraInfo", "a", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "<init>", "()V", "Companion", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final class ExtraInfo {

    @NotNull
    public static final String PHONE_NUMBER = "mob_num";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String phoneNumber;

    @NotNull
    public final String getExtraInfo() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.phoneNumber;
        if (!(str == null || str.length() == 0)) {
            jSONObject.put(PHONE_NUMBER, this.phoneNumber);
        }
        return !jSONObject.keys().hasNext() ? "" : String.valueOf(jSONObject);
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final void setPhoneNumber(@Nullable String str) {
        this.phoneNumber = str;
    }
}
