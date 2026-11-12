package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class ParsingLoadable<T> implements Loader.Loadable {
    private final StatsDataSource dataSource;
    public final DataSpec dataSpec;
    public final long loadTaskId;
    private final Parser<? extends T> parser;
    private volatile T result;
    public final int type;

    public interface Parser<T> {
        T parse(Uri uri, InputStream inputStream);
    }

    public ParsingLoadable(DataSource dataSource, DataSpec dataSpec, int i14, Parser<? extends T> parser) {
        this.dataSource = new StatsDataSource(dataSource);
        this.dataSpec = dataSpec;
        this.type = i14;
        this.parser = parser;
        this.loadTaskId = LoadEventInfo.getNewId();
    }

    public long bytesLoaded() {
        return this.dataSource.getBytesRead();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.dataSource.getLastResponseHeaders();
    }

    public final T getResult() {
        return this.result;
    }

    public Uri getUri() {
        return this.dataSource.getLastOpenedUri();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void load() {
        this.dataSource.resetBytesRead();
        DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(this.dataSource, this.dataSpec);
        try {
            dataSourceInputStream.open();
            this.result = this.parser.parse((Uri) Assertions.checkNotNull(this.dataSource.getUri()), dataSourceInputStream);
        } finally {
            Util.closeQuietly(dataSourceInputStream);
        }
    }

    public ParsingLoadable(DataSource dataSource, Uri uri, int i14, Parser<? extends T> parser) {
        this(dataSource, new DataSpec.Builder().setUri(uri).setFlags(1).build(), i14, parser);
    }

    public static <T> T load(DataSource dataSource, Parser<? extends T> parser, DataSpec dataSpec, int i14) {
        ParsingLoadable parsingLoadable = new ParsingLoadable(dataSource, dataSpec, i14, parser);
        parsingLoadable.load();
        return (T) Assertions.checkNotNull(parsingLoadable.getResult());
    }

    public static <T> T load(DataSource dataSource, Parser<? extends T> parser, Uri uri, int i14) {
        ParsingLoadable parsingLoadable = new ParsingLoadable(dataSource, uri, i14, parser);
        parsingLoadable.load();
        return (T) Assertions.checkNotNull(parsingLoadable.getResult());
    }
}
