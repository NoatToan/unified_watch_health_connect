package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class n implements DataFetcherGenerator, DataFetcher.DataCallback<Object> {
    private final DataFetcherGenerator.FetcherReadyCallback a;
    private final e<?> b;
    private int c;
    private int d = -1;
    private Key e;
    private List<ModelLoader<File, ?>> f;
    private int g;
    private volatile ModelLoader.LoadData<?> h;
    private File i;
    private o j;

    public n(e<?> eVar, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.b = eVar;
        this.a = fetcherReadyCallback;
    }

    private boolean b() {
        return this.g < this.f.size();
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public boolean a() {
        List<Key> listC = this.b.c();
        boolean z = false;
        if (listC.isEmpty()) {
            return false;
        }
        List<Class<?>> listM = this.b.m();
        if (listM.isEmpty() && File.class.equals(this.b.q())) {
            return false;
        }
        while (true) {
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
            if (i2 >= listM.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= listC.size()) {
                    return false;
                }
                this.d = 0;
            }
            Key key = listC.get(this.c);
            Class<?> cls = listM.get(this.d);
            this.j = new o(this.b.b(), key, this.b.o(), this.b.s(), this.b.f(), this.b.r(cls), cls, this.b.k());
            File file = this.b.d().get(this.j);
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
        this.a.onDataFetcherReady(this.e, obj, this.h.fetcher, DataSource.RESOURCE_DISK_CACHE, this.j);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onLoadFailed(@NonNull Exception exc) {
        this.a.onDataFetcherFailed(this.j, exc, this.h.fetcher, DataSource.RESOURCE_DISK_CACHE);
    }
}
