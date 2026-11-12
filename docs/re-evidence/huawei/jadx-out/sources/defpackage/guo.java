package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import com.huawei.haf.application.BaseApplication;
import com.huawei.openalliance.ad.constant.ParamConstants;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes8.dex */
public class guo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static AudioManager f36055c;
    private static MediaPlayer d;

    public static void a(Context context) {
        if (f36055c == null) {
            Object systemService = context.getSystemService("audio");
            if (!(systemService instanceof AudioManager)) {
                LogUtil.e("RecognizeUtil", "playCaptureSound failed, service error: ", systemService);
                return;
            }
            f36055c = (AudioManager) systemService;
        }
        int streamVolume = f36055c.getStreamVolume(5);
        if (streamVolume <= 0) {
            LogUtil.b("RecognizeUtil", "playCaptureSound return, silent volume: ", Integer.valueOf(streamVolume));
            return;
        }
        if (d == null) {
            d = MediaPlayer.create(context, Uri.parse("file:///system/media/audio/ui/camera_click.ogg"));
        }
        MediaPlayer mediaPlayer = d;
        if (mediaPlayer == null) {
            LogUtil.e("RecognizeUtil", "playCaptureSound failed, mediaPlayer is null");
        } else {
            mediaPlayer.start();
        }
    }

    public static void a() {
        MediaPlayer mediaPlayer = d;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            d = null;
        }
    }

    public static Bitmap a(Bitmap bitmap, float f) {
        if (bitmap == null) {
            LogUtil.d("RecognizeUtil", "rotateBitmap bitmapOri is null");
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static int b(Uri uri) {
        Cursor cursorQuery = BaseApplication.b().getContentResolver().query(uri, new String[]{ParamConstants.Param.ORIENTATION}, null, null, null);
        int i = 0;
        if (cursorQuery != null) {
            try {
                if (cursorQuery.getCount() != 1) {
                    return 0;
                }
                cursorQuery.moveToFirst();
                i = cursorQuery.getInt(0);
                cursorQuery.close();
                return i;
            } catch (IllegalStateException e) {
                ReleaseLogUtil.b("RecognizeUtil", "getAlbumPicOrientation failed, e: " + e);
            }
        }
        return i;
    }
}
