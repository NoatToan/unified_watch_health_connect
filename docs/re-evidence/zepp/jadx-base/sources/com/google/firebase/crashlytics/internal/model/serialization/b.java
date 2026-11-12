package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements CrashlyticsReportJsonTransform.a {
    public static final /* synthetic */ b a = new b();

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.a
    public final Object a(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.r(jsonReader);
    }
}
