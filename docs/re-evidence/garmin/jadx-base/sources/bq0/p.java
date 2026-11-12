package bq0;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.File;
import java.io.OutputStream;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Landroid/net/Uri;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.imagemultipicker.StorageImageViewModel$saveBitmapToUri$1", f = "StorageImageViewModel.kt", l = {148, 156, 159}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<t0<Uri>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f19536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f19538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bitmap.CompressFormat f19539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bitmap f19540g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, String str, l lVar, Bitmap.CompressFormat compressFormat, Bitmap bitmap, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f19536c = context;
        this.f19537d = str;
        this.f19538e = lVar;
        this.f19539f = compressFormat;
        this.f19540g = bitmap;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f19536c, this.f19537d, this.f19538e, this.f19539f, this.f19540g, dVar);
        pVar.f19535b = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(t0<Uri> t0Var, t13.d<? super Unit> dVar) {
        return ((p) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (r2.emit(r12, r11) == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r2.emit(null, r11) == r3) goto L32;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bitmap.CompressFormat compressFormat = this.f19539f;
        Context context = this.f19536c;
        t0 t0Var = (t0) this.f19535b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f19534a;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i14 == 2 || i14 == 3) {
                    r.b(obj);
                    return Unit.INSTANCE;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            File file = new File(context.getCacheDir(), "images");
            file.mkdir();
            File file2 = new File(file, this.f19537d);
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(Uri.fromFile(file2));
            if (outputStreamOpenOutputStream == null) {
                this.f19535b = t0Var;
                this.f19534a = 1;
                if (t0Var.emit(null, this) == aVar) {
                }
                return Unit.INSTANCE;
            }
            l lVar = this.f19538e;
            List<String> list = l.f19513b;
            lVar.getClass();
            this.f19540g.compress(compressFormat, l.b.f19515a[compressFormat.ordinal()] != 1 ? 100 : 90, outputStreamOpenOutputStream);
            outputStreamOpenOutputStream.flush();
            outputStreamOpenOutputStream.close();
            Uri uriD = FileProvider.d(context, "GarminConnectMobileApp.provider", file2);
            this.f19535b = t0Var;
            this.f19534a = 2;
            return aVar;
        } catch (Exception e4) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Save bitmap failed: ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "StorageImageViewModel", strD);
            this.f19535b = null;
            this.f19534a = 3;
        }
    }
}
