package yr2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.GlideException;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import java.util.Arrays;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.util.extensions.ImageViewExtentionsKt$loadImage$1$1", f = "ImageViewExtentions.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f199143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f199144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f199145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GlideException f199146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dj.f[] f199147e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, ImageView imageView, GlideException glideException, dj.f[] fVarArr, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f199144b = str;
        this.f199145c = imageView;
        this.f199146d = glideException;
        this.f199147e = fVarArr;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f199144b, this.f199145c, this.f199146d, this.f199147e, dVar);
        iVar.f199143a = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006c A[Catch: Exception -> 0x0058, TryCatch #1 {Exception -> 0x0058, blocks: (B:9:0x0040, B:11:0x0048, B:18:0x0069, B:16:0x005a, B:20:0x006c, B:22:0x00aa, B:27:0x00c2, B:23:0x00b4, B:25:0x00b7, B:26:0x00bf), top: B:34:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00aa A[Catch: Exception -> 0x0058, TryCatch #1 {Exception -> 0x0058, blocks: (B:9:0x0040, B:11:0x0048, B:18:0x0069, B:16:0x005a, B:20:0x006c, B:22:0x00aa, B:27:0x00c2, B:23:0x00b4, B:25:0x00b7, B:26:0x00bf), top: B:34:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00b4 A[Catch: Exception -> 0x0058, TryCatch #1 {Exception -> 0x0058, blocks: (B:9:0x0040, B:11:0x0048, B:18:0x0069, B:16:0x005a, B:20:0x006c, B:22:0x00aa, B:27:0x00c2, B:23:0x00b4, B:25:0x00b7, B:26:0x00bf), top: B:34:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b7 A[Catch: Exception -> 0x0058, TryCatch #1 {Exception -> 0x0058, blocks: (B:9:0x0040, B:11:0x0048, B:18:0x0069, B:16:0x005a, B:20:0x006c, B:22:0x00aa, B:27:0x00c2, B:23:0x00b4, B:25:0x00b7, B:26:0x00bf), top: B:34:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00bf A[Catch: Exception -> 0x0058, TryCatch #1 {Exception -> 0x0058, blocks: (B:9:0x0040, B:11:0x0048, B:18:0x0069, B:16:0x005a, B:20:0x006c, B:22:0x00aa, B:27:0x00c2, B:23:0x00b4, B:25:0x00b7, B:26:0x00bf), top: B:34:0x0040 }] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        mj.a aVarW;
        ui.l<Bitmap>[] lVarArr;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        ImageView imageView = this.f199145c;
        String str = this.f199144b;
        if (str != null) {
            j.f199148a.warn("Image load failed, fallback to business operator logo for ".concat(str));
            try {
                or2.a.f133422a.getClass();
                imageView.setImageResource(or2.a.a(qs2.a.valueOf(str)));
            } catch (Exception unused) {
                j.f199148a.debug("Business Operator not found. Won't show any card");
            }
        } else {
            dj.f[] fVarArr = this.f199147e;
            j.f199148a.warn("Image load failed, fallback to payment_default_card", (Throwable) this.f199146d);
            try {
                if (imageView.getContext() instanceof Activity) {
                    Context context2 = imageView.getContext();
                    context2.getClass();
                    if (!((Activity) context2).isDestroyed()) {
                        context = imageView.getContext();
                        context.getClass();
                        if (!((Activity) context).isFinishing()) {
                            com.bumptech.glide.k kVarE = com.bumptech.glide.b.e(imageView.getContext());
                            Integer num = new Integer(R.drawable.payment_default_card);
                            com.bumptech.glide.j jVarD = kVarE.d(Drawable.class);
                            com.bumptech.glide.j jVarJ = jVarD.J(num);
                            Context context3 = jVarD.f28503y;
                            aVarW = (com.bumptech.glide.j) jVarJ.t(context3.getTheme()).q(pj.a.c(context3));
                            lVarArr = (ui.l[]) Arrays.copyOf(fVarArr, fVarArr.length);
                            aVarW.getClass();
                            if (lVarArr.length > 1) {
                                aVarW = aVarW.w(new ui.f<>(lVarArr), true);
                            } else if (lVarArr.length == 1) {
                                aVarW = aVarW.w(lVarArr[0], true);
                            } else {
                                aVarW.o();
                            }
                            ((com.bumptech.glide.j) aVarW).E(imageView);
                        }
                    }
                } else {
                    context = imageView.getContext();
                    context.getClass();
                    if (!((Activity) context).isFinishing()) {
                        com.bumptech.glide.k kVarE2 = com.bumptech.glide.b.e(imageView.getContext());
                        Integer num2 = new Integer(R.drawable.payment_default_card);
                        com.bumptech.glide.j jVarD2 = kVarE2.d(Drawable.class);
                        com.bumptech.glide.j jVarJ2 = jVarD2.J(num2);
                        Context context4 = jVarD2.f28503y;
                        aVarW = (com.bumptech.glide.j) jVarJ2.t(context4.getTheme()).q(pj.a.c(context4));
                        lVarArr = (ui.l[]) Arrays.copyOf(fVarArr, fVarArr.length);
                        aVarW.getClass();
                        if (lVarArr.length > 1) {
                            aVarW = aVarW.w(new ui.f<>(lVarArr), true);
                        } else if (lVarArr.length == 1) {
                            aVarW = aVarW.w(lVarArr[0], true);
                        } else {
                            aVarW.o();
                        }
                        ((com.bumptech.glide.j) aVarW).E(imageView);
                    }
                }
                return Unit.INSTANCE;
            } catch (Exception e4) {
                j.f199148a.warn("Image load failed, couldn't load default card", (Throwable) e4);
            }
        }
        return Unit.INSTANCE;
    }
}
