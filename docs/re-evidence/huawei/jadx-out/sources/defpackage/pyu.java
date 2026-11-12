package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.skinner.attrentry.SkinAttr;
import com.huawei.skinner.facade.template.ILogger;
import com.huawei.skinner.internal.ISkinnableViewManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class pyu implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f45995c = "SkinnableViewFactory2";
    private static boolean d;
    private static boolean h;
    private ISkinnableViewManager i;
    private static final String[] e = {"android.widget.", "android.app.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f45994b = {"color", "drawable", TtmlNode.TAG_STYLE};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f45993a = {"id", "layout_height", "layout_width", "text", "textSize"};
    private static Field g = pzd.d(LayoutInflater.class, "mConstructorArgs");

    static {
        h = Build.VERSION.SDK_INT < 29;
        d = false;
    }

    public pyu(ISkinnableViewManager iSkinnableViewManager) {
        this.i = iSkinnableViewManager;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return onCreateView(str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewB;
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res-auto", "hwSkinEnable", false) || (viewB = b(context, str, attributeSet)) == null) {
            return null;
        }
        d(context, attributeSet, viewB);
        return viewB;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x011a  */
    private View b(Context context, String str, AttributeSet attributeSet) throws Throwable {
        Object[] objArrE;
        Object obj;
        View viewC;
        Object[] objArr = null;
        try {
            try {
                LayoutInflater layoutInflaterE = pyw.e(context);
                if (pyt.f45989b.isShowLog()) {
                    pyt.f45989b.debug(f45995c, "createView(), inflater:" + layoutInflaterE + ";context:" + context + ";name:" + str + ";attrs:" + attributeSet);
                }
                if (h) {
                    if (d && layoutInflaterE.getContext() == null) {
                        pyt.f45989b.warn(f45995c, "createView() LayoutInflater.mContext is null!");
                        pzc.c((Class<?>) LayoutInflater.class).c("mContext").c(layoutInflaterE, context);
                    }
                    objArrE = e(layoutInflaterE);
                    try {
                        if (pyt.f45989b.isShowLog()) {
                            pyt.f45989b.debug(f45995c, "createView(), constructorArgs:" + objArrE);
                        }
                        if (objArrE == null || objArrE.length < 2) {
                            pyt.f45989b.warn(f45995c, "createView() LayoutInflater.mConstructorArgs is null!");
                            objArrE = new Object[2];
                            pzd.b(LayoutInflater.class, layoutInflaterE, "mConstructorArgs", objArrE);
                        }
                        obj = objArrE[0];
                        if (obj == null) {
                            try {
                                pyt.f45989b.warn(f45995c, "createView() LayoutInflater.mConstructorArgs[0] is null!");
                                objArrE[0] = context;
                            } catch (Exception e2) {
                                e = e2;
                                ILogger iLogger = pyt.f45989b;
                                String str2 = f45995c;
                                iLogger.error(str2, "createView() Error", e);
                                if (pyt.f45989b.isShowLog()) {
                                    pyt.f45989b.debug(str2, "createView() catch error, name:" + str);
                                }
                                if (objArrE != null) {
                                    objArrE[0] = obj;
                                }
                                return null;
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        obj = null;
                    } catch (Throwable th) {
                        th = th;
                        objArr = objArrE;
                        if (objArr != null) {
                            objArr[0] = null;
                        }
                        throw th;
                    }
                } else {
                    objArrE = null;
                    obj = null;
                }
                if (-1 == str.indexOf(46)) {
                    viewC = null;
                    for (String str3 : e) {
                        viewC = pyw.c(layoutInflaterE, context, str, str3, attributeSet);
                        e(context, str, attributeSet, viewC);
                        if (viewC != null) {
                            if (objArrE != null) {
                                objArrE[0] = obj;
                            }
                            return viewC;
                        }
                    }
                } else {
                    viewC = pyw.c(layoutInflaterE, context, str, null, attributeSet);
                    e(context, str, attributeSet, viewC);
                }
                if (objArrE != null) {
                    objArrE[0] = obj;
                }
                return viewC;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            e = e4;
            objArrE = null;
            obj = null;
        } catch (Throwable th3) {
            th = th3;
            if (objArr != null) {
                objArr[0] = null;
            }
            throw th;
        }
    }

    private void e(Context context, String str, AttributeSet attributeSet, View view) {
        int resourceId;
        if (view == null || context == null || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.id});
            if (typedArrayObtainStyledAttributes != null && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1)) != -1 && view.getId() != resourceId) {
                pyt.f45989b.error(f45995c, "checkViewId Error name = " + str + ", view.id = " + view.getId() + ", idInAttrs = " + resourceId);
                view.setId(resourceId);
            }
        } catch (Exception e2) {
            ILogger iLogger = pyt.f45989b;
            String str2 = f45995c;
            iLogger.error(str2, "checkViewId() Error", e2);
            if (pyt.f45989b.isShowLog()) {
                pyt.f45989b.debug(str2, "checkViewId() catch error, name:" + str);
            }
        } finally {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    private Object[] e(LayoutInflater layoutInflater) {
        if (g == null) {
            Field fieldD = pzd.d(LayoutInflater.class, "mConstructorArgs");
            g = fieldD;
            if (fieldD == null) {
                pyt.f45989b.error(f45995c, "getConstructorArgsValue() Error1: no field mConstructorArgs in LayoutInflater class founded!");
                return null;
            }
        }
        Object objC = pzd.c(g, layoutInflater);
        if (objC instanceof Object[]) {
            return (Object[]) objC;
        }
        pyt.f45989b.error(f45995c, "getConstructorArgsValue() Error2: Value of field mConstructorArgs in LayoutInflater is null or type is not we need!");
        return null;
    }

    private void d(Context context, AttributeSet attributeSet, View view) {
        int identifier;
        String resourceEntryName;
        String resourceTypeName;
        SkinAttr skinAttrD;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < attributeSet.getAttributeCount(); i++) {
            String attributeName = attributeSet.getAttributeName(i);
            String attributeValue = attributeSet.getAttributeValue(i);
            if ("hwThemeServiceEnable".equals(attributeName) && "true".equals(attributeValue)) {
                view.setTag(com.huawei.skinner.R.id.hw_theme_service_tag, "hwThemeServiceEnable");
            }
            if (attributeValue.startsWith("@") && e(attributeName)) {
                try {
                    if (attributeValue.contains("/")) {
                        int iIndexOf = attributeValue.indexOf("/");
                        resourceEntryName = attributeValue.substring(iIndexOf + 1);
                        identifier = context.getResources().getIdentifier(resourceEntryName, attributeValue.substring(1, iIndexOf), context.getPackageName());
                        resourceTypeName = context.getResources().getResourceTypeName(identifier);
                    } else {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                        resourceEntryName = context.getResources().getResourceEntryName(identifier);
                        resourceTypeName = context.getResources().getResourceTypeName(identifier);
                    }
                    int i2 = 0;
                    while (true) {
                        String[] strArr = f45994b;
                        if (i2 >= strArr.length) {
                            break;
                        }
                        if (strArr[i2].equals(resourceTypeName)) {
                            if (pyi.e(attributeName, view.getClass()) && (skinAttrD = pyi.d(attributeName, identifier, resourceEntryName, resourceTypeName, view.getClass())) != null) {
                                arrayList.add(skinAttrD);
                                break;
                            }
                            break;
                        }
                        i2++;
                    }
                } catch (Resources.NotFoundException | NumberFormatException e2) {
                    ILogger iLogger = pyt.f45989b;
                    String str = f45995c;
                    iLogger.error(str, "parseSkinableAttr() Error", e2);
                    if (pyt.f45989b.isShowLog()) {
                        pyt.f45989b.debug(str, "parseSkinableAttr() catch error , view:" + view.getClass().getName() + ";attrName:" + attributeName + ";attrValue:" + attributeValue + ";entryName:;typeName:");
                    }
                }
            }
        }
        view.setTag(com.huawei.skinner.R.id.hw_skinner_tag, "hwSkinEnable");
        if (pyy.d((List) arrayList)) {
            return;
        }
        pyk pykVar = new pyk();
        pykVar.c(view);
        pykVar.c().addAll(arrayList);
        pyk pykVarAddSkinnableView = this.i.addSkinnableView(pykVar);
        if (pyt.a(context).a()) {
            pykVarAddSkinnableView.c(true);
            if (pyt.d().c() && pyt.d().b() && view.getTag(com.huawei.skinner.R.id.hw_theme_service_tag) != null) {
                pykVarAddSkinnableView.e();
            }
        }
    }

    private boolean e(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f45993a;
            if (i >= strArr.length) {
                return (str.startsWith("layout_margin") || str.startsWith("padding")) ? false : true;
            }
            if (strArr[i].equals(str)) {
                return false;
            }
            i++;
        }
    }

    public void c(Context context, View view, List<pye> list) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (pye pyeVar : list) {
            if (!pyi.e(pyeVar.f45953b, view.getClass())) {
                arrayList.add(pyeVar);
            }
        }
        if (arrayList.size() > 0) {
            list.removeAll(arrayList);
            if (list.size() == 0) {
                return;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (pye pyeVar2 : list) {
            int i = pyeVar2.f45954c;
            SkinAttr skinAttrD = pyi.d(pyeVar2.f45953b, i, context.getResources().getResourceEntryName(i), context.getResources().getResourceTypeName(i), view.getClass());
            if (skinAttrD != null) {
                arrayList2.add(skinAttrD);
            }
        }
        if (pyy.d((List) arrayList2)) {
            return;
        }
        pyk pykVar = new pyk();
        pykVar.c(view);
        pykVar.c().addAll(arrayList2);
        pyk pykVarAddSkinnableView = this.i.addSkinnableView(pykVar);
        pykVarAddSkinnableView.c(true);
        if (pyt.d().a() && pyt.d().c() && pyt.d().b() && view.getTag(com.huawei.skinner.R.id.hw_theme_service_tag) != null) {
            pykVarAddSkinnableView.e();
        }
    }

    public void c(Context context, View view, String str, int i) {
        SkinAttr skinAttrD;
        if (view == null || !pyi.e(str, view.getClass()) || (skinAttrD = pyi.d(str, i, context.getResources().getResourceEntryName(i), context.getResources().getResourceTypeName(i), view.getClass())) == null) {
            return;
        }
        pyk pykVar = new pyk();
        pykVar.c(view);
        pykVar.c().add(skinAttrD);
        pyk pykVarAddSkinnableView = this.i.addSkinnableView(pykVar);
        pykVarAddSkinnableView.c(true);
        if (pyt.d().a() && pyt.d().c() && pyt.d().b() && view.getTag(com.huawei.skinner.R.id.hw_theme_service_tag) != null) {
            pykVarAddSkinnableView.e();
        }
    }
}
