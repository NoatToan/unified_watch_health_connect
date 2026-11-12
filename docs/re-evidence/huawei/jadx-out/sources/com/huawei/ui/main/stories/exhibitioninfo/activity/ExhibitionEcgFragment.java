package com.huawei.ui.main.stories.exhibitioninfo.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.main.R;
import defpackage.tss;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class ExhibitionEcgFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f26482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f26483b;
    private View e;

    public void b(Context context) throws Throwable {
        if (context == null) {
            this.f26483b = BaseApplication.b();
            LogUtil.j("ExhibitionEcgFragment", "initViewInActivity Activity is null");
        } else {
            this.f26483b = context;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.report_ecg_layout, (ViewGroup) null);
        this.e = viewInflate;
        d(viewInflate);
    }

    public void d() {
        e();
    }

    private void d(View view) throws Throwable {
        tss.b((RelativeLayout) view.findViewById(R.id.report_ecg), 103);
        this.f26482a = (ImageView) view.findViewById(R.id.report_ecg_pic_1);
    }

    private void e() {
        Bitmap bitmapB;
        String strB = b();
        if (TextUtils.isEmpty(strB) || (bitmapB = b(strB)) == null) {
            return;
        }
        this.f26482a.setImageBitmap(bitmapB);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[SYNTHETIC] */
    private Bitmap b(String str) throws Throwable {
        PdfRenderer pdfRenderer;
        ParcelFileDescriptor parcelFileDescriptorOpen;
        PdfRenderer pdfRenderer2;
        ParcelFileDescriptor parcelFileDescriptor = null;
        PdfRenderer pdfRenderer3 = null;
        try {
            parcelFileDescriptorOpen = ParcelFileDescriptor.open(new File(str), 268435456);
            try {
                pdfRenderer2 = new PdfRenderer(parcelFileDescriptorOpen);
                try {
                    try {
                        if (pdfRenderer2.getPageCount() > 0) {
                            Bitmap bitmapA = a(d(pdfRenderer2.openPage(0)));
                            if (parcelFileDescriptorOpen != null) {
                                try {
                                    parcelFileDescriptorOpen.close();
                                } catch (IOException e) {
                                    LogUtil.e("ExhibitionEcgFragment", "getEcgBitmap IOException is", ExceptionUtils.c(e));
                                }
                            }
                            pdfRenderer2.close();
                            return bitmapA;
                        }
                        if (parcelFileDescriptorOpen != null) {
                            try {
                                parcelFileDescriptorOpen.close();
                            } catch (IOException e2) {
                                LogUtil.e("ExhibitionEcgFragment", "getEcgBitmap IOException is", ExceptionUtils.c(e2));
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        LogUtil.e("ExhibitionEcgFragment", "getEcgBitmap PDFIOException is", ExceptionUtils.c(e));
                        if (parcelFileDescriptorOpen != null) {
                            try {
                                parcelFileDescriptorOpen.close();
                            } catch (IOException e4) {
                                LogUtil.e("ExhibitionEcgFragment", "getEcgBitmap IOException is", ExceptionUtils.c(e4));
                            }
                        }
                        if (pdfRenderer2 != null) {
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    pdfRenderer3 = pdfRenderer2;
                    th = th;
                    PdfRenderer pdfRenderer4 = pdfRenderer3;
                    parcelFileDescriptor = parcelFileDescriptorOpen;
                    pdfRenderer = pdfRenderer4;
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e5) {
                            LogUtil.e("ExhibitionEcgFragment", "getEcgBitmap IOException is", ExceptionUtils.c(e5));
                        }
                    }
                    if (pdfRenderer == null) {
                        throw th;
                    }
                    pdfRenderer.close();
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                pdfRenderer2 = null;
            } catch (Throwable th2) {
                th = th2;
                PdfRenderer pdfRenderer5 = pdfRenderer3;
                parcelFileDescriptor = parcelFileDescriptorOpen;
                pdfRenderer = pdfRenderer5;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                if (pdfRenderer == null) {
                    throw th;
                }
                pdfRenderer.close();
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            parcelFileDescriptorOpen = null;
            pdfRenderer2 = null;
        } catch (Throwable th3) {
            th = th3;
            pdfRenderer = null;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            if (pdfRenderer == null) {
                throw th;
            }
            pdfRenderer.close();
            throw th;
        }
        pdfRenderer2.close();
        return null;
    }

    private Bitmap a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double dDoubleValue = new BigDecimal(width).divide(new BigDecimal(400), 2, 4).doubleValue();
        int iIntValue = Long.valueOf(Math.round(new BigDecimal(Double.toString(246.5d)).multiply(new BigDecimal(dDoubleValue)).doubleValue())).intValue();
        int iIntValue2 = Long.valueOf(Math.round(new BigDecimal(Double.toString(57.0d)).multiply(new BigDecimal(dDoubleValue)).doubleValue())).intValue();
        return e(Bitmap.createBitmap(bitmap, 0, iIntValue2, width, (height - iIntValue2) - iIntValue));
    }

    private Bitmap e(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setRotate(-90.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }

    private Bitmap d(PdfRenderer.Page page) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(page.getWidth(), page.getHeight(), Bitmap.Config.ARGB_8888);
        page.render(bitmapCreateBitmap, null, null, 1);
        page.close();
        return bitmapCreateBitmap;
    }

    private String b() {
        String str = null;
        try {
            str = this.f26483b.getExternalFilesDir(null).getCanonicalPath() + "/h5pro/files/com.huawei.health.h5.ecg";
            LogUtil.a("TAG", "ecgFileDir == ", str);
        } catch (IOException e) {
            LogUtil.e("ExhibitionEcgFragment", "getPdfFilePath IOException is ", ExceptionUtils.c(e));
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            LogUtil.j("ExhibitionEcgFragment", "getPdfFilePath ecgFile not exist or not Directory");
            return "";
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < fileArrListFiles.length; i++) {
                if (!fileArrListFiles[i].isDirectory() && fileArrListFiles[i].getName().trim().toLowerCase(Locale.ENGLISH).endsWith(".pdf")) {
                    arrayList.add(fileArrListFiles[i]);
                }
            }
            if (arrayList.size() > 0) {
                return ((File) arrayList.get(arrayList.size() - 1)).getPath();
            }
        }
        return "";
    }

    public Bitmap c() {
        return tss.b(this.e);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LogUtil.a("ExhibitionEcgFragment", "onDestroy");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        LogUtil.a("ExhibitionEcgFragment", "onDestroyView");
        super.onDestroyView();
    }
}
