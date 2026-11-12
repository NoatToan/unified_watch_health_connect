package is;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.net.Uri;
import androidx.lifecycle.v;
import com.garmin.android.apps.connectmobile.g1;
import h2.j0;
import nr.w0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import qr.t;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.util.ShareUserEventUtilKt$handleShareUserEvent$1", f = "ShareUserEventUtil.kt", l = {40}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ bq0.l f94884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f94885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bitmap f94886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f94887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e23.l<Uri, Unit> f94888f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ t f94889g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ w0 f94890h;

        /* JADX INFO: renamed from: is.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1814a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e23.l<Uri, Unit> f94891a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f94892b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ t f94893c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ w0 f94894d;

            /* JADX WARN: Multi-variable type inference failed */
            public C1814a(e23.l<? super Uri, Unit> lVar, Context context, t tVar, w0 w0Var) {
                this.f94891a = lVar;
                this.f94892b = context;
                this.f94893c = tVar;
                this.f94894d = w0Var;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Uri uri = (Uri) obj;
                if (uri != null) {
                    this.f94891a.invoke(uri);
                } else {
                    g1.a(this.f94892b, null);
                    this.f94893c.M5(this.f94894d);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(bq0.l lVar, Context context, Bitmap bitmap, String str, e23.l<? super Uri, Unit> lVar2, t tVar, w0 w0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f94884b = lVar;
            this.f94885c = context;
            this.f94886d = bitmap;
            this.f94887e = str;
            this.f94888f = lVar2;
            this.f94889g = tVar;
            this.f94890h = w0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f94884b, this.f94885c, this.f94886d, this.f94887e, this.f94888f, this.f94889g, this.f94890h, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f94883a;
            if (i14 == 0) {
                o13.r.b(obj);
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                bq0.l lVar = this.f94884b;
                lVar.getClass();
                Context context = this.f94885c;
                context.getClass();
                Bitmap bitmap = this.f94886d;
                bitmap.getClass();
                compressFormat.getClass();
                String str = this.f94887e;
                str.getClass();
                r53.i iVarA = v.a(androidx.lifecycle.m.a(lVar.f19514a, new bq0.p(context, str, lVar, compressFormat, bitmap, null), 2));
                C1814a c1814a = new C1814a(this.f94888f, context, this.f94889g, this.f94890h);
                this.f94883a = 1;
                if (iVarA.collect(c1814a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(b0 b0Var, i53.f<s> fVar, j0 j0Var, bq0.l lVar, Context context, w0 w0Var, String str, t tVar, e23.l<? super Uri, Unit> lVar2) {
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        b0Var.getClass();
        fVar.getClass();
        j0Var.getClass();
        lVar.getClass();
        context.getClass();
        str.getClass();
        tVar.getClass();
        s sVar = (s) h0.e0(j0Var.l(), fVar);
        Picture picture = sVar != null ? sVar.f94898a : null;
        if (picture != null) {
            if (picture.getWidth() <= 0 || picture.getHeight() <= 0) {
                bitmapCreateBitmap = null;
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(picture.getWidth(), picture.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawColor(0);
                canvas.drawPicture(picture);
            }
            bitmap = bitmapCreateBitmap;
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            ge1.b.T(b0Var, null, null, new a(lVar, context, bitmap, str, lVar2, tVar, w0Var, null), 3);
        } else {
            tVar.M5(w0Var);
        }
    }
}
