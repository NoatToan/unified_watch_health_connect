package og0;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Log0/b;", "", "<init>", "()V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f131972a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f131973b = {"file"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f131974c = {"file.png"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final MediaType[] f131975d = {gz0.a.f80404d};

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Log0/b$a;", "", "<init>", "()V", "", "", "NAMES", "[Ljava/lang/String;", "FILE_NAMES", "Lokhttp3/MediaType;", "FILE_TYPES", "[Lokhttp3/MediaType;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static ArrayList a(Context context, Uri uri) {
            Bitmap bitmap;
            context.getClass();
            uri.getClass();
            ContentResolver contentResolver = context.getContentResolver();
            byte[][] bArr = null;
            if (Build.VERSION.SDK_INT >= 29) {
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(contentResolver, uri);
                bitmap = sourceCreateSource != null ? ImageDecoder.decodeBitmap(sourceCreateSource) : null;
            } else {
                bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
            }
            if (bitmap != null) {
                b.f131972a.getClass();
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 298, 298, false);
                bitmapCreateScaledBitmap.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bitmapCreateScaledBitmap.recycle();
                byteArray.getClass();
                bArr = new byte[][]{byteArray};
            }
            ArrayList arrayList = new ArrayList();
            if (bArr != null) {
                int length = b.f131973b.length;
                for (int i14 = 0; i14 < length; i14++) {
                    arrayList.add(MultipartBody.Part.INSTANCE.createFormData(b.f131973b[i14], b.f131974c[i14], RequestBody.Companion.create$default(RequestBody.INSTANCE, b.f131975d[i14], bArr[i14], 0, 0, 12, (Object) null)));
                }
            }
            return arrayList;
        }

        private a() {
        }
    }
}
