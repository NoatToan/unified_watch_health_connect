package ib0;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.net.Uri;
import lc.u0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.profile.picture.ProfileImageViewModel$saveProfileImage$1", f = "ProfileImageViewModel.kt", l = {99, 103}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f92482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jb0.c f92483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f92484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(jb0.c cVar, g gVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f92483b = cVar;
        this.f92484c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f92483b, this.f92484c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r8 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r8.a(r5, r7) == r0) goto L28;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f92482a;
        g gVar = this.f92484c;
        Bitmap bitmapDecodeBitmap = null;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        jb0.c cVar = this.f92483b;
        if (cVar instanceof jb0.c.C1878c) {
            v90.b bVar = gVar.f92467d;
            Uri uri = ((jb0.c.C1878c) cVar).f98110a;
            bVar.getClass();
            if (uri != null) {
                try {
                    ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(bVar.f176285a.getContentResolver(), uri);
                    sourceCreateSource.getClass();
                    bitmapDecodeBitmap = ImageDecoder.decodeBitmap(sourceCreateSource);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            if (bitmapDecodeBitmap != null) {
                v90.d dVar = gVar.f92464a;
                this.f92482a = 2;
            }
            return Unit.INSTANCE;
        }
        if (!(cVar instanceof jb0.c.a)) {
            u0.r();
            return null;
        }
        v90.b bVar2 = gVar.f92467d;
        String str = ((jb0.c.a) cVar).f98109a;
        this.f92482a = 1;
        bVar2.getClass();
        x53.c cVar2 = s0.f129406a;
        obj = ge1.b.e0(x53.b.f189152a, new v90.a(bVar2, str, null), this);
        return aVar;
        bitmapDecodeBitmap = (Bitmap) obj;
        if (bitmapDecodeBitmap != null) {
            v90.d dVar2 = gVar.f92464a;
            this.f92482a = 2;
        }
        return Unit.INSTANCE;
    }
}
