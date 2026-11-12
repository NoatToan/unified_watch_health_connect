package u02;

import android.net.Uri;
import i63.c;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import k63.d;
import k63.k;
import l63.e;
import l63.f;
import m63.q1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu02/a;", "Li63/c;", "Landroid/net/Uri;", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c<Uri> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f167342a = k.a("android.net.Uri", d.i.f103232a);

    @Override // i63.b
    public final Object deserialize(e eVar) throws UnsupportedEncodingException {
        eVar.getClass();
        String strDecode = URLDecoder.decode(eVar.s(), d53.c.f57666b.toString());
        strDecode.getClass();
        return Uri.parse(strDecode);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF116202c() {
        return this.f167342a;
    }

    @Override // i63.i
    public final void serialize(f fVar, Object obj) throws UnsupportedEncodingException {
        Uri uri = (Uri) obj;
        uri.getClass();
        String strEncode = URLEncoder.encode(uri.toString(), d53.c.f57666b.toString());
        strEncode.getClass();
        fVar.p(strEncode);
    }
}
