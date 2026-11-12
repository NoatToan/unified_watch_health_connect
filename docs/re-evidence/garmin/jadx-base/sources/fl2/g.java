package fl2;

import android.content.Context;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.device.filetransfer.core.util.UrlSourceException;
import com.garmin.sync.gc.exception.ServerException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import j23.l;
import java.io.File;
import o13.r;
import ok2.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import wk2.o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfl2/g;", "Lwk2/o;", "Lrs2/c;", "deviceInfo", "Lgy2/c;", "deviceMessageDto", "Lwk2/f;", TtmlNode.TAG_METADATA, "<init>", "(Lrs2/c;Lgy2/c;Lwk2/f;)V", "file-transfer-gc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gy2.c f72068j;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.device.filetransfer.gc.download.FitFileDownloadSource", f = "FitFileDownloadSource.kt", l = {46}, m = "doDownload")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f72069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public File f72070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f72071c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f72073e;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f72071c = obj;
            this.f72073e |= Integer.MIN_VALUE;
            return g.this.h(null, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(rs2.c cVar, gy2.c cVar2, wk2.f fVar) {
        cVar.getClass();
        cVar2.getClass();
        fVar.getClass();
        String strF = cVar2.f();
        if (strF == null) {
            vb.h.s("MessageUrl must be non-null");
            throw null;
        }
        super(cVar, fVar, strF);
        this.f72068j = cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002d, B:24:0x006e, B:26:0x0072, B:28:0x0080, B:30:0x008b, B:32:0x0095, B:33:0x00af, B:34:0x00b0, B:35:0x00bd, B:36:0x00be, B:39:0x00cb, B:41:0x00d8, B:43:0x00de, B:45:0x00e2, B:48:0x00ec, B:51:0x00f8, B:52:0x0112, B:53:0x0113, B:57:0x0121, B:58:0x013b, B:59:0x013c, B:60:0x0158, B:61:0x0159, B:62:0x0175, B:63:0x0176, B:64:0x0183), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0080 A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002d, B:24:0x006e, B:26:0x0072, B:28:0x0080, B:30:0x008b, B:32:0x0095, B:33:0x00af, B:34:0x00b0, B:35:0x00bd, B:36:0x00be, B:39:0x00cb, B:41:0x00d8, B:43:0x00de, B:45:0x00e2, B:48:0x00ec, B:51:0x00f8, B:52:0x0112, B:53:0x0113, B:57:0x0121, B:58:0x013b, B:59:0x013c, B:60:0x0158, B:61:0x0159, B:62:0x0175, B:63:0x0176, B:64:0x0183), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00be A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002d, B:24:0x006e, B:26:0x0072, B:28:0x0080, B:30:0x008b, B:32:0x0095, B:33:0x00af, B:34:0x00b0, B:35:0x00bd, B:36:0x00be, B:39:0x00cb, B:41:0x00d8, B:43:0x00de, B:45:0x00e2, B:48:0x00ec, B:51:0x00f8, B:52:0x0112, B:53:0x0113, B:57:0x0121, B:58:0x013b, B:59:0x013c, B:60:0x0158, B:61:0x0159, B:62:0x0175, B:63:0x0176, B:64:0x0183), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb A[Catch: Exception -> 0x0031, TRY_ENTER, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002d, B:24:0x006e, B:26:0x0072, B:28:0x0080, B:30:0x008b, B:32:0x0095, B:33:0x00af, B:34:0x00b0, B:35:0x00bd, B:36:0x00be, B:39:0x00cb, B:41:0x00d8, B:43:0x00de, B:45:0x00e2, B:48:0x00ec, B:51:0x00f8, B:52:0x0112, B:53:0x0113, B:57:0x0121, B:58:0x013b, B:59:0x013c, B:60:0x0158, B:61:0x0159, B:62:0x0175, B:63:0x0176, B:64:0x0183), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002d, B:24:0x006e, B:26:0x0072, B:28:0x0080, B:30:0x008b, B:32:0x0095, B:33:0x00af, B:34:0x00b0, B:35:0x00bd, B:36:0x00be, B:39:0x00cb, B:41:0x00d8, B:43:0x00de, B:45:0x00e2, B:48:0x00ec, B:51:0x00f8, B:52:0x0112, B:53:0x0113, B:57:0x0121, B:58:0x013b, B:59:0x013c, B:60:0x0158, B:61:0x0159, B:62:0x0175, B:63:0x0176, B:64:0x0183), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00de A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002d, B:24:0x006e, B:26:0x0072, B:28:0x0080, B:30:0x008b, B:32:0x0095, B:33:0x00af, B:34:0x00b0, B:35:0x00bd, B:36:0x00be, B:39:0x00cb, B:41:0x00d8, B:43:0x00de, B:45:0x00e2, B:48:0x00ec, B:51:0x00f8, B:52:0x0112, B:53:0x0113, B:57:0x0121, B:58:0x013b, B:59:0x013c, B:60:0x0158, B:61:0x0159, B:62:0x0175, B:63:0x0176, B:64:0x0183), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec A[Catch: Exception -> 0x0031, TRY_ENTER, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002d, B:24:0x006e, B:26:0x0072, B:28:0x0080, B:30:0x008b, B:32:0x0095, B:33:0x00af, B:34:0x00b0, B:35:0x00bd, B:36:0x00be, B:39:0x00cb, B:41:0x00d8, B:43:0x00de, B:45:0x00e2, B:48:0x00ec, B:51:0x00f8, B:52:0x0112, B:53:0x0113, B:57:0x0121, B:58:0x013b, B:59:0x013c, B:60:0x0158, B:61:0x0159, B:62:0x0175, B:63:0x0176, B:64:0x0183), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8 A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002d, B:24:0x006e, B:26:0x0072, B:28:0x0080, B:30:0x008b, B:32:0x0095, B:33:0x00af, B:34:0x00b0, B:35:0x00bd, B:36:0x00be, B:39:0x00cb, B:41:0x00d8, B:43:0x00de, B:45:0x00e2, B:48:0x00ec, B:51:0x00f8, B:52:0x0112, B:53:0x0113, B:57:0x0121, B:58:0x013b, B:59:0x013c, B:60:0x0158, B:61:0x0159, B:62:0x0175, B:63:0x0176, B:64:0x0183), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0121 A[Catch: Exception -> 0x0031, TRY_ENTER, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002d, B:24:0x006e, B:26:0x0072, B:28:0x0080, B:30:0x008b, B:32:0x0095, B:33:0x00af, B:34:0x00b0, B:35:0x00bd, B:36:0x00be, B:39:0x00cb, B:41:0x00d8, B:43:0x00de, B:45:0x00e2, B:48:0x00ec, B:51:0x00f8, B:52:0x0112, B:53:0x0113, B:57:0x0121, B:58:0x013b, B:59:0x013c, B:60:0x0158, B:61:0x0159, B:62:0x0175, B:63:0x0176, B:64:0x0183), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:59:0x013c A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002d, B:24:0x006e, B:26:0x0072, B:28:0x0080, B:30:0x008b, B:32:0x0095, B:33:0x00af, B:34:0x00b0, B:35:0x00bd, B:36:0x00be, B:39:0x00cb, B:41:0x00d8, B:43:0x00de, B:45:0x00e2, B:48:0x00ec, B:51:0x00f8, B:52:0x0112, B:53:0x0113, B:57:0x0121, B:58:0x013b, B:59:0x013c, B:60:0x0158, B:61:0x0159, B:62:0x0175, B:63:0x0176, B:64:0x0183), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0159 A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002d, B:24:0x006e, B:26:0x0072, B:28:0x0080, B:30:0x008b, B:32:0x0095, B:33:0x00af, B:34:0x00b0, B:35:0x00bd, B:36:0x00be, B:39:0x00cb, B:41:0x00d8, B:43:0x00de, B:45:0x00e2, B:48:0x00ec, B:51:0x00f8, B:52:0x0112, B:53:0x0113, B:57:0x0121, B:58:0x013b, B:59:0x013c, B:60:0x0158, B:61:0x0159, B:62:0x0175, B:63:0x0176, B:64:0x0183), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0176 A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002d, B:24:0x006e, B:26:0x0072, B:28:0x0080, B:30:0x008b, B:32:0x0095, B:33:0x00af, B:34:0x00b0, B:35:0x00bd, B:36:0x00be, B:39:0x00cb, B:41:0x00d8, B:43:0x00de, B:45:0x00e2, B:48:0x00ec, B:51:0x00f8, B:52:0x0112, B:53:0x0113, B:57:0x0121, B:58:0x013b, B:59:0x013c, B:60:0x0158, B:61:0x0159, B:62:0x0175, B:63:0x0176, B:64:0x0183), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00f8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0121, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x013c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0159, please report this as an issue */
    @Override // wk2.o
    public final Object h(File file, t13.d<? super Unit> dVar) throws CoreTransferException {
        a aVar;
        Exception exc;
        g gVar;
        File file2;
        gy2.e eVar;
        String str;
        Integer num;
        String str2;
        gy2.h hVar;
        String str3;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f72073e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f72073e = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object objA = aVar2.f72071c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar2.f72073e;
        if (i15 != 0) {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file2 = aVar2.f72070b;
            gVar = aVar2.f72069a;
            try {
                r.b(objA);
                eVar = (gy2.e) objA;
                if (eVar != null) {
                    throw new UrlSourceException(null, "downloadDeviceMessage returned null response", null, gVar.f185873f, 4, null);
                }
                str = eVar.f80305a;
                num = eVar.f80308d;
                str2 = eVar.f80306b;
                if (eVar.f80307c == 0) {
                    l lVar = new l(200, 299);
                    if (num != null || !lVar.d(num.intValue())) {
                        throw new UrlSourceException(null, "Failed GC doDownload with empty response size", null, gVar.f185873f, 4, null);
                    }
                    throw new ServerException(gy2.i.CONTENT_DOES_NOT_EXIST, "Successful (" + num + ") but empty response", gVar.f185873f, num);
                }
                if (new File(str, str2).exists()) {
                    throw new UrlSourceException(null, "GC File " + str2 + " does not exist", null, gVar.f185873f, 4, null);
                }
                if (new File(str, str2).length() != 0) {
                    throw new UrlSourceException(null, "GC File " + str2 + " does not contain data", null, gVar.f185873f, 4, null);
                }
                hVar = gVar.f72068j.f80294e;
                if (hVar != null) {
                    str3 = hVar.f80339m;
                } else {
                    str3 = null;
                }
                if (s.g(str3, "FIT")) {
                    iy2.a.f95840a.getClass();
                    if (iy2.a.a(str, str2)) {
                        throw new UrlSourceException(null, "FIT File " + str2 + " could not be validated", null, gVar.f185873f, 4, null);
                    }
                }
                iy2.a.f95840a.getClass();
                if (iy2.a.b(file2)) {
                    return Unit.INSTANCE;
                }
                throw new UrlSourceException(null, "GC File " + str2 + " could not be validated", null, gVar.f185873f, 4, null);
            } catch (Exception e4) {
                exc = e4;
                throw gVar.g(exc);
            }
        }
        r.b(objA);
        dl2.b bVar = (dl2.b) a0.f132585h.a().getConfiguration();
        try {
            iy2.d dVar2 = new iy2.d("GCFT#", bVar.f60322o);
            gy2.c cVar = this.f72068j;
            Context context = bVar.f132622b;
            context.getClass();
            aVar2.f72069a = this;
            aVar2.f72070b = file;
            aVar2.f72073e = 1;
            objA = dVar2.a(cVar, file, context, "5.8.0", aVar2);
            if (objA == aVar3) {
                return aVar3;
            }
            gVar = this;
            file2 = file;
            eVar = (gy2.e) objA;
            if (eVar != null) {
                throw new UrlSourceException(null, "downloadDeviceMessage returned null response", null, gVar.f185873f, 4, null);
            }
            str = eVar.f80305a;
            num = eVar.f80308d;
            str2 = eVar.f80306b;
            if (eVar.f80307c == 0) {
                l lVar2 = new l(200, 299);
                if (num != null) {
                }
                throw new UrlSourceException(null, "Failed GC doDownload with empty response size", null, gVar.f185873f, 4, null);
            }
            if (new File(str, str2).exists()) {
                throw new UrlSourceException(null, "GC File " + str2 + " does not exist", null, gVar.f185873f, 4, null);
            }
            if (new File(str, str2).length() != 0) {
                throw new UrlSourceException(null, "GC File " + str2 + " does not contain data", null, gVar.f185873f, 4, null);
            }
            hVar = gVar.f72068j.f80294e;
            if (hVar != null) {
                str3 = hVar.f80339m;
            } else {
                str3 = null;
            }
            if (s.g(str3, "FIT")) {
                iy2.a.f95840a.getClass();
                if (iy2.a.a(str, str2)) {
                    throw new UrlSourceException(null, "FIT File " + str2 + " could not be validated", null, gVar.f185873f, 4, null);
                }
            }
            iy2.a.f95840a.getClass();
            if (iy2.a.b(file2)) {
                return Unit.INSTANCE;
            }
            throw new UrlSourceException(null, "GC File " + str2 + " could not be validated", null, gVar.f185873f, 4, null);
        } catch (Exception e14) {
            exc = e14;
            gVar = this;
            throw gVar.g(exc);
        }
    }
}
