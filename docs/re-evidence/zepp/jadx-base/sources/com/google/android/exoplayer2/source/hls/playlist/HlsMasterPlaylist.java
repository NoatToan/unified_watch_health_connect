package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMasterPlaylist extends HlsPlaylist {
    public static final HlsMasterPlaylist EMPTY = new HlsMasterPlaylist("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public static final int GROUP_INDEX_AUDIO = 1;
    public static final int GROUP_INDEX_SUBTITLE = 2;
    public static final int GROUP_INDEX_VARIANT = 0;
    public final List<Rendition> audios;
    public final List<Rendition> closedCaptions;
    public final List<Uri> mediaPlaylistUrls;

    @Nullable
    public final Format muxedAudioFormat;

    @Nullable
    public final List<Format> muxedCaptionFormats;
    public final List<DrmInitData> sessionKeyDrmInitData;
    public final List<Rendition> subtitles;
    public final Map<String, String> variableDefinitions;
    public final List<Variant> variants;
    public final List<Rendition> videos;

    public static final class Rendition {
        public final Format format;
        public final String groupId;
        public final String name;

        @Nullable
        public final Uri url;

        public Rendition(@Nullable Uri url, Format format, String groupId, String name) {
            this.url = url;
            this.format = format;
            this.groupId = groupId;
            this.name = name;
        }
    }

    public static final class Variant {

        @Nullable
        public final String audioGroupId;

        @Nullable
        public final String captionGroupId;
        public final Format format;

        @Nullable
        public final String subtitleGroupId;
        public final Uri url;

        @Nullable
        public final String videoGroupId;

        public Variant(Uri url, Format format, @Nullable String videoGroupId, @Nullable String audioGroupId, @Nullable String subtitleGroupId, @Nullable String captionGroupId) {
            this.url = url;
            this.format = format;
            this.videoGroupId = videoGroupId;
            this.audioGroupId = audioGroupId;
            this.subtitleGroupId = subtitleGroupId;
            this.captionGroupId = captionGroupId;
        }

        public static Variant createMediaPlaylistVariantUrl(Uri url) {
            return new Variant(url, new Format.Builder().setId("0").setContainerMimeType(MimeTypes.APPLICATION_M3U8).build(), null, null, null, null);
        }

        public Variant copyWithFormat(Format format) {
            return new Variant(this.url, format, this.videoGroupId, this.audioGroupId, this.subtitleGroupId, this.captionGroupId);
        }
    }

    public HlsMasterPlaylist(String baseUri, List<String> tags, List<Variant> variants, List<Rendition> videos, List<Rendition> audios, List<Rendition> subtitles, List<Rendition> closedCaptions, @Nullable Format muxedAudioFormat, @Nullable List<Format> muxedCaptionFormats, boolean hasIndependentSegments, Map<String, String> variableDefinitions, List<DrmInitData> sessionKeyDrmInitData) {
        super(baseUri, tags, hasIndependentSegments);
        this.mediaPlaylistUrls = Collections.unmodifiableList(c(variants, videos, audios, subtitles, closedCaptions));
        this.variants = Collections.unmodifiableList(variants);
        this.videos = Collections.unmodifiableList(videos);
        this.audios = Collections.unmodifiableList(audios);
        this.subtitles = Collections.unmodifiableList(subtitles);
        this.closedCaptions = Collections.unmodifiableList(closedCaptions);
        this.muxedAudioFormat = muxedAudioFormat;
        this.muxedCaptionFormats = muxedCaptionFormats != null ? Collections.unmodifiableList(muxedCaptionFormats) : null;
        this.variableDefinitions = Collections.unmodifiableMap(variableDefinitions);
        this.sessionKeyDrmInitData = Collections.unmodifiableList(sessionKeyDrmInitData);
    }

    private static void a(List<Rendition> renditions, List<Uri> out) {
        for (int i = 0; i < renditions.size(); i++) {
            Uri uri = renditions.get(i).url;
            if (uri != null && !out.contains(uri)) {
                out.add(uri);
            }
        }
    }

    private static <T> List<T> b(List<T> streams, int groupIndex, List<StreamKey> streamKeys) {
        ArrayList arrayList = new ArrayList(streamKeys.size());
        for (int i = 0; i < streams.size(); i++) {
            T t = streams.get(i);
            for (int i2 = 0; i2 < streamKeys.size(); i2++) {
                StreamKey streamKey = streamKeys.get(i2);
                if (streamKey.groupIndex == groupIndex && streamKey.trackIndex == i) {
                    arrayList.add(t);
                    break;
                }
            }
        }
        return arrayList;
    }

    private static List<Uri> c(List<Variant> variants, List<Rendition> videos, List<Rendition> audios, List<Rendition> subtitles, List<Rendition> closedCaptions) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < variants.size(); i++) {
            Uri uri = variants.get(i).url;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        a(videos, arrayList);
        a(audios, arrayList);
        a(subtitles, arrayList);
        a(closedCaptions, arrayList);
        return arrayList;
    }

    public static HlsMasterPlaylist createSingleVariantMasterPlaylist(String variantUrl) {
        return new HlsMasterPlaylist("", Collections.emptyList(), Collections.singletonList(Variant.createMediaPlaylistVariantUrl(Uri.parse(variantUrl))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* JADX INFO: renamed from: copy, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ HlsPlaylist copy2(List streamKeys) {
        return copy((List<StreamKey>) streamKeys);
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public HlsPlaylist copy(List<StreamKey> streamKeys) {
        return new HlsMasterPlaylist(this.baseUri, this.tags, b(this.variants, 0, streamKeys), Collections.emptyList(), b(this.audios, 1, streamKeys), b(this.subtitles, 2, streamKeys), Collections.emptyList(), this.muxedAudioFormat, this.muxedCaptionFormats, this.hasIndependentSegments, this.variableDefinitions, this.sessionKeyDrmInitData);
    }
}
