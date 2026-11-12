package ph;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes7.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f137662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SslErrorHandler f137663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f137664c;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            i iVar = i.this;
            iVar.f137663b.cancel();
            wg.a.g(iVar.f137664c.f137669g, "net", "SSLDenied", "2");
            ug.b.f170552b = ug.b.a();
            iVar.f137662a.finish();
        }
    }

    public i(j jVar, Activity activity, SslErrorHandler sslErrorHandler) {
        this.f137664c = jVar;
        this.f137662a = activity;
        this.f137663b = sslErrorHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = new a();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f137662a);
        TextUtils.isEmpty(null);
        if (!TextUtils.isEmpty("确定")) {
            builder.setNegativeButton("确定", aVar);
        }
        builder.setTitle("安全警告");
        builder.setMessage("安全连接证书校验无效，将无法保证访问数据的安全性，请安装支付宝后重试。");
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        alertDialogCreate.setOnKeyListener(new d());
        try {
            alertDialogCreate.show();
        } catch (Throwable th3) {
            StringWriter stringWriter = new StringWriter();
            th3.printStackTrace(new PrintWriter(stringWriter));
            stringWriter.toString();
        }
    }
}
