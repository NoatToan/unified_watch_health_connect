package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class qza {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile qza f47011c;

    private qza() {
    }

    public static qza a() {
        if (f47011c == null) {
            synchronized (qza.class) {
                if (f47011c == null) {
                    f47011c = new qza();
                }
            }
        }
        return f47011c;
    }

    public AnimationDrawable e(Context context, ImageView imageView, int i, int i2) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        int[] iArrA = a(context, i);
        if (iArrA.length == 0) {
            LogUtil.j("FrameAnimationUtils", "data is zero");
            return null;
        }
        for (int i3 : iArrA) {
            animationDrawable.addFrame(context.getDrawable(i3), i2);
        }
        imageView.setImageDrawable(animationDrawable);
        animationDrawable.setOneShot(false);
        return animationDrawable;
    }

    private int[] a(Context context, int i) {
        TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
        if (typedArrayObtainTypedArray == null) {
            return new int[0];
        }
        if (typedArrayObtainTypedArray.length() == 0) {
            typedArrayObtainTypedArray.recycle();
            return new int[typedArrayObtainTypedArray.length()];
        }
        int length = typedArrayObtainTypedArray.length();
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = typedArrayObtainTypedArray.getResourceId(i2, 0);
        }
        typedArrayObtainTypedArray.recycle();
        return iArr;
    }
}
