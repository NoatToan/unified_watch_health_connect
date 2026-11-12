package re2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.media.ThumbnailUtils;
import android.util.TypedValue;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lo53/b0;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.MobileAuthUtil$createBorderedCircularBitmap$2", f = "MobileAuthUtil.kt", l = {}, m = "invokeSuspend")
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Bitmap>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f152296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f152297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f152298c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(float f14, Context context, Bitmap bitmap, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f152296a = f14;
        this.f152297b = context;
        this.f152298c = bitmap;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f152296a, this.f152297b, this.f152298c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Bitmap> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Context context = this.f152297b;
        int iC = MathKt.c(TypedValue.applyDimension(1, this.f152296a, context.getResources().getDisplayMetrics()));
        Bitmap bitmap = this.f152298c;
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap bitmapExtractThumbnail = ThumbnailUtils.extractThumbnail(bitmap, iMin, iMin);
        if (!p005kotlin.jvm.internal.s.g(bitmapExtractThumbnail, bitmap)) {
            bitmap.recycle();
        }
        Bitmap.Config config = bitmap.getConfig();
        config.getClass();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmapExtractThumbnail, tileMode, tileMode));
        paint.setAntiAlias(true);
        float f14 = iMin / 2.0f;
        canvas.drawCircle(f14, f14, f14, paint);
        Paint paint2 = new Paint();
        int identifier = context.getResources().getIdentifier("ssoTheme", "string", context.getPackageName());
        String string = identifier == 0 ? context.getResources().getString(R.string.ssoTheme) : context.getResources().getString(identifier);
        string.getClass();
        paint2.setColor(string.equals("DARK") ? -1 : -16777216);
        paint2.setStyle(Paint.Style.STROKE);
        float f15 = iC;
        paint2.setStrokeWidth(f15);
        paint2.setAntiAlias(true);
        paint2.setAlpha(255);
        canvas.drawCircle(f14, f14, f14 - (f15 / 2.0f), paint2);
        bitmapExtractThumbnail.recycle();
        return bitmapCreateBitmap;
    }
}
