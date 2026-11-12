package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.operation.utils.Constants;
import com.huawei.skinner.attrentry.SkinAttr;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: loaded from: classes15.dex */
public class pzh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Map<String, Field>> f46010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, pyj> f46011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, pyj> f46012c;
    private static final String e = "StyleHelper";
    private String d;
    private pyj f;
    private String h;

    static {
        HashMap map = new HashMap();
        f46012c = map;
        HashMap map2 = new HashMap();
        f46011b = map2;
        f46010a = new HashMap();
        pyj pyjVarA = new pyj.e().a(TtmlNode.TAG_STYLE).b("android.widget.Switch").d("com.android.internal.R$styleable").e("Switch").b(new String[]{"Switch_thumb", "Switch_track"}).a(new String[]{"thumb", "track"}).a();
        map.put(pyjVarA.a(), pyjVarA);
        pyj pyjVarA2 = new pyj.e().a(TtmlNode.TAG_STYLE).b("huawei.widget.HwSwitch").d("com.android.internal.R$styleable").e("Switch").b(new String[]{"Switch_thumb", "Switch_track"}).a(new String[]{"thumb", "track"}).a();
        map.put(pyjVarA2.a(), pyjVarA2);
        pyj pyjVarA3 = new pyj.e().a(TtmlNode.TAG_STYLE).b("android.support.v7.widget.SwitchCompat").d("android.support.v7.appcompat.R$styleable").e("Switch").b(new String[]{"Switch_thumb", "Switch_track"}).a(new String[]{"thumb", "track"}).a();
        map.put(pyjVarA3.a(), pyjVarA3);
        pyj pyjVarA4 = new pyj.e().a(TtmlNode.TAG_STYLE).b("android.widget.ProgressBar").d("com.android.internal.R$styleable").e("ProgressBar").b(new String[]{"ProgressBar_progressDrawable", "ProgressBar_indeterminateDrawable"}).a(new String[]{"progressDrawable", "indeterminateDrawable"}).a();
        map.put(pyjVarA4.a(), pyjVarA4);
        pyj pyjVarA5 = new pyj.e().a("textAppearance").b("android.widget.TextView").d("com.android.internal.R$styleable").e("TextAppearance").b(new String[]{"TextAppearance_textColor", "TextAppearance_textColorHint"}).a(new String[]{"textColor", "textColorHint"}).a();
        map2.put(pyjVarA5.a(), pyjVarA5);
        pyj pyjVarA6 = new pyj.e().a("textAppearance").b("android.support.v7.widget.AppCompatTextView").d("com.android.internal.R$styleable").e("TextAppearance").b(new String[]{"TextAppearance_textColor", "TextAppearance_textColorHint"}).a(new String[]{"textColor", "textColorHint"}).a();
        map2.put(pyjVarA6.a(), pyjVarA6);
        pyj pyjVarA7 = new pyj.e().a("textAppearance").b("android.widget.Button").d("com.android.internal.R$styleable").e("TextAppearance").b(new String[]{"TextAppearance_textColor", "TextAppearance_textColorHint"}).a(new String[]{"textColor", "textColorHint"}).a();
        map2.put(pyjVarA7.a(), pyjVarA7);
        pyj pyjVarA8 = new pyj.e().a("textAppearance").b("android.widget.EditText").d("com.android.internal.R$styleable").e("TextAppearance").b(new String[]{"TextAppearance_textColor", "TextAppearance_textColorHint"}).a(new String[]{"textColor", "textColorHint"}).a();
        map2.put(pyjVarA8.a(), pyjVarA8);
        pyj pyjVarA9 = new pyj.e().a("textAppearance").b("huawei.widget.HwTextView").d("com.android.internal.R$styleable").e("TextAppearance").b(new String[]{"TextAppearance_textColor", "TextAppearance_textColorHint"}).a(new String[]{"textColor", "textColorHint"}).a();
        map2.put(pyjVarA9.a(), pyjVarA9);
        pyj pyjVarA10 = new pyj.e().a("textAppearance").b("huawei.widget.HwButton").d("com.android.internal.R$styleable").e("TextAppearance").b(new String[]{"TextAppearance_textColor", "TextAppearance_textColorHint"}).a(new String[]{"textColor", "textColorHint"}).a();
        map2.put(pyjVarA10.a(), pyjVarA10);
    }

    public pzh(View view, String str) {
        this.d = str;
        this.h = e + " " + view.getClass().getName() + "@" + view.hashCode();
        b(view);
    }

    public void d(Context context, View view, Resources resources, int i, ConcurrentSkipListSet<SkinAttr> concurrentSkipListSet) {
        pyj pyjVar = this.f;
        if (pyjVar == null) {
            pyt.f45989b.info(this.h, "parseStylefailed(mStyleBean is null): have register style for this view? : " + view.getClass().getName());
            return;
        }
        int[][] iArrD = d(pyjVar.b(), this.f.c(), this.f.e());
        if (iArrD.length != 2 || iArrD[0] == null) {
            pyt.f45989b.info(this.h, "parseStylegetStyleable() failed! ");
            return;
        }
        concurrentSkipListSet.clear();
        TypedArray typedArray = null;
        try {
            try {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, iArrD[0]);
                try {
                    b(view, typedArrayObtainStyledAttributes, resources, iArrD[1], this.f.d(), concurrentSkipListSet);
                    a(typedArrayObtainStyledAttributes);
                } catch (Resources.NotFoundException e2) {
                    e = e2;
                    typedArray = typedArrayObtainStyledAttributes;
                    pyt.f45989b.error(this.h, "parseStylegetStyleable() failed! ", e);
                    a(typedArray);
                } catch (Throwable th) {
                    th = th;
                    typedArray = typedArrayObtainStyledAttributes;
                    a(typedArray);
                    throw th;
                }
            } catch (Resources.NotFoundException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void a(TypedArray typedArray) {
        if (typedArray != null) {
            typedArray.recycle();
        }
    }

    private void b(View view) {
        if (this.d.equals(TtmlNode.TAG_STYLE)) {
            pyj pyjVar = f46012c.get(view.getClass().getName());
            if (pyjVar != null) {
                this.f = pyjVar;
                return;
            }
            return;
        }
        if (this.d.equals("textAppearance")) {
            pyj pyjVar2 = f46011b.get(view.getClass().getName());
            if (pyjVar2 != null) {
                this.f = pyjVar2;
                return;
            }
            return;
        }
        pyt.f45989b.warn(this.h, "prepare(view) Unknown attr:" + this.d);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x011a A[PHI: r0
      0x011a: PHI (r0v12 com.huawei.skinner.attrentry.SkinAttr) = (r0v8 com.huawei.skinner.attrentry.SkinAttr), (r0v21 com.huawei.skinner.attrentry.SkinAttr) binds: [B:34:0x0118, B:22:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x016b A[SYNTHETIC] */
    private void b(View view, TypedArray typedArray, Resources resources, int[] iArr, String[] strArr, ConcurrentSkipListSet<SkinAttr> concurrentSkipListSet) {
        int resourceId;
        SkinAttr skinAttrD;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (-1 != i2) {
                try {
                    resourceId = typedArray.getResourceId(i2, -1);
                } catch (Exception unused) {
                    pyt.f45989b.error(this.h, "parsegetResourcesId failed! (AttrName: " + strArr[i] + Constants.RIGHT_BRACKET_ONLY);
                    resourceId = -1;
                }
                if (resourceId != -1) {
                    String resourceEntryName = resources.getResourceEntryName(resourceId);
                    String resourceTypeName = resources.getResourceTypeName(resourceId);
                    String str = strArr[i];
                    try {
                        try {
                            if (pyi.e(str, Class.forName(this.f.a()))) {
                                SkinAttr skinAttrD2 = pyi.d(str, resourceId, resourceEntryName, resourceTypeName, view.getClass());
                                if (skinAttrD2 == null) {
                                    pyt.f45989b.warn(this.h, "parseThe attribute is not loaded! attrName:" + str + ";supportWidgetClassName:" + this.f.a());
                                    if (pyi.e(str, view.getClass())) {
                                        skinAttrD = pyi.d(str, resourceId, resourceEntryName, resourceTypeName, view.getClass());
                                    }
                                    if (skinAttrD != null) {
                                        concurrentSkipListSet.add(skinAttrD);
                                    }
                                }
                                skinAttrD = skinAttrD2;
                                if (skinAttrD != null) {
                                    concurrentSkipListSet.add(skinAttrD);
                                }
                            } else {
                                pyt.f45989b.warn(this.h, "parseThe attribute is not support! attrName:" + str + ";supportWidgetClassName:" + this.f.a());
                            }
                        } catch (Throwable th) {
                            SkinAttr skinAttrD3 = pyi.d(str, resourceId, resourceEntryName, resourceTypeName, view.getClass());
                            if (skinAttrD3 == null) {
                                pyt.f45989b.warn(this.h, "parseThe attribute is not loaded! attrName:" + str + ";supportWidgetClassName:" + this.f.a());
                                if (pyi.e(str, view.getClass())) {
                                    skinAttrD3 = pyi.d(str, resourceId, resourceEntryName, resourceTypeName, view.getClass());
                                }
                            }
                            if (skinAttrD3 != null) {
                                concurrentSkipListSet.add(skinAttrD3);
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        pyt.f45989b.error(this.h, "parse", e2);
                        skinAttrD = pyi.d(str, resourceId, resourceEntryName, resourceTypeName, view.getClass());
                        if (skinAttrD == null) {
                            pyt.f45989b.warn(this.h, "parseThe attribute is not loaded! attrName:" + str + ";supportWidgetClassName:" + this.f.a());
                            if (pyi.e(str, view.getClass())) {
                                skinAttrD = pyi.d(str, resourceId, resourceEntryName, resourceTypeName, view.getClass());
                            }
                        }
                        if (skinAttrD != null) {
                        }
                    }
                } else {
                    pyt.f45989b.warn(this.h, "parseThe resource id of the attribute value is invalid.");
                }
            }
        }
    }

    private int[][] d(String str, String str2, String[] strArr) {
        Object objD = d(str, str2);
        int[] iArr = objD instanceof int[] ? (int[]) objD : null;
        int length = strArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            Object objD2 = d(str, strArr[i]);
            if (!(objD2 instanceof Integer)) {
                iArr2[i] = -1;
            } else {
                iArr2[i] = ((Integer) objD2).intValue();
            }
        }
        return new int[][]{iArr, iArr2};
    }

    private Object d(String str, String str2) {
        Map<String, Map<String, Field>> map = f46010a;
        Map<String, Field> map2 = map.get(str);
        if (map2 != null) {
            Field field = map2.get(str2);
            if (field != null) {
                return pzd.c(field, null);
            }
            try {
                Field fieldD = pzd.d(Class.forName(str), str2);
                map2.put(str2, fieldD);
                return pzd.c(fieldD, null);
            } catch (ClassNotFoundException e2) {
                pyt.f45989b.error(this.h, "getFieldValue(className,styleableField)Error1", e2);
            }
        } else {
            HashMap map3 = new HashMap();
            map.put(str, map3);
            try {
                Field fieldD2 = pzd.d(Class.forName(str), str2);
                map3.put(str2, fieldD2);
                return pzd.c(fieldD2, null);
            } catch (ClassNotFoundException e3) {
                pyt.f45989b.error(this.h, "getFieldValue(className,styleableField)Error2", e3);
            }
        }
        return null;
    }
}
