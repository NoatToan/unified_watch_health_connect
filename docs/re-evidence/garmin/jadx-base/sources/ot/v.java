package ot;

import android.content.Context;
import android.graphics.Bitmap;
import com.airbnb.lottie.LottieDrawable;
import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.chapter.RecapChapter$updateProfileImage$1$1", f = "RecapChapter.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f133691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f133692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f133693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f133694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f133695e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, String str, AtomicBoolean atomicBoolean, u uVar, LottieDrawable lottieDrawable, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f133691a = context;
        this.f133692b = str;
        this.f133693c = atomicBoolean;
        this.f133694d = uVar;
        this.f133695e = lottieDrawable;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f133691a, this.f133692b, this.f133693c, this.f133694d, this.f133695e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        zp0.c.f206560v.getClass();
        zp0.c cVarA = zp0.c.a.a(this.f133691a);
        cVarA.f206565e = this.f133692b;
        Bitmap bitmapC = cVarA.c();
        if (bitmapC != null) {
            this.f133693c.set(true);
            int i14 = u.f133675x;
            u uVar = this.f133694d;
            uVar.getClass();
            LottieDrawable lottieDrawable = this.f133695e;
            if ((lottieDrawable != null ? lottieDrawable.getComposition() : null) != null) {
                int i15 = uVar.f133678t;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapC, i15, i15, false);
                bitmapCreateScaledBitmap.getClass();
                lottieDrawable.updateBitmap("image_0", bitmapCreateScaledBitmap);
            }
        }
        return Unit.INSTANCE;
    }
}
