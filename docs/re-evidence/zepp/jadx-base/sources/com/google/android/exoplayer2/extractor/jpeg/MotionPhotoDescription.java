package com.google.android.exoplayer2.extractor.jpeg;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class MotionPhotoDescription {
    public final long a;
    public final List<ContainerItem> b;

    public static final class ContainerItem {
        public final long length;
        public final String mime;
        public final long padding;
        public final String semantic;

        public ContainerItem(String mime, String semantic, long length, long padding) {
            this.mime = mime;
            this.semantic = semantic;
            this.length = length;
            this.padding = padding;
        }
    }

    public MotionPhotoDescription(long photoPresentationTimestampUs, List<ContainerItem> items) {
        this.a = photoPresentationTimestampUs;
        this.b = items;
    }

    @Nullable
    public MotionPhotoMetadata a(long motionPhotoLength) {
        long j;
        if (this.b.size() < 2) {
            return null;
        }
        long j2 = motionPhotoLength;
        long j3 = -1;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        boolean z = false;
        for (int size = this.b.size() - 1; size >= 0; size--) {
            ContainerItem containerItem = this.b.get(size);
            boolean zEquals = MimeTypes.VIDEO_MP4.equals(containerItem.mime) | z;
            if (size == 0) {
                j = j2 - containerItem.padding;
                j2 = 0;
            } else {
                long j7 = j2;
                j2 -= containerItem.length;
                j = j7;
            }
            if (!zEquals || j2 == j) {
                z = zEquals;
            } else {
                j6 = j - j2;
                j5 = j2;
                z = false;
            }
            if (size == 0) {
                j3 = j2;
                j4 = j;
            }
        }
        if (j5 == -1 || j6 == -1 || j3 == -1 || j4 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j3, j4, this.a, j5, j6);
    }
}
