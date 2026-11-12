package defpackage;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ake implements dbi<o98> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f1126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3i f1127b;

    public class a extends ddo<o98> {
        public final /* synthetic */ ImageRequest f;
        public final /* synthetic */ hbi g;
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cg4 cg4Var, hbi hbiVar, String str, String str2, ImageRequest imageRequest, hbi hbiVar2, String str3) {
            super(cg4Var, hbiVar, str, str2);
            this.f = imageRequest;
            this.g = hbiVar2;
            this.h = str3;
        }

        @Override // defpackage.edo
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(o98 o98Var) {
            o98.c(o98Var);
        }

        @Override // defpackage.edo
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public o98 c() throws Exception {
            o98 o98VarD = ake.this.d(this.f);
            if (o98VarD == null) {
                this.g.i(this.h, ake.this.f(), false);
                return null;
            }
            o98VarD.P();
            this.g.i(this.h, ake.this.f(), true);
            return o98VarD;
        }
    }

    public class b extends ea2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ddo f1128a;

        public b(ddo ddoVar) {
            this.f1128a = ddoVar;
        }

        @Override // defpackage.fbi
        public void b() {
            this.f1128a.a();
        }
    }

    public ake(Executor executor, n3i n3iVar) {
        this.f1126a = executor;
        this.f1127b = n3iVar;
    }

    @Override // defpackage.dbi
    public void a(cg4<o98> cg4Var, ebi ebiVar) {
        hbi hbiVarF = ebiVar.f();
        String id = ebiVar.getId();
        a aVar = new a(cg4Var, hbiVarF, f(), id, ebiVar.b(), hbiVarF, id);
        ebiVar.c(new b(aVar));
        this.f1126a.execute(aVar);
    }

    public o98 c(InputStream inputStream, int i) throws IOException {
        w14 w14VarD = null;
        try {
            w14VarD = i <= 0 ? w14.D(this.f1127b.a(inputStream)) : w14.D(this.f1127b.e(inputStream, i));
            o98 o98Var = new o98((w14<PooledByteBuffer>) w14VarD);
            a24.b(inputStream);
            w14.l(w14VarD);
            return o98Var;
        } catch (Throwable th) {
            a24.b(inputStream);
            w14.l(w14VarD);
            throw th;
        }
    }

    public abstract o98 d(ImageRequest imageRequest) throws IOException;

    public o98 e(InputStream inputStream, int i) throws IOException {
        return c(inputStream, i);
    }

    public abstract String f();
}
