package coil.decode;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u000f\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u0010\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u0011\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u0012\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"GIF_HEADER_87A", "Lokio/ByteString;", "GIF_HEADER_89A", "HEIF_HEADER_FTYP", "HEIF_HEADER_HEVC", "HEIF_HEADER_HEVX", "HEIF_HEADER_MSF1", "WEBP_HEADER_RIFF", "WEBP_HEADER_VPX8", "WEBP_HEADER_WEBP", "isAnimatedHeif", "", "Lcoil/decode/DecodeUtils;", "source", "Lokio/BufferedSource;", "isAnimatedWebP", "isGif", "isHeif", "isWebP", "coil-gif_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@JvmName(name = "GifDecodeUtils")
public final class GifDecodeUtils {

    @NotNull
    private static final ByteString GIF_HEADER_87A;

    @NotNull
    private static final ByteString GIF_HEADER_89A;

    @NotNull
    private static final ByteString HEIF_HEADER_FTYP;

    @NotNull
    private static final ByteString HEIF_HEADER_HEVC;

    @NotNull
    private static final ByteString HEIF_HEADER_HEVX;

    @NotNull
    private static final ByteString HEIF_HEADER_MSF1;

    @NotNull
    private static final ByteString WEBP_HEADER_RIFF;

    @NotNull
    private static final ByteString WEBP_HEADER_VPX8;

    @NotNull
    private static final ByteString WEBP_HEADER_WEBP;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        GIF_HEADER_87A = companion.encodeUtf8("GIF87a");
        GIF_HEADER_89A = companion.encodeUtf8("GIF89a");
        WEBP_HEADER_RIFF = companion.encodeUtf8("RIFF");
        WEBP_HEADER_WEBP = companion.encodeUtf8("WEBP");
        WEBP_HEADER_VPX8 = companion.encodeUtf8("VP8X");
        HEIF_HEADER_FTYP = companion.encodeUtf8("ftyp");
        HEIF_HEADER_MSF1 = companion.encodeUtf8("msf1");
        HEIF_HEADER_HEVC = companion.encodeUtf8("hevc");
        HEIF_HEADER_HEVX = companion.encodeUtf8("hevx");
    }

    public static final boolean isAnimatedHeif(@NotNull DecodeUtils decodeUtils, @NotNull BufferedSource bufferedSource) {
        return isHeif(decodeUtils, bufferedSource) && (bufferedSource.rangeEquals(8L, HEIF_HEADER_MSF1) || bufferedSource.rangeEquals(8L, HEIF_HEADER_HEVC) || bufferedSource.rangeEquals(8L, HEIF_HEADER_HEVX));
    }

    public static final boolean isAnimatedWebP(@NotNull DecodeUtils decodeUtils, @NotNull BufferedSource bufferedSource) {
        return isWebP(decodeUtils, bufferedSource) && bufferedSource.rangeEquals(12L, WEBP_HEADER_VPX8) && bufferedSource.request(17L) && ((byte) (bufferedSource.getBuffer().getByte(16L) & 2)) > 0;
    }

    public static final boolean isGif(@NotNull DecodeUtils decodeUtils, @NotNull BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(0L, GIF_HEADER_89A) || bufferedSource.rangeEquals(0L, GIF_HEADER_87A);
    }

    public static final boolean isHeif(@NotNull DecodeUtils decodeUtils, @NotNull BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(4L, HEIF_HEADER_FTYP);
    }

    public static final boolean isWebP(@NotNull DecodeUtils decodeUtils, @NotNull BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(0L, WEBP_HEADER_RIFF) && bufferedSource.rangeEquals(8L, WEBP_HEADER_WEBP);
    }
}
