package com.huami.watch.util;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import com.alipay.sdk.m.x.d;
import com.beaglebuddy.mp3.MP3;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.facestore.database.WactchFacesProvider;
import defpackage.b;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/huami/watch/util/MediaMetadataUtil;", "", "<init>", "()V", "Companion", "MediaMetadataInfo", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class MediaMetadataUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String a = "Util-MediaMetadata";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\f\u001a\u00020\u0001H\u0003J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0003J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\bH\u0002J(\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\f\u001a\u00020\u00012\n\u0010\u0005\u001a\u00020\u0004\"\u00020\u0007H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0001H\u0007J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0007H\u0007R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/huami/watch/util/MediaMetadataUtil$Companion;", "", "Landroid/media/MediaMetadataRetriever;", "retriever", "", "keyCodes", "", "", "", "metadata", "", "c", "anyFile", "", GoogleApiAvailabilityLight.a, "b", "it", "a", "retrieve", "Lcom/huami/watch/util/MediaMetadataUtil$MediaMetadataInfo;", "str", "bytesSize", "truncateString", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "String: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ byte[] a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(byte[] bArr) {
                super(0);
                this.a = bArr;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "UTF-8: " + BytesUtil.log(this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ byte[] a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(byte[] bArr) {
                super(0);
                this.a = bArr;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "UTF-16: " + BytesUtil.log(this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class d extends Lambda implements Function0<String> {
            public final /* synthetic */ byte[] a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(byte[] bArr) {
                super(0);
                this.a = bArr;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "UTF-16LE: " + BytesUtil.log(this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class e extends Lambda implements Function0<String> {
            public final /* synthetic */ byte[] a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(byte[] bArr) {
                super(0);
                this.a = bArr;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "UTF-16BE: " + BytesUtil.log(this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class f extends Lambda implements Function0<String> {
            public final /* synthetic */ byte[] a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(byte[] bArr) {
                super(0);
                this.a = bArr;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "ISO-8859-1: " + BytesUtil.log(this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "invoke", "()Ljava/lang/String;", "com/huami/watch/util/MediaMetadataUtil$Companion$retrieve$4$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class g extends Lambda implements Function0<String> {
            public final /* synthetic */ MediaMetadataInfo a;
            public final /* synthetic */ Object b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(MediaMetadataInfo mediaMetadataInfo, Object obj) {
                super(0);
                this.a = mediaMetadataInfo;
                this.b = obj;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Retrieve [" + this.b + "]: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class h extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "RetrieveErr" + this.a;
            }
        }

        private Companion() {
        }

        private final void a(String it2) {
            HMLog.debug(MediaMetadataUtil.a, new a(it2));
            Charset charset = Charsets.UTF_8;
            Objects.requireNonNull(it2, "null cannot be cast to non-null type java.lang.String");
            HMLog.debug(MediaMetadataUtil.a, new b(it2.getBytes(charset)));
            HMLog.debug(MediaMetadataUtil.a, new c(it2.getBytes(Charsets.UTF_16)));
            HMLog.debug(MediaMetadataUtil.a, new d(it2.getBytes(Charsets.UTF_16LE)));
            HMLog.debug(MediaMetadataUtil.a, new e(it2.getBytes(Charsets.UTF_16BE)));
            HMLog.debug(MediaMetadataUtil.a, new f(it2.getBytes(Charset.forName("ISO-8859-1"))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final String b(String metadata) {
            if (metadata != null) {
                Charset charset = Charsets.ISO_8859_1;
                byte[] bytes = metadata.getBytes(charset);
                if (Intrinsics.areEqual(metadata, new String(bytes, charset))) {
                    return new String(bytes, Charset.forName("GBK"));
                }
            }
            return metadata;
        }

        private final void c(MediaMetadataRetriever retriever, int[] keyCodes, Map<Integer, String> metadata) {
            for (int i : keyCodes) {
                String strExtractMetadata = retriever.extractMetadata(i);
                if (strExtractMetadata != null) {
                    metadata.put(Integer.valueOf(i), strExtractMetadata);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final Map<Integer, String> d(Object anyFile) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                MP3 mp3 = anyFile instanceof File ? new MP3((File) anyFile) : null;
                Companion companion = MediaMetadataUtil.INSTANCE;
                String strB = companion.b(mp3 != null ? mp3.getTitle() : null);
                if (strB != null) {
                }
                String strB2 = companion.b(mp3 != null ? mp3.getAlbum() : null);
                if (strB2 != null) {
                }
                String strB3 = companion.b(mp3 != null ? mp3.getLeadPerformer() : null);
                if (strB3 != null) {
                    linkedHashMap.put(2, strB3);
                }
            } catch (Exception e2) {
                Log.w(MediaMetadataUtil.a, "RetrieveMp3Err", e2, new Object[0]);
            }
            return linkedHashMap;
        }

        @JvmStatic
        @NotNull
        public final Map<Integer, String> retrieve(@NotNull Object anyFile, @NotNull int... keyCodes) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    try {
                        if (anyFile instanceof AssetFileDescriptor) {
                            FileDescriptor fileDescriptor = ((AssetFileDescriptor) anyFile).getFileDescriptor();
                            if (!fileDescriptor.valid()) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            if (((AssetFileDescriptor) anyFile).getDeclaredLength() < 0) {
                                mediaMetadataRetriever.setDataSource(fileDescriptor);
                            } else {
                                mediaMetadataRetriever.setDataSource(fileDescriptor, ((AssetFileDescriptor) anyFile).getStartOffset(), ((AssetFileDescriptor) anyFile).getDeclaredLength());
                            }
                            c(mediaMetadataRetriever, keyCodes, linkedHashMap);
                            try {
                                ((AssetFileDescriptor) anyFile).close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        } else if (anyFile instanceof File) {
                            mediaMetadataRetriever.setDataSource(((File) anyFile).getAbsolutePath());
                            c(mediaMetadataRetriever, keyCodes, linkedHashMap);
                        }
                        mediaMetadataRetriever.close();
                    } catch (Throwable th) {
                        try {
                            mediaMetadataRetriever.close();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                        throw th;
                    }
                } catch (SecurityException e3) {
                    e3.printStackTrace();
                    mediaMetadataRetriever.close();
                } catch (Exception e4) {
                    HMLog.info(MediaMetadataUtil.a, new h(e4));
                    mediaMetadataRetriever.close();
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            return linkedHashMap;
        }

        @JvmStatic
        @Nullable
        public final String truncateString(@Nullable String str, int bytesSize) {
            byte[] bytes = str != null ? str.getBytes(Charsets.UTF_8) : null;
            return (bytes == null || bytes.length <= bytesSize) ? str : StringsKt__StringsKt.substring(str, kotlin.ranges.e.until(0, new String(ArraysKt___ArraysKt.sliceArray(bytes, kotlin.ranges.e.until(0, bytesSize + 1)), Charsets.UTF_8).length() - 1));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final MediaMetadataInfo retrieve(@NotNull Object anyFile) {
            Map<Integer, String> mapD = d(anyFile);
            MediaMetadataInfo mediaMetadataInfo = new MediaMetadataInfo(null, null, null, 0L, 15, null);
            mediaMetadataInfo.setTitle(mapD.get(7));
            mediaMetadataInfo.setAlbum(mapD.get(1));
            mediaMetadataInfo.setArtist(mapD.get(2));
            HMLog.debug(MediaMetadataUtil.a, new g(mediaMetadataInfo, anyFile));
            return mediaMetadataInfo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J7\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/huami/watch/util/MediaMetadataUtil$MediaMetadataInfo;", "", "", "component1", "component2", "component3", "", "component4", "title", "album", WactchFacesProvider.DatabaseHelper.ARTIST, "fileSize", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", d.o, "(Ljava/lang/String;)V", "b", "getAlbum", "setAlbum", "c", "getArtist", "setArtist", GoogleApiAvailabilityLight.a, "J", "getFileSize", "()J", "setFileSize", "(J)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class MediaMetadataInfo {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @SerializedName("title")
        @Nullable
        private String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @SerializedName("album")
        @Nullable
        private String album;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @SerializedName(WactchFacesProvider.DatabaseHelper.ARTIST)
        @Nullable
        private String artist;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @SerializedName("size")
        private long fileSize;

        public MediaMetadataInfo() {
            this(null, null, null, 0L, 15, null);
        }

        public MediaMetadataInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, long j) {
            this.title = str;
            this.album = str2;
            this.artist = str3;
            this.fileSize = j;
        }

        public static /* synthetic */ MediaMetadataInfo copy$default(MediaMetadataInfo mediaMetadataInfo, String str, String str2, String str3, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mediaMetadataInfo.title;
            }
            if ((i & 2) != 0) {
                str2 = mediaMetadataInfo.album;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                str3 = mediaMetadataInfo.artist;
            }
            String str5 = str3;
            if ((i & 8) != 0) {
                j = mediaMetadataInfo.fileSize;
            }
            return mediaMetadataInfo.copy(str, str4, str5, j);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAlbum() {
            return this.album;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getArtist() {
            return this.artist;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getFileSize() {
            return this.fileSize;
        }

        @NotNull
        public final MediaMetadataInfo copy(@Nullable String title, @Nullable String album, @Nullable String artist, long fileSize) {
            return new MediaMetadataInfo(title, album, artist, fileSize);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MediaMetadataInfo)) {
                return false;
            }
            MediaMetadataInfo mediaMetadataInfo = (MediaMetadataInfo) other;
            return Intrinsics.areEqual(this.title, mediaMetadataInfo.title) && Intrinsics.areEqual(this.album, mediaMetadataInfo.album) && Intrinsics.areEqual(this.artist, mediaMetadataInfo.artist) && this.fileSize == mediaMetadataInfo.fileSize;
        }

        @Nullable
        public final String getAlbum() {
            return this.album;
        }

        @Nullable
        public final String getArtist() {
            return this.artist;
        }

        public final long getFileSize() {
            return this.fileSize;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.album;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.artist;
            return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + b.a(this.fileSize);
        }

        public final void setAlbum(@Nullable String str) {
            this.album = str;
        }

        public final void setArtist(@Nullable String str) {
            this.artist = str;
        }

        public final void setFileSize(long j) {
            this.fileSize = j;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        @NotNull
        public String toString() {
            return "MediaMetadataInfo(title=" + this.title + ", album=" + this.album + ", artist=" + this.artist + ", fileSize=" + this.fileSize + ")";
        }

        public /* synthetic */ MediaMetadataInfo(String str, String str2, String str3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? str3 : null, (i & 8) != 0 ? 0L : j);
        }
    }

    @JvmStatic
    private static final String a(String str) {
        return INSTANCE.b(str);
    }

    @JvmStatic
    private static final Map<Integer, String> b(Object obj) {
        return INSTANCE.d(obj);
    }

    @JvmStatic
    @NotNull
    public static final MediaMetadataInfo retrieve(@NotNull Object obj) {
        return INSTANCE.retrieve(obj);
    }

    @JvmStatic
    @NotNull
    public static final Map<Integer, String> retrieve(@NotNull Object obj, @NotNull int... iArr) {
        return INSTANCE.retrieve(obj, iArr);
    }

    @JvmStatic
    @Nullable
    public static final String truncateString(@Nullable String str, int i) {
        return INSTANCE.truncateString(str, i);
    }
}
