package su0;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/net/Uri;", "<anonymous>", "(Lo53/b0;)Landroid/net/Uri;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.data.repository.LiveTrackUrlShareDataSourceImpl$createCachedImageUri$2", f = "LiveTrackUrlShareDataSourceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Uri>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f161011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f161012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f161013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, Bitmap bitmap, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f161012b = context;
        this.f161013c = bitmap;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w wVar = new w(this.f161012b, this.f161013c, dVar);
        wVar.f161011a = obj;
        return wVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Uri> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Context context = this.f161012b;
        File file = new File(context.getCacheDir(), "images");
        file.mkdirs();
        File file2 = new File(file, "user_profile_picture.png");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            this.f161013c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            return FileProvider.d(context, "GarminConnectMobileApp.provider", file2);
        } catch (IOException e4) {
            a2 a2Var = a2.LIVETRACK;
            String str = "[createCachedImageUri] failed to cache image due to error: " + e4.getMessage();
            i2.f36769a.getClass();
            i2.a.a(a2Var, str);
            return null;
        } finally {
            fileOutputStream.close();
        }
    }
}
