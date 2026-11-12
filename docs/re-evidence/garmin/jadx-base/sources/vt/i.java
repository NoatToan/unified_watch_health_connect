package vt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import androidx.core.content.FileProvider;
import e23.p;
import java.io.File;
import java.io.OutputStream;
import java.util.Objects;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/net/Uri;", "<anonymous>", "(Lo53/b0;)Landroid/net/Uri;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.developer_option.MultipleImagesShareSampleActivityKt$createBitmapUri$2", f = "MultipleImagesShareSampleActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Uri>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f180041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f180042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f180043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bitmap.CompressFormat f180044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, int i14, String str, Bitmap.CompressFormat compressFormat, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f180041a = context;
        this.f180042b = i14;
        this.f180043c = str;
        this.f180044d = compressFormat;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f180041a, this.f180042b, this.f180043c, this.f180044d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Uri> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        OutputStream outputStreamOpenOutputStream;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        Context context = this.f180041a;
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        OutputStream outputStream = null;
        Drawable drawable = resources.getDrawable(this.f180042b, null);
        Bitmap bitmapB = drawable != null ? d7.b.b(drawable, 0, 0, 7) : null;
        try {
            File file = new File(context.getCacheDir(), "images");
            file.mkdir();
            File file2 = new File(file, this.f180043c);
            outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(Uri.fromFile(file2));
            if (outputStreamOpenOutputStream != null) {
                if (bitmapB != null) {
                    try {
                        try {
                            bitmapB.compress(this.f180044d, 100, outputStreamOpenOutputStream);
                        } catch (Exception e4) {
                            e = e4;
                            Objects.toString(bitmapB);
                            e.toString();
                            if (outputStreamOpenOutputStream != null) {
                                outputStreamOpenOutputStream.flush();
                            }
                            if (outputStreamOpenOutputStream != null) {
                                outputStreamOpenOutputStream.close();
                            }
                            return null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        outputStream = outputStreamOpenOutputStream;
                        if (outputStream != null) {
                            outputStream.flush();
                        }
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        throw th;
                    }
                }
                Uri uriD = FileProvider.d(context, "GarminConnectMobileApp.provider", file2);
                outputStreamOpenOutputStream.flush();
                outputStreamOpenOutputStream.close();
                return uriD;
            }
        } catch (Exception e14) {
            e = e14;
            outputStreamOpenOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            if (outputStream != null) {
                outputStream.flush();
            }
            if (outputStream != null) {
                outputStream.close();
            }
            throw th;
        }
        return null;
    }
}
