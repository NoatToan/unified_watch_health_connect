package com.garmin.android.apps.connectmobile.nutrition.domain.usecase;

import i53.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/domain/usecase/CreateFoodException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Li53/c;", "Lv01/c;", "errors", "<init>", "(Li53/c;)V", "component1", "()Li53/c;", "copy", "(Li53/c;)Lcom/garmin/android/apps/connectmobile/nutrition/domain/usecase/CreateFoodException;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Li53/c;", "getErrors", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class CreateFoodException extends Exception {
    public static final int $stable = 8;
    private final c<v01.c> errors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateFoodException(c<? extends v01.c> cVar) {
        super("Create food failed because of missing data " + cVar);
        cVar.getClass();
        this.errors = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateFoodException copy$default(CreateFoodException createFoodException, c cVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            cVar = createFoodException.errors;
        }
        return createFoodException.copy(cVar);
    }

    public final c<v01.c> component1() {
        return this.errors;
    }

    public final CreateFoodException copy(c<? extends v01.c> errors) {
        errors.getClass();
        return new CreateFoodException(errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateFoodException) && s.g(this.errors, ((CreateFoodException) other).errors);
    }

    public final c<v01.c> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        return this.errors.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CreateFoodException(errors=" + this.errors + ")";
    }
}
