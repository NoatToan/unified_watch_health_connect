package com.google.firebase.crashlytics.internal.persistence;

import a23.g;
import com.garmin.android.apps.connectmobile.developer.glogger.GloggerAdminActivity;
import d53.u;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53722b;

    public /* synthetic */ b(Object obj, int i14) {
        this.f53721a = i14;
        this.f53722b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i14 = this.f53721a;
        Object obj = this.f53722b;
        switch (i14) {
            case 0:
                return FileStore.lambda$cleanupFileSystemDirs$0((String) obj, file, str);
            default:
                int i15 = GloggerAdminActivity.f33666d;
                str.getClass();
                return u.y(str, g.f((File) obj), true);
        }
    }
}
