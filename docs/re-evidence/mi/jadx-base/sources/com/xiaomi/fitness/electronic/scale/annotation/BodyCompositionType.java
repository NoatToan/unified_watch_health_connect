package com.xiaomi.fitness.electronic.scale.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/annotation/BodyCompositionType;", "", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface BodyCompositionType {
    public static final int BASAL_METABOLISM = 14;
    public static final int BMI = 0;
    public static final int BODY_AGE = 16;
    public static final int BONE_SALT_MASS = 9;
    public static final int BONE_SALT_RATE = 10;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int FAT_MASS = 2;
    public static final int FAT_RATE = 1;
    public static final int LIMB_SKELETAL_MUSCLE = 13;
    public static final int MUSCLE_MASS = 4;
    public static final int MUSCLE_RATE = 3;
    public static final int PROTEIN_MASS = 8;
    public static final int PROTEIN_RATE = 7;
    public static final int RECOMMENDED_CALORIES_INTAKE = 17;
    public static final int SUGGESTED_WEIGHT = 11;
    public static final int VISCERAL_FAT = 12;
    public static final int WATER_MASS = 6;
    public static final int WATER_RATE = 5;
    public static final int WHR = 15;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/annotation/BodyCompositionType$Companion;", "", "<init>", "()V", "BMI", "", "FAT_RATE", "FAT_MASS", "MUSCLE_RATE", "MUSCLE_MASS", "WATER_RATE", "WATER_MASS", "PROTEIN_RATE", "PROTEIN_MASS", "BONE_SALT_MASS", "BONE_SALT_RATE", "SUGGESTED_WEIGHT", "VISCERAL_FAT", "LIMB_SKELETAL_MUSCLE", "BASAL_METABOLISM", "WHR", "BODY_AGE", "RECOMMENDED_CALORIES_INTAKE", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int BASAL_METABOLISM = 14;
        public static final int BMI = 0;
        public static final int BODY_AGE = 16;
        public static final int BONE_SALT_MASS = 9;
        public static final int BONE_SALT_RATE = 10;
        public static final int FAT_MASS = 2;
        public static final int FAT_RATE = 1;
        public static final int LIMB_SKELETAL_MUSCLE = 13;
        public static final int MUSCLE_MASS = 4;
        public static final int MUSCLE_RATE = 3;
        public static final int PROTEIN_MASS = 8;
        public static final int PROTEIN_RATE = 7;
        public static final int RECOMMENDED_CALORIES_INTAKE = 17;
        public static final int SUGGESTED_WEIGHT = 11;
        public static final int VISCERAL_FAT = 12;
        public static final int WATER_MASS = 6;
        public static final int WATER_RATE = 5;
        public static final int WHR = 15;

        private Companion() {
        }
    }
}
