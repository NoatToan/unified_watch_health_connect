package com.garmin.android.apps.connectmobile.nutrition.domain.usecase;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/domain/usecase/CustomMealImageUploadFailed;", "Ljava/lang/Exception;", "mealId", "", "<init>", "(J)V", "getMealId", "()J", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CustomMealImageUploadFailed extends Exception {
    public static final int $stable = 8;
    private final long mealId;

    public CustomMealImageUploadFailed(long j8) {
        super("Custom meal image upload failed");
        this.mealId = j8;
    }

    public final long getMealId() {
        return this.mealId;
    }
}
