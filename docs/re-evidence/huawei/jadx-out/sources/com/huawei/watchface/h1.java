package com.huawei.watchface;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.media3.common.C;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.watchface.utils.HwLog;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes45.dex */
public abstract class h1 {

    public class a extends CustomTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f30184a;

        public a(b bVar) {
            this.f30184a = bVar;
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Bitmap bitmap, Transition transition) {
            b bVar = this.f30184a;
            if (bVar == null) {
                return;
            }
            bVar.a(bitmap);
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadCleared(Drawable drawable) {
        }
    }

    public interface b {
        void a(Bitmap bitmap);
    }

    public static void a(Context context, String str, int i, int i2, ImageView imageView) {
        Glide.with(context).load(str).placeholder(i).error(i2).into(imageView);
    }

    public static Bitmap a(Context context, String str) {
        try {
            return Glide.with(context).asBitmap().load(str).submit().get(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            HwLog.e("GlideUtils", "load bitmap from url is interrupted" + HwLog.printException((Exception) e));
            return null;
        } catch (ExecutionException e2) {
            HwLog.e("GlideUtils", "load bitmap from url execute fail" + HwLog.printException((Exception) e2));
            return null;
        } catch (TimeoutException e3) {
            HwLog.e("GlideUtils", "load bitmap from url timeout" + HwLog.printException((Exception) e3));
            return null;
        }
    }

    public static void a(Context context, String str, b bVar) {
        Glide.with(context).asBitmap().load(str).into(new a(bVar));
    }
}
