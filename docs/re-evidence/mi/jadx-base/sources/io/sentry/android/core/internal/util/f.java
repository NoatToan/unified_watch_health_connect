package io.sentry.android.core.internal.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f21508b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Integer> f21509a = new ArrayList();

    public static f a() {
        return f21508b;
    }

    @VisibleForTesting
    @NotNull
    public String b() {
        return "/sys/devices/system/cpu";
    }

    @NotNull
    public synchronized List<Integer> c() {
        if (!this.f21509a.isEmpty()) {
            return this.f21509a;
        }
        File[] fileArrListFiles = new File(b()).listFiles();
        if (fileArrListFiles == null) {
            return new ArrayList();
        }
        for (File file : fileArrListFiles) {
            if (file.getName().matches("cpu[0-9]+")) {
                File file2 = new File(file, "cpufreq/cpuinfo_max_freq");
                if (file2.exists() && file2.canRead()) {
                    try {
                        String strC = io.sentry.util.e.c(file2);
                        if (strC != null) {
                            this.f21509a.add(Integer.valueOf((int) (Long.parseLong(strC.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
        }
        return this.f21509a;
    }
}
