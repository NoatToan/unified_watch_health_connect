package ex2;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.StringsHelper$downloadStringZip$2", f = "StringsHelper.kt", l = {347, 349}, m = "invokeSuspend", v = 1)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f66989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f66990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HttpURLConnection f66991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f66992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f66995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f66996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f66997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f66998j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, Context context, long j8, String str2, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f66995g = str;
        this.f66996h = context;
        this.f66997i = j8;
        this.f66998j = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f66995g, this.f66996h, this.f66997i, this.f66998j, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00db A[Catch: all -> 0x00df, LOOP:0: B:60:0x00d4->B:32:0x00db, LOOP_END, TryCatch #3 {all -> 0x00df, blocks: (B:30:0x00d4, B:32:0x00db, B:35:0x00e1), top: B:60:0x00d4, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e1 A[EDGE_INSN: B:62:0x00e1->B:35:0x00e1 BREAK  A[LOOP:0: B:60:0x00d4->B:32:0x00db], SYNTHETIC] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        HttpURLConnection httpURLConnection;
        Context context;
        String str;
        long j8;
        int i14;
        HttpURLConnection httpURLConnection2;
        File file;
        File parentFile;
        FileOutputStream fileOutputStream;
        byte[] bArr;
        String strD;
        GZIPInputStream gZIPInputStream;
        int i15;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f66994f;
        if (i16 == 0) {
            o13.r.b(obj);
            w.f67058a.getClass();
            w.e().getClass();
            URLConnection uRLConnectionOpenConnection = new URL(this.f66995g).openConnection();
            uRLConnectionOpenConnection.getClass();
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestProperty("Garmin-Client-Name", "health-sdk");
            try {
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    iw2.w wVar = iw2.w.f95547a;
                    context = this.f66996h;
                    this.f66989a = context;
                    str = this.f66998j;
                    this.f66990b = str;
                    this.f66991c = httpURLConnection;
                    j8 = this.f66997i;
                    this.f66992d = j8;
                    this.f66993e = 0;
                    this.f66994f = 1;
                    wVar.getClass();
                    x53.c cVar = s0.f129406a;
                    if (ge1.b.e0(x53.b.f189152a, new iw2.e(context, j8, null), this) != aVar) {
                        i14 = 0;
                    }
                    return aVar;
                }
                cx2.h hVarE = w.e();
                httpURLConnection.getResponseCode();
                hVarE.getClass();
                return Unit.INSTANCE;
            } catch (Exception e4) {
                w.f67058a.getClass();
                w.e().d(null, "downloadStringZip: connecting to download url failed " + e4);
                return Unit.INSTANCE;
            }
        }
        if (i16 == 1) {
            i14 = this.f66993e;
            j8 = this.f66992d;
            HttpURLConnection httpURLConnection3 = this.f66991c;
            str = this.f66990b;
            context = (Context) this.f66989a;
            o13.r.b(obj);
            httpURLConnection = httpURLConnection3;
        } else {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            httpURLConnection2 = (HttpURLConnection) this.f66989a;
            o13.r.b(obj);
        }
        file = (File) obj;
        if (file.exists()) {
            file.delete();
        }
        parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        file.createNewFile();
        fileOutputStream = new FileOutputStream(file);
        bArr = new byte[8192];
        w.f67058a.getClass();
        w.e().getClass();
        try {
            gZIPInputStream = new GZIPInputStream(httpURLConnection2.getInputStream());
            while (true) {
                try {
                    i15 = gZIPInputStream.read(bArr);
                    if (i15 != -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i15);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(gZIPInputStream, th3);
                        throw th4;
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            gZIPInputStream.close();
        } catch (Exception e14) {
            w.f67058a.getClass();
            cx2.h hVarE2 = w.e();
            if (e14 instanceof ZipException) {
                strD = com.airbnb.lottie.animation.keyframe.a.d(e14, "downloadStringZip: Not correct format ");
            } else {
                strD = com.airbnb.lottie.animation.keyframe.a.d(e14, "downloadStringZip: reading string file failed ");
            }
            hVarE2.d(null, strD);
            file.delete();
        }
        return Unit.INSTANCE;
        w wVar2 = w.f67058a;
        this.f66989a = httpURLConnection;
        this.f66990b = null;
        this.f66991c = null;
        this.f66993e = i14;
        this.f66994f = 2;
        wVar2.getClass();
        Object objD = w.d(context, j8, str, this);
        if (objD != aVar) {
            httpURLConnection2 = httpURLConnection;
            obj = objD;
            file = (File) obj;
            if (file.exists()) {
                file.delete();
            }
            parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            file.createNewFile();
            fileOutputStream = new FileOutputStream(file);
            bArr = new byte[8192];
            w.f67058a.getClass();
            w.e().getClass();
            gZIPInputStream = new GZIPInputStream(httpURLConnection2.getInputStream());
            while (true) {
                i15 = gZIPInputStream.read(bArr);
                if (i15 != -1) {
                    break;
                    break;
                }
                fileOutputStream.write(bArr, 0, i15);
                w.f67058a.getClass();
                cx2.h hVarE3 = w.e();
                if (e14 instanceof ZipException) {
                    strD = com.airbnb.lottie.animation.keyframe.a.d(e14, "downloadStringZip: Not correct format ");
                } else {
                    strD = com.airbnb.lottie.animation.keyframe.a.d(e14, "downloadStringZip: reading string file failed ");
                }
                hVarE3.d(null, strD);
                file.delete();
                return Unit.INSTANCE;
            }
            Unit unit2 = Unit.INSTANCE;
            gZIPInputStream.close();
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
