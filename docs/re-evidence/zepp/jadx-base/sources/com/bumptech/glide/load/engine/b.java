package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class b implements DataFetcherGenerator, DataFetcher.DataCallback<Object> {
    private final List<Key> a;
    private final e<?> b;
    private final DataFetcherGenerator.FetcherReadyCallback c;
    private int d;
    private Key e;
    private List<ModelLoader<File, ?>> f;
    private int g;
    private volatile ModelLoader.LoadData<?> h;
    private File i;

    public b(e<?> eVar, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this(eVar.c(), eVar, fetcherReadyCallback);
    }

    private boolean b() {
        return this.g < this.f.size();
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public boolean a() {
        while (true) {
            boolean z = false;
            if (this.f != null && b()) {
                this.h = null;
                while (!z && b()) {
                    List<ModelLoader<File, ?>> list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    this.h = list.get(i).buildLoadData(this.i, this.b.s(), this.b.f(), this.b.k());
                    if (this.h != null && this.b.t(this.h.fetcher.getDataClass())) {
                        this.h.fetcher.loadData(this.b.l(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            Key key = this.a.get(this.d);
            File file = this.b.d().get(new c(key, this.b.o()));
            this.i = file;
            if (file != null) {
                this.e = key;
                this.f = this.b.j(file);
                this.g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public void cancel() {
        ModelLoader.LoadData<?> loadData = this.h;
        if (loadData != null) {
            loadData.fetcher.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onDataReady(Object obj) {
        this.c.onDataFetcherReady(this.e, obj, this.h.fetcher, DataSource.DATA_DISK_CACHE, this.e);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onLoadFailed(@NonNull Exception exc) {
        this.c.onDataFetcherFailed(this.e, exc, this.h.fetcher, DataSource.DATA_DISK_CACHE);
    }

    public b(List<Key> list, e<?> eVar, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.d = -1;
        this.a = list;
        this.b = eVar;
        this.c = fetcherReadyCallback;
    }
}
