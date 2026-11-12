package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<? extends a> f21496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21497b = 0;
    public final int c;
    public int d;

    public b(@NotNull ArrayList<? extends a> arrayList) {
        this.f21496a = arrayList;
        this.c = arrayList.size();
    }

    public static b c(@NotNull BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return new b(arrayList);
            }
            i++;
            arrayList.add(new a(i, line));
        }
    }

    public boolean a() {
        return this.d < this.c;
    }

    @Nullable
    public a b() {
        int i = this.d;
        if (i < this.f21497b || i >= this.c) {
            return null;
        }
        ArrayList<? extends a> arrayList = this.f21496a;
        this.d = i + 1;
        return arrayList.get(i);
    }

    public void d() {
        this.d--;
    }
}
