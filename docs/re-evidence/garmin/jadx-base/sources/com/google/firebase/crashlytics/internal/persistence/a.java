package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53720a;

    public /* synthetic */ a(int i14) {
        this.f53720a = i14;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f53720a) {
            case 0:
                return CrashlyticsReportPersistence.lambda$static$1(file, str);
            default:
                return CrashlyticsReportPersistence.isNormalPriorityEventFile(file, str);
        }
    }
}
