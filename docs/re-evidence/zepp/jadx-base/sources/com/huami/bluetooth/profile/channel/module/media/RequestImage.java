package com.huami.bluetooth.profile.channel.module.media;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB/\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR)\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/RequestImage;", "", "", "toString", "", "a", LogUtil.I, "getSessionId", "()I", "sessionId", "Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;", "b", "Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;", "getSource", "()Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;", "source", "Ljava/util/ArrayList;", "Lcom/huami/bluetooth/profile/channel/module/media/RequestImage$ImageParameter;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "getImageParameters", "()Ljava/util/ArrayList;", "imageParameters", "<init>", "(ILcom/huami/bluetooth/profile/channel/module/media/MediaSource;Ljava/util/ArrayList;)V", "Companion", "ImageParameter", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class RequestImage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int REQUEST_IMAGE = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int sessionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final MediaSource source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final ArrayList<ImageParameter> imageParameters;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/RequestImage$Companion;", "", "", "data", "Lcom/huami/bluetooth/profile/channel/module/media/RequestImage;", "fromBytes", "", "REQUEST_IMAGE", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RequestImage fromBytes(@NotNull byte[] data) {
            byte b = data[0];
            int i = data[1] & 255;
            MediaSource mediaSourceFromBytes = MediaSource.INSTANCE.fromBytes(MeidaHelperKt.twoBytesToUInt(data[2], data[3]));
            short s = data[4];
            ArrayList arrayList = new ArrayList();
            if (s > 0) {
                int i2 = 5;
                int i3 = 0;
                while (true) {
                    i3++;
                    int iFindStringEndIndex = MeidaHelperKt.findStringEndIndex(data, i2);
                    String strDecodeToString = MeidaHelperKt.decodeToString(data, i2, iFindStringEndIndex);
                    int i4 = iFindStringEndIndex + 1;
                    int iFindStringEndIndex2 = MeidaHelperKt.findStringEndIndex(data, i4);
                    String strDecodeToString2 = MeidaHelperKt.decodeToString(data, i4, iFindStringEndIndex2);
                    int i5 = iFindStringEndIndex2 + 1;
                    int i6 = i5 + 6;
                    int i7 = i6 + 1;
                    arrayList.add(new ImageParameter(strDecodeToString, strDecodeToString2, ImageFormat.INSTANCE.fromBytes(ArraysKt___ArraysJvmKt.copyInto(data, new byte[6], 0, i5, i6))));
                    if (i3 >= s) {
                        break;
                    }
                    i2 = i7;
                }
            }
            return new RequestImage(i, mediaSourceFromBytes, arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/RequestImage$ImageParameter;", "", "", "component1", "component2", "Lcom/huami/bluetooth/profile/channel/module/media/ImageFormat;", "component3", "url", "destination", TrainingWebConst.QueryParam.VIDEO_FORMAT, "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "b", "getDestination", "c", "Lcom/huami/bluetooth/profile/channel/module/media/ImageFormat;", "getFormat", "()Lcom/huami/bluetooth/profile/channel/module/media/ImageFormat;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/media/ImageFormat;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ImageParameter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String url;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final String destination;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        private final ImageFormat format;

        public ImageParameter(@NotNull String str, @NotNull String str2, @NotNull ImageFormat imageFormat) {
            this.url = str;
            this.destination = str2;
            this.format = imageFormat;
        }

        public static /* synthetic */ ImageParameter copy$default(ImageParameter imageParameter, String str, String str2, ImageFormat imageFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                str = imageParameter.url;
            }
            if ((i & 2) != 0) {
                str2 = imageParameter.destination;
            }
            if ((i & 4) != 0) {
                imageFormat = imageParameter.format;
            }
            return imageParameter.copy(str, str2, imageFormat);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDestination() {
            return this.destination;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ImageFormat getFormat() {
            return this.format;
        }

        @NotNull
        public final ImageParameter copy(@NotNull String url, @NotNull String destination, @NotNull ImageFormat format) {
            return new ImageParameter(url, destination, format);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageParameter)) {
                return false;
            }
            ImageParameter imageParameter = (ImageParameter) other;
            return Intrinsics.areEqual(this.url, imageParameter.url) && Intrinsics.areEqual(this.destination, imageParameter.destination) && Intrinsics.areEqual(this.format, imageParameter.format);
        }

        @NotNull
        public final String getDestination() {
            return this.destination;
        }

        @NotNull
        public final ImageFormat getFormat() {
            return this.format;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (((this.url.hashCode() * 31) + this.destination.hashCode()) * 31) + this.format.hashCode();
        }

        @NotNull
        public String toString() {
            return "ImageParameter(url=" + this.url + ", destination=" + this.destination + ", format=" + this.format + ')';
        }
    }

    public RequestImage(int i, @NotNull MediaSource mediaSource, @NotNull ArrayList<ImageParameter> arrayList) {
        this.sessionId = i;
        this.source = mediaSource;
        this.imageParameters = arrayList;
    }

    @NotNull
    public final ArrayList<ImageParameter> getImageParameters() {
        return this.imageParameters;
    }

    public final int getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final MediaSource getSource() {
        return this.source;
    }

    @NotNull
    public String toString() {
        return "RequestImage(sessionId=" + this.sessionId + ", source=" + this.source + ", imageParameters=" + this.imageParameters + ')';
    }
}
