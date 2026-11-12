package com.huawei.ui.main.stories.exhibitioninfo.activity;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
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
public class ExhibitionBodyFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f26481b;
    private View d;
    private ImageView e;

    public void a(Context context) throws Throwable {
        if (context == null) {
            this.f26481b = BaseApplication.b();
            LogUtil.j("ExhibitionBodyFragment", "initViewInActivity Activity is null");
        } else {
            this.f26481b = context;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.report_body_layout, (ViewGroup) null);
        this.d = viewInflate;
        d(viewInflate);
    }

    public void c() throws Throwable {
        b();
    }

    private void d(View view) throws Throwable {
        tss.b((RelativeLayout) view.findViewById(R.id.report_body), 102);
        this.e = (ImageView) view.findViewById(R.id.report_body_pic);
    }

    private void b() throws Throwable {
        IOException e;
        InputStream inputStreamOpenInputStream;
        Bitmap bitmapE;
        Uri uri = Uri.parse(SharedPreferenceManager.e(this.f26481b, JsInteractAddition.BI_ERROR_CODE_INVALID_AT, "SP_REPORT_BODY"));
        if (!PermissionUtil.a()) {
            InputStream inputStream = null;
            Bitmap bitmapDecodeStream = null;
            try {
                inputStreamOpenInputStream = this.f26481b.getContentResolver().openInputStream(uri);
                try {
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                    } catch (IOException e2) {
                        e = e2;
                        LogUtil.e("ExhibitionBodyFragment", "initData Failed to obtain the bitmap exception :", ExceptionUtils.c(e));
                    }
                } catch (Throwable th) {
                    inputStream = inputStreamOpenInputStream;
                    th = th;
                    IoUtils.c(inputStream);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                inputStreamOpenInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                IoUtils.c(inputStream);
                throw th;
            }
            IoUtils.c(inputStreamOpenInputStream);
            bitmapE = bitmapDecodeStream;
        } else if (uri == null) {
            return;
        } else {
            bitmapE = qqf.e(e(uri));
        }
        if (bitmapE == null) {
            return;
        }
        this.e.setImageBitmap(c(bitmapE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v2 */
    private String e(Uri uri) throws Throwable {
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
                    LogUtil.j("ExhibitionBodyFragment", "path_crossing queryImages file is invalid,contentUri ", uri);
                    IoUtils.c(null);
                    return null;
                }
                cursorQuery = this.f26481b.getContentResolver().query(uri, strArr, null, null, null);
                try {
                    if (cursorQuery == null) {
                        LogUtil.j("ExhibitionBodyFragment", "queryImages cursor = null");
                    } else {
                        cursorQuery.moveToFirst();
                        string = cursorQuery.getString(cursorQuery.getColumnIndex(strArr[0]));
                    }
                    IoUtils.c(cursorQuery);
                    return string;
                } catch (SQLException e2) {
                    e = e2;
                    LogUtil.j("ExhibitionBodyFragment", "queryImagesSQLException! exception : ", ExceptionUtils.c(e));
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

    private Bitmap c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double d = ((double) width) / 400.0d;
        int iIntValue = Long.valueOf(Math.round(new BigDecimal(Double.toString(13.2d)).multiply(new BigDecimal(d)).doubleValue())).intValue();
        int iIntValue2 = Long.valueOf(Math.round(new BigDecimal(Double.toString(30.5d)).multiply(new BigDecimal(d)).doubleValue())).intValue();
        int iIntValue3 = Long.valueOf(Math.round(new BigDecimal(Double.toString(40.0d)).multiply(new BigDecimal(d)).doubleValue())).intValue();
        return Bitmap.createBitmap(bitmap, iIntValue, iIntValue3, width - iIntValue, (height - iIntValue3) - iIntValue2);
    }

    public Bitmap d() {
        return tss.b(this.d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LogUtil.a("ExhibitionBodyFragment", "onDestroy");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }
}
