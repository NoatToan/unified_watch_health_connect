package com.garmin.android.apps.connectmobile.nutrition.domain.usecase;

import b11.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/domain/usecase/CustomFoodImageUploadFailed;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lb11/e;", "food", "<init>", "(Lb11/e;)V", "Lb11/e;", "getFood", "()Lb11/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CustomFoodImageUploadFailed extends Exception {
    public static final int $stable = 8;
    private final e food;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFoodImageUploadFailed(e eVar) {
        super("Custom food image upload failed");
        eVar.getClass();
        this.food = eVar;
    }

    public final e getFood() {
        return this.food;
    }
}
