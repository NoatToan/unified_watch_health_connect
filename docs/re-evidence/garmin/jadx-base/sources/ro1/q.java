package ro1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.social.share.f f153999b;

    public /* synthetic */ q(com.garmin.android.apps.connectmobile.social.share.f fVar, int i14) {
        this.f153998a = i14;
        this.f153999b = fVar;
    }

    @Override // f.b
    public final void a(Object obj) {
        Context context;
        ContentResolver contentResolver;
        int i14 = this.f153998a;
        com.garmin.android.apps.connectmobile.social.share.f fVar = this.f153999b;
        switch (i14) {
            case 0:
                Uri uri = (Uri) obj;
                com.garmin.android.apps.connectmobile.social.share.f.a aVar = com.garmin.android.apps.connectmobile.social.share.f.f44683j;
                if (uri == null) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "ImagePickerFragment", "No media selected");
                } else {
                    if (Build.VERSION.SDK_INT > 29 && (context = fVar.getContext()) != null && (contentResolver = context.getContentResolver()) != null) {
                        contentResolver.takePersistableUriPermission(uri, 1);
                    }
                    r rVar = fVar.f44690g;
                    if (rVar != null) {
                        rVar.O7(uri);
                    }
                }
                break;
            default:
                Map map = (Map) obj;
                com.garmin.android.apps.connectmobile.social.share.f.a aVar3 = com.garmin.android.apps.connectmobile.social.share.f.f44683j;
                map.getClass();
                if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                    fVar.u6();
                }
                break;
        }
    }
}
