package k10;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import v13.i;
import vb.h;
import ym0.u0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "Lcom/garmin/android/apps/connectmobile/group/service/model/a;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connections.groups.details.settings.GroupSettingsImageViewModel$uploadImage$1", f = "GroupSettingsImageViewModel.kt", l = {26, 30, 31, 32, 35}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<t0<g3<? extends List<? extends com.garmin.android.apps.connectmobile.group.service.model.a>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f102149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f102150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f102151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f102152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f102153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f102154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f102155g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, Uri uri, d dVar, String str, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f102152d = context;
        this.f102153e = uri;
        this.f102154f = dVar;
        this.f102155g = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f102152d, this.f102153e, this.f102154f, this.f102155g, dVar);
        cVar.f102151c = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends List<? extends com.garmin.android.apps.connectmobile.group.service.model.a>>> t0Var, t13.d<? super Unit> dVar) {
        return ((c) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ab A[Catch: all -> 0x0046, Exception -> 0x004a, TryCatch #3 {Exception -> 0x004a, blocks: (B:24:0x0040, B:43:0x00a5, B:45:0x00ab, B:49:0x00c9, B:51:0x00cd, B:56:0x00ed, B:57:0x00f2), top: B:76:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9 A[Catch: all -> 0x0046, Exception -> 0x004a, TryCatch #3 {Exception -> 0x004a, blocks: (B:24:0x0040, B:43:0x00a5, B:45:0x00ab, B:49:0x00c9, B:51:0x00cd, B:56:0x00ed, B:57:0x00f2), top: B:76:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd A[Catch: all -> 0x0046, Exception -> 0x004a, TRY_LEAVE, TryCatch #3 {Exception -> 0x004a, blocks: (B:24:0x0040, B:43:0x00a5, B:45:0x00ab, B:49:0x00c9, B:51:0x00cd, B:56:0x00ed, B:57:0x00f2), top: B:76:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed A[Catch: all -> 0x0046, Exception -> 0x004a, TRY_ENTER, TryCatch #3 {Exception -> 0x004a, blocks: (B:24:0x0040, B:43:0x00a5, B:45:0x00ab, B:49:0x00c9, B:51:0x00cd, B:56:0x00ed, B:57:0x00f2), top: B:76:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0114  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:73:0x011f  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e4, code lost:
    
        if (r2.emit(r0, r16) == r3) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Exception exc;
        InputStream inputStream;
        g3 g3VarA;
        InputStream inputStream2;
        InputStream inputStreamOpenInputStream;
        Object objJ;
        v2 v2Var;
        InputStream inputStream3;
        g3 g3VarA2;
        t0 t0Var = (t0) this.f102151c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f102150b;
        InputStream inputStream4 = 0;
        try {
            try {
                try {
                    try {
                        if (i14 == 0) {
                            r.b(obj);
                            g3 g3VarC = g3.a.c(g3.f35298f);
                            this.f102151c = t0Var;
                            this.f102150b = 1;
                            if (t0Var.emit(g3VarC, this) == aVar) {
                            }
                            return aVar;
                        }
                        if (i14 != 1) {
                            if (i14 != 2) {
                                if (i14 != 3 && i14 != 4) {
                                    if (i14 != 5) {
                                        h.z("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    inputStream2 = this.f102149a;
                                    r.b(obj);
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    return Unit.INSTANCE;
                                }
                                inputStream3 = this.f102149a;
                                try {
                                    r.b(obj);
                                    if (inputStream3 != null) {
                                        inputStream3.close();
                                    }
                                } catch (Exception e4) {
                                    exc = e4;
                                    inputStream = inputStream3;
                                    g3VarA = g3.a.a(g3.f35298f, null, exc, null, null, 13);
                                    this.f102151c = null;
                                    this.f102149a = inputStream;
                                    this.f102150b = 5;
                                    if (t0Var.emit(g3VarA, this) != aVar) {
                                        inputStream2 = inputStream;
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                    }
                                    return aVar;
                                } catch (Throwable th3) {
                                    th = th3;
                                    inputStream4 = inputStream3;
                                    if (inputStream4 != 0) {
                                        inputStream4.close();
                                    }
                                    throw th;
                                }
                                return Unit.INSTANCE;
                            }
                            inputStream = this.f102149a;
                            try {
                                r.b(obj);
                                objJ = obj;
                                v2Var = (v2) objJ;
                                if (v2Var instanceof v2.a) {
                                    g3VarA2 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                                    this.f102151c = t0Var;
                                    this.f102149a = inputStream;
                                    this.f102150b = 3;
                                    if (t0Var.emit(g3VarA2, this) == aVar) {
                                        return aVar;
                                    }
                                    inputStream3 = inputStream;
                                } else {
                                    if (v2Var instanceof v2.b) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    g3.a aVar2 = g3.f35298f;
                                    T t7 = ((v2.b) v2Var).f47386a;
                                    aVar2.getClass();
                                    g3 g3VarD = g3.a.d(t7);
                                    this.f102151c = t0Var;
                                    this.f102149a = inputStream;
                                    this.f102150b = 4;
                                }
                                if (inputStream3 != null) {
                                    inputStream3.close();
                                }
                            } catch (Exception e14) {
                                exc = e14;
                                g3VarA = g3.a.a(g3.f35298f, null, exc, null, null, 13);
                                this.f102151c = null;
                                this.f102149a = inputStream;
                                this.f102150b = 5;
                                if (t0Var.emit(g3VarA, this) != aVar) {
                                    inputStream2 = inputStream;
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            return Unit.INSTANCE;
                            g3VarA = g3.a.a(g3.f35298f, null, exc, null, null, 13);
                            this.f102151c = null;
                            this.f102149a = inputStream;
                            this.f102150b = 5;
                            if (t0Var.emit(g3VarA, this) != aVar) {
                                inputStream2 = inputStream;
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                return Unit.INSTANCE;
                            }
                            return aVar;
                        }
                        r.b(obj);
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                        jm0.e eVar = jm0.e.f99565a;
                        bitmapDecodeStream.getClass();
                        eVar.getClass();
                        ArrayList arrayListA = jm0.e.a(bitmapDecodeStream);
                        ym0.a aVar3 = this.f102154f.f102156b;
                        String str = this.f102155g;
                        this.f102151c = t0Var;
                        this.f102149a = inputStreamOpenInputStream;
                        this.f102150b = 2;
                        aVar3.getClass();
                        objJ = f0.J(aVar3, new u0(aVar3, str, arrayListA, null), this);
                        if (objJ != aVar) {
                            inputStream = inputStreamOpenInputStream;
                            v2Var = (v2) objJ;
                            if (v2Var instanceof v2.a) {
                                g3VarA2 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                                this.f102151c = t0Var;
                                this.f102149a = inputStream;
                                this.f102150b = 3;
                                if (t0Var.emit(g3VarA2, this) == aVar) {
                                }
                                inputStream3 = inputStream;
                            } else {
                                if (v2Var instanceof v2.b) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g3.a aVar4 = g3.f35298f;
                                T t14 = ((v2.b) v2Var).f47386a;
                                aVar4.getClass();
                                g3 g3VarD2 = g3.a.d(t14);
                                this.f102151c = t0Var;
                                this.f102149a = inputStream;
                                this.f102150b = 4;
                            }
                            if (inputStream3 != null) {
                                inputStream3.close();
                            }
                            return Unit.INSTANCE;
                        }
                    } catch (Exception e15) {
                        exc = e15;
                        inputStream = inputStreamOpenInputStream;
                        g3VarA = g3.a.a(g3.f35298f, null, exc, null, null, 13);
                        this.f102151c = null;
                        this.f102149a = inputStream;
                        this.f102150b = 5;
                        if (t0Var.emit(g3VarA, this) != aVar) {
                            inputStream2 = inputStream;
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream4 = inputStreamOpenInputStream;
                        if (inputStream4 != 0) {
                            inputStream4.close();
                        }
                        throw th;
                    }
                    inputStreamOpenInputStream = this.f102152d.getContentResolver().openInputStream(this.f102153e);
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                inputStream4 = 2;
            }
        } catch (Exception e16) {
            exc = e16;
            inputStream = null;
        }
        return aVar;
    }
}
