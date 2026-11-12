package com.huami.bluetooth.profile.channel.module.media;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B'\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR)\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/ImageArchive;", "", "", "getBytes", "Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;", "a", "Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;", "getSource", "()Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;", "source", "Ljava/util/ArrayList;", "Lcom/huami/bluetooth/profile/channel/module/media/ImageArchive$DestinationImageFile;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "getFiles", "()Ljava/util/ArrayList;", "files", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;Ljava/util/ArrayList;)V", "Companion", "DestinationImageFile", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ImageArchive {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final byte[] c = {112, 97, 99, 107};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MediaSource source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<DestinationImageFile> files;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/ImageArchive$Companion;", "", "", "MAGIC", "[B", "getMAGIC", "()[B", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final byte[] getMAGIC() {
            return ImageArchive.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\u000b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/ImageArchive$DestinationImageFile;", "", "other", "", "equals", "", "hashCode", "", "component1", "", "component2", "destination", "bytesOfImage", "copy", "toString", "a", "Ljava/lang/String;", "getDestination", "()Ljava/lang/String;", "b", "[B", "getBytesOfImage", "()[B", "<init>", "(Ljava/lang/String;[B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class DestinationImageFile {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String destination;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final byte[] bytesOfImage;

        public DestinationImageFile(@NotNull String str, @NotNull byte[] bArr) {
            this.destination = str;
            this.bytesOfImage = bArr;
        }

        public static /* synthetic */ DestinationImageFile copy$default(DestinationImageFile destinationImageFile, String str, byte[] bArr, int i, Object obj) {
            if ((i & 1) != 0) {
                str = destinationImageFile.destination;
            }
            if ((i & 2) != 0) {
                bArr = destinationImageFile.bytesOfImage;
            }
            return destinationImageFile.copy(str, bArr);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDestination() {
            return this.destination;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final byte[] getBytesOfImage() {
            return this.bytesOfImage;
        }

        @NotNull
        public final DestinationImageFile copy(@NotNull String destination, @NotNull byte[] bytesOfImage) {
            return new DestinationImageFile(destination, bytesOfImage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(DestinationImageFile.class, other == null ? null : other.getClass())) {
                return false;
            }
            Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.bluetooth.profile.channel.module.media.ImageArchive.DestinationImageFile");
            DestinationImageFile destinationImageFile = (DestinationImageFile) other;
            return Intrinsics.areEqual(this.destination, destinationImageFile.destination) && Arrays.equals(this.bytesOfImage, destinationImageFile.bytesOfImage);
        }

        @NotNull
        public final byte[] getBytesOfImage() {
            return this.bytesOfImage;
        }

        @NotNull
        public final String getDestination() {
            return this.destination;
        }

        public int hashCode() {
            return (this.destination.hashCode() * 31) + Arrays.hashCode(this.bytesOfImage);
        }

        @NotNull
        public String toString() {
            return "DestinationImageFile(destination=" + this.destination + ", bytesOfImage=" + Arrays.toString(this.bytesOfImage) + ')';
        }
    }

    public ImageArchive(@NotNull MediaSource mediaSource, @NotNull ArrayList<DestinationImageFile> arrayList) {
        this.source = mediaSource;
        this.files = arrayList;
    }

    @NotNull
    public final byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(c);
        byteArrayOutputStream.write(GattUtils.shortToBytes((short) this.source.getSource()));
        byteArrayOutputStream.write(this.files.size());
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        for (DestinationImageFile destinationImageFile : this.files) {
            String destination = destinationImageFile.getDestination();
            Charset charset = Charsets.UTF_8;
            Objects.requireNonNull(destination, "null cannot be cast to non-null type java.lang.String");
            byteArrayOutputStream2.write(destination.getBytes(charset));
            byteArrayOutputStream2.write(0);
            byteArrayOutputStream2.write(GattUtils.intToBytes(destinationImageFile.getBytesOfImage().length));
            byteArrayOutputStream3.write(destinationImageFile.getBytesOfImage());
        }
        byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray());
        byteArrayOutputStream.write(byteArrayOutputStream3.toByteArray());
        return byteArrayOutputStream.toByteArray();
    }

    @NotNull
    public final ArrayList<DestinationImageFile> getFiles() {
        return this.files;
    }

    @NotNull
    public final MediaSource getSource() {
        return this.source;
    }
}
