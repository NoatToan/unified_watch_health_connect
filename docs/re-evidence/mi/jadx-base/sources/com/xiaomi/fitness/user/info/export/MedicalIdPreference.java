package com.xiaomi.fitness.user.info.export;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository;
import com.xiaomi.fitness.user.info.export.medicalid.MedicalIdRecord;
import com.xiaomi.fitness.user.info.export.medicalid.MedicalIdRepositoryExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\bI\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\J\u000e\u0010]\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\u001eR+\u0010!\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010'\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010 \u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u0010-\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010 \u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R+\u00101\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010 \u001a\u0004\b2\u0010\b\"\u0004\b3\u0010\u001eR+\u00105\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010 \u001a\u0004\b6\u0010\b\"\u0004\b7\u0010\u001eR+\u00109\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010 \u001a\u0004\b:\u0010\b\"\u0004\b;\u0010\u001eR+\u0010=\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010 \u001a\u0004\b>\u0010\b\"\u0004\b?\u0010\u001eR+\u0010A\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010 \u001a\u0004\bB\u0010)\"\u0004\bC\u0010+R+\u0010E\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010 \u001a\u0004\bF\u0010\b\"\u0004\bG\u0010\u001eR+\u0010I\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010 \u001a\u0004\bJ\u0010\b\"\u0004\bK\u0010\u001eR+\u0010M\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010 \u001a\u0004\bN\u0010)\"\u0004\bO\u0010+R+\u0010Q\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010 \u001a\u0004\bR\u0010\b\"\u0004\bS\u0010\u001eR+\u0010U\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010 \u001a\u0004\bV\u0010)\"\u0004\bW\u0010+R+\u0010^\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bc\u0010 \u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR+\u0010d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010 \u001a\u0004\be\u0010`\"\u0004\bf\u0010b¨\u0006h"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/MedicalIdPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "TAG", "", "spName", "getSpName", "()Ljava/lang/String;", "lockScreenShowStatus", "", "initStatus", "", "initName", "initAvatarFilePath", "initBirthday", "", "initGender", "initBloodType", "initAllergyDrugs", "initChronic", "initTreatment", "initDonorType", "initContactName", "initContactNumber", "initContactRelationType", "<set-?>", "PREF_USER_NAME", "getPREF_USER_NAME", "setPREF_USER_NAME", "(Ljava/lang/String;)V", "PREF_USER_NAME$delegate", "Lkotlin/properties/ReadWriteProperty;", "PREF_BIRTHDAY", "getPREF_BIRTHDAY", "()J", "setPREF_BIRTHDAY", "(J)V", "PREF_BIRTHDAY$delegate", "PREF_GENDER", "getPREF_GENDER", "()I", "setPREF_GENDER", "(I)V", "PREF_GENDER$delegate", "PREF_BLOOD_TYPE", "getPREF_BLOOD_TYPE", "setPREF_BLOOD_TYPE", "PREF_BLOOD_TYPE$delegate", "PREF_ALLERGY_DRUGS", "getPREF_ALLERGY_DRUGS", "setPREF_ALLERGY_DRUGS", "PREF_ALLERGY_DRUGS$delegate", "PREF_CHRONIC", "getPREF_CHRONIC", "setPREF_CHRONIC", "PREF_CHRONIC$delegate", "PREF_TREATMENT", "getPREF_TREATMENT", "setPREF_TREATMENT", "PREF_TREATMENT$delegate", "PREF_REMARK", "getPREF_REMARK", "setPREF_REMARK", "PREF_REMARK$delegate", "PREF_ORGAN_DONOR", "getPREF_ORGAN_DONOR", "setPREF_ORGAN_DONOR", "PREF_ORGAN_DONOR$delegate", "PREF_EMERGENCY_CONTACT_NAME", "getPREF_EMERGENCY_CONTACT_NAME", "setPREF_EMERGENCY_CONTACT_NAME", "PREF_EMERGENCY_CONTACT_NAME$delegate", "PREF_EMERGENCY_CONTACT_NUMBER", "getPREF_EMERGENCY_CONTACT_NUMBER", "setPREF_EMERGENCY_CONTACT_NUMBER", "PREF_EMERGENCY_CONTACT_NUMBER$delegate", "PREF_EMERGENCY_CONTACT_RELATION", "getPREF_EMERGENCY_CONTACT_RELATION", "setPREF_EMERGENCY_CONTACT_RELATION", "PREF_EMERGENCY_CONTACT_RELATION$delegate", "PREF_AVATAR_PATH", "getPREF_AVATAR_PATH", "setPREF_AVATAR_PATH", "PREF_AVATAR_PATH$delegate", "PREF_LOCK_SCREEN_SHOW", "getPREF_LOCK_SCREEN_SHOW", "setPREF_LOCK_SCREEN_SHOW", "PREF_LOCK_SCREEN_SHOW$delegate", "setMedicalReport", "", "medicalIdRecord", "Lcom/xiaomi/fitness/user/info/export/medicalid/MedicalIdRecord;", "getMedicalReport", "SHOW_WHEN_LOCK_SCREEN", "getSHOW_WHEN_LOCK_SCREEN", "()Z", "setSHOW_WHEN_LOCK_SCREEN", "(Z)V", "SHOW_WHEN_LOCK_SCREEN$delegate", "MEDICAL_ID_INIT_STATUS", "getMEDICAL_ID_INIT_STATUS", "setMEDICAL_ID_INIT_STATUS", "MEDICAL_ID_INIT_STATUS$delegate", "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMedicalIdPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedicalIdPreference.kt\ncom/xiaomi/fitness/user/info/export/MedicalIdPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,109:1\n135#2,6:110\n135#2,6:116\n135#2,6:122\n135#2,6:128\n135#2,6:134\n135#2,6:140\n135#2,6:146\n135#2,6:152\n135#2,6:158\n135#2,6:164\n135#2,6:170\n135#2,6:176\n135#2,6:182\n135#2,6:188\n135#2,6:194\n135#2,6:200\n*S KotlinDebug\n*F\n+ 1 MedicalIdPreference.kt\ncom/xiaomi/fitness/user/info/export/MedicalIdPreference\n*L\n45#1:110,6\n46#1:116,6\n47#1:122,6\n48#1:128,6\n49#1:134,6\n50#1:140,6\n51#1:146,6\n52#1:152,6\n53#1:158,6\n54#1:164,6\n55#1:170,6\n56#1:176,6\n57#1:182,6\n58#1:188,6\n97#1:194,6\n105#1:200,6\n*E\n"})
public final class MedicalIdPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "PREF_USER_NAME", "getPREF_USER_NAME()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "PREF_BIRTHDAY", "getPREF_BIRTHDAY()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "PREF_GENDER", "getPREF_GENDER()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "PREF_BLOOD_TYPE", "getPREF_BLOOD_TYPE()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "PREF_ALLERGY_DRUGS", "getPREF_ALLERGY_DRUGS()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "PREF_CHRONIC", "getPREF_CHRONIC()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "PREF_TREATMENT", "getPREF_TREATMENT()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "PREF_REMARK", "getPREF_REMARK()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "PREF_ORGAN_DONOR", "getPREF_ORGAN_DONOR()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "PREF_EMERGENCY_CONTACT_NAME", "getPREF_EMERGENCY_CONTACT_NAME()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "PREF_EMERGENCY_CONTACT_NUMBER", "getPREF_EMERGENCY_CONTACT_NUMBER()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "PREF_EMERGENCY_CONTACT_RELATION", "getPREF_EMERGENCY_CONTACT_RELATION()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "PREF_AVATAR_PATH", "getPREF_AVATAR_PATH()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "PREF_LOCK_SCREEN_SHOW", "getPREF_LOCK_SCREEN_SHOW()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "SHOW_WHEN_LOCK_SCREEN", "getSHOW_WHEN_LOCK_SCREEN()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedicalIdPreference.class, "MEDICAL_ID_INIT_STATUS", "getMEDICAL_ID_INIT_STATUS()Z", 0))};

    @NotNull
    public static final MedicalIdPreference INSTANCE;

    /* JADX INFO: renamed from: MEDICAL_ID_INIT_STATUS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty MEDICAL_ID_INIT_STATUS;

    /* JADX INFO: renamed from: PREF_ALLERGY_DRUGS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_ALLERGY_DRUGS;

    /* JADX INFO: renamed from: PREF_AVATAR_PATH$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_AVATAR_PATH;

    /* JADX INFO: renamed from: PREF_BIRTHDAY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_BIRTHDAY;

    /* JADX INFO: renamed from: PREF_BLOOD_TYPE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_BLOOD_TYPE;

    /* JADX INFO: renamed from: PREF_CHRONIC$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_CHRONIC;

    /* JADX INFO: renamed from: PREF_EMERGENCY_CONTACT_NAME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_EMERGENCY_CONTACT_NAME;

    /* JADX INFO: renamed from: PREF_EMERGENCY_CONTACT_NUMBER$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_EMERGENCY_CONTACT_NUMBER;

    /* JADX INFO: renamed from: PREF_EMERGENCY_CONTACT_RELATION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_EMERGENCY_CONTACT_RELATION;

    /* JADX INFO: renamed from: PREF_GENDER$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_GENDER;

    /* JADX INFO: renamed from: PREF_LOCK_SCREEN_SHOW$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_LOCK_SCREEN_SHOW;

    /* JADX INFO: renamed from: PREF_ORGAN_DONOR$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_ORGAN_DONOR;

    /* JADX INFO: renamed from: PREF_REMARK$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_REMARK;

    /* JADX INFO: renamed from: PREF_TREATMENT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_TREATMENT;

    /* JADX INFO: renamed from: PREF_USER_NAME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_USER_NAME;

    /* JADX INFO: renamed from: SHOW_WHEN_LOCK_SCREEN$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOW_WHEN_LOCK_SCREEN;

    @NotNull
    public static final String TAG = "MedicalIdPreference";

    @NotNull
    private static final String initAllergyDrugs;

    @NotNull
    private static final String initAvatarFilePath;
    private static final long initBirthday;
    private static final int initBloodType;

    @NotNull
    private static final String initChronic;

    @NotNull
    private static final String initContactName;

    @NotNull
    private static final String initContactNumber;
    private static final int initContactRelationType;
    private static final int initDonorType;
    private static final int initGender;

    @NotNull
    private static final String initName;
    private static final boolean initStatus;

    @NotNull
    private static final String initTreatment;
    private static int lockScreenShowStatus;

    static {
        MedicalIdPreference medicalIdPreference = new MedicalIdPreference();
        INSTANCE = medicalIdPreference;
        IMedicalIdRepository.Companion companion = IMedicalIdRepository.INSTANCE;
        lockScreenShowStatus = MedicalIdRepositoryExtKt.getInstance(companion).getIntFromSP(MedicalIdSPContract.PREF_LOCK_SCREEN_SHOW, -1);
        boolean booleanFromSP = MedicalIdRepositoryExtKt.getInstance(companion).getBooleanFromSP(MedicalIdSPContract.PREF_FIRST, true);
        initStatus = booleanFromSP;
        String stringFromSP = MedicalIdRepositoryExtKt.getInstance(companion).getStringFromSP(MedicalIdSPContract.PREF_AVATAR_PATH, "");
        String str = stringFromSP == null ? "" : stringFromSP;
        initAvatarFilePath = str;
        String stringFromSP2 = MedicalIdRepositoryExtKt.getInstance(companion).getStringFromSP("name", "");
        String str2 = stringFromSP2 == null ? "" : stringFromSP2;
        initName = str2;
        long longFromSP = MedicalIdRepositoryExtKt.getInstance(companion).getLongFromSP(MedicalIdSPContract.PREF_BIRTHDAY, 0L);
        initBirthday = longFromSP;
        int intFromSP = MedicalIdRepositoryExtKt.getInstance(companion).getIntFromSP("gender", 0);
        initGender = intFromSP;
        int intFromSP2 = MedicalIdRepositoryExtKt.getInstance(companion).getIntFromSP(MedicalIdSPContract.PREF_BLOOD_TYPE, 0);
        initBloodType = intFromSP2;
        String stringFromSP3 = MedicalIdRepositoryExtKt.getInstance(companion).getStringFromSP(MedicalIdSPContract.PREF_ALLERGY_DRUGS, "");
        String str3 = stringFromSP3 == null ? "" : stringFromSP3;
        initAllergyDrugs = str3;
        String stringFromSP4 = MedicalIdRepositoryExtKt.getInstance(companion).getStringFromSP(MedicalIdSPContract.PREF_CHRONIC, "");
        String str4 = stringFromSP4 == null ? "" : stringFromSP4;
        initChronic = str4;
        String stringFromSP5 = MedicalIdRepositoryExtKt.getInstance(companion).getStringFromSP(MedicalIdSPContract.PREF_TREATMENT, "");
        String str5 = stringFromSP5 == null ? "" : stringFromSP5;
        initTreatment = str5;
        int intFromSP3 = MedicalIdRepositoryExtKt.getInstance(companion).getIntFromSP(MedicalIdSPContract.PREF_ORGAN_DONOR, 0);
        initDonorType = intFromSP3;
        String stringFromSP6 = MedicalIdRepositoryExtKt.getInstance(companion).getStringFromSP(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_NAME, "");
        String str6 = stringFromSP6 == null ? "" : stringFromSP6;
        initContactName = str6;
        String stringFromSP7 = MedicalIdRepositoryExtKt.getInstance(companion).getStringFromSP(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_NUMBER, "");
        String str7 = stringFromSP7 == null ? "" : stringFromSP7;
        initContactNumber = str7;
        int intFromSP4 = MedicalIdRepositoryExtKt.getInstance(companion).getIntFromSP(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_RELATION, 0);
        initContactRelationType = intFromSP4;
        Logger.i(TAG, "showStatus=" + lockScreenShowStatus + " initStatus=" + booleanFromSP);
        PREF_USER_NAME = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), str2, null, true);
        PREF_BIRTHDAY = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), Long.valueOf(longFromSP), null, true);
        PREF_GENDER = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), Integer.valueOf(intFromSP), null, true);
        PREF_BLOOD_TYPE = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), Integer.valueOf(intFromSP2), null, true);
        PREF_ALLERGY_DRUGS = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), str3, null, true);
        PREF_CHRONIC = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$6
        }.getType(), str4, null, true);
        PREF_TREATMENT = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$7
        }.getType(), str5, null, true);
        PREF_REMARK = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$8
        }.getType(), "", null, true);
        PREF_ORGAN_DONOR = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$9
        }.getType(), Integer.valueOf(intFromSP3), null, true);
        PREF_EMERGENCY_CONTACT_NAME = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$10
        }.getType(), str6, null, true);
        PREF_EMERGENCY_CONTACT_NUMBER = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$11
        }.getType(), str7, null, true);
        PREF_EMERGENCY_CONTACT_RELATION = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$12
        }.getType(), Integer.valueOf(intFromSP4), null, true);
        PREF_AVATAR_PATH = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$13
        }.getType(), str, null, true);
        PREF_LOCK_SCREEN_SHOW = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$14
        }.getType(), Integer.valueOf(lockScreenShowStatus), null, true);
        SHOW_WHEN_LOCK_SCREEN = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$15
        }.getType(), Boolean.valueOf(lockScreenShowStatus == 1), null, false);
        MEDICAL_ID_INIT_STATUS = medicalIdPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.user.info.export.MedicalIdPreference$special$$inlined$bindToPreferenceField$default$16
        }.getType(), Boolean.valueOf(booleanFromSP), null, true);
    }

    private MedicalIdPreference() {
    }

    private final String getPREF_ALLERGY_DRUGS() {
        return (String) PREF_ALLERGY_DRUGS.getValue(this, $$delegatedProperties[4]);
    }

    private final String getPREF_AVATAR_PATH() {
        return (String) PREF_AVATAR_PATH.getValue(this, $$delegatedProperties[12]);
    }

    private final long getPREF_BIRTHDAY() {
        return ((Number) PREF_BIRTHDAY.getValue(this, $$delegatedProperties[1])).longValue();
    }

    private final int getPREF_BLOOD_TYPE() {
        return ((Number) PREF_BLOOD_TYPE.getValue(this, $$delegatedProperties[3])).intValue();
    }

    private final String getPREF_CHRONIC() {
        return (String) PREF_CHRONIC.getValue(this, $$delegatedProperties[5]);
    }

    private final String getPREF_EMERGENCY_CONTACT_NAME() {
        return (String) PREF_EMERGENCY_CONTACT_NAME.getValue(this, $$delegatedProperties[9]);
    }

    private final String getPREF_EMERGENCY_CONTACT_NUMBER() {
        return (String) PREF_EMERGENCY_CONTACT_NUMBER.getValue(this, $$delegatedProperties[10]);
    }

    private final int getPREF_EMERGENCY_CONTACT_RELATION() {
        return ((Number) PREF_EMERGENCY_CONTACT_RELATION.getValue(this, $$delegatedProperties[11])).intValue();
    }

    private final int getPREF_GENDER() {
        return ((Number) PREF_GENDER.getValue(this, $$delegatedProperties[2])).intValue();
    }

    private final int getPREF_LOCK_SCREEN_SHOW() {
        return ((Number) PREF_LOCK_SCREEN_SHOW.getValue(this, $$delegatedProperties[13])).intValue();
    }

    private final int getPREF_ORGAN_DONOR() {
        return ((Number) PREF_ORGAN_DONOR.getValue(this, $$delegatedProperties[8])).intValue();
    }

    private final String getPREF_REMARK() {
        return (String) PREF_REMARK.getValue(this, $$delegatedProperties[7]);
    }

    private final String getPREF_TREATMENT() {
        return (String) PREF_TREATMENT.getValue(this, $$delegatedProperties[6]);
    }

    private final String getPREF_USER_NAME() {
        return (String) PREF_USER_NAME.getValue(this, $$delegatedProperties[0]);
    }

    private final void setPREF_ALLERGY_DRUGS(String str) {
        PREF_ALLERGY_DRUGS.setValue(this, $$delegatedProperties[4], str);
    }

    private final void setPREF_AVATAR_PATH(String str) {
        PREF_AVATAR_PATH.setValue(this, $$delegatedProperties[12], str);
    }

    private final void setPREF_BIRTHDAY(long j) {
        PREF_BIRTHDAY.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    private final void setPREF_BLOOD_TYPE(int i) {
        PREF_BLOOD_TYPE.setValue(this, $$delegatedProperties[3], Integer.valueOf(i));
    }

    private final void setPREF_CHRONIC(String str) {
        PREF_CHRONIC.setValue(this, $$delegatedProperties[5], str);
    }

    private final void setPREF_EMERGENCY_CONTACT_NAME(String str) {
        PREF_EMERGENCY_CONTACT_NAME.setValue(this, $$delegatedProperties[9], str);
    }

    private final void setPREF_EMERGENCY_CONTACT_NUMBER(String str) {
        PREF_EMERGENCY_CONTACT_NUMBER.setValue(this, $$delegatedProperties[10], str);
    }

    private final void setPREF_EMERGENCY_CONTACT_RELATION(int i) {
        PREF_EMERGENCY_CONTACT_RELATION.setValue(this, $$delegatedProperties[11], Integer.valueOf(i));
    }

    private final void setPREF_GENDER(int i) {
        PREF_GENDER.setValue(this, $$delegatedProperties[2], Integer.valueOf(i));
    }

    private final void setPREF_LOCK_SCREEN_SHOW(int i) {
        PREF_LOCK_SCREEN_SHOW.setValue(this, $$delegatedProperties[13], Integer.valueOf(i));
    }

    private final void setPREF_ORGAN_DONOR(int i) {
        PREF_ORGAN_DONOR.setValue(this, $$delegatedProperties[8], Integer.valueOf(i));
    }

    private final void setPREF_REMARK(String str) {
        PREF_REMARK.setValue(this, $$delegatedProperties[7], str);
    }

    private final void setPREF_TREATMENT(String str) {
        PREF_TREATMENT.setValue(this, $$delegatedProperties[6], str);
    }

    private final void setPREF_USER_NAME(String str) {
        PREF_USER_NAME.setValue(this, $$delegatedProperties[0], str);
    }

    public final boolean getMEDICAL_ID_INIT_STATUS() {
        return ((Boolean) MEDICAL_ID_INIT_STATUS.getValue(this, $$delegatedProperties[15])).booleanValue();
    }

    public final void getMedicalReport(@NotNull MedicalIdRecord medicalIdRecord) {
        Intrinsics.checkNotNullParameter(medicalIdRecord, "medicalIdRecord");
        MedicalIdPreference medicalIdPreference = INSTANCE;
        medicalIdRecord.setAvatarFilePath(medicalIdPreference.getPREF_AVATAR_PATH());
        medicalIdRecord.setName(medicalIdPreference.getPREF_USER_NAME());
        medicalIdRecord.setBirthday(Long.valueOf(medicalIdPreference.getPREF_BIRTHDAY()));
        medicalIdRecord.setGender(medicalIdPreference.getPREF_GENDER());
        medicalIdRecord.setBloodType(medicalIdPreference.getPREF_BLOOD_TYPE());
        medicalIdRecord.setAllergyDrugs(medicalIdPreference.getPREF_ALLERGY_DRUGS());
        medicalIdRecord.setChronic(medicalIdPreference.getPREF_CHRONIC());
        medicalIdRecord.setTreatment(medicalIdPreference.getPREF_TREATMENT());
        medicalIdRecord.setDonorType(medicalIdPreference.getPREF_ORGAN_DONOR());
        medicalIdRecord.setLockShowStatus(lockScreenShowStatus);
        medicalIdRecord.setContactName(medicalIdPreference.getPREF_EMERGENCY_CONTACT_NAME());
        medicalIdRecord.setContactNumber(medicalIdPreference.getPREF_EMERGENCY_CONTACT_NUMBER());
        medicalIdRecord.setContactRelationType(medicalIdPreference.getPREF_EMERGENCY_CONTACT_RELATION());
    }

    public final boolean getSHOW_WHEN_LOCK_SCREEN() {
        return ((Boolean) SHOW_WHEN_LOCK_SCREEN.getValue(this, $$delegatedProperties[14])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "medical_id";
    }

    public final void setMEDICAL_ID_INIT_STATUS(boolean z) {
        MEDICAL_ID_INIT_STATUS.setValue(this, $$delegatedProperties[15], Boolean.valueOf(z));
    }

    public final void setMedicalReport(@NotNull MedicalIdRecord medicalIdRecord) {
        Intrinsics.checkNotNullParameter(medicalIdRecord, "medicalIdRecord");
        String avatarFilePath = medicalIdRecord.getAvatarFilePath();
        if (avatarFilePath == null) {
            avatarFilePath = "";
        }
        setPREF_AVATAR_PATH(avatarFilePath);
        String name = medicalIdRecord.getName();
        if (name == null) {
            name = "";
        }
        setPREF_USER_NAME(name);
        Long birthday = medicalIdRecord.getBirthday();
        setPREF_BIRTHDAY(birthday != null ? birthday.longValue() : -1L);
        setPREF_GENDER(medicalIdRecord.getGender());
        setPREF_BLOOD_TYPE(medicalIdRecord.getBloodType());
        String allergyDrugs = medicalIdRecord.getAllergyDrugs();
        if (allergyDrugs == null) {
            allergyDrugs = "";
        }
        setPREF_ALLERGY_DRUGS(allergyDrugs);
        String chronic = medicalIdRecord.getChronic();
        if (chronic == null) {
            chronic = "";
        }
        setPREF_CHRONIC(chronic);
        String treatment = medicalIdRecord.getTreatment();
        if (treatment == null) {
            treatment = "";
        }
        setPREF_TREATMENT(treatment);
        setPREF_ORGAN_DONOR(medicalIdRecord.getDonorType());
        setPREF_LOCK_SCREEN_SHOW(medicalIdRecord.getLockShowStatus());
        String contactName = medicalIdRecord.getContactName();
        if (contactName == null) {
            contactName = "";
        }
        setPREF_EMERGENCY_CONTACT_NAME(contactName);
        String contactNumber = medicalIdRecord.getContactNumber();
        setPREF_EMERGENCY_CONTACT_NUMBER(contactNumber != null ? contactNumber : "");
        setPREF_EMERGENCY_CONTACT_RELATION(medicalIdRecord.getContactRelationType());
    }

    public final void setSHOW_WHEN_LOCK_SCREEN(boolean z) {
        SHOW_WHEN_LOCK_SCREEN.setValue(this, $$delegatedProperties[14], Boolean.valueOf(z));
    }
}
