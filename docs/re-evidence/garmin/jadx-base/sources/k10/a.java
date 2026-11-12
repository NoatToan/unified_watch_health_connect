package k10;

import android.content.Context;
import android.content.res.TypedArray;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk10/a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f102143a = new a();

    private a() {
    }

    public static ArrayList a(Context context) {
        context.getClass();
        ArrayList arrayList = new ArrayList();
        TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(R.array.group_defaut_image_id);
        typedArrayObtainTypedArray.getClass();
        TypedArray typedArrayObtainTypedArray2 = context.getResources().obtainTypedArray(R.array.group_defaut_image);
        typedArrayObtainTypedArray2.getClass();
        int length = typedArrayObtainTypedArray.length();
        for (int i14 = 0; i14 < length; i14++) {
            arrayList.add(new l10.a(typedArrayObtainTypedArray2.getResourceId(i14, -1), String.valueOf(typedArrayObtainTypedArray.getString(i14))));
        }
        typedArrayObtainTypedArray2.recycle();
        typedArrayObtainTypedArray.recycle();
        return arrayList;
    }
}
