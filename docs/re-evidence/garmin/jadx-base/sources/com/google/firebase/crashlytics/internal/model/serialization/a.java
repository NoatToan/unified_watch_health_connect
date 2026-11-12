package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements CrashlyticsReportJsonTransform.ObjectParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53719a;

    public /* synthetic */ a(int i14) {
        this.f53719a = i14;
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
    public final Object parse(JsonReader jsonReader) {
        switch (this.f53719a) {
            case 0:
                return CrashlyticsReportJsonTransform.parseEventFrame(jsonReader);
            case 1:
                return CrashlyticsReportJsonTransform.parseBuildIdMappingForArch(jsonReader);
            case 2:
                return CrashlyticsReportJsonTransform.parseCustomAttribute(jsonReader);
            case 3:
                return CrashlyticsReportJsonTransform.parseProcessDetails(jsonReader);
            case 4:
                return CrashlyticsReportJsonTransform.parseEvent(jsonReader);
            case 5:
                return CrashlyticsReportJsonTransform.parseEventThread(jsonReader);
            case 6:
                return CrashlyticsReportJsonTransform.parseEventBinaryImage(jsonReader);
            case 7:
                return CrashlyticsReportJsonTransform.parseFile(jsonReader);
            default:
                return CrashlyticsReportJsonTransform.parseEventRolloutsAssignment(jsonReader);
        }
    }
}
