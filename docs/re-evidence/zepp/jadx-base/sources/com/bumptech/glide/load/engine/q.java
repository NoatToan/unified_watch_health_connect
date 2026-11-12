package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.LogTime;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class q implements DataFetcherGenerator, DataFetcher.DataCallback<Object>, DataFetcherGenerator.FetcherReadyCallback {
    private static final String h = "SourceGenerator";
    private final e<?> a;
    private final DataFetcherGenerator.FetcherReadyCallback b;
    private int c;
    private b d;
    private Object e;
    private volatile ModelLoader.LoadData<?> f;
    private c g;

    public q(e<?> eVar, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.a = eVar;
        this.b = fetcherReadyCallback;
    }

    private void b(Object obj) {
        long logTime = LogTime.getLogTime();
        try {
            Encoder<X> encoderP = this.a.p(obj);
            d dVar = new d(encoderP, obj, this.a.k());
            this.g = new c(this.f.sourceKey, this.a.o());
            this.a.d().put(this.g, dVar);
            if (Log.isLoggable(h, 2)) {
                Log.v(h, "Finished encoding source to cache, key: " + this.g + ", data: " + obj + ", encoder: " + encoderP + ", duration: " + LogTime.getElapsedMillis(logTime));
            }
            this.f.fetcher.cleanup();
            this.d = new b(Collections.singletonList(this.f.sourceKey), this.a, this);
        } catch (Throwable th) {
            this.f.fetcher.cleanup();
            throw th;
        }
    }

    private boolean c() {
        return this.c < this.a.g().size();
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public boolean a() {
        Object obj = this.e;
        if (obj != null) {
            this.e = null;
            b(obj);
        }
        b bVar = this.d;
        if (bVar != null && bVar.a()) {
            return true;
        }
        this.d = null;
        this.f = null;
        boolean z = false;
        while (!z && c()) {
            List<ModelLoader.LoadData<?>> listG = this.a.g();
            int i = this.c;
            this.c = i + 1;
            this.f = listG.get(i);
            if (this.f != null && (this.a.e().isDataCacheable(this.f.fetcher.getDataSource()) || this.a.t(this.f.fetcher.getDataClass()))) {
                this.f.fetcher.loadData(this.a.l(), this);
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public void cancel() {
        ModelLoader.LoadData<?> loadData = this.f;
        if (loadData != null) {
            loadData.fetcher.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherFailed(Key key, Exception exc, DataFetcher<?> dataFetcher, DataSource dataSource) {
        this.b.onDataFetcherFailed(key, exc, dataFetcher, this.f.fetcher.getDataSource());
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void onDataFetcherReady(Key key, Object obj, DataFetcher<?> dataFetcher, DataSource dataSource, Key key2) {
        this.b.onDataFetcherReady(key, obj, dataFetcher, this.f.fetcher.getDataSource(), key);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onDataReady(Object obj) {
        DiskCacheStrategy diskCacheStrategyE = this.a.e();
        if (obj == null || !diskCacheStrategyE.isDataCacheable(this.f.fetcher.getDataSource())) {
            this.b.onDataFetcherReady(this.f.sourceKey, obj, this.f.fetcher, this.f.fetcher.getDataSource(), this.g);
        } else {
            this.e = obj;
            this.b.reschedule();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onLoadFailed(@NonNull Exception exc) {
        this.b.onDataFetcherFailed(this.g, exc, this.f.fetcher, this.f.fetcher.getDataSource());
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public void reschedule() {
        throw new UnsupportedOperationException();
    }
}
