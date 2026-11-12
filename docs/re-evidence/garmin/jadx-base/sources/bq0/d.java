package bq0;

import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.imagemultipicker.ImageMultiPickerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageMultiPickerActivity f19485b;

    public /* synthetic */ d(ImageMultiPickerActivity imageMultiPickerActivity, int i14) {
        this.f19484a = i14;
        this.f19485b = imageMultiPickerActivity;
    }

    @Override // f.b
    public final void a(Object obj) {
        int i14 = this.f19484a;
        ImageMultiPickerActivity imageMultiPickerActivity = this.f19485b;
        switch (i14) {
            case 0:
                Map map = (Map) obj;
                int i15 = ImageMultiPickerActivity.f36770j;
                map.getClass();
                if (!s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                    imageMultiPickerActivity.finish();
                } else {
                    imageMultiPickerActivity.da();
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                int i16 = ImageMultiPickerActivity.f36770j;
                if (uri == null) {
                    i2.a aVar = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar.getClass();
                    i2.a.f(a2Var, "ImageMultiPickerActivity", "No media selected");
                } else {
                    imageMultiPickerActivity.ca(uri);
                    ArrayList<k> arrayList = imageMultiPickerActivity.f36774d;
                    Intent intent = new Intent();
                    intent.putParcelableArrayListExtra("GCM_extra_images_data", arrayList);
                    imageMultiPickerActivity.setResult(-1, intent);
                    imageMultiPickerActivity.finish();
                }
                break;
            default:
                List list = (List) obj;
                int i17 = ImageMultiPickerActivity.f36770j;
                list.getClass();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        imageMultiPickerActivity.ca((Uri) it.next());
                    }
                    ArrayList<k> arrayList2 = imageMultiPickerActivity.f36774d;
                    Intent intent2 = new Intent();
                    intent2.putParcelableArrayListExtra("GCM_extra_images_data", arrayList2);
                    imageMultiPickerActivity.setResult(-1, intent2);
                    imageMultiPickerActivity.finish();
                } else {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var2, "ImageMultiPickerActivity", "No media selected");
                }
                break;
        }
    }
}
