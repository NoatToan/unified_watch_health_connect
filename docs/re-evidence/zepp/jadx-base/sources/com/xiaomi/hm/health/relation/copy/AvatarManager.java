package com.xiaomi.hm.health.relation.copy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.huami.relatives.FriendsAndFamilyInject;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import com.xiaomi.hm.health.relation.R;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class AvatarManager {
    private static final int a = 40;
    private static final int b = 80;
    private static Lazy<FriendsAndFamilyInject> c = KoinJavaComponent.inject(FriendsAndFamilyInject.class);
    private static Pattern d = Pattern.compile("[一-龥]+");
    private static final int e = 7;

    public class a extends HMLoadTarget<Bitmap> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ ImageView b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Object[] d;

        public a(Context context, ImageView imageView, String str, Object[] objArr) {
            this.a = context;
            this.b = imageView;
            this.c = str;
            this.d = objArr;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception exc) {
            AvatarManager.d(this.a, this.b, this.c, true, this.d);
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap bitmap) {
            AvatarManager.makeRoundedBitmapDrawable(bitmap, this.a, this.b);
        }
    }

    public class b extends HMLoadTarget<Bitmap> {
        public final /* synthetic */ ImageView a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Object[] d;

        public b(ImageView imageView, Context context, String str, Object[] objArr) {
            this.a = imageView;
            this.b = context;
            this.c = str;
            this.d = objArr;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception exc) {
            AvatarManager.d(this.b, this.a, this.c, false, this.d);
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap bitmap) {
            this.a.setImageBitmap(bitmap);
        }
    }

    public class c extends HMLoadTarget<Bitmap> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ ImageView b;
        public final /* synthetic */ Object[] c;

        public c(Context context, ImageView imageView, Object[] objArr) {
            this.a = context;
            this.b = imageView;
            this.c = objArr;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception exc) {
            AvatarManager.e(this.b, this.c);
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap bitmap) {
            AvatarManager.makeRoundedBitmapDrawable(bitmap, this.a, this.b);
        }
    }

    public class d extends HMLoadTarget<Bitmap> {
        public final /* synthetic */ ImageView a;
        public final /* synthetic */ Object[] b;

        public d(ImageView imageView, Object[] objArr) {
            this.a = imageView;
            this.b = objArr;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception exc) {
            AvatarManager.e(this.a, this.b);
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap bitmap) {
            this.a.setImageBitmap(bitmap);
        }
    }

    private static Bitmap c(Object... objArr) {
        String strGroup = null;
        if (objArr == null || objArr.length == 0 || objArr.length > 7) {
            return null;
        }
        String str = (String) objArr[0];
        float fFloatValue = objArr.length > 1 ? ((Float) objArr[1]).floatValue() : 2.0f;
        int iIntValue = objArr.length > 2 ? ((Integer) objArr[2]).intValue() : ContextCompat.getColor(c.getValue().getAppContext(), R.color.relatives_black20);
        int iIntValue2 = objArr.length > 3 ? ((Integer) objArr[3]).intValue() : ContextCompat.getColor(c.getValue().getAppContext(), R.color.relatives_avatar_color_default);
        int iIntValue3 = objArr.length > 4 ? ((Integer) objArr[4]).intValue() : ContextCompat.getColor(c.getValue().getAppContext(), R.color.relatives_black50);
        int iIntValue4 = objArr.length > 5 ? ((Integer) objArr[5]).intValue() : 80;
        int iIntValue5 = objArr.length > 6 ? ((Integer) objArr[6]).intValue() : 40;
        Matcher matcher = d.matcher(str);
        while (matcher.find()) {
            strGroup = matcher.group();
        }
        String strSubstring = !TextUtils.isEmpty(strGroup) ? strGroup.substring(strGroup.length() - 1) : str.substring(0, 1).toUpperCase(Locale.getDefault());
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
    public static void d(Context context, ImageView imageView, String str, boolean z, Object... objArr) {
        if (z) {
            HMImageLoader.with(context).load(str).asBitmap().into(new c(context, imageView, objArr));
        } else {
            HMImageLoader.with(context).load(str).asBitmap().into(new d(imageView, objArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(ImageView imageView, Object... objArr) {
        try {
            Bitmap bitmapC = c(objArr);
            if (bitmapC != null) {
                imageView.setImageBitmap(bitmapC);
            } else {
                imageView.setImageResource(R.drawable.relatives_setting_avatar_default);
            }
        } catch (Exception unused) {
            imageView.setImageResource(R.drawable.relatives_setting_avatar_default);
        }
    }

    public static void makeRoundedBitmapDrawable(Bitmap bitmap, Context context, ImageView imageView) {
        RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(context.getResources(), bitmap);
        roundedBitmapDrawableCreate.setCircular(true);
        imageView.setImageDrawable(roundedBitmapDrawableCreate);
    }

    public static void updateAvatarUI(Context context, ImageView imageView, String str, String str2, boolean z, Object... objArr) {
        if (z) {
            HMImageLoader.with(context).load(str).asBitmap().into(new a(context, imageView, str2, objArr));
        } else {
            HMImageLoader.with(context).load(str).asBitmap().into(new b(imageView, context, str2, objArr));
        }
    }

    public static void updateAvatarUI(ImageView imageView, String str, String str2, boolean z, Object... objArr) {
        updateAvatarUI(c.getValue().getAppContext(), imageView, str, str2, z, objArr);
    }

    public static void updateAvatarUI(ImageView imageView, String str, boolean z, Object... objArr) {
        updateAvatarUI(imageView, "", str, z, objArr);
    }
}
