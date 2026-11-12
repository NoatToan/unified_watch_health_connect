package hz1;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.imagemultipicker.ImageMultiPickerActivity;
import java.util.Map;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageMultiPickerActivity f86516b;

    public /* synthetic */ a(ImageMultiPickerActivity imageMultiPickerActivity, int i14) {
        this.f86515a = i14;
        this.f86516b = imageMultiPickerActivity;
    }

    @Override // f.b
    public final void a(Object obj) {
        ContentResolver contentResolver;
        int i14 = this.f86515a;
        ImageMultiPickerActivity imageMultiPickerActivity = this.f86516b;
        switch (i14) {
            case 0:
                Uri uri = (Uri) obj;
                ImageMultiPickerActivity.a aVar = ImageMultiPickerActivity.f46078j;
                if (uri == null) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "ImageMultiPickerActivity", "No media selected");
                    imageMultiPickerActivity.finish();
                    return;
                }
                if (Build.VERSION.SDK_INT > 29 && (contentResolver = imageMultiPickerActivity.getContentResolver()) != null) {
                    contentResolver.takePersistableUriPermission(uri, 1);
                }
                imageMultiPickerActivity.f46085f = uri;
                String string = uri.toString();
                string.getClass();
                e eVar = new e(uri, string, "jpg");
                c cVar = imageMultiPickerActivity.f46081b;
                if (cVar == null) {
                    s.m("adapter");
                    throw null;
                }
                cVar.t(eVar);
                imageMultiPickerActivity.da(uri);
                return;
            default:
                Map map = (Map) obj;
                ImageMultiPickerActivity.a aVar3 = ImageMultiPickerActivity.f46078j;
                map.getClass();
                if (s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                    imageMultiPickerActivity.ca();
                    return;
                } else {
                    imageMultiPickerActivity.finish();
                    return;
                }
        }
    }
}
