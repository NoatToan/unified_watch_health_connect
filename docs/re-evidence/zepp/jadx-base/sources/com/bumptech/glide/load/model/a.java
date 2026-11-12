package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class a<Model, Data> implements ModelLoader<Model, Data> {
    private final List<ModelLoader<Model, Data>> a;
    private final Pools.Pool<List<Throwable>> b;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.a$a, reason: collision with other inner class name */
    public static class C0127a<Data> implements DataFetcher<Data>, DataFetcher.DataCallback<Data> {
        private final List<DataFetcher<Data>> a;
        private final Pools.Pool<List<Throwable>> b;
        private int c;
        private Priority d;
        private DataFetcher.DataCallback<? super Data> e;

        @Nullable
        private List<Throwable> f;

        public C0127a(@NonNull List<DataFetcher<Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            this.b = pool;
            Preconditions.checkNotEmpty(list);
            this.a = list;
            this.c = 0;
        }

        private void a() {
            if (this.c < this.a.size() - 1) {
                this.c++;
                loadData(this.d, this.e);
            } else {
                Preconditions.checkNotNull(this.f);
                this.e.onLoadFailed(new GlideException("Fetch failed", new ArrayList(this.f)));
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
            Iterator<DataFetcher<Data>> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
            List<Throwable> list = this.f;
            if (list != null) {
                this.b.release(list);
            }
            this.f = null;
            Iterator<DataFetcher<Data>> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next().cleanup();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public Class<Data> getDataClass() {
            return this.a.get(0).getDataClass();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public DataSource getDataSource() {
            return this.a.get(0).getDataSource();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super Data> dataCallback) {
            this.d = priority;
            this.e = dataCallback;
            this.f = this.b.acquire();
            this.a.get(this.c).loadData(priority, this);
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public void onDataReady(@Nullable Data data) {
            if (data != null) {
                this.e.onDataReady(data);
            } else {
                a();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public void onLoadFailed(@NonNull Exception exc) {
            ((List) Preconditions.checkNotNull(this.f)).add(exc);
            a();
        }
    }

    public a(@NonNull List<ModelLoader<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
        this.a = list;
        this.b = pool;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<Data> buildLoadData(@NonNull Model model, int i, int i2, @NonNull Options options) {
        ModelLoader.LoadData<Data> loadDataBuildLoadData;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        Key key = null;
        for (int i3 = 0; i3 < size; i3++) {
            ModelLoader<Model, Data> modelLoader = this.a.get(i3);
            if (modelLoader.handles(model) && (loadDataBuildLoadData = modelLoader.buildLoadData(model, i, i2, options)) != null) {
                key = loadDataBuildLoadData.sourceKey;
                arrayList.add(loadDataBuildLoadData.fetcher);
            }
        }
        if (arrayList.isEmpty() || key == null) {
            return null;
        }
        return new ModelLoader.LoadData<>(key, new C0127a(arrayList, this.b));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Model model) {
        Iterator<ModelLoader<Model, Data>> it2 = this.a.iterator();
        while (it2.hasNext()) {
            if (it2.next().handles(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}
