package sa2;

import android.content.ContextWrapper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.exportablereports.presenter.ReportsDownloadPresenter$downloadReportFile$1", f = "ReportsDownloadPresenter.kt", l = {433}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f158359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f158360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0<String> f158361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InputStream f158362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l<String, Unit> f158363e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.exportablereports.presenter.ReportsDownloadPresenter$downloadReportFile$1$1", f = "ReportsDownloadPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f158364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<String> f158365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InputStream f158366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<String, Unit> f158367d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h hVar, r0<String> r0Var, InputStream inputStream, e23.l<? super String, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f158364a = hVar;
            this.f158365b = r0Var;
            this.f158366c = inputStream;
            this.f158367d = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f158364a, this.f158365b, this.f158366c, this.f158367d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0059  */
        /* JADX WARN: Undo finally extract visitor
        java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
        	at jadx.core.utils.Pair.hashCode(Pair.java:35)
        	at java.base/java.util.HashMap.hash(HashMap.java:338)
        	at java.base/java.util.HashMap.getNode(HashMap.java:602)
        	at java.base/java.util.HashMap.containsKey(HashMap.java:628)
        	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
        	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
        	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
        	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
        	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
        	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
        	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
        	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
        	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
        	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
         */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws IOException {
            e23.l<String, Unit> lVar = this.f158367d;
            InputStream inputStream = this.f158366c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            r0<String> r0Var = this.f158365b;
            String str = r0Var.f105810a;
            wa2.b bVar = h.f158334i;
            h hVar = this.f158364a;
            hVar.getClass();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new ContextWrapper(hVar.f158335a).getDir("Garmin_Reports", 0), str));
            try {
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i14 = inputStream.read(bArr);
                        if (i14 == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i14);
                    }
                    fileOutputStream.close();
                    inputStream.close();
                    hVar.e();
                    if (r0Var.f105810a.length() > 0) {
                        lVar.invoke(r0Var.f105810a);
                    } else {
                        lVar.invoke(null);
                    }
                } catch (Exception unused) {
                    r0Var.f105810a = "";
                    h.f158334i.a("Exception saving the reports file to local storage");
                    fileOutputStream.close();
                    inputStream.close();
                    hVar.e();
                    if (r0Var.f105810a.length() <= 0) {
                        lVar.invoke(null);
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                fileOutputStream.close();
                inputStream.close();
                hVar.e();
                if (r0Var.f105810a.length() > 0) {
                    lVar.invoke(r0Var.f105810a);
                } else {
                    lVar.invoke(null);
                }
                throw th3;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(h hVar, r0<String> r0Var, InputStream inputStream, e23.l<? super String, Unit> lVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f158360b = hVar;
        this.f158361c = r0Var;
        this.f158362d = inputStream;
        this.f158363e = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f158360b, this.f158361c, this.f158362d, this.f158363e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f158359a;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f158360b, this.f158361c, this.f158362d, this.f158363e, null);
            this.f158359a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
