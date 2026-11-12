package com.google.android.exoplayer2.source.dash.offline;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.offline.DownloadException;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.DashUtil;
import com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import defpackage.jy0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class DashDownloader extends SegmentDownloader<DashManifest> {

    public class a extends RunnableFutureTask<ChunkIndex, IOException> {
        public final /* synthetic */ DataSource h;
        public final /* synthetic */ int i;
        public final /* synthetic */ Representation j;

        public a(final DashDownloader this$0, final DataSource val$dataSource, final int val$trackType, final Representation val$representation) {
            this.h = val$dataSource;
            this.i = val$trackType;
            this.j = val$representation;
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChunkIndex doWork() throws IOException {
            return DashUtil.loadChunkIndex(this.h, this.i, this.j);
        }
    }

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory cacheDataSourceFactory) {
        this(mediaItem, cacheDataSourceFactory, jy0.a);
    }

    private static void g(long startTimeUs, String baseUrl, RangedUri rangedUri, ArrayList<SegmentDownloader.Segment> out) {
        out.add(new SegmentDownloader.Segment(startTimeUs, new DataSpec(rangedUri.resolveUri(baseUrl), rangedUri.start, rangedUri.length)));
    }

    private void h(DataSource dataSource, AdaptationSet adaptationSet, long periodStartUs, long periodDurationUs, boolean removing, ArrayList<SegmentDownloader.Segment> out) throws InterruptedException, IOException {
        int i = 0;
        int i2 = 0;
        while (i2 < adaptationSet.representations.size()) {
            Representation representation = adaptationSet.representations.get(i2);
            try {
                DashSegmentIndex dashSegmentIndexI = i(dataSource, adaptationSet.type, representation, removing);
                if (dashSegmentIndexI != null) {
                    long segmentCount = dashSegmentIndexI.getSegmentCount(periodDurationUs);
                    if (segmentCount == -1) {
                        throw new DownloadException("Unbounded segment index");
                    }
                    String str = representation.baseUrls.get(i).url;
                    RangedUri initializationUri = representation.getInitializationUri();
                    if (initializationUri != null) {
                        g(periodStartUs, str, initializationUri, out);
                    }
                    RangedUri indexUri = representation.getIndexUri();
                    if (indexUri != null) {
                        g(periodStartUs, str, indexUri, out);
                    }
                    long firstSegmentNum = dashSegmentIndexI.getFirstSegmentNum();
                    long j = (firstSegmentNum + segmentCount) - 1;
                    for (long j2 = firstSegmentNum; j2 <= j; j2++) {
                        g(periodStartUs + dashSegmentIndexI.getTimeUs(j2), str, dashSegmentIndexI.getSegmentUrl(j2), out);
                    }
                    i2++;
                    i = 0;
                } else {
                    try {
                        throw new DownloadException("Missing segment index");
                    } catch (IOException e) {
                        e = e;
                        if (!removing) {
                            throw e;
                        }
                        i2++;
                        i = 0;
                    }
                }
            } catch (IOException e2) {
                e = e2;
            }
        }
    }

    @Nullable
    private DashSegmentIndex i(DataSource dataSource, int trackType, Representation representation, boolean removing) throws InterruptedException, IOException {
        DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        ChunkIndex chunkIndex = (ChunkIndex) execute(new a(this, dataSource, trackType, representation), removing);
        if (chunkIndex == null) {
            return null;
        }
        return new DashWrappingSegmentIndex(chunkIndex, representation.presentationTimeOffsetUs);
    }

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory cacheDataSourceFactory, Executor executor) {
        this(mediaItem, new DashManifestParser(), cacheDataSourceFactory, executor);
    }

    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, DashManifest manifest, boolean removing) throws InterruptedException, IOException {
        ArrayList<SegmentDownloader.Segment> arrayList = new ArrayList<>();
        for (int i = 0; i < manifest.getPeriodCount(); i++) {
            Period period = manifest.getPeriod(i);
            long jMsToUs = C.msToUs(period.startMs);
            long periodDurationUs = manifest.getPeriodDurationUs(i);
            int i2 = 0;
            for (List<AdaptationSet> list = period.adaptationSets; i2 < list.size(); list = list) {
                h(dataSource, list.get(i2), jMsToUs, periodDurationUs, removing, arrayList);
                i2++;
            }
        }
        return arrayList;
    }

    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> manifestParser, CacheDataSource.Factory cacheDataSourceFactory, Executor executor) {
        super(mediaItem, manifestParser, cacheDataSourceFactory, executor);
    }
}
