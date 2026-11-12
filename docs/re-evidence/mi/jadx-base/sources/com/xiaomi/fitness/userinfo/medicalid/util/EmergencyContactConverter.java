package com.xiaomi.fitness.userinfo.medicalid.util;

import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdAddEmergencyContactActivity;
import defpackage.ehi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/util/EmergencyContactConverter;", "", "<init>", "()V", "constructEmergencyContactDisplayText", "", MedicalIdAddEmergencyContactActivity.KEY_CONTACT_RELATION_TYPE_ID, "", MedicalIdAddEmergencyContactActivity.KEY_CONTACT_NUMBER, MedicalIdAddEmergencyContactActivity.KEY_CONTACT_NAME, "getContactRelationName", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmergencyContactConverter {

    @NotNull
    public static final EmergencyContactConverter INSTANCE = new EmergencyContactConverter();

    private EmergencyContactConverter() {
    }

    @NotNull
    public final String constructEmergencyContactDisplayText(int contactRelationType, @Nullable String contactNumber, @Nullable String contactName) {
        String[] stringArray = AppUtil.getApp().getResources().getStringArray(ehi.c);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        if (contactNumber == null || TextUtils.isEmpty(contactNumber)) {
            return "";
        }
        if (contactRelationType <= 0 || contactRelationType >= stringArray.length) {
            if (contactName == null || TextUtils.isEmpty(contactName)) {
                return contactNumber;
            }
            return contactNumber + " | " + contactName;
        }
        String str = stringArray[contactRelationType];
        Logger.d("CONTACT RELATION " + str, new Object[0]);
        Logger.d("CONTACT RELATION contactNumber " + contactNumber, new Object[0]);
        Logger.d("CONTACT RELATION contactName " + contactName, new Object[0]);
        if (TextUtils.isEmpty(String.valueOf(contactRelationType))) {
            return " " + contactNumber + " | " + contactName;
        }
        return contactNumber + "\n" + contactName + " | " + str;
    }

    @NotNull
    public final String getContactRelationName(int contactRelationType) {
        String[] stringArray = AppUtil.getApp().getResources().getStringArray(ehi.c);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        String str = stringArray[contactRelationType];
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        return str;
    }
}
