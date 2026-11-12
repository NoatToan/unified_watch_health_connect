package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
final class MotionPhotoDescription {
    public final List<ContainerItem> items;
    public final long photoPresentationTimestampUs;

    public static final class ContainerItem {
        public final long length;
        public final String mime;
        public final long padding;
        public final String semantic;

        public ContainerItem(String str, String str2, long j8, long j14) {
            this.mime = str;
            this.semantic = str2;
            this.length = j8;
            this.padding = j14;
        }
    }

    public MotionPhotoDescription(long j8, List<ContainerItem> list) {
        this.photoPresentationTimestampUs = j8;
        this.items = list;
    }

    public MotionPhotoMetadata getMotionPhotoMetadata(long j8) {
        long j14;
        if (this.items.size() < 2) {
            return null;
        }
        long j15 = j8;
        long j16 = -1;
        long j17 = -1;
        long j18 = -1;
        long j19 = -1;
        boolean z14 = false;
        for (int size = this.items.size() - 1; size >= 0; size--) {
            ContainerItem containerItem = this.items.get(size);
            boolean zEquals = MimeTypes.VIDEO_MP4.equals(containerItem.mime) | z14;
            if (size == 0) {
                j15 -= containerItem.padding;
                j14 = 0;
            } else {
                j14 = j15 - containerItem.length;
            }
            long j24 = j14;
            long j25 = j15;
            j15 = j24;
            if (!zEquals || j15 == j25) {
                z14 = zEquals;
            } else {
                j19 = j25 - j15;
                j18 = j15;
                z14 = false;
            }
            if (size == 0) {
                j16 = j15;
                j17 = j25;
            }
        }
        if (j18 == -1 || j19 == -1 || j16 == -1 || j17 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j16, j17, this.photoPresentationTimestampUs, j18, j19);
    }
}
