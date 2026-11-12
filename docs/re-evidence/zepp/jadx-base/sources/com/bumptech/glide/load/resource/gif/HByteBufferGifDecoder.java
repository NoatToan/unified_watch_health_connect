package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.gifdecoder.GifHeader;
import com.bumptech.glide.gifdecoder.HGifHeaderParser;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public class HByteBufferGifDecoder implements ResourceDecoder<ByteBuffer, GifDrawable> {
    private static final String f = "HByteBufferGifDecoder";
    private static final a g = new a();
    private static final b h = new b();
    private final Context a;
    private final List<ImageHeaderParser> b;
    private final b c;
    private final a d;
    private final GifBitmapProvider e;

    public static class a {
        public GifDecoder a(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i) {
            return new StandardGifDecoder(bitmapProvider, gifHeader, byteBuffer, i);
        }
    }

    public static class b {
        private final Queue<HGifHeaderParser> a = Util.createQueue(0);

        public synchronized HGifHeaderParser a(ByteBuffer byteBuffer) {
            HGifHeaderParser hGifHeaderParserPoll;
            hGifHeaderParserPoll = this.a.poll();
            if (hGifHeaderParserPoll == null) {
                hGifHeaderParserPoll = new HGifHeaderParser();
            }
            return hGifHeaderParserPoll.setData(byteBuffer);
        }

        public synchronized void b(HGifHeaderParser hGifHeaderParser) {
            hGifHeaderParser.clear();
            this.a.offer(hGifHeaderParser);
        }
    }

    public HByteBufferGifDecoder(Context context, List<ImageHeaderParser> list, BitmapPool bitmapPool, ArrayPool arrayPool) {
        this(context, list, bitmapPool, arrayPool, h, g);
    }

    @Nullable
    private GifDrawableResource a(ByteBuffer byteBuffer, int i, int i2, HGifHeaderParser hGifHeaderParser, Options options) {
        long logTime = LogTime.getLogTime();
        try {
            GifHeader header = hGifHeaderParser.parseHeader();
            if (header.getNumFrames() > 0 && header.getStatus() == 0) {
                Bitmap.Config config = options.get(GifOptions.DECODE_FORMAT) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                GifDecoder gifDecoderA = this.d.a(this.e, header, byteBuffer, b(header, i, i2));
                gifDecoderA.setDefaultBitmapConfig(config);
                gifDecoderA.advance();
                Bitmap nextFrame = gifDecoderA.getNextFrame();
                if (nextFrame == null) {
                    return null;
                }
                return new GifDrawableResource(new GifDrawable(this.a, gifDecoderA, UnitTransformation.get(), i, i2, nextFrame));
            }
            return null;
        } finally {
            if (Log.isLoggable(f, 2)) {
                Log.v(f, "Decoded GIF from stream in " + LogTime.getElapsedMillis(logTime));
            }
        }
    }

    private static int b(GifHeader gifHeader, int i, int i2) {
        int iMin = Math.min(gifHeader.getHeight() / i2, gifHeader.getWidth() / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable(f, 2) && iMax > 1) {
            Log.v(f, "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + gifHeader.getWidth() + "x" + gifHeader.getHeight() + "]");
        }
        return iMax;
    }

    public HByteBufferGifDecoder(Context context, List<ImageHeaderParser> list, BitmapPool bitmapPool, ArrayPool arrayPool, b bVar, a aVar) {
        this.a = context.getApplicationContext();
        this.b = list;
        this.d = aVar;
        this.e = new GifBitmapProvider(bitmapPool, arrayPool);
        this.c = bVar;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public GifDrawableResource decode(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull Options options) {
        HGifHeaderParser hGifHeaderParserA = this.c.a(byteBuffer);
        try {
            return a(byteBuffer, i, i2, hGifHeaderParserA, options);
        } finally {
            this.c.b(hGifHeaderParserA);
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull ByteBuffer byteBuffer, @NonNull Options options) throws IOException {
        return !((Boolean) options.get(GifOptions.DISABLE_ANIMATION)).booleanValue() && ImageHeaderParserUtils.getType(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }
}
