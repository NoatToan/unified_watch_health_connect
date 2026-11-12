package com.xiaomi.fitness.user.info.export;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/MedicalIdSPContract;", "", "<init>", "()V", "PREF_FILE_NAME", "", "PREF_AVATAR_PATH", "PREF_USER_NAME", "PREF_BIRTHDAY", "PREF_GENDER", "PREF_BLOOD_TYPE", "PREF_ALLERGY_DRUGS", "PREF_CHRONIC", "PREF_TREATMENT", "PREF_ORGAN_DONOR", "PREF_EMERGENCY_CONTACT_NAME", "PREF_EMERGENCY_CONTACT_NUMBER", "PREF_EMERGENCY_CONTACT_RELATION", "PREF_REMARK", "PREF_FIRST", "PREF_LOCK_SCREEN_SHOW", "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MedicalIdSPContract {

    @NotNull
    public static final MedicalIdSPContract INSTANCE = new MedicalIdSPContract();

    @NotNull
    public static final String PREF_ALLERGY_DRUGS = "allergy";

    @NotNull
    public static final String PREF_AVATAR_PATH = "avatar";

    @NotNull
    public static final String PREF_BIRTHDAY = "birth";

    @NotNull
    public static final String PREF_BLOOD_TYPE = "blood";

    @NotNull
    public static final String PREF_CHRONIC = "chronic";

    @NotNull
    public static final String PREF_EMERGENCY_CONTACT_NAME = "conName";

    @NotNull
    public static final String PREF_EMERGENCY_CONTACT_NUMBER = "conNumber";

    @NotNull
    public static final String PREF_EMERGENCY_CONTACT_RELATION = "contactRelation";

    @NotNull
    public static final String PREF_FILE_NAME = "pref:aid";

    @NotNull
    public static final String PREF_FIRST = "first";

    @NotNull
    public static final String PREF_GENDER = "gender";

    @NotNull
    public static final String PREF_LOCK_SCREEN_SHOW = "lockShow";

    @NotNull
    public static final String PREF_ORGAN_DONOR = "donor";

    @NotNull
    public static final String PREF_REMARK = "remark";

    @NotNull
    public static final String PREF_TREATMENT = "treatment";

    @NotNull
    public static final String PREF_USER_NAME = "name";

    private MedicalIdSPContract() {
    }
}
