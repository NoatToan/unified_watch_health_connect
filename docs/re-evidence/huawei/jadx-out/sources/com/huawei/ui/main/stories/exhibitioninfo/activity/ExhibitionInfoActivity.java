package com.huawei.ui.main.stories.exhibitioninfo.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.print.PrintAttributes;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.js.JsInteractAddition;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.exhibitioninfo.adapter.ExhibitionAdapter;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.tss;
import defpackage.wig;
import defpackage.wuc;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class ExhibitionInfoActivity extends BaseActivity implements ExhibitionAdapter.OnReportSelectChangeListener {
    private Bitmap f;
    private Bitmap g;
    private CommonDialog21 h;
    private Context j;
    private ExhibitionBloodFragment k;
    private Bitmap l;
    private Handler m;
    private ExhibitionAdapter n;
    private HealthRecycleView o;
    private HiHealthData q;
    private double r;
    private RelativeLayout s;
    private double t;
    private HealthToolBar u;
    private LinearLayout v;
    private Bitmap w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f26484a = BaseApplication.b().getString(R.string.IDS_report_electrocardiogram_analysis);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f26485b = BaseApplication.b().getString(R.string.IDS_report_oxygen_sugar_pressure);
    private static final String e = BaseApplication.b().getString(R.string.IDS_report_indoor_running);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f26486c = BaseApplication.b().getString(R.string.IDS_report_body_composition_analysis);
    private static boolean d = false;
    private static boolean i = true;
    private final List<HashMap<String, Bitmap>> x = new ArrayList();
    private ArrayList<String> y = new ArrayList<>();
    private final HealthToolBar.OnSingleTapListener p = new HealthToolBar.OnSingleTapListener() { // from class: com.huawei.ui.main.stories.exhibitioninfo.activity.ExhibitionInfoActivity.5
        @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
        public void onSingleTap(int i2) throws Throwable {
            if (qrs.c(500)) {
                LogUtil.a("ExhibitionInfoActivity", "click too fast");
                return;
            }
            if (i2 == 1) {
                ExhibitionInfoActivity.this.b();
                return;
            }
            if (i2 == 2) {
                boolean unused = ExhibitionInfoActivity.i = !ExhibitionInfoActivity.i;
                if (ExhibitionInfoActivity.i) {
                    ExhibitionInfoActivity.this.k();
                    return;
                } else {
                    ExhibitionInfoActivity.this.p();
                    return;
                }
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    ExhibitionInfoActivity.this.j();
                    return;
                } else {
                    LogUtil.a("ExhibitionInfoActivity", "wrong position");
                    return;
                }
            }
            if (ExhibitionInfoActivity.this.y.size() > 0) {
                ExhibitionInfoActivity exhibitionInfoActivity = ExhibitionInfoActivity.this;
                exhibitionInfoActivity.b(exhibitionInfoActivity.y);
            }
        }
    };

    class e extends Handler {
        private e() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            String string;
            String string2;
            if (message == null) {
                LogUtil.j("ExhibitionInfoActivity", "handleMessage: msg is null");
                return;
            }
            super.handleMessage(message);
            switch (message.what) {
                case 100:
                    ExhibitionInfoActivity.this.s.setVisibility(8);
                    ExhibitionInfoActivity.this.v.setVisibility(0);
                    break;
                case 101:
                    ExhibitionInfoActivity.this.r = ((Double) message.obj).doubleValue();
                    ExhibitionInfoActivity.this.f();
                    break;
                case 102:
                    if (message.obj instanceof HiHealthData) {
                        ExhibitionInfoActivity.this.q = (HiHealthData) message.obj;
                        ExhibitionInfoActivity.this.f();
                    }
                    break;
                case 103:
                    ExhibitionInfoActivity.this.t = ((Double) message.obj).doubleValue();
                    ExhibitionInfoActivity.this.f();
                    break;
                case 104:
                    ExhibitionInfoActivity.this.q();
                    Context context = ExhibitionInfoActivity.this.j;
                    if (ExhibitionInfoActivity.d) {
                        string = BaseApplication.b().getString(R.string.IDS_generating_report_success);
                    } else {
                        string = BaseApplication.b().getString(R.string.IDS_generating_report_fail);
                    }
                    qpx.e(context, string);
                    return;
                case 105:
                    boolean zBooleanValue = ((Boolean) message.obj).booleanValue();
                    Context context2 = ExhibitionInfoActivity.this.j;
                    if (zBooleanValue) {
                        string2 = BaseApplication.b().getString(R.string.IDS_delete_report_success);
                    } else {
                        string2 = BaseApplication.b().getString(R.string.IDS_delete_report_fail);
                    }
                    qpx.e(context2, string2);
                    return;
                case 106:
                    qpx.e(ExhibitionInfoActivity.this.j, BaseApplication.b().getString(R.string.IDS_report_not_exist));
                    return;
                default:
                    LogUtil.a("ExhibitionInfoActivity", "MyHandler what unknown");
                    break;
            }
            ExhibitionInfoActivity.this.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        o();
        ExhibitionAdapter exhibitionAdapter = this.n;
        if (exhibitionAdapter != null) {
            exhibitionAdapter.d(this.x);
            this.n.notifyDataSetChanged();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        this.j = this;
        setContentView(R.layout.activity_report);
        this.m = new e();
        l();
        m();
        o();
        h();
    }

    private void o() {
        this.x.clear();
        if (this.l != null) {
            HashMap<String, Bitmap> map = new HashMap<>();
            map.put(f26484a, this.l);
            this.x.add(map);
        }
        HashMap<String, Bitmap> map2 = new HashMap<>();
        map2.put(f26485b, this.g);
        this.x.add(map2);
        if (this.w != null) {
            HashMap<String, Bitmap> map3 = new HashMap<>();
            map3.put(e, this.w);
            this.x.add(map3);
        }
        if (this.f != null) {
            HashMap<String, Bitmap> map4 = new HashMap<>();
            map4.put(f26486c, this.f);
            this.x.add(map4);
        }
    }

    private void l() {
        g();
        this.v = (LinearLayout) findViewById(R.id.report_info);
        this.o = (HealthRecycleView) findViewById(R.id.report_data);
        this.s = (RelativeLayout) findViewById(R.id.report_loading);
    }

    private void g() {
        HealthToolBar healthToolBar = (HealthToolBar) findViewById(R.id.select_view);
        this.u = healthToolBar;
        healthToolBar.d(View.inflate(this, R.layout.hw_toolbar_bottomview, null));
        healthToolBar.setIcon(1, R.drawable.report_all_select_icon);
        healthToolBar.setIconTitle(1, getResources().getString(R.string.IDS_contact_delete_select_all));
        healthToolBar.setIcon(2, R.drawable.report_bl_icon);
        healthToolBar.setIconTitle(2, getResources().getString(R.string.IDS_hw_health_blood_oxygen));
        healthToolBar.setIcon(3, R.drawable.report_print_icon);
        healthToolBar.setIconTitle(3, getResources().getString(R.string.IDS_report_print));
        healthToolBar.setIconEnabled(3, false);
        healthToolBar.e(3).setAlpha(0.38f);
        healthToolBar.setIcon(4, R.drawable.ic_public_delete);
        healthToolBar.setIconTitle(4, getResources().getString(R.string.IDS_report_delete));
        healthToolBar.setOnSingleTapListener(this.p);
        healthToolBar.a(this);
    }

    private void m() throws Throwable {
        f();
        ThreadPoolManager.c().execute(new Runnable() { // from class: tsv
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f49623c.e();
            }
        });
    }

    public /* synthetic */ void e() throws Throwable {
        n();
        String strE = SharedPreferenceManager.e(this.j, JsInteractAddition.BI_ERROR_CODE_INVALID_AT, "SP_REPORT_RUN");
        LogUtil.a("ExhibitionInfoActivity", "reportRunUri == ", strE);
        String strE2 = SharedPreferenceManager.e(this.j, JsInteractAddition.BI_ERROR_CODE_INVALID_AT, "SP_REPORT_BODY");
        LogUtil.a("ExhibitionInfoActivity", "reportBodyUri == ", strE2);
        if (i()) {
            ExhibitionEcgFragment exhibitionEcgFragment = new ExhibitionEcgFragment();
            exhibitionEcgFragment.b(this.j);
            exhibitionEcgFragment.d();
            this.l = exhibitionEcgFragment.c();
        }
        if (!TextUtils.isEmpty(strE)) {
            ExhibitionRunFragment exhibitionRunFragment = new ExhibitionRunFragment();
            exhibitionRunFragment.c(this.j);
            exhibitionRunFragment.b();
            this.w = exhibitionRunFragment.c();
        }
        if (!TextUtils.isEmpty(strE2)) {
            ExhibitionBodyFragment exhibitionBodyFragment = new ExhibitionBodyFragment();
            exhibitionBodyFragment.a(this.j);
            exhibitionBodyFragment.c();
            this.f = exhibitionBodyFragment.d();
        }
        Message messageObtainMessage = this.m.obtainMessage();
        messageObtainMessage.what = 100;
        this.m.sendMessage(messageObtainMessage);
    }

    private void n() {
        k();
        r();
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() throws Throwable {
        ExhibitionBloodFragment exhibitionBloodFragment = new ExhibitionBloodFragment();
        this.k = exhibitionBloodFragment;
        exhibitionBloodFragment.d(this.j, this.r, this.q, this.t);
        this.k.e();
        this.g = this.k.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.u.e(1).isSelected()) {
            this.u.e(1).setSelected(false);
            this.u.e(3).setAlpha(0.38f);
            this.u.e(3).setEnabled(false);
            this.y.clear();
        } else {
            this.u.e(1).setSelected(true);
            this.u.e(3).setAlpha(1.0f);
            this.u.e(3).setEnabled(true);
        }
        ExhibitionAdapter exhibitionAdapter = this.n;
        if (exhibitionAdapter != null) {
            exhibitionAdapter.c();
            this.n.notifyDataSetChanged();
        }
    }

    private boolean i() {
        String str = null;
        try {
            str = getExternalFilesDir(null).getCanonicalPath() + "/h5pro/files/com.huawei.health.h5.ecg";
        } catch (IOException unused) {
            LogUtil.e("ExhibitionInfoActivity", "content and pdfPath can not be null!");
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        LogUtil.a("ExhibitionInfoActivity", "fileDir = ", str);
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            LogUtil.j("ExhibitionInfoActivity", "ecgPdfExist ecgFile not exist or not Directory");
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
            if (!fileArrListFiles[i2].isDirectory()) {
                String name = fileArrListFiles[i2].getName();
                if (name.trim().toLowerCase(Locale.ENGLISH).endsWith(".pdf")) {
                    arrayList.add(name);
                }
            }
        }
        return arrayList.size() > 0;
    }

    private void h() {
        this.o.setLayoutManager(new GridLayoutManager((Context) this, 2, 1, false));
        ExhibitionAdapter exhibitionAdapter = new ExhibitionAdapter(this, this.x, this);
        this.n = exhibitionAdapter;
        this.o.setAdapter(exhibitionAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<String> list) {
        FileOutputStream fileOutputStream;
        if (njy.e(list)) {
            LogUtil.e("ExhibitionInfoActivity", "content and pdfPath can not be null!");
            return;
        }
        ArrayList<Bitmap> arrayList = new ArrayList<>();
        d(arrayList, list);
        PdfDocument pdfDocument = new PdfDocument();
        int widthMils = (PrintAttributes.MediaSize.ISO_A4.getWidthMils() * 72) / 1000;
        float width = widthMils / arrayList.get(0).getWidth();
        int height = (int) (arrayList.get(0).getHeight() * width);
        Matrix matrix = new Matrix();
        matrix.postScale(width, width);
        Paint paint = new Paint(1);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            PdfDocument.Page pageStartPage = pdfDocument.startPage(new PdfDocument.PageInfo.Builder(widthMils, height, i2).create());
            pageStartPage.getCanvas().drawBitmap(arrayList.get(i2), matrix, paint);
            pdfDocument.finishPage(pageStartPage);
        }
        try {
            fileOutputStream = new FileOutputStream(new File(BaseApplication.b().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), "report.pdf"));
        } catch (IOException unused) {
            LogUtil.e("ExhibitionInfoActivity", "Failed to generate the PDF.");
            fileOutputStream = null;
        }
        c(pdfDocument, fileOutputStream);
    }

    private void d(ArrayList<Bitmap> arrayList, List<String> list) {
        arrayList.add(c());
        if (list.contains(f26484a)) {
            arrayList.add(this.l);
        }
        if (list.contains(f26485b)) {
            arrayList.add(this.g);
        }
        if (list.contains(e)) {
            arrayList.add(this.w);
        }
        if (list.contains(f26486c)) {
            arrayList.add(this.f);
        }
    }

    public Bitmap c() throws Throwable {
        View viewInflate = View.inflate(this, R.layout.report_cover_layout, null);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.report_cover_pdf);
        ((TextView) viewInflate.findViewById(R.id.report_date)).setText(wig.j(System.currentTimeMillis()));
        tss.b(relativeLayout, 100);
        return tss.b(viewInflate);
    }

    private void c(final PdfDocument pdfDocument, final FileOutputStream fileOutputStream) {
        d = false;
        t();
        ThreadPoolManager.c().execute(new Runnable() { // from class: tsq
            @Override // java.lang.Runnable
            public final void run() {
                this.f49616a.a(pdfDocument, fileOutputStream);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void a(PdfDocument pdfDocument, FileOutputStream fileOutputStream) {
        try {
            try {
                pdfDocument.writeTo(fileOutputStream);
                d = true;
                Message messageObtainMessage = this.m.obtainMessage();
                messageObtainMessage.what = 104;
                this.m.sendMessage(messageObtainMessage);
                pdfDocument.close();
                pdfDocument = pdfDocument;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        Object[] objArr = {"Pdf create error"};
                        LogUtil.e("ExhibitionInfoActivity", objArr);
                        pdfDocument = objArr;
                    }
                }
            } catch (Throwable th) {
                pdfDocument.close();
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        LogUtil.e("ExhibitionInfoActivity", "Pdf create error");
                    }
                }
                throw th;
            }
        } catch (IOException unused3) {
            LogUtil.e("ExhibitionInfoActivity", "PDF CREATE FAIL");
            pdfDocument.close();
            pdfDocument = pdfDocument;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                    pdfDocument = pdfDocument;
                } catch (IOException unused4) {
                    Object[] objArr2 = {"Pdf create error"};
                    LogUtil.e("ExhibitionInfoActivity", objArr2);
                    pdfDocument = objArr2;
                }
            }
        }
    }

    private void t() {
        if (this.h == null) {
            CommonDialog21 commonDialog21B = CommonDialog21.b(this);
            this.h = commonDialog21B;
            commonDialog21B.b(BaseApplication.b().getString(R.string.IDS_generating_report));
            this.h.c();
            this.h.setCancelable(false);
            this.h.show();
            return;
        }
        LogUtil.a("ExhibitionInfoActivity", "showCreatingDialog: mCreatingDialog is not null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        CommonDialog21 commonDialog21 = this.h;
        if (commonDialog21 != null) {
            commonDialog21.cancel();
            this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        File file = new File(BaseApplication.b().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), "report.pdf");
        if (file.exists()) {
            if (file.isFile()) {
                boolean zDelete = file.delete();
                Message messageObtainMessage = this.m.obtainMessage();
                messageObtainMessage.what = 105;
                messageObtainMessage.obj = Boolean.valueOf(zDelete);
                this.m.sendMessage(messageObtainMessage);
                return;
            }
            return;
        }
        Message messageObtainMessage2 = this.m.obtainMessage();
        messageObtainMessage2.what = 106;
        this.m.sendMessage(messageObtainMessage2);
    }

    @Override // com.huawei.ui.main.stories.exhibitioninfo.adapter.ExhibitionAdapter.OnReportSelectChangeListener
    public void setSelectReport(String str, boolean z) {
        if (z) {
            if (str != null && !this.y.contains(str)) {
                this.y.add(str);
            }
        } else {
            this.y.remove(str);
        }
        if (this.y.size() > 0) {
            this.u.e(3).setAlpha(1.0f);
            this.u.e(3).setEnabled(true);
            return;
        }
        this.u.e(3).setAlpha(0.38f);
        this.u.e(3).setEnabled(false);
        if (this.u.e(1).isSelected()) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() throws Throwable {
        this.r = 0.0d;
        f();
        o();
        ExhibitionAdapter exhibitionAdapter = this.n;
        if (exhibitionAdapter != null) {
            exhibitionAdapter.d(this.x);
            this.n.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        long jCurrentTimeMillis = System.currentTimeMillis();
        hiDataReadOption.setCount(1);
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(jCurrentTimeMillis);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setConstantsKey(new String[]{"lastBloodOxygenSaturation"});
        hiDataReadOption.setType(new int[]{2103, 2107});
        HiHealthNativeApi.a(this.j).readHiHealthData(hiDataReadOption, new c());
    }

    class c implements HiDataReadResultListener {
        private c() {
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (obj == null) {
                LogUtil.j("ExhibitionInfoActivity", "onResult data is null");
                return;
            }
            SparseArray sparseArray = new SparseArray(16);
            if (obj instanceof SparseArray) {
                sparseArray = (SparseArray) obj;
            }
            if (sparseArray.size() > 0) {
                ExhibitionInfoActivity.this.b((SparseArray<Object>) sparseArray);
            } else {
                LogUtil.j("ExhibitionInfoActivity", "onResult sparseArray size less than or equal to zero");
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("ExhibitionInfoActivity", "onResultIntent errorCode ", Integer.valueOf(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SparseArray<Object> sparseArray) {
        List arrayList = new ArrayList(16);
        Object obj = sparseArray.get(2103);
        if (obj instanceof List) {
            arrayList = (List) obj;
        }
        LogUtil.a("ExhibitionInfoActivity", "dealWithData oxygenMeasureList size ", Integer.valueOf(arrayList.size()));
        if (njy.e(arrayList)) {
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) arrayList.get(0);
        if (hiHealthData == null) {
            LogUtil.j("ExhibitionInfoActivity", "dealWithData healthData is null");
            return;
        }
        double d2 = hiHealthData.getInt("point_value");
        Message messageObtainMessage = this.m.obtainMessage();
        messageObtainMessage.what = 101;
        messageObtainMessage.obj = Double.valueOf(d2);
        this.m.sendMessage(messageObtainMessage);
    }

    private void r() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{2006, 2007});
        hiAggregateOption.setConstantsKey(new String[]{"BLOOD_PRESSURE_SYSTOLIC", "BLOOD_PRESSURE_DIASTOLIC"});
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setReadType(0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(jCurrentTimeMillis);
        hiAggregateOption.setCount(1);
        HiHealthManager.d(this.j).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: com.huawei.ui.main.stories.exhibitioninfo.activity.ExhibitionInfoActivity.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                if (!njy.e(list)) {
                    ExhibitionInfoActivity.this.d(list.get(0));
                } else {
                    LogUtil.j("ExhibitionInfoActivity", "readCardData onResult dataList is empty");
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
                LogUtil.a("ExhibitionInfoActivity", "readCardData errorCode ", Integer.valueOf(i3));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HiHealthData hiHealthData) {
        Message messageObtainMessage = this.m.obtainMessage();
        messageObtainMessage.what = 102;
        messageObtainMessage.obj = hiHealthData;
        this.m.sendMessage(messageObtainMessage);
    }

    private void s() {
        LogUtil.a("ExhibitionInfoActivity", "showBloodSugar readCardData called");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        LogUtil.a("ExhibitionInfoActivity", "showBloodSugar startTime = ", Long.valueOf(hiDataReadOption.getStartTime()), ", endTime = ", Long.valueOf(hiDataReadOption.getEndTime()));
        hiDataReadOption.setType(new int[]{2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2106});
        HiHealthManager.d(this.j).readHiHealthData(hiDataReadOption, new d());
    }

    class d implements HiDataReadResultListener {
        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        private d() {
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("ExhibitionInfoActivity", "showBloodSugar onResult called", Integer.valueOf(i));
            if (obj instanceof SparseArray) {
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() > 0) {
                    ExhibitionInfoActivity.this.c((SparseArray<Object>) sparseArray);
                } else {
                    LogUtil.j("ExhibitionInfoActivity", "data none");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(SparseArray<Object> sparseArray) {
        HiHealthData hiHealthDataA = wuc.a(sparseArray, wuc.b(sparseArray, wuc.h(sparseArray, wuc.c(sparseArray, wuc.f(sparseArray, wuc.g(sparseArray, wuc.i(sparseArray, wuc.e(sparseArray, wuc.d(sparseArray, new HiHealthData())))))))));
        if (System.currentTimeMillis() < hiHealthDataA.getEndTime()) {
            LogUtil.j("ExhibitionInfoActivity", "The current time is earlier than the last blood sugar time.");
            return;
        }
        Message messageObtainMessage = this.m.obtainMessage();
        messageObtainMessage.what = 103;
        messageObtainMessage.obj = Double.valueOf(hiHealthDataA.getDouble("point_value"));
        this.m.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
