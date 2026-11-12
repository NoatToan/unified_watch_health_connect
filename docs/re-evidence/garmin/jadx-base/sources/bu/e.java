package bu;

import a03.n0;
import android.content.Context;
import b21.s4;
import bt1.s;
import c53.c0;
import c53.q;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipInputStream;
import o13.r;
import o53.b0;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.remote_resource.AnnualReportRemoteResourceManager$prepareResource$2", f = "AnnualReportRemoteResourceManager.kt", l = {90}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f21178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f21179e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, Context context, h hVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f21177c = str;
        this.f21178d = context;
        this.f21179e = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f21177c, this.f21178d, this.f21179e, dVar);
        eVar.f21176b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        InputStream inputStreamByteStream;
        Context context = this.f21178d;
        b0 b0Var = (b0) this.f21176b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f21175a;
        String str = this.f21177c;
        try {
            if (i14 == 0) {
                r.b(obj);
                f fVar = f.f21180a;
                this.f21176b = b0Var;
                this.f21175a = 1;
                obj = f.a(fVar, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            ResponseBody responseBody = (ResponseBody) obj;
            if (responseBody != null && (inputStreamByteStream = responseBody.byteStream()) != null) {
                h hVar = this.f21179e;
                try {
                    ZipInputStream zipInputStream = new ZipInputStream(inputStreamByteStream);
                    try {
                        List listS = c0.s(c0.o(c0.i(c0.i(q.d(new s4(zipInputStream, 22)), new s(2)), new s(3)), new n0(hVar, context, b0Var, zipInputStream, 8)));
                        zipInputStream.close();
                        inputStreamByteStream.close();
                        if (listS != null) {
                            f.b(f.f21180a, context, str, listS);
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jg.b.l(zipInputStream, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        jg.b.l(inputStreamByteStream, th5);
                        throw th6;
                    }
                }
            }
            throw new Exception("Response body from " + str + " is null.");
        } catch (Exception e4) {
            String str2 = "Error while downloading and unzipping file: " + e4 + ". Resource url = " + str;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "AnnualReportRemoteResourceManager", str2);
        }
    }
}
