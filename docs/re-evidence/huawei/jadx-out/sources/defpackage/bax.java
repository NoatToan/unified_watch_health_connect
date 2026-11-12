package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.android.bundlecore.download.DownloadRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
final class bax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<DownloadRequest> f912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f914c;
    final List<baj> d;
    private long e;
    private final List<String> f;
    private List<Intent> g;
    private final int h;
    private long i;
    private int j;
    private PendingIntent k;

    bax(int i, List<String> list, List<baj> list2, List<DownloadRequest> list3, long j) {
        this.h = i;
        this.f = list;
        this.d = list2;
        a(list3, j);
    }

    void a(List<DownloadRequest> list, long j) {
        this.f912a = list;
        this.f914c = b(list);
        this.i = j;
    }

    int d() {
        return this.h;
    }

    List<String> e() {
        return this.f;
    }

    List<DownloadRequest> b() {
        return this.f912a;
    }

    List<String> c() {
        return this.f914c;
    }

    long f() {
        return this.i;
    }

    int a() {
        return this.j;
    }

    void b(int i) {
        this.j = i;
    }

    void d(long j) {
        this.e = j;
    }

    void a(int i) {
        this.f913b = i;
    }

    void e(PendingIntent pendingIntent) {
        this.k = pendingIntent;
    }

    void d(List<Intent> list) {
        this.g = list;
    }

    static Bundle e(bax baxVar) {
        int iA = baxVar.a();
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", baxVar.d());
        bundle.putInt("status", iA);
        bundle.putInt("error_code", baxVar.f913b);
        bundle.putLong("total_bytes_to_download", baxVar.f());
        bundle.putLong("bytes_downloaded", baxVar.e);
        bundle.putStringArrayList("module_names", (ArrayList) baxVar.e());
        bundle.putStringArrayList("download_module_names", (ArrayList) baxVar.c());
        if (iA == 8) {
            bundle.putParcelable("user_confirmation_intent", baxVar.k);
            return bundle;
        }
        if (iA == 10) {
            bundle.putParcelableArrayList("split_file_intents", (ArrayList) baxVar.g);
        }
        return bundle;
    }

    private static List<String> b(List<DownloadRequest> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<DownloadRequest> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getModuleName());
        }
        return arrayList;
    }
}
