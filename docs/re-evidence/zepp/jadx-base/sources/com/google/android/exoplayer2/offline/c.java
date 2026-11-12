package com.google.android.exoplayer2.offline;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Comparator {
    public static final /* synthetic */ c a = new c();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return DownloadManager.c.d((Download) obj, (Download) obj2);
    }
}
