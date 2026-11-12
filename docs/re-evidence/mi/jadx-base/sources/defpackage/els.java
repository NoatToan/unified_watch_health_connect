package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.LocalTestingException;
import com.xiaomi.onetrack.OneTrack;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class els implements vgt {
    public static final pbt i = new pbt("FakeAssetPackService");
    public static final AtomicInteger j = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final was f16789b;
    public final ihs c;
    public final Context d;
    public final dos e;
    public final xns f;
    public final Handler g = new Handler(Looper.getMainLooper());
    public final i7s h;

    @VisibleForTesting
    public els(File file, was wasVar, ihs ihsVar, Context context, dos dosVar, i7s i7sVar, xns xnsVar) {
        this.f16788a = file.getAbsolutePath();
        this.f16789b = wasVar;
        this.c = ihsVar;
        this.d = context;
        this.e = dosVar;
        this.h = i7sVar;
        this.f = xnsVar;
    }

    @VisibleForTesting
    public static long g(int i2, long j2) {
        if (i2 == 2) {
            return j2 / 2;
        }
        if (i2 == 3 || i2 == 4) {
            return j2;
        }
        return 0L;
    }

    public static String k(File file) throws LocalTestingException {
        try {
            return lls.a(Arrays.asList(file));
        } catch (IOException e) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", file), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e2);
        }
    }

    @Override // defpackage.vgt
    public final void a(int i2) {
        i.d("notifySessionFailed", new Object[0]);
    }

    @Override // defpackage.vgt
    public final void b(final int i2, final String str) {
        i.d("notifyModuleCompleted", new Object[0]);
        ((Executor) this.h.a()).execute(new Runnable() { // from class: xks
            @Override // java.lang.Runnable
            public final void run() {
                this.f39221a.i(i2, str);
            }
        });
    }

    @Override // defpackage.vgt
    public final Task c(int i2, String str, String str2, int i3) {
        i.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i2), str, str2, Integer.valueOf(i3));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            for (File file : l(str)) {
                if (c6s.a(file).equals(str2)) {
                    taskCompletionSource.setResult(ParcelFileDescriptor.open(file, 268435456));
                    return taskCompletionSource.getTask();
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
        } catch (LocalTestingException e) {
            i.e("getChunkFileDescriptor failed", e);
            taskCompletionSource.setException(e);
        } catch (FileNotFoundException e2) {
            i.e("getChunkFileDescriptor failed", e2);
            taskCompletionSource.setException(new LocalTestingException("Asset Slice file not found.", e2));
        }
    }

    @Override // defpackage.vgt
    public final Task d(Map map) {
        i.d("syncPacks()", new Object[0]);
        return Tasks.forResult(new ArrayList());
    }

    @Override // defpackage.vgt
    public final void e(List list) {
        i.d("cancelDownload(%s)", list);
    }

    @Override // defpackage.vgt
    public final void f() {
        i.d("keepAlive", new Object[0]);
    }

    public final /* synthetic */ void h(Intent intent) {
        this.f16789b.b(this.d, intent);
    }

    public final /* synthetic */ void i(int i2, String str) {
        try {
            j(i2, str, 4);
        } catch (LocalTestingException e) {
            i.e("notifyModuleCompleted failed", e);
        }
    }

    public final Bundle j(int i2, String str, int i3) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.e.a());
        bundle.putInt(OneTrack.Param.SESSION_ID, i2);
        File[] fileArrL = l(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long length = 0;
        for (File file : fileArrL) {
            length += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i3 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String strA = c6s.a(file);
            bundle.putParcelableArrayList(o9s.b("chunk_intents", str, strA), arrayList2);
            bundle.putString(o9s.b("uncompressed_hash_sha256", str, strA), k(file));
            bundle.putLong(o9s.b("uncompressed_size", str, strA), file.length());
            arrayList.add(strA);
        }
        bundle.putStringArrayList(o9s.a("slice_ids", str), arrayList);
        bundle.putLong(o9s.a("pack_version", str), this.e.a());
        bundle.putInt(o9s.a("status", str), i3);
        bundle.putInt(o9s.a("error_code", str), 0);
        bundle.putLong(o9s.a("bytes_downloaded", str), g(i3, length));
        bundle.putLong(o9s.a("total_bytes_to_download", str), length);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", g(i3, length));
        bundle.putLong("total_bytes_to_download", length);
        final Intent intentPutExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.g.post(new Runnable() { // from class: cls
            @Override // java.lang.Runnable
            public final void run() {
                this.f5469a.h(intentPutExtra);
            }
        });
        return bundle;
    }

    public final File[] l(final String str) throws LocalTestingException {
        File file = new File(this.f16788a);
        if (!file.isDirectory()) {
            throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: uks
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(String.valueOf(str).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (fileArrListFiles == null) {
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        if (fileArrListFiles.length == 0) {
            throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
        }
        for (File file2 : fileArrListFiles) {
            if (c6s.a(file2).equals(str)) {
                return fileArrListFiles;
            }
        }
        throw new LocalTestingException(String.format("No main slice available for pack '%s'.", str));
    }

    @Override // defpackage.vgt
    public final void f(int i2, String str, String str2, int i3) {
        i.d("notifyChunkTransferred", new Object[0]);
    }
}
