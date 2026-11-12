package bq0;

import android.content.Context;
import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Ljava/io/File;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.imagemultipicker.StorageImageViewModel$saveImageToFile$1", f = "StorageImageViewModel.kt", l = {118, 120, 125, 128}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<t0<File>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FileOutputStream f19541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f19544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f19545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f19546f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(File file, Context context, String str, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f19544d = file;
        this.f19545e = context;
        this.f19546f = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f19544d, this.f19545e, this.f19546f, dVar);
        qVar.f19543c = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(t0<File> t0Var, t13.d<? super Unit> dVar) {
        return ((q) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r1.emit(null, r14) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
    
        if (r1.emit(null, r14) == r2) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (r1.emit(null, r14) == r2) goto L47;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FileOutputStream fileOutputStream;
        Throwable th3;
        File file = this.f19544d;
        t0 t0Var = (t0) this.f19543c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f19542b;
        if (i14 != 0) {
            if (i14 == 1 || i14 == 2) {
                fileOutputStream = this.f19541a;
                try {
                    r.b(obj);
                } catch (Throwable th4) {
                    th3 = th4;
                    try {
                        throw th3;
                    } catch (Throwable th5) {
                        jg.b.l(fileOutputStream, th3);
                        throw th5;
                    }
                }
            } else {
                if (i14 == 3) {
                } else {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            Context context = this.f19545e;
            String str = this.f19546f;
            try {
                zp0.c.f206560v.getClass();
                zp0.c cVarA = zp0.c.a.a(context);
                cVarA.f206565e = str;
                byte[] bArrE = cVarA.e();
                if (bArrE != null) {
                    fileOutputStream2.write(bArrE);
                    this.f19543c = t0Var;
                    this.f19541a = fileOutputStream2;
                    this.f19542b = 1;
                    if (t0Var.emit(file, this) == aVar) {
                        return aVar;
                    }
                    fileOutputStream = fileOutputStream2;
                } else {
                    this.f19543c = t0Var;
                    this.f19541a = fileOutputStream2;
                    this.f19542b = 2;
                }
            } catch (Throwable th6) {
                fileOutputStream = fileOutputStream2;
                th3 = th6;
                throw th3;
            }
        } catch (IOException e4) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "StorageImageViewModel", "Loading image bytes failed " + e4);
            this.f19543c = null;
            this.f19541a = null;
            this.f19542b = 3;
        } catch (IllegalStateException e14) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "StorageImageViewModel", "Loading image bytes failed " + e14);
            this.f19543c = null;
            this.f19541a = null;
            this.f19542b = 4;
        }
        return Unit.INSTANCE;
        Unit unit = Unit.INSTANCE;
        jg.b.l(fileOutputStream, null);
        return Unit.INSTANCE;
    }
}
