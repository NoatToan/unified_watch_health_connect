package n12;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Pair;
import java.io.File;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Ln12/s;", "Lg/a;", "Ljava/io/File;", "Landroid/net/Uri;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends g.a<File, Uri> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.editimage.a f122303a;

    public s(com.garmin.android.apps.connectmobile.userprofile.editimage.a aVar) {
        this.f122303a = aVar;
    }

    @Override // g.a
    public final Intent a(Context context, File file) {
        File file2 = file;
        context.getClass();
        file2.getClass();
        com.garmin.android.apps.connectmobile.userprofile.editimage.a aVar = this.f122303a;
        Pair<Uri, Intent> pairA = yy.a.a(aVar.requireContext(), file2);
        aVar.w6().J0 = (Uri) pairA.first;
        Object obj = pairA.second;
        obj.getClass();
        return (Intent) obj;
    }

    @Override // g.a
    public final Uri c(int i14, Intent intent) {
        if (i14 != -1) {
            return null;
        }
        int i15 = com.garmin.android.apps.connectmobile.userprofile.editimage.a.f46642h;
        return this.f122303a.w6().J0;
    }
}
