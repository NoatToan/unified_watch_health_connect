package mz2;

import c83.a0;
import c83.f;
import o53.r;
import p005kotlin.KotlinNullPointerException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lmz2/b;", "Lc83/f;", "retrofit2-kotlin-coroutine-adapter"}, k = 1, mv = {1, 4, 0})
public final class b implements f<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f122003a;

    public b(r rVar) {
        this.f122003a = rVar;
    }

    @Override // c83.f
    public final void a(c83.d<Object> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        this.f122003a.O(th3);
    }

    @Override // c83.f
    public final void c(c83.d<Object> dVar, a0<Object> a0Var) {
        dVar.getClass();
        boolean zIsSuccessful = a0Var.f25745a.isSuccessful();
        r rVar = this.f122003a;
        if (!zIsSuccessful) {
            rVar.O(new HttpException(a0Var));
            return;
        }
        Object obj = a0Var.f25746b;
        if (obj != null) {
            rVar.p(obj);
        } else {
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
            s.j(kotlinNullPointerException, s.class.getName());
            throw kotlinNullPointerException;
        }
    }
}
