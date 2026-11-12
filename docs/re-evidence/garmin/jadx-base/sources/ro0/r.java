package ro0;

import android.content.Context;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.UUID;
import o53.b0;
import o53.s0;
import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.m1;
import r53.p2;
import ue.h0;
import ue.i0;
import wb2.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.help.ProductSupportCodeViewModel$sendLogs$1", f = "ProductSupportCodeViewModel.kt", l = {45, 51}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yt2.a f153872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f153873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f153874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f153875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f153876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f153877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f153878g;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lue/h0;", "workInfo", "", "<anonymous>", "(Lue/h0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.help.ProductSupportCodeViewModel$sendLogs$1$2", f = "ProductSupportCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<h0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f153879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f153880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f153881c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var, q qVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f153880b = b0Var;
            this.f153881c = qVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f153880b, this.f153881c, dVar);
            aVar.f153879a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
            return ((a) create(h0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            h0 h0Var = (h0) this.f153879a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            String str = "Product Support Analytics worker state = " + (h0Var != null ? h0Var.f170067b : null);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "ProductSupportCodeViewModel", str);
            h0.c cVar = h0Var != null ? h0Var.f170067b : null;
            h0.c cVar2 = h0.c.SUCCEEDED;
            q qVar = this.f153881c;
            if (cVar == cVar2) {
                p2 p2Var = qVar.f153870a;
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, p.a((p) value2, false, true, false, 4)));
            } else {
                if ((h0Var != null ? h0Var.f170067b : null) == h0.c.FAILED) {
                    p2 p2Var2 = qVar.f153870a;
                    do {
                        value = p2Var2.getValue();
                    } while (!p2Var2.b(value, p.a((p) value, false, false, true, 2)));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljava/io/File;", "<anonymous>", "(Lo53/b0;)Ljava/io/File;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.help.ProductSupportCodeViewModel$sendLogs$1$logsDir$1", f = "ProductSupportCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super File>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f153882a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f153882a = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f153882a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super File> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws IOException {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Context context = this.f153882a;
            File fileA = new pi1.g(pi1.b.a(context, "gcm_folder")).f137863a;
            if (fileA == null) {
                fileA = pi1.b.a(context, "gcm_folder");
            }
            try {
                FileUtils.deleteQuietly(fileA);
                String str = "Successfully deleted any existing directory at " + fileA.getCanonicalPath();
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "LogDirBuilder", str);
            } catch (NoSuchMethodError unused) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "LogDirBuilder", "Caught exception deleting quietly");
            }
            fileA.mkdirs();
            pi1.a aVar4 = new pi1.a(fileA);
            try {
                String strC = new pi1.f(context).c();
                Charset charset = StandardCharsets.UTF_8;
                charset.getClass();
                byte[] bytes = strC.getBytes(charset);
                bytes.getClass();
                aVar4.a("diagnostics.html", bytes);
                pi1.b.f137854a.getClass();
                File fileB = pi1.b.b(context);
                if (fileB.exists()) {
                    pi1.a.c(aVar4, fileB, "logs");
                }
                File file = new File(context.getFilesDir(), "logs");
                if (file.exists()) {
                    pi1.g.a(aVar4, file, "logs");
                }
                File fileA2 = pi1.b.a(context, null);
                if (fileA2.exists()) {
                    pi1.g.a(aVar4, new File(fileA2, "gcm_logs"), "public-logs");
                }
                ArrayList<wb2.m> arrayListA = new l0(context).a();
                if (arrayListA != null && (!arrayListA.isEmpty())) {
                    StringBuilder sb3 = new StringBuilder(arrayListA.size() * 1000);
                    for (wb2.m mVar : arrayListA) {
                        sb3.append(new DateTime(mVar.f184064e).toString());
                        sb3.append("\n");
                        sb3.append(mVar.f184062c);
                        sb3.append("\n");
                        sb3.append(mVar.f184060a);
                        sb3.append("\n");
                        sb3.append(mVar.f184061b);
                        sb3.append("\n\n");
                    }
                    String string = sb3.toString();
                    Charset charset2 = StandardCharsets.UTF_8;
                    charset2.getClass();
                    byte[] bytes2 = string.getBytes(charset2);
                    bytes2.getClass();
                    aVar4.a("sync-audits.txt", bytes2);
                }
                Unit unit = Unit.INSTANCE;
                aVar4.close();
                return fileA;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(aVar4, th3);
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, q qVar, String str, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f153876e = context;
        this.f153877f = qVar;
        this.f153878g = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f153876e, this.f153877f, this.f153878g, dVar);
        rVar.f153875d = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
        if (r3 == r2) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objE0;
        yt2.a aVar;
        boolean z14;
        Object objE1;
        b0 b0Var = (b0) this.f153875d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f153874c;
        q qVar = this.f153877f;
        Context context = this.f153876e;
        if (i14 != 0) {
            if (i14 == 1) {
                z14 = this.f153873b;
                yt2.a aVar3 = this.f153872a;
                o13.r.b(obj);
                aVar = aVar3;
                objE0 = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objE1 = obj;
            }
            UUID uuid = (UUID) objE1;
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var, "ProductSupportCodeViewModel", "Product Support Analytics sent with requestId: " + uuid);
            i0.f170088a.getClass();
            cf.u uVarJ = i0.a.a(context).f177606d.j();
            uVarJ.getClass();
            uuid.getClass();
            r53.s.C(new m1(r53.s.s(r53.s.s(new cf.v(uVarJ.b(p13.w.c(String.valueOf(uuid)))))), new a(b0Var, qVar, null)), v1.a(qVar));
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        if (!az0.b.a()) {
            return Unit.INSTANCE;
        }
        yt2.f.f199669a.getClass();
        yt2.a aVar5 = yt2.f.f199670b;
        if (aVar5 == null) {
            return Unit.INSTANCE;
        }
        u.f153887a.getClass();
        boolean zA = u.a(context);
        if (!zA) {
            return Unit.INSTANCE;
        }
        p2 p2Var = qVar.f153870a;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, p.a((p) value, true, false, false, 2)));
        x53.b bVar = x53.b.f189152a;
        b bVar2 = new b(context, null);
        this.f153875d = b0Var;
        this.f153872a = aVar5;
        this.f153873b = zA;
        this.f153874c = 1;
        objE0 = ge1.b.e0(bVar, bVar2, this);
        if (objE0 != aVar2) {
            aVar = aVar5;
            z14 = zA;
        }
        return aVar2;
        File file = (File) objE0;
        String strN = fb1.c.n("Product Support Analytics dir created: ", file.getAbsolutePath());
        i2.a aVar6 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar6.getClass();
        i2.a.b(a2Var2, "ProductSupportCodeViewModel", strN);
        com.garmin.android.lib.garminmobileanalytics.b.a aVar7 = com.garmin.android.lib.garminmobileanalytics.b.f49927a;
        this.f153875d = b0Var;
        this.f153872a = null;
        this.f153873b = z14;
        this.f153874c = 2;
        jc2.d dVar = jc2.d.LAST_MODIFIED_NEWEST_TO_OLDEST;
        aVar7.getClass();
        x53.c cVar = s0.f129406a;
        objE1 = ge1.b.e0(x53.b.f189152a, new com.garmin.android.lib.garminmobileanalytics.a(aVar, this.f153878g, file, dVar, null), this);
    }
}
