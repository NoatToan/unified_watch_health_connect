package com.huawei.watchface;

import android.app.Dialog;
import android.content.Context;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.skinner.base.SkinBaseFragmentActivity;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes20.dex */
public abstract class u extends Dialog {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f30580c = false;
    public static WeakHashMap d = new WeakHashMap();
    public static WeakHashMap e = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30582b;

    public u(Context context, int i) {
        super(context, i);
        this.f30582b = -1;
        this.f30581a = context;
        b(context);
    }

    public static void a(Context context, Dialog dialog) {
        if ((context instanceof SkinBaseFragmentActivity) && !(dialog instanceof u)) {
            a(dialog, context.toString());
        }
    }

    public final void b(Context context) {
        if (context instanceof SkinBaseFragmentActivity) {
            a(this, context.toString());
        }
    }

    public final void c() {
        b(this);
    }

    public final void d() {
        e.remove(this);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            if (!f30580c) {
                c();
                d();
            }
            super.dismiss();
        } catch (Exception e2) {
            HwLog.i("BaseDialog", "dismiss: " + HwLog.printException(e2));
        }
    }

    @Override // android.app.Dialog
    public void show() {
        int iA;
        HwLog.i("BaseDialog", "show() enter.");
        if (this.f30582b != 0) {
            Window window = getWindow();
            window.setDimAmount(0.2f);
            Display defaultDisplay = ((WindowManager) this.f30581a.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay();
            WindowManager.LayoutParams attributes = window.getAttributes();
            int iA2 = CommonUtils.a(this.f30581a, 16.0f);
            int width = defaultDisplay.getWidth();
            int iA3 = CommonUtils.a(this.f30581a, 191.0f);
            if (CommonUtils.J()) {
                int iA4 = CommonUtils.a(this.f30581a, 24.0f);
                float f = width;
                float f2 = (f - (iA4 * 9.0f)) / 8.0f;
                if (f / defaultDisplay.getHeight() > 0.75f) {
                    iA = ((int) (f2 * 2.0f)) + (iA4 * 3);
                    HwLog.d("BaseDialog", "folding padding width:" + iA);
                } else {
                    iA = ((int) (f2 * 1.5f)) + (iA4 * 2);
                    HwLog.d("BaseDialog", "pad padding width:" + iA);
                }
            } else {
                iA = CommonUtils.a(this.f30581a, 12.0f);
            }
            if (this.f30581a.getResources().getConfiguration().orientation != 2) {
                iA3 = iA;
            }
            attributes.width = width - (iA3 * 2);
            HwLog.i("BaseDialog", "show() mDialogType " + this.f30582b);
            if (!CommonUtils.J()) {
                attributes.y = iA2;
            }
            window.setAttributes(attributes);
            if (CommonUtils.J()) {
                window.setGravity(16);
            } else {
                window.setGravity(80);
            }
        }
        c(this.f30581a);
        super.show();
    }

    public final void c(Context context) {
        if (context instanceof SkinBaseFragmentActivity) {
            e.put(this, context.toString());
        }
    }

    public static void b() {
        HwLog.i("BaseDialog", "configureChangedShowDialog() enter");
        f30580c = true;
        WeakHashMap weakHashMap = new WeakHashMap();
        weakHashMap.putAll(e);
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Dialog dialog = (Dialog) ((Map.Entry) it.next()).getKey();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
        Iterator it2 = weakHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Dialog dialog2 = (Dialog) ((Map.Entry) it2.next()).getKey();
            if (dialog2 != null) {
                dialog2.show();
            }
        }
        f30580c = false;
    }

    public static void a(Dialog dialog) {
        b(dialog);
    }

    public static void a(Context context) {
        ArrayList arrayListA = a(context.toString());
        if (arrayListA == null) {
            return;
        }
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            ((Dialog) it.next()).dismiss();
        }
    }

    public static void a(Dialog dialog, String str) {
        d.put(dialog, str);
    }

    public static ArrayList a(String str) {
        e.clear();
        int size = d.size();
        if (size == 0) {
            return new ArrayList();
        }
        Iterator it = d.entrySet().iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (str.equals(entry.getValue())) {
                Dialog dialog = (Dialog) entry.getKey();
                if (dialog != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(size);
                    }
                    arrayList.add(dialog);
                }
                it.remove();
            }
        }
        return arrayList;
    }

    public static void b(Dialog dialog) {
        d.remove(dialog);
    }

    public static void a() {
        e.clear();
        d.clear();
    }
}
