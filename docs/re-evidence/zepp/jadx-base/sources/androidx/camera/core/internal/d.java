package androidx.camera.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.UseCase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d {
    @NonNull
    public static UseCase.EventCallback a(UseCaseEventConfig _this) {
        return (UseCase.EventCallback) _this.retrieveOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK);
    }

    @Nullable
    public static UseCase.EventCallback b(@Nullable UseCaseEventConfig _this, UseCase.EventCallback eventCallback) {
        return (UseCase.EventCallback) _this.retrieveOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
    }
}
