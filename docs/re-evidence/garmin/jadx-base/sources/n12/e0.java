package n12;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import c22.k3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.IOException;
import java.io.OutputStream;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewHolder$storeBitmapToUri$2", f = "EditProfileImageViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f122234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.editimage.c f122235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f122236c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar, Bitmap bitmap, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f122235b = cVar;
        this.f122236c = bitmap;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e0 e0Var = new e0(this.f122235b, this.f122236c, dVar);
        e0Var.f122234a = obj;
        return e0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar = this.f122235b;
        Context context = cVar.f46661d.getContext();
        context.getClass();
        cVar.f46671n = k3.a(context, "crop_input.png");
        ContentResolver contentResolver = cVar.f46661d.getContext().getContentResolver();
        Uri uri = cVar.f46671n;
        if (uri == null) {
            p005kotlin.jvm.internal.s.m("cropInputUri");
            throw null;
        }
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        if (outputStreamOpenOutputStream == null) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "EditProfileImageViewHolder", "Output stream is null");
            return Unit.INSTANCE;
        }
        this.f122236c.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
        outputStreamOpenOutputStream.flush();
        outputStreamOpenOutputStream.close();
        return Unit.INSTANCE;
    }
}
