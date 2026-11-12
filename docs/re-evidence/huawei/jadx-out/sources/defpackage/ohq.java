package defpackage;

import com.huawei.openplatform.abl.log.i;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class ohq extends com.huawei.openplatform.abl.log.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f44339b;
    private final Executor d = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new oht("FileLog"));

    @Override // com.huawei.openplatform.abl.log.i
    public void a(ohn ohnVar, int i, String str) {
        this.d.execute(new d(ohnVar, i, str));
        i iVar = this.f21530a;
        if (iVar != null) {
            iVar.a(ohnVar, i, str);
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44340a;
        final /* synthetic */ String e;

        @Override // java.lang.Runnable
        public void run() {
            ohq.this.f44339b.a(this.f44340a, this.e);
        }

        a(String str, String str2) {
            this.f44340a = str;
            this.e = str2;
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44342a;
        final /* synthetic */ ohn d;
        final /* synthetic */ String e;

        @Override // java.lang.Runnable
        public void run() {
            ohq.this.f44339b.a(this.d, this.f44342a, this.e);
        }

        d(ohn ohnVar, int i, String str) {
            this.d = ohnVar;
            this.f44342a = i;
            this.e = str;
        }
    }

    @Override // com.huawei.openplatform.abl.log.i
    public i a(String str, String str2) {
        this.d.execute(new a(str, str2));
        i iVar = this.f21530a;
        if (iVar != null) {
            iVar.a(str, str2);
        }
        return this;
    }

    public ohq(i iVar) {
        this.f44339b = iVar;
    }
}
