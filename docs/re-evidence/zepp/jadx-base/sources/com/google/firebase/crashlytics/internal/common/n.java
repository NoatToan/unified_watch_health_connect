package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
interface n {
    @NonNull
    String a();

    @Nullable
    CrashlyticsReport.FilesPayload.File b();

    @Nullable
    InputStream getStream();
}
