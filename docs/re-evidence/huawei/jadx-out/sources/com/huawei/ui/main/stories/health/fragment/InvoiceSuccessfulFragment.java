package com.huawei.ui.main.stories.health.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.InvoiceApplicationActivity;
import com.huawei.ui.main.stories.health.fragment.InvoiceSuccessfulFragment;
import defpackage.qpx;
import defpackage.qsp;
import defpackage.vdb;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class InvoiceSuccessfulFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27897c;
    private Context d;
    private String e;
    private String f;
    private PermissionsResultAction h = null;
    private View i;
    private String j;

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        LogUtil.a("InvoiceSuccessfulFragment", "onCreate");
        super.onCreate(bundle);
        if (getActivity() instanceof InvoiceApplicationActivity) {
            this.d = getActivity();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f = arguments.getString("orderId");
            this.f27895a = arguments.getString("orderCode");
            this.f27897c = arguments.getInt("invoiceHeader");
            this.e = arguments.getString("invoiceTime");
            this.j = arguments.getString(HwPayConstant.KEY_AMOUNT);
            this.f27896b = arguments.getString("invoiceType");
        }
        LogUtil.a("InvoiceSuccessfulFragment", "mOrderId: ", this.f);
        LogUtil.a("InvoiceSuccessfulFragment", "mOrderCode: ", this.f27895a);
        LogUtil.a("InvoiceSuccessfulFragment", "mInvoiceHeader: ", Integer.valueOf(this.f27897c));
        LogUtil.a("InvoiceSuccessfulFragment", "mInvoiceTime: ", this.e);
        LogUtil.a("InvoiceSuccessfulFragment", "mPrice: ", this.j);
        LogUtil.a("InvoiceSuccessfulFragment", "mInvoiceType:", this.f27896b);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("InvoiceSuccessfulFragment", "onCreateView");
        this.i = layoutInflater.inflate(R.layout.activity_invoice_successful, viewGroup, false);
        a();
        d();
        return this.i;
    }

    private void a() {
        this.h = new CustomPermissionAction(this.d) { // from class: com.huawei.ui.main.stories.health.fragment.InvoiceSuccessfulFragment.5
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                if (InvoiceSuccessfulFragment.this.d == null) {
                    LogUtil.j("InvoiceSuccessfulFragment", "onGranted: mContext is null");
                } else {
                    LogUtil.a("InvoiceSuccessfulFragment", "onGranted: CAMERA_IMAGE, downloadInvoice");
                    InvoiceSuccessfulFragment.this.e();
                }
            }
        };
    }

    private void d() {
        LogUtil.a("InvoiceSuccessfulFragment", "initView");
        ((HealthTextView) this.i.findViewById(R.id.invoice_header_successful)).setText(getString(this.f27897c));
        ((HealthTextView) this.i.findViewById(R.id.transaction_no_successful)).setText(this.f);
        ((HealthTextView) this.i.findViewById(R.id.invoice_time_successful)).setText(this.e);
        ((HealthSubHeader) qsp.a(this.i, R.id.Invoicing_information_subheader_successful)).setSubHeaderBackgroundColor(ContextCompat.getColor(BaseApplication.b(), com.huawei.health.servicesui.R.color.common_transparent));
        HealthTextView healthTextView = (HealthTextView) this.i.findViewById(R.id.invoice_type_text1);
        String str = this.f27896b;
        if (str == null || "3".equals(str)) {
            healthTextView.setText(com.huawei.ui.commonui.R.string.IDS_invoice_electronic);
        } else if ("61".equals(this.f27896b) || "62".equals(this.f27896b)) {
            healthTextView.setText(com.huawei.ui.commonui.R.string.IDS_invoice_digital_vat);
        } else {
            LogUtil.a("InvoiceSuccessfulFragment", "InValid invoiceType");
        }
        ((HealthButton) this.i.findViewById(R.id.btn_download)).setOnClickListener(new View.OnClickListener() { // from class: uuv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50593b.c(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        LogUtil.a("InvoiceSuccessfulFragment", "setPermissionClick");
        a(this.d, this.h);
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.health.fragment.InvoiceSuccessfulFragment$2, reason: invalid class name */
    public class AnonymousClass2 extends UiCallback<String> {
        AnonymousClass2() {
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("InvoiceSuccessfulFragment", "download request failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
            qpx.b(InvoiceSuccessfulFragment.this.d, InvoiceSuccessfulFragment.this.d.getResources().getString(R.string.IDS_invoice_toast_failed));
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final String str) throws Throwable {
            ReleaseLogUtil.d("InvoiceSuccessfulFragment", "download request successful");
            if (Looper.getMainLooper() != Looper.myLooper()) {
                InvoiceSuccessfulFragment.this.b(str);
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: uvd
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f50603b.c(str);
                    }
                });
            }
        }

        public /* synthetic */ void c(String str) throws Throwable {
            InvoiceSuccessfulFragment.this.b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("InvoiceSuccessfulFragment", "downloadInvoice");
        vdb.d(this.f27895a, new AnonymousClass2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) throws Throwable {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        BufferedInputStream bufferedInputStream2;
        BufferedOutputStream bufferedOutputStream2;
        LogUtil.a("InvoiceSuccessfulFragment", "downloadFile");
        ByteArrayInputStream byteArrayInputStream = null;
        bufferedOutputStream = null;
        BufferedOutputStream bufferedOutputStream3 = null;
        byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                bufferedInputStream2 = new BufferedInputStream(byteArrayInputStream2);
                try {
                    String strB = b();
                    String strC = c();
                    ReleaseLogUtil.d("InvoiceSuccessfulFragment", "pathName = ", strB);
                    File file = new File(strB);
                    File file2 = new File(strB, strC);
                    ReleaseLogUtil.d("InvoiceSuccessfulFragment", "path.exists() = ", Boolean.valueOf(file.exists()), " file.exists() = ", Boolean.valueOf(file2.exists()));
                    c(file);
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                        try {
                            byte[] bArr = new byte[1024];
                            for (int i = bufferedInputStream2.read(bArr); i != -1; i = bufferedInputStream2.read(bArr)) {
                                bufferedOutputStream2.write(bArr, 0, i);
                            }
                            bufferedOutputStream2.flush();
                            LogUtil.a("InvoiceSuccessfulFragment", "download Success");
                            Context context = this.d;
                            qpx.b(context, context.getResources().getString(R.string.IDS_invoice_download_path, strC, "Download/HuaweiHealth"));
                            e(byteArrayInputStream2, bufferedInputStream2, fileOutputStream, bufferedOutputStream2);
                        } catch (IOException unused) {
                            bufferedOutputStream3 = bufferedOutputStream2;
                            bufferedInputStream = bufferedInputStream2;
                            bufferedOutputStream = bufferedOutputStream3;
                            byteArrayInputStream = byteArrayInputStream2;
                            try {
                                ReleaseLogUtil.a("InvoiceSuccessfulFragment", "downloadFile IOException");
                                Context context2 = this.d;
                                qpx.b(context2, context2.getResources().getString(R.string.IDS_invoice_toast_failed));
                                e(byteArrayInputStream, bufferedInputStream, fileOutputStream, bufferedOutputStream);
                            } catch (Throwable th2) {
                                th = th2;
                                e(byteArrayInputStream, bufferedInputStream, fileOutputStream, bufferedOutputStream);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            BufferedInputStream bufferedInputStream3 = bufferedInputStream2;
                            bufferedOutputStream = bufferedOutputStream2;
                            bufferedInputStream = bufferedInputStream3;
                            byteArrayInputStream = byteArrayInputStream2;
                            e(byteArrayInputStream, bufferedInputStream, fileOutputStream, bufferedOutputStream);
                            throw th;
                        }
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedOutputStream2 = null;
                    }
                } catch (IOException unused3) {
                    fileOutputStream = null;
                    bufferedInputStream = bufferedInputStream2;
                    bufferedOutputStream = bufferedOutputStream3;
                    byteArrayInputStream = byteArrayInputStream2;
                    ReleaseLogUtil.a("InvoiceSuccessfulFragment", "downloadFile IOException");
                    Context context3 = this.d;
                    qpx.b(context3, context3.getResources().getString(R.string.IDS_invoice_toast_failed));
                    e(byteArrayInputStream, bufferedInputStream, fileOutputStream, bufferedOutputStream);
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream = null;
                    bufferedOutputStream2 = null;
                    BufferedInputStream bufferedInputStream4 = bufferedInputStream2;
                    bufferedOutputStream = bufferedOutputStream2;
                    bufferedInputStream = bufferedInputStream4;
                    byteArrayInputStream = byteArrayInputStream2;
                    e(byteArrayInputStream, bufferedInputStream, fileOutputStream, bufferedOutputStream);
                    throw th;
                }
            } catch (IOException unused4) {
                bufferedInputStream2 = null;
            } catch (Throwable th6) {
                th = th6;
                bufferedInputStream2 = null;
            }
        } catch (IOException unused5) {
            bufferedOutputStream = null;
            bufferedInputStream = null;
            fileOutputStream = null;
        } catch (Throwable th7) {
            th = th7;
            bufferedOutputStream = null;
            bufferedInputStream = null;
            fileOutputStream = null;
        }
    }

    private String a(String str) {
        LogUtil.a("InvoiceSuccessfulFragment", "handleTime");
        String strReplaceAll = str.replaceAll("\\/", "").replaceAll("\\s+", Constants.LINK).replaceAll(":", Constants.LINK);
        LogUtil.a("InvoiceSuccessfulFragment", "res: ", strReplaceAll);
        return strReplaceAll;
    }

    private String b() {
        String str;
        LogUtil.a("InvoiceSuccessfulFragment", "getPath");
        try {
            str = Environment.getExternalStorageDirectory().getCanonicalPath() + File.separator + "Download/HuaweiHealth";
        } catch (IOException unused) {
            LogUtil.e("InvoiceSuccessfulFragment", "getPath IOException");
            str = null;
        }
        if (str == null || str.endsWith(File.separator)) {
            return str;
        }
        return str + File.separator;
    }

    private String c() {
        String string;
        LogUtil.a("InvoiceSuccessfulFragment", "getName");
        StringBuilder sb = new StringBuilder();
        if ("61".equals(this.f27896b) || "62".equals(this.f27896b)) {
            string = getString(R.string.IDS_invoice_digital_vat);
        } else {
            string = getString(R.string.IDS_invoice_ordinary_vat);
        }
        sb.append(string);
        sb.append("_");
        sb.append(this.j);
        sb.append("_");
        sb.append(a(this.e));
        sb.append("_");
        sb.append(System.currentTimeMillis());
        sb.append(".pdf");
        return sb.toString();
    }

    private void c(File file) {
        LogUtil.a("InvoiceSuccessfulFragment", "createDirectoryIfNotExists");
        if (file == null || file.exists() || file.mkdirs()) {
            return;
        }
        LogUtil.e("InvoiceSuccessfulFragment", "file.mkdirs() failed!");
    }

    private void e(ByteArrayInputStream byteArrayInputStream, BufferedInputStream bufferedInputStream, FileOutputStream fileOutputStream, BufferedOutputStream bufferedOutputStream) {
        LogUtil.a("InvoiceSuccessfulFragment", "closeStream");
        if (byteArrayInputStream != null) {
            try {
                byteArrayInputStream.close();
            } catch (IOException unused) {
                LogUtil.e("InvoiceSuccessfulFragment", "closeStream IOException");
                return;
            }
        }
        if (bufferedInputStream != null) {
            bufferedInputStream.close();
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
        if (bufferedOutputStream != null) {
            bufferedOutputStream.close();
        }
    }

    private void a(final Context context, final PermissionsResultAction permissionsResultAction) {
        LoginInit.getInstance(context).browsingToLogin(new IBaseResponseCallback() { // from class: uuw
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                InvoiceSuccessfulFragment.c(context, permissionsResultAction, i, obj);
            }
        }, "");
    }

    public static /* synthetic */ void c(Context context, PermissionsResultAction permissionsResultAction, int i, Object obj) {
        if (i == 0) {
            PermissionUtil.d(context, PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES, permissionsResultAction);
        }
    }
}
