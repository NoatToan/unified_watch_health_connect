package com.huawei.ui.main.stories.exhibitioninfo.activity;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.js.JsInteractAddition;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.main.R;
import defpackage.qqf;
import defpackage.tss;
import defpackage.xjl;
import health.compact.a.IoUtils;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes19.dex */
public class ExhibitionRunFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f26490a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f26491c;
    private View d;
    private ImageView e;

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26491c = getContext();
    }

    public void c(Context context) throws Throwable {
        if (context == null) {
            this.f26491c = BaseApplication.b();
            LogUtil.j("ExhibitionRunFragment", "initViewInActivity Activity is null");
        } else {
            this.f26491c = context;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.report_run_layout, (ViewGroup) null);
        this.d = viewInflate;
        b(viewInflate);
    }

    public void b() throws Throwable {
        d();
    }

    private void b(View view) throws Throwable {
        tss.b((RelativeLayout) view.findViewById(R.id.report_run), 104);
        this.f26490a = (ImageView) view.findViewById(R.id.report_run_pic_1);
        this.e = (ImageView) view.findViewById(R.id.report_run_pic_2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.huawei.ui.main.stories.exhibitioninfo.activity.ExhibitionRunFragment] */
    private void d() throws Throwable {
        IOException e;
        InputStream inputStreamOpenInputStream;
        ?? r0;
        Bitmap bitmapE;
        ?? r1 = Uri.parse(SharedPreferenceManager.e(this.f26491c, JsInteractAddition.BI_ERROR_CODE_INVALID_AT, "SP_REPORT_RUN"));
        if (!PermissionUtil.a()) {
            ?? r2 = 0;
            Bitmap bitmapDecodeStream = null;
            try {
                try {
                    inputStreamOpenInputStream = this.f26491c.getContentResolver().openInputStream(r1);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                    } catch (IOException e2) {
                        e = e2;
                        LogUtil.e("ExhibitionRunFragment", "Failed to obtain the bitmap exception : ", ExceptionUtils.c(e));
                    }
                } catch (Throwable th) {
                    r2 = r1;
                    th = th;
                    IoUtils.c(r2);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                inputStreamOpenInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                IoUtils.c(r2);
                throw th;
            }
            IoUtils.c(inputStreamOpenInputStream);
            r1 = bitmapDecodeStream;
            r0 = r1;
        } else if (r1 == 0) {
            return;
        } else {
            bitmapE = qqf.e(c(r1));
        }
        if (r0 == 0) {
            r0 = bitmapE;
            return;
        }
        r0 = bitmapE;
        this.f26490a.setImageBitmap(e(r0));
        this.e.setImageBitmap(a(r0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v2 */
    private String c(Uri uri) throws Throwable {
        Throwable th;
        SQLException e;
        Cursor cursorQuery;
        String[] strArr = {"_data"};
        ?? r11 = 0;
        string = null;
        string = null;
        String string = null;
        try {
            try {
                if (!xjl.d(new File(uri.toString()))) {
                    LogUtil.j("ExhibitionRunFragment", "path_crossing queryImages file is invalid,contentUri ", uri);
                    IoUtils.c(null);
                    return null;
                }
                cursorQuery = this.f26491c.getContentResolver().query(uri, strArr, null, null, null);
                try {
                    if (cursorQuery == null) {
                        LogUtil.j("ExhibitionRunFragment", "queryImages cursor = null");
                    } else {
                        cursorQuery.moveToFirst();
                        string = cursorQuery.getString(cursorQuery.getColumnIndex(strArr[0]));
                    }
                    IoUtils.c(cursorQuery);
                    return string;
                } catch (SQLException e2) {
                    e = e2;
                    LogUtil.j("ExhibitionRunFragment", "queryImagesSQLException! exception : ", ExceptionUtils.c(e));
                    IoUtils.c(cursorQuery);
                    return string;
                }
            } catch (Throwable th2) {
                th = th2;
                r11 = uri;
                IoUtils.c(r11);
                throw th;
            }
        } catch (SQLException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            IoUtils.c(r11);
            throw th;
        }
    }

    private Bitmap e(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double dDoubleValue = new BigDecimal(width).divide(new BigDecimal(400), 2, 4).doubleValue();
        int iIntValue = Long.valueOf(Math.round(new BigDecimal(Double.toString(848.5d)).multiply(new BigDecimal(dDoubleValue)).doubleValue())).intValue();
        int iIntValue2 = Long.valueOf(Math.round(new BigDecimal(Double.toString(88.5d)).multiply(new BigDecimal(dDoubleValue)).doubleValue())).intValue();
        if ((height - iIntValue) - iIntValue2 > 0) {
            return Bitmap.createBitmap(bitmap, 0, iIntValue2, width, iIntValue);
        }
        return Bitmap.createBitmap(bitmap, 0, iIntValue2, width, (height - iIntValue2) - Long.valueOf(Math.round(new BigDecimal(Double.toString(57.0d)).multiply(new BigDecimal(dDoubleValue)).doubleValue())).intValue());
    }

    private Bitmap a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double dDoubleValue = new BigDecimal(width).divide(new BigDecimal(400), 2, 4).doubleValue();
        int iIntValue = Long.valueOf(Math.round(new BigDecimal(Double.toString(930.5d)).multiply(new BigDecimal(dDoubleValue)).doubleValue())).intValue();
        int iIntValue2 = (height - iIntValue) - Long.valueOf(Math.round(new BigDecimal(Double.toString(57.0d)).multiply(new BigDecimal(dDoubleValue)).doubleValue())).intValue();
        if (iIntValue2 > 0) {
            return Bitmap.createBitmap(bitmap, 0, iIntValue, width, iIntValue2);
        }
        return null;
    }

    public Bitmap c() {
        return tss.b(this.d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LogUtil.a("ExhibitionRunFragment", "onDestroy");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }
}
