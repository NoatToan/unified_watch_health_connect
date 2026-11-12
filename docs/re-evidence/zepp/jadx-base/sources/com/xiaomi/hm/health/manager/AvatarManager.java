package com.xiaomi.hm.health.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.huami.lib.rainbow.ListTile;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes21.dex */
public class AvatarManager {
    private static final int a = 40;
    private static final int b = 80;
    private static Pattern c = Pattern.compile("[一-龥]+");
    private static final int d = 7;

    public class a extends HMLoadTarget<Bitmap> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ ImageView b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Object[] d;

        public a(final Context val$context, final ImageView val$imageView, final String val$remoteUrl, final Object[] val$other) {
            this.a = val$context;
            this.b = val$imageView;
            this.c = val$remoteUrl;
            this.d = val$other;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception e) {
            AvatarManager.f(this.a, this.b, this.c, true, this.d);
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap resource) {
            AvatarManager.makeRoundedBitmapDrawable(resource, this.a, this.b);
        }
    }

    public class b extends HMLoadTarget<Bitmap> {
        public final /* synthetic */ ImageView a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Object[] d;

        public b(final ImageView val$imageView, final Context val$context, final String val$remoteUrl, final Object[] val$other) {
            this.a = val$imageView;
            this.b = val$context;
            this.c = val$remoteUrl;
            this.d = val$other;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception e) {
            AvatarManager.f(this.b, this.a, this.c, false, this.d);
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap resource) {
            this.a.setImageBitmap(resource);
        }
    }

    public class c extends HMLoadTarget<Bitmap> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ ImageView b;
        public final /* synthetic */ Object[] c;

        public c(final Context val$context, final ImageView val$imageView, final Object[] val$other) {
            this.a = val$context;
            this.b = val$imageView;
            this.c = val$other;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception e) {
            AvatarManager.i(this.b, this.c);
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap resource) {
            AvatarManager.makeRoundedBitmapDrawable(resource, this.a, this.b);
        }
    }

    public class d extends HMLoadTarget<Bitmap> {
        public final /* synthetic */ ImageView a;
        public final /* synthetic */ Object[] b;

        public d(final ImageView val$imageView, final Object[] val$other) {
            this.a = val$imageView;
            this.b = val$other;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception e) {
            AvatarManager.i(this.a, this.b);
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap resource) {
            this.a.setImageBitmap(resource);
        }
    }

    public class e extends HMLoadTarget<Bitmap> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ ListTile b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Object[] d;

        public e(final Context val$context, final ListTile val$listTile, final String val$remoteUrl, final Object[] val$other) {
            this.a = val$context;
            this.b = val$listTile;
            this.c = val$remoteUrl;
            this.d = val$other;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception e) {
            AvatarManager.g(this.a, this.b, this.c, true, this.d);
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap resource) {
            AvatarManager.makeRoundedBitmapDrawable(resource, this.a, this.b);
        }
    }

    public class f extends HMLoadTarget<Bitmap> {
        public final /* synthetic */ ListTile a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Object[] d;

        public f(final ListTile val$listTile, final Context val$context, final String val$remoteUrl, final Object[] val$other) {
            this.a = val$listTile;
            this.b = val$context;
            this.c = val$remoteUrl;
            this.d = val$other;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception e) {
            AvatarManager.g(this.b, this.a, this.c, false, this.d);
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap resource) {
            this.a.setIndicatorHeader(new BitmapDrawable(this.b.getResources(), resource));
        }
    }

    public class g extends HMLoadTarget<Bitmap> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ ListTile b;
        public final /* synthetic */ Object[] c;

        public g(final Context val$context, final ListTile val$listTile, final Object[] val$other) {
            this.a = val$context;
            this.b = val$listTile;
            this.c = val$other;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception e) {
            AvatarManager.h(this.a, this.b, this.c);
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap resource) {
            AvatarManager.makeRoundedBitmapDrawable(resource, this.a, this.b);
        }
    }

    public class h extends HMLoadTarget<Bitmap> {
        public final /* synthetic */ ListTile a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Object[] c;

        public h(final ListTile val$listTile, final Context val$context, final Object[] val$other) {
            this.a = val$listTile;
            this.b = val$context;
            this.c = val$other;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception e) {
            AvatarManager.h(this.b, this.a, this.c);
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap resource) {
            this.a.setIndicatorHeader(new BitmapDrawable(this.b.getResources(), resource));
        }
    }

    private static Bitmap e(Object... other) {
        String strGroup = null;
        if (other == null || other.length == 0 || other.length > 7) {
            return null;
        }
        String str = (String) other[0];
        float fFloatValue = other.length > 1 ? ((Float) other[1]).floatValue() : 2.0f;
        int iIntValue = other.length > 2 ? ((Integer) other[2]).intValue() : ContextCompat.getColor(BraceletApp.getContext(), R.color.black20);
        int iIntValue2 = other.length > 3 ? ((Integer) other[3]).intValue() : ContextCompat.getColor(BraceletApp.getContext(), R.color.avatar_color_default);
        int iIntValue3 = other.length > 4 ? ((Integer) other[4]).intValue() : ContextCompat.getColor(BraceletApp.getContext(), R.color.black50);
        int iIntValue4 = other.length > 5 ? ((Integer) other[5]).intValue() : 80;
        int iIntValue5 = other.length > 6 ? ((Integer) other[6]).intValue() : 40;
        Matcher matcher = c.matcher(str);
        while (matcher.find()) {
            strGroup = matcher.group();
        }
        String strSubstring = !TextUtils.isEmpty(strGroup) ? strGroup.substring(strGroup.length() - 1) : str.substring(0, 1).toUpperCase();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue4, iIntValue4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setLinearText(true);
        paint.setTextSize(iIntValue5);
        paint.getTextBounds(strSubstring, 0, 1, new Rect());
        float width = canvas.getWidth() / 2.0f;
        float height = canvas.getHeight() / 2.0f;
        float strokeWidth = paint.getStrokeWidth();
        paint.setColor(iIntValue2);
        canvas.drawCircle(width, height, width - (strokeWidth / 2.0f), paint);
        paint.setColor(iIntValue);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint.setStrokeWidth(fFloatValue);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(width, height, width - (fFloatValue / 2.0f), paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iIntValue3);
        canvas.drawText(strSubstring, width, height - ((paint.descent() + paint.ascent()) / 2.0f), paint);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(final Context context, final ImageView imageView, String url, boolean isCircle, final Object... other) {
        if (isCircle) {
            HMImageLoader.with(context).load(url).asBitmap().into(new c(context, imageView, other));
        } else {
            HMImageLoader.with(context).load(url).asBitmap().into(new d(imageView, other));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(final Context context, final ListTile listTile, String url, boolean isCircle, final Object... other) {
        if (isCircle) {
            HMImageLoader.with(context).load(url).asBitmap().into(new g(context, listTile, other));
        } else {
            HMImageLoader.with(context).load(url).asBitmap().into(new h(listTile, context, other));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Context context, ListTile listTile, Object... other) {
        try {
            Bitmap bitmapE = e(other);
            if (bitmapE != null) {
                listTile.setIndicatorHeader(new BitmapDrawable(context.getResources(), bitmapE));
            } else {
                listTile.setIndicatorHeader(ContextCompat.getDrawable(context, R.drawable.setting_avatar_default));
            }
        } catch (Exception unused) {
            listTile.setIndicatorHeader(ContextCompat.getDrawable(context, R.drawable.setting_avatar_default));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(ImageView imageView, Object... other) {
        try {
            Bitmap bitmapE = e(other);
            if (bitmapE != null) {
                imageView.setImageBitmap(bitmapE);
            } else {
                imageView.setImageResource(R.drawable.setting_avatar_default);
            }
        } catch (Exception unused) {
            imageView.setImageResource(R.drawable.setting_avatar_default);
        }
    }

    public static void makeRoundedBitmapDrawable(Bitmap resource, Context context, ImageView imageView) {
        RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(context.getResources(), resource);
        roundedBitmapDrawableCreate.setCircular(true);
        imageView.setImageDrawable(roundedBitmapDrawableCreate);
    }

    public static void updateAvatarUI(final Context context, final ImageView imageView, String localUrl, final String remoteUrl, boolean isCircle, final Object... other) {
        if (isCircle) {
            HMImageLoader.with(context).load(localUrl).asBitmap().into(new a(context, imageView, remoteUrl, other));
        } else {
            HMImageLoader.with(context).load(localUrl).asBitmap().into(new b(imageView, context, remoteUrl, other));
        }
    }

    public static void updateAvatarUI(final Context context, final ImageView imageView, String localUrl, final String remoteUrl, final Object... other) {
        updateAvatarUI(context, imageView, localUrl, remoteUrl, false, other);
    }

    public static void makeRoundedBitmapDrawable(Bitmap resource, Context context, ListTile listTile) {
        RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(context.getResources(), resource);
        roundedBitmapDrawableCreate.setCircular(true);
        listTile.setIndicatorHeader(roundedBitmapDrawableCreate);
    }

    public static void updateAvatarUI(final ImageView imageView, String localUrl, final String remoteUrl, boolean isCircle, final Object... other) {
        updateAvatarUI(BraceletApp.getContext(), imageView, localUrl, remoteUrl, isCircle, other);
    }

    public static void updateAvatarUI(final ImageView imageView, String localUrl, final String remoteUrl, final Object... other) {
        updateAvatarUI(BraceletApp.getContext(), imageView, localUrl, remoteUrl, false, other);
    }

    public static void updateAvatarUI(ImageView imageView, String url, boolean isCircle, Object... other) {
        updateAvatarUI(imageView, "", url, isCircle, other);
    }

    public static void updateAvatarUI(final Context context, final ListTile listTile, String localUrl, final String remoteUrl, boolean isCircle, final Object... other) {
        if (isCircle) {
            HMImageLoader.with(context).load(localUrl).asBitmap().into(new e(context, listTile, remoteUrl, other));
        } else {
            HMImageLoader.with(context).load(localUrl).asBitmap().into(new f(listTile, context, remoteUrl, other));
        }
    }
}
