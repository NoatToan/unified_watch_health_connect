package androidx.media3.transformer;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Looper;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceBitmapLoader;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.base.Ascii;
import com.huawei.openalliance.ad.constant.MetaCreativeType;
import com.huawei.openalliance.ad.constant.MimeType;
import defpackage.aqx;
import java.util.Objects;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes21.dex */
public final class DefaultAssetLoaderFactory implements AssetLoader.Factory {
    private final BitmapLoader bitmapLoader;
    private final Clock clock;
    private final Context context;
    private final Codec.DecoderFactory decoderFactory;
    private AssetLoader.Factory exoPlayerAssetLoaderFactory;
    private AssetLoader.Factory imageAssetLoaderFactory;
    private final MediaSource.Factory mediaSourceFactory;

    public DefaultAssetLoaderFactory(Context context, Codec.DecoderFactory decoderFactory, Clock clock) {
        this.context = context.getApplicationContext();
        this.decoderFactory = decoderFactory;
        this.clock = clock;
        BitmapFactory.Options options = null;
        this.mediaSourceFactory = null;
        if (Util.SDK_INT >= 26) {
            options = new BitmapFactory.Options();
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        this.bitmapLoader = new DataSourceBitmapLoader(aqx.c(Executors.newSingleThreadExecutor()), new DefaultDataSource.Factory(context), options);
    }

    public DefaultAssetLoaderFactory(Context context, BitmapLoader bitmapLoader) {
        this.context = context.getApplicationContext();
        this.decoderFactory = new DefaultDecoderFactory(context);
        this.clock = Clock.DEFAULT;
        this.mediaSourceFactory = null;
        this.bitmapLoader = bitmapLoader;
    }

    public DefaultAssetLoaderFactory(Context context, Codec.DecoderFactory decoderFactory, Clock clock, MediaSource.Factory factory, BitmapLoader bitmapLoader) {
        this.context = context.getApplicationContext();
        this.decoderFactory = decoderFactory;
        this.clock = clock;
        this.mediaSourceFactory = factory;
        this.bitmapLoader = bitmapLoader;
    }

    @Override // androidx.media3.transformer.AssetLoader.Factory
    public AssetLoader createAssetLoader(EditedMediaItem editedMediaItem, Looper looper, AssetLoader.Listener listener, AssetLoader.CompositionSettings compositionSettings) {
        ExoPlayerAssetLoader.Factory factory;
        if (isImage(editedMediaItem.mediaItem.localConfiguration)) {
            if (this.imageAssetLoaderFactory == null) {
                this.imageAssetLoaderFactory = new ImageAssetLoader.Factory(this.bitmapLoader);
            }
            return this.imageAssetLoaderFactory.createAssetLoader(editedMediaItem, looper, listener, compositionSettings);
        }
        if (this.exoPlayerAssetLoaderFactory == null) {
            MediaSource.Factory factory2 = this.mediaSourceFactory;
            if (factory2 != null) {
                factory = new ExoPlayerAssetLoader.Factory(this.context, this.decoderFactory, this.clock, factory2);
            } else {
                factory = new ExoPlayerAssetLoader.Factory(this.context, this.decoderFactory, this.clock);
            }
            this.exoPlayerAssetLoaderFactory = factory;
        }
        return this.exoPlayerAssetLoaderFactory.createAssetLoader(editedMediaItem, looper, listener, compositionSettings);
    }

    private boolean isImage(MediaItem.LocalConfiguration localConfiguration) {
        if (localConfiguration == null) {
            return false;
        }
        String commonImageMimeTypeFromExtension = localConfiguration.mimeType;
        if (commonImageMimeTypeFromExtension == null) {
            if (Objects.equals(localConfiguration.uri.getScheme(), "content")) {
                commonImageMimeTypeFromExtension = this.context.getContentResolver().getType(localConfiguration.uri);
            } else {
                String path = localConfiguration.uri.getPath();
                if (path == null) {
                    return false;
                }
                int iLastIndexOf = path.lastIndexOf(".");
                if (iLastIndexOf >= 0 && iLastIndexOf < path.length() - 1) {
                    commonImageMimeTypeFromExtension = getCommonImageMimeTypeFromExtension(Ascii.toLowerCase(path.substring(iLastIndexOf + 1)));
                }
            }
        }
        if (commonImageMimeTypeFromExtension == null || !MimeTypes.isImage(commonImageMimeTypeFromExtension)) {
            return false;
        }
        Assertions.checkState(this.bitmapLoader.supportsMimeType(commonImageMimeTypeFromExtension), "Image format not supported by given bitmapLoader");
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:97:0x0136  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static String getCommonImageMimeTypeFromExtension(String str) {
        byte b2;
        str.hashCode();
        switch (str.hashCode()) {
            case 96870:
                if (!str.equals("arw")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 97669:
                if (!str.equals("bmp")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 98723:
                if (!str.equals("cr2")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 99453:
                if (!str.equals("dib")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 102340:
                if (!str.equals(MetaCreativeType.GIF)) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 104085:
                if (!str.equals("ico")) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case 104430:
                if (!str.equals("k25")) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case 105133:
                if (!str.equals("jfi")) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case 105223:
                if (!str.equals("jif")) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case 105439:
                if (!str.equals("jpe")) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case 105441:
                if (!str.equals("jpg")) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            case 111145:
                if (!str.equals("png")) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            case 112680:
                if (!str.equals("raw")) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case 114276:
                if (!str.equals("svg")) {
                    b2 = -1;
                } else {
                    b2 = 13;
                }
                break;
            case 114833:
                if (!str.equals("tif")) {
                    b2 = -1;
                } else {
                    b2 = 14;
                }
                break;
            case 3006482:
                if (!str.equals("avif")) {
                    b2 = -1;
                } else {
                    b2 = 15;
                }
                break;
            case 3198679:
                if (!str.equals("heic")) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case 3198682:
                if (!str.equals("heif")) {
                    b2 = -1;
                } else {
                    b2 = 17;
                }
                break;
            case 3259225:
                if (!str.equals("jfif")) {
                    b2 = -1;
                } else {
                    b2 = 18;
                }
                break;
            case 3268712:
                if (!str.equals("jpeg")) {
                    b2 = -1;
                } else {
                    b2 = 19;
                }
                break;
            case 3542678:
                if (!str.equals("svgz")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.DC4;
                }
                break;
            case 3559925:
                if (!str.equals("tiff")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.NAK;
                }
                break;
            case 3645340:
                if (!str.equals("webp")) {
                    b2 = -1;
                } else {
                    b2 = Ascii.SYN;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
            case 2:
            case 6:
            case 12:
                return MimeTypes.IMAGE_RAW;
            case 1:
            case 3:
                return MimeTypes.IMAGE_BMP;
            case 4:
                return MimeType.GIF;
            case 5:
                return "image/x-icon";
            case 7:
            case 8:
            case 9:
            case 10:
            case 18:
            case 19:
                return "image/jpeg";
            case 11:
                return "image/png";
            case 13:
            case 20:
                return "image/svg+xml";
            case 14:
            case 21:
                return "image/tiff";
            case 15:
                return MimeTypes.IMAGE_AVIF;
            case 16:
                return MimeTypes.IMAGE_HEIC;
            case 17:
                return MimeTypes.IMAGE_HEIF;
            case 22:
                return MimeTypes.IMAGE_WEBP;
            default:
                return null;
        }
    }
}
