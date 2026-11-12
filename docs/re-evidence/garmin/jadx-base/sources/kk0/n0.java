package kk0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import o53.s0;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ljk0/i;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.data.repository.WebDataRepositoryImpl$saveAndParseResult$2", f = "WebDataRepositoryImpl.kt", l = {82}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends jk0.i>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f105080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f105081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f105082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v2.b<ResponseBody> f105083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ File f105084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vk0.c f105085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o0 f105086g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n0(v2.b<? extends ResponseBody> bVar, File file, vk0.c cVar, o0 o0Var, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f105083d = bVar;
        this.f105084e = file;
        this.f105085f = cVar;
        this.f105086g = o0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n0 n0Var = new n0(this.f105083d, this.f105084e, this.f105085f, this.f105086g, dVar);
        n0Var.f105082c = obj;
        return n0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends jk0.i>>> dVar) {
        return ((n0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v4, types: [kotlin.jvm.internal.r0] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [kotlin.jvm.internal.r0] */
    /* JADX WARN: Type inference failed for: r1v15, types: [kotlin.jvm.internal.r0] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.r0] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.io.InputStream] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r14;
        Exception exc;
        ?? r15;
        InputStream inputStream;
        File file = this.f105084e;
        o53.b0 b0Var = (o53.b0) this.f105082c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105081b;
        v2.b<ResponseBody> bVar = this.f105083d;
        try {
            if (i14 == 0) {
                r0 r0VarS = wr.g.s(obj);
                try {
                    r0VarS.f105810a = bVar.f47386a.byteStream();
                    if (file.exists()) {
                        file.delete();
                    } else {
                        file.mkdirs();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i15 = ((InputStream) r0VarS.f105810a).read(bArr);
                            if (i15 == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i15);
                        }
                        fileOutputStream.flush();
                        Unit unit = Unit.INSTANCE;
                        fileOutputStream.close();
                        this.f105085f.a(new Long(b63.a.C0229a.f16171a.a().c()));
                        o0 o0Var = this.f105086g;
                        this.f105082c = b0Var;
                        this.f105080a = r0VarS;
                        this.f105081b = 1;
                        int i16 = o0.f105090c;
                        o0Var.getClass();
                        x53.c cVar = s0.f129406a;
                        Object objE0 = ge1.b.e0(x53.b.f189152a, new m0(file, null), this);
                        if (objE0 == aVar) {
                            return aVar;
                        }
                        r14 = r0VarS;
                        obj = objE0;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jg.b.l(fileOutputStream, th3);
                            throw th4;
                        }
                    }
                } catch (Exception e4) {
                    exc = e4;
                    r15 = r0VarS;
                    i2.f36769a.getClass();
                    i2.a.o(a2.GEAR, "Failed to parse received cached brand/model list: " + exc);
                    v2.a aVar2 = new v2.a(exc, null, null, 6, null);
                    inputStream = (InputStream) r15.f105810a;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r14 = this.f105080a;
                try {
                    o13.r.b(obj);
                    r14 = r14;
                } catch (Exception e14) {
                    exc = e14;
                    r15 = r14;
                    i2.f36769a.getClass();
                    i2.a.o(a2.GEAR, "Failed to parse received cached brand/model list: " + exc);
                    v2.a aVar3 = new v2.a(exc, null, null, 6, null);
                    inputStream = (InputStream) r15.f105810a;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return aVar3;
                } catch (Throwable th5) {
                    th = th5;
                    Throwable th6 = th;
                    InputStream inputStream2 = (InputStream) r14.f105810a;
                    if (inputStream2 == null) {
                        throw th6;
                    }
                    inputStream2.close();
                    throw th6;
                }
            }
            Object obj2 = (List) obj;
            if (obj2 == null) {
                obj2 = p13.j0.f134944a;
            }
            v2.b bVar2 = new v2.b(obj2, bVar.f47387b, null, null, 12, null);
            InputStream inputStream3 = (InputStream) r14.f105810a;
            if (inputStream3 != null) {
                inputStream3.close();
            }
            return bVar2;
        } catch (Throwable th7) {
            th = th7;
            r14 = obj;
        }
    }
}
