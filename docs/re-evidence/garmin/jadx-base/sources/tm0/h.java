package tm0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import java.util.Map;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f165370b;

    public /* synthetic */ h(i iVar, int i14) {
        this.f165369a = i14;
        this.f165370b = iVar;
    }

    @Override // f.b
    public final void a(Object obj) {
        Context context;
        ContentResolver contentResolver;
        int i14 = this.f165369a;
        i iVar = this.f165370b;
        switch (i14) {
            case 0:
                Map map = (Map) obj;
                i.a aVar = i.f165371j;
                map.getClass();
                if (!s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                    iVar.requireActivity().onBackPressed();
                    return;
                }
                f.c<f.j> cVar = iVar.f165376e;
                if (cVar != null) {
                    cVar.a(f.k.a(g.e.d.f74074a, 0, 14), null);
                    return;
                } else {
                    s.m("pickMedia");
                    throw null;
                }
            default:
                List<Uri> list = (List) obj;
                i.a aVar2 = i.f165371j;
                list.getClass();
                if (list.isEmpty()) {
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.f(a2Var, "CreatePostImagePickerDialogFragment", "No media selected");
                    return;
                }
                for (Uri uri : list) {
                    if (Build.VERSION.SDK_INT > 29 && (context = iVar.getContext()) != null && (contentResolver = context.getContentResolver()) != null) {
                        contentResolver.takePersistableUriPermission(uri, 1);
                    }
                    String string = uri.toString();
                    string.getClass();
                    bq0.k kVar = new bq0.k(uri, string, "jpg", 0.0d);
                    bq0.f fVar = iVar.f165374c;
                    if (fVar == null) {
                        s.m("adapter");
                        throw null;
                    }
                    fVar.r(kVar);
                }
                return;
        }
    }
}
