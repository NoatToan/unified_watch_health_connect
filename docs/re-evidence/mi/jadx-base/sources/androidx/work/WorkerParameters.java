package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.jci;
import defpackage.m1p;
import defpackage.t0a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UUID f3179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Data f3180b;
    public Set<String> c;
    public a d;
    public int e;
    public Executor f;
    public CoroutineContext g;
    public m1p h;
    public WorkerFactory i;
    public jci j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t0a f3181k;
    public int l;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<String> f3182a = Collections.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<Uri> f3183b = Collections.emptyList();

        @RequiresApi(28)
        public Network c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerParameters(UUID uuid, Data data, Collection<String> collection, a aVar, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, Executor executor, CoroutineContext coroutineContext, m1p m1pVar, WorkerFactory workerFactory, jci jciVar, t0a t0aVar) {
        this.f3179a = uuid;
        this.f3180b = data;
        this.c = new HashSet(collection);
        this.d = aVar;
        this.e = i;
        this.l = i2;
        this.f = executor;
        this.g = coroutineContext;
        this.h = m1pVar;
        this.i = workerFactory;
        this.j = jciVar;
        this.f3181k = t0aVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Executor a() {
        return this.f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public t0a b() {
        return this.f3181k;
    }

    @IntRange(from = 0)
    public int c() {
        return this.l;
    }

    public UUID d() {
        return this.f3179a;
    }

    public Data e() {
        return this.f3180b;
    }

    @RequiresApi(28)
    public Network f() {
        return this.d.c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public jci g() {
        return this.j;
    }

    @IntRange(from = 0)
    public int h() {
        return this.e;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public a i() {
        return this.d;
    }

    public Set<String> j() {
        return this.c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public m1p k() {
        return this.h;
    }

    @RequiresApi(24)
    public List<String> l() {
        return this.d.f3182a;
    }

    @RequiresApi(24)
    public List<Uri> m() {
        return this.d.f3183b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CoroutineContext n() {
        return this.g;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerFactory o() {
        return this.i;
    }
}
