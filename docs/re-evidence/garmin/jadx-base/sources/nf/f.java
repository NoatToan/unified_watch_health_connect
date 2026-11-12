package nf;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import hf.y;
import java.io.FileNotFoundException;
import java.util.List;
import lf.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import w63.b0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lnf/f;", "Lnf/j;", "Lhf/y;", "data", "Lwf/m;", "options", "<init>", "(Lhf/y;Lwf/m;)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f125747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf.m f125748b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnf/f$a;", "Lnf/j$a;", "Lhf/y;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements j.a<y> {
        @Override // nf.j.a
        public final j a(y yVar, wf.m mVar, hf.j jVar) {
            y yVar2 = yVar;
            if (s.g(yVar2.f83620c, FirebaseAnalytics.Param.CONTENT)) {
                return new f(yVar2, mVar);
            }
            return null;
        }
    }

    public f(y yVar, wf.m mVar) {
        this.f125747a = yVar;
        this.f125748b = mVar;
    }

    @Override // nf.j
    public final Object a(t13.d<? super i> dVar) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List listC;
        int size;
        y yVar = this.f125747a;
        Uri uri = Uri.parse(yVar.f83618a);
        wf.m mVar = this.f125748b;
        ContentResolver contentResolver = mVar.f184996a.getContentResolver();
        String str = yVar.f83621d;
        if (s.g(str, "com.android.contacts") && s.g(h0.n0(gg.b.C(yVar)), "display_photo")) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                n23.j.t("Unable to find a contact photo associated with '", uri, "'.");
                return null;
            }
        } else if (Build.VERSION.SDK_INT >= 29 && s.g(str, "media") && (size = (listC = gg.b.C(yVar)).size()) >= 3 && s.g(listC.get(size - 3), MimeTypes.BASE_TYPE_AUDIO) && s.g(listC.get(size - 2), "albums")) {
            xf.g gVar = mVar.f184997b;
            xf.a aVar = gVar.f190619a;
            Bundle bundle = null;
            xf.a.C3547a c3547a = aVar instanceof xf.a.C3547a ? (xf.a.C3547a) aVar : null;
            if (c3547a != null) {
                int i14 = c3547a.f190607a;
                xf.a aVar2 = gVar.f190620b;
                xf.a.C3547a c3547a2 = aVar2 instanceof xf.a.C3547a ? (xf.a.C3547a) aVar2 : null;
                if (c3547a2 != null) {
                    int i15 = c3547a2.f190607a;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i14, i15));
                }
            }
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                n23.j.t("Unable to find a music thumbnail associated with '", uri, "'.");
                return null;
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                n23.j.t("Unable to open '", uri, "'.");
                return null;
            }
        }
        return new o(new r(new b0(w5.r.y(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), mVar.f185001f, new lf.d(yVar, assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), lf.e.DISK);
    }
}
