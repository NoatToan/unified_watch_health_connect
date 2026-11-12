package su0;

import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.FileNotFoundException;
import java.io.IOException;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsu0/v;", "Lsu0/u;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f161010a;

    static {
        new a(null);
    }

    public v(Context context) {
        context.getClass();
        this.f161010a = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r9 == r1) goto L23;
     */
    @Override // su0.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, v13.c cVar) throws Throwable {
        y yVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i14 = yVar.f161018c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yVar.f161018c = i14 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object objE0 = yVar.f161016a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = yVar.f161018c;
        Context context = this.f161010a;
        if (i15 == 0) {
            o13.r.b(objE0);
            yVar.f161018c = 1;
            x53.c cVar2 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new x(context, str, null), yVar);
            if (objE0 != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objE0);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        Uri uri = (Uri) objE0;
        if (uri != null) {
            try {
                return ClipData.newUri(context.getContentResolver(), null, uri);
            } catch (FileNotFoundException e4) {
                a2 a2Var = a2.LIVETRACK;
                String strN = fb1.c.n("[createClipData] failed to create due to error: ", e4.getMessage());
                i2.f36769a.getClass();
                i2.a.a(a2Var, strN);
            } catch (IOException e14) {
                a2 a2Var2 = a2.LIVETRACK;
                String strN2 = fb1.c.n("[createClipData] failed to create due to error: ", e14.getMessage());
                i2.f36769a.getClass();
                i2.a.a(a2Var2, strN2);
            }
        }
        return null;
        Bitmap bitmap = (Bitmap) objE0;
        if (bitmap != null) {
            yVar.f161018c = 2;
            x53.c cVar3 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new w(context, bitmap, null), yVar);
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsu0/v$a;", "", "<init>", "()V", "", "CACHED_USER_IMAGE_QUALITY", "I", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
