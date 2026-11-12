package com.huami.watch.companion.ecg.media;

import android.content.Context;
import android.os.Environment;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0007\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/watch/companion/ecg/media/ExoCacheSource;", "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;", "Ljava/io/File;", "b", "Lcom/google/android/exoplayer2/upstream/DataSource;", "createDataSource", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "J", "maxCacheSize", "c", "maxFileSize", "Lcom/google/android/exoplayer2/upstream/DefaultDataSourceFactory;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/google/android/exoplayer2/upstream/DefaultDataSourceFactory;", "defaultDataSourceFactory", "<init>", "(Landroid/content/Context;JJ)V", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class ExoCacheSource implements DataSource.Factory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String e = "ecgVoiceTag";

    @Nullable
    private static SimpleCache f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long maxCacheSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long maxFileSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy defaultDataSourceFactory = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/watch/companion/ecg/media/ExoCacheSource$Companion;", "", "Ljava/io/File;", "dir", "Lcom/google/android/exoplayer2/upstream/cache/CacheEvictor;", "evictor", "Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;", "a", "", "CACHE_NAME", "Ljava/lang/String;", "simpleCache", "Lcom/google/android/exoplayer2/upstream/cache/SimpleCache;", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SimpleCache a(File dir, CacheEvictor evictor) {
            if (ExoCacheSource.f == null) {
                ExoCacheSource.f = new SimpleCache(dir, evictor);
            }
            return ExoCacheSource.f;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/google/android/exoplayer2/upstream/DefaultDataSourceFactory;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<DefaultDataSourceFactory> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DefaultDataSourceFactory invoke() {
            String userAgent = Util.getUserAgent(ExoCacheSource.this.getContext(), "Amazfit");
            DefaultBandwidthMeter defaultBandwidthMeter = new DefaultBandwidthMeter();
            return new DefaultDataSourceFactory(ExoCacheSource.this.getContext(), defaultBandwidthMeter, new DefaultHttpDataSourceFactory(userAgent, defaultBandwidthMeter));
        }
    }

    public ExoCacheSource(@NotNull Context context, long j, long j2) {
        this.context = context;
        this.maxCacheSize = j;
        this.maxFileSize = j2;
    }

    private final DefaultDataSourceFactory a() {
        return (DefaultDataSourceFactory) this.defaultDataSourceFactory.getValue();
    }

    private final File b() {
        return new File(((Intrinsics.areEqual("mounted", Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) ? this.context.getExternalCacheDir().getPath() : this.context.getCacheDir().getPath()) + ((Object) File.separator) + e);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    @NotNull
    public DataSource createDataSource() {
        SimpleCache simpleCacheA = INSTANCE.a(b(), new LeastRecentlyUsedCacheEvictor(this.maxCacheSize));
        return new CacheDataSource(simpleCacheA, a().createDataSource(), new FileDataSource(), new CacheDataSink(simpleCacheA, this.maxFileSize), 3, null);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }
}
